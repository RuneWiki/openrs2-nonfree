import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!uh", name = "ib", descriptor = "[I")
	public static int[] anIntArray405;

	@OriginalMember(owner = "client!uh", name = "mb", descriptor = "[Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1[] aClass1_Sub1_Sub8_Sub1Array10;

	@OriginalMember(owner = "client!uh", name = "qb", descriptor = "Lclient!gg;")
	public static Class26 aClass26_8;

	@OriginalMember(owner = "client!uh", name = "bb", descriptor = "Lclient!rc;")
	public static Class66 aClass66_21 = new Class66(200);

	@OriginalMember(owner = "client!uh", name = "hb", descriptor = "[I")
	public static int[] anIntArray404 = new int[1000];

	@OriginalMember(owner = "client!uh", name = "nb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1152 = Static8.method128("");

	@OriginalMember(owner = "client!uh", name = "jb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1149 = aClass18_1152;

	@OriginalMember(owner = "client!uh", name = "kb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1150 = aClass18_1152;

	@OriginalMember(owner = "client!uh", name = "lb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1151 = aClass18_1152;

	@OriginalMember(owner = "client!uh", name = "ob", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1153 = aClass18_1152;

	@OriginalMember(owner = "client!uh", name = "pb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1154 = aClass18_1152;

	@OriginalMember(owner = "client!uh", name = "rb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1155 = aClass18_1152;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!s;ILclient!ob;Z)V")
	public static void method3016(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16_Sub1 arg2) {
		@Pc(15) byte[] local15 = null;
		@Pc(17) Class59 local17 = Static164.aClass59_58;
		synchronized (Static164.aClass59_58) {
			for (@Pc(24) Class1_Sub7 local24 = (Class1_Sub7) Static164.aClass59_58.method2417(); local24 != null; local24 = (Class1_Sub7) Static164.aClass59_58.method2424()) {
				if (local24.aLong139 == (long) arg1 && local24.aClass69_2 == arg0 && local24.anInt1089 == 0) {
					local15 = local24.aByteArray5;
					break;
				}
			}
		}
		if (local15 == null) {
			@Pc(74) byte[] local74 = arg0.method2687(arg1);
			arg2.method2265(arg1, true, arg0, local74);
		} else {
			arg2.method2265(arg1, true, arg0, local15);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)Z")
	public static boolean method3017(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIBIII)I")
	public static int method3018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(12) int local12 = arg1;
			arg1 = arg2;
			arg2 = local12;
		}
		@Pc(20) int local20 = arg5 & 0x3;
		if (local20 == 0) {
			return arg4;
		} else if (local20 == 1) {
			return arg0;
		} else if (local20 == 2) {
			return 1 + 7 - arg1 - arg4;
		} else {
			return 1 + 7 - arg2 - arg0;
		}
	}

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "(I)V")
	public static void method3019() {
		aClass18_1153 = null;
		anIntArray404 = null;
		aClass1_Sub1_Sub8_Sub1Array10 = null;
		aClass18_1151 = null;
		anIntArray405 = null;
		aClass18_1152 = null;
		aClass18_1150 = null;
		aClass26_8 = null;
		aClass66_21 = null;
		aClass18_1154 = null;
		aClass18_1149 = null;
		aClass18_1155 = null;
	}

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "(I)V")
	public static void method3020() {
		for (@Pc(3) int local3 = -1; local3 < Static45.anInt1553; local3++) {
			@Pc(12) int local12;
			if (local3 == -1) {
				local12 = 2047;
			} else {
				local12 = Static58.anIntArray140[local3];
			}
			@Pc(20) Class1_Sub1_Sub5_Sub1_Sub2 local20 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local12];
			if (local20 != null) {
				Static15.method269(1, local20);
			}
		}
	}
}
