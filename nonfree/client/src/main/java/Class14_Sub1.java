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
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBIILjava/awt/Graphics;I)V")
	@Override
	public void method1190(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg3.getClip();
		arg3.clipRect(arg4, arg0, arg1, arg2);
		arg3.drawImage(this.anImage3, 0, 0, this.aComponent1);
		arg3.setClip(local2);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
	@Override
	public void method1195(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		this.anInt1362 = arg2;
		this.anInt1364 = arg0;
		this.anIntArray102 = new int[arg2 * arg0 + 1];
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray102, this.anIntArray102.length);
		@Pc(38) DirectColorModel local38 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(48) WritableRaster local48 = Raster.createWritableRaster(local38.createCompatibleSampleModel(this.anInt1362, this.anInt1364), local30, null);
		this.anImage3 = new BufferedImage(local38, local48, false, new Hashtable());
		this.aComponent1 = arg1;
		this.method1192();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method1194(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
	}
}
