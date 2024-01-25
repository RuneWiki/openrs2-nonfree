import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!pj", name = "K", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_194 = new Class137(33, 3);

	@OriginalMember(owner = "client!pj", name = "Y", descriptor = "I")
	public static int anInt5156 = 0;

	@OriginalMember(owner = "client!pj", name = "bb", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_159 = new Class151("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)I")
	public static int method4031(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIII)V")
	public static void method4032(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class1_Sub3_Sub13 local13 = Static397.method4998(8, arg3);
		local13.method3459();
		local13.anInt4301 = arg1;
		local13.anInt4295 = arg0;
		local13.anInt4297 = arg2;
	}
}
