import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!bha;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "Lclient!tj;")
	public static Class357 aClass357_1 = new Class357();

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
	public static int anInt28 = -1;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
	public static int anInt30 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!rba;I)V")
	public static void method39(@OriginalArg(0) Class3_Sub28 arg0) {
		if (arg0.aByteArray50.length - arg0.anInt6241 < 1) {
			return;
		}
		@Pc(22) int local22 = arg0.method5322(-52);
		if (local22 < 0 || local22 > 1 || arg0.aByteArray50.length - arg0.anInt6241 < 2) {
			return;
		}
		@Pc(50) int local50 = arg0.method5272();
		if (arg0.aByteArray50.length - arg0.anInt6241 < local50 * 6) {
			return;
		}
		for (@Pc(69) int local69 = 0; local69 < local50; local69++) {
			@Pc(75) int local75 = arg0.method5272();
			@Pc(79) int local79 = arg0.method5312();
			if (Static568.anIntArray608.length > local75 && Static214.aBooleanArray11[local75] && (Static76.aClass168_1.method4111(local75).aChar5 != '1' || local79 >= -1 && local79 <= 1)) {
				Static568.anIntArray608[local75] = local79;
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B[B)V")
	public static void method40(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class3_Sub28 local15 = new Class3_Sub28(arg0);
		while (true) {
			@Pc(19) int local19 = local15.method5322(-68);
			if (local19 == 0) {
				return;
			}
			if (local19 == 1) {
				@Pc(29) int local29 = local15.method5272();
				if (Static183.anInt3251 == -1) {
					Static183.anInt3251 = local29;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZIILclient!lb;ZI)V")
	public static void method41(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class221 arg2, @OriginalArg(6) int arg3) {
		if (arg3 <= 0) {
			Static152.method2444(arg0, arg2, arg1);
			return;
		}
		Static375.aBoolean498 = false;
		Static114.anInt2270 = 0;
		Static78.anInt1227 = arg1;
		Static481.aClass221_127 = arg2;
		Static112.anInt2244 = 1;
		Static713.aClass3_Sub22_Sub5_4 = null;
		Static554.anInt9248 = arg0;
		Static172.anInt3134 = Static671.aClass3_Sub22_Sub5_3.method9323() / arg3;
		if (Static172.anInt3134 < 1) {
			Static172.anInt3134 = 1;
		}
	}
}
