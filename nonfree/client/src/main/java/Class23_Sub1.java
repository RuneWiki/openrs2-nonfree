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

@OriginalClass("client!cf")
public final class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZILjava/awt/Graphics;I)V")
	@Override
	public void method1013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg3.getClip();
		arg3.clipRect(arg0, arg2, arg1, arg4);
		arg3.drawImage(this.anImage3, 0, 0, this.aComponent1);
		arg3.setClip(local2);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method1016(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	@Override
	public void method1010(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anInt1238 = arg2;
		this.anIntArray144 = new int[arg2 * arg1 + 1];
		this.anInt1239 = arg1;
		@Pc(26) DataBufferInt local26 = new DataBufferInt(this.anIntArray144, this.anIntArray144.length);
		@Pc(34) DirectColorModel local34 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(44) WritableRaster local44 = Raster.createWritableRaster(local34.createCompatibleSampleModel(this.anInt1238, this.anInt1239), local26, null);
		this.anImage3 = new BufferedImage(local34, local44, false, new Hashtable());
		this.aComponent1 = arg0;
		this.method1012();
	}
}
