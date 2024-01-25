import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "Lclient!vq;")
	public static final Class211 aClass211_5 = new Class211();

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
	public static int anInt1130 = 255;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
	public static int anInt1131 = -1;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)Lclient!qf;")
	public static Class166 method999(@OriginalArg(0) int arg0) {
		@Pc(5) Class70 local5 = Static126.aClass70_40;
		@Pc(22) Class166 local22;
		synchronized (Static126.aClass70_40) {
			local22 = (Class166) Static126.aClass70_40.method1396((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(42) byte[] local42 = Static327.aClass53_90.method1033(Static239.method5790(arg0), Static15.method271(arg0));
		local22 = new Class166();
		local22.anInt4748 = arg0;
		if (local42 != null) {
			local22.method4370(new Class6_Sub10(local42));
		}
		@Pc(60) Class70 local60 = Static126.aClass70_40;
		synchronized (Static126.aClass70_40) {
			Static126.aClass70_40.method1406(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)I")
	public static int method1001(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(39) int local39 = local25 | local25 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return arg0 & ~local45;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)Lclient!js;")
	public static Class44_Sub5 method1002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class187 local7 = Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass44_Sub5_2;
	}
}
