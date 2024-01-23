import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "Lclient!km;")
	public static Class91 aClass91_154;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "Lclient!hi;")
	public static Class61 aClass61_22 = new Class61();

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
	public static int anInt4077 = 0;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "[Lclient!gk;")
	public static Class1_Sub2_Sub10[] aClass1_Sub2_Sub10Array7 = new Class1_Sub2_Sub10[14];

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "Lclient!qc;")
	public static Class135 aClass135_22 = new Class135(64);

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
	public static int anInt4079 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;BC)[Ljava/lang/String;")
	public static String[] method3251(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(6) int local6 = Static71.method1265(arg0, arg1);
		@Pc(14) int local14 = 0;
		@Pc(23) String[] local23 = new String[local6 + 1];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local6; local27++) {
			@Pc(32) int local32;
			for (local32 = local25; arg1 != arg0.charAt(local32); local32++) {
			}
			local23[local14++] = arg0.substring(local25, local32);
			local25 = local32 + 1;
		}
		local23[local6] = arg0.substring(local25);
		return local23;
	}
}
