import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class99_Sub1 extends Class99 {

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "J")
	private long aLong77 = 0L;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	private int anInt2802 = 1;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	private int anInt2803 = 0;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "J")
	private long aLong78 = 0L;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "J")
	private long aLong79 = 0L;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)J")
	private long method2276() {
		@Pc(4) long local4 = Static158.method2342() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong77;
		this.aLong77 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray2[this.anInt2803] = local10;
			this.anInt2803 = (this.anInt2803 + 1) % 10;
			if (this.anInt2802 < 10) {
				this.anInt2802++;
			}
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt2802; local56++) {
			local49 += this.aLongArray2[(this.anInt2803 + 10 - local56) % 10];
		}
		return local49 / (long) this.anInt2802;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	@Override
	public void method2627() {
		this.aLong77 = 0;
		if (this.aLong79 > this.aLong78) {
			this.aLong78 += this.aLong79 - this.aLong78;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I")
	@Override
	public int method2624(@OriginalArg(1) int arg0) {
		this.aLong78 += this.method2276();
		@Pc(14) long local14 = (long) arg0 * 1000000L;
		if (this.aLong78 < this.aLong79) {
			Static214.method2089((this.aLong79 - this.aLong78) / 1000000L);
			this.aLong77 += this.aLong79 - this.aLong78;
			this.aLong78 += this.aLong79 - this.aLong78;
			this.aLong79 += local14;
			return 1;
		}
		@Pc(70) int local70 = 0;
		do {
			local70++;
			this.aLong79 += local14;
		} while (local70 < 10 && this.aLong78 > this.aLong79);
		if (this.aLong78 > this.aLong79) {
			this.aLong79 = this.aLong78;
		}
		return local70;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)J")
	@Override
	public long method2626() {
		return this.aLong78;
	}
}
