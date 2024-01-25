import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "Lclient!vd;")
	public static Class345 aClass345_2;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!mga;")
	public static final Class223 aClass223_47 = new Class223(50);

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)[Lclient!nga;")
	public static Class242[] method5807() {
		if (Static235.aClass242Array1 == null) {
			@Pc(7) Class242[] local7 = Static352.method7379(Static147.aClass161_4);
			@Pc(11) Class242[] local11 = new Class242[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(18) int local18 = Static189.aClass4_Sub2_Sub1_1.method7657(Static403.anInt6994);
			@Pc(79) int local79;
			@Pc(85) Class242 local85;
			label70: for (@Pc(20) int local20 = 0; local20 < local7.length; local20++) {
				@Pc(26) Class242 local26 = local7[local20];
				if ((local26.anInt6161 <= 0 || local26.anInt6161 >= 24) && local26.anInt6163 >= 800 && local26.anInt6170 >= 600 && (local18 != 2 || local26.anInt6163 <= 800 && local26.anInt6170 <= 600) && (local18 != 1 || local26.anInt6163 <= 1024 && local26.anInt6170 <= 768)) {
					for (local79 = 0; local79 < local13; local79++) {
						local85 = local11[local79];
						if (local26.anInt6163 == local85.anInt6163 && local26.anInt6170 == local85.anInt6170) {
							if (local85.anInt6161 < local26.anInt6161) {
								local11[local79] = local26;
							}
							continue label70;
						}
					}
					local11[local13] = local26;
					local13++;
				}
			}
			Static235.aClass242Array1 = new Class242[local13];
			Static602.method1585(local11, 0, Static235.aClass242Array1, 0, local13);
			@Pc(141) int[] local141 = new int[Static235.aClass242Array1.length];
			for (local79 = 0; local79 < Static235.aClass242Array1.length; local79++) {
				local85 = Static235.aClass242Array1[local79];
				local141[local79] = local85.anInt6170 * local85.anInt6163;
			}
			Static549.method7595(local141, Static235.aClass242Array1);
		}
		return Static235.aClass242Array1;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Z")
	public static boolean method5808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static95.method7582(arg0, arg1) || Static140.method2842(arg0, arg1);
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)Z")
	public static boolean method5810(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
