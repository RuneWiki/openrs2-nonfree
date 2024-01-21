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

@OriginalClass("client!ba")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	@Override
	public void method695(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anInt950 = arg2;
		this.anInt953 = arg1;
		this.anIntArray116 = new int[arg1 * arg2 + 1];
		@Pc(29) DataBufferInt local29 = new DataBufferInt(this.anIntArray116, this.anIntArray116.length);
		@Pc(37) DirectColorModel local37 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(47) WritableRaster local47 = Raster.createWritableRaster(local37.createCompatibleSampleModel(this.anInt950, this.anInt953), local29, null);
		this.anImage3 = new BufferedImage(local37, local47, false, new Hashtable());
		this.aComponent1 = arg0;
		this.method699();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
	@Override
	public void method697(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2) {
		arg1.drawImage(this.anImage3, arg0, arg2, this.aComponent1);
	}
}
