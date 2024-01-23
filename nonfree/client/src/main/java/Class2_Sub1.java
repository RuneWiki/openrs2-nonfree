import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	private int anInt2375;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "[J")
	private long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
	private int anInt2373 = 0;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	private int anInt2379 = 1;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
	private int anInt2372 = 256;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "J")
	private long aLong94 = Static209.method3309();

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	public Class2_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray5[local22] = this.aLong94;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)I")
	@Override
	public int method2858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt2379;
		@Pc(7) int local7 = this.anInt2372;
		this.anInt2372 = 300;
		this.anInt2379 = 1;
		this.aLong94 = Static209.method3309();
		if (this.aLongArray5[this.anInt2375] == 0L) {
			this.anInt2379 = local4;
			this.anInt2372 = local7;
		} else if (this.aLong94 > this.aLongArray5[this.anInt2375]) {
			this.anInt2372 = (int) ((long) (arg1 * 2560) / (this.aLong94 - this.aLongArray5[this.anInt2375]));
		}
		if (this.anInt2372 < 25) {
			this.anInt2372 = 25;
		}
		if (this.anInt2372 > 256) {
			this.anInt2372 = 256;
			this.anInt2379 = (int) ((long) arg1 - (this.aLong94 - this.aLongArray5[this.anInt2375]) / 10L);
		}
		if (arg1 < this.anInt2379) {
			this.anInt2379 = arg1;
		}
		this.aLongArray5[this.anInt2375] = this.aLong94;
		this.anInt2375 = (this.anInt2375 + 1) % 10;
		@Pc(128) int local128;
		if (this.anInt2379 > 1) {
			for (local128 = 0; local128 < 10; local128++) {
				if (this.aLongArray5[local128] != 0L) {
					this.aLongArray5[local128] -= -((long) this.anInt2379);
				}
			}
		}
		if (this.anInt2379 < arg0) {
			this.anInt2379 = arg0;
		}
		local128 = 0;
		Static148.method2431((long) this.anInt2379);
		while (this.anInt2373 < 256) {
			local128++;
			this.anInt2373 += this.anInt2372;
		}
		this.anInt2373 &= 0xFF;
		return local128;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	@Override
	public void method2852() {
		for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
			this.aLongArray5[local15] = 0L;
		}
	}
}
