import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
	public static int anInt7302;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_81 = new Class185(50, 18);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "Z")
	public static boolean aBoolean576 = false;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Lclient!haa;")
	public static final Class127 aClass127_14 = new Class127();

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "[I")
	public static final int[] anIntArray352 = new int[2];

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
	public static int anInt7318 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BILjava/awt/Canvas;Lclient!d;ILclient!ni;II)Lclient!ha;")
	public static synchronized Class5 method6105(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface7 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class223 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 0) {
			return Static97.method2353(arg2, arg6, arg3, arg1);
		} else if (arg5 == 2) {
			return Static198.method3583(arg3, arg6, arg1, arg2);
		} else if (arg5 == 1) {
			return Static202.method3681(arg1, arg0, arg2);
		} else if (arg5 == 5) {
			return Static118.method2556(arg0, arg4, arg2, arg1);
		} else if (arg5 == 3) {
			return Static652.method6047(arg0, arg1, arg2, arg4);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!ji;)Lclient!uk;")
	public static Class72 method6159(@OriginalArg(1) Class6_Sub8 arg0) {
		@Pc(7) int local7 = arg0.method8220();
		@Pc(14) Class79 local14 = Static174.method3299()[arg0.method8246()];
		@Pc(26) Class127 local26 = Static569.method7978()[arg0.method8246()];
		@Pc(30) int local30 = arg0.method8231();
		@Pc(34) int local34 = arg0.method8231();
		return new Class72(local7, local14, local26, local30, local34);
	}
}
