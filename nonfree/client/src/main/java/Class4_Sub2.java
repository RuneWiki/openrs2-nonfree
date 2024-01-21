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

@OriginalClass("client!qe")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!qe", name = "B", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method1525(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		arg1.drawImage(this.anImage4, arg0, arg2, this.aComponent2);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method1522(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		this.anInt2234 = arg0;
		this.anIntArray283 = new int[arg2 * arg0 + 1];
		this.anInt2232 = arg2;
		@Pc(26) DataBufferInt local26 = new DataBufferInt(this.anIntArray283, this.anIntArray283.length);
		@Pc(34) DirectColorModel local34 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(44) WritableRaster local44 = Raster.createWritableRaster(local34.createCompatibleSampleModel(this.anInt2234, this.anInt2232), local26, null);
		this.anImage4 = new BufferedImage(local34, local44, false, new Hashtable());
		this.aComponent2 = arg1;
		this.method1527();
	}
}
