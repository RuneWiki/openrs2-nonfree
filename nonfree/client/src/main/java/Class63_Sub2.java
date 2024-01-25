import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class63_Sub2 extends Class63 {

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
	private int anInt5133 = 1;

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "[J")
	private final long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
	private int anInt5134 = 0;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "J")
	private long aLong161 = 0L;

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "J")
	private long aLong162 = 0L;

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "J")
	private long aLong163 = 0L;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)I")
	@Override
	public int method4643(@OriginalArg(0) int arg0) {
		this.aLong163 += this.method4236();
		@Pc(17) long local17 = (long) arg0 * 1000000L;
		if (this.aLong162 > this.aLong163) {
			Static83.method1499((this.aLong162 - this.aLong163) / 1000000L);
			this.aLong161 += this.aLong162 - this.aLong163;
			this.aLong163 += this.aLong162 - this.aLong163;
			this.aLong162 += local17;
			return 1;
		}
		@Pc(68) int local68 = 0;
		do {
			local68++;
			this.aLong162 += local17;
		} while (local68 < 10 && this.aLong162 < this.aLong163);
		if (this.aLong163 > this.aLong162) {
			this.aLong162 = this.aLong163;
		}
		return local68;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)J")
	private long method4236() {
		@Pc(4) long local4 = Static354.method4966() * 1000000L;
		@Pc(15) long local15 = local4 - this.aLong161;
		this.aLong161 = local4;
		if (local15 > -5000000000L && local15 < 5000000000L) {
			this.aLongArray9[this.anInt5134] = local15;
			if (this.anInt5133 < 10) {
				this.anInt5133++;
			}
			this.anInt5134 = (this.anInt5134 + 1) % 10;
		}
		@Pc(56) long local56 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt5133; local58++) {
			local56 += this.aLongArray9[(this.anInt5134 + 10 - local58) % 10];
		}
		return local56 / (long) this.anInt5133;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)J")
	@Override
	public long method4637() {
		return this.aLong163;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	@Override
	public void method4635() {
		if (this.aLong163 < this.aLong162) {
			this.aLong163 += this.aLong162 - this.aLong163;
		}
		this.aLong161 = 0L;
	}
}
