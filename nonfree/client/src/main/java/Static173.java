import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "Lclient!br;")
	public static Class21 aClass21_8;

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
	public static int anInt3688;

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
	public static int anInt3682 = 0;

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
	public static int anInt3686 = 0;

	@OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
	public static int anInt3687 = 0;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IBIII)V")
	public static void method3337(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static5.anInt2965 && arg2 <= Static220.anInt6565) {
			@Pc(15) int local15 = Static116.method2426(Static195.anInt4097, Static349.anInt6619, arg0);
			@Pc(21) int local21 = Static116.method2426(Static195.anInt4097, Static349.anInt6619, arg1);
			Static127.method2622(arg2, local15, arg3, local21);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!tj;)V")
	public static void method3338(@OriginalArg(1) Class193 arg0) {
		Static74.aClass193_21 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!sp;B)I")
	public static int method3340(@OriginalArg(0) Class4_Sub39 arg0) {
		@Pc(12) String local12 = Static218.method3959(arg0);
		@Pc(14) int[] local14 = null;
		if (Static152.method3020(arg0.anInt5716)) {
			local14 = Static177.method3465((int) arg0.aLong184).anIntArray496;
		} else if (Static304.method4987(arg0.anInt5716)) {
			@Pc(59) Class8_Sub1_Sub2_Sub2 local59 = Static169.aClass8_Sub1_Sub2_Sub2Array1[(int) arg0.aLong184];
			if (local59 != null) {
				local14 = local59.aClass141_1.anIntArray377;
			}
		} else if (Static183.method3518(arg0.anInt5716)) {
			if (arg0.anInt5716 == 1004) {
				local14 = Static113.method2380((int) arg0.aLong184).anIntArray21;
			} else {
				local14 = Static113.method2380((int) (arg0.aLong184 >>> 32 & 0x7FFFFFFFL)).anIntArray21;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static184.method3524(local14);
		}
		return Static348.aClass16_8.method324(local12, Static225.aClass58Array87);
	}
}
