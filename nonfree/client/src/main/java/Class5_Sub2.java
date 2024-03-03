import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
	private int anInt2795 = 1;

	@OriginalMember(owner = "client!ir", name = "k", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "J")
	private long aLong87 = 0L;

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "J")
	private long aLong88 = 0L;

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
	private int anInt2796 = 0;

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "J")
	private long aLong86 = 0L;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)J", line = 6)
	@Override
	public long method4406() {
		return this.aLong87;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V", line = 20)
	@Override
	public void method4409() {
		if (this.aLong86 > this.aLong87) {
			this.aLong87 += this.aLong86 - this.aLong87;
		}
		this.aLong88 = 0L;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZI)I", line = 34)
	@Override
	public int method4410(@OriginalArg(1) int arg0) {
		@Pc(11) long local11 = (long) arg0 * 1000000L;
		this.aLong87 += this.method2780();
		if (this.aLong86 > this.aLong87) {
			Static214.method4024((this.aLong86 - this.aLong87) / 1000000L);
			this.aLong88 += this.aLong86 - this.aLong87;
			this.aLong87 += this.aLong86 - this.aLong87;
			this.aLong86 += local11;
			return 1;
		}
		@Pc(71) int local71 = 0;
		do {
			local71++;
			this.aLong86 += local11;
		} while (local71 < 10 && this.aLong87 > this.aLong86);
		if (this.aLong86 < this.aLong87) {
			this.aLong86 = this.aLong87;
		}
		return local71;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)J", line = 72)
	private long method2780() {
		@Pc(4) long local4 = Static190.method3686() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong88;
		this.aLong88 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray3[this.anInt2796] = local10;
			if (this.anInt2795 < 10) {
				this.anInt2795++;
			}
			this.anInt2796 = (this.anInt2796 + 1) % 10;
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt2795; local53++) {
			local51 += this.aLongArray3[(this.anInt2796 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt2795;
	}
}
