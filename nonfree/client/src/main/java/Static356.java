import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!ot", name = "B", descriptor = "F")
	public static float aFloat52;

	@OriginalMember(owner = "client!ot", name = "E", descriptor = "Lclient!ts;")
	public static Class2_Sub13_Sub16 aClass2_Sub13_Sub16_4;

	@OriginalMember(owner = "client!ot", name = "D", descriptor = "I")
	public static int anInt2877 = 0;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "([BI)[B")
	public static byte[] method2690(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class2_Sub29 local15 = new Class2_Sub29(arg0);
		@Pc(19) int local19 = local15.method5170();
		@Pc(23) int local23 = local15.method5198();
		if (local23 < 0 || Static521.anInt9025 != 0 && local23 > Static521.anInt9025) {
			throw new RuntimeException();
		} else if (local19 == 0) {
			@Pc(93) byte[] local93 = new byte[local23];
			local15.method5184(local23, local93);
			return local93;
		} else {
			@Pc(46) int local46 = local15.method5198();
			if (local46 < 0 || Static521.anInt9025 != 0 && local46 > Static521.anInt9025) {
				throw new RuntimeException();
			}
			@Pc(63) byte[] local63 = new byte[local46];
			if (local19 == 1) {
				Static470.method7068(local63, local46, arg0, local23);
			} else {
				@Pc(68) Class217 local68 = Static524.aClass217_1;
				synchronized (Static524.aClass217_1) {
					Static524.aClass217_1.method5548(local15, local63);
				}
			}
			return local63;
		}
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(ZI)Lclient!lb;")
	public static Class6_Sub5 method2696(@OriginalArg(1) int arg0) {
		@Pc(7) Class107[] local7 = Class2_Sub9.aClass107Array1;
		synchronized (Class2_Sub9.aClass107Array1) {
			@Pc(36) Class6_Sub5 local36;
			if (Class2_Sub9.aClass107Array1.length <= arg0 || Class2_Sub9.aClass107Array1[arg0].method2828()) {
				local36 = new Class6_Sub5();
				local36.aClass6_Sub4Array1 = new Class6_Sub4[arg0];
				for (@Pc(42) int local42 = 0; local42 < arg0; local42++) {
					local36.aClass6_Sub4Array1[local42] = new Class6_Sub4();
				}
			} else {
				local36 = (Class6_Sub5) Class2_Sub9.aClass107Array1[arg0].method2837();
				local36.method7058();
				@Pc(75) int local75 = Static487.anIntArray656[arg0]--;
			}
			return local36;
		}
	}
}
