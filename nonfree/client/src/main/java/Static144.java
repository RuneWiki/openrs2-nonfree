import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!gs", name = "P", descriptor = "Lclient!ia;")
	public static Class40 aClass40_3;

	@OriginalMember(owner = "client!gs", name = "R", descriptor = "Z")
	public static boolean aBoolean180 = false;

	@OriginalMember(owner = "client!gs", name = "S", descriptor = "I")
	public static int anInt2432 = 0;

	@OriginalMember(owner = "client!gs", name = "W", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray21 = new String[5];

	@OriginalMember(owner = "client!gs", name = "Y", descriptor = "I")
	public static int anInt2437 = 64;

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(ZI)I")
	public static int method1904(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIILclient!oq;)V")
	public static void method1906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class20_Sub3_Sub3_Sub1 arg2) {
		if (arg2.anInt6051 == arg0 && arg0 != -1) {
			@Pc(20) Class171 local20 = Static152.aClass213_1.method4410(arg0);
			@Pc(23) int local23 = local20.anInt4256;
			if (local23 == 1) {
				arg2.anInt6039 = 0;
				arg2.anInt6022 = 1;
				arg2.anInt6053 = 0;
				arg2.anInt6040 = arg1;
				arg2.anInt6044 = 0;
				Static7.method4909(arg2.anInt6616, arg2.anInt6613, arg2.aByte89, Static239.aClass20_Sub3_Sub3_Sub1_1 == arg2, local20, arg2.anInt6044);
			}
			if (local23 == 2) {
				arg2.anInt6053 = 0;
				return;
			}
		} else if (arg0 == -1 || arg2.anInt6051 == -1 || Static152.aClass213_1.method4410(arg0).anInt4262 >= Static152.aClass213_1.method4410(arg2.anInt6051).anInt4262) {
			arg2.anInt6039 = 0;
			arg2.anInt6087 = arg2.anInt6088;
			arg2.anInt6022 = 1;
			arg2.anInt6044 = 0;
			arg2.anInt6040 = arg1;
			arg2.anInt6053 = 0;
			arg2.anInt6051 = arg0;
			if (arg2.anInt6051 == -1) {
				return;
			}
			Static7.method4909(arg2.anInt6616, arg2.anInt6613, arg2.aByte89, arg2 == Static239.aClass20_Sub3_Sub3_Sub1_1, Static152.aClass213_1.method4410(arg2.anInt6051), arg2.anInt6044);
		}
	}

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "(B)V")
	public static void method1907() {
		if (Static257.anInt6932 < 0) {
			Static323.anInt5318 = -1;
			Static257.anInt6932 = 0;
			Static113.anInt2002 = -1;
		}
		if (Static114.anInt6796 < Static257.anInt6932) {
			Static257.anInt6932 = Static114.anInt6796;
			Static113.anInt2002 = -1;
			Static323.anInt5318 = -1;
		}
		if (Static2.anInt3076 < 0) {
			Static113.anInt2002 = -1;
			Static323.anInt5318 = -1;
			Static2.anInt3076 = 0;
		}
		if (Static2.anInt3076 > Static114.anInt6803) {
			Static113.anInt2002 = -1;
			Static323.anInt5318 = -1;
			Static2.anInt3076 = Static114.anInt6803;
		}
	}
}
