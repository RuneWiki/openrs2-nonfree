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

@OriginalClass("client!oa")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	@Override
	public void method1669(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anInt2582 = arg2;
		this.anIntArray269 = new int[arg2 * arg1 + 1];
		this.anInt2578 = arg1;
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray269, this.anIntArray269.length);
		@Pc(38) DirectColorModel local38 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(48) WritableRaster local48 = Raster.createWritableRaster(local38.createCompatibleSampleModel(this.anInt2578, this.anInt2582), local30, null);
		this.anImage4 = new BufferedImage(local38, local48, false, new Hashtable());
		this.aComponent2 = arg0;
		this.method1668();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
	@Override
	public void method1664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2) {
		arg2.drawImage(this.anImage4, arg0, arg1, this.aComponent2);
	}
}
