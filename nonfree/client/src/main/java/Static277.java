import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!o", name = "e", descriptor = "I")
	public static int anInt4877;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Lclient!f;")
	public static Class3 aClass3_14;

	@OriginalMember(owner = "client!o", name = "v", descriptor = "I")
	public static int anInt4890;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "[I")
	public static final int[] anIntArray441 = new int[1000];

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZILclient!hu;Ljava/lang/String;)Lclient!hh;")
	public static Class108 method3726(@OriginalArg(1) int arg0, @OriginalArg(2) Class114 arg1, @OriginalArg(3) String arg2) {
		if (arg0 == 0) {
			return arg1.method2354(arg2);
		}
		@Pc(43) Class108 local43;
		if (arg0 == 1) {
			try {
				Static459.method3565("openjs", arg1.anApplet1, new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg2)).toString() });
				local43 = new Class108();
				local43.anInt2803 = 1;
				return local43;
			} catch (@Pc(49) Throwable local49) {
				local43 = new Class108();
				local43.anInt2803 = 2;
				return local43;
			}
		} else if (arg0 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_blank");
				local43 = new Class108();
				local43.anInt2803 = 1;
				return local43;
			} catch (@Pc(83) Exception local83) {
				local43 = new Class108();
				local43.anInt2803 = 2;
				return local43;
			}
		} else if (arg0 == 3) {
			try {
				Static459.method3567(arg1.anApplet1, "loggedout");
			} catch (@Pc(105) Throwable local105) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_top");
				local43 = new Class108();
				local43.anInt2803 = 1;
				return local43;
			} catch (@Pc(127) Exception local127) {
				local43 = new Class108();
				local43.anInt2803 = 2;
				return local43;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method3727() {
		Static220.aClass69_50.method1600();
		Static123.aClass69_69.method1600();
		Static454.aClass69_72.method1600();
		Static242.aClass69_48.method1600();
		Static273.aClass69_44.method1600();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
	public static void method3728(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub1_Sub8 local13 = Static416.method5456(0, 15);
		local13.method2762();
		local13.anInt3611 = arg1;
		local13.anInt3610 = arg0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IILclient!rk;I)V")
	public static void method3729(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt6068 == arg2 && arg2 != -1) {
			@Pc(20) Class233 local20 = Static269.aClass10_1.method286(arg2);
			@Pc(23) int local23 = local20.anInt6742;
			if (local23 == 1) {
				arg1.anInt6089 = 1;
				arg1.anInt6136 = 0;
				arg1.anInt6091 = 0;
				arg1.anInt6080 = 0;
				arg1.anInt6117 = arg0;
				Static374.method5106(false, arg1.anInt6091, arg1.aByte86, local20, arg1.anInt6062, arg1.anInt6061);
			}
			if (local23 == 2) {
				arg1.anInt6136 = 0;
				return;
			}
		} else if (arg2 == -1 || arg1.anInt6068 == -1 || Static269.aClass10_1.method286(arg2).anInt6754 >= Static269.aClass10_1.method286(arg1.anInt6068).anInt6754) {
			arg1.anInt6117 = arg0;
			arg1.anInt6068 = arg2;
			arg1.anInt6091 = 0;
			arg1.anInt6145 = arg1.anInt6147;
			arg1.anInt6080 = 0;
			arg1.anInt6089 = 1;
			arg1.anInt6136 = 0;
			if (arg1.anInt6068 == -1) {
				return;
			}
			Static374.method5106(false, arg1.anInt6091, arg1.aByte86, Static269.aClass10_1.method286(arg1.anInt6068), arg1.anInt6062, arg1.anInt6061);
		}
	}
}
