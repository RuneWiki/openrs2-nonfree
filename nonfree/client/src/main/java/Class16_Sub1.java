import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "[J")
	private long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "J")
	private long aLong18 = 0L;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
	private int anInt477 = 0;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
	private int anInt478 = 1;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "J")
	private long aLong17 = 0L;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "J")
	private long aLong19 = 0L;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)J")
	private long method385() {
		@Pc(4) long local4 = Static221.method3670() * 1000000L;
		@Pc(6) long local6 = 0L;
		@Pc(12) long local12 = local4 - this.aLong18;
		this.aLong18 = local4;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray1[this.anInt477] = local12;
			if (this.anInt478 < 10) {
				this.anInt478++;
			}
			this.anInt477 = (this.anInt477 + 1) % 10;
		}
		for (@Pc(57) int local57 = 1; local57 <= this.anInt478; local57++) {
			local6 += this.aLongArray1[(this.anInt477 + 10 - local57) % 10];
		}
		return local6 / (long) this.anInt478;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V")
	@Override
	public void method4239() {
		if (this.aLong17 > this.aLong19) {
			this.aLong19 += this.aLong17 - this.aLong19;
		}
		this.aLong18 = 0L;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)J")
	@Override
	public long method4237() {
		return this.aLong19;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)I")
	@Override
	public int method4236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static138.method2475((long) arg1);
		this.aLong19 += this.method385();
		@Pc(16) long local16 = (long) arg0 * 1000000L;
		if (this.aLong17 > this.aLong19) {
			Static138.method2475((this.aLong17 - this.aLong19) / 1000000L);
			this.aLong18 += this.aLong17 - this.aLong19;
			this.aLong19 += this.aLong17 - this.aLong19;
			this.aLong17 += local16;
			return 1;
		}
		@Pc(31) int local31 = 0;
		do {
			local31++;
			this.aLong17 += local16;
		} while (local31 < 10 && this.aLong19 > this.aLong17);
		if (this.aLong19 > this.aLong17) {
			this.aLong17 = this.aLong19;
		}
		return local31;
	}
}
