import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
	public static int anInt5964;

	@OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
	public static int anInt5962 = 0;

	@OriginalMember(owner = "client!lk", name = "G", descriptor = "[Lclient!m;")
	public static final Interface17[] anInterface17Array2 = new Interface17[128];

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BJ)V")
	public static void method5365(@OriginalArg(1) long arg0) {
		@Pc(11) int local11 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048 + Static28.anInt376;
		@Pc(17) int local17 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057 + Static200.anInt4057;
		if (Static170.anInt3533 - local11 < -2000 || Static170.anInt3533 - local11 > 2000 || Static331.anInt8309 - local17 < -2000 || Static331.anInt8309 - local17 > 2000) {
			Static170.anInt3533 = local11;
			Static331.anInt8309 = local17;
		}
		@Pc(73) int local73;
		@Pc(81) int local81;
		if (local11 != Static170.anInt3533) {
			local73 = local11 - Static170.anInt3533;
			local81 = (int) ((long) local73 * arg0 / 320L);
			if (local73 <= 0) {
				if (local81 == 0) {
					local81 = -1;
				} else if (local73 > local81) {
					local81 = local73;
				}
			} else if (local81 == 0) {
				local81 = 1;
			} else if (local81 > local73) {
				local81 = local73;
			}
			Static170.anInt3533 += local81;
		}
		Static409.aFloat135 += (float) arg0 * Static620.aFloat195 / 6.0F;
		if (Static331.anInt8309 != local17) {
			local73 = local17 - Static331.anInt8309;
			local81 = (int) (arg0 * (long) local73 / 320L);
			if (local73 > 0) {
				if (local81 == 0) {
					local81 = 1;
				} else if (local73 < local81) {
					local81 = local73;
				}
			} else if (local81 == 0) {
				local81 = -1;
			} else if (local73 > local81) {
				local81 = local73;
			}
			Static331.anInt8309 += local81;
		}
		Static135.aFloat51 += (float) arg0 * Static145.aFloat52 / 6.0F;
		Static23.method264();
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(II)V")
	public static void method5366(@OriginalArg(0) int arg0) {
		@Pc(16) Class6_Sub2_Sub4 local16 = Static602.method8315((long) arg0, 5);
		local16.method2038();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZII)V")
	public static void method5368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class6_Sub2_Sub4 local16 = Static602.method8315((long) arg2, 8);
		local16.method2040();
		local16.anInt2116 = arg3;
		local16.anInt2111 = arg0;
		local16.anInt2113 = arg1;
	}
}
