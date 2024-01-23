import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "[Lclient!rg;")
	public static Class145[] aClass145Array4;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Z")
	public static boolean aBoolean528 = true;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString219 = "Please remove ";

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString220 = "Loading title screen - ";

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "[I")
	public static int[] anIntArray612 = new int[2];

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIZI)V")
	public static void method4652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1_Sub5_Sub13 local9 = Static28.method511(arg0, arg1, arg2);
		if (local9 == null) {
			return;
		}
		Static254.aStringArray31 = new String[local9.anInt3155];
		Static212.anIntArray452 = new int[local9.anInt3162];
		if (local9.anInt3158 == 15 || local9.anInt3158 == 17 || local9.anInt3158 == 16) {
			@Pc(39) int local39 = 0;
			@Pc(41) int local41 = 0;
			if (Static73.aClass157_8 != null) {
				local41 = Static73.aClass157_8.anInt4715;
				local39 = Static73.aClass157_8.anInt4729;
			}
			Static212.anIntArray452[0] = Static89.anInt1899 - local39;
			Static212.anIntArray452[1] = Static14.anInt309 - local41;
		}
		Static314.method4674(200000, local9);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!hm;ILclient!nm;Lclient!nm;)V")
	public static void method4657(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) Class119 arg1, @OriginalArg(3) Class119 arg2) {
		Static201.aClass119_71 = arg1;
		Static247.anInterface4_2 = arg0;
		Static312.aClass119_95 = arg2;
		if (Static312.aClass119_95 != null) {
			Static14.anInt310 = Static312.aClass119_95.method3217(1);
		}
		if (Static201.aClass119_71 != null) {
			Static242.anInt4493 = Static201.aClass119_71.method3217(1);
		}
	}
}
