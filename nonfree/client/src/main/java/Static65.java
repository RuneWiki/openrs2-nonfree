import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cga", name = "F", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_35 = new Class362(98, -2);

	@OriginalMember(owner = "client!cga", name = "I", descriptor = "Z")
	public static boolean aBoolean51 = true;

	@OriginalMember(owner = "client!cga", name = "g", descriptor = "(I)V")
	public static void method1066() {
		try {
			if (Static342.anInt6643 == 1) {
				@Pc(12) int local12 = Static405.aClass4_Sub7_Sub3_4.method5467();
				if (local12 > 0 && Static405.aClass4_Sub7_Sub3_4.method5458()) {
					local12 -= Static472.anInt8704;
					if (local12 < 0) {
						local12 = 0;
					}
					Static405.aClass4_Sub7_Sub3_4.method5444(local12);
					return;
				}
				Static405.aClass4_Sub7_Sub3_4.method5456();
				Static405.aClass4_Sub7_Sub3_4.method5454();
				Static63.aClass113_1 = null;
				if (Static451.aClass176_108 == null) {
					Static342.anInt6643 = 0;
				} else {
					Static342.anInt6643 = 2;
				}
				Static162.aClass4_Sub41_1 = null;
			}
			if (Static342.anInt6643 == 3) {
				@Pc(67) int local67 = Static405.aClass4_Sub7_Sub3_4.method5467();
				if (Static353.anInt6872 > local67 && Static405.aClass4_Sub7_Sub3_4.method5458()) {
					local67 += Static116.anInt2684;
					if (local67 > Static353.anInt6872) {
						local67 = Static353.anInt6872;
					}
					Static405.aClass4_Sub7_Sub3_4.method5444(local67);
				} else {
					Static342.anInt6643 = 0;
					Static116.anInt2684 = 0;
				}
			}
		} catch (@Pc(98) Exception local98) {
			local98.printStackTrace();
			Static405.aClass4_Sub7_Sub3_4.method5456();
			Static451.aClass176_108 = null;
			Static162.aClass4_Sub41_1 = null;
			Static280.aClass4_Sub7_Sub3_2 = null;
			Static342.anInt6643 = 0;
			Static63.aClass113_1 = null;
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1067(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static597.method3730(arg0, 0, local14, 0, local11);
		return local14;
	}
}
