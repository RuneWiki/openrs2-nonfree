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

@OriginalClass("client!bb")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBLjava/awt/Graphics;III)V")
	@Override
	public void method874(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg1.getClip();
		arg1.clipRect(arg2, arg4, arg0, arg3);
		arg1.drawImage(this.anImage3, 0, 0, this.aComponent1);
		arg1.setClip(local2);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/awt/Graphics;IIZ)V")
	@Override
	public void method881(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	@Override
	public void method880(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray147 = new int[arg1 * arg2 + 1];
		this.anInt1387 = arg1;
		this.anInt1390 = arg2;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray147, this.anIntArray147.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt1390, this.anInt1387), local22, null);
		this.anImage3 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent1 = arg0;
		this.method883();
	}
}
