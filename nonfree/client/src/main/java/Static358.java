import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!oo", name = "D", descriptor = "I")
	public static int anInt6699;

	@OriginalMember(owner = "client!oo", name = "y", descriptor = "I")
	public static int anInt6694 = 0;

	@OriginalMember(owner = "client!oo", name = "K", descriptor = "Z")
	public static boolean aBoolean490 = false;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IFI[BFIFFIIIFBLclient!ar;)V")
	public static void method5602(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) float arg3, @OriginalArg(6) float arg4, @OriginalArg(7) float arg5, @OriginalArg(9) int arg6, @OriginalArg(11) float arg7, @OriginalArg(13) Class19 arg8) {
		@Pc(17) float[] local17 = new float[16384];
		@Pc(23) int local23;
		@Pc(57) int local57;
		for (@Pc(19) int local19 = 0; local19 < 8; local19++) {
			local23 = arg0;
			arg8.method6668(0, arg3 / (float) 128, local17, arg4 / (float) 16, arg5 / (float) 128, arg6, arg7 * 127.0F);
			arg7 *= arg1;
			arg5 *= 2.0F;
			for (local57 = 0; local57 < 16384; local57++) {
				arg2[local23] = (byte) ((float) arg2[local23] + local17[local57]);
				local23++;
			}
			arg3 *= 2.0F;
			arg4 *= 2.0F;
		}
		local23 = arg0;
		for (local57 = 0; local57 < 16384; local57++) {
			arg2[local23] = (byte) (arg2[local23] + 127);
			local23++;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!gi;I)V")
	public static void method5603(@OriginalArg(0) Class42_Sub3 arg0) {
		@Pc(12) byte[] local12;
		if (Static152.anObject8 == null) {
			@Pc(5) Class32_Sub1_Sub1 local5 = new Class32_Sub1_Sub1();
			local12 = local5.method3536();
			Static152.anObject8 = Static425.method6549(local12);
		}
		if (Static459.anObject16 == null) {
			@Pc(27) Class32_Sub2_Sub2 local27 = new Class32_Sub2_Sub2();
			local12 = local27.method5625();
			Static459.anObject16 = Static425.method6549(local12);
		}
		@Pc(48) Class237 local48 = arg0.aClass237_1;
		if (local48.method5726() && Static173.anObject9 == null) {
			local12 = Static374.method5766(0.5F, 16.0F, new Class19_Sub1(419684), 4.0F, 0.6F, 4.0F);
			Static173.anObject9 = Static425.method6549(local12);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZIII)I")
	public static int method5605(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class12_Sub23 local8 = Static292.method4742(arg2, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && local8.anIntArray334.length > arg1) {
			return local8.anIntArray334[arg1];
		} else {
			return 0;
		}
	}
}
