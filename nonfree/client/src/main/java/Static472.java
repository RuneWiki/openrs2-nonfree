import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
	public static int anInt8704;

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray51 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "Lclient!mq;")
	public static final Class223 aClass223_60 = new Class223(128, 4);

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!pn;I)Z")
	public static boolean method7092(@OriginalArg(0) Interface19 arg0) {
		@Pc(10) Class101 local10 = Static204.aClass139_8.method3309(arg0.method7827());
		if (local10.anInt2955 == -1) {
			return true;
		} else {
			@Pc(23) Class293 local23 = Static447.aClass237_3.method5794(local10.anInt2955);
			return local23.anInt8556 == -1 ? true : local23.method6992();
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method7093(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(39) StringBuffer local39 = new StringBuffer(local8 + local10);
		for (@Pc(46) int local46 = 0; local46 < local8; local46++) {
			@Pc(52) char local52 = arg0.charAt(local46);
			if (local52 == '<') {
				local39.append("<lt>");
			} else if (local52 == '>') {
				local39.append("<gt>");
			} else {
				local39.append(local52);
			}
		}
		return local39.toString();
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZBLclient!r;I)Lclient!la;")
	public static Class58 method7095(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class32 local9 = Static271.method4718(arg1, arg2, arg0);
		return local9 == null ? null : local9.aClass58_2;
	}
}
