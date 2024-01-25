import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "Lclient!ih;")
	public static Class116 aClass116_33;

	@OriginalMember(owner = "client!mg", name = "x", descriptor = "[I")
	public static int[] anIntArray543;

	@OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
	public static int anInt7797;

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "Lclient!na;")
	public static Class169 aClass169_29;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_152 = new Class92(3, -1);

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_411 = new Class123(96, 8);

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
	public static void method6370() {
		Static25.anIntArray34 = null;
		Static97.aBoolean149 = false;
		Static175.anIntArray222 = null;
		Static348.anIntArray403 = null;
		Static327.anIntArray385 = null;
		Static339.anIntArray400 = null;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([IILclient!so;[I[I)V")
	public static void method6372(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class3_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg3.length; local12++) {
			@Pc(18) int local18 = arg3[local12];
			@Pc(22) int local22 = arg2[local12];
			@Pc(26) int local26 = arg0[local12];
			for (@Pc(28) int local28 = 0; local22 != 0 && local28 < arg1.aClass235Array3.length; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg1.aClass235Array3[local28] = null;
					} else {
						@Pc(42) Class131 local42 = Static5.aClass217_1.method5234(local18);
						@Pc(45) int local45 = local42.anInt3702;
						@Pc(50) Class235 local50 = arg1.aClass235Array3[local28];
						if (local50 != null) {
							if (local50.anInt6860 == local18) {
								if (local45 == 0) {
									local50 = arg1.aClass235Array3[local28] = null;
								} else if (local45 == 1) {
									local50.anInt6863 = 0;
									local50.anInt6861 = 0;
									local50.anInt6862 = local26;
									local50.anInt6858 = 1;
									local50.anInt6864 = 0;
									Static160.method2664(0, arg1.anInt7202, Static302.aClass3_Sub2_Sub1_Sub2_2 == arg1, local42, arg1.anInt7207, arg1.aByte103);
								} else if (local45 == 2) {
									local50.anInt6863 = 0;
								}
							} else if (local42.anInt3701 >= Static5.aClass217_1.method5234(local50.anInt6860).anInt3701) {
								local50 = arg1.aClass235Array3[local28] = null;
							}
						}
						if (local50 == null) {
							local50 = arg1.aClass235Array3[local28] = new Class235();
							local50.anInt6863 = 0;
							local50.anInt6861 = 0;
							local50.anInt6862 = local26;
							local50.anInt6860 = local18;
							local50.anInt6858 = 1;
							local50.anInt6864 = 0;
							Static160.method2664(0, arg1.anInt7202, Static302.aClass3_Sub2_Sub1_Sub2_2 == arg1, local42, arg1.anInt7207, arg1.aByte103);
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}
}
