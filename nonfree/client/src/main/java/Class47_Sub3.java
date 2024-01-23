import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class47_Sub3 extends Class47 {

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
	private int anInt5859;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
	private int anInt5861;

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
	private int anInt5862;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
	private int anInt5863;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
	public int anInt5864;

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
	private int anInt5867;

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
	private int anInt5868;

	@OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
	public int anInt5870;

	@OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
	private int anInt5871;

	@OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
	private int anInt5872;

	@OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
	private int anInt5875;

	@OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
	public int anInt5876;

	@OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
	private int anInt5880;

	@OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
	private int anInt5881;

	@OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
	private int anInt5882;

	@OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
	private int anInt5884;

	@OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
	public int anInt5885;

	@OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
	private int anInt5886;

	@OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
	private int anInt5887;

	@OriginalMember(owner = "client!vi", name = "Z", descriptor = "I")
	private int anInt5888;

	@OriginalMember(owner = "client!vi", name = "D", descriptor = "I")
	private int anInt5873 = 0;

	@OriginalMember(owner = "client!vi", name = "S", descriptor = "Z")
	public boolean aBoolean419 = false;

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "Z")
	public boolean aBoolean418 = true;

	@OriginalMember(owner = "client!vi", name = "P", descriptor = "Lclient!em;")
	public Class47_Sub1 aClass47_Sub1_6;

	@OriginalMember(owner = "client!vi", name = "X", descriptor = "Lclient!wb;")
	public Class190 aClass190_1;

	@OriginalMember(owner = "client!vi", name = "ab", descriptor = "Lclient!ge;")
	public Class62 aClass62_3;

	@OriginalMember(owner = "client!vi", name = "R", descriptor = "J")
	private long aLong231;

	@OriginalMember(owner = "client!vi", name = "K", descriptor = "Lclient!so;")
	public Class164 aClass164_1;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!wb;Lclient!em;J)V")
	public Class47_Sub3(@OriginalArg(0) Class190 arg0, @OriginalArg(1) Class47_Sub1 arg1, @OriginalArg(2) long arg2) {
		this.aClass47_Sub1_6 = arg1;
		this.aClass190_1 = arg0;
		this.aClass62_3 = new Class62();
		this.aLong231 = arg2;
		this.aClass164_1 = this.aClass190_1.aClass164_2;
		this.anInt5873 = (int) ((double) this.anInt5873 + Math.random() * 64.0D);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BIIJZI)V")
	public void method4809(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(84) int local84;
		if (this.aBoolean419) {
			arg3 = false;
		} else if (Static71.anInt1302 < this.aClass164_1.anInt5299) {
			arg3 = false;
		} else if (Static71.anInt1293 > Static243.anIntArray534[Static71.anInt1302]) {
			arg3 = false;
		} else if (this.anInt5871 == this.anInt5861 && this.anInt5859 == this.anInt5861 && this.anInt5875 == this.anInt5863 && this.anInt5863 == this.anInt5886 && this.anInt5888 == this.anInt5880 && this.anInt5884 == this.anInt5880) {
			arg3 = false;
		} else if (this.aClass164_1.anInt5332 != -1) {
			local84 = (int) (arg2 - this.aLong231);
			if (this.aClass164_1.aBoolean372 || local84 <= this.aClass164_1.anInt5332) {
				local84 %= this.aClass164_1.anInt5332;
			} else {
				arg3 = false;
			}
			if (!this.aClass164_1.aBoolean369 && this.aClass164_1.anInt5329 > local84) {
				arg3 = false;
			}
			if (this.aClass164_1.aBoolean369 && local84 >= this.aClass164_1.anInt5329) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt5873 += (int) ((double) arg0 * ((double) this.aClass164_1.anInt5307 + (double) (this.aClass164_1.anInt5296 - this.aClass164_1.anInt5307) * Math.random()));
			if (this.anInt5873 > 63) {
				local84 = this.anInt5873 >> 6;
				this.anInt5873 &= 0x3F;
				@Pc(211) int local211;
				@Pc(198) int local198;
				@Pc(205) int local205;
				@Pc(217) int local217;
				@Pc(224) int local224;
				@Pc(241) int local241;
				@Pc(328) int local328;
				@Pc(384) int local384;
				@Pc(407) int local407;
				if (this.aBoolean418) {
					local198 = this.anInt5863 - this.anInt5875;
					local205 = this.anInt5880 - this.anInt5888;
					local211 = this.anInt5861 - this.anInt5871;
					local217 = this.anInt5859 - this.anInt5871;
					local224 = this.anInt5886 - this.anInt5875;
					this.anInt5882 = local224 * local211 - local217 * local198;
					local241 = this.anInt5884 - this.anInt5888;
					this.anInt5868 = local205 * local217 - local211 * local241;
					this.anInt5862 = local198 * local241 - local205 * local224;
					while (true) {
						if (this.anInt5862 <= 32767 && this.anInt5868 <= 32767 && this.anInt5882 <= 32767 && this.anInt5862 >= -32767 && this.anInt5868 >= -32767 && this.anInt5882 >= -32767) {
							local328 = (int) Math.sqrt((double) (this.anInt5868 * this.anInt5868 + this.anInt5862 * this.anInt5862 + this.anInt5882 * this.anInt5882));
							if (local328 <= 0) {
								local328 = 1;
							}
							this.anInt5862 = this.anInt5862 * 32767 / local328;
							this.anInt5882 = this.anInt5882 * 32767 / local328;
							this.anInt5868 = this.anInt5868 * 32767 / local328;
							if (this.aClass164_1.aShort41 > 0 || this.aClass164_1.aShort40 > 0) {
								local384 = (int) (Math.atan2((double) this.anInt5882, (double) this.anInt5862) * 2047.0D / 6.283185307179586D);
								local407 = (int) (Math.atan2((double) this.anInt5868, Math.sqrt((double) (this.anInt5882 * this.anInt5882 + this.anInt5862 * this.anInt5862))) * 2047.0D / 6.283185307179586D);
								this.anInt5872 = this.aClass164_1.aShort41 - this.aClass164_1.aShort43;
								this.anInt5887 = this.aClass164_1.aShort40 - this.aClass164_1.aShort42;
								this.anInt5867 = this.aClass164_1.aShort42 + local407 - this.anInt5887 / 2;
								@Pc(446) int local446 = local384 - this.aClass47_Sub1_6.anInt1306;
								this.anInt5881 = local446 + this.aClass164_1.aShort43 - this.anInt5872 / 2;
							} else if (this.aClass47_Sub1_6.anInt1306 != 0) {
								local384 = this.anInt5882 * arg1 + this.anInt5862 * arg4 >> 16;
								this.anInt5882 = arg4 * this.anInt5882 - this.anInt5862 * arg1 >> 16;
								this.anInt5862 = local384;
							}
							this.aBoolean418 = false;
							break;
						}
						this.anInt5882 >>= 0x1;
						this.anInt5862 >>= 0x1;
						this.anInt5868 >>= 0x1;
					}
				}
				for (local217 = 0; local217 < local84; local217++) {
					@Pc(567) int local567;
					if (this.aClass164_1.aShort41 <= 0 && this.aClass164_1.aShort40 <= 0) {
						local211 = this.anInt5862;
						local198 = this.anInt5868;
						local205 = this.anInt5882;
					} else {
						local224 = this.anInt5881 + (int) ((double) this.anInt5872 * Math.random());
						local224 &= 0x7FF;
						local384 = (int) (Math.random() * (double) this.anInt5887) + this.anInt5867;
						local328 = Class11.anIntArray27[local224] >> 1;
						local384 &= 0x3FF;
						local567 = Class11.anIntArray27[local384] >> 1;
						local198 = local567 * -1;
						local407 = Class11.anIntArray26[local384] >> 1;
						local211 = local407 * local328 >> 15;
						local241 = Class11.anIntArray26[local224] >> 1;
						local205 = local407 * local241 >> 15;
					}
					local224 = (int) (Math.random() * 255.0D);
					local241 = (int) (Math.random() * 255.0D);
					local328 = local241 * (255 - local224) >> 8;
					local384 = 255 - local328 - local224;
					local567 = this.anInt5886 * local384 + this.anInt5875 * local224 + local328 * this.anInt5863 >> 8;
					@Pc(654) int local654 = this.anInt5884 * local384 + this.anInt5880 * local328 + this.anInt5888 * local224 >> 8;
					local407 = local224 * this.anInt5871 + local328 * this.anInt5861 + this.anInt5859 * local384 >> 8;
					@Pc(690) int local690;
					if (this.aClass47_Sub1_6.anInt1306 != 0) {
						local690 = arg4 * local407 + local654 * arg1 >> 16;
						local654 = local654 * arg4 - local407 * arg1 >> 16;
						local407 = local690;
					}
					local690 = this.aClass164_1.anInt5342 + (int) ((double) (this.aClass164_1.anInt5338 - this.aClass164_1.anInt5342) * Math.random());
					@Pc(781) int local781;
					if (this.aClass164_1.aBoolean368) {
						@Pc(785) double local785 = Math.random();
						local781 = (int) ((double) this.aClass164_1.anInt5309 + (double) this.aClass164_1.anInt5300 * local785) << 8 | (int) ((double) this.aClass164_1.anInt5312 * local785 + (double) this.aClass164_1.anInt5320) << 16 | (int) ((double) this.aClass164_1.anInt5297 * local785 + (double) this.aClass164_1.anInt5335) | (int) (local785 * (double) this.aClass164_1.anInt5341 + (double) this.aClass164_1.anInt5306) << 24;
					} else {
						local781 = (int) ((double) this.aClass164_1.anInt5309 + (double) this.aClass164_1.anInt5300 * Math.random()) << 8 | (int) ((double) this.aClass164_1.anInt5320 + Math.random() * (double) this.aClass164_1.anInt5312) << 16 | (int) ((double) this.aClass164_1.anInt5297 * Math.random() + (double) this.aClass164_1.anInt5335) | (int) ((double) this.aClass164_1.anInt5306 + (double) this.aClass164_1.anInt5341 * Math.random()) << 24;
					}
					@Pc(861) int local861 = this.aClass164_1.anInt5330 + (int) ((double) (this.aClass164_1.anInt5337 - this.aClass164_1.anInt5330) * Math.random());
					if (Static71.anInt1296 == Static71.anInt1294) {
						new Class47_Sub2_Sub1(this, this.aClass47_Sub1_6.anInt1316 + local407, local567 + this.aClass47_Sub1_6.anInt1317, local654 + this.aClass47_Sub1_6.anInt1318, local211, local198, local205, local690, local861, local781);
					} else {
						@Pc(897) Class47_Sub2_Sub1 local897 = Static71.aClass47_Sub2_Sub1Array2[Static71.anInt1296];
						Static71.anInt1296 = Static71.anInt1296 + 1 & 0x3FF;
						local897.method4491(this, local407 + this.aClass47_Sub1_6.anInt1316, local567 + this.aClass47_Sub1_6.anInt1317, local654 + this.aClass47_Sub1_6.anInt1318, local211, local198, local205, local690, local861, local781);
					}
				}
			}
		}
		this.anInt5864 = 0;
		for (@Pc(939) Class47_Sub2_Sub1 local939 = (Class47_Sub2_Sub1) this.aClass62_3.method1369(); local939 != null; local939 = (Class47_Sub2_Sub1) this.aClass62_3.method1363()) {
			local939.method4493(arg2, arg0);
			this.anInt5864++;
		}
		Static71.anInt1300 += this.anInt5864;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method4810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		this.anInt5888 = arg7;
		this.anInt5871 = arg6;
		this.anInt5875 = arg8;
		this.anInt5863 = arg5;
		this.anInt5884 = arg3;
		this.anInt5861 = arg1;
		this.anInt5859 = arg0;
		this.anInt5886 = arg2;
		@Pc(53) int local53 = this.aClass47_Sub1_6.anInt1317 + (this.anInt5863 + this.anInt5875 + this.anInt5886) / 3;
		@Pc(72) int local72 = (this.anInt5859 + this.anInt5871 + this.anInt5861) / 3 + this.aClass47_Sub1_6.anInt1316;
		this.anInt5880 = arg4;
		@Pc(92) int local92 = (this.anInt5884 + this.anInt5888 + this.anInt5880) / 3 + this.aClass47_Sub1_6.anInt1318;
		if (local72 != this.anInt5876 || local53 != this.anInt5885 || this.anInt5870 != local92) {
			this.anInt5885 = local53;
			this.aBoolean418 = true;
			this.anInt5870 = local92;
			this.anInt5876 = local72;
		}
	}
}
