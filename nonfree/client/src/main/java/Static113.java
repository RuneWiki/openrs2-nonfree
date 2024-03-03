import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "Lclient!r;")
	public static Class197 aClass197_28;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Ljava/lang/String;ILclient!bt;)I", line = 4)
	public static int method2381(@OriginalArg(0) String arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		@Pc(6) int local6 = arg1.anInt5289;
		@Pc(10) byte[] local10 = Static48.method1548(arg0);
		arg1.method4825(local10.length);
		arg1.anInt5289 += Static345.aClass140_1.method3649(arg1.aByteArray73, local10, 0, arg1.anInt5289, local10.length);
		return arg1.anInt5289 - local6;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V", line = 30)
	public static void method2382() {
		Class2_Sub3_Sub15.aClass115_1 = new Class115(8);
		Class141.anInt3697 = 0;
		for (@Pc(17) Class12_Sub5 local17 = (Class12_Sub5) Static122.aClass36_4.method1417(); local17 != null; local17 = (Class12_Sub5) Static122.aClass36_4.method1422()) {
			local17.method4357();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "([[BBLclient!bu;)V", line = 48)
	public static void method2383(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class29_Sub1 arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(18) int local18 = 0; local18 < arg1.anInt911; local18++) {
			Static36.method1135();
			for (@Pc(24) int local24 = 0; local24 < Class241.anInt7020 >> 3; local24++) {
				for (@Pc(28) int local28 = 0; local28 < OutputStream_Sub1.anInt4442 >> 3; local28++) {
					@Pc(32) boolean local32 = false;
					@Pc(40) int local40 = Static287.anIntArrayArrayArray12[local18][local24][local28];
					if (local40 != -1) {
						@Pc(50) int local50 = local40 >> 24 & 0x3;
						if (!arg1.aBoolean73 || local50 == 0) {
							@Pc(61) int local61 = local40 >> 1 & 0x3;
							@Pc(67) int local67 = local40 >> 14 & 0x3FF;
							@Pc(73) int local73 = local40 >> 3 & 0x7FF;
							@Pc(83) int local83 = local73 / 8 + (local67 / 8 << 8);
							for (@Pc(85) int local85 = 0; local85 < Static268.anIntArray372.length; local85++) {
								if (Static268.anIntArray372[local85] == local83 && arg0[local85] != null) {
									@Pc(107) Class2_Sub4 local107 = new Class2_Sub4(arg0[local85]);
									arg1.method1091(local24 * 8, local73, local107, Class2_Sub3_Sub18.aClass46Array1, local67, local28 * 8, local61, local50, local18);
									arg1.method1101(local107, local28 * 8, local18, local50, local73, local67, Static177.aClass19_8, local16[0] == -1 ? local16 : null, local24 * 8, local61);
									local32 = true;
									break;
								}
							}
						}
					}
					if (!local32) {
						arg1.method1092(8, local28 * 8, local24 * 8, 8, local18);
					}
				}
			}
		}
		if (local16[0] == -1) {
			Static343.aClass43_1 = null;
		} else {
			Static343.aClass43_1 = Static9.aClass213_1.method5425(local16[0], local16[1], local16[2], Static255.aClass160_1, local16[3]);
			Static68.anInt1681 = local16[4];
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IBI)V", line = 157)
	public static void method2385(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub2_Sub7 local13 = Static293.method5414(12, arg1);
		local13.method2313();
		local13.anInt2286 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!bt;B)Ljava/lang/String;", line = 177)
	public static String method2386(@OriginalArg(1) Class2_Sub4 arg0) {
		try {
			@Pc(7) int local7 = arg0.method4818();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(23) byte[] local23 = new byte[local7];
			arg0.anInt5289 += Static345.aClass140_1.method3652(local7, local23, 0, arg0.anInt5289, arg0.aByteArray73);
			return Static44.method1464(0, local23, local7);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}
}
