import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!db", name = "r", descriptor = "[Lclient!od;")
	public static Class151[] aClass151Array1;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "I")
	public static int anInt1005;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "Lclient!se;")
	public static Class182 aClass182_1 = new Class182(8);

	@OriginalMember(owner = "client!db", name = "z", descriptor = "[I")
	public static final int[] anIntArray112 = new int[4096];

	@OriginalMember(owner = "client!db", name = "A", descriptor = "I")
	public static int anInt1004 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([ILclient!ri;[IB[I)V")
	public static void method868(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class44_Sub4_Sub4_Sub2 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg2.length; local11++) {
			@Pc(17) int local17 = arg2[local11];
			@Pc(21) int local21 = arg3[local11];
			@Pc(25) int local25 = arg0[local11];
			for (@Pc(27) int local27 = 0; local21 != 0 && local27 < arg1.aClass192Array3.length; local27++) {
				if ((local21 & 0x1) != 0) {
					if (local17 == -1) {
						arg1.aClass192Array3[local27] = null;
					} else {
						@Pc(44) Class24 local44 = Static209.method3737(local17);
						@Pc(47) int local47 = local44.anInt574;
						@Pc(52) Class192 local52 = arg1.aClass192Array3[local27];
						if (local52 != null) {
							if (local52.anInt5797 == local17) {
								if (local47 == 0) {
									local52 = arg1.aClass192Array3[local27] = null;
								} else if (local47 == 1) {
									local52.anInt5786 = 1;
									local52.anInt5792 = 0;
									local52.anInt5789 = 0;
									local52.anInt5791 = local25;
									local52.anInt5796 = 0;
									Static203.method3667(0, arg1.anInt6339, local44, arg1.anInt6340, false);
								} else if (local47 == 2) {
									local52.anInt5789 = 0;
								}
							} else if (local44.anInt588 >= Static209.method3737(local52.anInt5797).anInt588) {
								local52 = arg1.aClass192Array3[local27] = null;
							}
						}
						if (local52 == null) {
							local52 = arg1.aClass192Array3[local27] = new Class192();
							local52.anInt5792 = 0;
							local52.anInt5786 = 1;
							local52.anInt5797 = local17;
							local52.anInt5796 = 0;
							local52.anInt5791 = local25;
							local52.anInt5789 = 0;
							Static203.method3667(0, arg1.anInt6339, local44, arg1.anInt6340, false);
						}
					}
				}
				local21 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!dp;Lclient!dp;Lclient!dp;I)V")
	public static void method869(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class53 arg2) {
		Static323.aClass53_146 = arg2;
		Static290.method4950(arg0, arg1);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILjava/lang/String;IIIILjava/lang/String;J)V")
	public static void method870(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) long arg6) {
		if (!Static201.aBoolean284 && Static256.anInt4749 < 500) {
			@Pc(20) int local20 = arg4 == -1 ? Static163.anInt3085 : arg4;
			@Pc(31) Class6_Sub32 local31 = new Class6_Sub32(arg1, arg5, local20, arg2, arg6, arg0, arg3);
			Static214.aClass211_24.method5585(local31);
			Static256.anInt4749++;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZLclient!dp;Lclient!dp;)V")
	public static void method871(@OriginalArg(2) Class53 arg0, @OriginalArg(3) Class53 arg1) {
		Static319.aClass53_145 = arg0;
		Static223.aClass53_104 = arg1;
		Static327.aBoolean227 = true;
		@Pc(20) int local20 = Static319.aClass53_145.method1003() - 1;
		Static269.anInt5047 = local20 * 256 + Static319.aClass53_145.method1011(local20);
		Static285.aStringArray35 = new String[] { null, null, null, null, Static267.aString211 };
		Static63.aStringArray6 = new String[] { null, null, Static95.aString63, null, null };
	}
}
