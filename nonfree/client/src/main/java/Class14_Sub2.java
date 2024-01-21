import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
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

@OriginalClass("client!pa")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method1470(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		arg1.drawImage(this.anImage23, arg0, arg2, this.aComponent1);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	@Override
	public void method1474(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anInt2029 = arg2;
		this.anInt2036 = arg1;
		this.anIntArray242 = new int[arg2 * arg1 + 1];
		@Pc(31) DataBufferInt local31 = new DataBufferInt(this.anIntArray242, this.anIntArray242.length);
		@Pc(39) DirectColorModel local39 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(49) WritableRaster local49 = Raster.createWritableRaster(local39.createCompatibleSampleModel(this.anInt2036, this.anInt2029), local31, null);
		this.anImage23 = new BufferedImage(local39, local49, false, new Hashtable());
		this.aComponent1 = arg0;
		this.method1472();
	}
}
