import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
	private int anInt9337;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "[B")
	private byte[] aByteArray86;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
	private int anInt9340;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "[I")
	private final int[] anIntArray484 = new int[this.anInt9325];

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class78_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt9325; local15++) {
			this.anIntArray484[local15] = (short) (int) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BIB)V")
	protected void method7621(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray86[this.anInt9337++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	@Override
	protected final void method7612() {
		this.anInt9337 = 0;
		this.anInt9340 = 0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9340 += arg1 * this.anIntArray484[arg0] >> 12;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	@Override
	protected final void method7616() {
		this.anInt9340 = Math.abs(this.anInt9340);
		if (this.anInt9340 >= 4096) {
			this.anInt9340 = 4095;
		}
		this.method7621((byte) (this.anInt9340 >> 4), this.anInt9337++);
		this.anInt9340 = 0;
	}
}
