import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
	public static int anInt4535;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "Z")
	public static boolean aBoolean316;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
	public static int anInt4533 = 0;

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_81 = new Class70(4);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIILclient!fb;)V")
	public static void method4246(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class66 arg3) {
		for (@Pc(15) Class6_Sub39 local15 = (Class6_Sub39) Static264.aClass211_31.method5594(); local15 != null; local15 = (Class6_Sub39) Static264.aClass211_31.method5582()) {
			if (arg1 == local15.anInt5886 && arg2 * 128 == local15.anInt5876 && local15.anInt5888 == arg0 * 128 && arg3.anInt1497 == local15.aClass66_1.anInt1497) {
				if (local15.aClass6_Sub12_Sub4_3 != null) {
					Static241.aClass6_Sub12_Sub3_6.method4902(local15.aClass6_Sub12_Sub4_3);
					local15.aClass6_Sub12_Sub4_3 = null;
				}
				if (local15.aClass6_Sub12_Sub4_2 != null) {
					Static241.aClass6_Sub12_Sub3_6.method4902(local15.aClass6_Sub12_Sub4_2);
					local15.aClass6_Sub12_Sub4_2 = null;
				}
				local15.method5756();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ICLjava/lang/String;)I")
	public static int method4247(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0 == arg1.charAt(local12)) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	public static void method4249() {
		Static47.aClass70_23.method1405();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBIIII)V")
	public static void method4250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg4; local12 <= arg3; local12++) {
			Static14.method247(arg0, arg2, Static11.anIntArrayArray11[local12], arg1);
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
	public static void method4251() {
		@Pc(5) Class70 local5 = Static184.aClass70_62;
		synchronized (Static184.aClass70_62) {
			Static184.aClass70_62.method1399();
		}
		local5 = Static80.aClass70_97;
		synchronized (Static80.aClass70_97) {
			Static80.aClass70_97.method1399();
		}
		@Pc(39) Class70 local39 = Static206.aClass70_66;
		synchronized (Static206.aClass70_66) {
			Static206.aClass70_66.method1399();
		}
	}
}
