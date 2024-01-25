import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
	public static int anInt7550;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "[Lclient!bh;")
	public static final Class2_Sub4[] aClass2_Sub4Array6 = new Class2_Sub4[8];

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "Lclient!qu;")
	public static final Class284 aClass284_1 = new Class284();

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "Lclient!qca;")
	public static final Class271 aClass271_7 = new Class271(12, 0, 1, 0);

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!ak;I[I[I[I)V")
	public static void method6324(@OriginalArg(0) Class11_Sub1_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(6) int local6 = 0; local6 < arg3.length; local6++) {
			@Pc(11) int local11 = arg3[local6];
			@Pc(15) int local15 = arg2[local6];
			@Pc(19) int local19 = arg1[local6];
			for (@Pc(21) int local21 = 0; local15 != 0 && arg0.aClass203Array3.length > local21; local21++) {
				if ((local15 & 0x1) != 0) {
					if (local11 == -1) {
						arg0.aClass203Array3[local21] = null;
					} else {
						@Pc(37) Class149 local37 = Static185.aClass303_1.method7201(local11);
						@Pc(40) int local40 = local37.anInt4516;
						@Pc(45) Class203 local45 = arg0.aClass203Array3[local21];
						if (local45 != null) {
							if (local11 == local45.anInt5798) {
								if (local40 == 0) {
									local45 = arg0.aClass203Array3[local21] = null;
								} else if (local40 == 1) {
									local45.anInt5796 = 0;
									local45.anInt5799 = 0;
									local45.anInt5805 = 1;
									local45.anInt5801 = 0;
									local45.anInt5797 = local19;
									if (!arg0.aBoolean276) {
										Static330.method3630(0, local37, arg0);
									}
								} else if (local40 == 2) {
									local45.anInt5799 = 0;
								}
							} else if (local37.anInt4518 >= Static185.aClass303_1.method7201(local45.anInt5798).anInt4518) {
								local45 = arg0.aClass203Array3[local21] = null;
							}
						}
						if (local45 == null) {
							local45 = arg0.aClass203Array3[local21] = new Class203();
							local45.anInt5797 = local19;
							local45.anInt5805 = 1;
							local45.anInt5799 = 0;
							local45.anInt5796 = 0;
							local45.anInt5798 = local11;
							local45.anInt5801 = 0;
							if (!arg0.aBoolean276) {
								Static330.method3630(0, local37, arg0);
							}
						}
					}
				}
				local15 >>>= 0x1;
			}
		}
	}
}
