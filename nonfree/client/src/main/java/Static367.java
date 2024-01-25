import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!qr;")
	public static Class281 aClass281_1;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "Lclient!raa;")
	public static Class285 aClass285_1;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "Lclient!ut;")
	public static final Class345 aClass345_3 = new Class345(128);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!kha;Lclient!kha;Lclient!kha;ILclient!kha;)V")
	public static void method5893(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(4) Class181 arg3) {
		Static431.aClass181_80 = arg2;
		Static399.aClass181_76 = arg0;
		Static485.aClass181_99 = arg1;
		Static85.aClass108ArrayArray2 = new Class108[Static399.aClass181_76.method5029()][];
		Static171.aBooleanArray11 = new boolean[Static399.aClass181_76.method5029()];
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ha;IIIIIII)V")
	public static void method5894(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4) {
		arg0.method6209(arg4, arg1, arg2, arg3, -10660793);
		arg0.method6209(arg4 + 1, arg1 + -2, 16, arg3 + 1, -16777216);
		arg0.method6156(arg1 - 2, arg3 - -1, arg2 - 19, -16777216, arg4 + 18);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([[BBLclient!tha;)V")
	public static void method5895(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class132_Sub1 arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.anInt9342; local3++) {
			Static14.method8598();
			for (@Pc(9) int local9 = 0; local9 < Static394.anInt7540 >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static462.anInt8391 >> 3; local13++) {
					@Pc(23) int local23 = Static27.anIntArrayArrayArray1[local3][local9][local13];
					if (local23 != -1) {
						@Pc(32) int local32 = local23 >> 24 & 0x3;
						if (!arg1.aBoolean787 || local32 == 0) {
							@Pc(46) int local46 = local23 >> 1 & 0x3;
							@Pc(52) int local52 = local23 >> 14 & 0x3FF;
							@Pc(58) int local58 = local23 >> 3 & 0x7FF;
							@Pc(68) int local68 = local58 / 8 + (local52 / 8 << 8);
							for (@Pc(70) int local70 = 0; local70 < Static475.anIntArray531.length; local70++) {
								if (local68 == Static475.anIntArray531[local70] && arg0[local70] != null) {
									arg1.method7722((local58 & 0x7) * 8, Static47.aClass33_3, arg0[local70], local46, local9 * 8, local32, Static334.aClass291Array20, local3, (local52 & 0x7) * 8, local13 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
