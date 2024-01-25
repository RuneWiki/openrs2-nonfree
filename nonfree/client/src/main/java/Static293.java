import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!ok", name = "x", descriptor = "Lclient!sn;")
	public static Class226 aClass226_1;

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "Lclient!mn;")
	public static final Class167 aClass167_21 = new Class167(64);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIIIZ)I")
	public static int method4111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class10_Sub44 local10 = Static40.method555(arg0, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray704.length; local18++) {
			if (local10.anIntArray704[local18] >= 0 && local10.anIntArray704[local18] < Static313.aClass272_2.anInt7599) {
				@Pc(47) Class60 local47 = Static313.aClass272_2.method6068(local10.anIntArray704[local18]);
				@Pc(57) int local57 = local47.method1538(Static376.aClass204_1.method4526(arg1).anInt4302, arg1);
				if (arg2) {
					local16 += local57 * local10.anIntArray703[local18];
				} else {
					local16 += local57;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method4113(@OriginalArg(1) Class10_Sub8_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static106.anInt2139; local7++) {
			@Pc(19) int local19 = Static284.anIntArray491[local7];
			@Pc(23) Class24_Sub3_Sub2_Sub2 local23 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local19];
			@Pc(27) int local27 = arg0.method2502();
			if ((local27 & 0x1) != 0) {
				local27 += arg0.method2502() << 8;
			}
			if ((local27 & 0x400) != 0) {
				local27 += arg0.method2502() << 16;
			}
			Static28.method366(local19, local23, local27, arg0);
		}
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
	public static void method4114() {
		for (@Pc(16) Class10_Sub1_Sub6 local16 = (Class10_Sub1_Sub6) Static91.aClass163_16.method3620(); local16 != null; local16 = (Class10_Sub1_Sub6) Static91.aClass163_16.method3621()) {
			@Pc(21) Class24_Sub3_Sub1 local21 = local16.aClass24_Sub3_Sub1_1;
			if (local21.aBoolean223) {
				local16.method6033();
				local21.method2766();
			} else if (Static400.anInt6752 >= local21.anInt3287) {
				local21.method2769(Static68.anInt1469);
				if (local21.aBoolean223) {
					local16.method6033();
				} else {
					Static10.method119(local21, true);
				}
			}
		}
	}
}
