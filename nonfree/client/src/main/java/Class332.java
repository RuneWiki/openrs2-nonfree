import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class332 {

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
	private int anInt8719;

	@OriginalMember(owner = "client!ru", name = "q", descriptor = "Lclient!kw;")
	private Class178 aClass178_23;

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
	private int anInt8726;

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
	private int anInt8727;

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
	public int anInt8729;

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
	private int anInt8732;

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "I")
	private final int anInt8724;

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
	private final int anInt8733;

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
	private final int anInt8725;

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "Z")
	private final boolean aBoolean587;

	@OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
	private final int anInt8730;

	@OriginalMember(owner = "client!ru", name = "t", descriptor = "I")
	private final int anInt8731;

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
	private final int anInt8720;

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
	private final int anInt8728;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
	private final int anInt8722;

	@OriginalMember(owner = "client!ru", name = "o", descriptor = "I")
	private final int anInt8723;

	@OriginalMember(owner = "client!ru", name = "s", descriptor = "I")
	private final int anInt8721;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(IIIIIIIZIII)V")
	public Class332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt8724 = arg2;
		this.anInt8733 = arg3;
		this.anInt8725 = arg4;
		this.aBoolean587 = arg7;
		this.anInt8730 = arg1;
		this.anInt8731 = arg6;
		this.anInt8720 = arg5;
		this.anInt8728 = arg0;
		this.anInt8722 = arg8;
		this.anInt8723 = arg9;
		this.anInt8721 = arg10;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!ha;IIIIIIIIII)V")
	public void method7439(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (this.aClass178_23 == null) {
			return;
		}
		@Pc(6) int[] local6 = new int[3];
		@Pc(14) int local14 = -(this.anInt8724 - arg7 << 16);
		@Pc(21) int local21 = this.anInt8733 - arg8 << 15;
		@Pc(29) int local29 = -(this.anInt8725 - arg9 << 16);
		@Pc(32) Class58 local32 = arg0.method9369();
		local32.method9519(0, 0, 0, local6);
		@Pc(44) int local44 = local14 + local6[0];
		@Pc(50) int local50 = local21 + local6[1];
		@Pc(56) int local56 = local29 + local6[2];
		arg0.H(local44, local50, local56, local6);
		if (local6[2] < 0) {
			return;
		}
		@Pc(75) int local75 = local6[0] - this.anInt8727 / 2;
		@Pc(84) int local84 = local6[1] - this.anInt8727 / 2;
		if (local84 < arg4 && local84 + this.anInt8727 > 0 && local75 < arg3 && local75 + this.anInt8727 > 0) {
			this.aClass178_23.method7630(local75, local84, this.anInt8727, this.anInt8727, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIII)Z")
	public boolean method7440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean587) {
			this.anInt8729 = 1073741823;
			local7 = this.anInt8724;
			local12 = this.anInt8733;
			local17 = this.anInt8725;
		} else {
			local7 = this.anInt8724 - arg0;
			local12 = this.anInt8733 - arg1;
			local17 = this.anInt8725 - arg2;
			this.anInt8729 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt8729 == 0) {
				this.anInt8729 = 1;
			}
			local7 = (local7 << 8) / this.anInt8729;
			local12 = (local12 << 8) / this.anInt8729;
			local17 = (local17 << 8) / this.anInt8729;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt8727 = this.anInt8720 * arg3 / (this.aBoolean587 ? 1024 : this.anInt8729);
		} else {
			this.anInt8727 = 0;
		}
		if (this.anInt8727 < 8) {
			this.aClass178_23 = null;
			return false;
		}
		@Pc(143) int local143 = Static92.method1941(this.anInt8727);
		if (local143 > arg3) {
			local143 = Static70.method3137(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt8732) {
			this.anInt8732 = local143;
		}
		this.anInt8726 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt8719 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass178_23 = null;
		return true;
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(Lclient!ha;Lclient!ru;)V")
	private void method7441(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class332 arg1) {
		@Pc(6) Class145 local6 = Static716.method9500(this.anInt8730, Static177.aClass182_47);
		if (local6 == null) {
			return;
		}
		arg0.K(Static575.anIntArray633);
		arg0.KA(0, 0, this.anInt8732, this.anInt8732);
		arg0.ya();
		arg0.aa(0, 0, this.anInt8732, this.anInt8732, 0, 0);
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean587) {
				local34 = -arg1.anInt8724;
				local36 = -arg1.anInt8733;
				local38 = -arg1.anInt8725;
			} else {
				local34 = this.anInt8724 - arg1.anInt8724;
				local36 = this.anInt8733 - arg1.anInt8733;
				local38 = this.anInt8725 - arg1.anInt8725;
			}
		}
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(91) int local91;
		@Pc(101) int local101;
		if (this.anInt8726 != 0) {
			local83 = -this.anInt8726 & 0x3FFF;
			local87 = Class3_Sub7_Sub17_Sub1.anIntArray549[local83];
			local91 = Class3_Sub7_Sub17_Sub1.anIntArray548[local83];
			local101 = local36 * local91 - local38 * local87 >> 14;
			local38 = local36 * local87 + local38 * local91 >> 14;
			local36 = local101;
		}
		if (this.anInt8719 != 0) {
			local83 = -this.anInt8719 & 0x3FFF;
			local87 = Class3_Sub7_Sub17_Sub1.anIntArray549[local83];
			local91 = Class3_Sub7_Sub17_Sub1.anIntArray548[local83];
			local101 = local38 * local87 + local34 * local91 >> 14;
			local38 = local38 * local91 - local34 * local87 >> 14;
			local34 = local101;
		}
		arg0.xa(1.0F);
		arg0.ZA(this.anInt8731, 1.0F, 1.0F, (float) local34, (float) local36, (float) local38);
		local6.method3296(this.anInt8722 & 0x3FFF, this.anInt8721 & 0x3FFF, this.anInt8723 & 0x3FFF);
		@Pc(190) Class170 local190 = arg0.method9382(local6, 2048, 0, 64, 768);
		local87 = local190.RA() - local190.V();
		local91 = local190.EA() - local190.fa();
		local101 = local87 > local91 ? local87 : local91;
		@Pc(216) int local216 = this.anInt8732 * 1024 / local101;
		@Pc(219) int[] local219 = arg0.Y();
		arg0.DA(this.anInt8732 / 2, this.anInt8732 / 2, local216, local216);
		arg0.method9405(arg0.method9376());
		@Pc(238) Class58 local238 = arg0.method9354();
		local238.method9524(0, 0, arg0.i() - local190.HA());
		local190.method8350(local238, (Class9_Sub9) null, arg0.i(), 1);
		this.aClass178_23 = arg0.method9356(0, 0, this.anInt8732, this.anInt8732, true);
		this.aClass178_23.method7620();
		arg0.DA(local219[0], local219[1], local219[2], local219[3]);
		arg0.KA(Static575.anIntArray633[0], Static575.anIntArray633[1], Static575.anIntArray633[2], Static575.anIntArray633[3]);
	}

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "(Lclient!ha;Lclient!ru;)Z")
	private boolean method7442(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class332 arg1) {
		if (this.aClass178_23 == null) {
			if (this.anInt8728 == 0) {
				if (Static395.anInterface4_9.method5758(this.anInt8730)) {
					@Pc(23) int[] local23 = Static395.anInterface4_9.method5757(this.anInt8732, this.anInt8732, this.anInt8730, 0.7F);
					this.aClass178_23 = arg0.method9367(local23, this.anInt8732, this.anInt8732, this.anInt8732);
				}
			} else if (this.anInt8728 == 2) {
				this.method7441(arg0, arg1);
			} else if (this.anInt8728 == 1) {
				this.method7443(arg0, arg1);
			}
		}
		return this.aClass178_23 != null;
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(Lclient!ha;Lclient!ru;)V")
	private void method7443(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class332 arg1) {
		Static575.method7445(arg0);
		Static575.method7437(arg0);
		arg0.K(Static575.anIntArray633);
		arg0.KA(0, 0, this.anInt8732, this.anInt8732);
		arg0.ya();
		arg0.aa(0, 0, this.anInt8732, this.anInt8732, this.anInt8731 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean587) {
				local31 = -arg1.anInt8724;
				local33 = -arg1.anInt8733;
				local35 = -arg1.anInt8725;
			} else {
				local31 = arg1.anInt8724 - this.anInt8724;
				local33 = arg1.anInt8733 - this.anInt8733;
				local35 = arg1.anInt8725 - this.anInt8725;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt8726 != 0) {
			local79 = Class3_Sub7_Sub17_Sub1.anIntArray549[this.anInt8726];
			local84 = Class3_Sub7_Sub17_Sub1.anIntArray548[this.anInt8726];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt8719 != 0) {
			local79 = Class3_Sub7_Sub17_Sub1.anIntArray549[this.anInt8719];
			local84 = Class3_Sub7_Sub17_Sub1.anIntArray548[this.anInt8719];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class170 local147 = Static575.aClass170_6.method8369((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt8730);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt8732 * 1024 / (local147.RA() - local147.V());
		if (this.anInt8731 != 0) {
			local84 = local84 * 13 / 16;
		}
		@Pc(190) int[] local190 = arg0.Y();
		arg0.DA(this.anInt8732 / 2, this.anInt8732 / 2, local84, local84);
		arg0.method9405(arg0.method9376());
		@Pc(209) Class58 local209 = arg0.method9376();
		local209.method9524(0, 0, arg0.i() - local147.HA());
		local147.method8350(local209, (Class9_Sub9) null, 1024, 1);
		@Pc(231) int local231 = this.anInt8732 * 13 / 16;
		@Pc(238) int local238 = (this.anInt8732 - local231) / 2;
		Static575.aClass178_25.method7630(local238, local238, local231, local231, 0, this.anInt8731 | 0xFF000000, 1);
		this.aClass178_23 = arg0.method9356(0, 0, this.anInt8732, this.anInt8732, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt8732, this.anInt8732, 0, 0);
		Static575.aClass178_24.method7630(0, 0, this.anInt8732, this.anInt8732, 1, 0, 0);
		this.aClass178_23.method7620();
		arg0.DA(local190[0], local190[1], local190[2], local190[3]);
		arg0.KA(Static575.anIntArray633[0], Static575.anIntArray633[1], Static575.anIntArray633[2], Static575.anIntArray633[3]);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!ha;Lclient!ru;)Z")
	public boolean method7444(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class332 arg1) {
		return this.aClass178_23 != null || this.method7442(arg0, arg1);
	}
}
