import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "Lclient!pv;")
	public static Class267 aClass267_2;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
	public static int anInt9389;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
	public static int anInt9385 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V")
	public static void method7843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub5_Sub10 local8 = Static594.method8175(0, 15);
		local8.method4393();
		local8.anInt5246 = arg0;
		local8.anInt5255 = arg1;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII[B)V")
	public static void method7844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(25) int local25 = arg2 - arg0 >> 2;
		arg1 += arg0;
		while (true) {
			local25--;
			if (local25 < 0) {
				local25 = arg2 - arg0 & 0x3;
				while (true) {
					local25--;
					if (local25 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(34) int local34 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			@Pc(44) int local44 = local39 + 1;
			arg3[local39] = 1;
			arg1 = local44 + 1;
			arg3[local44] = 1;
		}
	}
}
