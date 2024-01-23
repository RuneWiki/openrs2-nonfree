import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)V")
	public static void method1522() {
		Static264.aClass79_39.method2479(5);
		Static257.aClass79_38.method2479(5);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)V")
	public static void method1523() {
		Static144.aClass79_19.method2479(5);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLclient!hc;)V")
	public static void method1524(@OriginalArg(1) Class51 arg0) {
		Static233.aClass51_78 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(BI)Lclient!qb;")
	public static Class1_Sub2_Sub13 method1525(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub2_Sub13 local16 = (Class1_Sub2_Sub13) Static25.aClass58_6.method2093((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(29) byte[] local29;
		if (arg0 < 32768) {
			local29 = Static155.aClass51_53.method1874(0, arg0);
		} else {
			local29 = Static75.aClass51_24.method1874(0, arg0 & 0x7FFF);
		}
		local16 = new Class1_Sub2_Sub13();
		if (local29 != null) {
			local16.method3178(new Class1_Sub13(local29));
		}
		if (arg0 >= 32768) {
			local16.method3173();
		}
		Static25.aClass58_6.method2089((long) arg0, local16);
		return local16;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1526(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = Static55.method1068(arg0);
		if (local7 != -1) {
			@Pc(43) int[] local43 = Static122.aClass1_Sub2_Sub11_2.method2860(Static254.aClass151_2.anIntArray470[local7] >> 28 & 0x3, Static254.aClass151_2.anIntArray470[local7] & 0x3FFF, Static254.aClass151_2.anIntArray470[local7] >> 14 & 0x3FFF);
			Static155.method2758(local43[1], local43[2]);
		}
	}
}
