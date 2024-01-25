import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!nea", name = "D", descriptor = "Lclient!ija;")
	public static Class157 aClass157_1;

	@OriginalMember(owner = "client!nea", name = "C", descriptor = "[I")
	public static final int[] anIntArray551 = new int[3];

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BI[B)I")
	public static int method5593(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static523.method7313(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIBII)V")
	public static void method5595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg0;
		@Pc(17) int local17 = -arg0;
		@Pc(19) int local19 = -1;
		@Pc(29) int local29 = Static120.method2296(arg0 + arg1, Static7.anInt93, Static115.anInt2377);
		@Pc(40) int local40 = Static120.method2296(arg1 - arg0, Static7.anInt93, Static115.anInt2377);
		Static483.method7014(Static392.anIntArrayArray39[arg2], local40, local29, arg3);
		while (local12 < local14) {
			local19 += 2;
			local17 += local19;
			@Pc(69) int local69;
			@Pc(74) int local74;
			@Pc(92) int local92;
			@Pc(101) int local101;
			if (local17 > 0) {
				local14--;
				local17 -= local14 << 1;
				local69 = arg2 - local14;
				local74 = arg2 + local14;
				if (local74 >= Static374.anInt5986 && Static84.anInt1667 >= local69) {
					local92 = Static120.method2296(arg1 + local12, Static7.anInt93, Static115.anInt2377);
					local101 = Static120.method2296(arg1 - local12, Static7.anInt93, Static115.anInt2377);
					if (local74 <= Static84.anInt1667) {
						Static483.method7014(Static392.anIntArrayArray39[local74], local101, local92, arg3);
					}
					if (Static374.anInt5986 <= local69) {
						Static483.method7014(Static392.anIntArrayArray39[local69], local101, local92, arg3);
					}
				}
			}
			local12++;
			local69 = arg2 - local12;
			local74 = local12 + arg2;
			if (Static374.anInt5986 <= local74 && Static84.anInt1667 >= local69) {
				local92 = Static120.method2296(arg1 + local14, Static7.anInt93, Static115.anInt2377);
				local101 = Static120.method2296(arg1 - local14, Static7.anInt93, Static115.anInt2377);
				if (local74 <= Static84.anInt1667) {
					Static483.method7014(Static392.anIntArrayArray39[local74], local101, local92, arg3);
				}
				if (Static374.anInt5986 <= local69) {
					Static483.method7014(Static392.anIntArrayArray39[local69], local101, local92, arg3);
				}
			}
		}
	}
}
