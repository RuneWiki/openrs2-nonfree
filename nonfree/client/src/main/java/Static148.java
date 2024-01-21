import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "[I")
	public static int[] anIntArray400;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray32;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
	public static int anInt3487;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
	public static int anInt3494;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
	public static int anInt3485 = 0;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
	public static int anInt3489 = 0;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2005 = Static118.method2249("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
	public static int anInt3490 = 0;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2006 = aClass65_2005;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "Lclient!v;")
	public static final Class91 aClass91_16 = new Class91();

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2007 = Static118.method2249("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIBII)V")
	public static void method2648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg6 + arg1;
		@Pc(12) int local12 = arg4 - arg6;
		@Pc(17) int local17 = arg0 - arg6;
		for (@Pc(23) int local23 = arg1; local23 < local7; local23++) {
			Static51.method893(arg3, Static40.anIntArrayArray11[local23], arg0, arg2);
		}
		for (@Pc(44) int local44 = arg4; local44 > local12; local44--) {
			Static51.method893(arg3, Static40.anIntArrayArray11[local44], arg0, arg2);
		}
		@Pc(68) int local68 = arg2 + arg6;
		for (@Pc(70) int local70 = local7; local70 <= local12; local70++) {
			@Pc(75) int[] local75 = Static40.anIntArrayArray11[local70];
			Static51.method893(arg3, local75, local68, arg2);
			Static51.method893(arg5, local75, local17, local68);
			Static51.method893(arg3, local75, arg0, local17);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!w;II)V")
	public static void method2649(@OriginalArg(0) Class6_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt3963 > Static174.anInt3887) {
			Static16.method302(arg0);
		} else if (Static174.anInt3887 > arg0.anInt3984) {
			Static146.method2641(arg0);
		} else {
			Static9.method164(arg0);
		}
		if (arg0.anInt3934 < 128 || arg0.anInt3976 < 128 || arg0.anInt3934 >= 13184 || arg0.anInt3976 >= 13184) {
			arg0.anInt3964 = -1;
			arg0.anInt3945 = -1;
			arg0.anInt3976 = arg0.anInt3959 * 64 + arg0.anIntArray455[0] * 128;
			arg0.anInt3963 = 0;
			arg0.anInt3984 = 0;
			arg0.anInt3934 = arg0.anIntArray451[0] * 128 + arg0.anInt3959 * 64;
			arg0.method2992();
		}
		if (Static201.aClass6_Sub4_Sub1_3 == arg0 && (arg0.anInt3934 < 1536 || arg0.anInt3976 < 1536 || arg0.anInt3934 >= 11776 || arg0.anInt3976 >= 11776)) {
			arg0.anInt3984 = 0;
			arg0.anInt3963 = 0;
			arg0.anInt3934 = arg0.anIntArray451[0] * 128 + arg0.anInt3959 * 64;
			arg0.anInt3976 = arg0.anIntArray455[0] * 128 + arg0.anInt3959 * 64;
			arg0.anInt3964 = -1;
			arg0.anInt3945 = -1;
			arg0.method2992();
		}
		Static41.method714(arg0);
		Static64.method1132(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
	public static void method2651(@OriginalArg(1) int arg0) {
		if (Static90.anIntArray518 == null || Static90.anIntArray518.length < arg0) {
			Static90.anIntArray518 = new int[arg0];
		}
	}
}
