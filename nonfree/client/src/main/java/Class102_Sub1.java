import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mia")
public final class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "client!mia", name = "g", descriptor = "J")
	private long aLong191 = 0L;

	@OriginalMember(owner = "client!mia", name = "h", descriptor = "J")
	private long aLong192 = 0L;

	@OriginalMember(owner = "client!mia", name = "i", descriptor = "I")
	private int anInt5991 = 1;

	@OriginalMember(owner = "client!mia", name = "k", descriptor = "I")
	private int anInt5992 = 0;

	@OriginalMember(owner = "client!mia", name = "j", descriptor = "[J")
	private final long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!mia", name = "l", descriptor = "J")
	private long aLong193 = 0L;

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(B)V")
	@Override
	public void method8796() {
		this.aLong192 = 0L;
		if (this.aLong193 < this.aLong191) {
			this.aLong193 += this.aLong191 - this.aLong193;
		}
	}

	@OriginalMember(owner = "client!mia", name = "b", descriptor = "(B)J")
	@Override
	protected long method8797() {
		this.aLong193 += this.method5419();
		return this.aLong193 < this.aLong191 ? (this.aLong191 - this.aLong193) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(Z)J")
	private long method5419() {
		@Pc(4) long local4 = Static524.method7320() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong192;
		this.aLong192 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray13[this.anInt5992] = local9;
			this.anInt5992 = (this.anInt5992 + 1) % 10;
			if (this.anInt5991 < 10) {
				this.anInt5991++;
			}
		}
		@Pc(57) long local57 = 0L;
		for (@Pc(59) int local59 = 1; local59 <= this.anInt5991; local59++) {
			local57 += this.aLongArray13[(this.anInt5992 + 10 - local59) % 10];
		}
		return local57 / (long) this.anInt5991;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(JI)I")
	@Override
	protected int method8795(@OriginalArg(0) long arg0) {
		if (this.aLong193 < this.aLong191) {
			this.aLong192 += this.aLong191 - this.aLong193;
			this.aLong193 += this.aLong191 - this.aLong193;
			this.aLong191 += arg0;
			return 1;
		}
		@Pc(41) int local41 = 0;
		do {
			this.aLong191 += arg0;
			local41++;
		} while (local41 < 10 && this.aLong191 < this.aLong193);
		if (this.aLong193 > this.aLong191) {
			this.aLong191 = this.aLong193;
		}
		return local41;
	}

	@OriginalMember(owner = "client!mia", name = "c", descriptor = "(B)J")
	@Override
	public long method8799() {
		return this.aLong193;
	}
}
