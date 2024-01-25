import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
	public static int anInt5611;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "Lclient!f;")
	public static Class80 aClass80_13;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "Lclient!ff;")
	public static final Class83 aClass83_45 = new Class83(8);

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_95 = new Class237(97, -1);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBIZI)V")
	public static void method4514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg4 | (arg3 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class1_Sub45 local20 = (Class1_Sub45) Static405.aClass27_40.method553(local14);
		if (local20 == null) {
			local20 = new Class1_Sub45();
			Static405.aClass27_40.method564(local14, local20);
		}
		if (local20.anIntArray680.length <= arg2) {
			@Pc(41) int[] local41 = new int[arg2 + 1];
			@Pc(46) int[] local46 = new int[arg2 + 1];
			for (@Pc(48) int local48 = 0; local48 < local20.anIntArray680.length; local48++) {
				local41[local48] = local20.anIntArray680[local48];
				local46[local48] = local20.anIntArray681[local48];
			}
			for (@Pc(74) int local74 = local20.anIntArray680.length; local74 < arg2; local74++) {
				local41[local74] = -1;
				local46[local74] = 0;
			}
			local20.anIntArray680 = local41;
			local20.anIntArray681 = local46;
		}
		local20.anIntArray680[arg2] = arg1;
		local20.anIntArray681[arg2] = arg0;
	}
}
