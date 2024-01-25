import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_65 = new Class151("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
	public static int anInt2001 = 0;

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
	public static int anInt2002 = -1;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZIILclient!vg;)V")
	public static void method1579(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class250 arg2) {
		if (Static360.aBoolean498) {
			@Pc(18) Class78 local18 = Static331.anInt5403 == -1 ? null : Static85.aClass132_5.method2771(Static331.anInt5403);
			if (Static52.method804(arg2).method1724() && (Static20.anInt436 & 0x20) != 0 && (local18 == null || arg2.method5345(local18.anInt1998, Static331.anInt5403) != local18.anInt1998)) {
				Static87.method1275(false, arg2.anInt7038, 0L, Static419.aString58 + " -> " + arg2.aString63, Static161.anInt1936, true, Static149.aString68, arg2.anInt7030, arg2.anInt6994, 30);
			}
			return;
		}
		@Pc(82) String local82;
		for (@Pc(75) int local75 = 9; local75 >= 5; local75--) {
			local82 = Static445.method5570(local75, arg2);
			if (local82 != null) {
				Static87.method1275(false, arg2.anInt7038, (long) (local75 + 1), arg2.aString63, Static222.method2951(local75, arg2), true, local82, arg2.anInt7030, arg2.anInt6994, 1007);
			}
		}
		local82 = Static105.method1480(arg2);
		if (local82 != null) {
			Static87.method1275(false, arg2.anInt7038, 0L, arg2.aString63, arg2.anInt6958, true, local82, arg2.anInt7030, arg2.anInt6994, 51);
		}
		for (@Pc(143) int local143 = 4; local143 >= 0; local143--) {
			@Pc(150) String local150 = Static445.method5570(local143, arg2);
			if (local150 != null) {
				Static87.method1275(false, arg2.anInt7038, (long) (local143 + 1), arg2.aString63, Static222.method2951(local143, arg2), true, local150, arg2.anInt7030, arg2.anInt6994, 15);
			}
		}
		if (!Static52.method804(arg2).method1727()) {
			return;
		}
		if (arg2.aString64 == null) {
			Static87.method1275(false, arg2.anInt7038, 0L, "", -1, true, Static77.aClass151_49.method3122(Static188.anInt3028), arg2.anInt7030, arg2.anInt6994, 46);
		} else {
			Static87.method1275(false, arg2.anInt7038, 0L, "", -1, true, arg2.aString64, arg2.anInt7030, arg2.anInt6994, 46);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BIIII)V")
	public static void method1580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static193.anInt7328; local7++) {
			@Pc(21) Rectangle local21 = Class138.aRectangleArray5[local7];
			if (arg0 < local21.width + local21.x && local21.x < arg3 + arg0 && arg2 < local21.y + local21.height && arg1 + arg2 > local21.y) {
				Static145.aBooleanArray15[local7] = true;
			}
		}
	}
}
