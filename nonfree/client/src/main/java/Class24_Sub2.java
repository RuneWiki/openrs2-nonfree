import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
	private int anInt2203;

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "[J")
	private long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
	private int anInt2205 = 256;

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
	private int anInt2198 = 0;

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
	private int anInt2199 = 1;

	@OriginalMember(owner = "client!jj", name = "x", descriptor = "J")
	private long aLong80 = Static144.method2489();

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class24_Sub2() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray7[local22] = this.aLong80;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	@Override
	public void method1678() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray7[local7] = 0L;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)I")
	@Override
	public int method1679(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt2199;
		@Pc(11) int local11 = this.anInt2205;
		this.anInt2199 = 1;
		this.anInt2205 = 300;
		this.aLong80 = Static144.method2489();
		if (this.aLongArray7[this.anInt2203] == 0L) {
			this.anInt2199 = local4;
			this.anInt2205 = local11;
		} else if (this.aLongArray7[this.anInt2203] < this.aLong80) {
			this.anInt2205 = (int) ((long) (arg1 * 2560) / (this.aLong80 - this.aLongArray7[this.anInt2203]));
		}
		if (this.anInt2205 < 25) {
			this.anInt2205 = 25;
		}
		if (this.anInt2205 > 256) {
			this.anInt2205 = 256;
			this.anInt2199 = (int) ((long) arg1 - (this.aLong80 - this.aLongArray7[this.anInt2203]) / 10L);
		}
		if (arg1 < this.anInt2199) {
			this.anInt2199 = arg1;
		}
		this.aLongArray7[this.anInt2203] = this.aLong80;
		this.anInt2203 = (this.anInt2203 + 1) % 10;
		@Pc(135) int local135;
		if (this.anInt2199 > 1) {
			for (local135 = 0; local135 < 10; local135++) {
				if (this.aLongArray7[local135] != 0L) {
					this.aLongArray7[local135] += this.anInt2199;
				}
			}
		}
		if (arg0 > this.anInt2199) {
			this.anInt2199 = arg0;
		}
		Static186.method3115((long) this.anInt2199);
		local135 = 0;
		while (this.anInt2198 < 256) {
			local135++;
			this.anInt2198 += this.anInt2205;
		}
		this.anInt2198 &= 0xFF;
		return local135;
	}
}
