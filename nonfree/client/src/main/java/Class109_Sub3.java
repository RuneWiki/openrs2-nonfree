import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class109_Sub3 extends Class109 {

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "J")
	private long aLong124 = 0L;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "J")
	private long aLong125 = 0L;

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "J")
	private long aLong126 = 0L;

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
	private int anInt5005 = 1;

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
	private int anInt5006 = 0;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
	public Class109_Sub3() {
		this.aLong125 = System.nanoTime();
		this.aLong124 = System.nanoTime();
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)J")
	@Override
	public long method4082() {
		return this.aLong125;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method4079(@OriginalArg(1) long arg0) {
		if (this.aLong124 > this.aLong125) {
			this.aLong126 += this.aLong124 - this.aLong125;
			this.aLong125 += this.aLong124 - this.aLong125;
			this.aLong124 += arg0;
			return 1;
		}
		@Pc(19) int local19 = 0;
		do {
			local19++;
			this.aLong124 += arg0;
		} while (local19 < 10 && this.aLong124 < this.aLong125);
		if (this.aLong124 < this.aLong125) {
			this.aLong124 = this.aLong125;
		}
		return local19;
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(B)J")
	private long method4086() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(11) long local11 = local1 - this.aLong126;
		this.aLong126 = local1;
		if (local11 > -5000000000L && local11 < 5000000000L) {
			this.aLongArray6[this.anInt5006] = local11;
			this.anInt5006 = (this.anInt5006 + 1) % 10;
			if (this.anInt5005 < 1) {
				this.anInt5005++;
			}
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt5005; local54++) {
			local52 += this.aLongArray6[(this.anInt5006 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt5005;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
	@Override
	public void method4080() {
		if (this.aLong125 < this.aLong124) {
			this.aLong125 += this.aLong124 - this.aLong125;
		}
		this.aLong126 = 0L;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)J")
	@Override
	protected long method4081() {
		this.aLong125 += this.method4086();
		return this.aLong124 <= this.aLong125 ? 0L : (this.aLong124 - this.aLong125) / 1000000L;
	}
}
