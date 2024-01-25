import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class72_Sub3 extends Class72 {

	@OriginalMember(owner = "client!su", name = "k", descriptor = "J")
	private long aLong198 = 0L;

	@OriginalMember(owner = "client!su", name = "l", descriptor = "[J")
	private final long[] aLongArray14 = new long[10];

	@OriginalMember(owner = "client!su", name = "o", descriptor = "I")
	private int anInt8112 = 1;

	@OriginalMember(owner = "client!su", name = "n", descriptor = "J")
	private long aLong200 = 0L;

	@OriginalMember(owner = "client!su", name = "m", descriptor = "J")
	private long aLong199 = 0L;

	@OriginalMember(owner = "client!su", name = "p", descriptor = "I")
	private int anInt8113 = 0;

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(I)J")
	@Override
	public long method6799() {
		return this.aLong199;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
	@Override
	public void method6795() {
		if (this.aLong199 < this.aLong198) {
			this.aLong199 += this.aLong198 - this.aLong199;
		}
		this.aLong200 = 0L;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)J")
	@Override
	protected long method6801() {
		this.aLong199 += this.method6803();
		return this.aLong198 > this.aLong199 ? (this.aLong198 - this.aLong199) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(JI)I")
	@Override
	protected int method6800(@OriginalArg(0) long arg0) {
		if (this.aLong198 > this.aLong199) {
			this.aLong200 += this.aLong198 - this.aLong199;
			this.aLong199 += this.aLong198 - this.aLong199;
			this.aLong198 += arg0;
			return 1;
		}
		@Pc(43) int local43 = 0;
		do {
			local43++;
			this.aLong198 += arg0;
		} while (local43 < 10 && this.aLong199 > this.aLong198);
		if (this.aLong199 > this.aLong198) {
			this.aLong198 = this.aLong199;
		}
		return local43;
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(I)J")
	private long method6803() {
		@Pc(4) long local4 = Static143.method2502() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong200;
		this.aLong200 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray14[this.anInt8113] = local10;
			this.anInt8113 = (this.anInt8113 + 1) % 10;
			if (this.anInt8112 < 10) {
				this.anInt8112++;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt8112; local57++) {
			local55 += this.aLongArray14[(this.anInt8113 + 10 - local57) % 10];
		}
		return local55 / (long) this.anInt8112;
	}
}
