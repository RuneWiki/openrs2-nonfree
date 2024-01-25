import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class61_Sub2 extends Class61 {

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "J")
	private long aLong160 = 0L;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "J")
	private long aLong159 = 0L;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
	private int anInt5192 = 1;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "J")
	private long aLong161 = 0L;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
	private int anInt5193 = 0;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class61_Sub2() {
		this.aLong160 = this.aLong159 = jagmisc.nanoTime();
		if (this.aLong159 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)J")
	private long method4231() {
		@Pc(7) long local7 = jagmisc.nanoTime();
		@Pc(13) long local13 = local7 - this.aLong161;
		this.aLong161 = local7;
		if (local13 > -5000000000L && local13 < 5000000000L) {
			this.aLongArray6[this.anInt5193] = local13;
			if (this.anInt5192 < 1) {
				this.anInt5192++;
			}
			this.anInt5193 = (this.anInt5193 + 1) % 10;
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt5192; local56++) {
			local54 += this.aLongArray6[(this.anInt5193 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt5192;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I")
	@Override
	public int method4572(@OriginalArg(1) int arg0) {
		this.aLong159 += this.method4231();
		@Pc(20) long local20 = (long) arg0 * 1000000L;
		if (this.aLong159 < this.aLong160) {
			Static435.method5777((this.aLong160 - this.aLong159) / 1000000L);
			this.aLong161 += this.aLong160 - this.aLong159;
			this.aLong159 += this.aLong160 - this.aLong159;
			this.aLong160 += local20;
			return 1;
		}
		@Pc(67) int local67 = 0;
		do {
			local67++;
			this.aLong160 += local20;
		} while (local67 < 10 && this.aLong160 < this.aLong159);
		if (this.aLong160 < this.aLong159) {
			this.aLong160 = this.aLong159;
		}
		return local67;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	@Override
	public void method4571() {
		this.aLong161 = 0L;
		if (this.aLong160 > this.aLong159) {
			this.aLong159 += this.aLong160 - this.aLong159;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)J")
	@Override
	public long method4568() {
		return this.aLong159;
	}
}
