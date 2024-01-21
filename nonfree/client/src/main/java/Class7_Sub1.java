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

@OriginalClass("client!fi")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
	@Override
	public void method1186(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent2);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method1184(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) Shape local6 = arg0.getClip();
		arg0.clipRect(arg1, arg4, arg3, arg2);
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent2);
		arg0.setClip(local6);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	@Override
	public void method1182(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		this.anIntArray130 = new int[arg0 * arg2 + 1];
		this.anInt1520 = arg0;
		this.anInt1518 = arg2;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray130, this.anIntArray130.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt1518, this.anInt1520), local22, null);
		this.anImage3 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent2 = arg1;
		this.method1185();
	}
}
