import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class135 {

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "[I")
	public int[] anIntArray525;

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "[I")
	public int[] anIntArray526;

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "[I")
	public int[] anIntArray527;

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "[I")
	public int[] anIntArray528;

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
	public int anInt3835;

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
	public int anInt3836;

	@OriginalMember(owner = "client!lr", name = "q", descriptor = "Lclient!ci;")
	public Class40 aClass40_1;

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "[I")
	public int[] anIntArray529;

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
	public int anInt3837;

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "[I")
	public int[] anIntArray530;

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "[Lclient!ci;")
	public Class40[] aClass40Array1;

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
	public final int anInt3832;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "([BI)V")
	public Class135(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3832 = Static281.method4416(arg0, arg0.length);
		if (this.anInt3832 != arg1) {
			throw new RuntimeException();
		}
		this.method3465(arg0);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[B)V")
	private void method3465(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class7_Sub3 local12 = new Class7_Sub3(Static14.method203(arg0));
		@Pc(16) int local16 = local12.method2772();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt3836 = local12.method2767();
		} else {
			this.anInt3836 = 0;
		}
		@Pc(47) int local47 = local12.method2772();
		this.anInt3835 = local12.method2764();
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = -1;
		this.anIntArray529 = new int[this.anInt3835];
		for (@Pc(67) int local67 = 0; local67 < this.anInt3835; local67++) {
			this.anIntArray529[local67] = local54 += local12.method2764();
			if (local56 < this.anIntArray529[local67]) {
				local56 = this.anIntArray529[local67];
			}
		}
		this.anInt3837 = local56 + 1;
		this.anIntArray525 = new int[this.anInt3837];
		this.anIntArray530 = new int[this.anInt3837];
		this.anIntArray527 = new int[this.anInt3837];
		this.anIntArray528 = new int[this.anInt3837];
		this.anIntArrayArray28 = new int[this.anInt3837][];
		@Pc(135) int local135;
		@Pc(153) int local153;
		if (local47 != 0) {
			this.anIntArray526 = new int[this.anInt3837];
			for (local135 = 0; local135 < this.anInt3837; local135++) {
				this.anIntArray526[local135] = -1;
			}
			for (local153 = 0; local153 < this.anInt3835; local153++) {
				this.anIntArray526[this.anIntArray529[local153]] = local12.method2767();
			}
			this.aClass40_1 = new Class40(this.anIntArray526);
		}
		for (local135 = 0; local135 < this.anInt3835; local135++) {
			this.anIntArray528[this.anIntArray529[local135]] = local12.method2767();
		}
		for (local153 = 0; local153 < this.anInt3835; local153++) {
			this.anIntArray527[this.anIntArray529[local153]] = local12.method2767();
		}
		for (@Pc(225) int local225 = 0; local225 < this.anInt3835; local225++) {
			this.anIntArray525[this.anIntArray529[local225]] = local12.method2764();
		}
		@Pc(253) int local253;
		@Pc(258) int local258;
		@Pc(262) int local262;
		@Pc(270) int local270;
		@Pc(287) int local287;
		for (@Pc(246) int local246 = 0; local246 < this.anInt3835; local246++) {
			local253 = this.anIntArray529[local246];
			local258 = this.anIntArray525[local253];
			local54 = 0;
			local262 = -1;
			this.anIntArrayArray28[local253] = new int[local258];
			for (local270 = 0; local270 < local258; local270++) {
				local287 = this.anIntArrayArray28[local253][local270] = local54 += local12.method2764();
				if (local262 < local287) {
					local262 = local287;
				}
			}
			this.anIntArray530[local253] = local262 + 1;
			if (local258 == local262 + 1) {
				this.anIntArrayArray28[local253] = null;
			}
		}
		if (local47 == 0) {
			return;
		}
		this.aClass40Array1 = new Class40[local56 + 1];
		this.anIntArrayArray29 = new int[local56 + 1][];
		for (local253 = 0; local253 < this.anInt3835; local253++) {
			local258 = this.anIntArray529[local253];
			local262 = this.anIntArray525[local258];
			this.anIntArrayArray29[local258] = new int[this.anIntArray530[local258]];
			for (local270 = 0; local270 < this.anIntArray530[local258]; local270++) {
				this.anIntArrayArray29[local258][local270] = -1;
			}
			for (local287 = 0; local287 < local262; local287++) {
				@Pc(405) int local405;
				if (this.anIntArrayArray28[local258] == null) {
					local405 = local287;
				} else {
					local405 = this.anIntArrayArray28[local258][local287];
				}
				this.anIntArrayArray29[local258][local405] = local12.method2767();
			}
			this.aClass40Array1[local258] = new Class40(this.anIntArrayArray29[local258]);
		}
	}
}
