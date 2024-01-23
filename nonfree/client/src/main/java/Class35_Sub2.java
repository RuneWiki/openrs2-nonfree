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

@OriginalClass("client!ua")
public final class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBIILjava/awt/Graphics;I)V")
	@Override
	public void method3258(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		@Pc(6) Shape local6 = arg3.getClip();
		arg3.clipRect(arg0, arg2, arg4, arg1);
		arg3.drawImage(this.anImage4, 0, 0, this.aComponent2);
		arg3.setClip(local6);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method3257(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method3261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt4130 = arg0;
		this.anIntArray468 = new int[arg1 * arg0 + 1];
		this.anInt4132 = arg1;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray468, this.anIntArray468.length);
		@Pc(40) DirectColorModel local40 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(50) WritableRaster local50 = Raster.createWritableRaster(local40.createCompatibleSampleModel(this.anInt4130, this.anInt4132), local22, null);
		this.anImage4 = new BufferedImage(local40, local50, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method3264();
	}
}
