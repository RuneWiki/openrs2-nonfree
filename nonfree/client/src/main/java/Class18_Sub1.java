import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "J")
	private long aLong56 = 0L;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "J")
	private long aLong55 = 0L;

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
	private int anInt1561 = 0;

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
	private int anInt1560 = 1;

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "J")
	private long aLong57 = 0L;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class18_Sub1() {
		this.aLong56 = System.nanoTime();
		this.aLong55 = System.nanoTime();
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)J")
	private long method1259() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong57;
		this.aLong57 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray2[this.anInt1561] = local7;
			if (this.anInt1560 < 1) {
				this.anInt1560++;
			}
			this.anInt1561 = (this.anInt1561 + 1) % 10;
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(48) int local48 = 1; local48 <= this.anInt1560; local48++) {
			local46 += this.aLongArray2[(this.anInt1561 + 10 - local48) % 10];
		}
		return local46 / (long) this.anInt1560;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
	@Override
	public void method4635() {
		if (this.aLong55 > this.aLong56) {
			this.aLong56 += this.aLong55 - this.aLong56;
		}
		this.aLong57 = 0L;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)I")
	@Override
	public int method4636(@OriginalArg(0) int arg0) {
		this.aLong56 += this.method1259();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong56 < this.aLong55) {
			Static244.method4311((this.aLong55 - this.aLong56) / 1000000L);
			this.aLong57 += this.aLong55 - this.aLong56;
			this.aLong56 += this.aLong55 - this.aLong56;
			this.aLong55 += local18;
			return 1;
		}
		@Pc(69) int local69 = 0;
		do {
			local69++;
			this.aLong55 += local18;
		} while (local69 < 10 && this.aLong55 < this.aLong56);
		if (this.aLong56 > this.aLong55) {
			this.aLong55 = this.aLong56;
		}
		return local69;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)J")
	@Override
	public long method4639() {
		return this.aLong56;
	}
}
