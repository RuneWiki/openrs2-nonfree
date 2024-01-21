import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "l", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Lclient!oa;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "Lclient!ic;")
	private static Class34 aClass34_2 = Static56.method816("Free world");

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1 = aClass34_2;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	public static int anInt24 = 0;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!dd;ILclient!dd;Lclient!dd;Lclient!dd;)V")
	public static void method1(@OriginalArg(0) Class14 arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) Class14 arg2, @OriginalArg(4) Class14 arg3) {
		Static14.aClass14_3 = arg2;
		Static133.aClass14_30 = arg3;
		Static105.aClass14_23 = arg0;
		Static76.aClass14_20 = arg1;
		Static44.aClass8_Sub24ArrayArray1 = new Class8_Sub24[Static14.aClass14_3.method1151()][];
		Static112.aBooleanArray19 = new boolean[Static14.aClass14_3.method1151()];
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([BZ)Lclient!ub;")
	public static Class8_Sub1_Sub3_Sub4_Sub1 method2(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(24) Class8_Sub1_Sub3_Sub4_Sub1 local24 = new Class8_Sub1_Sub3_Sub4_Sub1(arg0, Static92.anIntArray307, Static13.anIntArray47, Static42.anIntArray135, Static19.anIntArray65, Static32.anIntArray110, Static115.aByteArrayArray57);
			Static2.method10();
			return local24;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	public static void method3(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class8_Sub5 local15 = (Class8_Sub5) Static39.aClass7_6.method47(); local15 != null; local15 = (Class8_Sub5) Static39.aClass7_6.method46()) {
			if ((long) arg0 == (local15.aLong102 >> 48 & 0xFFFFL)) {
				local15.method2013();
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static void method4() {
		Static134.aClass48_59.method1101();
		Static40.aClass48_21.method1101();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)V")
	public static void method5(@OriginalArg(1) int arg0) {
		@Pc(10) Class8_Sub22 local10 = (Class8_Sub22) Static64.aClass7_14.method45((long) arg0);
		if (local10 != null) {
			local10.method2013();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method6() {
		anIntArray1 = null;
		aClass9_1 = null;
		aClass34_1 = null;
		aClass34_2 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZLclient!dd;Lclient!ic;Lclient!ic;II)V")
	public static void method7(@OriginalArg(2) Class14 arg0, @OriginalArg(3) Class34 arg1, @OriginalArg(4) Class34 arg2) {
		@Pc(13) int local13 = arg0.method1164(arg1);
		@Pc(19) int local19 = arg0.method1159(local13, arg2);
		Static116.method1637(local13, arg0, 255, local19);
	}
}
