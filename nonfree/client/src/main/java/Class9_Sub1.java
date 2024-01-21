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

@OriginalClass("client!be")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!be", name = "u", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method1590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt2308 = arg0;
		this.anInt2306 = arg1;
		this.anIntArray326 = new int[arg1 * arg0 + 1];
		@Pc(29) DataBufferInt local29 = new DataBufferInt(this.anIntArray326, this.anIntArray326.length);
		@Pc(37) DirectColorModel local37 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(47) WritableRaster local47 = Raster.createWritableRaster(local37.createCompatibleSampleModel(this.anInt2308, this.anInt2306), local29, null);
		this.anImage4 = new BufferedImage(local37, local47, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method1589();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method1585(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		arg1.drawImage(this.anImage4, arg2, arg0, this.aComponent1);
	}
}
