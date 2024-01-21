import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
	public static int anInt818;

	@OriginalMember(owner = "client!of", name = "qb", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!of", name = "U", descriptor = "Lclient!rf;")
	public static Class70 aClass70_282 = Static49.method1293("null");

	@OriginalMember(owner = "client!of", name = "W", descriptor = "Lclient!rf;")
	private static Class70 aClass70_283 = Static49.method1293("glow3:");

	@OriginalMember(owner = "client!of", name = "X", descriptor = "Lclient!rf;")
	public static Class70 aClass70_284 = Static49.method1293("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!of", name = "Z", descriptor = "Lclient!rf;")
	private static Class70 aClass70_285 = Static49.method1293("Existing User");

	@OriginalMember(owner = "client!of", name = "cb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_286 = aClass70_283;

	@OriginalMember(owner = "client!of", name = "db", descriptor = "Lclient!rf;")
	public static Class70 aClass70_287 = Static49.method1293("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!of", name = "eb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_288 = aClass70_285;

	@OriginalMember(owner = "client!of", name = "gb", descriptor = "I")
	public static int anInt822 = 0;

	@OriginalMember(owner = "client!of", name = "hb", descriptor = "I")
	public static int anInt823 = 0;

	@OriginalMember(owner = "client!of", name = "lb", descriptor = "[[I")
	public static int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!of", name = "nb", descriptor = "I")
	public static int anInt827 = 0;

	@OriginalMember(owner = "client!of", name = "rb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_289 = aClass70_283;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IB[BI)Z")
	public static boolean method629(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14 = -1;
		@Pc(19) Class1_Sub9 local19 = new Class1_Sub9(arg1);
		label54: while (true) {
			@Pc(25) int local25 = local19.method1258();
			if (local25 == 0) {
				return local12;
			}
			local14 += local25;
			@Pc(33) int local33 = 0;
			@Pc(35) boolean local35 = false;
			while (true) {
				@Pc(41) int local41;
				while (!local35) {
					local41 = local19.method1244();
					if (local41 == 0) {
						continue label54;
					}
					@Pc(69) int local69 = local19.method1234() >> 2;
					local33 += local41 - 1;
					@Pc(79) int local79 = local33 & 0x3F;
					@Pc(85) int local85 = local33 >> 6 & 0x3F;
					@Pc(89) int local89 = arg0 + local85;
					@Pc(93) int local93 = arg2 + local79;
					if (local89 > 0 && local93 > 0 && local89 < 103 && local93 < 103) {
						@Pc(110) Class1_Sub1_Sub7 local110 = Static176.method3433(local14);
						if (local69 != 22 || !Static79.aBoolean91 || local110.anInt1809 != 0 || local110.anInt1842 == 1 || local110.aBoolean64) {
							local35 = true;
							if (!local110.method1407()) {
								Static131.anInt3437++;
								local12 = false;
							}
						}
					}
				}
				local41 = local19.method1244();
				if (local41 == 0) {
					break;
				}
				local19.method1234();
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V")
	public static void method630() {
		aClass70_286 = null;
		aClass70_288 = null;
		aClass70_282 = null;
		aClass70_287 = null;
		aClass70_284 = null;
		aClass70_283 = null;
		aClass70_285 = null;
		anIntArrayArray3 = null;
		aBooleanArray5 = null;
		aClass70_289 = null;
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "(B)V")
	public static void method631() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(18) int local18 = 0; local18 < Static162.anInt4331 - 1; local18++) {
				if (Static20.aShortArray7[local18] < 1000 && Static20.aShortArray7[local18 + 1] > 1000) {
					local7 = false;
					@Pc(40) Class70 local40 = Static174.aClass70Array23[local18];
					Static174.aClass70Array23[local18] = Static174.aClass70Array23[local18 + 1];
					Static174.aClass70Array23[local18 + 1] = local40;
					@Pc(58) Class70 local58 = Static30.aClass70Array6[local18];
					Static30.aClass70Array6[local18] = Static30.aClass70Array6[local18 + 1];
					Static30.aClass70Array6[local18 + 1] = local58;
					@Pc(76) int local76 = Static170.anIntArray420[local18];
					Static170.anIntArray420[local18] = Static170.anIntArray420[local18 + 1];
					Static170.anIntArray420[local18 + 1] = local76;
					@Pc(94) int local94 = Static80.anIntArray241[local18];
					Static80.anIntArray241[local18] = Static80.anIntArray241[local18 + 1];
					Static80.anIntArray241[local18 + 1] = local94;
					@Pc(112) short local112 = Static20.aShortArray7[local18];
					Static20.aShortArray7[local18] = Static20.aShortArray7[local18 + 1];
					Static20.aShortArray7[local18 + 1] = local112;
					@Pc(130) long local130 = Static166.aLongArray9[local18];
					Static166.aLongArray9[local18] = Static166.aLongArray9[local18 + 1];
					Static166.aLongArray9[local18 + 1] = local130;
				}
			}
		}
	}
}
