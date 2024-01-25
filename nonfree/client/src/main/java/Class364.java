import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class364 {

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "Lclient!ob;")
	private Interface19 anInterface19_7;

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "Lclient!gk;")
	private Class121 aClass121_14;

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "Lclient!gk;")
	private Class121 aClass121_15;

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "Lclient!gk;")
	private Class121 aClass121_16;

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "[F")
	private final float[] aFloatArray76 = new float[16];

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "Lclient!vda;")
	private final Class6_Sub8_Sub2 aClass6_Sub8_Sub2_3 = new Class6_Sub8_Sub2(786336);

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
	private final int anInt10349 = Static126.method2629(1600);

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "[[Lclient!tha;")
	private final Class9_Sub1_Sub1[][] aClass9_Sub1_Sub1ArrayArray3 = new Class9_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!vq", name = "v", descriptor = "[I")
	private final int[] anIntArray554 = new int[1600];

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "[I")
	private final int[] anIntArray555 = new int[64];

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "[I")
	private final int[] anIntArray553 = new int[8191];

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "[[Lclient!tha;")
	private final Class9_Sub1_Sub1[][] aClass9_Sub1_Sub1ArrayArray4 = new Class9_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
	private int anInt10350 = 0;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILclient!ac;B)V")
	private void method8395(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray76, 0);
		@Pc(15) float local15 = this.aFloatArray76[0];
		@Pc(20) float local20 = this.aFloatArray76[4];
		@Pc(25) float local25 = this.aFloatArray76[8];
		@Pc(30) float local30 = this.aFloatArray76[1];
		@Pc(35) float local35 = this.aFloatArray76[5];
		@Pc(40) float local40 = this.aFloatArray76[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local35 + local20;
		@Pc(52) float local52 = local40 + local25;
		@Pc(56) float local56 = local15 - local30;
		@Pc(61) float local61 = local20 - local35;
		@Pc(69) float local69 = local25 - local40;
		@Pc(73) float local73 = local30 - local15;
		@Pc(77) float local77 = local35 - local20;
		@Pc(82) float local82 = local40 - local25;
		this.aClass6_Sub8_Sub2_3.anInt10061 = 0;
		@Pc(93) int local93;
		@Pc(108) int local108;
		@Pc(114) int local114;
		@Pc(123) Class9_Sub1_Sub1 local123;
		@Pc(126) int local126;
		@Pc(131) byte local131;
		@Pc(136) byte local136;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(150) float local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(167) int local167;
		@Pc(492) float local492;
		@Pc(497) int local497;
		@Pc(437) int local437;
		@Pc(453) Class9_Sub1_Sub1 local453;
		@Pc(456) int local456;
		@Pc(469) byte local469;
		@Pc(474) byte local474;
		@Pc(486) float local486;
		if (arg1.aBoolean24) {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local108 = this.anIntArray554[local93] <= 64 ? this.anIntArray554[local93] : 64;
				if (local108 > 0) {
					for (local114 = local108 - 1; local114 >= 0; local114--) {
						local123 = this.aClass9_Sub1_Sub1ArrayArray3[local93][local114];
						local126 = local123.anInt507;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = (float) (local123.anInt505 >> 12);
						local156 = (float) (local123.anInt506 >> 12);
						local162 = (float) (local123.anInt504 >> 12);
						local167 = local123.anInt508 >> 12;
						this.aClass6_Sub8_Sub2_3.method8270(0.0F);
						this.aClass6_Sub8_Sub2_3.method8270(0.0F);
						this.aClass6_Sub8_Sub2_3.method8270((float) -local167 * local44 + local150);
						this.aClass6_Sub8_Sub2_3.method8270(local48 * (float) -local167 + local156);
						this.aClass6_Sub8_Sub2_3.method8270(local162 + local52 * (float) -local167);
						this.aClass6_Sub8_Sub2_3.method8211(local131);
						this.aClass6_Sub8_Sub2_3.method8211(local136);
						this.aClass6_Sub8_Sub2_3.method8211(local139);
						this.aClass6_Sub8_Sub2_3.method8211(local144);
						this.aClass6_Sub8_Sub2_3.method8270(1.0F);
						this.aClass6_Sub8_Sub2_3.method8270(0.0F);
						this.aClass6_Sub8_Sub2_3.method8270((float) local167 * local56 + local150);
						this.aClass6_Sub8_Sub2_3.method8270(local61 * (float) local167 + local156);
						this.aClass6_Sub8_Sub2_3.method8270(local69 * (float) local167 + local162);
						this.aClass6_Sub8_Sub2_3.method8211(local131);
						this.aClass6_Sub8_Sub2_3.method8211(local136);
						this.aClass6_Sub8_Sub2_3.method8211(local139);
						this.aClass6_Sub8_Sub2_3.method8211(local144);
						this.aClass6_Sub8_Sub2_3.method8270(1.0F);
						this.aClass6_Sub8_Sub2_3.method8270(1.0F);
						this.aClass6_Sub8_Sub2_3.method8270((float) local167 * local44 + local150);
						this.aClass6_Sub8_Sub2_3.method8270(local48 * (float) local167 + local156);
						this.aClass6_Sub8_Sub2_3.method8270(local162 + local52 * (float) local167);
						this.aClass6_Sub8_Sub2_3.method8211(local131);
						this.aClass6_Sub8_Sub2_3.method8211(local136);
						this.aClass6_Sub8_Sub2_3.method8211(local139);
						this.aClass6_Sub8_Sub2_3.method8211(local144);
						this.aClass6_Sub8_Sub2_3.method8270(0.0F);
						this.aClass6_Sub8_Sub2_3.method8270(1.0F);
						this.aClass6_Sub8_Sub2_3.method8270((float) local167 * local73 + local150);
						this.aClass6_Sub8_Sub2_3.method8270((float) local167 * local77 + local156);
						this.aClass6_Sub8_Sub2_3.method8270((float) local167 * local82 + local162);
						this.aClass6_Sub8_Sub2_3.method8211(local131);
						this.aClass6_Sub8_Sub2_3.method8211(local136);
						this.aClass6_Sub8_Sub2_3.method8211(local139);
						this.aClass6_Sub8_Sub2_3.method8211(local144);
					}
					if (this.anIntArray554[local93] > 64) {
						local437 = this.anIntArray554[local93] - 65;
						for (local126 = this.anIntArray555[local437] - 1; local126 >= 0; local126--) {
							local453 = this.aClass9_Sub1_Sub1ArrayArray4[local437][local126];
							local456 = local453.anInt507;
							local139 = (byte) (local456 >> 16);
							local144 = (byte) (local456 >> 8);
							local469 = (byte) local456;
							local474 = (byte) (local456 >>> 24);
							local162 = (float) (local453.anInt505 >> 12);
							local486 = (float) (local453.anInt506 >> 12);
							local492 = (float) (local453.anInt504 >> 12);
							local497 = local453.anInt508 >> 12;
							this.aClass6_Sub8_Sub2_3.method8270(0.0F);
							this.aClass6_Sub8_Sub2_3.method8270(0.0F);
							this.aClass6_Sub8_Sub2_3.method8270(local162 + local44 * (float) -local497);
							this.aClass6_Sub8_Sub2_3.method8270((float) -local497 * local48 + local486);
							this.aClass6_Sub8_Sub2_3.method8270(local52 * (float) -local497 + local492);
							this.aClass6_Sub8_Sub2_3.method8211(local139);
							this.aClass6_Sub8_Sub2_3.method8211(local144);
							this.aClass6_Sub8_Sub2_3.method8211(local469);
							this.aClass6_Sub8_Sub2_3.method8211(local474);
							this.aClass6_Sub8_Sub2_3.method8270(1.0F);
							this.aClass6_Sub8_Sub2_3.method8270(0.0F);
							this.aClass6_Sub8_Sub2_3.method8270(local162 + local56 * (float) local497);
							this.aClass6_Sub8_Sub2_3.method8270(local61 * (float) local497 + local486);
							this.aClass6_Sub8_Sub2_3.method8270(local69 * (float) local497 + local492);
							this.aClass6_Sub8_Sub2_3.method8211(local139);
							this.aClass6_Sub8_Sub2_3.method8211(local144);
							this.aClass6_Sub8_Sub2_3.method8211(local469);
							this.aClass6_Sub8_Sub2_3.method8211(local474);
							this.aClass6_Sub8_Sub2_3.method8270(1.0F);
							this.aClass6_Sub8_Sub2_3.method8270(1.0F);
							this.aClass6_Sub8_Sub2_3.method8270(local162 + local44 * (float) local497);
							this.aClass6_Sub8_Sub2_3.method8270(local486 + (float) local497 * local48);
							this.aClass6_Sub8_Sub2_3.method8270(local492 + (float) local497 * local52);
							this.aClass6_Sub8_Sub2_3.method8211(local139);
							this.aClass6_Sub8_Sub2_3.method8211(local144);
							this.aClass6_Sub8_Sub2_3.method8211(local469);
							this.aClass6_Sub8_Sub2_3.method8211(local474);
							this.aClass6_Sub8_Sub2_3.method8270(0.0F);
							this.aClass6_Sub8_Sub2_3.method8270(1.0F);
							this.aClass6_Sub8_Sub2_3.method8270(local162 + local73 * (float) local497);
							this.aClass6_Sub8_Sub2_3.method8270((float) local497 * local77 + local486);
							this.aClass6_Sub8_Sub2_3.method8270(local492 + local82 * (float) local497);
							this.aClass6_Sub8_Sub2_3.method8211(local139);
							this.aClass6_Sub8_Sub2_3.method8211(local144);
							this.aClass6_Sub8_Sub2_3.method8211(local469);
							this.aClass6_Sub8_Sub2_3.method8211(local474);
						}
					}
				}
			}
		} else {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local108 = this.anIntArray554[local93] > 64 ? 64 : this.anIntArray554[local93];
				if (local108 > 0) {
					for (local114 = local108 - 1; local114 >= 0; local114--) {
						local123 = this.aClass9_Sub1_Sub1ArrayArray3[local93][local114];
						local126 = local123.anInt507;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = (float) (local123.anInt505 >> 12);
						local156 = (float) (local123.anInt506 >> 12);
						local162 = (float) (local123.anInt504 >> 12);
						local167 = local123.anInt508 >> 12;
						this.aClass6_Sub8_Sub2_3.method8271(0.0F);
						this.aClass6_Sub8_Sub2_3.method8271(0.0F);
						this.aClass6_Sub8_Sub2_3.method8271(local150 + local44 * (float) -local167);
						this.aClass6_Sub8_Sub2_3.method8271(local156 + local48 * (float) -local167);
						this.aClass6_Sub8_Sub2_3.method8271(local162 + (float) -local167 * local52);
						this.aClass6_Sub8_Sub2_3.method8211(local131);
						this.aClass6_Sub8_Sub2_3.method8211(local136);
						this.aClass6_Sub8_Sub2_3.method8211(local139);
						this.aClass6_Sub8_Sub2_3.method8211(local144);
						this.aClass6_Sub8_Sub2_3.method8271(1.0F);
						this.aClass6_Sub8_Sub2_3.method8271(0.0F);
						this.aClass6_Sub8_Sub2_3.method8271((float) local167 * local56 + local150);
						this.aClass6_Sub8_Sub2_3.method8271((float) local167 * local61 + local156);
						this.aClass6_Sub8_Sub2_3.method8271((float) local167 * local69 + local162);
						this.aClass6_Sub8_Sub2_3.method8211(local131);
						this.aClass6_Sub8_Sub2_3.method8211(local136);
						this.aClass6_Sub8_Sub2_3.method8211(local139);
						this.aClass6_Sub8_Sub2_3.method8211(local144);
						this.aClass6_Sub8_Sub2_3.method8271(1.0F);
						this.aClass6_Sub8_Sub2_3.method8271(1.0F);
						this.aClass6_Sub8_Sub2_3.method8271(local150 + local44 * (float) local167);
						this.aClass6_Sub8_Sub2_3.method8271(local48 * (float) local167 + local156);
						this.aClass6_Sub8_Sub2_3.method8271(local162 + (float) local167 * local52);
						this.aClass6_Sub8_Sub2_3.method8211(local131);
						this.aClass6_Sub8_Sub2_3.method8211(local136);
						this.aClass6_Sub8_Sub2_3.method8211(local139);
						this.aClass6_Sub8_Sub2_3.method8211(local144);
						this.aClass6_Sub8_Sub2_3.method8271(0.0F);
						this.aClass6_Sub8_Sub2_3.method8271(1.0F);
						this.aClass6_Sub8_Sub2_3.method8271(local150 + local73 * (float) local167);
						this.aClass6_Sub8_Sub2_3.method8271(local77 * (float) local167 + local156);
						this.aClass6_Sub8_Sub2_3.method8271(local82 * (float) local167 + local162);
						this.aClass6_Sub8_Sub2_3.method8211(local131);
						this.aClass6_Sub8_Sub2_3.method8211(local136);
						this.aClass6_Sub8_Sub2_3.method8211(local139);
						this.aClass6_Sub8_Sub2_3.method8211(local144);
					}
					if (this.anIntArray554[local93] > 64) {
						local437 = this.anIntArray554[local93] - 64 - 1;
						for (local126 = this.anIntArray555[local437] - 1; local126 >= 0; local126--) {
							local453 = this.aClass9_Sub1_Sub1ArrayArray4[local437][local126];
							local456 = local453.anInt507;
							local139 = (byte) (local456 >> 16);
							local144 = (byte) (local456 >> 8);
							local469 = (byte) local456;
							local474 = (byte) (local456 >>> 24);
							local162 = (float) (local453.anInt505 >> 12);
							local486 = (float) (local453.anInt506 >> 12);
							local492 = (float) (local453.anInt504 >> 12);
							local497 = local453.anInt508 >> 12;
							this.aClass6_Sub8_Sub2_3.method8271(0.0F);
							this.aClass6_Sub8_Sub2_3.method8271(0.0F);
							this.aClass6_Sub8_Sub2_3.method8271(local44 * (float) -local497 + local162);
							this.aClass6_Sub8_Sub2_3.method8271(local48 * (float) -local497 + local486);
							this.aClass6_Sub8_Sub2_3.method8271(local52 * (float) -local497 + local492);
							this.aClass6_Sub8_Sub2_3.method8211(local139);
							this.aClass6_Sub8_Sub2_3.method8211(local144);
							this.aClass6_Sub8_Sub2_3.method8211(local469);
							this.aClass6_Sub8_Sub2_3.method8211(local474);
							this.aClass6_Sub8_Sub2_3.method8271(1.0F);
							this.aClass6_Sub8_Sub2_3.method8271(0.0F);
							this.aClass6_Sub8_Sub2_3.method8271((float) local497 * local56 + local162);
							this.aClass6_Sub8_Sub2_3.method8271(local61 * (float) local497 + local486);
							this.aClass6_Sub8_Sub2_3.method8271(local492 + (float) local497 * local69);
							this.aClass6_Sub8_Sub2_3.method8211(local139);
							this.aClass6_Sub8_Sub2_3.method8211(local144);
							this.aClass6_Sub8_Sub2_3.method8211(local469);
							this.aClass6_Sub8_Sub2_3.method8211(local474);
							this.aClass6_Sub8_Sub2_3.method8271(1.0F);
							this.aClass6_Sub8_Sub2_3.method8271(1.0F);
							this.aClass6_Sub8_Sub2_3.method8271(local162 + (float) local497 * local44);
							this.aClass6_Sub8_Sub2_3.method8271(local486 + local48 * (float) local497);
							this.aClass6_Sub8_Sub2_3.method8271(local52 * (float) local497 + local492);
							this.aClass6_Sub8_Sub2_3.method8211(local139);
							this.aClass6_Sub8_Sub2_3.method8211(local144);
							this.aClass6_Sub8_Sub2_3.method8211(local469);
							this.aClass6_Sub8_Sub2_3.method8211(local474);
							this.aClass6_Sub8_Sub2_3.method8271(0.0F);
							this.aClass6_Sub8_Sub2_3.method8271(1.0F);
							this.aClass6_Sub8_Sub2_3.method8271(local162 + (float) local497 * local73);
							this.aClass6_Sub8_Sub2_3.method8271(local486 + local77 * (float) local497);
							this.aClass6_Sub8_Sub2_3.method8271((float) local497 * local82 + local492);
							this.aClass6_Sub8_Sub2_3.method8211(local139);
							this.aClass6_Sub8_Sub2_3.method8211(local144);
							this.aClass6_Sub8_Sub2_3.method8211(local469);
							this.aClass6_Sub8_Sub2_3.method8211(local474);
						}
					}
				}
			}
		}
		if (this.aClass6_Sub8_Sub2_3.anInt10061 != 0) {
			this.anInterface19_7.method7395(this.aClass6_Sub8_Sub2_3.anInt10061, this.aClass6_Sub8_Sub2_3.aByteArray102, 24);
			arg1.method357(this.aClass121_15, (Class121) null, this.aClass121_14, this.aClass121_16);
			arg1.method399(this.aClass6_Sub8_Sub2_3.anInt10061 / 24);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!pf;IILclient!ac;)V")
	public void method8397(@OriginalArg(0) Class257 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub1 arg2) {
		if (arg2.aClass115_Sub1_3 == null) {
			return;
		}
		if (arg1 < 0) {
			this.method8399(arg2);
		} else {
			this.method8402(arg2, arg1);
		}
		@Pc(29) float local29 = arg2.aClass115_Sub1_3.aFloat85;
		@Pc(33) float local33 = arg2.aClass115_Sub1_3.aFloat79;
		@Pc(37) float local37 = arg2.aClass115_Sub1_3.aFloat76;
		@Pc(41) float local41 = arg2.aClass115_Sub1_3.aFloat80;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class9_Sub1 local51 = arg0.aClass362_1.aClass9_Sub1_9;
			@Pc(58) Class9_Sub1 local58;
			@Pc(90) int local90;
			for (local58 = local51.aClass9_Sub1_7; local58 != local51; local58 = local58.aClass9_Sub1_7) {
				@Pc(63) Class9_Sub1_Sub1 local63 = (Class9_Sub1_Sub1) local58;
				local90 = (int) ((float) (local63.anInt504 >> 12) * local37 + (float) (local63.anInt505 >> 12) * local29 + (float) (local63.anInt506 >> 12) * local33 + local41);
				this.anIntArray553[local43++] = local90;
				if (local45 > local90) {
					local45 = local90;
				}
				if (local90 > local47) {
					local47 = local90;
				}
			}
			@Pc(121) int local121 = local47 - local45;
			if (local121 + 2 > 1600) {
				local90 = Static126.method2629(local121) + 1 - this.anInt10349;
				local121 = (local121 >> local90) + 2;
			} else {
				local121 += 2;
				local90 = 0;
			}
			local43 = 0;
			local58 = local51.aClass9_Sub1_7;
			@Pc(154) int local154 = -2;
			@Pc(156) boolean local156 = true;
			@Pc(158) boolean local158 = true;
			while (local58 != local51) {
				this.anInt10350 = 0;
				for (@Pc(165) int local165 = 0; local165 < local121; local165++) {
					this.anIntArray554[local165] = 0;
				}
				for (@Pc(178) int local178 = 0; local178 < 64; local178++) {
					this.anIntArray555[local178] = 0;
				}
				while (local51 != local58) {
					@Pc(194) Class9_Sub1_Sub1 local194 = (Class9_Sub1_Sub1) local58;
					if (local158) {
						local154 = local194.anInt509;
						local156 = local194.aBoolean53;
						local158 = false;
					}
					if (local43 > 0 && (local194.anInt509 != local154 || local156 != local194.aBoolean53)) {
						local158 = true;
						break;
					}
					@Pc(240) int local240 = this.anIntArray553[local43++] - local45 >> local90;
					if (local240 < 1600) {
						if (this.anIntArray554[local240] >= 64) {
							label102: {
								if (this.anIntArray554[local240] == 64) {
									if (this.anInt10350 == 64) {
										break label102;
									}
									this.anIntArray554[local240] += this.anInt10350++ + 1;
								}
								this.aClass9_Sub1_Sub1ArrayArray4[this.anIntArray554[local240] - 65][this.anIntArray555[this.anIntArray554[local240] - 1 - 64]++] = local194;
							}
						} else {
							this.aClass9_Sub1_Sub1ArrayArray3[local240][this.anIntArray554[local240]++] = local194;
						}
					}
					local58 = local58.aClass9_Sub1_7;
				}
				if (local154 < 0) {
					arg2.method323(-1);
				} else {
					arg2.method323(local154);
				}
				if (local156 && Static102.aFloat70 != arg2.aFloat12) {
					arg2.xa(Static102.aFloat70);
				} else if (arg2.aFloat12 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method8395(local121, arg2);
			}
		} catch (@Pc(373) Exception local373) {
		}
		this.method8398(arg2);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!ac;I)V")
	private void method8398(@OriginalArg(0) Class5_Sub1 arg0) {
		arg0.method364(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat12 != Static102.aFloat70) {
			arg0.xa(Static102.aFloat70);
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(Lclient!ac;I)V")
	private void method8399(@OriginalArg(0) Class5_Sub1 arg0) {
		Static102.aFloat70 = arg0.aFloat12;
		arg0.method350();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method364(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!ac;ZI)V")
	private void method8402(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static102.aFloat70 = arg0.aFloat12;
		arg0.method379((float) arg1);
		arg0.method390();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method364(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(Lclient!ac;I)V")
	public void method8403(@OriginalArg(0) Class5_Sub1 arg0) {
		this.anInterface19_7 = arg0.method367(196584, true, 24, (byte[]) null);
		this.aClass121_14 = new Class121(this.anInterface19_7, 5126, 2, 0);
		this.aClass121_16 = new Class121(this.anInterface19_7, 5126, 3, 8);
		this.aClass121_15 = new Class121(this.anInterface19_7, 5121, 4, 20);
	}
}
