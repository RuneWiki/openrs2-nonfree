import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
	public static int anInt4170;

	@OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
	public static int anInt4174;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public static int anInt4166 = 0;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public static int anInt4168 = 1;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
	public static int anInt4169 = -1;

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BZ)V")
	public static void method3650(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static271.aClass11_Sub4_Sub7_2 != null) {
			Static164.anInt3087 = Static271.aClass11_Sub4_Sub7_2.anInt1916;
		} else {
			Static164.anInt3087 = -1;
		}
		Static238.aClass137_14 = null;
		Static4.aClass16_1 = null;
		Static145.anInt2660 = 0;
		Static271.aClass11_Sub4_Sub7_2 = null;
		Static271.method3822();
		Static271.aClass16_37.method191();
		Static271.aClass199_3 = null;
		Static155.anInt2944 = -1;
		Static307.anInt4795 = -1;
		Static287.aClass30_7 = null;
		Static71.aClass30_2 = null;
		Static16.aClass30_1 = null;
		Static244.aClass30_6 = null;
		Static306.aClass30_8 = null;
		Static237.aClass30_5 = null;
		Static89.aClass97_12 = null;
		Static221.aClass30_4 = null;
		Static124.aClass30_3 = null;
		Static70.method1056();
		Static85.method1232(64, 128);
		Static200.method3610(64, 64);
		Static349.method5645(64);
		Static129.method1988(64);
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
	public static void method3652() {
		Static262.anInt5355 = 0;
		Static90.anInt4650 = 0;
		Static249.method4345();
		Static258.method4483();
		Static63.method932();
		Static242.method4806();
		@Pc(33) int local33;
		for (@Pc(19) int local19 = 0; local19 < Static262.anInt5355; local19++) {
			local33 = Static223.anIntArray344[local19];
			if (Static105.aClass67_Sub3_Sub3_Sub2Array1[local33].anInt5010 != Static293.anInt5807) {
				if (Static105.aClass67_Sub3_Sub3_Sub2Array1[local33].anInt5079 > 0) {
					Static308.method5156(Static105.aClass67_Sub3_Sub3_Sub2Array1[local33]);
				}
				Static105.aClass67_Sub3_Sub3_Sub2Array1[local33] = null;
			}
		}
		if (Static246.aClass11_Sub25_Sub1_3.anInt6076 != Static315.anInt6163) {
			throw new RuntimeException("gpp1 pos:" + Static246.aClass11_Sub25_Sub1_3.anInt6076 + " psize:" + Static315.anInt6163);
		}
		for (local33 = 0; local33 < Static331.anInt6366; local33++) {
			if (Static105.aClass67_Sub3_Sub3_Sub2Array1[Static87.anIntArray104[local33]] == null) {
				throw new RuntimeException("gpp2 pos:" + local33 + " size:" + Static331.anInt6366);
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!ms;I)Z")
	public static boolean method3653(@OriginalArg(0) Class137 arg0) {
		if (arg0.anInt4093 == 205) {
			Static186.anInt3761 = 250;
			return true;
		} else {
			return false;
		}
	}
}
