import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class127 {

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	public int anInt3678;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	private int anInt3682;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
	private int anInt3684;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
	private int anInt3686;

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
	private int anInt3688;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "Lclient!aa;")
	private Class2 aClass2_6;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
	private final int anInt3683;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
	private final int anInt3681;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
	private final int anInt3680;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "Z")
	private final boolean aBoolean275;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
	private final int anInt3679;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
	private final int anInt3687;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
	private final int anInt3685;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	private final int anInt3677;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3683 = arg2;
		this.anInt3681 = arg3;
		this.anInt3680 = arg4;
		this.aBoolean275 = arg7;
		this.anInt3679 = arg1;
		this.anInt3687 = arg6;
		this.anInt3685 = arg5;
		this.anInt3677 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!qa;Lclient!kf;)V")
	private void method3166(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class127 arg1) {
		@Pc(6) Class160 local6 = Static16.method320(Static453.aClass250_103, this.anInt3679);
		if (local6 == null) {
			return;
		}
		arg0.p(Static209.anIntArray230);
		arg0.w(0, 0, this.anInt3686, this.anInt3686);
		arg0.M(0, 0, this.anInt3686, this.anInt3686, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean275) {
				local32 = -arg1.anInt3683;
				local34 = -arg1.anInt3681;
				local36 = -arg1.anInt3680;
			} else {
				local32 = this.anInt3683 - arg1.anInt3683;
				local34 = this.anInt3681 - arg1.anInt3681;
				local36 = this.anInt3680 - arg1.anInt3680;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt3688 != 0) {
			local81 = -this.anInt3688 & 0x3FFF;
			local85 = Class65.anIntArray88[local81];
			local89 = Class65.anIntArray87[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt3682 != 0) {
			local81 = -this.anInt3682 & 0x3FFF;
			local85 = Class65.anIntArray88[local81];
			local89 = Class65.anIntArray87[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.MA(1.0F);
		arg0.la(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class108 local172 = arg0.method5984(local6, 2048, 0, 64, 768);
		local85 = local172.J() - local172.da();
		local89 = local172.F() - local172.ja();
		local99 = local172.da() + local85 / 2;
		@Pc(198) int local198 = local172.ja() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.b(local99, local198, local205, local205);
		arg0.method6012(arg0.method5975());
		@Pc(218) Class11 local218 = arg0.method5989();
		local218.C(0, 0, arg0.na() - local172.K());
		local172.method4933(local218, null, arg0.na());
		this.aClass2_6 = arg0.method5974(0, 0, this.anInt3686, this.anInt3686, true);
		this.aClass2_6.J(0, 0, 3);
		arg0.w(Static209.anIntArray230[0], Static209.anIntArray230[1], Static209.anIntArray230[2], Static209.anIntArray230[3]);
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Lclient!qa;Lclient!kf;)V")
	private void method3169(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class127 arg1) {
		Static209.method3165(arg0);
		Static209.method3168(arg0);
		arg0.p(Static209.anIntArray230);
		arg0.w(0, 0, this.anInt3686, this.anInt3686);
		arg0.method6005();
		arg0.M(0, 0, this.anInt3686, this.anInt3686, this.anInt3687 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean275) {
				local31 = -arg1.anInt3683;
				local33 = -arg1.anInt3681;
				local35 = -arg1.anInt3680;
			} else {
				local31 = arg1.anInt3683 - this.anInt3683;
				local33 = arg1.anInt3681 - this.anInt3681;
				local35 = arg1.anInt3680 - this.anInt3680;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt3688 != 0) {
			local79 = Class65.anIntArray88[this.anInt3688];
			local84 = Class65.anIntArray87[this.anInt3688];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt3682 != 0) {
			local79 = Class65.anIntArray88[this.anInt3682];
			local84 = Class65.anIntArray87[this.anInt3682];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class108 local147 = Static209.aClass108_5.method4930((byte) 0, 51200, true);
		if (arg0.method5990()) {
			local147.G((short) 0, (short) this.anInt3679);
		} else {
			local147.i((short) 127, Static295.anInterface7_7.method4417(this.anInt3679).aShort40);
			local147.G((short) 0, (short) -1);
		}
		arg0.MA(1.0F);
		arg0.la(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt3686 * 1024 / (local147.J() - local147.da());
		if (this.anInt3687 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.b(this.anInt3686 / 2, this.anInt3686 / 2, local84, local84);
		arg0.method6012(arg0.method5975());
		@Pc(223) Class11 local223 = arg0.method5975();
		local223.C(0, 0, arg0.na() - local147.K());
		local147.method4933(local223, null, 1024);
		@Pc(245) int local245 = this.anInt3686 * 13 / 16;
		@Pc(252) int local252 = (this.anInt3686 - local245) / 2;
		Static209.aClass2_4.XA(local252, local252, local245, local245, 0, this.anInt3687 | 0xFF000000, 1);
		this.aClass2_6 = arg0.method5974(0, 0, this.anInt3686, this.anInt3686, true);
		arg0.method6005();
		arg0.M(0, 0, this.anInt3686, this.anInt3686, 0, 0);
		Static209.aClass2_5.XA(0, 0, this.anInt3686, this.anInt3686, 1, 0, 0);
		this.aClass2_6.J(0, 0, 0);
		arg0.w(Static209.anIntArray230[0], Static209.anIntArray230[1], Static209.anIntArray230[2], Static209.anIntArray230[3]);
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(Lclient!qa;Lclient!kf;)Z")
	public boolean method3170(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class127 arg1) {
		return this.aClass2_6 != null || this.method3175(arg0, arg1);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIII)Z")
	public boolean method3172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean275) {
			this.anInt3678 = 1073741823;
			local7 = this.anInt3683;
			local12 = this.anInt3681;
			local17 = this.anInt3680;
		} else {
			local7 = this.anInt3683 - arg0;
			local12 = this.anInt3681 - arg1;
			local17 = this.anInt3680 - arg2;
			this.anInt3678 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt3678 == 0) {
				this.anInt3678 = 1;
			}
			local7 = (local7 << 8) / this.anInt3678;
			local12 = (local12 << 8) / this.anInt3678;
			local17 = (local17 << 8) / this.anInt3678;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt3684 = this.anInt3685 * arg3 / (this.aBoolean275 ? 1024 : this.anInt3678);
		} else {
			this.anInt3684 = 0;
		}
		if (this.anInt3684 < 8) {
			this.aClass2_6 = null;
			return false;
		}
		@Pc(143) int local143 = Static342.method4774(this.anInt3684);
		if (local143 > arg3) {
			local143 = Static146.method2292(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt3686) {
			this.anInt3686 = local143;
		}
		this.anInt3688 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt3682 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass2_6 = null;
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!qa;IIIIII)V")
	public void method3173(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass2_6 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt3688 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt3682 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt3684) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt3684) / 2;
		if (local38 < arg4 && local38 + this.anInt3684 > 0 && local51 < arg3 && local51 + this.anInt3684 > 0) {
			this.aClass2_6.method5835(local51 + arg1, local38 + arg2, this.anInt3684, this.anInt3684);
		}
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "()V")
	public void method3174() {
		this.aClass2_6 = null;
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(Lclient!qa;Lclient!kf;)Z")
	private boolean method3175(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class127 arg1) {
		if (this.aClass2_6 == null) {
			if (this.anInt3677 == 0) {
				if (Static295.anInterface7_7.method4420(this.anInt3679)) {
					@Pc(23) int[] local23 = Static295.anInterface7_7.method4418(this.anInt3679, this.anInt3686, this.anInt3686, 0.7F);
					this.aClass2_6 = arg0.method6021(local23, this.anInt3686, this.anInt3686, this.anInt3686);
				}
			} else if (this.anInt3677 == 2) {
				this.method3166(arg0, arg1);
			} else if (this.anInt3677 == 1) {
				this.method3169(arg0, arg1);
			}
		}
		return this.aClass2_6 != null;
	}
}
