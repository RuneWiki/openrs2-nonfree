import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!pha", name = "c", descriptor = "I")
	public static int anInt7749;

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(FIIZIIIII)[[I")
	public static int[][] method6675(@OriginalArg(0) float arg0) {
		@Pc(17) int[][] local17 = new int[256][64];
		@Pc(21) Class5_Sub1_Sub22 local21 = new Class5_Sub1_Sub22();
		local21.aBoolean561 = false;
		local21.anInt7271 = 3;
		local21.anInt7263 = 4;
		local21.anInt7260 = (int) (arg0 * 4096.0F);
		local21.anInt7266 = 4;
		local21.method9204();
		Static345.method5217(256, 64);
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			local21.method6284(local48, local17[local48]);
		}
		return local17;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lclient!c;IILclient!ha;II)V")
	public static void method6676(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class57 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class289 local9 = Static645.aClass256_4.method5935(arg0.anInt937);
		if (local9.anInt8034 == -1) {
			return;
		}
		if (arg0.aBoolean82) {
			@Pc(23) int local23 = arg4 + arg0.anInt941;
			arg4 = local23 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(39) Class134 local39 = local9.method6920(arg4, arg0.aBoolean88, arg2);
		if (local39 == null) {
			return;
		}
		@Pc(46) int local46 = arg0.anInt958;
		@Pc(57) int local57 = arg0.anInt954;
		if ((arg4 & 0x1) == 1) {
			local57 = arg0.anInt958;
			local46 = arg0.anInt954;
		}
		@Pc(71) int local71 = local39.method9231();
		@Pc(74) int local74 = local39.method9232();
		if (local9.aBoolean604) {
			local71 = local46 * 4;
			local74 = local57 * 4;
		}
		if (local9.anInt8036 == 0) {
			local39.method9227(arg1, arg3 - (local57 - 1) * 4, local71, local74);
		} else {
			local39.method9226(arg1, arg3 + 4 - local57 * 4, local71, local74, 0, local9.anInt8036 | 0xFF000000, 1);
		}
	}
}
