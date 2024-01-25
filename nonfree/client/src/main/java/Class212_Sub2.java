import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class212_Sub2 extends Class212 {

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	private int anInt6099 = 1;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "J")
	private long aLong153 = 0L;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "J")
	private long aLong154 = 0L;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
	private int anInt6100 = 0;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "[J")
	private final long[] aLongArray10 = new long[10];

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "J")
	private long aLong155 = 0L;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IJ)I")
	@Override
	protected int method7751(@OriginalArg(1) long arg0) {
		if (this.aLong155 < this.aLong154) {
			this.aLong153 += this.aLong154 - this.aLong155;
			this.aLong155 += this.aLong154 - this.aLong155;
			this.aLong154 += arg0;
			return 1;
		}
		@Pc(46) int local46 = 0;
		do {
			this.aLong154 += arg0;
			local46++;
		} while (local46 < 10 && this.aLong154 < this.aLong155);
		if (this.aLong154 < this.aLong155) {
			this.aLong154 = this.aLong155;
		}
		return local46;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)J")
	@Override
	protected long method7750() {
		this.aLong155 += this.method5114();
		return this.aLong155 < this.aLong154 ? (this.aLong154 - this.aLong155) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	@Override
	public void method7746() {
		this.aLong153 = 0L;
		if (this.aLong155 < this.aLong154) {
			this.aLong155 += this.aLong154 - this.aLong155;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)J")
	@Override
	public long method7749() {
		return this.aLong155;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)J")
	private long method5114() {
		@Pc(4) long local4 = Static131.method2268() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong153;
		this.aLong153 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray10[this.anInt6100] = local10;
			this.anInt6100 = (this.anInt6100 + 1) % 10;
			if (this.anInt6099 < 10) {
				this.anInt6099++;
			}
		}
		@Pc(56) long local56 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt6099; local58++) {
			local56 += this.aLongArray10[(this.anInt6100 + 10 - local58) % 10];
		}
		return local56 / (long) this.anInt6099;
	}
}
