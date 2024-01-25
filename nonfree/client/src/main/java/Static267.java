import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
	public static int anInt5687;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method4634(@OriginalArg(1) String arg0) {
		return Static156.method3173(mi.class, arg0);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method4636(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class331 local13 = Static201.method3722(arg0, arg3);
		if (local13 == null) {
			return;
		}
		if (local13.anObjectArray10 != null) {
			@Pc(23) Class8_Sub40 local23 = new Class8_Sub40();
			local23.aClass331_14 = local13;
			local23.aString78 = arg2;
			local23.anObjectArray2 = local13.anObjectArray10;
			local23.anInt7836 = arg1;
			Static273.method4698(local23);
		}
		if (Static435.anInt8191 != 10 || !Static73.method1921(local13).method5220(arg1 - 1)) {
			return;
		}
		@Pc(65) Class8_Sub31 local65;
		if (arg1 == 1) {
			local65 = Static51.method1418(Static290.aClass257_54, Static608.aClass336_1);
			Static614.method5488(local13.anInt9570, arg3, arg0, local65);
			Static262.method4604(local65);
		}
		if (arg1 == 2) {
			local65 = Static51.method1418(Static290.aClass257_53, Static608.aClass336_1);
			Static614.method5488(local13.anInt9570, arg3, arg0, local65);
			Static262.method4604(local65);
		}
		if (arg1 == 3) {
			local65 = Static51.method1418(Static600.aClass257_117, Static608.aClass336_1);
			Static614.method5488(local13.anInt9570, arg3, arg0, local65);
			Static262.method4604(local65);
		}
		if (arg1 == 4) {
			local65 = Static51.method1418(Static607.aClass257_77, Static608.aClass336_1);
			Static614.method5488(local13.anInt9570, arg3, arg0, local65);
			Static262.method4604(local65);
		}
		if (arg1 == 5) {
			local65 = Static51.method1418(Static554.aClass257_105, Static608.aClass336_1);
			Static614.method5488(local13.anInt9570, arg3, arg0, local65);
			Static262.method4604(local65);
		}
		if (arg1 == 6) {
			local65 = Static51.method1418(Static197.aClass257_41, Static608.aClass336_1);
			Static614.method5488(local13.anInt9570, arg3, arg0, local65);
			Static262.method4604(local65);
		}
		if (arg1 == 7) {
			local65 = Static51.method1418(Static45.aClass257_13, Static608.aClass336_1);
			Static614.method5488(local13.anInt9570, arg3, arg0, local65);
			Static262.method4604(local65);
		}
		if (arg1 == 8) {
			local65 = Static51.method1418(Static553.aClass257_104, Static608.aClass336_1);
			Static614.method5488(local13.anInt9570, arg3, arg0, local65);
			Static262.method4604(local65);
		}
		if (arg1 == 9) {
			local65 = Static51.method1418(Static575.aClass257_112, Static608.aClass336_1);
			Static614.method5488(local13.anInt9570, arg3, arg0, local65);
			Static262.method4604(local65);
		}
		if (arg1 == 10) {
			local65 = Static51.method1418(Static509.aClass257_96, Static608.aClass336_1);
			Static614.method5488(local13.anInt9570, arg3, arg0, local65);
			Static262.method4604(local65);
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BLjava/lang/String;Ljava/io/File;)V")
	public static void method4638(@OriginalArg(1) String arg0, @OriginalArg(2) File arg1) {
		Static505.aHashtable6.put(arg0, arg1);
	}
}
