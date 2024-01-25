import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!rp", name = "I", descriptor = "Lclient!bi;")
	public static Class31 aClass31_102;

	@OriginalMember(owner = "client!rp", name = "O", descriptor = "[I")
	public static int[] anIntArray633;

	@OriginalMember(owner = "client!rp", name = "J", descriptor = "[B")
	public static final byte[] aByteArray104 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIII)V")
	public static void method6533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class4_Sub7_Sub5 local17 = Static218.method3780(10, arg0);
		local17.method3066();
		local17.anInt3353 = arg2;
		local17.anInt3348 = arg3;
		local17.anInt3351 = arg1;
	}
}
