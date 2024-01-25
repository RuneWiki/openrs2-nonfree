import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class32_Sub2 extends Class32 {

	@OriginalMember(owner = "client!ou", name = "i", descriptor = "J")
	private long aLong176 = 0L;

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "J")
	private long aLong175 = 0L;

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
	private int anInt7009 = 0;

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
	private int anInt7010 = 1;

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "[J")
	private final long[] aLongArray18 = new long[10];

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "J")
	private long aLong177 = 0L;

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(JI)I")
	@Override
	protected int method7216(@OriginalArg(0) long arg0) {
		if (this.aLong176 < this.aLong175) {
			this.aLong177 += this.aLong175 - this.aLong176;
			this.aLong176 += this.aLong175 - this.aLong176;
			this.aLong175 += arg0;
			return 1;
		}
		@Pc(15) int local15 = 0;
		do {
			this.aLong175 += arg0;
			local15++;
		} while (local15 < 10 && this.aLong175 < this.aLong176);
		if (this.aLong175 < this.aLong176) {
			this.aLong175 = this.aLong176;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)J")
	@Override
	protected long method7215() {
		this.aLong176 += this.method5603();
		return this.aLong175 > this.aLong176 ? (this.aLong175 - this.aLong176) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)J")
	private long method5603() {
		@Pc(6) long local6 = Static416.method5922() * 1000000L;
		@Pc(12) long local12 = local6 - this.aLong177;
		this.aLong177 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray18[this.anInt7009] = local12;
			if (this.anInt7010 < 10) {
				this.anInt7010++;
			}
			this.anInt7009 = (this.anInt7009 + 1) % 10;
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt7010; local55++) {
			local53 += this.aLongArray18[(this.anInt7009 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt7010;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)J")
	@Override
	public long method7211() {
		return this.aLong176;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
	@Override
	public void method7212() {
		if (this.aLong175 > this.aLong176) {
			this.aLong176 += this.aLong175 - this.aLong176;
		}
		this.aLong177 = 0L;
	}
}
