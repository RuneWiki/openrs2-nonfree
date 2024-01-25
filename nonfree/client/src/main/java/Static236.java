import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!ns", name = "w", descriptor = "I")
	public static int anInt4682;

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "[I")
	public static final int[] anIntArray389 = new int[6];

	@OriginalMember(owner = "client!ns", name = "q", descriptor = "Lclient!co;")
	public static final Class41 aClass41_55 = new Class41(260);

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "I")
	public static int anInt4681 = 0;

	@OriginalMember(owner = "client!ns", name = "x", descriptor = "Z")
	public static boolean aBoolean347 = false;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
	public static void method4216(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) Class7_Sub4 local11 = new Class7_Sub4();
		local11.aString33 = arg2;
		local11.anInt3778 = arg6;
		local11.anInt3779 = arg0;
		local11.anInt3775 = Static339.anInt6265 + arg4;
		local11.anInt3781 = arg3;
		local11.anInt3777 = arg1;
		local11.anInt3780 = arg5;
		Static119.aClass199_2.method4898(local11);
	}
}
