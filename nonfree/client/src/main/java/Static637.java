import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!wq", name = "O", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_62 = new Class233(3000000, 200);

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IILclient!bb;II)V")
	public static void method8528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub6 arg2, @OriginalArg(3) int arg3) {
		@Pc(16) long local16 = (long) (arg1 << 14 | arg0 << 28 | arg3);
		@Pc(22) Class2_Sub44 local22 = (Class2_Sub44) Static64.aClass222_5.method5468(local16);
		if (local22 == null) {
			local22 = new Class2_Sub44();
			Static64.aClass222_5.method5476(local22, local16);
			local22.aClass238_59.method5837(arg2);
			return;
		}
		@Pc(45) Class245 local45 = Static570.aClass267_2.method6597(arg2.anInt842);
		@Pc(48) int local48 = local45.anInt7481;
		if (local45.anInt7464 == 1) {
			local48 *= arg2.anInt841 + 1;
		}
		for (@Pc(67) Class2_Sub6 local67 = (Class2_Sub6) local22.aClass238_59.method5833(); local67 != null; local67 = (Class2_Sub6) local22.aClass238_59.method5838()) {
			local45 = Static570.aClass267_2.method6597(local67.anInt842);
			@Pc(80) int local80 = local45.anInt7481;
			if (local45.anInt7464 == 1) {
				local80 *= local67.anInt841 + 1;
			}
			if (local48 > local80) {
				Static146.method2811(arg2, local67);
				return;
			}
		}
		local22.aClass238_59.method5837(arg2);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method8529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg3 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(28) int local28 = (Static324.aShort85 - Static384.aShort100) * local7 / 100 + Static384.aShort100;
		@Pc(34) int local34 = arg6 * local28 >> 8;
		Static388.anInt6979 = local28 * Static388.anInt6989 >> 8;
		@Pc(47) int local47 = 16384 - arg0 & 0x3FFF;
		@Pc(54) int local54 = 16384 - arg2 & 0x3FFF;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = local34;
		if (local47 != 0) {
			local58 = Class353.anIntArray681[local47] * -local34 >> 14;
			local60 = Class353.anIntArray682[local47] * local34 >> 14;
		}
		if (local54 != 0) {
			local56 = Class353.anIntArray681[local54] * local60 >> 14;
			local60 = local60 * Class353.anIntArray682[local54] >> 14;
		}
		Static105.anInt2114 = arg2;
		Static395.anInt3530 = arg4 - local60;
		Static512.anInt8589 = arg0;
		Static64.anInt1371 = arg5 - local58;
		Static53.anInt1153 = arg1 - local56;
		Static103.anInt2093 = 0;
	}
}
