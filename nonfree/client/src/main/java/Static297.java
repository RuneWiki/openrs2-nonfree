import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
	public static int anInt5326;

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
	public static int anInt5327;

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
	public static int anInt5328;

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_127 = new Class251(73, 7);

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_128 = new Class251(63, 16);

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
	public static int anInt5329 = 0;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!ha;IIIIIII)V")
	public static void method4855(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		arg0.method6887(arg2, -10660793, arg1, arg4, arg3);
		arg0.method6887(arg2 + 1, -16777216, -2 + arg1, 16, arg3 + 1);
		arg0.method6906(arg3 + 1, arg4 + -19, arg1 - 2, -16777216, arg2 + 18);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!jc;B)Lclient!sa;")
	public static Class225 method4856(@OriginalArg(0) Class14_Sub21 arg0) {
		@Pc(9) int local9 = arg0.method7717(-1978450544);
		@Pc(16) Class258 local16 = Static428.method6432()[arg0.method7695(104)];
		@Pc(31) Class205 local31 = Static43.method711()[arg0.method7695(112)];
		@Pc(35) int local35 = arg0.method7752();
		@Pc(39) int local39 = arg0.method7752();
		return new Class225(local9, local16, local31, local35, local39);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4858(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return Static265.method4403(arg0, 10);
	}
}
