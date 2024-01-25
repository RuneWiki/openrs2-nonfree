import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
	public static int anInt4554;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "Lclient!s;")
	public static Class137 aClass137_4;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
	public static int anInt4553 = -1;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "Lclient!us;")
	public static final Class234 aClass234_90 = new Class234(11, 28);

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIII)V")
	public static void method4117(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub7_Sub8 local8 = Static275.method4307(8, arg3);
		local8.method3219();
		local8.anInt3667 = arg1;
		local8.anInt3669 = arg0;
		local8.anInt3670 = arg2;
	}
}
