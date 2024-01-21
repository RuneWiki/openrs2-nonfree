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

@OriginalClass("client!la")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!la", name = "y", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
	@Override
	public void method993(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		arg1.drawImage(this.anImage3, arg0, arg2, this.aComponent2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method997(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anIntArray212 = new int[arg0 * arg1 + 1];
		this.anInt1417 = arg0;
		this.anInt1411 = arg1;
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray212, this.anIntArray212.length);
		@Pc(38) DirectColorModel local38 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(48) WritableRaster local48 = Raster.createWritableRaster(local38.createCompatibleSampleModel(this.anInt1411, this.anInt1417), local30, null);
		this.anImage3 = new BufferedImage(local38, local48, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method996();
	}
}
