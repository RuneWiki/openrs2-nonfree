import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
	public static int anInt5563;

	@OriginalMember(owner = "client!kv", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString53;

	@OriginalMember(owner = "client!kv", name = "x", descriptor = "I")
	public static int anInt5565;

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_186 = new Class186(20, -1);

	@OriginalMember(owner = "client!kv", name = "w", descriptor = "Lclient!er;")
	public static final Class69 aClass69_50 = new Class69(200);

	@OriginalMember(owner = "client!kv", name = "y", descriptor = "I")
	public static int anInt5566 = -1;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZI)Z")
	public static boolean method4267(@OriginalArg(1) int arg0) {
		Static368.anInt6522 = arg0 + 1 & 0xFFFF;
		Static443.aBoolean491 = true;
		return true;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIBIILclient!qa;II)V")
	public static void method4270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class30 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface11 local11 = (Interface11) Static138.method1998(arg0, arg2, arg6);
		@Pc(22) Class71 local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(48) int local48;
		if (local11 != null) {
			local22 = Static2.aClass74_13.method1683(local11.method5648());
			local28 = local11.method5649() & 0x3;
			local32 = local11.method5644();
			if (local22.anInt2165 == -1) {
				local48 = arg1;
				if (local22.anInt2194 > 0) {
					local48 = arg3;
				}
				if (local32 == 0 || local32 == 2) {
					if (local28 == 0) {
						arg5.method4677(local48, 4, arg4, arg7);
					} else if (local28 == 1) {
						arg5.method4658(arg7, local48, arg4, 4);
					} else if (local28 == 2) {
						arg5.method4677(local48, 4, arg4, arg7 + 3);
					} else if (local28 == 3) {
						arg5.method4658(arg7, local48, arg4 + 3, 4);
					}
				}
				if (local32 == 3) {
					if (local28 == 0) {
						arg5.method4692(1, 1, arg7, local48, arg4);
					} else if (local28 == 1) {
						arg5.method4692(1, 1, arg7 + 3, local48, arg4);
					} else if (local28 == 2) {
						arg5.method4692(1, 1, arg7 + 3, local48, arg4 + 3);
					} else if (local28 == 3) {
						arg5.method4692(1, 1, arg7, local48, arg4 + 3);
					}
				}
				if (local32 == 2) {
					if (local28 == 0) {
						arg5.method4658(arg7, local48, arg4, 4);
					} else if (local28 == 1) {
						arg5.method4677(local48, 4, arg4, arg7 + 3);
					} else if (local28 == 2) {
						arg5.method4658(arg7, local48, arg4 + 3, 4);
					} else if (local28 == 3) {
						arg5.method4677(local48, 4, arg4, arg7);
					}
				}
			} else {
				Static440.method5685(local28, arg7, local22, arg5, arg4);
			}
		}
		local11 = (Interface11) Static134.method1950(arg0, arg2, arg6, ou.class);
		if (local11 != null) {
			local22 = Static2.aClass74_13.method1683(local11.method5648());
			local28 = local11.method5649() & 0x3;
			local32 = local11.method5644();
			if (local22.anInt2165 != -1) {
				Static440.method5685(local28, arg7, local22, arg5, arg4);
			} else if (local32 == 9) {
				local48 = -1118482;
				if (local22.anInt2194 > 0) {
					local48 = -1179648;
				}
				if (local28 == 0 || local28 == 2) {
					arg5.method4694(local48, arg7, arg4 + 3, arg4, arg7 + 3);
				} else {
					arg5.method4694(local48, arg7, arg4, arg4 + 3, arg7 + 3);
				}
			}
		}
		local11 = (Interface11) Static40.method729(arg0, arg2, arg6);
		if (local11 == null) {
			return;
		}
		local22 = Static2.aClass74_13.method1683(local11.method5648());
		local28 = local11.method5649() & 0x3;
		if (local22.anInt2165 != -1) {
			Static440.method5685(local28, arg7, local22, arg5, arg4);
			return;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method4275(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(15) int local15 = Static309.method4263(arg0, arg1);
		@Pc(20) String[] local20 = new String[local15 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local15; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg1.charAt(local30) != arg0; local30++) {
			}
			local20[local22++] = arg1.substring(local24, local30);
			local24 = local30 + 1;
		}
		local20[local15] = arg1.substring(local24);
		return local20;
	}
}
