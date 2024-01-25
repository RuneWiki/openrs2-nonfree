import java.awt.Frame;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!g", name = "O", descriptor = "[I")
	public static int[] anIntArray199;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_29 = new Class183(9, 2);

	@OriginalMember(owner = "client!g", name = "v", descriptor = "I")
	public static int anInt2418 = 20;

	@OriginalMember(owner = "client!g", name = "Q", descriptor = "Z")
	public static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BIIII)V")
	public static void method1962(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) int local14 = 0; local14 < Static198.anInt4111; local14++) {
			@Pc(20) Rectangle local20 = Class196.aRectangleArray1[local14];
			if (local20.x + local20.width > arg3 && local20.x < arg0 + arg3 && local20.height + local20.y > arg1 && local20.y < arg2 + arg1) {
				Static71.aBooleanArray8[local14] = true;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!kd;Ljava/awt/Frame;)V")
	public static void method1966(@OriginalArg(1) Class123 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(10) Class86 local10 = arg0.method3266(arg1);
			while (local10.anInt2590 == 0) {
				Static215.method3855(10L);
			}
			if (local10.anInt2590 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static215.method3855(100L);
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(IB)V")
	public static void method1971(@OriginalArg(0) int arg0) {
		Static11.anInt211 = 3;
		Static313.anInt5728 = 100;
		Static228.anInt4596 = -1;
		Static340.anInt6283 = arg0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BC)B")
	public static byte method1981(@OriginalArg(1) char arg0) {
		@Pc(29) byte local29;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local29 = (byte) arg0;
		} else if (arg0 == '€') {
			local29 = -128;
		} else if (arg0 == '‚') {
			local29 = -126;
		} else if (arg0 == 'ƒ') {
			local29 = -125;
		} else if (arg0 == '„') {
			local29 = -124;
		} else if (arg0 == '…') {
			local29 = -123;
		} else if (arg0 == '†') {
			local29 = -122;
		} else if (arg0 == '‡') {
			local29 = -121;
		} else if (arg0 == 'ˆ') {
			local29 = -120;
		} else if (arg0 == '‰') {
			local29 = -119;
		} else if (arg0 == 'Š') {
			local29 = -118;
		} else if (arg0 == '‹') {
			local29 = -117;
		} else if (arg0 == 'Œ') {
			local29 = -116;
		} else if (arg0 == 'Ž') {
			local29 = -114;
		} else if (arg0 == '‘') {
			local29 = -111;
		} else if (arg0 == '’') {
			local29 = -110;
		} else if (arg0 == '“') {
			local29 = -109;
		} else if (arg0 == '”') {
			local29 = -108;
		} else if (arg0 == '•') {
			local29 = -107;
		} else if (arg0 == '–') {
			local29 = -106;
		} else if (arg0 == '—') {
			local29 = -105;
		} else if (arg0 == '˜') {
			local29 = -104;
		} else if (arg0 == '™') {
			local29 = -103;
		} else if (arg0 == 'š') {
			local29 = -102;
		} else if (arg0 == '›') {
			local29 = -101;
		} else if (arg0 == 'œ') {
			local29 = -100;
		} else if (arg0 == 'ž') {
			local29 = -98;
		} else if (arg0 == 'Ÿ') {
			local29 = -97;
		} else {
			local29 = 63;
		}
		return local29;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method1983(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		Static1.aClass83_131.anInt2413 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static57.aClass196_1.anInt5461; local18++) {
			@Pc(25) Class152 local25 = Static57.aClass196_1.method4827(local18);
			if ((!arg0 || local25.aBoolean312) && local25.anInt4310 == -1 && local25.anInt4311 == -1 && local25.anInt4346 == 0 && local25.aString35.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static323.aShortArray111 = null;
					Static274.anInt5131 = -1;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(77) short[] local77 = new short[local14.length * 2];
					for (@Pc(79) int local79 = 0; local79 < local16; local79++) {
						local77[local79] = local14[local79];
					}
					local14 = local77;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static369.anInt6786 = 0;
		Static323.aShortArray111 = local14;
		Static274.anInt5131 = local16;
		@Pc(117) String[] local117 = new String[Static274.anInt5131];
		for (@Pc(119) int local119 = 0; local119 < Static274.anInt5131; local119++) {
			local117[local119] = Static57.aClass196_1.method4827(local14[local119]).aString35;
		}
		Static294.method4829(Static323.aShortArray111, local117);
		Static1.aClass83_131.method1969();
		Static1.aClass83_131.anInt2413 = 2;
	}
}
