import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!tga", name = "j", descriptor = "I")
	public static int anInt9035;

	@OriginalMember(owner = "client!tga", name = "e", descriptor = "Lclient!fga;")
	public static final Class108 aClass108_23 = new Class108();

	@OriginalMember(owner = "client!tga", name = "k", descriptor = "I")
	public static int anInt9036 = 0;

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IB)Z")
	public static boolean method7600(@OriginalArg(0) int arg0) {
		if (arg0 == 15 || arg0 == 2 || arg0 == 59 || arg0 == 11 || arg0 == 1011) {
			return true;
		} else {
			return arg0 == 57 || arg0 == 1012;
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Z)V")
	public static void method7601() {
		if (Static314.anInt5702 > 1) {
			Static404.aClass2_Sub13_2.method1383(4, Static404.aClass2_Sub13_2.lb);
		} else {
			Static404.aClass2_Sub13_2.method1383(2, Static404.aClass2_Sub13_2.lb);
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIIII)V")
	public static void method7602(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg3 - arg0;
		@Pc(13) int local13 = arg2 - arg4;
		if (local8 == 0) {
			if (local13 != 0) {
				Static151.method2871(arg2, arg4, arg1, arg0);
			}
		} else if (local13 == 0) {
			Static249.method4057(arg3, arg1, arg0, arg4);
		} else {
			@Pc(48) int local48 = (local13 << 12) / local8;
			@Pc(56) int local56 = arg4 - (local48 * arg0 >> 12);
			@Pc(70) int local70;
			@Pc(68) int local68;
			if (arg0 < Static306.anInt5020) {
				local68 = local56 + (Static306.anInt5020 * local48 >> 12);
				local70 = Static306.anInt5020;
			} else if (Static252.anInt4988 >= arg0) {
				local68 = arg4;
				local70 = arg0;
			} else {
				local70 = Static252.anInt4988;
				local68 = (Static252.anInt4988 * local48 >> 12) + local56;
			}
			@Pc(103) int local103;
			@Pc(112) int local112;
			if (Static306.anInt5020 > arg3) {
				local103 = Static306.anInt5020;
				local112 = local56 + (Static306.anInt5020 * local48 >> 12);
			} else if (arg3 > Static252.anInt4988) {
				local112 = (local48 * Static252.anInt4988 >> 12) + local56;
				local103 = Static252.anInt4988;
			} else {
				local112 = arg2;
				local103 = arg3;
			}
			if (local112 < Static570.anInt9385) {
				local112 = Static570.anInt9385;
				local103 = (Static570.anInt9385 - local56 << 12) / local48;
			} else if (Static177.anInt3963 < local112) {
				local103 = (Static177.anInt3963 - local56 << 12) / local48;
				local112 = Static177.anInt3963;
			}
			if (Static570.anInt9385 > local68) {
				local68 = Static570.anInt9385;
				local70 = (Static570.anInt9385 - local56 << 12) / local48;
			} else if (local68 > Static177.anInt3963) {
				local68 = Static177.anInt3963;
				local70 = (Static177.anInt3963 - local56 << 12) / local48;
			}
			Static385.method5798(local112, local68, arg1, local103, local70);
		}
	}
}
