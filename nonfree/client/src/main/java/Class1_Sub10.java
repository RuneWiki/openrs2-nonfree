import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
	public int anInt10087;

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
	private int anInt10091;

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
	private int anInt10092;

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
	private int anInt10093;

	@OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
	private int anInt10094;

	@OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
	private int anInt10095;

	@OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
	private int anInt10096;

	@OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
	private int anInt10097;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
	private int anInt10085 = 0;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "Z")
	public boolean aBoolean713 = false;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "Lclient!vb;")
	public Class336 aClass336_1 = new Class336();

	@OriginalMember(owner = "client!wh", name = "C", descriptor = "Lclient!vb;")
	private Class336 aClass336_2 = new Class336();

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "Z")
	private boolean aBoolean715 = false;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "J")
	private final long aLong264;

	@OriginalMember(owner = "client!wh", name = "B", descriptor = "Lclient!nba;")
	public final Class227 aClass227_2;

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "Lclient!au;")
	public final Class1_Sub2 aClass1_Sub2_8;

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "Lclient!kea;")
	public Class187 aClass187_1;

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "Lclient!hf;")
	public final Class136 aClass136_9;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!r;Lclient!nba;Lclient!au;J)V")
	public Class1_Sub10(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class227 arg1, @OriginalArg(2) Class1_Sub2 arg2, @OriginalArg(3) long arg3) {
		this.aLong264 = arg3;
		this.aClass227_2 = arg1;
		this.aClass1_Sub2_8 = arg2;
		this.aClass187_1 = this.aClass227_2.method5529();
		if (!arg0.method5037() && this.aClass187_1.anInt5087 != -1) {
			this.aClass187_1 = Static35.method465(this.aClass187_1.anInt5087);
		}
		this.aClass136_9 = new Class136();
		this.anInt10085 = (int) ((double) this.anInt10085 + Math.random() * 64.0D);
		this.method8260();
		this.aClass336_2.anInt9715 = this.aClass336_1.anInt9715;
		this.aClass336_2.anInt9729 = this.aClass336_1.anInt9729;
		this.aClass336_2.anInt9723 = this.aClass336_1.anInt9723;
		this.aClass336_2.anInt9721 = this.aClass336_1.anInt9721;
		this.aClass336_2.anInt9716 = this.aClass336_1.anInt9716;
		this.aClass336_2.anInt9724 = this.aClass336_1.anInt9724;
		this.aClass336_2.anInt9714 = this.aClass336_1.anInt9714;
		this.aClass336_2.anInt9719 = this.aClass336_1.anInt9719;
		this.aClass336_2.anInt9722 = this.aClass336_1.anInt9722;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(JLclient!r;I)V")
	public void method8258(@OriginalArg(0) long arg0, @OriginalArg(1) Class44 arg1) {
		for (@Pc(11) Class1_Sub1_Sub1_Sub1 local11 = (Class1_Sub1_Sub1_Sub1) this.aClass136_9.method3288(); local11 != null; local11 = (Class1_Sub1_Sub1_Sub1) this.aClass136_9.method3286()) {
			local11.method59(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	public void method8260() {
		this.aClass336_1.anInt9724 = this.aClass227_2.anInt6585;
		this.aClass336_1.anInt9714 = this.aClass227_2.anInt6580;
		this.aClass336_1.anInt9729 = this.aClass227_2.anInt6577;
		this.aClass336_1.anInt9719 = this.aClass227_2.anInt6592;
		this.aClass336_1.anInt9716 = this.aClass227_2.anInt6586;
		this.aClass336_1.anInt9721 = this.aClass227_2.anInt6590;
		this.aClass336_1.anInt9722 = this.aClass227_2.anInt6588;
		this.aClass336_1.anInt9723 = this.aClass227_2.anInt6584;
		this.aClass336_1.anInt9715 = this.aClass227_2.anInt6589;
		if (this.aClass336_1.anInt9721 == this.aClass336_1.anInt9722 && this.aClass336_1.anInt9714 == this.aClass336_1.anInt9721 && this.aClass336_1.anInt9716 == this.aClass336_1.anInt9719 && this.aClass336_1.anInt9715 == this.aClass336_1.anInt9719 && this.aClass336_1.anInt9723 == this.aClass336_1.anInt9724 && this.aClass336_1.anInt9729 == this.aClass336_1.anInt9724) {
			this.aBoolean715 = true;
		} else if (this.aBoolean715) {
			this.aClass336_2.anInt9723 = this.aClass336_1.anInt9723;
			this.aClass336_2.anInt9724 = this.aClass336_1.anInt9724;
			this.aClass336_2.anInt9729 = this.aClass336_1.anInt9729;
			this.aClass336_2.anInt9716 = this.aClass336_1.anInt9716;
			this.aClass336_2.anInt9714 = this.aClass336_1.anInt9714;
			this.aClass336_2.anInt9719 = this.aClass336_1.anInt9719;
			this.aClass336_2.anInt9722 = this.aClass336_1.anInt9722;
			this.aClass336_2.anInt9721 = this.aClass336_1.anInt9721;
			this.aClass336_2.anInt9715 = this.aClass336_1.anInt9715;
			this.aBoolean715 = false;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IJZLclient!r;B)V")
	public void method8261(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class44 arg3) {
		@Pc(45) int local45;
		if (this.aBoolean713) {
			arg2 = false;
		} else if (this.aClass187_1.anInt5092 > Static224.anInt4124) {
			arg2 = false;
		} else if (Static550.anIntArray520[Static224.anInt4124] < Static165.anInt3395) {
			arg2 = false;
		} else if (this.aBoolean715) {
			arg2 = false;
		} else if (this.aClass187_1.anInt5101 != -1) {
			local45 = (int) (arg1 - this.aLong264);
			if (this.aClass187_1.aBoolean376 || this.aClass187_1.anInt5101 >= local45) {
				local45 %= this.aClass187_1.anInt5101;
			} else {
				arg2 = false;
			}
			if (!this.aClass187_1.aBoolean369 && local45 < this.aClass187_1.anInt5114) {
				arg2 = false;
			}
			if (this.aClass187_1.aBoolean369 && local45 >= this.aClass187_1.anInt5114) {
				arg2 = false;
			}
		}
		if (arg2) {
			Static314.anInt6224++;
			local45 = (this.aClass336_1.anInt9721 + this.aClass336_1.anInt9722 + this.aClass336_1.anInt9714) / 3;
			@Pc(135) int local135 = (this.aClass336_1.anInt9716 + this.aClass336_1.anInt9719 + this.aClass336_1.anInt9715) / 3;
			@Pc(149) int local149 = (this.aClass336_1.anInt9729 + this.aClass336_1.anInt9724 + this.aClass336_1.anInt9723) / 3;
			@Pc(189) int local189;
			@Pc(198) int local198;
			@Pc(207) int local207;
			@Pc(216) int local216;
			@Pc(225) int local225;
			@Pc(234) int local234;
			@Pc(338) int local338;
			@Pc(388) int local388;
			@Pc(410) int local410;
			if (local45 != this.aClass336_1.anInt9726 || local135 != this.aClass336_1.anInt9718 || local149 != this.aClass336_1.anInt9728) {
				this.aClass336_1.anInt9728 = local149;
				this.aClass336_1.anInt9718 = local135;
				this.aClass336_1.anInt9726 = local45;
				local189 = this.aClass336_1.anInt9721 - this.aClass336_1.anInt9722;
				local198 = this.aClass336_1.anInt9719 - this.aClass336_1.anInt9716;
				local207 = this.aClass336_1.anInt9724 - this.aClass336_1.anInt9723;
				local216 = this.aClass336_1.anInt9714 - this.aClass336_1.anInt9722;
				local225 = this.aClass336_1.anInt9715 - this.aClass336_1.anInt9716;
				local234 = this.aClass336_1.anInt9729 - this.aClass336_1.anInt9723;
				this.anInt10096 = local234 * local198 - local225 * local207;
				this.anInt10095 = local225 * local189 - local216 * local198;
				this.anInt10094 = local216 * local207 - local189 * local234;
				while (true) {
					if (this.anInt10096 <= 32767 && this.anInt10094 <= 32767 && this.anInt10095 <= 32767 && this.anInt10096 >= -32767 && this.anInt10094 >= -32767 && this.anInt10095 >= -32767) {
						local338 = (int) Math.sqrt((double) (this.anInt10096 * this.anInt10096 + this.anInt10094 * this.anInt10094 + this.anInt10095 * this.anInt10095));
						if (local338 <= 0) {
							local338 = 1;
						}
						this.anInt10094 = this.anInt10094 * 32767 / local338;
						this.anInt10095 = this.anInt10095 * 32767 / local338;
						this.anInt10096 = this.anInt10096 * 32767 / local338;
						if (this.aClass187_1.aShort63 > 0 || this.aClass187_1.aShort60 > 0) {
							local388 = (int) (Math.atan2((double) this.anInt10095, (double) this.anInt10096) * 2607.5945876176133D);
							local410 = (int) (Math.atan2((double) this.anInt10094, Math.sqrt((double) (this.anInt10096 * this.anInt10096 + this.anInt10095 * this.anInt10095))) * 2607.5945876176133D);
							this.anInt10091 = this.aClass187_1.aShort63 - this.aClass187_1.aShort62;
							this.anInt10097 = local388 + this.aClass187_1.aShort62 - (this.anInt10091 >> 1);
							this.anInt10093 = this.aClass187_1.aShort60 - this.aClass187_1.aShort61;
							this.anInt10092 = this.aClass187_1.aShort61 + local410 - (this.anInt10093 >> 1);
						}
						break;
					}
					this.anInt10096 >>= 0x1;
					this.anInt10095 >>= 0x1;
					this.anInt10094 >>= 0x1;
				}
			}
			this.anInt10085 += (int) ((double) arg0 * (Math.random() * (double) (this.aClass187_1.anInt5120 - this.aClass187_1.anInt5094) + (double) this.aClass187_1.anInt5094));
			if (this.anInt10085 > 63) {
				local189 = this.anInt10085 >> 6;
				this.anInt10085 &= 0x3F;
				for (local225 = 0; local225 < local189; local225++) {
					@Pc(567) int local567;
					@Pc(571) int local571;
					if (this.aClass187_1.aShort63 <= 0 && this.aClass187_1.aShort60 <= 0) {
						local198 = this.anInt10096;
						local207 = this.anInt10094;
						local216 = this.anInt10095;
					} else {
						local234 = this.anInt10097 + (int) (Math.random() * (double) this.anInt10091);
						local234 &= 0x3FFF;
						local338 = Class4_Sub27.anIntArray296[local234];
						local388 = Class4_Sub27.anIntArray297[local234];
						local410 = this.anInt10092 + (int) ((double) this.anInt10093 * Math.random());
						local410 &= 0x1FFF;
						local567 = Class4_Sub27.anIntArray296[local410];
						local571 = Class4_Sub27.anIntArray297[local410];
						local207 = (local571 << 1) * -1;
						local198 = local388 * local567 >> 13;
						local216 = local567 * local338 >> 13;
					}
					@Pc(594) float local594 = (float) Math.random();
					@Pc(597) float local597 = (float) Math.random();
					if (local594 + local597 > 1.0F) {
						local594 = 1.0F - local594;
						local597 = 1.0F - local597;
					}
					@Pc(619) float local619 = 1.0F - local597 - local594;
					local410 = (int) (local594 * (float) this.aClass336_1.anInt9722 + local597 * (float) this.aClass336_1.anInt9721 + local619 * (float) this.aClass336_1.anInt9714);
					local567 = (int) ((float) this.aClass336_1.anInt9715 * local619 + (float) this.aClass336_1.anInt9719 * local597 + local594 * (float) this.aClass336_1.anInt9716);
					local571 = (int) ((float) this.aClass336_1.anInt9729 * local619 + local597 * (float) this.aClass336_1.anInt9724 + local594 * (float) this.aClass336_1.anInt9723);
					@Pc(707) int local707 = (int) (local597 * (float) this.aClass336_2.anInt9721 + (float) this.aClass336_2.anInt9722 * local594 + (float) this.aClass336_2.anInt9714 * local619);
					@Pc(729) int local729 = (int) ((float) this.aClass336_2.anInt9715 * local619 + (float) this.aClass336_2.anInt9716 * local594 + local597 * (float) this.aClass336_2.anInt9719);
					@Pc(751) int local751 = (int) ((float) this.aClass336_2.anInt9729 * local619 + (float) this.aClass336_2.anInt9723 * local594 + local597 * (float) this.aClass336_2.anInt9724);
					@Pc(755) int local755 = local410 - local707;
					@Pc(760) int local760 = local567 - local729;
					@Pc(765) int local765 = local571 - local751;
					@Pc(774) int local774 = (int) (Math.random() * (double) local755 + (double) local707);
					@Pc(783) int local783 = (int) (Math.random() * (double) local760 + (double) local729);
					@Pc(792) int local792 = (int) ((double) local751 + (double) local765 * Math.random());
					@Pc(808) int local808 = this.aClass187_1.anInt5099 + (int) ((double) (this.aClass187_1.anInt5104 - this.aClass187_1.anInt5099) * Math.random());
					@Pc(825) int local825 = this.aClass187_1.anInt5081 + (int) (Math.random() * (double) (this.aClass187_1.anInt5127 - this.aClass187_1.anInt5081));
					@Pc(842) int local842 = (int) ((double) (this.aClass187_1.anInt5096 - this.aClass187_1.anInt5083) * Math.random()) + this.aClass187_1.anInt5083;
					@Pc(906) int local906;
					if (this.aClass187_1.aBoolean372) {
						@Pc(848) double local848 = Math.random();
						local906 = (int) (Math.random() * (double) this.aClass187_1.anInt5102 + (double) this.aClass187_1.anInt5124) << 24 | (int) ((double) this.aClass187_1.anInt5105 * local848 + (double) this.aClass187_1.anInt5126) | (int) ((double) this.aClass187_1.anInt5107 + local848 * (double) this.aClass187_1.anInt5082) << 16 | (int) ((double) this.aClass187_1.anInt5090 + (double) this.aClass187_1.anInt5118 * local848) << 8;
					} else {
						local906 = (int) ((double) this.aClass187_1.anInt5105 * Math.random() + (double) this.aClass187_1.anInt5126) | (int) ((double) this.aClass187_1.anInt5107 + (double) this.aClass187_1.anInt5082 * Math.random()) << 16 | (int) ((double) this.aClass187_1.anInt5090 + (double) this.aClass187_1.anInt5118 * Math.random()) << 8 | (int) ((double) this.aClass187_1.anInt5124 + Math.random() * (double) this.aClass187_1.anInt5102) << 24;
					}
					@Pc(970) int local970 = this.aClass187_1.anInt5078;
					if (!arg3.method5037() && !this.aClass187_1.aBoolean371) {
						local970 = -1;
					}
					if (Static15.anInt242 == Static507.anInt9086) {
						new Class1_Sub1_Sub1_Sub1(this, local774, local783, local792, local198, local207, local216, local808, local825, local906, local842, local970, this.aClass187_1.aBoolean374, this.aClass187_1.aBoolean375);
					} else {
						@Pc(990) Class1_Sub1_Sub1_Sub1 local990 = Static55.aClass1_Sub1_Sub1_Sub1Array7[Static15.anInt242];
						Static15.anInt242 = Static15.anInt242 + 1 & 0x3FF;
						local990.method60(this, local774, local783, local792, local198, local207, local216, local808, local825, local906, local842, local970, this.aClass187_1.aBoolean374, this.aClass187_1.aBoolean375);
					}
				}
			}
		}
		if (!this.aClass336_1.method7961(this.aClass336_2)) {
			@Pc(1058) Class336 local1058 = this.aClass336_2;
			this.aClass336_2 = this.aClass336_1;
			this.aClass336_1 = local1058;
			this.aClass336_1.anInt9724 = this.aClass227_2.anInt6585;
			this.aClass336_1.anInt9714 = this.aClass227_2.anInt6580;
			this.aClass336_1.anInt9723 = this.aClass227_2.anInt6584;
			this.aClass336_1.anInt9722 = this.aClass227_2.anInt6588;
			this.aClass336_1.anInt9715 = this.aClass227_2.anInt6589;
			this.aClass336_1.anInt9716 = this.aClass227_2.anInt6586;
			this.aClass336_1.anInt9721 = this.aClass227_2.anInt6590;
			this.aClass336_1.anInt9719 = this.aClass227_2.anInt6592;
			this.aClass336_1.anInt9729 = this.aClass227_2.anInt6577;
		}
		this.anInt10087 = 0;
		for (@Pc(1136) Class1_Sub1_Sub1_Sub1 local1136 = (Class1_Sub1_Sub1_Sub1) this.aClass136_9.method3288(); local1136 != null; local1136 = (Class1_Sub1_Sub1_Sub1) this.aClass136_9.method3286()) {
			local1136.method57(arg1, arg0);
			this.anInt10087++;
		}
		Static542.anInt9640 += this.anInt10087;
	}
}
