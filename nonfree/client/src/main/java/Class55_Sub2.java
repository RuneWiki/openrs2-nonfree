import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class55_Sub2 extends Class55 {

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
	private int anInt3776 = 1;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "J")
	private long aLong116 = 0L;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "J")
	private long aLong115 = 0L;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "J")
	private long aLong117 = 0L;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
	private int anInt3777 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)I")
	@Override
	public int method4703(@OriginalArg(0) int arg0) {
		this.aLong116 += this.method3371();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong117 > this.aLong116) {
			Static170.method1617((this.aLong117 - this.aLong116) / 1000000L);
			this.aLong115 += this.aLong117 - this.aLong116;
			this.aLong116 += this.aLong117 - this.aLong116;
			this.aLong117 += local12;
			return 1;
		}
		@Pc(68) int local68 = 0;
		do {
			this.aLong117 += local12;
			local68++;
		} while (local68 < 10 && this.aLong116 > this.aLong117);
		if (this.aLong116 > this.aLong117) {
			this.aLong117 = this.aLong116;
		}
		return local68;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	@Override
	public void method4704() {
		if (this.aLong116 < this.aLong117) {
			this.aLong116 += this.aLong117 - this.aLong116;
		}
		this.aLong115 = 0L;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)J")
	@Override
	public long method4707() {
		return this.aLong116;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)J")
	private long method3371() {
		@Pc(4) long local4 = Static154.method2527() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong115;
		this.aLong115 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray5[this.anInt3777] = local9;
			if (this.anInt3776 < 10) {
				this.anInt3776++;
			}
			this.anInt3777 = (this.anInt3777 + 1) % 10;
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt3776; local52++) {
			local50 += this.aLongArray5[(this.anInt3777 + 10 - local52) % 10];
		}
		return local50 / (long) this.anInt3776;
	}
}
