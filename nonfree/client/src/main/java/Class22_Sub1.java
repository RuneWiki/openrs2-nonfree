import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!re", name = "m", descriptor = "J")
	private long aLong246 = 0L;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "I")
	private int anInt4708 = 0;

	@OriginalMember(owner = "client!re", name = "l", descriptor = "[J")
	private long[] aLongArray16 = new long[10];

	@OriginalMember(owner = "client!re", name = "o", descriptor = "J")
	private long aLong247 = 0L;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "J")
	private long aLong248 = 0L;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "I")
	private int anInt4709 = 1;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)J")
	private long method3789() {
		@Pc(1) long local1 = 0L;
		@Pc(6) long local6 = Static6.method126() * 1000000L;
		@Pc(12) long local12 = local6 - this.aLong246;
		this.aLong246 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray16[this.anInt4708] = local12;
			this.anInt4708 = (this.anInt4708 + 1) % 10;
			if (this.anInt4709 < 10) {
				this.anInt4709++;
			}
		}
		for (@Pc(58) int local58 = 1; local58 <= this.anInt4709; local58++) {
			local1 += this.aLongArray16[(this.anInt4708 + 10 - local58) % 10];
		}
		return local1 / (long) this.anInt4709;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIB)I")
	@Override
	public int method4640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		Static134.method2329((long) arg0);
		this.aLong248 += this.method3789();
		if (this.aLong247 > this.aLong248) {
			Static134.method2329((this.aLong247 - this.aLong248) / 1000000L);
			this.aLong246 += this.aLong247 - this.aLong248;
			this.aLong248 += this.aLong247 - this.aLong248;
			this.aLong247 += local4;
			return 1;
		}
		@Pc(34) int local34 = 0;
		do {
			this.aLong247 += local4;
			local34++;
		} while (local34 < 10 && this.aLong248 > this.aLong247);
		if (this.aLong248 > this.aLong247) {
			this.aLong247 = this.aLong248;
		}
		return local34;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	@Override
	public void method4639() {
		this.aLong246 = 0;
		if (this.aLong248 < this.aLong247) {
			this.aLong248 += this.aLong247 - this.aLong248;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)J")
	@Override
	public long method4643() {
		return this.aLong248;
	}
}
