import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
	public static int anInt3018;

	@OriginalMember(owner = "client!rb", name = "J", descriptor = "[S")
	public static short[] aShortArray24;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "Lclient!sa;")
	public static Class72 aClass72_22 = new Class72(50);

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1314 = Static51.method932("This computers address has been blocked");

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
	public static int anInt3023 = 0;

	@OriginalMember(owner = "client!rb", name = "H", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1315 = aClass10_1314;

	@OriginalMember(owner = "client!rb", name = "O", descriptor = "Lclient!cf;")
	public static Class12 aClass12_11 = new Class12();

	@OriginalMember(owner = "client!rb", name = "P", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1316 = Static51.method932("M");

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ea;IIIIB)V")
	public static void method2155(@OriginalArg(0) Class2_Sub1_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) int local15 = arg2 * arg2 + arg1 * arg1;
		if (local15 <= 4225 || local15 >= 90000) {
			Static96.method2623(arg2, arg1, arg0, arg3, arg4);
			return;
		}
		@Pc(29) int local29 = Static45.anInt1123 + Static64.anInt1576 & 0x7FF;
		@Pc(33) int local33 = Class2_Sub1_Sub4_Sub4.anIntArray299[local29];
		@Pc(41) int local41 = local33 * 256 / (Static96.anInt3690 + 256);
		@Pc(45) int local45 = Class2_Sub1_Sub4_Sub4.anIntArray304[local29];
		@Pc(53) int local53 = local45 * 256 / (Static96.anInt3690 + 256);
		@Pc(63) int local63 = arg1 * local41 + arg2 * local53 >> 16;
		@Pc(74) int local74 = local53 * arg1 - local41 * arg2 >> 16;
		@Pc(80) double local80 = Math.atan2((double) local63, (double) local74);
		@Pc(86) int local86 = (int) (Math.sin(local80) * 63.0D);
		@Pc(92) int local92 = (int) (Math.cos(local80) * 57.0D);
		Static151.aClass2_Sub1_Sub4_Sub2_38.method727(local86 + arg3 + 98 - 10, arg4 - local92 - 20 + 83, local80);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	public static void method2156() {
		aClass10_1314 = null;
		aClass12_11 = null;
		aShortArray24 = null;
		aClass10_1316 = null;
		aClass72_22 = null;
		aClass10_1315 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!cd;Lclient!kh;Lclient!cd;Lclient!kh;)Lclient!cg;")
	public static Class2_Sub1_Sub4_Sub1_Sub1 method2157(@OriginalArg(1) Class10 arg0, @OriginalArg(2) Class29 arg1, @OriginalArg(3) Class10 arg2, @OriginalArg(4) Class29 arg3) {
		@Pc(8) int local8 = arg1.method1026(arg0);
		@Pc(22) int local22 = arg1.method1020(local8, arg2);
		return Static98.method1625(arg1, local22, local8, arg3);
	}
}
