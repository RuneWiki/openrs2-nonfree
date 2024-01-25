import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Lclient!da;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	public static int anInt48 = -50;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Z")
	public static boolean method56() {
		return Static538.anInt8985 >= 1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public static void method57() {
		@Pc(5) Class143[] local5 = Class44.aClass143Array1;
		synchronized (Class44.aClass143Array1) {
			for (@Pc(9) int local9 = 0; local9 < Class44.aClass143Array1.length; local9++) {
				Class44.aClass143Array1[local9] = new Class143();
				Static308.anIntArray383[local9] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	public static void method58() {
		Static563.aClass2_Sub5_Sub20_22 = new Class2_Sub5_Sub20(Static628.aClass369_4.method8475(Static377.anInt6756), "", Static385.anInt6934, 1008, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
	public static void method59() {
		Static282.aClass117_4.method3039();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILclient!fd;Lclient!ha;Lclient!nd;)Z")
	public static boolean method60(@OriginalArg(3) Class105 arg0, @OriginalArg(4) Class87 arg1, @OriginalArg(5) Class2_Sub36 arg2) {
		@Pc(5) int local5 = Integer.MAX_VALUE;
		@Pc(7) int local7 = Integer.MIN_VALUE;
		@Pc(9) int local9 = Integer.MAX_VALUE;
		@Pc(11) int local11 = Integer.MIN_VALUE;
		if (arg0.anIntArray236 != null) {
			local11 = Static292.anInt8379 - (Static292.anInt8379 - Static292.anInt8382) * (arg0.anInt3329 - (-arg2.anInt6590 - -Static292.anInt8374)) / (Static292.anInt8375 - Static292.anInt8374);
			local9 = Static292.anInt8379 - (Static292.anInt8379 - Static292.anInt8382) * (-Static292.anInt8374 + arg0.anInt3334 - -arg2.anInt6590) / (Static292.anInt8375 - Static292.anInt8374);
			local7 = (Static292.anInt8381 - Static292.anInt8384) * (arg0.anInt3339 + arg2.anInt6587 - Static292.anInt8383) / (Static292.anInt8377 - Static292.anInt8383) + Static292.anInt8384;
			local5 = (arg2.anInt6587 + arg0.anInt3336 - Static292.anInt8383) * (Static292.anInt8381 - Static292.anInt8384) / (Static292.anInt8377 - Static292.anInt8383) + Static292.anInt8384;
		}
		@Pc(102) Class20 local102 = null;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		if (arg0.anInt3335 != -1) {
			if (arg2.aBoolean488 && arg0.anInt3342 != -1) {
				local102 = arg0.method2787(true, arg1);
			} else {
				local102 = arg0.method2787(false, arg1);
			}
			if (local102 != null) {
				local104 = arg2.anInt6594 - (local102.method4588() + 1 >> 1);
				if (local5 > local104) {
					local5 = local104;
				}
				local106 = arg2.anInt6594 + (local102.method4588() + 1 >> 1);
				local108 = arg2.anInt6591 - (local102.method4576() + 1 >> 1);
				if (local7 < local106) {
					local7 = local106;
				}
				local110 = arg2.anInt6591 + (local102.method4576() + 1 >> 1);
				if (local108 < local9) {
					local9 = local108;
				}
				if (local110 > local11) {
					local11 = local110;
				}
			}
		}
		@Pc(207) Class125 local207 = null;
		@Pc(209) int local209 = 0;
		@Pc(211) int local211 = 0;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(301) int local301;
		if (arg0.aString34 != null) {
			local207 = Static219.method3760(arg0.anInt3352);
			if (local207 != null) {
				local209 = Static72.aClass114_9.method3010(null, null, Static264.aStringArray13, arg0.aString34);
				local211 = arg2.anInt6594 + (Static292.anInt8381 - Static292.anInt8384) * arg0.anInt3350 / (Static292.anInt8377 - Static292.anInt8383);
				local213 = arg2.anInt6591 - arg0.anInt3331 * (Static292.anInt8379 - Static292.anInt8382) / (Static292.anInt8375 - Static292.anInt8374);
				if (local102 == null) {
					local213 -= local207.method3117() * local209 / 2;
				} else {
					local213 -= (local102.method4576() >> 1) + (local207.method3114() * local209);
				}
				for (local301 = 0; local301 < local209; local301++) {
					@Pc(306) String local306 = Static264.aStringArray13[local301];
					if (local301 < local209 - 1) {
						local306 = local306.substring(0, local306.length() - 4);
					}
					@Pc(327) int local327 = local207.method3115(local306);
					if (local327 > local215) {
						local215 = local327;
					}
				}
				local217 = local211 - local215 / 2;
				local219 = local215 / 2 + local211;
				if (local5 > local217) {
					local5 = local217;
				}
				if (local219 > local7) {
					local7 = local219;
				}
				local221 = local213;
				if (local221 < local9) {
					local9 = local221;
				}
				local223 = local213 + local207.method3114() * local209;
				if (local223 > local11) {
					local11 = local223;
				}
			}
		}
		if (Static292.anInt8384 > local7 || local5 > Static292.anInt8381 || local11 < Static292.anInt8382 || local9 > Static292.anInt8379) {
			return true;
		}
		Static292.method7033(arg1, arg2, arg0);
		if (local102 != null) {
			if (Static347.anInt6415 > 0 && (Static432.anInt7737 != -1 && Static432.anInt7737 == arg2.anInt6596 || Static549.anInt9101 != -1 && arg0.anInt3320 == Static549.anInt9101)) {
				if (Static59.anInt1226 <= 50) {
					local301 = Static59.anInt1226 * 2;
				} else {
					local301 = (100 - Static59.anInt1226) * 2;
				}
				@Pc(482) int local482 = local301 << 24 | 0xFFFF00;
				arg1.method7966(local102.method4579() / 2 + 7, local482, arg2.anInt6591, arg2.anInt6594);
				arg1.method7966(local102.method4579() / 2 + 5, local482, arg2.anInt6591, arg2.anInt6594);
				arg1.method7966(local102.method4579() / 2 + 3, local482, arg2.anInt6591, arg2.anInt6594);
				arg1.method7966(local102.method4579() / 2 + 1, local482, arg2.anInt6591, arg2.anInt6594);
				arg1.method7966(local102.method4579() / 2, local482, arg2.anInt6591, arg2.anInt6594);
			}
			local102.method4582(arg2.anInt6594 - (local102.method4588() >> 1), arg2.anInt6591 - (local102.method4576() >> 1));
		}
		if (arg0.aString34 != null && local207 != null) {
			Static171.method3173(local209, arg1, arg0, local213, local207, local211, local215, arg2);
		}
		if (arg0.anInt3335 != -1 || arg0.aString34 != null) {
			@Pc(601) Class2_Sub52 local601 = new Class2_Sub52(arg2);
			local601.anInt10264 = local219;
			local601.anInt10257 = local110;
			local601.anInt10259 = local106;
			local601.anInt10258 = local104;
			local601.anInt10262 = local108;
			local601.anInt10256 = local221;
			local601.anInt10260 = local217;
			local601.anInt10255 = local223;
			Static300.aClass238_33.method5837(local601);
		}
		return false;
	}
}
