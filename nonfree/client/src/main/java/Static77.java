import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!er", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString67 = "purple:";

	@OriginalMember(owner = "client!er", name = "l", descriptor = "Z")
	public static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!mo;Ljava/lang/String;Z)Lclient!pe;")
	public static Class163 method1918(@OriginalArg(1) Class143 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) int local18 = arg0.method3765(arg1);
		if (local18 == -1) {
			return new Class163(0);
		}
		@Pc(32) int[] local32 = arg0.method3738(local18);
		@Pc(38) Class163 local38 = new Class163(local32.length);
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		while (true) {
			while (local38.anInt4750 > local40) {
				@Pc(56) Class14_Sub4 local56 = new Class14_Sub4(arg0.method3745(local18, local32[local42++]));
				@Pc(60) int local60 = local56.method2510();
				@Pc(64) int local64 = local56.method2498();
				@Pc(68) int local68 = local56.method2548();
				if (!arg2 && local68 == 1) {
					local38.anInt4750--;
				} else {
					local38.anIntArray429[local40] = local60;
					local38.anIntArray428[local40] = local64;
					local40++;
				}
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)Lclient!cg;")
	public static Class14_Sub2_Sub3 method1919(@OriginalArg(1) int arg0) {
		@Pc(18) Class14_Sub2_Sub3 local18 = (Class14_Sub2_Sub3) Static276.aClass178_8.method4772((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static238.aClass143_90.method3745(19, arg0);
		local18 = new Class14_Sub2_Sub3();
		if (local28 != null) {
			local18.method905(new Class14_Sub4(local28));
		}
		Static276.aClass178_8.method4767(local18, (long) arg0);
		return local18;
	}
}
