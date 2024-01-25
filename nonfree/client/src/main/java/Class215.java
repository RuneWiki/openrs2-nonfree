import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class215 implements Interface6 {

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "Lclient!on;")
	private final Class154 aClass154_10 = new Class154(256);

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "Lclient!rk;")
	private final Class180 aClass180_99;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "Lclient!rk;")
	private final Class180 aClass180_100;

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "[Lclient!b;")
	private final Class18[] aClass18Array1;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!rk;Lclient!rk;Lclient!rk;)V")
	public Class215(@OriginalArg(0) Class180 arg0, @OriginalArg(1) Class180 arg1, @OriginalArg(2) Class180 arg2) {
		this.aClass180_99 = arg2;
		this.aClass180_100 = arg1;
		@Pc(24) Class7_Sub3 local24 = new Class7_Sub3(arg0.method4560(0, 0));
		@Pc(28) int local28 = local24.method2764();
		this.aClass18Array1 = new Class18[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method2772() == 1) {
				this.aClass18Array1[local34] = new Class18();
			}
		}
		for (@Pc(54) int local54 = 0; local54 < local28; local54++) {
			if (this.aClass18Array1[local54] != null) {
				this.aClass18Array1[local54].aBoolean16 = local24.method2772() == 0;
			}
		}
		for (@Pc(82) int local82 = 0; local82 < local28; local82++) {
			if (this.aClass18Array1[local82] != null) {
				this.aClass18Array1[local82].aBoolean13 = local24.method2772() == 1;
			}
		}
		for (@Pc(112) int local112 = 0; local112 < local28; local112++) {
			if (this.aClass18Array1[local112] != null) {
				this.aClass18Array1[local112].aBoolean15 = local24.method2772() == 1;
			}
		}
		for (@Pc(144) int local144 = 0; local144 < local28; local144++) {
			if (this.aClass18Array1[local144] != null) {
				this.aClass18Array1[local144].aBoolean14 = local24.method2772() == 1;
			}
		}
		for (@Pc(176) int local176 = 0; local176 < local28; local176++) {
			if (this.aClass18Array1[local176] != null) {
				this.aClass18Array1[local176].aByte2 = local24.method2779();
			}
		}
		for (@Pc(197) int local197 = 0; local197 < local28; local197++) {
			if (this.aClass18Array1[local197] != null) {
				this.aClass18Array1[local197].aByte7 = local24.method2779();
			}
		}
		for (@Pc(222) int local222 = 0; local222 < local28; local222++) {
			if (this.aClass18Array1[local222] != null) {
				this.aClass18Array1[local222].aByte5 = local24.method2779();
			}
		}
		for (@Pc(247) int local247 = 0; local247 < local28; local247++) {
			if (this.aClass18Array1[local247] != null) {
				this.aClass18Array1[local247].aByte6 = local24.method2779();
			}
		}
		for (@Pc(268) int local268 = 0; local268 < local28; local268++) {
			if (this.aClass18Array1[local268] != null) {
				this.aClass18Array1[local268].aShort7 = (short) local24.method2764();
			}
		}
		for (@Pc(294) int local294 = 0; local294 < local28; local294++) {
			if (this.aClass18Array1[local294] != null) {
				this.aClass18Array1[local294].aByte3 = local24.method2779();
			}
		}
		for (@Pc(315) int local315 = 0; local315 < local28; local315++) {
			if (this.aClass18Array1[local315] != null) {
				this.aClass18Array1[local315].aByte4 = local24.method2779();
			}
		}
		for (@Pc(340) int local340 = 0; local340 < local28; local340++) {
			if (this.aClass18Array1[local340] != null) {
				this.aClass18Array1[local340].aBoolean17 = local24.method2772() == 1;
			}
		}
		for (@Pc(370) int local370 = 0; local370 < local28; local370++) {
			if (this.aClass18Array1[local370] != null) {
				this.aClass18Array1[local370].aBoolean18 = local24.method2772() == 1;
			}
		}
		for (@Pc(400) int local400 = 0; local400 < local28; local400++) {
			if (this.aClass18Array1[local400] != null) {
				this.aClass18Array1[local400].aByte1 = local24.method2779();
			}
		}
		for (@Pc(425) int local425 = 0; local425 < local28; local425++) {
			if (this.aClass18Array1[local425] != null) {
				this.aClass18Array1[local425].aBoolean20 = local24.method2772() == 1;
			}
		}
		for (@Pc(453) int local453 = 0; local453 < local28; local453++) {
			if (this.aClass18Array1[local453] != null) {
				this.aClass18Array1[local453].aBoolean21 = local24.method2772() == 1;
			}
		}
		for (@Pc(481) int local481 = 0; local481 < local28; local481++) {
			if (this.aClass18Array1[local481] != null) {
				this.aClass18Array1[local481].aBoolean19 = local24.method2772() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(FIIZII)[I")
	@Override
	public int[] method5613(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method5623(arg1).method5129(arg2, (double) arg0, arg3, this, this.aClass180_99, this.aClass18Array1[arg1].aBoolean18);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZIIBF)[F")
	@Override
	public float[] method5612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3) {
		return this.method5623(arg2).method5127(arg1, arg0, this.aClass180_99, this, this.aClass18Array1[arg2].aBoolean18);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5615(@OriginalArg(0) int arg0) {
		@Pc(14) Class7_Sub1_Sub18 local14 = this.method5623(arg0);
		return local14 != null && local14.method5128(this, this.aClass180_99);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)Lclient!b;")
	@Override
	public Class18 method5614(@OriginalArg(1) int arg0) {
		return this.aClass18Array1[arg0];
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(BI)Lclient!ue;")
	private Class7_Sub1_Sub18 method5623(@OriginalArg(1) int arg0) {
		@Pc(10) Class7_Sub1 local10 = this.aClass154_10.method4079((long) arg0);
		if (local10 != null) {
			return (Class7_Sub1_Sub18) local10;
		}
		@Pc(29) byte[] local29 = this.aClass180_100.method4583(arg0);
		if (local29 == null) {
			return null;
		} else {
			@Pc(41) Class7_Sub1_Sub18 local41 = new Class7_Sub1_Sub18(new Class7_Sub3(local29));
			this.aClass154_10.method4078(local41, (long) arg0);
			return local41;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIZF)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) float arg4) {
		return this.method5623(arg2).method5135(arg3, (double) arg4, this.aClass18Array1[arg2].aBoolean18, this.aClass180_99, this, arg1, arg0);
	}
}
