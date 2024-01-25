import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
	public int anInt4576;

	@OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
	private int anInt4582;

	@OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
	private int anInt4583;

	@OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
	private int anInt4584;

	@OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
	private int anInt4585;

	@OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
	private int anInt4586;

	@OriginalMember(owner = "client!jp", name = "J", descriptor = "I")
	private int anInt4587;

	@OriginalMember(owner = "client!jp", name = "K", descriptor = "I")
	private int anInt4588;

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "Z")
	public boolean aBoolean344 = false;

	@OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
	private int anInt4581 = 0;

	@OriginalMember(owner = "client!jp", name = "t", descriptor = "Lclient!iq;")
	public Class169 aClass169_1 = new Class169();

	@OriginalMember(owner = "client!jp", name = "C", descriptor = "Lclient!iq;")
	private Class169 aClass169_2 = new Class169();

	@OriginalMember(owner = "client!jp", name = "G", descriptor = "Z")
	private boolean aBoolean345 = false;

	@OriginalMember(owner = "client!jp", name = "A", descriptor = "Lclient!mk;")
	public final Class235 aClass235_1;

	@OriginalMember(owner = "client!jp", name = "z", descriptor = "Lclient!sia;")
	public final Class3_Sub7 aClass3_Sub7_4;

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "J")
	private final long aLong136;

	@OriginalMember(owner = "client!jp", name = "x", descriptor = "Lclient!at;")
	public Class21 aClass21_1;

	@OriginalMember(owner = "client!jp", name = "r", descriptor = "Lclient!ml;")
	public final Class236 aClass236_4;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!ha;Lclient!mk;Lclient!sia;J)V")
	public Class3_Sub5(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Class3_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aClass235_1 = arg1;
		this.aClass3_Sub7_4 = arg2;
		this.aLong136 = arg3;
		this.aClass21_1 = this.aClass235_1.method4945();
		if (!arg0.method8104() && this.aClass21_1.anInt524 != -1) {
			this.aClass21_1 = Static624.method8380(this.aClass21_1.anInt524);
		}
		this.aClass236_4 = new Class236();
		this.anInt4581 = (int) ((double) this.anInt4581 + Math.random() * 64.0D);
		this.method4137();
		this.aClass169_2.anInt4263 = this.aClass169_1.anInt4263;
		this.aClass169_2.anInt4260 = this.aClass169_1.anInt4260;
		this.aClass169_2.anInt4266 = this.aClass169_1.anInt4266;
		this.aClass169_2.anInt4256 = this.aClass169_1.anInt4256;
		this.aClass169_2.anInt4264 = this.aClass169_1.anInt4264;
		this.aClass169_2.anInt4257 = this.aClass169_1.anInt4257;
		this.aClass169_2.anInt4262 = this.aClass169_1.anInt4262;
		this.aClass169_2.anInt4253 = this.aClass169_1.anInt4253;
		this.aClass169_2.anInt4254 = this.aClass169_1.anInt4254;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!ha;JB)V")
	public void method4134(@OriginalArg(0) Class33 arg0, @OriginalArg(1) long arg1) {
		for (@Pc(11) Class3_Sub3_Sub1_Sub1 local11 = (Class3_Sub3_Sub1_Sub1) this.aClass236_4.method4958(); local11 != null; local11 = (Class3_Sub3_Sub1_Sub1) this.aClass236_4.method4950()) {
			local11.method1700(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZILclient!ha;J)V")
	public void method4136(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) long arg3) {
		@Pc(46) int local46;
		if (this.aBoolean344) {
			arg1 = false;
		} else if (this.aClass21_1.anInt548 > Static290.anInt4596) {
			arg1 = false;
		} else if (Static369.anInt5530 > Static151.anIntArray201[Static290.anInt4596]) {
			arg1 = false;
		} else if (this.aBoolean345) {
			arg1 = false;
		} else if (this.aClass21_1.anInt529 != -1) {
			local46 = (int) (arg3 - this.aLong136);
			if (this.aClass21_1.aBoolean53 || local46 <= this.aClass21_1.anInt529) {
				local46 %= this.aClass21_1.anInt529;
			} else {
				arg1 = false;
			}
			if (!this.aClass21_1.aBoolean54 && local46 < this.aClass21_1.anInt558) {
				arg1 = false;
			}
			if (this.aClass21_1.aBoolean54 && local46 >= this.aClass21_1.anInt558) {
				arg1 = false;
			}
		}
		if (arg1) {
			Static250.anInt4101++;
			local46 = (this.aClass169_1.anInt4256 + this.aClass169_1.anInt4253 + this.aClass169_1.anInt4262) / 3;
			@Pc(138) int local138 = (this.aClass169_1.anInt4263 + this.aClass169_1.anInt4266 + this.aClass169_1.anInt4257) / 3;
			@Pc(153) int local153 = (this.aClass169_1.anInt4260 + this.aClass169_1.anInt4254 + this.aClass169_1.anInt4264) / 3;
			@Pc(197) int local197;
			@Pc(206) int local206;
			@Pc(215) int local215;
			@Pc(224) int local224;
			@Pc(232) int local232;
			@Pc(241) int local241;
			@Pc(341) int local341;
			@Pc(394) int local394;
			@Pc(415) int local415;
			if (this.aClass169_1.anInt4265 != local46 || this.aClass169_1.anInt4259 != local138 || local153 != this.aClass169_1.anInt4267) {
				this.aClass169_1.anInt4267 = local153;
				this.aClass169_1.anInt4265 = local46;
				this.aClass169_1.anInt4259 = local138;
				local197 = this.aClass169_1.anInt4253 - this.aClass169_1.anInt4262;
				local206 = this.aClass169_1.anInt4263 - this.aClass169_1.anInt4266;
				local215 = this.aClass169_1.anInt4260 - this.aClass169_1.anInt4254;
				local224 = this.aClass169_1.anInt4256 - this.aClass169_1.anInt4262;
				local232 = this.aClass169_1.anInt4257 - this.aClass169_1.anInt4266;
				local241 = this.aClass169_1.anInt4264 - this.aClass169_1.anInt4254;
				this.anInt4583 = local215 * local224 - local241 * local197;
				this.anInt4585 = local197 * local232 - local206 * local224;
				this.anInt4582 = local241 * local206 - local232 * local215;
				while (true) {
					if (this.anInt4582 <= 32767 && this.anInt4583 <= 32767 && this.anInt4585 <= 32767 && this.anInt4582 >= -32767 && this.anInt4583 >= -32767 && this.anInt4585 >= -32767) {
						local341 = (int) Math.sqrt((double) (this.anInt4585 * this.anInt4585 + this.anInt4583 * this.anInt4583 + this.anInt4582 * this.anInt4582));
						if (local341 <= 0) {
							local341 = 1;
						}
						this.anInt4585 = this.anInt4585 * 32767 / local341;
						this.anInt4582 = this.anInt4582 * 32767 / local341;
						this.anInt4583 = this.anInt4583 * 32767 / local341;
						if (this.aClass21_1.aShort5 > 0 || this.aClass21_1.aShort7 > 0) {
							local394 = (int) (Math.atan2((double) this.anInt4585, (double) this.anInt4582) * 2607.5945876176133D);
							local415 = (int) (Math.atan2((double) this.anInt4583, Math.sqrt((double) (this.anInt4585 * this.anInt4585 + this.anInt4582 * this.anInt4582))) * 2607.5945876176133D);
							this.anInt4588 = this.aClass21_1.aShort5 - this.aClass21_1.aShort8;
							this.anInt4587 = this.aClass21_1.aShort7 - this.aClass21_1.aShort6;
							this.anInt4586 = this.aClass21_1.aShort8 + local394 - (this.anInt4588 >> 1);
							this.anInt4584 = this.aClass21_1.aShort6 + local415 - (this.anInt4587 >> 1);
						}
						break;
					}
					this.anInt4582 >>= 0x1;
					this.anInt4583 >>= 0x1;
					this.anInt4585 >>= 0x1;
				}
			}
			this.anInt4581 += (int) (((double) this.aClass21_1.anInt550 + Math.random() * (double) (this.aClass21_1.anInt522 - this.aClass21_1.anInt550)) * (double) arg0);
			if (this.anInt4581 > 63) {
				local197 = this.anInt4581 >> 6;
				this.anInt4581 &= 0x3F;
				for (local232 = 0; local232 < local197; local232++) {
					@Pc(570) int local570;
					@Pc(574) int local574;
					if (this.aClass21_1.aShort5 <= 0 && this.aClass21_1.aShort7 <= 0) {
						local206 = this.anInt4582;
						local215 = this.anInt4583;
						local224 = this.anInt4585;
					} else {
						local241 = this.anInt4586 + (int) (Math.random() * (double) this.anInt4588);
						local241 &= 0x3FFF;
						local341 = Class4_Sub2_Sub26.anIntArray563[local241];
						local394 = Class4_Sub2_Sub26.anIntArray562[local241];
						local415 = (int) (Math.random() * (double) this.anInt4587) + this.anInt4584;
						local415 &= 0x1FFF;
						local570 = Class4_Sub2_Sub26.anIntArray563[local415];
						local574 = Class4_Sub2_Sub26.anIntArray562[local415];
						local206 = local394 * local570 >> 13;
						local215 = (local574 << 1) * -1;
						local224 = local341 * local570 >> 13;
					}
					@Pc(597) float local597 = (float) Math.random();
					@Pc(600) float local600 = (float) Math.random();
					if (local597 + local600 > 1.0F) {
						local600 = 1.0F - local600;
						local597 = 1.0F - local597;
					}
					@Pc(621) float local621 = 1.0F - local600 - local597;
					local415 = (int) (local597 * (float) this.aClass169_1.anInt4262 + (float) this.aClass169_1.anInt4253 * local600 + (float) this.aClass169_1.anInt4256 * local621);
					local570 = (int) (local621 * (float) this.aClass169_1.anInt4257 + local600 * (float) this.aClass169_1.anInt4263 + local597 * (float) this.aClass169_1.anInt4266);
					local574 = (int) ((float) this.aClass169_1.anInt4254 * local597 + (float) this.aClass169_1.anInt4260 * local600 + local621 * (float) this.aClass169_1.anInt4264);
					@Pc(709) int local709 = (int) ((float) this.aClass169_2.anInt4256 * local621 + (float) this.aClass169_2.anInt4262 * local597 + (float) this.aClass169_2.anInt4253 * local600);
					@Pc(731) int local731 = (int) ((float) this.aClass169_2.anInt4263 * local600 + local597 * (float) this.aClass169_2.anInt4266 + (float) this.aClass169_2.anInt4257 * local621);
					@Pc(753) int local753 = (int) ((float) this.aClass169_2.anInt4254 * local597 + local600 * (float) this.aClass169_2.anInt4260 + local621 * (float) this.aClass169_2.anInt4264);
					@Pc(758) int local758 = local415 - local709;
					@Pc(763) int local763 = local570 - local731;
					@Pc(768) int local768 = local574 - local753;
					@Pc(777) int local777 = (int) ((double) local709 + Math.random() * (double) local758);
					@Pc(786) int local786 = (int) ((double) local763 * Math.random() + (double) local731);
					@Pc(795) int local795 = (int) ((double) local768 * Math.random() + (double) local753);
					@Pc(811) int local811 = (int) (Math.random() * (double) (this.aClass21_1.anInt520 - this.aClass21_1.anInt549)) + this.aClass21_1.anInt549;
					@Pc(828) int local828 = this.aClass21_1.anInt525 + (int) ((double) (this.aClass21_1.anInt531 - this.aClass21_1.anInt525) * Math.random());
					@Pc(845) int local845 = (int) (Math.random() * (double) (this.aClass21_1.anInt533 - this.aClass21_1.anInt561)) + this.aClass21_1.anInt561;
					@Pc(909) int local909;
					if (this.aClass21_1.aBoolean47) {
						@Pc(851) double local851 = Math.random();
						local909 = (int) (Math.random() * (double) this.aClass21_1.anInt546 + (double) this.aClass21_1.anInt562) << 24 | (int) ((double) this.aClass21_1.anInt544 + local851 * (double) this.aClass21_1.anInt569) | (int) ((double) this.aClass21_1.anInt570 * local851 + (double) this.aClass21_1.anInt557) << 8 | (int) ((double) this.aClass21_1.anInt564 + (double) this.aClass21_1.anInt541 * local851) << 16;
					} else {
						local909 = (int) ((double) this.aClass21_1.anInt570 * Math.random() + (double) this.aClass21_1.anInt557) << 8 | (int) ((double) this.aClass21_1.anInt541 * Math.random() + (double) this.aClass21_1.anInt564) << 16 | (int) (Math.random() * (double) this.aClass21_1.anInt569 + (double) this.aClass21_1.anInt544) | (int) ((double) this.aClass21_1.anInt562 + Math.random() * (double) this.aClass21_1.anInt546) << 24;
					}
					@Pc(973) int local973 = this.aClass21_1.anInt547;
					if (!arg2.method8104() && !this.aClass21_1.aBoolean48) {
						local973 = -1;
					}
					if (Static505.anInt5822 == Static647.anInt10181) {
						new Class3_Sub3_Sub1_Sub1(this, local777, local786, local795, local206, local215, local224, local811, local828, local909, local845, local973, this.aClass21_1.aBoolean46, this.aClass21_1.aBoolean49);
					} else {
						@Pc(993) Class3_Sub3_Sub1_Sub1 local993 = Static522.aClass3_Sub3_Sub1_Sub1Array1[Static647.anInt10181];
						Static647.anInt10181 = Static647.anInt10181 + 1 & 0x3FF;
						local993.method1703(this, local777, local786, local795, local206, local215, local224, local811, local828, local909, local845, local973, this.aClass21_1.aBoolean46, this.aClass21_1.aBoolean49);
					}
				}
			}
		}
		if (!this.aClass169_1.method3786(this.aClass169_2)) {
			@Pc(1057) Class169 local1057 = this.aClass169_2;
			this.aClass169_2 = this.aClass169_1;
			this.aClass169_1 = local1057;
			this.aClass169_1.anInt4265 = this.aClass169_2.anInt4265;
			this.aClass169_1.anInt4253 = this.aClass235_1.anInt5627;
			this.aClass169_1.anInt4260 = this.aClass235_1.anInt5623;
			this.aClass169_1.anInt4256 = this.aClass235_1.anInt5624;
			this.aClass169_1.anInt4266 = this.aClass235_1.anInt5637;
			this.aClass169_1.anInt4264 = this.aClass235_1.anInt5636;
			this.aClass169_1.anInt4262 = this.aClass235_1.anInt5628;
			this.aClass169_1.anInt4263 = this.aClass235_1.anInt5629;
			this.aClass169_1.anInt4254 = this.aClass235_1.anInt5632;
			this.aClass169_1.anInt4257 = this.aClass235_1.anInt5626;
			this.aClass169_1.anInt4259 = this.aClass169_2.anInt4259;
			this.aClass169_1.anInt4267 = this.aClass169_2.anInt4267;
		}
		this.anInt4576 = 0;
		for (@Pc(1145) Class3_Sub3_Sub1_Sub1 local1145 = (Class3_Sub3_Sub1_Sub1) this.aClass236_4.method4958(); local1145 != null; local1145 = (Class3_Sub3_Sub1_Sub1) this.aClass236_4.method4950()) {
			local1145.method1701(arg3, arg0);
			this.anInt4576++;
		}
		Static516.anInt8026 += this.anInt4576;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
	public void method4137() {
		this.aClass169_1.anInt4254 = this.aClass235_1.anInt5632;
		this.aClass169_1.anInt4256 = this.aClass235_1.anInt5624;
		this.aClass169_1.anInt4262 = this.aClass235_1.anInt5628;
		this.aClass169_1.anInt4263 = this.aClass235_1.anInt5629;
		this.aClass169_1.anInt4260 = this.aClass235_1.anInt5623;
		this.aClass169_1.anInt4257 = this.aClass235_1.anInt5626;
		this.aClass169_1.anInt4253 = this.aClass235_1.anInt5627;
		this.aClass169_1.anInt4266 = this.aClass235_1.anInt5637;
		this.aClass169_1.anInt4264 = this.aClass235_1.anInt5636;
		if (this.aClass169_1.anInt4262 == this.aClass169_1.anInt4253 && this.aClass169_1.anInt4256 == this.aClass169_1.anInt4253 && this.aClass169_1.anInt4263 == this.aClass169_1.anInt4266 && this.aClass169_1.anInt4257 == this.aClass169_1.anInt4263 && this.aClass169_1.anInt4260 == this.aClass169_1.anInt4254 && this.aClass169_1.anInt4260 == this.aClass169_1.anInt4264) {
			this.aBoolean345 = true;
		} else if (this.aBoolean345) {
			this.aClass169_2.anInt4253 = this.aClass169_1.anInt4253;
			this.aClass169_2.anInt4263 = this.aClass169_1.anInt4263;
			this.aClass169_2.anInt4254 = this.aClass169_1.anInt4254;
			this.aClass169_2.anInt4260 = this.aClass169_1.anInt4260;
			this.aClass169_2.anInt4262 = this.aClass169_1.anInt4262;
			this.aClass169_2.anInt4256 = this.aClass169_1.anInt4256;
			this.aClass169_2.anInt4257 = this.aClass169_1.anInt4257;
			this.aBoolean345 = false;
			this.aClass169_2.anInt4264 = this.aClass169_1.anInt4264;
			this.aClass169_2.anInt4266 = this.aClass169_1.anInt4266;
		}
	}
}
