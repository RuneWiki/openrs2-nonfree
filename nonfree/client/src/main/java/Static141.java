import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!rg", name = "S", descriptor = "Lclient!hh;")
	public static Interface2 anInterface2_2;

	@OriginalMember(owner = "client!rg", name = "V", descriptor = "[Lclient!cb;")
	public static Class8[] aClass8Array1;

	@OriginalMember(owner = "client!rg", name = "W", descriptor = "[Lclient!pa;")
	public static Class2_Sub17[] aClass2_Sub17Array1;

	@OriginalMember(owner = "client!rg", name = "D", descriptor = "Lclient!sa;")
	public static Class72 aClass72_23 = new Class72(20);

	@OriginalMember(owner = "client!rg", name = "X", descriptor = "Lclient!kg;")
	public static Class2_Sub11_Sub1 aClass2_Sub11_Sub1_3 = new Class2_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!rg", name = "Y", descriptor = "I")
	public static int anInt3138 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!rg", name = "Z", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1376 = Static51.method932("Loaded config");

	@OriginalMember(owner = "client!rg", name = "ab", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1377 = aClass10_1376;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	public static void method2231(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static76.method1263(arg0)) {
			return;
		}
		@Pc(19) Class23[] local19 = Static90.aClass23ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class23 local27 = local19[local21];
			if (local27.anObjectArray8 != null) {
				@Pc(34) Class2_Sub18 local34 = new Class2_Sub18();
				local34.anObjectArray29 = local27.anObjectArray8;
				local34.aClass23_9 = local27;
				Static47.method881(local34);
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
	public static void method2232() {
		aClass10_1377 = null;
		anInterface2_2 = null;
		aClass8Array1 = null;
		aClass2_Sub17Array1 = null;
		aClass10_1376 = null;
		aClass72_23 = null;
		aClass2_Sub11_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
	public static void method2235() {
		Static154.aClass72_25.method2261();
		Static136.aClass72_22.method2261();
	}
}
