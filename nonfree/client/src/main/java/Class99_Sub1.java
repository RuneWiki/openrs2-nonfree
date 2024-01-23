import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class99_Sub1 extends Class99 {

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIBLjava/awt/Component;)V")
	@Override
	public void method3510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt4427 = arg1;
		this.anInt4431 = arg0;
		this.anIntArray395 = new int[arg0 * arg1 + 1];
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray395, this.anIntArray395.length);
		@Pc(38) DirectColorModel local38 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(48) WritableRaster local48 = Raster.createWritableRaster(local38.createCompatibleSampleModel(this.anInt4427, this.anInt4431), local30, null);
		this.anImage4 = new BufferedImage(local38, local48, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method3516();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method3514(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
	@Override
	public void method3515(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Shape local12 = arg0.getClip();
		arg0.clipRect(arg1, arg2, arg3, arg4);
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg0.setClip(local12);
	}
}
