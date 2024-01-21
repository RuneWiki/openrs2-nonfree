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

@OriginalClass("client!ib")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	@Override
	public void method692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt1213 = arg1;
		this.anIntArray124 = new int[arg1 * arg0 + 1];
		this.anInt1209 = arg0;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray124, this.anIntArray124.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt1209, this.anInt1213), local22, null);
		this.anImage3 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method687();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg2.getClip();
		arg2.clipRect(arg4, arg1, arg3, arg0);
		arg2.drawImage(this.anImage3, 0, 0, this.aComponent2);
		arg2.setClip(local2);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method690(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent2);
	}
}
