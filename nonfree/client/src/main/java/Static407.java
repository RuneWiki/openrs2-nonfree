import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
	public static int anInt7011 = 0;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(III)Z")
	public static boolean method5863(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!lb;IB)V")
	public static void method5864(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1) {
		if (Static5.anInt118 >= 50 || (arg0 == null || arg0.anIntArrayArray114 == null || arg1 >= arg0.anIntArrayArray114.length || arg0.anIntArrayArray114[arg1] == null)) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray114[arg1][0];
		@Pc(47) int local47 = local36 >> 8;
		@Pc(53) int local53 = local36 >> 5 & 0x7;
		if (arg0.anIntArrayArray114[arg1].length > 1) {
			@Pc(70) int local70 = (int) ((double) arg0.anIntArrayArray114[arg1].length * Math.random());
			if (local70 > 0) {
				local47 = arg0.anIntArrayArray114[arg1][local70];
			}
		}
		if (arg0.aBoolean360) {
			Static39.method648(255, 0, local47, local53, false);
		} else {
			Static32.method540(255, local47, 0, local53);
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)[Lclient!dba;")
	public static Class63[] method5865() {
		return new Class63[] { Static382.aClass63_18, Static184.aClass63_9, Static293.aClass63_14 };
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BI)V")
	public static void method5866(@OriginalArg(1) int arg0) {
		Static280.anIntArray259 = new int[arg0];
		Static160.anIntArray158 = new int[arg0];
		Static519.anIntArray540 = new int[arg0];
		Static5.anIntArray7 = new int[arg0];
		Static543.anIntArray570 = new int[arg0];
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(III)V")
	public static void method5867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static309.aClass299ArrayArrayArray3[0][arg1][arg2] != null && Static309.aClass299ArrayArrayArray3[0][arg1][arg2].aClass299_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static309.aClass299ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(44) Class299 local44 = Static309.aClass299ArrayArrayArray3[local22][arg1][arg2] = new Class299(local22);
				if (local20) {
					local44.aByte101++;
				}
			}
		}
	}
}
