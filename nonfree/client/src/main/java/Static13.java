import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "Lclient!b;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!bb", name = "N", descriptor = "Lclient!tg;")
	public static Class81 aClass81_122 = Static120.method2057("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
	public static int anInt268 = 0;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V")
	public static void method210() {
		aClass81_122 = null;
		aClass6_1 = null;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(III)Lclient!re;")
	public static Class75 method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1851; local13++) {
			@Pc(19) Class75 local19 = local7.aClass75Array2[local13];
			if ((local19.aLong118 >> 29 & 0x3L) == 2L && local19.anInt3164 == arg1 && local19.anInt3158 == arg2) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
	public static void method212() {
		if (!Static184.aBoolean172) {
			return;
		}
		@Pc(11) Class77 local11 = Static166.method2908(Static151.anInt3423, Static70.anInt1714);
		if (local11 != null && local11.anObjectArray22 != null) {
			@Pc(20) Class1_Sub3 local20 = new Class1_Sub3();
			local20.aClass77_1 = local11;
			local20.anObjectArray1 = local11.anObjectArray22;
			Static49.method870(local20);
		}
		Static184.aBoolean172 = false;
		Static51.method913(local11);
	}
}
