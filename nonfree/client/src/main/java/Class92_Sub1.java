import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class92_Sub1 extends Class92 {

	@OriginalMember(owner = "client!et", name = "d", descriptor = "J")
	private long aLong122 = 0L;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "J")
	private long aLong123 = 0L;

	@OriginalMember(owner = "client!et", name = "f", descriptor = "[J")
	private final long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!et", name = "h", descriptor = "I")
	private int anInt2604 = 0;

	@OriginalMember(owner = "client!et", name = "i", descriptor = "I")
	private int anInt2605 = 1;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "J")
	private long aLong124 = 0L;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
	public Class92_Sub1() {
		this.aLong123 = System.nanoTime();
		this.aLong122 = System.nanoTime();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method4206(@OriginalArg(1) long arg0) {
		if (this.aLong123 < this.aLong122) {
			this.aLong124 += this.aLong122 - this.aLong123;
			this.aLong123 += this.aLong122 - this.aLong123;
			this.aLong122 += arg0;
			return 1;
		}
		@Pc(42) int local42 = 0;
		do {
			this.aLong122 += arg0;
			local42++;
		} while (local42 < 10 && this.aLong123 > this.aLong122);
		if (this.aLong122 < this.aLong123) {
			this.aLong122 = this.aLong123;
		}
		return local42;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)J")
	@Override
	public long method4209() {
		return this.aLong123;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
	@Override
	public void method4208() {
		this.aLong124 = 0L;
		if (this.aLong123 < this.aLong122) {
			this.aLong123 += this.aLong122 - this.aLong123;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)J")
	private long method2202() {
		@Pc(8) long local8 = System.nanoTime();
		@Pc(13) long local13 = local8 - this.aLong124;
		this.aLong124 = local8;
		if (local13 > -5000000000L && local13 < 5000000000L) {
			this.aLongArray11[this.anInt2604] = local13;
			this.anInt2604 = (this.anInt2604 + 1) % 10;
			if (this.anInt2605 < 1) {
				this.anInt2605++;
			}
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt2605; local54++) {
			local52 += this.aLongArray11[(this.anInt2604 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt2605;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)J")
	@Override
	protected long method4210() {
		this.aLong123 += this.method2202();
		return this.aLong122 > this.aLong123 ? (this.aLong122 - this.aLong123) / 1000000L : 0L;
	}
}
