import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Lclient!om;")
	public static Class246 aClass246_102;

	@OriginalMember(owner = "client!hp", name = "o", descriptor = "I")
	public static int anInt4110;

	@OriginalMember(owner = "client!hp", name = "y", descriptor = "Lclient!cj;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "Z")
	public static boolean aBoolean318 = false;

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_123 = new Class272(73, -2);

	@OriginalMember(owner = "client!hp", name = "u", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!hp", name = "A", descriptor = "[B")
	public static final byte[] aByteArray38 = new byte[2048];

	@OriginalMember(owner = "client!hp", name = "B", descriptor = "Z")
	public static boolean aBoolean319 = true;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V")
	public static void method3655(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static363.method5457(arg0, 5);
		local8.method845();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIII)V")
	public static void method3657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(21) int local21 = arg2 * arg2;
		@Pc(25) int local25 = arg4 * arg4;
		@Pc(29) int local29 = local25 << 1;
		@Pc(33) int local33 = local21 << 1;
		@Pc(37) int local37 = arg4 << 1;
		@Pc(46) int local46 = local21 * (1 - local37) + local29;
		@Pc(54) int local54 = local25 - (local37 - 1) * local33;
		@Pc(58) int local58 = local21 << 2;
		@Pc(62) int local62 = local25 << 2;
		@Pc(70) int local70 = local29 * 3;
		@Pc(78) int local78 = local33 * ((arg4 << 1) - 3);
		@Pc(84) int local84 = local62;
		@Pc(90) int local90 = (arg4 - 1) * local58;
		Static337.method5150(arg2 + arg3, arg0, arg3 - arg2, Static176.anIntArrayArray28[arg1]);
		while (local9 > 0) {
			if (local46 < 0) {
				while (local46 < 0) {
					local46 += local70;
					local54 += local84;
					local70 += local62;
					local7++;
					local84 += local62;
				}
			}
			if (local54 < 0) {
				local46 += local70;
				local54 += local84;
				local7++;
				local84 += local62;
				local70 += local62;
			}
			local46 += -local90;
			local54 += -local78;
			local90 -= local58;
			local9--;
			local78 -= local58;
			@Pc(173) int local173 = arg1 - local9;
			@Pc(177) int local177 = local9 + arg1;
			@Pc(182) int local182 = arg3 + local7;
			@Pc(186) int local186 = arg3 - local7;
			Static337.method5150(local182, arg0, local186, Static176.anIntArrayArray28[local173]);
			Static337.method5150(local182, arg0, local186, Static176.anIntArrayArray28[local177]);
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)[Lclient!ja;")
	public static Class158[] method3660() {
		return new Class158[] { Static351.aClass158_10, Static216.aClass158_7, Static327.aClass158_8, Static433.aClass158_13, Static124.aClass158_5, Static488.aClass158_16, Static404.aClass158_12, Static334.aClass158_9, Static475.aClass158_15, Static367.aClass158_11, Static142.aClass158_4, Static210.aClass158_6, Static445.aClass158_14, Static37.aClass158_1 };
	}
}
