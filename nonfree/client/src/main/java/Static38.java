import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cj", name = "Cb", descriptor = "Lclient!fc;")
	public static Class71 aClass71_11;

	@OriginalMember(owner = "client!cj", name = "X", descriptor = "S")
	public static short aShort13 = 320;

	@OriginalMember(owner = "client!cj", name = "bb", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_18 = new Class77(84, 2);

	@OriginalMember(owner = "client!cj", name = "ub", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!cj", name = "Fb", descriptor = "[I")
	public static final int[] anIntArray126 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILjava/lang/String;Lclient!dq;)Lclient!a;")
	public static Class1 method819(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class53 arg2) {
		if (arg0 == 0) {
			return arg2.method1186(arg1);
		}
		@Pc(41) Class1 local41;
		if (arg0 == 1) {
			try {
				Static400.method4008(arg2.anApplet1, "openjs", new Object[] { (new URL(arg2.anApplet1.getCodeBase(), arg1)).toString() });
				local41 = new Class1();
				local41.anInt2 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class1();
				local41.anInt2 = 2;
				return local41;
			}
		} else if (arg0 == 2) {
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg1), "_blank");
				local41 = new Class1();
				local41.anInt2 = 1;
				return local41;
			} catch (@Pc(92) Exception local92) {
				local41 = new Class1();
				local41.anInt2 = 2;
				return local41;
			}
		} else if (arg0 == 3) {
			try {
				Static400.method4007(arg2.anApplet1, "loggedout");
			} catch (@Pc(114) Throwable local114) {
			}
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg1), "_top");
				local41 = new Class1();
				local41.anInt2 = 1;
				return local41;
			} catch (@Pc(136) Exception local136) {
				local41 = new Class1();
				local41.anInt2 = 2;
				return local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method828(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static236.method3861(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static379.anInt1197; local33++) {
			@Pc(39) String local39 = Static235.aStringArray28[local33];
			if (local39.startsWith("*")) {
				local39 = local39.substring(1);
			}
			local39 = Static236.method3861(local39);
			if (local39 != null && local39.equals(local20)) {
				Static379.anInt1197--;
				for (@Pc(63) int local63 = local33; local63 < Static379.anInt1197; local63++) {
					Static235.aStringArray28[local63] = Static235.aStringArray28[local63 + 1];
					Static217.aStringArray24[local63] = Static217.aStringArray24[local63 + 1];
					Static184.aStringArray42[local63] = Static184.aStringArray42[local63 + 1];
					Static93.aStringArray11[local63] = Static93.aStringArray11[local63 + 1];
					Static275.aBooleanArray114[local63] = Static275.aBooleanArray114[local63 + 1];
				}
				Static357.anInt882 = Static180.anInt3216;
				Static19.method552(Static71.aClass41_31);
				Static39.aClass2_Sub13_Sub2_4.method4207(Static346.method5273(arg0));
				Static39.aClass2_Sub13_Sub2_4.method4230(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!js;Lclient!js;I)V")
	public static void method830(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) Class2_Sub1 arg1) {
		if (arg0.aClass2_Sub1_53 != null) {
			arg0.method5748();
		}
		arg0.aClass2_Sub1_54 = arg1.aClass2_Sub1_54;
		arg0.aClass2_Sub1_53 = arg1;
		arg0.aClass2_Sub1_53.aClass2_Sub1_54 = arg0;
		arg0.aClass2_Sub1_54.aClass2_Sub1_53 = arg0;
	}
}
