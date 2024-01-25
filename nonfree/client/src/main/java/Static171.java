import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static171 {

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "I")
	public static int anInt5360 = 0;

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "Lclient!ua;")
	public static final Class358 aClass358_12 = new Class358(4);

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "S")
	public static short aShort59 = 1;

	@OriginalMember(owner = "client!gaa", name = "f", descriptor = "I")
	public static int anInt5361 = -1;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
	public static int anInt5362 = 0;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)I")
	public static int method4815(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method4817(@OriginalArg(1) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BZLclient!sja;)V")
	public static void method4818(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class5_Sub50 arg1) {
		if (arg1.aBoolean575) {
			if (arg1.anInt8728 < 0 || Static17.method270(arg1.anInt8718, arg1.anInt8728)) {
				if (arg0) {
					Static24.method383(arg1.anInt8723, (Class87) null, arg1.anInt8717, arg1.anInt8725, arg1.anInt8721);
				} else {
					Static528.method7231(arg1.anInt8721, arg1.anInt8725, arg1.anInt8718, arg1.anInt8717, arg1.anInt8723, arg1.anInt8728, -1, arg1.anInt8719);
				}
				arg1.method9222();
			}
		} else if (arg1.aBoolean576 && arg1.anInt8721 >= 1 && arg1.anInt8723 >= 1 && arg1.anInt8721 <= Static271.anInt4910 - 2 && Static613.anInt9909 - 2 >= arg1.anInt8723 && (arg1.anInt8727 < 0 || Static17.method270(arg1.anInt8724, arg1.anInt8727))) {
			if (arg0) {
				Static24.method383(arg1.anInt8723, arg1.aClass87_2, arg1.anInt8717, arg1.anInt8725, arg1.anInt8721);
			} else {
				Static528.method7231(arg1.anInt8721, arg1.anInt8725, arg1.anInt8724, arg1.anInt8717, arg1.anInt8723, arg1.anInt8727, -1, arg1.anInt8729);
			}
			arg1.aBoolean576 = false;
			if (!arg0 && arg1.anInt8728 == arg1.anInt8727 && arg1.anInt8728 == -1) {
				arg1.method9222();
			} else if (!arg0 && arg1.anInt8727 == arg1.anInt8728 && arg1.anInt8719 == arg1.anInt8729 && arg1.anInt8718 == arg1.anInt8724) {
				arg1.method9222();
			}
		}
	}
}
