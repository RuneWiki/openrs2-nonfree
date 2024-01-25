import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "[Lclient!ha;")
	public static Class2[] aClass2Array4;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_30 = new Class306("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method2138(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!th;II)V")
	public static void method2139(@OriginalArg(0) int arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(3) int arg2) {
		Static251.aClass283ArrayArray1[arg2][arg0] = arg1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Z")
	public static boolean method2141(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method2142() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static459.anInt7799; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static482.anInt7990; local13++) {
				if (Static451.method6569(local9, local7, local13, true, Static242.aClass255ArrayArrayArray2)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
