import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
	public static int anInt147;

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
	public static int anInt149;

	@OriginalMember(owner = "client!ad", name = "L", descriptor = "[Lclient!cp;")
	public static Class48_Sub1[] aClass48_Sub1Array1 = new Class48_Sub1[0];

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
	public static void method125() {
		for (@Pc(6) Class36_Sub7 local6 = (Class36_Sub7) Static158.aClass242_2.method5503(); local6 != null; local6 = (Class36_Sub7) Static158.aClass242_2.method5506()) {
			local6.method4875();
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(Z)V")
	public static void method126() {
		if (Static129.anIntArray174 != null && Static108.anIntArray110 != null) {
			return;
		}
		Static108.anIntArray110 = new int[256];
		Static129.anIntArray174 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static129.anIntArray174[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static108.anIntArray110[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/lang/String;BII)V")
	public static void method128(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class229 local8 = Static99.method1611(arg0, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray14 != null) {
			@Pc(18) Class1_Sub16 local18 = new Class1_Sub16();
			local18.anInt2538 = arg3;
			local18.anObjectArray1 = local8.anObjectArray14;
			local18.aClass229_4 = local8;
			local18.aString43 = arg1;
			Static354.method5070(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt6893 != 0) {
			local35 = Static413.method5602(local8);
		}
		if (!local35 || !Static51.method751(local8).method961(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static224.method3272(Static143.aClass254_52);
			Static425.method5719(local8.anInt6918, arg2, arg0);
		}
		if (arg3 == 2) {
			Static224.method3272(Static161.aClass254_62);
			Static425.method5719(local8.anInt6918, arg2, arg0);
		}
		if (arg3 == 3) {
			Static224.method3272(Static46.aClass254_42);
			Static425.method5719(local8.anInt6918, arg2, arg0);
		}
		if (arg3 == 4) {
			Static224.method3272(Static69.aClass254_28);
			Static425.method5719(local8.anInt6918, arg2, arg0);
		}
		if (arg3 == 5) {
			Static224.method3272(Static421.aClass254_140);
			Static425.method5719(local8.anInt6918, arg2, arg0);
		}
		if (arg3 == 6) {
			Static224.method3272(Static244.aClass254_142);
			Static425.method5719(local8.anInt6918, arg2, arg0);
		}
		if (arg3 == 7) {
			Static224.method3272(Static133.aClass254_50);
			Static425.method5719(local8.anInt6918, arg2, arg0);
		}
		if (arg3 == 8) {
			Static224.method3272(Static387.aClass254_129);
			Static425.method5719(local8.anInt6918, arg2, arg0);
		}
		if (arg3 == 9) {
			Static224.method3272(Static208.aClass254_81);
			Static425.method5719(local8.anInt6918, arg2, arg0);
		}
		if (arg3 == 10) {
			Static224.method3272(Static152.aClass254_57);
			Static425.method5719(local8.anInt6918, arg2, arg0);
		}
	}
}
