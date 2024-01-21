import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
	private int anInt3947;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "[J")
	private final long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
	private int anInt3942 = 0;

	@OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
	private int anInt3951 = 1;

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
	private int anInt3945 = 256;

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "J")
	private long aLong133 = Static176.method3161();

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public Class9_Sub2() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray9[local22] = this.aLong133;
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
	@Override
	public void method3007() {
		for (@Pc(13) int local13 = 0; local13 < 10; local13++) {
			this.aLongArray9[local13] = 0L;
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(III)I")
	@Override
	public int method3010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt3951;
		@Pc(11) int local11 = this.anInt3945;
		this.anInt3951 = 1;
		this.anInt3945 = 300;
		this.aLong133 = Static176.method3161();
		if (this.aLongArray9[this.anInt3947] == 0L) {
			this.anInt3951 = local8;
			this.anInt3945 = local11;
		} else if (this.aLongArray9[this.anInt3947] < this.aLong133) {
			this.anInt3945 = (int) ((long) (arg0 * 2560) / (this.aLong133 - this.aLongArray9[this.anInt3947]));
		}
		if (this.anInt3945 < 25) {
			this.anInt3945 = 25;
		}
		if (this.anInt3945 > 256) {
			this.anInt3945 = 256;
			this.anInt3951 = (int) ((long) arg0 - (this.aLong133 - this.aLongArray9[this.anInt3947]) / 10L);
		}
		if (this.anInt3951 > arg0) {
			this.anInt3951 = arg0;
		}
		this.aLongArray9[this.anInt3947] = this.aLong133;
		this.anInt3947 = (this.anInt3947 + 1) % 10;
		@Pc(132) int local132;
		if (this.anInt3951 > 1) {
			for (local132 = 0; local132 < 10; local132++) {
				if (this.aLongArray9[local132] != 0L) {
					this.aLongArray9[local132] -= -((long) this.anInt3951);
				}
			}
		}
		if (this.anInt3951 < arg1) {
			this.anInt3951 = arg1;
		}
		Static65.method1574((long) this.anInt3951);
		local132 = 0;
		while (this.anInt3942 < 256) {
			local132++;
			this.anInt3942 += this.anInt3945;
		}
		this.anInt3942 &= 0xFF;
		return local132;
	}
}
