import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
	public static int anInt10690 = 0;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ga;ILclient!hg;I)V")
	public static void method8918(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class130 arg2) {
		if (Static395.anInt7569 >= 50 || (arg2 == null || arg2.anIntArrayArray21 == null || arg1 >= arg2.anIntArrayArray21.length || arg2.anIntArrayArray21[arg1] == null)) {
			return;
		}
		@Pc(34) int local34 = arg2.anIntArrayArray21[arg1][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(68) int local68;
		if (arg2.anIntArrayArray21[arg1].length > 1) {
			local68 = (int) ((double) arg2.anIntArrayArray21[arg1].length * Math.random());
			if (local68 > 0) {
				local38 = arg2.anIntArrayArray21[arg1][local68];
			}
		}
		@Pc(81) int local81 = local34 & 0x1F;
		local68 = 256;
		if (arg2.anIntArray236 != null && arg2.anIntArray241 != null) {
			local68 = (int) (Math.random() * (double) (arg2.anIntArray241[arg1] - arg2.anIntArray236[arg1])) + arg2.anIntArray236[arg1];
		}
		@Pc(119) int local119 = arg2.anIntArray238 == null ? 255 : arg2.anIntArray238[arg1];
		if (local81 == 0) {
			if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 == arg0) {
				if (!arg2.aBoolean350) {
					Static269.method4946(local119, local38, local44, 0, local68);
					return;
				}
				Static61.method7220(local44, local68, false, local119, 0, local38);
			}
		} else if (Static74.aClass2_Sub13_5.aClass14_Sub6_2.method3223() != 0) {
			@Pc(160) int local160 = arg0.anInt10303 - 256 >> 9;
			@Pc(167) int local167 = arg0.anInt10310 - 256 >> 9;
			@Pc(187) int local187 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 == arg0 ? 0 : (arg0.aByte132 << 24) + (local160 << 16) + (local167 << 8) + local81;
			Static443.aClass125Array1[Static395.anInt7569++] = new Class125((byte) (arg2.aBoolean350 ? 2 : 1), local38, local44, 0, local119, local187, local68, arg0);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method8919(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local19) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(JIIIILclient!at;IILclient!aa;)V")
	public static void method8921(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class24 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1 arg7) {
		@Pc(11) int local11 = arg2 * arg2 + arg5 * arg5;
		if ((long) local11 > arg0) {
			return;
		}
		@Pc(39) int local39 = Math.min(arg4.anInt441 / 2, arg4.anInt488 / 2);
		if (local11 <= local39 * local39) {
			Static402.method6561(arg1, Static487.aClass46Array17[arg6], arg3, arg4, arg7, arg2, arg5);
			return;
		}
		local39 -= 10;
		@Pc(53) int local53;
		if (Static496.anInt9165 == 4) {
			local53 = (int) Static72.aFloat68 & 0x3FFF;
		} else {
			local53 = (int) Static72.aFloat68 + Static563.anInt10146 & 0x3FFF;
		}
		@Pc(66) int local66 = Class177.anIntArray361[local53];
		@Pc(70) int local70 = Class177.anIntArray360[local53];
		if (Static496.anInt9165 != 4) {
			local70 = local70 * 256 / (Static183.anInt4411 + 256);
			local66 = local66 * 256 / (Static183.anInt4411 + 256);
		}
		@Pc(101) int local101 = local70 * arg5 + local66 * arg2 >> 14;
		@Pc(112) int local112 = local70 * arg2 - local66 * arg5 >> 14;
		@Pc(118) double local118 = Math.atan2((double) local101, (double) local112);
		@Pc(125) int local125 = (int) ((double) local39 * Math.sin(local118));
		@Pc(132) int local132 = (int) (Math.cos(local118) * (double) local39);
		Static479.aClass46Array15[arg6].method6220((float) arg4.anInt441 / 2.0F + (float) arg3 + (float) local125, (float) arg1 + (float) arg4.anInt488 / 2.0F - (float) local132, 4096, (int) (-local118 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(CI)C")
	public static char method8924(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}
}
