import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bfa", name = "w", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!bfa", name = "y", descriptor = "I")
	public static int anInt904;

	@OriginalMember(owner = "client!bfa", name = "B", descriptor = "I")
	public static int anInt906;

	@OriginalMember(owner = "client!bfa", name = "l", descriptor = "Lclient!baa;")
	public static final Class28 aClass28_1 = new Class28(2, 4, 4, 0);

	@OriginalMember(owner = "client!bfa", name = "A", descriptor = "I")
	public static int anInt905 = 0;

	@OriginalMember(owner = "client!bfa", name = "C", descriptor = "J")
	public static long aLong31 = 0L;

	@OriginalMember(owner = "client!bfa", name = "D", descriptor = "I")
	public static int anInt907 = 0;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V")
	public static void method631() {
		@Pc(3) Class109[] local3 = Class326.aClass109Array1;
		synchronized (Class326.aClass109Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class326.aClass109Array1.length; local7++) {
				Class326.aClass109Array1[local7] = new Class109();
				Static244.anIntArray303[local7] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILclient!ni;IIIII)V")
	public static void method632(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		Static405.method5914(arg0, arg1.anInt8764, 0, arg3, arg1.aByte112, arg2, arg1.anInt8761);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIJZI)Ljava/lang/String;")
	public static String method634(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(12) char local12 = ',';
		@Pc(14) char local14 = '.';
		if (arg0 == 0) {
			local12 = '.';
			local14 = ',';
		}
		if (arg0 == 2) {
			local14 = ' ';
		}
		@Pc(32) boolean local32 = false;
		if (arg1 < 0L) {
			arg1 = -arg1;
			local32 = true;
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(26);
		@Pc(52) int local52;
		@Pc(57) int local57;
		if (arg3 > 0) {
			for (local52 = 0; local52 < arg3; local52++) {
				local57 = (int) arg1;
				arg1 /= 10L;
				local48.append((char) (local57 + 48 - (int) arg1 * 10));
			}
			local48.append(local12);
		}
		local52 = 0;
		while (true) {
			local57 = (int) arg1;
			arg1 /= 10L;
			local48.append((char) (local57 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local32) {
					local48.append('-');
				}
				return local48.reverse().toString();
			}
			if (arg2) {
				local52++;
				if (local52 % 3 == 0) {
					local48.append(local14);
				}
			}
		}
	}
}
