import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
	public static int anInt52;

	@OriginalMember(owner = "client!ac", name = "Y", descriptor = "Lclient!lf;")
	private static Class49 aClass49_46 = Static32.method683("glow2:");

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "Lclient!lf;")
	public static Class49 aClass49_42 = aClass49_46;

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "Lclient!lf;")
	public static Class49 aClass49_43 = Static32.method683("swe");

	@OriginalMember(owner = "client!ac", name = "Q", descriptor = "Z")
	public static boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ac", name = "T", descriptor = "Lclient!lf;")
	public static Class49 aClass49_44 = Static32.method683("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!ac", name = "V", descriptor = "Lclient!lf;")
	public static Class49 aClass49_45 = Static32.method683("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ac", name = "ab", descriptor = "I")
	public static int anInt57 = -1;

	@OriginalMember(owner = "client!ac", name = "db", descriptor = "Lclient!lf;")
	public static Class49 aClass49_48 = aClass49_46;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)V")
	public static void method45() {
		aClass49_48 = null;
		aClass49_46 = null;
		aClass49_45 = null;
		aClass49_42 = null;
		aClass49_43 = null;
		aClass49_44 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLclient!vg;)Lclient!vg;")
	public static Class85 method46(@OriginalArg(1) Class85 arg0) {
		@Pc(11) int local11 = Static99.method1724(Static111.method1895(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(25) int local25 = 0; local25 < local11; local25++) {
			arg0 = Static140.method2337(arg0.anInt3851);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(IIIIIIII)V")
	public static void method47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class76 local3 = new Class76();
		local3.anInt3112 = arg2 / 128;
		local3.anInt3108 = arg3 / 128;
		local3.anInt3101 = arg4 / 128;
		local3.anInt3097 = arg5 / 128;
		local3.anInt3092 = arg1;
		local3.anInt3113 = arg2;
		local3.anInt3103 = arg3;
		local3.anInt3110 = arg4;
		local3.anInt3094 = arg5;
		local3.anInt3109 = arg6;
		local3.anInt3106 = arg7;
		Static91.aClass76ArrayArray1[arg0][Static91.anIntArray195[arg0]++] = local3;
	}
}
