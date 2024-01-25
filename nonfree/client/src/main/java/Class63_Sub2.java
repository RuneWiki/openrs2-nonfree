import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class63_Sub2 extends Class63 {

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "J")
	private long aLong122 = 0L;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
	private int anInt3939 = 1;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "J")
	private long aLong121 = 0L;

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
	private int anInt3940 = 0;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "J")
	private long aLong123 = 0L;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)J")
	@Override
	public long method5558() {
		return this.aLong121;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)I")
	@Override
	public int method5556(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong121 += this.method3285();
		if (this.aLong122 > this.aLong121) {
			Static67.method1189((this.aLong122 - this.aLong121) / 1000000L);
			this.aLong123 += this.aLong122 - this.aLong121;
			this.aLong121 += this.aLong122 - this.aLong121;
			this.aLong122 += local4;
			return 1;
		}
		@Pc(28) int local28 = 0;
		do {
			local28++;
			this.aLong122 += local4;
		} while (local28 < 10 && this.aLong122 < this.aLong121);
		if (this.aLong122 < this.aLong121) {
			this.aLong122 = this.aLong121;
		}
		return local28;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
	@Override
	public void method5557() {
		this.aLong123 = 0L;
		if (this.aLong121 < this.aLong122) {
			this.aLong121 += this.aLong122 - this.aLong121;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)J")
	private long method3285() {
		@Pc(4) long local4 = Static101.method1557() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong123;
		this.aLong123 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray5[this.anInt3940] = local9;
			this.anInt3940 = (this.anInt3940 + 1) % 10;
			if (this.anInt3939 < 10) {
				this.anInt3939++;
			}
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt3939; local55++) {
			local53 += this.aLongArray5[(this.anInt3940 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt3939;
	}
}
