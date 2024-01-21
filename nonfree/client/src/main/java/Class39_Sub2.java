import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
	private int anInt3225;

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
	private int anInt3231;

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "J")
	private long aLong101;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
	private int anInt3232;

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
	private int anInt3235;

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class39_Sub2() {
		this.method2141();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	@Override
	public void method2141() {
		this.anInt3231 = 0;
		this.anInt3235 = 1;
		this.anInt3225 = 256;
		this.aLong101 = Static102.method1996();
		for (@Pc(25) int local25 = 0; local25 < 10; local25++) {
			this.aLongArray6[local25] = this.aLong101;
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
	@Override
	public void method2143() {
		for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
			this.aLongArray6[local15] = 0L;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)I")
	@Override
	public int method2145(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt3225;
		this.anInt3225 = 300;
		@Pc(14) int local14 = this.anInt3235;
		this.anInt3235 = 1;
		this.aLong101 = Static102.method1996();
		if (this.aLongArray6[this.anInt3232] == 0L) {
			this.anInt3225 = local4;
			this.anInt3235 = local14;
		} else if (this.aLongArray6[this.anInt3232] < this.aLong101) {
			this.anInt3225 = (int) ((long) (arg0 * 2560) / (this.aLong101 - this.aLongArray6[this.anInt3232]));
		}
		if (this.anInt3225 < 25) {
			this.anInt3225 = 25;
		}
		if (this.anInt3225 > 256) {
			this.anInt3225 = 256;
			this.anInt3235 = (int) ((long) arg0 - (this.aLong101 - this.aLongArray6[this.anInt3232]) / 10L);
		}
		if (this.anInt3235 > arg0) {
			this.anInt3235 = arg0;
		}
		this.aLongArray6[this.anInt3232] = this.aLong101;
		this.anInt3232 = (this.anInt3232 + 1) % 10;
		@Pc(133) int local133;
		if (this.anInt3235 > 1) {
			for (local133 = 0; local133 < 10; local133++) {
				if (this.aLongArray6[local133] != 0L) {
					this.aLongArray6[local133] += this.anInt3235;
				}
			}
		}
		if (arg1 > this.anInt3235) {
			this.anInt3235 = arg1;
		}
		local133 = 0;
		Static126.method2277((long) this.anInt3235);
		while (this.anInt3231 < 256) {
			local133++;
			this.anInt3231 += this.anInt3225;
		}
		this.anInt3231 &= 0xFF;
		return local133;
	}
}
