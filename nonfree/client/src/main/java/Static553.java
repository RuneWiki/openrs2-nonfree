import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
	public static int anInt9153;

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "[I")
	public static final int[] anIntArray704 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "[I")
	public static final int[] anIntArray705 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7806(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(32) String local32;
		if (Static74.anInt1238 >= 200 && !Static386.aBoolean562 || Static74.anInt1238 >= 200) {
			Static88.method1388(Static76.aClass58_11.method1237(Static321.anInt5554));
			local32 = Static76.aClass58_12.method1237(Static321.anInt5554);
			if (local32 != null) {
				Static88.method1388(local32);
			}
			return;
		}
		local32 = Static250.method3883(arg0);
		if (local32 == null) {
			return;
		}
		@Pc(87) String local87;
		for (@Pc(48) int local48 = 0; local48 < Static74.anInt1238; local48++) {
			@Pc(56) String local56 = Static250.method3883(Static182.aStringArray13[local48]);
			if (local56 != null && local56.equals(local32)) {
				Static88.method1388(arg0 + Static76.aClass58_39.method1237(Static321.anInt5554));
				return;
			}
			if (Static228.aStringArray17[local48] != null) {
				local87 = Static250.method3883(Static228.aStringArray17[local48]);
				if (local87 != null && local87.equals(local32)) {
					Static88.method1388(arg0 + Static76.aClass58_39.method1237(Static321.anInt5554));
					return;
				}
			}
		}
		for (@Pc(114) int local114 = 0; local114 < Static310.anInt5466; local114++) {
			local87 = Static250.method3883(Static368.aStringArray26[local114]);
			if (local87 != null && local87.equals(local32)) {
				Static88.method1388(Static76.aClass58_44.method1237(Static321.anInt5554) + arg0 + Static76.aClass58_45.method1237(Static321.anInt5554));
				return;
			}
			if (Static107.aStringArray9[local114] != null) {
				@Pc(158) String local158 = Static250.method3883(Static107.aStringArray9[local114]);
				if (local158 != null && local158.equals(local32)) {
					Static88.method1388(Static76.aClass58_44.method1237(Static321.anInt5554) + arg0 + Static76.aClass58_45.method1237(Static321.anInt5554));
					return;
				}
			}
		}
		if (Static250.method3883(Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aString42).equals(local32)) {
			Static88.method1388(Static76.aClass58_42.method1237(Static321.anInt5554));
		} else {
			@Pc(224) Class5_Sub40 local224 = Static25.method507(Static98.aClass208_2, Static540.aClass181_76);
			local224.aClass5_Sub12_Sub2_2.method8647(Static352.method5589(arg0));
			local224.aClass5_Sub12_Sub2_2.method8619(arg0);
			Static612.method8496(local224);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)Z")
	public static boolean method7807(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
