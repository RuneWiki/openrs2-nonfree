import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!es", name = "f", descriptor = "Lclient!po;")
	public static Class281 aClass281_2;

	@OriginalMember(owner = "client!es", name = "g", descriptor = "F")
	public static float aFloat78;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!hp;III)V")
	public static void method2529(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub25 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) long local20 = (long) (arg0 | arg2 << 14 | arg3 << 28);
		@Pc(26) Class3_Sub24 local26 = (Class3_Sub24) Static421.aClass62_32.method1682(local20);
		if (local26 == null) {
			local26 = new Class3_Sub24();
			Static421.aClass62_32.method1686(local20, local26);
			local26.aClass193_26.method4462(arg1);
			return;
		}
		@Pc(49) Class146 local49 = Static237.aClass371_2.method8305(arg1.anInt4451);
		@Pc(52) int local52 = local49.anInt3684;
		if (local49.anInt3696 == 1) {
			local52 *= arg1.anInt4450 + 1;
		}
		for (@Pc(69) Class3_Sub25 local69 = (Class3_Sub25) local26.aClass193_26.method4457(); local69 != null; local69 = (Class3_Sub25) local26.aClass193_26.method4459()) {
			local49 = Static237.aClass371_2.method8305(local69.anInt4451);
			@Pc(80) int local80 = local49.anInt3684;
			if (local49.anInt3696 == 1) {
				local80 *= local69.anInt4450 + 1;
			}
			if (local52 > local80) {
				Static341.method5167(arg1, local69);
				return;
			}
		}
		local26.aClass193_26.method4462(arg1);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)[Lclient!eaa;")
	public static Class92[] method2531() {
		return new Class92[] { Static338.aClass92_9, Static120.aClass92_2, Static447.aClass92_12 };
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BCI)I")
	public static int method2532(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(21) char local21 = Character.toLowerCase(arg0);
			local12 = (local21 << 4) + 1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ZZLclient!wda;)V")
	public static void method2533(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class23_Sub2_Sub1_Sub2_Sub2 arg1) {
		if (Static37.anInt1104 >= 400) {
			return;
		}
		@Pc(14) Class5 local14 = arg1.aClass5_1;
		@Pc(17) String local17 = arg1.aString132;
		if (local14.anIntArray1 != null) {
			local14 = local14.method56(Static592.aClass47_2);
			if (local14 == null) {
				return;
			}
			local17 = local14.aString1;
		}
		if (!local14.aBoolean9) {
			return;
		}
		if (arg1.anInt10202 != 0) {
			@Pc(51) String local51 = Static14.aClass181_5 == Static102.aClass181_38 ? Static569.aClass335_31.method7694(Static319.anInt5939) : Static569.aClass335_29.method7694(Static319.anInt5939);
			local17 = local17 + Static676.method8726(arg1.anInt10202, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt3272) + " (" + local51 + arg1.anInt10202 + ")";
		}
		if (Static329.aBoolean166 && !arg0) {
			@Pc(89) Class328 local89 = Static104.anInt2203 == -1 ? null : Static145.aClass165_1.method3812(Static104.anInt2203);
			if ((Static7.anInt94 & 0x2) != 0 && (local89 == null || local14.method57(Static104.anInt2203, local89.anInt8911) != local89.anInt8911)) {
				Static225.method3514(true, false, -1, Static158.anInt2968, 0, (long) arg1.anInt10180, Static542.aString107 + " -> <col=ffff00>" + local17, 45, Static46.aString12, (long) arg1.anInt10180, false, 0);
			}
		}
		if (!arg0) {
			@Pc(140) String[] local140 = local14.aStringArray2;
			if (Static511.aBoolean756) {
				local140 = Static586.method7872(local140);
			}
			@Pc(150) int local150;
			if (local140 != null) {
				for (local150 = 4; local150 >= 0; local150--) {
					if (local140[local150] != null && (local14.aByte7 == 0 || !local140[local150].equalsIgnoreCase(Static569.aClass335_24.method7694(Static319.anInt5939)))) {
						@Pc(170) byte local170 = 0;
						if (local150 == 0) {
							local170 = 5;
						}
						@Pc(179) int local179 = Static581.anInt9234;
						if (local150 == 1) {
							local170 = 52;
						}
						if (local150 == 2) {
							local170 = 58;
						}
						if (local150 == 3) {
							local170 = 3;
						}
						if (local150 == 4) {
							local170 = 60;
						}
						if (local150 == local14.anInt64) {
							local179 = local14.anInt51;
						}
						if (local150 == local14.anInt53) {
							local179 = local14.anInt49;
						}
						Static225.method3514(true, false, -1, local140[local150].equalsIgnoreCase(Static569.aClass335_24.method7694(Static319.anInt5939)) ? local14.anInt54 : local179, 0, (long) arg1.anInt10180, "<col=ffff00>" + local17, local170, local140[local150], (long) arg1.anInt10180, false, 0);
					}
				}
			}
			if (local14.aByte7 == 1 && local140 != null) {
				for (local150 = 4; local150 >= 0; local150--) {
					if (local140[local150] != null && local140[local150].equalsIgnoreCase(Static569.aClass335_24.method7694(Static319.anInt5939))) {
						@Pc(289) short local289 = 0;
						if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt3272 < arg1.anInt10202) {
							local289 = 2000;
						}
						@Pc(302) short local302 = 0;
						if (local150 == 0) {
							local302 = 5;
						}
						if (local150 == 1) {
							local302 = 52;
						}
						if (local150 == 2) {
							local302 = 58;
						}
						if (local150 == 3) {
							local302 = 3;
						}
						if (local150 == 4) {
							local302 = 60;
						}
						if (local302 != 0) {
							local302 += local289;
						}
						Static225.method3514(true, false, -1, local14.anInt54, 0, (long) arg1.anInt10180, "<col=ffff00>" + local17, local302, local140[local150], (long) arg1.anInt10180, false, 0);
					}
				}
			}
		}
		Static225.method3514(true, false, -1, Static674.anInt10304, 0, (long) arg1.anInt10180, "<col=ffff00>" + local17, 1009, Static569.aClass335_23.method7694(Static319.anInt5939), (long) arg1.anInt10180, arg0, 0);
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(Z)V")
	public static void method2534() {
		for (@Pc(6) Class3_Sub6_Sub16 local6 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4457(); local6 != null; local6 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4459()) {
			if (Static679.method8753(local6.anInt7069)) {
				Static242.method3906(local6);
			}
		}
	}
}
