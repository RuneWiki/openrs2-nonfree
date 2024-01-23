import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class78_Sub3 extends Class78 {

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "[J")
	private long[] aLongArray34 = new long[10];

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
	private int anInt3952 = 1;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "J")
	private long aLong145 = 0L;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
	private int anInt3951 = 0;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "J")
	private long aLong146 = 0L;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "J")
	private long aLong144 = 0L;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)J")
	@Override
	public long method3302() {
		return this.aLong146;
	}

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)J")
	private long method3303() {
		@Pc(6) long local6 = Static101.method1677() * 1000000L;
		@Pc(12) long local12 = local6 - this.aLong145;
		@Pc(15) long local15 = (long) 0;
		this.aLong145 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray34[this.anInt3951] = local12;
			if (this.anInt3952 < 10) {
				this.anInt3952++;
			}
			this.anInt3951 = (this.anInt3951 + 1) % 10;
		}
		for (@Pc(55) int local55 = 1; local55 <= this.anInt3952; local55++) {
			local15 += this.aLongArray34[(this.anInt3951 + 10 - local55) % 10];
		}
		return local15 / (long) this.anInt3952;
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V")
	@Override
	public void method3301() {
		if (this.aLong144 > this.aLong146) {
			this.aLong146 += this.aLong144 - this.aLong146;
		}
		this.aLong145 = 0L;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)I")
	@Override
	public int method3296(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static303.method4677((long) arg0);
		this.aLong146 += this.method3303();
		@Pc(22) long local22 = (long) arg1 * 1000000L;
		if (this.aLong144 > this.aLong146) {
			Static303.method4677((this.aLong144 - this.aLong146) / 1000000L);
			this.aLong145 += this.aLong144 - this.aLong146;
			this.aLong146 += this.aLong144 - this.aLong146;
			this.aLong144 += local22;
			return 1;
		}
		@Pc(70) int local70 = 0;
		do {
			local70++;
			this.aLong144 += local22;
		} while (local70 < 10 && this.aLong144 < this.aLong146);
		if (this.aLong144 < this.aLong146) {
			this.aLong144 = this.aLong146;
		}
		return local70;
	}
}
