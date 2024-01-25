import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "Lclient!wo;")
	public static Class216 aClass216_23;

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
	public static int anInt1845;

	@OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
	public static int anInt1848;

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_54 = new Class34("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
	public static int anInt1846 = 0;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
	public static void method1627() {
		Static125.anInt2818 = 0;
		Static113.anInt2650 = 0;
		Static278.method4853();
		Static267.method4699();
		Static198.method884();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static113.anInt2650; local17++) {
			local23 = Static87.anIntArray210[local17];
			if (Static140.aClass17_Sub1_Sub1_Sub2Array1[local23].anInt4852 != Static5.anInt208) {
				if (Static140.aClass17_Sub1_Sub1_Sub2Array1[local23].aClass213_1.method5491()) {
					Static82.method1816(Static140.aClass17_Sub1_Sub1_Sub2Array1[local23]);
				}
				Static140.aClass17_Sub1_Sub1_Sub2Array1[local23].method4332(null);
				Static140.aClass17_Sub1_Sub1_Sub2Array1[local23] = null;
			}
		}
		if (Static85.anInt5393 != Static311.aClass1_Sub8_Sub1_8.anInt5182) {
			throw new RuntimeException("gnp1 pos:" + Static311.aClass1_Sub8_Sub1_8.anInt5182 + " psize:" + Static85.anInt5393);
		}
		for (local23 = 0; local23 < Static5.anInt200; local23++) {
			if (Static140.aClass17_Sub1_Sub1_Sub2Array1[Static171.anIntArray333[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static5.anInt200);
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII)I")
	public static int method1628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)V")
	public static void method1629(@OriginalArg(1) boolean arg0) {
		@Pc(19) byte local19;
		@Pc(17) byte[][] local17;
		if (arg0) {
			local17 = Static263.aByteArrayArray16;
			local19 = 1;
		} else {
			local17 = Static305.aByteArrayArray22;
			local19 = 4;
		}
		for (@Pc(27) int local27 = 0; local27 < local19; local27++) {
			Static63.method4863();
			for (@Pc(33) int local33 = 0; local33 < Static233.anInt5573 >> 3; local33++) {
				for (@Pc(37) int local37 = 0; local37 < Static134.anInt2971 >> 3; local37++) {
					@Pc(47) int local47 = Static133.anIntArrayArrayArray8[local27][local33][local37];
					if (local47 != -1) {
						@Pc(57) int local57 = local47 >> 24 & 0x3;
						if (!arg0 || local57 == 0) {
							@Pc(67) int local67 = local47 >> 1 & 0x3;
							@Pc(73) int local73 = local47 >> 14 & 0x3FF;
							@Pc(79) int local79 = local47 >> 3 & 0x7FF;
							@Pc(89) int local89 = local79 / 8 + (local73 / 8 << 8);
							for (@Pc(91) int local91 = 0; local91 < Static222.anIntArray416.length; local91++) {
								if (local89 == Static222.anIntArray416[local91] && local17[local91] != null) {
									Static86.method1866(Static29.aClass71Array1, local57, local33 * 8, local17[local91], (local73 & 0x7) * 8, local27, local67, arg0, (local79 & 0x7) * 8, Static208.aClass32_11, local37 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
