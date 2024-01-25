import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static708 {

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "[I")
	public static int[] anIntArray750;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Lclient!ra;")
	public static final Class317 aClass317_9 = new Class317();

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_160 = new Class349(6, 7);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILclient!nca;IZIIJ)V")
	public static void method9448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		Static383.aLong10 = arg6;
		Static515.anInt8213 = arg4;
		Static112.aBoolean215 = false;
		Static225.anInt3586 = 10000;
		Static84.anInt1426 = arg0;
		Static478.aClass2_Sub23_Sub5_4 = null;
		Static24.aClass254_16 = arg2;
		Static403.anInt6656 = arg5;
		Static39.anInt535 = arg3;
		Static450.anInt7299 = arg1;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLclient!bi;)V")
	public static void method9450(@OriginalArg(1) Class4_Sub2_Sub1_Sub2_Sub1 arg0) {
		@Pc(16) Class2_Sub38 local16 = (Class2_Sub38) Static307.aClass218_22.method5095((long) arg0.anInt2320, 0);
		if (local16 == null) {
			return;
		}
		if (local16.aClass2_Sub23_Sub2_3 != null) {
			Static130.aClass2_Sub23_Sub3_1.method6797(local16.aClass2_Sub23_Sub2_3);
			local16.aClass2_Sub23_Sub2_3 = null;
		}
		local16.method9872();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!jga;)[I")
	public static int[] method9451(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub33 arg1) {
		@Pc(10) Class2_Sub20 local10 = new Class2_Sub20(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method8584(10);
		local10.method8577(local13[0]);
		local10.method8577(local13[1]);
		local10.method8577(local13[2]);
		if (arg0 < 3) {
			method9448(4, -125, (Class254) null, -23, -92, -127, 119L);
		}
		local10.method8577(local13[3]);
		for (@Pc(80) int local80 = 0; local80 < 10; local80++) {
			local10.method8577((int) (Math.random() * 9.9999999E7D));
		}
		local10.method8551((int) (Math.random() * 9.9999999E7D));
		local10.method8546(Static354.aBigInteger13, Static610.aBigInteger31);
		arg1.aClass2_Sub20_Sub2_1.method8565(local10.aByteArray111, 0, local10.anInt9723);
		return local13;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
	public static void method9452() {
		if (Static488.anIntArray557 != null) {
			return;
		}
		Static488.anIntArray557 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
			@Pc(44) float local44 = ((float) (local24 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(53) float local53 = (float) (local24 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(55) int local55 = 0; local55 < 128; local55++) {
				@Pc(62) float local62 = (float) local55 / 128.0F;
				@Pc(64) float local64 = 0.0F;
				@Pc(66) float local66 = 0.0F;
				@Pc(68) float local68 = 0.0F;
				@Pc(72) float local72 = local44 / 60.0F;
				@Pc(75) int local75 = (int) local72;
				@Pc(79) int local79 = local75 % 6;
				@Pc(85) float local85 = (float) -local75 + local72;
				@Pc(91) float local91 = local62 * (1.0F - local53);
				@Pc(99) float local99 = local62 * (1.0F - local85 * local53);
				@Pc(111) float local111 = local62 * (1.0F - local53 * (1.0F - local85));
				if (local79 == 0) {
					local64 = local62;
					local66 = local111;
					local68 = local91;
				} else if (local79 == 1) {
					local64 = local99;
					local68 = local91;
					local66 = local62;
				} else if (local79 == 2) {
					local66 = local62;
					local64 = local91;
					local68 = local111;
				} else if (local79 == 3) {
					local68 = local62;
					local66 = local99;
					local64 = local91;
				} else if (local79 == 4) {
					local66 = local91;
					local68 = local62;
					local64 = local111;
				} else if (local79 == 5) {
					local68 = local99;
					local64 = local62;
					local66 = local91;
				}
				local64 = (float) Math.pow((double) local64, local20);
				local66 = (float) Math.pow((double) local66, local20);
				local68 = (float) Math.pow((double) local68, local20);
				@Pc(213) int local213 = (int) (local64 * 256.0F);
				@Pc(218) int local218 = (int) (local66 * 256.0F);
				@Pc(223) int local223 = (int) (local68 * 256.0F);
				@Pc(236) int local236 = (local218 << 8) + ((local213 << 16) + local223 - 16777216);
				Static488.anIntArray557[local22++] = local236;
			}
		}
	}
}
