import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "J")
	private long aLong16 = 0L;

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
	private int anInt506 = 0;

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
	private int anInt505 = 1;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "J")
	private long aLong17 = 0L;

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "J")
	private long aLong18 = 0L;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)I")
	@Override
	public int method5105(@OriginalArg(0) int arg0) {
		this.aLong17 += this.method463();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong18 > this.aLong17) {
			Static163.method2863((this.aLong18 - this.aLong17) / 1000000L);
			this.aLong16 += this.aLong18 - this.aLong17;
			this.aLong17 += this.aLong18 - this.aLong17;
			this.aLong18 += local18;
			return 1;
		}
		@Pc(65) int local65 = 0;
		do {
			this.aLong18 += local18;
			local65++;
		} while (local65 < 10 && this.aLong17 > this.aLong18);
		if (this.aLong17 > this.aLong18) {
			this.aLong18 = this.aLong17;
		}
		return local65;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)J")
	@Override
	public long method5104() {
		return this.aLong17;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
	@Override
	public void method5107() {
		if (this.aLong17 < this.aLong18) {
			this.aLong17 += this.aLong18 - this.aLong17;
		}
		this.aLong16 = 0L;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)J")
	private long method463() {
		@Pc(4) long local4 = Static292.method5114() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong16;
		this.aLong16 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray2[this.anInt506] = local10;
			if (this.anInt505 < 10) {
				this.anInt505++;
			}
			this.anInt506 = (this.anInt506 + 1) % 10;
		}
		@Pc(57) long local57 = 0L;
		for (@Pc(59) int local59 = 1; local59 <= this.anInt505; local59++) {
			local57 += this.aLongArray2[(this.anInt506 + 10 - local59) % 10];
		}
		return local57 / (long) this.anInt505;
	}
}
