import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "J")
	private long aLong233 = 0L;

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "J")
	private long aLong234 = 0L;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
	private int anInt8469 = 0;

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "J")
	private long aLong235 = 0L;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "[J")
	private final long[] aLongArray10 = new long[10];

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
	private int anInt8468 = 1;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class1_Sub3() {
		this.aLong234 = this.aLong233 = jagmisc.nanoTime();
		if (this.aLong233 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)J")
	private long method6841() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong235;
		this.aLong235 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray10[this.anInt8469] = local7;
			this.anInt8469 = (this.anInt8469 + 1) % 10;
			if (this.anInt8468 < 1) {
				this.anInt8468++;
			}
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(48) int local48 = 1; local48 <= this.anInt8468; local48++) {
			local46 += this.aLongArray10[(this.anInt8469 + 10 - local48) % 10];
		}
		return local46 / (long) this.anInt8468;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZJ)I")
	@Override
	protected int method6834(@OriginalArg(1) long arg0) {
		if (this.aLong234 > this.aLong233) {
			this.aLong235 += this.aLong234 - this.aLong233;
			this.aLong233 += this.aLong234 - this.aLong233;
			this.aLong234 += arg0;
			return 1;
		}
		@Pc(40) int local40 = 0;
		do {
			local40++;
			this.aLong234 += arg0;
		} while (local40 < 10 && this.aLong233 > this.aLong234);
		if (this.aLong233 > this.aLong234) {
			this.aLong234 = this.aLong233;
		}
		return local40;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
	@Override
	public void method6838() {
		this.aLong235 = 0L;
		if (this.aLong233 < this.aLong234) {
			this.aLong233 += this.aLong234 - this.aLong233;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)J")
	@Override
	public long method6839() {
		return this.aLong233;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)J")
	@Override
	protected long method6840() {
		this.aLong233 += this.method6841();
		return this.aLong234 > this.aLong233 ? (this.aLong234 - this.aLong233) / 1000000L : 0L;
	}
}
