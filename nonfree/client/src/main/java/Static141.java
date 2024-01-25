import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!ir", name = "Z", descriptor = "Lclient!ns;")
	public static Class147 aClass147_1;

	@OriginalMember(owner = "client!ir", name = "ab", descriptor = "Lclient!rk;")
	public static Class180 aClass180_37;

	@OriginalMember(owner = "client!ir", name = "L", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_24 = new Class10(16);

	@OriginalMember(owner = "client!ir", name = "Y", descriptor = "Lclient!ls;")
	public static final Class66 aClass66_1 = Static296.method5033();

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "(I)V")
	public static void method2848() {
		@Pc(5) Class103 local5 = Static269.aClass103_56;
		synchronized (Static269.aClass103_56) {
			Static269.aClass103_56.method2678();
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)I")
	public static int method2849(@OriginalArg(0) int arg0) {
		@Pc(9) Class126 local9 = Static111.method2159(arg0);
		@Pc(12) int local12 = local9.anInt3655;
		@Pc(15) int local15 = local9.anInt3656;
		@Pc(18) int local18 = local9.anInt3652;
		@Pc(24) int local24 = Class11.anIntArray418[local18 - local15];
		return Static212.anIntArray579[local12] >> local15 & local24;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(Z)V")
	public static void method2850() {
		if (Static108.anInt1315 > 0) {
			Static258.method4344();
		} else {
			Static229.aClass61_2 = Static193.aClass61_1;
			Static193.aClass61_1 = null;
			Static82.method1759(40);
		}
	}

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "(B)[Lclient!uo;")
	public static Class201[] method2851() {
		if (Static275.aClass201Array1 == null) {
			@Pc(5) Class201[] local5 = Static237.method4091(Static116.aClass21_4);
			@Pc(9) Class201[] local9 = new Class201[local5.length];
			@Pc(11) int local11 = 0;
			@Pc(60) int local60;
			@Pc(65) Class201 local65;
			label63: for (@Pc(13) int local13 = 0; local13 < local5.length; local13++) {
				@Pc(18) Class201 local18 = local5[local13];
				if ((local18.anInt6176 <= 0 || local18.anInt6176 >= 24) && local18.anInt6172 >= 800 && local18.anInt6174 >= 600 && (Static194.anInt1874 >= 96 || Static329.anInt6220 != 0 || local18.anInt6172 <= 1024 && local18.anInt6174 <= 768)) {
					for (local60 = 0; local60 < local11; local60++) {
						local65 = local9[local60];
						if (local18.anInt6172 == local65.anInt6172 && local18.anInt6174 == local65.anInt6174) {
							if (local65.anInt6176 < local18.anInt6176) {
								local9[local60] = local18;
							}
							continue label63;
						}
					}
					local9[local11] = local18;
					local11++;
				}
			}
			Static275.aClass201Array1 = new Class201[local11];
			Static366.method4201(local9, 0, Static275.aClass201Array1, 0, local11);
			@Pc(124) int[] local124 = new int[Static275.aClass201Array1.length];
			for (local60 = 0; local60 < Static275.aClass201Array1.length; local60++) {
				local65 = Static275.aClass201Array1[local60];
				local124[local60] = local65.anInt6174 * local65.anInt6172;
			}
			Static339.method5514(Static275.aClass201Array1, local124);
		}
		return Static275.aClass201Array1;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIILclient!f;Lclient!f;)V")
	public static void method2855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class22_Sub5 arg3, @OriginalArg(4) Class22_Sub5 arg4) {
		if (Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2] == null) {
			Static248.method4274(arg0, arg1, arg2);
		}
		Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2].aClass22_Sub5_2 = arg3;
		Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2].aClass22_Sub5_1 = arg4;
	}
}
