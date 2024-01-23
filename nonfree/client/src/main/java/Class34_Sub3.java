import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class34_Sub3 extends Class34 {

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "J")
	private long aLong213 = 0L;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "J")
	private long aLong214 = 0L;

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
	private int anInt5604 = 1;

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "J")
	private long aLong215 = 0L;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
	private int anInt5605 = 0;

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "[J")
	private long[] aLongArray12 = new long[10];

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
	public Class34_Sub3() {
		this.aLong213 = this.aLong214 = jagmisc.nanoTime();
		if (this.aLong214 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)J")
	private long method4658() {
		@Pc(7) long local7 = 0L;
		@Pc(9) long local9 = jagmisc.nanoTime();
		@Pc(15) long local15 = local9 - this.aLong215;
		this.aLong215 = local9;
		if (local15 > -5000000000L && local15 < 5000000000L) {
			this.aLongArray12[this.anInt5605] = local15;
			if (this.anInt5604 < 1) {
				this.anInt5604++;
			}
			this.anInt5605 = (this.anInt5605 + 1) % 10;
		}
		for (@Pc(57) int local57 = 1; local57 <= this.anInt5604; local57++) {
			local7 += this.aLongArray12[(this.anInt5605 + 10 - local57) % 10];
		}
		return local7 / (long) this.anInt5604;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)J")
	@Override
	public long method4653() {
		return this.aLong214;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
	@Override
	public void method4656() {
		this.aLong215 = 0L;
		if (this.aLong213 > this.aLong214) {
			this.aLong214 += this.aLong213 - this.aLong214;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)I")
	@Override
	public int method4655(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		Static16.method242((long) arg0);
		this.aLong214 += this.method4658();
		if (this.aLong213 > this.aLong214) {
			Static16.method242((this.aLong213 - this.aLong214) / 1000000L);
			this.aLong215 += this.aLong213 - this.aLong214;
			this.aLong214 += this.aLong213 - this.aLong214;
			this.aLong213 += local4;
			return 1;
		}
		@Pc(74) int local74 = 0;
		do {
			this.aLong213 += local4;
			local74++;
		} while (local74 < 10 && this.aLong213 < this.aLong214);
		if (this.aLong214 > this.aLong213) {
			this.aLong213 = this.aLong214;
		}
		return local74;
	}
}
