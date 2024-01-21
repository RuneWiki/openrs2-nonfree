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

@OriginalClass("client!le")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!le", name = "u", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method1428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2) {
		arg2.drawImage(this.anImage4, arg1, arg0, this.aComponent2);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
	@Override
	public void method1429(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		this.anIntArray239 = new int[arg0 * arg2 + 1];
		this.anInt2116 = arg0;
		this.anInt2115 = arg2;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray239, this.anIntArray239.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt2115, this.anInt2116), local22, null);
		this.anImage4 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent2 = arg1;
		this.method1431();
	}
}
