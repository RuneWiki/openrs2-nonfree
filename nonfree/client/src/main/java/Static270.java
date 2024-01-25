import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!js", name = "b", descriptor = "I")
	public static int anInt5361;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "I")
	public static int anInt5360 = 0;

	@OriginalMember(owner = "client!js", name = "c", descriptor = "[Lclient!ao;")
	public static final Class21[] aClass21Array1 = new Class21[14];

	@OriginalMember(owner = "client!js", name = "d", descriptor = "Z")
	public static boolean aBoolean364 = false;

	@OriginalMember(owner = "client!js", name = "f", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_90 = new Class268(39, 8);

	@OriginalMember(owner = "client!js", name = "g", descriptor = "D")
	public static double aDouble11 = -1.0D;

	@OriginalMember(owner = "client!js", name = "h", descriptor = "I")
	public static final int anInt5363 = -1;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIILclient!ma;Lclient!ma;)V")
	public static void method4794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20_Sub2_Sub1 arg3, @OriginalArg(4) Class20_Sub2_Sub1 arg4) {
		@Pc(4) Class97 local4 = Static635.method8388(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass20_Sub2_Sub1_1 = arg3;
		local4.aClass20_Sub2_Sub1_2 = arg4;
		@Pc(19) int local19 = Static195.aClass199Array1 == Static510.aClass199Array3 ? 1 : 0;
		if (!arg3.method9021()) {
			arg3.aClass20_Sub2_23 = Static411.aClass20_Sub2Array12[local19];
			Static411.aClass20_Sub2Array12[local19] = arg3;
		} else if (arg3.method9023()) {
			arg3.aClass20_Sub2_23 = Static311.aClass20_Sub2Array11[local19];
			Static311.aClass20_Sub2Array11[local19] = arg3;
		} else {
			arg3.aClass20_Sub2_23 = Static158.aClass20_Sub2Array7[local19];
			Static158.aClass20_Sub2Array7[local19] = arg3;
			Static133.aBoolean183 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method9021()) {
			if (arg4.method9023()) {
				arg4.aClass20_Sub2_23 = Static311.aClass20_Sub2Array11[local19];
				Static311.aClass20_Sub2Array11[local19] = arg4;
				return;
			}
			arg4.aClass20_Sub2_23 = Static158.aClass20_Sub2Array7[local19];
			Static158.aClass20_Sub2Array7[local19] = arg4;
			Static133.aBoolean183 = true;
			return;
		}
		arg4.aClass20_Sub2_23 = Static411.aClass20_Sub2Array12[local19];
		Static411.aClass20_Sub2Array12[local19] = arg4;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IZILclient!ha;)Lclient!ci;")
	public static Class52 method4795(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class100 arg2) {
		if (arg0 == -1) {
			return null;
		}
		if (Static369.anIntArray417 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static369.anIntArray417.length; local14++) {
				if (Static369.anIntArray417[local14] == arg0) {
					return Static171.aClass52Array1[local14];
				}
			}
		}
		@Pc(37) Class52 local37 = (Class52) Static204.aClass166_21.method4805((long) arg0);
		if (local37 != null) {
			if (arg1 && local37.aClass133_13 == null) {
				@Pc(49) Class133 local49 = Static308.method5208(arg0, Static409.aClass353_74);
				if (local49 == null) {
					return null;
				}
				local37.aClass133_13 = local49;
			}
			return local37;
		}
		@Pc(67) Class98[] local67 = Static651.method2403(Static375.aClass353_61, arg0);
		if (local67 == null) {
			return null;
		}
		@Pc(76) Class133 local76 = Static308.method5208(arg0, Static409.aClass353_74);
		if (local76 == null) {
			return null;
		}
		if (arg1) {
			local37 = new Class52(arg2.method8808(local76, local67), local76);
		} else {
			local37 = new Class52(arg2.method8808(local76, local67));
		}
		Static204.aClass166_21.method4803(local37, (long) arg0);
		return local37;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/String;ZII)Z")
	public static boolean method4796(@OriginalArg(0) String arg0) {
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local31 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(73) int local73;
			if (local46 >= '0' && local46 <= '9') {
				local73 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local73 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local73 = local46 - 'W';
			} else {
				return false;
			}
			if (local73 >= 10) {
				return false;
			}
			if (local31) {
				local73 = -local73;
			}
			@Pc(119) int local119 = local73 + local35 * 10;
			if (local119 / 10 != local35) {
				return false;
			}
			local35 = local119;
			local33 = true;
		}
		return local33;
	}
}
