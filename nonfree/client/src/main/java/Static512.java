import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!maa;B)V")
	public static void method7461(@OriginalArg(0) Class12_Sub8 arg0) {
		arg0.aClass12_Sub2_15 = null;
		@Pc(12) int local12 = arg0.aClass12_Sub1Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass12_Sub1Array1[local14].aBoolean6 = false;
		}
		@Pc(32) Class376[] local32 = Class175.aClass376Array1;
		synchronized (Class175.aClass376Array1) {
			if (local12 < Class175.aClass376Array1.length && Static42.anIntArray83[local12] < 200) {
				Class175.aClass376Array1[local12].method9011(arg0);
				@Pc(59) int local59 = Static42.anIntArray83[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZILclient!qfa;Ljava/lang/String;)Lclient!nk;")
	public static Class248 method7462(@OriginalArg(2) Class137_Sub3 arg0, @OriginalArg(3) String arg1) {
		@Pc(14) int local14 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local14);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static663.anIntArray819, 0);
		if (Static663.anIntArray819[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class248(arg0, 34336, local14);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!fb;I)V")
	public static void method7463(@OriginalArg(0) Class12_Sub2_Sub2_Sub1_Sub2 arg0) {
		@Pc(18) Class14_Sub31 local18 = (Class14_Sub31) Static587.aClass187_83.method4078((long) arg0.anInt2945);
		if (local18 == null) {
			Static413.method1523((Class203) null, (Class12_Sub2_Sub2_Sub1_Sub1) null, arg0, arg0.anIntArray242[0], arg0.anIntArray241[0], 0, arg0.aByte146);
		} else {
			local18.method4985();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!wia;BII)Lclient!ie;")
	public static Class158 method7464(@OriginalArg(0) Class386 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method9196(0, arg1);
		return local9 == null ? null : new Class158(local9);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIII)V")
	public static void method7465(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(31) int local31 = local13 << 1;
		@Pc(35) int local35 = arg3 << 1;
		@Pc(44) int local44 = (1 - local35) * local13 + local21;
		@Pc(53) int local53 = local17 - (local35 - 1) * local31;
		@Pc(57) int local57 = local13 << 2;
		@Pc(61) int local61 = local17 << 2;
		@Pc(69) int local69 = local21 * 3;
		@Pc(77) int local77 = local31 * ((arg3 << 1) - 3);
		@Pc(83) int local83 = local61;
		Static679.method9323(Static274.anIntArrayArray34[arg0], arg1 - arg4, arg2, arg4 + arg1);
		@Pc(102) int local102 = (arg3 - 1) * local57;
		while (local9 > 0) {
			if (local44 < 0) {
				while (local44 < 0) {
					local44 += local69;
					local53 += local83;
					local69 += local61;
					local83 += local61;
					local7++;
				}
			}
			if (local53 < 0) {
				local44 += local69;
				local53 += local83;
				local83 += local61;
				local69 += local61;
				local7++;
			}
			local44 += -local102;
			local53 += -local77;
			local77 -= local57;
			local9--;
			local102 -= local57;
			@Pc(175) int local175 = arg0 - local9;
			@Pc(179) int local179 = arg0 + local9;
			@Pc(183) int local183 = local7 + arg1;
			@Pc(188) int local188 = arg1 - local7;
			Static679.method9323(Static274.anIntArrayArray34[local175], local188, arg2, local183);
			Static679.method9323(Static274.anIntArrayArray34[local179], local188, arg2, local183);
		}
	}
}
