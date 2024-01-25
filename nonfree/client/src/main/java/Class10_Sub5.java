import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class10_Sub5 extends Class10 {

	@OriginalMember(owner = "client!j", name = "j", descriptor = "I")
	private int anInt2994;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	private int anInt2995;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "I")
	private int anInt2997;

	@OriginalMember(owner = "client!j", name = "n", descriptor = "I")
	public int anInt2998;

	@OriginalMember(owner = "client!j", name = "q", descriptor = "I")
	private int anInt3000;

	@OriginalMember(owner = "client!j", name = "s", descriptor = "I")
	private int anInt3001;

	@OriginalMember(owner = "client!j", name = "t", descriptor = "I")
	private int anInt3002;

	@OriginalMember(owner = "client!j", name = "u", descriptor = "I")
	private int anInt3003;

	@OriginalMember(owner = "client!j", name = "v", descriptor = "I")
	public int anInt3004;

	@OriginalMember(owner = "client!j", name = "w", descriptor = "I")
	private int anInt3005;

	@OriginalMember(owner = "client!j", name = "y", descriptor = "I")
	private int anInt3006;

	@OriginalMember(owner = "client!j", name = "z", descriptor = "I")
	private int anInt3007;

	@OriginalMember(owner = "client!j", name = "A", descriptor = "I")
	private int anInt3008;

	@OriginalMember(owner = "client!j", name = "C", descriptor = "I")
	private int anInt3009;

	@OriginalMember(owner = "client!j", name = "E", descriptor = "I")
	private int anInt3011;

	@OriginalMember(owner = "client!j", name = "I", descriptor = "I")
	private int anInt3013;

	@OriginalMember(owner = "client!j", name = "J", descriptor = "I")
	private int anInt3014;

	@OriginalMember(owner = "client!j", name = "L", descriptor = "I")
	public int anInt3016;

	@OriginalMember(owner = "client!j", name = "M", descriptor = "I")
	private int anInt3017;

	@OriginalMember(owner = "client!j", name = "P", descriptor = "I")
	public int anInt3018;

	@OriginalMember(owner = "client!j", name = "G", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!j", name = "K", descriptor = "I")
	private int anInt3015 = 0;

	@OriginalMember(owner = "client!j", name = "O", descriptor = "Z")
	public boolean aBoolean227 = false;

	@OriginalMember(owner = "client!j", name = "x", descriptor = "Lclient!an;")
	public final Class10_Sub1 aClass10_Sub1_5;

	@OriginalMember(owner = "client!j", name = "r", descriptor = "Lclient!of;")
	public final Class176 aClass176_1;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "J")
	private final long aLong104;

	@OriginalMember(owner = "client!j", name = "o", descriptor = "Lclient!jg;")
	public Class120 aClass120_1;

	@OriginalMember(owner = "client!j", name = "N", descriptor = "Lclient!mb;")
	public final Class154 aClass154_5;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!vc;Lclient!of;Lclient!an;J)V")
	public Class10_Sub5(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class10_Sub1 arg2, @OriginalArg(3) long arg3) {
		this.aClass10_Sub1_5 = arg2;
		this.aClass176_1 = arg1;
		this.aLong104 = arg3;
		this.aClass120_1 = Static132.method2590(this.aClass176_1.anInt4329);
		if (!arg0.method1953() && this.aClass120_1.anInt3070 != -1) {
			this.aClass120_1 = Static132.method2590(this.aClass120_1.anInt3070);
		}
		this.aClass154_5 = new Class154();
		this.anInt3015 = (int) ((double) this.anInt3015 + Math.random() * 64.0D);
		this.method2833();
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
	public void method2833() {
		this.anInt3001 = this.aClass176_1.anInt4327;
		this.anInt3005 = this.aClass176_1.anInt4340;
		this.anInt3009 = this.aClass176_1.anInt4332;
		this.anInt3007 = this.aClass176_1.anInt4337;
		this.anInt2997 = this.aClass176_1.anInt4328;
		this.anInt3011 = this.aClass176_1.anInt4333;
		this.anInt3000 = this.aClass176_1.anInt4334;
		this.anInt2995 = this.aClass176_1.anInt4341;
		this.anInt3002 = this.aClass176_1.anInt4339;
		if (this.anInt3009 == this.anInt3011 && this.anInt2997 == this.anInt3009 && this.anInt3002 == this.anInt3005 && this.anInt3000 == this.anInt3005 && this.anInt3007 == this.anInt2995 && this.anInt3007 == this.anInt3001) {
			this.aBoolean226 = true;
			return;
		}
		this.aBoolean226 = false;
		@Pc(119) int local119 = (this.anInt3011 + this.anInt3009 + this.anInt2997) / 3;
		@Pc(130) int local130 = (this.anInt3000 + this.anInt3002 + this.anInt3005) / 3;
		@Pc(142) int local142 = (this.anInt2995 + this.anInt3007 + this.anInt3001) / 3;
		if (this.anInt3016 == local119 && this.anInt2998 == local130 && this.anInt3004 == local142) {
			return;
		}
		this.anInt3004 = local142;
		this.anInt2998 = local130;
		this.anInt3016 = local119;
		@Pc(179) int local179 = this.anInt3009 - this.anInt3011;
		@Pc(186) int local186 = this.anInt3005 - this.anInt3002;
		@Pc(193) int local193 = this.anInt3007 - this.anInt2995;
		@Pc(200) int local200 = this.anInt2997 - this.anInt3011;
		@Pc(207) int local207 = this.anInt3000 - this.anInt3002;
		@Pc(214) int local214 = this.anInt3001 - this.anInt2995;
		this.anInt3013 = local193 * local200 - local214 * local179;
		this.anInt2994 = local186 * local214 - local207 * local193;
		for (this.anInt3014 = local207 * local179 - local186 * local200; this.anInt2994 > 32767 || this.anInt3013 > 32767 || this.anInt3014 > 32767 || this.anInt2994 < -32767 || this.anInt3013 < -32767 || this.anInt3014 < -32767; this.anInt3014 >>= 0x1) {
			this.anInt3013 >>= 0x1;
			this.anInt2994 >>= 0x1;
		}
		@Pc(314) int local314 = (int) Math.sqrt((double) (this.anInt3014 * this.anInt3014 + this.anInt2994 * this.anInt2994 + this.anInt3013 * this.anInt3013));
		if (local314 <= 0) {
			local314 = 1;
		}
		this.anInt3014 = this.anInt3014 * 32767 / local314;
		this.anInt2994 = this.anInt2994 * 32767 / local314;
		this.anInt3013 = this.anInt3013 * 32767 / local314;
		if (this.aClass120_1.aShort51 <= 0 && this.aClass120_1.aShort49 <= 0) {
			return;
		}
		@Pc(367) int local367 = (int) (Math.atan2((double) this.anInt3014, (double) this.anInt2994) * 2607.5945876176133D);
		@Pc(388) int local388 = (int) (Math.atan2((double) this.anInt3013, Math.sqrt((double) (this.anInt3014 * this.anInt3014 + this.anInt2994 * this.anInt2994))) * 2607.5945876176133D);
		this.anInt3017 = this.aClass120_1.aShort51 - this.aClass120_1.aShort50;
		this.anInt3008 = this.aClass120_1.aShort49 - this.aClass120_1.aShort48;
		this.anInt3006 = this.aClass120_1.aShort50 + local367 - (this.anInt3017 >> 1);
		this.anInt3003 = this.aClass120_1.aShort48 + local388 - (this.anInt3008 >> 1);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IJ)V")
	public void method2836(@OriginalArg(1) long arg0) {
		for (@Pc(12) Class10_Sub8_Sub1_Sub1 local12 = (Class10_Sub8_Sub1_Sub1) this.aClass154_5.method3479(); local12 != null; local12 = (Class10_Sub8_Sub1_Sub1) this.aClass154_5.method3483()) {
			local12.method4617(arg0);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!vc;BJIZ)V")
	public void method2837(@OriginalArg(0) Class63 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(37) int local37;
		if (this.aBoolean227) {
			arg3 = false;
		} else if (Static191.anInt3592 < this.aClass120_1.anInt3073) {
			arg3 = false;
		} else if (Static113.anInt2419 > Static83.anIntArray358[Static191.anInt3592]) {
			arg3 = false;
		} else if (this.aBoolean226) {
			arg3 = false;
		} else if (this.aClass120_1.anInt3106 != -1) {
			local37 = (int) (arg1 - this.aLong104);
			if (this.aClass120_1.aBoolean233 || local37 <= this.aClass120_1.anInt3106) {
				local37 %= this.aClass120_1.anInt3106;
			} else {
				arg3 = false;
			}
			if (!this.aClass120_1.aBoolean235 && local37 < this.aClass120_1.anInt3102) {
				arg3 = false;
			}
			if (this.aClass120_1.aBoolean235 && this.aClass120_1.anInt3102 <= local37) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt3015 += (int) (((double) this.aClass120_1.anInt3056 + (double) (this.aClass120_1.anInt3092 - this.aClass120_1.anInt3056) * Math.random()) * (double) arg2);
			if (this.anInt3015 > 63) {
				local37 = this.anInt3015 >> 6;
				this.anInt3015 &= 0x3F;
				for (@Pc(145) int local145 = 0; local145 < local37; local145++) {
					@Pc(201) int local201;
					@Pc(209) int local209;
					@Pc(215) int local215;
					@Pc(165) int local165;
					@Pc(173) int local173;
					@Pc(177) int local177;
					@Pc(187) int local187;
					@Pc(195) int local195;
					@Pc(205) int local205;
					if (this.aClass120_1.aShort51 <= 0 && this.aClass120_1.aShort49 <= 0) {
						local215 = this.anInt3014;
						local209 = this.anInt3013;
						local201 = this.anInt2994;
					} else {
						local165 = (int) ((double) this.anInt3017 * Math.random()) + this.anInt3006;
						@Pc(169) int local169 = local165 & 0x3FFF;
						local173 = Class177.anIntArray843[local169];
						local177 = Class177.anIntArray844[local169];
						local187 = (int) (Math.random() * (double) this.anInt3008) + this.anInt3003;
						@Pc(191) int local191 = local187 & 0x1FFF;
						local195 = Class177.anIntArray843[local191];
						local201 = local195 * local177 >> 15;
						local205 = Class177.anIntArray844[local191];
						local209 = local205 * -1;
						local215 = local195 * local173 >> 15;
					}
					local165 = (int) (Math.random() * 65535.0D);
					local173 = (int) (Math.random() * 65535.0D);
					if (local165 + local173 > 65535) {
						local173 = 65535 - local173;
						local165 = 65535 - local165;
					}
					local177 = 65535 - local165 - local173;
					local187 = this.anInt3009 * local173 + local165 * this.anInt3011 + this.anInt2997 * local177 >> 16;
					local195 = this.anInt3002 * local165 + local173 * this.anInt3005 + this.anInt3000 * local177 >> 16;
					local205 = this.anInt3001 * local177 + local165 * this.anInt2995 + local173 * this.anInt3007 >> 16;
					@Pc(328) int local328 = (int) ((double) (this.aClass120_1.anInt3060 - this.aClass120_1.anInt3101) * Math.random()) + this.aClass120_1.anInt3101;
					@Pc(345) int local345 = (int) (Math.random() * (double) (this.aClass120_1.anInt3081 - this.aClass120_1.anInt3072)) + this.aClass120_1.anInt3072;
					@Pc(362) int local362 = (int) (Math.random() * (double) (this.aClass120_1.anInt3063 - this.aClass120_1.anInt3078)) + this.aClass120_1.anInt3078;
					@Pc(426) int local426;
					if (this.aClass120_1.aBoolean232) {
						@Pc(368) double local368 = Math.random();
						local426 = (int) ((double) this.aClass120_1.anInt3087 * Math.random() + (double) this.aClass120_1.anInt3097) << 24 | (int) ((double) this.aClass120_1.anInt3083 + (double) this.aClass120_1.anInt3062 * local368) << 16 | (int) (local368 * (double) this.aClass120_1.anInt3066 + (double) this.aClass120_1.anInt3095) << 8 | (int) (local368 * (double) this.aClass120_1.anInt3074 + (double) this.aClass120_1.anInt3103);
					} else {
						local426 = (int) ((double) this.aClass120_1.anInt3083 + (double) this.aClass120_1.anInt3062 * Math.random()) << 16 | (int) ((double) this.aClass120_1.anInt3066 * Math.random() + (double) this.aClass120_1.anInt3095) << 8 | (int) (Math.random() * (double) this.aClass120_1.anInt3074 + (double) this.aClass120_1.anInt3103) | (int) ((double) this.aClass120_1.anInt3087 * Math.random() + (double) this.aClass120_1.anInt3097) << 24;
					}
					@Pc(490) int local490 = this.aClass120_1.anInt3068;
					if (!arg0.method1953() && !this.aClass120_1.aBoolean231) {
						local490 = -1;
					}
					if (Static289.anInt5021 == Static319.anInt5426) {
						new Class10_Sub8_Sub1_Sub1(this, local187, local195, local205, local201, local209, local215, local328, local345, local426, local362, local490, this.aClass120_1.aBoolean234);
					} else {
						@Pc(531) Class10_Sub8_Sub1_Sub1 local531 = Static299.aClass10_Sub8_Sub1_Sub1Array2[Static289.anInt5021];
						Static289.anInt5021 = Static289.anInt5021 + 1 & 0x3FF;
						local531.method4616(this, local187, local195, local205, local201, local209, local215, local328, local345, local426, local362, local490, this.aClass120_1.aBoolean234);
					}
				}
			}
		}
		this.anInt3018 = 0;
		for (@Pc(567) Class10_Sub8_Sub1_Sub1 local567 = (Class10_Sub8_Sub1_Sub1) this.aClass154_5.method3479(); local567 != null; local567 = (Class10_Sub8_Sub1_Sub1) this.aClass154_5.method3483()) {
			local567.method4615(arg1, arg2);
			this.anInt3018++;
		}
		Static92.anInt1738 += this.anInt3018;
	}
}
