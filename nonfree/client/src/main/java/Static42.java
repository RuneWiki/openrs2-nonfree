import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
	public static int anInt754;

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_29 = new Class131(58, -1);

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "Lclient!of;")
	public static final Class176 aClass176_3 = new Class176("WTI", 5);

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
	public static int anInt758 = 0;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
	public static void method685() {
		Static235.aClass249_1 = new Class249(8);
		Static199.anInt3620 = 0;
		for (@Pc(17) Class39_Sub8 local17 = (Class39_Sub8) Static138.aClass188_3.method4534(); local17 != null; local17 = (Class39_Sub8) Static138.aClass188_3.method4530()) {
			local17.method5620();
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIII)V")
	public static void method686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg4) {
			Static249.method3673(arg1, arg0, arg3, arg2);
		} else if (arg2 - arg0 >= Static83.anInt7380 && Static221.anInt4001 >= arg2 + arg0 && arg1 - arg4 >= Static305.anInt5429 && arg4 + arg1 <= Static212.anInt452) {
			Static171.method2703(arg0, arg4, arg2, arg1, arg3);
		} else {
			Static414.method5602(arg0, arg2, arg1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "([B[III[[B[I[[BZ)I")
	public static int method688(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		@Pc(9) int local9 = arg1[arg3];
		@Pc(16) int local16 = local9 + arg5[arg3];
		@Pc(20) int local20 = arg1[arg2];
		@Pc(26) int local26 = arg5[arg2] + local20;
		@Pc(28) int local28 = local9;
		if (local20 > local9) {
			local28 = local20;
		}
		@Pc(39) int local39 = local16;
		if (local26 < local16) {
			local39 = local26;
		}
		@Pc(54) int local54 = arg0[arg3] & 0xFF;
		if (local54 > (arg0[arg2] & 0xFF)) {
			local54 = arg0[arg2] & 0xFF;
		}
		@Pc(75) byte[] local75 = arg6[arg3];
		@Pc(79) byte[] local79 = arg4[arg2];
		@Pc(84) int local84 = local28 - local9;
		@Pc(94) int local94 = local28 - local20;
		for (@Pc(96) int local96 = local28; local96 < local39; local96++) {
			@Pc(108) int local108 = local79[local94++] + local75[local84++];
			if (local54 > local108) {
				local54 = local108;
			}
		}
		return -local54;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V")
	public static void method689() {
		for (@Pc(10) Class1_Sub8 local10 = (Class1_Sub8) Static8.aClass266_2.method6000(); local10 != null; local10 = (Class1_Sub8) Static8.aClass266_2.method5994()) {
			if (Static72.method1210(local10.anInt1758)) {
				Static392.method5481(local10);
			}
		}
		if (Static82.anInt1627 == 1) {
			Static108.aBoolean111 = false;
			Static377.method5166(Static49.anInt5921, Static24.anInt543, Static125.anInt2237, Static309.anInt2246);
			return;
		}
		Static377.method5166(Static49.anInt5921, Static24.anInt543, Static125.anInt2237, Static309.anInt2246);
		@Pc(62) int local62 = Static167.aClass101_3.method1963(Static141.aClass84_35.method1678(Static167.anInt3118));
		for (@Pc(67) Class1_Sub8 local67 = (Class1_Sub8) Static8.aClass266_2.method6000(); local67 != null; local67 = (Class1_Sub8) Static8.aClass266_2.method5994()) {
			@Pc(73) int local73 = Static129.method1885(local67);
			if (local73 > local62) {
				local62 = local73;
			}
		}
		Static49.anInt5921 = local62 + 8;
		Static125.anInt2237 = Static82.anInt1627 * 16 + (Static45.aBoolean35 ? 26 : 22);
	}
}
