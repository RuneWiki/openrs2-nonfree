import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Z")
	public static boolean aBoolean55;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	public static int anInt700;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([BI)Z")
	public static boolean method556(@OriginalArg(0) byte[] arg0) {
		@Pc(17) Class3_Sub28 local17 = new Class3_Sub28(arg0);
		@Pc(21) int local21 = local17.method5322(-85);
		if (local21 != 2) {
			return false;
		}
		@Pc(39) boolean local39 = local17.method5322(-115) == 1;
		if (local39) {
			Static64.method802(local17);
		}
		Static115.method2034(local17);
		return true;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V")
	public static void method557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) Class3_Sub4_Sub2 local18 = Static502.method7211(7, (long) arg0);
		local18.method630();
		local18.anInt803 = arg1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BII)V")
	public static void method558(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class28 local9 = Static678.aClass28ArrayArray5[arg1][arg0];
		if (local9 != null) {
			Static474.anInt8305 = local9.anInt817;
			Static499.anInt8584 = local9.anInt815;
			Static501.anInt8589 = local9.anInt811;
		}
		Static138.method2264();
	}
}
