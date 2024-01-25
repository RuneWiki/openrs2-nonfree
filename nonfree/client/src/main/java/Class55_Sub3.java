import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class55_Sub3 extends Class55 {

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "J")
	private long aLong162 = 0L;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "J")
	private long aLong163 = 0L;

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
	private int anInt5551 = 1;

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
	private int anInt5552 = 0;

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "J")
	private long aLong164 = 0L;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class55_Sub3() {
		this.aLong163 = System.nanoTime();
		this.aLong162 = System.nanoTime();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)I")
	@Override
	public int method4703(@OriginalArg(0) int arg0) {
		this.aLong163 += this.method4708();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong162 > this.aLong163) {
			Static170.method1617((this.aLong162 - this.aLong163) / 1000000L);
			this.aLong164 += this.aLong162 - this.aLong163;
			this.aLong163 += this.aLong162 - this.aLong163;
			this.aLong162 += local18;
			return 1;
		}
		@Pc(66) int local66 = 0;
		do {
			this.aLong162 += local18;
			local66++;
		} while (local66 < 10 && this.aLong162 < this.aLong163);
		if (this.aLong162 < this.aLong163) {
			this.aLong162 = this.aLong163;
		}
		return local66;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)J")
	private long method4708() {
		@Pc(6) long local6 = System.nanoTime();
		@Pc(12) long local12 = local6 - this.aLong164;
		this.aLong164 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray8[this.anInt5552] = local12;
			this.anInt5552 = (this.anInt5552 + 1) % 10;
			if (this.anInt5551 < 1) {
				this.anInt5551++;
			}
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt5551; local55++) {
			local53 += this.aLongArray8[(this.anInt5552 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt5551;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)J")
	@Override
	public long method4707() {
		return this.aLong163;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	@Override
	public void method4704() {
		this.aLong164 = 0L;
		if (this.aLong162 > this.aLong163) {
			this.aLong163 += this.aLong162 - this.aLong163;
		}
	}
}
