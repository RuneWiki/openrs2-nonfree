import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!al", name = "f", descriptor = "J")
	private long aLong19 = 0L;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "J")
	private long aLong20 = 0L;

	@OriginalMember(owner = "client!al", name = "h", descriptor = "J")
	private long aLong21 = 0L;

	@OriginalMember(owner = "client!al", name = "i", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!al", name = "j", descriptor = "I")
	private int anInt448 = 1;

	@OriginalMember(owner = "client!al", name = "k", descriptor = "I")
	private int anInt449 = 0;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	public Class12_Sub1() {
		this.aLong19 = this.aLong20 = jagmisc.nanoTime();
		if (this.aLong20 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
	@Override
	public void method2856() {
		if (this.aLong20 < this.aLong19) {
			this.aLong20 += this.aLong19 - this.aLong20;
		}
		this.aLong21 = 0L;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(JI)I")
	@Override
	protected int method2855(@OriginalArg(0) long arg0) {
		if (this.aLong19 > this.aLong20) {
			this.aLong21 += this.aLong19 - this.aLong20;
			this.aLong20 += this.aLong19 - this.aLong20;
			this.aLong19 += arg0;
			return 1;
		}
		@Pc(45) int local45 = 0;
		do {
			this.aLong19 += arg0;
			local45++;
		} while (local45 < 10 && this.aLong20 > this.aLong19);
		if (this.aLong19 < this.aLong20) {
			this.aLong19 = this.aLong20;
		}
		return local45;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)J")
	@Override
	protected long method2858() {
		this.aLong20 += this.method438();
		return this.aLong20 < this.aLong19 ? (this.aLong19 - this.aLong20) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(I)J")
	private long method438() {
		@Pc(6) long local6 = jagmisc.nanoTime();
		@Pc(12) long local12 = local6 - this.aLong21;
		this.aLong21 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray1[this.anInt449] = local12;
			this.anInt449 = (this.anInt449 + 1) % 10;
			if (this.anInt448 < 1) {
				this.anInt448++;
			}
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt448; local55++) {
			local53 += this.aLongArray1[(this.anInt449 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt448;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)J")
	@Override
	public long method2859() {
		return this.aLong20;
	}
}
