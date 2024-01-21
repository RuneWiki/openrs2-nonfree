import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "Lclient!ld;")
	public static Class48 aClass48_3 = new Class48();

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1231 = Static170.method3101("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1232 = Static170.method3101("Sorry invited players only)3");

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
	public static int anInt3669 = 0;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1233 = aClass28_1232;

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1234 = aClass28_1231;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
	public static int anInt3673 = 0;

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
	public static int anInt3674 = 0;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1235 = Static170.method3101("Drop");

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1236 = aClass28_1235;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
	public static void method2799() {
		aClass28_1236 = null;
		aClass28_1231 = null;
		aClass48_3 = null;
		aClass28_1234 = null;
		aClass28_1235 = null;
		aClass28_1232 = null;
		aClass28_1233 = null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)V")
	public static void method2801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(4) Class3_Sub18 local4 = (Class3_Sub18) Static108.aClass23_11.method858(); local4 != null; local4 = (Class3_Sub18) Static108.aClass23_11.method861()) {
			if (local4.anInt3248 != -1 || local4.anIntArray562 != null) {
				@Pc(22) int local22 = 0;
				if (local4.anInt3253 < arg0) {
					local22 = arg0 - local4.anInt3253;
				} else if (local4.anInt3237 > arg0) {
					local22 = local4.anInt3237 - arg0;
				}
				if (local4.anInt3250 < arg2) {
					local22 += arg2 - local4.anInt3250;
				} else if (local4.anInt3240 > arg2) {
					local22 += local4.anInt3240 - arg2;
				}
				if (local4.anInt3246 < local22 - 64 || Static138.anInt3540 == 0 || local4.anInt3238 != arg1) {
					if (local4.aClass3_Sub3_Sub1_3 != null) {
						Static157.aClass3_Sub3_Sub4_2.method2851(local4.aClass3_Sub3_Sub1_3);
						local4.aClass3_Sub3_Sub1_3 = null;
					}
					if (local4.aClass3_Sub3_Sub1_2 != null) {
						Static157.aClass3_Sub3_Sub4_2.method2851(local4.aClass3_Sub3_Sub1_2);
						local4.aClass3_Sub3_Sub1_2 = null;
					}
				} else {
					local22 -= 64;
					if (local22 < 0) {
						local22 = 0;
					}
					@Pc(130) int local130 = Static138.anInt3540 * (local4.anInt3246 - local22) / local4.anInt3246;
					if (local4.aClass3_Sub3_Sub1_3 != null) {
						local4.aClass3_Sub3_Sub1_3.method435(local130);
					} else if (local4.anInt3248 >= 0) {
						@Pc(145) Class51 local145 = Static187.method2099(Static127.aClass7_Sub1_14, local4.anInt3248, 0);
						if (local145 != null) {
							@Pc(152) Class3_Sub13_Sub1 local152 = local145.method2100().method2062(Static35.aClass83_1);
							@Pc(157) Class3_Sub3_Sub1 local157 = Static183.method434(local152, local130);
							local157.method460(-1);
							Static157.aClass3_Sub3_Sub4_2.method2850(local157);
							local4.aClass3_Sub3_Sub1_3 = local157;
						}
					}
					if (local4.aClass3_Sub3_Sub1_2 != null) {
						local4.aClass3_Sub3_Sub1_2.method435(local130);
						if (!local4.aClass3_Sub3_Sub1_2.method3165()) {
							local4.aClass3_Sub3_Sub1_2 = null;
						}
					} else if (local4.anIntArray562 != null && (local4.anInt3251 -= arg3) <= 0) {
						@Pc(206) int local206 = (int) ((double) local4.anIntArray562.length * Math.random());
						@Pc(214) Class51 local214 = Static187.method2099(Static127.aClass7_Sub1_14, local4.anIntArray562[local206], 0);
						if (local214 != null) {
							@Pc(221) Class3_Sub13_Sub1 local221 = local214.method2100().method2062(Static35.aClass83_1);
							@Pc(226) Class3_Sub3_Sub1 local226 = Static183.method434(local221, local130);
							local226.method460(0);
							Static157.aClass3_Sub3_Sub4_2.method2850(local226);
							local4.anInt3251 = local4.anInt3254 + (int) ((double) (local4.anInt3234 - local4.anInt3254) * Math.random());
							local4.aClass3_Sub3_Sub1_2 = local226;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)I")
	public static int method2803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
