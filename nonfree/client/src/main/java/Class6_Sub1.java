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

@OriginalClass("client!b")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!b", name = "B", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method538(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		this.anInt807 = arg2;
		this.anInt805 = arg0;
		this.anIntArray90 = new int[arg0 * arg2 + 1];
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray90, this.anIntArray90.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt805, this.anInt807), local22, null);
		this.anImage3 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent1 = arg1;
		this.method536();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
	@Override
	public void method531(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		@Pc(6) Shape local6 = arg4.getClip();
		arg4.clipRect(arg0, arg1, arg2, arg3);
		arg4.drawImage(this.anImage3, 0, 0, this.aComponent1);
		arg4.setClip(local6);
	}
}
