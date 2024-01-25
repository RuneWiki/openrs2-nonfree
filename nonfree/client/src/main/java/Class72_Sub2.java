import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class72_Sub2 extends Class72 {

	@OriginalMember(owner = "client!st", name = "k", descriptor = "J")
	private long aLong195 = 0L;

	@OriginalMember(owner = "client!st", name = "l", descriptor = "J")
	private long aLong196 = 0L;

	@OriginalMember(owner = "client!st", name = "n", descriptor = "[J")
	private final long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!st", name = "m", descriptor = "I")
	private int anInt8105 = 1;

	@OriginalMember(owner = "client!st", name = "o", descriptor = "J")
	private long aLong197 = 0L;

	@OriginalMember(owner = "client!st", name = "p", descriptor = "I")
	private int anInt8106 = 0;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	public Class72_Sub2() {
		this.aLong195 = this.aLong196 = jagmisc.nanoTime();
		if (this.aLong196 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(I)J")
	private long method6793() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(12) long local12 = local1 - this.aLong197;
		this.aLong197 = local1;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray13[this.anInt8106] = local12;
			this.anInt8106 = (this.anInt8106 + 1) % 10;
			if (this.anInt8105 < 1) {
				this.anInt8105++;
			}
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt8105; local53++) {
			local51 += this.aLongArray13[(this.anInt8106 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt8105;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(JI)I")
	@Override
	protected int method6800(@OriginalArg(0) long arg0) {
		if (this.aLong195 > this.aLong196) {
			this.aLong197 += this.aLong195 - this.aLong196;
			this.aLong196 += this.aLong195 - this.aLong196;
			this.aLong195 += arg0;
			return 1;
		}
		@Pc(45) int local45 = 0;
		do {
			local45++;
			this.aLong195 += arg0;
		} while (local45 < 10 && this.aLong195 < this.aLong196);
		if (this.aLong196 > this.aLong195) {
			this.aLong195 = this.aLong196;
		}
		return local45;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)J")
	@Override
	protected long method6801() {
		this.aLong196 += this.method6793();
		return this.aLong195 > this.aLong196 ? (this.aLong195 - this.aLong196) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
	@Override
	public void method6795() {
		this.aLong197 = 0L;
		if (this.aLong195 > this.aLong196) {
			this.aLong196 += this.aLong195 - this.aLong196;
		}
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(I)J")
	@Override
	public long method6799() {
		return this.aLong196;
	}
}
