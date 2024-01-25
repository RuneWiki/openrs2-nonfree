import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
	public static int anInt9145 = -1;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)[Lclient!nga;")
	public static Class249[] method7814() {
		if (Static566.aClass249Array1 == null) {
			@Pc(16) Class249[] local16 = Static560.method7429(Static239.aClass207_2);
			@Pc(20) Class249[] local20 = new Class249[local16.length];
			@Pc(22) int local22 = 0;
			@Pc(27) int local27 = Static124.aClass4_Sub20_4.aClass8_Sub18_1.method6657();
			@Pc(95) int local95;
			@Pc(101) Class249 local101;
			label70: for (@Pc(29) int local29 = 0; local29 < local16.length; local29++) {
				@Pc(35) Class249 local35 = local16[local29];
				if ((local35.anInt5847 <= 0 || local35.anInt5847 >= 24) && local35.anInt5845 >= 800 && local35.anInt5848 >= 600 && (local27 != 2 || local35.anInt5845 <= 800 && local35.anInt5848 <= 600) && (local27 != 1 || local35.anInt5845 <= 1024 && local35.anInt5848 <= 768)) {
					for (local95 = 0; local95 < local22; local95++) {
						local101 = local20[local95];
						if (local101.anInt5845 == local35.anInt5845 && local35.anInt5848 == local101.anInt5848) {
							if (local101.anInt5847 < local35.anInt5847) {
								local20[local95] = local35;
							}
							continue label70;
						}
					}
					local20[local22] = local35;
					local22++;
				}
			}
			Static566.aClass249Array1 = new Class249[local22];
			Static685.method6469(local20, 0, Static566.aClass249Array1, 0, local22);
			@Pc(157) int[] local157 = new int[Static566.aClass249Array1.length];
			for (local95 = 0; local95 < Static566.aClass249Array1.length; local95++) {
				local101 = Static566.aClass249Array1[local95];
				local157[local95] = local101.anInt5848 * local101.anInt5845;
			}
			Static362.method4813(local157, Static566.aClass249Array1);
		}
		return Static566.aClass249Array1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II[F)[F")
	public static float[] method7815(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static685.method6463(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
