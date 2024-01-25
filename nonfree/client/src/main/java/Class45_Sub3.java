import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class45_Sub3 extends Class45 {

	@OriginalMember(owner = "client!vba", name = "l", descriptor = "J")
	private long aLong277 = 0L;

	@OriginalMember(owner = "client!vba", name = "m", descriptor = "J")
	private long aLong278 = 0L;

	@OriginalMember(owner = "client!vba", name = "n", descriptor = "J")
	private long aLong279 = 0L;

	@OriginalMember(owner = "client!vba", name = "o", descriptor = "I")
	private int anInt9122 = 1;

	@OriginalMember(owner = "client!vba", name = "p", descriptor = "[J")
	private final long[] aLongArray24 = new long[10];

	@OriginalMember(owner = "client!vba", name = "q", descriptor = "I")
	private int anInt9123 = 0;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "()V")
	public Class45_Sub3() {
		this.aLong278 = System.nanoTime();
		this.aLong277 = System.nanoTime();
	}

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "(I)J")
	private long method7476() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong279;
		this.aLong279 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray24[this.anInt9123] = local7;
			if (this.anInt9122 < 1) {
				this.anInt9122++;
			}
			this.anInt9123 = (this.anInt9123 + 1) % 10;
		}
		@Pc(56) long local56 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt9122; local58++) {
			local56 += this.aLongArray24[(this.anInt9123 + 10 - local58) % 10];
		}
		return local56 / (long) this.anInt9122;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)J")
	@Override
	protected long method7465() {
		this.aLong278 += this.method7476();
		return this.aLong278 >= this.aLong277 ? 0L : (this.aLong277 - this.aLong278) / 1000000L;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method7469(@OriginalArg(1) long arg0) {
		if (this.aLong277 > this.aLong278) {
			this.aLong279 += this.aLong277 - this.aLong278;
			this.aLong278 += this.aLong277 - this.aLong278;
			this.aLong277 += arg0;
			return 1;
		}
		@Pc(41) int local41 = 0;
		do {
			local41++;
			this.aLong277 += arg0;
		} while (local41 < 10 && this.aLong278 > this.aLong277);
		if (this.aLong277 < this.aLong278) {
			this.aLong277 = this.aLong278;
		}
		return local41;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
	@Override
	public void method7468() {
		if (this.aLong278 < this.aLong277) {
			this.aLong278 += this.aLong277 - this.aLong278;
		}
		this.aLong279 = 0L;
	}

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)J")
	@Override
	public long method7472() {
		return this.aLong278;
	}
}
