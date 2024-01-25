import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!im", name = "L", descriptor = "Lclient!maa;")
	public static final Class195 aClass195_5 = new Class195("", 10);

	@OriginalMember(owner = "client!im", name = "N", descriptor = "J")
	public static long aLong90 = -1L;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIZIIIIII)Z")
	public static boolean method3563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray638[0];
		@Pc(13) int local13 = Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray637[0];
		if (local8 < 0 || Static18.anInt5706 <= local8 || local13 < 0 || Static80.anInt1367 <= local13) {
			return false;
		} else if (arg4 >= 0 && Static18.anInt5706 > arg4 && arg7 >= 0 && Static80.anInt1367 > arg7) {
			@Pc(69) int local69 = Static415.method5914(arg3, arg7, Static30.aClass138Array1[Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98], arg2, Static384.anIntArray497, arg4, arg1, local13, arg0, Static512.anIntArray627, local8, arg5, Static461.aClass15_Sub2_Sub4_Sub2_2.method7135(), arg6);
			if (local69 < 1) {
				return false;
			}
			Static567.anInt9818 = Static512.anIntArray627[local69 - 1];
			Static542.anInt9320 = Static384.anIntArray497[local69 - 1];
			Static243.aBoolean327 = false;
			Static398.method5755();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V")
	public static void method3565() {
		if (Static309.anInterface6Array1 == null) {
			return;
		}
		@Pc(5) Interface6[] local5 = Static309.anInterface6Array1;
		for (@Pc(7) int local7 = 0; local7 < local5.length; local7++) {
			@Pc(13) Interface6 local13 = local5[local7];
			local13.method3969();
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIB)V")
	public static void method3566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class6_Sub5_Sub8 local12 = Static49.method760(13, arg0);
		local12.method3256();
		local12.anInt3740 = arg1;
	}
}
