import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "Lclient!js;")
	public static Class179_Sub1 aClass179_Sub1_2;

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "[I")
	public static int[] anIntArray18;

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "Lclient!ob;")
	public static Class241 aClass241_2;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_21 = new Class362(104, 17);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIBII)I")
	public static int method350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(14) int local14 = local7 < 8 ? arg3 : arg1;
		@Pc(40) int local40 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg3 : arg2) : arg1;
		return ((local7 & 0x1) == 0 ? local14 : -local14) + ((local7 & 0x2) == 0 ? local40 : -local40);
	}
}
