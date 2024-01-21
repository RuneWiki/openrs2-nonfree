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

@OriginalClass("client!pe")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	@Override
	public void method1992(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Shape local12 = arg0.getClip();
		arg0.clipRect(arg4, arg1, arg2, arg3);
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
		arg0.setClip(local12);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/awt/Component;IB)V")
	@Override
	public void method1991(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		this.anInt3025 = arg0;
		this.anInt3026 = arg2;
		this.anIntArray402 = new int[arg0 * arg2 + 1];
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray402, this.anIntArray402.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt3025, this.anInt3026), local22, null);
		this.anImage4 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent2 = arg1;
		this.method1989();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method1990(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
	}
}
