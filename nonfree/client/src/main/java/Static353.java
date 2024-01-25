import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!no", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23;

	@OriginalMember(owner = "client!no", name = "m", descriptor = "Lclient!em;")
	public static final Class83 aClass83_137 = new Class83(101, -2);

	@OriginalMember(owner = "client!no", name = "q", descriptor = "[I")
	public static final int[] anIntArray386 = new int[1];

	@OriginalMember(owner = "client!no", name = "r", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_81 = new Class208(41, 7);

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IBII)V")
	public static void method5269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 * Static86.aClass1_Sub30_Sub1_1.anInt6189 >> 8;
		if (arg0 == -1 && !Static11.aBoolean8) {
			Static340.method5066();
		} else if (arg0 != -1 && (arg0 != Static106.anInt1789 || !Static389.method5594()) && local10 != 0 && !Static11.aBoolean8) {
			Static46.method767(Static51.aClass308_24, arg1, local10, arg0);
			Static115.method1625();
		}
		if (Static106.anInt1789 != arg0) {
			Static80.aClass1_Sub6_Sub2_3 = null;
		}
		Static106.anInt1789 = arg0;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!sea;Lclient!laa;)V")
	public static void method5270(@OriginalArg(1) Class308 arg0, @OriginalArg(2) Class198 arg1) {
		Static500.aClass198_4 = arg1;
		Static102.aClass308_40 = arg0;
		Static461.aString90 = "";
		if (Class1_Sub11_Sub2.aString104.startsWith("win")) {
			Static461.aString90 = Static461.aString90 + "windows/";
		} else if (Class1_Sub11_Sub2.aString104.startsWith("linux")) {
			Static461.aString90 = Static461.aString90 + "linux/";
		} else if (Class1_Sub11_Sub2.aString104.startsWith("mac")) {
			Static461.aString90 = Static461.aString90 + "macos/";
		}
		if (Static500.aClass198_4.aBoolean402) {
			Static461.aString90 = Static461.aString90 + "msjava/";
		} else if (Class1_Sub11_Sub2.aString103.startsWith("amd64") || Class1_Sub11_Sub2.aString103.startsWith("x86_64")) {
			Static461.aString90 = Static461.aString90 + "x86_64/";
		} else if (Class1_Sub11_Sub2.aString103.startsWith("i386") || Class1_Sub11_Sub2.aString103.startsWith("i486") || Class1_Sub11_Sub2.aString103.startsWith("i586") || Class1_Sub11_Sub2.aString103.startsWith("x86")) {
			Static461.aString90 = Static461.aString90 + "x86/";
		} else if (Class1_Sub11_Sub2.aString103.startsWith("ppc")) {
			Static461.aString90 = Static461.aString90 + "ppc/";
		} else {
			Static461.aString90 = Static461.aString90 + "universal/";
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLclient!ac;)Lclient!rk;")
	public static Class1_Sub1 method5271(@OriginalArg(1) Class1_Sub3 arg0) {
		arg0.method7974();
		@Pc(13) int local13 = arg0.method7974();
		@Pc(22) Class1_Sub1 local22 = Static89.method1395(local13);
		local22.anInt9640 = arg0.method7974();
		@Pc(31) int local31 = arg0.method7974();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method7974();
			local22.method7835(local39, arg0);
		}
		local22.method7831();
		return local22;
	}
}
