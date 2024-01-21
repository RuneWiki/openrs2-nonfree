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
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method1633(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage21, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method1637(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg0.getClip();
		arg0.clipRect(arg4, arg2, arg1, arg3);
		arg0.drawImage(this.anImage21, 0, 0, this.aComponent1);
		arg0.setClip(local2);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	@Override
	public void method1632(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		this.anInt2138 = arg0;
		this.anInt2142 = arg2;
		this.anIntArray240 = new int[arg0 * arg2 + 1];
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray240, this.anIntArray240.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt2138, this.anInt2142), local22, null);
		this.anImage21 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent1 = arg1;
		this.method1636();
	}
}
