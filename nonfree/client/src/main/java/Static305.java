import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!ku", name = "l", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_2 = new Class45(1);

	@OriginalMember(owner = "client!ku", name = "o", descriptor = "[I")
	public static final int[] anIntArray336 = new int[13];

	@OriginalMember(owner = "client!ku", name = "p", descriptor = "Lclient!gha;")
	public static final Class125 aClass125_4 = new Class125();

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(BI)V")
	public static void method4183(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub2_Sub4 local12 = Static566.method7763(arg0, 3);
		local12.method669();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBZIIII)V")
	public static void method4186(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 ? Static234.aClass2_Sub5_48.aClass6_Sub22_4.method7291() : Static234.aClass2_Sub5_48.aClass6_Sub22_5.method7291()) != 0 && arg4 != 0 && Static270.anInt4355 < 50 && arg2 != -1) {
			Static81.aClass105Array1[Static270.anInt4355++] = new Class105((byte) (arg1 ? 3 : 2), arg2, arg4, arg0, arg5, 0, arg3, null);
		}
	}
}
