import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "J")
	private long aLong297 = 0L;

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "J")
	private long aLong298 = 0L;

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
	private int anInt5789 = 1;

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "[J")
	private long[] aLongArray22 = new long[10];

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
	private int anInt5790 = 0;

	@OriginalMember(owner = "client!vg", name = "q", descriptor = "J")
	private long aLong299 = 0L;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	public Class22_Sub2() {
		this.aLong298 = System.nanoTime();
		this.aLong297 = System.nanoTime();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIB)I")
	@Override
	public int method4640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static134.method2329((long) arg0);
		this.aLong298 += this.method4646();
		@Pc(25) long local25 = (long) arg1 * 1000000L;
		if (this.aLong297 > this.aLong298) {
			Static134.method2329((this.aLong297 - this.aLong298) / 1000000L);
			this.aLong299 += this.aLong297 - this.aLong298;
			this.aLong298 += this.aLong297 - this.aLong298;
			this.aLong297 += local25;
			return 1;
		}
		@Pc(33) int local33 = 0;
		do {
			local33++;
			this.aLong297 += local25;
		} while (local33 < 10 && this.aLong297 < this.aLong298);
		if (this.aLong298 > this.aLong297) {
			this.aLong297 = this.aLong298;
		}
		return local33;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	@Override
	public void method4639() {
		this.aLong299 = 0;
		if (this.aLong298 < this.aLong297) {
			this.aLong298 += this.aLong297 - this.aLong298;
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)J")
	private long method4646() {
		@Pc(10) long local10 = System.nanoTime();
		@Pc(12) long local12 = 0L;
		@Pc(18) long local18 = local10 - this.aLong299;
		this.aLong299 = local10;
		if (local18 > -5000000000L && local18 < 5000000000L) {
			this.aLongArray22[this.anInt5790] = local18;
			this.anInt5790 = (this.anInt5790 + 1) % 10;
			if (this.anInt5789 < 1) {
				this.anInt5789++;
			}
		}
		for (@Pc(58) int local58 = 1; local58 <= this.anInt5789; local58++) {
			local12 += this.aLongArray22[(this.anInt5790 + 10 - local58) % 10];
		}
		return local12 / (long) this.anInt5789;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)J")
	@Override
	public long method4643() {
		return this.aLong298;
	}
}
