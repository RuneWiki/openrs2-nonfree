import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B[I)Ljava/lang/String;", line = 9)
	public static String method2940(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static336.anInt6757;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(27) Class230 local27 = Static264.aClass233_1.method5886(arg0[local13]);
			if (local27.anInt6442 != -1) {
				@Pc(39) Class13 local39 = (Class13) Class148.aClass98_31.method2614((long) local27.anInt6442);
				if (local39 == null) {
					@Pc(47) Class48 local47 = Static372.method1684(Static29.aClass197_5, local27.anInt6442, 0);
					if (local47 != null) {
						local39 = Static177.aClass19_8.method2893(local47);
						Class148.aClass98_31.method2626((long) local27.anInt6442, local39);
					}
				}
				if (local39 != null) {
					Static125.aClass13Array12[local11] = local39;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 60)
	public static void method2941(@OriginalArg(0) String arg0) {
		if (Static117.aStringArray65 == null) {
			Static139.method2711();
		}
		@Pc(22) String[] local22 = Static187.method3644('\n', arg0);
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			for (@Pc(28) int local28 = Class2_Sub3_Sub36.anInt6904; local28 > 0; local28--) {
				Static117.aStringArray65[local28] = Static117.aStringArray65[local28 - 1];
			}
			Static117.aStringArray65[0] = local22[local24];
			if (Static117.aStringArray65.length - 1 > Class2_Sub3_Sub36.anInt6904) {
				if (Class123_Sub1.anInt3381 > 0) {
					Class123_Sub1.anInt3381++;
				}
				Class2_Sub3_Sub36.anInt6904++;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V", line = 220)
	public static void method2944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class67 local7 = Static307.aClass67ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class67 local28 = Static307.aClass67ArrayArrayArray3[local9][arg0][arg1] = Static307.aClass67ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte10--;
				for (@Pc(40) Class22 local40 = local28.aClass22_2; local40 != null; local40 = local40.aClass22_1) {
					@Pc(44) Class11_Sub5 local44 = local40.aClass11_Sub5_1;
					if (local44.aShort103 == arg0 && local44.aShort101 == arg1) {
						local44.aByte78--;
					}
				}
			}
		}
		if (Static307.aClass67ArrayArrayArray3[0][arg0][arg1] == null) {
			Static307.aClass67ArrayArrayArray3[0][arg0][arg1] = new Class67(0, arg0, arg1);
			Static307.aClass67ArrayArrayArray3[0][arg0][arg1].aByte7 = 1;
		}
		Static307.aClass67ArrayArrayArray3[0][arg0][arg1].aClass67_1 = local7;
		Static307.aClass67ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[B)Z", line = 270)
	public static boolean method2945(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub4 local8 = new Class2_Sub4(arg0);
		@Pc(12) int local12 = local8.method4816();
		if (local12 != 1) {
			return false;
		}
		@Pc(34) boolean local34 = local8.method4816() == 1;
		if (local34) {
			Static294.method5552(local8);
		}
		Static4.method76(local8);
		return true;
	}
}
