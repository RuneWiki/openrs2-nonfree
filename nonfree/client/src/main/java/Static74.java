import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cia", name = "A", descriptor = "Lclient!lga;")
	public static Class223 aClass223_15;

	@OriginalMember(owner = "client!cia", name = "x", descriptor = "Lclient!lga;")
	public static Class223 aClass223_16;

	@OriginalMember(owner = "client!cia", name = "E", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_18 = new Class241(50, 11);

	@OriginalMember(owner = "client!cia", name = "F", descriptor = "[I")
	public static final int[] anIntArray75 = new int[2];

	@OriginalMember(owner = "client!cia", name = "C", descriptor = "I")
	public static int anInt1034 = 0;

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(IIILclient!sba;III)Z")
	public static boolean method1010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class323 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static519.aBoolean664 || !Static26.aBoolean26) {
			return false;
		} else if (Static14.anInt211 < 100) {
			return false;
		} else if (arg4 != arg0 || arg5 != arg3) {
			for (@Pc(60) int local60 = arg0; local60 <= arg4; local60++) {
				for (@Pc(66) int local66 = arg3; local66 <= arg5; local66++) {
					if (Static52.anIntArrayArrayArray11[arg1][local60][local66] == -Static395.anInt6854) {
						return false;
					}
				}
			}
			if (Static89.method1309(arg2)) {
				Static512.anInt8472++;
				return true;
			} else {
				return false;
			}
		} else if (!Static240.method4227(arg1, arg3, arg0)) {
			return false;
		} else if (Static89.method1309(arg2)) {
			Static512.anInt8472++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(II)Lclient!gia;")
	public static Class136 method1012(@OriginalArg(0) int arg0) {
		@Pc(16) Class136[] local16 = Static124.method2322();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class136 local24 = local16[local18];
			if (local24.anInt3990 == arg0) {
				return local24;
			}
		}
		return null;
	}
}
