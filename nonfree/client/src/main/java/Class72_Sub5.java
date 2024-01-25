import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class72_Sub5 extends Class72 {

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
	public int anInt5865;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
	private int anInt5866;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
	private int anInt5870;

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
	private int anInt5871;

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
	private int anInt5873;

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
	public int anInt5875;

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
	private int anInt5876;

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
	public int anInt5877;

	@OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
	private int anInt5878;

	@OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
	private int anInt5879;

	@OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
	private int anInt5880;

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
	private int anInt5881;

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
	private int anInt5882;

	@OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
	public int anInt5883;

	@OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
	private int anInt5884;

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
	private int anInt5885;

	@OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
	private int anInt5886;

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
	private int anInt5887;

	@OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
	private int anInt5888;

	@OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
	private int anInt5891;

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "Z")
	private boolean aBoolean428 = false;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
	private int anInt5872 = 0;

	@OriginalMember(owner = "client!nh", name = "S", descriptor = "Z")
	public boolean aBoolean429 = false;

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "J")
	private final long aLong245;

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "Lclient!lm;")
	public final Class72_Sub4 aClass72_Sub4_6;

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "Lclient!kca;")
	public final Class161 aClass161_2;

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "Lclient!dp;")
	public Class69 aClass69_1;

	@OriginalMember(owner = "client!nh", name = "C", descriptor = "Lclient!vda;")
	public final Class299 aClass299_7;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!qa;Lclient!kca;Lclient!lm;J)V")
	public Class72_Sub5(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) Class72_Sub4 arg2, @OriginalArg(3) long arg3) {
		this.aLong245 = arg3;
		this.aClass72_Sub4_6 = arg2;
		this.aClass161_2 = arg1;
		this.aClass69_1 = this.aClass161_2.method4183();
		if (!arg0.method7254() && this.aClass69_1.anInt1908 != -1) {
			this.aClass69_1 = Static224.method3891(this.aClass69_1.anInt1908);
		}
		this.aClass299_7 = new Class299();
		this.anInt5872 = (int) ((double) this.anInt5872 + Math.random() * 64.0D);
		this.method4994();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!qa;J)V")
	public void method4991(@OriginalArg(1) Class122 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(11) Class72_Sub1_Sub1_Sub1 local11 = (Class72_Sub1_Sub1_Sub1) this.aClass299_7.method7030(); local11 != null; local11 = (Class72_Sub1_Sub1_Sub1) this.aClass299_7.method7031()) {
			local11.method1855(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZLclient!qa;IJ)V")
	public void method4993(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class122 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		@Pc(41) int local41;
		if (this.aBoolean429) {
			arg0 = false;
		} else if (this.aClass69_1.anInt1904 > Static69.anInt1331) {
			arg0 = false;
		} else if (Static132.anInt2629 > Static392.anIntArray682[Static69.anInt1331]) {
			arg0 = false;
		} else if (this.aBoolean428) {
			arg0 = false;
		} else if (this.aClass69_1.anInt1920 != -1) {
			local41 = (int) (arg3 - this.aLong245);
			if (this.aClass69_1.aBoolean121 || local41 <= this.aClass69_1.anInt1920) {
				local41 %= this.aClass69_1.anInt1920;
			} else {
				arg0 = false;
			}
			if (!this.aClass69_1.aBoolean116 && local41 < this.aClass69_1.anInt1939) {
				arg0 = false;
			}
			if (this.aClass69_1.aBoolean116 && this.aClass69_1.anInt1939 <= local41) {
				arg0 = false;
			}
		}
		if (arg0) {
			this.anInt5872 += (int) (((double) (this.aClass69_1.anInt1919 - this.aClass69_1.anInt1916) * Math.random() + (double) this.aClass69_1.anInt1916) * (double) arg2);
			if (this.anInt5872 > 63) {
				local41 = this.anInt5872 >> 6;
				this.anInt5872 &= 0x3F;
				for (@Pc(141) int local141 = 0; local141 < local41; local141++) {
					@Pc(154) int local154;
					@Pc(160) int local160;
					@Pc(157) int local157;
					@Pc(172) int local172;
					@Pc(180) int local180;
					@Pc(184) int local184;
					@Pc(194) int local194;
					@Pc(202) int local202;
					@Pc(206) int local206;
					if (this.aClass69_1.lb <= 0 && this.aClass69_1.aShort30 <= 0) {
						local154 = this.anInt5887;
						local157 = this.anInt5880;
						local160 = this.anInt5876;
					} else {
						local172 = this.anInt5884 + (int) ((double) this.anInt5885 * Math.random());
						@Pc(176) int local176 = local172 & 0x3FFF;
						local180 = Class310.anIntArray827[local176];
						local184 = Class310.anIntArray826[local176];
						local194 = this.anInt5891 + (int) ((double) this.anInt5886 * Math.random());
						@Pc(198) int local198 = local194 & 0x1FFF;
						local202 = Class310.anIntArray827[local198];
						local206 = Class310.anIntArray826[local198];
						local160 = (local206 << 1) * -1;
						local154 = local202 * local184 >> 13;
						local157 = local180 * local202 >> 13;
					}
					local172 = (int) (Math.random() * 65535.0D);
					local180 = (int) (Math.random() * 65535.0D);
					if (local180 + local172 > 65535) {
						local172 = 65535 - local172;
						local180 = 65535 - local180;
					}
					local184 = 65535 - local180 - local172;
					local194 = (int) ((long) local184 * (long) this.anInt5881 + (long) local172 * (long) this.anInt5873 + (long) local180 * (long) this.anInt5870 >> 16);
					local202 = (int) ((long) local180 * (long) this.anInt5878 + (long) local172 * (long) this.anInt5882 + (long) this.anInt5888 * (long) local184 >> 16);
					local206 = (int) ((long) this.anInt5871 * (long) local172 + (long) local180 * (long) this.anInt5879 + (long) this.anInt5866 * (long) local184 >> 16);
					@Pc(349) int local349 = this.aClass69_1.anInt1953 + (int) ((double) (this.aClass69_1.anInt1924 - this.aClass69_1.anInt1953) * Math.random());
					@Pc(366) int local366 = (int) ((double) (this.aClass69_1.anInt1929 - this.aClass69_1.anInt1903) * Math.random()) + this.aClass69_1.anInt1903;
					@Pc(383) int local383 = (int) ((double) (this.aClass69_1.anInt1938 - this.aClass69_1.anInt1905) * Math.random()) + this.aClass69_1.anInt1905;
					@Pc(445) int local445;
					if (this.aClass69_1.aBoolean123) {
						@Pc(449) double local449 = Math.random();
						local445 = (int) (local449 * (double) this.aClass69_1.anInt1955 + (double) this.aClass69_1.anInt1954) | (int) ((double) this.aClass69_1.anInt1947 + local449 * (double) this.aClass69_1.anInt1930) << 8 | (int) (local449 * (double) this.aClass69_1.anInt1915 + (double) this.aClass69_1.anInt1927) << 16 | (int) ((double) this.aClass69_1.anInt1911 * Math.random() + (double) this.aClass69_1.anInt1943) << 24;
					} else {
						local445 = (int) ((double) this.aClass69_1.anInt1927 + Math.random() * (double) this.aClass69_1.anInt1915) << 16 | (int) ((double) this.aClass69_1.anInt1947 + (double) this.aClass69_1.anInt1930 * Math.random()) << 8 | (int) ((double) this.aClass69_1.anInt1954 + (double) this.aClass69_1.anInt1955 * Math.random()) | (int) ((double) this.aClass69_1.anInt1911 * Math.random() + (double) this.aClass69_1.anInt1943) << 24;
					}
					@Pc(511) int local511 = this.aClass69_1.anInt1923;
					if (!arg1.method7254() && !this.aClass69_1.aBoolean117) {
						local511 = -1;
					}
					if (Static468.anInt7887 == Static175.anInt3116) {
						new Class72_Sub1_Sub1_Sub1(this, local194, local202, local206, local154, local160, local157, local349, local366, local445, local383, local511, this.aClass69_1.aBoolean119, this.aClass69_1.aBoolean120);
					} else {
						@Pc(531) Class72_Sub1_Sub1_Sub1 local531 = Static413.aClass72_Sub1_Sub1_Sub1Array2[Static468.anInt7887];
						Static468.anInt7887 = Static468.anInt7887 + 1 & 0x3FF;
						local531.method1859(this, local194, local202, local206, local154, local160, local157, local349, local366, local445, local383, local511, this.aClass69_1.aBoolean119, this.aClass69_1.aBoolean120);
					}
				}
			}
		}
		this.anInt5875 = 0;
		for (@Pc(600) Class72_Sub1_Sub1_Sub1 local600 = (Class72_Sub1_Sub1_Sub1) this.aClass299_7.method7030(); local600 != null; local600 = (Class72_Sub1_Sub1_Sub1) this.aClass299_7.method7031()) {
			local600.method1858(arg3, arg2);
			this.anInt5875++;
		}
		Static382.anInt6971 += this.anInt5875;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	public void method4994() {
		this.anInt5881 = this.aClass161_2.anInt4839;
		this.anInt5879 = this.aClass161_2.anInt4850;
		this.anInt5888 = this.aClass161_2.anInt4845;
		this.anInt5866 = this.aClass161_2.anInt4840;
		this.anInt5882 = this.aClass161_2.anInt4848;
		this.anInt5871 = this.aClass161_2.anInt4843;
		this.anInt5870 = this.aClass161_2.anInt4849;
		this.anInt5878 = this.aClass161_2.anInt4846;
		this.anInt5873 = this.aClass161_2.anInt4838;
		if (this.anInt5873 == this.anInt5870 && this.anInt5881 == this.anInt5870 && this.anInt5882 == this.anInt5878 && this.anInt5888 == this.anInt5878 && this.anInt5879 == this.anInt5871 && this.anInt5866 == this.anInt5879) {
			this.aBoolean428 = true;
			return;
		}
		this.aBoolean428 = false;
		@Pc(112) int local112 = (this.anInt5881 + this.anInt5873 + this.anInt5870) / 3;
		@Pc(124) int local124 = (this.anInt5888 + this.anInt5882 + this.anInt5878) / 3;
		@Pc(136) int local136 = (this.anInt5866 + this.anInt5871 + this.anInt5879) / 3;
		if (this.anInt5877 == local112 && this.anInt5865 == local124 && this.anInt5883 == local136) {
			return;
		}
		this.anInt5883 = local136;
		this.anInt5877 = local112;
		this.anInt5865 = local124;
		@Pc(173) int local173 = this.anInt5870 - this.anInt5873;
		@Pc(180) int local180 = this.anInt5878 - this.anInt5882;
		@Pc(187) int local187 = this.anInt5879 - this.anInt5871;
		@Pc(194) int local194 = this.anInt5881 - this.anInt5873;
		@Pc(201) int local201 = this.anInt5888 - this.anInt5882;
		@Pc(208) int local208 = this.anInt5866 - this.anInt5871;
		this.anInt5887 = local180 * local208 - local187 * local201;
		this.anInt5880 = local173 * local201 - local180 * local194;
		for (this.anInt5876 = local187 * local194 - local208 * local173; this.anInt5887 > 32767 || this.anInt5876 > 32767 || this.anInt5880 > 32767 || this.anInt5887 < -32767 || this.anInt5876 < -32767 || this.anInt5880 < -32767; this.anInt5876 >>= 0x1) {
			this.anInt5887 >>= 0x1;
			this.anInt5880 >>= 0x1;
		}
		@Pc(310) int local310 = (int) Math.sqrt((double) (this.anInt5880 * this.anInt5880 + this.anInt5876 * this.anInt5876 + this.anInt5887 * this.anInt5887));
		if (local310 <= 0) {
			local310 = 1;
		}
		this.anInt5880 = this.anInt5880 * 32767 / local310;
		this.anInt5887 = this.anInt5887 * 32767 / local310;
		this.anInt5876 = this.anInt5876 * 32767 / local310;
		if (this.aClass69_1.lb <= 0 && this.aClass69_1.aShort30 <= 0) {
			return;
		}
		@Pc(366) int local366 = (int) (Math.atan2((double) this.anInt5880, (double) this.anInt5887) * 2607.5945876176133D);
		@Pc(387) int local387 = (int) (Math.atan2((double) this.anInt5876, Math.sqrt((double) (this.anInt5880 * this.anInt5880 + this.anInt5887 * this.anInt5887))) * 2607.5945876176133D);
		this.anInt5885 = this.aClass69_1.lb - this.aClass69_1.aShort28;
		this.anInt5884 = this.aClass69_1.aShort28 + local366 - (this.anInt5885 >> 1);
		this.anInt5886 = this.aClass69_1.aShort30 - this.aClass69_1.aShort29;
		this.anInt5891 = local387 + this.aClass69_1.aShort29 - (this.anInt5886 >> 1);
	}
}
