import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
	public static int anInt4068;

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString40;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
	public static int anInt4070;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
	public static int anInt4071;

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_156 = new Class214(41, 8);

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_157 = new Class214(91, 6);

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method3243(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static145.anInt2445; local19++) {
			if (arg0.equalsIgnoreCase(Static108.aStringArray17[local19])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static239.aClass20_Sub3_Sub3_Sub1_1.aString48);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIBIIZIF)[I")
	public static int[] method3244(@OriginalArg(7) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class1_Sub1_Sub16 local10 = new Class1_Sub1_Sub16();
		local10.aBoolean213 = true;
		local10.anInt2678 = 35;
		local10.anInt2677 = (int) (arg0 * 4096.0F);
		local10.anInt2673 = 8;
		local10.anInt2671 = 8;
		local10.anInt2669 = 4;
		local10.method5627();
		Static343.method4361(2048, 1);
		local10.method2234(local6, 0);
		return local6;
	}
}
