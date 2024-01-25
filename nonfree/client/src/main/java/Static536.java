import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "Lclient!jn;")
	public static Class176 aClass176_128;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
	public static int anInt9532 = 0;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method7777(@OriginalArg(0) String arg0) {
		Static450.aString79 = arg0;
		if (Static110.anApplet1 == null) {
			return;
		}
		try {
			@Pc(18) String local18 = Static110.anApplet1.getParameter("cookieprefix");
			@Pc(22) String local22 = Static110.anApplet1.getParameter("cookiehost");
			@Pc(37) String local37 = local18 + "settings=" + arg0 + "; version=1; path=/; domain=" + local22;
			if (arg0.length() == 0) {
				local37 = local37 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local37 = local37 + "; Expires=" + Static223.method3623(Static574.method8210() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static604.method8250(Static110.anApplet1, "document.cookie=\"" + local37 + "\"");
		} catch (@Pc(88) Throwable local88) {
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIILclient!dn;Lclient!dn;)V")
	public static void method7778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub4_Sub1 arg3, @OriginalArg(4) Class1_Sub4_Sub1 arg4) {
		@Pc(4) Class53 local4 = Static351.method7422(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass1_Sub4_Sub1_2 = arg3;
		local4.aClass1_Sub4_Sub1_1 = arg4;
		@Pc(19) int local19 = Static499.aClass83Array3 == Static183.aClass83Array6 ? 1 : 0;
		if (!arg3.method8118()) {
			Static27.aClass1_Sub4ArrayArray1[local19][Static2.anIntArray3[local19]++] = arg3;
		} else if (arg3.method8128()) {
			Static343.aClass1_Sub4ArrayArray3[local19][Static291.anIntArray291[local19]++] = arg3;
		} else {
			Static124.aClass1_Sub4ArrayArray4[local19][Static156.anIntArray148[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8118()) {
			if (arg4.method8128()) {
				Static343.aClass1_Sub4ArrayArray3[local19][Static291.anIntArray291[local19]++] = arg4;
				return;
			}
			Static124.aClass1_Sub4ArrayArray4[local19][Static156.anIntArray148[local19]++] = arg4;
			return;
		}
		Static27.aClass1_Sub4ArrayArray1[local19][Static2.anIntArray3[local19]++] = arg4;
	}
}
