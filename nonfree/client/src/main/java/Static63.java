import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_19 = new Class198("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
	public static final int anInt1196 = 1339;

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_16 = new Class194(17, 8);

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "Lclient!eg;")
	private static final Class60 aClass60_2 = new Class60("", 13);

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
	public static int anInt1197 = 0;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIII)V")
	public static void method994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1010) {
			Static181.method2469(Static248.aClass60_7, arg2, arg0);
		} else if (arg1 == 1006) {
			Static181.method2469(Static392.aClass60_8, arg2, arg0);
		} else if (arg1 == 1001) {
			Static181.method2469(Static7.aClass60_1, arg2, arg0);
		} else if (arg1 == 1009) {
			Static181.method2469(aClass60_2, arg2, arg0);
		} else if (arg1 == 1002) {
			Static181.method2469(Static77.aClass60_3, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!za;Lclient!ps;IIIII)V")
	public static void method995(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static96.anInt1667) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static439.anInt7318) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static459.anInt4775 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class258 local62 = Static319.aClass258ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static410.aClass125Array3[local17].ua(local23, local32) + Static410.aClass125Array3[local17].ua(local23 + 1, local32) + Static410.aClass125Array3[local17].ua(local23, local32 + 1) + Static410.aClass125Array3[local17].ua(local23 + 1, local32 + 1)) / 4 - (Static410.aClass125Array3[arg2].ua(arg3, arg4) + Static410.aClass125Array3[arg2].ua(arg3 + 1, arg4) + Static410.aClass125Array3[arg2].ua(arg3, arg4 + 1) + Static410.aClass125Array3[arg2].ua(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class2_Sub4 local143 = local62.aClass2_Sub4_2;
									@Pc(146) Class2_Sub4 local146 = local62.aClass2_Sub4_3;
									if (local143 != null && local143.method6024()) {
										arg1.method6023(arg0, local140, (local23 - arg3) * Static92.anInt1592 + (1 - arg5) * Static301.anInt4709, local143, (local32 - arg4) * Static92.anInt1592 + (1 - arg6) * Static301.anInt4709, local1);
									}
									if (local146 != null && local146.method6024()) {
										arg1.method6023(arg0, local140, (local23 - arg3) * Static92.anInt1592 + (1 - arg5) * Static301.anInt4709, local146, (local32 - arg4) * Static92.anInt1592 + (1 - arg6) * Static301.anInt4709, local1);
									}
									for (@Pc(219) Class122 local219 = local62.aClass122_3; local219 != null; local219 = local219.aClass122_1) {
										@Pc(223) Class2_Sub1 local223 = local219.aClass2_Sub1_1;
										if (local223 != null && local223.method6024() && (local23 == local223.aShort107 || local23 == local3) && (local32 == local223.aShort106 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort104 + 1 - local223.aShort107;
											@Pc(260) int local260 = local223.aShort105 + 1 - local223.aShort106;
											arg1.method6023(arg0, local140, (local223.aShort107 - arg3) * Static92.anInt1592 + (local252 - arg5) * Static301.anInt4709, local223, (local223.aShort106 - arg4) * Static92.anInt1592 + (local260 - arg6) * Static301.anInt4709, local1);
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

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Ljava/lang/String;CB)I")
	public static int method996(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg0.charAt(local17) == arg1) {
				local12++;
			}
		}
		return local12;
	}
}
