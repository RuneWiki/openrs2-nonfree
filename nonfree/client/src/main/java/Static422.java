import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "F")
	public static float aFloat255;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_140 = new Class67("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "Lclient!eea;")
	public static final Class71 aClass71_65 = new Class71();

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
	public static int anInt8666 = 0;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
	public static int anInt8667 = -1;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZI)V")
	public static void method7126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub10_Sub16 local8 = Static362.method5701(arg1, 7);
		local8.method6211();
		local8.anInt7557 = arg0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)I")
	public static int method7128(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static343.method5438(arg0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
	public static void method7130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class290 local7 = Static279.aClass290ArrayArrayArray7[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class290 local28 = Static279.aClass290ArrayArrayArray7[local9][arg0][arg1] = Static279.aClass290ArrayArrayArray7[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte94--;
				for (@Pc(40) Class98 local40 = local28.aClass98_3; local40 != null; local40 = local40.aClass98_1) {
					@Pc(44) Class6_Sub1 local44 = local40.aClass6_Sub1_1;
					if (local44.aShort123 == arg0 && local44.aShort120 == arg1) {
						local44.aByte100--;
					}
				}
			}
		}
		if (Static279.aClass290ArrayArrayArray7[0][arg0][arg1] == null) {
			Static279.aClass290ArrayArrayArray7[0][arg0][arg1] = new Class290(0, arg0, arg1);
			Static279.aClass290ArrayArrayArray7[0][arg0][arg1].aByte95 = 1;
		}
		Static279.aClass290ArrayArrayArray7[0][arg0][arg1].aClass290_1 = local7;
		Static279.aClass290ArrayArrayArray7[3][arg0][arg1] = null;
	}
}
