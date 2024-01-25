import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "[J")
	private final long[] aLongArray14 = new long[10];

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
	private int anInt2641 = 1;

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "J")
	private long aLong83 = 0L;

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
	private int anInt2642 = 0;

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "J")
	private long aLong84 = 0L;

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "J")
	private long aLong85 = 0L;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)J")
	private long method2129() {
		@Pc(4) long local4 = Static446.method5903() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong83;
		this.aLong83 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray14[this.anInt2642] = local10;
			this.anInt2642 = (this.anInt2642 + 1) % 10;
			if (this.anInt2641 < 10) {
				this.anInt2641++;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt2641; local57++) {
			local55 += this.aLongArray14[(this.anInt2642 + 10 - local57) % 10];
		}
		return local55 / (long) this.anInt2641;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZ)I")
	@Override
	public int method5373(@OriginalArg(0) int arg0) {
		this.aLong85 += this.method2129();
		@Pc(19) long local19 = (long) arg0 * 1000000L;
		if (this.aLong84 > this.aLong85) {
			Static140.method2004((this.aLong84 - this.aLong85) / 1000000L);
			this.aLong83 += this.aLong84 - this.aLong85;
			this.aLong85 += this.aLong84 - this.aLong85;
			this.aLong84 += local19;
			return 1;
		}
		@Pc(27) int local27 = 0;
		do {
			this.aLong84 += local19;
			local27++;
		} while (local27 < 10 && this.aLong85 > this.aLong84);
		if (this.aLong84 < this.aLong85) {
			this.aLong84 = this.aLong85;
		}
		return local27;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
	@Override
	public void method5369() {
		if (this.aLong85 < this.aLong84) {
			this.aLong85 += this.aLong84 - this.aLong85;
		}
		this.aLong83 = 0L;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)J")
	@Override
	public long method5371() {
		return this.aLong85;
	}
}
