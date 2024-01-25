import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
	public static int anInt5191;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
	public static int anInt5195;

	@OriginalMember(owner = "client!kp", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString39;

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
	public static int anInt5196;

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "Lclient!hb;")
	public static final Class117 aClass117_16 = new Class117(8, 17);

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "Z")
	public static boolean aBoolean354 = true;

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_67 = new Class158(79, 4);

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "Lclient!db;")
	public static final Class57 aClass57_8 = new Class57(12, 0, 1, 0);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method4357(@OriginalArg(1) Class5 arg0) {
		@Pc(7) int local7 = Static87.anInt1887;
		@Pc(9) int local9 = Static386.anInt7125;
		@Pc(11) int local11 = anInt5196;
		@Pc(15) int local15 = Static199.anInt4475 - 3;
		if (Static358.aClass119_20 == null || Static129.aClass119_11 == null) {
			if (Static19.aClass161_7.method4268(Static104.anInt2327) && Static19.aClass161_7.method4268(Static144.anInt2920)) {
				Static358.aClass119_20 = arg0.method7425(Static551.method531(Static19.aClass161_7, Static104.anInt2327, 0));
				@Pc(44) Class9 local44 = Static551.method531(Static19.aClass161_7, Static144.anInt2920, 0);
				Static129.aClass119_11 = arg0.method7425(local44);
				local44.method529();
				Static101.aClass119_8 = arg0.method7425(local44);
			} else {
				arg0.C(local7, local9, local11, 20, 255 - Static517.anInt8991 << 24 | Static35.anInt912, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static358.aClass119_20 != null && Static129.aClass119_11 != null) {
			local87 = (local11 - Static129.aClass119_11.QA() * 2) / Static358.aClass119_20.QA();
			for (local89 = 0; local89 < local87; local89++) {
				Static358.aClass119_20.method6678(local7 + Static129.aClass119_11.QA() + Static358.aClass119_20.QA() * local89, local9);
			}
			Static129.aClass119_11.method6678(local7, local9);
			Static101.aClass119_8.method6678(local7 + local11 - Static101.aClass119_8.QA(), local9);
		}
		Static294.aClass59_2.method7281(local9 + 14, Static490.aClass67_143.method1934(Static193.anInt7803), Static219.anInt4768 | 0xFF000000, -1, local7 + 3);
		arg0.C(local7, local9 + 20, local11, local15 - 20, Static35.anInt912 | 255 - Static517.anInt8991 << 24, 1);
		local87 = Static35.aClass54_1.method4074();
		local89 = Static35.aClass54_1.method4071();
		@Pc(172) int local172 = 0;
		@Pc(195) int local195;
		for (@Pc(177) Class3_Sub11 local177 = (Class3_Sub11) Static255.aClass71_43.method2089(); local177 != null; local177 = (Class3_Sub11) Static255.aClass71_43.method2086()) {
			local195 = local9 + (-local172 + Static179.anInt4933 - 1) * 16 + 20 + 13;
			local172++;
			if (local87 > local7 && local7 + local11 > local87 && local195 - 13 < local89 && local195 + 4 > local89 && local177.aBoolean117) {
				arg0.C(local7, local195 - 12, local11, 16, 255 - Static471.anInt8504 << 24 | Static299.anInt5954, 1);
			}
		}
		if ((Static494.aClass119_30 == null || Static442.aClass119_26 == null || Static223.aClass119_17 == null) && Static19.aClass161_7.method4268(Static223.anInt4823) && Static19.aClass161_7.method4268(Static522.anInt9089) && Static19.aClass161_7.method4268(Static28.anInt780)) {
			@Pc(280) Class9 local280 = Static551.method531(Static19.aClass161_7, Static522.anInt9089, 0);
			Static442.aClass119_26 = arg0.method7425(local280);
			local280.method529();
			Static48.aClass119_5 = arg0.method7425(local280);
			Static494.aClass119_30 = arg0.method7425(Static551.method531(Static19.aClass161_7, Static223.anInt4823, 0));
			@Pc(305) Class9 local305 = Static551.method531(Static19.aClass161_7, Static28.anInt780, 0);
			Static223.aClass119_17 = arg0.method7425(local305);
			local305.method529();
			Static46.aClass119_4 = arg0.method7425(local305);
		}
		@Pc(373) int local373;
		@Pc(336) int local336;
		if (Static494.aClass119_30 != null && Static442.aClass119_26 != null && Static223.aClass119_17 != null) {
			local195 = (local11 - Static223.aClass119_17.QA() * 2) / Static494.aClass119_30.QA();
			for (local336 = 0; local336 < local195; local336++) {
				Static494.aClass119_30.method6678(local7 + Static223.aClass119_17.QA() + local336 * Static494.aClass119_30.QA(), -Static494.aClass119_30.b() + local9 + local15);
			}
			local373 = (local15 - Static223.aClass119_17.b() - 20) / Static442.aClass119_26.b();
			for (@Pc(375) int local375 = 0; local375 < local373; local375++) {
				Static442.aClass119_26.method6678(local7, local9 + local375 * Static442.aClass119_26.b() + 20);
				Static48.aClass119_5.method6678(local11 + local7 - Static48.aClass119_5.QA(), Static442.aClass119_26.b() * local375 + 20 + local9);
			}
			Static223.aClass119_17.method6678(local7, local15 + local9 - Static223.aClass119_17.b());
			Static46.aClass119_4.method6678(local7 + local11 - Static223.aClass119_17.QA(), local9 - (-local15 + Static223.aClass119_17.b()));
		}
		local172 = 0;
		for (@Pc(452) Class3_Sub11 local452 = (Class3_Sub11) Static255.aClass71_43.method2089(); local452 != null; local452 = (Class3_Sub11) Static255.aClass71_43.method2086()) {
			local336 = (Static179.anInt4933 - local172 - 1) * 16 + local9 + 13 + 20;
			local373 = Static219.anInt4768 | 0xFF000000;
			if (local87 > local7 && local7 + local11 > local87 && local336 - 13 < local89 && local336 + 4 > local89 && local452.aBoolean117) {
				local373 = Static481.anInt8656 | 0xFF000000;
			}
			@Pc(505) int[] local505 = null;
			if (Static95.method1856(local452.anInt1419)) {
				local505 = Static99.aClass96_7.method2508((int) local452.aLong48).anIntArray132;
			} else if (local452.anInt1422 != -1) {
				local505 = Static99.aClass96_7.method2508(local452.anInt1422).anIntArray132;
			} else if (Static153.method2639(local452.anInt1419)) {
				@Pc(537) Class3_Sub3 local537 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local452.aLong48);
				if (local537 != null) {
					@Pc(542) Class6_Sub1_Sub2_Sub2 local542 = local537.aClass6_Sub1_Sub2_Sub2_1;
					@Pc(545) Class230 local545 = local542.aClass230_1;
					if (local545.anIntArray627 != null) {
						local545 = local545.method5898(Static127.aClass215_1);
					}
					if (local545 != null) {
						local505 = local545.anIntArray629;
					}
				}
			} else if (Static359.method5619(local452.anInt1419)) {
				@Pc(577) Class242 local577;
				if (local452.anInt1419 == 1008) {
					local577 = Static454.aClass298_3.method7185((int) local452.aLong48);
				} else {
					local577 = Static454.aClass298_3.method7185((int) (local452.aLong48 >>> 32 & 0x7FFFFFFFL));
				}
				if (local577.anIntArray632 != null) {
					local577 = local577.method5975(Static127.aClass215_1);
				}
				if (local577 != null) {
					local505 = local577.anIntArray636;
				}
			}
			@Pc(615) String local615 = Static409.method6186(local452);
			if (local505 != null) {
				local615 = local615 + Static180.method3434(local505);
			}
			Static294.aClass59_2.method7269(Static525.aClass119Array16, local615, Static260.anIntArray466, local336, local373, local7 + 3);
			if (local452.aBoolean116) {
				Static35.aClass119_3.method6678(Static25.aClass53_6.method1378(local615) + local7 + 5, local336 + -12);
			}
			local172++;
		}
		Static281.method4818(Static386.anInt7125, anInt5196, Static87.anInt1887, Static199.anInt4475);
	}
}
