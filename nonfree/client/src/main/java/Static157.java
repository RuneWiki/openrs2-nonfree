import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_23;

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "[J")
	public static final long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_936 = Static181.method2795("leuchten1:");

	@OriginalMember(owner = "client!qe", name = "O", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!eh;Z)V")
	public static void method2383(@OriginalArg(0) Class28 arg0) {
		Static89.aClass28_205 = arg0;
		Static182.anInt3710 = Static89.aClass28_205.method846(16);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ra;I)Lclient!qe;")
	public static Class83 method2393(@OriginalArg(0) Class2_Sub3 arg0) {
		return Static128.method2164(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public static void method2394() {
		Static15.aClass86_8.method2641();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!eh;)V")
	public static void method2411(@OriginalArg(1) Class28 arg0) {
		Static133.aClass28_136 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(B)V")
	public static void method2414() {
		for (@Pc(6) Class2_Sub26 local6 = (Class2_Sub26) Static190.aClass19_20.method691(); local6 != null; local6 = (Class2_Sub26) Static190.aClass19_20.method686()) {
			if (local6.aClass2_Sub2_Sub20_1 != null) {
				local6.method3082();
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIBLclient!ra;II)V")
	public static void method2423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub3 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(30) int local30;
		if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
			while (true) {
				local30 = arg4.method260();
				if (local30 == 0) {
					break;
				}
				if (local30 == 1) {
					arg4.method260();
					break;
				}
				if (local30 <= 49) {
					arg4.method260();
				}
			}
			return;
		}
		Static9.aByteArrayArrayArray7[arg6][arg2][arg3] = 0;
		while (true) {
			local30 = arg4.method260();
			if (local30 == 0) {
				if (arg6 == 0) {
					Static170.anIntArrayArrayArray10[0][arg2][arg3] = -Static125.method2113(arg0 + arg2 + 932731, arg3 + (556238 - -arg5)) * 8;
				} else {
					Static170.anIntArrayArrayArray10[arg6][arg2][arg3] = Static170.anIntArrayArrayArray10[arg6 - 1][arg2][arg3] - 240;
				}
				break;
			}
			if (local30 == 1) {
				@Pc(89) int local89 = arg4.method260();
				if (local89 == 1) {
					local89 = 0;
				}
				if (arg6 == 0) {
					Static170.anIntArrayArrayArray10[0][arg2][arg3] = -local89 * 8;
				} else {
					Static170.anIntArrayArrayArray10[arg6][arg2][arg3] = Static170.anIntArrayArrayArray10[arg6 - 1][arg2][arg3] - local89 * 8;
				}
				break;
			}
			if (local30 <= 49) {
				Static14.aByteArrayArrayArray40[arg6][arg2][arg3] = arg4.method221();
				Static10.aByteArrayArrayArray8[arg6][arg2][arg3] = (byte) ((local30 - 2) / 4);
				Static67.aByteArrayArrayArray28[arg6][arg2][arg3] = (byte) (arg1 + local30 - 2 & 0x3);
			} else if (local30 <= 81) {
				Static9.aByteArrayArrayArray7[arg6][arg2][arg3] = (byte) (local30 - 49);
			} else {
				Static57.aByteArrayArrayArray23[arg6][arg2][arg3] = (byte) (local30 - 81);
			}
		}
	}
}
