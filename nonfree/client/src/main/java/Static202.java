import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
	public static int anInt3721;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "Lclient!mq;")
	public static final Class154 aClass154_26 = new Class154(64);

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
	public static int anInt3722 = 100;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([BLjava/lang/String;IIIB)I")
	public static int method3375(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			@Pc(25) char local25 = arg1.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg0[arg3 + local17] = (byte) local25;
			} else if (local25 == '€') {
				arg0[local17 + arg3] = -128;
			} else if (local25 == '‚') {
				arg0[local17 + arg3] = -126;
			} else if (local25 == 'ƒ') {
				arg0[local17 + arg3] = -125;
			} else if (local25 == '„') {
				arg0[local17 + arg3] = -124;
			} else if (local25 == '…') {
				arg0[arg3 + local17] = -123;
			} else if (local25 == '†') {
				arg0[arg3 + local17] = -122;
			} else if (local25 == '‡') {
				arg0[arg3 + local17] = -121;
			} else if (local25 == 'ˆ') {
				arg0[local17 + arg3] = -120;
			} else if (local25 == '‰') {
				arg0[arg3 + local17] = -119;
			} else if (local25 == 'Š') {
				arg0[arg3 + local17] = -118;
			} else if (local25 == '‹') {
				arg0[arg3 + local17] = -117;
			} else if (local25 == 'Œ') {
				arg0[local17 + arg3] = -116;
			} else if (local25 == 'Ž') {
				arg0[local17 + arg3] = -114;
			} else if (local25 == '‘') {
				arg0[arg3 + local17] = -111;
			} else if (local25 == '’') {
				arg0[local17 + arg3] = -110;
			} else if (local25 == '“') {
				arg0[local17 + arg3] = -109;
			} else if (local25 == '”') {
				arg0[arg3 + local17] = -108;
			} else if (local25 == '•') {
				arg0[local17 + arg3] = -107;
			} else if (local25 == '–') {
				arg0[arg3 + local17] = -106;
			} else if (local25 == '—') {
				arg0[arg3 + local17] = -105;
			} else if (local25 == '˜') {
				arg0[arg3 + local17] = -104;
			} else if (local25 == '™') {
				arg0[arg3 + local17] = -103;
			} else if (local25 == 'š') {
				arg0[local17 + arg3] = -102;
			} else if (local25 == '›') {
				arg0[local17 + arg3] = -101;
			} else if (local25 == 'œ') {
				arg0[local17 + arg3] = -100;
			} else if (local25 == 'ž') {
				arg0[arg3 + local17] = -98;
			} else if (local25 == 'Ÿ') {
				arg0[local17 + arg3] = -97;
			} else {
				arg0[local17 + arg3] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZI)V")
	public static void method3376(@OriginalArg(1) int arg0) {
		if (!Static138.method2407(arg0)) {
			return;
		}
		@Pc(14) Class155[] local14 = Static228.aClass155ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			@Pc(27) Class155 local27 = local14[local21];
			if (local27 != null) {
				local27.anInt4203 = 0;
				local27.anInt4192 = 1;
				local27.anInt4133 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!ms;IZII)V")
	public static void method3377(@OriginalArg(0) Class155 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) int local13 = arg0.anInt4170;
		@Pc(16) int local16 = arg0.anInt4214;
		if (arg0.aByte42 == 0) {
			arg0.anInt4170 = arg0.anInt4181;
		} else if (arg0.aByte42 == 1) {
			arg0.anInt4170 = arg3 - arg0.anInt4181;
		} else if (arg0.aByte42 == 2) {
			arg0.anInt4170 = arg3 * arg0.anInt4181 >> 14;
		}
		if (arg0.aByte40 == 0) {
			arg0.anInt4214 = arg0.anInt4210;
		} else if (arg0.aByte40 == 1) {
			arg0.anInt4214 = arg2 - arg0.anInt4210;
		} else if (arg0.aByte40 == 2) {
			arg0.anInt4214 = arg0.anInt4210 * arg2 >> 14;
		}
		if (arg0.aByte42 == 4) {
			arg0.anInt4170 = arg0.anInt4147 * arg0.anInt4214 / arg0.anInt4161;
		}
		if (arg0.aByte40 == 4) {
			arg0.anInt4214 = arg0.anInt4161 * arg0.anInt4170 / arg0.anInt4147;
		}
		if (Static218.aBoolean304 && (Static41.method878(arg0).anInt5883 != 0 || arg0.anInt4164 == 0)) {
			if (arg0.anInt4214 < 5 && arg0.anInt4170 < 5) {
				arg0.anInt4214 = 5;
				arg0.anInt4170 = 5;
			} else {
				if (arg0.anInt4214 <= 0) {
					arg0.anInt4214 = 5;
				}
				if (arg0.anInt4170 <= 0) {
					arg0.anInt4170 = 5;
				}
			}
		}
		if (arg0.anInt4155 == Static369.anInt6456) {
			Static291.aClass155_28 = arg0;
		}
		if (arg1 && arg0.anObjectArray14 != null && (local13 != arg0.anInt4170 || local16 != arg0.anInt4214)) {
			@Pc(191) Class2_Sub24 local191 = new Class2_Sub24();
			local191.aClass155_23 = arg0;
			local191.anObjectArray5 = arg0.anObjectArray14;
			Static351.aClass210_15.method5044(local191);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIB)V")
	public static void method3379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = arg0 + 1;
		Static264.method4096(Static267.anIntArrayArray38[arg0], arg4, arg3, arg1);
		@Pc(19) int local19 = arg2 - 1;
		Static264.method4096(Static267.anIntArrayArray38[arg2], arg4, arg3, arg1);
		for (@Pc(34) int local34 = local8; local34 <= local19; local34++) {
			@Pc(40) int[] local40 = Static267.anIntArrayArray38[local34];
			local40[arg1] = local40[arg3] = arg4;
		}
	}
}
