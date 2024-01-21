import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
	public static int anInt1934;

	@OriginalMember(owner = "client!oc", name = "N", descriptor = "Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3 aClass5_Sub1_Sub10_Sub3_35;

	@OriginalMember(owner = "client!oc", name = "T", descriptor = "Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 aClass5_Sub1_Sub10_Sub1_18;

	@OriginalMember(owner = "client!oc", name = "D", descriptor = "Lclient!vc;")
	private static Class71 aClass71_950 = Static38.method736("purple:");

	@OriginalMember(owner = "client!oc", name = "F", descriptor = "Lclient!vc;")
	private static Class71 aClass71_951 = Static38.method736("shake:");

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "Lclient!vc;")
	public static Class71 aClass71_952 = aClass71_950;

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "Lclient!vc;")
	private static Class71 aClass71_953 = Static38.method736("Loading wordpack )2 ");

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "[[B")
	public static byte[][] aByteArrayArray7 = new byte[1000][];

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "Lclient!vc;")
	public static Class71 aClass71_954 = Static38.method736("Texturen geladen)3");

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "Lclient!vc;")
	public static Class71 aClass71_955 = aClass71_951;

	@OriginalMember(owner = "client!oc", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!oc", name = "R", descriptor = "Lclient!vc;")
	public static Class71 aClass71_956 = aClass71_953;

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "Lclient!vc;")
	public static Class71 aClass71_957 = Static38.method736("mod_icons");

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
	public static int anInt1938 = 0;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLclient!cf;Lclient!fc;I)V")
	public static void method1281(@OriginalArg(1) Class14 arg0, @OriginalArg(2) Class24_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(13) Class52 local13 = Static89.aClass52_11;
		synchronized (Static89.aClass52_11) {
			for (@Pc(20) Class5_Sub10 local20 = (Class5_Sub10) Static89.aClass52_11.method1358(); local20 != null; local20 = (Class5_Sub10) Static89.aClass52_11.method1363()) {
				if (local20.aLong118 == (long) arg2 && arg0 == local20.aClass14_3 && local20.anInt1988 == 0) {
					local3 = local20.aByteArray21;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(70) byte[] local70 = arg0.method426(arg2);
			arg1.method684(local70, true, arg0, arg2);
		} else {
			arg1.method684(local3, true, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)V")
	public static void method1282() {
		aClass71_954 = null;
		aClass71_953 = null;
		aClass71_951 = null;
		aByteArrayArray7 = null;
		aClass71_952 = null;
		aClass5_Sub1_Sub10_Sub3_35 = null;
		aClass5_Sub1_Sub10_Sub1_18 = null;
		anIntArrayArray24 = null;
		aClass71_956 = null;
		aClass71_950 = null;
		aClass71_955 = null;
		aClass71_957 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBI)I")
	public static int method1283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub7 local12 = (Class5_Sub7) Static71.aClass57_10.method1575((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(24) int local24 = 0;
			for (@Pc(34) int local34 = 0; local34 < local12.anIntArray211.length; local34++) {
				if (arg1 == local12.anIntArray212[local34]) {
					local24 += local12.anIntArray211[local34];
				}
			}
			return local24;
		}
	}
}
