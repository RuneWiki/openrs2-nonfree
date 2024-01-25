import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_68 = new Class71(96, 10);

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "Lclient!sq;")
	public static final Class316 aClass316_12 = new Class316(15, 0, 1, 0);

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(III)I")
	public static int method4614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILclient!ha;ZI)Lclient!ab;")
	public static Class3 method4616(@OriginalArg(1) Class16 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			return null;
		}
		if (Static232.anIntArray311 != null) {
			for (@Pc(15) int local15 = 0; local15 < Static232.anIntArray311.length; local15++) {
				if (arg2 == Static232.anIntArray311[local15]) {
					return Static510.aClass3Array1[local15];
				}
			}
		}
		@Pc(46) Class3 local46 = (Class3) Static594.aClass236_100.method6242((long) arg2);
		if (local46 != null) {
			if (arg1 && local46.aClass345_1 == null) {
				@Pc(58) Class345 local58 = Static549.method7716(Static503.aClass237_138, arg2);
				if (local58 == null) {
					return null;
				}
				local46.aClass345_1 = local58;
			}
			return local46;
		}
		@Pc(80) Class111[] local80 = Static647.method3298(Static115.aClass237_32, arg2);
		if (local80 == null) {
			return null;
		}
		@Pc(89) Class345 local89 = Static549.method7716(Static503.aClass237_138, arg2);
		if (local89 == null) {
			return null;
		}
		if (arg1) {
			local46 = new Class3(arg0.method6088(local89, local80), local89);
		} else {
			local46 = new Class3(arg0.method6088(local89, local80));
		}
		Static594.aClass236_100.method6241((long) arg2, local46);
		return local46;
	}
}
