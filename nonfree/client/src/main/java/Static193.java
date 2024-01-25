import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!hr", name = "U", descriptor = "Lclient!gp;")
	public static Class117 aClass117_104;

	@OriginalMember(owner = "client!hr", name = "V", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "client!hr", name = "R", descriptor = "Lclient!bg;")
	public static final Class28 aClass28_7 = new Class28();

	@OriginalMember(owner = "client!hr", name = "S", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_88 = new Class150(34, -2);

	@OriginalMember(owner = "client!hr", name = "T", descriptor = "I")
	public static int anInt3734 = -1;

	@OriginalMember(owner = "client!hr", name = "W", descriptor = "[Lclient!ak;")
	public static final Class14[] aClass14Array1 = new Class14[100];

	@OriginalMember(owner = "client!hr", name = "X", descriptor = "I")
	public static int anInt3735 = 64;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method3234(@OriginalArg(0) long arg0) {
		if ((long) 0 >= arg0 || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(28) int local28 = 0;
			@Pc(30) long local30 = arg0;
			while (local30 != 0L) {
				local30 /= 37L;
				local28++;
			}
			@Pc(48) StringBuffer local48 = new StringBuffer(local28);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local48.append(Static147.aCharArray4[(int) (local52 - arg0 * 37L)]);
			}
			return local48.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)V")
	public static void method3237(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static152.aClass37ArrayArrayArray1 = Static231.aClass37ArrayArrayArray2;
			Static248.aClass131Array4 = Static511.aClass131Array6;
		} else {
			Static152.aClass37ArrayArrayArray1 = Static408.aClass37ArrayArrayArray3;
			Static248.aClass131Array4 = Static493.aClass131Array5;
		}
		Static460.anInt7893 = Static152.aClass37ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "(I)V")
	public static void method3238() {
		if (!Static162.method2907()) {
			return;
		}
		if (aStringArray19 == null) {
			Static438.method6229();
		}
		Static180.anInt3497 = 0;
		Static255.aBoolean356 = true;
		try {
			Static35.aClipboard1 = Static263.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(20) Exception local20) {
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIBIIII[[[BIIILclient!qa;I)V")
	public static void method3240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class62 arg10, @OriginalArg(12) int arg11) {
		if (arg0 == 0 || arg7 == 0) {
			return;
		}
		if (arg0 == 9) {
			arg2 = arg2 + 1 & 0x3;
			arg0 = 1;
		}
		if (arg0 == 10) {
			arg2 = arg2 + 3 & 0x3;
			arg0 = 1;
		}
		if (arg0 == 11) {
			arg0 = 8;
			arg2 = arg2 + 3 & 0x3;
		}
		arg10.za(arg5, arg11, arg1, arg3, arg9, arg4, arg6[arg0 - 1][arg2], arg7, arg8);
	}
}
