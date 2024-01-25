import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "Lclient!tga;")
	public static Class337 aClass337_6;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_93 = new Class100(90, -1);

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_119 = new Class44(72, 6);

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	public static void method5551() {
		try {
			@Pc(10) int local10;
			if (Static507.anInt8961 == 1) {
				local10 = Static558.aClass14_Sub5_Sub2_2.method3872();
				if (local10 > 0 && Static558.aClass14_Sub5_Sub2_2.method3875()) {
					local10 -= Static286.anInt4898;
					if (local10 < 0) {
						local10 = 0;
					}
					Static558.aClass14_Sub5_Sub2_2.method3904(local10);
					return;
				}
				Static558.aClass14_Sub5_Sub2_2.method3899();
				Static558.aClass14_Sub5_Sub2_2.method3906();
				Static114.aClass14_Sub51_1 = null;
				Static433.aClass129_2 = null;
				if (Static478.aClass386_105 == null) {
					Static507.anInt8961 = 0;
				} else {
					Static507.anInt8961 = 2;
				}
			}
			if (Static507.anInt8961 == 3) {
				local10 = Static558.aClass14_Sub5_Sub2_2.method3872();
				if (local10 < Static352.anInt6508 && Static558.aClass14_Sub5_Sub2_2.method3875()) {
					local10 += Static613.anInt10339;
					if (local10 > Static352.anInt6508) {
						local10 = Static352.anInt6508;
					}
					Static558.aClass14_Sub5_Sub2_2.method3904(local10);
					return;
				}
				Static507.anInt8961 = 0;
				Static613.anInt10339 = 0;
			}
		} catch (@Pc(94) Exception local94) {
			local94.printStackTrace();
			Static558.aClass14_Sub5_Sub2_2.method3899();
			Static433.aClass129_2 = null;
			Static507.anInt8961 = 0;
			Static114.aClass14_Sub51_1 = null;
			Static628.aClass14_Sub5_Sub2_4 = null;
			Static478.aClass386_105 = null;
		}
	}
}
