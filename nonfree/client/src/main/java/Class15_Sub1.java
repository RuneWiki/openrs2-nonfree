import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!at", name = "k", descriptor = "J")
	private long aLong28 = 0L;

	@OriginalMember(owner = "client!at", name = "j", descriptor = "J")
	private long aLong27 = 0L;

	@OriginalMember(owner = "client!at", name = "m", descriptor = "I")
	private int anInt507 = 1;

	@OriginalMember(owner = "client!at", name = "o", descriptor = "I")
	private int anInt508 = 0;

	@OriginalMember(owner = "client!at", name = "l", descriptor = "J")
	private long aLong29 = 0L;

	@OriginalMember(owner = "client!at", name = "n", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
	public Class15_Sub1() {
		this.aLong27 = System.nanoTime();
		this.aLong28 = System.nanoTime();
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)I")
	@Override
	public int method6110(@OriginalArg(1) int arg0) {
		this.aLong27 += this.method489();
		@Pc(19) long local19 = (long) arg0 * 1000000L;
		if (this.aLong28 > this.aLong27) {
			Static88.method4161((this.aLong28 - this.aLong27) / 1000000L);
			this.aLong29 += this.aLong28 - this.aLong27;
			this.aLong27 += this.aLong28 - this.aLong27;
			this.aLong28 += local19;
			return 1;
		}
		@Pc(66) int local66 = 0;
		do {
			this.aLong28 += local19;
			local66++;
		} while (local66 < 10 && this.aLong27 > this.aLong28);
		if (this.aLong28 < this.aLong27) {
			this.aLong28 = this.aLong27;
		}
		return local66;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(I)J")
	@Override
	public long method6111() {
		return this.aLong27;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
	@Override
	public void method6105() {
		this.aLong29 = 0L;
		if (this.aLong27 < this.aLong28) {
			this.aLong27 += this.aLong28 - this.aLong27;
		}
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(B)J")
	private long method489() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(12) long local12 = local1 - this.aLong29;
		this.aLong29 = local1;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray2[this.anInt508] = local12;
			if (this.anInt507 < 1) {
				this.anInt507++;
			}
			this.anInt508 = (this.anInt508 + 1) % 10;
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt507; local56++) {
			local54 += this.aLongArray2[(this.anInt508 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt507;
	}
}
