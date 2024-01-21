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

@OriginalClass("client!ue")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method2591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		@Pc(2) Shape local2 = arg4.getClip();
		arg4.clipRect(arg0, arg1, arg2, arg3);
		arg4.drawImage(this.anImage4, 0, 0, this.aComponent2);
		arg4.setClip(local2);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method2595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		this.anInt3714 = arg0;
		this.anIntArray349 = new int[arg1 * arg0 + 1];
		this.anInt3712 = arg1;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray349, this.anIntArray349.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(44) WritableRaster local44 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt3714, this.anInt3712), local22, null);
		this.anImage4 = new BufferedImage(local30, local44, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method2593();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	@Override
	public void method2590(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
	}
}
