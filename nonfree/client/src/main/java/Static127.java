import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "[I")
	public static final int[] anIntArray204 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "S")
	public static short aShort46 = 256;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_84 = new Class107(7, 4);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZB)V")
	public static void method2242(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static168.aClass1_Sub2_Sub11_2 != null) {
			Static305.anInt5269 = Static168.aClass1_Sub2_Sub11_2.anInt5676;
		} else {
			Static305.anInt5269 = -1;
		}
		Static168.aClass1_Sub2_Sub11_2 = null;
		Static137.aClass181_23 = null;
		Static301.anInt5202 = 0;
		Static325.aClass251_9 = null;
		Static168.method427();
		Static168.aClass181_3.method4101();
		Static201.aClass271_6 = null;
		Static154.aClass271_9 = null;
		Static248.aClass271_8 = null;
		Static408.aClass271_10 = null;
		Static129.anInt3956 = -1;
		Static343.aClass143_32 = null;
		Static168.aClass45_2 = null;
		Static132.aClass271_5 = null;
		Static223.aClass271_7 = null;
		Static161.anInt3016 = -1;
		Static44.aClass271_3 = null;
		Static58.aClass271_4 = null;
		Static168.aClass78_2.method2115();
		Static168.aClass217_4.method4895(64, 64);
		Static168.aClass78_2.method2111(64, 128);
		Static168.aClass115_2.method2770(64);
		Static45.aClass36_4.method874(64);
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	public static void method2244() {
		@Pc(17) int[] local17 = new int[Static165.aClass19_1.anInt579];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < Static165.aClass19_1.anInt579; local21++) {
			@Pc(28) Class152 local28 = Static165.aClass19_1.method560(local21);
			if (local28.anInt4177 >= 0 || local28.anInt4144 >= 0) {
				local17[local19++] = local21;
			}
		}
		Static302.anIntArray450 = new int[local19];
		for (@Pc(53) int local53 = 0; local53 < local19; local53++) {
			Static302.anIntArray450[local53] = local17[local53];
		}
	}
}
