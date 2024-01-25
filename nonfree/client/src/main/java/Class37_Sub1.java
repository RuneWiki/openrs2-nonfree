import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
	private int anInt881 = 0;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "J")
	private long aLong34 = 0L;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "J")
	private long aLong32 = 0L;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
	private int anInt880 = 1;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "J")
	private long aLong33 = 0L;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
	@Override
	public void method4749() {
		if (this.aLong32 > this.aLong33) {
			this.aLong33 += this.aLong32 - this.aLong33;
		}
		this.aLong34 = 0L;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)J")
	@Override
	public long method4748() {
		return this.aLong33;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I")
	@Override
	public int method4753(@OriginalArg(0) int arg0) {
		this.aLong33 += this.method848();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong32 > this.aLong33) {
			Static223.method4582((this.aLong32 - this.aLong33) / 1000000L);
			this.aLong34 += this.aLong32 - this.aLong33;
			this.aLong33 += this.aLong32 - this.aLong33;
			this.aLong32 += local18;
			return 1;
		}
		@Pc(65) int local65 = 0;
		do {
			this.aLong32 += local18;
			local65++;
		} while (local65 < 10 && this.aLong32 < this.aLong33);
		if (this.aLong32 < this.aLong33) {
			this.aLong32 = this.aLong33;
		}
		return local65;
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)J")
	private long method848() {
		@Pc(4) long local4 = Static27.method359() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong34;
		this.aLong34 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray3[this.anInt881] = local10;
			if (this.anInt880 < 10) {
				this.anInt880++;
			}
			this.anInt881 = (this.anInt881 + 1) % 10;
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt880; local54++) {
			local47 += this.aLongArray3[(this.anInt881 + 10 - local54) % 10];
		}
		return local47 / (long) this.anInt880;
	}
}
