import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!p", name = "d", descriptor = "Lclient!mh;")
	public static Class163 aClass163_1;

	@OriginalMember(owner = "client!p", name = "h", descriptor = "Lclient!qg;")
	public static Class87 aClass87_20;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "[I")
	public static final int[] anIntArray355 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!p", name = "i", descriptor = "I")
	public static int anInt5269 = -1;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!eq;B)V")
	public static void method4398(@OriginalArg(0) Class66 arg0) {
		arg0.method5044(0, 0, Static348.anInt6272, 350);
		arg0.method5004(0, 0, Static348.anInt6272, 350, Static326.anInt5607 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static381.anInt6823;
		@Pc(36) int local36;
		if (Static20.anInt657 > 0) {
			local36 = 346 - Static381.anInt6823 - 4;
			@Pc(46) int local46 = local36 * local27 / (Static20.anInt657 + local27 - 1);
			@Pc(48) int local48 = 4;
			if (Static20.anInt657 > 1) {
				local48 = (local36 - local46) * (-Static161.anInt3241 + Static20.anInt657 - 1) / (Static20.anInt657 - 1) + 4;
			}
			arg0.method5004(Static348.anInt6272 - 16, local48, 12, local46, Static326.anInt5607 << 24 | 0x332277, 2);
			for (@Pc(87) int local87 = Static161.anInt3241; local87 < Static161.anInt3241 + local27 && local87 < Static20.anInt657; local87++) {
				@Pc(96) String[] local96 = Static142.method2449(Static406.aStringArray46[local87], '\b');
				@Pc(103) int local103 = (Static348.anInt6272 - 24) / local96.length;
				for (@Pc(105) int local105 = 0; local105 < local96.length; local105++) {
					@Pc(113) int local113 = local103 * local105 + 8;
					arg0.method5044(local113, 0, local113 + local103 - 8, 350);
					Static35.aClass29_1.method4804(-1, -16777216, local113, 350 - Static58.aClass166_6.anInt4593 - Static76.anInt7822 - (-Static161.anInt3241 + local87) * Static381.anInt6823 - 2, local96[local105]);
				}
			}
		}
		arg0.method5044(0, 0, Static348.anInt6272, 350);
		arg0.method4975(Static348.anInt6272, 0, 350 - Static76.anInt7822, -1);
		Static236.aClass29_2.method4804(-1, -16777216, 10, 350 - Static237.aClass166_8.anInt4593 - 1, "--> " + Static67.aString10);
		local36 = -1;
		if (Static66.anInt1741 % 30 > 15) {
			local36 = 16777215;
		}
		arg0.method4988(Static237.aClass166_8.method3892("--> " + Static67.aString10.substring(0, Static9.anInt359)) + 10, 12, local36, 339 - Static237.aClass166_8.anInt4593);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)Z")
	public static boolean method4399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static411.method6068(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static62.anInt1705;
			@Pc(14) int local14 = arg2 << Static62.anInt1705;
			return Static75.method1489(local10 + 1, Static55.aClass86Array1[arg0].method6594(arg1, arg2) + arg3, local14 + 1) && Static75.method1489(local10 + Static168.anInt3377 - 1, Static55.aClass86Array1[arg0].method6594(arg1 + 1, arg2) + arg3, local14 + 1) && Static75.method1489(local10 + Static168.anInt3377 - 1, Static55.aClass86Array1[arg0].method6594(arg1 + 1, arg2 + 1) + arg3, local14 + Static168.anInt3377 - 1) && Static75.method1489(local10 + 1, Static55.aClass86Array1[arg0].method6594(arg1, arg2 + 1) + arg3, local14 + Static168.anInt3377 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!bn;I)V")
	public static void method4400(@OriginalArg(0) Class3_Sub2_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt6595 == Static66.anInt1741 || arg0.lb == -1 || arg0.anInt6557 != 0) {
			local5 = true;
		} else {
			@Pc(33) Class131 local33 = Static5.aClass217_1.method5234(arg0.lb);
			if (local33.aBoolean244 || local33.anIntArray233[arg0.anInt6563] < arg0.anInt6601 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(56) int local56 = arg0.anInt6595 - arg0.anInt6570;
			@Pc(61) int local61 = Static66.anInt1741 - arg0.anInt6570;
			@Pc(73) int local73 = arg0.anInt6536 * 128 + arg0.method5521() * 64;
			@Pc(85) int local85 = arg0.anInt6554 * 128 + arg0.method5521() * 64;
			@Pc(96) int local96 = arg0.anInt6560 * 128 + arg0.method5521() * 64;
			@Pc(108) int local108 = arg0.anInt6578 * 128 + arg0.method5521() * 64;
			arg0.anInt7202 = (local96 * local61 + (local56 - local61) * local73) / local56;
			arg0.anInt7207 = (local61 * local108 + local85 * (local56 - local61)) / local56;
		}
		arg0.anInt6612 = 0;
		if (arg0.anInt6580 == 0) {
			arg0.method5517(8192);
		}
		if (arg0.anInt6580 == 1) {
			arg0.method5517(12288);
		}
		if (arg0.anInt6580 == 2) {
			arg0.method5517(0);
		}
		if (arg0.anInt6580 == 3) {
			arg0.method5517(4096);
		}
	}
}
