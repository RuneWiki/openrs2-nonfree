import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "[[[Lclient!k;")
	public static Class4_Sub21[][][] aClass4_Sub21ArrayArrayArray1;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Lclient!cg;")
	public static Class22 aClass22_29;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
	public static int anInt1523;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString61 = "glow3:";

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!cg;II)Lclient!gh;")
	public static Class58 method1263(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		return Static176.method4458(arg1, arg0) ? Static30.method623() : null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIILclient!uk;IJ)Z")
	public static boolean method1264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class13 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static178.method2925(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([Lclient!ao;[BIZII)V")
	public static void method1265(@OriginalArg(0) Class12[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class4_Sub24 local10 = new Class4_Sub24(arg1);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(22) int local22 = local10.method3093();
			if (local22 == 0) {
				return;
			}
			local16 += local22;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(34) int local34 = local10.method3060();
				if (local34 == 0) {
					break;
				}
				local30 += local34 - 1;
				@Pc(49) int local49 = local30 & 0x3F;
				@Pc(53) int local53 = local30 >> 12;
				@Pc(59) int local59 = local10.method3110();
				@Pc(65) int local65 = local30 >> 6 & 0x3F;
				@Pc(69) int local69 = local59 >> 2;
				@Pc(73) int local73 = arg4 + local65;
				@Pc(77) int local77 = local59 & 0x3;
				@Pc(81) int local81 = arg2 + local49;
				if (local73 > 0 && local81 > 0 && local73 < 103 && local81 < 103) {
					@Pc(100) Class12 local100 = null;
					if (!arg3) {
						@Pc(104) int local104 = local53;
						if ((Static27.aByteArrayArrayArray2[1][local73][local81] & 0x2) == 2) {
							local104 = local53 - 1;
						}
						if (local104 >= 0) {
							local100 = arg0[local104];
						}
					}
					Static108.method1834(!arg3, local53, local77, local100, arg3, local16, local53, local69, local81, local73);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public static void method1267() {
		Static109.aClass172_20.method4346();
		Static242.aClass172_39.method4346();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1268(@OriginalArg(1) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static156.anInt3230 > 0) {
			local19 = Static265.aByteArrayArray15[--Static156.anInt3230];
			Static265.aByteArrayArray15[Static156.anInt3230] = null;
			return local19;
		} else if (arg0 == 5000 && Static137.anInt2705 > 0) {
			local19 = Static17.aByteArrayArray3[--Static137.anInt2705];
			Static17.aByteArrayArray3[Static137.anInt2705] = null;
			return local19;
		} else if (arg0 == 30000 && Static201.anInt4018 > 0) {
			local19 = Static243.aByteArrayArray12[--Static201.anInt4018];
			Static243.aByteArrayArray12[Static201.anInt4018] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}
}
