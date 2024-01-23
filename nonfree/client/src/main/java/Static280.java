import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!um", name = "l", descriptor = "I")
	public static int anInt5485;

	@OriginalMember(owner = "client!um", name = "m", descriptor = "[Lclient!ih;")
	public static Class75[] aClass75Array3;

	@OriginalMember(owner = "client!um", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!um", name = "s", descriptor = "I")
	public static int anInt5489;

	@OriginalMember(owner = "client!um", name = "t", descriptor = "F")
	public static float aFloat158;

	@OriginalMember(owner = "client!um", name = "r", descriptor = "I")
	public static int anInt5488 = 0;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I[BII)Z")
	public static boolean method4360(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(14) boolean local14 = true;
		@Pc(19) Class4_Sub24 local19 = new Class4_Sub24(arg1);
		@Pc(21) int local21 = -1;
		label58: while (true) {
			@Pc(25) int local25 = local19.method3093();
			if (local25 == 0) {
				return local14;
			}
			@Pc(32) int local32 = 0;
			local21 += local25;
			@Pc(38) boolean local38 = false;
			while (true) {
				@Pc(44) int local44;
				while (!local38) {
					local44 = local19.method3060();
					if (local44 == 0) {
						continue label58;
					}
					local32 += local44 - 1;
					@Pc(75) int local75 = local32 >> 6 & 0x3F;
					@Pc(79) int local79 = local32 & 0x3F;
					@Pc(85) int local85 = local19.method3110() >> 2;
					@Pc(90) int local90 = local79 + arg0;
					@Pc(94) int local94 = arg2 + local75;
					if (local94 > 0 && local90 > 0 && local94 < 103 && local90 < 103) {
						@Pc(115) Class73 local115 = Static296.method4591(local21);
						if (local85 != 22 || Static70.aBoolean83 || local115.anInt2267 != 0 || local115.anInt2270 == 1 || local115.aBoolean127) {
							if (!local115.method1891()) {
								local14 = false;
								Static276.anInt5449++;
							}
							local38 = true;
						}
					}
				}
				local44 = local19.method3060();
				if (local44 == 0) {
					break;
				}
				local19.method3110();
			}
		}
	}
}
