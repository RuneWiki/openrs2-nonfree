import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rga")
public final class Class314 {

	@OriginalMember(owner = "client!rga", name = "u", descriptor = "I")
	private int anInt8580;

	@OriginalMember(owner = "client!rga", name = "h", descriptor = "I")
	private int anInt8581;

	@OriginalMember(owner = "client!rga", name = "r", descriptor = "Lclient!tb;")
	private Class49 aClass49_34;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "I")
	private int anInt8582;

	@OriginalMember(owner = "client!rga", name = "n", descriptor = "I")
	public int anInt8586;

	@OriginalMember(owner = "client!rga", name = "m", descriptor = "I")
	private int anInt8590;

	@OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
	private final int anInt8587;

	@OriginalMember(owner = "client!rga", name = "f", descriptor = "I")
	private final int anInt8585;

	@OriginalMember(owner = "client!rga", name = "j", descriptor = "I")
	private final int anInt8578;

	@OriginalMember(owner = "client!rga", name = "l", descriptor = "Z")
	private final boolean aBoolean665;

	@OriginalMember(owner = "client!rga", name = "o", descriptor = "I")
	private final int anInt8583;

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
	private final int anInt8584;

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "I")
	private final int anInt8577;

	@OriginalMember(owner = "client!rga", name = "t", descriptor = "I")
	private final int anInt8589;

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
	private final int anInt8591;

	@OriginalMember(owner = "client!rga", name = "d", descriptor = "I")
	private final int anInt8579;

	@OriginalMember(owner = "client!rga", name = "p", descriptor = "I")
	private final int anInt8588;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(IIIIIIIZIII)V")
	public Class314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt8587 = arg2;
		this.anInt8585 = arg3;
		this.anInt8578 = arg4;
		this.aBoolean665 = arg7;
		this.anInt8583 = arg1;
		this.anInt8584 = arg6;
		this.anInt8577 = arg5;
		this.anInt8589 = arg0;
		this.anInt8591 = arg8;
		this.anInt8579 = arg9;
		this.anInt8588 = arg10;
	}

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "(Lclient!ha;Lclient!rga;)V")
	private void method7519(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class314 arg1) {
		Static523.method7528(arg0);
		Static523.method7526(arg0);
		arg0.K(Static523.anIntArray565);
		arg0.KA(0, 0, this.anInt8581, this.anInt8581);
		arg0.ya();
		arg0.aa(0, 0, this.anInt8581, this.anInt8581, this.anInt8584 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean665) {
				local31 = -arg1.anInt8587;
				local33 = -arg1.anInt8585;
				local35 = -arg1.anInt8578;
			} else {
				local31 = arg1.anInt8587 - this.anInt8587;
				local33 = arg1.anInt8585 - this.anInt8585;
				local35 = arg1.anInt8578 - this.anInt8578;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt8590 != 0) {
			local79 = Class6_Sub2_Sub12.anIntArray293[this.anInt8590];
			local84 = Class6_Sub2_Sub12.anIntArray292[this.anInt8590];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt8580 != 0) {
			local79 = Class6_Sub2_Sub12.anIntArray293[this.anInt8580];
			local84 = Class6_Sub2_Sub12.anIntArray292[this.anInt8580];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class54 local147 = Static523.aClass54_6.method7398((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt8583);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt8581 * 1024 / (local147.RA() - local147.V());
		if (this.anInt8584 != 0) {
			local84 = local84 * 13 / 16;
		}
		@Pc(190) int[] local190 = arg0.Y();
		arg0.DA(this.anInt8581 / 2, this.anInt8581 / 2, local84, local84);
		arg0.method6695(arg0.method6709());
		@Pc(209) Class109 local209 = arg0.method6709();
		local209.method4606(0, 0, arg0.i() - local147.HA());
		local147.method7407(local209, (Class60_Sub10) null, 1024, 1);
		@Pc(231) int local231 = this.anInt8581 * 13 / 16;
		@Pc(238) int local238 = (this.anInt8581 - local231) / 2;
		Static523.aClass49_32.method8996(local238, local238, local231, local231, 0, this.anInt8584 | 0xFF000000, 1);
		this.aClass49_34 = arg0.method6687(0, 0, this.anInt8581, this.anInt8581, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt8581, this.anInt8581, 0, 0);
		Static523.aClass49_33.method8996(0, 0, this.anInt8581, this.anInt8581, 1, 0, 0);
		this.aClass49_34.method8977();
		arg0.DA(local190[0], local190[1], local190[2], local190[3]);
		arg0.KA(Static523.anIntArray565[0], Static523.anIntArray565[1], Static523.anIntArray565[2], Static523.anIntArray565[3]);
	}

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(Lclient!ha;Lclient!rga;)V")
	private void method7520(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class314 arg1) {
		@Pc(6) Class316 local6 = Static347.method5332(this.anInt8583, Static190.aClass223_38);
		if (local6 == null) {
			return;
		}
		arg0.K(Static523.anIntArray565);
		arg0.KA(0, 0, this.anInt8581, this.anInt8581);
		arg0.ya();
		arg0.aa(0, 0, this.anInt8581, this.anInt8581, 0, 0);
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean665) {
				local34 = -arg1.anInt8587;
				local36 = -arg1.anInt8585;
				local38 = -arg1.anInt8578;
			} else {
				local34 = this.anInt8587 - arg1.anInt8587;
				local36 = this.anInt8585 - arg1.anInt8585;
				local38 = this.anInt8578 - arg1.anInt8578;
			}
		}
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(91) int local91;
		@Pc(101) int local101;
		if (this.anInt8590 != 0) {
			local83 = -this.anInt8590 & 0x3FFF;
			local87 = Class6_Sub2_Sub12.anIntArray293[local83];
			local91 = Class6_Sub2_Sub12.anIntArray292[local83];
			local101 = local36 * local91 - local38 * local87 >> 14;
			local38 = local36 * local87 + local38 * local91 >> 14;
			local36 = local101;
		}
		if (this.anInt8580 != 0) {
			local83 = -this.anInt8580 & 0x3FFF;
			local87 = Class6_Sub2_Sub12.anIntArray293[local83];
			local91 = Class6_Sub2_Sub12.anIntArray292[local83];
			local101 = local38 * local87 + local34 * local91 >> 14;
			local38 = local38 * local91 - local34 * local87 >> 14;
			local34 = local101;
		}
		arg0.xa(1.0F);
		arg0.ZA(this.anInt8584, 1.0F, 1.0F, (float) local34, (float) local36, (float) local38);
		local6.method7541(this.anInt8588 & 0x3FFF, this.anInt8591 & 0x3FFF, this.anInt8579 & 0x3FFF);
		@Pc(190) Class54 local190 = arg0.method6688(local6, 2048, 0, 64, 768);
		local87 = local190.RA() - local190.V();
		local91 = local190.EA() - local190.fa();
		local101 = local87 > local91 ? local87 : local91;
		@Pc(216) int local216 = this.anInt8581 * 1024 / local101;
		@Pc(219) int[] local219 = arg0.Y();
		arg0.DA(this.anInt8581 / 2, this.anInt8581 / 2, local216, local216);
		arg0.method6695(arg0.method6709());
		@Pc(238) Class109 local238 = arg0.method6643();
		local238.method4606(0, 0, arg0.i() - local190.HA());
		local190.method7407(local238, (Class60_Sub10) null, arg0.i(), 1);
		this.aClass49_34 = arg0.method6687(0, 0, this.anInt8581, this.anInt8581, true);
		this.aClass49_34.method8977();
		arg0.DA(local219[0], local219[1], local219[2], local219[3]);
		arg0.KA(Static523.anIntArray565[0], Static523.anIntArray565[1], Static523.anIntArray565[2], Static523.anIntArray565[3]);
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lclient!ha;IIIIIIIIII)V")
	public void method7521(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (this.aClass49_34 == null) {
			return;
		}
		@Pc(6) int[] local6 = new int[3];
		@Pc(14) int local14 = -(this.anInt8587 - arg7 << 16);
		@Pc(21) int local21 = this.anInt8585 - arg8 << 15;
		@Pc(29) int local29 = -(this.anInt8578 - arg9 << 16);
		@Pc(32) Class109 local32 = arg0.method6636();
		local32.method4596(0, 0, 0, local6);
		@Pc(44) int local44 = local14 + local6[0];
		@Pc(50) int local50 = local21 + local6[1];
		@Pc(56) int local56 = local29 + local6[2];
		arg0.H(local44, local50, local56, local6);
		if (local6[2] < 0) {
			return;
		}
		@Pc(75) int local75 = local6[0] - this.anInt8582 / 2;
		@Pc(84) int local84 = local6[1] - this.anInt8582 / 2;
		if (local84 < arg4 && local84 + this.anInt8582 > 0 && local75 < arg3 && local75 + this.anInt8582 > 0) {
			this.aClass49_34.method8996(local75, local84, this.anInt8582, this.anInt8582, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IIII)Z")
	public boolean method7522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean665) {
			this.anInt8586 = 1073741823;
			local7 = this.anInt8587;
			local12 = this.anInt8585;
			local17 = this.anInt8578;
		} else {
			local7 = this.anInt8587 - arg0;
			local12 = this.anInt8585 - arg1;
			local17 = this.anInt8578 - arg2;
			this.anInt8586 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt8586 == 0) {
				this.anInt8586 = 1;
			}
			local7 = (local7 << 8) / this.anInt8586;
			local12 = (local12 << 8) / this.anInt8586;
			local17 = (local17 << 8) / this.anInt8586;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt8582 = this.anInt8577 * arg3 / (this.aBoolean665 ? 1024 : this.anInt8586);
		} else {
			this.anInt8582 = 0;
		}
		if (this.anInt8582 < 8) {
			this.aClass49_34 = null;
			return false;
		}
		@Pc(143) int local143 = Static314.method4970(this.anInt8582);
		if (local143 > arg3) {
			local143 = Static468.method7064(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt8581) {
			this.anInt8581 = local143;
		}
		this.anInt8590 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt8580 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass49_34 = null;
		return true;
	}

	@OriginalMember(owner = "client!rga", name = "d", descriptor = "(Lclient!ha;Lclient!rga;)Z")
	public boolean method7524(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class314 arg1) {
		return this.aClass49_34 != null || this.method7527(arg0, arg1);
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lclient!ha;Lclient!rga;)Z")
	private boolean method7527(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class314 arg1) {
		if (this.aClass49_34 == null) {
			if (this.anInt8589 == 0) {
				if (Static538.anInterface11_11.method6032(this.anInt8583)) {
					@Pc(23) int[] local23 = Static538.anInterface11_11.method6029(this.anInt8581, this.anInt8581, 0.7F, this.anInt8583);
					this.aClass49_34 = arg0.method6692(this.anInt8581, this.anInt8581, local23, this.anInt8581);
				}
			} else if (this.anInt8589 == 2) {
				this.method7520(arg0, arg1);
			} else if (this.anInt8589 == 1) {
				this.method7519(arg0, arg1);
			}
		}
		return this.aClass49_34 != null;
	}
}
