import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!qea", name = "d", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_116 = new Class200(38, -1);

	@OriginalMember(owner = "client!qea", name = "e", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_117 = new Class200(108, 4);

	@OriginalMember(owner = "client!qea", name = "f", descriptor = "Lclient!mg;")
	public static final Class216 aClass216_1 = new Class216();

	@OriginalMember(owner = "client!qea", name = "g", descriptor = "Lclient!mr;")
	public static final Class223 aClass223_48 = new Class223();

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "([BII)[B")
	public static byte[] method6997(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) byte[] local14 = new byte[arg1];
		Static653.method6858(arg0, 0, local14, 0, arg1);
		return local14;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIZLclient!aa;IILclient!ha;ILclient!qk;)V")
	public static void method6998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class279 arg7) {
		@Pc(23) Class36 local23 = Static68.aClass335_2.method8125(arg3);
		if (local23 == null || !local23.aBoolean90 || !local23.method1413(Static373.aClass150_1)) {
			return;
		}
		@Pc(43) int local43;
		if (local23.anIntArray40 != null) {
			@Pc(41) int[] local41 = new int[local23.anIntArray40.length];
			@Pc(56) int local56;
			@Pc(67) int local67;
			@Pc(71) int local71;
			for (local43 = 0; local43 < local41.length / 2; local43++) {
				if (Static305.anInt5422 == 4) {
					local56 = (int) Static401.aFloat165 & 0x3FFF;
				} else {
					local56 = (int) Static401.aFloat165 + Static226.anInt1879 & 0x3FFF;
				}
				local67 = Class21.anIntArray656[local56];
				local71 = Class21.anIntArray655[local56];
				if (Static305.anInt5422 != 4) {
					local67 = local67 * 256 / (Static517.anInt8961 + 256);
					local71 = local71 * 256 / (Static517.anInt8961 + 256);
				}
				local41[local43 * 2] = (local67 * (arg1 + local23.anIntArray40[local43 * 2 + 1] * 4) + local71 * (arg4 + local23.anIntArray40[local43 * 2] * 4) >> 14) + arg7.anInt8153 / 2 + arg0;
				local41[local43 * 2 + 1] = arg6 + arg7.anInt8141 / 2 - ((arg1 + local23.anIntArray40[local43 * 2 + 1] * 4) * local71 - (arg4 + local23.anIntArray40[local43 * 2] * 4) * local67 >> 14);
			}
			Static616.method8519(arg5, local41, local23.anInt1342, arg7.anIntArray514, arg7.anIntArray519);
			if (local23.anInt1362 > 0) {
				@Pc(231) int local231;
				@Pc(241) int local241;
				@Pc(246) int local246;
				@Pc(248) int local248;
				for (local56 = 0; local56 < local41.length / 2 - 1; local56++) {
					local67 = local41[local56 * 2];
					local71 = local41[local56 * 2 + 1];
					local231 = local41[(local56 + 1) * 2];
					local241 = local41[(local56 + 1) * 2 + 1];
					if (local67 > local231) {
						local246 = local67;
						local248 = local71;
						local67 = local231;
						local231 = local246;
						local71 = local241;
						local241 = local248;
					} else if (local231 == local67 && local71 > local241) {
						local246 = local71;
						local71 = local241;
						local241 = local246;
					}
					arg5.method7500(local67, local71, local231, local241, local23.anIntArray39[local23.aByteArray5[local56] & 0xFF], arg2, arg0, arg6, local23.anInt1362, local23.anInt1358, local23.anInt1333);
				}
				local67 = local41[local41.length - 2];
				local71 = local41[local41.length - 1];
				local231 = local41[0];
				local241 = local41[1];
				if (local231 < local67) {
					local246 = local67;
					local248 = local71;
					local67 = local231;
					local71 = local241;
					local231 = local246;
					local241 = local248;
				} else if (local231 == local67 && local71 > local241) {
					local246 = local71;
					local71 = local241;
					local241 = local246;
				}
				arg5.method7500(local67, local71, local231, local241, local23.anIntArray39[local23.aByteArray5[local23.aByteArray5.length - 1] & 0xFF], arg2, arg0, arg6, local23.anInt1362, local23.anInt1358, local23.anInt1333);
			} else {
				for (local56 = 0; local56 < local41.length / 2 - 1; local56++) {
					arg5.method7540(local41[local56 * 2], local41[local56 * 2 + 1], local41[local56 * 2 + 2], local41[(local56 + 1) * 2 + 1], local23.anIntArray39[local23.aByteArray5[local56] & 0xFF], arg2, arg0, arg6);
				}
				arg5.method7540(local41[local41.length - 2], local41[local41.length - 1], local41[0], local41[1], local23.anIntArray39[local23.aByteArray5[local23.aByteArray5.length - 1] & 0xFF], arg2, arg0, arg6);
			}
		}
		@Pc(501) Class24 local501 = null;
		if (local23.anInt1339 != -1) {
			local501 = local23.method1414(arg5, false);
			if (local501 != null) {
				Static506.method7464(arg0, local501, arg2, arg4, arg1, arg6, arg7);
			}
		}
		if (local23.aString5 == null) {
			return;
		}
		local43 = 0;
		if (local501 != null) {
			local43 = local501.method8578();
		}
		@Pc(535) Class62 local535 = Static557.aClass62_12;
		@Pc(537) Class282 local537 = Static607.aClass282_15;
		if (local23.anInt1357 == 1) {
			local535 = Static187.aClass62_4;
			local537 = Static256.aClass282_7;
		}
		if (local23.anInt1357 == 2) {
			local535 = Static460.aClass62_9;
			local537 = Static489.aClass282_12;
		}
		Static207.method3562(arg6, arg4, arg7, arg1, local537, local43, arg2, local23.anInt1335, local23.aString5, local535, arg0);
		return;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
	public static void method6999() {
		if (Static504.anApplet2 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static504.anApplet2.getParameter("cookiehost");
			@Pc(22) int local22 = (int) (Static374.method6036() / 86400000L) - 11745;
			@Pc(34) String local34 = "usrdob=" + local22 + "; version=1; path=/; domain=" + local14;
			Static646.method3053(Static504.anApplet2, "document.cookie=\"" + local34 + "\"");
		} catch (@Pc(48) Throwable local48) {
		}
	}
}
