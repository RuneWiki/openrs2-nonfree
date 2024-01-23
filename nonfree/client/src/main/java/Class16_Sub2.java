import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "J")
	private long aLong126 = 0L;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "J")
	private long aLong127 = 0L;

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "J")
	private long aLong128 = 0L;

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "[J")
	private long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
	private int anInt3705 = 0;

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
	private int anInt3704 = 1;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
	public Class16_Sub2() {
		this.aLong126 = System.nanoTime();
		this.aLong127 = System.nanoTime();
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)J")
	private long method3056() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(16) long local16 = local1 - this.aLong128;
		@Pc(18) long local18 = 0L;
		this.aLong128 = local1;
		if (local16 > -5000000000L && local16 < 5000000000L) {
			this.aLongArray6[this.anInt3705] = local16;
			this.anInt3705 = (this.anInt3705 + 1) % 10;
			if (this.anInt3704 < 1) {
				this.anInt3704++;
			}
		}
		for (@Pc(57) int local57 = 1; local57 <= this.anInt3704; local57++) {
			local18 += this.aLongArray6[(this.anInt3705 + 10 - local57) % 10];
		}
		return local18 / (long) this.anInt3704;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)J")
	@Override
	public long method4237() {
		return this.aLong126;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)I")
	@Override
	public int method4236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static138.method2475((long) arg1);
		this.aLong126 += this.method3056();
		@Pc(22) long local22 = (long) arg0 * 1000000L;
		if (this.aLong127 > this.aLong126) {
			Static138.method2475((this.aLong127 - this.aLong126) / 1000000L);
			this.aLong128 += this.aLong127 - this.aLong126;
			this.aLong126 += this.aLong127 - this.aLong126;
			this.aLong127 += local22;
			return 1;
		}
		@Pc(34) int local34 = 0;
		do {
			local34++;
			this.aLong127 += local22;
		} while (local34 < 10 && this.aLong126 > this.aLong127);
		if (this.aLong127 < this.aLong126) {
			this.aLong127 = this.aLong126;
		}
		return local34;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(Z)V")
	@Override
	public void method4239() {
		if (this.aLong127 > this.aLong126) {
			this.aLong126 += this.aLong127 - this.aLong126;
		}
		this.aLong128 = 0L;
	}
}
