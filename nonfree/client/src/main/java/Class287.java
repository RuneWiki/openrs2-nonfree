import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class287 {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
	private int anInt8273;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
	public int anInt8274;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	private int anInt8277;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
	private int anInt8278;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Lclient!ha;")
	private Class12 aClass12_20;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
	private int anInt8283;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	private final int anInt8276;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
	private final int anInt8272;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
	private final int anInt8281;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "Z")
	private final boolean aBoolean566;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
	private final int anInt8280;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
	private final int anInt8282;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
	private final int anInt8279;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	private final int anInt8275;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt8276 = arg2;
		this.anInt8272 = arg3;
		this.anInt8281 = arg4;
		this.aBoolean566 = arg7;
		this.anInt8280 = arg1;
		this.anInt8282 = arg6;
		this.anInt8279 = arg5;
		this.anInt8275 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)Z")
	public boolean method7024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean566) {
			this.anInt8274 = 1073741823;
			local7 = this.anInt8276;
			local12 = this.anInt8272;
			local17 = this.anInt8281;
		} else {
			local7 = this.anInt8276 - arg0;
			local12 = this.anInt8272 - arg1;
			local17 = this.anInt8281 - arg2;
			this.anInt8274 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt8274 == 0) {
				this.anInt8274 = 1;
			}
			local7 = (local7 << 8) / this.anInt8274;
			local12 = (local12 << 8) / this.anInt8274;
			local17 = (local17 << 8) / this.anInt8274;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt8283 = this.anInt8279 * arg3 / (this.aBoolean566 ? 1024 : this.anInt8274);
		} else {
			this.anInt8283 = 0;
		}
		if (this.anInt8283 < 8) {
			this.aClass12_20 = null;
			return false;
		}
		@Pc(143) int local143 = Static117.method2662(this.anInt8283);
		if (local143 > arg3) {
			local143 = Static216.method3865(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt8278) {
			this.anInt8278 = local143;
		}
		this.anInt8277 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt8273 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass12_20 = null;
		return true;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!qa;IIIIII)V")
	public void method7025(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass12_20 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt8277 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt8273 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt8283) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt8283) / 2;
		if (local38 < arg4 && local38 + this.anInt8283 > 0 && local51 < arg3 && local51 + this.anInt8283 > 0) {
			this.aClass12_20.method7192(local51 + arg1, local38 + arg2, this.anInt8283, this.anInt8283);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!qa;Lclient!uf;)Z")
	public boolean method7026(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class287 arg1) {
		return this.aClass12_20 != null || this.method7028(arg0, arg1);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(Lclient!qa;Lclient!uf;)Z")
	private boolean method7028(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class287 arg1) {
		if (this.aClass12_20 == null) {
			if (this.anInt8275 == 0) {
				if (Static534.anInterface8_14.method7084(this.anInt8280)) {
					@Pc(23) int[] local23 = Static534.anInterface8_14.method7086(this.anInt8278, this.anInt8278, this.anInt8280, 0.7F);
					this.aClass12_20 = arg0.method7641(local23, this.anInt8278, this.anInt8278, this.anInt8278);
				}
			} else if (this.anInt8275 == 2) {
				this.method7033(arg0, arg1);
			} else if (this.anInt8275 == 1) {
				this.method7029(arg0, arg1);
			}
		}
		return this.aClass12_20 != null;
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(Lclient!qa;Lclient!uf;)V")
	private void method7029(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class287 arg1) {
		Static486.method7032(arg0);
		Static486.method7027(arg0);
		arg0.d(Static486.anIntArray644);
		arg0.N(0, 0, this.anInt8278, this.anInt8278);
		arg0.method7623();
		arg0.f(0, 0, this.anInt8278, this.anInt8278, this.anInt8282 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean566) {
				local31 = -arg1.anInt8276;
				local33 = -arg1.anInt8272;
				local35 = -arg1.anInt8281;
			} else {
				local31 = arg1.anInt8276 - this.anInt8276;
				local33 = arg1.anInt8272 - this.anInt8272;
				local35 = arg1.anInt8281 - this.anInt8281;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt8277 != 0) {
			local79 = Class307.anIntArray744[this.anInt8277];
			local84 = Class307.anIntArray743[this.anInt8277];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt8273 != 0) {
			local79 = Class307.anIntArray744[this.anInt8273];
			local84 = Class307.anIntArray743[this.anInt8273];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class19 local147 = Static486.aClass19_7.method7260((byte) 0, 51200, true);
		if (arg0.method7575()) {
			local147.L((short) 0, (short) this.anInt8280);
		} else {
			local147.pa((short) 127, Static534.anInterface8_14.method7085(this.anInt8280).aShort81);
			local147.L((short) 0, (short) -1);
		}
		arg0.M(1.0F);
		arg0.m(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt8278 * 1024 / (local147.va() - local147.wa());
		if (this.anInt8282 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.b(this.anInt8278 / 2, this.anInt8278 / 2, local84, local84);
		arg0.method7597(arg0.method7644());
		@Pc(223) Class22 local223 = arg0.method7644();
		local223.oa(0, 0, arg0.c() - local147.Q());
		local147.method7253(local223, null, 1024);
		@Pc(245) int local245 = this.anInt8278 * 13 / 16;
		@Pc(252) int local252 = (this.anInt8278 - local245) / 2;
		Static486.aClass12_19.ra(local252, local252, local245, local245, 0, this.anInt8282 | 0xFF000000, 1);
		this.aClass12_20 = arg0.method7612(0, 0, this.anInt8278, this.anInt8278, true);
		arg0.method7623();
		arg0.f(0, 0, this.anInt8278, this.anInt8278, 0, 0);
		Static486.aClass12_18.ra(0, 0, this.anInt8278, this.anInt8278, 1, 0, 0);
		this.aClass12_20.BA(0, 0, 0);
		arg0.N(Static486.anIntArray644[0], Static486.anIntArray644[1], Static486.anIntArray644[2], Static486.anIntArray644[3]);
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(Lclient!qa;Lclient!uf;)V")
	private void method7033(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class287 arg1) {
		@Pc(6) Class86 local6 = Static469.method6840(this.anInt8280, Static521.aClass160_102);
		if (local6 == null) {
			return;
		}
		arg0.d(Static486.anIntArray644);
		arg0.N(0, 0, this.anInt8278, this.anInt8278);
		arg0.f(0, 0, this.anInt8278, this.anInt8278, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean566) {
				local32 = -arg1.anInt8276;
				local34 = -arg1.anInt8272;
				local36 = -arg1.anInt8281;
			} else {
				local32 = this.anInt8276 - arg1.anInt8276;
				local34 = this.anInt8272 - arg1.anInt8272;
				local36 = this.anInt8281 - arg1.anInt8281;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt8277 != 0) {
			local81 = -this.anInt8277 & 0x3FFF;
			local85 = Class307.anIntArray744[local81];
			local89 = Class307.anIntArray743[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt8273 != 0) {
			local81 = -this.anInt8273 & 0x3FFF;
			local85 = Class307.anIntArray744[local81];
			local89 = Class307.anIntArray743[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.M(1.0F);
		arg0.m(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class19 local172 = arg0.method7635(local6, 2048, 0, 64, 768);
		local85 = local172.va() - local172.wa();
		local89 = local172.n() - local172.TA();
		local99 = local172.wa() + local85 / 2;
		@Pc(198) int local198 = local172.TA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.b(local99, local198, local205, local205);
		arg0.method7597(arg0.method7644());
		@Pc(218) Class22 local218 = arg0.method7642();
		local218.oa(0, 0, arg0.c() - local172.Q());
		local172.method7253(local218, null, arg0.c());
		this.aClass12_20 = arg0.method7612(0, 0, this.anInt8278, this.anInt8278, true);
		this.aClass12_20.BA(0, 0, 3);
		arg0.N(Static486.anIntArray644[0], Static486.anIntArray644[1], Static486.anIntArray644[2], Static486.anIntArray644[3]);
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "()V")
	public void method7034() {
		this.aClass12_20 = null;
	}
}
