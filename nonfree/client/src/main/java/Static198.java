import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "[[Lclient!jd;")
	public static Class167[][] aClass167ArrayArray1;

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "Lclient!me;")
	public static final Class211 aClass211_25 = new Class211(3000000, 200);

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_46 = new Class230(49, 3);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
	public static void method3346() {
		Static78.aClass37Array2 = null;
		Static326.aClass37Array6 = null;
		Static284.aClass37_32 = null;
		Static598.aClass111_14 = null;
		Static541.aClass37Array12 = null;
		Static118.aClass37Array10 = null;
		Static554.aClass37Array13 = null;
		Static582.aClass37Array16 = null;
		Static394.aClass37Array8 = null;
		Static61.aClass37Array1 = null;
		Static460.aClass37Array9 = null;
		Static280.aClass37_41 = null;
		Static162.aClass111_6 = null;
		Static569.aClass37Array15 = null;
		Static137.aClass111_5 = null;
		Static78.aClass37Array3 = null;
		Static594.aClass37Array17 = null;
		Static561.aClass37Array14 = null;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(JIIZI)Ljava/lang/String;")
	public static String method3347(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(5) char local5 = ',';
		@Pc(7) char local7 = '.';
		if (arg3 == 0) {
			local7 = ',';
			local5 = '.';
		}
		if (arg3 == 2) {
			local7 = ' ';
		}
		@Pc(30) boolean local30 = false;
		if (arg0 < 0L) {
			local30 = true;
			arg0 = -arg0;
		}
		@Pc(46) StringBuffer local46 = new StringBuffer(26);
		@Pc(53) int local53;
		@Pc(57) int local57;
		if (arg1 > 0) {
			for (local53 = 0; local53 < arg1; local53++) {
				local57 = (int) arg0;
				arg0 /= 10L;
				local46.append((char) (local57 + 48 - (int) arg0 * 10));
			}
			local46.append(local5);
		}
		local53 = 0;
		while (true) {
			local57 = (int) arg0;
			arg0 /= 10L;
			local46.append((char) (local57 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local30) {
					local46.append('-');
				}
				return local46.reverse().toString();
			}
			if (arg2) {
				local53++;
				if (local53 % 3 == 0) {
					local46.append(local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IBIZ)I")
	public static int method3350(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class3_Sub29 local8 = Static535.method7881(arg2, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && local8.anIntArray329.length > arg1) {
			return local8.anIntArray329[arg1];
		} else {
			return 0;
		}
	}
}
