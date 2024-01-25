import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_42 = new Class62("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_27 = new Class208(79, -1);

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
	public static int anInt1432 = 0;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_43 = new Class62("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method1171() {
		Static77.method1332(Static155.aClass183_45);
		Static76.aClass2_Sub24_Sub2_7.method5721(Static91.anInt1960);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!oj;Lclient!a;IIIII)V")
	public static void method1176(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static73.anInt1624) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static176.anInt3742) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static285.anInt5263 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class188 local62 = Static45.aClass188ArrayArrayArray5[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static128.aClass149Array1[local17].method5837(local23, local32) + Static128.aClass149Array1[local17].method5837(local23 + 1, local32) + Static128.aClass149Array1[local17].method5837(local23, local32 + 1) + Static128.aClass149Array1[local17].method5837(local23 + 1, local32 + 1)) / 4 - (Static128.aClass149Array1[arg2].method5837(arg3, arg4) + Static128.aClass149Array1[arg2].method5837(arg3 + 1, arg4) + Static128.aClass149Array1[arg2].method5837(arg3, arg4 + 1) + Static128.aClass149Array1[arg2].method5837(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class1_Sub5 local143 = local62.aClass1_Sub5_2;
									@Pc(146) Class1_Sub5 local146 = local62.aClass1_Sub5_1;
									if (local143 != null && local143.method6015()) {
										arg1.method6019((local23 - arg3) * Static169.anInt5687 + (1 - arg5) * Static291.anInt5453, local140, local1, local143, (local32 - arg4) * Static169.anInt5687 + (1 - arg6) * Static291.anInt5453, arg0);
									}
									if (local146 != null && local146.method6015()) {
										arg1.method6019((local23 - arg3) * Static169.anInt5687 + (1 - arg5) * Static291.anInt5453, local140, local1, local146, (local32 - arg4) * Static169.anInt5687 + (1 - arg6) * Static291.anInt5453, arg0);
									}
									for (@Pc(219) Class168 local219 = local62.aClass168_2; local219 != null; local219 = local219.aClass168_1) {
										@Pc(223) Class1_Sub2 local223 = local219.aClass1_Sub2_1;
										if (local223 != null && local223.method6015() && (local23 == local223.aShort95 || local23 == local3) && (local32 == local223.aShort96 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort97 + 1 - local223.aShort95;
											@Pc(260) int local260 = local223.aShort94 + 1 - local223.aShort96;
											arg1.method6019((local223.aShort95 - arg3) * Static169.anInt5687 + (local252 - arg5) * Static291.anInt5453, local140, local1, local223, (local223.aShort96 - arg4) * Static169.anInt5687 + (local260 - arg6) * Static291.anInt5453, arg0);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)V")
	public static void method1177(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static328.method5290(16, arg1);
		local8.method1198();
		local8.anInt1465 = arg0;
	}
}
