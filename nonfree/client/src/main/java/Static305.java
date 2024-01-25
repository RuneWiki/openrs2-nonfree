import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
	public static int anInt6170;

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
	public static int anInt6172;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIILclient!aa;Lclient!ha;ILclient!sba;II)V")
	public static void method5160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(6) Class302 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(23) Class36 local23 = Static385.aClass345_2.method8044(arg1);
		if (local23 == null || !local23.aBoolean139 || !local23.method1623(Static140.aClass157_1)) {
			return;
		}
		@Pc(43) int local43;
		if (local23.anIntArray49 != null) {
			@Pc(41) int[] local41 = new int[local23.anIntArray49.length];
			@Pc(55) int local55;
			@Pc(66) int local66;
			@Pc(70) int local70;
			for (local43 = 0; local43 < local41.length / 2; local43++) {
				if (Static554.anInt9497 == 4) {
					local55 = (int) Static595.aFloat184 & 0x3FFF;
				} else {
					local55 = (int) Static595.aFloat184 + Static372.anInt7080 & 0x3FFF;
				}
				local66 = Class78_Sub2_Sub2.anIntArray270[local55];
				local70 = Class78_Sub2_Sub2.anIntArray271[local55];
				if (Static554.anInt9497 != 4) {
					local70 = local70 * 256 / (Static289.anInt10738 + 256);
					local66 = local66 * 256 / (Static289.anInt10738 + 256);
				}
				local41[local43 * 2] = arg6 + arg5.anInt8909 / 2 + (local66 * (local23.anIntArray49[local43 * 2 - -1] * 4 + arg7) - -(local70 * (arg0 - -(local23.anIntArray49[local43 * 2] * 4))) >> 14);
				local41[local43 * 2 + 1] = arg5.anInt8872 / 2 + arg2 - (local70 * (local23.anIntArray49[local43 * 2 + 1] * 4 + arg7) - local66 * (local23.anIntArray49[local43 * 2] * 4 + arg0) >> 14);
			}
			Static261.method4621(arg4, local41, local23.anInt1758, arg5.anIntArray451, arg5.anIntArray458);
			if (local23.anInt1759 <= 0) {
				for (local55 = 0; local55 < local41.length / 2 - 1; local55++) {
					arg4.method6172(local41[local55 * 2], local41[local55 * 2 + 1], local41[local55 * 2 + 2], local41[local55 * 2 + 2 + 1], local23.anIntArray48[local23.aByteArray8[local55] & 0xFF], arg3, arg6, arg2);
				}
				arg4.method6172(local41[local41.length - 2], local41[local41.length - 1], local41[0], local41[1], local23.anIntArray48[local23.aByteArray8[local23.aByteArray8.length - 1] & 0xFF], arg3, arg6, arg2);
			} else {
				@Pc(322) int local322;
				@Pc(332) int local332;
				@Pc(337) int local337;
				@Pc(341) int local341;
				for (local55 = 0; local55 < local41.length / 2 - 1; local55++) {
					local66 = local41[local55 * 2];
					local70 = local41[local55 * 2 + 1];
					local322 = local41[(local55 + 1) * 2];
					local332 = local41[(local55 + 1) * 2 + 1];
					if (local66 > local322) {
						local337 = local66;
						local66 = local322;
						local341 = local70;
						local70 = local332;
						local322 = local337;
						local332 = local341;
					} else if (local322 == local66 && local70 > local332) {
						local337 = local70;
						local70 = local332;
						local332 = local337;
					}
					arg4.method6155(local66, local70, local322, local332, local23.anIntArray48[local23.aByteArray8[local55] & 0xFF], arg3, arg6, arg2, local23.anInt1759, local23.anInt1763, local23.anInt1738);
				}
				local66 = local41[local41.length - 2];
				local70 = local41[local41.length - 1];
				local322 = local41[0];
				local332 = local41[1];
				if (local322 < local66) {
					local337 = local66;
					local341 = local70;
					local66 = local322;
					local322 = local337;
					local70 = local332;
					local332 = local341;
				} else if (local322 == local66 && local70 > local332) {
					local337 = local70;
					local70 = local332;
					local332 = local337;
				}
				arg4.method6155(local66, local70, local322, local332, local23.anIntArray48[local23.aByteArray8[local23.aByteArray8.length - 1] & 0xFF], arg3, arg6, arg2, local23.anInt1759, local23.anInt1763, local23.anInt1738);
			}
		}
		@Pc(485) Class4 local485 = null;
		if (local23.anInt1753 != -1) {
			local485 = local23.method1626(arg4, false);
			if (local485 != null) {
				Static8.method485(arg2, arg7, arg6, arg5, arg3, arg0, local485);
			}
		}
		if (local23.aString9 == null) {
			return;
		}
		local43 = 0;
		if (local485 != null) {
			local43 = local485.method7694();
		}
		@Pc(519) Class34 local519 = Static588.aClass34_14;
		@Pc(521) Class213 local521 = Static150.aClass213_4;
		if (local23.anInt1772 == 1) {
			local521 = Static184.aClass213_5;
			local519 = Static359.aClass34_7;
		}
		if (local23.anInt1772 == 2) {
			local521 = Static2.aClass213_9;
			local519 = Static537.aClass34_12;
		}
		Static318.method5305(arg0, arg6, local521, arg2, arg5, local43, local23.aString9, arg3, local23.anInt1767, arg7, local519);
		return;
	}
}
