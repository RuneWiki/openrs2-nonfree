import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!wr", name = "U", descriptor = "Lclient!za;")
	public static Class50 aClass50_11;

	@OriginalMember(owner = "client!wr", name = "Y", descriptor = "I")
	public static int anInt7588;

	@OriginalMember(owner = "client!wr", name = "N", descriptor = "I")
	public static int anInt7583 = 0;

	@OriginalMember(owner = "client!wr", name = "O", descriptor = "Lclient!s;")
	public static final Class217 aClass217_162 = new Class217(45, 4);

	@OriginalMember(owner = "client!wr", name = "Q", descriptor = "[B")
	public static final byte[] aByteArray95 = new byte[2048];

	@OriginalMember(owner = "client!wr", name = "T", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray58 = new String[8];

	@OriginalMember(owner = "client!wr", name = "V", descriptor = "Lclient!s;")
	public static final Class217 aClass217_163 = new Class217(58, -2);

	@OriginalMember(owner = "client!wr", name = "W", descriptor = "Lclient!s;")
	public static final Class217 aClass217_164 = new Class217(78, 0);

	@OriginalMember(owner = "client!wr", name = "X", descriptor = "I")
	public static int anInt7587 = 13156520;

	@OriginalMember(owner = "client!wr", name = "Z", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_112 = new Class27(54, 3);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method6048(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (Static240.anInt4376 != 3) {
			Static87.aClass21_2 = new Class21();
			Static87.aClass21_2.anInt407 = arg1;
			Static87.aClass21_2.aString5 = arg0;
			if (Static110.aClass151_5 != Static284.aClass151_8) {
				Static87.aClass21_2.anInt411 = Static87.aClass21_2.anInt407 + 40000;
				Static87.aClass21_2.anInt404 = Static87.aClass21_2.anInt407 + 50000;
			}
			return true;
		}
		@Pc(43) String local43 = "";
		if (Static284.aClass151_8 != Static110.aClass151_5) {
			local43 = ":" + (arg1 + 7000);
		}
		@Pc(58) String local58 = "";
		if (Static407.aString68 != null) {
			local58 = "/p=" + Static407.aString68;
		}
		@Pc(106) String local106 = "http://" + arg0 + local43 + "/l=" + Static191.anInt3842 + "/a=" + Static298.anInt5158 + local58 + "/j" + (Static414.aBoolean454 ? "1" : "0") + ",o" + (Static46.aBoolean50 ? "1" : "0") + ",a2";
		try {
			Static232.aClient5.getAppletContext().showDocument(new URL(local106), "_self");
			return true;
		} catch (@Pc(116) Exception local116) {
			return false;
		}
	}

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)V")
	public static void method6050() {
		if (Static240.anInt4376 == 2) {
			Static108.anInt2167 = 96;
			return;
		}
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("maxMemory");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Long local31 = (Long) local21.invoke(local25, (Object[]) null);
					Static108.anInt2167 = (int) (local31 / 1048576L) + 1;
				} catch (@Pc(41) Throwable local41) {
				}
			}
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)V")
	public static void method6051() {
		if (!Static401.aBoolean489) {
			return;
		}
		@Pc(16) Class89 local16 = Static397.method5275(Static219.anInt4156, Static273.anInt4773);
		if (local16 != null && local16.anObjectArray18 != null) {
			@Pc(25) Class10_Sub40 local25 = new Class10_Sub40();
			local25.aClass89_12 = local16;
			local25.anObjectArray36 = local16.anObjectArray18;
			Static79.method1501(local25);
		}
		Static228.anInt4243 = -1;
		Static401.aBoolean489 = false;
		Static40.anInt656 = -1;
		if (local16 != null) {
			Static135.method5400(local16);
		}
	}
}
