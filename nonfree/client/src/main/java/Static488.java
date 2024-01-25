import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "Lclient!vd;")
	public static Class353 aClass353_135;

	@OriginalMember(owner = "client!rg", name = "A", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_96 = new Class208(0, -1);

	@OriginalMember(owner = "client!rg", name = "zb", descriptor = "Z")
	public static boolean aBoolean687 = false;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZZ)V")
	public static void method8558() {
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub28_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub28_2);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub10_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub10_2);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub2_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub23_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub14_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub21_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub5_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub8_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub26_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub27_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub1_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub6_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub11_2);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub11_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub19_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub24_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub25_1);
		Static34.method4607();
		Static348.aClass6_Sub22_19.method3534(2, Static348.aClass6_Sub22_19.aClass15_Sub16_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub13_1);
		Static499.method7443();
		Static245.method5548();
		Static585.aBoolean670 = true;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIZZIIF)[[I")
	public static int[][] method8588(@OriginalArg(8) float arg0) {
		@Pc(14) int[][] local14 = new int[256][64];
		@Pc(18) Class6_Sub4_Sub5 local18 = new Class6_Sub4_Sub5();
		local18.anInt2200 = 3;
		local18.anInt2211 = 4;
		local18.aBoolean164 = false;
		local18.anInt2207 = 4;
		local18.anInt2198 = (int) (arg0 * 4096.0F);
		local18.method8315();
		Static535.method7897(256, 64);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local18.method1852(local14[local45], local45);
		}
		return local14;
	}
}
