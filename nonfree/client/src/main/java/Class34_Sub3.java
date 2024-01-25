import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class34_Sub3 extends Class34 {

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
	private int anInt6258 = 0;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "[J")
	private final long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "J")
	private long aLong213 = 0L;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "J")
	private long aLong212 = 0L;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "J")
	private long aLong214 = 0L;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
	private int anInt6259 = 1;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)J")
	@Override
	public long method5275() {
		return this.aLong212;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)J")
	private long method5282() {
		@Pc(4) long local4 = Static335.method5308() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong213;
		this.aLong213 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray9[this.anInt6258] = local10;
			this.anInt6258 = (this.anInt6258 + 1) % 10;
			if (this.anInt6259 < 10) {
				this.anInt6259++;
			}
		}
		@Pc(50) long local50 = (long) 0;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt6259; local52++) {
			local50 += this.aLongArray9[(this.anInt6258 + 10 - local52) % 10];
		}
		return local50 / (long) this.anInt6259;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)I")
	@Override
	public int method5276(@OriginalArg(0) int arg0) {
		@Pc(10) long local10 = (long) arg0 * 1000000L;
		this.aLong212 += this.method5282();
		if (this.aLong212 < this.aLong214) {
			Static129.method2634((this.aLong214 - this.aLong212) / 1000000L);
			this.aLong213 += this.aLong214 - this.aLong212;
			this.aLong212 += this.aLong214 - this.aLong212;
			this.aLong214 += local10;
			return 1;
		}
		@Pc(26) int local26 = 0;
		do {
			this.aLong214 += local10;
			local26++;
		} while (local26 < 10 && this.aLong212 > this.aLong214);
		if (this.aLong214 < this.aLong212) {
			this.aLong214 = this.aLong212;
		}
		return local26;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V")
	@Override
	public void method5280() {
		this.aLong213 = 0L;
		if (this.aLong214 > this.aLong212) {
			this.aLong212 += this.aLong214 - this.aLong212;
		}
	}
}
