import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!vb", name = "X", descriptor = "[S")
	public static short[] aShortArray113;

	@OriginalMember(owner = "client!vb", name = "Z", descriptor = "[S")
	public static short[] aShortArray114;

	@OriginalMember(owner = "client!vb", name = "S", descriptor = "[I")
	public static int[] anIntArray625 = new int[5];

	@OriginalMember(owner = "client!vb", name = "V", descriptor = "Lclient!cc;")
	public static Class26 aClass26_56 = new Class26(64);

	@OriginalMember(owner = "client!vb", name = "ab", descriptor = "I")
	public static int anInt5474 = 1;

	@OriginalMember(owner = "client!vb", name = "bb", descriptor = "Z")
	public static boolean aBoolean371 = false;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIIII)V")
	public static void method4470(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class4_Sub3_Sub9 local6 = Static43.method2329(10, arg3);
		local6.method1520();
		local6.anInt2001 = arg0;
		local6.anInt1994 = arg1;
		local6.anInt1993 = arg2;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(JZIII)Ljava/lang/String;")
	public static String method4471(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) char local3 = ',';
		@Pc(5) char local5 = '.';
		@Pc(11) boolean local11 = false;
		if (arg3 == 0) {
			local5 = ',';
			local3 = '.';
		}
		if (arg3 == 2) {
			local5 = ' ';
		}
		if (arg0 < 0L) {
			local11 = true;
			arg0 = -arg0;
		}
		@Pc(53) StringBuffer local53 = new StringBuffer(26);
		@Pc(58) int local58;
		@Pc(68) int local68;
		if (arg2 > 0) {
			for (local58 = 0; local58 < arg2; local58++) {
				local68 = (int) arg0;
				arg0 /= 10L;
				local53.append((char) (local68 + 48 - (int) arg0 * 10));
			}
			local53.append(local3);
		}
		local58 = 0;
		while (true) {
			local68 = (int) arg0;
			arg0 /= 10L;
			local53.append((char) (local68 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local11) {
					local53.append('-');
				}
				return local53.reverse().toString();
			}
			if (arg1) {
				local58++;
				if (local58 % 3 == 0) {
					local53.append(local5);
				}
			}
		}
	}
}
