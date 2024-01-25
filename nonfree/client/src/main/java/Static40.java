import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/lang/Object;IZ)[B")
	public static byte[] method1149(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(20) byte[] local20 = (byte[]) arg1;
			return Static357.method7482(local20, arg0);
		} else if (arg1 instanceof Class130) {
			@Pc(32) Class130 local32 = (Class130) arg1;
			return local32.method6346(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILclient!ha;BIII)V")
	public static void method1152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if ((Static724.aClass178_34 == null || Static551.aClass178_22 == null || Static627.aClass178_27 == null) && Static218.aClass182_59.method3964(Static649.anInt10015) && Static218.aClass182_59.method3964(Static66.anInt1586) && Static218.aClass182_59.method3964(Static298.anInt4559)) {
			@Pc(42) Class361 local42 = Static735.method8269(Static218.aClass182_59, Static66.anInt1586, 0);
			Static551.aClass178_22 = arg2.method9363(local42, true);
			local42.method8282();
			Static628.aClass178_28 = arg2.method9363(local42, true);
			Static724.aClass178_34 = arg2.method9363(Static735.method8269(Static218.aClass182_59, Static649.anInt10015, 0), true);
			@Pc(67) Class361 local67 = Static735.method8269(Static218.aClass182_59, Static298.anInt4559, 0);
			Static627.aClass178_27 = arg2.method9363(local67, true);
			local67.method8282();
			Static11.aClass178_1 = arg2.method9363(local67, true);
		}
		if (Static724.aClass178_34 == null || Static551.aClass178_22 == null || Static627.aClass178_27 == null) {
			return;
		}
		@Pc(104) int local104 = (arg1 - Static627.aClass178_27.method7636() * 2) / Static724.aClass178_34.method7636();
		for (@Pc(106) int local106 = 0; local106 < local104; local106++) {
			Static724.aClass178_34.method7637(arg0 + Static627.aClass178_27.method7636() + Static724.aClass178_34.method7636() * local106, -Static724.aClass178_34.method7618() + arg3 + arg4);
		}
		@Pc(149) int local149 = (arg3 - Static627.aClass178_27.method7618() - 20) / Static551.aClass178_22.method7618();
		for (@Pc(151) int local151 = 0; local151 < local149; local151++) {
			Static551.aClass178_22.method7637(arg0, local151 * Static551.aClass178_22.method7618() + arg4 + 20);
			Static628.aClass178_28.method7637(arg0 + arg1 - Static628.aClass178_28.method7636(), arg4 + 20 + local151 * Static551.aClass178_22.method7618());
		}
		Static627.aClass178_27.method7637(arg0, arg3 + arg4 - Static627.aClass178_27.method7618());
		Static11.aClass178_1.method7637(arg1 + arg0 - Static627.aClass178_27.method7636(), arg4 + arg3 + -Static627.aClass178_27.method7618());
	}
}
