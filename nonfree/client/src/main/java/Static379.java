import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
	public static int anInt6865;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "[Lclient!gk;")
	public static Class65_Sub1[] aClass65_Sub1Array5;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
	public static int anInt6862 = -1;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_203 = new Class102(71, 8);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5319(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static209.anInt3494; local11++) {
			if (arg0.equalsIgnoreCase(Static290.aStringArray29[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)V")
	public static void method5320(@OriginalArg(0) int arg0) {
		Static407.anInt6656 = arg0;
		@Pc(7) Class132 local7 = Static459.aClass132_35;
		synchronized (Static459.aClass132_35) {
			Static459.aClass132_35.method2698();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)Z")
	public static boolean method5321() {
		return Static190.aBoolean187;
	}
}
