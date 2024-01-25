import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
	public static int anInt9382 = 0;

	@OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
	public static final int anInt9388 = 1338;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method7780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5) {
		Static178.method6933(arg0, arg3, arg1, arg2, arg5, arg4, 0);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
	public static void method7781() {
		@Pc(7) int local7 = Static476.anInt8277;
		@Pc(9) int[] local9 = Static10.anIntArray19;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class9_Sub1_Sub1_Sub2_Sub2 local19 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local9[local11]];
			if (local19 != null && local19.anInt6414 > 0) {
				local19.anInt6414--;
				if (local19.anInt6414 == 0) {
					local19.aString93 = null;
				}
			}
		}
		for (@Pc(45) int local45 = 0; local45 < Static49.anInt1058; local45++) {
			@Pc(52) long local52 = (long) Static480.anIntArray603[local45];
			@Pc(58) Class3_Sub39 local58 = (Class3_Sub39) Static243.aClass310_16.method6601(local52);
			if (local58 != null) {
				@Pc(63) Class9_Sub1_Sub1_Sub2_Sub1 local63 = local58.aClass9_Sub1_Sub1_Sub2_Sub1_2;
				if (local63.anInt6414 > 0) {
					local63.anInt6414--;
					if (local63.anInt6414 == 0) {
						local63.aString93 = null;
					}
				}
			}
		}
	}
}
