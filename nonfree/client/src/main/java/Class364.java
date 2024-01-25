import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class364 {

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "Lclient!ei;")
	private Class91 aClass91_14;

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "Lclient!ei;")
	private Class91 aClass91_15;

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "Lclient!gda;")
	private Interface8 anInterface8_7;

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "Lclient!ei;")
	private Class91 aClass91_16;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "[F")
	private final float[] aFloatArray83 = new float[16];

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "Lclient!nga;")
	private final Class14_Sub29_Sub2 aClass14_Sub29_Sub2_3 = new Class14_Sub29_Sub2(786336);

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
	private final int anInt10570 = Static296.method5214(1600);

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "[[Lclient!on;")
	private final Class12_Sub7_Sub2[][] aClass12_Sub7_Sub2ArrayArray3 = new Class12_Sub7_Sub2[64][768];

	@OriginalMember(owner = "client!vf", name = "A", descriptor = "[I")
	private final int[] anIntArray781 = new int[64];

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "[[Lclient!on;")
	private final Class12_Sub7_Sub2[][] aClass12_Sub7_Sub2ArrayArray4 = new Class12_Sub7_Sub2[1600][64];

	@OriginalMember(owner = "client!vf", name = "z", descriptor = "[I")
	private final int[] anIntArray780 = new int[1600];

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
	private int anInt10571 = 0;

	@OriginalMember(owner = "client!vf", name = "y", descriptor = "[I")
	private final int[] anIntArray779 = new int[8191];

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!qfa;B)V")
	private void method8805(@OriginalArg(0) Class137_Sub3 arg0) {
		arg0.method7073(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat206 != Static46.aFloat30) {
			arg0.xa(Static46.aFloat30);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!qfa;Z)V")
	private void method8807(@OriginalArg(0) int arg0, @OriginalArg(1) Class137_Sub3 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray83, 0);
		@Pc(15) float local15 = this.aFloatArray83[0];
		@Pc(20) float local20 = this.aFloatArray83[4];
		@Pc(25) float local25 = this.aFloatArray83[8];
		@Pc(30) float local30 = this.aFloatArray83[1];
		@Pc(35) float local35 = this.aFloatArray83[5];
		@Pc(40) float local40 = this.aFloatArray83[9];
		@Pc(44) float local44 = local30 + local15;
		@Pc(48) float local48 = local20 + local35;
		@Pc(58) float local58 = local40 + local25;
		@Pc(63) float local63 = local15 - local30;
		@Pc(68) float local68 = local20 - local35;
		@Pc(72) float local72 = local25 - local40;
		@Pc(77) float local77 = local30 - local15;
		@Pc(81) float local81 = local35 - local20;
		this.aClass14_Sub29_Sub2_3.anInt7264 = 0;
		@Pc(90) float local90 = local40 - local25;
		@Pc(97) int local97;
		@Pc(114) int local114;
		@Pc(120) int local120;
		@Pc(129) Class12_Sub7_Sub2 local129;
		@Pc(132) int local132;
		@Pc(137) byte local137;
		@Pc(142) byte local142;
		@Pc(145) byte local145;
		@Pc(150) byte local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(168) float local168;
		@Pc(173) int local173;
		@Pc(487) float local487;
		@Pc(492) int local492;
		@Pc(432) int local432;
		@Pc(448) Class12_Sub7_Sub2 local448;
		@Pc(451) int local451;
		@Pc(464) byte local464;
		@Pc(469) byte local469;
		@Pc(481) float local481;
		if (arg1.aBoolean594) {
			for (local97 = arg0 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray780[local97] <= 64 ? this.anIntArray780[local97] : 64;
				if (local114 > 0) {
					for (local120 = local114 - 1; local120 >= 0; local120--) {
						local129 = this.aClass12_Sub7_Sub2ArrayArray4[local97][local120];
						local132 = local129.anInt10254;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = (float) (local129.anInt10249 >> 12);
						local162 = (float) (local129.anInt10247 >> 12);
						local168 = (float) (local129.anInt10252 >> 12);
						local173 = local129.anInt10251 >> 12;
						this.aClass14_Sub29_Sub2_3.method5908(0.0F);
						this.aClass14_Sub29_Sub2_3.method5908(0.0F);
						this.aClass14_Sub29_Sub2_3.method5908(local44 * (float) -local173 + local156);
						this.aClass14_Sub29_Sub2_3.method5908((float) -local173 * local48 + local162);
						this.aClass14_Sub29_Sub2_3.method5908(local58 * (float) -local173 + local168);
						this.aClass14_Sub29_Sub2_3.method5854(local137);
						this.aClass14_Sub29_Sub2_3.method5854(local142);
						this.aClass14_Sub29_Sub2_3.method5854(local145);
						this.aClass14_Sub29_Sub2_3.method5854(local150);
						this.aClass14_Sub29_Sub2_3.method5908(1.0F);
						this.aClass14_Sub29_Sub2_3.method5908(0.0F);
						this.aClass14_Sub29_Sub2_3.method5908((float) local173 * local63 + local156);
						this.aClass14_Sub29_Sub2_3.method5908(local162 + (float) local173 * local68);
						this.aClass14_Sub29_Sub2_3.method5908(local168 + (float) local173 * local72);
						this.aClass14_Sub29_Sub2_3.method5854(local137);
						this.aClass14_Sub29_Sub2_3.method5854(local142);
						this.aClass14_Sub29_Sub2_3.method5854(local145);
						this.aClass14_Sub29_Sub2_3.method5854(local150);
						this.aClass14_Sub29_Sub2_3.method5908(1.0F);
						this.aClass14_Sub29_Sub2_3.method5908(1.0F);
						this.aClass14_Sub29_Sub2_3.method5908(local156 + local44 * (float) local173);
						this.aClass14_Sub29_Sub2_3.method5908(local162 + (float) local173 * local48);
						this.aClass14_Sub29_Sub2_3.method5908(local58 * (float) local173 + local168);
						this.aClass14_Sub29_Sub2_3.method5854(local137);
						this.aClass14_Sub29_Sub2_3.method5854(local142);
						this.aClass14_Sub29_Sub2_3.method5854(local145);
						this.aClass14_Sub29_Sub2_3.method5854(local150);
						this.aClass14_Sub29_Sub2_3.method5908(0.0F);
						this.aClass14_Sub29_Sub2_3.method5908(1.0F);
						this.aClass14_Sub29_Sub2_3.method5908(local156 + (float) local173 * local77);
						this.aClass14_Sub29_Sub2_3.method5908((float) local173 * local81 + local162);
						this.aClass14_Sub29_Sub2_3.method5908(local90 * (float) local173 + local168);
						this.aClass14_Sub29_Sub2_3.method5854(local137);
						this.aClass14_Sub29_Sub2_3.method5854(local142);
						this.aClass14_Sub29_Sub2_3.method5854(local145);
						this.aClass14_Sub29_Sub2_3.method5854(local150);
					}
					if (this.anIntArray780[local97] > 64) {
						local432 = this.anIntArray780[local97] - 65;
						for (local132 = this.anIntArray781[local432] - 1; local132 >= 0; local132--) {
							local448 = this.aClass12_Sub7_Sub2ArrayArray3[local432][local132];
							local451 = local448.anInt10254;
							local145 = (byte) (local451 >> 16);
							local150 = (byte) (local451 >> 8);
							local464 = (byte) local451;
							local469 = (byte) (local451 >>> 24);
							local168 = (float) (local448.anInt10249 >> 12);
							local481 = (float) (local448.anInt10247 >> 12);
							local487 = (float) (local448.anInt10252 >> 12);
							local492 = local448.anInt10251 >> 12;
							this.aClass14_Sub29_Sub2_3.method5908(0.0F);
							this.aClass14_Sub29_Sub2_3.method5908(0.0F);
							this.aClass14_Sub29_Sub2_3.method5908(local44 * (float) -local492 + local168);
							this.aClass14_Sub29_Sub2_3.method5908(local481 + (float) -local492 * local48);
							this.aClass14_Sub29_Sub2_3.method5908(local487 + (float) -local492 * local58);
							this.aClass14_Sub29_Sub2_3.method5854(local145);
							this.aClass14_Sub29_Sub2_3.method5854(local150);
							this.aClass14_Sub29_Sub2_3.method5854(local464);
							this.aClass14_Sub29_Sub2_3.method5854(local469);
							this.aClass14_Sub29_Sub2_3.method5908(1.0F);
							this.aClass14_Sub29_Sub2_3.method5908(0.0F);
							this.aClass14_Sub29_Sub2_3.method5908(local168 + local63 * (float) local492);
							this.aClass14_Sub29_Sub2_3.method5908(local68 * (float) local492 + local481);
							this.aClass14_Sub29_Sub2_3.method5908(local487 + local72 * (float) local492);
							this.aClass14_Sub29_Sub2_3.method5854(local145);
							this.aClass14_Sub29_Sub2_3.method5854(local150);
							this.aClass14_Sub29_Sub2_3.method5854(local464);
							this.aClass14_Sub29_Sub2_3.method5854(local469);
							this.aClass14_Sub29_Sub2_3.method5908(1.0F);
							this.aClass14_Sub29_Sub2_3.method5908(1.0F);
							this.aClass14_Sub29_Sub2_3.method5908(local44 * (float) local492 + local168);
							this.aClass14_Sub29_Sub2_3.method5908(local481 + (float) local492 * local48);
							this.aClass14_Sub29_Sub2_3.method5908((float) local492 * local58 + local487);
							this.aClass14_Sub29_Sub2_3.method5854(local145);
							this.aClass14_Sub29_Sub2_3.method5854(local150);
							this.aClass14_Sub29_Sub2_3.method5854(local464);
							this.aClass14_Sub29_Sub2_3.method5854(local469);
							this.aClass14_Sub29_Sub2_3.method5908(0.0F);
							this.aClass14_Sub29_Sub2_3.method5908(1.0F);
							this.aClass14_Sub29_Sub2_3.method5908(local77 * (float) local492 + local168);
							this.aClass14_Sub29_Sub2_3.method5908(local481 + (float) local492 * local81);
							this.aClass14_Sub29_Sub2_3.method5908(local487 + (float) local492 * local90);
							this.aClass14_Sub29_Sub2_3.method5854(local145);
							this.aClass14_Sub29_Sub2_3.method5854(local150);
							this.aClass14_Sub29_Sub2_3.method5854(local464);
							this.aClass14_Sub29_Sub2_3.method5854(local469);
						}
					}
				}
			}
		} else {
			for (local97 = arg0 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray780[local97] > 64 ? 64 : this.anIntArray780[local97];
				if (local114 > 0) {
					for (local120 = local114 - 1; local120 >= 0; local120--) {
						local129 = this.aClass12_Sub7_Sub2ArrayArray4[local97][local120];
						local132 = local129.anInt10254;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = (float) (local129.anInt10249 >> 12);
						local162 = (float) (local129.anInt10247 >> 12);
						local168 = (float) (local129.anInt10252 >> 12);
						local173 = local129.anInt10251 >> 12;
						this.aClass14_Sub29_Sub2_3.method5911(0.0F);
						this.aClass14_Sub29_Sub2_3.method5911(0.0F);
						this.aClass14_Sub29_Sub2_3.method5911(local156 + local44 * (float) -local173);
						this.aClass14_Sub29_Sub2_3.method5911(local162 + local48 * (float) -local173);
						this.aClass14_Sub29_Sub2_3.method5911(local168 + local58 * (float) -local173);
						this.aClass14_Sub29_Sub2_3.method5854(local137);
						this.aClass14_Sub29_Sub2_3.method5854(local142);
						this.aClass14_Sub29_Sub2_3.method5854(local145);
						this.aClass14_Sub29_Sub2_3.method5854(local150);
						this.aClass14_Sub29_Sub2_3.method5911(1.0F);
						this.aClass14_Sub29_Sub2_3.method5911(0.0F);
						this.aClass14_Sub29_Sub2_3.method5911(local156 + (float) local173 * local63);
						this.aClass14_Sub29_Sub2_3.method5911((float) local173 * local68 + local162);
						this.aClass14_Sub29_Sub2_3.method5911(local168 + (float) local173 * local72);
						this.aClass14_Sub29_Sub2_3.method5854(local137);
						this.aClass14_Sub29_Sub2_3.method5854(local142);
						this.aClass14_Sub29_Sub2_3.method5854(local145);
						this.aClass14_Sub29_Sub2_3.method5854(local150);
						this.aClass14_Sub29_Sub2_3.method5911(1.0F);
						this.aClass14_Sub29_Sub2_3.method5911(1.0F);
						this.aClass14_Sub29_Sub2_3.method5911(local44 * (float) local173 + local156);
						this.aClass14_Sub29_Sub2_3.method5911(local48 * (float) local173 + local162);
						this.aClass14_Sub29_Sub2_3.method5911(local168 + (float) local173 * local58);
						this.aClass14_Sub29_Sub2_3.method5854(local137);
						this.aClass14_Sub29_Sub2_3.method5854(local142);
						this.aClass14_Sub29_Sub2_3.method5854(local145);
						this.aClass14_Sub29_Sub2_3.method5854(local150);
						this.aClass14_Sub29_Sub2_3.method5911(0.0F);
						this.aClass14_Sub29_Sub2_3.method5911(1.0F);
						this.aClass14_Sub29_Sub2_3.method5911(local156 + (float) local173 * local77);
						this.aClass14_Sub29_Sub2_3.method5911((float) local173 * local81 + local162);
						this.aClass14_Sub29_Sub2_3.method5911(local90 * (float) local173 + local168);
						this.aClass14_Sub29_Sub2_3.method5854(local137);
						this.aClass14_Sub29_Sub2_3.method5854(local142);
						this.aClass14_Sub29_Sub2_3.method5854(local145);
						this.aClass14_Sub29_Sub2_3.method5854(local150);
					}
					if (this.anIntArray780[local97] > 64) {
						local432 = this.anIntArray780[local97] - 65;
						for (local132 = this.anIntArray781[local432] - 1; local132 >= 0; local132--) {
							local448 = this.aClass12_Sub7_Sub2ArrayArray3[local432][local132];
							local451 = local448.anInt10254;
							local145 = (byte) (local451 >> 16);
							local150 = (byte) (local451 >> 8);
							local464 = (byte) local451;
							local469 = (byte) (local451 >>> 24);
							local168 = (float) (local448.anInt10249 >> 12);
							local481 = (float) (local448.anInt10247 >> 12);
							local487 = (float) (local448.anInt10252 >> 12);
							local492 = local448.anInt10251 >> 12;
							this.aClass14_Sub29_Sub2_3.method5911(0.0F);
							this.aClass14_Sub29_Sub2_3.method5911(0.0F);
							this.aClass14_Sub29_Sub2_3.method5911(local168 + (float) -local492 * local44);
							this.aClass14_Sub29_Sub2_3.method5911(local481 + local48 * (float) -local492);
							this.aClass14_Sub29_Sub2_3.method5911(local58 * (float) -local492 + local487);
							this.aClass14_Sub29_Sub2_3.method5854(local145);
							this.aClass14_Sub29_Sub2_3.method5854(local150);
							this.aClass14_Sub29_Sub2_3.method5854(local464);
							this.aClass14_Sub29_Sub2_3.method5854(local469);
							this.aClass14_Sub29_Sub2_3.method5911(1.0F);
							this.aClass14_Sub29_Sub2_3.method5911(0.0F);
							this.aClass14_Sub29_Sub2_3.method5911((float) local492 * local63 + local168);
							this.aClass14_Sub29_Sub2_3.method5911((float) local492 * local68 + local481);
							this.aClass14_Sub29_Sub2_3.method5911((float) local492 * local72 + local487);
							this.aClass14_Sub29_Sub2_3.method5854(local145);
							this.aClass14_Sub29_Sub2_3.method5854(local150);
							this.aClass14_Sub29_Sub2_3.method5854(local464);
							this.aClass14_Sub29_Sub2_3.method5854(local469);
							this.aClass14_Sub29_Sub2_3.method5911(1.0F);
							this.aClass14_Sub29_Sub2_3.method5911(1.0F);
							this.aClass14_Sub29_Sub2_3.method5911((float) local492 * local44 + local168);
							this.aClass14_Sub29_Sub2_3.method5911(local481 + local48 * (float) local492);
							this.aClass14_Sub29_Sub2_3.method5911(local487 + (float) local492 * local58);
							this.aClass14_Sub29_Sub2_3.method5854(local145);
							this.aClass14_Sub29_Sub2_3.method5854(local150);
							this.aClass14_Sub29_Sub2_3.method5854(local464);
							this.aClass14_Sub29_Sub2_3.method5854(local469);
							this.aClass14_Sub29_Sub2_3.method5911(0.0F);
							this.aClass14_Sub29_Sub2_3.method5911(1.0F);
							this.aClass14_Sub29_Sub2_3.method5911(local168 + local77 * (float) local492);
							this.aClass14_Sub29_Sub2_3.method5911(local481 + local81 * (float) local492);
							this.aClass14_Sub29_Sub2_3.method5911(local487 + (float) local492 * local90);
							this.aClass14_Sub29_Sub2_3.method5854(local145);
							this.aClass14_Sub29_Sub2_3.method5854(local150);
							this.aClass14_Sub29_Sub2_3.method5854(local464);
							this.aClass14_Sub29_Sub2_3.method5854(local469);
						}
					}
				}
			}
		}
		if (this.aClass14_Sub29_Sub2_3.anInt7264 != 0) {
			this.anInterface8_7.method5116(this.aClass14_Sub29_Sub2_3.anInt7264, 24, this.aClass14_Sub29_Sub2_3.aByteArray84);
			arg1.method7036(this.aClass91_14, this.aClass91_16, this.aClass91_15, (Class91) null);
			arg1.method7057(this.aClass14_Sub29_Sub2_3.anInt7264 / 24);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZILclient!qfa;Lclient!kd;)V")
	public void method8808(@OriginalArg(1) int arg0, @OriginalArg(2) Class137_Sub3 arg1, @OriginalArg(3) Class196 arg2) {
		if (arg1.aClass26_Sub3_3 == null) {
			return;
		}
		if (arg0 >= 0) {
			this.method8810(arg0, arg1);
		} else {
			this.method8812(arg1);
		}
		@Pc(29) float local29 = arg1.aClass26_Sub3_3.aFloat181;
		@Pc(33) float local33 = arg1.aClass26_Sub3_3.aFloat175;
		@Pc(37) float local37 = arg1.aClass26_Sub3_3.aFloat179;
		@Pc(41) float local41 = arg1.aClass26_Sub3_3.aFloat171;
		try {
			@Pc(51) int local51 = 0;
			@Pc(53) int local53 = Integer.MAX_VALUE;
			@Pc(55) int local55 = 0;
			@Pc(59) Class12_Sub7 local59 = arg2.aClass243_1.aClass12_Sub7_5;
			@Pc(62) Class12_Sub7 local62;
			@Pc(94) int local94;
			for (local62 = local59.aClass12_Sub7_9; local62 != local59; local62 = local62.aClass12_Sub7_9) {
				@Pc(67) Class12_Sub7_Sub2 local67 = (Class12_Sub7_Sub2) local62;
				local94 = (int) (local37 * (float) (local67.anInt10252 >> 12) + (float) (local67.anInt10249 >> 12) * local29 + local33 * (float) (local67.anInt10247 >> 12) + local41);
				if (local55 < local94) {
					local55 = local94;
				}
				this.anIntArray779[local51++] = local94;
				if (local94 < local53) {
					local53 = local94;
				}
			}
			@Pc(120) int local120 = local55 - local53;
			if (local120 + 2 <= 1600) {
				local120 += 2;
				local94 = 0;
			} else {
				local94 = Static296.method5214(local120) + 1 - this.anInt10570;
				local120 = (local120 >> local94) + 2;
			}
			local51 = 0;
			local62 = local59.aClass12_Sub7_9;
			@Pc(154) int local154 = -2;
			@Pc(156) boolean local156 = true;
			@Pc(158) boolean local158 = true;
			while (local62 != local59) {
				this.anInt10571 = 0;
				for (@Pc(165) int local165 = 0; local165 < local120; local165++) {
					this.anIntArray780[local165] = 0;
				}
				for (@Pc(182) int local182 = 0; local182 < 64; local182++) {
					this.anIntArray781[local182] = 0;
				}
				while (local62 != local59) {
					@Pc(200) Class12_Sub7_Sub2 local200 = (Class12_Sub7_Sub2) local62;
					if (local158) {
						local158 = false;
						local154 = local200.anInt10253;
						local156 = local200.aBoolean716;
					}
					if (local51 > 0 && (local200.anInt10253 != local154 || local156 != local200.aBoolean716)) {
						local158 = true;
						break;
					}
					@Pc(242) int local242 = this.anIntArray779[local51++] - local53 >> local94;
					if (local242 < 1600) {
						if (this.anIntArray780[local242] >= 64) {
							label102: {
								if (this.anIntArray780[local242] == 64) {
									if (this.anInt10571 == 64) {
										break label102;
									}
									this.anIntArray780[local242] += this.anInt10571++ + 1;
								}
								@Pc(297) Class12_Sub7_Sub2[] local297 = this.aClass12_Sub7_Sub2ArrayArray3[this.anIntArray780[local242] - 64 - 1];
								@Pc(305) int local305 = this.anIntArray780[local242] - 65;
								@Pc(307) int local307 = this.anIntArray781[this.anIntArray780[local242] - 65];
								this.anIntArray781[local305] = this.anIntArray781[this.anIntArray780[local242] - 65] + 1;
								local297[local307] = local200;
							}
						} else {
							this.aClass12_Sub7_Sub2ArrayArray4[local242][this.anIntArray780[local242]++] = local200;
						}
					}
					local62 = local62.aClass12_Sub7_9;
				}
				if (local154 >= 0) {
					arg1.method7029(local154);
				} else {
					arg1.method7029(-1);
				}
				if (local156 && arg1.aFloat206 != Static46.aFloat30) {
					arg1.xa(Static46.aFloat30);
				} else if (arg1.aFloat206 != 1.0F) {
					arg1.xa(1.0F);
				}
				this.method8807(local120, arg1);
			}
		} catch (@Pc(385) Exception local385) {
		}
		this.method8805(arg1);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBLclient!qfa;)V")
	private void method8810(@OriginalArg(0) int arg0, @OriginalArg(2) Class137_Sub3 arg1) {
		Static46.aFloat30 = arg1.aFloat206;
		arg1.method7101((float) arg0);
		arg1.method7059();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method7073(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!qfa;Z)V")
	public void method8811(@OriginalArg(0) Class137_Sub3 arg0) {
		this.anInterface8_7 = arg0.method7076(24, true, (byte[]) null, 196584);
		this.aClass91_16 = new Class91(this.anInterface8_7, 5126, 2, 0);
		this.aClass91_15 = new Class91(this.anInterface8_7, 5126, 3, 8);
		this.aClass91_14 = new Class91(this.anInterface8_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLclient!qfa;)V")
	private void method8812(@OriginalArg(1) Class137_Sub3 arg0) {
		Static46.aFloat30 = arg0.aFloat206;
		arg0.method7049();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method7073(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
