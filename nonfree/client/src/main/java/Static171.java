import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gba", name = "l", descriptor = "Lclient!ac;")
	public static Class5 aClass5_23;

	@OriginalMember(owner = "client!gba", name = "u", descriptor = "Lclient!bh;")
	public static Class29 aClass29_3;

	@OriginalMember(owner = "client!gba", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!gba", name = "o", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_44 = new Class218(71, 0);

	@OriginalMember(owner = "client!gba", name = "x", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_45 = new Class218(99, 7);

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!ha;IB)V")
	public static void method3552(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1) {
		if (!Static20.aBoolean21 || !Static110.aBoolean234) {
			Static476.anInt9172 = 0;
			return;
		}
		if (Static626.aBoolean869) {
			Static245.aLong123 = Static638.aClass206_1.method8384();
		}
		Static106.anInt2655 = 0;
		Static323.anInt6498 = 0;
		Static104.anInt2625 = 0;
		@Pc(27) int[] local27 = arg0.Y();
		Static47.anInt1034 = (int) ((float) local27[2] / 3.0F);
		Static115.anInt9244 = (int) ((float) local27[3] / 3.0F);
		arg0.method6215(Static69.anIntArray72);
		if (Static582.anInt9741 != (int) ((float) Static69.anIntArray72[0] / 3.0F) || Static255.anInt5651 != (int) ((float) Static69.anIntArray72[1] / 3.0F)) {
			Static255.anInt5651 = (int) ((float) Static69.anIntArray72[1] / 3.0F);
			Static582.anInt9741 = (int) ((float) Static69.anIntArray72[0] / 3.0F);
			Static352.anInt6886 = Static255.anInt5651 >> 1;
			Static475.anIntArray532 = new int[Static582.anInt9741 * Static255.anInt5651];
			Static290.anInt5910 = Static582.anInt9741 >> 1;
		}
		Static445.aClass47_7 = arg0.method6200();
		Static476.anInt9172 = 0;
		for (@Pc(100) int local100 = 0; local100 < Static322.anInt6491; local100++) {
			Static180.method3687(Static188.aClass92Array4[local100], arg1, arg0);
		}
		for (@Pc(124) int local124 = 0; local124 < Static244.anInt5486; local124++) {
			Static180.method3687(Static206.aClass92Array9[local124], arg1, arg0);
		}
		for (@Pc(139) int local139 = 0; local139 < Static92.anInt2488; local139++) {
			Static180.method3687(Static270.aClass92Array6[local139], arg1, arg0);
		}
		Static314.anInt6404 = 0;
		if (Static476.anInt9172 > 0) {
			@Pc(162) int local162 = Static475.anIntArray532.length;
			@Pc(169) int local169 = local162 - local162 & 0x7;
			@Pc(171) int local171 = 0;
			while (local169 > local171) {
				Static475.anIntArray532[local171++] = Integer.MAX_VALUE;
				Static475.anIntArray532[local171++] = Integer.MAX_VALUE;
				Static475.anIntArray532[local171++] = Integer.MAX_VALUE;
				Static475.anIntArray532[local171++] = Integer.MAX_VALUE;
				Static475.anIntArray532[local171++] = Integer.MAX_VALUE;
				Static475.anIntArray532[local171++] = Integer.MAX_VALUE;
				Static475.anIntArray532[local171++] = Integer.MAX_VALUE;
				Static475.anIntArray532[local171++] = Integer.MAX_VALUE;
			}
			while (local171 < local162) {
				Static475.anIntArray532[local171++] = Integer.MAX_VALUE;
			}
			Static249.anInt5548 = 1;
			for (@Pc(230) int local230 = 0; local230 < Static476.anInt9172; local230++) {
				@Pc(236) Class92 local236 = Static14.aClass92Array16[local230];
				Static439.method6675(local236.aShortArray32[1], local236.aShortArray31[1], local236.aShortArray30[0], local236.aShortArray31[3], local236.aShortArray32[3], local236.aShortArray30[3], local236.aShortArray30[1], local236.aShortArray31[0], local236.aShortArray32[0]);
				Static439.method6675(local236.aShortArray32[2], local236.aShortArray31[2], local236.aShortArray30[1], local236.aShortArray31[3], local236.aShortArray32[3], local236.aShortArray30[3], local236.aShortArray30[2], local236.aShortArray31[1], local236.aShortArray32[1]);
			}
			Static249.anInt5548 = 2;
		}
		if (Static626.aBoolean869) {
			Static630.aLong273 = Static638.aClass206_1.method8384() - Static245.aLong123;
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILclient!jaa;ZLclient!jaa;ZB)I")
	public static int method3553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class153_Sub1 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class153_Sub1 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(10) int local10 = Static566.method7970(arg0, arg2, arg3, arg4);
		if (local10 != 0) {
			return arg3 ? -local10 : local10;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(42) int local42 = Static566.method7970(arg1, arg2, arg5, arg4);
			return arg5 ? -local42 : local42;
		}
	}
}
