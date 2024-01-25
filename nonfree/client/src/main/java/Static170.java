import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
	public static int anInt2586;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "Lclient!lp;")
	public static Class214 aClass214_1;

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "Lclient!mea;")
	public static final Class222 aClass222_3 = new Class222("", 16);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
	public static void method2217() {
		if (Static26.anInt449 < 0) {
			Static187.anInt8961 = -1;
			Static317.anInt5332 = -1;
			Static26.anInt449 = 0;
		}
		if (Static476.anInt7576 < Static26.anInt449) {
			Static26.anInt449 = Static476.anInt7576;
			Static187.anInt8961 = -1;
			Static317.anInt5332 = -1;
		}
		if (Static366.anInt6166 < 0) {
			Static317.anInt5332 = -1;
			Static366.anInt6166 = 0;
			Static187.anInt8961 = -1;
		}
		if (Static476.anInt7586 < Static366.anInt6166) {
			Static187.anInt8961 = -1;
			Static317.anInt5332 = -1;
			Static366.anInt6166 = Static476.anInt7586;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(JBIIZ)Ljava/lang/String;")
	public static String method2219(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(27) boolean local27 = false;
		if (arg0 < 0L) {
			arg0 = -arg0;
			local27 = true;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(50) int local50;
		@Pc(55) int local55;
		if (arg1 > 0) {
			for (local50 = 0; local50 < arg1; local50++) {
				local55 = (int) arg0;
				arg0 /= 10L;
				local43.append((char) (local55 + 48 - (int) arg0 * 10));
			}
			local43.append(local7);
		}
		local50 = 0;
		while (true) {
			local55 = (int) arg0;
			arg0 /= 10L;
			local43.append((char) (local55 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local27) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg3) {
				local50++;
				if (local50 % 3 == 0) {
					local43.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
	public static void method2220() {
		@Pc(1) Class21 local1 = Static31.aClass21_9;
		synchronized (Static31.aClass21_9) {
			Static31.aClass21_9.method323(5);
		}
		local1 = Static547.aClass21_88;
		synchronized (Static547.aClass21_88) {
			Static547.aClass21_88.method323(5);
		}
	}
}
