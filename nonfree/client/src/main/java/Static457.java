import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!st", name = "l", descriptor = "[I")
	public static int[] anIntArray732;

	@OriginalMember(owner = "client!st", name = "j", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_118 = new Class45("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method7001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) Class1_Sub46 local15 = null;
		for (@Pc(20) Class1_Sub46 local20 = (Class1_Sub46) Static30.aClass295_6.method7543(); local20 != null; local20 = (Class1_Sub46) Static30.aClass295_6.method7540()) {
			if (arg6 == local20.anInt7933 && arg3 == local20.anInt7932 && arg5 == local20.anInt7922 && arg4 == local20.anInt7931) {
				local15 = local20;
				break;
			}
		}
		if (local15 == null) {
			local15 = new Class1_Sub46();
			local15.anInt7922 = arg5;
			local15.anInt7931 = arg4;
			local15.anInt7933 = arg6;
			local15.anInt7932 = arg3;
			if (arg3 >= 0 && arg5 >= 0 && arg3 < Static237.anInt4563 && Static373.anInt6694 > arg5) {
				Static204.method3807(local15);
			}
			Static30.aClass295_6.method7533(local15);
		}
		local15.anInt7928 = arg2;
		local15.anInt7921 = 0;
		local15.anInt7925 = arg0;
		local15.anInt7929 = arg1;
		local15.anInt7927 = -1;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!n;ILclient!dn;)V")
	public static void method7004(@OriginalArg(0) Interface13 arg0, @OriginalArg(2) Class69 arg1) {
		Static299.aClass69_60 = arg1;
		Static342.anInterface13_11 = arg0;
	}
}
