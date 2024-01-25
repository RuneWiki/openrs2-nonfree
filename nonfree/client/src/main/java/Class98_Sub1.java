import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class98_Sub1 extends Class98 {

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "J")
	private long aLong232 = 0L;

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "J")
	private long aLong233 = 0L;

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "J")
	private long aLong234 = 0L;

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "[J")
	private final long[] aLongArray17 = new long[10];

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
	private int anInt8326 = 1;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
	private int anInt8327 = 0;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
	public Class98_Sub1() {
		this.aLong233 = System.nanoTime();
		this.aLong232 = System.nanoTime();
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)J")
	@Override
	protected long method9619() {
		this.aLong233 += this.method7445();
		return this.aLong233 >= this.aLong232 ? 0L : (this.aLong232 - this.aLong233) / 1000000L;
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)J")
	private long method7445() {
		@Pc(9) long local9 = System.nanoTime();
		@Pc(14) long local14 = local9 - this.aLong234;
		this.aLong234 = local9;
		if (local14 > -5000000000L && local14 < 5000000000L) {
			this.aLongArray17[this.anInt8327] = local14;
			if (this.anInt8326 < 1) {
				this.anInt8326++;
			}
			this.anInt8327 = (this.anInt8327 + 1) % 10;
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt8326; local54++) {
			local52 += this.aLongArray17[(this.anInt8327 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt8326;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method9613(@OriginalArg(1) long arg0) {
		if (this.aLong233 < this.aLong232) {
			this.aLong234 += this.aLong232 - this.aLong233;
			this.aLong233 += this.aLong232 - this.aLong233;
			this.aLong232 += arg0;
			return 1;
		}
		@Pc(12) int local12 = 0;
		do {
			this.aLong232 += arg0;
			local12++;
		} while (local12 < 10 && this.aLong233 > this.aLong232);
		if (this.aLong232 < this.aLong233) {
			this.aLong232 = this.aLong233;
		}
		return local12;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)J")
	@Override
	public long method9616() {
		return this.aLong233;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V")
	@Override
	public void method9614() {
		this.aLong234 = 0L;
		if (this.aLong232 > this.aLong233) {
			this.aLong233 += this.aLong232 - this.aLong233;
		}
	}
}
