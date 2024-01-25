import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class188_Sub2 extends Class188 {

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
	private int anInt7744 = 1;

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "[J")
	private final long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "J")
	private long aLong192 = 0L;

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "J")
	private long aLong194 = 0L;

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "J")
	private long aLong193 = 0L;

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
	private int anInt7745 = 0;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method7561(@OriginalArg(1) long arg0) {
		if (this.aLong193 < this.aLong194) {
			this.aLong192 += this.aLong194 - this.aLong193;
			this.aLong193 += this.aLong194 - this.aLong193;
			this.aLong194 += arg0;
			return 1;
		}
		@Pc(45) int local45 = 0;
		do {
			local45++;
			this.aLong194 += arg0;
		} while (local45 < 10 && this.aLong193 > this.aLong194);
		if (this.aLong194 < this.aLong193) {
			this.aLong194 = this.aLong193;
		}
		return local45;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)J")
	@Override
	protected long method7564() {
		this.aLong193 += this.method6182();
		return this.aLong194 > this.aLong193 ? (this.aLong194 - this.aLong193) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(B)V")
	@Override
	public void method7568() {
		this.aLong192 = 0L;
		if (this.aLong194 > this.aLong193) {
			this.aLong193 += this.aLong194 - this.aLong193;
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)J")
	private long method6182() {
		@Pc(4) long local4 = Static480.method6650() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong192;
		this.aLong192 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray13[this.anInt7745] = local10;
			this.anInt7745 = (this.anInt7745 + 1) % 10;
			if (this.anInt7744 < 10) {
				this.anInt7744++;
			}
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt7744; local57++) {
			local49 += this.aLongArray13[(this.anInt7745 + 10 - local57) % 10];
		}
		return local49 / (long) this.anInt7744;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)J")
	@Override
	public long method7565() {
		return this.aLong193;
	}
}
