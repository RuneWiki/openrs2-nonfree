import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Lclient!bt;")
	public static Class34 aClass34_28;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILclient!fs;)V")
	public static void method2185(@OriginalArg(0) int arg0, @OriginalArg(2) Class124 arg1) {
		if (Static655.anInt10336 >= 50 || (arg1 == null || arg1.anIntArrayArray16 == null || arg0 >= arg1.anIntArrayArray16.length || arg1.anIntArrayArray16[arg0] == null)) {
			return;
		}
		@Pc(41) int local41 = arg1.anIntArrayArray16[arg0][0];
		@Pc(45) int local45 = local41 >> 8;
		@Pc(51) int local51 = local41 >> 5 & 0x7;
		@Pc(70) int local70;
		if (arg1.anIntArrayArray16[arg0].length > 1) {
			local70 = (int) ((double) arg1.anIntArrayArray16[arg0].length * Math.random());
			if (local70 > 0) {
				local45 = arg1.anIntArrayArray16[arg0][local70];
			}
		}
		local70 = 256;
		if (arg1.anIntArray222 != null && arg1.anIntArray225 != null) {
			local70 = Static84.method1756(arg1.anIntArray225[arg0], arg1.anIntArray222[arg0]);
		}
		if (arg1.aBoolean220) {
			Static412.method5195(local70, 255, local51, local45, false, 0);
		} else {
			Static430.method5939(0, local45, local70, local51, 255);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)I")
	public static int method2186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg1 >> 1) + (((arg0 >> 2 & 0x3F) << 10) + (arg2 >> 5 << 7));
	}
}
