import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!oja", name = "g", descriptor = "Lclient!hha;")
	public static Class156 aClass156_1;

	@OriginalMember(owner = "client!oja", name = "k", descriptor = "[[Lclient!vo;")
	public static Class381[][] aClass381ArrayArray1;

	@OriginalMember(owner = "client!oja", name = "i", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_93 = new Class241(23, 3);

	@OriginalMember(owner = "client!oja", name = "p", descriptor = "Z")
	public static boolean aBoolean550 = false;

	@OriginalMember(owner = "client!oja", name = "b", descriptor = "(B)V")
	public static void method6567() {
		@Pc(18) Class6_Sub13 local18 = Static30.method353(Static547.aClass241_106, Static525.aClass260_4.aClass270_2);
		local18.aClass6_Sub15_Sub1_1.method3029(Static620.anInt9784);
		Static525.aClass260_4.method6404(local18);
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(I)V")
	public static void method6568() {
		@Pc(5) int local5 = 0;
		if (Static687.aClass6_Sub44_33 != null) {
			local5 = Static687.aClass6_Sub44_33.aClass7_Sub10_1.method2536();
		}
		@Pc(30) int local30;
		@Pc(38) int local38;
		if (local5 == 2) {
			local30 = Static238.anInt4606 <= 800 ? Static238.anInt4606 : 800;
			local38 = Static542.anInt8800 <= 600 ? Static542.anInt8800 : 600;
			Static535.anInt4128 = local30;
			Static409.anInt7136 = (Static238.anInt4606 - local30) / 2;
			Static494.anInt4031 = 0;
			Static274.anInt3226 = local38;
		} else if (local5 == 1) {
			local30 = Static238.anInt4606 > 1024 ? 1024 : Static238.anInt4606;
			Static409.anInt7136 = (Static238.anInt4606 - local30) / 2;
			Static535.anInt4128 = local30;
			local38 = Static542.anInt8800 <= 768 ? Static542.anInt8800 : 768;
			Static274.anInt3226 = local38;
			Static494.anInt4031 = 0;
		} else {
			Static409.anInt7136 = 0;
			Static274.anInt3226 = Static542.anInt8800;
			Static535.anInt4128 = Static238.anInt4606;
			Static494.anInt4031 = 0;
		}
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(B)V")
	public static void method6571() {
		Static661.anInt10532 = 0;
		for (@Pc(16) int local16 = 0; local16 < 2048; local16++) {
			Static372.aClass6_Sub15Array4[local16] = null;
			Static27.aByteArray4[local16] = 1;
			Static395.aClass353Array1[local16] = null;
		}
	}
}
