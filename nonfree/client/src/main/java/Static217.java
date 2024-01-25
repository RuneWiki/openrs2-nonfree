import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_130 = new Class186(51, -2);

	@OriginalMember(owner = "client!ks", name = "C", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_55 = new Class242("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!ks", name = "E", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_77 = new Class36(20, 7);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZLclient!rk;)I")
	public static int method3084(@OriginalArg(1) Class6_Sub2_Sub1_Sub2 arg0) {
		@Pc(13) Class243 local13 = arg0.aClass243_1;
		if (local13.anIntArray613 != null) {
			local13 = local13.method5337(Static155.aClass149_1);
			if (local13 == null) {
				return -1;
			}
		}
		@Pc(32) int local32 = local13.anInt6879;
		@Pc(36) Class132 local36 = arg0.method4762();
		if (arg0.aBoolean421) {
			local32 = local13.anInt6889;
		} else if (arg0.anInt6077 == local36.anInt3752 || local36.anInt3737 == arg0.anInt6077 || local36.anInt3754 == arg0.anInt6077 || arg0.anInt6077 == local36.anInt3759) {
			local32 = local13.anInt6905;
		} else if (local36.anInt3750 == arg0.anInt6077 || arg0.anInt6077 == local36.anInt3740 || local36.anInt3738 == arg0.anInt6077 || local36.anInt3742 == arg0.anInt6077) {
			local32 = local13.anInt6901;
		}
		return local32;
	}

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)V")
	public static void method3090() {
		Static363.aClass258_45.method5527();
		for (@Pc(13) Class4_Sub21 local13 = (Class4_Sub21) Static126.aClass258_19.method5538(); local13 != null; local13 = (Class4_Sub21) Static126.aClass258_19.method5528()) {
			if (local13.anInt3041 < 1000) {
				local13.method5854();
				Static363.aClass258_45.method5526(local13);
			}
		}
		Static363.aClass258_45.method5534(Static126.aClass258_19);
		@Pc(45) int local45 = -1;
		@Pc(50) Class4_Sub10 local50 = (Class4_Sub10) Static157.aClass258_24.method5538();
		if (local50 != null) {
			local45 = local50.method1653();
		}
		if (!Static346.aBoolean427) {
			if (local45 == 0 && (Static424.anInt7121 == 1 && Static83.anInt1893 > 2 || Static270.method3651())) {
				local45 = 2;
			}
			if (local45 == 2 && Static83.anInt1893 > 0 && local50 != null) {
				if (Static15.aClass126_1 == null && Static200.anInt3846 == 0) {
					Static70.method5673(local50.method1652(), local50.method1648());
				} else {
					Static97.anInt2093 = 2;
				}
			}
			if (local45 == 0 && Static83.anInt1893 > 0) {
				Static99.method4521();
			}
			if (Static15.aClass126_1 != null || Static200.anInt3846 != 0) {
				return;
			}
			Static84.aClass4_Sub21_1 = null;
			Static97.anInt2093 = 0;
			return;
		}
		@Pc(65) int local65;
		@Pc(69) int local69;
		if (local45 == -1) {
			local65 = Static284.aClass12_1.method4220();
			local69 = Static284.aClass12_1.method4219();
			if (local65 < Static104.anInt2229 - 10 || local65 > Static104.anInt2229 + Static346.anInt6292 + 10 || local69 < Static171.anInt3173 - 10 || local69 > Static434.anInt7227 + Static171.anInt3173 + 10) {
				Static346.aBoolean427 = false;
				Static436.method5629(Static346.anInt6292, Static171.anInt3173, Static434.anInt7227, Static104.anInt2229);
			}
		}
		if (local45 != 0) {
			return;
		}
		local65 = Static104.anInt2229;
		local69 = Static171.anInt3173;
		@Pc(125) int local125 = Static346.anInt6292;
		@Pc(131) int local131 = local50.method1648();
		@Pc(135) int local135 = local50.method1652();
		@Pc(137) int local137 = -1;
		@Pc(157) int local157;
		for (@Pc(139) int local139 = 0; local139 < Static83.anInt1893; local139++) {
			if (Static60.aBoolean103) {
				local157 = (Static83.anInt1893 - local139 - 1) * 16 + local69 + 33;
				if (local131 > local65 && local131 < local65 + local125 && local135 > local157 - 13 && local157 + 4 > local135) {
					local137 = local139;
				}
			} else {
				local157 = local69 + (Static83.anInt1893 - local139 - 1) * 16 + 31;
				if (local65 < local131 && local125 + local65 > local131 && local157 - 13 < local135 && local157 + 3 > local135) {
					local137 = local139;
				}
			}
		}
		if (local137 != -1) {
			local157 = 0;
			@Pc(252) Class18 local252 = new Class18(Static126.aClass258_19);
			for (@Pc(257) Class4_Sub21 local257 = (Class4_Sub21) local252.method524(); local257 != null; local257 = (Class4_Sub21) local252.method526()) {
				if (local157 == local137) {
					Static200.method2883(local131, local257, local135);
				}
				local157++;
			}
		}
		Static346.aBoolean427 = false;
		Static436.method5629(Static346.anInt6292, Static171.anInt3173, Static434.anInt7227, Static104.anInt2229);
		return;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method3095(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(29) int local29 = (arg0 ? Static390.aClass221_2.anInt6495 : Static390.aClass221_2.anInt6489) + local19;
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class4_Sub1_Sub10 local38 = Static390.aClass221_2.method5054(local31);
			if (local38.aBoolean336 && local38.method3463().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static227.anInt4176 = -1;
					Static98.aShortArray17 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(67) short[] local67 = new short[local11.length * 2];
					for (@Pc(69) int local69 = 0; local69 < local13; local69++) {
						local67[local69] = local11[local69];
					}
					local11 = local67;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static98.aShortArray17 = local11;
		Static344.anInt6182 = 0;
		Static227.anInt4176 = local13;
		@Pc(111) String[] local111 = new String[Static227.anInt4176];
		for (@Pc(113) int local113 = 0; local113 < Static227.anInt4176; local113++) {
			local111[local113] = Static390.aClass221_2.method5054(local11[local113]).method3463();
		}
		Static455.method5871(local111, Static98.aShortArray17);
	}
}
