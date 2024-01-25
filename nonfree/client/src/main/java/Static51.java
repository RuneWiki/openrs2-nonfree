import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cr", name = "Z", descriptor = "Lclient!am;")
	public static Class11 aClass11_18;

	@OriginalMember(owner = "client!cr", name = "S", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_16 = new Class154(2);

	@OriginalMember(owner = "client!cr", name = "X", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_9 = new Class198(8);

	@OriginalMember(owner = "client!cr", name = "ab", descriptor = "I")
	public static int anInt1146 = 0;

	@OriginalMember(owner = "client!cr", name = "bb", descriptor = "I")
	public static int anInt1147 = 0;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B[B)[B")
	public static byte[] method954(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class4_Sub7 local8 = new Class4_Sub7(arg0);
		@Pc(12) int local12 = local8.method2380();
		@Pc(16) int local16 = local8.method2389();
		if (local16 < 0 || Static230.anInt4801 != 0 && local16 > Static230.anInt4801) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(56) byte[] local56 = new byte[local16];
			local8.method2381(local56, local16);
			return local56;
		} else {
			@Pc(68) int local68 = local8.method2389();
			if (local68 < 0 || Static230.anInt4801 != 0 && Static230.anInt4801 < local68) {
				throw new RuntimeException();
			}
			@Pc(85) byte[] local85 = new byte[local68];
			if (local12 == 1) {
				Static34.method558(local85, local68, arg0, local16);
			} else {
				Static80.aClass8_1.method234(local8, local85);
			}
			return local85;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIBIIIIIII)V")
	public static void method956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class4_Sub34 local7 = new Class4_Sub34();
		local7.anInt5235 = arg10;
		local7.anInt5222 = arg4;
		local7.anInt5227 = arg5;
		local7.anInt5238 = arg9;
		local7.anInt5232 = arg11;
		local7.anInt5223 = arg0;
		local7.anInt5234 = arg2;
		local7.anInt5229 = arg3;
		local7.anInt5226 = arg8;
		local7.anInt5224 = arg1;
		local7.anInt5230 = arg7;
		local7.anInt5236 = arg6;
		Static320.aClass130_142.method3510(local7);
	}
}
