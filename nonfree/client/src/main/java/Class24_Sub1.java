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

@OriginalClass("client!le")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!le", name = "l", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method1749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg2.getClip();
		arg2.clipRect(arg4, arg3, arg1, arg0);
		arg2.drawImage(this.anImage3, 0, 0, this.aComponent1);
		arg2.setClip(local2);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method1747(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		this.anIntArray207 = new int[arg2 * arg0 + 1];
		this.anInt2155 = arg0;
		this.anInt2152 = arg2;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray207, this.anIntArray207.length);
		@Pc(38) DirectColorModel local38 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(48) WritableRaster local48 = Raster.createWritableRaster(local38.createCompatibleSampleModel(this.anInt2155, this.anInt2152), local22, null);
		this.anImage3 = new BufferedImage(local38, local48, false, new Hashtable());
		this.aComponent1 = arg1;
		this.method1745();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
	@Override
	public void method1748(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
	}
}
