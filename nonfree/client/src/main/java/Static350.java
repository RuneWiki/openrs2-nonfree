import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
	public static int anInt7029;

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "[I")
	public static int[] anIntArray481;

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "[I")
	public static int[] anIntArray483;

	@OriginalMember(owner = "client!vs", name = "z", descriptor = "J")
	public static long aLong222;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB)Z", line = 101)
	public static boolean method6280(@OriginalArg(0) int arg0) {
		@Pc(7) Class3_Sub1 local7 = Static7.method6468(arg0);
		if (local7 == null) {
			return false;
		} else if (Class152.anInt3791 == 3) {
			@Pc(39) String local39 = "";
			if (Static114.aClass127_4 != Class132.aClass127_6) {
				local39 = ":" + (local7.anInt81 + 7000);
			}
			@Pc(55) String local55 = "";
			if (Class59.aString17 != null) {
				local55 = "/p=" + Class59.aString17;
			}
			@Pc(109) String local109 = "http://" + local7.aString2 + local39 + "/l=" + Class197.anInt5569 + "/a=" + Class116.anInt3145 + local55 + "/j" + (Class185.aBoolean375 ? "1" : "0") + ",o" + (Class162.aBoolean298 ? "1" : "0") + ",a2";
			try {
				Static135.aClient1.getAppletContext().showDocument(new URL(local109), "_self");
				return true;
			} catch (@Pc(119) Exception local119) {
				return false;
			}
		} else {
			Class87.anInt2382 = local7.anInt81;
			Static201.aString36 = local7.aString2;
			if (Static114.aClass127_4 != Class132.aClass127_6) {
				Static16.anInt4748 = Class87.anInt2382 + 40000;
				Static307.anInt6181 = Class87.anInt2382 + 50000;
				Static81.anInt1841 = Static16.anInt4748;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V", line = 184)
	public static void method6282() {
		Static242.aBoolean330 = true;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BII)V", line = 199)
	public static void method6283(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub2_Sub7 local8 = Static293.method5414(13, arg1);
		local8.method2313();
		local8.anInt2286 = arg0;
	}
}
