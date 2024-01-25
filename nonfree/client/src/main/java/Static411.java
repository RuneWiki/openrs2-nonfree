import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
	public static int anInt6741;

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
	public static int anInt6739 = 0;

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "[I")
	public static final int[] anIntArray514 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "[B")
	public static final byte[] aByteArray95 = new byte[2048];

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)Lclient!ku;")
	public static Class3_Sub4 method5273() {
		@Pc(13) Class3_Sub4 local13 = (Class3_Sub4) Static325.aClass84_7.method2306();
		if (local13 == null) {
			return new Class3_Sub4();
		} else {
			Static389.anInt6526--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIII)V")
	public static void method5274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = Static323.aClass50_Sub1_1.anInt3439 * arg0 >> 8;
		if (local14 != 0 && arg2 != -1) {
			Static32.method625(local14, arg2, Static284.aClass76_55);
			Static436.aBoolean666 = true;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)Lclient!ua;")
	public static Class16_Sub3 method5275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static202.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class16_Sub3 local14 = local7.aClass16_Sub3_1;
			local7.aClass16_Sub3_1 = null;
			return local14;
		}
	}
}
