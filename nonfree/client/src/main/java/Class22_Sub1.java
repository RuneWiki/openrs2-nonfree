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

@OriginalClass("client!fc")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method1067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		this.anInt1797 = arg0;
		this.anInt1799 = arg1;
		this.anIntArray223 = new int[arg1 * arg0 + 1];
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray223, this.anIntArray223.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt1799, this.anInt1797), local22, null);
		this.anImage3 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method1068();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
	@Override
	public void method1065(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0.drawImage(this.anImage3, arg2, arg1, this.aComponent2);
	}
}
