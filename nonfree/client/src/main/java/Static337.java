import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "I")
	public static int anInt5594;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "I")
	public static int anInt5598;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "I")
	public static int anInt5599;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "I")
	public static int anInt5595 = 0;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "Lclient!o;")
	public static final Class169 aClass169_303 = new Class169("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(JIZILjava/lang/String;Ljava/lang/String;IIIZI)V")
	public static void method4814(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (!Static65.aBoolean115 && Static215.anInt3678 < 500) {
			@Pc(16) int local16 = arg3 == -1 ? Static283.anInt4904 : arg3;
			@Pc(30) Class1_Sub40 local30 = new Class1_Sub40(arg5, arg4, local16, arg1, arg7, arg0, arg6, arg9, arg2, arg8);
			Static358.aClass17_66.method199(local30);
			Static215.anInt3678++;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method4816(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(28) int local28 = local19 + (arg1 ? Static153.anInt2825 : Static328.anInt5515);
		for (@Pc(30) int local30 = local19; local30 < local28; local30++) {
			@Pc(36) Class1_Sub6_Sub13 local36 = Static357.method5242(local30);
			if (local36.aBoolean458 && local36.method4183().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static6.anInt85 = -1;
					Static110.aShortArray122 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(67) short[] local67 = new short[local11.length * 2];
					for (@Pc(69) int local69 = 0; local69 < local13; local69++) {
						local67[local69] = local11[local69];
					}
					local11 = local67;
				}
				local11[local13++] = (short) local30;
			}
		}
		Static6.anInt85 = local13;
		Static110.aShortArray122 = local11;
		Static148.anInt2721 = 0;
		@Pc(106) String[] local106 = new String[Static6.anInt85];
		for (@Pc(108) int local108 = 0; local108 < Static6.anInt85; local108++) {
			local106[local108] = Static357.method5242(local11[local108]).method4183();
		}
		Static364.method5203(Static110.aShortArray122, local106);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V")
	public static void method4818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static6.anInt90 == 1) {
			Static215.aClass51Array15[Static90.anInt1653 / 100].method4669(Static205.anInt3606 - 8, Static42.anInt828 + -8);
		}
		if (Static6.anInt90 == 2) {
			Static215.aClass51Array15[Static90.anInt1653 / 100 + 4].method4669(Static205.anInt3606 - 8, Static42.anInt828 + -8);
		}
		Static59.method975();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLjava/lang/String;I)I")
	public static int method4820(@OriginalArg(1) String arg0) {
		return Static157.method2353(arg0, 16);
	}
}
