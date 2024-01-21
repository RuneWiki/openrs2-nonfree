import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!oa", name = "ib", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1325 = Static193.method3027("Registrierter Benutzer");

	@OriginalMember(owner = "client!oa", name = "ab", descriptor = "I")
	public static int anInt2849 = -1;

	@OriginalMember(owner = "client!oa", name = "db", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1326 = Static193.method3027("Clientscript error in: ");

	@OriginalMember(owner = "client!oa", name = "fb", descriptor = "I")
	public static int anInt2853 = 0;

	@OriginalMember(owner = "client!oa", name = "jb", descriptor = "I")
	public static int anInt2856 = 0;

	@OriginalMember(owner = "client!oa", name = "kb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1327 = Static193.method3027("b12_full");

	@OriginalMember(owner = "client!oa", name = "ob", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1328 = Static193.method3027("Abbrechen");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ke;IZI)Z")
	public static boolean method2009(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) byte[] local10 = arg0.method1581(arg2, arg1);
		if (local10 == null) {
			return false;
		} else {
			Static73.method1043(local10);
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!ce;)Lclient!bb;")
	public static Class8 method2011(@OriginalArg(1) Class3_Sub4 arg0) {
		@Pc(7) Class8 local7 = new Class8();
		local7.anInt287 = arg0.method1270();
		local7.aClass3_Sub3_Sub15_1 = Static118.method1710(local7.anInt287);
		return local7;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method2012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int local6 = arg6 - arg4;
		@Pc(14) int local14 = arg4 + arg1;
		@Pc(19) int local19 = arg2 - arg4;
		for (@Pc(21) int local21 = arg1; local21 < local14; local21++) {
			Static16.method302(arg0, arg5, arg2, Static157.anIntArrayArray24[local21]);
		}
		for (@Pc(41) int local41 = arg6; local41 > local6; local41--) {
			Static16.method302(arg0, arg5, arg2, Static157.anIntArrayArray24[local41]);
		}
		@Pc(68) int local68 = arg5 + arg4;
		for (@Pc(70) int local70 = local14; local70 <= local6; local70++) {
			@Pc(76) int[] local76 = Static157.anIntArrayArray24[local70];
			Static16.method302(arg0, arg5, local68, local76);
			Static16.method302(arg3, local68, local19, local76);
			Static16.method302(arg0, local19, arg2, local76);
		}
	}
}
