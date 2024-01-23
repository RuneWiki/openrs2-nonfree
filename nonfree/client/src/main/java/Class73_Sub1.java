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

@OriginalClass("client!kf")
public final class Class73_Sub1 extends Class73 {

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
	@Override
	public void method2867(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method2868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		this.anIntArray283 = new int[arg1 * arg0 + 1];
		this.anInt3856 = arg1;
		this.anInt3858 = arg0;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray283, this.anIntArray283.length);
		@Pc(37) DirectColorModel local37 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(47) WritableRaster local47 = Raster.createWritableRaster(local37.createCompatibleSampleModel(this.anInt3858, this.anInt3856), local22, null);
		this.anImage4 = new BufferedImage(local37, local47, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method2864();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method2870(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Shape local12 = arg1.getClip();
		arg1.clipRect(arg4, arg3, arg0, arg2);
		arg1.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg1.setClip(local12);
	}
}
