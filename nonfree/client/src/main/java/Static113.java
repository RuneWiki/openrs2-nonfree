import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
	public static int anInt2340;

	@OriginalMember(owner = "client!ng", name = "X", descriptor = "I")
	public static int anInt2349;

	@OriginalMember(owner = "client!ng", name = "db", descriptor = "Lclient!df;")
	public static Class2_Sub2_Sub2_Sub2 aClass2_Sub2_Sub2_Sub2_2;

	@OriginalMember(owner = "client!ng", name = "N", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1095 = Static32.method683("Loaded config");

	@OriginalMember(owner = "client!ng", name = "G", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1094 = aClass49_1095;

	@OriginalMember(owner = "client!ng", name = "I", descriptor = "Lclient!jg;")
	public static Class2_Sub17 aClass2_Sub17_1 = new Class2_Sub17(0, 0);

	@OriginalMember(owner = "client!ng", name = "P", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1096 = Static32.method683("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!ng", name = "ab", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!ng", name = "cb", descriptor = "[[I")
	public static int[][] anIntArrayArray23 = new int[5][5000];

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Lclient!ie;")
	public static Class2_Sub2_Sub10 method1913(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub10 local10 = (Class2_Sub2_Sub10) Static54.aClass74_34.method2345((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static78.aClass11_66.method2049(arg0, 10);
		local10 = new Class2_Sub2_Sub10();
		local10.anInt1590 = arg0;
		if (local27 != null) {
			local10.method1240(new Class2_Sub13(local27));
		}
		local10.method1246();
		if (local10.anInt1614 != -1) {
			local10.method1248(method1913(local10.anInt1592), method1913(local10.anInt1614));
		}
		if (!Static96.aBoolean85 && local10.aBoolean69) {
			local10.aBoolean70 = false;
			local10.anInt1621 = 0;
			local10.aClass49Array11 = null;
			local10.aClass49_834 = Static171.aClass49_1681;
			local10.aClass49Array12 = null;
		}
		Static54.aClass74_34.method2341((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V")
	public static void method1916() {
		Class2_Sub2_Sub12.aLongArray14 = null;
		aClass2_Sub17_1 = null;
		aClass49_1095 = null;
		aClass49_1094 = null;
		anIntArrayArray23 = null;
		aClass2_Sub2_Sub2_Sub2_2 = null;
		aClass49_1096 = null;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "([BIII)Z")
	public static boolean method1918(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class2_Sub13 local17 = new Class2_Sub13(arg0);
		@Pc(19) int local19 = -1;
		label54: while (true) {
			@Pc(23) int local23 = local17.method2959();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local17.method2924();
					if (local39 == 0) {
						continue label54;
					}
					@Pc(65) int local65 = local17.method2962() >> 2;
					local31 += local39 - 1;
					@Pc(77) int local77 = local31 >> 6 & 0x3F;
					@Pc(81) int local81 = local31 & 0x3F;
					@Pc(85) int local85 = arg1 + local81;
					@Pc(90) int local90 = local77 + arg2;
					if (local90 > 0 && local85 > 0 && local90 < 103 && local85 < 103) {
						@Pc(111) Class2_Sub2_Sub9 local111 = Static124.method2146(local19);
						if (local65 != 22 || !Static159.aBoolean148 || local111.anInt1501 != 0 || local111.anInt1490 == 1 || local111.aBoolean62) {
							local33 = true;
							if (!local111.method1208()) {
								local12 = false;
								Static125.anInt2749++;
							}
						}
					}
				}
				local39 = local17.method2924();
				if (local39 == 0) {
					break;
				}
				local17.method2962();
			}
		}
	}
}
