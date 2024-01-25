import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class104 {

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
	private int anInt3270;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "Lclient!xa;")
	private Class37 aClass37_11;

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
	private int anInt3274;

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
	private int anInt3275;

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
	private int anInt3277;

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
	public int anInt3278;

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
	private final int anInt3279;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
	private final int anInt3268;

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
	private final int anInt3273;

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "Z")
	private final boolean aBoolean255;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
	private final int anInt3272;

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
	private final int anInt3276;

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
	private final int anInt3269;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
	private final int anInt3271;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3279 = arg2;
		this.anInt3268 = arg3;
		this.anInt3273 = arg4;
		this.aBoolean255 = arg7;
		this.anInt3272 = arg1;
		this.anInt3276 = arg6;
		this.anInt3269 = arg5;
		this.anInt3271 = arg0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!oa;Lclient!fm;)Z")
	private boolean method2869(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class104 arg1) {
		if (this.aClass37_11 == null) {
			if (this.anInt3271 == 0) {
				if (Static478.anInterface4_14.method3090(this.anInt3272)) {
					@Pc(23) int[] local23 = Static478.anInterface4_14.method3089(this.anInt3275, this.anInt3272, this.anInt3275, 0.7F);
					this.aClass37_11 = arg0.method5324(local23, this.anInt3275, this.anInt3275, this.anInt3275);
				}
			} else if (this.anInt3271 == 2) {
				this.method2873(arg0, arg1);
			} else if (this.anInt3271 == 1) {
				this.method2875(arg0, arg1);
			}
		}
		return this.aClass37_11 != null;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "()V")
	public void method2870() {
		this.aClass37_11 = null;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(Lclient!oa;Lclient!fm;)V")
	private void method2873(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class104 arg1) {
		@Pc(6) Class96 local6 = Static374.method6085(this.anInt3272, Static209.aClass254_70);
		if (local6 == null) {
			return;
		}
		arg0.A(Static143.anIntArray209);
		arg0.ca(0, 0, this.anInt3275, this.anInt3275);
		arg0.C(0, 0, this.anInt3275, this.anInt3275, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean255) {
				local32 = -arg1.anInt3279;
				local34 = -arg1.anInt3268;
				local36 = -arg1.anInt3273;
			} else {
				local32 = this.anInt3279 - arg1.anInt3279;
				local34 = this.anInt3268 - arg1.anInt3268;
				local36 = this.anInt3273 - arg1.anInt3273;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt3270 != 0) {
			local81 = -this.anInt3270 & 0x3FFF;
			local85 = Class2_Sub3.anIntArray620[local81];
			local89 = Class2_Sub3.anIntArray621[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt3274 != 0) {
			local81 = -this.anInt3274 & 0x3FFF;
			local85 = Class2_Sub3.anIntArray620[local81];
			local89 = Class2_Sub3.anIntArray621[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ha(1.0F);
		arg0.YA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class21 local172 = arg0.method5352(local6, 2048, 0, 64, 768);
		local85 = local172.M() - local172.ha();
		local89 = local172.EA() - local172.DA();
		local99 = local172.ha() + local85 / 2;
		@Pc(198) int local198 = local172.DA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.m(local99, local198, local205, local205);
		arg0.method5291(arg0.method5294());
		@Pc(218) Class255 local218 = arg0.method5343();
		local218.GA(0, 0, arg0.U() - local172.LA());
		local172.method7133(local218, null, arg0.U());
		this.aClass37_11 = arg0.method5290(0, 0, this.anInt3275, this.anInt3275, true);
		this.aClass37_11.t(0, 0, 3);
		arg0.ca(Static143.anIntArray209[0], Static143.anIntArray209[1], Static143.anIntArray209[2], Static143.anIntArray209[3]);
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(Lclient!oa;Lclient!fm;)Z")
	public boolean method2874(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class104 arg1) {
		return this.aClass37_11 != null || this.method2869(arg0, arg1);
	}

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "(Lclient!oa;Lclient!fm;)V")
	private void method2875(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class104 arg1) {
		Static143.method2872(arg0);
		Static143.method2877(arg0);
		arg0.A(Static143.anIntArray209);
		arg0.ca(0, 0, this.anInt3275, this.anInt3275);
		arg0.method5342();
		arg0.C(0, 0, this.anInt3275, this.anInt3275, this.anInt3276 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean255) {
				local31 = -arg1.anInt3279;
				local33 = -arg1.anInt3268;
				local35 = -arg1.anInt3273;
			} else {
				local31 = arg1.anInt3279 - this.anInt3279;
				local33 = arg1.anInt3268 - this.anInt3268;
				local35 = arg1.anInt3273 - this.anInt3273;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt3270 != 0) {
			local79 = Class2_Sub3.anIntArray620[this.anInt3270];
			local84 = Class2_Sub3.anIntArray621[this.anInt3270];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt3274 != 0) {
			local79 = Class2_Sub3.anIntArray620[this.anInt3274];
			local84 = Class2_Sub3.anIntArray621[this.anInt3274];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class21 local147 = Static143.aClass21_2.method7131((byte) 0, 51200, true);
		if (arg0.method5288()) {
			local147.ka((short) 0, (short) this.anInt3272);
		} else {
			local147.UA((short) 127, Static478.anInterface4_14.method3088(this.anInt3272).aShort56);
			local147.ka((short) 0, (short) -1);
		}
		arg0.ha(1.0F);
		arg0.YA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt3275 * 1024 / (local147.M() - local147.ha());
		if (this.anInt3276 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.m(this.anInt3275 / 2, this.anInt3275 / 2, local84, local84);
		arg0.method5291(arg0.method5294());
		@Pc(223) Class255 local223 = arg0.method5294();
		local223.GA(0, 0, arg0.U() - local147.LA());
		local147.method7133(local223, null, 1024);
		@Pc(245) int local245 = this.anInt3275 * 13 / 16;
		@Pc(252) int local252 = (this.anInt3275 - local245) / 2;
		Static143.aClass37_13.KA(local252, local252, local245, local245, 0, this.anInt3276 | 0xFF000000, 1);
		this.aClass37_11 = arg0.method5290(0, 0, this.anInt3275, this.anInt3275, true);
		arg0.method5342();
		arg0.C(0, 0, this.anInt3275, this.anInt3275, 0, 0);
		Static143.aClass37_12.KA(0, 0, this.anInt3275, this.anInt3275, 1, 0, 0);
		this.aClass37_11.t(0, 0, 0);
		arg0.ca(Static143.anIntArray209[0], Static143.anIntArray209[1], Static143.anIntArray209[2], Static143.anIntArray209[3]);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!oa;IIIIII)V")
	public void method2876(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass37_11 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt3270 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt3274 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt3277) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt3277) / 2;
		if (local38 < arg4 && local38 + this.anInt3277 > 0 && local51 < arg3 && local51 + this.anInt3277 > 0) {
			this.aClass37_11.method7080(local51 + arg1, local38 + arg2, this.anInt3277, this.anInt3277);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIII)Z")
	public boolean method2878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean255) {
			this.anInt3278 = 1073741823;
			local7 = this.anInt3279;
			local12 = this.anInt3268;
			local17 = this.anInt3273;
		} else {
			local7 = this.anInt3279 - arg0;
			local12 = this.anInt3268 - arg1;
			local17 = this.anInt3273 - arg2;
			this.anInt3278 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt3278 == 0) {
				this.anInt3278 = 1;
			}
			local7 = (local7 << 8) / this.anInt3278;
			local12 = (local12 << 8) / this.anInt3278;
			local17 = (local17 << 8) / this.anInt3278;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt3277 = this.anInt3269 * arg3 / (this.aBoolean255 ? 1024 : this.anInt3278);
		} else {
			this.anInt3277 = 0;
		}
		if (this.anInt3277 < 8) {
			this.aClass37_11 = null;
			return false;
		}
		@Pc(143) int local143 = Static178.method3152(this.anInt3277);
		if (local143 > arg3) {
			local143 = Static332.method5752(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt3275) {
			this.anInt3275 = local143;
		}
		this.anInt3270 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt3274 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass37_11 = null;
		return true;
	}
}
