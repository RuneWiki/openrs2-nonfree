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

@OriginalClass("client!vj")
public final class Class62_Sub2 extends Class62 {

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method4469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg3.getClip();
		arg3.clipRect(arg0, arg1, arg2, arg4);
		arg3.drawImage(this.anImage3, 0, 0, this.aComponent2);
		arg3.setClip(local2);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method4466(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent2);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BILjava/awt/Component;I)V")
	@Override
	public void method4463(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		this.anIntArray519 = new int[arg0 * arg2 + 1];
		this.anInt5648 = arg0;
		this.anInt5651 = arg2;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray519, this.anIntArray519.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt5648, this.anInt5651), local22, null);
		this.anImage3 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent2 = arg1;
		this.method4468();
	}
}
