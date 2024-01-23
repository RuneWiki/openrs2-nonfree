import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ij", name = "D", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ij", name = "L", descriptor = "Lclient!vn;")
	public static Class4_Sub3_Sub14_Sub1 aClass4_Sub3_Sub14_Sub1_3;

	@OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
	public static int anInt2394;

	@OriginalMember(owner = "client!ij", name = "M", descriptor = "[I")
	public static int[] anIntArray211 = new int[14];

	@OriginalMember(owner = "client!ij", name = "N", descriptor = "Lclient!ic;")
	public static Class85 aClass85_8 = new Class85(16);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!co;)V")
	public static void method1903(@OriginalArg(0) Class33 arg0) {
		for (@Pc(2) int local2 = arg0.anInt824; local2 <= arg0.anInt825; local2++) {
			for (@Pc(9) int local9 = arg0.anInt826; local9 <= arg0.anInt817; local9++) {
				@Pc(22) Class4_Sub19 local22 = Static6.aClass4_Sub19ArrayArrayArray1[arg0.anInt819][local2][local9];
				if (local22 != null) {
					@Pc(26) int local26;
					for (local26 = 0; local26 < local22.anInt3554; local26++) {
						if (local22.aClass33Array3[local26] == arg0) {
							local22.anInt3554--;
							for (@Pc(44) int local44 = local26; local44 < local22.anInt3554; local44++) {
								local22.aClass33Array3[local44] = local22.aClass33Array3[local44 + 1];
								local22.anIntArray390[local44] = local22.anIntArray390[local44 + 1];
							}
							local22.aClass33Array3[local22.anInt3554] = null;
							break;
						}
					}
					local22.anInt3551 = 0;
					for (local26 = 0; local26 < local22.anInt3554; local26++) {
						local22.anInt3551 |= local22.anIntArray390[local26];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IC)Z")
	public static boolean method1908(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
