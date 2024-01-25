import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!im", name = "E", descriptor = "Lclient!qea;")
	public static Class1_Sub8_Sub11 aClass1_Sub8_Sub11_3;

	@OriginalMember(owner = "client!im", name = "z", descriptor = "[I")
	public static final int[] anIntArray200 = new int[1000];

	@OriginalMember(owner = "client!im", name = "A", descriptor = "I")
	public static int anInt4130 = 0;

	@OriginalMember(owner = "client!im", name = "G", descriptor = "Lclient!ea;")
	public static Class72 aClass72_1 = new Class72();

	@OriginalMember(owner = "client!im", name = "J", descriptor = "[I")
	public static final int[] anIntArray201 = new int[200];

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIII)Lclient!wn;")
	public static Class209 method3349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg5 * 32147369L ^ (long) arg2 * 97549L ^ (long) arg1 * 67481L ^ (long) arg3 * 475427L ^ (long) arg0 * 986053L ^ (long) arg4 * 76724863L;
		@Pc(44) Class209 local44 = (Class209) Static553.aClass207_58.method4390(local38);
		if (local44 == null) {
			local44 = Static432.aClass78_112.method6818(arg1, arg2, arg3, arg0, arg5, arg4);
			Static553.aClass207_58.method4391(local38, local44);
			return local44;
		} else {
			return local44;
		}
	}
}
