import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "[Lclient!rd;")
	public static Class42_Sub1[] aClass42_Sub1Array1;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_123 = Static151.method2243("Welcome to RuneScape");

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "Lclient!mb;")
	public static Class62 aClass62_121 = aClass62_123;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_122 = Static151.method2243("mod_icons");

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_124 = Static151.method2243("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
	public static int anInt420 = 0;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Lclient!ha;")
	public static Class39 method300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3292; local13++) {
			@Pc(19) Class39 local19 = local7.aClass39Array2[local13];
			if ((local19.aLong54 >> 29 & 0x3L) == 2L && local19.anInt1480 == arg1 && local19.anInt1484 == arg2) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public static void method302() {
		for (@Pc(12) int local12 = 0; local12 < Static196.anInt4032; local12++) {
			@Pc(18) int local18 = Static187.anIntArray355[local12];
			@Pc(22) Class7_Sub2_Sub2 local22 = Static62.aClass7_Sub2_Sub2Array1[local18];
			@Pc(26) int local26 = Static108.aClass2_Sub11_Sub1_3.method1534();
			if ((local26 & 0x1) != 0) {
				local26 += Static108.aClass2_Sub11_Sub1_3.method1534() << 8;
			}
			Static166.method2435(local18, local22, local26);
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	public static void method307() {
		if (Static51.aClass37_1 != null) {
			@Pc(15) Class37 local15 = Static51.aClass37_1;
			synchronized (Static51.aClass37_1) {
				Static51.aClass37_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[Lclient!mb;)[Lclient!mb;")
	public static Class62[] method310(@OriginalArg(1) Class62[] arg0) {
		@Pc(4) Class62[] local4 = new Class62[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local4[local18] = Static169.method2460(new Class62[] { Static119.method1865(local18), Static47.aClass62_327 });
			if (arg0 != null && arg0[local18] != null) {
				local4[local18] = Static169.method2460(new Class62[] { local4[local18], arg0[local18] });
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(III)V")
	public static void method311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static139.aBoolean128 = true;
		Static182.anInt3832 = arg0;
		Static156.anInt3329 = arg1;
		Static15.anInt358 = arg2;
		Static127.anInt2807 = -1;
		Static5.anInt170 = -1;
	}
}
