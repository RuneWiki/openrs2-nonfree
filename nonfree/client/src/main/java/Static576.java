import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!tia", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray67;

	@OriginalMember(owner = "client!tia", name = "i", descriptor = "Lclient!fe;")
	public static Class103 aClass103_11;

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "Lclient!in;")
	public static final Class169 aClass169_242 = new Class169(34, -1);

	@OriginalMember(owner = "client!tia", name = "e", descriptor = "I")
	public static int anInt10034 = 0;

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lclient!ol;BLclient!ts;)Lclient!dt;")
	public static Class80 method8734(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(2) Class351 arg1) {
		@Pc(10) Class80 local10 = new Class80(arg1);
		@Pc(14) int local14 = arg0.method5203();
		@Pc(22) boolean local22 = (local14 & 0x1) != 0;
		@Pc(30) boolean local30 = (local14 & 0x2) != 0;
		@Pc(43) boolean local43 = (local14 & 0x4) != 0;
		if (local22) {
			local10.anIntArray117[0] = arg0.method5211();
			local10.anIntArray118[0] = arg0.method5211();
			if (arg1.anInt10212 != -1 || arg1.anInt10164 != -1) {
				local10.anIntArray117[1] = arg0.method5211();
				local10.anIntArray118[1] = arg0.method5211();
			}
			if (arg1.anInt10183 != -1 || arg1.anInt10167 != -1) {
				local10.anIntArray117[2] = arg0.method5211();
				local10.anIntArray118[2] = arg0.method5211();
			}
		}
		@Pc(113) boolean local113 = (local14 & 0x8) != 0;
		if (local30) {
			local10.anIntArray116[0] = arg0.method5211();
			local10.anIntArray114[0] = arg0.method5211();
			if (arg1.anInt10176 != -1 || arg1.anInt10181 != -1) {
				local10.anIntArray116[1] = arg0.method5211();
				local10.anIntArray114[1] = arg0.method5211();
			}
		}
		@Pc(158) int local158;
		@Pc(161) int[] local161;
		@Pc(193) int local193;
		if (local43) {
			local158 = arg0.method5211();
			local161 = new int[] { local158 & 0xF, local158 >> 4 & 0xF, local158 >> 8 & 0xF, (local158 & 0xF807) >> 12 };
			for (local193 = 0; local193 < 4; local193++) {
				if (local161[local193] != 15) {
					local10.aShortArray49[local161[local193]] = (short) arg0.method5211();
				}
			}
		}
		if (local113) {
			local158 = arg0.method5203();
			local161 = new int[] { local158 & 0xF, local158 >> 4 & 0xF };
			for (local193 = 0; local193 < 2; local193++) {
				if (local161[local193] != 15) {
					local10.aShortArray48[local161[local193]] = (short) arg0.method5211();
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Z)V")
	public static void method8735() {
		Static605.anInt10580 = 1;
		Static353.anInt6795 = -1;
		if (Static616.aString130 == null) {
			Static173.method3384(35);
		} else {
			@Pc(20) Class2_Sub8 local20 = new Class2_Sub8(Static205.method3905(Static565.method8571(Static616.aString130)));
			@Pc(24) long local24 = local20.method5213();
			Static613.aLong289 = local20.method5213();
			Static205.method3904(true, Static538.method8270(local24), "");
		}
	}
}
