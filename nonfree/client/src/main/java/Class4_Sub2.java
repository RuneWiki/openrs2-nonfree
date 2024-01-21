import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "[I")
	public static int[] anIntArray366 = new int[99];

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
	private int anInt2515;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
	private int anInt2516;

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
	private int anInt2523;

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
	private int anInt2525;

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	static {
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < 99; local24++) {
			@Pc(29) int local29 = local24 + 1;
			@Pc(42) int local42 = (int) ((double) local29 + Math.pow(2.0D, (double) local29 / 7.0D) * 300.0D);
			local22 += local42;
			anIntArray366[local24] = local22 / 4;
		}
	}

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	public Class4_Sub2() {
		this.method1695();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	@Override
	public void method1691() {
		for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
			this.aLongArray5[local11] = 0L;
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V")
	@Override
	public void method1695() {
		this.anInt2515 = 0;
		this.anInt2523 = 256;
		this.anInt2516 = 1;
		this.aLong111 = Static62.method1228();
		for (@Pc(24) int local24 = 0; local24 < 10; local24++) {
			this.aLongArray5[local24] = this.aLong111;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)I")
	@Override
	public int method1692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt2523;
		this.anInt2523 = 300;
		@Pc(14) int local14 = this.anInt2516;
		this.anInt2516 = 1;
		this.aLong111 = Static62.method1228();
		if (this.aLongArray5[this.anInt2525] == 0L) {
			this.anInt2516 = local14;
			this.anInt2523 = local8;
		} else if (this.aLongArray5[this.anInt2525] < this.aLong111) {
			this.anInt2523 = (int) ((long) (arg1 * 2560) / (this.aLong111 - this.aLongArray5[this.anInt2525]));
		}
		if (this.anInt2523 < 25) {
			this.anInt2523 = 25;
		}
		if (this.anInt2523 > 256) {
			this.anInt2523 = 256;
			this.anInt2516 = (int) ((long) arg1 - (this.aLong111 - this.aLongArray5[this.anInt2525]) / 10L);
		}
		if (arg1 < this.anInt2516) {
			this.anInt2516 = arg1;
		}
		this.aLongArray5[this.anInt2525] = this.aLong111;
		this.anInt2525 = (this.anInt2525 + 1) % 10;
		@Pc(126) int local126;
		if (this.anInt2516 > 1) {
			for (local126 = 0; local126 < 10; local126++) {
				if (this.aLongArray5[local126] != 0L) {
					this.aLongArray5[local126] += this.anInt2516;
				}
			}
		}
		if (this.anInt2516 < arg0) {
			this.anInt2516 = arg0;
		}
		Static17.method318((long) this.anInt2516);
		local126 = 0;
		while (this.anInt2515 < 256) {
			local126++;
			this.anInt2515 += this.anInt2523;
		}
		this.anInt2515 &= 0xFF;
		return local126;
	}
}
