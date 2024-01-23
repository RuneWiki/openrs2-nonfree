import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "J")
	private long aLong50 = 0L;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
	private int anInt1267 = 0;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "[J")
	private long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
	private int anInt1268 = 1;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "J")
	private long aLong51 = 0L;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "J")
	private long aLong52 = 0L;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)J")
	private long method1077() {
		@Pc(6) long local6 = 0L;
		@Pc(13) long local13 = Static244.method3859() * 1000000L;
		@Pc(19) long local19 = local13 - this.aLong51;
		this.aLong51 = local13;
		if (local19 > -5000000000L && local19 < 5000000000L) {
			this.aLongArray4[this.anInt1267] = local19;
			if (this.anInt1268 < 10) {
				this.anInt1268++;
			}
			this.anInt1267 = (this.anInt1267 + 1) % 10;
		}
		for (@Pc(59) int local59 = 1; local59 <= this.anInt1268; local59++) {
			local6 += this.aLongArray4[(this.anInt1267 + 10 - local59) % 10];
		}
		return local6 / (long) this.anInt1268;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	@Override
	public void method4656() {
		this.aLong51 = 0L;
		if (this.aLong50 > this.aLong52) {
			this.aLong52 += this.aLong50 - this.aLong52;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I")
	@Override
	public int method4655(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		Static16.method242((long) arg0);
		this.aLong52 += this.method1077();
		if (this.aLong50 > this.aLong52) {
			Static16.method242((this.aLong50 - this.aLong52) / 1000000L);
			this.aLong51 += this.aLong50 - this.aLong52;
			this.aLong52 += this.aLong50 - this.aLong52;
			this.aLong50 += local4;
			return 1;
		}
		@Pc(30) int local30 = 0;
		do {
			local30++;
			this.aLong50 += local4;
		} while (local30 < 10 && this.aLong50 < this.aLong52);
		if (this.aLong52 > this.aLong50) {
			this.aLong50 = this.aLong52;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)J")
	@Override
	public long method4653() {
		return this.aLong52;
	}
}
