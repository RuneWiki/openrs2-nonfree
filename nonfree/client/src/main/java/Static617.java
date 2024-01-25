import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static617 {

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
	public static int anInt10032;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "Z")
	public static boolean aBoolean818;

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
	public static int anInt10033;

	@OriginalMember(owner = "client!vt", name = "t", descriptor = "I")
	public static int anInt10038;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "[I")
	public static final int[] anIntArray807 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_192 = new Class136(104, -2);

	@OriginalMember(owner = "client!vt", name = "s", descriptor = "Lclient!ht;")
	public static final Class148 aClass148_36 = new Class148(8, -1);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BIJIZ)Ljava/lang/String;")
	public static String method8523(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(22) boolean local22 = false;
		if (arg1 < 0L) {
			arg1 = -arg1;
			local22 = true;
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(26);
		@Pc(45) int local45;
		@Pc(50) int local50;
		if (arg0 > 0) {
			for (local45 = 0; local45 < arg0; local45++) {
				local50 = (int) arg1;
				arg1 /= 10L;
				local38.append((char) (local50 + 48 - (int) arg1 * 10));
			}
			local38.append(local7);
		}
		local45 = 0;
		while (true) {
			local50 = (int) arg1;
			arg1 /= 10L;
			local38.append((char) (local50 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local22) {
					local38.append('-');
				}
				return local38.reverse().toString();
			}
			if (arg3) {
				local45++;
				if (local45 % 3 == 0) {
					local38.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V")
	public static void method8524(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class5 local5 = Static545.aClass81_62.method1608(); local5 != null; local5 = Static545.aClass81_62.method1610()) {
			if ((long) arg0 == (local5.aLong282 >> 48 & 0xFFFFL)) {
				local5.method8911();
			}
		}
	}
}
