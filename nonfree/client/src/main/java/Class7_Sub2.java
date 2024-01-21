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

@OriginalClass("client!kd")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method1097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		this.anInt1401 = arg1;
		this.anIntArray269 = new int[arg0 * arg1 + 1];
		this.anInt1397 = arg0;
		@Pc(28) DataBufferInt local28 = new DataBufferInt(this.anIntArray269, this.anIntArray269.length);
		@Pc(36) DirectColorModel local36 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(46) WritableRaster local46 = Raster.createWritableRaster(local36.createCompatibleSampleModel(this.anInt1401, this.anInt1397), local28, null);
		this.anImage4 = new BufferedImage(local36, local46, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method1096();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	@Override
	public void method1095(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.drawImage(this.anImage4, arg1, arg2, this.aComponent1);
	}
}
