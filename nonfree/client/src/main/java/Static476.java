import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!ss", name = "p", descriptor = "Lclient!jo;")
	public static Class168 aClass168_110;

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_151 = new Class254(37, 6);

	@OriginalMember(owner = "client!ss", name = "n", descriptor = "[I")
	public static final int[] anIntArray768 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "Lclient!jda;")
	public static final Class162 aClass162_3 = new Class162("runescape", 0);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!fp;I)V")
	public static void method7283(@OriginalArg(0) Class11_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class11_Sub1_Sub1_Sub1) {
			@Pc(17) Class11_Sub1_Sub1_Sub1 local17 = (Class11_Sub1_Sub1_Sub1) arg0;
			if (local17.aClass222_1 != null) {
				Static527.method7664(local17.aByte77 != Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77, local17);
				return;
			}
		} else if (arg0 instanceof Class11_Sub1_Sub1_Sub2) {
			@Pc(42) Class11_Sub1_Sub1_Sub2 local42 = (Class11_Sub1_Sub1_Sub2) arg0;
			Static457.method7112(local42, Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77 != local42.aByte77);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!fu;)V")
	public static void method7284(@OriginalArg(0) Class11_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort78; local2 <= arg0.aShort79; local2++) {
			for (@Pc(6) int local6 = arg0.aShort80; local6 <= arg0.aShort77; local6++) {
				@Pc(16) Class224 local16 = Static256.aClass224ArrayArrayArray1[arg0.aByte77][local2][local6];
				if (local16 != null) {
					@Pc(21) Class270 local21 = local16.aClass270_1;
					@Pc(23) Class270 local23 = null;
					while (local21 != null) {
						if (local21.aClass11_Sub1_2 == arg0) {
							if (local23 == null) {
								local16.aClass270_1 = local21.aClass270_2;
							} else {
								local23.aClass270_2 = local21.aClass270_2;
							}
							local21.method6555();
							break;
						}
						local23 = local21;
						local21 = local21.aClass270_2;
					}
					local16.aByte66 = 0;
					for (@Pc(56) Class270 local56 = local16.aClass270_1; local56 != null; local56 = local56.aClass270_2) {
						local16.aByte66 = (byte) (local16.aByte66 | local56.anInt7849);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
	public static void method7285() {
		for (@Pc(18) Class6_Sub4_Sub17 local18 = (Class6_Sub4_Sub17) Static409.aClass211_62.method5183(); local18 != null; local18 = (Class6_Sub4_Sub17) Static409.aClass211_62.method5177()) {
			@Pc(23) Class11_Sub1_Sub2 local23 = local18.aClass11_Sub1_Sub2_1;
			if (local23.aBoolean188) {
				local18.method8151();
				local23.method1685();
			} else if (Static508.anInt8998 >= local23.anInt1874) {
				local23.method1688(Static388.anInt7269);
				if (local23.aBoolean188) {
					local18.method8151();
				} else {
					Static88.method1973(local23, true);
				}
			}
		}
	}
}
