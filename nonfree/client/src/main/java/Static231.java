import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ip", name = "Q", descriptor = "[I")
	public static int[] anIntArray217;

	@OriginalMember(owner = "client!ip", name = "N", descriptor = "Z")
	public static boolean aBoolean303 = false;

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(Z)V")
	public static void method3760() {
		for (@Pc(14) Class3_Sub7_Sub12 local14 = (Class3_Sub7_Sub12) Static110.aClass244_20.method5572(); local14 != null; local14 = (Class3_Sub7_Sub12) Static110.aClass244_20.method5576()) {
			@Pc(19) Class25_Sub2_Sub2_Sub1 local19 = local14.aClass25_Sub2_Sub2_Sub1_1;
			if (Static397.anInt6998 > local19.anInt490) {
				local14.method8128();
				local19.method475();
			} else if (Static397.anInt6998 >= local19.anInt519) {
				if (local19.anInt493 > 0) {
					@Pc(43) Class3_Sub39 local43 = (Class3_Sub39) Static581.aClass297_39.method6531((long) (local19.anInt493 - 1));
					if (local43 != null) {
						@Pc(48) Class25_Sub2_Sub2_Sub5_Sub2 local48 = local43.aClass25_Sub2_Sub2_Sub5_Sub2_2;
						if (local48.anInt8476 >= 0 && local48.anInt8476 < Static345.anInt6228 * 512 && local48.anInt8482 >= 0 && local48.anInt8482 < Static535.anInt9341 * 512) {
							local19.method477(Static397.anInt6998, Static78.method3298(local48.anInt8476, local19.aByte117, local48.anInt8482) - local19.anInt522, local48.anInt8476, local48.anInt8482);
						}
					}
				}
				if (local19.anInt493 < 0) {
					@Pc(104) int local104 = -local19.anInt493 - 1;
					@Pc(111) Class25_Sub2_Sub2_Sub5_Sub1 local111;
					if (Static147.anInt3433 == local104) {
						local111 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1;
					} else {
						local111 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local104];
					}
					if (local111 != null && local111.anInt8476 >= 0 && Static345.anInt6228 * 512 > local111.anInt8476 && local111.anInt8482 >= 0 && local111.anInt8482 < Static535.anInt9341 * 512) {
						local19.method477(Static397.anInt6998, Static78.method3298(local111.anInt8476, local19.aByte117, local111.anInt8482) - local19.anInt522, local111.anInt8476, local111.anInt8482);
					}
				}
				local19.method478(Static208.anInt4448);
				Static492.method6621(local19, true);
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(II)V")
	public static void method3762(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub7_Sub19 local8 = Static73.method5992(7, arg0);
		local8.method7364();
	}
}
