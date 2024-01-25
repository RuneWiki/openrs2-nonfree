import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class119_Sub3 extends Class119 {

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "J")
	private long aLong135 = 0L;

	@OriginalMember(owner = "client!lv", name = "h", descriptor = "J")
	private long aLong136 = 0L;

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "I")
	private int anInt4833 = 1;

	@OriginalMember(owner = "client!lv", name = "k", descriptor = "[J")
	private final long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!lv", name = "j", descriptor = "J")
	private long aLong137 = 0L;

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
	private int anInt4834 = 0;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V")
	public Class119_Sub3() {
		this.aLong135 = this.aLong136 = jagmisc.nanoTime();
		if (this.aLong136 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Z)J")
	@Override
	protected long method4145() {
		this.aLong136 += this.method4153();
		return this.aLong135 > this.aLong136 ? (this.aLong135 - this.aLong136) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method4146(@OriginalArg(1) long arg0) {
		if (this.aLong135 > this.aLong136) {
			this.aLong137 += this.aLong135 - this.aLong136;
			this.aLong136 += this.aLong135 - this.aLong136;
			this.aLong135 += arg0;
			return 1;
		}
		@Pc(16) int local16 = 0;
		do {
			local16++;
			this.aLong135 += arg0;
		} while (local16 < 10 && this.aLong135 < this.aLong136);
		if (this.aLong135 < this.aLong136) {
			this.aLong135 = this.aLong136;
		}
		return local16;
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)V")
	@Override
	public void method4149() {
		this.aLong137 = 0L;
		if (this.aLong136 < this.aLong135) {
			this.aLong136 += this.aLong135 - this.aLong136;
		}
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(B)J")
	private long method4153() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(12) long local12 = local1 - this.aLong137;
		this.aLong137 = local1;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray11[this.anInt4834] = local12;
			if (this.anInt4833 < 1) {
				this.anInt4833++;
			}
			this.anInt4834 = (this.anInt4834 + 1) % 10;
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt4833; local51++) {
			local49 += this.aLongArray11[(this.anInt4834 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt4833;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)J")
	@Override
	public long method4147() {
		return this.aLong136;
	}
}
