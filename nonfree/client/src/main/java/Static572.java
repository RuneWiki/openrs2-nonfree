import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!tga", name = "k", descriptor = "[I")
	public static final int[] anIntArray505 = new int[14];

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ZIIIII)V")
	public static void method8705(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg3 | (arg0 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class2_Sub42 local20 = (Class2_Sub42) Static37.aClass335_5.method8357(local14);
		if (local20 == null) {
			local20 = new Class2_Sub42();
			Static37.aClass335_5.method8356(local20, local14);
		}
		if (local20.anIntArray350.length <= arg1) {
			@Pc(53) int[] local53 = new int[arg1 + 1];
			@Pc(58) int[] local58 = new int[arg1 + 1];
			for (@Pc(60) int local60 = 0; local60 < local20.anIntArray350.length; local60++) {
				local53[local60] = local20.anIntArray350[local60];
				local58[local60] = local20.anIntArray351[local60];
			}
			for (@Pc(90) int local90 = local20.anIntArray350.length; local90 < arg1; local90++) {
				local53[local90] = -1;
				local58[local90] = 0;
			}
			local20.anIntArray351 = local58;
			local20.anIntArray350 = local53;
		}
		local20.anIntArray350[arg1] = arg2;
		local20.anIntArray351[arg1] = arg4;
	}
}
