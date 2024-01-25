import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "[[Lclient!em;")
	public static Class68[][] aClass68ArrayArray1;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
	public static int anInt7034;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)V")
	public static void method5491(@OriginalArg(0) int arg0) {
		if (!Static29.method411(arg0)) {
			return;
		}
		@Pc(18) Class41[] local18 = Static450.aClass41ArrayArray2[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class41 local26 = local18[local20];
			if (local26 != null) {
				local26.anInt1680 = 0;
				local26.anInt1645 = 1;
				local26.anInt1640 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
	public static void method5495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static399.aClass167_Sub1_1.anInt5565 != 0 && arg1 != 0 && Static18.anInt404 < 50 && arg3 != -1) {
			Static148.aClass9Array1[Static18.anInt404++] = new Class9((byte) 1, arg3, arg1, arg2, arg0, 0);
		}
	}
}
