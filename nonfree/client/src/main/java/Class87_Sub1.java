import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class87_Sub1 extends Class87 {

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "J")
	private long aLong95 = 0L;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "J")
	private long aLong96 = 0L;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "J")
	private long aLong97 = 0L;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	private int anInt2578 = 1;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
	private int anInt2579 = 0;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class87_Sub1() {
		this.aLong96 = this.aLong95 = jagmisc.nanoTime();
		if (this.aLong95 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)J")
	@Override
	protected long method6749() {
		this.aLong95 += this.method2360();
		return this.aLong95 < this.aLong96 ? (this.aLong96 - this.aLong95) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(JB)I")
	@Override
	protected int method6744(@OriginalArg(0) long arg0) {
		if (this.aLong96 > this.aLong95) {
			this.aLong97 += this.aLong96 - this.aLong95;
			this.aLong95 += this.aLong96 - this.aLong95;
			this.aLong96 += arg0;
			return 1;
		}
		@Pc(48) int local48 = 0;
		do {
			this.aLong96 += arg0;
			local48++;
		} while (local48 < 10 && this.aLong96 < this.aLong95);
		if (this.aLong96 < this.aLong95) {
			this.aLong96 = this.aLong95;
		}
		return local48;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)J")
	@Override
	public long method6750() {
		return this.aLong95;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)J")
	private long method2360() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong97;
		this.aLong97 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray8[this.anInt2579] = local7;
			this.anInt2579 = (this.anInt2579 + 1) % 10;
			if (this.anInt2578 < 1) {
				this.anInt2578++;
			}
		}
		@Pc(57) long local57 = (long) 0;
		for (@Pc(59) int local59 = 1; local59 <= this.anInt2578; local59++) {
			local57 += this.aLongArray8[(this.anInt2579 + 10 - local59) % 10];
		}
		return local57 / (long) this.anInt2578;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	@Override
	public void method6747() {
		this.aLong97 = 0L;
		if (this.aLong95 < this.aLong96) {
			this.aLong95 += this.aLong96 - this.aLong95;
		}
	}
}
