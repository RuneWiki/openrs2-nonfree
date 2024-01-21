import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Z")
	public static boolean aBoolean5;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_55 = Static118.method2249("FULL");

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "Lclient!oc;")
	public static Class65 aClass65_56 = aClass65_55;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	public static int anInt96 = 0;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_58 = Static118.method2249("<br>");

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_59 = Static118.method2249("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIII)V")
	public static void method64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(5) int local5 = 0; local5 < Static126.anInt3109; local5++) {
			if (arg2 < Static105.anIntArray295[local5] + Static195.anIntArray481[local5] && arg3 + arg2 > Static195.anIntArray481[local5] && Static168.anIntArray351[local5] + Static183.anIntArray449[local5] > arg0 && Static168.anIntArray351[local5] < arg1 + arg0) {
				Static197.aBooleanArray18[local5] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Lclient!ig;")
	public static Class1_Sub2_Sub13 method65(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub2_Sub13 local15 = (Class1_Sub2_Sub13) Static19.aClass87_12.method3062((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(29) byte[] local29 = Static47.aClass60_9.method2340(Static183.method2978(arg0), Static101.method1912(arg0));
		local15 = new Class1_Sub2_Sub13();
		local15.anInt1998 = arg0;
		if (local29 != null) {
			local15.method1427(new Class1_Sub14(local29));
		}
		local15.method1433();
		if (local15.aBoolean90) {
			local15.aBoolean87 = false;
			local15.anInt2004 = 0;
		}
		Static19.aClass87_12.method3068(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method67() {
		Static53.aClass20_1.method1108();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static100.aLongArray5[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static25.aLongArray1[local22] = 0L;
		}
		Static116.anInt2830 = 0;
	}
}
