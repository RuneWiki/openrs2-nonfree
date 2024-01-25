import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "zb", descriptor = "Z")
	public static boolean aBoolean55 = false;

	@OriginalMember(owner = "client!ag", name = "Bb", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!ag", name = "Eb", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_4 = new Class130(80, 8);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V")
	public static void method830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static525.anInt4723;
		@Pc(7) int local7 = Static52.anInt1497;
		if (Static219.aBoolean285) {
			local5 += Static30.method1089();
			local7 += Static166.method2921();
		}
		@Pc(30) Class24 local30;
		if (Static501.anInt8621 == 1) {
			local30 = Static101.aClass24Array6[Static215.anInt4075 / 100];
			local30.method8559(local5 - 8, local7 + -8);
			Static520.method8069(local5 - 8, local7 + -8, local5 + local30.method8576() - 8, local30.method8573() + -8 + local7);
		}
		if (Static501.anInt8621 == 2) {
			local30 = Static101.aClass24Array6[Static215.anInt4075 / 100 + 4];
			local30.method8559(local5 - 8, local7 + -8);
			Static520.method8069(local5 - 8, local7 + -8, local5 + local30.method8576() - 8, local7 + -8 + local30.method8573());
		}
		Static74.method1763();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!aa;IIJLclient!qk;IIBI)V")
	public static void method832(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) Class279 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = arg7 * arg7 + arg1 * arg1;
		if ((long) local12 > arg3) {
			return;
		}
		@Pc(41) int local41 = Math.min(arg4.anInt8153 / 2, arg4.anInt8141 / 2);
		if (local12 <= local41 * local41) {
			Static506.method7464(arg5, Static524.aClass24Array17[arg6], arg0, arg7, arg1, arg2, arg4);
			return;
		}
		local41 -= 10;
		@Pc(63) int local63;
		if (Static305.anInt5422 == 4) {
			local63 = (int) Static401.aFloat165 & 0x3FFF;
		} else {
			local63 = Static226.anInt1879 + (int) Static401.aFloat165 & 0x3FFF;
		}
		@Pc(74) int local74 = Class21.anIntArray656[local63];
		@Pc(78) int local78 = Class21.anIntArray655[local63];
		if (Static305.anInt5422 != 4) {
			local74 = local74 * 256 / (Static517.anInt8961 + 256);
			local78 = local78 * 256 / (Static517.anInt8961 + 256);
		}
		@Pc(107) int local107 = local74 * arg1 + local78 * arg7 >> 14;
		@Pc(118) int local118 = local78 * arg1 - arg7 * local74 >> 14;
		@Pc(124) double local124 = Math.atan2((double) local107, (double) local118);
		@Pc(131) int local131 = (int) (Math.sin(local124) * (double) local41);
		@Pc(138) int local138 = (int) (Math.cos(local124) * (double) local41);
		Static622.aClass24Array20[arg6].method8568((float) arg4.anInt8153 / 2.0F + (float) arg5 + (float) local131, (float) arg2 + (float) arg4.anInt8141 / 2.0F - (float) local138, 4096, (int) (-local124 / 6.283185307179586D * 65535.0D));
	}
}
