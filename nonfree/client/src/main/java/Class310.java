import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class310 implements Interface8 {

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "Lclient!uj;")
	private final Class291 aClass291_3 = new Class291(256);

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "Lclient!gp;")
	private final Class117 aClass117_224;

	@OriginalMember(owner = "client!wba", name = "m", descriptor = "Lclient!gp;")
	private final Class117 aClass117_225;

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
	private final int anInt8931;

	@OriginalMember(owner = "client!wba", name = "l", descriptor = "[Lclient!sm;")
	private final Class271[] aClass271Array1;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!gp;Lclient!gp;Lclient!gp;)V")
	public Class310(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class117 arg2) {
		this.aClass117_224 = arg1;
		this.aClass117_225 = arg2;
		@Pc(24) Class5_Sub3 local24 = new Class5_Sub3(arg0.method2962(0, 0));
		this.anInt8931 = local24.method4227();
		this.aClass271Array1 = new Class271[this.anInt8931];
		for (@Pc(36) int local36 = 0; local36 < this.anInt8931; local36++) {
			if (local24.method4220() == 1) {
				this.aClass271Array1[local36] = new Class271();
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt8931; local57++) {
			if (this.aClass271Array1[local57] != null) {
				this.aClass271Array1[local57].aBoolean566 = local24.method4220() == 0;
			}
		}
		for (@Pc(86) int local86 = 0; local86 < this.anInt8931; local86++) {
			if (this.aClass271Array1[local86] != null) {
				this.aClass271Array1[local86].aBoolean561 = local24.method4220() == 1;
			}
		}
		for (@Pc(115) int local115 = 0; local115 < this.anInt8931; local115++) {
			if (this.aClass271Array1[local115] != null) {
				this.aClass271Array1[local115].aBoolean558 = local24.method4220() == 1;
			}
		}
		for (@Pc(144) int local144 = 0; local144 < this.anInt8931; local144++) {
			if (this.aClass271Array1[local144] != null) {
				this.aClass271Array1[local144].aBoolean557 = local24.method4220() == 1;
			}
		}
		for (@Pc(173) int local173 = 0; local173 < this.anInt8931; local173++) {
			if (this.aClass271Array1[local173] != null) {
				this.aClass271Array1[local173].aByte83 = local24.method4196();
			}
		}
		for (@Pc(199) int local199 = 0; local199 < this.anInt8931; local199++) {
			if (this.aClass271Array1[local199] != null) {
				this.aClass271Array1[local199].aByte80 = local24.method4196();
			}
		}
		for (@Pc(221) int local221 = 0; local221 < this.anInt8931; local221++) {
			if (this.aClass271Array1[local221] != null) {
				this.aClass271Array1[local221].aByte78 = local24.method4196();
			}
		}
		for (@Pc(247) int local247 = 0; local247 < this.anInt8931; local247++) {
			if (this.aClass271Array1[local247] != null) {
				this.aClass271Array1[local247].aByte79 = local24.method4196();
			}
		}
		for (@Pc(273) int local273 = 0; local273 < this.anInt8931; local273++) {
			if (this.aClass271Array1[local273] != null) {
				this.aClass271Array1[local273].aShort100 = (short) local24.method4227();
			}
		}
		for (@Pc(296) int local296 = 0; local296 < this.anInt8931; local296++) {
			if (this.aClass271Array1[local296] != null) {
				this.aClass271Array1[local296].aByte82 = local24.method4196();
			}
		}
		for (@Pc(318) int local318 = 0; local318 < this.anInt8931; local318++) {
			if (this.aClass271Array1[local318] != null) {
				this.aClass271Array1[local318].aByte81 = local24.method4196();
			}
		}
		for (@Pc(344) int local344 = 0; local344 < this.anInt8931; local344++) {
			if (this.aClass271Array1[local344] != null) {
				this.aClass271Array1[local344].aBoolean564 = local24.method4220() == 1;
			}
		}
		for (@Pc(375) int local375 = 0; local375 < this.anInt8931; local375++) {
			if (this.aClass271Array1[local375] != null) {
				this.aClass271Array1[local375].aBoolean560 = local24.method4220() == 1;
			}
		}
		for (@Pc(406) int local406 = 0; local406 < this.anInt8931; local406++) {
			if (this.aClass271Array1[local406] != null) {
				this.aClass271Array1[local406].aByte77 = local24.method4196();
			}
		}
		for (@Pc(428) int local428 = 0; local428 < this.anInt8931; local428++) {
			if (this.aClass271Array1[local428] != null) {
				this.aClass271Array1[local428].aBoolean559 = local24.method4220() == 1;
			}
		}
		for (@Pc(455) int local455 = 0; local455 < this.anInt8931; local455++) {
			if (this.aClass271Array1[local455] != null) {
				this.aClass271Array1[local455].aBoolean563 = local24.method4220() == 1;
			}
		}
		for (@Pc(486) int local486 = 0; local486 < this.anInt8931; local486++) {
			if (this.aClass271Array1[local486] != null) {
				this.aClass271Array1[local486].aBoolean565 = local24.method4220() == 1;
			}
		}
		for (@Pc(517) int local517 = 0; local517 < this.anInt8931; local517++) {
			if (this.aClass271Array1[local517] != null) {
				this.aClass271Array1[local517].anInt7867 = local24.method4220();
			}
		}
		for (@Pc(539) int local539 = 0; local539 < this.anInt8931; local539++) {
			if (this.aClass271Array1[local539] != null) {
				this.aClass271Array1[local539].anInt7866 = local24.method4230();
			}
		}
		for (@Pc(561) int local561 = 0; local561 < this.anInt8931; local561++) {
			if (this.aClass271Array1[local561] != null) {
				this.aClass271Array1[local561].aBoolean562 = local24.method4220() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(FIZIZI)[I")
	@Override
	public int[] method7232(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method7239(arg2).method6580((double) arg0, arg1, this, this.aClass271Array1[arg2].aBoolean560, this.aClass117_225, arg3);
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(II)Lclient!tg;")
	private Class5_Sub2_Sub17 method7239(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub2 local10 = this.aClass291_3.method6850((long) arg0);
		if (local10 != null) {
			return (Class5_Sub2_Sub17) local10;
		}
		@Pc(21) byte[] local21 = this.aClass117_224.method2964(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class5_Sub2_Sub17 local33 = new Class5_Sub2_Sub17(new Class5_Sub3(local21));
			this.aClass291_3.method6851((long) arg0, local33);
			return local33;
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BI)Lclient!sm;")
	@Override
	public Class271 method7237(@OriginalArg(1) int arg0) {
		return this.aClass271Array1[arg0];
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIZIFB)[I")
	@Override
	public int[] method7234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		return this.method7239(arg3).method6582((double) arg4, arg1, arg0, arg2, this.aClass117_225, this, this.aClass271Array1[arg3].aBoolean560);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method7236(@OriginalArg(1) int arg0) {
		@Pc(20) Class5_Sub2_Sub17 local20 = this.method7239(arg0);
		return local20 != null && local20.method6584(this, this.aClass117_225);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)I")
	@Override
	public int method7235() {
		return this.anInt8931;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(FIIIZI)[F")
	@Override
	public float[] method7233(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		return this.method7239(arg2).method6585(this, this.aClass117_225, this.aClass271Array1[arg2].aBoolean560, arg3, arg1);
	}
}
