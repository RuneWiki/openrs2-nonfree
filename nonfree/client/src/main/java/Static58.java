import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!caa", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString12;

	@OriginalMember(owner = "client!caa", name = "q", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_43 = new Class288(69, 12);

	@OriginalMember(owner = "client!caa", name = "u", descriptor = "[J")
	public static final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!caa", name = "x", descriptor = "Lclient!mha;")
	public static final Class222 aClass222_8 = new Class222(11, 0, 1, 2);

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V")
	public static void method898() {
		@Pc(7) int local7 = Static580.anInt9430;
		@Pc(14) int[] local14 = Static6.anIntArray9;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class13_Sub1_Sub1_Sub1_Sub2 local24 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local14[local16]];
			if (local24 != null) {
				Static100.method1529(local24, local24.method3950());
			}
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method900(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static352.anInt5497 >= 200 && !Static296.aBoolean353 || Static352.anInt5497 >= 200) {
			Static3.method8592(Static434.aClass271_10.method5972(Static483.anInt7694));
			local30 = Static434.aClass271_11.method5972(Static483.anInt7694);
			if (local30 != null) {
				Static3.method8592(local30);
			}
			return;
		}
		local30 = Static60.method906(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(85) String local85;
		for (@Pc(46) int local46 = 0; local46 < Static352.anInt5497; local46++) {
			@Pc(54) String local54 = Static60.method906(Static213.aStringArray13[local46]);
			if (local54 != null && local54.equals(local30)) {
				Static3.method8592(arg0 + Static434.aClass271_38.method5972(Static483.anInt7694));
				return;
			}
			if (Static565.aStringArray44[local46] != null) {
				local85 = Static60.method906(Static565.aStringArray44[local46]);
				if (local85 != null && local85.equals(local30)) {
					Static3.method8592(arg0 + Static434.aClass271_38.method5972(Static483.anInt7694));
					return;
				}
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static124.anInt2182; local116++) {
			local85 = Static60.method906(Static214.aStringArray14[local116]);
			if (local85 != null && local85.equals(local30)) {
				Static3.method8592(Static434.aClass271_43.method5972(Static483.anInt7694) + arg0 + Static434.aClass271_44.method5972(Static483.anInt7694));
				return;
			}
			if (Static594.aStringArray45[local116] != null) {
				@Pc(160) String local160 = Static60.method906(Static594.aStringArray45[local116]);
				if (local160 != null && local160.equals(local30)) {
					Static3.method8592(Static434.aClass271_43.method5972(Static483.anInt7694) + arg0 + Static434.aClass271_44.method5972(Static483.anInt7694));
					return;
				}
			}
		}
		if (Static60.method906(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aString50).equals(local30)) {
			Static3.method8592(Static434.aClass271_41.method5972(Static483.anInt7694));
		} else {
			@Pc(222) Class2_Sub40 local222 = Static464.method6285(Static251.aClass131_1, Static388.aClass179_84);
			local222.aClass2_Sub22_Sub2_2.method8537(Static154.method2286(arg0));
			local222.aClass2_Sub22_Sub2_2.method8540(arg0);
			Static528.method7295(local222);
		}
	}

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)V")
	public static void method901() {
		Static64.method918();
		Static627.aBoolean736 = false;
		Static252.method3508(Static408.anInt6345, Static46.anInt975, Static467.anInt7465, Static139.anInt2567);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IILclient!ul;I)V")
	public static void method902(@OriginalArg(0) int arg0, @OriginalArg(2) Class350 arg1, @OriginalArg(3) int arg2) {
		Static113.aClass350ArrayArray1[arg2][arg0] = arg1;
	}
}
