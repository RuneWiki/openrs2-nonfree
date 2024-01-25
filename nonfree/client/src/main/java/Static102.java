import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_50 = new Class119("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
	public static int anInt1846 = 0;

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
	public static int anInt1848 = 0;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
	public static void method1561() {
		@Pc(8) Class1_Sub5_Sub11 local8 = Static188.method2688(0, 15);
		local8.method2667();
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!jk;BII)V")
	public static void method1563(@OriginalArg(0) Class124 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static433.aBoolean798) {
			@Pc(18) Class106 local18 = Static326.anInt5571 == -1 ? null : Static65.aClass86_1.method1919(Static326.anInt5571);
			if (Static55.method970(arg0).method2819() && (Static122.anInt2253 & 0x20) != 0 && (local18 == null || arg0.method2789(Static326.anInt5571, local18.anInt2688) != local18.anInt2688)) {
				Static382.method5588(arg0.anInt3405, arg0.anInt3430, 9, Static337.aString67, Static15.aString1 + " -> " + arg0.aString43, arg0.anInt3348, Static10.anInt181, 0L, true, false);
			}
			return;
		}
		@Pc(82) String local82;
		for (@Pc(75) int local75 = 9; local75 >= 5; local75--) {
			local82 = Static221.method3234(local75, arg0);
			if (local82 != null) {
				Static382.method5588(arg0.anInt3405, arg0.anInt3430, 1012, local82, arg0.aString43, arg0.anInt3348, Static166.method2384(arg0, local75), (long) (local75 + 1), true, false);
			}
		}
		local82 = Static77.method1272(arg0);
		if (local82 != null) {
			Static382.method5588(arg0.anInt3405, arg0.anInt3430, 18, local82, arg0.aString43, arg0.anInt3348, arg0.anInt3427, 0L, true, false);
		}
		for (@Pc(145) int local145 = 4; local145 >= 0; local145--) {
			@Pc(152) String local152 = Static221.method3234(local145, arg0);
			if (local152 != null) {
				Static382.method5588(arg0.anInt3405, arg0.anInt3430, 44, local152, arg0.aString43, arg0.anInt3348, Static166.method2384(arg0, local145), (long) (local145 + 1), true, false);
			}
		}
		if (!Static55.method970(arg0).method2818()) {
			return;
		}
		if (arg0.aString40 == null) {
			Static382.method5588(arg0.anInt3405, arg0.anInt3430, 16, Static124.aClass119_173.method2673(Static394.anInt6582), "", arg0.anInt3348, -1, 0L, true, false);
		} else {
			Static382.method5588(arg0.anInt3405, arg0.anInt3430, 16, arg0.aString40, "", arg0.anInt3348, -1, 0L, true, false);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
	public static void method1564(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub5_Sub11 local8 = Static188.method2688(arg0, 8);
		local8.method2667();
	}
}
