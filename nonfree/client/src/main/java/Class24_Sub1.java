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

@OriginalClass("client!ea")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	@Override
	public void method2291(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3066 = arg1;
		this.anIntArray329 = new int[arg2 * arg1 + 1];
		this.anInt3067 = arg2;
		@Pc(28) DataBufferInt local28 = new DataBufferInt(this.anIntArray329, this.anIntArray329.length);
		@Pc(36) DirectColorModel local36 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(46) WritableRaster local46 = Raster.createWritableRaster(local36.createCompatibleSampleModel(this.anInt3067, this.anInt3066), local28, null);
		this.anImage3 = new BufferedImage(local36, local46, false, new Hashtable());
		this.aComponent1 = arg0;
		this.method2292();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIBILjava/awt/Graphics;I)V")
	@Override
	public void method2290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg3.getClip();
		arg3.clipRect(arg1, arg2, arg0, arg4);
		arg3.drawImage(this.anImage3, 0, 0, this.aComponent1);
		arg3.setClip(local2);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method2287(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
	}
}
