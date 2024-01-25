import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
	public static int anInt2536;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "Lclient!d;")
	public static Interface7 anInterface7_5;

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
	public static int anInt2537;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
	public static int anInt2540;

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
	public static int anInt2541;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
	public static int anInt2534 = 0;

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "Lclient!gea;")
	public static final Class117 aClass117_1 = new Class117(128);

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!sba;BI)Ljava/lang/String;")
	public static String method2153(@OriginalArg(0) Class302 arg0, @OriginalArg(2) int arg1) {
		if (!Static75.method2151(arg0).method8490(arg1) && arg0.anObjectArray28 == null) {
			return null;
		} else if (arg0.aStringArray30 == null || arg1 >= arg0.aStringArray30.length || arg0.aStringArray30[arg1] == null || arg0.aStringArray30[arg1].trim().length() == 0) {
			return Static30.aBoolean78 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray30[arg1];
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I")
	public static int method2154(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		local60 /= 6.0D;
		@Pc(161) int local161 = (int) (local60 * 256.0D);
		@Pc(166) int local166 = (int) (local62 * 256.0D);
		if (local166 < 0) {
			local166 = 0;
		} else if (local166 > 255) {
			local166 = 255;
		}
		@Pc(182) int local182 = (int) (local68 * 256.0D);
		if (local182 < 0) {
			local182 = 0;
		} else if (local182 > 255) {
			local182 = 255;
		}
		if (local182 > 243) {
			local166 >>= 0x4;
		} else if (local182 > 217) {
			local166 >>= 0x3;
		} else if (local182 > 192) {
			local166 >>= 0x2;
		} else if (local182 > 179) {
			local166 >>= 0x1;
		}
		return (local166 >> 5 << 7) + ((local161 & 0xFF) >> 2 << 10) + (local182 >> 1);
	}
}
