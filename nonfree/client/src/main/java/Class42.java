import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public abstract class Class42 {

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	private int anInt4145 = 4;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	private int anInt4151 = 4;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "[S")
	private final short[] aShortArray70 = new short[512];

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
	private int anInt4154 = 0;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
	private int anInt4153 = 4;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
	protected int anInt4147 = 4;

	static {
		new Class140("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IIIII)V")
	protected Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4147 = arg1;
		this.anInt4151 = arg4;
		this.anInt4153 = arg3;
		this.anInt4145 = arg2;
		this.anInt4154 = arg0;
		this.method3538();
		this.method3537();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	protected abstract void method3536();

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	private void method3537() {
		@Pc(20) Random local20 = new Random((long) this.anInt4154);
		for (@Pc(22) int local22 = 0; local22 < 255; local22++) {
			this.aShortArray70[local22] = (short) local22;
		}
		for (@Pc(36) int local36 = 0; local36 < 255; local36++) {
			@Pc(42) int local42 = 255 - local36;
			@Pc(47) int local47 = Static172.method3391(local42, local20);
			@Pc(52) short local52 = this.aShortArray70[local47];
			this.aShortArray70[local47] = this.aShortArray70[local42];
			this.aShortArray70[local42] = this.aShortArray70[local42 + 256] = local52;
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	private void method3538() {
		this.aShortArray71 = new short[this.anInt4147];
		for (@Pc(12) int local12 = 0; local12 < this.anInt4147; local12++) {
			this.aShortArray71[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIBI)V")
	protected final void method3541() {
		@Pc(13) int[] local13 = new int[128];
		@Pc(16) int[] local16 = new int[128];
		@Pc(19) int[] local19 = new int[16];
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			local13[local21] = (local21 << 12) / 128;
		}
		for (@Pc(37) int local37 = 0; local37 < 128; local37++) {
			local16[local37] = (local37 << 12) / 128;
		}
		for (@Pc(57) int local57 = 0; local57 < 16; local57++) {
			local19[local57] = (local57 << 12) / 16;
		}
		this.method3536();
		for (@Pc(76) int local76 = 0; local76 < 16; local76++) {
			for (@Pc(80) int local80 = 0; local80 < 128; local80++) {
				for (@Pc(84) int local84 = 0; local84 < 128; local84++) {
					for (@Pc(88) int local88 = 0; local88 < this.anInt4147; local88++) {
						@Pc(97) int local97 = this.aShortArray71[local88] << 12;
						@Pc(105) int local105 = local13[local84] * local97 >> 12;
						@Pc(112) int local112 = local97 * this.anInt4151 >> 12;
						@Pc(119) int local119 = local97 * this.anInt4153 >> 12;
						@Pc(126) int local126 = local97 * this.anInt4145 >> 12;
						@Pc(134) int local134 = local97 * local19[local76] >> 12;
						@Pc(142) int local142 = local16[local80] * local97 >> 12;
						@Pc(147) int local147 = local142 * this.anInt4153;
						@Pc(152) int local152 = local134 * this.anInt4151;
						@Pc(157) int local157 = local105 * this.anInt4145;
						@Pc(161) int local161 = local157 >> 12;
						@Pc(165) int local165 = local161 + 1;
						@Pc(169) int local169 = local147 >> 12;
						@Pc(173) int local173 = local161 & 0xFF;
						@Pc(177) int local177 = local169 + 1;
						@Pc(181) int local181 = local169 & 0xFF;
						@Pc(185) int local185 = local152 >> 12;
						@Pc(189) int local189 = local185 + 1;
						@Pc(193) int local193 = local152 & 0xFFF;
						if (local177 >= local119) {
							local177 = 0;
						} else {
							local177 &= 0xFF;
						}
						local142 = local147 & 0xFFF;
						local105 = local157 & 0xFFF;
						if (local126 <= local165) {
							local165 = 0;
						} else {
							local165 &= 0xFF;
						}
						if (local189 < local112) {
							local189 &= 0xFF;
						} else {
							local189 = 0;
						}
						local185 &= 0xFF;
						@Pc(247) short local247 = this.aShortArray70[local185];
						@Pc(251) int local251 = Class173.anIntArray449[local105];
						@Pc(255) int local255 = Class173.anIntArray449[local142];
						@Pc(259) int local259 = local193 - 4096;
						@Pc(264) short local264 = this.aShortArray70[local189];
						@Pc(268) int local268 = Class173.anIntArray449[local193];
						@Pc(272) int local272 = local142 - 4096;
						@Pc(276) int local276 = local105 - 4096;
						@Pc(283) short local283 = this.aShortArray70[local177 + local247];
						@Pc(290) short local290 = this.aShortArray70[local247 + local181];
						@Pc(297) short local297 = this.aShortArray70[local181 + local264];
						@Pc(304) short local304 = this.aShortArray70[local177 + local264];
						@Pc(316) int local316 = Static242.method4780(local105, this.aShortArray70[local290 + local173], local193, local142);
						@Pc(328) int local328 = Static242.method4780(local276, this.aShortArray70[local290 + local165], local193, local142);
						@Pc(340) int local340 = local316 + (local251 * (local328 - local316) >> 12);
						@Pc(352) int local352 = Static242.method4780(local105, this.aShortArray70[local173 + local283], local193, local272);
						@Pc(365) int local365 = Static242.method4780(local276, this.aShortArray70[local165 + local283], local193, local272);
						@Pc(376) int local376 = ((local365 - local352) * local251 >> 12) + local352;
						@Pc(388) int local388 = local340 + (local255 * (local376 - local340) >> 12);
						@Pc(400) int local400 = Static242.method4780(local105, this.aShortArray70[local297 + local173], local259, local142);
						@Pc(412) int local412 = Static242.method4780(local276, this.aShortArray70[local297 + local165], local259, local142);
						@Pc(423) int local423 = local400 + ((local412 - local400) * local251 >> 12);
						@Pc(435) int local435 = Static242.method4780(local105, this.aShortArray70[local304 + local173], local259, local272);
						@Pc(447) int local447 = Static242.method4780(local276, this.aShortArray70[local165 + local304], local259, local272);
						@Pc(457) int local457 = local435 + ((local447 - local435) * local251 >> 12);
						@Pc(468) int local468 = ((local457 - local423) * local255 >> 12) + local423;
						this.method3546((local268 * (local468 - local388) >> 12) + local388, local88);
					}
					this.method3544();
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
	protected abstract void method3544();

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
	protected abstract void method3546(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
