import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!od", name = "x", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!od", name = "u", descriptor = "Lclient!kb;")
	public static final Class72 aClass72_1 = Static224.method3904();

	@OriginalMember(owner = "client!od", name = "v", descriptor = "[I")
	public static final int[] anIntArray367 = new int[] { 0, 2, 0, 6, 0, 14, 0, 15, 0, 7, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 7, 12, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 6, 0, 0, 0, 6, 0, 0, 2, 0, -2, -1, 6, 0, -1, 3, 0, 0, -1, 0, 0, 9, 0, 0, 20, 0, 0, 0, 0, -1, 8, 0, 8, 0, 0, 5, 4, 0, 0, 0, 1, 0, -2, 0, -2, 7, 11, 0, 0, 0, 3, 0, 0, 0, 6, 0, 14, 10, 0, 4, 0, 0, -1, 0, 0, -1, 0, -2, 8, 2, 0, 0, 0, 0, 0, 0, 3, 0, 0, 8, 0, 8, -2, 0, -1, 0, 6, 1, 0, -2, 28, 0, 6, 0, 10, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -2, -2, 0, 0, 3, 0, 0, 2, 2, 12, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, 8, 0, -1, 15, 0, -1, 3, 0, 0, 0, 0, 3, 12, 10, -1, 0, 0, 12, 0, -2, 0, -1, 0, 17, 0, 0, 6, 0, -1, 0, 0, 0, 0, 8, 0, 2, 3, 5, 0, 4, 0, 0, 7, 5, -2, 6, -2, 0, 0, 0, 12, 0, 6, 8, 0, 2, 2, 0, 8, -1, -1, 5, 0, 0, 0, 0, 4, -1, 0, -1, 0, 0, 6, 0, 0, 0, 6, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, -2, 0, 0 };

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lclient!rr;")
	public static Class58_Sub1 method3808(@OriginalArg(0) int arg0) {
		return Static323.aBoolean425 && Static216.anInt4416 <= arg0 && arg0 <= Static152.anInt2970 ? Static187.aClass58_Sub1Array1[arg0 - Static216.anInt4416] : null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3809(@OriginalArg(0) String arg0) {
		Static230.aString248 = arg0;
		if (Static353.aClass42_5.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static353.aClass42_5.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static353.aClass42_5.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static73.method1119(Static53.method898() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static361.method2057("document.cookie=\"" + local39 + "\"", Static353.aClass42_5.anApplet1);
		} catch (@Pc(88) Throwable local88) {
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILclient!fb;ZIIIIIIZB)V")
	public static void method3811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		if (arg5 == 1) {
			arg9 = 1;
		} else if (arg5 == 2) {
			arg8 = 1;
			arg9 = 1;
		} else if (arg5 == 3) {
			arg8 = 1;
		}
		@Pc(74) int local74;
		if (arg4 < 0 || Static162.anInt2152 <= arg4 || arg1 < 0 || Static122.anInt2632 <= arg1) {
			while (true) {
				local74 = arg2.method3643();
				if (local74 == 0) {
					return;
				}
				if (local74 == 1) {
					arg2.method3643();
					return;
				}
				if (local74 <= 49) {
					arg2.method3643();
				}
			}
			return;
		}
		if (!arg10 && !arg3) {
			Static160.aByteArrayArrayArray9[arg6][arg4][arg1] = 0;
		}
		while (true) {
			local74 = arg2.method3643();
			if (local74 == 0) {
				if (arg10) {
					Static105.anIntArrayArrayArray2[0][arg4 + arg8][arg1 + arg9] = Static355.aClass22Array3[0].method4672(arg8 + arg4, arg9 + arg1);
					return;
				} else if (arg6 == 0) {
					Static105.anIntArrayArrayArray2[0][arg8 + arg4][arg1 + arg9] = -Static56.method936(arg0 + 932731, 556238 - -arg7) * 8;
					return;
				} else {
					Static105.anIntArrayArrayArray2[arg6][arg8 + arg4][arg1 + arg9] = Static105.anIntArrayArrayArray2[arg6 - 1][arg4 + arg8][arg9 + arg1] - 240;
					return;
				}
			}
			if (local74 == 1) {
				@Pc(168) int local168 = arg2.method3643();
				if (!arg10) {
					if (local168 == 1) {
						local168 = 0;
					}
					if (arg6 == 0) {
						Static105.anIntArrayArrayArray2[0][arg8 + arg4][arg1 + arg9] = -local168 * 8;
						return;
					}
					Static105.anIntArrayArrayArray2[arg6][arg8 + arg4][arg1 + arg9] = Static105.anIntArrayArrayArray2[arg6 - 1][arg4 + arg8][arg9 + arg1] - local168 * 8;
					return;
				}
				Static105.anIntArrayArrayArray2[0][arg4 + arg8][arg9 + arg1] = local168 * 8 + Static355.aClass22Array3[0].method4672(arg8 + arg4, arg9 + arg1);
				return;
			}
			if (local74 <= 49) {
				if (arg3) {
					arg2.method3643();
				} else {
					Static245.aByteArrayArrayArray12[arg6][arg4][arg1] = arg2.method3621();
					Static155.aByteArrayArrayArray3[arg6][arg4][arg1] = (byte) ((local74 - 2) / 4);
					Static176.aByteArrayArrayArray13[arg6][arg4][arg1] = (byte) (local74 + arg5 - 2 & 0x3);
				}
			} else if (local74 <= 81) {
				if (!arg10 && !arg3) {
					Static160.aByteArrayArrayArray9[arg6][arg4][arg1] = (byte) (local74 - 49);
				}
			} else if (!arg3) {
				Static147.aByteArrayArrayArray8[arg6][arg4][arg1] = (byte) (local74 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!sj;I)Lclient!sj;")
	public static Class181 method3812(@OriginalArg(0) Class181 arg0) {
		@Pc(10) Class181 local10 = Static47.method823(arg0);
		if (local10 == null) {
			local10 = arg0.aClass181_46;
		}
		return local10;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3813(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		Static123.method2166(arg2, arg0, arg1, 0, arg3, arg4);
	}
}
