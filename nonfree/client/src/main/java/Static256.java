import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!op", name = "p", descriptor = "Lclient!ef;")
	public static final Class68 aClass68_11 = new Class68(6, 4);

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIILclient!b;ZI)V")
	public static void method4148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class20 arg3) {
		Static83.anInt1721 = arg1;
		Static317.anInt4554 = 0;
		Static175.anInt3065 = 1;
		Static48.aClass20_16 = arg3;
		Static113.anInt2187 = arg2;
		Static249.aBoolean503 = false;
		Static120.anInt2268 = Static69.aClass3_Sub8_Sub4_1.method2159() / arg0;
		if (Static120.anInt2268 < 1) {
			Static120.anInt2268 = 1;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method4150(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(23) char local23 = arg0.charAt(local12);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(49) StringBuffer local49 = new StringBuffer(local10 + local8);
		for (@Pc(51) int local51 = 0; local51 < local8; local51++) {
			@Pc(57) char local57 = arg0.charAt(local51);
			if (local57 == '<') {
				local49.append("<lt>");
			} else if (local57 == '>') {
				local49.append("<gt>");
			} else {
				local49.append(local57);
			}
		}
		return local49.toString();
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIB)I")
	public static int method4151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}
}
