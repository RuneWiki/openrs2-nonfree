import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "Lclient!ke;")
	public static Class199 aClass199_1;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "[[[Lclient!gf;")
	public static Class128[][][] aClass128ArrayArrayArray2;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "[I")
	public static final int[] anIntArray436 = new int[1000];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!wq;)Lclient!nt;")
	public static Class5_Sub3 method6392(@OriginalArg(1) Class5_Sub36 arg0) {
		arg0.method7291();
		@Pc(13) int local13 = arg0.method7291();
		@Pc(17) Class5_Sub3 local17 = Static419.method6141(local13);
		local17.anInt10903 = arg0.method7291();
		@Pc(33) int local33 = arg0.method7291();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) int local41 = arg0.method7291();
			local17.method9211(arg0, local41);
		}
		local17.method9210();
		return local17;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!gda;B)V")
	public static void method6394(@OriginalArg(0) Class126 arg0) {
		Static365.aClass126_169 = arg0;
	}
}
