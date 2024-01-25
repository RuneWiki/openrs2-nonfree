import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class2_Sub40 extends Class2 {

	@OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
	private int anInt7000;

	@OriginalMember(owner = "client!tt", name = "G", descriptor = "I")
	private int anInt7007;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "Lclient!hk;")
	private final Class22_Sub2 aClass22_Sub2_3;

	@OriginalMember(owner = "client!tt", name = "B", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_40;

	@OriginalMember(owner = "client!tt", name = "F", descriptor = "Lclient!as;")
	private final Class2_Sub4 aClass2_Sub4_2;

	@OriginalMember(owner = "client!tt", name = "A", descriptor = "I")
	private final int anInt7005;

	@OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
	private final int anInt7003;

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
	private final int anInt6999;

	@OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
	private final int anInt7004;

	@OriginalMember(owner = "client!tt", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!tt", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!tt", name = "H", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!tt", name = "E", descriptor = "Lclient!hw;")
	private Class2_Sub17 aClass2_Sub17_6;

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "Lclient!wm;")
	private Class2_Sub17_Sub2 aClass2_Sub17_Sub2_3;

	@OriginalMember(owner = "client!tt", name = "K", descriptor = "Lclient!ru;")
	private Class220 aClass220_40;

	@OriginalMember(owner = "client!tt", name = "p", descriptor = "Lclient!tb;")
	private final Interface11 anInterface11_4;

	@OriginalMember(owner = "client!tt", name = "x", descriptor = "Lclient!ui;")
	private final Interface12 anInterface12_7;

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "Lclient!db;")
	private final Class47 aClass47_15;

	@OriginalMember(owner = "client!tt", name = "z", descriptor = "Lclient!db;")
	private final Class47 aClass47_16;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!na;Lclient!hk;Lclient!as;[I)V")
	public Class2_Sub40(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class22_Sub2 arg1, @OriginalArg(2) Class2_Sub4 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass22_Sub2_3 = arg1;
		this.aClass75_Sub2_40 = arg0;
		this.aClass2_Sub4_2 = arg2;
		@Pc(22) int local22 = this.aClass2_Sub4_2.method4089() - (arg1.anInt2818 >> 1);
		this.anInt7005 = this.aClass2_Sub4_2.method4087() - local22 >> arg1.anInt2817;
		this.anInt7003 = local22 + this.aClass2_Sub4_2.method4087() >> arg1.anInt2817;
		this.anInt6999 = this.aClass2_Sub4_2.method4092() - local22 >> arg1.anInt2817;
		this.anInt7004 = local22 + this.aClass2_Sub4_2.method4092() >> arg1.anInt2817;
		@Pc(77) int local77 = this.anInt7003 + 1 - this.anInt7005;
		@Pc(86) int local86 = this.anInt7004 + 1 - this.anInt6999;
		this.aFloatArrayArray8 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray7 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray9 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(137) int local137;
		@Pc(144) int local144;
		@Pc(167) int local167;
		@Pc(181) int local181;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt6999 + local115;
			if (local122 > 0 && local122 < this.aClass22_Sub2_3.anInt2816 - 1) {
				for (local137 = 0; local137 <= local77; local137++) {
					local144 = this.anInt7005 + local137;
					if (local144 > 0 && this.aClass22_Sub2_3.anInt2819 - 1 > local144) {
						local167 = arg1.ua(local144 + 1, local122) - arg1.ua(local144 - 1, local122);
						local181 = arg1.ua(local144, local122 + 1) - arg1.ua(local144, local122 - 1);
						@Pc(196) float local196 = (float) (1.0D / Math.sqrt((double) (local181 * local181 + local167 * local167 + 65536)));
						this.aFloatArrayArray7[local137][local115] = (float) local167 * local196;
						this.aFloatArrayArray9[local137][local115] = -256.0F * local196;
						this.aFloatArrayArray8[local137][local115] = (float) local181 * local196;
					}
				}
			}
		}
		local122 = 0;
		local137 = 0;
		for (local144 = this.anInt6999; local144 <= this.anInt7004; local144++) {
			if (local144 >= 0 && arg1.anInt2816 > local144) {
				for (local167 = this.anInt7005; local167 <= this.anInt7003; local167++) {
					if (local167 >= 0 && arg1.anInt2819 > local167) {
						local181 = arg3[local137];
						@Pc(292) int[] local292 = arg1.anIntArrayArrayArray8[local167][local144];
						if (local292 != null && local181 != 0) {
							if (local181 == 1) {
								local122 += local292.length;
							} else {
								local122 += 3;
							}
						}
					}
					local137++;
				}
			} else {
				local137 += this.anInt7003 - this.anInt7005;
			}
		}
		if (local122 > 0) {
			this.aClass2_Sub17_6 = new Class2_Sub17(local122 * 2);
			this.aClass2_Sub17_Sub2_3 = new Class2_Sub17_Sub2(local122 * 16);
			this.aClass220_40 = new Class220(Static43.method654(local122));
			local167 = 0;
			local137 = 0;
			for (local181 = this.anInt6999; local181 <= this.anInt7004; local181++) {
				if (local181 >= 0 && arg1.anInt2816 > local181) {
					@Pc(386) int local386 = 0;
					for (@Pc(389) int local389 = this.anInt7005; local389 <= this.anInt7003; local389++) {
						if (local389 >= 0 && local389 < arg1.anInt2819) {
							@Pc(401) int local401 = arg3[local137];
							@Pc(408) int[] local408 = arg1.anIntArrayArrayArray8[local389][local181];
							@Pc(415) int[] local415 = arg1.anIntArrayArrayArray7[local389][local181];
							if (local408 != null && local401 != 0) {
								if (local401 == 1) {
									for (@Pc(573) int local573 = 0; local573 < local408.length; local573++) {
										this.method5616(local408[local573], local415[local573], local386, local181, local389, local167);
									}
								} else if (local401 == 3) {
									this.method5616(0, 0, local386, local181, local389, local167);
									this.method5616(arg1.anInt2818, 0, local386, local181, local389, local167);
									this.method5616(0, arg1.anInt2818, local386, local181, local389, local167);
								} else if (local401 == 2) {
									this.method5616(arg1.anInt2818, 0, local386, local181, local389, local167);
									this.method5616(arg1.anInt2818, arg1.anInt2818, local386, local181, local389, local167);
									this.method5616(0, 0, local386, local181, local389, local167);
								} else if (local401 == 5) {
									this.method5616(arg1.anInt2818, arg1.anInt2818, local386, local181, local389, local167);
									this.method5616(0, arg1.anInt2818, local386, local181, local389, local167);
									this.method5616(arg1.anInt2818, 0, local386, local181, local389, local167);
								} else if (local401 == 4) {
									this.method5616(0, arg1.anInt2818, local386, local181, local389, local167);
									this.method5616(0, 0, local386, local181, local389, local167);
									this.method5616(arg1.anInt2818, arg1.anInt2818, local386, local181, local389, local167);
								}
							}
						}
						local137++;
						local386++;
					}
				} else {
					local137 += this.anInt7003 - this.anInt7005;
				}
				local167++;
			}
			this.anInterface11_4 = this.aClass75_Sub2_40.method3818(this.aClass2_Sub17_6.anInt7523, false, this.aClass2_Sub17_6.aByteArray94);
			this.anInterface12_7 = this.aClass75_Sub2_40.method3848(16, this.aClass2_Sub17_Sub2_3.anInt7523, this.aClass2_Sub17_Sub2_3.aByteArray94, false);
			this.aClass47_15 = new Class47(this.anInterface12_7, 5126, 3, 0);
			this.aClass47_16 = new Class47(this.anInterface12_7, 5121, 4, 12);
		} else {
			this.aClass47_16 = null;
			this.anInterface12_7 = null;
			this.anInterface11_4 = null;
			this.aClass47_15 = null;
		}
		this.aFloatArrayArray7 = this.aFloatArrayArray9 = this.aFloatArrayArray8 = null;
		this.aClass220_40 = null;
		this.aClass2_Sub17_Sub2_3 = null;
		this.aClass2_Sub17_6 = null;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(SI)V")
	private void method5612(@OriginalArg(0) short arg0) {
		if (this.aClass75_Sub2_40.aBoolean349) {
			this.aClass2_Sub17_6.method6130(arg0);
		} else {
			this.aClass2_Sub17_6.method6160(arg0);
		}
		this.anInt7007++;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I[[ZIII)V")
	public void method5615(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface11_4 == null || (arg2 + arg3 < this.anInt7005 || (arg2 - arg3 > this.anInt7003 || (arg3 + arg0 < this.anInt6999 || this.anInt7004 < arg0 - arg3)))) {
			return;
		}
		for (@Pc(63) int local63 = this.anInt6999; local63 <= this.anInt7004; local63++) {
			for (@Pc(68) int local68 = this.anInt7005; local68 <= this.anInt7003; local68++) {
				@Pc(75) int local75 = local68 - arg2;
				@Pc(80) int local80 = local63 - arg0;
				if (-arg3 < local75 && local75 < arg3 && local80 > -arg3 && local80 < arg3 && arg1[arg3 + local75][local80 + arg3]) {
					this.aClass75_Sub2_40.method3854((int) (this.aClass2_Sub4_2.method4085() * 255.0F) << 24);
					this.aClass75_Sub2_40.method3852(this.aClass47_16, this.aClass47_15, null, null);
					this.aClass75_Sub2_40.method3841(this.anInterface11_4, 0, this.anInt7007);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIII)V")
	private void method5616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg4 << this.aClass22_Sub2_3.anInt2817) + arg0;
		@Pc(24) int local24 = arg1 + (arg3 << this.aClass22_Sub2_3.anInt2817);
		@Pc(30) int local30 = this.aClass22_Sub2_3.ca(local15, local24);
		if ((arg0 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | 0xFFFFL << 16 & (long) local24 << 16;
			@Pc(61) Class2 local61 = this.aClass220_40.method5099(local7);
			if (local61 != null) {
				this.method5612(((Class2_Sub19) local61).aShort37);
				return;
			}
		}
		@Pc(85) short local85 = (short) this.anInt7000++;
		if (local7 != -1L) {
			this.aClass220_40.method5104(new Class2_Sub19(local85), local7);
		}
		@Pc(121) float local121;
		@Pc(128) float local128;
		@Pc(114) float local114;
		@Pc(184) float local184;
		@Pc(192) float local192;
		@Pc(199) float local199;
		@Pc(206) float local206;
		@Pc(213) float local213;
		@Pc(222) float local222;
		@Pc(231) float local231;
		@Pc(305) float local305;
		if (arg0 == 0 && arg1 == 0) {
			local114 = this.aFloatArrayArray8[arg2][arg5];
			local121 = this.aFloatArrayArray7[arg2][arg5];
			local128 = this.aFloatArrayArray9[arg2][arg5];
		} else if (this.aClass22_Sub2_3.anInt2818 == arg0 && arg1 == 0) {
			local121 = this.aFloatArrayArray7[arg2 + 1][arg5];
			local114 = this.aFloatArrayArray8[arg2 + 1][arg5];
			local128 = this.aFloatArrayArray9[arg2 + 1][arg5];
		} else if (arg0 == this.aClass22_Sub2_3.anInt2818 && arg1 == this.aClass22_Sub2_3.anInt2818) {
			local121 = this.aFloatArrayArray7[arg2 + 1][arg5 + 1];
			local128 = this.aFloatArrayArray9[arg2 + 1][arg5 + 1];
			local114 = this.aFloatArrayArray8[arg2 + 1][arg5 + 1];
		} else if (arg0 == 0 && arg1 == this.aClass22_Sub2_3.anInt2818) {
			local114 = this.aFloatArrayArray8[arg2][arg5 + 1];
			local128 = this.aFloatArrayArray9[arg2][arg5 + 1];
			local121 = this.aFloatArrayArray7[arg2][arg5 + 1];
		} else {
			local184 = (float) arg0 / (float) this.aClass22_Sub2_3.anInt2818;
			local192 = (float) arg1 / (float) this.aClass22_Sub2_3.anInt2818;
			local199 = this.aFloatArrayArray7[arg2][arg5];
			local206 = this.aFloatArrayArray9[arg2][arg5];
			local213 = this.aFloatArrayArray8[arg2][arg5];
			local222 = this.aFloatArrayArray7[arg2 + 1][arg5];
			local231 = this.aFloatArrayArray9[arg2 + 1][arg5];
			@Pc(248) float local248 = local222 + local184 * (this.aFloatArrayArray7[arg2 + 1][arg5 + 1] - local222);
			@Pc(266) float local266 = local231 + (this.aFloatArrayArray9[arg2 + 1][arg5 + 1] - local231) * local184;
			@Pc(281) float local281 = local199 + (this.aFloatArrayArray7[arg2][arg5 + 1] - local199) * local184;
			@Pc(296) float local296 = local206 + (this.aFloatArrayArray9[arg2][arg5 + 1] - local206) * local184;
			local305 = this.aFloatArrayArray8[arg2 + 1][arg5];
			@Pc(320) float local320 = local213 + (this.aFloatArrayArray8[arg2][arg5 + 1] - local213) * local184;
			local128 = local296 + local192 * (local266 - local296);
			@Pc(345) float local345 = local305 + local184 * (this.aFloatArrayArray8[arg2 + 1][arg5 + 1] - local305);
			local121 = local281 + local192 * (local248 - local281);
			local114 = local320 + local192 * (local345 - local320);
		}
		local184 = this.aClass2_Sub4_2.method4087() - local15;
		local192 = this.aClass2_Sub4_2.method4081() - local30;
		local199 = this.aClass2_Sub4_2.method4092() - local24;
		local206 = (float) Math.sqrt((double) (local192 * local192 + local184 * local184 + local199 * local199));
		local213 = 1.0F / local206;
		local192 *= local213;
		local184 *= local213;
		local199 *= local213;
		local222 = local206 / (float) this.aClass2_Sub4_2.method4089();
		local231 = 1.0F - local222 * local222;
		if (local231 < 0.0F) {
			local231 = 0.0F;
		}
		local305 = local121 * local184 + local128 * local192 + local114 * local199;
		if (local305 < 0.0F) {
			local305 = 0.0F;
		}
		@Pc(559) float local559 = local305 * 2.0F * local231;
		if (local559 > 1.0F) {
			local559 = 1.0F;
		}
		@Pc(570) int local570 = this.aClass2_Sub4_2.method4084();
		@Pc(580) int local580 = (int) (local559 * (float) (local570 >> 16 & 0xFF));
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(595) int local595 = (int) (local559 * (float) (local570 >> 8 & 0xFF));
		if (local595 > 255) {
			local595 = 255;
		}
		@Pc(608) int local608 = (int) (local559 * (float) (local570 & 0xFF));
		if (this.aClass75_Sub2_40.aBoolean349) {
			this.aClass2_Sub17_Sub2_3.method6175((float) local15);
			this.aClass2_Sub17_Sub2_3.method6175((float) local30);
			this.aClass2_Sub17_Sub2_3.method6175((float) local24);
		} else {
			this.aClass2_Sub17_Sub2_3.method6179((float) local15);
			this.aClass2_Sub17_Sub2_3.method6179((float) local30);
			this.aClass2_Sub17_Sub2_3.method6179((float) local24);
		}
		if (local608 > 255) {
			local608 = 255;
		}
		this.aClass2_Sub17_Sub2_3.method6172(local580);
		this.aClass2_Sub17_Sub2_3.method6172(local595);
		this.aClass2_Sub17_Sub2_3.method6172(local608);
		this.aClass2_Sub17_Sub2_3.method6172(255);
		this.method5612(local85);
	}
}
