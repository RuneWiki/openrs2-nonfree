import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "Lclient!ph;")
	public static Class187 aClass187_117;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "Lclient!cw;")
	public static Class48 aClass48_1;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "[I")
	public static final int[] anIntArray650 = new int[3];

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
	public static int anInt6667 = 0;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method5229(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(26) char local26 = arg0.charAt(local20);
			if (local26 > '\u0000' && local26 < '\u0080' || !(local26 < ' ' || local26 > 'ÿ')) {
				local11[local20] = (byte) local26;
			} else if (local26 == '€') {
				local11[local20] = -128;
			} else if (local26 == '‚') {
				local11[local20] = -126;
			} else if (local26 == 'ƒ') {
				local11[local20] = -125;
			} else if (local26 == '„') {
				local11[local20] = -124;
			} else if (local26 == '…') {
				local11[local20] = -123;
			} else if (local26 == '†') {
				local11[local20] = -122;
			} else if (local26 == '‡') {
				local11[local20] = -121;
			} else if (local26 == 'ˆ') {
				local11[local20] = -120;
			} else if (local26 == '‰') {
				local11[local20] = -119;
			} else if (local26 == 'Š') {
				local11[local20] = -118;
			} else if (local26 == '‹') {
				local11[local20] = -117;
			} else if (local26 == 'Œ') {
				local11[local20] = -116;
			} else if (local26 == 'Ž') {
				local11[local20] = -114;
			} else if (local26 == '‘') {
				local11[local20] = -111;
			} else if (local26 == '’') {
				local11[local20] = -110;
			} else if (local26 == '“') {
				local11[local20] = -109;
			} else if (local26 == '”') {
				local11[local20] = -108;
			} else if (local26 == '•') {
				local11[local20] = -107;
			} else if (local26 == '–') {
				local11[local20] = -106;
			} else if (local26 == '—') {
				local11[local20] = -105;
			} else if (local26 == '˜') {
				local11[local20] = -104;
			} else if (local26 == '™') {
				local11[local20] = -103;
			} else if (local26 == 'š') {
				local11[local20] = -102;
			} else if (local26 == '›') {
				local11[local20] = -101;
			} else if (local26 == 'œ') {
				local11[local20] = -100;
			} else if (local26 == 'ž') {
				local11[local20] = -98;
			} else if (local26 == 'Ÿ') {
				local11[local20] = -97;
			} else {
				local11[local20] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method5234(@OriginalArg(1) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static225.aStringArray56.length; local12++) {
			if (Static225.aStringArray56[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
