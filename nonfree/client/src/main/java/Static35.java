import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bda", name = "K", descriptor = "Lclient!pj;")
	public static Class248 aClass248_8;

	@OriginalMember(owner = "client!bda", name = "M", descriptor = "I")
	public static int anInt670;

	@OriginalMember(owner = "client!bda", name = "L", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_12 = new Class316(47, -1);

	@OriginalMember(owner = "client!bda", name = "N", descriptor = "[B")
	public static final byte[] aByteArray1 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IBLclient!bt;)Lclient!ub;")
	public static Class315 method581(@OriginalArg(0) int arg0, @OriginalArg(2) Class15_Sub2 arg1) {
		@Pc(17) Class315 local17;
		if (Static268.aClass315_2 == null) {
			local17 = new Class315();
		} else {
			local17 = Static268.aClass315_2;
			Static268.aClass315_2 = Static268.aClass315_2.aClass315_3;
			local17.aClass315_3 = null;
			Static449.anInt7947--;
		}
		local17.anInt8858 = arg0;
		local17.aClass15_Sub2_2 = arg1;
		return local17;
	}
}
