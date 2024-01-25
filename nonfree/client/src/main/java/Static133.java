import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!fca", name = "ab", descriptor = "[Lclient!bw;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!fca", name = "L", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_40 = new Class276(10, -1);

	@OriginalMember(owner = "client!fca", name = "bb", descriptor = "I")
	public static int anInt3191 = 0;

	@OriginalMember(owner = "client!fca", name = "eb", descriptor = "I")
	public static int anInt3192 = 0;

	@OriginalMember(owner = "client!fca", name = "fb", descriptor = "I")
	public static int anInt3193 = -1;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIII)V")
	public static void method2778(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = arg2;
		@Pc(10) int local10 = -arg2;
		@Pc(12) int local12 = -1;
		@Pc(25) int local25 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg2 + arg3);
		@Pc(34) int local34 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg3 - arg2);
		Static426.method6794(local25, Static333.anIntArrayArray56[arg1], local34, arg0);
		while (local5 < local7) {
			local12 += 2;
			local10 += local12;
			@Pc(65) int local65;
			@Pc(69) int local69;
			@Pc(91) int local91;
			@Pc(100) int local100;
			if (local10 > 0) {
				local7--;
				local10 -= local7 << 1;
				local65 = arg1 - local7;
				local69 = local7 + arg1;
				if (Static55.anInt1303 <= local69 && local65 <= Static208.anInt4309) {
					local91 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg3 + local5);
					local100 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg3 - local5);
					if (Static208.anInt4309 >= local69) {
						Static426.method6794(local91, Static333.anIntArrayArray56[local69], local100, arg0);
					}
					if (local65 >= Static55.anInt1303) {
						Static426.method6794(local91, Static333.anIntArrayArray56[local65], local100, arg0);
					}
				}
			}
			local5++;
			local65 = arg1 - local5;
			local69 = local5 + arg1;
			if (local69 >= Static55.anInt1303 && Static208.anInt4309 >= local65) {
				local91 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg3 + local7);
				local100 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg3 - local7);
				if (Static208.anInt4309 >= local69) {
					Static426.method6794(local91, Static333.anIntArrayArray56[local69], local100, arg0);
				}
				if (Static55.anInt1303 <= local65) {
					Static426.method6794(local91, Static333.anIntArrayArray56[local65], local100, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!pe;I)V")
	public static void method2781(@OriginalArg(0) Class254 arg0) {
		Static10.aClass254_4 = arg0;
	}
}
