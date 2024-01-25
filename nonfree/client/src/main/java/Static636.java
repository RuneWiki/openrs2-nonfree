import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "J")
	public static long aLong294 = 0L;

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "[I")
	public static final int[] anIntArray589 = new int[8];

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZBLclient!ha;Lclient!kaa;Ljava/lang/String;Lclient!da;)V")
	public static void method8809(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) Class196 arg2, @OriginalArg(4) String arg3, @OriginalArg(5) Class70 arg4) {
		@Pc(22) boolean local22 = !Static381.aBoolean424 || Static108.method1616();
		if (!local22) {
			return;
		}
		@Pc(39) int local39;
		@Pc(48) int local48;
		if (Static381.aBoolean424 && local22) {
			@Pc(149) Class196 local149 = Static653.aClass196_39;
			@Pc(155) Class70 local155 = arg1.method8612(local149, Static315.aClass362Array1);
			local39 = local149.method4562(arg3, 250, (Class155[]) null);
			local48 = local149.method4563(arg3, (Class155[]) null, 250, local149.anInt5057);
			@Pc(174) int local174 = Static420.aClass362_3.anInt9727;
			@Pc(178) int local178 = local174 + 4;
			local39 += local178 * 2;
			local48 += local178 * 2;
			if (local48 < Static494.anInt7988) {
				local48 = Static494.anInt7988;
			}
			if (Static531.anInt8698 > local39) {
				local39 = Static531.anInt8698;
			}
			@Pc(209) int local209 = Static237.aClass189_7.method4461(Static592.anInt9548, local39) + Static19.anInt245;
			@Pc(217) int local217 = Static375.aClass346_11.method7688(local48, Static401.anInt6745) + Static194.anInt10628;
			if (Static377.aBoolean419) {
				local209 += Static194.method8971();
				local217 += Static5.method9220();
			}
			arg1.method8640(Static69.aClass362_1, false).method7199(local209 + Static288.aClass362_2.anInt9727, local217 + Static288.aClass362_2.anInt9728, local39 - Static288.aClass362_2.anInt9727 * 2, local48 - Static288.aClass362_2.anInt9728 * 2, 1, 0, 0);
			arg1.method8640(Static288.aClass362_2, true).method7202(local209, local217);
			Static288.aClass362_2.method8273();
			arg1.method8640(Static288.aClass362_2, true).method7202(local209 + local39 - local174, local217);
			Static288.aClass362_2.method8281();
			arg1.method8640(Static288.aClass362_2, true).method7202(local39 + local209 - local174, local217 - -local48 + -local174);
			Static288.aClass362_2.method8273();
			arg1.method8640(Static288.aClass362_2, true).method7202(local209, local217 + local48 - local174);
			Static288.aClass362_2.method8281();
			arg1.method8640(Static420.aClass362_3, true).method7204(local209, Static288.aClass362_2.anInt9728 + local217, local174, local48 - Static288.aClass362_2.anInt9728 * 2);
			Static420.aClass362_3.method8283();
			arg1.method8640(Static420.aClass362_3, true).method7204(Static288.aClass362_2.anInt9727 + local209, local217, local39 - Static288.aClass362_2.anInt9727 * 2, local174);
			Static420.aClass362_3.method8283();
			arg1.method8640(Static420.aClass362_3, true).method7204(local209 + local39 - local174, Static288.aClass362_2.anInt9728 + local217, local174, local48 - Static288.aClass362_2.anInt9728 * 2);
			Static420.aClass362_3.method8283();
			arg1.method8640(Static420.aClass362_3, true).method7204(Static288.aClass362_2.anInt9727 + local209, -local174 + local48 + local217, local39 - Static288.aClass362_2.anInt9727 * 2, local174);
			Static420.aClass362_3.method8283();
			local155.method8435((Class1) null, 1, 0, arg3, local48 - local178 * 2, -(local178 * 2) + local39, Static341.anInt5702 | 0xFF000000, local178 + local209, (Class155[]) null, 0, -1, 0, (int[]) null, 1, local217 + local178);
			Static509.method7017(local217, local48, local209, local39);
		} else {
			local39 = arg2.method4562(arg3, 250, (Class155[]) null);
			local48 = arg2.method4566(250, (Class155[]) null, arg3) * 13;
			arg1.aa(6, 6, local39 + 4 + 4, local48 + 4 + 4, -16777216, 0);
			arg1.method8607(6, 6, local39 + 8, local48 + 4 + 4, -1, 0);
			arg4.method8435((Class1) null, 1, 0, arg3, local48, local39, -1, 10, (Class155[]) null, 0, -1, 0, (int[]) null, 1, 10);
			Static509.method7017(6, local48 + 4 + 4, 6, local39 + 4 + 4);
		}
		if (!arg0) {
			return;
		}
		try {
			if (Static377.aBoolean419) {
				Static614.method8444();
			} else {
				arg1.method8619();
			}
		} catch (@Pc(459) Exception_Sub1 local459) {
		}
	}
}
