import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class109_Sub1 extends Class109 {

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "J")
	private long aLong103 = 0L;

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "J")
	private long aLong104 = 0L;

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "J")
	private long aLong105 = 0L;

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
	private int anInt4047 = 1;

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
	private int anInt4048 = 0;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "()V")
	public Class109_Sub1() {
		this.aLong103 = this.aLong104 = jagmisc.nanoTime();
		if (this.aLong104 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)J")
	@Override
	public long method4082() {
		return this.aLong104;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(B)J")
	@Override
	protected long method4081() {
		this.aLong104 += this.method3283();
		return this.aLong104 < this.aLong103 ? (this.aLong103 - this.aLong104) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
	@Override
	public void method4080() {
		this.aLong105 = 0L;
		if (this.aLong104 < this.aLong103) {
			this.aLong104 += this.aLong103 - this.aLong104;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method4079(@OriginalArg(1) long arg0) {
		if (this.aLong104 < this.aLong103) {
			this.aLong105 += this.aLong103 - this.aLong104;
			this.aLong104 += this.aLong103 - this.aLong104;
			this.aLong103 += arg0;
			return 1;
		}
		@Pc(19) int local19 = 0;
		do {
			this.aLong103 += arg0;
			local19++;
		} while (local19 < 10 && this.aLong104 > this.aLong103);
		if (this.aLong103 < this.aLong104) {
			this.aLong103 = this.aLong104;
		}
		return local19;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)J")
	private long method3283() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong105;
		this.aLong105 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray3[this.anInt4048] = local7;
			this.anInt4048 = (this.anInt4048 + 1) % 10;
			if (this.anInt4047 < 1) {
				this.anInt4047++;
			}
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt4047; local54++) {
			local52 += this.aLongArray3[(this.anInt4048 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt4047;
	}
}
