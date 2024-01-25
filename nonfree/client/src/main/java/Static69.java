import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!de", name = "O", descriptor = "I")
	public static int anInt1304;

	@OriginalMember(owner = "client!de", name = "Q", descriptor = "Z")
	public static boolean aBoolean148;

	@OriginalMember(owner = "client!de", name = "J", descriptor = "[S")
	public static final short[] aShortArray12 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)Z")
	public static boolean method1137(@OriginalArg(1) int arg0) {
		if (Static288.aBooleanArray16[arg0]) {
			return true;
		} else if (Static359.aClass82_84.method1832(arg0)) {
			@Pc(23) int local23 = Static359.aClass82_84.method1823(arg0);
			if (local23 == 0) {
				Static288.aBooleanArray16[arg0] = true;
				return true;
			}
			if (Static87.aClass124ArrayArray7[arg0] == null) {
				Static87.aClass124ArrayArray7[arg0] = new Class124[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static87.aClass124ArrayArray7[arg0][local42] == null) {
					@Pc(56) byte[] local56 = Static359.aClass82_84.method1817(arg0, local42);
					if (local56 != null) {
						@Pc(68) Class124 local68 = Static87.aClass124ArrayArray7[arg0][local42] = new Class124();
						local68.anInt3348 = (arg0 << 16) + local42;
						if (local56[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local68.method2785(new Class1_Sub28(local56));
					}
				}
			}
			Static288.aBooleanArray16[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(FIFFILclient!nk;II[BFIIFI)V")
	public static void method1139(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) Class166 arg4, @OriginalArg(8) byte[] arg5, @OriginalArg(9) float arg6, @OriginalArg(11) int arg7, @OriginalArg(12) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(18) int local18;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local18 = arg1;
			arg4.method5568(0, arg6 / (float) 16, arg8 * 127.0F, local12, arg0 / (float) 128, arg7, arg2 / (float) 128);
			arg8 *= arg3;
			for (local48 = 0; local48 < 16384; local48++) {
				arg5[local18] = (byte) ((float) arg5[local18] + local12[local48]);
				local18++;
			}
			arg0 *= 2.0F;
			arg2 *= 2.0F;
			arg6 *= 2.0F;
		}
		local18 = arg1;
		for (local48 = 0; local48 < 16384; local48++) {
			arg5[local18] = (byte) (arg5[local18] + 127);
			local18++;
		}
	}
}
