import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_101 = new Class66(50);

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "Lclient!cs;")
	public static Class42 aClass42_53 = new Class42(8);

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V")
	public static void method5496() {
		Static205.anInt3959 = 0;
		Static47.anInt1211 = 0;
		Static191.method5163();
		Static114.method2254();
		Static328.method5521();
		Static282.method4773();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static205.anInt3959; local19++) {
			local25 = Static269.anIntArray394[local19];
			if (Static180.anInt3606 != Static312.aClass25_Sub1_Sub1_Sub1Array1[local25].anInt5320) {
				if (Static312.aClass25_Sub1_Sub1_Sub1Array1[local25].anInt4079 > 0) {
					Static296.method5015(Static312.aClass25_Sub1_Sub1_Sub1Array1[local25]);
				}
				Static312.aClass25_Sub1_Sub1_Sub1Array1[local25] = null;
			}
		}
		if (Static179.anInt3568 != Static6.aClass5_Sub1_Sub1_1.anInt2029) {
			throw new RuntimeException("gpp1 pos:" + Static6.aClass5_Sub1_Sub1_1.anInt2029 + " psize:" + Static179.anInt3568);
		}
		for (local25 = 0; local25 < Static161.anInt3258; local25++) {
			if (Static312.aClass25_Sub1_Sub1_Sub1Array1[Static220.anIntArray311[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static161.anInt3258);
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([III)V")
	public static void method5498(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 31; local3 > 0; local3--) {
			@Pc(9) int local9 = local3 * 36;
			for (@Pc(11) int local11 = 35; local11 > 0; local11--) {
				if (arg0[local9 + local11] == 0 && arg0[local11 + local9 - 37] != 0) {
					arg0[local11 + local9] = arg1;
				}
			}
		}
	}
}
