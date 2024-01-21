import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	public static int anInt1522;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Lclient!dc;")
	public static Class19 aClass19_4 = new Class19();

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_479 = Static181.method2795("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!qe;IILclient!qe;Lclient!qe;I)V")
	public static void method1183(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class83 arg2, @OriginalArg(4) Class83 arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static83.anIntArray177[local3] = Static83.anIntArray177[local3 - 1];
			Static98.aClass83Array36[local3] = Static98.aClass83Array36[local3 - 1];
			Static33.aClass83Array19[local3] = Static33.aClass83Array19[local3 - 1];
			Static13.aClass83Array6[local3] = Static13.aClass83Array6[local3 - 1];
			Static10.anIntArray20[local3] = Static10.anIntArray20[local3 - 1];
		}
		Static98.aClass83Array36[0] = arg3;
		Static33.aClass83Array19[0] = arg0;
		Static215.anInt4271++;
		Static166.anInt3429 = Static29.anInt739;
		Static13.aClass83Array6[0] = arg2;
		Static83.anIntArray177[0] = arg1;
		Static10.anIntArray20[0] = arg4;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIB)V")
	public static void method1187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class19 local11 = Static93.aClass19ArrayArrayArray1[Static43.anInt1126][arg1][arg0];
		if (local11 == null) {
			Static160.method2456(Static43.anInt1126, arg1, arg0);
			return;
		}
		@Pc(20) Class2_Sub2_Sub19 local20 = null;
		@Pc(22) int local22 = -99999999;
		@Pc(34) Class2_Sub2_Sub19 local34;
		for (local34 = (Class2_Sub2_Sub19) local11.method691(); local34 != null; local34 = (Class2_Sub2_Sub19) local11.method686()) {
			@Pc(41) Class2_Sub2_Sub3 local41 = Static113.method1987(local34.aClass24_Sub5_1.anInt3068);
			@Pc(44) int local44 = local41.anInt448;
			if (local41.anInt465 == 1) {
				local44 *= local34.aClass24_Sub5_1.anInt3071 + 1;
			}
			if (local44 > local22) {
				local20 = local34;
				local22 = local44;
			}
		}
		if (local20 == null) {
			Static160.method2456(Static43.anInt1126, arg1, arg0);
			return;
		}
		local11.method682(local20);
		local34 = (Class2_Sub2_Sub19) local11.method691();
		@Pc(98) Class24_Sub5 local98 = null;
		@Pc(100) Class24_Sub5 local100 = null;
		while (local34 != null) {
			@Pc(104) Class24_Sub5 local104 = local34.aClass24_Sub5_1;
			if (local104.anInt3068 != local20.aClass24_Sub5_1.anInt3068) {
				if (local98 == null) {
					local98 = local104;
				}
				if (local98.anInt3068 != local104.anInt3068 && local100 == null) {
					local100 = local104;
				}
			}
			local34 = (Class2_Sub2_Sub19) local11.method686();
		}
		@Pc(139) long local139 = (long) (arg1 + (arg0 << 7) + 1610612736);
		Static123.method2102(Static43.anInt1126, arg1, arg0, Static177.method2711(arg1 * 128 + 64, Static43.anInt1126, arg0 * 128 + 64), local20.aClass24_Sub5_1, local139, local98, local100);
	}
}
