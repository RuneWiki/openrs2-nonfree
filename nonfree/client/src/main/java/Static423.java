import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_160 = new Class119("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_226 = new Class103(27, 4);

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
	public static int anInt6430 = -1;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Lclient!sr;")
	public static Class227 aClass227_39 = new Class227();

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
	public static void method5063() {
		for (@Pc(15) Class1_Sub5_Sub15 local15 = (Class1_Sub5_Sub15) Static226.aClass227_24.method4967(); local15 != null; local15 = (Class1_Sub5_Sub15) Static226.aClass227_24.method4973()) {
			@Pc(20) Class25_Sub5_Sub3 local20 = local15.aClass25_Sub5_Sub3_1;
			if (local20.aByte94 != Static265.anInt4807 || local20.anInt4107 < Static236.anInt4213) {
				local15.method5915();
				local20.method3332();
			} else if (local20.anInt4097 <= Static236.anInt4213) {
				if (local20.anInt4119 > 0) {
					@Pc(50) Class25_Sub5_Sub1_Sub1 local50 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local20.anInt4119 - 1];
					if (local50 != null && local50.anInt5518 >= 0 && Static296.anInt5187 * 128 > local50.anInt5518 && local50.anInt5514 >= 0 && Static206.anInt3607 * 128 > local50.anInt5514) {
						local20.method3335(Static236.anInt4213, local50.anInt5518, Static335.method4499(local20.aByte94, local50.anInt5518, local50.anInt5514) - local20.anInt4105, local50.anInt5514);
					}
				}
				if (local20.anInt4119 < 0) {
					@Pc(104) int local104 = -local20.anInt4119 - 1;
					@Pc(111) Class25_Sub5_Sub1_Sub2 local111;
					if (Static296.anInt5181 == local104) {
						local111 = Static447.aClass25_Sub5_Sub1_Sub2_4;
					} else {
						local111 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local104];
					}
					if (local111 != null && local111.anInt5518 >= 0 && local111.anInt5518 < Static296.anInt5187 * 128 && local111.anInt5514 >= 0 && local111.anInt5514 < Static206.anInt3607 * 128) {
						local20.method3335(Static236.anInt4213, local111.anInt5518, Static335.method4499(local20.aByte94, local111.anInt5518, local111.anInt5514) - local20.anInt4105, local111.anInt5514);
					}
				}
				local20.method3331(Static341.anInt5831);
				Static277.method4344(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)I")
	public static int method5066(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
