import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_104 = new Class242("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_105 = new Class242("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
	public static int anInt7459 = 0;

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "Lclient!si;")
	public static final Class217 aClass217_41 = new Class217(9, 4);

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
	public static final int anInt7460 = 52;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)Z")
	public static boolean method5742(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static346.aBoolean427) {
			return false;
		}
		@Pc(21) int local21 = arg1 >> 16;
		@Pc(25) int local25 = arg1 & 0xFFFF;
		if (Static320.aClass126ArrayArray2[local21] == null || Static320.aClass126ArrayArray2[local21][local25] == null) {
			return false;
		}
		@Pc(43) Class126 local43 = Static320.aClass126ArrayArray2[local21][local25];
		@Pc(55) Class4_Sub21 local55;
		if (arg0 == -1 && local43.anInt3426 == 0) {
			for (local55 = (Class4_Sub21) Static126.aClass258_19.method5538(); local55 != null; local55 = (Class4_Sub21) Static126.aClass258_19.method5528()) {
				if (local55.anInt3041 == 9 || local55.anInt3041 == 1008 || local55.anInt3041 == 46 || local55.anInt3041 == 2 || local55.anInt3041 == 45) {
					for (@Pc(90) Class126 local90 = Static53.method1056(local55.anInt3040); local90 != null; local90 = Static389.method5245(local90)) {
						if (local43.anInt3397 == local90.anInt3397) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class4_Sub21) Static126.aClass258_19.method5538(); local55 != null; local55 = (Class4_Sub21) Static126.aClass258_19.method5528()) {
				if (local55.anInt3043 == arg0 && local43.anInt3397 == local55.anInt3040 && (local55.anInt3041 == 9 || local55.anInt3041 == 1008 || local55.anInt3041 == 46 || local55.anInt3041 == 2 || local55.anInt3041 == 45)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIBI)V")
	public static void method5743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static116.aClass4_Sub30_Sub1_1.method4861(arg1);
		Static116.aClass4_Sub30_Sub1_1.method4835(arg2);
		Static116.aClass4_Sub30_Sub1_1.method4835(arg0);
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
	public static void method5744() {
		for (@Pc(10) Class4_Sub1_Sub9 local10 = (Class4_Sub1_Sub9) Static198.aClass258_30.method5538(); local10 != null; local10 = (Class4_Sub1_Sub9) Static198.aClass258_30.method5528()) {
			@Pc(19) Class6_Sub2_Sub4 local19 = local10.aClass6_Sub2_Sub4_1;
			if (local19.aBoolean139) {
				local10.method5854();
				local19.method1543();
			} else if (Static175.anInt3261 >= local19.anInt2039) {
				local19.method1541(Static4.anInt161);
				if (local19.aBoolean139) {
					local10.method5854();
				} else {
					Static235.method3268(local19, true);
				}
			}
		}
	}
}
