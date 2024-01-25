import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class7_Sub5 extends Class7 {

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
	private int anInt5512;

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
	private int anInt5513;

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
	private int anInt5514;

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
	private int anInt5516;

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
	private int anInt5517;

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
	private int anInt5518;

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
	public int anInt5519;

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
	private int anInt5521;

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
	private int anInt5522;

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
	private int anInt5524;

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
	private int anInt5525;

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
	private int anInt5526;

	@OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
	private int anInt5527;

	@OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
	private int anInt5528;

	@OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
	public int anInt5529;

	@OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
	private int anInt5530;

	@OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
	public int anInt5532;

	@OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
	private int anInt5534;

	@OriginalMember(owner = "client!lk", name = "Q", descriptor = "I")
	private int anInt5536;

	@OriginalMember(owner = "client!lk", name = "R", descriptor = "I")
	public int anInt5537;

	@OriginalMember(owner = "client!lk", name = "B", descriptor = "Z")
	private boolean aBoolean422 = false;

	@OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
	private int anInt5535 = 0;

	@OriginalMember(owner = "client!lk", name = "J", descriptor = "Z")
	public boolean aBoolean423 = false;

	@OriginalMember(owner = "client!lk", name = "N", descriptor = "Lclient!jw;")
	public final Class7_Sub3 aClass7_Sub3_4;

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "J")
	private final long aLong151;

	@OriginalMember(owner = "client!lk", name = "G", descriptor = "Lclient!ig;")
	public final Class142 aClass142_2;

	@OriginalMember(owner = "client!lk", name = "P", descriptor = "Lclient!tb;")
	public Class282 aClass282_1;

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "Lclient!it;")
	public final Class149 aClass149_5;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!qa;Lclient!ig;Lclient!jw;J)V")
	public Class7_Sub5(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class142 arg1, @OriginalArg(2) Class7_Sub3 arg2, @OriginalArg(3) long arg3) {
		this.aClass7_Sub3_4 = arg2;
		this.aLong151 = arg3;
		this.aClass142_2 = arg1;
		this.aClass282_1 = this.aClass142_2.method3822();
		if (!arg0.method5818() && this.aClass282_1.anInt8395 != -1) {
			this.aClass282_1 = Static365.method5703(this.aClass282_1.anInt8395);
		}
		this.aClass149_5 = new Class149();
		this.anInt5535 = (int) ((double) this.anInt5535 + Math.random() * 64.0D);
		this.method4649();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!qa;JI)V")
	public void method4647(@OriginalArg(0) Class42 arg0, @OriginalArg(1) long arg1) {
		for (@Pc(15) Class7_Sub1_Sub1_Sub1 local15 = (Class7_Sub1_Sub1_Sub1) this.aClass149_5.method3989(); local15 != null; local15 = (Class7_Sub1_Sub1_Sub1) this.aClass149_5.method3986()) {
			local15.method2944(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
	public void method4649() {
		this.anInt5530 = this.aClass142_2.anInt4551;
		this.anInt5522 = this.aClass142_2.anInt4546;
		this.anInt5536 = this.aClass142_2.anInt4541;
		this.anInt5517 = this.aClass142_2.anInt4545;
		this.anInt5527 = this.aClass142_2.anInt4547;
		this.anInt5534 = this.aClass142_2.anInt4550;
		this.anInt5513 = this.aClass142_2.anInt4548;
		this.anInt5516 = this.aClass142_2.anInt4543;
		this.anInt5521 = this.aClass142_2.anInt4535;
		if (this.anInt5516 == this.anInt5527 && this.anInt5527 == this.anInt5521 && this.anInt5536 == this.anInt5517 && this.anInt5536 == this.anInt5513 && this.anInt5534 == this.anInt5530 && this.anInt5534 == this.anInt5522) {
			this.aBoolean422 = true;
			return;
		}
		this.aBoolean422 = false;
		@Pc(113) int local113 = (this.anInt5521 + this.anInt5516 + this.anInt5527) / 3;
		@Pc(124) int local124 = (this.anInt5513 + this.anInt5536 + this.anInt5517) / 3;
		@Pc(135) int local135 = (this.anInt5530 + this.anInt5534 + this.anInt5522) / 3;
		if (this.anInt5537 == local113 && this.anInt5532 == local124 && this.anInt5519 == local135) {
			return;
		}
		this.anInt5519 = local135;
		this.anInt5532 = local124;
		this.anInt5537 = local113;
		@Pc(164) int local164 = this.anInt5527 - this.anInt5516;
		@Pc(171) int local171 = this.anInt5536 - this.anInt5517;
		@Pc(178) int local178 = this.anInt5534 - this.anInt5530;
		@Pc(185) int local185 = this.anInt5521 - this.anInt5516;
		@Pc(192) int local192 = this.anInt5513 - this.anInt5517;
		@Pc(199) int local199 = this.anInt5522 - this.anInt5530;
		this.anInt5514 = local171 * local199 - local192 * local178;
		this.anInt5518 = local164 * local192 - local171 * local185;
		for (this.anInt5526 = local185 * local178 - local164 * local199; this.anInt5514 > 32767 || this.anInt5526 > 32767 || this.anInt5518 > 32767 || this.anInt5514 < -32767 || this.anInt5526 < -32767 || this.anInt5518 < -32767; this.anInt5526 >>= 0x1) {
			this.anInt5518 >>= 0x1;
			this.anInt5514 >>= 0x1;
		}
		@Pc(301) int local301 = (int) Math.sqrt((double) (this.anInt5526 * this.anInt5526 + this.anInt5514 * this.anInt5514 + this.anInt5518 * this.anInt5518));
		if (local301 <= 0) {
			local301 = 1;
		}
		this.anInt5518 = this.anInt5518 * 32767 / local301;
		this.anInt5514 = this.anInt5514 * 32767 / local301;
		this.anInt5526 = this.anInt5526 * 32767 / local301;
		if (this.aClass282_1.aShort97 <= 0 && this.aClass282_1.aShort100 <= 0) {
			return;
		}
		@Pc(354) int local354 = (int) (Math.atan2((double) this.anInt5518, (double) this.anInt5514) * 2607.5945876176133D);
		@Pc(375) int local375 = (int) (Math.atan2((double) this.anInt5526, Math.sqrt((double) (this.anInt5518 * this.anInt5518 + this.anInt5514 * this.anInt5514))) * 2607.5945876176133D);
		this.anInt5528 = this.aClass282_1.aShort97 - this.aClass282_1.aShort98;
		this.anInt5524 = this.aClass282_1.aShort100 - this.aClass282_1.aShort99;
		this.anInt5525 = this.aClass282_1.aShort98 + local354 - (this.anInt5528 >> 1);
		this.anInt5512 = local375 + this.aClass282_1.aShort99 - (this.anInt5524 >> 1);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IJLclient!qa;IZ)V")
	public void method4650(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(38) int local38;
		if (this.aBoolean423) {
			arg3 = false;
		} else if (Static324.anInt6094 < this.aClass282_1.anInt8394) {
			arg3 = false;
		} else if (Static322.anInt9407 > Static284.anIntArray396[Static324.anInt6094]) {
			arg3 = false;
		} else if (this.aBoolean422) {
			arg3 = false;
		} else if (this.aClass282_1.anInt8398 != -1) {
			local38 = (int) (arg1 - this.aLong151);
			if (this.aClass282_1.aBoolean602 || this.aClass282_1.anInt8398 >= local38) {
				local38 %= this.aClass282_1.anInt8398;
			} else {
				arg3 = false;
			}
			if (!this.aClass282_1.aBoolean599 && local38 < this.aClass282_1.anInt8415) {
				arg3 = false;
			}
			if (this.aClass282_1.aBoolean599 && this.aClass282_1.anInt8415 <= local38) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt5535 += (int) ((double) arg0 * ((double) this.aClass282_1.anInt8418 + (double) (this.aClass282_1.anInt8408 - this.aClass282_1.anInt8418) * Math.random()));
			if (this.anInt5535 > 63) {
				local38 = this.anInt5535 >> 6;
				this.anInt5535 &= 0x3F;
				for (@Pc(139) int local139 = 0; local139 < local38; local139++) {
					@Pc(208) int local208;
					@Pc(214) int local214;
					@Pc(220) int local220;
					@Pc(166) int local166;
					@Pc(174) int local174;
					@Pc(178) int local178;
					@Pc(188) int local188;
					@Pc(196) int local196;
					@Pc(200) int local200;
					if (this.aClass282_1.aShort97 <= 0 && this.aClass282_1.aShort100 <= 0) {
						local208 = this.anInt5514;
						local220 = this.anInt5518;
						local214 = this.anInt5526;
					} else {
						local166 = this.anInt5525 + (int) ((double) this.anInt5528 * Math.random());
						@Pc(170) int local170 = local166 & 0x3FFF;
						local174 = Class12_Sub1_Sub36.anIntArray667[local170];
						local178 = Class12_Sub1_Sub36.anIntArray668[local170];
						local188 = this.anInt5512 + (int) ((double) this.anInt5524 * Math.random());
						@Pc(192) int local192 = local188 & 0x1FFF;
						local196 = Class12_Sub1_Sub36.anIntArray667[local192];
						local200 = Class12_Sub1_Sub36.anIntArray668[local192];
						local208 = local178 * local196 >> 15;
						local214 = (local200 << 0) * -1;
						local220 = local174 * local196 >> 15;
					}
					local166 = (int) (Math.random() * 65535.0D);
					local174 = (int) (Math.random() * 65535.0D);
					if (local166 + local174 > 65535) {
						local166 = 65535 - local166;
						local174 = 65535 - local174;
					}
					local178 = 65535 - local166 - local174;
					local188 = (int) ((long) this.anInt5521 * (long) local178 + (long) local166 * (long) this.anInt5516 + (long) local174 * (long) this.anInt5527 >> 16);
					local196 = (int) ((long) local174 * (long) this.anInt5536 + (long) this.anInt5517 * (long) local166 + (long) local178 * (long) this.anInt5513 >> 16);
					local200 = (int) ((long) this.anInt5522 * (long) local178 + (long) local174 * (long) this.anInt5534 + (long) local166 * (long) this.anInt5530 >> 16);
					@Pc(354) int local354 = this.aClass282_1.anInt8422 + (int) ((double) (this.aClass282_1.anInt8388 - this.aClass282_1.anInt8422) * Math.random());
					@Pc(370) int local370 = (int) ((double) (this.aClass282_1.anInt8402 - this.aClass282_1.anInt8404) * Math.random()) + this.aClass282_1.anInt8404;
					@Pc(387) int local387 = (int) ((double) (this.aClass282_1.anInt8412 - this.aClass282_1.anInt8397) * Math.random()) + this.aClass282_1.anInt8397;
					@Pc(449) int local449;
					if (this.aClass282_1.aBoolean596) {
						@Pc(453) double local453 = Math.random();
						local449 = (int) (local453 * (double) this.aClass282_1.anInt8392 + (double) this.aClass282_1.anInt8427) << 8 | (int) (local453 * (double) this.aClass282_1.anInt8424 + (double) this.aClass282_1.anInt8421) << 16 | (int) ((double) this.aClass282_1.anInt8417 + local453 * (double) this.aClass282_1.anInt8407) | (int) ((double) this.aClass282_1.anInt8426 + Math.random() * (double) this.aClass282_1.anInt8416) << 24;
					} else {
						local449 = (int) ((double) this.aClass282_1.anInt8426 + (double) this.aClass282_1.anInt8416 * Math.random()) << 24 | (int) ((double) this.aClass282_1.anInt8417 + Math.random() * (double) this.aClass282_1.anInt8407) | (int) ((double) this.aClass282_1.anInt8392 * Math.random() + (double) this.aClass282_1.anInt8427) << 8 | (int) (Math.random() * (double) this.aClass282_1.anInt8424 + (double) this.aClass282_1.anInt8421) << 16;
					}
					@Pc(515) int local515 = this.aClass282_1.anInt8387;
					if (!arg2.method5818() && !this.aClass282_1.aBoolean600) {
						local515 = -1;
					}
					if (Static228.anInt4863 == Static19.anInt319) {
						new Class7_Sub1_Sub1_Sub1(this, local188, local196, local200, local208, local214, local220, local354, local370, local449, local387, local515, this.aClass282_1.aBoolean598, this.aClass282_1.aBoolean597);
					} else {
						@Pc(531) Class7_Sub1_Sub1_Sub1 local531 = Static175.aClass7_Sub1_Sub1_Sub1Array1[Static19.anInt319];
						Static19.anInt319 = Static19.anInt319 + 1 & 0x3FF;
						local531.method2945(this, local188, local196, local200, local208, local214, local220, local354, local370, local449, local387, local515, this.aClass282_1.aBoolean598, this.aClass282_1.aBoolean597);
					}
				}
			}
		}
		this.anInt5529 = 0;
		for (@Pc(594) Class7_Sub1_Sub1_Sub1 local594 = (Class7_Sub1_Sub1_Sub1) this.aClass149_5.method3989(); local594 != null; local594 = (Class7_Sub1_Sub1_Sub1) this.aClass149_5.method3986()) {
			local594.method2946(arg1, arg0);
			this.anInt5529++;
		}
		Static129.anInt9539 += this.anInt5529;
	}
}
