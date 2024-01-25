import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!og", name = "c", descriptor = "[I")
	public static final int[] anIntArray384 = new int[6];

	@OriginalMember(owner = "client!og", name = "d", descriptor = "[I")
	public static final int[] anIntArray385 = new int[4096];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)Lclient!mr;")
	public static Class236_Sub1 method5921(@OriginalArg(1) int arg0) {
		return Static407.aBoolean470 && arg0 >= Static77.anInt1372 && Static195.anInt3524 >= arg0 ? Static257.aClass236_Sub1Array1[arg0 - Static77.anInt1372] : null;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIZZ)I")
	public static int method5922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class3_Sub21 local10 = Static586.method7782(arg0, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray174.length; local18++) {
			if (local10.anIntArray174[local18] >= 0 && local10.anIntArray174[local18] < Static117.aClass197_2.anInt5259) {
				@Pc(40) Class15 local40 = Static117.aClass197_2.method4518(local10.anIntArray174[local18]);
				@Pc(50) int local50 = local40.method461(Static389.aClass335_2.method7504(arg1).anInt7362, arg1);
				if (arg2) {
					local16 += local50 * local10.anIntArray175[local18];
				} else {
					local16 += local50;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIZLclient!ofa;Lclient!aa;Lclient!hh;)V")
	public static void method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class265 arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) Class6 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(19) int local19;
		if (Static451.anInt7263 == 4) {
			local19 = (int) Static318.aFloat81 & 0x3FFF;
		} else {
			local19 = (int) Static318.aFloat81 + Static234.anInt4142 & 0x3FFF;
		}
		@Pc(38) int local38 = Math.max(arg4.anInt7024 / 2, arg4.anInt6997 / 2) + 10;
		@Pc(46) int local46 = arg0 * arg0 + arg1 * arg1;
		if (local38 * local38 < local46) {
			return;
		}
		@Pc(64) int local64 = Class94.anIntArray561[local19];
		@Pc(68) int local68 = Class94.anIntArray560[local19];
		if (Static451.anInt7263 != 4) {
			local64 = local64 * 256 / (Static30.anInt1549 + 256);
			local68 = local68 * 256 / (Static30.anInt1549 + 256);
		}
		@Pc(97) int local97 = arg0 * local64 + local68 * arg1 >> 14;
		@Pc(108) int local108 = arg0 * local68 - local64 * arg1 >> 14;
		arg6.method5131(local97 + arg4.anInt7024 / 2 + arg2 - arg6.method5130() / 2, arg3 - -(arg4.anInt6997 / 2) - (local108 + arg6.method5134() / 2), arg5, arg2, arg3);
	}
}
