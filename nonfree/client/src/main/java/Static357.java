import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!pd;")
	public static final Class270 aClass270_5 = new Class270();

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!o;")
	public static final Class252 aClass252_2 = new Class252(64);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIII)V")
	public static void method5269(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(1) Class358[] local1 = Static217.aClass358Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(16) Class358 local16 = local1[local3];
			if (local16 != null && local16.anInt9736 == 2) {
				Static529.method7396(local16.anInt9741 * 2, local16.anInt9742, local16.anInt9737, arg3 >> 1, arg2 >> 1, local16.anInt9735);
				if (Static340.anIntArray352[0] > -1 && Static421.anInt7434 % 20 < 10) {
					@Pc(61) Class59 local61 = Static283.aClass59Array10[local16.anInt9738];
					@Pc(69) int local69 = Static340.anIntArray352[0] + arg1 - 12;
					@Pc(77) int local77 = Static340.anIntArray352[1] + arg0 - 28;
					local61.method8057(local69, local77);
					Static430.method7439(local77, local77 + local61.method8064(), local69, local69 + local61.method8053());
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)Z")
	public static boolean method5270(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)I")
	public static int method5272(@OriginalArg(1) int arg0) {
		@Pc(12) byte local12;
		if (arg0 > 12000) {
			Static544.method7520();
			local12 = 4;
		} else if (arg0 > 5000) {
			local12 = 3;
			Static325.method5073();
		} else if (arg0 > 2000) {
			local12 = 2;
			Static204.method2850();
		} else {
			local12 = 1;
			Static46.method621();
		}
		if (Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() != 2) {
			Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub23_2, 2);
			Static75.method1101(false, 2);
		}
		Static185.method2703();
		return local12;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Z")
	public static boolean method5273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class81 local8 = Static400.aClass140_4.method2839(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method1762(arg0);
	}
}
