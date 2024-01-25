import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_22 = new Class98(106, 6);

	@OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
	public static final int anInt1263 = 1403;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(II[BIII[BII)V")
	public static void method1059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(15) int local15 = -(arg0 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg1++;
				arg2[local26] = (byte) (arg2[local26] - arg6[arg3++]);
				@Pc(39) int local39 = arg1++;
				arg2[local39] = (byte) (arg2[local39] - arg6[arg3++]);
				@Pc(52) int local52 = arg1++;
				arg2[local52] = (byte) (arg2[local52] - arg6[arg3++]);
				@Pc(65) int local65 = arg1++;
				arg2[local65] = (byte) (arg2[local65] - arg6[arg3++]);
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local26 = arg1++;
				arg2[local26] = (byte) (arg2[local26] - arg6[arg3++]);
			}
			arg3 += arg4;
			arg1 += arg7;
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIBIII)Lclient!ka;")
	public static Class3 method1061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg2 * 32147369L ^ (long) arg1 * 986053L ^ (long) arg0 * 97549L ^ (long) arg5 * 67481L ^ (long) arg4 * 475427L ^ (long) arg3 * 76724863L;
		@Pc(44) Class3 local44 = (Class3) Static113.aClass330_16.method7677(local33);
		if (local44 == null) {
			local44 = Static89.aClass90_3.method7456(arg5, arg0, arg4, arg1, arg2, arg3);
			Static113.aClass330_16.method7676(local44, local33);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IILclient!maa;B)Lclient!uu;")
	public static Class6_Sub5_Sub16 method1063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class195 arg2) {
		@Pc(18) int local18 = arg2.anInt5692 | arg1 << 8;
		@Pc(27) Class6_Sub5_Sub16 local27 = (Class6_Sub5_Sub16) Static552.aClass146_3.method3536((long) local18 << 16);
		if (local27 != null) {
			return local27;
		}
		@Pc(39) byte[] local39 = Static63.aClass248_10.method5795(Static63.aClass248_10.method5776(local18));
		if (local39 == null) {
			local18 = arg2.anInt5692 | arg0 + 65536 << 8;
			local27 = (Class6_Sub5_Sub16) Static552.aClass146_3.method3536((long) local18 << 16);
			if (local27 != null) {
				return local27;
			}
			local39 = Static63.aClass248_10.method5795(Static63.aClass248_10.method5776(local18));
			if (local39 == null) {
				local18 = arg2.anInt5692 | 0xFFFF00;
				local27 = (Class6_Sub5_Sub16) Static552.aClass146_3.method3536((long) local18 << 16);
				if (local27 != null) {
					return local27;
				}
				local39 = Static63.aClass248_10.method5795(Static63.aClass248_10.method5776(local18));
				if (local39 == null) {
					return null;
				} else if (local39.length <= 1) {
					return null;
				} else {
					local27 = Static390.method5686(local39);
					local27.aClass195_11 = arg2;
					Static552.aClass146_3.method3534((long) local18 << 16, local27);
					return local27;
				}
			} else if (local39.length <= 1) {
				return null;
			} else {
				local27 = Static390.method5686(local39);
				local27.aClass195_11 = arg2;
				Static552.aClass146_3.method3534((long) local18 << 16, local27);
				return local27;
			}
		} else if (local39.length <= 1) {
			return null;
		} else {
			local27 = Static390.method5686(local39);
			local27.aClass195_11 = arg2;
			Static552.aClass146_3.method3534((long) local18 << 16, local27);
			return local27;
		}
	}

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(BI)Z")
	public static boolean method1066(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}
}
