import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class199_Sub1 extends Class199 {

	@OriginalMember(owner = "client!kca", name = "j", descriptor = "J")
	private long aLong193 = 0L;

	@OriginalMember(owner = "client!kca", name = "h", descriptor = "J")
	private long aLong192 = 0L;

	@OriginalMember(owner = "client!kca", name = "i", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!kca", name = "l", descriptor = "J")
	private long aLong194 = 0L;

	@OriginalMember(owner = "client!kca", name = "m", descriptor = "I")
	private int anInt5694 = 1;

	@OriginalMember(owner = "client!kca", name = "k", descriptor = "I")
	private int anInt5695 = 0;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method8112(@OriginalArg(1) long arg0) {
		if (this.aLong193 < this.aLong192) {
			this.aLong194 += this.aLong192 - this.aLong193;
			this.aLong193 += this.aLong192 - this.aLong193;
			this.aLong192 += arg0;
			return 1;
		}
		@Pc(13) int local13 = 0;
		do {
			this.aLong192 += arg0;
			local13++;
		} while (local13 < 10 && this.aLong192 < this.aLong193);
		if (this.aLong193 > this.aLong192) {
			this.aLong192 = this.aLong193;
		}
		return local13;
	}

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "(B)J")
	private long method4860() {
		@Pc(4) long local4 = Static626.method8479() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong194;
		this.aLong194 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray8[this.anInt5695] = local10;
			this.anInt5695 = (this.anInt5695 + 1) % 10;
			if (this.anInt5694 < 10) {
				this.anInt5694++;
			}
		}
		@Pc(65) long local65 = 0L;
		for (@Pc(67) int local67 = 1; local67 <= this.anInt5694; local67++) {
			local65 += this.aLongArray8[(this.anInt5695 + 10 - local67) % 10];
		}
		return local65 / (long) this.anInt5694;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
	@Override
	public void method8108() {
		if (this.aLong192 > this.aLong193) {
			this.aLong193 += this.aLong192 - this.aLong193;
		}
		this.aLong194 = 0L;
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(Z)J")
	@Override
	public long method8105() {
		return this.aLong193;
	}

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "(B)J")
	@Override
	protected long method8110() {
		this.aLong193 += this.method4860();
		return this.aLong193 < this.aLong192 ? (this.aLong192 - this.aLong193) / 1000000L : 0L;
	}
}
