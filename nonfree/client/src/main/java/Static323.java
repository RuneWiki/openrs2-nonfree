import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "Lclient!rk;")
	public static Class257 aClass257_4;

	@OriginalMember(owner = "client!nk", name = "y", descriptor = "I")
	public static int anInt5914;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBIII)V")
	public static void method5014(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg1;
		@Pc(23) int local23 = -arg1;
		@Pc(25) int local25 = -1;
		Static424.method6216(arg1 + arg3, arg2, arg3 - arg1, Static447.anIntArrayArray99[arg0]);
		while (local20 > local18) {
			local25 += 2;
			local18++;
			local23 += local25;
			if (local23 >= 0) {
				local20--;
				local23 -= local20 << 1;
				@Pc(63) int[] local63 = Static447.anIntArrayArray99[local20 + arg0];
				@Pc(69) int[] local69 = Static447.anIntArrayArray99[arg0 - local20];
				@Pc(73) int local73 = local18 + arg3;
				@Pc(78) int local78 = arg3 - local18;
				Static424.method6216(local73, arg2, local78, local63);
				Static424.method6216(local73, arg2, local78, local69);
			}
			@Pc(94) int local94 = arg3 + local20;
			@Pc(99) int local99 = arg3 - local20;
			@Pc(105) int[] local105 = Static447.anIntArrayArray99[arg0 + local18];
			@Pc(112) int[] local112 = Static447.anIntArrayArray99[arg0 - local18];
			Static424.method6216(local94, arg2, local99, local105);
			Static424.method6216(local94, arg2, local99, local112);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;IIII[B)I")
	public static int method5016(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(9) int local9 = arg1;
		for (@Pc(11) int local11 = 0; local11 < local9; local11++) {
			@Pc(19) char local19 = arg0.charAt(local11);
			if (local19 > '\u0000' && local19 < '\u0080' || !(local19 < ' ' || local19 > 'ÿ')) {
				arg3[arg2 + local11] = (byte) local19;
			} else if (local19 == '€') {
				arg3[local11 + arg2] = -128;
			} else if (local19 == '‚') {
				arg3[local11 + arg2] = -126;
			} else if (local19 == 'ƒ') {
				arg3[local11 + arg2] = -125;
			} else if (local19 == '„') {
				arg3[local11 + arg2] = -124;
			} else if (local19 == '…') {
				arg3[local11 + arg2] = -123;
			} else if (local19 == '†') {
				arg3[local11 + arg2] = -122;
			} else if (local19 == '‡') {
				arg3[arg2 + local11] = -121;
			} else if (local19 == 'ˆ') {
				arg3[arg2 + local11] = -120;
			} else if (local19 == '‰') {
				arg3[local11 + arg2] = -119;
			} else if (local19 == 'Š') {
				arg3[arg2 + local11] = -118;
			} else if (local19 == '‹') {
				arg3[local11 + arg2] = -117;
			} else if (local19 == 'Œ') {
				arg3[local11 + arg2] = -116;
			} else if (local19 == 'Ž') {
				arg3[local11 + arg2] = -114;
			} else if (local19 == '‘') {
				arg3[local11 + arg2] = -111;
			} else if (local19 == '’') {
				arg3[arg2 + local11] = -110;
			} else if (local19 == '“') {
				arg3[local11 + arg2] = -109;
			} else if (local19 == '”') {
				arg3[arg2 + local11] = -108;
			} else if (local19 == '•') {
				arg3[arg2 + local11] = -107;
			} else if (local19 == '–') {
				arg3[local11 + arg2] = -106;
			} else if (local19 == '—') {
				arg3[local11 + arg2] = -105;
			} else if (local19 == '˜') {
				arg3[arg2 + local11] = -104;
			} else if (local19 == '™') {
				arg3[local11 + arg2] = -103;
			} else if (local19 == 'š') {
				arg3[local11 + arg2] = -102;
			} else if (local19 == '›') {
				arg3[local11 + arg2] = -101;
			} else if (local19 == 'œ') {
				arg3[arg2 + local11] = -100;
			} else if (local19 == 'ž') {
				arg3[arg2 + local11] = -98;
			} else if (local19 == 'Ÿ') {
				arg3[local11 + arg2] = -97;
			} else {
				arg3[arg2 + local11] = 63;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIII)V")
	public static void method5017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static541.method7520(4, arg3);
		local8.method4946();
		local8.anInt5822 = arg2;
		local8.anInt5827 = arg1;
		local8.anInt5821 = arg0;
	}
}
