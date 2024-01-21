import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
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

@OriginalClass("client!m")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!m", name = "B", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IILjava/awt/Component;B)V")
	@Override
	public void method1140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		this.anInt1832 = arg0;
		this.anIntArray210 = new int[arg1 * arg0 + 1];
		this.anInt1833 = arg1;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray210, this.anIntArray210.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt1832, this.anInt1833), local22, null);
		this.anImage4 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method1138();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method1144(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		arg1.drawImage(this.anImage4, arg2, arg0, this.aComponent1);
	}
}
