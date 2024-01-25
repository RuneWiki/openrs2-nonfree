import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!rba", name = "k", descriptor = "Lclient!qr;")
	public static Class270 aClass270_3;

	@OriginalMember(owner = "client!rba", name = "h", descriptor = "Lclient!fv;")
	public static final Class112 aClass112_10 = new Class112(7, 0, 1, 1);

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I[Lclient!ep;I)V")
	public static void method6627(@OriginalArg(0) int arg0, @OriginalArg(1) Class93[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class93 local17 = arg1[local11];
			if (local17 != null) {
				if (local17.anInt2823 == 0) {
					if (local17.aClass93Array4 != null) {
						method6627(arg0, local17.aClass93Array4);
					}
					@Pc(38) Class6_Sub48 local38 = (Class6_Sub48) Static459.aClass305_24.method7447((long) local17.anInt2790);
					if (local38 != null) {
						Static417.method6511(local38.anInt9207, arg0);
					}
				}
				@Pc(57) Class6_Sub38 local57;
				if (arg0 == 0 && local17.anObjectArray21 != null) {
					local57 = new Class6_Sub38();
					local57.anObjectArray36 = local17.anObjectArray21;
					local57.aClass93_14 = local17;
					Static89.method1979(local57);
				}
				if (arg0 == 1 && local17.anObjectArray32 != null) {
					if (local17.anInt2806 >= 0) {
						@Pc(85) Class93 local85 = Static223.method4011(local17.anInt2790);
						if (local85 == null || local85.aClass93Array4 == null || local85.aClass93Array4.length <= local17.anInt2806 || local17 != local85.aClass93Array4[local17.anInt2806]) {
							continue;
						}
					}
					local57 = new Class6_Sub38();
					local57.anObjectArray36 = local17.anObjectArray32;
					local57.aClass93_14 = local17;
					Static89.method1979(local57);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZI)V")
	public static void method6629(@OriginalArg(1) int arg0) {
		if (Static158.anIntArray236 == null || Static158.anIntArray236.length < arg0) {
			Static158.anIntArray236 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V")
	public static void method6630() {
		Static392.aClass245_54.method6079();
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6631(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(11) Class6_Sub41 local11 = null;
		for (@Pc(16) Class6_Sub41 local16 = (Class6_Sub41) Static532.aClass211_72.method5183(); local16 != null; local16 = (Class6_Sub41) Static532.aClass211_72.method5177()) {
			if (local16.anInt8271 == arg6 && arg2 == local16.anInt8273 && local16.anInt8275 == arg5 && arg4 == local16.anInt8274) {
				local11 = local16;
				break;
			}
		}
		if (local11 == null) {
			local11 = new Class6_Sub41();
			local11.anInt8271 = arg6;
			local11.anInt8275 = arg5;
			local11.anInt8274 = arg4;
			local11.anInt8273 = arg2;
			if (arg2 >= 0 && arg5 >= 0 && Static228.anInt4746 > arg2 && Static44.anInt1275 > arg5) {
				Static276.method4587(local11);
			}
			Static532.aClass211_72.method5173(local11);
		}
		local11.anInt8266 = 0;
		local11.anInt8267 = -1;
		local11.anInt8272 = arg3;
		local11.anInt8276 = arg1;
		local11.anInt8265 = arg0;
	}
}
