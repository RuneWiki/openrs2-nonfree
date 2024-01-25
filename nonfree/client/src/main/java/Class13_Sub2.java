import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "J")
	private long aLong125 = 0L;

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "J")
	private long aLong126 = 0L;

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
	private int anInt3571 = 0;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "J")
	private long aLong127 = 0L;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
	private int anInt3572 = 1;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	public Class13_Sub2() {
		this.aLong125 = System.nanoTime();
		this.aLong126 = System.nanoTime();
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)J")
	private long method3175() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(15) long local15 = local1 - this.aLong127;
		this.aLong127 = local1;
		if (local15 > -5000000000L && local15 < 5000000000L) {
			this.aLongArray4[this.anInt3571] = local15;
			this.anInt3571 = (this.anInt3571 + 1) % 10;
			if (this.anInt3572 < 1) {
				this.anInt3572++;
			}
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt3572; local56++) {
			local54 += this.aLongArray4[(this.anInt3571 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt3572;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)J")
	@Override
	protected long method6677() {
		this.aLong125 += this.method3175();
		return this.aLong126 <= this.aLong125 ? 0L : (this.aLong126 - this.aLong125) / 1000000L;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)J")
	@Override
	public long method6678() {
		return this.aLong125;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	@Override
	public void method6672() {
		if (this.aLong126 > this.aLong125) {
			this.aLong125 += this.aLong126 - this.aLong125;
		}
		this.aLong127 = 0L;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(JB)I")
	@Override
	protected int method6673(@OriginalArg(0) long arg0) {
		if (this.aLong126 > this.aLong125) {
			this.aLong127 += this.aLong126 - this.aLong125;
			this.aLong125 += this.aLong126 - this.aLong125;
			this.aLong126 += arg0;
			return 1;
		}
		@Pc(44) int local44 = 0;
		do {
			local44++;
			this.aLong126 += arg0;
		} while (local44 < 10 && this.aLong125 > this.aLong126);
		if (this.aLong125 > this.aLong126) {
			this.aLong126 = this.aLong125;
		}
		return local44;
	}
}
