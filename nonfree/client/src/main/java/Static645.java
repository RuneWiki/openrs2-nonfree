import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static645 {

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
	public static int anInt10073;

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "Z")
	public static boolean aBoolean735 = true;

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "Lclient!hl;")
	public static final Class148 aClass148_20 = new Class148(6, 1);

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "Lclient!in;")
	public static final Class169 aClass169_244 = new Class169(3, 6);

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
	public static int anInt10074 = 0;

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "Lclient!in;")
	public static final Class169 aClass169_245 = new Class169(70, 17);

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
	public static int anInt10075 = 0;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BZI)V")
	public static void method8760(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub42 local8 = Static47.method979(arg0, arg1);
		if (local8 != null) {
			local8.method9825();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIILclient!uf;)V")
	public static void method8762(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class357 arg2) {
		if (arg2.aByte134 == 0) {
			arg2.anInt10431 = arg2.anInt10477;
		} else if (arg2.aByte134 == 1) {
			arg2.anInt10431 = (arg0 - arg2.anInt10395) / 2 + arg2.anInt10477;
		} else if (arg2.aByte134 == 2) {
			arg2.anInt10431 = arg0 - arg2.anInt10395 - arg2.anInt10477;
		} else if (arg2.aByte134 == 3) {
			arg2.anInt10431 = arg2.anInt10477 * arg0 >> 14;
		} else if (arg2.aByte134 == 4) {
			arg2.anInt10431 = (arg0 * arg2.anInt10477 >> 14) + (arg0 - arg2.anInt10395) / 2;
		} else {
			arg2.anInt10431 = arg0 - (arg2.anInt10477 * arg0 >> 14) - arg2.anInt10395;
		}
		if (arg2.aByte135 == 0) {
			arg2.anInt10407 = arg2.anInt10391;
		} else if (arg2.aByte135 == 1) {
			arg2.anInt10407 = arg2.anInt10391 + (arg1 - arg2.anInt10465) / 2;
		} else if (arg2.aByte135 == 2) {
			arg2.anInt10407 = arg1 - arg2.anInt10465 - arg2.anInt10391;
		} else if (arg2.aByte135 == 3) {
			arg2.anInt10407 = arg2.anInt10391 * arg1 >> 14;
		} else if (arg2.aByte135 == 4) {
			arg2.anInt10407 = (arg1 - arg2.anInt10465) / 2 + (arg1 * arg2.anInt10391 >> 14);
		} else {
			arg2.anInt10407 = arg1 - (arg1 * arg2.anInt10391 >> 14) - arg2.anInt10465;
		}
		if (!Static214.aBoolean351) {
			return;
		}
		if (Static85.method1469(arg2).anInt1168 == 0 && arg2.anInt10430 != 0) {
			return;
		}
		if (arg2.anInt10407 < 0) {
			arg2.anInt10407 = 0;
		} else if (arg1 < arg2.anInt10465 + arg2.anInt10407) {
			arg2.anInt10407 = arg1 - arg2.anInt10465;
		}
		if (arg2.anInt10431 < 0) {
			arg2.anInt10431 = 0;
			return;
		}
		if (arg2.anInt10395 + arg2.anInt10431 > arg0) {
			arg2.anInt10431 = arg0 - arg2.anInt10395;
			return;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
	public static void method8763() {
		Static282.anIntArray265 = null;
		Static17.anInterface17Array7 = null;
		Static584.anInt4542 = -1;
		Static25.aClass76_1 = null;
		Static255.anInt4904 = -1;
		Static387.anInt7331 = -1;
		Static64.anInterface17_1 = null;
		Static481.aClass76_14 = null;
		Static435.aClass101_11 = null;
		Static283.anInt5221 = -1;
		Static568.aClass76_15 = null;
		Static480.aClass217_3.method5978();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method8764(@OriginalArg(1) String arg0) {
		if (Class346.aString114.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class346.aString114.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class346.aString114.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
