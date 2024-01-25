import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class18_Sub3 extends Class18 {

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "J")
	private long aLong163 = 0L;

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "J")
	private long aLong164 = 0L;

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "J")
	private long aLong162 = 0L;

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
	private int anInt5499 = 1;

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
	private int anInt5500 = 0;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)I")
	@Override
	public int method4636(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong164 += this.method4640();
		if (this.aLong162 > this.aLong164) {
			Static244.method4311((this.aLong162 - this.aLong164) / 1000000L);
			this.aLong163 += this.aLong162 - this.aLong164;
			this.aLong164 += this.aLong162 - this.aLong164;
			this.aLong162 += local4;
			return 1;
		}
		@Pc(70) int local70 = 0;
		do {
			local70++;
			this.aLong162 += local4;
		} while (local70 < 10 && this.aLong162 < this.aLong164);
		if (this.aLong164 > this.aLong162) {
			this.aLong162 = this.aLong164;
		}
		return local70;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)J")
	private long method4640() {
		@Pc(4) long local4 = Static268.method4627() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong163;
		this.aLong163 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray8[this.anInt5500] = local10;
			if (this.anInt5499 < 10) {
				this.anInt5499++;
			}
			this.anInt5500 = (this.anInt5500 + 1) % 10;
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt5499; local51++) {
			local49 += this.aLongArray8[(this.anInt5500 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt5499;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
	@Override
	public void method4635() {
		this.aLong163 = 0L;
		if (this.aLong164 < this.aLong162) {
			this.aLong164 += this.aLong162 - this.aLong164;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)J")
	@Override
	public long method4639() {
		return this.aLong164;
	}
}
