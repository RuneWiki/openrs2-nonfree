import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
	public static int anInt3590;

	@OriginalMember(owner = "client!ke", name = "Q", descriptor = "F")
	public static float aFloat89;

	@OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
	public static int anInt3592;

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_87 = new Class129(56, 0);

	@OriginalMember(owner = "client!ke", name = "L", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_57 = new Class198("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!ke", name = "M", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_58 = new Class194(79, 12);

	@OriginalMember(owner = "client!ke", name = "N", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_59 = new Class194(8, -1);

	@OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
	public static int anInt3591 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BIIIII)V")
	public static void method2843(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(46) int local46 = local17 - local25 * (local29 - 1);
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = local25 * ((arg0 << 1) - 3);
		@Pc(81) int local81 = local54;
		@Pc(101) int local101;
		@Pc(109) int local109;
		if (Static356.anInt5817 <= arg1 && Static3.anInt46 >= arg1) {
			local101 = Static391.method5106(Static3.anInt45, arg2 + arg4, Static112.anInt1900);
			local109 = Static391.method5106(Static3.anInt45, arg2 - arg4, Static112.anInt1900);
			Static291.method3606(local101, Static133.anIntArrayArray15[arg1], arg3, local109);
		}
		@Pc(123) int local123 = (arg0 - 1) * local50;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local46 += local81;
					local38 += local62;
					local7++;
					local81 += local54;
					local62 += local54;
				}
			}
			if (local46 < 0) {
				local46 += local81;
				local38 += local62;
				local81 += local54;
				local7++;
				local62 += local54;
			}
			local38 += -local123;
			local46 += -local70;
			local70 -= local50;
			local9--;
			local123 -= local50;
			local101 = arg1 - local9;
			local109 = local9 + arg1;
			if (local109 >= Static356.anInt5817 && local101 <= Static3.anInt46) {
				@Pc(209) int local209 = Static391.method5106(Static3.anInt45, local7 + arg2, Static112.anInt1900);
				@Pc(220) int local220 = Static391.method5106(Static3.anInt45, arg2 - local7, Static112.anInt1900);
				if (local101 >= Static356.anInt5817) {
					Static291.method3606(local209, Static133.anIntArrayArray15[local101], arg3, local220);
				}
				if (local109 <= Static3.anInt46) {
					Static291.method3606(local209, Static133.anIntArrayArray15[local109], arg3, local220);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIILclient!um;)Lclient!ap;")
	public static Class14 method2844(@OriginalArg(2) int arg0, @OriginalArg(3) Class243 arg1) {
		@Pc(19) byte[] local19 = arg1.method5455(0, arg0);
		return local19 == null ? null : new Class14(local19);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IF)F")
	public static float method2845(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)[B")
	public static byte[] method2846(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub2_Sub2 local12 = (Class5_Sub2_Sub2) Static127.aClass261_1.method5897((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
				@Pc(46) int local46 = 255 - local40;
				@Pc(51) int local51 = Static44.method700(local46, local23);
				@Pc(55) byte local55 = local17[local51];
				local17[local51] = local17[local46];
				local17[local46] = local17[511 - local40] = local55;
			}
			local12 = new Class5_Sub2_Sub2(local17);
			Static127.aClass261_1.method5900((long) arg0, local12);
		}
		return local12.aByteArray6;
	}
}
