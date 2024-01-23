import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!fh;")
	public static Class58 aClass58_87;

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
	public static int anInt4710 = -1;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!fh;I)Lclient!ma;")
	public static Class56 method3915(@OriginalArg(1) Class58 arg0, @OriginalArg(2) int arg1) {
		return Static265.method4168(arg0, arg1) ? Static13.method204() : null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method3916() {
		Static164.method2665(0, 0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Lclient!vl;")
	public static Class186 method3918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class186 local14 = local7.aClass186_1;
			local7.aClass186_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I")
	public static int method3919(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!fh;)V")
	public static void method3921(@OriginalArg(1) Class58 arg0) {
		Static229.aClass58_84 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)V")
	public static void method3922(@OriginalArg(0) int arg0) {
		if (Static310.anIntArray678 == null || Static310.anIntArray678.length < arg0) {
			Static310.anIntArray678 = new int[arg0];
		}
	}
}
