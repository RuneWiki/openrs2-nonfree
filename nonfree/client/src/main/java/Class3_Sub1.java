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

@OriginalClass("client!ac")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method4447(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anIntArray536 = new int[arg1 * arg0 + 1];
		this.anInt5629 = arg0;
		this.anInt5627 = arg1;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray536, this.anIntArray536.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt5627, this.anInt5629), local22, null);
		this.anImage4 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method4441();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method4444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Shape local12 = arg2.getClip();
		arg2.clipRect(arg1, arg0, arg3, arg4);
		arg2.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg2.setClip(local12);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	@Override
	public void method4440(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}
}
