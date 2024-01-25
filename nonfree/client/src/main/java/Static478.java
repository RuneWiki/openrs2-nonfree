import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!uaa", name = "D", descriptor = "Lclient!qa;")
	public static Class9 aClass9_10;

	@OriginalMember(owner = "client!uaa", name = "G", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!uaa", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString70;

	@OriginalMember(owner = "client!uaa", name = "J", descriptor = "Lclient!wca;")
	public static Class1_Sub50 aClass1_Sub50_3;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BILclient!faa;II)V")
	public static void method6930(@OriginalArg(1) int arg0, @OriginalArg(2) Class47_Sub2_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class255 local11 = arg1.method4356();
		@Pc(21) int local21 = arg1.anInt5037 - arg1.aClass146_7.anInt4511 & 0x3FFF;
		if (arg2 == -1) {
			if (local21 != 0 || arg1.anInt5059 > 25) {
				if (arg3 < 0 && local11.anInt7284 != -1) {
					arg1.anInt5039 = local11.anInt7284;
				} else if (arg3 <= 0 || local11.anInt7261 == -1) {
					arg1.anInt5039 = local11.anInt7263;
				} else {
					arg1.anInt5039 = local11.anInt7261;
				}
				arg1.aBoolean343 = false;
			} else if (!arg1.aBoolean343 || !local11.method6213(arg1.anInt5039)) {
				arg1.anInt5039 = local11.method6216();
				arg1.aBoolean343 = arg1.anInt5039 != -1;
			}
		} else if (arg1.anInt5061 != -1 && (local21 >= 10240 || local21 <= 2048)) {
			@Pc(111) int local111 = Static148.anIntArray268[arg0] - arg1.aClass146_7.anInt4511 & 0x3FFF;
			if (arg2 == 2 && local11.anInt7262 != -1) {
				if (local111 > 2048 && local111 <= 6144 && local11.anInt7259 != -1) {
					arg1.anInt5039 = local11.anInt7259;
				} else if (local111 >= 10240 && local111 < 14336 && local11.anInt7300 != -1) {
					arg1.anInt5039 = local11.anInt7300;
				} else if (local111 <= 6144 || local111 >= 10240 || local11.anInt7278 == -1) {
					arg1.anInt5039 = local11.anInt7262;
				} else {
					arg1.anInt5039 = local11.anInt7278;
				}
			} else if (arg2 == 0 && local11.anInt7288 != -1) {
				if (local111 > 2048 && local111 <= 6144 && local11.anInt7287 != -1) {
					arg1.anInt5039 = local11.anInt7287;
				} else if (local111 >= 10240 && local111 < 14336 && local11.anInt7268 != -1) {
					arg1.anInt5039 = local11.anInt7268;
				} else if (local111 <= 6144 || local111 >= 10240 || local11.anInt7270 == -1) {
					arg1.anInt5039 = local11.anInt7288;
				} else {
					arg1.anInt5039 = local11.anInt7270;
				}
			} else if (local111 > 2048 && local111 <= 6144 && local11.anInt7255 != -1) {
				arg1.anInt5039 = local11.anInt7255;
			} else if (local111 >= 10240 && local111 < 14336 && local11.anInt7256 != -1) {
				arg1.anInt5039 = local11.anInt7256;
			} else if (local111 <= 6144 || local111 >= 10240 || local11.anInt7276 == -1) {
				arg1.anInt5039 = local11.anInt7263;
			} else {
				arg1.anInt5039 = local11.anInt7276;
			}
			arg1.aBoolean343 = false;
		} else if (local21 == 0 && arg1.anInt5059 <= 25) {
			if (arg2 == 2 && local11.anInt7262 != -1) {
				arg1.anInt5039 = local11.anInt7262;
			} else if (arg2 == 0 && local11.anInt7288 != -1) {
				arg1.anInt5039 = local11.anInt7288;
			} else {
				arg1.anInt5039 = local11.anInt7263;
			}
			arg1.aBoolean343 = false;
		} else {
			if (arg2 == 2 && local11.anInt7262 != -1) {
				if (arg3 < 0 && local11.anInt7273 != -1) {
					arg1.anInt5039 = local11.anInt7273;
				} else if (arg3 <= 0 || local11.anInt7291 == -1) {
					arg1.anInt5039 = local11.anInt7262;
				} else {
					arg1.anInt5039 = local11.anInt7291;
				}
			} else if (arg2 == 0 && local11.anInt7288 != -1) {
				if (arg3 < 0 && local11.anInt7272 != -1) {
					arg1.anInt5039 = local11.anInt7272;
				} else if (arg3 <= 0 || local11.anInt7299 == -1) {
					arg1.anInt5039 = local11.anInt7288;
				} else {
					arg1.anInt5039 = local11.anInt7299;
				}
			} else if (arg3 < 0 && local11.anInt7274 != -1) {
				arg1.anInt5039 = local11.anInt7274;
			} else if (arg3 <= 0 || local11.anInt7283 == -1) {
				arg1.anInt5039 = local11.anInt7263;
			} else {
				arg1.anInt5039 = local11.anInt7283;
			}
			arg1.aBoolean343 = false;
		}
	}
}
