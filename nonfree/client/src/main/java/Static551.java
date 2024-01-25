import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!vca", name = "h", descriptor = "Lclient!ga;")
	public static Class111 aClass111_119;

	@OriginalMember(owner = "client!vca", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[100];

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)[Lclient!wn;")
	public static Class360[] method7498() {
		if (Static243.aClass360Array1 == null) {
			@Pc(7) Class360[] local7 = Static276.method4279(Static246.aClass114_10);
			@Pc(11) Class360[] local11 = new Class360[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(18) int local18 = Static479.aClass1_Sub7_Sub1_1.method2632(Static375.anInt6609);
			@Pc(82) int local82;
			@Pc(88) Class360 local88;
			label69: for (@Pc(20) int local20 = 0; local20 < local7.length; local20++) {
				@Pc(26) Class360 local26 = local7[local20];
				if ((local26.anInt9499 <= 0 || local26.anInt9499 >= 24) && local26.anInt9503 >= 800 && local26.anInt9501 >= 600 && (local18 != 2 || local26.anInt9503 <= 800 && local26.anInt9501 <= 600) && (local18 != 1 || local26.anInt9503 <= 1024 && local26.anInt9501 <= 768)) {
					for (local82 = 0; local82 < local13; local82++) {
						local88 = local11[local82];
						if (local88.anInt9503 == local26.anInt9503 && local26.anInt9501 == local88.anInt9501) {
							if (local88.anInt9499 < local26.anInt9499) {
								local11[local82] = local26;
							}
							continue label69;
						}
					}
					local11[local13] = local26;
					local13++;
				}
			}
			Static243.aClass360Array1 = new Class360[local13];
			Static600.method3766(local11, 0, Static243.aClass360Array1, 0, local13);
			@Pc(144) int[] local144 = new int[Static243.aClass360Array1.length];
			for (local82 = 0; local82 < Static243.aClass360Array1.length; local82++) {
				local88 = Static243.aClass360Array1[local82];
				local144[local82] = local88.anInt9503 * local88.anInt9501;
			}
			Static238.method7876(Static243.aClass360Array1, local144);
		}
		return Static243.aClass360Array1;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)V")
	public static void method7499(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub3_Sub1 local14 = Static374.method5445(14, arg0);
		local14.method488();
	}
}
