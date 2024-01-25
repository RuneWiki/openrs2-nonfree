import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!saa", name = "k", descriptor = "I")
	public static int anInt6044;

	@OriginalMember(owner = "client!saa", name = "l", descriptor = "Lclient!ov;")
	public static Class261 aClass261_6;

	@OriginalMember(owner = "client!saa", name = "m", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream2;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(II[BIILjava/lang/String;)I")
	public static int method4894(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3) {
		@Pc(10) int local10 = arg0;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(20) char local20 = arg3.charAt(local12);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg1[local12 + arg2] = (byte) local20;
			} else if (local20 == '€') {
				arg1[local12 + arg2] = -128;
			} else if (local20 == '‚') {
				arg1[local12 + arg2] = -126;
			} else if (local20 == 'ƒ') {
				arg1[local12 + arg2] = -125;
			} else if (local20 == '„') {
				arg1[local12 + arg2] = -124;
			} else if (local20 == '…') {
				arg1[arg2 + local12] = -123;
			} else if (local20 == '†') {
				arg1[arg2 + local12] = -122;
			} else if (local20 == '‡') {
				arg1[local12 + arg2] = -121;
			} else if (local20 == 'ˆ') {
				arg1[arg2 + local12] = -120;
			} else if (local20 == '‰') {
				arg1[local12 + arg2] = -119;
			} else if (local20 == 'Š') {
				arg1[arg2 + local12] = -118;
			} else if (local20 == '‹') {
				arg1[arg2 + local12] = -117;
			} else if (local20 == 'Œ') {
				arg1[local12 + arg2] = -116;
			} else if (local20 == 'Ž') {
				arg1[local12 + arg2] = -114;
			} else if (local20 == '‘') {
				arg1[local12 + arg2] = -111;
			} else if (local20 == '’') {
				arg1[arg2 + local12] = -110;
			} else if (local20 == '“') {
				arg1[arg2 + local12] = -109;
			} else if (local20 == '”') {
				arg1[arg2 + local12] = -108;
			} else if (local20 == '•') {
				arg1[arg2 + local12] = -107;
			} else if (local20 == '–') {
				arg1[arg2 + local12] = -106;
			} else if (local20 == '—') {
				arg1[arg2 + local12] = -105;
			} else if (local20 == '˜') {
				arg1[arg2 + local12] = -104;
			} else if (local20 == '™') {
				arg1[arg2 + local12] = -103;
			} else if (local20 == 'š') {
				arg1[local12 + arg2] = -102;
			} else if (local20 == '›') {
				arg1[arg2 + local12] = -101;
			} else if (local20 == 'œ') {
				arg1[local12 + arg2] = -100;
			} else if (local20 == 'ž') {
				arg1[local12 + arg2] = -98;
			} else if (local20 == 'Ÿ') {
				arg1[local12 + arg2] = -97;
			} else {
				arg1[arg2 + local12] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lclient!ou;B)I")
	public static int method4896(@OriginalArg(0) Class260 arg0) {
		if (Static361.aClass260_3 == arg0) {
			return 9216;
		} else if (arg0 == Static104.aClass260_1) {
			return 34065;
		} else if (arg0 == Static228.aClass260_2) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
