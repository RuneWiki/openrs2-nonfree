import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "I")
	public static int anInt1511;

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_53 = new Class107(82, 10);

	@OriginalMember(owner = "client!cv", name = "i", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_11 = new Class179(34, 8);

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
	public static void method1320() {
		Static222.method3402();
		Static435.method5771();
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
	public static void method1322() {
		Static410.aClass143Array13 = null;
		Static333.aClass143Array10 = null;
		Static312.aClass71_7 = null;
		Static150.aClass143Array5 = null;
		Static384.aClass143Array12 = null;
		Static118.aClass143Array2 = null;
		Static17.aClass143Array1 = null;
		Static58.aClass143_10 = null;
		Static148.aClass143Array4 = null;
		Static347.aClass143Array11 = null;
		Static446.aClass143Array14 = null;
		Static218.aClass143Array7 = null;
		Static311.aClass143Array9 = null;
		Static57.aClass143_9 = null;
		Static26.aClass71_1 = null;
		Static178.aClass71_5 = null;
		Static251.aClass143Array8 = null;
		Static141.aClass143Array3 = null;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZIJII)Ljava/lang/String;")
	public static String method1323(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(4) int arg3) {
		@Pc(15) char local15 = ',';
		@Pc(17) char local17 = '.';
		if (arg1 == 0) {
			local17 = ',';
			local15 = '.';
		}
		if (arg1 == 2) {
			local17 = ' ';
		}
		@Pc(32) boolean local32 = false;
		if (arg2 < 0L) {
			arg2 = -arg2;
			local32 = true;
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(26);
		@Pc(52) int local52;
		@Pc(56) int local56;
		if (arg3 > 0) {
			for (local52 = 0; local52 < arg3; local52++) {
				local56 = (int) arg2;
				arg2 /= 10L;
				local48.append((char) (local56 + 48 - (int) arg2 * 10));
			}
			local48.append(local15);
		}
		local52 = 0;
		while (true) {
			local56 = (int) arg2;
			arg2 /= 10L;
			local48.append((char) (local56 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local32) {
					local48.append('-');
				}
				return local48.reverse().toString();
			}
			if (arg0) {
				local52++;
				if (local52 % 3 == 0) {
					local48.append(local17);
				}
			}
		}
	}
}
