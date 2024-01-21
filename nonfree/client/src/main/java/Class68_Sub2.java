import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class68_Sub2 extends Class68 {

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
	private int anInt4060;

	@OriginalMember(owner = "client!vg", name = "z", descriptor = "[J")
	private final long[] aLongArray10 = new long[10];

	@OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
	private int anInt4066 = 1;

	@OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
	private int anInt4063 = 256;

	@OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
	private int anInt4061 = 0;

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "J")
	private long aLong152 = Static169.method2888();

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	public Class68_Sub2() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray10[local22] = this.aLong152;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IBI)I")
	@Override
	public int method2973(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt4063;
		this.anInt4063 = 300;
		@Pc(14) int local14 = this.anInt4066;
		this.anInt4066 = 1;
		this.aLong152 = Static169.method2888();
		if (this.aLongArray10[this.anInt4060] == 0L) {
			this.anInt4066 = local14;
			this.anInt4063 = local4;
		} else if (this.aLong152 > this.aLongArray10[this.anInt4060]) {
			this.anInt4063 = (int) ((long) (arg0 * 2560) / (this.aLong152 - this.aLongArray10[this.anInt4060]));
		}
		if (this.anInt4063 < 25) {
			this.anInt4063 = 25;
		}
		if (this.anInt4063 > 256) {
			this.anInt4063 = 256;
			this.anInt4066 = (int) ((long) arg0 - (this.aLong152 - this.aLongArray10[this.anInt4060]) / 10L);
		}
		if (arg0 < this.anInt4066) {
			this.anInt4066 = arg0;
		}
		this.aLongArray10[this.anInt4060] = this.aLong152;
		this.anInt4060 = (this.anInt4060 + 1) % 10;
		@Pc(126) int local126;
		if (this.anInt4066 > 1) {
			for (local126 = 0; local126 < 10; local126++) {
				if (this.aLongArray10[local126] != 0L) {
					this.aLongArray10[local126] += this.anInt4066;
				}
			}
		}
		local126 = 0;
		if (arg1 > this.anInt4066) {
			this.anInt4066 = arg1;
		}
		Static181.method2982((long) this.anInt4066);
		while (this.anInt4061 < 256) {
			this.anInt4061 += this.anInt4063;
			local126++;
		}
		this.anInt4061 &= 0xFF;
		return local126;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	@Override
	public void method2974() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray10[local7] = 0L;
		}
	}
}
