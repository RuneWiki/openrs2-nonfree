import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class359 {

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "Lclient!ib;")
	private Class170 aClass170_12;

	@OriginalMember(owner = "client!tp", name = "s", descriptor = "Lclient!kw;")
	private Interface13 anInterface13_5;

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "Lclient!ib;")
	private Class170 aClass170_13;

	@OriginalMember(owner = "client!tp", name = "t", descriptor = "Lclient!ib;")
	private Class170 aClass170_14;

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "[F")
	private final float[] aFloatArray60 = new float[16];

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "Lclient!hq;")
	private final Class2_Sub20_Sub1 aClass2_Sub20_Sub1_2 = new Class2_Sub20_Sub1(786336);

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
	private final int anInt9574 = Static496.method7088(1600);

	@OriginalMember(owner = "client!tp", name = "w", descriptor = "[I")
	private final int[] anIntArray695 = new int[1600];

	@OriginalMember(owner = "client!tp", name = "v", descriptor = "[I")
	private final int[] anIntArray694 = new int[8191];

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "[[Lclient!aca;")
	private final Class4_Sub1_Sub1[][] aClass4_Sub1_Sub1ArrayArray3 = new Class4_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "[I")
	private final int[] anIntArray696 = new int[64];

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "[[Lclient!aca;")
	private final Class4_Sub1_Sub1[][] aClass4_Sub1_Sub1ArrayArray4 = new Class4_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
	private int anInt9575 = 0;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!uja;B)V")
	private void method8440(@OriginalArg(0) Class145_Sub3 arg0) {
		Static700.aFloat176 = arg0.aFloat158;
		arg0.method8888();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method8905(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(Lclient!uja;B)V")
	public void method8442(@OriginalArg(0) Class145_Sub3 arg0) {
		this.anInterface13_5 = arg0.method8915(196584, 24, (byte[]) null, true);
		this.aClass170_14 = new Class170(this.anInterface13_5, 5126, 2, 0);
		this.aClass170_13 = new Class170(this.anInterface13_5, 5126, 3, 8);
		this.aClass170_12 = new Class170(this.anInterface13_5, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!mb;Lclient!uja;ZI)V")
	public void method8443(@OriginalArg(0) Class236 arg0, @OriginalArg(1) Class145_Sub3 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aClass86_Sub1_3 == null) {
			return;
		}
		if (arg2 < 0) {
			this.method8440(arg1);
		} else {
			this.method8444(arg2, arg1);
		}
		@Pc(34) float local34 = arg1.aClass86_Sub1_3.aFloat12;
		@Pc(38) float local38 = arg1.aClass86_Sub1_3.aFloat20;
		@Pc(42) float local42 = arg1.aClass86_Sub1_3.aFloat19;
		@Pc(46) float local46 = arg1.aClass86_Sub1_3.aFloat22;
		try {
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = Integer.MAX_VALUE;
			@Pc(52) int local52 = 0;
			@Pc(56) Class4_Sub1 local56 = arg0.aClass58_1.aClass4_Sub1_5;
			@Pc(59) Class4_Sub1 local59;
			@Pc(91) int local91;
			for (local59 = local56.aClass4_Sub1_9; local59 != local56; local59 = local59.aClass4_Sub1_9) {
				@Pc(64) Class4_Sub1_Sub1 local64 = (Class4_Sub1_Sub1) local59;
				local91 = (int) (local38 * (float) (local64.anInt5786 >> 12) + (float) (local64.anInt5792 >> 12) * local34 + (float) (local64.anInt5791 >> 12) * local42 + local46);
				this.anIntArray694[local48++] = local91;
				if (local50 > local91) {
					local50 = local91;
				}
				if (local91 > local52) {
					local52 = local91;
				}
			}
			@Pc(118) int local118 = local52 - local50;
			if (local118 + 2 <= 1600) {
				local91 = 0;
				local118 += 2;
			} else {
				local91 = Static496.method7088(local118) + 1 - this.anInt9574;
				local118 = (local118 >> local91) + 2;
			}
			local48 = 0;
			local59 = local56.aClass4_Sub1_9;
			@Pc(151) int local151 = -2;
			@Pc(153) boolean local153 = true;
			@Pc(155) boolean local155 = true;
			while (local59 != local56) {
				this.anInt9575 = 0;
				for (@Pc(164) int local164 = 0; local164 < local118; local164++) {
					this.anIntArray695[local164] = 0;
				}
				for (@Pc(183) int local183 = 0; local183 < 64; local183++) {
					this.anIntArray696[local183] = 0;
				}
				while (local56 != local59) {
					@Pc(209) Class4_Sub1_Sub1 local209 = (Class4_Sub1_Sub1) local59;
					if (local155) {
						local151 = local209.anInt5789;
						local153 = local209.aBoolean490;
						local155 = false;
					}
					if (local48 > 0 && (local209.anInt5789 != local151 || local209.aBoolean490 != local153)) {
						local155 = true;
						break;
					}
					@Pc(252) int local252 = this.anIntArray694[local48++] - local50 >> local91;
					if (local252 < 1600) {
						if (this.anIntArray695[local252] < 64) {
							this.aClass4_Sub1_Sub1ArrayArray3[local252][this.anIntArray695[local252]++] = local209;
						} else {
							label101: {
								if (this.anIntArray695[local252] == 64) {
									if (this.anInt9575 == 64) {
										break label101;
									}
									this.anIntArray695[local252] += this.anInt9575++ + 1;
								}
								this.aClass4_Sub1_Sub1ArrayArray4[this.anIntArray695[local252] - 65][this.anIntArray696[this.anIntArray695[local252] - 64 - 1]++] = local209;
							}
						}
					}
					local59 = local59.aClass4_Sub1_9;
				}
				if (local151 < 0) {
					arg1.method8881(-1);
				} else {
					arg1.method8881(local151);
				}
				if (local153 && arg1.aFloat158 != Static700.aFloat176) {
					arg1.xa(Static700.aFloat176);
				} else if (arg1.aFloat158 != 1.0F) {
					arg1.xa(1.0F);
				}
				this.method8445(local118, arg1);
			}
		} catch (@Pc(407) Exception local407) {
		}
		this.method8446(arg1);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILclient!uja;I)V")
	private void method8444(@OriginalArg(0) int arg0, @OriginalArg(1) Class145_Sub3 arg1) {
		Static700.aFloat176 = arg1.aFloat158;
		arg1.method8862((float) arg0);
		arg1.method8868();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method8905(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IILclient!uja;)V")
	private void method8445(@OriginalArg(0) int arg0, @OriginalArg(2) Class145_Sub3 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray60, 0);
		@Pc(15) float local15 = this.aFloatArray60[0];
		@Pc(20) float local20 = this.aFloatArray60[4];
		@Pc(25) float local25 = this.aFloatArray60[8];
		@Pc(30) float local30 = this.aFloatArray60[1];
		@Pc(35) float local35 = this.aFloatArray60[5];
		@Pc(40) float local40 = this.aFloatArray60[9];
		@Pc(44) float local44 = local30 + local15;
		@Pc(48) float local48 = local35 + local20;
		@Pc(59) float local59 = local40 + local25;
		@Pc(64) float local64 = local15 - local30;
		@Pc(69) float local69 = local20 - local35;
		@Pc(73) float local73 = local25 - local40;
		@Pc(78) float local78 = local30 - local15;
		@Pc(83) float local83 = local35 - local20;
		@Pc(87) float local87 = local40 - local25;
		this.aClass2_Sub20_Sub1_2.anInt9723 = 0;
		@Pc(98) int local98;
		@Pc(118) int local118;
		@Pc(127) int local127;
		@Pc(138) Class4_Sub1_Sub1 local138;
		@Pc(141) int local141;
		@Pc(146) byte local146;
		@Pc(151) byte local151;
		@Pc(154) byte local154;
		@Pc(159) byte local159;
		@Pc(165) float local165;
		@Pc(171) float local171;
		@Pc(177) float local177;
		@Pc(182) int local182;
		@Pc(520) float local520;
		@Pc(525) int local525;
		@Pc(465) int local465;
		@Pc(481) Class4_Sub1_Sub1 local481;
		@Pc(484) int local484;
		@Pc(497) byte local497;
		@Pc(502) byte local502;
		@Pc(514) float local514;
		if (arg1.aBoolean872) {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local118 = this.anIntArray695[local98] <= 64 ? this.anIntArray695[local98] : 64;
				if (local118 > 0) {
					for (local127 = local118 - 1; local127 >= 0; local127--) {
						local138 = this.aClass4_Sub1_Sub1ArrayArray3[local98][local127];
						local141 = local138.anInt5784;
						local146 = (byte) (local141 >> 16);
						local151 = (byte) (local141 >> 8);
						local154 = (byte) local141;
						local159 = (byte) (local141 >>> 24);
						local165 = (float) (local138.anInt5792 >> 12);
						local171 = (float) (local138.anInt5786 >> 12);
						local177 = (float) (local138.anInt5791 >> 12);
						local182 = local138.anInt5793 >> 12;
						this.aClass2_Sub20_Sub1_2.method3563(0.0F);
						this.aClass2_Sub20_Sub1_2.method3563(0.0F);
						this.aClass2_Sub20_Sub1_2.method3563(local44 * (float) -local182 + local165);
						this.aClass2_Sub20_Sub1_2.method3563(local171 + local48 * (float) -local182);
						this.aClass2_Sub20_Sub1_2.method3563(local177 + (float) -local182 * local59);
						this.aClass2_Sub20_Sub1_2.method8584(local146);
						this.aClass2_Sub20_Sub1_2.method8584(local151);
						this.aClass2_Sub20_Sub1_2.method8584(local154);
						this.aClass2_Sub20_Sub1_2.method8584(local159);
						this.aClass2_Sub20_Sub1_2.method3563(1.0F);
						this.aClass2_Sub20_Sub1_2.method3563(0.0F);
						this.aClass2_Sub20_Sub1_2.method3563(local64 * (float) local182 + local165);
						this.aClass2_Sub20_Sub1_2.method3563((float) local182 * local69 + local171);
						this.aClass2_Sub20_Sub1_2.method3563(local177 + (float) local182 * local73);
						this.aClass2_Sub20_Sub1_2.method8584(local146);
						this.aClass2_Sub20_Sub1_2.method8584(local151);
						this.aClass2_Sub20_Sub1_2.method8584(local154);
						this.aClass2_Sub20_Sub1_2.method8584(local159);
						this.aClass2_Sub20_Sub1_2.method3563(1.0F);
						this.aClass2_Sub20_Sub1_2.method3563(1.0F);
						this.aClass2_Sub20_Sub1_2.method3563((float) local182 * local44 + local165);
						this.aClass2_Sub20_Sub1_2.method3563(local48 * (float) local182 + local171);
						this.aClass2_Sub20_Sub1_2.method3563((float) local182 * local59 + local177);
						this.aClass2_Sub20_Sub1_2.method8584(local146);
						this.aClass2_Sub20_Sub1_2.method8584(local151);
						this.aClass2_Sub20_Sub1_2.method8584(local154);
						this.aClass2_Sub20_Sub1_2.method8584(local159);
						this.aClass2_Sub20_Sub1_2.method3563(0.0F);
						this.aClass2_Sub20_Sub1_2.method3563(1.0F);
						this.aClass2_Sub20_Sub1_2.method3563(local165 + local78 * (float) local182);
						this.aClass2_Sub20_Sub1_2.method3563(local171 + (float) local182 * local83);
						this.aClass2_Sub20_Sub1_2.method3563((float) local182 * local87 + local177);
						this.aClass2_Sub20_Sub1_2.method8584(local146);
						this.aClass2_Sub20_Sub1_2.method8584(local151);
						this.aClass2_Sub20_Sub1_2.method8584(local154);
						this.aClass2_Sub20_Sub1_2.method8584(local159);
					}
					if (this.anIntArray695[local98] > 64) {
						local465 = this.anIntArray695[local98] - 1 - 64;
						for (local141 = this.anIntArray696[local465] - 1; local141 >= 0; local141--) {
							local481 = this.aClass4_Sub1_Sub1ArrayArray4[local465][local141];
							local484 = local481.anInt5784;
							local154 = (byte) (local484 >> 16);
							local159 = (byte) (local484 >> 8);
							local497 = (byte) local484;
							local502 = (byte) (local484 >>> 24);
							local177 = (float) (local481.anInt5792 >> 12);
							local514 = (float) (local481.anInt5786 >> 12);
							local520 = (float) (local481.anInt5791 >> 12);
							local525 = local481.anInt5793 >> 12;
							this.aClass2_Sub20_Sub1_2.method3563(0.0F);
							this.aClass2_Sub20_Sub1_2.method3563(0.0F);
							this.aClass2_Sub20_Sub1_2.method3563(local177 + (float) -local525 * local44);
							this.aClass2_Sub20_Sub1_2.method3563(local514 + (float) -local525 * local48);
							this.aClass2_Sub20_Sub1_2.method3563(local520 + (float) -local525 * local59);
							this.aClass2_Sub20_Sub1_2.method8584(local154);
							this.aClass2_Sub20_Sub1_2.method8584(local159);
							this.aClass2_Sub20_Sub1_2.method8584(local497);
							this.aClass2_Sub20_Sub1_2.method8584(local502);
							this.aClass2_Sub20_Sub1_2.method3563(1.0F);
							this.aClass2_Sub20_Sub1_2.method3563(0.0F);
							this.aClass2_Sub20_Sub1_2.method3563(local177 + local64 * (float) local525);
							this.aClass2_Sub20_Sub1_2.method3563(local514 + (float) local525 * local69);
							this.aClass2_Sub20_Sub1_2.method3563(local73 * (float) local525 + local520);
							this.aClass2_Sub20_Sub1_2.method8584(local154);
							this.aClass2_Sub20_Sub1_2.method8584(local159);
							this.aClass2_Sub20_Sub1_2.method8584(local497);
							this.aClass2_Sub20_Sub1_2.method8584(local502);
							this.aClass2_Sub20_Sub1_2.method3563(1.0F);
							this.aClass2_Sub20_Sub1_2.method3563(1.0F);
							this.aClass2_Sub20_Sub1_2.method3563((float) local525 * local44 + local177);
							this.aClass2_Sub20_Sub1_2.method3563(local514 + (float) local525 * local48);
							this.aClass2_Sub20_Sub1_2.method3563(local59 * (float) local525 + local520);
							this.aClass2_Sub20_Sub1_2.method8584(local154);
							this.aClass2_Sub20_Sub1_2.method8584(local159);
							this.aClass2_Sub20_Sub1_2.method8584(local497);
							this.aClass2_Sub20_Sub1_2.method8584(local502);
							this.aClass2_Sub20_Sub1_2.method3563(0.0F);
							this.aClass2_Sub20_Sub1_2.method3563(1.0F);
							this.aClass2_Sub20_Sub1_2.method3563(local78 * (float) local525 + local177);
							this.aClass2_Sub20_Sub1_2.method3563(local514 + (float) local525 * local83);
							this.aClass2_Sub20_Sub1_2.method3563(local520 + local87 * (float) local525);
							this.aClass2_Sub20_Sub1_2.method8584(local154);
							this.aClass2_Sub20_Sub1_2.method8584(local159);
							this.aClass2_Sub20_Sub1_2.method8584(local497);
							this.aClass2_Sub20_Sub1_2.method8584(local502);
						}
					}
				}
			}
		} else {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local118 = this.anIntArray695[local98] <= 64 ? this.anIntArray695[local98] : 64;
				if (local118 > 0) {
					for (local127 = local118 - 1; local127 >= 0; local127--) {
						local138 = this.aClass4_Sub1_Sub1ArrayArray3[local98][local127];
						local141 = local138.anInt5784;
						local146 = (byte) (local141 >> 16);
						local151 = (byte) (local141 >> 8);
						local154 = (byte) local141;
						local159 = (byte) (local141 >>> 24);
						local165 = (float) (local138.anInt5792 >> 12);
						local171 = (float) (local138.anInt5786 >> 12);
						local177 = (float) (local138.anInt5791 >> 12);
						local182 = local138.anInt5793 >> 12;
						this.aClass2_Sub20_Sub1_2.method3565(0.0F);
						this.aClass2_Sub20_Sub1_2.method3565(0.0F);
						this.aClass2_Sub20_Sub1_2.method3565((float) -local182 * local44 + local165);
						this.aClass2_Sub20_Sub1_2.method3565(local48 * (float) -local182 + local171);
						this.aClass2_Sub20_Sub1_2.method3565((float) -local182 * local59 + local177);
						this.aClass2_Sub20_Sub1_2.method8584(local146);
						this.aClass2_Sub20_Sub1_2.method8584(local151);
						this.aClass2_Sub20_Sub1_2.method8584(local154);
						this.aClass2_Sub20_Sub1_2.method8584(local159);
						this.aClass2_Sub20_Sub1_2.method3565(1.0F);
						this.aClass2_Sub20_Sub1_2.method3565(0.0F);
						this.aClass2_Sub20_Sub1_2.method3565(local165 + local64 * (float) local182);
						this.aClass2_Sub20_Sub1_2.method3565(local171 + (float) local182 * local69);
						this.aClass2_Sub20_Sub1_2.method3565((float) local182 * local73 + local177);
						this.aClass2_Sub20_Sub1_2.method8584(local146);
						this.aClass2_Sub20_Sub1_2.method8584(local151);
						this.aClass2_Sub20_Sub1_2.method8584(local154);
						this.aClass2_Sub20_Sub1_2.method8584(local159);
						this.aClass2_Sub20_Sub1_2.method3565(1.0F);
						this.aClass2_Sub20_Sub1_2.method3565(1.0F);
						this.aClass2_Sub20_Sub1_2.method3565(local44 * (float) local182 + local165);
						this.aClass2_Sub20_Sub1_2.method3565(local171 + local48 * (float) local182);
						this.aClass2_Sub20_Sub1_2.method3565((float) local182 * local59 + local177);
						this.aClass2_Sub20_Sub1_2.method8584(local146);
						this.aClass2_Sub20_Sub1_2.method8584(local151);
						this.aClass2_Sub20_Sub1_2.method8584(local154);
						this.aClass2_Sub20_Sub1_2.method8584(local159);
						this.aClass2_Sub20_Sub1_2.method3565(0.0F);
						this.aClass2_Sub20_Sub1_2.method3565(1.0F);
						this.aClass2_Sub20_Sub1_2.method3565(local78 * (float) local182 + local165);
						this.aClass2_Sub20_Sub1_2.method3565(local171 + local83 * (float) local182);
						this.aClass2_Sub20_Sub1_2.method3565(local177 + local87 * (float) local182);
						this.aClass2_Sub20_Sub1_2.method8584(local146);
						this.aClass2_Sub20_Sub1_2.method8584(local151);
						this.aClass2_Sub20_Sub1_2.method8584(local154);
						this.aClass2_Sub20_Sub1_2.method8584(local159);
					}
					if (this.anIntArray695[local98] > 64) {
						local465 = this.anIntArray695[local98] - 1 - 64;
						for (local141 = this.anIntArray696[local465] - 1; local141 >= 0; local141--) {
							local481 = this.aClass4_Sub1_Sub1ArrayArray4[local465][local141];
							local484 = local481.anInt5784;
							local154 = (byte) (local484 >> 16);
							local159 = (byte) (local484 >> 8);
							local497 = (byte) local484;
							local502 = (byte) (local484 >>> 24);
							local177 = (float) (local481.anInt5792 >> 12);
							local514 = (float) (local481.anInt5786 >> 12);
							local520 = (float) (local481.anInt5791 >> 12);
							local525 = local481.anInt5793 >> 12;
							this.aClass2_Sub20_Sub1_2.method3565(0.0F);
							this.aClass2_Sub20_Sub1_2.method3565(0.0F);
							this.aClass2_Sub20_Sub1_2.method3565((float) -local525 * local44 + local177);
							this.aClass2_Sub20_Sub1_2.method3565((float) -local525 * local48 + local514);
							this.aClass2_Sub20_Sub1_2.method3565((float) -local525 * local59 + local520);
							this.aClass2_Sub20_Sub1_2.method8584(local154);
							this.aClass2_Sub20_Sub1_2.method8584(local159);
							this.aClass2_Sub20_Sub1_2.method8584(local497);
							this.aClass2_Sub20_Sub1_2.method8584(local502);
							this.aClass2_Sub20_Sub1_2.method3565(1.0F);
							this.aClass2_Sub20_Sub1_2.method3565(0.0F);
							this.aClass2_Sub20_Sub1_2.method3565((float) local525 * local64 + local177);
							this.aClass2_Sub20_Sub1_2.method3565(local514 + (float) local525 * local69);
							this.aClass2_Sub20_Sub1_2.method3565(local73 * (float) local525 + local520);
							this.aClass2_Sub20_Sub1_2.method8584(local154);
							this.aClass2_Sub20_Sub1_2.method8584(local159);
							this.aClass2_Sub20_Sub1_2.method8584(local497);
							this.aClass2_Sub20_Sub1_2.method8584(local502);
							this.aClass2_Sub20_Sub1_2.method3565(1.0F);
							this.aClass2_Sub20_Sub1_2.method3565(1.0F);
							this.aClass2_Sub20_Sub1_2.method3565((float) local525 * local44 + local177);
							this.aClass2_Sub20_Sub1_2.method3565(local514 + local48 * (float) local525);
							this.aClass2_Sub20_Sub1_2.method3565(local520 + (float) local525 * local59);
							this.aClass2_Sub20_Sub1_2.method8584(local154);
							this.aClass2_Sub20_Sub1_2.method8584(local159);
							this.aClass2_Sub20_Sub1_2.method8584(local497);
							this.aClass2_Sub20_Sub1_2.method8584(local502);
							this.aClass2_Sub20_Sub1_2.method3565(0.0F);
							this.aClass2_Sub20_Sub1_2.method3565(1.0F);
							this.aClass2_Sub20_Sub1_2.method3565(local177 + (float) local525 * local78);
							this.aClass2_Sub20_Sub1_2.method3565((float) local525 * local83 + local514);
							this.aClass2_Sub20_Sub1_2.method3565(local87 * (float) local525 + local520);
							this.aClass2_Sub20_Sub1_2.method8584(local154);
							this.aClass2_Sub20_Sub1_2.method8584(local159);
							this.aClass2_Sub20_Sub1_2.method8584(local497);
							this.aClass2_Sub20_Sub1_2.method8584(local502);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub20_Sub1_2.anInt9723 != 0) {
			this.anInterface13_5.method8068(24, this.aClass2_Sub20_Sub1_2.aByteArray111, this.aClass2_Sub20_Sub1_2.anInt9723);
			arg1.method8874(this.aClass170_12, this.aClass170_13, (Class170) null, this.aClass170_14);
			arg1.method8908(this.aClass2_Sub20_Sub1_2.anInt9723 / 24);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILclient!uja;)V")
	private void method8446(@OriginalArg(1) Class145_Sub3 arg0) {
		arg0.method8905(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static700.aFloat176 != arg0.aFloat158) {
			arg0.xa(Static700.aFloat176);
		}
	}
}
