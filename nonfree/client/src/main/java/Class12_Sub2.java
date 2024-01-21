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

@OriginalClass("client!ga")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method671(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2) {
		arg1.drawImage(this.anImage4, arg0, arg2, this.aComponent1);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		this.anIntArray152 = new int[arg0 * arg1 + 1];
		this.anInt822 = arg0;
		this.anInt824 = arg1;
		@Pc(26) DataBufferInt local26 = new DataBufferInt(this.anIntArray152, this.anIntArray152.length);
		@Pc(34) DirectColorModel local34 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(44) WritableRaster local44 = Raster.createWritableRaster(local34.createCompatibleSampleModel(this.anInt824, this.anInt822), local26, null);
		this.anImage4 = new BufferedImage(local34, local44, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method674();
	}
}
