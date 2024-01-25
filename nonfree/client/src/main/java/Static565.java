import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!uba", name = "e", descriptor = "Lclient!hca;")
	public static final Class139 aClass139_15 = new Class139();

	@OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
	public static final int anInt8007 = 4;

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIII)I")
	public static int method6917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return 4095 - arg2;
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IZIIII)V")
	public static void method6918(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg3 + 1;
		Static82.method1400(arg0, arg1, arg4, Static71.anIntArrayArray5[arg3]);
		@Pc(21) int local21 = arg2 - 1;
		Static82.method1400(arg0, arg1, arg4, Static71.anIntArrayArray5[arg2]);
		for (@Pc(25) int local25 = local12; local25 <= local21; local25++) {
			@Pc(31) int[] local31 = Static71.anIntArrayArray5[local25];
			local31[arg1] = local31[arg4] = arg0;
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILclient!uv;)Lclient!uv;")
	public static Class344 method6923(@OriginalArg(1) Class344 arg0) {
		if (arg0.anInt9632 != -1) {
			return Static324.method5363(arg0.anInt9632);
		}
		@Pc(21) int local21 = arg0.anInt9571 >>> 16;
		@Pc(26) Class332 local26 = new Class332(Static128.aClass25_7);
		for (@Pc(31) Class3_Sub1 local31 = (Class3_Sub1) local26.method7958(); local31 != null; local31 = (Class3_Sub1) local26.method7960()) {
			if (local31.anInt24 == local21) {
				return Static324.method5363((int) local31.aLong277);
			}
		}
		return null;
	}
}
