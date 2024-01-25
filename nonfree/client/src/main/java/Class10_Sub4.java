import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class10_Sub4 extends Class10 {

	@OriginalMember(owner = "client!me", name = "j", descriptor = "I")
	private int anInt3866;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "I")
	private int anInt3867;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "I")
	public int anInt3868;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "I")
	private int anInt3869;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "I")
	public int anInt3873;

	@OriginalMember(owner = "client!me", name = "v", descriptor = "I")
	public int anInt3875;

	@OriginalMember(owner = "client!me", name = "w", descriptor = "I")
	public int anInt3876;

	@OriginalMember(owner = "client!me", name = "y", descriptor = "I")
	private int anInt3878;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "I")
	private int anInt3879;

	@OriginalMember(owner = "client!me", name = "B", descriptor = "I")
	private int anInt3880;

	@OriginalMember(owner = "client!me", name = "D", descriptor = "I")
	private int anInt3881;

	@OriginalMember(owner = "client!me", name = "E", descriptor = "I")
	private int anInt3882;

	@OriginalMember(owner = "client!me", name = "F", descriptor = "I")
	private int anInt3883;

	@OriginalMember(owner = "client!me", name = "G", descriptor = "I")
	private int anInt3884;

	@OriginalMember(owner = "client!me", name = "I", descriptor = "I")
	private int anInt3885;

	@OriginalMember(owner = "client!me", name = "J", descriptor = "I")
	private int anInt3886;

	@OriginalMember(owner = "client!me", name = "L", descriptor = "I")
	private int anInt3887;

	@OriginalMember(owner = "client!me", name = "N", descriptor = "I")
	private int anInt3889;

	@OriginalMember(owner = "client!me", name = "S", descriptor = "I")
	private int anInt3892;

	@OriginalMember(owner = "client!me", name = "T", descriptor = "I")
	private int anInt3893;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Z")
	public boolean aBoolean246 = false;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!me", name = "M", descriptor = "I")
	private int anInt3888 = 0;

	@OriginalMember(owner = "client!me", name = "K", descriptor = "Lclient!rf;")
	public final Class174 aClass174_1;

	@OriginalMember(owner = "client!me", name = "H", descriptor = "J")
	private final long aLong112;

	@OriginalMember(owner = "client!me", name = "r", descriptor = "Lclient!e;")
	public final Class10_Sub2 aClass10_Sub2_5;

	@OriginalMember(owner = "client!me", name = "A", descriptor = "Lclient!tj;")
	public Class190 aClass190_1;

	@OriginalMember(owner = "client!me", name = "Q", descriptor = "Lclient!wd;")
	public final Class210 aClass210_10;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!uo;Lclient!rf;Lclient!e;J)V")
	public Class10_Sub4(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) Class10_Sub2 arg2, @OriginalArg(3) long arg3) {
		this.aClass174_1 = arg1;
		this.aLong112 = arg3;
		this.aClass10_Sub2_5 = arg2;
		this.aClass190_1 = Static107.method1628(this.aClass174_1.anInt5459);
		if (!arg0.method4939() && this.aClass190_1.anInt6034 != -1) {
			this.aClass190_1 = Static107.method1628(this.aClass190_1.anInt6034);
		}
		this.aClass210_10 = new Class210();
		this.anInt3888 = (int) ((double) this.anInt3888 + Math.random() * 64.0D);
		this.method3478();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IJIZLclient!uo;)V")
	public void method3473(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class129 arg3) {
		@Pc(41) int local41;
		if (this.aBoolean246) {
			arg2 = false;
		} else if (this.aClass190_1.anInt6030 > Static122.anInt2287) {
			arg2 = false;
		} else if (Static59.anIntArray69[Static122.anInt2287] < Static225.anInt4561) {
			arg2 = false;
		} else if (this.aBoolean247) {
			arg2 = false;
		} else if (this.aClass190_1.anInt6008 != -1) {
			local41 = (int) (arg0 - this.aLong112);
			if (this.aClass190_1.aBoolean401 || local41 <= this.aClass190_1.anInt6008) {
				local41 %= this.aClass190_1.anInt6008;
			} else {
				arg2 = false;
			}
			if (!this.aClass190_1.aBoolean402 && local41 < this.aClass190_1.anInt6017) {
				arg2 = false;
			}
			if (this.aClass190_1.aBoolean402 && this.aClass190_1.anInt6017 <= local41) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt3888 += (int) ((Math.random() * (double) (this.aClass190_1.anInt6019 - this.aClass190_1.anInt5996) + (double) this.aClass190_1.anInt5996) * (double) arg1);
			if (this.anInt3888 > 63) {
				local41 = this.anInt3888 >> 6;
				this.anInt3888 &= 0x3F;
				for (@Pc(141) int local141 = 0; local141 < local41; local141++) {
					@Pc(160) int local160;
					@Pc(163) int local163;
					@Pc(166) int local166;
					@Pc(178) int local178;
					@Pc(186) int local186;
					@Pc(190) int local190;
					@Pc(201) int local201;
					@Pc(209) int local209;
					@Pc(219) int local219;
					if (this.aClass190_1.aShort87 <= 0 && this.aClass190_1.aShort84 <= 0) {
						local160 = this.anInt3892;
						local163 = this.anInt3886;
						local166 = this.anInt3882;
					} else {
						local178 = this.anInt3867 + (int) (Math.random() * (double) this.anInt3883);
						@Pc(182) int local182 = local178 & 0x3FFF;
						local186 = Class140.anIntArray330[local182];
						local190 = Class140.anIntArray329[local182];
						local201 = this.anInt3866 + (int) (Math.random() * (double) this.anInt3879);
						@Pc(205) int local205 = local201 & 0x1FFF;
						local209 = Class140.anIntArray330[local205];
						local160 = local209 * local190 >> 15;
						local219 = Class140.anIntArray329[local205];
						local163 = local219 * -1;
						local166 = local209 * local186 >> 15;
					}
					local178 = (int) (Math.random() * 65535.0D);
					local186 = (int) (Math.random() * 65535.0D);
					if (local186 + local178 > 65535) {
						local186 = 65535 - local186;
						local178 = 65535 - local178;
					}
					local190 = 65535 - local178 - local186;
					local201 = this.anInt3880 * local186 + this.anInt3869 * local178 + this.anInt3893 * local190 >> 16;
					local209 = this.anInt3887 * local190 + local186 * this.anInt3878 + local178 * this.anInt3881 >> 16;
					local219 = this.anInt3889 * local178 + local186 * this.anInt3884 + this.anInt3885 * local190 >> 16;
					@Pc(330) int local330 = this.aClass190_1.anInt6015 + (int) ((double) (this.aClass190_1.anInt6036 - this.aClass190_1.anInt6015) * Math.random());
					@Pc(347) int local347 = (int) (Math.random() * (double) (this.aClass190_1.anInt6026 - this.aClass190_1.anInt6004)) + this.aClass190_1.anInt6004;
					@Pc(364) int local364 = (int) ((double) (this.aClass190_1.anInt5997 - this.aClass190_1.anInt6012) * Math.random()) + this.aClass190_1.anInt6012;
					@Pc(426) int local426;
					if (this.aClass190_1.aBoolean404) {
						@Pc(430) double local430 = Math.random();
						local426 = (int) ((double) this.aClass190_1.anInt6021 + local430 * (double) this.aClass190_1.anInt5985) << 24 | (int) ((double) this.aClass190_1.anInt6023 * local430 + (double) this.aClass190_1.anInt5995) | (int) ((double) this.aClass190_1.anInt6007 + (double) this.aClass190_1.anInt6028 * local430) << 16 | (int) ((double) this.aClass190_1.anInt6005 + local430 * (double) this.aClass190_1.anInt6002) << 8;
					} else {
						local426 = (int) ((double) this.aClass190_1.anInt5995 + (double) this.aClass190_1.anInt6023 * Math.random()) | (int) ((double) this.aClass190_1.anInt6007 + (double) this.aClass190_1.anInt6028 * Math.random()) << 16 | (int) ((double) this.aClass190_1.anInt6002 * Math.random() + (double) this.aClass190_1.anInt6005) << 8 | (int) ((double) this.aClass190_1.anInt6021 + (double) this.aClass190_1.anInt5985 * Math.random()) << 24;
					}
					@Pc(492) int local492 = this.aClass190_1.anInt6037;
					if (!arg3.method4939() && !this.aClass190_1.aBoolean403) {
						local492 = -1;
					}
					if (Static318.anInt6177 == Static245.anInt6563) {
						new Class10_Sub3_Sub1_Sub1(this, local201, local209, local219, local160, local163, local166, local330, local347, local426, local364, local492, this.aClass190_1.aBoolean405);
					} else {
						@Pc(512) Class10_Sub3_Sub1_Sub1 local512 = Static190.aClass10_Sub3_Sub1_Sub1Array2[Static245.anInt6563];
						Static245.anInt6563 = Static245.anInt6563 + 1 & 0x3FF;
						local512.method1719(this, local201, local209, local219, local160, local163, local166, local330, local347, local426, local364, local492, this.aClass190_1.aBoolean405);
					}
				}
			}
		}
		this.anInt3868 = 0;
		for (@Pc(569) Class10_Sub3_Sub1_Sub1 local569 = (Class10_Sub3_Sub1_Sub1) this.aClass210_10.method5608(); local569 != null; local569 = (Class10_Sub3_Sub1_Sub1) this.aClass210_10.method5615()) {
			local569.method1715(arg0, arg1);
			this.anInt3868++;
		}
		Static46.anInt907 += this.anInt3868;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(JB)V")
	public void method3476(@OriginalArg(0) long arg0) {
		for (@Pc(7) Class10_Sub3_Sub1_Sub1 local7 = (Class10_Sub3_Sub1_Sub1) this.aClass210_10.method5608(); local7 != null; local7 = (Class10_Sub3_Sub1_Sub1) this.aClass210_10.method5615()) {
			local7.method1718(arg0);
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public void method3478() {
		this.anInt3889 = this.aClass174_1.anInt5471;
		this.anInt3878 = this.aClass174_1.anInt5465;
		this.anInt3893 = this.aClass174_1.anInt5473;
		this.anInt3869 = this.aClass174_1.anInt5470;
		this.anInt3881 = this.aClass174_1.anInt5467;
		this.anInt3885 = this.aClass174_1.anInt5462;
		this.anInt3887 = this.aClass174_1.anInt5466;
		this.anInt3884 = this.aClass174_1.anInt5464;
		this.anInt3880 = this.aClass174_1.anInt5468;
		if (this.anInt3880 == this.anInt3869 && this.anInt3880 == this.anInt3893 && this.anInt3878 == this.anInt3881 && this.anInt3878 == this.anInt3887 && this.anInt3889 == this.anInt3884 && this.anInt3884 == this.anInt3885) {
			this.aBoolean247 = true;
			return;
		}
		this.aBoolean247 = false;
		@Pc(112) int local112 = (this.anInt3880 + this.anInt3869 + this.anInt3893) / 3;
		@Pc(124) int local124 = (this.anInt3881 + this.anInt3878 + this.anInt3887) / 3;
		@Pc(144) int local144 = (this.anInt3889 + this.anInt3884 + this.anInt3885) / 3;
		if (this.anInt3876 == local112 && this.anInt3873 == local124 && local144 == this.anInt3875) {
			return;
		}
		this.anInt3875 = local144;
		this.anInt3873 = local124;
		this.anInt3876 = local112;
		@Pc(173) int local173 = this.anInt3880 - this.anInt3869;
		@Pc(180) int local180 = this.anInt3878 - this.anInt3881;
		@Pc(187) int local187 = this.anInt3884 - this.anInt3889;
		@Pc(194) int local194 = this.anInt3893 - this.anInt3869;
		@Pc(201) int local201 = this.anInt3887 - this.anInt3881;
		@Pc(208) int local208 = this.anInt3885 - this.anInt3889;
		this.anInt3886 = local187 * local194 - local173 * local208;
		this.anInt3882 = local201 * local173 - local194 * local180;
		this.anInt3892 = local208 * local180 - local201 * local187;
		while (this.anInt3892 > 32767 || this.anInt3886 > 32767 || this.anInt3882 > 32767 || this.anInt3892 < -32767 || this.anInt3886 < -32767 || this.anInt3882 < -32767) {
			this.anInt3882 >>= 0x1;
			this.anInt3892 >>= 0x1;
			this.anInt3886 >>= 0x1;
		}
		@Pc(307) int local307 = (int) Math.sqrt((double) (this.anInt3882 * this.anInt3882 + this.anInt3892 * this.anInt3892 + this.anInt3886 * this.anInt3886));
		if (local307 <= 0) {
			local307 = 1;
		}
		this.anInt3886 = this.anInt3886 * 32767 / local307;
		this.anInt3892 = this.anInt3892 * 32767 / local307;
		this.anInt3882 = this.anInt3882 * 32767 / local307;
		if (this.aClass190_1.aShort87 <= 0 && this.aClass190_1.aShort84 <= 0) {
			return;
		}
		@Pc(357) int local357 = (int) (Math.atan2((double) this.anInt3882, (double) this.anInt3892) * 2607.5945876176133D);
		@Pc(378) int local378 = (int) (Math.atan2((double) this.anInt3886, Math.sqrt((double) (this.anInt3892 * this.anInt3892 + this.anInt3882 * this.anInt3882))) * 2607.5945876176133D);
		this.anInt3883 = this.aClass190_1.aShort87 - this.aClass190_1.aShort86;
		this.anInt3879 = this.aClass190_1.aShort84 - this.aClass190_1.aShort85;
		this.anInt3867 = local357 + this.aClass190_1.aShort86 - (this.anInt3883 >> 1);
		this.anInt3866 = local378 + this.aClass190_1.aShort85 - (this.anInt3879 >> 1);
	}
}
