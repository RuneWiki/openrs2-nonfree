import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!re", name = "N", descriptor = "Lclient!s;")
	public static final Class217 aClass217_132 = new Class217(7, 18);

	@OriginalMember(owner = "client!re", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString53 = null;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IILclient!sf;Z)V")
	public static void method4693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class24_Sub3_Sub2_Sub2 arg2) {
		if (arg2.anInt6211 == arg1 && arg1 != -1) {
			@Pc(93) Class137 local93 = Static281.aClass98_3.method2405(arg1);
			@Pc(96) int local96 = local93.anInt4039;
			if (local96 == 1) {
				arg2.anInt6222 = 0;
				arg2.anInt6271 = 1;
				arg2.anInt6231 = 0;
				arg2.anInt6264 = 0;
				arg2.anInt6250 = arg0;
				Static302.method4200(local93, arg2.anInt7092, arg2.anInt7094, arg2.aByte98, arg2.anInt6231, arg2 == Static263.aClass24_Sub3_Sub2_Sub2_4);
			}
			if (local96 == 2) {
				arg2.anInt6264 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt6211 == -1 || Static281.aClass98_3.method2405(arg1).anInt4040 >= Static281.aClass98_3.method2405(arg2.anInt6211).anInt4040) {
			arg2.anInt6264 = 0;
			arg2.anInt6271 = 1;
			arg2.anInt6222 = 0;
			arg2.anInt6291 = arg2.anInt6288;
			arg2.anInt6211 = arg1;
			arg2.anInt6250 = arg0;
			arg2.anInt6231 = 0;
			if (arg2.anInt6211 != -1) {
				Static302.method4200(Static281.aClass98_3.method2405(arg2.anInt6211), arg2.anInt7092, arg2.anInt7094, arg2.aByte98, arg2.anInt6231, arg2 == Static263.aClass24_Sub3_Sub2_Sub2_4);
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)V")
	public static void method4694() {
		if (Static389.aClass270_6 == null) {
			return;
		}
		if (Static389.aClass270_6.anInt7548 == 1) {
			Static389.aClass270_6 = null;
			return;
		}
		if (Static389.aClass270_6.anInt7548 == 2) {
			Static251.method4761(2, Static322.aClass159_3, Static373.aString61);
			Static389.aClass270_6 = null;
			return;
		}
	}
}
