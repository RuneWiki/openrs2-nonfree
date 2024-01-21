import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!i", name = "e", descriptor = "Lclient!eb;")
	public static Class25 aClass25_4;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "Lclient!eh;")
	public static Class28 aClass28_80;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "[I")
	public static final int[] anIntArray168 = new int[5];

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	public static int anInt1724 = 0;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "Lclient!s;")
	public static final Class86 aClass86_24 = new Class86(64);

	@OriginalMember(owner = "client!i", name = "i", descriptor = "[S")
	public static short[] aShortArray20 = new short[256];

	@OriginalMember(owner = "client!i", name = "j", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_536 = Static181.method2795("_");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lclient!ae;")
	public static Class5 method1401(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static175.aClass5ArrayArray1[local8] == null || Static175.aClass5ArrayArray1[local8][local16] == null) {
			@Pc(30) boolean local30 = Static133.method2211(local8);
			if (!local30) {
				return null;
			}
		}
		return Static175.aClass5ArrayArray1[local8][local16];
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(6) Class2_Sub15 local6 = (Class2_Sub15) Static51.aClass19_4.method691();
		@Pc(8) Class2_Sub15 local8 = null;
		while (local6 != null) {
			if (local6.anInt2080 == arg2 && local6.anInt2084 == arg7 && local6.anInt2082 == arg1 && arg0 == local6.anInt2076) {
				local8 = local6;
				break;
			}
			local6 = (Class2_Sub15) Static51.aClass19_4.method686();
		}
		if (local8 == null) {
			local8 = new Class2_Sub15();
			local8.anInt2084 = arg7;
			local8.anInt2076 = arg0;
			local8.anInt2080 = arg2;
			local8.anInt2082 = arg1;
			Static64.method1210(local8);
			Static51.aClass19_4.method684(local8);
		}
		local8.anInt2083 = arg3;
		local8.anInt2077 = arg5;
		local8.anInt2074 = arg6;
		local8.anInt2079 = arg4;
		local8.anInt2086 = arg8;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)Lclient!fc;")
	public static Class29 method1403() {
		@Pc(32) Class29_Sub1 local32 = new Class29_Sub1(Static21.anInt570, Static9.anInt226, Static28.anIntArray61[0], Static124.anIntArray251[0], Static163.anIntArray314[0], Static131.anIntArray284[0], Static151.aByteArrayArray14[0], Static153.anIntArray317);
		Static17.method372();
		return local32;
	}
}
