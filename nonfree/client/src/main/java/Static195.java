import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "Lclient!bu;")
	public static Class32 aClass32_47;

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "I")
	public static int anInt3897;

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_85 = new Class119(50, 8);

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "[I")
	public static final int[] anIntArray244 = new int[4096];

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
	public static int anInt3896 = 0;

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "[I")
	public static final int[] anIntArray245 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "[I")
	public static final int[] anIntArray246 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIII)V")
	public static void method3113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class155 local3 = new Class155();
		local3.anInt4780 = arg1 >> Static336.anInt5747;
		local3.anInt4785 = arg2 >> Static336.anInt5747;
		local3.anInt4779 = arg3 >> Static336.anInt5747;
		local3.anInt4778 = arg4 >> Static336.anInt5747;
		local3.anInt4783 = arg0;
		local3.anInt4776 = arg1;
		local3.anInt4788 = arg2;
		local3.anInt4773 = arg3;
		local3.anInt4784 = arg4;
		local3.anInt4781 = arg5;
		local3.anInt4786 = arg6;
		Static161.aClass155Array1[Static135.anInt2831++] = local3;
	}
}
