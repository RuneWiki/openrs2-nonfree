import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!tg", name = "M", descriptor = "F")
	public static float aFloat198;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "Lclient!qha;")
	public static final Class3_Sub48 aClass3_Sub48_2 = new Class3_Sub48(0, -1);

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(III)Z")
	public static boolean method8103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static437.method6235(arg0, arg1) & Static89.method1669(arg1, arg0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/lang/String;Lclient!aj;IZ)Lclient!hca;")
	public static Class130 method8104(@OriginalArg(0) String arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg1.method514(arg0);
		if (local10 == -1) {
			return new Class130(0);
		}
		@Pc(24) int[] local24 = arg1.method530(local10);
		@Pc(30) Class130 local30 = new Class130(local24.length);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		while (true) {
			while (local32 < local30.anInt4121) {
				@Pc(55) Class3_Sub25 local55 = new Class3_Sub25(arg1.method517(local24[local34++], local10));
				@Pc(59) int local59 = local55.method8618();
				@Pc(63) int local63 = local55.method8593();
				@Pc(67) int local67 = local55.method8632();
				if (!arg2 && local67 == 1) {
					local30.anInt4121--;
				} else {
					local30.anIntArray363[local32] = local59;
					local30.anIntArray364[local32] = local63;
					local32++;
				}
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!oba;B)I")
	public static int method8106(@OriginalArg(0) Class3_Sub11_Sub14 arg0) {
		@Pc(7) String local7 = Static532.method7683(arg0);
		@Pc(14) int[] local14 = null;
		if (Static14.method197(arg0.anInt6738)) {
			local14 = Static170.aClass370_1.method8900((int) arg0.aLong211).anIntArray908;
		} else if (arg0.anInt6740 != -1) {
			local14 = Static170.aClass370_1.method8900(arg0.anInt6740).anIntArray908;
		} else if (Static494.method7103(arg0.anInt6738)) {
			@Pc(90) Class3_Sub3 local90 = (Class3_Sub3) Static522.aClass83_34.method2368((long) (int) arg0.aLong211);
			if (local90 != null) {
				@Pc(95) Class28_Sub1_Sub1_Sub1_Sub2 local95 = local90.aClass28_Sub1_Sub1_Sub1_Sub2_1;
				@Pc(98) Class300 local98 = local95.aClass300_1;
				if (local98.anIntArray696 != null) {
					local98 = local98.method7258(Static131.aClass66_1);
				}
				if (local98 != null) {
					local14 = local98.anIntArray693;
				}
			}
		} else if (Static364.method5315(arg0.anInt6738)) {
			@Pc(59) Class277 local59;
			if (arg0.anInt6738 == 1008) {
				local59 = Static652.aClass267_4.method6682((int) arg0.aLong211);
			} else {
				local59 = Static652.aClass267_4.method6682((int) (arg0.aLong211 >>> 32 & 0x7FFFFFFFL));
			}
			if (local59.anIntArray660 != null) {
				local59 = local59.method6815(Static131.aClass66_1);
			}
			if (local59 != null) {
				local14 = local59.anIntArray658;
			}
		}
		if (local14 != null) {
			local7 = local7 + Static583.method8202(local14);
		}
		@Pc(139) int local139 = Static59.aClass88_1.method2508(Static561.aClass33Array25, local7);
		if (arg0.aBoolean477) {
			local139 += Static627.aClass33_33.method7659() + 4;
		}
		return local139;
	}
}
