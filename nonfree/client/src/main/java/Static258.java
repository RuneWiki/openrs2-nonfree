import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
	public static int anInt5020;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "[I")
	public static final int[] anIntArray387 = new int[6];

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)I")
	public static int method4478(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)Lclient!mb;")
	public static Class25_Sub3 method4479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass25_Sub3_2;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)I")
	public static int method4480() {
		return ((Static126.anInt2647 == 0 ? 0 : 1) << 20) + ((Static29.aBoolean56 ? 1 : 0) << 19) + ((Static67.aBoolean110 ? 1 : 0) << 9) + ((Static262.aBoolean384 ? 1 : 0) << 6) + (Static190.anInt3772 & 0x7) + ((Static193.aBoolean269 ? 1 : 0) << 3) + ((Static114.aBoolean158 ? 1 : 0) << 4) + ((Static22.aBoolean43 ? 1 : 0) << 5) + ((Static263.aBoolean385 ? 1 : 0) << 8) + ((Static267.aBoolean391 ? 1 : 0) << 10) + ((Static134.anInt2750 & 0x3) << 11) + ((Static8.aBoolean7 ? 1 : 0) << 13) + ((Static322.aBoolean457 ? 1 : 0) << 15) + ((Static18.aBoolean39 ? 1 : 0) << 16) + (Static335.anInt6338 << 17) + ((Static111.anInt2405 == 0 ? 0 : 1) << 21) + ((Static123.anInt2600 == 0 ? 0 : 1) << 22) + (Static13.method489() << 23) + (Static332.anInt6258 << 25) + ((Static90.aBoolean316 ? 1 : 0) << 27) + (Static355.anInt6625 << 28);
	}
}
