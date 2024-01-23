import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
	public static int anInt4332;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!th;")
	public static Class169 aClass169_123 = new Class169(64);

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
	public static int anInt4334 = 127;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIILclient!ph;)Lclient!ln;")
	public static Class1_Sub1_Sub3_Sub2 method3506(@OriginalArg(1) int arg0, @OriginalArg(3) Class138 arg1) {
		return Static27.method486(arg0, 0, arg1) ? Static304.method4530() : null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lclient!ia;")
	public static Class78 method3508(@OriginalArg(1) int arg0) {
		@Pc(11) Class78 local11 = (Class78) Static111.aClass169_65.method4017((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27 = Static148.aClass138_45.method3346(32, arg0);
		local11 = new Class78();
		if (local27 != null) {
			local11.method1784(new Class1_Sub14(local27));
		}
		local11.method1783();
		Static111.aClass169_65.method4016(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)I")
	public static int method3509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
