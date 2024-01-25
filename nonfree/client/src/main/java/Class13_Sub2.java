import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "J")
	private long aLong150 = 0L;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "J")
	private long aLong149 = 0L;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
	private int anInt5899 = 0;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "J")
	private long aLong151 = 0L;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
	private int anInt5900 = 1;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class13_Sub2() {
		this.aLong149 = this.aLong150 = jagmisc.nanoTime();
		if (this.aLong150 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(JI)I")
	@Override
	protected int method7247(@OriginalArg(0) long arg0) {
		if (this.aLong149 > this.aLong150) {
			this.aLong151 += this.aLong149 - this.aLong150;
			this.aLong150 += this.aLong149 - this.aLong150;
			this.aLong149 += arg0;
			return 1;
		}
		@Pc(17) int local17 = 0;
		do {
			local17++;
			this.aLong149 += arg0;
		} while (local17 < 10 && this.aLong150 > this.aLong149);
		if (this.aLong149 < this.aLong150) {
			this.aLong149 = this.aLong150;
		}
		return local17;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)J")
	private long method4666() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong151;
		this.aLong151 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray6[this.anInt5899] = local7;
			if (this.anInt5900 < 1) {
				this.anInt5900++;
			}
			this.anInt5899 = (this.anInt5899 + 1) % 10;
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt5900; local56++) {
			local48 += this.aLongArray6[(this.anInt5899 + 10 - local56) % 10];
		}
		return local48 / (long) this.anInt5900;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)J")
	@Override
	public long method7249() {
		return this.aLong150;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)J")
	@Override
	protected long method7245() {
		this.aLong150 += this.method4666();
		return this.aLong150 < this.aLong149 ? (this.aLong149 - this.aLong150) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	@Override
	public void method7248() {
		this.aLong151 = 0L;
		if (this.aLong150 < this.aLong149) {
			this.aLong150 += this.aLong149 - this.aLong150;
		}
	}
}
