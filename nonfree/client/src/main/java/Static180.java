import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "Lclient!kaa;")
	public static Class168 aClass168_6;

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "[I")
	public static int[] anIntArray220;

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "[S")
	public static short[] aShortArray24;

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
	public static int anInt3755;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "[B")
	public static final byte[] aByteArray16 = new byte[520];

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "[I")
	public static final int[] anIntArray219 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIZB)V")
	public static void method3266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(14) long local14 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg0);
		@Pc(20) Class6_Sub49 local20 = (Class6_Sub49) Static420.aClass128_35.method3263(local14);
		if (local20 == null) {
			local20 = new Class6_Sub49();
			Static420.aClass128_35.method3267(local20, local14);
		}
		if (arg1 >= local20.anIntArray697.length) {
			@Pc(45) int[] local45 = new int[arg1 + 1];
			@Pc(50) int[] local50 = new int[arg1 + 1];
			for (@Pc(52) int local52 = 0; local52 < local20.anIntArray697.length; local52++) {
				local45[local52] = local20.anIntArray697[local52];
				local50[local52] = local20.anIntArray696[local52];
			}
			for (@Pc(82) int local82 = local20.anIntArray697.length; local82 < arg1; local82++) {
				local45[local82] = -1;
				local50[local82] = 0;
			}
			local20.anIntArray696 = local50;
			local20.anIntArray697 = local45;
		}
		local20.anIntArray697[arg1] = arg2;
		local20.anIntArray696[arg1] = arg3;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
	public static void method3269() {
		@Pc(12) Class6_Sub31 local12 = Static114.method2007(Static500.aClass47_130, Static337.aClass324_1);
		local12.aClass6_Sub21_Sub2_2.method6062(Static74.method1450());
		local12.aClass6_Sub21_Sub2_2.method6052(Static240.anInt4852);
		local12.aClass6_Sub21_Sub2_2.method6052(Static196.anInt4059);
		local12.aClass6_Sub21_Sub2_2.method6062(Static140.aClass6_Sub48_Sub1_1.anInt9013);
		Static534.method7251(local12);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(JB)V")
	public static void method3270(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static157.anInt3359;
		@Pc(19) int local19;
		@Pc(27) int local27;
		if (Static405.anInt7184 != local7) {
			local19 = local7 - Static405.anInt7184;
			local27 = (int) ((long) local19 * arg0 / 320L);
			if (local19 <= 0) {
				if (local27 == 0) {
					local27 = -1;
				} else if (local27 < local19) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = 1;
			} else if (local19 < local27) {
				local27 = local19;
			}
			Static405.anInt7184 += local27;
		}
		@Pc(69) int local69 = Static220.anInt4550;
		if (!Static140.aClass6_Sub48_Sub1_1.aBoolean678) {
			Static331.aFloat140 += Static345.aFloat142 * (float) arg0 / 40.0F * 8.0F;
			Static428.aFloat160 += Static272.aFloat131 * (float) arg0 / 40.0F * 8.0F;
		}
		if (local69 != Static468.anInt8032) {
			local19 = local69 - Static468.anInt8032;
			local27 = (int) ((long) local19 * arg0 / 320L);
			if (local19 <= 0) {
				if (local27 == 0) {
					local27 = -1;
				} else if (local19 > local27) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = 1;
			} else if (local19 < local27) {
				local27 = local19;
			}
			Static468.anInt8032 += local27;
		}
		Static468.method6541();
	}
}
