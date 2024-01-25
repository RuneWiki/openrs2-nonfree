import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class99_Sub1 extends Class99 {

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
	private int anInt2616 = 1;

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "J")
	private long aLong74 = 0L;

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "J")
	private long aLong75 = 0L;

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "J")
	private long aLong76 = 0L;

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
	private int anInt2617 = 0;

	@OriginalMember(owner = "client!ew", name = "j", descriptor = "[J")
	private final long[] aLongArray12 = new long[10];

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(B)J")
	private long method2178() {
		@Pc(10) long local10 = Static476.method6413() * 1000000L;
		@Pc(16) long local16 = local10 - this.aLong74;
		this.aLong74 = local10;
		if (local16 > -5000000000L && local16 < 5000000000L) {
			this.aLongArray12[this.anInt2617] = local16;
			if (this.anInt2616 < 10) {
				this.anInt2616++;
			}
			this.anInt2617 = (this.anInt2617 + 1) % 10;
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt2616; local57++) {
			local55 += this.aLongArray12[(this.anInt2617 + 10 - local57) % 10];
		}
		return local55 / (long) this.anInt2616;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)J")
	@Override
	public long method6869() {
		return this.aLong75;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)J")
	@Override
	protected long method6865() {
		this.aLong75 += this.method2178();
		return this.aLong76 > this.aLong75 ? (this.aLong76 - this.aLong75) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(JI)I")
	@Override
	protected int method6866(@OriginalArg(0) long arg0) {
		if (this.aLong76 > this.aLong75) {
			this.aLong74 += this.aLong76 - this.aLong75;
			this.aLong75 += this.aLong76 - this.aLong75;
			this.aLong76 += arg0;
			return 1;
		}
		@Pc(42) int local42 = 0;
		do {
			local42++;
			this.aLong76 += arg0;
		} while (local42 < 10 && this.aLong76 < this.aLong75);
		if (this.aLong76 < this.aLong75) {
			this.aLong76 = this.aLong75;
		}
		return local42;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
	@Override
	public void method6863() {
		if (this.aLong76 > this.aLong75) {
			this.aLong75 += this.aLong76 - this.aLong75;
		}
		this.aLong74 = 0L;
	}
}
