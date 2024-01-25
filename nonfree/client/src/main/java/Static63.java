import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "[I")
	public static int[] anIntArray65;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_19 = new Class303(39, 3);

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "F")
	public static float aFloat30 = 0.0F;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Lclient!ko;")
	public static final Class183 aClass183_3 = new Class183("LIVE", 0);

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "[I")
	public static int[] anIntArray64 = new int[4];

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
	public static int anInt1479 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Z")
	public static boolean method1398() {
		try {
			if (Static565.anInt9228 == 2) {
				if (Static96.aClass3_Sub24_1 == null) {
					Static96.aClass3_Sub24_1 = Static602.method3228(Static24.aClass322_5, Static91.anInt1912, Static361.anInt8636);
					if (Static96.aClass3_Sub24_1 == null) {
						return false;
					}
				}
				if (Static392.aClass160_1 == null) {
					Static392.aClass160_1 = new Class160(Static91.aClass322_31, Static535.aClass322_147);
				}
				if (Static323.aClass3_Sub4_Sub3_2.method6349(Static392.aClass160_1, Static274.aClass322_94, Static96.aClass3_Sub24_1)) {
					Static323.aClass3_Sub4_Sub3_2.method6362();
					if (Static410.anInt7034 <= 0) {
						Static565.anInt9228 = 0;
						Static323.aClass3_Sub4_Sub3_2.method6354(Static225.anInt3978);
					} else {
						Static565.anInt9228 = 3;
						Static323.aClass3_Sub4_Sub3_2.method6354(0);
					}
					if (Static187.aLong102 <= 0L) {
						Static323.aClass3_Sub4_Sub3_2.method6336(Static96.aClass3_Sub24_1, Static218.aBoolean295);
					} else {
						Static323.aClass3_Sub4_Sub3_2.method6337(Static187.aLong102, Static218.aBoolean295, Static96.aClass3_Sub24_1);
					}
					Static187.aLong102 = 0L;
					Static24.aClass322_5 = null;
					Static392.aClass160_1 = null;
					Static96.aClass3_Sub24_1 = null;
					return true;
				}
			}
		} catch (@Pc(95) Exception local95) {
			local95.printStackTrace();
			Static323.aClass3_Sub4_Sub3_2.method6335();
			Static565.anInt9228 = 0;
			Static392.aClass160_1 = null;
			Static96.aClass3_Sub24_1 = null;
			Static24.aClass322_5 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIII)I")
	public static int method1399(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(8) int local8 = arg1;
			arg1 = arg3;
			arg3 = local8;
		}
		@Pc(16) int local16 = arg5 & 0x3;
		if (local16 == 0) {
			return arg2;
		} else if (local16 == 1) {
			return arg4;
		} else if (local16 == 2) {
			return 1 + 7 - arg1 - arg2;
		} else {
			return 7 + 1 - arg4 - arg3;
		}
	}
}
