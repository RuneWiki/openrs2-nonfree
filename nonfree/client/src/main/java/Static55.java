import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
	public static int anInt1103;

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "Lclient!wha;")
	public static Class374 aClass374_1;

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "Lclient!kca;")
	public static Class191 aClass191_1;

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
	public static int anInt1105 = 0;

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
	public static int anInt1106 = 0;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BI)V")
	public static void method940(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class5_Sub22 local14 = new Class5_Sub22(arg0);
		@Pc(16) boolean local16 = false;
		while (true) {
			while (true) {
				@Pc(22) int local22 = local14.method5966();
				if (local22 == 0) {
					if (local16) {
						return;
					}
					if (Static417.anIntArray383 == null) {
						Static417.anIntArray383 = new int[4];
						Static429.anInt7408 = 4;
						Static157.anIntArray159 = new int[4];
					}
					for (local22 = 0; local22 < Static417.anIntArray383.length; local22++) {
						Static417.anIntArray383[local22] = 0;
						Static157.anIntArray159[local22] = local22 * 20;
					}
					return;
				}
				if (local22 == 1) {
					if (Static417.anIntArray383 == null) {
						Static157.anIntArray159 = new int[4];
						Static429.anInt7408 = 4;
						Static417.anIntArray383 = new int[4];
					}
					for (@Pc(68) int local68 = 0; local68 < Static417.anIntArray383.length; local68++) {
						Static417.anIntArray383[local68] = local14.method5956();
						Static157.anIntArray159[local68] = local14.method5956();
					}
					local16 = true;
				} else if (local22 == 2) {
					Static634.anInt10542 = local14.method5968();
				} else if (local22 == 3) {
					Static429.anInt7408 = local14.method5966();
					Static417.anIntArray383 = new int[Static429.anInt7408];
					Static157.anIntArray159 = new int[Static429.anInt7408];
				}
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)Z")
	public static boolean method942(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BIFII[BFIFFIIFLclient!ifa;)V")
	public static void method945(@OriginalArg(2) float arg0, @OriginalArg(4) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) int arg6, @OriginalArg(12) float arg7, @OriginalArg(13) Class136 arg8) {
		@Pc(10) float[] local10 = new float[16384];
		@Pc(44) int local44;
		@Pc(62) int local62;
		for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
			arg8.method3515(arg0 / (float) 128, arg5 * 127.0F, 0, local10, arg7 / (float) 128, arg6, arg3 / (float) 16);
			local44 = arg1;
			arg3 *= 2.0F;
			arg7 *= 2.0F;
			arg5 *= arg4;
			arg0 *= 2.0F;
			for (local62 = 0; local62 < 16384; local62++) {
				arg2[local44] = (byte) ((float) arg2[local44] + local10[local62]);
				local44++;
			}
		}
		local44 = arg1;
		for (local62 = 0; local62 < 16384; local62++) {
			arg2[local44] = (byte) (arg2[local44] + 127);
			local44++;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IBIIIII)V")
	public static void method946(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 - arg5 >= Static275.anInt4919 && Static529.anInt9089 >= arg5 + arg4 && Static554.anInt9362 <= arg0 - arg5 && arg5 + arg0 <= Static62.anInt1300) {
			Static435.method6637(arg5, arg0, arg3, arg1, arg2, arg4);
		} else {
			Static151.method2222(arg2, arg0, arg3, arg1, arg4, arg5);
		}
	}
}
