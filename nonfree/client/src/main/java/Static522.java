import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_84 = new Class269(67, 3);

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_51 = new Class233(32);

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BIIIZI)V")
	public static void method7304(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(22) long local22 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg1);
		@Pc(28) Class2_Sub22 local28 = (Class2_Sub22) Static346.aClass222_22.method5468(local22);
		if (local28 == null) {
			local28 = new Class2_Sub22();
			Static346.aClass222_22.method5476(local28, local22);
		}
		if (arg4 >= local28.anIntArray219.length) {
			@Pc(53) int[] local53 = new int[arg4 + 1];
			@Pc(58) int[] local58 = new int[arg4 + 1];
			for (@Pc(60) int local60 = 0; local60 < local28.anIntArray219.length; local60++) {
				local53[local60] = local28.anIntArray219[local60];
				local58[local60] = local28.anIntArray220[local60];
			}
			for (@Pc(85) int local85 = local28.anIntArray219.length; local85 < arg4; local85++) {
				local53[local85] = -1;
				local58[local85] = 0;
			}
			local28.anIntArray219 = local53;
			local28.anIntArray220 = local58;
		}
		local28.anIntArray219[arg4] = arg0;
		local28.anIntArray220[arg4] = arg2;
	}
}
