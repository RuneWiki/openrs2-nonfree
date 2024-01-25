import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class77_Sub3 extends Class77 {

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "J")
	private long aLong112 = 0L;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "J")
	private long aLong113 = 0L;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "J")
	private long aLong114 = 0L;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
	private int anInt3573 = 1;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
	private int anInt3572 = 0;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	public Class77_Sub3() {
		this.aLong112 = this.aLong113 = jagmisc.nanoTime();
		if (this.aLong113 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)I")
	@Override
	public int method3069(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong113 += this.method3075();
		if (this.aLong112 > this.aLong113) {
			Static224.method3441((this.aLong112 - this.aLong113) / 1000000L);
			this.aLong114 += this.aLong112 - this.aLong113;
			this.aLong113 += this.aLong112 - this.aLong113;
			this.aLong112 += local4;
			return 1;
		}
		@Pc(31) int local31 = 0;
		do {
			this.aLong112 += local4;
			local31++;
		} while (local31 < 10 && this.aLong112 < this.aLong113);
		if (this.aLong112 < this.aLong113) {
			this.aLong112 = this.aLong113;
		}
		return local31;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)J")
	@Override
	public long method3074() {
		return this.aLong113;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)J")
	private long method3075() {
		@Pc(6) long local6 = jagmisc.nanoTime();
		@Pc(12) long local12 = local6 - this.aLong114;
		this.aLong114 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray5[this.anInt3572] = local12;
			if (this.anInt3573 < 1) {
				this.anInt3573++;
			}
			this.anInt3572 = (this.anInt3572 + 1) % 10;
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt3573; local55++) {
			local53 += this.aLongArray5[(this.anInt3572 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt3573;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	@Override
	public void method3067() {
		this.aLong114 = 0L;
		if (this.aLong113 < this.aLong112) {
			this.aLong113 += this.aLong112 - this.aLong113;
		}
	}
}
