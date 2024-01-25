import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!wt", name = "Q", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_280 = new Class67(57, 12);

	@OriginalMember(owner = "client!wt", name = "R", descriptor = "[B")
	public static final byte[] aByteArray96 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!wt", name = "S", descriptor = "Lclient!fc;")
	public static final Class77 aClass77_64 = new Class77(64);

	@OriginalMember(owner = "client!wt", name = "T", descriptor = "F")
	public static float aFloat92 = 1.0F;

	@OriginalMember(owner = "client!wt", name = "U", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_281 = new Class67(66, 0);

	@OriginalMember(owner = "client!wt", name = "V", descriptor = "Z")
	public static boolean aBoolean648 = false;

	@OriginalMember(owner = "client!wt", name = "W", descriptor = "I")
	public static int anInt7392 = 0;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BZ)V")
	public static void method5949(@OriginalArg(1) boolean arg0) {
		for (@Pc(15) Class1_Sub35 local15 = (Class1_Sub35) Static463.aClass14_53.method203(); local15 != null; local15 = (Class1_Sub35) Static463.aClass14_53.method208()) {
			if (local15.aClass1_Sub9_Sub4_3 != null) {
				Static123.aClass1_Sub9_Sub1_1.method4263(local15.aClass1_Sub9_Sub4_3);
				local15.aClass1_Sub9_Sub4_3 = null;
			}
			if (local15.aClass1_Sub9_Sub4_2 != null) {
				Static123.aClass1_Sub9_Sub1_1.method4263(local15.aClass1_Sub9_Sub4_2);
				local15.aClass1_Sub9_Sub4_2 = null;
			}
			local15.method5953();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class1_Sub35 local54 = (Class1_Sub35) Static175.aClass14_12.method203(); local54 != null; local54 = (Class1_Sub35) Static175.aClass14_12.method208()) {
			if (local54.aClass1_Sub9_Sub4_3 != null) {
				Static123.aClass1_Sub9_Sub1_1.method4263(local54.aClass1_Sub9_Sub4_3);
				local54.aClass1_Sub9_Sub4_3 = null;
			}
			local54.method5953();
		}
		for (@Pc(81) Class1_Sub35 local81 = (Class1_Sub35) Static263.aClass208_28.method4414(); local81 != null; local81 = (Class1_Sub35) Static263.aClass208_28.method4410()) {
			if (local81.aClass1_Sub9_Sub4_3 != null) {
				Static123.aClass1_Sub9_Sub1_1.method4263(local81.aClass1_Sub9_Sub4_3);
				local81.aClass1_Sub9_Sub4_3 = null;
			}
			local81.method5953();
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IZIII)V")
	public static void method5951(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static307.aLong166 = 0L;
		@Pc(8) int local8 = Static208.method3017();
		if (arg3 == 3 || local8 == 3) {
			arg1 = true;
		}
		if (!Static186.aClass117_3.method5667()) {
			arg1 = true;
		}
		Static208.method3021(arg3, arg0, arg1, arg2, local8);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IFIIIFI[FFIIII)V")
	public static void method5952(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(9) int local9 = arg5 - arg1;
		@Pc(13) int local13 = arg11 - arg2;
		@Pc(17) int local17 = arg9 - arg3;
		@Pc(38) float local38 = arg6[0] * (float) local17 + (float) local9 * arg6[1] + (float) local13 * arg6[2];
		@Pc(64) float local64 = (float) local13 * arg6[5] + (float) local9 * arg6[4] + (float) local17 * arg6[3];
		@Pc(85) float local85 = arg6[6] * (float) local17 + (float) local9 * arg6[7] + (float) local13 * arg6[8];
		@Pc(103) float local103;
		@Pc(97) float local97;
		if (arg8 == 0) {
			local97 = arg7 + 0.5F - local85;
			local103 = arg0 + local38 + 0.5F;
		} else if (arg8 == 1) {
			local97 = arg7 + local85 + 0.5F;
			local103 = arg0 + local38 + 0.5F;
		} else if (arg8 == 2) {
			local97 = arg4 + 0.5F - local64;
			local103 = arg0 + 0.5F - local38;
		} else if (arg8 == 3) {
			local103 = local38 + arg0 + 0.5F;
			local97 = arg4 + 0.5F - local64;
		} else if (arg8 == 4) {
			local103 = arg7 + local85 + 0.5F;
			local97 = arg4 + 0.5F - local64;
		} else {
			local103 = arg7 + 0.5F - local85;
			local97 = arg4 + 0.5F - local64;
		}
		@Pc(198) float local198;
		if (arg10 == 1) {
			local198 = local103;
			local103 = -local97;
			local97 = local198;
		} else if (arg10 == 2) {
			local103 = -local103;
			local97 = -local97;
		} else if (arg10 == 3) {
			local198 = local103;
			local103 = local97;
			local97 = -local198;
		}
		Static352.aFloat76 = local103;
		Static127.aFloat13 = local97;
	}
}
