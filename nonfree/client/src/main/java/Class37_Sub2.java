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

@OriginalClass("client!ja")
public final class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILjava/awt/Component;B)V")
	@Override
	public void method1448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		this.anInt2040 = arg0;
		this.anInt2037 = arg1;
		this.anIntArray228 = new int[arg1 * arg0 + 1];
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray228, this.anIntArray228.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt2037, this.anInt2040), local22, null);
		this.anImage3 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method1451();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method1452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg3.getClip();
		arg3.clipRect(arg2, arg0, arg4, arg1);
		arg3.drawImage(this.anImage3, 0, 0, this.aComponent2);
		arg3.setClip(local2);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method1446(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent2);
	}
}
