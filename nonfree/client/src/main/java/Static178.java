import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method3317(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local11[local18] = (byte) local24;
			} else if (local24 == '€') {
				local11[local18] = -128;
			} else if (local24 == '‚') {
				local11[local18] = -126;
			} else if (local24 == 'ƒ') {
				local11[local18] = -125;
			} else if (local24 == '„') {
				local11[local18] = -124;
			} else if (local24 == '…') {
				local11[local18] = -123;
			} else if (local24 == '†') {
				local11[local18] = -122;
			} else if (local24 == '‡') {
				local11[local18] = -121;
			} else if (local24 == 'ˆ') {
				local11[local18] = -120;
			} else if (local24 == '‰') {
				local11[local18] = -119;
			} else if (local24 == 'Š') {
				local11[local18] = -118;
			} else if (local24 == '‹') {
				local11[local18] = -117;
			} else if (local24 == 'Œ') {
				local11[local18] = -116;
			} else if (local24 == 'Ž') {
				local11[local18] = -114;
			} else if (local24 == '‘') {
				local11[local18] = -111;
			} else if (local24 == '’') {
				local11[local18] = -110;
			} else if (local24 == '“') {
				local11[local18] = -109;
			} else if (local24 == '”') {
				local11[local18] = -108;
			} else if (local24 == '•') {
				local11[local18] = -107;
			} else if (local24 == '–') {
				local11[local18] = -106;
			} else if (local24 == '—') {
				local11[local18] = -105;
			} else if (local24 == '˜') {
				local11[local18] = -104;
			} else if (local24 == '™') {
				local11[local18] = -103;
			} else if (local24 == 'š') {
				local11[local18] = -102;
			} else if (local24 == '›') {
				local11[local18] = -101;
			} else if (local24 == 'œ') {
				local11[local18] = -100;
			} else if (local24 == 'ž') {
				local11[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local11[local18] = -97;
			} else {
				local11[local18] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!ri;)I")
	public static int method3319(@OriginalArg(1) Class44_Sub4_Sub4_Sub2 arg0) {
		@Pc(16) Class18 local16 = arg0.aClass18_1;
		if (local16.anIntArray37 != null) {
			local16 = local16.method369();
			if (local16 == null) {
				return -1;
			}
		}
		@Pc(30) int local30 = local16.anInt401;
		@Pc(34) Class128 local34 = arg0.method4716();
		if (arg0.aBoolean358) {
			local30 = local16.anInt419;
		} else if (local34.anInt3379 == arg0.anInt5116 || local34.anInt3393 == arg0.anInt5116 || arg0.anInt5116 == local34.anInt3410 || local34.anInt3395 == arg0.anInt5116) {
			local30 = local16.anInt412;
		} else if (arg0.anInt5116 == local34.anInt3400 || arg0.anInt5116 == local34.anInt3411 || arg0.anInt5116 == local34.anInt3383 || local34.anInt3374 == arg0.anInt5116) {
			local30 = local16.anInt379;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)I")
	public static int method3320() {
		if ((double) Static307.aFloat18 == 3.0D) {
			return 37;
		} else if ((double) Static307.aFloat18 == 4.0D) {
			return 50;
		} else if ((double) Static307.aFloat18 == 6.0D) {
			return 75;
		} else if ((double) Static307.aFloat18 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
