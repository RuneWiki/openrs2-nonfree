import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!nfa", name = "l", descriptor = "J")
	private long aLong194 = 0L;

	@OriginalMember(owner = "client!nfa", name = "m", descriptor = "I")
	private int anInt5828 = 1;

	@OriginalMember(owner = "client!nfa", name = "p", descriptor = "[J")
	private final long[] aLongArray19 = new long[10];

	@OriginalMember(owner = "client!nfa", name = "o", descriptor = "I")
	private int anInt5829 = 0;

	@OriginalMember(owner = "client!nfa", name = "n", descriptor = "J")
	private long aLong195 = 0L;

	@OriginalMember(owner = "client!nfa", name = "q", descriptor = "J")
	private long aLong196 = 0L;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method7469(@OriginalArg(1) long arg0) {
		if (this.aLong196 < this.aLong194) {
			this.aLong195 += this.aLong194 - this.aLong196;
			this.aLong196 += this.aLong194 - this.aLong196;
			this.aLong194 += arg0;
			return 1;
		}
		@Pc(43) int local43 = 0;
		do {
			this.aLong194 += arg0;
			local43++;
		} while (local43 < 10 && this.aLong194 < this.aLong196);
		if (this.aLong194 < this.aLong196) {
			this.aLong194 = this.aLong196;
		}
		return local43;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V")
	@Override
	public void method7468() {
		this.aLong195 = 0L;
		if (this.aLong194 > this.aLong196) {
			this.aLong196 += this.aLong194 - this.aLong196;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)J")
	@Override
	protected long method7465() {
		this.aLong196 += this.method4774();
		return this.aLong194 > this.aLong196 ? (this.aLong194 - this.aLong196) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "(I)J")
	@Override
	public long method7472() {
		return this.aLong196;
	}

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "(I)J")
	private long method4774() {
		@Pc(4) long local4 = Static413.method5668() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong195;
		this.aLong195 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray19[this.anInt5829] = local10;
			if (this.anInt5828 < 10) {
				this.anInt5828++;
			}
			this.anInt5829 = (this.anInt5829 + 1) % 10;
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt5828; local51++) {
			local49 += this.aLongArray19[(this.anInt5829 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt5828;
	}
}
