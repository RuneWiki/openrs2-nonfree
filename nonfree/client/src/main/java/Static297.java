import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
	public static int anInt5869;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "Lclient!sd;")
	public static final Class220 aClass220_35 = new Class220(9, 0, 4, 1);

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_148 = new Class12(86, 5);

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
	public static int anInt5867 = 0;

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "Lclient!qh;")
	public static final Class199 aClass199_156 = new Class199(8);

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "Lclient!wq;")
	public static final Class269 aClass269_45 = new Class269(5, 7);

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_211 = new Class103(66, 3);

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "Z")
	public static boolean aBoolean669 = true;

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
	public static int anInt5870 = -50;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V")
	public static void method4603() {
		@Pc(13) Class1_Sub24 local13 = (Class1_Sub24) Static130.aClass227_19.method4967();
		@Pc(24) boolean local24 = Static371.aClass124_10 != null || Static339.anInt5788 > 0;
		if (local24) {
			Static195.anInt3458 = 1;
		}
		if (Static345.aBoolean678 && Static160.aClass123_1.method2750(81) && Static118.anInt2201 > 2) {
			if (local24) {
				Static252.aClass1_Sub19_2 = (Class1_Sub19) Static202.aClass227_21.aClass1_225.aClass1_262.aClass1_262;
			} else {
				Static35.method513(local13.method2421(), (Class1_Sub19) Static202.aClass227_21.aClass1_225.aClass1_262.aClass1_262, local13.method2418());
			}
		} else if (local24) {
			Static252.aClass1_Sub19_2 = (Class1_Sub19) Static202.aClass227_21.aClass1_225.aClass1_262;
		} else {
			Static35.method513(local13.method2421(), (Class1_Sub19) Static202.aClass227_21.aClass1_225.aClass1_262, local13.method2418());
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg0 && arg3 == arg2 && arg7 == arg6 && arg1 == arg5) {
			Static369.method4905(arg5, arg6, arg4, arg8, arg3);
			return;
		}
		@Pc(39) int local39 = arg4;
		@Pc(41) int local41 = arg3;
		@Pc(45) int local45 = arg4 * 3;
		@Pc(49) int local49 = arg3 * 3;
		@Pc(53) int local53 = arg0 * 3;
		@Pc(57) int local57 = arg2 * 3;
		@Pc(61) int local61 = arg7 * 3;
		@Pc(65) int local65 = arg1 * 3;
		@Pc(76) int local76 = arg6 + local53 - local61 - arg4;
		@Pc(86) int local86 = local57 + arg5 - local65 - arg3;
		@Pc(96) int local96 = local61 + local45 - local53 - local53;
		@Pc(106) int local106 = local49 + local65 - local57 - local57;
		@Pc(110) int local110 = local53 - local45;
		@Pc(115) int local115 = local57 - local49;
		for (@Pc(117) int local117 = 128; local117 <= 4096; local117 += 128) {
			@Pc(125) int local125 = local117 * local117 >> 12;
			@Pc(131) int local131 = local125 * local117 >> 12;
			@Pc(135) int local135 = local131 * local76;
			@Pc(139) int local139 = local131 * local86;
			@Pc(143) int local143 = local96 * local125;
			@Pc(147) int local147 = local125 * local106;
			@Pc(151) int local151 = local117 * local110;
			@Pc(155) int local155 = local115 * local117;
			@Pc(166) int local166 = (local151 + local135 + local143 >> 12) + arg4;
			@Pc(176) int local176 = arg3 + (local155 + local147 + local139 >> 12);
			Static369.method4905(local176, local166, local39, arg8, local41);
			local41 = local176;
			local39 = local166;
		}
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(Z)V")
	public static void method4605() {
		for (@Pc(10) Class4_Sub6 local10 = (Class4_Sub6) Static384.aClass262_12.method5814(); local10 != null; local10 = (Class4_Sub6) Static384.aClass262_12.method5814()) {
			Static250.method3554(local10);
		}
		@Pc(31) int local31;
		@Pc(30) int local30;
		if (Static453.aClass136_Sub1_1.method3522(Static14.anInt293)) {
			local30 = 3;
			local31 = 0;
		} else {
			local30 = Static456.anInt7534;
			local31 = Static456.anInt7534;
		}
		Static55.method974();
		for (@Pc(40) int local40 = local31; local40 <= local30; local40++) {
			Static55.method968();
			Static55.method971(local40);
			Static55.method965(local40);
		}
		Static55.method967();
		Static55.method979();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg4 < 0 || Static296.anInt5187 - 1 <= arg6 || arg4 >= Static206.anInt3607 - 1) {
			return;
		}
		if (Static359.aClass169ArrayArrayArray5 == null) {
			return;
		}
		@Pc(36) Interface8 local36;
		if (arg1 == 0) {
			local36 = (Interface8) Static337.method4524(arg0, arg6, arg4);
			@Pc(42) Interface8 local42 = (Interface8) Static268.method3788(arg0, arg6, arg4);
			if (local36 != null && arg3 != 2) {
				if (local36 instanceof Class25_Sub4_Sub1) {
					((Class25_Sub4_Sub1) local36).aClass190_2.method4231(arg5);
				} else {
					Static222.method3241(arg5, local36.method4623(), arg6, arg1, arg3, arg2, arg0, arg4);
				}
			}
			if (local42 != null) {
				if (!(local42 instanceof Class25_Sub4_Sub1)) {
					Static222.method3241(arg5, local42.method4623(), arg6, arg1, arg3, arg2, arg0, arg4);
					return;
				}
				((Class25_Sub4_Sub1) local42).aClass190_2.method4231(arg5);
				return;
			}
			return;
		}
		if (arg1 == 1) {
			local36 = (Interface8) Static165.method2380(arg0, arg6, arg4);
			if (local36 != null) {
				if (!(local36 instanceof Class25_Sub1_Sub2)) {
					@Pc(113) int local113 = local36.method4623();
					if (arg3 != 4 && arg3 != 5) {
						if (arg3 != 6) {
							if (arg3 == 7) {
								Static222.method3241(arg5, local113, arg6, arg1, 4, (arg2 + 2 & 0x3) + 4, arg0, arg4);
							} else if (arg3 == 8) {
								Static222.method3241(arg5, local113, arg6, arg1, 4, arg2 + 4, arg0, arg4);
								Static222.method3241(arg5, local113, arg6, arg1, 4, (arg2 + 2 & 0x3) + 4, arg0, arg4);
								return;
							}
							return;
						}
						Static222.method3241(arg5, local113, arg6, arg1, 4, arg2 + 4, arg0, arg4);
						return;
					}
					Static222.method3241(arg5, local113, arg6, arg1, 4, arg2, arg0, arg4);
					return;
				}
				((Class25_Sub1_Sub2) local36).aClass190_3.method4231(arg5);
				return;
			}
			return;
		}
		if (arg1 != 2) {
			if (arg1 == 3) {
				local36 = (Interface8) Static231.method3312(arg0, arg6, arg4);
				if (local36 != null) {
					if (local36 instanceof Class25_Sub2_Sub1) {
						((Class25_Sub2_Sub1) local36).aClass190_1.method4231(arg5);
						return;
					}
					Static222.method3241(arg5, local36.method4623(), arg6, arg1, arg3, arg2, arg0, arg4);
					return;
				}
			}
			return;
		}
		local36 = (Interface8) Static364.method2862(arg0, arg6, arg4, mh.class);
		if (local36 == null) {
			return;
		}
		if (arg3 == 11) {
			arg3 = 10;
		}
		if (local36 instanceof Class25_Sub5_Sub4) {
			((Class25_Sub5_Sub4) local36).aClass190_4.method4231(arg5);
			return;
		}
		Static222.method3241(arg5, local36.method4623(), arg6, arg1, arg3, arg2, arg0, arg4);
		return;
	}

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "(B)V")
	public static void method4611() {
		if (Static58.anInt1166 == 5) {
			Static58.anInt1166 = 6;
		}
	}
}
