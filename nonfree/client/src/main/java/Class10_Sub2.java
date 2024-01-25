import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "J")
	private long aLong109 = 0L;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "J")
	private long aLong110 = 0L;

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "J")
	private long aLong111 = 0L;

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
	private int anInt3330 = 0;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
	private int anInt3331 = 1;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class10_Sub2() {
		this.aLong109 = System.nanoTime();
		this.aLong110 = System.nanoTime();
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)J")
	@Override
	public long method3937() {
		return this.aLong109;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
	@Override
	public void method3939() {
		this.aLong111 = 0L;
		if (this.aLong110 > this.aLong109) {
			this.aLong109 += this.aLong110 - this.aLong109;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)J")
	private long method3035() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong111;
		this.aLong111 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray5[this.anInt3330] = local7;
			this.anInt3330 = (this.anInt3330 + 1) % 10;
			if (this.anInt3331 < 1) {
				this.anInt3331++;
			}
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt3331; local55++) {
			local46 += this.aLongArray5[(this.anInt3330 + 10 - local55) % 10];
		}
		return local46 / (long) this.anInt3331;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)I")
	@Override
	public int method3935(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong109 += this.method3035();
		if (this.aLong109 < this.aLong110) {
			Static20.method408((this.aLong110 - this.aLong109) / 1000000L);
			this.aLong111 += this.aLong110 - this.aLong109;
			this.aLong109 += this.aLong110 - this.aLong109;
			this.aLong110 += local4;
			return 1;
		}
		@Pc(69) int local69 = 0;
		do {
			local69++;
			this.aLong110 += local4;
		} while (local69 < 10 && this.aLong110 < this.aLong109);
		if (this.aLong109 > this.aLong110) {
			this.aLong110 = this.aLong109;
		}
		return local69;
	}
}
