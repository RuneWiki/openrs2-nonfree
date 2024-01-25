import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "J")
	private long aLong15 = 0L;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
	private int anInt281 = 0;

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "J")
	private long aLong16 = 0L;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
	private int anInt282 = 1;

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "J")
	private long aLong17 = 0L;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BI)I")
	@Override
	public int method4919(@OriginalArg(1) int arg0) {
		this.aLong15 += this.method233();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong15 < this.aLong17) {
			Static252.method2874((this.aLong17 - this.aLong15) / 1000000L);
			this.aLong16 += this.aLong17 - this.aLong15;
			this.aLong15 += this.aLong17 - this.aLong15;
			this.aLong17 += local18;
			return 1;
		}
		@Pc(30) int local30 = 0;
		do {
			this.aLong17 += local18;
			local30++;
		} while (local30 < 10 && this.aLong17 < this.aLong15);
		if (this.aLong17 < this.aLong15) {
			this.aLong17 = this.aLong15;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)J")
	private long method233() {
		@Pc(4) long local4 = Static232.method3058() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong16;
		this.aLong16 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray1[this.anInt281] = local10;
			if (this.anInt282 < 10) {
				this.anInt282++;
			}
			this.anInt281 = (this.anInt281 + 1) % 10;
		}
		@Pc(58) long local58 = 0L;
		for (@Pc(60) int local60 = 1; local60 <= this.anInt282; local60++) {
			local58 += this.aLongArray1[(this.anInt281 + 10 - local60) % 10];
		}
		return local58 / (long) this.anInt282;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)J")
	@Override
	public long method4913() {
		return this.aLong15;
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)V")
	@Override
	public void method4916() {
		this.aLong16 = 0L;
		if (this.aLong15 < this.aLong17) {
			this.aLong15 += this.aLong17 - this.aLong15;
		}
	}
}
