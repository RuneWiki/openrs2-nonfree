import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class14_Sub3 extends Class14 {

	@OriginalMember(owner = "client!iba", name = "h", descriptor = "J")
	private long aLong125 = 0L;

	@OriginalMember(owner = "client!iba", name = "g", descriptor = "J")
	private long aLong124 = 0L;

	@OriginalMember(owner = "client!iba", name = "k", descriptor = "[J")
	private final long[] aLongArray14 = new long[10];

	@OriginalMember(owner = "client!iba", name = "j", descriptor = "I")
	private int anInt4342 = 0;

	@OriginalMember(owner = "client!iba", name = "i", descriptor = "I")
	private int anInt4341 = 1;

	@OriginalMember(owner = "client!iba", name = "l", descriptor = "J")
	private long aLong126 = 0L;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "()V")
	public Class14_Sub3() {
		this.aLong124 = System.nanoTime();
		this.aLong125 = System.nanoTime();
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)J")
	@Override
	public long method3833() {
		return this.aLong124;
	}

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "(I)V")
	@Override
	public void method3834() {
		this.aLong126 = 0L;
		if (this.aLong124 < this.aLong125) {
			this.aLong124 += this.aLong125 - this.aLong124;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(JI)I")
	@Override
	protected int method3830(@OriginalArg(0) long arg0) {
		if (this.aLong124 < this.aLong125) {
			this.aLong126 += this.aLong125 - this.aLong124;
			this.aLong124 += this.aLong125 - this.aLong124;
			this.aLong125 += arg0;
			return 1;
		}
		@Pc(43) int local43 = 0;
		do {
			this.aLong125 += arg0;
			local43++;
		} while (local43 < 10 && this.aLong124 > this.aLong125);
		if (this.aLong124 > this.aLong125) {
			this.aLong125 = this.aLong124;
		}
		return local43;
	}

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "(I)J")
	private long method3835() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong126;
		this.aLong126 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray14[this.anInt4342] = local7;
			this.anInt4342 = (this.anInt4342 + 1) % 10;
			if (this.anInt4341 < 1) {
				this.anInt4341++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(50) int local50 = 1; local50 <= this.anInt4341; local50++) {
			local48 += this.aLongArray14[(this.anInt4342 + 10 - local50) % 10];
		}
		return local48 / (long) this.anInt4341;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)J")
	@Override
	protected long method3831() {
		this.aLong124 += this.method3835();
		return this.aLong124 >= this.aLong125 ? 0L : (this.aLong125 - this.aLong124) / 1000000L;
	}
}
