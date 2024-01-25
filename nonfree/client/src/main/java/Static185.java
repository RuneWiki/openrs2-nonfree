import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!iu", name = "E", descriptor = "Lclient!l;")
	public static Interface8 anInterface8_55;

	@OriginalMember(owner = "client!iu", name = "J", descriptor = "I")
	public static int anInt3145 = 0;

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "(I)V")
	public static void method2530() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static222.aBooleanArray12[local3] = false;
		}
		Static399.anInt6507 = 0;
		Static294.anInt4616 = -1;
		Static199.anInt3310 = 0;
		Static449.anInt7379 = 1;
		Static412.anInt6868 = -1;
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(III)I")
	public static int method2531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)Z")
	public static boolean method2532(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static252.anInt4106; local1 < Static96.anInt1667; local1++) {
			@Pc(6) Class258[][] local6 = Static319.aClass258ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Static70.anInt1271; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static448.anInt7370 + local9;
				@Pc(18) int local18 = Static448.anInt7370 - local9;
				if (local14 >= Static415.anInt6927 || local18 < Static150.anInt2696) {
					for (@Pc(27) int local27 = -Static70.anInt1271; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static17.anInt369 + local27;
						@Pc(36) int local36 = Static17.anInt369 - local27;
						@Pc(48) Class258 local48;
						if (local14 >= Static415.anInt6927) {
							if (local32 >= Static401.anInt2163) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean489) {
									Static119.aBoolean233 = arg0;
									Static449.aClass77_1.method2858(local48);
									Static449.aClass77_1.method2849();
								}
							}
							if (local36 < Static182.anInt3095) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean489) {
									Static119.aBoolean233 = arg0;
									Static449.aClass77_1.method2858(local48);
									Static449.aClass77_1.method2849();
								}
							}
						}
						if (local18 < Static150.anInt2696) {
							if (local32 >= Static401.anInt2163) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean489) {
									Static119.aBoolean233 = arg0;
									Static449.aClass77_1.method2858(local48);
									Static449.aClass77_1.method2849();
								}
							}
							if (local36 < Static182.anInt3095) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean489) {
									Static119.aBoolean233 = arg0;
									Static449.aClass77_1.method2858(local48);
									Static449.aClass77_1.method2849();
								}
							}
						}
						if (Static272.anInt4295 == 0) {
							if (Static272.aBoolean285) {
								Static449.aClass77_1.method2859(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
