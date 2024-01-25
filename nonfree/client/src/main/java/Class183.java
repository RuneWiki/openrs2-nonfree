import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class183 {

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Lclient!dd;")
	private Class65 aClass65_3;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "Lclient!dd;")
	private Class65 aClass65_4;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "Lclient!dd;")
	private Class65 aClass65_5;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Lclient!qd;")
	private Interface14 anInterface14_4;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[F")
	private final float[] aFloatArray40 = new float[16];

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Lclient!mh;")
	private final Class12_Sub8_Sub1 aClass12_Sub8_Sub1_2 = new Class12_Sub8_Sub1(786336);

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	private final int anInt5417 = Static483.method7240(1600);

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "[I")
	private final int[] anIntArray380 = new int[1600];

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "[I")
	private final int[] anIntArray382 = new int[8191];

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "[[Lclient!mca;")
	private final Class7_Sub1_Sub1[][] aClass7_Sub1_Sub1ArrayArray2 = new Class7_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "[I")
	private final int[] anIntArray381 = new int[64];

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
	private int anInt5418 = 0;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "[[Lclient!mca;")
	private final Class7_Sub1_Sub1[][] aClass7_Sub1_Sub1ArrayArray1 = new Class7_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!gi;II)V")
	private void method4568(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray40, 0);
		@Pc(15) float local15 = this.aFloatArray40[0];
		@Pc(20) float local20 = this.aFloatArray40[4];
		@Pc(25) float local25 = this.aFloatArray40[8];
		@Pc(30) float local30 = this.aFloatArray40[1];
		@Pc(35) float local35 = this.aFloatArray40[5];
		@Pc(40) float local40 = this.aFloatArray40[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local20 + local35;
		@Pc(52) float local52 = local40 + local25;
		@Pc(56) float local56 = local15 - local30;
		@Pc(60) float local60 = local20 - local35;
		@Pc(65) float local65 = local25 - local40;
		@Pc(70) float local70 = local30 - local15;
		@Pc(75) float local75 = local35 - local20;
		@Pc(80) float local80 = local40 - local25;
		this.aClass12_Sub8_Sub1_2.anInt6217 = 0;
		@Pc(91) int local91;
		@Pc(108) int local108;
		@Pc(114) int local114;
		@Pc(123) Class7_Sub1_Sub1 local123;
		@Pc(126) int local126;
		@Pc(131) byte local131;
		@Pc(136) byte local136;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(150) float local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(167) int local167;
		@Pc(496) float local496;
		@Pc(501) int local501;
		@Pc(441) int local441;
		@Pc(457) Class7_Sub1_Sub1 local457;
		@Pc(460) int local460;
		@Pc(473) byte local473;
		@Pc(478) byte local478;
		@Pc(490) float local490;
		if (arg0.aBoolean292) {
			for (local91 = arg1 - 1; local91 >= 0; local91--) {
				local108 = this.anIntArray380[local91] > 64 ? 64 : this.anIntArray380[local91];
				if (local108 > 0) {
					for (local114 = local108 - 1; local114 >= 0; local114--) {
						local123 = this.aClass7_Sub1_Sub1ArrayArray1[local91][local114];
						local126 = local123.anInt3273;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = local123.anInt3263 >> 12;
						local156 = local123.anInt3271 >> 12;
						local162 = local123.anInt3272 >> 12;
						local167 = local123.anInt3268 >> 12;
						this.aClass12_Sub8_Sub1_2.method4923(0.0F);
						this.aClass12_Sub8_Sub1_2.method4923(0.0F);
						this.aClass12_Sub8_Sub1_2.method4923(local150 + local44 * (float) -local167);
						this.aClass12_Sub8_Sub1_2.method4923((float) -local167 * local48 + local156);
						this.aClass12_Sub8_Sub1_2.method4923(local162 + (float) -local167 * local52);
						this.aClass12_Sub8_Sub1_2.method5214(local131);
						this.aClass12_Sub8_Sub1_2.method5214(local136);
						this.aClass12_Sub8_Sub1_2.method5214(local139);
						this.aClass12_Sub8_Sub1_2.method5214(local144);
						this.aClass12_Sub8_Sub1_2.method4923(1.0F);
						this.aClass12_Sub8_Sub1_2.method4923(0.0F);
						this.aClass12_Sub8_Sub1_2.method4923(local150 + local56 * (float) local167);
						this.aClass12_Sub8_Sub1_2.method4923(local156 + local60 * (float) local167);
						this.aClass12_Sub8_Sub1_2.method4923(local162 + (float) local167 * local65);
						this.aClass12_Sub8_Sub1_2.method5214(local131);
						this.aClass12_Sub8_Sub1_2.method5214(local136);
						this.aClass12_Sub8_Sub1_2.method5214(local139);
						this.aClass12_Sub8_Sub1_2.method5214(local144);
						this.aClass12_Sub8_Sub1_2.method4923(1.0F);
						this.aClass12_Sub8_Sub1_2.method4923(1.0F);
						this.aClass12_Sub8_Sub1_2.method4923(local150 + (float) local167 * local44);
						this.aClass12_Sub8_Sub1_2.method4923((float) local167 * local48 + local156);
						this.aClass12_Sub8_Sub1_2.method4923(local162 + (float) local167 * local52);
						this.aClass12_Sub8_Sub1_2.method5214(local131);
						this.aClass12_Sub8_Sub1_2.method5214(local136);
						this.aClass12_Sub8_Sub1_2.method5214(local139);
						this.aClass12_Sub8_Sub1_2.method5214(local144);
						this.aClass12_Sub8_Sub1_2.method4923(0.0F);
						this.aClass12_Sub8_Sub1_2.method4923(1.0F);
						this.aClass12_Sub8_Sub1_2.method4923((float) local167 * local70 + local150);
						this.aClass12_Sub8_Sub1_2.method4923(local156 + (float) local167 * local75);
						this.aClass12_Sub8_Sub1_2.method4923(local162 + local80 * (float) local167);
						this.aClass12_Sub8_Sub1_2.method5214(local131);
						this.aClass12_Sub8_Sub1_2.method5214(local136);
						this.aClass12_Sub8_Sub1_2.method5214(local139);
						this.aClass12_Sub8_Sub1_2.method5214(local144);
					}
					if (this.anIntArray380[local91] > 64) {
						local441 = this.anIntArray380[local91] - 64 - 1;
						for (local126 = this.anIntArray381[local441] - 1; local126 >= 0; local126--) {
							local457 = this.aClass7_Sub1_Sub1ArrayArray2[local441][local126];
							local460 = local457.anInt3273;
							local139 = (byte) (local460 >> 16);
							local144 = (byte) (local460 >> 8);
							local473 = (byte) local460;
							local478 = (byte) (local460 >>> 24);
							local162 = local457.anInt3263 >> 12;
							local490 = local457.anInt3271 >> 12;
							local496 = local457.anInt3272 >> 12;
							local501 = local457.anInt3268 >> 12;
							this.aClass12_Sub8_Sub1_2.method4923(0.0F);
							this.aClass12_Sub8_Sub1_2.method4923(0.0F);
							this.aClass12_Sub8_Sub1_2.method4923(local162 + (float) -local501 * local44);
							this.aClass12_Sub8_Sub1_2.method4923(local490 + local48 * (float) -local501);
							this.aClass12_Sub8_Sub1_2.method4923(local52 * (float) -local501 + local496);
							this.aClass12_Sub8_Sub1_2.method5214(local139);
							this.aClass12_Sub8_Sub1_2.method5214(local144);
							this.aClass12_Sub8_Sub1_2.method5214(local473);
							this.aClass12_Sub8_Sub1_2.method5214(local478);
							this.aClass12_Sub8_Sub1_2.method4923(1.0F);
							this.aClass12_Sub8_Sub1_2.method4923(0.0F);
							this.aClass12_Sub8_Sub1_2.method4923(local56 * (float) local501 + local162);
							this.aClass12_Sub8_Sub1_2.method4923((float) local501 * local60 + local490);
							this.aClass12_Sub8_Sub1_2.method4923(local496 + local65 * (float) local501);
							this.aClass12_Sub8_Sub1_2.method5214(local139);
							this.aClass12_Sub8_Sub1_2.method5214(local144);
							this.aClass12_Sub8_Sub1_2.method5214(local473);
							this.aClass12_Sub8_Sub1_2.method5214(local478);
							this.aClass12_Sub8_Sub1_2.method4923(1.0F);
							this.aClass12_Sub8_Sub1_2.method4923(1.0F);
							this.aClass12_Sub8_Sub1_2.method4923(local44 * (float) local501 + local162);
							this.aClass12_Sub8_Sub1_2.method4923(local490 + local48 * (float) local501);
							this.aClass12_Sub8_Sub1_2.method4923(local496 + (float) local501 * local52);
							this.aClass12_Sub8_Sub1_2.method5214(local139);
							this.aClass12_Sub8_Sub1_2.method5214(local144);
							this.aClass12_Sub8_Sub1_2.method5214(local473);
							this.aClass12_Sub8_Sub1_2.method5214(local478);
							this.aClass12_Sub8_Sub1_2.method4923(0.0F);
							this.aClass12_Sub8_Sub1_2.method4923(1.0F);
							this.aClass12_Sub8_Sub1_2.method4923((float) local501 * local70 + local162);
							this.aClass12_Sub8_Sub1_2.method4923(local490 + (float) local501 * local75);
							this.aClass12_Sub8_Sub1_2.method4923(local496 + (float) local501 * local80);
							this.aClass12_Sub8_Sub1_2.method5214(local139);
							this.aClass12_Sub8_Sub1_2.method5214(local144);
							this.aClass12_Sub8_Sub1_2.method5214(local473);
							this.aClass12_Sub8_Sub1_2.method5214(local478);
						}
					}
				}
			}
		} else {
			for (local91 = arg1 - 1; local91 >= 0; local91--) {
				local108 = this.anIntArray380[local91] > 64 ? 64 : this.anIntArray380[local91];
				if (local108 > 0) {
					for (local114 = local108 - 1; local114 >= 0; local114--) {
						local123 = this.aClass7_Sub1_Sub1ArrayArray1[local91][local114];
						local126 = local123.anInt3273;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = local123.anInt3263 >> 12;
						local156 = local123.anInt3271 >> 12;
						local162 = local123.anInt3272 >> 12;
						local167 = local123.anInt3268 >> 12;
						this.aClass12_Sub8_Sub1_2.method4924(0.0F);
						this.aClass12_Sub8_Sub1_2.method4924(0.0F);
						this.aClass12_Sub8_Sub1_2.method4924(local44 * (float) -local167 + local150);
						this.aClass12_Sub8_Sub1_2.method4924(local156 + (float) -local167 * local48);
						this.aClass12_Sub8_Sub1_2.method4924(local52 * (float) -local167 + local162);
						this.aClass12_Sub8_Sub1_2.method5214(local131);
						this.aClass12_Sub8_Sub1_2.method5214(local136);
						this.aClass12_Sub8_Sub1_2.method5214(local139);
						this.aClass12_Sub8_Sub1_2.method5214(local144);
						this.aClass12_Sub8_Sub1_2.method4924(1.0F);
						this.aClass12_Sub8_Sub1_2.method4924(0.0F);
						this.aClass12_Sub8_Sub1_2.method4924((float) local167 * local56 + local150);
						this.aClass12_Sub8_Sub1_2.method4924(local60 * (float) local167 + local156);
						this.aClass12_Sub8_Sub1_2.method4924(local162 + local65 * (float) local167);
						this.aClass12_Sub8_Sub1_2.method5214(local131);
						this.aClass12_Sub8_Sub1_2.method5214(local136);
						this.aClass12_Sub8_Sub1_2.method5214(local139);
						this.aClass12_Sub8_Sub1_2.method5214(local144);
						this.aClass12_Sub8_Sub1_2.method4924(1.0F);
						this.aClass12_Sub8_Sub1_2.method4924(1.0F);
						this.aClass12_Sub8_Sub1_2.method4924(local44 * (float) local167 + local150);
						this.aClass12_Sub8_Sub1_2.method4924((float) local167 * local48 + local156);
						this.aClass12_Sub8_Sub1_2.method4924(local162 + local52 * (float) local167);
						this.aClass12_Sub8_Sub1_2.method5214(local131);
						this.aClass12_Sub8_Sub1_2.method5214(local136);
						this.aClass12_Sub8_Sub1_2.method5214(local139);
						this.aClass12_Sub8_Sub1_2.method5214(local144);
						this.aClass12_Sub8_Sub1_2.method4924(0.0F);
						this.aClass12_Sub8_Sub1_2.method4924(1.0F);
						this.aClass12_Sub8_Sub1_2.method4924(local150 + (float) local167 * local70);
						this.aClass12_Sub8_Sub1_2.method4924(local75 * (float) local167 + local156);
						this.aClass12_Sub8_Sub1_2.method4924(local162 + local80 * (float) local167);
						this.aClass12_Sub8_Sub1_2.method5214(local131);
						this.aClass12_Sub8_Sub1_2.method5214(local136);
						this.aClass12_Sub8_Sub1_2.method5214(local139);
						this.aClass12_Sub8_Sub1_2.method5214(local144);
					}
					if (this.anIntArray380[local91] > 64) {
						local441 = this.anIntArray380[local91] - 64 - 1;
						for (local126 = this.anIntArray381[local441] - 1; local126 >= 0; local126--) {
							local457 = this.aClass7_Sub1_Sub1ArrayArray2[local441][local126];
							local460 = local457.anInt3273;
							local139 = (byte) (local460 >> 16);
							local144 = (byte) (local460 >> 8);
							local473 = (byte) local460;
							local478 = (byte) (local460 >>> 24);
							local162 = local457.anInt3263 >> 12;
							local490 = local457.anInt3271 >> 12;
							local496 = local457.anInt3272 >> 12;
							local501 = local457.anInt3268 >> 12;
							this.aClass12_Sub8_Sub1_2.method4924(0.0F);
							this.aClass12_Sub8_Sub1_2.method4924(0.0F);
							this.aClass12_Sub8_Sub1_2.method4924((float) -local501 * local44 + local162);
							this.aClass12_Sub8_Sub1_2.method4924(local490 + local48 * (float) -local501);
							this.aClass12_Sub8_Sub1_2.method4924(local496 + local52 * (float) -local501);
							this.aClass12_Sub8_Sub1_2.method5214(local139);
							this.aClass12_Sub8_Sub1_2.method5214(local144);
							this.aClass12_Sub8_Sub1_2.method5214(local473);
							this.aClass12_Sub8_Sub1_2.method5214(local478);
							this.aClass12_Sub8_Sub1_2.method4924(1.0F);
							this.aClass12_Sub8_Sub1_2.method4924(0.0F);
							this.aClass12_Sub8_Sub1_2.method4924(local162 + local56 * (float) local501);
							this.aClass12_Sub8_Sub1_2.method4924((float) local501 * local60 + local490);
							this.aClass12_Sub8_Sub1_2.method4924(local496 + local65 * (float) local501);
							this.aClass12_Sub8_Sub1_2.method5214(local139);
							this.aClass12_Sub8_Sub1_2.method5214(local144);
							this.aClass12_Sub8_Sub1_2.method5214(local473);
							this.aClass12_Sub8_Sub1_2.method5214(local478);
							this.aClass12_Sub8_Sub1_2.method4924(1.0F);
							this.aClass12_Sub8_Sub1_2.method4924(1.0F);
							this.aClass12_Sub8_Sub1_2.method4924(local162 + local44 * (float) local501);
							this.aClass12_Sub8_Sub1_2.method4924((float) local501 * local48 + local490);
							this.aClass12_Sub8_Sub1_2.method4924(local496 + (float) local501 * local52);
							this.aClass12_Sub8_Sub1_2.method5214(local139);
							this.aClass12_Sub8_Sub1_2.method5214(local144);
							this.aClass12_Sub8_Sub1_2.method5214(local473);
							this.aClass12_Sub8_Sub1_2.method5214(local478);
							this.aClass12_Sub8_Sub1_2.method4924(0.0F);
							this.aClass12_Sub8_Sub1_2.method4924(1.0F);
							this.aClass12_Sub8_Sub1_2.method4924(local162 + local70 * (float) local501);
							this.aClass12_Sub8_Sub1_2.method4924(local490 + (float) local501 * local75);
							this.aClass12_Sub8_Sub1_2.method4924(local496 + (float) local501 * local80);
							this.aClass12_Sub8_Sub1_2.method5214(local139);
							this.aClass12_Sub8_Sub1_2.method5214(local144);
							this.aClass12_Sub8_Sub1_2.method5214(local473);
							this.aClass12_Sub8_Sub1_2.method5214(local478);
						}
					}
				}
			}
		}
		if (this.aClass12_Sub8_Sub1_2.anInt6217 != 0) {
			this.anInterface14_4.method6394(this.aClass12_Sub8_Sub1_2.anInt6217, this.aClass12_Sub8_Sub1_2.aByteArray82, 24);
			arg0.method3241(this.aClass65_3, null, this.aClass65_5, this.aClass65_4);
			arg0.method3203(this.aClass12_Sub8_Sub1_2.anInt6217 / 24);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!gi;I)V")
	private void method4570(@OriginalArg(0) Class42_Sub3 arg0) {
		arg0.method3192(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static320.aFloat125 != arg0.aFloat85) {
			arg0.M(Static320.aFloat125);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!gi;Z)V")
	public void method4571(@OriginalArg(0) Class42_Sub3 arg0) {
		this.anInterface14_4 = arg0.method3261(24, true, 196584, null);
		this.aClass65_4 = new Class65(this.anInterface14_4, 5126, 2, 0);
		this.aClass65_5 = new Class65(this.anInterface14_4, 5126, 3, 8);
		this.aClass65_3 = new Class65(this.anInterface14_4, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!hp;Lclient!gi;)V")
	public void method4572(@OriginalArg(1) Class136 arg0, @OriginalArg(2) Class42_Sub3 arg1) {
		if (arg1.aClass91_Sub1_4 == null) {
			return;
		}
		this.method4573(arg1);
		@Pc(17) float local17 = arg1.aClass91_Sub1_4.aFloat70;
		@Pc(21) float local21 = arg1.aClass91_Sub1_4.aFloat71;
		@Pc(31) float local31 = arg1.aClass91_Sub1_4.aFloat67;
		@Pc(35) float local35 = arg1.aClass91_Sub1_4.aFloat68;
		try {
			@Pc(40) int local40;
			@Pc(42) int local42;
			@Pc(48) Class7_Sub1 local48;
			@Pc(144) int local144;
			@Pc(155) int local155;
			if (arg0.aBoolean340) {
				local40 = arg0.anInt4293 - arg0.anInt4294;
				if (local40 + 2 > 1600) {
					local42 = Static483.method7240(local40) + 1 - this.anInt5417;
					local40 = (local40 >> local42) + 2;
				} else {
					local40 += 2;
					local42 = 0;
				}
				@Pc(405) Class7_Sub1 local405 = arg0.aClass313_1.aClass7_Sub1_9;
				local48 = local405.aClass7_Sub1_8;
				@Pc(410) int local410 = -2;
				@Pc(412) boolean local412 = true;
				@Pc(414) boolean local414 = true;
				while (local48 != local405) {
					this.anInt5418 = 0;
					for (local144 = 0; local144 < local40; local144++) {
						this.anIntArray380[local144] = 0;
					}
					for (@Pc(438) int local438 = 0; local438 < 64; local438++) {
						this.anIntArray381[local438] = 0;
					}
					while (local48 != local405) {
						@Pc(456) Class7_Sub1_Sub1 local456 = (Class7_Sub1_Sub1) local48;
						if (local414) {
							local414 = false;
							local412 = local456.aBoolean266;
							local410 = local456.anInt3264;
						} else if (local410 != local456.anInt3264 || local456.aBoolean266 != local412) {
							local414 = true;
							break;
						}
						local155 = (int) (local35 + (float) (local456.anInt3272 >> 12) * local31 + (float) (local456.anInt3263 >> 12) * local17 + local21 * (float) (local456.anInt3271 >> 12)) - arg0.anInt4294 >> local42;
						if (local155 < 1600) {
							if (this.anIntArray380[local155] >= 64) {
								label141: {
									if (this.anIntArray380[local155] == 64) {
										if (this.anInt5418 == 64) {
											break label141;
										}
										this.anIntArray380[local155] += this.anInt5418++ + 1;
									}
									this.aClass7_Sub1_Sub1ArrayArray2[this.anIntArray380[local155] - 1 - 64][this.anIntArray381[this.anIntArray380[local155] - 1 - 64]++] = local456;
								}
							} else {
								this.aClass7_Sub1_Sub1ArrayArray1[local155][this.anIntArray380[local155]++] = local456;
							}
						}
						local48 = local48.aClass7_Sub1_8;
					}
					if (local410 >= 0) {
						arg1.method3269(local410);
					} else {
						arg1.method3269(-1);
					}
					if (local412 && Static320.aFloat125 != arg1.aFloat85) {
						arg1.M(Static320.aFloat125);
					} else if (arg1.aFloat85 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method4568(arg1, local40);
				}
			} else {
				local40 = 0;
				local42 = Integer.MAX_VALUE;
				@Pc(44) int local44 = 0;
				local48 = arg0.aClass313_1.aClass7_Sub1_9;
				@Pc(51) Class7_Sub1 local51;
				@Pc(83) int local83;
				for (local51 = local48.aClass7_Sub1_8; local51 != local48; local51 = local51.aClass7_Sub1_8) {
					@Pc(56) Class7_Sub1_Sub1 local56 = (Class7_Sub1_Sub1) local51;
					local83 = (int) (local35 + (float) (local56.anInt3272 >> 12) * local31 + (float) (local56.anInt3263 >> 12) * local17 + (float) (local56.anInt3271 >> 12) * local21);
					if (local83 < local42) {
						local42 = local83;
					}
					this.anIntArray382[local40++] = local83;
					if (local83 > local44) {
						local44 = local83;
					}
				}
				@Pc(110) int local110 = local44 - local42;
				if (local110 + 2 > 1600) {
					local83 = Static483.method7240(local110) + 1 - this.anInt5417;
					local110 = (local110 >> local83) + 2;
				} else {
					local83 = 0;
					local110 += 2;
				}
				local51 = local48.aClass7_Sub1_8;
				local40 = 0;
				local144 = -2;
				@Pc(146) boolean local146 = true;
				@Pc(148) boolean local148 = true;
				while (local48 != local51) {
					this.anInt5418 = 0;
					for (local155 = 0; local155 < local110; local155++) {
						this.anIntArray380[local155] = 0;
					}
					for (@Pc(172) int local172 = 0; local172 < 64; local172++) {
						this.anIntArray381[local172] = 0;
					}
					while (local48 != local51) {
						@Pc(188) Class7_Sub1_Sub1 local188 = (Class7_Sub1_Sub1) local51;
						if (local148) {
							local144 = local188.anInt3264;
							local146 = local188.aBoolean266;
							local148 = false;
						}
						if (local40 > 0 && (local144 != local188.anInt3264 || local188.aBoolean266 != local146)) {
							local148 = true;
							break;
						}
						@Pc(227) int local227 = this.anIntArray382[local40++] - local42 >> local83;
						if (local227 < 1600) {
							if (this.anIntArray380[local227] >= 64) {
								label186: {
									if (this.anIntArray380[local227] == 64) {
										if (this.anInt5418 == 64) {
											break label186;
										}
										this.anIntArray380[local227] += this.anInt5418++ + 1;
									}
									@Pc(280) Class7_Sub1_Sub1[] local280 = this.aClass7_Sub1_Sub1ArrayArray2[this.anIntArray380[local227] - 1 - 64];
									@Pc(290) int local290 = this.anIntArray380[local227] - 64 - 1;
									@Pc(292) int local292 = this.anIntArray381[this.anIntArray380[local227] - 64 - 1];
									this.anIntArray381[local290] = this.anIntArray381[this.anIntArray380[local227] - 64 - 1] + 1;
									local280[local292] = local188;
								}
							} else {
								this.aClass7_Sub1_Sub1ArrayArray1[local227][this.anIntArray380[local227]++] = local188;
							}
						}
						local51 = local51.aClass7_Sub1_8;
					}
					if (local144 < 0) {
						arg1.method3269(-1);
					} else {
						arg1.method3269(local144);
					}
					if (local146 && arg1.aFloat85 != Static320.aFloat125) {
						arg1.M(Static320.aFloat125);
					} else if (arg1.aFloat85 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method4568(arg1, local110);
				}
			}
		} catch (@Pc(653) Exception local653) {
		}
		this.method4570(arg1);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Lclient!gi;Z)V")
	private void method4573(@OriginalArg(0) Class42_Sub3 arg0) {
		Static320.aFloat125 = arg0.aFloat85;
		arg0.method3190();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method3192(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
