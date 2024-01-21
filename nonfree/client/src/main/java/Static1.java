import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "e", descriptor = "I")
	public static int anInt1;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Lclient!eh;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1 = Static32.method683("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Lclient!lf;")
	public static Class49 aClass49_2 = Static32.method683("Texturen geladen)3");

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!lf;")
	public static Class49 aClass49_3 = Static32.method683("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!lf;")
	public static Class49 aClass49_4 = Static32.method683(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!a", name = "f", descriptor = "J")
	public static volatile long aLong1 = 0L;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Lclient!lf;")
	public static Class49 aClass49_5 = Static32.method683(" x ");

	@OriginalMember(owner = "client!a", name = "h", descriptor = "[I")
	public static int[] anIntArray1 = new int[32768];

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	public static int anInt2 = 0;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)Z")
	public static boolean method1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static110.anInt2298; local1++) {
			@Pc(6) Class76 local6 = Static78.aClass76Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3095 == 1) {
				local15 = local6.anInt3113 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3110 + (local6.anInt3107 * local15 >> 8);
					local37 = local6.anInt3094 + (local6.anInt3100 * local15 >> 8);
					local47 = local6.anInt3109 + (local6.anInt3096 * local15 >> 8);
					local57 = local6.anInt3106 + (local6.anInt3111 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3095 == 2) {
				local15 = arg0 - local6.anInt3113;
				if (local15 > 0) {
					local27 = local6.anInt3110 + (local6.anInt3107 * local15 >> 8);
					local37 = local6.anInt3094 + (local6.anInt3100 * local15 >> 8);
					local47 = local6.anInt3109 + (local6.anInt3096 * local15 >> 8);
					local57 = local6.anInt3106 + (local6.anInt3111 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3095 == 3) {
				local15 = local6.anInt3110 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3113 + (local6.anInt3104 * local15 >> 8);
					local37 = local6.anInt3103 + (local6.anInt3090 * local15 >> 8);
					local47 = local6.anInt3109 + (local6.anInt3096 * local15 >> 8);
					local57 = local6.anInt3106 + (local6.anInt3111 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3095 == 4) {
				local15 = arg2 - local6.anInt3110;
				if (local15 > 0) {
					local27 = local6.anInt3113 + (local6.anInt3104 * local15 >> 8);
					local37 = local6.anInt3103 + (local6.anInt3090 * local15 >> 8);
					local47 = local6.anInt3109 + (local6.anInt3096 * local15 >> 8);
					local57 = local6.anInt3106 + (local6.anInt3111 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3095 == 5) {
				local15 = arg1 - local6.anInt3109;
				if (local15 > 0) {
					local27 = local6.anInt3113 + (local6.anInt3104 * local15 >> 8);
					local37 = local6.anInt3103 + (local6.anInt3090 * local15 >> 8);
					local47 = local6.anInt3110 + (local6.anInt3107 * local15 >> 8);
					local57 = local6.anInt3094 + (local6.anInt3100 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method2() {
		aClass49_5 = null;
		aClass49_1 = null;
		aClass49_2 = null;
		aClass49_3 = null;
		anIntArray1 = null;
		aClass49_4 = null;
		aClass25_1 = null;
	}
}
