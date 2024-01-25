import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class1_Sub45 extends Class1 {

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "[I")
	public int[] anIntArray681 = new int[1];

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "[I")
	public int[] anIntArray680 = new int[] { -1 };

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray2[local4] = new Rectangle();
		}
		new Class84(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIILclient!jh;ILclient!qp;ZZILclient!qa;)Lclient!c;")
	public Class37 method6020(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class127 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class191 arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class109 arg7) {
		@Pc(7) Class37 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class164 local11 = null;
		if (arg1 != -1) {
			local11 = Static14.aClass193_1.method4647(arg1);
		}
		@Pc(22) int[] local22 = this.anIntArray680;
		if (local11 != null && local11.anIntArray373 != null) {
			local22 = new int[local11.anIntArray373.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray373.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray373[local34];
				if (local41 >= 0 && this.anIntArray680.length > local41) {
					local22[local34] = this.anIntArray680[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(82) boolean local82 = false;
		@Pc(84) int local84 = -1;
		@Pc(86) int local86 = -1;
		@Pc(88) int local88 = 0;
		@Pc(90) Class1_Sub2_Sub6 local90 = null;
		@Pc(92) Class1_Sub2_Sub6 local92 = null;
		if (arg4 != null) {
			local84 = arg4.anIntArray452[arg0];
			local9 = 2080;
			@Pc(107) int local107 = local84 >>> 16;
			local90 = Static191.aClass28_1.method571(local107);
			local84 &= 0xFFFF;
			if (local90 != null) {
				local78 = local90.method1120(local84) | false;
				local76 = local90.method1121(local84) | false;
				local82 = local90.method1125(local84) | false;
				local80 = arg4.aBoolean375 | false;
			}
			if ((arg4.aBoolean374 || Static294.aBoolean385) && arg3 != -1 && arg3 < arg4.anIntArray452.length) {
				local86 = arg4.anIntArray452[arg3];
				local88 = arg4.anIntArray454[arg0];
				@Pc(175) int local175 = local86 >>> 16;
				local86 &= 0xFFFF;
				if (local175 == local107) {
					local92 = local90;
				} else {
					local92 = Static191.aClass28_1.method571(local86 >>> 16);
				}
				if (local92 != null) {
					local78 |= local92.method1120(local86);
					local76 |= local92.method1121(local86);
					local82 |= local92.method1125(local86);
				}
			}
			if (local78) {
				local9 = 2208;
			}
			if (local76) {
				local9 |= 0x100;
			}
			if (local80) {
				local9 |= 0x200;
			}
			if (local82) {
				local9 |= 0x400;
			}
		}
		@Pc(252) long local252 = this.method6021(arg1, arg5, local22, arg2 == null ? null : arg2.anIntArray289);
		if (Static342.aClass83_50 != null) {
			local7 = (Class37) Static342.aClass83_50.method1658(local252);
		}
		if (local7 == null || arg7.method4710(local7.n(), local9) != 0) {
			if (local7 != null) {
				local9 = arg7.method4699(local9, local7.n());
			}
			@Pc(278) int local278 = local9;
			@Pc(280) boolean local280 = false;
			for (@Pc(282) int local282 = 0; local282 < local22.length; local282++) {
				if (local22[local282] != -1 && !Static196.aClass139_1.method3228(local22[local282]).method6033(arg5)) {
					local280 = true;
				}
			}
			if (local280) {
				return null;
			}
			@Pc(318) Class264[] local318 = new Class264[local22.length];
			for (@Pc(320) int local320 = 0; local320 < local22.length; local320++) {
				if (local22[local320] != -1) {
					local318[local320] = Static196.aClass139_1.method3228(local22[local320]).method6027(arg5);
				}
			}
			@Pc(376) int local376;
			if (local11 != null && local11.anIntArrayArray130 != null) {
				for (@Pc(356) int local356 = 0; local356 < local11.anIntArrayArray130.length; local356++) {
					if (local11.anIntArrayArray130[local356] != null && local318[local356] != null) {
						local376 = local11.anIntArrayArray130[local356][0];
						@Pc(383) int local383 = local11.anIntArrayArray130[local356][1];
						@Pc(390) int local390 = local11.anIntArrayArray130[local356][2];
						@Pc(397) int local397 = local11.anIntArrayArray130[local356][3];
						@Pc(404) int local404 = local11.anIntArrayArray130[local356][4];
						@Pc(411) int local411 = local11.anIntArrayArray130[local356][5];
						if (local397 != 0 || local404 != 0 || local411 != 0) {
							local318[local356].method5916(local397, local411, local404);
						}
						if (local376 != 0 || local383 != 0 || local390 != 0) {
							local318[local356].method5905(local383, local376, local390);
						}
					}
				}
			}
			if (arg2 != null) {
				local278 = local9 | 0x4000;
			}
			@Pc(470) Class264 local470 = new Class264(local318, local318.length);
			local7 = arg7.method4697(local470, local278, Static401.anInt7562, 64, 850);
			if (arg2 != null) {
				for (local376 = 0; local376 < 5; local376++) {
					if (Static133.aShortArrayArray2[local376].length > arg2.anIntArray289[local376]) {
						local7.N(Static32.aShortArray5[local376], Static133.aShortArrayArray2[local376][arg2.anIntArray289[local376]]);
					}
					if (Static317.aShortArrayArray4[local376].length > arg2.anIntArray289[local376]) {
						local7.N(Static284.aShortArray59[local376], Static317.aShortArrayArray4[local376][arg2.anIntArray289[local376]]);
					}
				}
			}
			if (Static342.aClass83_50 != null) {
				local7.u(local9);
				Static342.aClass83_50.method1675(local252, local7);
			}
		}
		if (arg4 == null || local90 == null) {
			return local7;
		} else {
			@Pc(560) Class37 local560 = local7.method4221((byte) 1, local9, true);
			local560.method4224(arg6 - 1, local84, 0, local92, arg4.aBoolean375, local90, local86, local88);
			return local560;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BIZ[I[I)J")
	private long method6021(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class57_Sub2.aLongArray8;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg0 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg0 ^ local25) & 0xFFL)];
		for (@Pc(41) int local41 = 0; local41 < arg2.length; local41++) {
			local9 = local7[(int) (((long) (arg2[local41] >> 24) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg2[local41] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg2[local41] >> 8) ^ local9) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg2[local41]) & 0xFFL)];
		}
		if (arg3 != null) {
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg3[local131]) & 0xFFL)];
			}
		}
		return local7[(int) (((long) (arg1 ? 1 : 0) ^ local9) & 0xFFL)] ^ local9 >>> 8;
	}
}
