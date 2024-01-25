import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class60_Sub7 extends Class60 {

	@OriginalMember(owner = "client!md", name = "E", descriptor = "I")
	public int anInt6205;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "I")
	private int anInt6213;

	@OriginalMember(owner = "client!md", name = "D", descriptor = "I")
	private int anInt6214;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "I")
	private int anInt6215;

	@OriginalMember(owner = "client!md", name = "x", descriptor = "I")
	private int anInt6216;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "I")
	private int anInt6217;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "I")
	private int anInt6218;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "I")
	private int anInt6219;

	@OriginalMember(owner = "client!md", name = "B", descriptor = "Z")
	public boolean aBoolean459 = false;

	@OriginalMember(owner = "client!md", name = "G", descriptor = "I")
	private int anInt6207 = 0;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "Lclient!tm;")
	public Class345 aClass345_1 = new Class345();

	@OriginalMember(owner = "client!md", name = "o", descriptor = "Lclient!tm;")
	private Class345 aClass345_2 = new Class345();

	@OriginalMember(owner = "client!md", name = "j", descriptor = "Z")
	private boolean aBoolean460 = false;

	@OriginalMember(owner = "client!md", name = "t", descriptor = "Lclient!it;")
	public final Class60_Sub4 aClass60_Sub4_5;

	@OriginalMember(owner = "client!md", name = "C", descriptor = "J")
	private final long aLong216;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "Lclient!kw;")
	public final Class216 aClass216_2;

	@OriginalMember(owner = "client!md", name = "F", descriptor = "Lclient!pf;")
	public Class280 aClass280_1;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "Lclient!vs;")
	public final Class385 aClass385_5;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!ha;Lclient!kw;Lclient!it;J)V")
	public Class60_Sub7(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) Class60_Sub4 arg2, @OriginalArg(3) long arg3) {
		this.aClass60_Sub4_5 = arg2;
		this.aLong216 = arg3;
		this.aClass216_2 = arg1;
		this.aClass280_1 = this.aClass216_2.method5137();
		if (!arg0.method6644() && this.aClass280_1.anInt7856 != -1) {
			this.aClass280_1 = Static303.method169(this.aClass280_1.anInt7856);
		}
		this.aClass385_5 = new Class385();
		this.anInt6207 = (int) ((double) this.anInt6207 + Math.random() * 64.0D);
		this.method5567();
		this.aClass345_2.anInt9434 = this.aClass345_1.anInt9434;
		this.aClass345_2.anInt9431 = this.aClass345_1.anInt9431;
		this.aClass345_2.anInt9424 = this.aClass345_1.anInt9424;
		this.aClass345_2.anInt9430 = this.aClass345_1.anInt9430;
		this.aClass345_2.anInt9428 = this.aClass345_1.anInt9428;
		this.aClass345_2.anInt9433 = this.aClass345_1.anInt9433;
		this.aClass345_2.anInt9436 = this.aClass345_1.anInt9436;
		this.aClass345_2.anInt9429 = this.aClass345_1.anInt9429;
		this.aClass345_2.anInt9426 = this.aClass345_1.anInt9426;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
	public void method5567() {
		this.aClass345_1.anInt9430 = this.aClass216_2.anInt5667;
		this.aClass345_1.anInt9434 = this.aClass216_2.anInt5666;
		this.aClass345_1.anInt9433 = this.aClass216_2.anInt5657;
		this.aClass345_1.anInt9426 = this.aClass216_2.anInt5654;
		this.aClass345_1.anInt9431 = this.aClass216_2.anInt5655;
		this.aClass345_1.anInt9424 = this.aClass216_2.anInt5653;
		this.aClass345_1.anInt9429 = this.aClass216_2.anInt5656;
		this.aClass345_1.anInt9428 = this.aClass216_2.anInt5663;
		this.aClass345_1.anInt9436 = this.aClass216_2.anInt5665;
		if (this.aClass345_1.anInt9424 == this.aClass345_1.anInt9428 && this.aClass345_1.anInt9436 == this.aClass345_1.anInt9428 && this.aClass345_1.anInt9434 == this.aClass345_1.anInt9433 && this.aClass345_1.anInt9426 == this.aClass345_1.anInt9434 && this.aClass345_1.anInt9431 == this.aClass345_1.anInt9430 && this.aClass345_1.anInt9429 == this.aClass345_1.anInt9430) {
			this.aBoolean460 = true;
		} else if (this.aBoolean460) {
			this.aClass345_2.anInt9426 = this.aClass345_1.anInt9426;
			this.aClass345_2.anInt9424 = this.aClass345_1.anInt9424;
			this.aClass345_2.anInt9436 = this.aClass345_1.anInt9436;
			this.aClass345_2.anInt9430 = this.aClass345_1.anInt9430;
			this.aClass345_2.anInt9433 = this.aClass345_1.anInt9433;
			this.aClass345_2.anInt9429 = this.aClass345_1.anInt9429;
			this.aClass345_2.anInt9428 = this.aClass345_1.anInt9428;
			this.aClass345_2.anInt9434 = this.aClass345_1.anInt9434;
			this.aClass345_2.anInt9431 = this.aClass345_1.anInt9431;
			this.aBoolean460 = false;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!ha;IJZZ)V")
	public void method5569(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) boolean arg3) {
		@Pc(58) int local58;
		if (this.aBoolean459) {
			arg3 = false;
		} else if (this.aClass280_1.anInt7826 > Static470.anInt8040) {
			arg3 = false;
		} else if (Static193.anIntArray600[Static470.anInt8040] < Static518.anInt8550) {
			arg3 = false;
		} else if (this.aBoolean460) {
			arg3 = false;
		} else if (this.aClass280_1.anInt7837 != -1) {
			local58 = (int) (arg2 - this.aLong216);
			if (this.aClass280_1.aBoolean594 || local58 <= this.aClass280_1.anInt7837) {
				local58 %= this.aClass280_1.anInt7837;
			} else {
				arg3 = false;
			}
			if (!this.aClass280_1.aBoolean591 && this.aClass280_1.anInt7840 > local58) {
				arg3 = false;
			}
			if (this.aClass280_1.aBoolean591 && local58 >= this.aClass280_1.anInt7840) {
				arg3 = false;
			}
		}
		if (arg3) {
			Static21.anInt285++;
			local58 = (this.aClass345_1.anInt9424 + this.aClass345_1.anInt9428 + this.aClass345_1.anInt9436) / 3;
			@Pc(158) int local158 = (this.aClass345_1.anInt9433 + this.aClass345_1.anInt9434 + this.aClass345_1.anInt9426) / 3;
			@Pc(173) int local173 = (this.aClass345_1.anInt9429 + this.aClass345_1.anInt9431 + this.aClass345_1.anInt9430) / 3;
			@Pc(221) int local221;
			@Pc(230) int local230;
			@Pc(239) int local239;
			@Pc(247) int local247;
			@Pc(256) int local256;
			@Pc(264) int local264;
			@Pc(375) int local375;
			@Pc(427) int local427;
			@Pc(448) int local448;
			if (local58 != this.aClass345_1.anInt9437 || local158 != this.aClass345_1.anInt9422 || this.aClass345_1.anInt9423 != local173) {
				this.aClass345_1.anInt9423 = local173;
				this.aClass345_1.anInt9422 = local158;
				this.aClass345_1.anInt9437 = local58;
				local221 = this.aClass345_1.anInt9428 - this.aClass345_1.anInt9424;
				local230 = this.aClass345_1.anInt9434 - this.aClass345_1.anInt9433;
				local239 = this.aClass345_1.anInt9430 - this.aClass345_1.anInt9431;
				local247 = this.aClass345_1.anInt9436 - this.aClass345_1.anInt9424;
				local256 = this.aClass345_1.anInt9426 - this.aClass345_1.anInt9433;
				local264 = this.aClass345_1.anInt9429 - this.aClass345_1.anInt9431;
				this.anInt6219 = local264 * local230 - local256 * local239;
				this.anInt6213 = local256 * local221 - local230 * local247;
				this.anInt6216 = local247 * local239 - local264 * local221;
				while (true) {
					if (this.anInt6219 <= 32767 && this.anInt6216 <= 32767 && this.anInt6213 <= 32767 && this.anInt6219 >= -32767 && this.anInt6216 >= -32767 && this.anInt6213 >= -32767) {
						local375 = (int) Math.sqrt((double) (this.anInt6213 * this.anInt6213 + this.anInt6219 * this.anInt6219 + this.anInt6216 * this.anInt6216));
						if (local375 <= 0) {
							local375 = 1;
						}
						this.anInt6219 = this.anInt6219 * 32767 / local375;
						this.anInt6216 = this.anInt6216 * 32767 / local375;
						this.anInt6213 = this.anInt6213 * 32767 / local375;
						if (this.aClass280_1.aShort87 > 0 || this.aClass280_1.aShort89 > 0) {
							local427 = (int) (Math.atan2((double) this.anInt6213, (double) this.anInt6219) * 2607.5945876176133D);
							local448 = (int) (Math.atan2((double) this.anInt6216, Math.sqrt((double) (this.anInt6213 * this.anInt6213 + this.anInt6219 * this.anInt6219))) * 2607.5945876176133D);
							this.anInt6215 = this.aClass280_1.aShort87 - this.aClass280_1.aShort86;
							this.anInt6214 = local427 + this.aClass280_1.aShort86 - (this.anInt6215 >> 1);
							this.anInt6217 = this.aClass280_1.aShort89 - this.aClass280_1.aShort88;
							this.anInt6218 = local448 + this.aClass280_1.aShort88 - (this.anInt6217 >> 1);
						}
						break;
					}
					this.anInt6213 >>= 0x1;
					this.anInt6216 >>= 0x1;
					this.anInt6219 >>= 0x1;
				}
			}
			this.anInt6207 += (int) (((double) this.aClass280_1.anInt7835 + Math.random() * (double) (this.aClass280_1.anInt7857 - this.aClass280_1.anInt7835)) * (double) arg1);
			if (this.anInt6207 > 63) {
				local221 = this.anInt6207 >> 6;
				this.anInt6207 &= 0x3F;
				for (local256 = 0; local256 < local221; local256++) {
					@Pc(596) int local596;
					@Pc(600) int local600;
					if (this.aClass280_1.aShort87 <= 0 && this.aClass280_1.aShort89 <= 0) {
						local239 = this.anInt6216;
						local247 = this.anInt6213;
						local230 = this.anInt6219;
					} else {
						local264 = (int) (Math.random() * (double) this.anInt6215) + this.anInt6214;
						local264 &= 0x3FFF;
						local375 = Class6_Sub2_Sub12.anIntArray293[local264];
						local427 = Class6_Sub2_Sub12.anIntArray292[local264];
						local448 = (int) (Math.random() * (double) this.anInt6217) + this.anInt6218;
						local448 &= 0x1FFF;
						local596 = Class6_Sub2_Sub12.anIntArray293[local448];
						local600 = Class6_Sub2_Sub12.anIntArray292[local448];
						local239 = (local600 << 1) * -1;
						local230 = local427 * local596 >> 13;
						local247 = local375 * local596 >> 13;
					}
					@Pc(634) float local634 = (float) Math.random();
					@Pc(637) float local637 = (float) Math.random();
					if (local637 + local634 > 1.0F) {
						local637 = 1.0F - local637;
						local634 = 1.0F - local634;
					}
					@Pc(658) float local658 = 1.0F - local634 - local637;
					local448 = (int) ((float) this.aClass345_1.anInt9436 * local658 + local637 * (float) this.aClass345_1.anInt9428 + local634 * (float) this.aClass345_1.anInt9424);
					local596 = (int) ((float) this.aClass345_1.anInt9426 * local658 + local634 * (float) this.aClass345_1.anInt9433 + local637 * (float) this.aClass345_1.anInt9434);
					local600 = (int) ((float) this.aClass345_1.anInt9430 * local637 + local634 * (float) this.aClass345_1.anInt9431 + (float) this.aClass345_1.anInt9429 * local658);
					@Pc(746) int local746 = (int) ((float) this.aClass345_2.anInt9428 * local637 + local634 * (float) this.aClass345_2.anInt9424 + local658 * (float) this.aClass345_2.anInt9436);
					@Pc(768) int local768 = (int) (local634 * (float) this.aClass345_2.anInt9433 + local637 * (float) this.aClass345_2.anInt9434 + (float) this.aClass345_2.anInt9426 * local658);
					@Pc(790) int local790 = (int) ((float) this.aClass345_2.anInt9429 * local658 + (float) this.aClass345_2.anInt9431 * local634 + local637 * (float) this.aClass345_2.anInt9430);
					@Pc(795) int local795 = local448 - local746;
					@Pc(800) int local800 = local596 - local768;
					@Pc(805) int local805 = local600 - local790;
					@Pc(814) int local814 = (int) ((double) local746 + Math.random() * (double) local795);
					@Pc(823) int local823 = (int) ((double) local800 * Math.random() + (double) local768);
					@Pc(832) int local832 = (int) ((double) local790 + (double) local805 * Math.random());
					@Pc(849) int local849 = this.aClass280_1.anInt7824 + (int) (Math.random() * (double) (this.aClass280_1.anInt7839 - this.aClass280_1.anInt7824));
					@Pc(866) int local866 = this.aClass280_1.anInt7866 + (int) ((double) (this.aClass280_1.anInt7818 - this.aClass280_1.anInt7866) * Math.random());
					@Pc(883) int local883 = this.aClass280_1.anInt7860 + (int) ((double) (this.aClass280_1.anInt7853 - this.aClass280_1.anInt7860) * Math.random());
					@Pc(945) int local945;
					if (this.aClass280_1.aBoolean592) {
						@Pc(949) double local949 = Math.random();
						local945 = (int) ((double) this.aClass280_1.anInt7847 + (double) this.aClass280_1.anInt7864 * local949) << 8 | (int) ((double) this.aClass280_1.anInt7854 + local949 * (double) this.aClass280_1.anInt7841) << 16 | (int) ((double) this.aClass280_1.anInt7832 + local949 * (double) this.aClass280_1.anInt7822) | (int) ((double) this.aClass280_1.anInt7830 + Math.random() * (double) this.aClass280_1.anInt7851) << 24;
					} else {
						local945 = (int) ((double) this.aClass280_1.anInt7830 + (double) this.aClass280_1.anInt7851 * Math.random()) << 24 | (int) (Math.random() * (double) this.aClass280_1.anInt7841 + (double) this.aClass280_1.anInt7854) << 16 | (int) ((double) this.aClass280_1.anInt7847 + (double) this.aClass280_1.anInt7864 * Math.random()) << 8 | (int) ((double) this.aClass280_1.anInt7832 + (double) this.aClass280_1.anInt7822 * Math.random());
					}
					@Pc(1011) int local1011 = this.aClass280_1.anInt7852;
					if (!arg0.method6644() && !this.aClass280_1.aBoolean597) {
						local1011 = -1;
					}
					if (Static434.anInt7432 == Static619.anInt9779) {
						new Class60_Sub2_Sub1_Sub1(this, local814, local823, local832, local230, local239, local247, local849, local866, local945, local883, local1011, this.aClass280_1.aBoolean595, this.aClass280_1.aBoolean590);
					} else {
						@Pc(1057) Class60_Sub2_Sub1_Sub1 local1057 = Static155.aClass60_Sub2_Sub1_Sub1Array1[Static434.anInt7432];
						Static434.anInt7432 = Static434.anInt7432 + 1 & 0x3FF;
						local1057.method5109(this, local814, local823, local832, local230, local239, local247, local849, local866, local945, local883, local1011, this.aClass280_1.aBoolean595, this.aClass280_1.aBoolean590);
					}
				}
			}
		}
		if (!this.aClass345_1.method8226(this.aClass345_2)) {
			@Pc(1099) Class345 local1099 = this.aClass345_2;
			this.aClass345_2 = this.aClass345_1;
			this.aClass345_1 = local1099;
			this.aClass345_1.anInt9431 = this.aClass216_2.anInt5655;
			this.aClass345_1.anInt9422 = this.aClass345_2.anInt9422;
			this.aClass345_1.anInt9426 = this.aClass216_2.anInt5654;
			this.aClass345_1.anInt9429 = this.aClass216_2.anInt5656;
			this.aClass345_1.anInt9430 = this.aClass216_2.anInt5667;
			this.aClass345_1.anInt9437 = this.aClass345_2.anInt9437;
			this.aClass345_1.anInt9423 = this.aClass345_2.anInt9423;
			this.aClass345_1.anInt9434 = this.aClass216_2.anInt5666;
			this.aClass345_1.anInt9424 = this.aClass216_2.anInt5653;
			this.aClass345_1.anInt9436 = this.aClass216_2.anInt5665;
			this.aClass345_1.anInt9433 = this.aClass216_2.anInt5657;
			this.aClass345_1.anInt9428 = this.aClass216_2.anInt5663;
		}
		this.anInt6205 = 0;
		for (@Pc(1187) Class60_Sub2_Sub1_Sub1 local1187 = (Class60_Sub2_Sub1_Sub1) this.aClass385_5.method8778(); local1187 != null; local1187 = (Class60_Sub2_Sub1_Sub1) this.aClass385_5.method8773()) {
			local1187.method5112(arg2, arg1);
			this.anInt6205++;
		}
		Static689.anInt10537 += this.anInt6205;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!ha;IJ)V")
	public void method5570(@OriginalArg(0) Class75 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(15) Class60_Sub2_Sub1_Sub1 local15 = (Class60_Sub2_Sub1_Sub1) this.aClass385_5.method8778(); local15 != null; local15 = (Class60_Sub2_Sub1_Sub1) this.aClass385_5.method8773()) {
			local15.method5108(arg0, arg1);
		}
	}
}
