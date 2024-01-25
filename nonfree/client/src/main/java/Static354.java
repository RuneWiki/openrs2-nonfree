import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!os", name = "F", descriptor = "Lclient!oa;")
	public static Class210 aClass210_5;

	@OriginalMember(owner = "client!os", name = "K", descriptor = "F")
	public static float aFloat126;

	@OriginalMember(owner = "client!os", name = "D", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_110 = new Class6(20, -1);

	@OriginalMember(owner = "client!os", name = "J", descriptor = "I")
	public static int anInt6469 = 2;

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(II)V")
	public static void method5619(@OriginalArg(0) int arg0) {
		if (Static491.anInt8374 == 0) {
			Static535.aClass1_Sub12_Sub4_3.method6554(arg0);
		} else {
			Static118.anInt2858 = arg0;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method5620(@OriginalArg(0) Class9 arg0) {
		if (Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94 != Static99.anInt2448 && (Static313.aClass206ArrayArrayArray2 != null && Static79.method2001(arg0, Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94))) {
			Static99.anInt2448 = Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!k;III[Z)Z")
	public static boolean method5622(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static290.aClass10Array7 != Static106.aClass10Array5) {
			@Pc(11) int local11 = Static53.aClass10Array3[arg1].aa(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class10 local18 = Static53.aClass10Array3[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.aa(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method6336(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.ya(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
