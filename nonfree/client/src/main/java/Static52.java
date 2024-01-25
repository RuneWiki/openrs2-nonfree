import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bka", name = "n", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_20 = new Class240(12, -1);

	@OriginalMember(owner = "client!bka", name = "o", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!bka", name = "p", descriptor = "I")
	public static int anInt1140 = 0;

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(ZIIIII)V")
	public static void method1016(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(19) long local19 = (long) (arg3 | (arg0 ? Integer.MIN_VALUE : 0));
		@Pc(27) Class3_Sub21 local27 = (Class3_Sub21) Static665.aClass333_44.method7489(local19);
		if (local27 == null) {
			local27 = new Class3_Sub21();
			Static665.aClass333_44.method7488(local19, local27);
		}
		if (arg4 >= local27.anIntArray174.length) {
			@Pc(50) int[] local50 = new int[arg4 + 1];
			@Pc(55) int[] local55 = new int[arg4 + 1];
			for (@Pc(57) int local57 = 0; local57 < local27.anIntArray174.length; local57++) {
				local50[local57] = local27.anIntArray174[local57];
				local55[local57] = local27.anIntArray175[local57];
			}
			for (@Pc(87) int local87 = local27.anIntArray174.length; local87 < arg4; local87++) {
				local50[local87] = -1;
				local55[local87] = 0;
			}
			local27.anIntArray174 = local50;
			local27.anIntArray175 = local55;
		}
		local27.anIntArray174[arg4] = arg2;
		local27.anIntArray175[arg4] = arg1;
	}
}
