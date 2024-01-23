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

@OriginalClass("client!oi")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method2687(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	@Override
	public void method2688(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anInt3438 = arg2;
		this.anIntArray563 = new int[arg1 * arg2 + 1];
		this.anInt3437 = arg1;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray563, this.anIntArray563.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(48) WritableRaster local48 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt3437, this.anInt3438), local22, null);
		this.anImage4 = new BufferedImage(local30, local48, false, new Hashtable());
		this.aComponent1 = arg0;
		this.method2692();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/awt/Graphics;IIBII)V")
	@Override
	public void method2691(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg0.getClip();
		arg0.clipRect(arg4, arg1, arg3, arg2);
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg0.setClip(local2);
	}
}
