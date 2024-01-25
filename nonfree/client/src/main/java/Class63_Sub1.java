import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "J")
	private long aLong61 = 0L;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "J")
	private long aLong62 = 0L;

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "J")
	private long aLong63 = 0L;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "I")
	private int anInt1739 = 0;

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
	private int anInt1740 = 1;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
	public Class63_Sub1() {
		this.aLong61 = System.nanoTime();
		this.aLong62 = System.nanoTime();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)J")
	@Override
	public long method4637() {
		return this.aLong61;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)I")
	@Override
	public int method4643(@OriginalArg(0) int arg0) {
		this.aLong61 += this.method1633();
		@Pc(16) long local16 = (long) arg0 * 1000000L;
		if (this.aLong61 < this.aLong62) {
			Static83.method1499((this.aLong62 - this.aLong61) / 1000000L);
			this.aLong63 += this.aLong62 - this.aLong61;
			this.aLong61 += this.aLong62 - this.aLong61;
			this.aLong62 += local16;
			return 1;
		}
		@Pc(66) int local66 = 0;
		do {
			this.aLong62 += local16;
			local66++;
		} while (local66 < 10 && this.aLong62 < this.aLong61);
		if (this.aLong62 < this.aLong61) {
			this.aLong62 = this.aLong61;
		}
		return local66;
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)J")
	private long method1633() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong63;
		this.aLong63 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray5[this.anInt1739] = local7;
			if (this.anInt1740 < 1) {
				this.anInt1740++;
			}
			this.anInt1739 = (this.anInt1739 + 1) % 10;
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(49) int local49 = 1; local49 <= this.anInt1740; local49++) {
			local47 += this.aLongArray5[(this.anInt1739 + 10 - local49) % 10];
		}
		return local47 / (long) this.anInt1740;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
	@Override
	public void method4635() {
		this.aLong63 = 0L;
		if (this.aLong61 < this.aLong62) {
			this.aLong61 += this.aLong62 - this.aLong61;
		}
	}
}
