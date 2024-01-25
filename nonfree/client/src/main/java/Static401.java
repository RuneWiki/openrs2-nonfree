import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
	public static void method5417() {
		@Pc(5) int local5 = 0;
		if (Static580.aClass3_Sub22_24 != null) {
			local5 = Static580.aClass3_Sub22_24.aClass21_Sub11_1.method4664();
		}
		@Pc(37) int local37;
		@Pc(56) int local56;
		if (local5 == 2) {
			local37 = Static91.anInt2083 > 800 ? 800 : Static91.anInt2083;
			Static251.anInt3914 = (Static91.anInt2083 - local37) / 2;
			Static681.anInt10652 = local37;
			local56 = Static342.anInt5491 <= 600 ? Static342.anInt5491 : 600;
			Static76.anInt1720 = local56;
			Static388.anInt5985 = 0;
		} else if (local5 == 1) {
			local37 = Static91.anInt2083 <= 1024 ? Static91.anInt2083 : 1024;
			Static681.anInt10652 = local37;
			Static251.anInt3914 = (Static91.anInt2083 - local37) / 2;
			local56 = Static342.anInt5491 > 768 ? 768 : Static342.anInt5491;
			Static76.anInt1720 = local56;
			Static388.anInt5985 = 0;
		} else {
			Static681.anInt10652 = Static91.anInt2083;
			Static388.anInt5985 = 0;
			Static76.anInt1720 = Static342.anInt5491;
			Static251.anInt3914 = 0;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(III)Z")
	public static boolean method5419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static688.method9111(arg0, arg1) | Static183.method2902(arg1, arg0) | Static474.method6454(arg0, arg1)) & Static2.method22(arg1, arg0);
	}
}
