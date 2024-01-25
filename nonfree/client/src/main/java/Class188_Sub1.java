import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class188_Sub1 extends Class188 {

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "J")
	private long aLong123 = 0L;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "J")
	private long aLong124 = 0L;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "J")
	private long aLong125 = 0L;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "[J")
	private final long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
	private int anInt4898 = 1;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
	private int anInt4897 = 0;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class188_Sub1() {
		this.aLong124 = this.aLong123 = jagmisc.nanoTime();
		if (this.aLong123 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)J")
	@Override
	protected long method7564() {
		this.aLong123 += this.method3914();
		return this.aLong124 > this.aLong123 ? (this.aLong124 - this.aLong123) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)J")
	@Override
	public long method7565() {
		return this.aLong123;
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)J")
	private long method3914() {
		@Pc(6) long local6 = jagmisc.nanoTime();
		@Pc(12) long local12 = local6 - this.aLong125;
		this.aLong125 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray11[this.anInt4897] = local12;
			if (this.anInt4898 < 1) {
				this.anInt4898++;
			}
			this.anInt4897 = (this.anInt4897 + 1) % 10;
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt4898; local57++) {
			local55 += this.aLongArray11[(this.anInt4897 + 10 - local57) % 10];
		}
		return local55 / (long) this.anInt4898;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method7561(@OriginalArg(1) long arg0) {
		if (this.aLong124 > this.aLong123) {
			this.aLong125 += this.aLong124 - this.aLong123;
			this.aLong123 += this.aLong124 - this.aLong123;
			this.aLong124 += arg0;
			return 1;
		}
		@Pc(14) int local14 = 0;
		do {
			this.aLong124 += arg0;
			local14++;
		} while (local14 < 10 && this.aLong123 > this.aLong124);
		if (this.aLong123 > this.aLong124) {
			this.aLong124 = this.aLong123;
		}
		return local14;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V")
	@Override
	public void method7568() {
		this.aLong125 = 0L;
		if (this.aLong123 < this.aLong124) {
			this.aLong123 += this.aLong124 - this.aLong123;
		}
	}
}
