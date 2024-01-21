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

@OriginalClass("client!hf")
public final class Class17_Sub2 extends Class17 {

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
	@Override
	public void method1250(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method1252(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		@Pc(2) Shape local2 = arg4.getClip();
		arg4.clipRect(arg0, arg3, arg2, arg1);
		arg4.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg4.setClip(local2);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
	@Override
	public void method1247(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1883 = arg1;
		this.anInt1881 = arg2;
		this.anIntArray158 = new int[arg2 * arg1 + 1];
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray158, this.anIntArray158.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt1883, this.anInt1881), local22, null);
		this.anImage4 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent1 = arg0;
		this.method1251();
	}
}
