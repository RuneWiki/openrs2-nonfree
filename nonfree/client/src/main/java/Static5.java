import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "Lclient!dp;")
	public static Class53 aClass53_8;

	@OriginalMember(owner = "client!ae", name = "S", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
	public static int anInt98;

	@OriginalMember(owner = "client!ae", name = "W", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ae", name = "Y", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
	public static volatile int anInt94 = 0;

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "Lclient!ce;")
	public static final Class31 aClass31_1 = new Class31(64);

	@OriginalMember(owner = "client!ae", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString8 = "wave2:";

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)V")
	public static void method94() {
		Static353.aClass40_20 = null;
		Static196.aClass40_12 = null;
		Static318.aClass40_17 = null;
		Static237.aClass40_13 = null;
		Static125.aClass40_4 = null;
		Static327.aClass40_6 = null;
		Static288.aClass40_15 = null;
		Static253.aClass40_14 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!mb;Lclient!of;IIIILclient!rn;I)V")
	public static void method96(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class74 arg6) {
		if (arg1 == null) {
			return;
		}
		@Pc(19) int local19;
		if (Static334.anInt6112 == 4) {
			local19 = (int) Static117.aFloat58 & 0x3FFF;
		} else {
			local19 = (int) Static117.aFloat58 + Static345.anInt6260 & 0x3FFF;
		}
		@Pc(41) int local41 = Math.max(arg0.anInt3507 / 2, arg0.anInt3503 / 2) + 10;
		@Pc(49) int local49 = arg5 * arg5 + arg2 * arg2;
		if (local41 * local41 < local49) {
			return;
		}
		@Pc(59) int local59 = Class207.anIntArray697[local19];
		@Pc(63) int local63 = Class207.anIntArray698[local19];
		if (Static334.anInt6112 != 4) {
			local63 = local63 * 256 / (Static279.anInt5302 + 256);
			local59 = local59 * 256 / (Static279.anInt5302 + 256);
		}
		@Pc(92) int local92 = local63 * arg2 + arg5 * local59 >> 15;
		@Pc(103) int local103 = local63 * arg5 - arg2 * local59 >> 15;
		arg1.method5069(local92 + arg0.anInt3507 / 2 + arg4 - arg1.method5083() / 2, -local103 + arg3 + arg0.anInt3503 / 2 - arg1.method5084() / 2, arg6, arg4, arg3);
	}
}
