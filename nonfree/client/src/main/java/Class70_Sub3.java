import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class70_Sub3 extends Class70 {

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "J")
	private long aLong199 = 0L;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "J")
	private long aLong200 = 0L;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
	private int anInt6370 = 0;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "J")
	private long aLong201 = 0L;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	private int anInt6371 = 1;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class70_Sub3() {
		this.aLong199 = this.aLong200 = jagmisc.nanoTime();
		if (this.aLong200 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)J")
	private long method5400() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong201;
		this.aLong201 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray8[this.anInt6370] = local7;
			if (this.anInt6371 < 1) {
				this.anInt6371++;
			}
			this.anInt6370 = (this.anInt6370 + 1) % 10;
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt6371; local58++) {
			local50 += this.aLongArray8[(this.anInt6370 + 10 - local58) % 10];
		}
		return local50 / (long) this.anInt6371;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)J")
	@Override
	public long method5399() {
		return this.aLong200;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	@Override
	public void method5394() {
		this.aLong201 = 0L;
		if (this.aLong199 > this.aLong200) {
			this.aLong200 += this.aLong199 - this.aLong200;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)I")
	@Override
	public int method5397(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong200 += this.method5400();
		if (this.aLong200 < this.aLong199) {
			Static134.method2241((this.aLong199 - this.aLong200) / 1000000L);
			this.aLong201 += this.aLong199 - this.aLong200;
			this.aLong200 += this.aLong199 - this.aLong200;
			this.aLong199 += local4;
			return 1;
		}
		@Pc(25) int local25 = 0;
		do {
			local25++;
			this.aLong199 += local4;
		} while (local25 < 10 && this.aLong200 > this.aLong199);
		if (this.aLong199 < this.aLong200) {
			this.aLong199 = this.aLong200;
		}
		return local25;
	}
}
