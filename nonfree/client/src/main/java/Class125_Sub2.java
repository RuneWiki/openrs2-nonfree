import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class125_Sub2 extends Class125 {

	@OriginalMember(owner = "client!lv", name = "h", descriptor = "J")
	private long aLong160 = 0L;

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "J")
	private long aLong161 = 0L;

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "J")
	private long aLong162 = 0L;

	@OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
	private int anInt5871 = 1;

	@OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
	private int anInt5872 = 0;

	@OriginalMember(owner = "client!lv", name = "m", descriptor = "[J")
	private final long[] aLongArray10 = new long[10];

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V")
	public Class125_Sub2() {
		this.aLong161 = System.nanoTime();
		this.aLong160 = System.nanoTime();
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(JI)I")
	@Override
	protected int method8181(@OriginalArg(0) long arg0) {
		if (this.aLong161 < this.aLong160) {
			this.aLong162 += this.aLong160 - this.aLong161;
			this.aLong161 += this.aLong160 - this.aLong161;
			this.aLong160 += arg0;
			return 1;
		}
		@Pc(14) int local14 = 0;
		do {
			local14++;
			this.aLong160 += arg0;
		} while (local14 < 10 && this.aLong160 < this.aLong161);
		if (this.aLong161 > this.aLong160) {
			this.aLong160 = this.aLong161;
		}
		return local14;
	}

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "(I)J")
	private long method4739() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong162;
		this.aLong162 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray10[this.anInt5872] = local7;
			this.anInt5872 = (this.anInt5872 + 1) % 10;
			if (this.anInt5871 < 1) {
				this.anInt5871++;
			}
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt5871; local54++) {
			local52 += this.aLongArray10[(this.anInt5872 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt5871;
	}

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "(I)J")
	@Override
	public long method8182() {
		return this.aLong161;
	}

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "(I)V")
	@Override
	public void method8178() {
		this.aLong162 = 0L;
		if (this.aLong161 < this.aLong160) {
			this.aLong161 += this.aLong160 - this.aLong161;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)J")
	@Override
	protected long method8176() {
		this.aLong161 += this.method4739();
		return this.aLong161 >= this.aLong160 ? 0L : (this.aLong160 - this.aLong161) / 1000000L;
	}
}
