import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class77_Sub2 extends Class77 {

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "J")
	private long aLong182 = 0L;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "J")
	private long aLong183 = 0L;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "J")
	private long aLong184 = 0L;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
	private int anInt5144 = 1;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "[J")
	private long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
	private int anInt5143 = 0;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class77_Sub2() {
		this.aLong182 = System.nanoTime();
		this.aLong183 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)I")
	@Override
	public int method4028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static48.method934((long) arg0);
		@Pc(13) long local13 = this.method4030();
		@Pc(18) long local18 = (long) arg1 * 1000000L;
		this.aLong182 += local13;
		if (this.aLong182 >= this.aLong183) {
			@Pc(92) int local92 = 0;
			do {
				local92++;
				this.aLong183 += local18;
			} while (local92 < 10 && this.aLong183 < this.aLong182);
			if (this.aLong183 < this.aLong182) {
				this.aLong183 = this.aLong182;
			}
			return local92;
		}
		while (this.aLong183 > this.aLong182) {
			@Pc(47) long local47 = this.aLong183 - this.aLong182;
			if (local47 > local13) {
				local47 = local13;
			}
			if (local47 < 1000000L) {
				local47 = 1000000L;
			}
			Static48.method934((local47 + 500000L) / 1000000L);
			local13 = this.method4030();
			this.aLong182 += local13;
		}
		this.aLong183 += local18;
		return 1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	@Override
	public void method4027() {
		this.aLong184 = 0L;
		if (this.aLong182 < this.aLong183) {
			this.aLong182 += this.aLong183 - this.aLong182;
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)J")
	private long method4030() {
		@Pc(6) long local6 = System.nanoTime();
		@Pc(12) long local12 = local6 - this.aLong184;
		@Pc(14) long local14 = 0L;
		this.aLong184 = local6;
		if (local12 > 0L && local12 < 5000000000L) {
			this.aLongArray9[this.anInt5143] = local12;
			if (this.anInt5144 < 1) {
				this.anInt5144++;
			}
			this.anInt5143 = (this.anInt5143 + 1) % 10;
		}
		for (@Pc(55) int local55 = 1; local55 <= this.anInt5144; local55++) {
			local14 += this.aLongArray9[(this.anInt5143 + 10 - local55) % 10];
		}
		return local14 / (long) this.anInt5144;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)J")
	@Override
	public long method4029() {
		return this.aLong182;
	}
}
