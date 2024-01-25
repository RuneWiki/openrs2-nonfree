import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!ur", name = "u", descriptor = "I")
	public static int anInt7132;

	@OriginalMember(owner = "client!ur", name = "r", descriptor = "Lclient!la;")
	public static final Class136 aClass136_190 = new Class136(72, 28);

	@OriginalMember(owner = "client!ur", name = "s", descriptor = "Lclient!la;")
	public static final Class136 aClass136_191 = new Class136(33, 6);

	@OriginalMember(owner = "client!ur", name = "t", descriptor = "I")
	public static int anInt7131 = 0;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIBI)V")
	public static void method5768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			Static307.method4633(Static381.aClass163_163);
		}
		if (arg2 == 1) {
			Static307.method4633(Static361.aClass163_152);
		}
		Static243.aClass3_Sub25_Sub1_7.method4123(arg0 + Static49.anInt873);
		Static243.aClass3_Sub25_Sub1_7.method4077(arg1 + Static59.anInt1127);
		Static243.aClass3_Sub25_Sub1_7.method4090(Static137.aClass143_1.method5471(82) ? 1 : 0);
		Static31.anInt592 = arg1;
		Static392.anInt6568 = arg0;
		Static356.aBoolean488 = false;
		Static336.method4668();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZIIIII)V")
	public static void method5769(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(21) int local21 = Static140.method2151(Static316.anInt5349, Static418.anInt7030, arg0);
		@Pc(27) int local27 = Static140.method2151(Static316.anInt5349, Static418.anInt7030, arg2);
		@Pc(33) int local33 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg1);
		@Pc(39) int local39 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg3);
		for (@Pc(41) int local41 = local21; local41 <= local27; local41++) {
			Static201.method3084(Static296.anIntArrayArray42[local41], local33, local39, arg4);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!dq;I)[Lclient!sd;")
	public static Class219[] method5774(@OriginalArg(0) Class51 arg0) {
		if (!arg0.method1367()) {
			return new Class219[0];
		}
		@Pc(21) Class181 local21 = arg0.method1379();
		while (local21.anInt5298 == 0) {
			Static83.method1499(10L);
		}
		if (local21.anInt5298 == 2) {
			return new Class219[0];
		}
		@Pc(42) int[] local42 = (int[]) local21.anObject7;
		@Pc(48) Class219[] local48 = new Class219[local42.length >> 2];
		for (@Pc(50) int local50 = 0; local50 < local48.length; local50++) {
			@Pc(56) Class219 local56 = new Class219();
			local48[local50] = local56;
			local56.anInt6272 = local42[local50 << 2];
			local56.anInt6273 = local42[(local50 << 2) + 1];
			local56.anInt6274 = local42[(local50 << 2) + 2];
			local56.anInt6270 = local42[(local50 << 2) + 3];
		}
		return local48;
	}
}
