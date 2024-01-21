import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!td", name = "C", descriptor = "B")
	public static byte aByte7;

	@OriginalMember(owner = "client!td", name = "K", descriptor = "[Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2[] aClass8_Sub1_Sub3_Sub2Array8;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "[[B")
	public static byte[][] aByteArrayArray57;

	@OriginalMember(owner = "client!td", name = "W", descriptor = "Lclient!wf;")
	public static Class8_Sub24 aClass8_Sub24_10;

	@OriginalMember(owner = "client!td", name = "w", descriptor = "I")
	public static int anInt2594 = 0;

	@OriginalMember(owner = "client!td", name = "J", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1224 = Static56.method816("slide:");

	@OriginalMember(owner = "client!td", name = "x", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1218 = aClass34_1224;

	@OriginalMember(owner = "client!td", name = "A", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1220 = Static56.method816("cyan:");

	@OriginalMember(owner = "client!td", name = "z", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1219 = aClass34_1220;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1221 = aClass34_1224;

	@OriginalMember(owner = "client!td", name = "E", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!td", name = "F", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1222 = aClass34_1220;

	@OriginalMember(owner = "client!td", name = "G", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!td", name = "V", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1225 = Static56.method816("Take");

	@OriginalMember(owner = "client!td", name = "H", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1223 = aClass34_1225;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI[Lclient!aa;I[I[I)V")
	public static void method1634(@OriginalArg(1) int arg0, @OriginalArg(2) Class2[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(20) int local20 = arg0 - 1;
		@Pc(24) int local24 = arg2 + 1;
		@Pc(31) int local31 = (arg0 + arg2) / 2;
		@Pc(35) Class2 local35 = arg1[local31];
		arg1[local31] = arg1[arg0];
		arg1[arg0] = local35;
		while (local24 > local20) {
			@Pc(49) boolean local49 = true;
			@Pc(52) int local52;
			@Pc(67) int local67;
			@Pc(62) int local62;
			do {
				local24--;
				for (local52 = 0; local52 < 4; local52++) {
					if (arg4[local52] == 2) {
						local62 = local35.anInt36;
						local67 = arg1[local24].anInt36;
					} else if (arg4[local52] == 1) {
						local67 = arg1[local24].anInt27;
						local62 = local35.anInt27;
						if (local62 == -1 && arg3[local52] == 1) {
							local62 = 2001;
						}
						if (local67 == -1 && arg3[local52] == 1) {
							local67 = 2001;
						}
					} else if (arg4[local52] == 3) {
						local67 = arg1[local24].aBoolean2 ? 1 : 0;
						local62 = local35.aBoolean2 ? 1 : 0;
					} else {
						local62 = local35.anInt30;
						local67 = arg1[local24].anInt30;
					}
					if (local62 != local67) {
						if ((arg3[local52] != 1 || local62 >= local67) && (arg3[local52] != 0 || local67 >= local62)) {
							local49 = false;
						}
						break;
					}
					if (local52 == 3) {
						local49 = false;
					}
				}
			} while (local49);
			local49 = true;
			do {
				local20++;
				for (local52 = 0; local52 < 4; local52++) {
					if (arg4[local52] == 2) {
						local67 = arg1[local20].anInt36;
						local62 = local35.anInt36;
					} else if (arg4[local52] == 1) {
						local67 = arg1[local20].anInt27;
						if (local67 == -1 && arg3[local52] == 1) {
							local67 = 2001;
						}
						local62 = local35.anInt27;
						if (local62 == -1 && arg3[local52] == 1) {
							local62 = 2001;
						}
					} else if (arg4[local52] == 3) {
						local62 = local35.aBoolean2 ? 1 : 0;
						local67 = arg1[local20].aBoolean2 ? 1 : 0;
					} else {
						local67 = arg1[local20].anInt30;
						local62 = local35.anInt30;
					}
					if (local62 != local67) {
						if ((arg3[local52] != 1 || local67 >= local62) && (arg3[local52] != 0 || local62 >= local67)) {
							local49 = false;
						}
						break;
					}
					if (local52 == 3) {
						local49 = false;
					}
				}
			} while (local49);
			if (local20 < local24) {
				@Pc(334) Class2 local334 = arg1[local20];
				arg1[local20] = arg1[local24];
				arg1[local24] = local334;
			}
		}
		method1634(arg0, arg1, local24, arg3, arg4);
		method1634(local24 + 1, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	public static void method1635() {
		aClass34_1220 = null;
		aClass34_1221 = null;
		aClass8_Sub1_Sub3_Sub2Array8 = null;
		aClass34_1224 = null;
		anIntArrayArrayArray8 = null;
		aClass34_1222 = null;
		aByteArrayArray57 = null;
		aClass34_1219 = null;
		aClass34_1218 = null;
		aClass34_1225 = null;
		aClass8_Sub24_10 = null;
		aClass34_1223 = null;
	}
}
