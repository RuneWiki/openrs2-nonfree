import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "[B")
	private byte[] aByteArray104;

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
	private int anInt5471;

	@OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
	private int anInt5478;

	@OriginalMember(owner = "client!qb", name = "x", descriptor = "[I")
	private final int[] anIntArray444 = new int[this.anInt5464];

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt5464 > local15; local15++) {
			this.anIntArray444[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5471 += arg1 * this.anIntArray444[arg0] >> 12;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method4366() {
		this.anInt5478 = 0;
		this.anInt5471 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBZ)V")
	protected void method4370(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray104[this.anInt5478++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	@Override
	protected final void method4363() {
		this.anInt5471 = Math.abs(this.anInt5471);
		if (this.anInt5471 >= 4096) {
			this.anInt5471 = 4095;
		}
		this.method4370(this.anInt5478++, (byte) (this.anInt5471 >> 4));
		this.anInt5471 = 0;
	}
}
