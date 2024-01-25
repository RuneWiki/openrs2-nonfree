import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!qv;")
	public static Class214 aClass214_216;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
	public static int anInt7227;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_217 = new Class214(110, -2);

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
	public static int anInt7224 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public static void method5757() {
		@Pc(1) Class83 local1 = Static408.aClass83_58;
		synchronized (Static408.aClass83_58) {
			Static408.aClass83_58.method2346();
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public static void method5763() {
		for (@Pc(6) Class71_Sub8 local6 = (Class71_Sub8) Static353.aClass273_4.method6250(); local6 != null; local6 = (Class71_Sub8) Static353.aClass273_4.method6250()) {
			Static84.method6302(local6);
		}
		@Pc(29) int local29;
		@Pc(31) int local31;
		if (Static157.aClass185_Sub1_1.method4639(Static192.anInt3828)) {
			local29 = 0;
			local31 = 3;
		} else {
			local31 = Static238.anInt4697;
			local29 = Static238.anInt4697;
		}
		Static50.method1145();
		for (@Pc(44) int local44 = local29; local44 <= local31; local44++) {
			Static50.method1137();
			Static50.method1139(local44);
			Static50.method1130(local44);
		}
		Static50.method1141();
		Static50.method1147();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIII)Lclient!sw;")
	public static Class4_Sub39 method5766(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class4_Sub39 local7 = new Class4_Sub39();
		local7.anInt6722 = arg2;
		local7.anInt6721 = arg1;
		Static157.aClass96_22.method2805((long) arg3, local7);
		Static80.method1690(arg1);
		@Pc(31) Class240 local31 = Static92.method1820(arg3);
		if (local31 != null) {
			Static273.method4374(local31);
		}
		if (Static341.aClass240_13 != null) {
			Static273.method4374(Static341.aClass240_13);
			Static341.aClass240_13 = null;
		}
		Static13.method195();
		if (local31 != null) {
			Static354.method5123(local31, !arg0);
		}
		if (!arg0) {
			Static64.method1472(arg1);
		}
		if (!arg0 && Static248.anInt4793 != -1) {
			Static132.method2437(Static248.anInt4793, 1);
		}
		return local7;
	}
}
