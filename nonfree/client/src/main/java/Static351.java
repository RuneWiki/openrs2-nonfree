import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!nda", name = "Q", descriptor = "[Z")
	public static boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!nda", name = "R", descriptor = "I")
	public static int anInt6111;

	@OriginalMember(owner = "client!nda", name = "T", descriptor = "Lclient!ib;")
	public static final Class140 aClass140_16 = new Class140(3, 2);

	@OriginalMember(owner = "client!nda", name = "e", descriptor = "(I)V")
	public static void method5158() {
		if (Static505.aClass45_11 == null) {
			return;
		}
		Static212.aClass178_7.method4162();
		Static244.method3782();
		Static512.method6889();
		Static123.method2518();
		Static437.method6114();
		Static516.method6929();
		if (Static84.aClass350_1 != null) {
			Static84.aClass350_1.method7334();
		}
		Static188.method6385();
		Static495.method6690();
		Static171.method3055();
		Static333.method4749();
		Static314.method4613(false);
		for (@Pc(33) int local33 = 0; local33 < 2048; local33++) {
			@Pc(39) Class41_Sub2_Sub1_Sub4_Sub2 local39 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local33];
			if (local39 != null) {
				for (@Pc(43) int local43 = 0; local43 < local39.aClass60Array3.length; local43++) {
					local39.aClass60Array3[local43] = null;
				}
			}
		}
		for (@Pc(62) int local62 = 0; local62 < Static137.anInt2977; local62++) {
			@Pc(69) Class41_Sub2_Sub1_Sub4_Sub1 local69 = Static441.aClass3_Sub34Array1[local62].aClass41_Sub2_Sub1_Sub4_Sub1_2;
			if (local69 != null) {
				for (@Pc(73) int local73 = 0; local73 < local69.aClass60Array3.length; local73++) {
					local69.aClass60Array3[local73] = null;
				}
			}
		}
		Static472.aClass11_6 = null;
		Static338.aClass11_4 = null;
		Static505.aClass45_11.method7387();
		Static505.aClass45_11 = null;
	}
}
