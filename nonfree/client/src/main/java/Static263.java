import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
	public static int anInt5201;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
	public static int anInt5199 = 0;

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "[I")
	public static final int[] anIntArray410 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
	public static int anInt5202 = 0;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!fp;BLclient!ct;)V")
	public static void method4796(@OriginalArg(0) Class63 arg0, @OriginalArg(2) Class30 arg1) {
		@Pc(10) Class201[] local10 = Static382.method5434(arg1, Static102.anInt7003);
		Static235.aClass4Array14 = new Class4[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static235.aClass4Array14[local16] = arg0.method4589(local10[local16]);
		}
		local10 = Static382.method5434(arg1, Static294.anInt5667);
		Static365.aClass4Array21 = new Class4[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static365.aClass4Array21[local47] = arg0.method4589(local10[local47]);
		}
		local10 = Static382.method5434(arg1, Static37.anInt939);
		Static132.aClass4Array5 = new Class4[local10.length];
		for (@Pc(79) int local79 = 0; local79 < local10.length; local79++) {
			Static132.aClass4Array5[local79] = arg0.method4589(local10[local79]);
		}
		local10 = Static382.method5434(arg1, Static7.anInt217);
		Static320.aClass4Array12 = new Class4[local10.length];
		for (@Pc(110) int local110 = 0; local110 < local10.length; local110++) {
			Static320.aClass4Array12[local110] = arg0.method4589(local10[local110]);
		}
		local10 = Static382.method5434(arg1, Static282.anInt5488);
		Static208.aClass4Array10 = new Class4[local10.length];
		for (@Pc(137) int local137 = 0; local137 < local10.length; local137++) {
			Static208.aClass4Array10[local137] = arg0.method4589(local10[local137]);
		}
		local10 = Static382.method5434(arg1, Static186.anInt3747);
		Static225.aClass4Array13 = new Class4[local10.length];
		for (@Pc(164) int local164 = 0; local164 < local10.length; local164++) {
			Static225.aClass4Array13[local164] = arg0.method4589(local10[local164]);
		}
		local10 = Static382.method5434(arg1, Static254.anInt5165);
		Static72.aClass4Array3 = new Class4[local10.length];
		for (@Pc(195) int local195 = 0; local195 < local10.length; local195++) {
			Static72.aClass4Array3[local195] = arg0.method4589(local10[local195]);
		}
		local10 = Static382.method5434(arg1, Static184.anInt3734);
		Static150.aClass4Array19 = new Class4[local10.length];
		for (@Pc(226) int local226 = 0; local226 < local10.length; local226++) {
			Static150.aClass4Array19[local226] = arg0.method4589(local10[local226]);
		}
		local10 = Static382.method5434(arg1, Static164.anInt3439);
		Static91.aClass4Array23 = new Class4[local10.length];
		for (@Pc(253) int local253 = 0; local253 < local10.length; local253++) {
			Static91.aClass4Array23[local253] = arg0.method4589(local10[local253]);
		}
		local10 = Static382.method5434(arg1, Static345.anInt6528);
		Static333.aClass4Array20 = new Class4[local10.length];
		for (@Pc(284) int local284 = 0; local284 < local10.length; local284++) {
			Static333.aClass4Array20[local284] = arg0.method4589(local10[local284]);
		}
		local10 = Static382.method5434(arg1, Static157.anInt3251);
		Static239.aClass4Array15 = new Class4[local10.length];
		for (@Pc(311) int local311 = 0; local311 < local10.length; local311++) {
			Static239.aClass4Array15[local311] = arg0.method4589(local10[local311]);
		}
		local10 = Static382.method5434(arg1, Static201.anInt4057);
		Static240.aClass4Array16 = new Class4[local10.length];
		for (@Pc(342) int local342 = 0; local342 < local10.length; local342++) {
			Static240.aClass4Array16[local342] = arg0.method4589(local10[local342]);
		}
		Static66.aClass4_6 = arg0.method4589(Static382.method5432(arg1, Static233.anInt4717, 0));
		Static155.aClass4_9 = arg0.method4589(Static382.method5432(arg1, Static72.anInt1650, 0));
		local10 = Static382.method5434(arg1, Static229.anInt4641);
		Static107.aClass4Array4 = new Class4[local10.length];
		for (@Pc(389) int local389 = 0; local389 < local10.length; local389++) {
			Static107.aClass4Array4[local389] = arg0.method4589(local10[local389]);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
	public static void method4798(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static105.aClass155ArrayArrayArray3 = Static46.aClass155ArrayArrayArray1;
			Static258.aClass36Array2 = Static200.aClass36Array4;
		} else {
			Static105.aClass155ArrayArrayArray3 = Static103.aClass155ArrayArrayArray2;
			Static258.aClass36Array2 = Static50.aClass36Array3;
		}
		anInt5201 = Static105.aClass155ArrayArrayArray3.length;
	}
}
