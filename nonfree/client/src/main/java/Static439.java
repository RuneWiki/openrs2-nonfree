import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "F")
	public static float aFloat155;

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "Lclient!lda;")
	public static final Class225 aClass225_10 = new Class225(6, 0, 4, 2);

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "Lclient!tj;")
	public static final Class357 aClass357_44 = new Class357();

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_135 = new Class186(108, -1);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BI)Z")
	public static boolean method6394(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!av;IIZ)V")
	public static void method6397(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static212.aBoolean297) {
			@Pc(17) Class319 local17 = Static502.anInt8594 == -1 ? null : Static646.aClass106_1.method2677(Static502.anInt8594);
			if (Static87.method1164(arg0).method4614() && (Static718.anInt11231 & 0x20) != 0 && (local17 == null || arg0.method456(Static502.anInt8594, local17.anInt9232) != local17.anInt9232)) {
				Static91.method1249(Static27.anInt421, Static177.aString97, 0L, (long) (arg0.anInt600 | arg0.anInt583 << 0), 50, arg0.anInt600, false, false, arg0.anInt583, Static90.aString28 + " -> " + arg0.aString8, true, arg0.anInt595);
			}
		}
		@Pc(103) String local103;
		for (@Pc(96) int local96 = 9; local96 >= 5; local96--) {
			local103 = Static721.method3074(local96, arg0);
			if (local103 != null) {
				Static91.method1249(Static505.method7233(local96, arg0), local103, (long) (local96 + 1), (long) (arg0.anInt583 << 0 | arg0.anInt600), 1007, arg0.anInt600, false, false, arg0.anInt583, arg0.aString8, true, arg0.anInt595);
			}
		}
		local103 = Static182.method2796(arg0);
		if (local103 != null) {
			Static91.method1249(arg0.anInt521, local103, 0L, (long) (arg0.anInt583 << 0 | arg0.anInt600), 10, arg0.anInt600, false, false, arg0.anInt583, arg0.aString8, true, arg0.anInt595);
		}
		for (@Pc(190) int local190 = 4; local190 >= 0; local190--) {
			@Pc(199) String local199 = Static721.method3074(local190, arg0);
			if (local199 != null) {
				Static91.method1249(Static505.method7233(local190, arg0), local199, (long) (local190 + 1), (long) (arg0.anInt583 << 0 | arg0.anInt600), 11, arg0.anInt600, false, false, arg0.anInt583, arg0.aString8, true, arg0.anInt595);
			}
		}
		if (!Static87.method1164(arg0).method4613()) {
			return;
		}
		if (arg0.aString11 == null) {
			Static91.method1249(-1, Static476.aClass279_10.method6992(Static141.anInt2658), 0L, (long) (arg0.anInt583 << 0 | arg0.anInt600), 21, arg0.anInt600, false, false, arg0.anInt583, "", true, arg0.anInt595);
		} else {
			Static91.method1249(-1, arg0.aString11, 0L, (long) (arg0.anInt583 << 0 | arg0.anInt600), 21, arg0.anInt600, false, false, arg0.anInt583, "", true, arg0.anInt595);
		}
	}
}
