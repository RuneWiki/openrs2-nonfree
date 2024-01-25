import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!no", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString47;

	@OriginalMember(owner = "client!no", name = "J", descriptor = "Z")
	public static boolean aBoolean372 = false;

	@OriginalMember(owner = "client!no", name = "L", descriptor = "Lclient!em;")
	public static Class68 aClass68_11 = null;

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(B)V")
	public static void method3989() {
		if (Static20.aString3.length() == 0) {
			return;
		}
		Static99.method1879("--> " + Static20.aString3);
		Static443.method5711(false, Static20.aString3);
		Static20.aString3 = "";
		Static341.anInt2745 = 0;
		Static174.anInt3461 = 0;
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(II)Lclient!wl;")
	public static Class267 method3990(@OriginalArg(0) int arg0) {
		@Pc(16) Class267 local16 = (Class267) Static379.aClass171_51.method3941((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(28) byte[] local28 = Static416.aClass160_80.method3696(arg0, 1);
		local16 = new Class267();
		local16.anInt7253 = arg0;
		if (local28 != null) {
			local16.method5725(new Class2_Sub23(local28));
		}
		local16.method5724();
		if (local16.anInt7254 == 2 && Static166.aClass163_21.method3769((long) arg0) == null) {
			Static166.aClass163_21.method3764((long) arg0, new Class2_Sub26(Static130.anInt2806));
			Static317.aClass267Array1[Static130.anInt2806++] = local16;
		}
		Static379.aClass171_51.method3940((long) arg0, local16);
		return local16;
	}

	@OriginalMember(owner = "client!no", name = "g", descriptor = "(I)V")
	public static void method3991() {
		Static248.aClass17Array10 = null;
		Static359.aClass17Array14 = null;
		Static114.aClass116_1 = null;
		Static224.aClass17Array8 = null;
		Static226.aClass17Array7 = null;
		Static416.aClass17Array16 = null;
		Static131.aClass17Array5 = null;
		Static368.aClass116_4 = null;
		Static246.aClass17Array9 = null;
		Static291.aClass116_3 = null;
		Static100.aClass17Array4 = null;
		Static147.aClass17_50 = null;
		Static81.aClass17Array2 = null;
		Static279.aClass17Array12 = null;
		Static333.aClass17Array13 = null;
		Static388.aClass17Array15 = null;
		Static31.aClass17_4 = null;
		Static270.aClass17Array11 = null;
	}
}
