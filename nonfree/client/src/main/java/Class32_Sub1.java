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

@OriginalClass("client!ge")
public final class Class32_Sub1 extends Class32 {

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method1274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt1825 = arg1;
		this.anInt1828 = arg0;
		this.anIntArray222 = new int[arg0 * arg1 + 1];
		@Pc(32) DataBufferInt local32 = new DataBufferInt(this.anIntArray222, this.anIntArray222.length);
		@Pc(40) DirectColorModel local40 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(50) WritableRaster local50 = Raster.createWritableRaster(local40.createCompatibleSampleModel(this.anInt1825, this.anInt1828), local32, null);
		this.anImage3 = new BufferedImage(local40, local50, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method1279();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V")
	@Override
	public void method1275(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg0.getClip();
		arg0.clipRect(arg4, arg2, arg3, arg1);
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
		arg0.setClip(local2);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method1278(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
	}
}
