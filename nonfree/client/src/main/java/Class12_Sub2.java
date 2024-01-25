import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!df", name = "f", descriptor = "J")
	private long aLong70 = 0L;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "J")
	private long aLong71 = 0L;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "J")
	private long aLong72 = 0L;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	private int anInt1987 = 1;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "I")
	private int anInt1988 = 0;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class12_Sub2() {
		this.aLong71 = System.nanoTime();
		this.aLong70 = System.nanoTime();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)J")
	@Override
	public long method2859() {
		return this.aLong71;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(B)J")
	private long method1933() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(12) long local12 = local1 - this.aLong72;
		this.aLong72 = local1;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray2[this.anInt1988] = local12;
			this.anInt1988 = (this.anInt1988 + 1) % 10;
			if (this.anInt1987 < 1) {
				this.anInt1987++;
			}
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt1987; local54++) {
			local52 += this.aLongArray2[(this.anInt1988 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt1987;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)J")
	@Override
	protected long method2858() {
		this.aLong71 += this.method1933();
		return this.aLong71 < this.aLong70 ? (this.aLong70 - this.aLong71) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	@Override
	public void method2856() {
		if (this.aLong71 < this.aLong70) {
			this.aLong71 += this.aLong70 - this.aLong71;
		}
		this.aLong72 = 0L;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(JI)I")
	@Override
	protected int method2855(@OriginalArg(0) long arg0) {
		if (this.aLong70 > this.aLong71) {
			this.aLong72 += this.aLong70 - this.aLong71;
			this.aLong71 += this.aLong70 - this.aLong71;
			this.aLong70 += arg0;
			return 1;
		}
		@Pc(42) int local42 = 0;
		do {
			local42++;
			this.aLong70 += arg0;
		} while (local42 < 10 && this.aLong70 < this.aLong71);
		if (this.aLong71 > this.aLong70) {
			this.aLong70 = this.aLong71;
		}
		return local42;
	}
}
