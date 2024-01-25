import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "J")
	private long aLong28 = 0L;

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
	private int anInt620 = 1;

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "J")
	private long aLong30 = 0L;

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
	private int anInt621 = 0;

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "J")
	private long aLong29 = 0L;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)J")
	@Override
	public long method5212() {
		return this.aLong28;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)J")
	private long method521() {
		@Pc(9) long local9 = Static21.method458() * 1000000L;
		@Pc(15) long local15 = local9 - this.aLong30;
		this.aLong30 = local9;
		if (local15 > -5000000000L && local15 < 5000000000L) {
			this.aLongArray1[this.anInt621] = local15;
			if (this.anInt620 < 10) {
				this.anInt620++;
			}
			this.anInt621 = (this.anInt621 + 1) % 10;
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt620; local56++) {
			local54 += this.aLongArray1[(this.anInt621 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt620;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)I")
	@Override
	public int method5215(@OriginalArg(0) int arg0) {
		this.aLong28 += this.method521();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong28 < this.aLong29) {
			Static81.method1477((this.aLong29 - this.aLong28) / 1000000L);
			this.aLong30 += this.aLong29 - this.aLong28;
			this.aLong28 += this.aLong29 - this.aLong28;
			this.aLong29 += local18;
			return 1;
		}
		@Pc(70) int local70 = 0;
		do {
			local70++;
			this.aLong29 += local18;
		} while (local70 < 10 && this.aLong28 > this.aLong29);
		if (this.aLong29 < this.aLong28) {
			this.aLong29 = this.aLong28;
		}
		return local70;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	@Override
	public void method5216() {
		this.aLong30 = 0L;
		if (this.aLong29 > this.aLong28) {
			this.aLong28 += this.aLong29 - this.aLong28;
		}
	}
}
