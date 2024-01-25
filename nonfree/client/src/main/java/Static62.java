import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "Lclient!ss;")
	public static Class216 aClass216_4;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "[I")
	public static final int[] anIntArray163 = new int[1000];

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_41 = new Class221("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z")
	public static boolean method1133(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static201.anInt4804; local1 < Static32.anInt6037; local1++) {
			@Pc(6) Class227[][] local6 = Static297.aClass227ArrayArrayArray7[local1];
			for (@Pc(9) int local9 = -Static273.anInt4882; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static33.anInt702 + local9;
				@Pc(18) int local18 = Static33.anInt702 - local9;
				if (local14 >= Static218.anInt4049 || local18 < Static263.anInt4660) {
					for (@Pc(27) int local27 = -Static273.anInt4882; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static345.anInt6083 + local27;
						@Pc(36) int local36 = Static345.anInt6083 - local27;
						@Pc(48) Class227 local48;
						if (local14 >= Static218.anInt4049) {
							if (local32 >= Static276.anInt4907) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean463) {
									Static283.aBoolean359 = arg0;
									Static42.aClass51_1.method2513(local48);
									Static42.aClass51_1.method2510();
								}
							}
							if (local36 < Static376.anInt6609) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean463) {
									Static283.aBoolean359 = arg0;
									Static42.aClass51_1.method2513(local48);
									Static42.aClass51_1.method2510();
								}
							}
						}
						if (local18 < Static263.anInt4660) {
							if (local32 >= Static276.anInt4907) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean463) {
									Static283.aBoolean359 = arg0;
									Static42.aClass51_1.method2513(local48);
									Static42.aClass51_1.method2510();
								}
							}
							if (local36 < Static376.anInt6609) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean463) {
									Static283.aBoolean359 = arg0;
									Static42.aClass51_1.method2513(local48);
									Static42.aClass51_1.method2510();
								}
							}
						}
						if (Static295.anInt5285 == 0) {
							if (Static161.aBoolean216) {
								Static42.aClass51_1.method2516(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V")
	public static void method1134(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub1_Sub2 local8 = Static323.method4982(arg0, 11);
		local8.method412();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V")
	public static void method1135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static297.aClass227ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass12_Sub4_3 != null) {
			local7.aClass12_Sub4_3 = null;
		}
		if (local7.aClass12_Sub4_2 != null) {
			local7.aClass12_Sub4_2 = null;
		}
	}
}
