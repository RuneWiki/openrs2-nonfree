import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "[I")
	public static int[] anIntArray607 = new int[14];

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "Z")
	public static boolean aBoolean525 = false;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	public static void method4595() {
		Static128.aClass1_Sub5_Sub6Array3 = null;
		Static273.aClass1_Sub5_Sub6Array13 = null;
		Static302.aClass1_Sub5_Sub6_11 = null;
		Static189.aClass1_Sub5_Sub6Array11 = null;
		Static286.aClass1_Sub5_Sub9_Sub2_2 = null;
		Static170.aClass1_Sub5_Sub9_4 = null;
		Static116.aClass1_Sub5_Sub6Array2 = null;
		Static153.aClass1_Sub5_Sub6_3 = null;
		Static154.aClass1_Sub5_Sub6Array7 = null;
		Static288.aClass1_Sub5_Sub6Array14 = null;
		Static238.aClass1_Sub5_Sub9_5 = null;
		Static304.aClass1_Sub5_Sub6Array15 = null;
		Static252.aClass57Array4 = null;
		Static277.aClass57Array5 = null;
		Static25.aClass1_Sub5_Sub6Array12 = null;
		Static203.aClass1_Sub5_Sub6Array9 = null;
		Static19.aClass1_Sub5_Sub9_1 = null;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[Lclient!si;I)V")
	public static void method4596(@OriginalArg(0) int arg0, @OriginalArg(1) Class157[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(15) Class157 local15 = arg1[local3];
			if (local15 != null && local15.anInt4671 == arg0 && (!local15.aBoolean445 || !Static42.method770(local15))) {
				if (local15.anInt4748 == 0) {
					if (!local15.aBoolean445 && Static42.method770(local15) && local15 != Static271.aClass157_17) {
						continue;
					}
					method4596(local15.anInt4672, arg1);
					if (local15.aClass157Array2 != null) {
						method4596(local15.anInt4672, local15.aClass157Array2);
					}
					@Pc(67) Class1_Sub20 local67 = (Class1_Sub20) Static224.aClass86_27.method2136((long) local15.anInt4672);
					if (local67 != null) {
						Static203.method2971(local67.anInt3422);
					}
				}
				if (local15.anInt4748 == 6) {
					@Pc(100) int local100;
					if (local15.anInt4721 != -1 || local15.anInt4709 != -1) {
						@Pc(95) boolean local95 = Static207.method4491(local15);
						if (local95) {
							local100 = local15.anInt4709;
						} else {
							local100 = local15.anInt4721;
						}
						if (local100 != -1) {
							@Pc(114) Class152 local114 = Static107.method2016(local100);
							if (local114 != null) {
								local15.anInt4732 += Static38.anInt722;
								while (local15.anInt4732 > local114.anIntArray512[local15.anInt4714]) {
									local15.anInt4732 -= local114.anIntArray512[local15.anInt4714];
									local15.anInt4714++;
									if (local15.anInt4714 >= local114.anIntArray509.length) {
										local15.anInt4714 -= local114.anInt4594;
										if (local15.anInt4714 < 0 || local114.anIntArray509.length <= local15.anInt4714) {
											local15.anInt4714 = 0;
										}
									}
									local15.anInt4724 = local15.anInt4714 + 1;
									if (local114.anIntArray509.length <= local15.anInt4724) {
										local15.anInt4724 -= local114.anInt4594;
										if (local15.anInt4724 < 0 || local15.anInt4724 >= local114.anIntArray509.length) {
											local15.anInt4724 = -1;
										}
									}
									Static224.method3621(local15);
								}
							}
						}
					}
					if (local15.anInt4753 != 0 && !local15.aBoolean445) {
						@Pc(237) int local237 = local15.anInt4753 >> 16;
						@Pc(241) int local241 = local237 * Static38.anInt722;
						local100 = local15.anInt4753 << 16 >> 16;
						local15.anInt4666 = local15.anInt4666 + local241 & 0x7FF;
						local100 *= Static38.anInt722;
						local15.anInt4745 = local100 + local15.anInt4745 & 0x7FF;
						Static224.method3621(local15);
					}
				}
			}
		}
	}
}
