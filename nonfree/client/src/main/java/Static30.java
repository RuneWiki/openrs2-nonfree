import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
	public static int anInt546;

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
	public static int anInt547;

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
	public static int anInt549 = 0;

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "Lclient!qe;")
	public static Class78 aClass78_97 = Static199.method3560("Spielwelt erstellt)3");

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIII)V")
	public static void method404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg4 - arg2;
		@Pc(14) int local14 = arg2 + arg0;
		@Pc(18) int local18 = arg3 - arg2;
		for (@Pc(28) int local28 = arg0; local28 < local14; local28++) {
			Static221.method3893(arg5, arg1, Static183.anIntArrayArray40[local28], arg3);
		}
		for (@Pc(48) int local48 = arg4; local48 > local10; local48--) {
			Static221.method3893(arg5, arg1, Static183.anIntArrayArray40[local48], arg3);
		}
		@Pc(67) int local67 = arg1 + arg2;
		for (@Pc(69) int local69 = local14; local69 <= local10; local69++) {
			@Pc(75) int[] local75 = Static183.anIntArrayArray40[local69];
			Static221.method3893(arg5, arg1, local75, local67);
			Static221.method3893(arg5, local18, local75, arg3);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(DI)V")
	public static void method405(@OriginalArg(0) double arg0) {
		if (arg0 == Static19.aDouble1) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(24) int local24 = (int) (Math.pow((double) local12 / 255.0D, arg0) * 255.0D);
			Static121.anIntArray797[local12] = local24 <= 255 ? local24 : 255;
		}
		Static19.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILclient!qe;IZ)V")
	public static void method406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class64 local4 = Static3.method79(arg3, arg1);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray16 != null) {
			@Pc(18) Class2_Sub1 local18 = new Class2_Sub1();
			local18.anInt48 = arg0;
			local18.anObjectArray1 = local4.anObjectArray16;
			local18.aClass64_1 = local4;
			local18.aClass78_7 = arg2;
			Static50.method649(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local4.anInt3002 > 0) {
			local36 = Static34.method426(local4);
		}
		if (!local36 || !Static3.method78(Static36.method473(local4), arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static161.aClass2_Sub23_Sub1_5.method2155(242);
			Static161.aClass2_Sub23_Sub1_5.method2134(arg1);
			Static161.aClass2_Sub23_Sub1_5.method2117(arg3);
		}
		if (arg0 == 2) {
			Static161.aClass2_Sub23_Sub1_5.method2155(67);
			Static161.aClass2_Sub23_Sub1_5.method2134(arg1);
			Static161.aClass2_Sub23_Sub1_5.method2117(arg3);
		}
		if (arg0 == 3) {
			Static161.aClass2_Sub23_Sub1_5.method2155(233);
			Static161.aClass2_Sub23_Sub1_5.method2134(arg1);
			Static161.aClass2_Sub23_Sub1_5.method2117(arg3);
		}
		if (arg0 == 4) {
			Static161.aClass2_Sub23_Sub1_5.method2155(153);
			Static161.aClass2_Sub23_Sub1_5.method2134(arg1);
			Static161.aClass2_Sub23_Sub1_5.method2117(arg3);
		}
		if (arg0 == 5) {
			Static161.aClass2_Sub23_Sub1_5.method2155(210);
			Static161.aClass2_Sub23_Sub1_5.method2134(arg1);
			Static161.aClass2_Sub23_Sub1_5.method2117(arg3);
		}
		if (arg0 == 6) {
			Static161.aClass2_Sub23_Sub1_5.method2155(161);
			Static161.aClass2_Sub23_Sub1_5.method2134(arg1);
			Static161.aClass2_Sub23_Sub1_5.method2117(arg3);
		}
		if (arg0 == 7) {
			Static161.aClass2_Sub23_Sub1_5.method2155(54);
			Static161.aClass2_Sub23_Sub1_5.method2134(arg1);
			Static161.aClass2_Sub23_Sub1_5.method2117(arg3);
		}
		if (arg0 == 8) {
			Static161.aClass2_Sub23_Sub1_5.method2155(31);
			Static161.aClass2_Sub23_Sub1_5.method2134(arg1);
			Static161.aClass2_Sub23_Sub1_5.method2117(arg3);
		}
		if (arg0 == 9) {
			Static161.aClass2_Sub23_Sub1_5.method2155(121);
			Static161.aClass2_Sub23_Sub1_5.method2134(arg1);
			Static161.aClass2_Sub23_Sub1_5.method2117(arg3);
		}
		if (arg0 == 10) {
			Static161.aClass2_Sub23_Sub1_5.method2155(190);
			Static161.aClass2_Sub23_Sub1_5.method2134(arg1);
			Static161.aClass2_Sub23_Sub1_5.method2117(arg3);
		}
	}
}
