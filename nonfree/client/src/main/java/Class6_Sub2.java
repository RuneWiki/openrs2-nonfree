import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	private int anInt100;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "I")
	private int anInt101;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "I")
	private int anInt102;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "I")
	public int anInt104;

	@OriginalMember(owner = "client!af", name = "r", descriptor = "I")
	private int anInt105;

	@OriginalMember(owner = "client!af", name = "s", descriptor = "I")
	private int anInt106;

	@OriginalMember(owner = "client!af", name = "w", descriptor = "I")
	private int anInt109;

	@OriginalMember(owner = "client!af", name = "y", descriptor = "I")
	private int anInt110;

	@OriginalMember(owner = "client!af", name = "z", descriptor = "I")
	private int anInt111;

	@OriginalMember(owner = "client!af", name = "B", descriptor = "I")
	private int anInt112;

	@OriginalMember(owner = "client!af", name = "C", descriptor = "I")
	private int anInt113;

	@OriginalMember(owner = "client!af", name = "H", descriptor = "I")
	private int anInt117;

	@OriginalMember(owner = "client!af", name = "I", descriptor = "I")
	private int anInt118;

	@OriginalMember(owner = "client!af", name = "J", descriptor = "I")
	public int anInt119;

	@OriginalMember(owner = "client!af", name = "L", descriptor = "I")
	private int anInt120;

	@OriginalMember(owner = "client!af", name = "M", descriptor = "I")
	private int anInt121;

	@OriginalMember(owner = "client!af", name = "N", descriptor = "I")
	public int anInt122;

	@OriginalMember(owner = "client!af", name = "P", descriptor = "I")
	private int anInt124;

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
	public int anInt125;

	@OriginalMember(owner = "client!af", name = "R", descriptor = "I")
	private int anInt126;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "Z")
	public boolean aBoolean5 = false;

	@OriginalMember(owner = "client!af", name = "v", descriptor = "I")
	private int anInt108 = 0;

	@OriginalMember(owner = "client!af", name = "K", descriptor = "Z")
	private boolean aBoolean6 = false;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "J")
	private final long aLong4;

	@OriginalMember(owner = "client!af", name = "A", descriptor = "Lclient!wk;")
	public final Class6_Sub8 aClass6_Sub8_1;

	@OriginalMember(owner = "client!af", name = "u", descriptor = "Lclient!wv;")
	public final Class269 aClass269_1;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "Lclient!nc;")
	public Class160 aClass160_1;

	@OriginalMember(owner = "client!af", name = "x", descriptor = "Lclient!ku;")
	public final Class138 aClass138_1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!qa;Lclient!wv;Lclient!wk;J)V")
	public Class6_Sub2(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class269 arg1, @OriginalArg(2) Class6_Sub8 arg2, @OriginalArg(3) long arg3) {
		this.aLong4 = arg3;
		this.aClass6_Sub8_1 = arg2;
		this.aClass269_1 = arg1;
		this.aClass160_1 = this.aClass269_1.method5995();
		if (!arg0.method5502() && this.aClass160_1.anInt4927 != -1) {
			this.aClass160_1 = Static49.method873(this.aClass160_1.anInt4927);
		}
		this.aClass138_1 = new Class138();
		this.anInt108 = (int) ((double) this.anInt108 + Math.random() * 64.0D);
		this.method51();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IJ)V")
	public void method50(@OriginalArg(1) long arg0) {
		for (@Pc(21) Class6_Sub3_Sub1_Sub1 local21 = (Class6_Sub3_Sub1_Sub1) this.aClass138_1.method3311(); local21 != null; local21 = (Class6_Sub3_Sub1_Sub1) this.aClass138_1.method3312()) {
			local21.method1467(arg0);
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
	public void method51() {
		this.anInt126 = this.aClass269_1.anInt7664;
		this.anInt105 = this.aClass269_1.anInt7677;
		this.anInt124 = this.aClass269_1.anInt7673;
		this.anInt106 = this.aClass269_1.anInt7662;
		this.anInt109 = this.aClass269_1.anInt7669;
		this.anInt121 = this.aClass269_1.anInt7663;
		this.anInt117 = this.aClass269_1.anInt7667;
		this.anInt112 = this.aClass269_1.anInt7674;
		this.anInt110 = this.aClass269_1.anInt7665;
		if (this.anInt124 == this.anInt105 && this.anInt110 == this.anInt105 && this.anInt117 == this.anInt126 && this.anInt117 == this.anInt109 && this.anInt106 == this.anInt112 && this.anInt106 == this.anInt121) {
			this.aBoolean6 = true;
			return;
		}
		this.aBoolean6 = false;
		@Pc(130) int local130 = (this.anInt124 + this.anInt105 + this.anInt110) / 3;
		@Pc(141) int local141 = (this.anInt117 + this.anInt126 + this.anInt109) / 3;
		@Pc(153) int local153 = (this.anInt112 + this.anInt106 + this.anInt121) / 3;
		if (this.anInt125 == local130 && local141 == this.anInt104 && local153 == this.anInt122) {
			return;
		}
		this.anInt104 = local141;
		this.anInt125 = local130;
		this.anInt122 = local153;
		@Pc(189) int local189 = this.anInt105 - this.anInt124;
		@Pc(196) int local196 = this.anInt117 - this.anInt126;
		@Pc(203) int local203 = this.anInt106 - this.anInt112;
		@Pc(210) int local210 = this.anInt110 - this.anInt124;
		@Pc(217) int local217 = this.anInt109 - this.anInt126;
		@Pc(224) int local224 = this.anInt121 - this.anInt112;
		this.anInt120 = local203 * local210 - local224 * local189;
		this.anInt111 = local196 * local224 - local217 * local203;
		for (this.anInt100 = local189 * local217 - local210 * local196; this.anInt111 > 32767 || this.anInt120 > 32767 || this.anInt100 > 32767 || this.anInt111 < -32767 || this.anInt120 < -32767 || this.anInt100 < -32767; this.anInt100 >>= 0x1) {
			this.anInt111 >>= 0x1;
			this.anInt120 >>= 0x1;
		}
		@Pc(324) int local324 = (int) Math.sqrt((double) (this.anInt100 * this.anInt100 + this.anInt120 * this.anInt120 + this.anInt111 * this.anInt111));
		if (local324 <= 0) {
			local324 = 1;
		}
		this.anInt100 = this.anInt100 * 32767 / local324;
		this.anInt120 = this.anInt120 * 32767 / local324;
		this.anInt111 = this.anInt111 * 32767 / local324;
		if (this.aClass160_1.aShort78 <= 0 && this.aClass160_1.aShort79 <= 0) {
			return;
		}
		@Pc(371) int local371 = (int) (Math.atan2((double) this.anInt100, (double) this.anInt111) * 2607.5945876176133D);
		@Pc(393) int local393 = (int) (Math.atan2((double) this.anInt120, Math.sqrt((double) (this.anInt111 * this.anInt111 + this.anInt100 * this.anInt100))) * 2607.5945876176133D);
		this.anInt118 = this.aClass160_1.aShort78 - this.aClass160_1.lb;
		this.anInt101 = local371 + this.aClass160_1.lb - (this.anInt118 >> 1);
		this.anInt102 = this.aClass160_1.aShort79 - this.aClass160_1.aShort77;
		this.anInt113 = this.aClass160_1.aShort77 + local393 - (this.anInt102 >> 1);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!qa;JIZI)V")
	public void method52(@OriginalArg(0) Class172 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(50) int local50;
		if (this.aBoolean5) {
			arg3 = false;
		} else if (Static319.anInt1935 < this.aClass160_1.anInt4931) {
			arg3 = false;
		} else if (Static432.anInt7226 > Static125.anIntArray156[Static319.anInt1935]) {
			arg3 = false;
		} else if (this.aBoolean6) {
			arg3 = false;
		} else if (this.aClass160_1.anInt4922 != -1) {
			local50 = (int) (arg1 - this.aLong4);
			if (this.aClass160_1.aBoolean438 || this.aClass160_1.anInt4922 >= local50) {
				local50 %= this.aClass160_1.anInt4922;
			} else {
				arg3 = false;
			}
			if (!this.aClass160_1.aBoolean436 && this.aClass160_1.anInt4932 > local50) {
				arg3 = false;
			}
			if (this.aClass160_1.aBoolean436 && local50 >= this.aClass160_1.anInt4932) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt108 += (int) (((double) this.aClass160_1.anInt4973 + Math.random() * (double) (this.aClass160_1.anInt4941 - this.aClass160_1.anInt4973)) * (double) arg2);
			if (this.anInt108 > 63) {
				local50 = this.anInt108 >> 6;
				this.anInt108 &= 0x3F;
				for (@Pc(147) int local147 = 0; local147 < local50; local147++) {
					@Pc(221) int local221;
					@Pc(215) int local215;
					@Pc(227) int local227;
					@Pc(173) int local173;
					@Pc(181) int local181;
					@Pc(185) int local185;
					@Pc(195) int local195;
					@Pc(203) int local203;
					@Pc(207) int local207;
					if (this.aClass160_1.aShort78 <= 0 && this.aClass160_1.aShort79 <= 0) {
						local227 = this.anInt100;
						local215 = this.anInt120;
						local221 = this.anInt111;
					} else {
						local173 = (int) ((double) this.anInt118 * Math.random()) + this.anInt101;
						@Pc(177) int local177 = local173 & 0x3FFF;
						local181 = Class3_Sub2_Sub17.anIntArray289[local177];
						local185 = Class3_Sub2_Sub17.anIntArray290[local177];
						local195 = this.anInt113 + (int) ((double) this.anInt102 * Math.random());
						@Pc(199) int local199 = local195 & 0x1FFF;
						local203 = Class3_Sub2_Sub17.anIntArray289[local199];
						local207 = Class3_Sub2_Sub17.anIntArray290[local199];
						local215 = (local207 << 0) * -1;
						local221 = local203 * local185 >> 15;
						local227 = local203 * local181 >> 15;
					}
					local173 = (int) (Math.random() * 65535.0D);
					local181 = (int) (Math.random() * 65535.0D);
					if (local181 + local173 > 65535) {
						local173 = 65535 - local173;
						local181 = 65535 - local181;
					}
					local185 = 65535 - local173 - local181;
					local195 = this.anInt124 * local173 + local181 * this.anInt105 + this.anInt110 * local185 >> 16;
					local203 = local181 * this.anInt117 + local173 * this.anInt126 + this.anInt109 * local185 >> 16;
					local207 = this.anInt121 * local185 + this.anInt106 * local181 + this.anInt112 * local173 >> 16;
					@Pc(342) int local342 = this.aClass160_1.anInt4936 + (int) (Math.random() * (double) (this.aClass160_1.anInt4951 - this.aClass160_1.anInt4936));
					@Pc(358) int local358 = (int) (Math.random() * (double) (this.aClass160_1.anInt4920 - this.aClass160_1.anInt4967)) + this.aClass160_1.anInt4967;
					@Pc(375) int local375 = this.aClass160_1.anInt4919 + (int) ((double) (this.aClass160_1.anInt4958 - this.aClass160_1.anInt4919) * Math.random());
					@Pc(437) int local437;
					if (this.aClass160_1.aBoolean433) {
						@Pc(441) double local441 = Math.random();
						local437 = (int) (Math.random() * (double) this.aClass160_1.anInt4955 + (double) this.aClass160_1.anInt4957) << 24 | (int) (local441 * (double) this.aClass160_1.anInt4952 + (double) this.aClass160_1.anInt4956) | (int) ((double) this.aClass160_1.anInt4970 + (double) this.aClass160_1.anInt4965 * local441) << 8 | (int) ((double) this.aClass160_1.anInt4942 * local441 + (double) this.aClass160_1.anInt4921) << 16;
					} else {
						local437 = (int) (Math.random() * (double) this.aClass160_1.anInt4952 + (double) this.aClass160_1.anInt4956) | (int) ((double) this.aClass160_1.anInt4921 + (double) this.aClass160_1.anInt4942 * Math.random()) << 16 | (int) ((double) this.aClass160_1.anInt4970 + Math.random() * (double) this.aClass160_1.anInt4965) << 8 | (int) (Math.random() * (double) this.aClass160_1.anInt4955 + (double) this.aClass160_1.anInt4957) << 24;
					}
					@Pc(503) int local503 = this.aClass160_1.anInt4959;
					if (!arg0.method5502() && !this.aClass160_1.aBoolean434) {
						local503 = -1;
					}
					if (Static435.anInt7308 == Static324.anInt7645) {
						new Class6_Sub3_Sub1_Sub1(this, local195, local203, local207, local221, local215, local227, local342, local358, local437, local375, local503, this.aClass160_1.aBoolean435, this.aClass160_1.aBoolean437);
					} else {
						@Pc(523) Class6_Sub3_Sub1_Sub1 local523 = Static168.aClass6_Sub3_Sub1_Sub1Array1[Static435.anInt7308];
						Static435.anInt7308 = Static435.anInt7308 + 1 & 0x3FF;
						local523.method1469(this, local195, local203, local207, local221, local215, local227, local342, local358, local437, local375, local503, this.aClass160_1.aBoolean435, this.aClass160_1.aBoolean437);
					}
				}
			}
		}
		this.anInt119 = 0;
		for (@Pc(590) Class6_Sub3_Sub1_Sub1 local590 = (Class6_Sub3_Sub1_Sub1) this.aClass138_1.method3311(); local590 != null; local590 = (Class6_Sub3_Sub1_Sub1) this.aClass138_1.method3312()) {
			local590.method1466(arg1, arg2);
			this.anInt119++;
		}
		Static434.anInt7261 += this.anInt119;
	}
}
