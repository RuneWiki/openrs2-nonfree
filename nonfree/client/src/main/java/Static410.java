import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!up", name = "c", descriptor = "Lclient!jd;")
	public static final Class119 aClass119_20 = new Class119(4, 1, 1, 1);

	@OriginalMember(owner = "client!up", name = "t", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_229 = new Class175("K", "T", "K", "K");

	@OriginalMember(owner = "client!up", name = "v", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!up", name = "w", descriptor = "Lclient!dg;")
	public static final Class49 aClass49_1 = new Class49(14, 1);

	@OriginalMember(owner = "client!up", name = "x", descriptor = "I")
	public static int anInt7098 = -1;

	@OriginalMember(owner = "client!up", name = "A", descriptor = "Lclient!dg;")
	public static final Class49 aClass49_2 = new Class49(15, 4);

	@OriginalMember(owner = "client!up", name = "B", descriptor = "Lclient!dg;")
	public static final Class49 aClass49_3 = new Class49(16, -2);

	@OriginalMember(owner = "client!up", name = "C", descriptor = "Lclient!dg;")
	public static final Class49 aClass49_4 = new Class49(17, 0);

	@OriginalMember(owner = "client!up", name = "D", descriptor = "Lclient!dg;")
	public static final Class49 aClass49_5 = new Class49(18, -2);

	@OriginalMember(owner = "client!up", name = "E", descriptor = "Lclient!dg;")
	public static final Class49 aClass49_6 = new Class49(20, 6);

	@OriginalMember(owner = "client!up", name = "F", descriptor = "Lclient!dg;")
	public static final Class49 aClass49_7 = new Class49(21, 8);

	@OriginalMember(owner = "client!up", name = "G", descriptor = "Lclient!dg;")
	public static final Class49 aClass49_8 = new Class49(22, -2);

	@OriginalMember(owner = "client!up", name = "H", descriptor = "Lclient!dg;")
	public static final Class49 aClass49_9 = new Class49(23, 4);

	@OriginalMember(owner = "client!up", name = "I", descriptor = "Lclient!dg;")
	public static final Class49 aClass49_10 = new Class49(24, -1);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IB)V")
	public static void method5505(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static198.aBooleanArray13[arg0]) {
			Static175.aClass56_59.method1362(arg0);
			Static300.aClass68ArrayArray3[arg0] = null;
			Static4.aClass68ArrayArray2[arg0] = null;
			Static198.aBooleanArray13[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(JIIZI)Ljava/lang/String;")
	public static String method5506(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(5) char local5 = ',';
		@Pc(7) char local7 = '.';
		if (arg3 == 0) {
			local7 = ',';
			local5 = '.';
		}
		if (arg3 == 2) {
			local7 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg0 < 0L) {
			local25 = true;
			arg0 = -arg0;
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(26);
		@Pc(48) int local48;
		@Pc(52) int local52;
		if (arg1 > 0) {
			for (local48 = 0; local48 < arg1; local48++) {
				local52 = (int) arg0;
				arg0 /= 10L;
				local41.append((char) (local52 + 48 - (int) arg0 * 10));
			}
			local41.append(local5);
		}
		local48 = 0;
		while (true) {
			local52 = (int) arg0;
			arg0 /= 10L;
			local41.append((char) (local52 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local25) {
					local41.append('-');
				}
				return local41.reverse().toString();
			}
			if (arg2) {
				local48++;
				if (local48 % 3 == 0) {
					local41.append(local7);
				}
			}
		}
	}
}
