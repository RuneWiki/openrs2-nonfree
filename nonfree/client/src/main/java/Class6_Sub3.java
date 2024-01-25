import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "J")
	private long aLong169 = 0L;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "J")
	private long aLong168 = 0L;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
	private int anInt5422 = 1;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
	private int anInt5421 = 0;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "J")
	private long aLong170 = 0L;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class6_Sub3() {
		this.aLong169 = this.aLong168 = jagmisc.nanoTime();
		if (this.aLong168 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	@Override
	public void method4659() {
		if (this.aLong168 < this.aLong169) {
			this.aLong168 += this.aLong169 - this.aLong168;
		}
		this.aLong170 = 0L;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)I")
	@Override
	public int method4658(@OriginalArg(0) int arg0) {
		@Pc(11) long local11 = (long) arg0 * 1000000L;
		this.aLong168 += this.method4660();
		if (this.aLong168 < this.aLong169) {
			Static249.method4396((this.aLong169 - this.aLong168) / 1000000L);
			this.aLong170 += this.aLong169 - this.aLong168;
			this.aLong168 += this.aLong169 - this.aLong168;
			this.aLong169 += local11;
			return 1;
		}
		@Pc(69) int local69 = 0;
		do {
			this.aLong169 += local11;
			local69++;
		} while (local69 < 10 && this.aLong168 > this.aLong169);
		if (this.aLong168 > this.aLong169) {
			this.aLong169 = this.aLong168;
		}
		return local69;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)J")
	private long method4660() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong170;
		this.aLong170 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray5[this.anInt5421] = local7;
			if (this.anInt5422 < 1) {
				this.anInt5422++;
			}
			this.anInt5421 = (this.anInt5421 + 1) % 10;
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt5422; local54++) {
			local52 += this.aLongArray5[(this.anInt5421 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt5422;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)J")
	@Override
	public long method4655() {
		return this.aLong168;
	}
}
