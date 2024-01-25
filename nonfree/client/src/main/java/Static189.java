import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	public static int anInt3199;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	public static int anInt3209;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
	public static void method2828(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) Class14_Sub2_Sub9 local21 = Static499.method7527((long) arg0 | (long) arg1 << 32, 19);
		local21.method4001();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB[II[ILclient!he;)Lclient!ib;")
	public static Class1_Sub2 method2829(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class144_Sub1 arg4) {
		@Pc(25) int local25;
		@Pc(35) int local35;
		@Pc(37) int local37;
		if (!arg4.method5757(Static18.aClass19_4, Static60.aClass260_3)) {
			@Pc(23) int[] local23 = new int[arg0 * arg2];
			for (local25 = 0; local25 < arg2; local25++) {
				local35 = arg1[local25] + arg0 * local25;
				for (local37 = 0; local37 < arg3[local25]; local37++) {
					local23[local35++] = -16777216;
				}
			}
			return new Class1_Sub2(arg4, arg0, arg2, local23);
		}
		@Pc(78) byte[] local78 = new byte[arg2 * arg0];
		for (local25 = 0; local25 < arg2; local25++) {
			local35 = arg0 * local25 + arg1[local25];
			for (local37 = 0; local37 < arg3[local25]; local37++) {
				local78[local35++] = -1;
			}
		}
		return new Class1_Sub2(arg4, arg0, arg2, local78);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method2830() {
		if (Static355.anInt6072 == 10) {
			Static355.anInt6072 = 11;
		}
	}
}
