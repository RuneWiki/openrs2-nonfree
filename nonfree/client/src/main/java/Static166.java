import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!fja", name = "r", descriptor = "Lclient!vw;")
	public static Class384 aClass384_2;

	@OriginalMember(owner = "client!fja", name = "v", descriptor = "I")
	public static int anInt2564 = 2;

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "([ILclient!nh;[I[II)V")
	public static void method2390(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class4_Sub3_Sub3_Sub3 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg2.length; local8++) {
			@Pc(16) int local16 = arg2[local8];
			@Pc(20) int local20 = arg3[local8];
			@Pc(24) int local24 = arg0[local8];
			for (@Pc(26) int local26 = 0; local20 != 0 && local26 < arg1.aClass181_Sub2_Sub1Array3.length; local26++) {
				if ((local20 & 0x1) != 0) {
					if (local16 == -1) {
						arg1.aClass181_Sub2_Sub1Array3[local26] = null;
					} else {
						@Pc(57) Class259 local57 = Static59.aClass204_1.method5041(local16);
						@Pc(60) int local60 = local57.anInt7194;
						@Pc(65) Class181_Sub2_Sub1 local65 = arg1.aClass181_Sub2_Sub1Array3[local26];
						if (local65 != null && local65.method8970()) {
							if (local16 == local65.method8959()) {
								if (local60 == 0) {
									local65 = arg1.aClass181_Sub2_Sub1Array3[local26] = null;
								} else if (local60 == 1) {
									local65.method8942();
									local65.anInt10497 = local24;
								} else if (local60 == 2) {
									local65.method8945();
								}
							} else if (local57.anInt7201 >= local65.method8952().anInt7201) {
								local65 = arg1.aClass181_Sub2_Sub1Array3[local26] = null;
							}
						}
						if (local65 == null || !local65.method8970()) {
							local65 = arg1.aClass181_Sub2_Sub1Array3[local26] = new Class181_Sub2_Sub1(arg1);
							local65.method8964(local16, 0);
							local65.anInt10497 = local24;
						}
					}
				}
				local20 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "(I)V")
	public static void method2391() {
		if (Static188.aClass230_3 == null) {
			return;
		}
		if (Static188.aClass230_3.anInt6256 == 1) {
			Static188.aClass230_3 = null;
			return;
		}
		if (Static188.aClass230_3.anInt6256 == 2) {
			Static508.method7613(Static82.aString26, 2, Static327.aClass173_4);
			Static188.aClass230_3 = null;
			return;
		}
	}
}
