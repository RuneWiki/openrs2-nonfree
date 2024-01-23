import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!i;")
	private static Class41 aClass41_1000 = Static184.method2923("Allocated memory");

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Lclient!i;")
	public static Class41 aClass41_999 = aClass41_1000;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "Lclient!i;")
	public static Class41 aClass41_1001 = Static184.method2923("<img=0>");

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
	public static void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class2_Sub22 local10 = (Class2_Sub22) Static57.aClass70_3.method2205((long) arg0);
		if (local10 == null) {
			local10 = new Class2_Sub22();
			Static57.aClass70_3.method2208((long) arg0, local10);
		}
		if (local10.anIntArray397.length <= arg2) {
			@Pc(43) int[] local43 = new int[arg2 + 1];
			@Pc(48) int[] local48 = new int[arg2 + 1];
			for (@Pc(50) int local50 = 0; local50 < local10.anIntArray397.length; local50++) {
				local48[local50] = local10.anIntArray397[local50];
				local43[local50] = local10.anIntArray396[local50];
			}
			for (@Pc(80) int local80 = local10.anIntArray397.length; local80 < arg2; local80++) {
				local48[local80] = -1;
				local43[local80] = 0;
			}
			local10.anIntArray396 = local43;
			local10.anIntArray397 = local48;
		}
		local10.anIntArray397[arg2] = arg3;
		local10.anIntArray396[arg2] = arg1;
	}
}
