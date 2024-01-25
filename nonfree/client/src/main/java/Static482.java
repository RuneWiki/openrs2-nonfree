import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
	public static int anInt7719;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
	public static int anInt7725;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
	public static int anInt7726;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "F")
	public static float aFloat127;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
	public static int anInt7720 = -2;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_24 = new Class118(41);

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "Z")
	public static boolean aBoolean673 = true;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "[I")
	public static final int[] anIntArray550 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_139 = new Class225(60, 4);

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "Z")
	public static final boolean aBoolean674 = false;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZJI)Ljava/lang/String;")
	public static String method6903(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(21) char local21 = '.';
		if (arg3 == 0) {
			local7 = '.';
			local21 = ',';
		}
		if (arg3 == 2) {
			local21 = ' ';
		}
		@Pc(39) boolean local39 = false;
		if (arg2 < 0L) {
			arg2 = -arg2;
			local39 = true;
		}
		@Pc(53) StringBuffer local53 = new StringBuffer(26);
		@Pc(57) int local57;
		@Pc(62) int local62;
		if (arg0 > 0) {
			for (local57 = 0; local57 < arg0; local57++) {
				local62 = (int) arg2;
				arg2 /= 10L;
				local53.append((char) (local62 + 48 - (int) arg2 * 10));
			}
			local53.append(local7);
		}
		local57 = 0;
		while (true) {
			local62 = (int) arg2;
			arg2 /= 10L;
			local53.append((char) (local62 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local39) {
					local53.append('-');
				}
				return local53.reverse().toString();
			}
			if (arg1) {
				local57++;
				if (local57 % 3 == 0) {
					local53.append(local21);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB)I")
	public static int method6904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
