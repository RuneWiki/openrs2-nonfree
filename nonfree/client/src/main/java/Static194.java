import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
	public static int anInt10095;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "[Lclient!jfa;")
	public static Class180[] aClass180Array8;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_320 = new Class196(5, 10);

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_101 = new Class187(66, 7);

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "[I")
	public static final int[] anIntArray577 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "Lclient!tga;")
	public static final Class335 aClass335_45 = new Class335(8);

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)I")
	public static int method8415(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static286.anInt4496 - 1; local3++) {
			if (arg0 < Static439.anIntArray432[local3] + Static224.anIntArray200[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static286.anInt4496 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
	public static void method8417() {
		if (Static576.method7860(Static539.anInt8853) || Static385.method5648(Static539.anInt8853)) {
			Static47.method627(5000, Static105.anInt1868 >> 12, Static570.anInt9347 >> 12);
		} else {
			@Pc(14) int local14 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray528[0] >> 3;
			@Pc(21) int local21 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray527[0] >> 3;
			if (local14 >= 0 && Static124.anInt2150 >> 3 > local14 && local21 >= 0 && local21 < Static64.anInt1015 >> 3) {
				Static47.method627(5000, local21, local14);
			} else {
				Static47.method627(0, Static64.anInt1015 >> 4, Static124.anInt2150 >> 4);
			}
		}
		Static273.method3808();
		Static255.method3588();
		Static228.method3268();
		Static636.method8436();
	}
}
