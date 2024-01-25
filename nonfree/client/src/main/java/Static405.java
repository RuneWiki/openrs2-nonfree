import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "[I")
	public static int[] anIntArray446;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_131 = new Class151(93, -2);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)V")
	public static void method5134(@OriginalArg(1) int arg0) {
		@Pc(14) Class4_Sub5_Sub11 local14 = Static652.method8695((long) arg0, 8);
		local14.method3956();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!rk;Z)V")
	public static void method5135(@OriginalArg(0) Class3_Sub6 arg0) {
		arg0.aClass3_Sub1_21 = null;
		@Pc(17) int local17 = arg0.aClass3_Sub4Array1.length;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			arg0.aClass3_Sub4Array1[local19].aBoolean234 = false;
		}
		@Pc(33) Class236[] local33 = Class4_Sub36.aClass236Array1;
		synchronized (Class4_Sub36.aClass236Array1) {
			if (local17 < Class4_Sub36.aClass236Array1.length && Static433.anIntArray471[local17] < 200) {
				Class4_Sub36.aClass236Array1[local17].method4955(arg0);
				@Pc(54) int local54 = Static433.anIntArray471[local17]++;
			}
		}
	}
}
