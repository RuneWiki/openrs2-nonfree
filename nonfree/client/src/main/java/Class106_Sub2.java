import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class106_Sub2 extends Class106 {

	@OriginalMember(owner = "client!haa", name = "f", descriptor = "J")
	private long aLong123 = 0L;

	@OriginalMember(owner = "client!haa", name = "h", descriptor = "J")
	private long aLong124 = 0L;

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
	private int anInt3582 = 0;

	@OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
	private int anInt3583 = 1;

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "J")
	private long aLong125 = 0L;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V")
	private Class106_Sub2() {
		this.aLong123 = System.nanoTime();
		this.aLong124 = System.nanoTime();
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)V")
	@Override
	public void method6184() {
		this.aLong125 = 0L;
		if (this.aLong124 > this.aLong123) {
			this.aLong123 += this.aLong124 - this.aLong123;
		}
	}

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "(I)J")
	private long method3226() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong125;
		this.aLong125 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray5[this.anInt3582] = local7;
			if (this.anInt3583 < 1) {
				this.anInt3583++;
			}
			this.anInt3582 = (this.anInt3582 + 1) % 10;
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(59) int local59 = 1; local59 <= this.anInt3583; local59++) {
			local52 += this.aLongArray5[(this.anInt3582 + 10 - local59) % 10];
		}
		return local52 / (long) this.anInt3583;
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "(I)J")
	@Override
	public long method6186() {
		return this.aLong123;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)J")
	@Override
	protected long method6180() {
		this.aLong123 += this.method3226();
		return this.aLong124 > this.aLong123 ? (this.aLong124 - this.aLong123) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(JB)I")
	@Override
	protected int method6185(@OriginalArg(0) long arg0) {
		if (this.aLong123 < this.aLong124) {
			this.aLong125 += this.aLong124 - this.aLong123;
			this.aLong123 += this.aLong124 - this.aLong123;
			this.aLong124 += arg0;
			return 1;
		}
		@Pc(41) int local41 = 0;
		do {
			this.aLong124 += arg0;
			local41++;
		} while (local41 < 10 && this.aLong124 < this.aLong123);
		if (this.aLong124 < this.aLong123) {
			this.aLong124 = this.aLong123;
		}
		return local41;
	}
}
