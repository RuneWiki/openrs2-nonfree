import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class99_Sub3 extends Class99 {

	@OriginalMember(owner = "client!is", name = "f", descriptor = "J")
	private long aLong108 = 0L;

	@OriginalMember(owner = "client!is", name = "g", descriptor = "J")
	private long aLong109 = 0L;

	@OriginalMember(owner = "client!is", name = "i", descriptor = "J")
	private long aLong110 = 0L;

	@OriginalMember(owner = "client!is", name = "h", descriptor = "I")
	private int anInt3248 = 1;

	@OriginalMember(owner = "client!is", name = "k", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!is", name = "j", descriptor = "I")
	private int anInt3249 = 0;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
	public Class99_Sub3() {
		this.aLong109 = System.nanoTime();
		this.aLong108 = System.nanoTime();
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I")
	@Override
	public int method2624(@OriginalArg(1) int arg0) {
		@Pc(11) long local11 = (long) arg0 * 1000000L;
		this.aLong109 += this.method2630();
		if (this.aLong108 > this.aLong109) {
			Static214.method2089((this.aLong108 - this.aLong109) / 1000000L);
			this.aLong110 += this.aLong108 - this.aLong109;
			this.aLong109 += this.aLong108 - this.aLong109;
			this.aLong108 += local11;
			return 1;
		}
		@Pc(70) int local70 = 0;
		do {
			local70++;
			this.aLong108 += local11;
		} while (local70 < 10 && this.aLong109 > this.aLong108);
		if (this.aLong109 > this.aLong108) {
			this.aLong108 = this.aLong109;
		}
		return local70;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)J")
	@Override
	public long method2626() {
		return this.aLong109;
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(I)J")
	private long method2630() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong110;
		this.aLong110 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray5[this.anInt3249] = local7;
			if (this.anInt3248 < 1) {
				this.anInt3248++;
			}
			this.anInt3249 = (this.anInt3249 + 1) % 10;
		}
		@Pc(56) long local56 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt3248; local58++) {
			local56 += this.aLongArray5[(this.anInt3249 + 10 - local58) % 10];
		}
		return local56 / (long) this.anInt3248;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
	@Override
	public void method2627() {
		this.aLong110 = 0;
		if (this.aLong108 > this.aLong109) {
			this.aLong109 += this.aLong108 - this.aLong109;
		}
	}
}
