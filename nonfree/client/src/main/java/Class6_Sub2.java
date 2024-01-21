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

@OriginalClass("client!qf")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method1601(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent2);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
	@Override
	public void method1598(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		this.anInt2220 = arg0;
		this.anIntArray288 = new int[arg2 * arg0 + 1];
		this.anInt2222 = arg2;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray288, this.anIntArray288.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(48) WritableRaster local48 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt2222, this.anInt2220), local22, null);
		this.anImage3 = new BufferedImage(local30, local48, false, new Hashtable());
		this.aComponent2 = arg1;
		this.method1597();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method1599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Shape local12 = arg2.getClip();
		arg2.clipRect(arg4, arg1, arg0, arg3);
		arg2.drawImage(this.anImage3, 0, 0, this.aComponent2);
		arg2.setClip(local12);
	}
}
