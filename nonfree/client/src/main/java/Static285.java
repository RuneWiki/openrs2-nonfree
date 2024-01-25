import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_104 = new Class151(100, 10);

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)Z")
	public static boolean method4102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static333.method4594(arg0, arg1) || Static638.method8538(arg0, arg1);
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(III)V")
	public static void method4103(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(23) Class4_Sub5_Sub11 local23 = Static652.method8695((long) arg1 << 32 | (long) arg0, 19);
		local23.method3956();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;Lclient!bt;ZI)Lclient!mc;")
	public static Class225 method4106(@OriginalArg(0) String arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(10) int local10 = arg1.method1252(arg0);
		if (local10 == -1) {
			return new Class225(0);
		}
		@Pc(25) int[] local25 = arg1.method1243(local10);
		@Pc(31) Class225 local31 = new Class225(local25.length);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		while (true) {
			while (local33 < local31.anInt5491) {
				@Pc(49) Class4_Sub11 local49 = new Class4_Sub11(arg1.method1239(local10, local25[local35++]));
				@Pc(53) int local53 = local49.method8850();
				@Pc(57) int local57 = local49.method8859();
				@Pc(61) int local61 = local49.method8865();
				if (!arg2 && local61 == 1) {
					local31.anInt5491--;
				} else {
					local31.anIntArray422[local33] = local53;
					local31.anIntArray423[local33] = local57;
					local33++;
				}
			}
			return local31;
		}
	}
}
