import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class28_Sub3 extends Class28 {

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "J")
	private long aLong162 = 0L;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "J")
	private long aLong161 = 0L;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
	private int anInt4821 = 0;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
	private int anInt4822 = 1;

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "J")
	private long aLong163 = 0L;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class28_Sub3() {
		this.aLong162 = this.aLong161 = jagmisc.nanoTime();
		if (this.aLong161 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)I")
	@Override
	public int method4247(@OriginalArg(1) int arg0) {
		this.aLong161 += this.method4250();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong161 < this.aLong162) {
			Static358.method2028((this.aLong162 - this.aLong161) / 1000000L);
			this.aLong163 += this.aLong162 - this.aLong161;
			this.aLong161 += this.aLong162 - this.aLong161;
			this.aLong162 += local18;
			return 1;
		}
		@Pc(70) int local70 = 0;
		do {
			local70++;
			this.aLong162 += local18;
		} while (local70 < 10 && this.aLong161 > this.aLong162);
		if (this.aLong161 > this.aLong162) {
			this.aLong162 = this.aLong161;
		}
		return local70;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)J")
	@Override
	public long method4246() {
		return this.aLong161;
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)J")
	private long method4250() {
		@Pc(6) long local6 = jagmisc.nanoTime();
		@Pc(12) long local12 = local6 - this.aLong163;
		this.aLong163 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray6[this.anInt4821] = local12;
			this.anInt4821 = (this.anInt4821 + 1) % 10;
			if (this.anInt4822 < 1) {
				this.anInt4822++;
			}
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt4822; local53++) {
			local51 += this.aLongArray6[(this.anInt4821 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt4822;
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
	@Override
	public void method4249() {
		this.aLong163 = 0L;
		if (this.aLong162 > this.aLong161) {
			this.aLong161 += this.aLong162 - this.aLong161;
		}
	}
}
