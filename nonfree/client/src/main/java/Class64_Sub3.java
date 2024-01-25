import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class64_Sub3 extends Class64 {

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "J")
	private long aLong214 = 0L;

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "J")
	private long aLong213 = 0L;

	@OriginalMember(owner = "client!rfa", name = "j", descriptor = "[J")
	private final long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "J")
	private long aLong215 = 0L;

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
	private int anInt7898 = 1;

	@OriginalMember(owner = "client!rfa", name = "i", descriptor = "I")
	private int anInt7897 = 0;

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)V")
	@Override
	public void method6920() {
		this.aLong214 = (long) 0;
		if (this.aLong215 > this.aLong213) {
			this.aLong213 += this.aLong215 - this.aLong213;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "(I)J")
	@Override
	public long method6923() {
		return this.aLong213;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(JI)I")
	@Override
	protected int method6919(@OriginalArg(0) long arg0) {
		if (this.aLong215 > this.aLong213) {
			this.aLong214 += this.aLong215 - this.aLong213;
			this.aLong213 += this.aLong215 - this.aLong213;
			this.aLong215 += arg0;
			return 1;
		}
		@Pc(42) int local42 = 0;
		do {
			this.aLong215 += arg0;
			local42++;
		} while (local42 < 10 && this.aLong215 < this.aLong213);
		if (this.aLong213 > this.aLong215) {
			this.aLong215 = this.aLong213;
		}
		return local42;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)J")
	@Override
	protected long method6918() {
		this.aLong213 += this.method6924();
		return this.aLong213 < this.aLong215 ? (this.aLong215 - this.aLong213) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)J")
	private long method6924() {
		@Pc(4) long local4 = Static48.method1203() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong214;
		this.aLong214 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray13[this.anInt7897] = local10;
			this.anInt7897 = (this.anInt7897 + 1) % 10;
			if (this.anInt7898 < 10) {
				this.anInt7898++;
			}
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt7898; local55++) {
			local53 += this.aLongArray13[(this.anInt7897 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt7898;
	}
}
