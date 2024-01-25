import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
	public static int anInt1127;

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "Lclient!gw;")
	public static Class93 aClass93_2;

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "[I")
	public static int[] anIntArray56;

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "[S")
	public static final short[] aShortArray14 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
	public static int anInt1131 = 0;

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "Lclient!of;")
	public static final Class174 aClass174_37 = new Class174("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!ga;IB)I")
	public static int method1110(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1) {
		if (!Static54.method1060(arg0).method5457(arg1) && arg0.anObjectArray9 == null) {
			return -1;
		} else if (arg0.anIntArray112 == null || arg1 >= arg0.anIntArray112.length) {
			return -1;
		} else {
			return arg0.anIntArray112[arg1];
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method1111(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(16) byte[] local16 = new byte[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local16[local18] = (byte) local24;
			} else if (local24 == '€') {
				local16[local18] = -128;
			} else if (local24 == '‚') {
				local16[local18] = -126;
			} else if (local24 == 'ƒ') {
				local16[local18] = -125;
			} else if (local24 == '„') {
				local16[local18] = -124;
			} else if (local24 == '…') {
				local16[local18] = -123;
			} else if (local24 == '†') {
				local16[local18] = -122;
			} else if (local24 == '‡') {
				local16[local18] = -121;
			} else if (local24 == 'ˆ') {
				local16[local18] = -120;
			} else if (local24 == '‰') {
				local16[local18] = -119;
			} else if (local24 == 'Š') {
				local16[local18] = -118;
			} else if (local24 == '‹') {
				local16[local18] = -117;
			} else if (local24 == 'Œ') {
				local16[local18] = -116;
			} else if (local24 == 'Ž') {
				local16[local18] = -114;
			} else if (local24 == '‘') {
				local16[local18] = -111;
			} else if (local24 == '’') {
				local16[local18] = -110;
			} else if (local24 == '“') {
				local16[local18] = -109;
			} else if (local24 == '”') {
				local16[local18] = -108;
			} else if (local24 == '•') {
				local16[local18] = -107;
			} else if (local24 == '–') {
				local16[local18] = -106;
			} else if (local24 == '—') {
				local16[local18] = -105;
			} else if (local24 == '˜') {
				local16[local18] = -104;
			} else if (local24 == '™') {
				local16[local18] = -103;
			} else if (local24 == 'š') {
				local16[local18] = -102;
			} else if (local24 == '›') {
				local16[local18] = -101;
			} else if (local24 == 'œ') {
				local16[local18] = -100;
			} else if (local24 == 'ž') {
				local16[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local16[local18] = -97;
			} else {
				local16[local18] = 63;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method1113(@OriginalArg(0) int arg0) {
		@Pc(27) byte[] local27;
		if (arg0 == 100 && Static410.anInt6945 > 0) {
			local27 = Static260.aByteArrayArray27[--Static410.anInt6945];
			Static260.aByteArrayArray27[Static410.anInt6945] = null;
			return local27;
		} else if (arg0 == 5000 && Static289.anInt4612 > 0) {
			local27 = Static72.aByteArrayArray5[--Static289.anInt4612];
			Static72.aByteArrayArray5[Static289.anInt4612] = null;
			return local27;
		} else if (arg0 == 30000 && Static326.anInt5455 > 0) {
			local27 = Static52.aByteArrayArray4[--Static326.anInt5455];
			Static52.aByteArrayArray4[Static326.anInt5455] = null;
			return local27;
		} else {
			return new byte[arg0];
		}
	}
}
