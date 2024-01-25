import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "Lclient!eha;")
	public static Class91 aClass91_7;

	@OriginalMember(owner = "client!oga", name = "i", descriptor = "I")
	public static int anInt6696;

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_74 = new Class46(6, 3);

	@OriginalMember(owner = "client!oga", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray55 = new String[200];

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lclient!fea;[[BI)V")
	public static void method5972(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(43) int local43;
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt2524; local14++) {
			Static229.method3856();
			for (local20 = 0; local20 < Static326.anInt5541 >> 3; local20++) {
				for (local24 = 0; local24 < Static448.anInt7637 >> 3; local24++) {
					local34 = Static269.anIntArrayArrayArray4[local14][local20][local24];
					if (local34 != -1) {
						local43 = local34 >> 24 & 0x3;
						if (!arg0.aBoolean199 || local43 == 0) {
							@Pc(57) int local57 = local34 >> 1 & 0x3;
							@Pc(63) int local63 = local34 >> 14 & 0x3FF;
							@Pc(69) int local69 = local34 >> 3 & 0x7FF;
							@Pc(79) int local79 = local69 / 8 + (local63 / 8 << 8);
							for (@Pc(81) int local81 = 0; local81 < Static312.anIntArray597.length; local81++) {
								if (local79 == Static312.anIntArray597[local81] && arg1[local81] != null) {
									@Pc(103) Class5_Sub22 local103 = new Class5_Sub22(arg1[local81]);
									arg0.method2151(local24 * 8, local63, Static322.aClass352Array1, local43, local69, local20 * 8, local14, local57, local103);
									arg0.method2168(local69, local43, local63, local14, local103, Static213.aClass133_5, local24 * 8, local20 * 8, local57, local12[0] == -1 ? local12 : null);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg0.anInt2524; local20++) {
			Static229.method3856();
			for (local24 = 0; local24 < Static326.anInt5541 >> 3; local24++) {
				for (local34 = 0; local34 < Static448.anInt7637 >> 3; local34++) {
					local43 = Static269.anIntArrayArrayArray4[local20][local24][local34];
					if (local43 == -1) {
						arg0.method2147(local20, local24 * 8, 8, 8, local34 * 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static360.aClass64_1 = Static513.aClass260_2.method6305(local12[3], Static55.aClass191_1, local12[2], local12[0], local12[1]);
			Static270.anInt4854 = local12[4];
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(ZZIII)V")
	public static void method5975(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static18.method238();
		Static89.aLong42 = 0L;
		@Pc(15) int local15 = Static138.method2022();
		if (arg1 == 3 || local15 == 3) {
			arg0 = true;
		}
		if (!Static213.aClass133_5.method7315()) {
			arg0 = true;
		}
		Static141.method2037(local15, arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BCLjava/lang/String;)I")
	public static int method5976(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg1.charAt(local12) == arg0) {
				local7++;
			}
		}
		return local7;
	}
}
