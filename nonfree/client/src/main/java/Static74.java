import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_7;

	@OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
	public static int anInt1896;

	@OriginalMember(owner = "client!nc", name = "M", descriptor = "Lclient!vb;")
	public static Class11_Sub1 aClass11_Sub1_67;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "Lclient!bd;")
	public static Class9 aClass9_18 = new Class9(128);

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
	public static int anInt1890 = 500;

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
	public static int anInt1893 = 0;

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "[I")
	public static int[] anIntArray216 = new int[5];

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "Lclient!ae;")
	private static Class5 aClass5_872 = Static56.method972("Offline");

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "Lclient!ae;")
	private static Class5 aClass5_875 = Static56.method972("Enter amount:");

	@OriginalMember(owner = "client!nc", name = "A", descriptor = "Lclient!ae;")
	public static Class5 aClass5_873 = aClass5_875;

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "Lclient!ae;")
	public static Class5 aClass5_874 = Static56.method972("System)2Update in: ");

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "Z")
	public static volatile boolean aBoolean89 = true;

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "Z")
	public static final boolean aBoolean90 = false;

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "Lclient!ae;")
	public static Class5 aClass5_876 = aClass5_872;

	@OriginalMember(owner = "client!nc", name = "N", descriptor = "Lclient!ae;")
	private static Class5 aClass5_878 = Static56.method972("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!nc", name = "H", descriptor = "Lclient!ae;")
	public static Class5 aClass5_877 = aClass5_878;

	@OriginalMember(owner = "client!nc", name = "J", descriptor = "Z")
	public static boolean aBoolean91 = false;

	@OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
	public static int anInt1895 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
	public static void method1219(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && Static18.anInt633 == 0) {
			Static62.method1074();
		} else if (arg0 != -1 && arg0 != Static115.anInt2976 && Static68.anInt1575 != 0 && Static18.anInt633 == 0) {
			Static62.method1076(Static34.aClass11_Sub1_34, arg0, 0, Static68.anInt1575);
		}
		Static115.anInt2976 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IJ)V")
	public static void method1220(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static84.method1337(arg0 - 1L);
			Static84.method1337(1L);
		} else {
			Static84.method1337(arg0);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method1223() {
		aClass5_878 = null;
		aClass11_Sub1_67 = null;
		aClass5_874 = null;
		aClass9_18 = null;
		aClass5_875 = null;
		aClass5_877 = null;
		anIntArray216 = null;
		aClass5_876 = null;
		aClass5_873 = null;
		aClass3_Sub1_Sub2_Sub4_7 = null;
		aClass5_872 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!bf;IIZ)Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3 method1226(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static16.method398(arg2, arg1, arg0) ? Static67.method1164() : null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIB)I")
	public static int method1230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static93.aByteArrayArrayArray5[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static93.aByteArrayArrayArray5[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
	public static void method1232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class3_Sub1_Sub9 local7 = Static35.method690(arg1);
		@Pc(10) int local10 = local7.anInt1446;
		@Pc(13) int local13 = local7.anInt1443;
		@Pc(16) int local16 = local7.anInt1449;
		@Pc(23) int local23 = Class3_Sub1_Sub4.anIntArray106[local16 - local10];
		if (arg0 < 0 || arg0 > local23) {
			arg0 = 0;
		}
		local23 <<= local10;
		Static110.anIntArray373[local13] = ~local23 & Static110.anIntArray373[local13] | local23 & arg0 << local10;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!dd;")
	public static RuntimeException_Sub1 method1233(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub1 local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			local8 = (RuntimeException_Sub1) arg0;
			local8.aString1 = local8.aString1 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local8;
	}
}
