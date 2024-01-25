import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class96_Sub1 extends Class96 {

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "J")
	private long aLong75 = 0L;

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "J")
	private long aLong74 = 0L;

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
	private int anInt2744 = 1;

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "J")
	private long aLong76 = 0L;

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
	private int anInt2743 = 0;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
	public Class96_Sub1() {
		this.aLong75 = this.aLong74 = jagmisc.nanoTime();
		if (this.aLong74 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(B)J")
	private long method2276() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(13) long local13 = local1 - this.aLong76;
		this.aLong76 = local1;
		if (local13 > -5000000000L && local13 < 5000000000L) {
			this.aLongArray2[this.anInt2743] = local13;
			if (this.anInt2744 < 1) {
				this.anInt2744++;
			}
			this.anInt2743 = (this.anInt2743 + 1) % 10;
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt2744; local56++) {
			local54 += this.aLongArray2[(this.anInt2743 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt2744;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	@Override
	public void method3589() {
		if (this.aLong75 > this.aLong74) {
			this.aLong74 += this.aLong75 - this.aLong74;
		}
		this.aLong76 = 0L;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)J")
	@Override
	public long method3591() {
		return this.aLong74;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)J")
	@Override
	protected long method3594() {
		this.aLong74 += this.method2276();
		return this.aLong74 < this.aLong75 ? (this.aLong75 - this.aLong74) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(IJ)I")
	@Override
	protected int method3593(@OriginalArg(1) long arg0) {
		if (this.aLong75 > this.aLong74) {
			this.aLong76 += this.aLong75 - this.aLong74;
			this.aLong74 += this.aLong75 - this.aLong74;
			this.aLong75 += arg0;
			return 1;
		}
		@Pc(44) int local44 = 0;
		do {
			this.aLong75 += arg0;
			local44++;
		} while (local44 < 10 && this.aLong74 > this.aLong75);
		if (this.aLong75 < this.aLong74) {
			this.aLong75 = this.aLong74;
		}
		return local44;
	}
}
