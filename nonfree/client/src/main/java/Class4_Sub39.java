import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class4_Sub39 extends Class4 {

	@OriginalMember(owner = "client!tp", name = "q", descriptor = "[I")
	public int[] anIntArray589 = new int[] { -1 };

	@OriginalMember(owner = "client!tp", name = "n", descriptor = "[I")
	public int[] anIntArray588 = new int[1];

	static {
		new Class242("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIZ[I[I)J")
	private long method5240(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(15) long[] local15 = Class112.aLongArray4;
		@Pc(17) long local17 = -1L;
		@Pc(33) long local33 = local17 >>> 8 ^ local15[(int) (((long) (arg0 >> 8) ^ local17) & 0xFFL)];
		local17 = local33 >>> 8 ^ local15[(int) (((long) arg0 ^ local33) & 0xFFL)];
		for (@Pc(49) int local49 = 0; local49 < arg2.length; local49++) {
			local17 = local15[(int) (((long) (arg2[local49] >> 24) ^ local17) & 0xFFL)] ^ local17 >>> 8;
			local17 = local17 >>> 8 ^ local15[(int) (((long) (arg2[local49] >> 16) ^ local17) & 0xFFL)];
			local17 = local17 >>> 8 ^ local15[(int) (((long) (arg2[local49] >> 8) ^ local17) & 0xFFL)];
			local17 = local15[(int) (((long) arg2[local49] ^ local17) & 0xFFL)] ^ local17 >>> 8;
		}
		if (arg3 != null) {
			for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
				local17 = local17 >>> 8 ^ local15[(int) (((long) arg3[local130] ^ local17) & 0xFFL)];
			}
		}
		return local15[(int) ((local17 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)] ^ local17 >>> 8;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!tq;IZLclient!pt;Lclient!qa;IIIII)Lclient!c;")
	public Class7 method5241(@OriginalArg(0) Class233 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class188 arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) Class7 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class132 local11 = null;
		if (arg4 != -1) {
			local11 = Static8.aClass226_1.method5109(arg4);
		}
		@Pc(25) int[] local25 = this.anIntArray589;
		if (local11 != null && local11.anIntArray307 != null) {
			local25 = new int[local11.anIntArray307.length];
			for (@Pc(37) int local37 = 0; local37 < local11.anIntArray307.length; local37++) {
				@Pc(44) int local44 = local11.anIntArray307[local37];
				if (local44 >= 0 && this.anIntArray589.length > local44) {
					local25[local37] = this.anIntArray589[local44];
				} else {
					local25[local37] = -1;
				}
			}
		}
		@Pc(80) boolean local80 = false;
		@Pc(82) boolean local82 = false;
		@Pc(84) boolean local84 = false;
		@Pc(86) boolean local86 = false;
		@Pc(88) int local88 = -1;
		@Pc(90) int local90 = -1;
		@Pc(92) int local92 = 0;
		@Pc(94) Class4_Sub1_Sub12 local94 = null;
		@Pc(96) Class4_Sub1_Sub12 local96 = null;
		if (arg0 != null) {
			local88 = arg0.anIntArray593[arg5];
			local9 = 2080;
			@Pc(111) int local111 = local88 >>> 16;
			local88 &= 0xFFFF;
			local94 = Static269.aClass10_1.method288(local111);
			if (local94 != null) {
				local82 = local94.method3628(local88) | false;
				local80 = local94.method3625(local88) | false;
				local86 = local94.method3627(local88) | false;
				local84 = arg0.aBoolean452 | false;
			}
			if ((arg0.aBoolean450 || Static218.aBoolean291) && arg6 != -1 && arg6 < arg0.anIntArray593.length) {
				local90 = arg0.anIntArray593[arg6];
				local92 = arg0.anIntArray591[arg5];
				@Pc(175) int local175 = local90 >>> 16;
				local90 &= 0xFFFF;
				if (local111 == local175) {
					local96 = local94;
				} else {
					local96 = Static269.aClass10_1.method288(local90 >>> 16);
				}
				if (local96 != null) {
					local82 |= local96.method3628(local90);
					local80 |= local96.method3625(local90);
					local86 |= local96.method3627(local90);
				}
			}
			if (local82) {
				local9 = 2208;
			}
			if (local80) {
				local9 |= 0x100;
			}
			if (local84) {
				local9 |= 0x200;
			}
			if (local86) {
				local9 |= 0x400;
			}
		}
		@Pc(252) long local252 = this.method5240(arg4, arg1, local25, arg2 == null ? null : arg2.anIntArray482);
		if (Static375.aClass69_49 != null) {
			local7 = (Class7) Static375.aClass69_49.method1591(local252);
		}
		if (local7 == null || arg3.method4674(local7.n(), local9) != 0) {
			if (local7 != null) {
				local9 = arg3.method4665(local9, local7.n());
			}
			@Pc(278) int local278 = local9;
			@Pc(280) boolean local280 = false;
			for (@Pc(282) int local282 = 0; local282 < local25.length; local282++) {
				if (local25[local282] != -1 && !Static390.aClass204_2.method4629(local25[local282]).method2732(arg1)) {
					local280 = true;
				}
			}
			if (local280) {
				return null;
			}
			@Pc(318) Class208[] local318 = new Class208[local25.length];
			for (@Pc(320) int local320 = 0; local320 < local25.length; local320++) {
				if (local25[local320] != -1) {
					local318[local320] = Static390.aClass204_2.method4629(local25[local320]).method2739(arg1);
				}
			}
			@Pc(371) int local371;
			if (local11 != null && local11.anIntArrayArray32 != null) {
				for (@Pc(351) int local351 = 0; local351 < local11.anIntArrayArray32.length; local351++) {
					if (local11.anIntArrayArray32[local351] != null && local318[local351] != null) {
						local371 = local11.anIntArrayArray32[local351][0];
						@Pc(378) int local378 = local11.anIntArrayArray32[local351][1];
						@Pc(385) int local385 = local11.anIntArrayArray32[local351][2];
						@Pc(392) int local392 = local11.anIntArrayArray32[local351][3];
						@Pc(399) int local399 = local11.anIntArrayArray32[local351][4];
						@Pc(406) int local406 = local11.anIntArrayArray32[local351][5];
						if (local392 != 0 || local399 != 0 || local406 != 0) {
							local318[local351].method4816(local406, local399, local392);
						}
						if (local371 != 0 || local378 != 0 || local385 != 0) {
							local318[local351].method4805(local385, local371, local378);
						}
					}
				}
			}
			if (arg2 != null) {
				local278 = local9 | 0x4000;
			}
			@Pc(457) Class208 local457 = new Class208(local318, local318.length);
			local7 = arg3.method4655(local457, local278, Static380.anInt6667, 64, 850);
			if (arg2 != null) {
				for (local371 = 0; local371 < 5; local371++) {
					if (arg2.anIntArray482[local371] < Static246.aShortArrayArray7[local371].length) {
						local7.N(Static99.aShortArray74[local371], Static246.aShortArrayArray7[local371][arg2.anIntArray482[local371]]);
					}
					if (arg2.anIntArray482[local371] < Static30.aShortArrayArray1[local371].length) {
						local7.N(Static49.aShortArray14[local371], Static30.aShortArrayArray1[local371][arg2.anIntArray482[local371]]);
					}
				}
			}
			if (Static375.aClass69_49 != null) {
				local7.u(local9);
				Static375.aClass69_49.method1590(local252, local7);
			}
		}
		if (arg0 == null || local94 == null) {
			return local7;
		} else {
			@Pc(549) Class7 local549 = local7.method4077((byte) 1, local9, true);
			local549.method4080(local92, 0, local90, local88, arg0.aBoolean452, local94, arg7 - 1, local96);
			return local549;
		}
	}
}
