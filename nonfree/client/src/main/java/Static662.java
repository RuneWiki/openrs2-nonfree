import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static662 {

	@OriginalMember(owner = "client!wi", name = "jb", descriptor = "[I")
	public static int[] anIntArray817;

	@OriginalMember(owner = "client!wi", name = "bb", descriptor = "J")
	public static long aLong299 = -1L;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BILclient!ka;II)Lclient!rn;")
	public static Class305 method9180(@OriginalArg(1) int arg0, @OriginalArg(2) Class80 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return arg1 == null ? null : new Class305(arg0, arg3, arg2, arg1.na(), arg1.V(), arg1.RA(), arg1.fa(), arg1.EA(), arg1.HA(), arg1.G());
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BII)V")
	public static void method9181(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class14_Sub19 local16 = Static286.method4081(Static205.aClass394_1, Static370.aClass100_132);
		local16.aClass14_Sub29_Sub1_1.method5859(arg1);
		local16.aClass14_Sub29_Sub1_1.method5847(arg0);
		Static576.method8234(local16);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZI)V")
	public static void method9183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class14_Sub3_Sub9 local13 = Static142.method2219((long) arg1, 16);
		local13.method2817();
		local13.anInt3419 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!it;Z)Z")
	public static boolean method9184(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static576.aClass51Array3 == Static473.aClass51Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method8969();
		if (arg0.aShort111 < 0 || arg0.aShort110 < 0 || arg0.aShort112 >= Static28.anInt704 || arg0.aShort109 >= Static55.anInt1384) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort111; local36 <= arg0.aShort112; local36++) {
			for (local40 = arg0.aShort110; local40 <= arg0.aShort109; local40++) {
				@Pc(47) Class58 local47 = Static125.method2096(arg0.aByte146, local36, local40);
				if (local47 != null) {
					@Pc(53) Class43 local53 = Static75.method1418(arg0);
					@Pc(56) Class43 local56 = local47.aClass43_4;
					if (local56 == null) {
						local47.aClass43_4 = local53;
					} else {
						while (local56.aClass43_3 != null) {
							local56 = local56.aClass43_3;
						}
						local56.aClass43_3 = local53;
					}
					if (local6 && (Static676.anIntArrayArray62[local36][local40] & 0xFF000000) != 0) {
						local8 = Static676.anIntArrayArray62[local36][local40];
						local10 = Static75.aShortArrayArray4[local36][local40];
						local12 = Static553.aByteArrayArray46[local36][local40];
					}
					if (!arg1 && local47.aClass12_Sub2_Sub4_1 != null && local47.aClass12_Sub2_Sub4_1.aShort87 > local33) {
						local33 = local47.aClass12_Sub2_Sub4_1.aShort87;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort111; local40 <= arg0.aShort112; local40++) {
				for (@Pc(136) int local136 = arg0.aShort110; local136 <= arg0.aShort109; local136++) {
					if ((Static676.anIntArrayArray62[local40][local136] & 0xFF000000) == 0) {
						Static676.anIntArrayArray62[local40][local136] = local8;
						Static75.aShortArrayArray4[local40][local136] = local10;
						Static553.aByteArrayArray46[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static217.aClass12_Sub2_Sub2Array1[Static585.anInt10026++] = arg0;
		} else {
			local40 = Static576.aClass51Array3 == Static473.aClass51Array2 ? 1 : 0;
			if (!arg0.method9161()) {
				arg0.aClass12_Sub2_22 = Static177.aClass12_Sub2Array2[local40];
				Static177.aClass12_Sub2Array2[local40] = arg0;
			} else if (arg0.method9150()) {
				arg0.aClass12_Sub2_22 = Static154.aClass12_Sub2Array1[local40];
				Static154.aClass12_Sub2Array1[local40] = arg0;
			} else {
				arg0.aClass12_Sub2_22 = Static447.aClass12_Sub2Array8[local40];
				Static447.aClass12_Sub2Array8[local40] = arg0;
				Static17.aBoolean15 = true;
			}
		}
		if (arg1) {
			arg0.anInt10997 -= local33;
		}
		return true;
	}
}
