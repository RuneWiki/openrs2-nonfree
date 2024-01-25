import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "I")
	public static int anInt2591;

	@OriginalMember(owner = "client!hq", name = "w", descriptor = "I")
	public static int anInt2594;

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
	public static int anInt2587 = 0;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString169 = "Started 3d Library";

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[5];

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
	public static void method2405(@OriginalArg(1) int arg0) {
		Static55.anInt1337 = -1;
		Static9.anInt302 = arg0;
		Static55.anInt1337 = -1;
		Static228.method3919();
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIZII)I")
	public static int method2407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static130.aClass3Array2 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(16) int local16 = arg2 >> 7;
			@Pc(20) int local20 = arg3 >> 7;
			if (arg4 < 0 || arg1 < 0 || Static266.anInt5101 - 1 < arg4 || arg1 > Static339.anInt6352 - 1) {
				return 0;
			} else if (local16 >= 1 && local20 >= 1 && Static266.anInt5101 - 1 >= local16 && local20 <= Static339.anInt6352 - 1) {
				@Pc(86) boolean local86 = (Static32.aByteArrayArrayArray4[1][arg2 >> 7][arg3 >> 7] & 0x2) != 0;
				@Pc(108) boolean local108;
				@Pc(124) boolean local124;
				if ((arg2 & 0x7F) == 0) {
					local108 = (Static32.aByteArrayArrayArray4[1][local16 - 1][arg3 >> 7] & 0x2) != 0;
					local124 = (Static32.aByteArrayArrayArray4[1][local16][arg3 >> 7] & 0x2) != 0;
					if (local108 != local124) {
						local86 = (Static32.aByteArrayArrayArray4[1][arg4][arg1] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x7F) == 0) {
					local108 = (Static32.aByteArrayArrayArray4[1][arg2 >> 7][local20 - 1] & 0x2) != 0;
					local124 = (Static32.aByteArrayArrayArray4[1][arg2 >> 7][local20] & 0x2) != 0;
					if (local124 != local108) {
						local86 = (Static32.aByteArrayArrayArray4[1][arg4][arg1] & 0x2) != 0;
					}
				}
				if (local86) {
					arg0++;
				}
				return Static130.aClass3Array2[arg0].method5639(arg2, arg3);
			} else {
				return 0;
			}
		} else {
			return Static130.aClass3Array2[arg0].method5639(arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZZII)Lclient!ra;")
	public static Class170 method2408(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) Class219 local13 = null;
		if (Static210.aClass35_4 != null) {
			local13 = new Class219(arg0, Static210.aClass35_4, Static253.aClass35Array1[arg0], 1000000);
		}
		Static277.aClass159_Sub1Array1[arg0] = Static246.aClass195_1.method5293(Static111.aClass219_2, local13, arg0);
		if (arg2) {
			Static277.aClass159_Sub1Array1[arg0].method4073();
		}
		return new Class170(Static277.aClass159_Sub1Array1[arg0], arg1, 1);
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(II)V")
	public static void method2409(@OriginalArg(1) int arg0) {
		Static75.anIntArray97 = new int[arg0];
		Static203.anIntArray285 = new int[arg0];
		Static346.anIntArray555 = new int[arg0];
		Static302.anIntArray447 = new int[arg0];
		Static28.anIntArray40 = new int[arg0];
	}
}
