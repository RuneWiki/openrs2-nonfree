import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!ya", name = "h", descriptor = "I")
	public static int anInt5548;

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "I")
	public static int anInt5542 = 0;

	@OriginalMember(owner = "client!ya", name = "l", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_121 = new Class265(12, 3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(CLjava/lang/String;Z)[Ljava/lang/String;")
	public static String[] method4448(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(10) int local10 = Static257.method3884(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg0 != arg1.charAt(local30); local30++) {
			}
			local15[local22++] = arg1.substring(local24, local30);
			local24 = local30 + 1;
		}
		local15[local10] = arg1.substring(local24);
		return local15;
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!gg;")
	public static Class3_Sub2 method4456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class106 local7 = Static440.aClass106ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class4 local14 = local7.aClass4_3; local14 != null; local14 = local14.aClass4_1) {
			@Pc(18) Class3_Sub2 local18 = local14.aClass3_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort85 == arg1 && local18.aShort86 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(IIIII)V")
	public static void method4473(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class2_Sub24 local15 = (Class2_Sub24) Static72.aClass14_7.method309(); local15 != null; local15 = (Class2_Sub24) Static72.aClass14_7.method311()) {
			Static3.method128(arg1, arg0, arg2, local15, arg3);
		}
		for (@Pc(36) Class2_Sub24 local36 = (Class2_Sub24) Static446.aClass14_49.method309(); local36 != null; local36 = (Class2_Sub24) Static446.aClass14_49.method311()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class156 local45 = local36.aClass3_Sub2_Sub1_Sub1_1.method4925();
			if (local36.aClass3_Sub2_Sub1_Sub1_1.aBoolean429) {
				local40 = 0;
			} else if (local36.aClass3_Sub2_Sub1_Sub1_1.anInt6177 == local45.anInt4438 || local45.anInt4469 == local36.aClass3_Sub2_Sub1_Sub1_1.anInt6177 || local45.anInt4441 == local36.aClass3_Sub2_Sub1_Sub1_1.anInt6177 || local36.aClass3_Sub2_Sub1_Sub1_1.anInt6177 == local45.anInt4433) {
				local40 = 2;
			} else if (local36.aClass3_Sub2_Sub1_Sub1_1.anInt6177 == local45.anInt4454 || local45.anInt4452 == local36.aClass3_Sub2_Sub1_Sub1_1.anInt6177 || local36.aClass3_Sub2_Sub1_Sub1_1.anInt6177 == local45.anInt4449 || local45.anInt4470 == local36.aClass3_Sub2_Sub1_Sub1_1.anInt6177) {
				local40 = 3;
			}
			if (local40 != local36.anInt4288) {
				@Pc(124) int local124 = Static283.method1318(local36.aClass3_Sub2_Sub1_Sub1_1);
				if (local124 != local36.anInt4286) {
					if (local36.aClass2_Sub3_Sub3_2 != null) {
						Static260.aClass2_Sub3_Sub1_2.method1826(local36.aClass2_Sub3_Sub3_2);
						local36.aClass2_Sub3_Sub3_2 = null;
					}
					local36.anInt4286 = local124;
				}
				local36.anInt4288 = local40;
			}
			local36.anInt4285 = local36.aClass3_Sub2_Sub1_Sub1_1.anInt6119;
			local36.anInt4277 = local36.aClass3_Sub2_Sub1_Sub1_1.anInt6119 + (local36.aClass3_Sub2_Sub1_Sub1_1.method4935() << 6);
			local36.anInt4276 = local36.aClass3_Sub2_Sub1_Sub1_1.anInt6121;
			local36.anInt4291 = local36.aClass3_Sub2_Sub1_Sub1_1.anInt6121 + (local36.aClass3_Sub2_Sub1_Sub1_1.method4935() << 6);
			Static3.method128(arg1, arg0, arg2, local36, arg3);
		}
		for (@Pc(199) Class2_Sub24 local199 = (Class2_Sub24) Static216.aClass163_38.method3771(); local199 != null; local199 = (Class2_Sub24) Static216.aClass163_38.method3770()) {
			@Pc(203) byte local203 = 1;
			@Pc(208) Class156 local208 = local199.aClass3_Sub2_Sub1_Sub2_5.method4925();
			if (local199.aClass3_Sub2_Sub1_Sub2_5.aBoolean429) {
				local203 = 0;
			} else if (local199.aClass3_Sub2_Sub1_Sub2_5.anInt6177 == local208.anInt4438 || local208.anInt4469 == local199.aClass3_Sub2_Sub1_Sub2_5.anInt6177 || local208.anInt4441 == local199.aClass3_Sub2_Sub1_Sub2_5.anInt6177 || local208.anInt4433 == local199.aClass3_Sub2_Sub1_Sub2_5.anInt6177) {
				local203 = 2;
			} else if (local199.aClass3_Sub2_Sub1_Sub2_5.anInt6177 == local208.anInt4454 || local208.anInt4452 == local199.aClass3_Sub2_Sub1_Sub2_5.anInt6177 || local208.anInt4449 == local199.aClass3_Sub2_Sub1_Sub2_5.anInt6177 || local208.anInt4470 == local199.aClass3_Sub2_Sub1_Sub2_5.anInt6177) {
				local203 = 3;
			}
			if (local199.anInt4288 != local203) {
				@Pc(303) int local303 = Static200.method4291(local199.aClass3_Sub2_Sub1_Sub2_5);
				if (local303 != local199.anInt4286) {
					if (local199.aClass2_Sub3_Sub3_2 != null) {
						Static260.aClass2_Sub3_Sub1_2.method1826(local199.aClass2_Sub3_Sub3_2);
						local199.aClass2_Sub3_Sub3_2 = null;
					}
					local199.anInt4286 = local303;
				}
				local199.anInt4288 = local203;
			}
			local199.anInt4285 = local199.aClass3_Sub2_Sub1_Sub2_5.anInt6119;
			local199.anInt4277 = local199.aClass3_Sub2_Sub1_Sub2_5.anInt6119 + (local199.aClass3_Sub2_Sub1_Sub2_5.method4935() << 6);
			local199.anInt4276 = local199.aClass3_Sub2_Sub1_Sub2_5.anInt6121;
			local199.anInt4291 = local199.aClass3_Sub2_Sub1_Sub2_5.anInt6121 + (local199.aClass3_Sub2_Sub1_Sub2_5.method4935() << 6);
			Static3.method128(arg1, arg0, arg2, local199, arg3);
		}
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(ILclient!dr;Lclient!ga;Ljava/awt/Canvas;BI)Lclient!ya;")
	public static synchronized Class49 method4474(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Canvas arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
			if (!Static192.aBooleanArray17[local17]) {
				local7 = local17;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(53) Class49 local53;
		if (arg0 == 0) {
			local53 = Static114.method2039(local7, arg2, arg3);
		} else if (arg0 == 1) {
			local53 = Static301.method4323(arg2, arg4, arg1, local7, arg3);
		} else if (arg0 == 2) {
			local53 = Static220.method3454(arg2, arg3, arg1, local7);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static192.aBooleanArray17[local7] = true;
		return local53;
	}
}
