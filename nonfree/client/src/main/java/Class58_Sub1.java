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

@OriginalClass("client!gg")
public final class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIZILjava/awt/Graphics;I)V")
	@Override
	public void method2973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg3.getClip();
		arg3.clipRect(arg2, arg0, arg4, arg1);
		arg3.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg3.setClip(local2);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLjava/awt/Component;II)V")
	@Override
	public void method2974(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anInt3438 = arg2;
		this.anInt3446 = arg1;
		this.anIntArray289 = new int[arg2 * arg1 + 1];
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray289, this.anIntArray289.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(52) WritableRaster local52 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt3438, this.anInt3446), local22, null);
		this.anImage4 = new BufferedImage(local30, local52, false, new Hashtable());
		this.aComponent1 = arg0;
		this.method2968();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method2967(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}
}
