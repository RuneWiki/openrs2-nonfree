import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
	public static int anInt4897;

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
	public static int anInt4896 = -1;

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ne", name = "N", descriptor = "[S")
	public static final short[] aShortArray161 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)C")
	public static char method3771(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(41) char local41 = Static419.aCharArray7[local7 - 128];
			if (local41 == '\u0000') {
				local41 = '?';
			}
			local7 = local41;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
	public static void method3772() {
		for (@Pc(8) Class3_Sub2 local8 = (Class3_Sub2) Static384.aClass84_8.method2312(); local8 != null; local8 = (Class3_Sub2) Static384.aClass84_8.method2309()) {
			local8.method170();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBZIILclient!la;Lclient!ya;)V")
	public static void method3773(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class46 arg4, @OriginalArg(6) Class19 arg5) {
		if (arg1) {
			Static400.aClass57_23.method5534((Static141.anInt2881 - Static400.aClass57_23.j()) / 2, (Static302.anInt5346 - Static400.aClass57_23.T()) / 2);
			Static83.aClass57_10.method5534((Static141.anInt2881 - Static83.aClass57_10.j()) / 2, 18);
		}
		arg4.method5056(Static141.anInt2881 / 2, arg3, Static302.anInt5346 / 2 - 26, -1, (Static196.aClass121_1 == Static393.aClass121_3 ? Static268.aClass83_104 : Static374.aClass83_129).method2267(Static178.anInt3423));
		@Pc(64) int local64 = Static302.anInt5346 / 2 - 18;
		arg5.method4312(Static141.anInt2881 / 2 - 152, local64, 304, 34, arg0, 0);
		arg5.method4312(Static141.anInt2881 / 2 - 151, local64 - -1, 302, 32, 0, 0);
		arg5.O(Static141.anInt2881 / 2 - 150, local64 + 2, Static247.anInt4590 * 3, 30, arg2, 0);
		arg5.O(Static141.anInt2881 / 2 + Static247.anInt4590 * 3 - 150, local64 + 2, 300 - Static247.anInt4590 * 3, 30, 0, 0);
		arg4.method5056(Static141.anInt2881 / 2, arg3, Static302.anInt5346 / 2 + 4, -1, Static24.aString53);
	}
}
