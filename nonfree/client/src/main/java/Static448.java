import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!sp", name = "Y", descriptor = "I")
	public static int anInt7701;

	@OriginalMember(owner = "client!sp", name = "Z", descriptor = "Lclient!pe;")
	public static Class232 aClass232_7;

	@OriginalMember(owner = "client!sp", name = "E", descriptor = "Lclient!im;")
	public static final Class140 aClass140_122 = new Class140(54, 6);

	@OriginalMember(owner = "client!sp", name = "T", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_330 = new Class296(65, -1);

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILclient!jj;)V")
	public static void method6399(@OriginalArg(1) Class1_Sub6_Sub2 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static103.anInt2066; local3++) {
			@Pc(9) int local9 = Static384.anIntArray679[local3];
			@Pc(13) Class49_Sub2_Sub2_Sub1 local13 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local9];
			@Pc(17) int local17 = arg0.method3922();
			if ((local17 & 0x40) != 0) {
				local17 += arg0.method3922() << 8;
			}
			if ((local17 & 0x8000) != 0) {
				local17 += arg0.method3922() << 16;
			}
			Static480.method6619(local9, local13, local17, arg0);
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(III)Lclient!qh;")
	public static Class49_Sub4 method6400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class255 local7 = Static242.aClass255ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class49_Sub4 local14 = local7.aClass49_Sub4_1;
			local7.aClass49_Sub4_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILclient!jq;Lclient!pa;IIIJI)V")
	public static void method6405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class156 arg2, @OriginalArg(3) Class40 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg5 * arg5 + arg0 * arg0;
		if ((long) local11 > arg6) {
			return;
		}
		@Pc(32) int local32 = Math.min(arg2.anInt4732 / 2, arg2.anInt4673 / 2);
		if (local32 * local32 >= local11) {
			Static530.method7335(arg1, arg0, arg5, arg3, arg7, Static470.aClass2Array15[arg4], arg2);
			return;
		}
		local32 -= 10;
		@Pc(64) int local64;
		if (anInt7701 == 4) {
			local64 = (int) Static404.aFloat156 & 0x3FFF;
		} else {
			local64 = Static265.anInt5084 + (int) Static404.aFloat156 & 0x3FFF;
		}
		@Pc(77) int local77 = Class310.anIntArray827[local64];
		@Pc(81) int local81 = Class310.anIntArray826[local64];
		if (anInt7701 != 4) {
			local77 = local77 * 256 / (Static316.anInt5814 + 256);
			local81 = local81 * 256 / (Static316.anInt5814 + 256);
		}
		@Pc(112) int local112 = local81 * arg0 + arg5 * local77 >> 14;
		@Pc(123) int local123 = local81 * arg5 - arg0 * local77 >> 14;
		@Pc(129) double local129 = Math.atan2((double) local112, (double) local123);
		@Pc(136) int local136 = (int) ((double) local32 * Math.sin(local129));
		@Pc(143) int local143 = (int) ((double) local32 * Math.cos(local129));
		Static388.aClass2Array12[arg4].method7359((float) local136 + (float) arg2.anInt4732 / 2.0F + (float) arg7, (float) -local143 + (float) arg1 + (float) arg2.anInt4673 / 2.0F, 4096, (int) (-local129 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "(I)V")
	public static void method6406() {
		if (Static299.anInt5549 != -1) {
			Static244.method4185(false, -1, -1, Static299.anInt5549);
			Static299.anInt5549 = -1;
		}
	}
}
