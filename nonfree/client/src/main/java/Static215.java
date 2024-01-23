import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	public static int anInt4270 = 0;

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!dh;")
	public static Class33 aClass33_31 = new Class33(500);

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString135 = "Hidden";

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZB[Lclient!hm;III[BIIII)V")
	public static void method3427(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(14) Class4_Sub17 local14 = new Class4_Sub17(arg5);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method1877();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local14.method1856();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(50) int local50 = local31 >> 12;
				@Pc(56) int local56 = local31 >> 6 & 0x3F;
				@Pc(60) int local60 = local31 & 0x3F;
				@Pc(64) int local64 = local14.method1874();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				if (local50 == arg2 && arg4 <= local56 && local56 < arg4 + 8 && arg9 <= local60 && local60 < arg9 + 8) {
					@Pc(114) Class47 local114 = Static170.method2683(local16);
					@Pc(131) int local131 = arg8 + Static222.method3554(local72, arg6, local114.anInt1354, local114.anInt1327, local56 & 0x7, local60 & 0x7);
					@Pc(151) int local151 = arg7 + Static189.method3929(local114.anInt1354, local56 & 0x7, local72, local60 & 0x7, local114.anInt1327, arg6);
					if (local131 > 0 && local151 > 0 && local131 < 103 && local151 < 103) {
						@Pc(169) Class63 local169 = null;
						if (!arg0) {
							@Pc(174) int local174 = arg3;
							if ((Static46.aByteArrayArrayArray2[1][local131][local151] & 0x2) == 2) {
								local174 = arg3 - 1;
							}
							if (local174 >= 0) {
								local169 = arg1[local174];
							}
						}
						Static21.method3455(local68, arg6 + local72 & 0x3, arg0, arg3, !arg0, arg3, local169, local131, local16, local151);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)J")
	public static long method3428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass43_1 == null ? 0L : local7.aClass43_1.aLong44;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public static void method3429() {
		aClass33_31 = null;
		aString135 = null;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I")
	public static int method3430(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
