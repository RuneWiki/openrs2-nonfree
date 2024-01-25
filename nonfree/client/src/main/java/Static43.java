import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bi", name = "N", descriptor = "Lclient!au;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_26 = new Class56(108, 28);

	@OriginalMember(owner = "client!bi", name = "K", descriptor = "F")
	public static float aFloat20 = 0.0F;

	@OriginalMember(owner = "client!bi", name = "M", descriptor = "[B")
	public static final byte[] aByteArray9 = new byte[520];

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)Z")
	public static boolean method703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZLclient!sp;)V")
	public static void method706(@OriginalArg(1) Class41_Sub2_Sub1_Sub4 arg0) {
		if (arg0 instanceof Class41_Sub2_Sub1_Sub4_Sub1) {
			@Pc(5) Class41_Sub2_Sub1_Sub4_Sub1 local5 = (Class41_Sub2_Sub1_Sub4_Sub1) arg0;
			if (local5.aClass264_1 != null) {
				Static189.method3219(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117 != local5.aByte117, local5);
			}
		} else if (arg0 instanceof Class41_Sub2_Sub1_Sub4_Sub2) {
			@Pc(27) Class41_Sub2_Sub1_Sub4_Sub2 local27 = (Class41_Sub2_Sub1_Sub4_Sub2) arg0;
			Static382.method5658(local27, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117 != local27.aByte117);
		}
	}
}
