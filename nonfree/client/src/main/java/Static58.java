import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "[Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3[] aClass1_Sub1_Sub5_Sub3Array4;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!jd;")
	public static Class37 aClass37_19;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!pc;")
	public static Class58 aClass58_3 = new Class58(4096);

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!rd;")
	private static Class64 aClass64_819 = Static69.method1153(" is already on your ignore list");

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray11 = new int[5][5000];

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "Lclient!rd;")
	private static Class64 aClass64_821 = Static69.method1153("From");

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!rd;")
	public static Class64 aClass64_820 = aClass64_821;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "Lclient!rd;")
	public static Class64 aClass64_822 = aClass64_819;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "Lclient!rd;")
	private static Class64 aClass64_824 = Static69.method1153("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "Lclient!rd;")
	public static Class64 aClass64_823 = aClass64_824;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method969() {
		Static9.aClass2_1.method676();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static26.aLongArray3[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static19.aLongArray2[local24] = 0L;
		}
		Static66.anInt1525 = 0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Z")
	public static boolean method970(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!gb;Lclient!pb;IZLclient!pb;)V")
	public static void method971(@OriginalArg(0) Class1_Sub1_Sub5_Sub1 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class41 arg3) {
		Static19.aClass41_12 = arg3;
		Static98.aClass41_55 = arg1;
		Static73.aBoolean92 = arg2;
		Static5.anInt129 = Static98.aClass41_55.method1068(10);
		Static89.aClass1_Sub1_Sub5_Sub1_4 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(BI)Lclient!a;")
	public static Class1_Sub1_Sub1 method972(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub1 local10 = (Class1_Sub1_Sub1) Static69.aClass19_55.method410((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static70.method1163(arg0, Static98.aClass41_54, Static19.aClass41_13);
		if (local10 != null) {
			Static69.aClass19_55.method409(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method973() {
		aClass64_822 = null;
		aClass64_819 = null;
		aClass64_821 = null;
		aClass1_Sub1_Sub5_Sub3Array4 = null;
		aClass64_820 = null;
		aClass37_19 = null;
		aClass64_823 = null;
		aClass58_3 = null;
		aClass64_824 = null;
		anIntArrayArray11 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!d;IILclient!ke;)V")
	public static void method974(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class41_Sub1 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class50 local9 = Static96.aClass50_14;
		synchronized (Static96.aClass50_14) {
			for (@Pc(21) Class1_Sub12 local21 = (Class1_Sub12) Static96.aClass50_14.method1151(); local21 != null; local21 = (Class1_Sub12) Static96.aClass50_14.method1141()) {
				if (local21.aLong87 == (long) arg1 && local21.aClass16_4 == arg0 && local21.anInt2329 == 0) {
					local7 = local21.aByteArray26;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(72) byte[] local72 = arg0.method362(arg1);
			arg2.method1082(arg1, local72, arg0, true);
		} else {
			arg2.method1082(arg1, local7, arg0, true);
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public static void method975() {
		Static52.aBoolean169 = false;
		Static107.aBoolean154 = false;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public static void method976() {
		if (Static9.aClass21_1 != null) {
			Static9.aClass21_1.method2024();
			Static9.aClass21_1 = null;
		}
		Static43.anInt980 = 0;
	}
}
