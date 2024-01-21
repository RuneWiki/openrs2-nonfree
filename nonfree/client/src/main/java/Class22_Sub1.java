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

@OriginalClass("client!ch")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
	@Override
	public void method1657(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method1658(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg3.getClip();
		arg3.clipRect(arg1, arg4, arg0, arg2);
		arg3.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg3.setClip(local2);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method1662(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		this.anIntArray180 = new int[arg2 * arg0 + 1];
		this.anInt2388 = arg0;
		this.anInt2390 = arg2;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray180, this.anIntArray180.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt2390, this.anInt2388), local22, null);
		this.anImage4 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent1 = arg1;
		this.method1659();
	}
}
