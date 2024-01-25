import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!va", name = "D", descriptor = "I")
	public static int anInt6243;

	@OriginalMember(owner = "client!va", name = "G", descriptor = "[Lclient!bi;")
	public static Class26[] aClass26Array2;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V")
	private static void method5263() {
		@Pc(6) Class103 local6 = Static266.aClass103_54;
		synchronized (Static266.aClass103_54) {
			Static266.aClass103_54.method2679(5);
		}
		local6 = Static271.aClass103_57;
		synchronized (Static271.aClass103_57) {
			Static271.aClass103_57.method2679(5);
		}
		local6 = Static228.aClass103_45;
		synchronized (Static228.aClass103_45) {
			Static228.aClass103_45.method2679(5);
		}
		local6 = Static283.aClass103_60;
		synchronized (Static283.aClass103_60) {
			Static283.aClass103_60.method2679(5);
		}
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V")
	public static void method5267() {
		if (Static339.aBoolean467 && Static17.aBooleanArray24[81] && Static33.anInt735 > 2) {
			Static68.method1365((Class7_Sub32) Static76.aClass74_8.aClass7_72.aClass7_248.aClass7_248);
		} else {
			Static68.method1365((Class7_Sub32) Static76.aClass74_8.aClass7_72.aClass7_248);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIII)V")
	public static void method5268(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = Static270.method4496(Static314.anInt6030, arg0, Static142.anInt3103);
		@Pc(17) int local17 = Static270.method4496(Static314.anInt6030, arg2, Static142.anInt3103);
		@Pc(23) int local23 = Static270.method4496(Static168.anInt3509, arg4, Static61.anInt1534);
		@Pc(29) int local29 = Static270.method4496(Static168.anInt3509, arg3, Static61.anInt1534);
		@Pc(37) int local37 = Static270.method4496(Static314.anInt6030, arg0 + arg5, Static142.anInt3103);
		@Pc(46) int local46 = Static270.method4496(Static314.anInt6030, arg2 - arg5, Static142.anInt3103);
		for (@Pc(48) int local48 = local9; local48 < local37; local48++) {
			Static282.method4681(arg1, local23, Static323.anIntArrayArray55[local48], local29);
		}
		for (@Pc(69) int local69 = local17; local69 > local46; local69--) {
			Static282.method4681(arg1, local23, Static323.anIntArrayArray55[local69], local29);
		}
		@Pc(99) int local99 = Static270.method4496(Static168.anInt3509, arg4 + arg5, Static61.anInt1534);
		@Pc(108) int local108 = Static270.method4496(Static168.anInt3509, arg3 - arg5, Static61.anInt1534);
		for (@Pc(110) int local110 = local37; local110 <= local46; local110++) {
			@Pc(115) int[] local115 = Static323.anIntArrayArray55[local110];
			Static282.method4681(arg1, local23, local115, local99);
			Static282.method4681(arg1, local108, local115, local29);
		}
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(B)V")
	public static void method5269() {
		Static64.method1301();
		Static267.method4473();
		Static210.method3750();
		method5263();
		Static109.method48();
		Static152.method2976();
		Static91.method5059();
		Static303.method4896();
		Static219.method3872();
		Static298.method4861();
		Static252.method5175();
		Static111.method2154();
		Static177.method3288();
		Static98.method931();
		Static127.method2612();
		Static268.method4485();
		Static149.method2962();
		Static124.method2593();
		Static109.method50();
		Static354.method5696();
		Static16.method2769();
		Static20.method312();
		Static86.method1827();
		Static54.aClass103_14.method2679(5);
		Static263.aClass103_53.method2679(5);
		Static171.aClass103_28.method2679(5);
		Static33.aClass103_9.method2679(5);
		Static83.aClass103_21.method2679(5);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BII)I")
	public static int method5270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class7_Sub9 local10 = (Class7_Sub9) Static175.aClass10_32.method163((long) arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < local10.anIntArray263.length; local29++) {
				if (arg0 == local10.anIntArray262[local29]) {
					local27 += local10.anIntArray263[local29];
				}
			}
			return local27;
		}
	}
}
