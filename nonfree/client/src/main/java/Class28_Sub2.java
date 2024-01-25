import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
	private int anInt3834;

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
	public int anInt3835;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
	public int anInt3836;

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
	private int anInt3837;

	@OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
	public int anInt3838;

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
	private int anInt3839;

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
	private int anInt3840;

	@OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
	private int anInt3841;

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
	private int anInt3842;

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
	private int anInt3843;

	@OriginalMember(owner = "client!kp", name = "v", descriptor = "I")
	private int anInt3845;

	@OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
	private int anInt3846;

	@OriginalMember(owner = "client!kp", name = "x", descriptor = "I")
	private int anInt3847;

	@OriginalMember(owner = "client!kp", name = "z", descriptor = "I")
	private int anInt3849;

	@OriginalMember(owner = "client!kp", name = "A", descriptor = "I")
	public int anInt3850;

	@OriginalMember(owner = "client!kp", name = "B", descriptor = "I")
	private int anInt3851;

	@OriginalMember(owner = "client!kp", name = "G", descriptor = "I")
	private int anInt3853;

	@OriginalMember(owner = "client!kp", name = "N", descriptor = "I")
	private int anInt3856;

	@OriginalMember(owner = "client!kp", name = "P", descriptor = "I")
	private int anInt3857;

	@OriginalMember(owner = "client!kp", name = "U", descriptor = "I")
	private int anInt3860;

	@OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
	private int anInt3848 = 0;

	@OriginalMember(owner = "client!kp", name = "K", descriptor = "Z")
	public boolean aBoolean234 = false;

	@OriginalMember(owner = "client!kp", name = "Q", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "Lclient!ng;")
	public final Class167 aClass167_1;

	@OriginalMember(owner = "client!kp", name = "O", descriptor = "Lclient!li;")
	public final Class28_Sub3 aClass28_Sub3_5;

	@OriginalMember(owner = "client!kp", name = "I", descriptor = "J")
	private final long aLong128;

	@OriginalMember(owner = "client!kp", name = "M", descriptor = "Lclient!dc;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!kp", name = "H", descriptor = "Lclient!ni;")
	public final Class169 aClass169_4;

	static {
		new Class55(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!ya;Lclient!ng;Lclient!li;J)V")
	public Class28_Sub2(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) Class28_Sub3 arg2, @OriginalArg(3) long arg3) {
		this.aClass167_1 = arg1;
		this.aClass28_Sub3_5 = arg2;
		this.aLong128 = arg3;
		this.aClass49_1 = this.aClass167_1.method3588();
		if (!arg0.method5350() && this.aClass49_1.anInt1209 != -1) {
			this.aClass49_1 = Static206.method2967(this.aClass49_1.anInt1209);
		}
		this.aClass169_4 = new Class169();
		this.anInt3848 = (int) ((double) this.anInt3848 + Math.random() * 64.0D);
		this.method3067();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(JB)V")
	public void method3063(@OriginalArg(0) long arg0) {
		for (@Pc(11) Class28_Sub1_Sub1_Sub1 local11 = (Class28_Sub1_Sub1_Sub1) this.aClass169_4.method3598(); local11 != null; local11 = (Class28_Sub1_Sub1_Sub1) this.aClass169_4.method3597()) {
			local11.method3788(arg0);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BJZLclient!ya;I)V")
	public void method3064(@OriginalArg(1) long arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class51 arg2, @OriginalArg(4) int arg3) {
		@Pc(58) int local58;
		if (this.aBoolean234) {
			arg1 = false;
		} else if (Static108.anInt2206 < this.aClass49_1.anInt1172) {
			arg1 = false;
		} else if (Static101.anIntArray135[Static108.anInt2206] < Static429.anInt7167) {
			arg1 = false;
		} else if (this.aBoolean235) {
			arg1 = false;
		} else if (this.aClass49_1.anInt1175 != -1) {
			local58 = (int) (arg0 - this.aLong128);
			if (this.aClass49_1.aBoolean71 || local58 <= this.aClass49_1.anInt1175) {
				local58 %= this.aClass49_1.anInt1175;
			} else {
				arg1 = false;
			}
			if (!this.aClass49_1.aBoolean70 && local58 < this.aClass49_1.anInt1214) {
				arg1 = false;
			}
			if (this.aClass49_1.aBoolean70 && local58 >= this.aClass49_1.anInt1214) {
				arg1 = false;
			}
		}
		if (arg1) {
			this.anInt3848 += (int) (((double) this.aClass49_1.anInt1202 + Math.random() * (double) (this.aClass49_1.anInt1208 - this.aClass49_1.anInt1202)) * (double) arg3);
			if (this.anInt3848 > 63) {
				local58 = this.anInt3848 >> 6;
				this.anInt3848 &= 0x3F;
				for (@Pc(161) int local161 = 0; local161 < local58; local161++) {
					@Pc(180) int local180;
					@Pc(186) int local186;
					@Pc(183) int local183;
					@Pc(199) int local199;
					@Pc(207) int local207;
					@Pc(211) int local211;
					@Pc(221) int local221;
					@Pc(229) int local229;
					@Pc(233) int local233;
					if (this.aClass49_1.aShort18 <= 0 && this.aClass49_1.aShort16 <= 0) {
						local180 = this.anInt3856;
						local183 = this.anInt3853;
						local186 = this.anInt3851;
					} else {
						local199 = this.anInt3849 + (int) ((double) this.anInt3847 * Math.random());
						@Pc(203) int local203 = local199 & 0x3FFF;
						local207 = Class22_Sub7.anIntArray411[local203];
						local211 = Class22_Sub7.anIntArray410[local203];
						local221 = this.anInt3846 + (int) ((double) this.anInt3839 * Math.random());
						@Pc(225) int local225 = local221 & 0x1FFF;
						local229 = Class22_Sub7.anIntArray411[local225];
						local233 = Class22_Sub7.anIntArray410[local225];
						local180 = local211 * local229 >> 15;
						local186 = (local233 << 0) * -1;
						local183 = local229 * local207 >> 15;
					}
					local199 = (int) (Math.random() * 65535.0D);
					local207 = (int) (Math.random() * 65535.0D);
					if (local207 + local199 > 65535) {
						local199 = 65535 - local199;
						local207 = 65535 - local207;
					}
					local211 = 65535 - local207 - local199;
					local221 = local207 * this.anInt3837 + local199 * this.anInt3845 + local211 * this.anInt3841 >> 16;
					local229 = this.anInt3860 * local207 + local199 * this.anInt3857 + this.anInt3843 * local211 >> 16;
					local233 = this.anInt3842 * local207 + local199 * this.anInt3840 + this.anInt3834 * local211 >> 16;
					@Pc(357) int local357 = (int) (Math.random() * (double) (this.aClass49_1.anInt1176 - this.aClass49_1.anInt1166)) + this.aClass49_1.anInt1166;
					@Pc(374) int local374 = (int) ((double) (this.aClass49_1.anInt1197 - this.aClass49_1.anInt1191) * Math.random()) + this.aClass49_1.anInt1191;
					@Pc(392) int local392 = this.aClass49_1.anInt1206 + (int) (Math.random() * (double) (this.aClass49_1.anInt1192 - this.aClass49_1.anInt1206));
					@Pc(456) int local456;
					if (this.aClass49_1.aBoolean69) {
						@Pc(398) double local398 = Math.random();
						local456 = (int) ((double) this.aClass49_1.anInt1179 * Math.random() + (double) this.aClass49_1.anInt1212) << 24 | (int) ((double) this.aClass49_1.anInt1168 * local398 + (double) this.aClass49_1.anInt1200) << 8 | (int) ((double) this.aClass49_1.anInt1195 + (double) this.aClass49_1.anInt1193 * local398) << 16 | (int) (local398 * (double) this.aClass49_1.anInt1199 + (double) this.aClass49_1.anInt1182);
					} else {
						local456 = (int) (Math.random() * (double) this.aClass49_1.anInt1168 + (double) this.aClass49_1.anInt1200) << 8 | (int) (Math.random() * (double) this.aClass49_1.anInt1193 + (double) this.aClass49_1.anInt1195) << 16 | (int) ((double) this.aClass49_1.anInt1182 + Math.random() * (double) this.aClass49_1.anInt1199) | (int) ((double) this.aClass49_1.anInt1212 + (double) this.aClass49_1.anInt1179 * Math.random()) << 24;
					}
					@Pc(520) int local520 = this.aClass49_1.anInt1165;
					if (!arg2.method5350() && !this.aClass49_1.aBoolean75) {
						local520 = -1;
					}
					if (Static205.anInt3626 == Static181.anInt3255) {
						new Class28_Sub1_Sub1_Sub1(this, local221, local229, local233, local180, local186, local183, local357, local374, local456, local392, local520, this.aClass49_1.aBoolean73, this.aClass49_1.aBoolean72);
					} else {
						@Pc(560) Class28_Sub1_Sub1_Sub1 local560 = Static57.aClass28_Sub1_Sub1_Sub1Array1[Static181.anInt3255];
						Static181.anInt3255 = Static181.anInt3255 + 1 & 0x3FF;
						local560.method3792(this, local221, local229, local233, local180, local186, local183, local357, local374, local456, local392, local520, this.aClass49_1.aBoolean73, this.aClass49_1.aBoolean72);
					}
				}
			}
		}
		this.anInt3838 = 0;
		for (@Pc(599) Class28_Sub1_Sub1_Sub1 local599 = (Class28_Sub1_Sub1_Sub1) this.aClass169_4.method3598(); local599 != null; local599 = (Class28_Sub1_Sub1_Sub1) this.aClass169_4.method3597()) {
			local599.method3790(arg0, arg3);
			this.anInt3838++;
		}
		Static226.anInt3950 += this.anInt3838;
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V")
	public void method3067() {
		this.anInt3834 = this.aClass167_1.anInt4529;
		this.anInt3845 = this.aClass167_1.anInt4527;
		this.anInt3837 = this.aClass167_1.anInt4526;
		this.anInt3840 = this.aClass167_1.anInt4530;
		this.anInt3843 = this.aClass167_1.anInt4528;
		this.anInt3860 = this.aClass167_1.anInt4522;
		this.anInt3842 = this.aClass167_1.anInt4517;
		this.anInt3841 = this.aClass167_1.anInt4515;
		this.anInt3857 = this.aClass167_1.anInt4525;
		if (this.anInt3845 == this.anInt3837 && this.anInt3837 == this.anInt3841 && this.anInt3860 == this.anInt3857 && this.anInt3860 == this.anInt3843 && this.anInt3840 == this.anInt3842 && this.anInt3842 == this.anInt3834) {
			this.aBoolean235 = true;
			return;
		}
		this.aBoolean235 = false;
		@Pc(116) int local116 = (this.anInt3841 + this.anInt3837 + this.anInt3845) / 3;
		@Pc(127) int local127 = (this.anInt3843 + this.anInt3857 + this.anInt3860) / 3;
		@Pc(138) int local138 = (this.anInt3834 + this.anInt3840 + this.anInt3842) / 3;
		if (local116 == this.anInt3850 && local127 == this.anInt3836 && this.anInt3835 == local138) {
			return;
		}
		this.anInt3835 = local138;
		this.anInt3850 = local116;
		this.anInt3836 = local127;
		@Pc(167) int local167 = this.anInt3837 - this.anInt3845;
		@Pc(174) int local174 = this.anInt3860 - this.anInt3857;
		@Pc(181) int local181 = this.anInt3842 - this.anInt3840;
		@Pc(188) int local188 = this.anInt3841 - this.anInt3845;
		@Pc(195) int local195 = this.anInt3843 - this.anInt3857;
		@Pc(202) int local202 = this.anInt3834 - this.anInt3840;
		this.anInt3853 = local167 * local195 - local188 * local174;
		this.anInt3856 = local174 * local202 - local181 * local195;
		this.anInt3851 = local181 * local188 - local202 * local167;
		while (this.anInt3856 > 32767 || this.anInt3851 > 32767 || this.anInt3853 > 32767 || this.anInt3856 < -32767 || this.anInt3851 < -32767 || this.anInt3853 < -32767) {
			this.anInt3853 >>= 0x1;
			this.anInt3851 >>= 0x1;
			this.anInt3856 >>= 0x1;
		}
		@Pc(298) int local298 = (int) Math.sqrt((double) (this.anInt3856 * this.anInt3856 + this.anInt3851 * this.anInt3851 + this.anInt3853 * this.anInt3853));
		if (local298 <= 0) {
			local298 = 1;
		}
		this.anInt3853 = this.anInt3853 * 32767 / local298;
		this.anInt3851 = this.anInt3851 * 32767 / local298;
		this.anInt3856 = this.anInt3856 * 32767 / local298;
		if (this.aClass49_1.aShort18 <= 0 && this.aClass49_1.aShort16 <= 0) {
			return;
		}
		@Pc(345) int local345 = (int) (Math.atan2((double) this.anInt3853, (double) this.anInt3856) * 2607.5945876176133D);
		@Pc(366) int local366 = (int) (Math.atan2((double) this.anInt3851, Math.sqrt((double) (this.anInt3853 * this.anInt3853 + this.anInt3856 * this.anInt3856))) * 2607.5945876176133D);
		this.anInt3847 = this.aClass49_1.aShort18 - this.aClass49_1.aShort19;
		this.anInt3839 = this.aClass49_1.aShort16 - this.aClass49_1.aShort17;
		this.anInt3849 = this.aClass49_1.aShort19 + local345 - (this.anInt3847 >> 1);
		this.anInt3846 = local366 + this.aClass49_1.aShort17 - (this.anInt3839 >> 1);
	}
}
