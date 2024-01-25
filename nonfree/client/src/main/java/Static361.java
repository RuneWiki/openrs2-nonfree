import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!fr;")
	public static Class85_Sub1 aClass85_Sub1_1;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	public static int anInt6151;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
	public static final int[] anIntArray600 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	public static int anInt6149 = -2;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Z")
	public static boolean aBoolean397 = false;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public static void method4857() {
		Static115.aClass163_23 = new Class163();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!za;)V")
	public static void method4858(@OriginalArg(0) Class50 arg0) {
		for (@Pc(1) int local1 = Static222.anInt4181; local1 < Static285.anInt5004; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static54.anInt998; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static24.anInt401; local7++) {
					@Pc(16) Class11 local16 = Static309.aClass11ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class24_Sub5 local21 = local16.aClass24_Sub5_1;
						@Pc(24) Class24_Sub5 local24 = local16.aClass24_Sub5_2;
						if (local21 != null && local21.method5692()) {
							Static34.method475(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5692()) {
								Static34.method475(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5687(0, 0, local21, arg0, false, 0);
								local24.method5690();
							}
							local21.method5690();
						}
						for (@Pc(70) Class1 local70 = local16.aClass1_3; local70 != null; local70 = local70.aClass1_1) {
							@Pc(74) Class24_Sub3 local74 = local70.aClass24_Sub3_1;
							if (local74 != null && local74.method5692()) {
								Static34.method475(arg0, local74, local1, local4, local7, local74.aShort106 + 1 - local74.aShort107, local74.aShort104 - local74.aShort105 + 1);
								local74.method5690();
							}
						}
						@Pc(111) Class24_Sub4 local111 = local16.aClass24_Sub4_1;
						if (local111 != null && local111.method5692()) {
							Static116.method2044(arg0, local111, local1, local4, local7);
							local111.method5690();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZIIIII)V")
	public static void method4859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 >= Static115.anInt2362 && arg6 <= Static146.anInt3034 && arg1 >= Static319.anInt5496 && Static160.anInt3220 >= arg5) {
			Static138.method5380(arg2, arg0, arg5, arg4, arg3, arg1, arg6);
		} else {
			Static364.method4886(arg3, arg2, arg4, arg1, arg0, arg6, arg5);
		}
	}
}
