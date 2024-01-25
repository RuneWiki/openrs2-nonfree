import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class96_Sub3 extends Class96 {

	@OriginalMember(owner = "client!ida", name = "h", descriptor = "J")
	private long aLong124 = 0L;

	@OriginalMember(owner = "client!ida", name = "g", descriptor = "J")
	private long aLong123 = 0L;

	@OriginalMember(owner = "client!ida", name = "j", descriptor = "J")
	private long aLong125 = 0L;

	@OriginalMember(owner = "client!ida", name = "i", descriptor = "I")
	private int anInt4339 = 1;

	@OriginalMember(owner = "client!ida", name = "k", descriptor = "I")
	private int anInt4340 = 0;

	@OriginalMember(owner = "client!ida", name = "l", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "()V")
	public Class96_Sub3() {
		this.aLong124 = System.nanoTime();
		this.aLong123 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(B)J")
	@Override
	protected long method3594() {
		this.aLong124 += this.method3595();
		return this.aLong124 < this.aLong123 ? (this.aLong123 - this.aLong124) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(IJ)I")
	@Override
	protected int method3593(@OriginalArg(1) long arg0) {
		if (this.aLong123 > this.aLong124) {
			this.aLong125 += this.aLong123 - this.aLong124;
			this.aLong124 += this.aLong123 - this.aLong124;
			this.aLong123 += arg0;
			return 1;
		}
		@Pc(15) int local15 = 0;
		do {
			this.aLong123 += arg0;
			local15++;
		} while (local15 < 10 && this.aLong124 > this.aLong123);
		if (this.aLong123 < this.aLong124) {
			this.aLong123 = this.aLong124;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V")
	@Override
	public void method3589() {
		this.aLong125 = 0L;
		if (this.aLong124 < this.aLong123) {
			this.aLong124 += this.aLong123 - this.aLong124;
		}
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)J")
	@Override
	public long method3591() {
		return this.aLong124;
	}

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "(B)J")
	private long method3595() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong125;
		this.aLong125 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray5[this.anInt4340] = local7;
			this.anInt4340 = (this.anInt4340 + 1) % 10;
			if (this.anInt4339 < 1) {
				this.anInt4339++;
			}
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(48) int local48 = 1; local48 <= this.anInt4339; local48++) {
			local46 += this.aLongArray5[(this.anInt4340 + 10 - local48) % 10];
		}
		return local46 / (long) this.anInt4339;
	}
}
