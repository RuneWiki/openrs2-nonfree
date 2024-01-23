import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "Lclient!wf;")
	public static Class191 aClass191_1;

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "Lclient!th;")
	public static Class168 aClass168_4;

	@OriginalMember(owner = "client!aa", name = "E", descriptor = "Lclient!of;")
	public static Class1_Sub10_Sub3 aClass1_Sub10_Sub3_1;

	@OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
	public static int anInt53;

	@OriginalMember(owner = "client!aa", name = "U", descriptor = "Lclient!wf;")
	public static Class191 aClass191_2;

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "Lclient!ji;")
	public static Class1_Sub14_Sub1 aClass1_Sub14_Sub1_1 = new Class1_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "Z")
	public static boolean aBoolean2 = false;

	@OriginalMember(owner = "client!aa", name = "I", descriptor = "[S")
	public static short[] aShortArray1 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!wf;B)V")
	public static void method33(@OriginalArg(0) Class191 arg0) {
		@Pc(3) Class191 local3 = Static192.method3100(arg0);
		@Pc(16) int local16;
		@Pc(13) int local13;
		if (local3 == null) {
			local13 = Static270.anInt5412;
			local16 = Static38.anInt950;
		} else {
			local13 = local3.anInt6128;
			local16 = local3.anInt6088;
		}
		Static84.method1458(arg0, local16, false, local13);
		Static39.method803(local13, local16, arg0);
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public static void method34() {
		Static84.anIntArray201 = null;
		Static111.aByteArrayArrayArray3 = null;
		Static313.anIntArray567 = null;
		Static257.aByteArrayArrayArray15 = null;
		Static43.aByteArrayArrayArray1 = null;
		Static170.aByteArrayArrayArray14 = null;
		Static120.anIntArray566 = null;
		Static266.aByteArrayArrayArray16 = null;
		Static211.anIntArrayArrayArray9 = null;
		Static193.anIntArray368 = null;
		Static145.anIntArray540 = null;
		Static150.anIntArray311 = null;
	}
}
