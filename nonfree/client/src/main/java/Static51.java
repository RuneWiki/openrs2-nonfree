import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
	public static final int anInt1865 = 1;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "([BZB)Ljava/lang/Object;")
	public static Object method1759(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static208.aBoolean348) {
			try {
				@Pc(25) Class12 local25 = (Class12) Class.forName("Class12_Sub1").getDeclaredConstructor().newInstance();
				local25.method5580(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static208.aBoolean348 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)I")
	public static int method1761(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;Lclient!wea;ZZI)V")
	public static void method1762(@OriginalArg(0) String arg0, @OriginalArg(1) Class370 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3) {
			Static336.method5804(arg1, arg0, 3);
			return;
		}
		@Pc(14) String local14;
		if (Static623.aString117.startsWith("win") && arg1.aBoolean739) {
			local14 = null;
			if (Static334.anApplet2 != null) {
				local14 = Static334.anApplet2.getParameter("haveie6");
			}
			if (local14 == null || !local14.equals("1")) {
				@Pc(32) Class240 local32 = Static336.method5804(arg1, arg0, 0);
				Static578.aClass240_12 = local32;
				Static471.aClass370_4 = arg1;
				Static461.aString90 = arg0;
				return;
			}
		}
		if (Static623.aString117.startsWith("mac")) {
			local14 = null;
			if (Static334.anApplet2 != null) {
				local14 = Static334.anApplet2.getParameter("havefirefox");
			}
			if (local14 != null && local14.equals("1") && arg2) {
				Static336.method5804(arg1, arg0, 1);
				return;
			}
		}
		Static336.method5804(arg1, arg0, 2);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IBLclient!cea;)V")
	public static void method1767(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (Static174.aClass184_2 == null) {
			return;
		}
		try {
			Static174.aClass184_2.method5460(0L);
			Static174.aClass184_2.method5454(arg0, 24, arg1.aByteArray128);
		} catch (@Pc(19) Exception local19) {
		}
	}
}
