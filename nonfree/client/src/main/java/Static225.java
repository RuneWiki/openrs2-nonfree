import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!ln", name = "A", descriptor = "[[I")
	public static int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "Lclient!em;")
	public static Class68 aClass68_9 = null;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
	public static void method3523() {
		if (Static33.aClass49_1 == null) {
			return;
		}
		Static222.aClass112_8.method2549();
		Static86.method3567();
		Static154.method2542();
		Static210.method3331();
		Static208.method3299();
		Static331.method4591();
		if (Static441.aClass242_2 != null) {
			Static441.aClass242_2.method5220();
		}
		Static206.method3260();
		Static372.method2347();
		Static266.method3991();
		Static251.method5213(false);
		Static359.method4898();
		for (@Pc(44) int local44 = 0; local44 < 2048; local44++) {
			@Pc(50) Class3_Sub2_Sub1_Sub2 local50 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local44];
			if (local50 != null) {
				local50.aClass2_Sub13_3 = null;
				for (@Pc(57) int local57 = 0; local57 < local50.aClass91Array3.length; local57++) {
					local50.aClass91Array3[local57] = null;
				}
			}
		}
		for (@Pc(82) int local82 = 0; local82 < Static174.aClass3_Sub2_Sub1_Sub1Array1.length; local82++) {
			@Pc(88) Class3_Sub2_Sub1_Sub1 local88 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local82];
			if (local88 != null) {
				for (@Pc(92) int local92 = 0; local92 < local88.aClass91Array3.length; local92++) {
					local88.aClass91Array3[local92] = null;
				}
			}
		}
		Static33.aClass49_1.method4437();
		Static33.aClass49_1 = null;
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V")
	public static void method3531() {
		if (Static96.aBoolean166) {
			return;
		}
		if (Static12.aClass79_Sub1_1.aBoolean363) {
			Static287.aFloat74 = (int) Static287.aFloat74 - 17 & 0xFFFFFFF0;
		} else {
			Static286.aFloat73 += (-Static286.aFloat73 - 12.0F) / 2.0F;
		}
		Static243.aBoolean333 = true;
		Static96.aBoolean166 = true;
	}
}
