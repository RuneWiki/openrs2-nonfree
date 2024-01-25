import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_74 = new Class244(1, 3);

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
	public static int anInt5256 = 0;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "Lclient!kr;")
	public static final Class138 aClass138_39 = new Class138();

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)V")
	public static void method4692(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static76.anInt1617 - Static290.anInt5040;
		if (local8 >= 100) {
			Static88.anInt1815 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Static279.aFloat67;
		if (Static234.anInt4195 >> 8 > local19) {
			local19 = Static234.anInt4195 >> 8;
		}
		if (Static8.aBooleanArray148[4] && Static345.anIntArray635[4] + 128 > local19) {
			local19 = Static345.anIntArray635[4] + 128;
		}
		@Pc(56) int local56 = (int) Static352.aFloat68 + Static231.anInt4140 & 0x3FFF;
		Static69.method1181(Static76.anInt1623, Static55.method1005(Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766, Static363.anInt6170, Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774) - 50, 600 - -((local19 >> 3) * 3), local19, local56, arg0, Static104.anInt2066);
		@Pc(100) float local100 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static206.anInt3639 = (int) ((float) Static53.anInt1102 + (float) (Static206.anInt3639 - Static53.anInt1102) * local100);
		Static243.anInt4289 = (int) (local100 * (float) (Static243.anInt4289 - Static348.anInt4437) + (float) Static348.anInt4437);
		Static327.anInt5556 = (int) ((float) Static56.anInt1130 + (float) (Static327.anInt5556 - Static56.anInt1130) * local100);
		Static339.anInt5726 = (int) (local100 * (float) (Static339.anInt5726 - Static43.anInt775) + (float) Static43.anInt775);
		@Pc(158) int local158 = Static145.anInt2716 - Static303.anInt5261;
		if (local158 > 8192) {
			local158 -= 16384;
		} else if (local158 < -8192) {
			local158 += 16384;
		}
		Static145.anInt2716 = (int) ((float) local158 * local100 + (float) Static303.anInt5261);
		Static145.anInt2716 &= 0x3FFF;
	}
}
