import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "[I")
	public static final int[] anIntArray214 = new int[4];

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "[I")
	public static final int[] anIntArray215 = new int[25];

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(III[B)[B")
	public static byte[] method2050(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static468.method4350(arg1, arg0, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(JZIII)Ljava/lang/String;")
	public static String method2051(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) char local12 = ',';
		@Pc(14) char local14 = '.';
		if (arg2 == 0) {
			local12 = '.';
			local14 = ',';
		}
		if (arg2 == 2) {
			local14 = ' ';
		}
		@Pc(32) boolean local32 = false;
		if (arg0 < 0L) {
			local32 = true;
			arg0 = -arg0;
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(26);
		@Pc(52) int local52;
		@Pc(57) int local57;
		if (arg3 > 0) {
			for (local52 = 0; local52 < arg3; local52++) {
				local57 = (int) arg0;
				arg0 /= 10L;
				local48.append((char) (local57 + 48 - (int) arg0 * 10));
			}
			local48.append(local12);
		}
		local52 = 0;
		while (true) {
			local57 = (int) arg0;
			arg0 /= 10L;
			local48.append((char) (local57 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local32) {
					local48.append('-');
				}
				return local48.reverse().toString();
			}
			if (arg1) {
				local52++;
				if (local52 % 3 == 0) {
					local48.append(local14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZII)I")
	public static int method2052(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class10_Sub44 local8 = Static40.method555(arg0, arg1);
		if (local8 == null) {
			return -1;
		} else if (arg2 >= 0 && arg2 < local8.anIntArray704.length) {
			return local8.anIntArray704[arg2];
		} else {
			return -1;
		}
	}
}
