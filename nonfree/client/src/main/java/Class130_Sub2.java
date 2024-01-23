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

@OriginalClass("client!vk")
public final class Class130_Sub2 extends Class130 {

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method4489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt5393 = arg1;
		this.anIntArray591 = new int[arg1 * arg0 + 1];
		this.anInt5391 = arg0;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray591, this.anIntArray591.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt5391, this.anInt5393), local22, null);
		this.anImage4 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method4485();
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZIILjava/awt/Graphics;)V")
	@Override
	public void method4486(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method4487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg3.getClip();
		arg3.clipRect(arg1, arg0, arg2, arg4);
		arg3.drawImage(this.anImage4, 0, 0, this.aComponent2);
		arg3.setClip(local2);
	}
}
