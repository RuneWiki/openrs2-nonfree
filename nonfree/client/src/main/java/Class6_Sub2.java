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

@OriginalClass("client!hc")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
	@Override
	public void method906(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/awt/Graphics;ZIIII)V")
	@Override
	public void method908(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) Shape local6 = arg0.getClip();
		arg0.clipRect(arg2, arg3, arg1, arg4);
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
		arg0.setClip(local6);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	@Override
	public void method910(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		this.anInt1208 = arg2;
		this.anIntArray182 = new int[arg2 * arg0 + 1];
		this.anInt1211 = arg0;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray182, this.anIntArray182.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt1208, this.anInt1211), local22, null);
		this.anImage3 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent1 = arg1;
		this.method907();
	}
}
