import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method2421(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static104.anInt7872 >= 100) {
			Static99.method2135(Static222.aClass152_84.method4002(Static286.anInt5468));
			return;
		}
		@Pc(25) String local25 = Static495.method7439(arg1);
		if (local25 == null) {
			return;
		}
		@Pc(71) String local71;
		for (@Pc(30) int local30 = 0; local30 < Static104.anInt7872; local30++) {
			@Pc(40) String local40 = Static495.method7439(Static60.aStringArray7[local30]);
			if (local40 != null && local40.equals(local25)) {
				Static99.method2135(arg1 + Static222.aClass152_85.method4002(Static286.anInt5468));
				return;
			}
			if (Static437.aStringArray46[local30] != null) {
				local71 = Static495.method7439(Static437.aStringArray46[local30]);
				if (local71 != null && local71.equals(local25)) {
					Static99.method2135(arg1 + Static222.aClass152_85.method4002(Static286.anInt5468));
					return;
				}
			}
		}
		for (@Pc(102) int local102 = 0; local102 < Static241.anInt4921; local102++) {
			local71 = Static495.method7439(Static381.aStringArray42[local102]);
			if (local71 != null && local71.equals(local25)) {
				Static99.method2135(Static222.aClass152_90.method4002(Static286.anInt5468) + arg1 + Static222.aClass152_91.method4002(Static286.anInt5468));
				return;
			}
			if (Static87.aStringArray9[local102] != null) {
				@Pc(146) String local146 = Static495.method7439(Static87.aStringArray9[local102]);
				if (local146 != null && local146.equals(local25)) {
					Static99.method2135(Static222.aClass152_90.method4002(Static286.anInt5468) + arg1 + Static222.aClass152_91.method4002(Static286.anInt5468));
					return;
				}
			}
		}
		if (Static495.method7439(Static350.aClass11_Sub1_Sub1_Sub2_4.aString95).equals(local25)) {
			Static99.method2135(Static222.aClass152_87.method4002(Static286.anInt5468));
		} else {
			Static298.method4854(Static186.aClass181_47);
			Static547.aClass6_Sub26_Sub2_2.method4950(Static392.method6180(arg1) + 1, -81849);
			Static547.aClass6_Sub26_Sub2_2.method4998(arg1);
			Static547.aClass6_Sub26_Sub2_2.method4950(arg0 ? 1 : 0, -81849);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IBII)I")
	public static int method2423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static297.anInt4703 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg1 - Static461.anInt57;
		@Pc(32) int local32 = arg2 - Static461.anInt58;
		for (@Pc(37) Class6_Sub7 local37 = (Class6_Sub7) Static461.aClass211_2.method5183(); local37 != null; local37 = (Class6_Sub7) Static461.aClass211_2.method5177()) {
			if (local37.anInt1365 == arg0) {
				@Pc(46) int local46 = local37.anInt1361;
				@Pc(49) int local49 = local37.anInt1366;
				@Pc(60) int local60 = local49 + Static461.anInt58 | Static461.anInt57 + local46 << 14;
				@Pc(79) int local79 = (local21 - local46) * (local21 - local46) + (local32 - local49) * (-local49 + local32);
				if (local14 < 0 || local16 > local79) {
					local14 = local60;
					local16 = local79;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BII)V")
	public static void method2426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub4_Sub6 local8 = Static68.method1408(6, arg1);
		local8.method3826();
		local8.anInt4403 = arg0;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
	public static void method2427() {
		Static406.aClass245_73.method6076();
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(III)Lclient!as;")
	public static Class11_Sub2 method2428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class224 local7 = Static256.aClass224ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class11_Sub2 local14 = local7.aClass11_Sub2_1;
			local7.aClass11_Sub2_1 = null;
			return local14;
		}
	}
}
