import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class95_Sub1 extends Class95 {

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "J")
	private long aLong84 = 0L;

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "J")
	private long aLong85 = 0L;

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
	private int anInt2925 = 0;

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "J")
	private long aLong86 = 0L;

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
	private int anInt2926 = 1;

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "[J")
	private final long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
	public Class95_Sub1() {
		this.aLong85 = System.nanoTime();
		this.aLong84 = System.nanoTime();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)J")
	@Override
	protected long method6524() {
		this.aLong85 += this.method2496();
		return this.aLong84 > this.aLong85 ? (this.aLong84 - this.aLong85) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
	@Override
	public void method6523() {
		if (this.aLong85 < this.aLong84) {
			this.aLong85 += this.aLong84 - this.aLong85;
		}
		this.aLong86 = 0L;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)J")
	@Override
	public long method6526() {
		return this.aLong85;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(JI)I")
	@Override
	protected int method6521(@OriginalArg(0) long arg0) {
		if (this.aLong84 > this.aLong85) {
			this.aLong86 += this.aLong84 - this.aLong85;
			this.aLong85 += this.aLong84 - this.aLong85;
			this.aLong84 += arg0;
			return 1;
		}
		@Pc(46) int local46 = 0;
		do {
			this.aLong84 += arg0;
			local46++;
		} while (local46 < 10 && this.aLong85 > this.aLong84);
		if (this.aLong85 > this.aLong84) {
			this.aLong84 = this.aLong85;
		}
		return local46;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)J")
	private long method2496() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong86;
		this.aLong86 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray11[this.anInt2925] = local7;
			if (this.anInt2926 < 1) {
				this.anInt2926++;
			}
			this.anInt2925 = (this.anInt2925 + 1) % 10;
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(49) int local49 = 1; local49 <= this.anInt2926; local49++) {
			local47 += this.aLongArray11[(this.anInt2925 + 10 - local49) % 10];
		}
		return local47 / (long) this.anInt2926;
	}
}
