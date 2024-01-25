import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "Lclient!ui;")
	public static Class230 aClass230_12;

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "[I")
	public static final int[] anIntArray108 = new int[2048];

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
	public static int anInt718 = 0;

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
	public static int anInt719 = 1;

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "[I")
	public static final int[] anIntArray109 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!bt", name = "u", descriptor = "F")
	public static float aFloat2 = 0.0F;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method565(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + Static158.method2162(arg0.charAt(local12)) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILclient!nd;)V")
	public static void method566(@OriginalArg(0) int arg0, @OriginalArg(2) Class161 arg1) {
		if (Static347.aBoolean568) {
			arg0 = 0;
			Static347.aBoolean568 = false;
		}
		if (Static299.aClass161_4 != null && Static299.aClass161_4.method3216(arg1)) {
			return;
		}
		Static299.aClass161_4 = arg1;
		Static163.aLong92 = Static378.method5293();
		Static258.anInt4474 = arg0;
		Static25.anInt393 = arg0;
		if (Static25.anInt393 == 0) {
			Static185.method2659();
			return;
		}
		Static61.anInt1235 = Static188.anInt3286;
		Static312.anInt5339 = Static196.anInt3485;
		Static253.aFloat57 = Static251.aFloat55;
		Static317.aFloat63 = Static240.aFloat32;
		Static60.aFloat3 = Static344.aFloat64;
		Static151.aClass16_3 = Static34.aClass16_1;
		Static113.aFloat10 = Static382.aFloat81;
		Static209.anInt3637 = Static1.anInt7;
		Static251.aFloat56 = Static192.aFloat23;
		Static130.aFloat12 = Static123.aFloat62;
	}
}
