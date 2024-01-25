import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!vg", name = "pb", descriptor = "I")
	public static int anInt6992;

	@OriginalMember(owner = "client!vg", name = "ed", descriptor = "I")
	public static int anInt7043;

	@OriginalMember(owner = "client!vg", name = "Uc", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_257 = new Class137(13, 8);

	@OriginalMember(owner = "client!vg", name = "dd", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_217 = new Class151("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!vg", name = "hd", descriptor = "Lclient!so;")
	public static final Class224 aClass224_26 = new Class224(4, -1);

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(ILclient!qa;)V")
	public static void method5347(@OriginalArg(1) Class128 arg0) {
		arg0.pa(0, 0, Static126.anInt2202, 350);
		arg0.NA(0, 0, Static126.anInt2202, 350, Static132.anInt2264 << 24 | 0x332277, 1);
		@Pc(31) int local31 = 350 / Static257.anInt6934;
		@Pc(38) int local38;
		if (Static248.anInt4059 > 0) {
			local38 = 342 - Static257.anInt6934;
			@Pc(48) int local48 = local38 * local31 / (Static248.anInt4059 + local31 - 1);
			@Pc(50) int local50 = 4;
			if (Static248.anInt4059 > 1) {
				local50 = (Static248.anInt4059 - Static174.anInt2850 - 1) * (local38 - local48) / (Static248.anInt4059 - 1) + 4;
			}
			arg0.NA(Static126.anInt2202 - 16, local50, 12, local48, Static132.anInt2264 << 24 | 0x332277, 2);
			for (@Pc(88) int local88 = Static174.anInt2850; Static174.anInt2850 + local31 > local88 && local88 < Static248.anInt4059; local88++) {
				@Pc(99) String[] local99 = Static150.method2106(Static270.aStringArray36[local88], '\b');
				@Pc(108) int local108 = (Static126.anInt2202 - 8 - 16) / local99.length;
				for (@Pc(110) int local110 = 0; local110 < local99.length; local110++) {
					@Pc(118) int local118 = local110 * local108 + 8;
					arg0.pa(local118, 0, local108 + local118 - 8, 350);
					Static275.aClass16_2.method5478(local118, 350 - Static257.anInt6934 * (local88 - Static174.anInt2850) - Static328.anInt5379 - Static453.aClass122_10.anInt3010 - 2, -16777216, local99[local110], -1);
				}
			}
		}
		arg0.pa(0, 0, Static126.anInt2202, 350);
		arg0.method3607(350 - Static328.anInt5379, 0, Static126.anInt2202, -1);
		Static227.aClass16_1.method5478(10, 350 - Static6.aClass122_1.anInt3010 - 1, -16777216, "--> " + Static411.aString55, -1);
		local38 = -1;
		if (Static368.anInt6250 % 30 > 15) {
			local38 = 16777215;
		}
		arg0.method3537(12, 350 - Static6.aClass122_1.anInt3010 - 11, Static6.aClass122_1.method2464("--> " + Static411.aString55.substring(0, Static9.anInt192)) + 10, local38);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZLclient!vg;)V")
	public static void method5348(@OriginalArg(1) Class250 arg0) {
		if (arg0.anInt6983 != Static165.anInt5944) {
			return;
		}
		if (Static239.aClass20_Sub3_Sub3_Sub1_1.aString48 == null) {
			arg0.anInt6982 = 0;
			arg0.anInt6981 = 0;
			return;
		}
		arg0.anInt7006 = 150;
		arg0.anInt6961 = (int) (Math.sin((double) Static368.anInt6250 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt6981 = Static348.anInt5668;
		arg0.anInt7024 = 5;
		arg0.anInt6982 = Static14.method215(Static239.aClass20_Sub3_Sub3_Sub1_1.aString48);
		arg0.anInt6960 = Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6037;
		arg0.anInt6980 = Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6068;
		arg0.anInt7023 = Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6013;
		arg0.anInt6988 = 0;
	}
}
