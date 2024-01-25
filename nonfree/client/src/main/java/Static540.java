import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!tba", name = "m", descriptor = "Lclient!hu;")
	public static Class44 aClass44_30;

	@OriginalMember(owner = "client!tba", name = "p", descriptor = "Lclient!ha;")
	public static Class126 aClass126_21;

	@OriginalMember(owner = "client!tba", name = "i", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_172 = new Class136(103, 0);

	@OriginalMember(owner = "client!tba", name = "n", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_76 = new Class181(9, -1);

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIZI)V")
	public static void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(7) int local7 = arg1 << 3;
		Static371.aFloat65 = (float) local7;
		if (Static584.anInt9543 == 2) {
			Static21.anInt457 = 0;
			Static608.anInt9971 = local3;
			Static218.anInt3744 = local7;
		}
		Static112.aFloat22 = (float) local3;
		Static542.method7723();
		Static349.aBoolean501 = true;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!ee;I)V")
	public static void method7701(@OriginalArg(0) Class5_Sub12 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static76.anInt1279; local12++) {
			@Pc(18) int local18 = arg0.method8614();
			@Pc(22) int local22 = arg0.method8631();
			if (local22 == 65535) {
				local22 = -1;
			}
			if (Static197.aClass166_Sub1Array2[local18] != null) {
				Static197.aClass166_Sub1Array2[local18].anInt8516 = local22;
			}
		}
	}

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "(II)Lclient!on;")
	public static Class262 method7703(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static203.aFloat3 == 3.0D) {
				return Static245.aClass262_2;
			}
			if ((double) Static203.aFloat3 == 4.0D) {
				return Static334.aClass262_4;
			}
			if ((double) Static203.aFloat3 == 6.0D) {
				return Static639.aClass262_8;
			}
			if ((double) Static203.aFloat3 >= 8.0D) {
				return Static173.aClass262_1;
			}
		} else if (arg0 == 1) {
			if ((double) Static203.aFloat3 == 3.0D) {
				return Static639.aClass262_8;
			}
			if ((double) Static203.aFloat3 == 4.0D) {
				return Static173.aClass262_1;
			}
			if ((double) Static203.aFloat3 == 6.0D) {
				return Static453.aClass262_6;
			}
			if ((double) Static203.aFloat3 >= 8.0D) {
				return Static413.aClass262_5;
			}
		} else if (arg0 == 2) {
			if ((double) Static203.aFloat3 == 3.0D) {
				return Static453.aClass262_6;
			}
			if ((double) Static203.aFloat3 == 4.0D) {
				return Static413.aClass262_5;
			}
			if ((double) Static203.aFloat3 == 6.0D) {
				return Static493.aClass262_7;
			}
			if ((double) Static203.aFloat3 >= 8.0D) {
				return Static272.aClass262_3;
			}
		}
		return null;
	}
}
