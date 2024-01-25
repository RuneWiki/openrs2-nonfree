import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class173 {

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Lclient!ak;")
	private Class18 aClass18_1;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "Lclient!ak;")
	private Class18 aClass18_2;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!ak;")
	private Class18 aClass18_3;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!js;")
	private Interface10 anInterface10_2;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "[F")
	private final float[] aFloatArray30 = new float[16];

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!og;")
	private final Class5_Sub22_Sub2 aClass5_Sub22_Sub2_1 = new Class5_Sub22_Sub2(786336);

	@OriginalMember(owner = "client!je", name = "l", descriptor = "I")
	private final int anInt4599 = Static172.method2668(1600);

	@OriginalMember(owner = "client!je", name = "p", descriptor = "[I")
	private final int[] anIntArray229 = new int[64];

	@OriginalMember(owner = "client!je", name = "r", descriptor = "I")
	private int anInt4602 = 0;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "[I")
	private final int[] anIntArray230 = new int[8191];

	@OriginalMember(owner = "client!je", name = "u", descriptor = "[[Lclient!ej;")
	private final Class4_Sub1_Sub1[][] aClass4_Sub1_Sub1ArrayArray2 = new Class4_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!je", name = "t", descriptor = "[[Lclient!ej;")
	private final Class4_Sub1_Sub1[][] aClass4_Sub1_Sub1ArrayArray1 = new Class4_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!je", name = "s", descriptor = "[I")
	private final int[] anIntArray231 = new int[1600];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!rs;)V")
	public void method4166(@OriginalArg(1) Class133_Sub3 arg0) {
		this.anInterface10_2 = arg0.method7341(true, 196584, null, 24);
		this.aClass18_2 = new Class18(this.anInterface10_2, 5126, 2, 0);
		this.aClass18_3 = new Class18(this.anInterface10_2, 5126, 3, 8);
		this.aClass18_1 = new Class18(this.anInterface10_2, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!rs;IB)V")
	private void method4167(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1) {
		Class4_Sub2_Sub3_Sub2.lb = arg0.aFloat150;
		arg0.method7384((float) arg1);
		arg0.method7377();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method7346(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!rs;B)V")
	private void method4168(@OriginalArg(0) Class133_Sub3 arg0) {
		Class4_Sub2_Sub3_Sub2.lb = arg0.aFloat150;
		arg0.method7398();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method7346(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!rs;II)V")
	private void method4169(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray30, 0);
		@Pc(15) float local15 = this.aFloatArray30[0];
		@Pc(20) float local20 = this.aFloatArray30[4];
		@Pc(25) float local25 = this.aFloatArray30[8];
		@Pc(30) float local30 = this.aFloatArray30[1];
		@Pc(35) float local35 = this.aFloatArray30[5];
		@Pc(40) float local40 = this.aFloatArray30[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local20 + local35;
		@Pc(52) float local52 = local25 + local40;
		@Pc(63) float local63 = local15 - local30;
		@Pc(68) float local68 = local20 - local35;
		@Pc(73) float local73 = local25 - local40;
		@Pc(78) float local78 = local30 - local15;
		@Pc(82) float local82 = local35 - local20;
		this.aClass5_Sub22_Sub2_1.anInt6629 = 0;
		@Pc(90) float local90 = local40 - local25;
		@Pc(97) int local97;
		@Pc(114) int local114;
		@Pc(123) int local123;
		@Pc(132) Class4_Sub1_Sub1 local132;
		@Pc(135) int local135;
		@Pc(140) byte local140;
		@Pc(145) byte local145;
		@Pc(148) byte local148;
		@Pc(153) byte local153;
		@Pc(159) float local159;
		@Pc(165) float local165;
		@Pc(171) float local171;
		@Pc(176) int local176;
		@Pc(492) float local492;
		@Pc(497) int local497;
		@Pc(437) int local437;
		@Pc(453) Class4_Sub1_Sub1 local453;
		@Pc(456) int local456;
		@Pc(469) byte local469;
		@Pc(474) byte local474;
		@Pc(486) float local486;
		if (arg0.aBoolean611) {
			for (local97 = arg1 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray231[local97] > 64 ? 64 : this.anIntArray231[local97];
				if (local114 > 0) {
					for (local123 = local114 - 1; local123 >= 0; local123--) {
						local132 = this.aClass4_Sub1_Sub1ArrayArray1[local97][local123];
						local135 = local132.anInt51;
						local140 = (byte) (local135 >> 16);
						local145 = (byte) (local135 >> 8);
						local148 = (byte) local135;
						local153 = (byte) (local135 >>> 24);
						local159 = local132.anInt45 >> 12;
						local165 = local132.anInt52 >> 12;
						local171 = local132.anInt46 >> 12;
						local176 = local132.anInt47 >> 12;
						this.aClass5_Sub22_Sub2_1.method5969(0.0F);
						this.aClass5_Sub22_Sub2_1.method5969(0.0F);
						this.aClass5_Sub22_Sub2_1.method5969((float) -local176 * local44 + local159);
						this.aClass5_Sub22_Sub2_1.method5969(local165 + local48 * (float) -local176);
						this.aClass5_Sub22_Sub2_1.method5969(local52 * (float) -local176 + local171);
						this.aClass5_Sub22_Sub2_1.method5905(local140);
						this.aClass5_Sub22_Sub2_1.method5905(local145);
						this.aClass5_Sub22_Sub2_1.method5905(local148);
						this.aClass5_Sub22_Sub2_1.method5905(local153);
						this.aClass5_Sub22_Sub2_1.method5969(1.0F);
						this.aClass5_Sub22_Sub2_1.method5969(0.0F);
						this.aClass5_Sub22_Sub2_1.method5969(local159 + local63 * (float) local176);
						this.aClass5_Sub22_Sub2_1.method5969((float) local176 * local68 + local165);
						this.aClass5_Sub22_Sub2_1.method5969(local171 + (float) local176 * local73);
						this.aClass5_Sub22_Sub2_1.method5905(local140);
						this.aClass5_Sub22_Sub2_1.method5905(local145);
						this.aClass5_Sub22_Sub2_1.method5905(local148);
						this.aClass5_Sub22_Sub2_1.method5905(local153);
						this.aClass5_Sub22_Sub2_1.method5969(1.0F);
						this.aClass5_Sub22_Sub2_1.method5969(1.0F);
						this.aClass5_Sub22_Sub2_1.method5969(local159 + (float) local176 * local44);
						this.aClass5_Sub22_Sub2_1.method5969(local48 * (float) local176 + local165);
						this.aClass5_Sub22_Sub2_1.method5969(local52 * (float) local176 + local171);
						this.aClass5_Sub22_Sub2_1.method5905(local140);
						this.aClass5_Sub22_Sub2_1.method5905(local145);
						this.aClass5_Sub22_Sub2_1.method5905(local148);
						this.aClass5_Sub22_Sub2_1.method5905(local153);
						this.aClass5_Sub22_Sub2_1.method5969(0.0F);
						this.aClass5_Sub22_Sub2_1.method5969(1.0F);
						this.aClass5_Sub22_Sub2_1.method5969(local78 * (float) local176 + local159);
						this.aClass5_Sub22_Sub2_1.method5969(local165 + (float) local176 * local82);
						this.aClass5_Sub22_Sub2_1.method5969(local90 * (float) local176 + local171);
						this.aClass5_Sub22_Sub2_1.method5905(local140);
						this.aClass5_Sub22_Sub2_1.method5905(local145);
						this.aClass5_Sub22_Sub2_1.method5905(local148);
						this.aClass5_Sub22_Sub2_1.method5905(local153);
					}
					if (this.anIntArray231[local97] > 64) {
						local437 = this.anIntArray231[local97] - 65;
						for (local135 = this.anIntArray229[local437] - 1; local135 >= 0; local135--) {
							local453 = this.aClass4_Sub1_Sub1ArrayArray2[local437][local135];
							local456 = local453.anInt51;
							local148 = (byte) (local456 >> 16);
							local153 = (byte) (local456 >> 8);
							local469 = (byte) local456;
							local474 = (byte) (local456 >>> 24);
							local171 = local453.anInt45 >> 12;
							local486 = local453.anInt52 >> 12;
							local492 = local453.anInt46 >> 12;
							local497 = local453.anInt47 >> 12;
							this.aClass5_Sub22_Sub2_1.method5969(0.0F);
							this.aClass5_Sub22_Sub2_1.method5969(0.0F);
							this.aClass5_Sub22_Sub2_1.method5969(local171 + local44 * (float) -local497);
							this.aClass5_Sub22_Sub2_1.method5969(local486 + (float) -local497 * local48);
							this.aClass5_Sub22_Sub2_1.method5969((float) -local497 * local52 + local492);
							this.aClass5_Sub22_Sub2_1.method5905(local148);
							this.aClass5_Sub22_Sub2_1.method5905(local153);
							this.aClass5_Sub22_Sub2_1.method5905(local469);
							this.aClass5_Sub22_Sub2_1.method5905(local474);
							this.aClass5_Sub22_Sub2_1.method5969(1.0F);
							this.aClass5_Sub22_Sub2_1.method5969(0.0F);
							this.aClass5_Sub22_Sub2_1.method5969((float) local497 * local63 + local171);
							this.aClass5_Sub22_Sub2_1.method5969(local68 * (float) local497 + local486);
							this.aClass5_Sub22_Sub2_1.method5969(local492 + local73 * (float) local497);
							this.aClass5_Sub22_Sub2_1.method5905(local148);
							this.aClass5_Sub22_Sub2_1.method5905(local153);
							this.aClass5_Sub22_Sub2_1.method5905(local469);
							this.aClass5_Sub22_Sub2_1.method5905(local474);
							this.aClass5_Sub22_Sub2_1.method5969(1.0F);
							this.aClass5_Sub22_Sub2_1.method5969(1.0F);
							this.aClass5_Sub22_Sub2_1.method5969((float) local497 * local44 + local171);
							this.aClass5_Sub22_Sub2_1.method5969(local486 + local48 * (float) local497);
							this.aClass5_Sub22_Sub2_1.method5969((float) local497 * local52 + local492);
							this.aClass5_Sub22_Sub2_1.method5905(local148);
							this.aClass5_Sub22_Sub2_1.method5905(local153);
							this.aClass5_Sub22_Sub2_1.method5905(local469);
							this.aClass5_Sub22_Sub2_1.method5905(local474);
							this.aClass5_Sub22_Sub2_1.method5969(0.0F);
							this.aClass5_Sub22_Sub2_1.method5969(1.0F);
							this.aClass5_Sub22_Sub2_1.method5969(local78 * (float) local497 + local171);
							this.aClass5_Sub22_Sub2_1.method5969(local486 + local82 * (float) local497);
							this.aClass5_Sub22_Sub2_1.method5969(local492 + (float) local497 * local90);
							this.aClass5_Sub22_Sub2_1.method5905(local148);
							this.aClass5_Sub22_Sub2_1.method5905(local153);
							this.aClass5_Sub22_Sub2_1.method5905(local469);
							this.aClass5_Sub22_Sub2_1.method5905(local474);
						}
					}
				}
			}
		} else {
			for (local97 = arg1 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray231[local97] <= 64 ? this.anIntArray231[local97] : 64;
				if (local114 > 0) {
					for (local123 = local114 - 1; local123 >= 0; local123--) {
						local132 = this.aClass4_Sub1_Sub1ArrayArray1[local97][local123];
						local135 = local132.anInt51;
						local140 = (byte) (local135 >> 16);
						local145 = (byte) (local135 >> 8);
						local148 = (byte) local135;
						local153 = (byte) (local135 >>> 24);
						local159 = local132.anInt45 >> 12;
						local165 = local132.anInt52 >> 12;
						local171 = local132.anInt46 >> 12;
						local176 = local132.anInt47 >> 12;
						this.aClass5_Sub22_Sub2_1.method5970(0.0F);
						this.aClass5_Sub22_Sub2_1.method5970(0.0F);
						this.aClass5_Sub22_Sub2_1.method5970((float) -local176 * local44 + local159);
						this.aClass5_Sub22_Sub2_1.method5970(local165 + local48 * (float) -local176);
						this.aClass5_Sub22_Sub2_1.method5970(local171 + (float) -local176 * local52);
						this.aClass5_Sub22_Sub2_1.method5905(local140);
						this.aClass5_Sub22_Sub2_1.method5905(local145);
						this.aClass5_Sub22_Sub2_1.method5905(local148);
						this.aClass5_Sub22_Sub2_1.method5905(local153);
						this.aClass5_Sub22_Sub2_1.method5970(1.0F);
						this.aClass5_Sub22_Sub2_1.method5970(0.0F);
						this.aClass5_Sub22_Sub2_1.method5970(local159 + local63 * (float) local176);
						this.aClass5_Sub22_Sub2_1.method5970(local165 + (float) local176 * local68);
						this.aClass5_Sub22_Sub2_1.method5970(local171 + (float) local176 * local73);
						this.aClass5_Sub22_Sub2_1.method5905(local140);
						this.aClass5_Sub22_Sub2_1.method5905(local145);
						this.aClass5_Sub22_Sub2_1.method5905(local148);
						this.aClass5_Sub22_Sub2_1.method5905(local153);
						this.aClass5_Sub22_Sub2_1.method5970(1.0F);
						this.aClass5_Sub22_Sub2_1.method5970(1.0F);
						this.aClass5_Sub22_Sub2_1.method5970((float) local176 * local44 + local159);
						this.aClass5_Sub22_Sub2_1.method5970(local48 * (float) local176 + local165);
						this.aClass5_Sub22_Sub2_1.method5970((float) local176 * local52 + local171);
						this.aClass5_Sub22_Sub2_1.method5905(local140);
						this.aClass5_Sub22_Sub2_1.method5905(local145);
						this.aClass5_Sub22_Sub2_1.method5905(local148);
						this.aClass5_Sub22_Sub2_1.method5905(local153);
						this.aClass5_Sub22_Sub2_1.method5970(0.0F);
						this.aClass5_Sub22_Sub2_1.method5970(1.0F);
						this.aClass5_Sub22_Sub2_1.method5970((float) local176 * local78 + local159);
						this.aClass5_Sub22_Sub2_1.method5970(local165 + (float) local176 * local82);
						this.aClass5_Sub22_Sub2_1.method5970(local171 + (float) local176 * local90);
						this.aClass5_Sub22_Sub2_1.method5905(local140);
						this.aClass5_Sub22_Sub2_1.method5905(local145);
						this.aClass5_Sub22_Sub2_1.method5905(local148);
						this.aClass5_Sub22_Sub2_1.method5905(local153);
					}
					if (this.anIntArray231[local97] > 64) {
						local437 = this.anIntArray231[local97] - 64 - 1;
						for (local135 = this.anIntArray229[local437] - 1; local135 >= 0; local135--) {
							local453 = this.aClass4_Sub1_Sub1ArrayArray2[local437][local135];
							local456 = local453.anInt51;
							local148 = (byte) (local456 >> 16);
							local153 = (byte) (local456 >> 8);
							local469 = (byte) local456;
							local474 = (byte) (local456 >>> 24);
							local171 = local453.anInt45 >> 12;
							local486 = local453.anInt52 >> 12;
							local492 = local453.anInt46 >> 12;
							local497 = local453.anInt47 >> 12;
							this.aClass5_Sub22_Sub2_1.method5970(0.0F);
							this.aClass5_Sub22_Sub2_1.method5970(0.0F);
							this.aClass5_Sub22_Sub2_1.method5970((float) -local497 * local44 + local171);
							this.aClass5_Sub22_Sub2_1.method5970((float) -local497 * local48 + local486);
							this.aClass5_Sub22_Sub2_1.method5970(local492 + local52 * (float) -local497);
							this.aClass5_Sub22_Sub2_1.method5905(local148);
							this.aClass5_Sub22_Sub2_1.method5905(local153);
							this.aClass5_Sub22_Sub2_1.method5905(local469);
							this.aClass5_Sub22_Sub2_1.method5905(local474);
							this.aClass5_Sub22_Sub2_1.method5970(1.0F);
							this.aClass5_Sub22_Sub2_1.method5970(0.0F);
							this.aClass5_Sub22_Sub2_1.method5970(local171 + local63 * (float) local497);
							this.aClass5_Sub22_Sub2_1.method5970(local486 + local68 * (float) local497);
							this.aClass5_Sub22_Sub2_1.method5970((float) local497 * local73 + local492);
							this.aClass5_Sub22_Sub2_1.method5905(local148);
							this.aClass5_Sub22_Sub2_1.method5905(local153);
							this.aClass5_Sub22_Sub2_1.method5905(local469);
							this.aClass5_Sub22_Sub2_1.method5905(local474);
							this.aClass5_Sub22_Sub2_1.method5970(1.0F);
							this.aClass5_Sub22_Sub2_1.method5970(1.0F);
							this.aClass5_Sub22_Sub2_1.method5970(local44 * (float) local497 + local171);
							this.aClass5_Sub22_Sub2_1.method5970(local486 + (float) local497 * local48);
							this.aClass5_Sub22_Sub2_1.method5970(local492 + (float) local497 * local52);
							this.aClass5_Sub22_Sub2_1.method5905(local148);
							this.aClass5_Sub22_Sub2_1.method5905(local153);
							this.aClass5_Sub22_Sub2_1.method5905(local469);
							this.aClass5_Sub22_Sub2_1.method5905(local474);
							this.aClass5_Sub22_Sub2_1.method5970(0.0F);
							this.aClass5_Sub22_Sub2_1.method5970(1.0F);
							this.aClass5_Sub22_Sub2_1.method5970(local78 * (float) local497 + local171);
							this.aClass5_Sub22_Sub2_1.method5970(local486 + local82 * (float) local497);
							this.aClass5_Sub22_Sub2_1.method5970(local492 + (float) local497 * local90);
							this.aClass5_Sub22_Sub2_1.method5905(local148);
							this.aClass5_Sub22_Sub2_1.method5905(local153);
							this.aClass5_Sub22_Sub2_1.method5905(local469);
							this.aClass5_Sub22_Sub2_1.method5905(local474);
						}
					}
				}
			}
		}
		if (this.aClass5_Sub22_Sub2_1.anInt6629 != 0) {
			this.anInterface10_2.method8855(this.aClass5_Sub22_Sub2_1.aByteArray71, 24, this.aClass5_Sub22_Sub2_1.anInt6629);
			arg0.method7396(null, this.aClass18_1, this.aClass18_2, this.aClass18_3);
			arg0.method7338(this.aClass5_Sub22_Sub2_1.anInt6629 / 24);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!rs;)V")
	private void method4170(@OriginalArg(1) Class133_Sub3 arg0) {
		arg0.method7346(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat150 != Class4_Sub2_Sub3_Sub2.lb) {
			arg0.xa(Class4_Sub2_Sub3_Sub2.lb);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!rs;IILclient!mp;)V")
	public void method4171(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class235 arg2) {
		if (arg0.aClass113_Sub2_3 == null) {
			return;
		}
		if (arg1 < 0) {
			this.method4168(arg0);
		} else {
			this.method4167(arg0, arg1);
		}
		@Pc(26) float local26 = arg0.aClass113_Sub2_3.aFloat108;
		@Pc(30) float local30 = arg0.aClass113_Sub2_3.aFloat109;
		@Pc(34) float local34 = arg0.aClass113_Sub2_3.aFloat102;
		@Pc(38) float local38 = arg0.aClass113_Sub2_3.aFloat105;
		try {
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = Integer.MAX_VALUE;
			@Pc(44) int local44 = 0;
			@Pc(52) Class4_Sub1 local52 = arg2.aClass287_1.aClass4_Sub1_9;
			@Pc(55) Class4_Sub1 local55;
			@Pc(87) int local87;
			for (local55 = local52.aClass4_Sub1_8; local55 != local52; local55 = local55.aClass4_Sub1_8) {
				@Pc(60) Class4_Sub1_Sub1 local60 = (Class4_Sub1_Sub1) local55;
				local87 = (int) ((float) (local60.anInt46 >> 12) * local34 + (float) (local60.anInt52 >> 12) * local30 + (float) (local60.anInt45 >> 12) * local26 + local38);
				if (local42 > local87) {
					local42 = local87;
				}
				this.anIntArray230[local40++] = local87;
				if (local87 > local44) {
					local44 = local87;
				}
			}
			@Pc(122) int local122 = local44 - local42;
			if (local122 + 2 <= 1600) {
				local122 += 2;
				local87 = 0;
			} else {
				local87 = Static172.method2668(local122) + 1 - this.anInt4599;
				local122 = (local122 >> local87) + 2;
			}
			local55 = local52.aClass4_Sub1_8;
			local40 = 0;
			@Pc(155) int local155 = -2;
			@Pc(157) boolean local157 = true;
			@Pc(159) boolean local159 = true;
			while (local55 != local52) {
				this.anInt4602 = 0;
				for (@Pc(166) int local166 = 0; local166 < local122; local166++) {
					this.anIntArray231[local166] = 0;
				}
				for (@Pc(179) int local179 = 0; local179 < 64; local179++) {
					this.anIntArray229[local179] = 0;
				}
				while (local52 != local55) {
					@Pc(197) Class4_Sub1_Sub1 local197 = (Class4_Sub1_Sub1) local55;
					if (local159) {
						local157 = local197.aBoolean3;
						local155 = local197.anInt48;
						local159 = false;
					}
					if (local40 > 0 && (local155 != local197.anInt48 || local197.aBoolean3 != local157)) {
						local159 = true;
						break;
					}
					@Pc(240) int local240 = this.anIntArray230[local40++] - local42 >> local87;
					if (local240 < 1600) {
						if (this.anIntArray231[local240] < 64) {
							this.aClass4_Sub1_Sub1ArrayArray1[local240][this.anIntArray231[local240]++] = local197;
						} else {
							label102: {
								if (this.anIntArray231[local240] == 64) {
									if (this.anInt4602 == 64) {
										break label102;
									}
									this.anIntArray231[local240] += this.anInt4602++ + 1;
								}
								@Pc(312) Class4_Sub1_Sub1[] local312 = this.aClass4_Sub1_Sub1ArrayArray2[this.anIntArray231[local240] - 64 - 1];
								@Pc(322) int local322 = this.anIntArray231[local240] - 1 - 64;
								@Pc(324) int local324 = this.anIntArray229[this.anIntArray231[local240] - 1 - 64];
								this.anIntArray229[local322] = this.anIntArray229[this.anIntArray231[local240] - 1 - 64] + 1;
								local312[local324] = local197;
							}
						}
					}
					local55 = local55.aClass4_Sub1_8;
				}
				if (local155 >= 0) {
					arg0.method7395(local155);
				} else {
					arg0.method7395(-1);
				}
				if (local157 && Class4_Sub2_Sub3_Sub2.lb != arg0.aFloat150) {
					arg0.xa(Class4_Sub2_Sub3_Sub2.lb);
				} else if (arg0.aFloat150 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method4169(arg0, local122);
			}
		} catch (@Pc(380) Exception local380) {
		}
		this.method4170(arg0);
	}
}
