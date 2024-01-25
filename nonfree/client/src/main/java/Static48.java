import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "Lclient!ri;")
	public static final Class303 aClass303_1 = new Class303();

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean60 = true;

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "[I")
	public static final int[] anIntArray65 = new int[2];

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
	public static int anInt995 = 0;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;I)V")
	public static void method827(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1) {
		Static460.aHashtable5.put(arg1, arg0);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLclient!la;Lclient!ha;)V")
	public static void method831(@OriginalArg(1) Class207 arg0, @OriginalArg(2) Class133 arg1) {
		@Pc(10) Class131[] local10 = Static649.method2892(arg0, Static57.anInt1136);
		Static197.aClass28Array22 = new Class28[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static197.aClass28Array22[local16] = arg1.method7297(local10[local16], true);
		}
		local10 = Static649.method2892(arg0, Static395.anInt6578);
		Static146.aClass28Array3 = new Class28[local10.length];
		for (@Pc(52) int local52 = 0; local52 < local10.length; local52++) {
			Static146.aClass28Array3[local52] = arg1.method7297(local10[local52], true);
		}
		local10 = Static649.method2892(arg0, Static400.anInt6696);
		Static217.aClass28Array9 = new Class28[local10.length];
		for (@Pc(79) int local79 = 0; local79 < local10.length; local79++) {
			Static217.aClass28Array9[local79] = arg1.method7297(local10[local79], true);
		}
		local10 = Static649.method2892(arg0, Static411.anInt7150);
		Static613.aClass28Array21 = new Class28[local10.length];
		for (@Pc(110) int local110 = 0; local110 < local10.length; local110++) {
			Static613.aClass28Array21[local110] = arg1.method7297(local10[local110], true);
		}
		local10 = Static649.method2892(arg0, Static193.anInt8325);
		Static207.aClass28Array8 = new Class28[local10.length];
		for (@Pc(141) int local141 = 0; local141 < local10.length; local141++) {
			Static207.aClass28Array8[local141] = arg1.method7297(local10[local141], true);
		}
		local10 = Static649.method2892(arg0, Static139.anInt2427);
		Static160.aClass28Array20 = new Class28[local10.length];
		for (@Pc(172) int local172 = 0; local172 < local10.length; local172++) {
			Static160.aClass28Array20[local172] = arg1.method7297(local10[local172], true);
		}
		local10 = Static649.method2892(arg0, Static119.anInt2202);
		Static114.aClass28Array2 = new Class28[local10.length];
		for (@Pc(199) int local199 = 0; local199 < local10.length; local199++) {
			Static114.aClass28Array2[local199] = arg1.method7297(local10[local199], true);
		}
		local10 = Static649.method2892(arg0, Static70.anInt1419);
		Static273.aClass28Array13 = new Class28[local10.length];
		for (@Pc(226) int local226 = 0; local226 < local10.length; local226++) {
			Static273.aClass28Array13[local226] = arg1.method7297(local10[local226], true);
		}
		local10 = Static649.method2892(arg0, Static325.anInt5510);
		Static386.aClass28Array18 = new Class28[local10.length];
		for (@Pc(253) int local253 = 0; local253 < local10.length; local253++) {
			Static386.aClass28Array18[local253] = arg1.method7297(local10[local253], true);
		}
		local10 = Static649.method2892(arg0, Static540.anInt9191);
		Static556.aClass28Array19 = new Class28[local10.length];
		for (@Pc(280) int local280 = 0; local280 < local10.length; local280++) {
			Static556.aClass28Array19[local280] = arg1.method7297(local10[local280], true);
		}
		local10 = Static649.method2892(arg0, Static343.anInt5776);
		Static262.aClass28Array12 = new Class28[local10.length];
		for (@Pc(307) int local307 = 0; local307 < local10.length; local307++) {
			Static262.aClass28Array12[local307] = arg1.method7297(local10[local307], true);
		}
		local10 = Static649.method2892(arg0, Static60.anInt1159);
		Static562.aClass28Array15 = new Class28[local10.length];
		for (@Pc(334) int local334 = 0; local334 < local10.length; local334++) {
			Static562.aClass28Array15[local334] = arg1.method7297(local10[local334], true);
		}
		Static477.aClass28_28 = arg1.method7297(Static649.method2888(arg0, Static36.anInt577, 0), true);
		Static17.aClass28_2 = arg1.method7297(Static649.method2888(arg0, Static124.anInt2268, 0), true);
		local10 = Static649.method2892(arg0, Static409.anInt3104);
		Static351.aClass28Array16 = new Class28[local10.length];
		for (@Pc(381) int local381 = 0; local381 < local10.length; local381++) {
			Static351.aClass28Array16[local381] = arg1.method7297(local10[local381], true);
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)I")
	public static int method833() {
		return Static464.method6866(false);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(BI)I")
	public static int method834(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
