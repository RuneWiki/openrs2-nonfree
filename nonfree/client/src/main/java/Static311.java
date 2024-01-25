import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!pq", name = "P", descriptor = "[Lclient!l;")
	public static Class143[] aClass143Array9;

	@OriginalMember(owner = "client!pq", name = "G", descriptor = "Lclient!vf;")
	public static Class258 aClass258_1 = new Class258(8);

	@OriginalMember(owner = "client!pq", name = "Q", descriptor = "[I")
	public static final int[] anIntArray464 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "([BIBIILjava/lang/String;)I")
	public static int method4438(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(8) int local8 = arg2;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(21) char local21 = arg3.charAt(local10);
			if (local21 > '\u0000' && local21 < '\u0080' || !(local21 < ' ' || local21 > 'ÿ')) {
				arg0[local10 + arg1] = (byte) local21;
			} else if (local21 == '€') {
				arg0[local10 + arg1] = -128;
			} else if (local21 == '‚') {
				arg0[arg1 + local10] = -126;
			} else if (local21 == 'ƒ') {
				arg0[arg1 + local10] = -125;
			} else if (local21 == '„') {
				arg0[arg1 + local10] = -124;
			} else if (local21 == '…') {
				arg0[local10 + arg1] = -123;
			} else if (local21 == '†') {
				arg0[local10 + arg1] = -122;
			} else if (local21 == '‡') {
				arg0[arg1 + local10] = -121;
			} else if (local21 == 'ˆ') {
				arg0[arg1 + local10] = -120;
			} else if (local21 == '‰') {
				arg0[local10 + arg1] = -119;
			} else if (local21 == 'Š') {
				arg0[arg1 + local10] = -118;
			} else if (local21 == '‹') {
				arg0[arg1 + local10] = -117;
			} else if (local21 == 'Œ') {
				arg0[local10 + arg1] = -116;
			} else if (local21 == 'Ž') {
				arg0[arg1 + local10] = -114;
			} else if (local21 == '‘') {
				arg0[arg1 + local10] = -111;
			} else if (local21 == '’') {
				arg0[arg1 + local10] = -110;
			} else if (local21 == '“') {
				arg0[local10 + arg1] = -109;
			} else if (local21 == '”') {
				arg0[local10 + arg1] = -108;
			} else if (local21 == '•') {
				arg0[arg1 + local10] = -107;
			} else if (local21 == '–') {
				arg0[local10 + arg1] = -106;
			} else if (local21 == '—') {
				arg0[local10 + arg1] = -105;
			} else if (local21 == '˜') {
				arg0[local10 + arg1] = -104;
			} else if (local21 == '™') {
				arg0[local10 + arg1] = -103;
			} else if (local21 == 'š') {
				arg0[local10 + arg1] = -102;
			} else if (local21 == '›') {
				arg0[local10 + arg1] = -101;
			} else if (local21 == 'œ') {
				arg0[local10 + arg1] = -100;
			} else if (local21 == 'ž') {
				arg0[local10 + arg1] = -98;
			} else if (local21 == 'Ÿ') {
				arg0[arg1 + local10] = -97;
			} else {
				arg0[local10 + arg1] = 63;
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!gq;IB)V")
	public static void method4439(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
		if (Static30.aBoolean29) {
			Static30.aBoolean29 = false;
			arg1 = 0;
		}
		if (Static385.aClass93_2 != null && Static385.aClass93_2.method2326(arg0)) {
			return;
		}
		Static385.aClass93_2 = arg0;
		Static355.aLong181 = Static279.method4058();
		Static136.anInt2710 = arg1;
		Static383.anInt6211 = arg1;
		if (Static383.anInt6211 == 0) {
			Static148.method2440();
			return;
		}
		Static15.anInt439 = Static368.anInt6047;
		Static187.aFloat34 = Static149.aFloat94;
		Static442.aClass16_7 = Static459.aClass16_6;
		Static243.aFloat65 = Static328.aFloat90;
		Static411.anInt6631 = Static432.anInt7011;
		Static379.aFloat63 = Static98.aFloat14;
		Static379.aFloat64 = Static233.aFloat11;
		Static140.aFloat23 = Static367.aFloat92;
		Static206.aFloat57 = Static420.aFloat98;
		Static80.anInt1794 = Static200.anInt3837;
	}
}
