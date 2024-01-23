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

@OriginalClass("client!tb")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLjava/awt/Component;II)V")
	@Override
	public void method3759(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray375 = new int[arg2 * arg1 + 1];
		this.anInt4965 = arg1;
		this.anInt4964 = arg2;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray375, this.anIntArray375.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt4964, this.anInt4965), local22, null);
		this.anImage4 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent2 = arg0;
		this.method3760();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method3762(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Shape local2 = arg0.getClip();
		arg0.clipRect(arg1, arg4, arg3, arg2);
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
		arg0.setClip(local2);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method3763(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
	}
}
