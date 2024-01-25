import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_87 = new Class263(109, -1);

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_52 = new Class177(9, 8);

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!la;Lclient!za;ZIIII)V")
	public static void method3081(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2) {
			Static406.aClass137_14.method5708((Static152.anInt3234 - Static406.aClass137_14.RA()) / 2, (Static342.anInt6292 - Static406.aClass137_14.Q()) / 2);
			Static398.aClass137_19.method5708((Static152.anInt3234 - Static398.aClass137_19.RA()) / 2, 18);
		}
		@Pc(32) String local32 = "";
		if (Static181.aClass272_2 == Static268.aClass272_4) {
			local32 = Static432.aClass158_204.method3594(Static365.anInt6682);
		} else if (Static268.aClass272_4 == Static266.aClass272_3) {
			local32 = Static18.aClass158_8.method3594(Static365.anInt6682);
		}
		arg0.method5334(Static152.anInt3234 / 2, Static342.anInt6292 / 2 - 26, arg5, local32, -1);
		@Pc(74) int local74 = Static342.anInt6292 / 2 - 18;
		arg1.method5958(Static152.anInt3234 / 2 - 152, local74, 304, 34, arg3, 0);
		arg1.method5958(Static152.anInt3234 / 2 - 151, local74 - -1, 302, 32, 0, 0);
		arg1.P(Static152.anInt3234 / 2 - 150, local74 + 2, Static50.anInt1224 * 3, 30, arg4, 0);
		arg1.P(Static152.anInt3234 / 2 + Static50.anInt1224 * 3 - 150, local74 + 2, 300 - Static50.anInt1224 * 3, 30, 0, 0);
		arg0.method5334(Static152.anInt3234 / 2, Static342.anInt6292 / 2 + 4, arg5, Static389.aString61, -1);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!nv;Lclient!l;IILjava/awt/Canvas;I)Lclient!za;")
	public static Class106 method3082(@OriginalArg(0) Class183 arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Canvas arg4) {
		return new Class106_Sub2(arg2, arg4, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
	public static int method3083() {
		if (Static404.aClass68_11 == null) {
			if (!Static96.aBoolean151 && Static126.anInt2794 > 0) {
				if (Static326.aBoolean381 && Static414.aClass48_1.method1119(81) && Static126.anInt2794 > 2) {
					return ((Class1_Sub35) Static401.aClass203_47.aClass1_195.aClass1_263.aClass1_263).anInt5834;
				}
				return ((Class1_Sub35) Static401.aClass203_47.aClass1_195.aClass1_263).anInt5834;
			}
			@Pc(19) int local19 = Static336.aClass87_1.method1919();
			@Pc(23) int local23 = Static336.aClass87_1.method1909();
			@Pc(25) int local25 = Static293.anInt4679;
			@Pc(27) int local27 = Static32.anInt891;
			@Pc(29) int local29 = Static232.anInt4578;
			if (local19 > local25 && local19 < local25 + local29) {
				@Pc(48) int local48 = -1;
				@Pc(67) int local67;
				for (@Pc(50) int local50 = 0; local50 < Static126.anInt2794; local50++) {
					if (Static333.aBoolean386) {
						local67 = (Static126.anInt2794 - local50 - 1) * 16 + local27 + 33;
						if (local23 > local67 - 13 && local67 + 3 >= local23) {
							local48 = local50;
						}
					} else {
						local67 = (Static126.anInt2794 - local50 - 1) * 16 + local27 + 31;
						if (local23 > local67 - 13 && local23 <= local67 + 3) {
							local48 = local50;
						}
					}
				}
				if (local48 != -1) {
					local67 = 0;
					@Pc(124) Class78 local124 = new Class78(Static401.aClass203_47);
					for (@Pc(129) Class1_Sub35 local129 = (Class1_Sub35) local124.method1753(); local129 != null; local129 = (Class1_Sub35) local124.method1751()) {
						if (local48 == local67++) {
							return local129.anInt5834;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public static void method3084() {
		Static31.method1536();
	}
}
