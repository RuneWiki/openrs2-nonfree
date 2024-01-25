import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!et", name = "c", descriptor = "[I")
	public static final int[] anIntArray144 = new int[8];

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	public static void method2555() {
		@Pc(12) int local12 = 0;
		if (Static713.aClass3_Sub55_31 != null) {
			local12 = Static713.aClass3_Sub55_31.aClass15_Sub24_1.method8063();
		}
		@Pc(49) int local49;
		@Pc(66) int local66;
		if (local12 == 2) {
			local49 = Static554.anInt9243 > 800 ? 800 : Static554.anInt9243;
			local66 = Static57.anInt8465 > 600 ? 600 : Static57.anInt8465;
			Static575.anInt9435 = local49;
			Static676.anInt10698 = (Static554.anInt9243 - local49) / 2;
			Static272.anInt5005 = local66;
			Static306.anInt5502 = 0;
		} else if (local12 == 1) {
			local49 = Static554.anInt9243 > 1024 ? 1024 : Static554.anInt9243;
			Static676.anInt10698 = (Static554.anInt9243 - local49) / 2;
			local66 = Static57.anInt8465 > 768 ? 768 : Static57.anInt8465;
			Static575.anInt9435 = local49;
			Static272.anInt5005 = local66;
			Static306.anInt5502 = 0;
		} else {
			Static575.anInt9435 = Static554.anInt9243;
			Static306.anInt5502 = 0;
			Static676.anInt10698 = 0;
			Static272.anInt5005 = Static57.anInt8465;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIII)I")
	public static int method2556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(12) int local12 = arg2;
			arg2 = arg3;
			arg3 = local12;
		}
		@Pc(20) int local20 = arg0 & 0x3;
		if (local20 == 0) {
			return arg4;
		} else if (local20 == 1) {
			return 7 + 1 - arg5 - arg2;
		} else if (local20 == 2) {
			return 1 + 7 - arg3 - arg4;
		} else {
			return arg5;
		}
	}
}
