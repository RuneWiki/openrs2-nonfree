import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class8_Sub6 extends Class8 {

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	private int anInt4799;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	private int anInt4802;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	private int anInt4803;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	private int anInt4804;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	private int anInt4805;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
	private int anInt4807;

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
	private int anInt4808;

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
	private int anInt4810;

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
	public int anInt4811;

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
	public int anInt4812;

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
	private int anInt4813;

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
	public int anInt4814;

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
	public int anInt4815;

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
	private int anInt4816;

	@OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
	private int anInt4817;

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
	private int anInt4818;

	@OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
	private int anInt4819;

	@OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
	private int anInt4820;

	@OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
	private int anInt4821;

	@OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
	private int anInt4822;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	private int anInt4800 = 0;

	@OriginalMember(owner = "client!nc", name = "L", descriptor = "Z")
	private boolean aBoolean345 = false;

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "Z")
	public boolean aBoolean346 = false;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Lclient!bq;")
	public final Class8_Sub3 aClass8_Sub3_6;

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "J")
	private final long aLong131;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Lclient!qc;")
	public final Class200 aClass200_1;

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "Lclient!hc;")
	public Class102 aClass102_1;

	@OriginalMember(owner = "client!nc", name = "N", descriptor = "Lclient!ht;")
	public final Class112 aClass112_9;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!ya;Lclient!qc;Lclient!bq;J)V")
	public Class8_Sub6(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(2) Class8_Sub3 arg2, @OriginalArg(3) long arg3) {
		this.aClass8_Sub3_6 = arg2;
		this.aLong131 = arg3;
		this.aClass200_1 = arg1;
		this.aClass102_1 = this.aClass200_1.method4493();
		if (!arg0.method4408() && this.aClass102_1.anInt3008 != -1) {
			this.aClass102_1 = Static115.method2050(this.aClass102_1.anInt3008);
		}
		this.aClass112_9 = new Class112();
		this.anInt4800 = (int) ((double) this.anInt4800 + Math.random() * 64.0D);
		this.method3879();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	public void method3879() {
		this.anInt4803 = this.aClass200_1.anInt5566;
		this.anInt4807 = this.aClass200_1.anInt5565;
		this.anInt4808 = this.aClass200_1.anInt5561;
		this.anInt4816 = this.aClass200_1.anInt5563;
		this.anInt4799 = this.aClass200_1.anInt5567;
		this.anInt4817 = this.aClass200_1.anInt5560;
		this.anInt4813 = this.aClass200_1.anInt5559;
		this.anInt4820 = this.aClass200_1.anInt5562;
		this.anInt4810 = this.aClass200_1.anInt5564;
		if (this.anInt4799 == this.anInt4816 && this.anInt4817 == this.anInt4799 && this.anInt4807 == this.anInt4820 && this.anInt4808 == this.anInt4820 && this.anInt4810 == this.anInt4813 && this.anInt4813 == this.anInt4803) {
			this.aBoolean345 = true;
			return;
		}
		this.aBoolean345 = false;
		@Pc(114) int local114 = (this.anInt4817 + this.anInt4799 + this.anInt4816) / 3;
		@Pc(127) int local127 = (this.anInt4807 + this.anInt4820 + this.anInt4808) / 3;
		@Pc(138) int local138 = (this.anInt4803 + this.anInt4813 + this.anInt4810) / 3;
		if (local114 == this.anInt4814 && this.anInt4811 == local127 && this.anInt4812 == local138) {
			return;
		}
		this.anInt4814 = local114;
		this.anInt4811 = local127;
		this.anInt4812 = local138;
		@Pc(173) int local173 = this.anInt4799 - this.anInt4816;
		@Pc(180) int local180 = this.anInt4820 - this.anInt4807;
		@Pc(187) int local187 = this.anInt4813 - this.anInt4810;
		@Pc(194) int local194 = this.anInt4817 - this.anInt4816;
		@Pc(201) int local201 = this.anInt4808 - this.anInt4807;
		@Pc(208) int local208 = this.anInt4803 - this.anInt4810;
		this.anInt4819 = local180 * local208 - local201 * local187;
		this.anInt4818 = local173 * local201 - local194 * local180;
		this.anInt4821 = local194 * local187 - local208 * local173;
		while (this.anInt4819 > 32767 || this.anInt4821 > 32767 || this.anInt4818 > 32767 || this.anInt4819 < -32767 || this.anInt4821 < -32767 || this.anInt4818 < -32767) {
			this.anInt4818 >>= 0x1;
			this.anInt4821 >>= 0x1;
			this.anInt4819 >>= 0x1;
		}
		@Pc(310) int local310 = (int) Math.sqrt((double) (this.anInt4818 * this.anInt4818 + this.anInt4819 * this.anInt4819 + this.anInt4821 * this.anInt4821));
		if (local310 <= 0) {
			local310 = 1;
		}
		this.anInt4818 = this.anInt4818 * 32767 / local310;
		this.anInt4821 = this.anInt4821 * 32767 / local310;
		this.anInt4819 = this.anInt4819 * 32767 / local310;
		if (this.aClass102_1.aShort30 <= 0 && this.aClass102_1.aShort33 <= 0) {
			return;
		}
		@Pc(360) int local360 = (int) (Math.atan2((double) this.anInt4818, (double) this.anInt4819) * 2607.5945876176133D);
		@Pc(382) int local382 = (int) (Math.atan2((double) this.anInt4821, Math.sqrt((double) (this.anInt4819 * this.anInt4819 + this.anInt4818 * this.anInt4818))) * 2607.5945876176133D);
		this.anInt4802 = this.aClass102_1.aShort30 - this.aClass102_1.aShort32;
		this.anInt4805 = this.aClass102_1.aShort33 - this.aClass102_1.aShort31;
		this.anInt4804 = local360 + this.aClass102_1.aShort32 - (this.anInt4802 >> 1);
		this.anInt4822 = local382 + this.aClass102_1.aShort31 - (this.anInt4805 >> 1);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!ya;ZIJ)V")
	public void method3880(@OriginalArg(1) Class49 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		@Pc(38) int local38;
		if (this.aBoolean346) {
			arg1 = false;
		} else if (Static157.anInt3179 < this.aClass102_1.anInt2995) {
			arg1 = false;
		} else if (Static130.anIntArray254[Static157.anInt3179] < Static448.anInt7289) {
			arg1 = false;
		} else if (this.aBoolean345) {
			arg1 = false;
		} else if (this.aClass102_1.anInt2968 != -1) {
			local38 = (int) (arg3 - this.aLong131);
			if (this.aClass102_1.aBoolean231 || local38 <= this.aClass102_1.anInt2968) {
				local38 %= this.aClass102_1.anInt2968;
			} else {
				arg1 = false;
			}
			if (!this.aClass102_1.aBoolean229 && local38 < this.aClass102_1.anInt2967) {
				arg1 = false;
			}
			if (this.aClass102_1.aBoolean229 && local38 >= this.aClass102_1.anInt2967) {
				arg1 = false;
			}
		}
		if (arg1) {
			this.anInt4800 += (int) (((double) (this.aClass102_1.anInt3013 - this.aClass102_1.anInt3010) * Math.random() + (double) this.aClass102_1.anInt3010) * (double) arg2);
			if (this.anInt4800 > 63) {
				local38 = this.anInt4800 >> 6;
				this.anInt4800 &= 0x3F;
				for (@Pc(141) int local141 = 0; local141 < local38; local141++) {
					@Pc(160) int local160;
					@Pc(157) int local157;
					@Pc(163) int local163;
					@Pc(175) int local175;
					@Pc(183) int local183;
					@Pc(187) int local187;
					@Pc(197) int local197;
					@Pc(205) int local205;
					@Pc(209) int local209;
					if (this.aClass102_1.aShort30 <= 0 && this.aClass102_1.aShort33 <= 0) {
						local157 = this.anInt4821;
						local160 = this.anInt4819;
						local163 = this.anInt4818;
					} else {
						local175 = (int) ((double) this.anInt4802 * Math.random()) + this.anInt4804;
						@Pc(179) int local179 = local175 & 0x3FFF;
						local183 = Class162.anIntArray388[local179];
						local187 = Class162.anIntArray387[local179];
						local197 = (int) (Math.random() * (double) this.anInt4805) + this.anInt4822;
						@Pc(201) int local201 = local197 & 0x1FFF;
						local205 = Class162.anIntArray388[local201];
						local209 = Class162.anIntArray387[local201];
						local160 = local187 * local205 >> 15;
						local157 = (local209 << 0) * -1;
						local163 = local183 * local205 >> 15;
					}
					local175 = (int) (Math.random() * 65535.0D);
					local183 = (int) (Math.random() * 65535.0D);
					if (local175 + local183 > 65535) {
						local175 = 65535 - local175;
						local183 = 65535 - local183;
					}
					local187 = 65535 - local183 - local175;
					local197 = this.anInt4816 * local175 + local183 * this.anInt4799 + this.anInt4817 * local187 >> 16;
					local205 = this.anInt4808 * local187 + local175 * this.anInt4807 + this.anInt4820 * local183 >> 16;
					local209 = local175 * this.anInt4810 + this.anInt4813 * local183 + this.anInt4803 * local187 >> 16;
					@Pc(333) int local333 = this.aClass102_1.anInt3004 + (int) ((double) (this.aClass102_1.anInt2979 - this.aClass102_1.anInt3004) * Math.random());
					@Pc(350) int local350 = this.aClass102_1.anInt2974 + (int) (Math.random() * (double) (this.aClass102_1.anInt2965 - this.aClass102_1.anInt2974));
					@Pc(368) int local368 = this.aClass102_1.anInt2961 + (int) (Math.random() * (double) (this.aClass102_1.anInt3006 - this.aClass102_1.anInt2961));
					@Pc(430) int local430;
					if (this.aClass102_1.aBoolean226) {
						@Pc(434) double local434 = Math.random();
						local430 = (int) (local434 * (double) this.aClass102_1.anInt3005 + (double) this.aClass102_1.anInt2999) << 8 | (int) ((double) this.aClass102_1.anInt2989 + (double) this.aClass102_1.anInt3001 * local434) << 16 | (int) ((double) this.aClass102_1.anInt2998 + local434 * (double) this.aClass102_1.anInt2990) | (int) (Math.random() * (double) this.aClass102_1.anInt3002 + (double) this.aClass102_1.anInt3012) << 24;
					} else {
						local430 = (int) ((double) this.aClass102_1.anInt3002 * Math.random() + (double) this.aClass102_1.anInt3012) << 24 | (int) (Math.random() * (double) this.aClass102_1.anInt2990 + (double) this.aClass102_1.anInt2998) | (int) ((double) this.aClass102_1.anInt2989 + (double) this.aClass102_1.anInt3001 * Math.random()) << 16 | (int) ((double) this.aClass102_1.anInt2999 + (double) this.aClass102_1.anInt3005 * Math.random()) << 8;
					}
					@Pc(496) int local496 = this.aClass102_1.anInt2997;
					if (!arg0.method4408() && !this.aClass102_1.aBoolean232) {
						local496 = -1;
					}
					if (Static314.anInt5540 == Static117.anInt2657) {
						new Class8_Sub2_Sub1_Sub1(this, local197, local205, local209, local160, local157, local163, local333, local350, local430, local368, local496, this.aClass102_1.aBoolean227, this.aClass102_1.aBoolean230);
					} else {
						@Pc(536) Class8_Sub2_Sub1_Sub1 local536 = Static229.aClass8_Sub2_Sub1_Sub1Array2[Static314.anInt5540];
						Static314.anInt5540 = Static314.anInt5540 + 1 & 0x3FF;
						local536.method5793(this, local197, local205, local209, local160, local157, local163, local333, local350, local430, local368, local496, this.aClass102_1.aBoolean227, this.aClass102_1.aBoolean230);
					}
				}
			}
		}
		this.anInt4815 = 0;
		for (@Pc(585) Class8_Sub2_Sub1_Sub1 local585 = (Class8_Sub2_Sub1_Sub1) this.aClass112_9.method2553(); local585 != null; local585 = (Class8_Sub2_Sub1_Sub1) this.aClass112_9.method2550()) {
			local585.method5795(arg3, arg2);
			this.anInt4815++;
		}
		Static145.anInt3058 += this.anInt4815;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IJ)V")
	public void method3881(@OriginalArg(1) long arg0) {
		for (@Pc(11) Class8_Sub2_Sub1_Sub1 local11 = (Class8_Sub2_Sub1_Sub1) this.aClass112_9.method2553(); local11 != null; local11 = (Class8_Sub2_Sub1_Sub1) this.aClass112_9.method2550()) {
			local11.method5794(arg0);
		}
	}
}
