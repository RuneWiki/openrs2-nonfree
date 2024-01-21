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

@OriginalClass("client!tg")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	@Override
	public void method3224(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4217 = arg2;
		this.anInt4220 = arg1;
		this.anIntArray401 = new int[arg2 * arg1 + 1];
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray401, this.anIntArray401.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(44) WritableRaster local44 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt4220, this.anInt4217), local22, null);
		this.anImage4 = new BufferedImage(local30, local44, false, new Hashtable());
		this.aComponent2 = arg0;
		this.method3223();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method3221(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Graphics;IIIBI)V")
	@Override
	public void method3226(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg0.getClip();
		arg0.clipRect(arg4, arg3, arg2, arg1);
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
		arg0.setClip(local2);
	}
}
