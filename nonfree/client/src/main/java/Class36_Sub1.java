import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class36_Sub1 extends Class36 {

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "J")
	private long aLong22 = 0L;

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "J")
	private long aLong23 = 0L;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
	private int anInt665 = 0;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "J")
	private long aLong24 = 0L;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
	private int anInt666 = 1;

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
	public Class36_Sub1() {
		this.aLong22 = this.aLong23 = jagmisc.nanoTime();
		if (this.aLong23 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)J")
	@Override
	public long method3804() {
		return this.aLong23;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method3807(@OriginalArg(1) long arg0) {
		if (this.aLong23 < this.aLong22) {
			this.aLong24 += this.aLong22 - this.aLong23;
			this.aLong23 += this.aLong22 - this.aLong23;
			this.aLong22 += arg0;
			return 1;
		}
		@Pc(16) int local16 = 0;
		do {
			local16++;
			this.aLong22 += arg0;
		} while (local16 < 10 && this.aLong22 < this.aLong23);
		if (this.aLong23 > this.aLong22) {
			this.aLong22 = this.aLong23;
		}
		return local16;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)J")
	@Override
	protected long method3801() {
		this.aLong23 += this.method725();
		return this.aLong23 < this.aLong22 ? (this.aLong22 - this.aLong23) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(B)J")
	private long method725() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong24;
		this.aLong24 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray4[this.anInt665] = local7;
			if (this.anInt666 < 1) {
				this.anInt666++;
			}
			this.anInt665 = (this.anInt665 + 1) % 10;
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt666; local54++) {
			local52 += this.aLongArray4[(this.anInt665 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt666;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	@Override
	public void method3803() {
		if (this.aLong23 < this.aLong22) {
			this.aLong23 += this.aLong22 - this.aLong23;
		}
		this.aLong24 = 0L;
	}
}
