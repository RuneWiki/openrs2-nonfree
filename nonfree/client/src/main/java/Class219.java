import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class219 {

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
	public int anInt5671;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
	private int anInt5672;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	private int anInt5678;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	private int anInt5681;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "Lclient!ug;")
	private Class43 aClass43_21;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	private int anInt5682;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	private final int anInt5676;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	private final int anInt5683;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	private final int anInt5677;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Z")
	private final boolean aBoolean483;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	private final int anInt5673;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	private final int anInt5684;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	private final int anInt5674;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
	private final int anInt5680;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
	private final int anInt5670;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
	private final int anInt5679;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
	private final int anInt5675;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(IIIIIIIZIII)V")
	public Class219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt5676 = arg2;
		this.anInt5683 = arg3;
		this.anInt5677 = arg4;
		this.aBoolean483 = arg7;
		this.anInt5673 = arg1;
		this.anInt5684 = arg6;
		this.anInt5674 = arg5;
		this.anInt5680 = arg0;
		this.anInt5670 = arg8;
		this.anInt5679 = arg9;
		this.anInt5675 = arg10;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ha;Lclient!lc;)Z")
	private boolean method5103(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class219 arg1) {
		if (this.aClass43_21 == null) {
			if (this.anInt5680 == 0) {
				if (Static309.anInterface3_4.method2852(this.anInt5673)) {
					@Pc(23) int[] local23 = Static309.anInterface3_4.method2854(this.anInt5678, this.anInt5673, this.anInt5678, 0.7F);
					this.aClass43_21 = arg0.method9711(this.anInt5678, this.anInt5678, this.anInt5678, local23);
				}
			} else if (this.anInt5680 == 2) {
				this.method5107(arg0, arg1);
			} else if (this.anInt5680 == 1) {
				this.method5106(arg0, arg1);
			}
		}
		return this.aClass43_21 != null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)Z")
	public boolean method5105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean483) {
			this.anInt5671 = 1073741823;
			local7 = this.anInt5676;
			local12 = this.anInt5683;
			local17 = this.anInt5677;
		} else {
			local7 = this.anInt5676 - arg0;
			local12 = this.anInt5683 - arg1;
			local17 = this.anInt5677 - arg2;
			this.anInt5671 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5671 == 0) {
				this.anInt5671 = 1;
			}
			local7 = (local7 << 8) / this.anInt5671;
			local12 = (local12 << 8) / this.anInt5671;
			local17 = (local17 << 8) / this.anInt5671;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5681 = this.anInt5674 * arg3 / (this.aBoolean483 ? 1024 : this.anInt5671);
		} else {
			this.anInt5681 = 0;
		}
		if (this.anInt5681 < 8) {
			this.aClass43_21 = null;
			return false;
		}
		@Pc(143) int local143 = Static330.method4577(this.anInt5681);
		if (local143 > arg3) {
			local143 = Static457.method6640(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5678) {
			this.anInt5678 = local143;
		}
		this.anInt5672 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt5682 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass43_21 = null;
		return true;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Lclient!ha;Lclient!lc;)V")
	private void method5106(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class219 arg1) {
		Static355.method5110(arg0);
		Static355.method5104(arg0);
		arg0.K(Static355.anIntArray379);
		arg0.KA(0, 0, this.anInt5678, this.anInt5678);
		arg0.ya();
		arg0.aa(0, 0, this.anInt5678, this.anInt5678, this.anInt5684 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean483) {
				local31 = -arg1.anInt5676;
				local33 = -arg1.anInt5683;
				local35 = -arg1.anInt5677;
			} else {
				local31 = arg1.anInt5676 - this.anInt5676;
				local33 = arg1.anInt5683 - this.anInt5683;
				local35 = arg1.anInt5677 - this.anInt5677;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt5672 != 0) {
			local79 = Class145_Sub1.anIntArray761[this.anInt5672];
			local84 = Class145_Sub1.anIntArray760[this.anInt5672];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt5682 != 0) {
			local79 = Class145_Sub1.anIntArray761[this.anInt5682];
			local84 = Class145_Sub1.anIntArray760[this.anInt5682];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class45 local147 = Static355.aClass45_3.method5768((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt5673);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt5678 * 1024 / (local147.RA() - local147.V());
		if (this.anInt5684 != 0) {
			local84 = local84 * 13 / 16;
		}
		@Pc(190) int[] local190 = arg0.Y();
		arg0.DA(this.anInt5678 / 2, this.anInt5678 / 2, local84, local84);
		arg0.method9656(arg0.method9691());
		@Pc(209) Class86 local209 = arg0.method9691();
		local209.method7026(0, 0, arg0.i() - local147.HA());
		local147.method5759(local209, (Class4_Sub6) null, 1024, 1);
		@Pc(231) int local231 = this.anInt5678 * 13 / 16;
		@Pc(238) int local238 = (this.anInt5678 - local231) / 2;
		Static355.aClass43_19.method9584(local238, local238, local231, local231, 0, this.anInt5684 | 0xFF000000, 1);
		this.aClass43_21 = arg0.method9654(0, 0, this.anInt5678, this.anInt5678, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt5678, this.anInt5678, 0, 0);
		Static355.aClass43_20.method9584(0, 0, this.anInt5678, this.anInt5678, 1, 0, 0);
		this.aClass43_21.method9598();
		arg0.DA(local190[0], local190[1], local190[2], local190[3]);
		arg0.KA(Static355.anIntArray379[0], Static355.anIntArray379[1], Static355.anIntArray379[2], Static355.anIntArray379[3]);
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(Lclient!ha;Lclient!lc;)V")
	private void method5107(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class219 arg1) {
		@Pc(6) Class229 local6 = Static594.method8178(this.anInt5673, Static544.aClass254_135);
		if (local6 == null) {
			return;
		}
		arg0.K(Static355.anIntArray379);
		arg0.KA(0, 0, this.anInt5678, this.anInt5678);
		arg0.ya();
		arg0.aa(0, 0, this.anInt5678, this.anInt5678, 0, 0);
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean483) {
				local34 = -arg1.anInt5676;
				local36 = -arg1.anInt5683;
				local38 = -arg1.anInt5677;
			} else {
				local34 = this.anInt5676 - arg1.anInt5676;
				local36 = this.anInt5683 - arg1.anInt5683;
				local38 = this.anInt5677 - arg1.anInt5677;
			}
		}
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(91) int local91;
		@Pc(101) int local101;
		if (this.anInt5672 != 0) {
			local83 = -this.anInt5672 & 0x3FFF;
			local87 = Class145_Sub1.anIntArray761[local83];
			local91 = Class145_Sub1.anIntArray760[local83];
			local101 = local36 * local91 - local38 * local87 >> 14;
			local38 = local36 * local87 + local38 * local91 >> 14;
			local36 = local101;
		}
		if (this.anInt5682 != 0) {
			local83 = -this.anInt5682 & 0x3FFF;
			local87 = Class145_Sub1.anIntArray761[local83];
			local91 = Class145_Sub1.anIntArray760[local83];
			local101 = local38 * local87 + local34 * local91 >> 14;
			local38 = local38 * local91 - local34 * local87 >> 14;
			local34 = local101;
		}
		arg0.xa(1.0F);
		arg0.ZA(this.anInt5684, 1.0F, 1.0F, (float) local34, (float) local36, (float) local38);
		local6.method5308(this.anInt5679 & 0x3FFF, this.anInt5670 & 0x3FFF, this.anInt5675 & 0x3FFF);
		@Pc(190) Class45 local190 = arg0.method9700(local6, 2048, 0, 64, 768);
		local87 = local190.RA() - local190.V();
		local91 = local190.EA() - local190.fa();
		local101 = local87 > local91 ? local87 : local91;
		@Pc(216) int local216 = this.anInt5678 * 1024 / local101;
		@Pc(219) int[] local219 = arg0.Y();
		arg0.DA(this.anInt5678 / 2, this.anInt5678 / 2, local216, local216);
		arg0.method9656(arg0.method9691());
		@Pc(238) Class86 local238 = arg0.method9699();
		local238.method7026(0, 0, arg0.i() - local190.HA());
		local190.method5759(local238, (Class4_Sub6) null, arg0.i(), 1);
		this.aClass43_21 = arg0.method9654(0, 0, this.anInt5678, this.anInt5678, true);
		this.aClass43_21.method9598();
		arg0.DA(local219[0], local219[1], local219[2], local219[3]);
		arg0.KA(Static355.anIntArray379[0], Static355.anIntArray379[1], Static355.anIntArray379[2], Static355.anIntArray379[3]);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ha;IIIIIIIIII)V")
	public void method5108(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (this.aClass43_21 == null) {
			return;
		}
		@Pc(6) int[] local6 = new int[3];
		@Pc(14) int local14 = -(this.anInt5676 - arg7 << 16);
		@Pc(21) int local21 = this.anInt5683 - arg8 << 15;
		@Pc(29) int local29 = -(this.anInt5677 - arg9 << 16);
		@Pc(32) Class86 local32 = arg0.method9716();
		local32.method7028(0, 0, 0, local6);
		@Pc(44) int local44 = local14 + local6[0];
		@Pc(50) int local50 = local21 + local6[1];
		@Pc(56) int local56 = local29 + local6[2];
		arg0.H(local44, local50, local56, local6);
		if (local6[2] < 0) {
			return;
		}
		@Pc(75) int local75 = local6[0] - this.anInt5681 / 2;
		@Pc(84) int local84 = local6[1] - this.anInt5681 / 2;
		if (local84 < arg4 && local84 + this.anInt5681 > 0 && local75 < arg3 && local75 + this.anInt5681 > 0) {
			this.aClass43_21.method9584(local75, local84, this.anInt5681, this.anInt5681, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(Lclient!ha;Lclient!lc;)Z")
	public boolean method5109(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class219 arg1) {
		return this.aClass43_21 != null || this.method5103(arg0, arg1);
	}
}
