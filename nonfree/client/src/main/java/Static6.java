import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
	public static int anInt2264;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "[Lclient!ab;")
	public static Class3[] aClass3Array4;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString74 = null;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString75 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
	public static int anInt2268 = -1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(JI)V")
	public static void method1714(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < Static253.anInt5514; local16++) {
			if (Static3.aLongArray1[local16] == arg0) {
				Static253.anInt5514--;
				for (@Pc(35) int local35 = local16; local35 < Static253.anInt5514; local35++) {
					Static3.aLongArray1[local35] = Static3.aLongArray1[local35 + 1];
					Static271.aStringArray35[local35] = Static271.aStringArray35[local35 + 1];
					Static56.aBooleanArray4[local35] = Static56.aBooleanArray4[local35 + 1];
				}
				Static254.anInt5408 = Static27.anInt754;
				Static81.aClass1_Sub16_Sub1_1.method2676(109);
				Static81.aClass1_Sub16_Sub1_1.method2631(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIILclient!h;JLclient!h;Lclient!h;)V")
	public static void method1715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class25 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class25 arg6, @OriginalArg(7) Class25 arg7) {
		@Pc(3) Class168 local3 = new Class168();
		local3.aClass25_9 = arg4;
		local3.anInt6024 = arg1 * 128 + 64;
		local3.anInt6025 = arg2 * 128 + 64;
		local3.anInt6022 = arg3;
		local3.aLong199 = arg5;
		local3.aClass25_10 = arg6;
		local3.aClass25_8 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class1_Sub14 local42 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt2332; local46++) {
				@Pc(55) Class152 local55 = local42.aClass152Array1[local46];
				if ((local55.aLong181 & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = local55.aClass25_6.method4773();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt6021 = -local34;
		if (Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2] = new Class1_Sub14(arg0, arg1, arg2);
		}
		Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2].aClass168_1 = local3;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)[Lclient!co;")
	public static Class33[] method1717() {
		if (Static191.aClass33Array1 == null) {
			@Pc(16) Class33[] local16 = Static290.method4732(Static43.aClass66_1);
			@Pc(20) Class33[] local20 = new Class33[local16.length];
			@Pc(22) int local22 = 0;
			label53: for (@Pc(24) int local24 = 0; local24 < local16.length; local24++) {
				@Pc(32) Class33 local32 = local16[local24];
				if ((local32.anInt1165 <= 0 || local32.anInt1165 >= 24) && local32.anInt1166 >= 800 && local32.anInt1158 >= 600) {
					for (@Pc(56) int local56 = 0; local56 < local22; local56++) {
						@Pc(67) Class33 local67 = local20[local56];
						if (local32.anInt1166 == local67.anInt1166 && local67.anInt1158 == local32.anInt1158) {
							if (local32.anInt1165 > local67.anInt1165) {
								local20[local56] = local32;
							}
							continue label53;
						}
					}
					local20[local22] = local32;
					local22++;
				}
			}
			Static191.aClass33Array1 = new Class33[local22];
			Static302.method1379(local20, 0, Static191.aClass33Array1, 0, local22);
			@Pc(121) int[] local121 = new int[Static191.aClass33Array1.length];
			for (@Pc(123) int local123 = 0; local123 < Static191.aClass33Array1.length; local123++) {
				@Pc(135) Class33 local135 = Static191.aClass33Array1[local123];
				local121[local123] = local135.anInt1158 * local135.anInt1166;
			}
			Static252.method4305(local121, Static191.aClass33Array1);
		}
		return Static191.aClass33Array1;
	}
}
