import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!g", name = "S", descriptor = "[I")
	public static int[] anIntArray173;

	@OriginalMember(owner = "client!g", name = "K", descriptor = "[Lclient!dm;")
	public static final Class2_Sub9_Sub2[] aClass2_Sub9_Sub2Array5 = new Class2_Sub9_Sub2[14];

	@OriginalMember(owner = "client!g", name = "N", descriptor = "I")
	public static int anInt2182 = 0;

	@OriginalMember(owner = "client!g", name = "Q", descriptor = "Lclient!oa;")
	public static final Class144 aClass144_3 = new Class144(128);

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public static void method2067() {
		Static63.aClass107_8.method3015();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
	public static void method2068() {
		@Pc(5) Class107 local5 = Static98.aClass107_11;
		synchronized (Static98.aClass107_11) {
			Static98.aClass107_11.method3011(5);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZIII)I")
	public static int method2070(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static243.aByteArrayArrayArray10[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static243.aByteArrayArrayArray10[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIZLjava/lang/String;BLjava/lang/String;IJZ)V")
	public static void method2071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) long arg7, @OriginalArg(9) boolean arg8) {
		if (!Static258.aBoolean470 && Static225.anInt4918 < 500) {
			@Pc(32) int local32 = arg6 == -1 ? Static145.anInt3131 : arg6;
			@Pc(45) Class2_Sub31 local45 = new Class2_Sub31(arg4, arg5, local32, arg1, arg7, arg2, arg0, arg8, arg3);
			Static103.aClass180_24.method4909(local45);
			Static225.anInt4918++;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IJ)V")
	public static void method2072(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static118.anInt2492;
		@Pc(9) int local9 = Static362.anInt6967;
		@Pc(17) int local17;
		@Pc(25) int local25;
		if (local7 != Static98.anInt2002) {
			local17 = local7 - Static98.anInt2002;
			local25 = (int) ((long) local17 * arg0 / 320L);
			if (local17 <= 0) {
				if (local25 == 0) {
					local25 = -1;
				} else if (local17 > local25) {
					local25 = local17;
				}
			} else if (local25 == 0) {
				local25 = 1;
			} else if (local25 > local17) {
				local25 = local17;
			}
			Static98.anInt2002 += local25;
		}
		if (!Static311.aBoolean549) {
			Static99.aFloat33 += (float) arg0 * Static90.aFloat32 / 40.0F * 8.0F;
			Static366.aFloat48 += (float) arg0 * Static145.aFloat37 / 40.0F * 8.0F;
		}
		if (Static54.anInt975 != local9) {
			local17 = local9 - Static54.anInt975;
			local25 = (int) (arg0 * (long) local17 / 320L);
			if (local17 > 0) {
				if (local25 == 0) {
					local25 = 1;
				} else if (local25 > local17) {
					local25 = local17;
				}
			} else if (local25 == 0) {
				local25 = -1;
			} else if (local17 > local25) {
				local25 = local17;
			}
			Static54.anInt975 += local25;
		}
		Static255.method4486();
	}
}
