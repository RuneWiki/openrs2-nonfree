import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "[Lclient!fd;")
	public static Class103[] aClass103Array11;

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_172 = new Class194(7, 3);

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Lclient!pm;")
	public static Class270 method5145(@OriginalArg(0) int arg0) {
		@Pc(18) Class270 local18 = (Class270) Static494.aClass136_56.method3134((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static440.aClass343_208.method8132(0, arg0);
		local18 = new Class270();
		if (local28 != null) {
			local18.method6627(arg0, new Class3_Sub9(local28));
		}
		Static494.aClass136_56.method3135(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I[BIIIIII[B)V")
	public static void method5147(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(15) int local15 = -(arg6 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg1++;
				arg0[local26] = (byte) (arg0[local26] - arg7[arg4++]);
				@Pc(39) int local39 = arg1++;
				arg0[local39] = (byte) (arg0[local39] - arg7[arg4++]);
				@Pc(52) int local52 = arg1++;
				arg0[local52] = (byte) (arg0[local52] - arg7[arg4++]);
				@Pc(65) int local65 = arg1++;
				arg0[local65] = (byte) (arg0[local65] - arg7[arg4++]);
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local26 = arg1++;
				arg0[local26] = (byte) (arg0[local26] - arg7[arg4++]);
			}
			arg4 += arg3;
			arg1 += arg2;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "([III[II)V")
	public static void method5148(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(27) int local27 = (arg1 + arg3) / 2;
		@Pc(29) int local29 = arg3;
		@Pc(33) int local33 = arg2[local27];
		arg2[local27] = arg2[arg1];
		arg2[arg1] = local33;
		@Pc(47) int local47 = arg0[local27];
		arg0[local27] = arg0[arg1];
		arg0[arg1] = local47;
		@Pc(66) int local66 = ~local33 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(68) int local68 = arg3; local68 < arg1; local68++) {
			if (arg2[local68] < (local68 & local66) + local33) {
				@Pc(87) int local87 = arg2[local68];
				arg2[local68] = arg2[local29];
				arg2[local29] = local87;
				@Pc(101) int local101 = arg0[local68];
				arg0[local68] = arg0[local29];
				arg0[local29++] = local101;
			}
		}
		arg2[arg1] = arg2[local29];
		arg2[local29] = local33;
		arg0[arg1] = arg0[local29];
		arg0[local29] = local47;
		method5148(arg0, local29 - 1, arg2, arg3);
		method5148(arg0, arg1, arg2, local29 + 1);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)V")
	public static void method5149(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub7_Sub5 local16 = Static138.method2377(12, arg1);
		local16.method1474();
		local16.anInt1728 = arg0;
	}
}
