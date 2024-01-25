import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
	public static int anInt6092;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_78 = new Class179(53, 8);

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
	public static int anInt6090 = 20;

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
	public static int anInt6091 = 0;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString64 = "";

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IC)B")
	public static byte method5075(@OriginalArg(1) char arg0) {
		@Pc(39) byte local39;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local39 = (byte) arg0;
		} else if (arg0 == '€') {
			local39 = -128;
		} else if (arg0 == '‚') {
			local39 = -126;
		} else if (arg0 == 'ƒ') {
			local39 = -125;
		} else if (arg0 == '„') {
			local39 = -124;
		} else if (arg0 == '…') {
			local39 = -123;
		} else if (arg0 == '†') {
			local39 = -122;
		} else if (arg0 == '‡') {
			local39 = -121;
		} else if (arg0 == 'ˆ') {
			local39 = -120;
		} else if (arg0 == '‰') {
			local39 = -119;
		} else if (arg0 == 'Š') {
			local39 = -118;
		} else if (arg0 == '‹') {
			local39 = -117;
		} else if (arg0 == 'Œ') {
			local39 = -116;
		} else if (arg0 == 'Ž') {
			local39 = -114;
		} else if (arg0 == '‘') {
			local39 = -111;
		} else if (arg0 == '’') {
			local39 = -110;
		} else if (arg0 == '“') {
			local39 = -109;
		} else if (arg0 == '”') {
			local39 = -108;
		} else if (arg0 == '•') {
			local39 = -107;
		} else if (arg0 == '–') {
			local39 = -106;
		} else if (arg0 == '—') {
			local39 = -105;
		} else if (arg0 == '˜') {
			local39 = -104;
		} else if (arg0 == '™') {
			local39 = -103;
		} else if (arg0 == 'š') {
			local39 = -102;
		} else if (arg0 == '›') {
			local39 = -101;
		} else if (arg0 == 'œ') {
			local39 = -100;
		} else if (arg0 == 'ž') {
			local39 = -98;
		} else if (arg0 == 'Ÿ') {
			local39 = -97;
		} else {
			local39 = 63;
		}
		return local39;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)Z")
	public static boolean method5076(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIBII)V")
	public static void method5077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg2 - arg4;
		@Pc(13) int local13 = arg0 - arg1;
		if (local13 == 0) {
			if (local8 != 0) {
				Static157.method3068(arg3, arg1, arg4, arg2);
			}
		} else if (local8 == 0) {
			Static421.method1794(arg4, arg0, arg1, arg3);
		} else {
			if (local13 < 0) {
				local13 = -local13;
			}
			if (local8 < 0) {
				local8 = -local8;
			}
			@Pc(74) boolean local74 = local8 > local13;
			@Pc(78) int local78;
			@Pc(80) int local80;
			if (local74) {
				local78 = arg1;
				local80 = arg0;
				arg1 = arg4;
				arg0 = arg2;
				arg4 = local78;
				arg2 = local80;
			}
			if (arg1 > arg0) {
				local78 = arg1;
				local80 = arg4;
				arg1 = arg0;
				arg0 = local78;
				arg4 = arg2;
				arg2 = local80;
			}
			local78 = arg4;
			local80 = arg0 - arg1;
			@Pc(114) int local114 = arg2 - arg4;
			@Pc(119) int local119 = -(local80 >> 1);
			@Pc(130) int local130 = arg2 <= arg4 ? -1 : 1;
			if (local114 < 0) {
				local114 = -local114;
			}
			@Pc(139) int local139;
			if (local74) {
				for (local139 = arg1; local139 <= arg0; local139++) {
					local119 += local114;
					Static163.anIntArrayArray35[local139][local78] = arg3;
					if (local119 > 0) {
						local119 -= local80;
						local78 += local130;
					}
				}
			} else {
				for (local139 = arg1; local139 <= arg0; local139++) {
					Static163.anIntArrayArray35[local78][local139] = arg3;
					local119 += local114;
					if (local119 > 0) {
						local119 -= local80;
						local78 += local130;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)I")
	public static int method5078(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static400.anIntArray593[arg0 & 0x3] : Static29.anIntArray365[arg0 & 0x3];
	}
}
