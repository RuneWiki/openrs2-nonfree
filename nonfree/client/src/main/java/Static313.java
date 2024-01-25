import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject14;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "[Lclient!pfa;")
	public static final Class258[] aClass258Array1 = new Class258[4];

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	public static int anInt6259 = 0;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!kba;")
	public static final Class163 aClass163_35 = new Class163();

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	public static int anInt6261 = -1;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!gg;ZZ)V")
	public static void method5251(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean816 = arg1;
		if (Static640.aBoolean844) {
			Static512.aClass260Array1[Static512.aClass260Array1.length - 1].method6665(arg0);
		} else {
			Static504.method7269(arg0, Static117.aClass6_Sub10Array4);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method5253(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(20) int local20 = local6 + 3 & 0xFFFFFFFC;
		@Pc(26) int local26 = local20 / 4 * 3;
		if (local6 <= local20 - 2 || Static94.method2323(arg0.charAt(local20 - 2)) == -1) {
			local26 -= 2;
		} else if (local6 <= local20 - 1 || Static94.method2323(arg0.charAt(local20 - 1)) == -1) {
			local26--;
		}
		@Pc(74) byte[] local74 = new byte[local26];
		Static590.method8140(0, local74, arg0);
		return local74;
	}
}
