import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class93_Sub1 extends Class93 {

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
	private int anInt2491 = 1;

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "J")
	private long aLong64 = 0L;

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "J")
	private long aLong65 = 0L;

	@OriginalMember(owner = "client!ew", name = "j", descriptor = "J")
	private long aLong66 = 0L;

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
	private int anInt2492 = 0;

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "[J")
	private final long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "(I)J")
	private long method2324() {
		@Pc(4) long local4 = Static110.method2222() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong65;
		this.aLong65 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray11[this.anInt2492] = local10;
			this.anInt2492 = (this.anInt2492 + 1) % 10;
			if (this.anInt2491 < 10) {
				this.anInt2491++;
			}
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt2491; local57++) {
			local49 += this.aLongArray11[(this.anInt2492 + 10 - local57) % 10];
		}
		return local49 / (long) this.anInt2491;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
	@Override
	public void method7550() {
		this.aLong65 = 0L;
		if (this.aLong66 < this.aLong64) {
			this.aLong66 += this.aLong64 - this.aLong66;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)J")
	@Override
	public long method7551() {
		return this.aLong66;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)J")
	@Override
	protected long method7554() {
		this.aLong66 += this.method2324();
		return this.aLong64 > this.aLong66 ? (this.aLong64 - this.aLong66) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method7549(@OriginalArg(1) long arg0) {
		if (this.aLong64 > this.aLong66) {
			this.aLong65 += this.aLong64 - this.aLong66;
			this.aLong66 += this.aLong64 - this.aLong66;
			this.aLong64 += arg0;
			return 1;
		}
		@Pc(44) int local44 = 0;
		do {
			local44++;
			this.aLong64 += arg0;
		} while (local44 < 10 && this.aLong66 > this.aLong64);
		if (this.aLong66 > this.aLong64) {
			this.aLong64 = this.aLong66;
		}
		return local44;
	}
}
