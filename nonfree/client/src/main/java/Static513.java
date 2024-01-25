import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "Lclient!ada;")
	public static final Class7 aClass7_10 = new Class7();

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "Z")
	public static boolean aBoolean591 = false;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!kf;Lclient!ro;IILclient!ib;IIZ)V")
	public static void method7270(@OriginalArg(0) Class2_Sub1_Sub1_Sub3_Sub2 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1_Sub3_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) Class6_Sub35 local7 = new Class6_Sub35();
		local7.anInt5736 = arg6;
		local7.anInt5741 = arg2 << 9;
		local7.anInt5740 = arg3 << 9;
		if (arg1 != null) {
			local7.aClass308_1 = arg1;
			@Pc(39) int local39 = arg1.anInt8587;
			@Pc(42) int local42 = arg1.anInt8589;
			if (arg5 == 1 || arg5 == 3) {
				local39 = arg1.anInt8589;
				local42 = arg1.anInt8587;
			}
			local7.anInt5752 = local39 + arg2 << 9;
			local7.anInt5739 = arg1.anInt8595;
			local7.aBoolean376 = arg1.aBoolean601;
			local7.anInt5751 = arg3 + local42 << 9;
			local7.aBoolean375 = arg1.aBoolean594;
			local7.anInt5747 = arg1.anInt8582;
			local7.anInt5742 = arg1.anInt8592;
			local7.anInt5749 = arg1.anInt8568 << 9;
			local7.anIntArray335 = arg1.anIntArray567;
			local7.anInt5746 = arg1.anInt8584 << 9;
			local7.anInt5738 = arg1.anInt8613;
			local7.anInt5750 = arg1.anInt8603;
			local7.anInt5743 = arg1.anInt8602;
			if (arg1.anIntArray566 != null) {
				local7.aBoolean377 = true;
				local7.method4895();
			}
			if (local7.anIntArray335 != null) {
				local7.anInt5744 = local7.anInt5750 + (int) ((double) (local7.anInt5747 - local7.anInt5750) * Math.random());
			}
			Static130.aClass362_12.method8536(local7);
		} else if (arg0 != null) {
			local7.aClass2_Sub1_Sub1_Sub3_Sub2_1 = arg0;
			@Pc(217) Class91 local217 = arg0.aClass91_1;
			if (local217.anIntArray140 != null) {
				local7.aBoolean377 = true;
				local217 = local217.method2036(Static659.aClass363_3);
			}
			if (local217 != null) {
				local7.anInt5752 = local217.anInt2346 + arg2 << 9;
				local7.anInt5751 = local217.anInt2346 + arg3 << 9;
				local7.anInt5742 = Static639.method8742(arg0);
				local7.anInt5749 = local217.anInt2341 << 9;
				local7.anInt5743 = local217.anInt2352;
				local7.anInt5739 = local217.anInt2365;
				local7.anInt5738 = local217.anInt2369;
				local7.anInt5746 = local217.anInt2334 << 9;
				local7.aBoolean375 = local217.aBoolean148;
			}
			Static247.aClass362_20.method8536(local7);
		} else if (arg4 != null) {
			local7.aClass2_Sub1_Sub1_Sub3_Sub1_1 = arg4;
			local7.anInt5752 = arg2 + arg4.method4326() << 9;
			local7.anInt5751 = arg3 + arg4.method4326() << 9;
			local7.anInt5742 = Static120.method1886(arg4);
			local7.anInt5739 = 256;
			local7.anInt5749 = 0;
			local7.anInt5738 = arg4.anInt4174;
			local7.aBoolean375 = arg4.aBoolean256;
			local7.anInt5743 = 256;
			local7.anInt5746 = arg4.anInt4177 << 9;
			Static429.aClass209_52.method5035((long) arg4.anInt5103, local7);
			return;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ae;ILclient!d;IILjava/awt/Canvas;)Lclient!ha;")
	public static Class132 method7271(@OriginalArg(0) Class8 arg0, @OriginalArg(2) Interface6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Canvas arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg4 != null) {
			@Pc(17) Dimension local17 = arg4.getSize();
			local7 = local17.height;
			local5 = local17.width;
		}
		return Static201.method7440(local5, arg3, local7, arg0, arg4, arg1, arg2);
	}
}
