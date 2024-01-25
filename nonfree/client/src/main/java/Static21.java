import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
	public static int anInt688;

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "[I")
	public static int[] anIntArray27;

	@OriginalMember(owner = "client!bb", name = "N", descriptor = "[I")
	public static final int[] anIntArray26 = new int[5];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!jo;II)Lclient!kp;")
	public static Class145 method607(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class145 local12;
		if (Static241.aClass145_5 == null) {
			local12 = new Class145();
		} else {
			local12 = Static241.aClass145_5;
			Static241.aClass145_5 = Static241.aClass145_5.aClass145_2;
			local12.aClass145_2 = null;
			Static416.anInt7438--;
		}
		local12.anInt3942 = arg1;
		local12.aClass3_Sub2_2 = arg0;
		return local12;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIZI)V")
	public static void method609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static438.aLong223 = 0L;
		@Pc(8) int local8 = Static374.method5599();
		if (arg0 == 3 || local8 == 3) {
			arg3 = true;
		}
		if (!Static126.aClass66_5.method5050()) {
			arg3 = true;
		}
		Static379.method5649(arg0, arg2, arg3, local8, arg1);
	}
}
