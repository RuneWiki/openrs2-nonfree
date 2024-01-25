import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class15_Sub3 extends Class15 {

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "J")
	private long aLong208 = 0L;

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "J")
	private long aLong209 = 0L;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
	private int anInt7446 = 1;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "[J")
	private final long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "J")
	private long aLong210 = 0L;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
	private int anInt7445 = 0;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class15_Sub3() {
		this.aLong208 = this.aLong209 = jagmisc.nanoTime();
		if (this.aLong209 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)J")
	private long method6112() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong210;
		this.aLong210 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray9[this.anInt7445] = local7;
			if (this.anInt7446 < 1) {
				this.anInt7446++;
			}
			this.anInt7445 = (this.anInt7445 + 1) % 10;
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt7446; local55++) {
			local53 += this.aLongArray9[(this.anInt7445 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt7446;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)J")
	@Override
	public long method6111() {
		return this.aLong209;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	@Override
	public void method6105() {
		this.aLong210 = 0L;
		if (this.aLong208 > this.aLong209) {
			this.aLong209 += this.aLong208 - this.aLong209;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I")
	@Override
	public int method6110(@OriginalArg(1) int arg0) {
		this.aLong209 += this.method6112();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong209 < this.aLong208) {
			Static88.method4161((this.aLong208 - this.aLong209) / 1000000L);
			this.aLong210 += this.aLong208 - this.aLong209;
			this.aLong209 += this.aLong208 - this.aLong209;
			this.aLong208 += local12;
			return 1;
		}
		@Pc(69) int local69 = 0;
		do {
			local69++;
			this.aLong208 += local12;
		} while (local69 < 10 && this.aLong208 < this.aLong209);
		if (this.aLong208 < this.aLong209) {
			this.aLong208 = this.aLong209;
		}
		return local69;
	}
}
