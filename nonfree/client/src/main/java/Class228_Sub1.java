import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class228_Sub1 extends Class228 {

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "J")
	private long aLong170 = 0L;

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "J")
	private long aLong171 = 0L;

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
	private int anInt6290 = 0;

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
	private int anInt6289 = 1;

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "J")
	private long aLong172 = 0L;

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "[J")
	private final long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
	public Class228_Sub1() {
		this.aLong171 = this.aLong170 = jagmisc.nanoTime();
		if (this.aLong170 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(JZ)I")
	@Override
	protected int method6033(@OriginalArg(0) long arg0) {
		if (this.aLong171 > this.aLong170) {
			this.aLong172 += this.aLong171 - this.aLong170;
			this.aLong170 += this.aLong171 - this.aLong170;
			this.aLong171 += arg0;
			return 1;
		}
		@Pc(13) int local13 = 0;
		do {
			this.aLong171 += arg0;
			local13++;
		} while (local13 < 10 && this.aLong171 < this.aLong170);
		if (this.aLong171 < this.aLong170) {
			this.aLong171 = this.aLong170;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)J")
	@Override
	public long method6032() {
		return this.aLong170;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
	@Override
	public void method6031() {
		this.aLong172 = 0L;
		if (this.aLong170 < this.aLong171) {
			this.aLong170 += this.aLong171 - this.aLong170;
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)J")
	@Override
	protected long method6036() {
		this.aLong170 += this.method5341();
		return this.aLong170 < this.aLong171 ? (this.aLong171 - this.aLong170) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)J")
	private long method5341() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong172;
		this.aLong172 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray11[this.anInt6290] = local7;
			if (this.anInt6289 < 1) {
				this.anInt6289++;
			}
			this.anInt6290 = (this.anInt6290 + 1) % 10;
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt6289; local56++) {
			local46 += this.aLongArray11[(this.anInt6290 + 10 - local56) % 10];
		}
		return local46 / (long) this.anInt6289;
	}
}
