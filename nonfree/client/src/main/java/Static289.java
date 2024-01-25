import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
	public static int anInt8542;

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "Lclient!jia;")
	public static Class172 aClass172_10;

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_126 = new Class200(83, 6);

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "[B")
	public static final byte[] aByteArray95 = new byte[2048];

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(CB)Z")
	public static boolean method7331(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static578.method8187(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static299.aCharArray3;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(42) char[] local42 = Static459.aCharArray4;
			for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
				@Pc(50) char local50 = local42[local44];
				if (arg0 == local50) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)Lclient!va;")
	public static Class349 method7333(@OriginalArg(0) int arg0) {
		@Pc(10) Class349 local10 = (Class349) Static120.aClass102_18.method2677((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static400.aClass196_81.method5102(0, arg0);
		local10 = new Class349();
		if (local20 != null) {
			local10.method8290(new Class3_Sub3(local20));
		}
		local10.method8292();
		Static120.aClass102_18.method2674((long) arg0, local10);
		return local10;
	}
}
