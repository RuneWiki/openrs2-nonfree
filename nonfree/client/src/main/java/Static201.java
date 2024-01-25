import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!ida", name = "V", descriptor = "[I")
	public static int[] anIntArray324;

	@OriginalMember(owner = "client!ida", name = "x", descriptor = "Lclient!jc;")
	public static final Class145 aClass145_4 = new Class145();

	@OriginalMember(owner = "client!ida", name = "H", descriptor = "Z")
	public static boolean aBoolean257 = false;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILclient!qa;IIIIIII)V")
	public static void method3744(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) Interface17 local13 = (Interface17) Static503.method7224(arg0, arg6, arg4);
		@Pc(22) Class288 local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(46) int local46;
		if (local13 != null) {
			local22 = Static365.aClass194_6.method5084(local13.method7172());
			local28 = local13.method7173() & 0x3;
			local32 = local13.method7176();
			if (local22.anInt8366 == -1) {
				local46 = arg2;
				if (local22.anInt8338 > 0) {
					local46 = arg7;
				}
				if (local32 == 0 || local32 == 2) {
					if (local28 == 0) {
						arg1.method7621(local46, arg5, 4, arg3);
					} else if (local28 == 1) {
						arg1.method7581(arg5, 4, local46, arg3);
					} else if (local28 == 2) {
						arg1.method7621(local46, arg5 + 3, 4, arg3);
					} else if (local28 == 3) {
						arg1.method7581(arg5, 4, local46, arg3 + 3);
					}
				}
				if (local32 == 3) {
					if (local28 == 0) {
						arg1.method7632(arg5, local46, 1, 1, arg3);
					} else if (local28 == 1) {
						arg1.method7632(arg5 + 3, local46, 1, 1, arg3);
					} else if (local28 == 2) {
						arg1.method7632(arg5 + 3, local46, 1, 1, arg3 + 3);
					} else if (local28 == 3) {
						arg1.method7632(arg5, local46, 1, 1, arg3 + 3);
					}
				}
				if (local32 == 2) {
					if (local28 == 0) {
						arg1.method7581(arg5, 4, local46, arg3);
					} else if (local28 == 1) {
						arg1.method7621(local46, arg5 + 3, 4, arg3);
					} else if (local28 == 2) {
						arg1.method7581(arg5, 4, local46, arg3 + 3);
					} else if (local28 == 3) {
						arg1.method7621(local46, arg5, 4, arg3);
					}
				}
			} else {
				Static25.method1155(arg1, local22, arg3, arg5, local28);
			}
		}
		local13 = (Interface17) Static52.method1507(arg0, arg6, arg4, up.class);
		if (local13 != null) {
			local22 = Static365.aClass194_6.method5084(local13.method7172());
			local28 = local13.method7173() & 0x3;
			local32 = local13.method7176();
			if (local22.anInt8366 != -1) {
				Static25.method1155(arg1, local22, arg3, arg5, local28);
			} else if (local32 == 9) {
				local46 = -1118482;
				if (local22.anInt8338 > 0) {
					local46 = -1179648;
				}
				if (local28 == 0 || local28 == 2) {
					arg1.method7618(arg3 + 3, arg3, arg5 + 3, local46, arg5);
				} else {
					arg1.method7618(arg3, arg3 + 3, arg5 + 3, local46, arg5);
				}
			}
		}
		local13 = (Interface17) Static167.method3276(arg0, arg6, arg4);
		if (local13 == null) {
			return;
		}
		local22 = Static365.aClass194_6.method5084(local13.method7172());
		local28 = local13.method7173() & 0x3;
		if (local22.anInt8366 != -1) {
			Static25.method1155(arg1, local22, arg3, arg5, local28);
			return;
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BII)Z")
	public static boolean method3745(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILclient!te;[I[III)Lclient!bba;")
	public static Class23_Sub1 method3747(@OriginalArg(1) Class9_Sub3 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg4 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg4; local12++) {
			@Pc(22) int local22 = local12 * arg3 + arg1[local12];
			for (@Pc(24) int local24 = 0; local24 < arg2[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class23_Sub1(arg0, arg3, arg4, local10);
	}
}
