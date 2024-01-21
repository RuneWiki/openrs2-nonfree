import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
	public static int anInt1620;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!ma;")
	public static Class1_Sub6_Sub2 aClass1_Sub6_Sub2_1;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_977 = Static118.method2249("Password: ");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Lclient!oc;")
	public static Class65 aClass65_975 = aClass65_977;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_976 = Static118.method2249("<col=ffff00>*V");

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!oh;")
	public static final Class67 aClass67_2 = new Class67(30);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BIIII)V")
	public static void method1107(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class1_Sub15 local15 = (Class1_Sub15) Static145.aClass99_11.method3292((long) arg1);
		if (local15 == null) {
			local15 = new Class1_Sub15();
			Static145.aClass99_11.method3290(local15, (long) arg1);
		}
		if (arg3 >= local15.anIntArray269.length) {
			@Pc(37) int[] local37 = new int[arg3 + 1];
			@Pc(42) int[] local42 = new int[arg3 + 1];
			for (@Pc(44) int local44 = 0; local44 < local15.anIntArray269.length; local44++) {
				local37[local44] = local15.anIntArray269[local44];
				local42[local44] = local15.anIntArray270[local44];
			}
			for (@Pc(73) int local73 = local15.anIntArray269.length; local73 < arg3; local73++) {
				local37[local73] = -1;
				local42[local73] = 0;
			}
			local15.anIntArray269 = local37;
			local15.anIntArray270 = local42;
		}
		local15.anIntArray269[arg3] = arg0;
		local15.anIntArray270[arg3] = arg2;
	}
}
