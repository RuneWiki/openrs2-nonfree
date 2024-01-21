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

@OriginalClass("client!de")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!de", name = "t", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Component;IIZ)V")
	@Override
	public void method590(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray113 = new int[arg1 * arg2 + 1];
		this.anInt996 = arg2;
		this.anInt992 = arg1;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray113, this.anIntArray113.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt992, this.anInt996), local22, null);
		this.anImage3 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent2 = arg0;
		this.method597();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method594(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		arg2.drawImage(this.anImage3, arg1, arg0, this.aComponent2);
	}
}
