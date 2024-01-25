import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
	public static int anInt6146;

	@OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
	public static int anInt6136 = 0;

	@OriginalMember(owner = "client!vf", name = "I", descriptor = "Lclient!us;")
	public static final Class234 aClass234_126 = new Class234(92, -1);

	@OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
	public static int anInt6140 = 100;

	@OriginalMember(owner = "client!vf", name = "R", descriptor = "Lclient!ef;")
	public static final Class68 aClass68_15 = new Class68(4, 14);

	@OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
	public static int anInt6147 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!tm;III[Z)V")
	public static void method5440(@OriginalArg(0) Class3_Sub7_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static337.aClass7Array3 == Static25.aClass7Array1) {
			return;
		}
		@Pc(9) int local9 = Static89.aClass7Array4[arg1].method5638(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class7 local22 = Static89.aClass7Array4[local11];
				if (local22 != null) {
					local22.method5646(arg0, arg2, local9 - local22.method5638(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!fr;Z)V")
	public static void method5441(@OriginalArg(0) Class12_Sub3 arg0) {
		arg0.aClass28_Sub1_Sub1_1 = null;
		if (Static328.anInt5561 < 20) {
			Static295.aClass22_7.method286(arg0);
			Static328.anInt5561++;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIILclient!np;)V")
	public static void method5443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class155 arg4) {
		arg4.method4867(arg2, arg0, arg1 + arg2, arg0 + arg3);
		arg4.method4954(arg3, arg0, arg1, arg2, -16777216);
		if (Static130.anInt2452 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static42.anInt539 / (float) Static42.anInt536;
		@Pc(37) int local37 = arg1;
		@Pc(39) int local39 = arg3;
		if (local35 < 1.0F) {
			local39 = (int) ((float) arg1 * local35);
		} else {
			local37 = (int) ((float) arg3 / local35);
		}
		@Pc(65) int local65 = arg0 + (arg3 - local39) / 2;
		@Pc(74) int local74 = arg2 + (arg1 - local37) / 2;
		if (Static348.aClass110_12 == null || Static348.aClass110_12.method5091() != arg1 || Static348.aClass110_12.method5090() != arg3) {
			Static42.method458(Static42.anInt542, Static42.anInt539 + Static42.anInt534, Static42.anInt542 + Static42.anInt536, Static42.anInt534, local74, local65, local74 + local37, local65 + local39);
			Static42.method453(arg4);
			Static348.aClass110_12 = arg4.method4901(local74, local65, local37, local39, false);
		}
		Static348.aClass110_12.method5094(local74, local65);
		@Pc(126) int local126 = Static252.anInt4549 * local37 / Static42.anInt536;
		@Pc(132) int local132 = Static325.anInt5542 * local39 / Static42.anInt539;
		@Pc(141) int local141 = local74 + local37 * Static80.anInt1648 / Static42.anInt536;
		@Pc(154) int local154 = local39 + local65 - local132 - local39 * Static75.anInt1607 / Static42.anInt539;
		@Pc(164) int local164 = -1996554240;
		if (Static340.aClass63_3 == Static121.aClass63_2) {
			local164 = -1996488705;
		}
		arg4.method4896(local141, local154, local126, local132, local164, 1);
		arg4.method4855(local141, local154, local126, local132, local164, 0);
		if (Static179.anInt3177 <= 0) {
			return;
		}
		@Pc(199) int local199;
		if (Static296.anInt5113 <= 50) {
			local199 = Static296.anInt5113 * 5;
		} else {
			local199 = 500 - Static296.anInt5113 * 5;
		}
		for (@Pc(213) Class3_Sub41 local213 = (Class3_Sub41) Static42.aClass138_5.method3051(); local213 != null; local213 = (Class3_Sub41) Static42.aClass138_5.method3050()) {
			@Pc(221) Class196 local221 = Static42.aClass195_2.method4500(local213.anInt6279);
			if (Static270.method5280(local221)) {
				@Pc(250) int local250;
				@Pc(262) int local262;
				if (Static384.anInt6421 == local213.anInt6279) {
					local250 = local74 + local213.anInt6276 * local37 / Static42.anInt536;
					local262 = local39 * (Static42.anInt539 - local213.anInt6277) / Static42.anInt539 + local65;
					arg4.method4954(4, local262 - 2, 4, local250 - 2, local199 << 24 | 0xFFFF00);
				} else if (Static246.anInt4423 != -1 && local221.anInt5001 == Static246.anInt4423) {
					local250 = local37 * local213.anInt6276 / Static42.anInt536 + local74;
					local262 = (Static42.anInt539 - local213.anInt6277) * local39 / Static42.anInt539 + local65;
					arg4.method4954(4, local262 - 2, 4, local250 - 2, local199 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!b;Lclient!b;)V")
	public static void method5446(@OriginalArg(1) Class20 arg0, @OriginalArg(2) Class20 arg1) {
		Static272.aClass20_61 = arg1;
		Static246.aClass20_56 = arg0;
	}
}
