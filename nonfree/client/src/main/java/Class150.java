import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class150 {

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "Lclient!kn;")
	private Class207 aClass207_10;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!kn;")
	private Class207 aClass207_11;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Lclient!ika;")
	private Interface17 anInterface17_3;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "Lclient!kn;")
	private Class207 aClass207_12;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "[F")
	private final float[] aFloatArray39 = new float[16];

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "Lclient!mka;")
	private final Class5_Sub36_Sub1 aClass5_Sub36_Sub1_1 = new Class5_Sub36_Sub1(786336);

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
	private final int anInt3728 = Static281.method4513(1600);

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
	private int anInt3729 = 0;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "[I")
	private final int[] anIntArray186 = new int[8191];

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "[[Lclient!via;")
	private final Class4_Sub4_Sub1[][] aClass4_Sub4_Sub1ArrayArray4 = new Class4_Sub4_Sub1[64][768];

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "[I")
	private final int[] anIntArray187 = new int[64];

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "[I")
	private final int[] anIntArray185 = new int[1600];

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "[[Lclient!via;")
	private final Class4_Sub4_Sub1[][] aClass4_Sub4_Sub1ArrayArray3 = new Class4_Sub4_Sub1[1600][64];

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!vf;I)V")
	private void method3407(@OriginalArg(1) Class100_Sub3 arg0, @OriginalArg(2) int arg1) {
		Static137.aFloat98 = arg0.aFloat196;
		arg0.method8703((float) arg1);
		arg0.method8733();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method8735(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!vf;I)V")
	private void method3410(@OriginalArg(0) Class100_Sub3 arg0) {
		arg0.method8735(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static137.aFloat98 != arg0.aFloat196) {
			arg0.xa(Static137.aFloat98);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLclient!vf;)V")
	private void method3412(@OriginalArg(1) Class100_Sub3 arg0) {
		Static137.aFloat98 = arg0.aFloat196;
		arg0.method8745();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method8735(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!vf;ZLclient!sn;)V")
	public void method3414(@OriginalArg(0) int arg0, @OriginalArg(1) Class100_Sub3 arg1, @OriginalArg(3) Class336 arg2) {
		if (arg1.aClass10_Sub3_3 == null) {
			return;
		}
		if (arg0 >= 0) {
			this.method3407(arg1, arg0);
		} else {
			this.method3412(arg1);
		}
		@Pc(39) float local39 = arg1.aClass10_Sub3_3.aFloat100;
		@Pc(43) float local43 = arg1.aClass10_Sub3_3.aFloat110;
		@Pc(47) float local47 = arg1.aClass10_Sub3_3.aFloat104;
		@Pc(51) float local51 = arg1.aClass10_Sub3_3.aFloat105;
		try {
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = Integer.MAX_VALUE;
			@Pc(57) int local57 = 0;
			@Pc(61) Class4_Sub4 local61 = arg2.aClass179_1.aClass4_Sub4_3;
			@Pc(72) Class4_Sub4 local72;
			@Pc(104) int local104;
			for (local72 = local61.aClass4_Sub4_10; local72 != local61; local72 = local72.aClass4_Sub4_10) {
				@Pc(77) Class4_Sub4_Sub1 local77 = (Class4_Sub4_Sub1) local72;
				local104 = (int) (local51 + (float) (local77.anInt7730 >> 12) * local39 + local43 * (float) (local77.anInt7738 >> 12) + local47 * (float) (local77.anInt7735 >> 12));
				if (local57 < local104) {
					local57 = local104;
				}
				if (local104 < local55) {
					local55 = local104;
				}
				this.anIntArray186[local53++] = local104;
			}
			@Pc(131) int local131 = local57 - local55;
			if (local131 + 2 > 1600) {
				local104 = Static281.method4513(local131) + 1 - this.anInt3728;
				local131 = (local131 >> local104) + 2;
			} else {
				local131 += 2;
				local104 = 0;
			}
			local53 = 0;
			local72 = local61.aClass4_Sub4_10;
			@Pc(163) int local163 = -2;
			@Pc(165) boolean local165 = true;
			@Pc(167) boolean local167 = true;
			while (local61 != local72) {
				this.anInt3729 = 0;
				for (@Pc(176) int local176 = 0; local176 < local131; local176++) {
					this.anIntArray185[local176] = 0;
				}
				for (@Pc(195) int local195 = 0; local195 < 64; local195++) {
					this.anIntArray187[local195] = 0;
				}
				while (local61 != local72) {
					@Pc(219) Class4_Sub4_Sub1 local219 = (Class4_Sub4_Sub1) local72;
					if (local167) {
						local167 = false;
						local165 = local219.aBoolean520;
						local163 = local219.anInt7739;
					}
					if (local53 > 0 && (local163 != local219.anInt7739 || local165 != local219.aBoolean520)) {
						local167 = true;
						break;
					}
					@Pc(275) int local275 = this.anIntArray186[local53++] - local55 >> local104;
					if (local275 < 1600) {
						if (this.anIntArray185[local275] >= 64) {
							label106: {
								if (this.anIntArray185[local275] == 64) {
									if (this.anInt3729 == 64) {
										break label106;
									}
									this.anIntArray185[local275] += this.anInt3729++ + 1;
								}
								this.aClass4_Sub4_Sub1ArrayArray4[this.anIntArray185[local275] - 1 - 64][this.anIntArray187[this.anIntArray185[local275] - 64 - 1]++] = local219;
							}
						} else {
							this.aClass4_Sub4_Sub1ArrayArray3[local275][this.anIntArray185[local275]++] = local219;
						}
					}
					local72 = local72.aClass4_Sub4_10;
				}
				if (local163 < 0) {
					arg1.method8693(-1);
				} else {
					arg1.method8693(local163);
				}
				if (local165 && Static137.aFloat98 != arg1.aFloat196) {
					arg1.xa(Static137.aFloat98);
				} else if (arg1.aFloat196 != 1.0F) {
					arg1.xa(1.0F);
				}
				this.method3415(arg1, local131);
			}
		} catch (@Pc(439) Exception local439) {
		}
		this.method3410(arg1);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!vf;IZ)V")
	private void method3415(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray39, 0);
		@Pc(22) float local22 = this.aFloatArray39[0];
		@Pc(27) float local27 = this.aFloatArray39[4];
		@Pc(32) float local32 = this.aFloatArray39[8];
		@Pc(37) float local37 = this.aFloatArray39[1];
		@Pc(42) float local42 = this.aFloatArray39[5];
		@Pc(47) float local47 = this.aFloatArray39[9];
		@Pc(51) float local51 = local37 + local22;
		@Pc(55) float local55 = local27 + local42;
		@Pc(59) float local59 = local32 + local47;
		@Pc(63) float local63 = local22 - local37;
		@Pc(68) float local68 = local27 - local42;
		@Pc(72) float local72 = local32 - local47;
		@Pc(77) float local77 = local37 - local22;
		@Pc(82) float local82 = local42 - local27;
		@Pc(87) float local87 = local47 - local32;
		this.aClass5_Sub36_Sub1_1.anInt8456 = 0;
		@Pc(98) int local98;
		@Pc(118) int local118;
		@Pc(127) int local127;
		@Pc(138) Class4_Sub4_Sub1 local138;
		@Pc(141) int local141;
		@Pc(146) byte local146;
		@Pc(151) byte local151;
		@Pc(154) byte local154;
		@Pc(159) byte local159;
		@Pc(165) float local165;
		@Pc(171) float local171;
		@Pc(177) float local177;
		@Pc(182) int local182;
		@Pc(504) float local504;
		@Pc(509) int local509;
		@Pc(449) int local449;
		@Pc(465) Class4_Sub4_Sub1 local465;
		@Pc(468) int local468;
		@Pc(481) byte local481;
		@Pc(486) byte local486;
		@Pc(498) float local498;
		if (arg0.aBoolean735) {
			for (local98 = arg1 - 1; local98 >= 0; local98--) {
				local118 = this.anIntArray185[local98] <= 64 ? this.anIntArray185[local98] : 64;
				if (local118 > 0) {
					for (local127 = local118 - 1; local127 >= 0; local127--) {
						local138 = this.aClass4_Sub4_Sub1ArrayArray3[local98][local127];
						local141 = local138.anInt7731;
						local146 = (byte) (local141 >> 16);
						local151 = (byte) (local141 >> 8);
						local154 = (byte) local141;
						local159 = (byte) (local141 >>> 24);
						local165 = (float) (local138.anInt7730 >> 12);
						local171 = (float) (local138.anInt7738 >> 12);
						local177 = (float) (local138.anInt7735 >> 12);
						local182 = local138.anInt7734 >> 12;
						this.aClass5_Sub36_Sub1_1.method5494(0.0F);
						this.aClass5_Sub36_Sub1_1.method5494(0.0F);
						this.aClass5_Sub36_Sub1_1.method5494(local51 * (float) -local182 + local165);
						this.aClass5_Sub36_Sub1_1.method5494(local171 + local55 * (float) -local182);
						this.aClass5_Sub36_Sub1_1.method5494(local177 + (float) -local182 * local59);
						this.aClass5_Sub36_Sub1_1.method7324(local146);
						this.aClass5_Sub36_Sub1_1.method7324(local151);
						this.aClass5_Sub36_Sub1_1.method7324(local154);
						this.aClass5_Sub36_Sub1_1.method7324(local159);
						this.aClass5_Sub36_Sub1_1.method5494(1.0F);
						this.aClass5_Sub36_Sub1_1.method5494(0.0F);
						this.aClass5_Sub36_Sub1_1.method5494((float) local182 * local63 + local165);
						this.aClass5_Sub36_Sub1_1.method5494(local68 * (float) local182 + local171);
						this.aClass5_Sub36_Sub1_1.method5494(local177 + (float) local182 * local72);
						this.aClass5_Sub36_Sub1_1.method7324(local146);
						this.aClass5_Sub36_Sub1_1.method7324(local151);
						this.aClass5_Sub36_Sub1_1.method7324(local154);
						this.aClass5_Sub36_Sub1_1.method7324(local159);
						this.aClass5_Sub36_Sub1_1.method5494(1.0F);
						this.aClass5_Sub36_Sub1_1.method5494(1.0F);
						this.aClass5_Sub36_Sub1_1.method5494((float) local182 * local51 + local165);
						this.aClass5_Sub36_Sub1_1.method5494(local55 * (float) local182 + local171);
						this.aClass5_Sub36_Sub1_1.method5494(local177 + (float) local182 * local59);
						this.aClass5_Sub36_Sub1_1.method7324(local146);
						this.aClass5_Sub36_Sub1_1.method7324(local151);
						this.aClass5_Sub36_Sub1_1.method7324(local154);
						this.aClass5_Sub36_Sub1_1.method7324(local159);
						this.aClass5_Sub36_Sub1_1.method5494(0.0F);
						this.aClass5_Sub36_Sub1_1.method5494(1.0F);
						this.aClass5_Sub36_Sub1_1.method5494((float) local182 * local77 + local165);
						this.aClass5_Sub36_Sub1_1.method5494((float) local182 * local82 + local171);
						this.aClass5_Sub36_Sub1_1.method5494(local177 + local87 * (float) local182);
						this.aClass5_Sub36_Sub1_1.method7324(local146);
						this.aClass5_Sub36_Sub1_1.method7324(local151);
						this.aClass5_Sub36_Sub1_1.method7324(local154);
						this.aClass5_Sub36_Sub1_1.method7324(local159);
					}
					if (this.anIntArray185[local98] > 64) {
						local449 = this.anIntArray185[local98] - 64 - 1;
						for (local141 = this.anIntArray187[local449] - 1; local141 >= 0; local141--) {
							local465 = this.aClass4_Sub4_Sub1ArrayArray4[local449][local141];
							local468 = local465.anInt7731;
							local154 = (byte) (local468 >> 16);
							local159 = (byte) (local468 >> 8);
							local481 = (byte) local468;
							local486 = (byte) (local468 >>> 24);
							local177 = (float) (local465.anInt7730 >> 12);
							local498 = (float) (local465.anInt7738 >> 12);
							local504 = (float) (local465.anInt7735 >> 12);
							local509 = local465.anInt7734 >> 12;
							this.aClass5_Sub36_Sub1_1.method5494(0.0F);
							this.aClass5_Sub36_Sub1_1.method5494(0.0F);
							this.aClass5_Sub36_Sub1_1.method5494((float) -local509 * local51 + local177);
							this.aClass5_Sub36_Sub1_1.method5494(local498 + local55 * (float) -local509);
							this.aClass5_Sub36_Sub1_1.method5494(local504 + local59 * (float) -local509);
							this.aClass5_Sub36_Sub1_1.method7324(local154);
							this.aClass5_Sub36_Sub1_1.method7324(local159);
							this.aClass5_Sub36_Sub1_1.method7324(local481);
							this.aClass5_Sub36_Sub1_1.method7324(local486);
							this.aClass5_Sub36_Sub1_1.method5494(1.0F);
							this.aClass5_Sub36_Sub1_1.method5494(0.0F);
							this.aClass5_Sub36_Sub1_1.method5494((float) local509 * local63 + local177);
							this.aClass5_Sub36_Sub1_1.method5494((float) local509 * local68 + local498);
							this.aClass5_Sub36_Sub1_1.method5494(local72 * (float) local509 + local504);
							this.aClass5_Sub36_Sub1_1.method7324(local154);
							this.aClass5_Sub36_Sub1_1.method7324(local159);
							this.aClass5_Sub36_Sub1_1.method7324(local481);
							this.aClass5_Sub36_Sub1_1.method7324(local486);
							this.aClass5_Sub36_Sub1_1.method5494(1.0F);
							this.aClass5_Sub36_Sub1_1.method5494(1.0F);
							this.aClass5_Sub36_Sub1_1.method5494(local177 + (float) local509 * local51);
							this.aClass5_Sub36_Sub1_1.method5494((float) local509 * local55 + local498);
							this.aClass5_Sub36_Sub1_1.method5494((float) local509 * local59 + local504);
							this.aClass5_Sub36_Sub1_1.method7324(local154);
							this.aClass5_Sub36_Sub1_1.method7324(local159);
							this.aClass5_Sub36_Sub1_1.method7324(local481);
							this.aClass5_Sub36_Sub1_1.method7324(local486);
							this.aClass5_Sub36_Sub1_1.method5494(0.0F);
							this.aClass5_Sub36_Sub1_1.method5494(1.0F);
							this.aClass5_Sub36_Sub1_1.method5494((float) local509 * local77 + local177);
							this.aClass5_Sub36_Sub1_1.method5494(local498 + local82 * (float) local509);
							this.aClass5_Sub36_Sub1_1.method5494(local87 * (float) local509 + local504);
							this.aClass5_Sub36_Sub1_1.method7324(local154);
							this.aClass5_Sub36_Sub1_1.method7324(local159);
							this.aClass5_Sub36_Sub1_1.method7324(local481);
							this.aClass5_Sub36_Sub1_1.method7324(local486);
						}
					}
				}
			}
		} else {
			for (local98 = arg1 - 1; local98 >= 0; local98--) {
				local118 = this.anIntArray185[local98] > 64 ? 64 : this.anIntArray185[local98];
				if (local118 > 0) {
					for (local127 = local118 - 1; local127 >= 0; local127--) {
						local138 = this.aClass4_Sub4_Sub1ArrayArray3[local98][local127];
						local141 = local138.anInt7731;
						local146 = (byte) (local141 >> 16);
						local151 = (byte) (local141 >> 8);
						local154 = (byte) local141;
						local159 = (byte) (local141 >>> 24);
						local165 = (float) (local138.anInt7730 >> 12);
						local171 = (float) (local138.anInt7738 >> 12);
						local177 = (float) (local138.anInt7735 >> 12);
						local182 = local138.anInt7734 >> 12;
						this.aClass5_Sub36_Sub1_1.method5496(0.0F);
						this.aClass5_Sub36_Sub1_1.method5496(0.0F);
						this.aClass5_Sub36_Sub1_1.method5496(local165 + local51 * (float) -local182);
						this.aClass5_Sub36_Sub1_1.method5496((float) -local182 * local55 + local171);
						this.aClass5_Sub36_Sub1_1.method5496((float) -local182 * local59 + local177);
						this.aClass5_Sub36_Sub1_1.method7324(local146);
						this.aClass5_Sub36_Sub1_1.method7324(local151);
						this.aClass5_Sub36_Sub1_1.method7324(local154);
						this.aClass5_Sub36_Sub1_1.method7324(local159);
						this.aClass5_Sub36_Sub1_1.method5496(1.0F);
						this.aClass5_Sub36_Sub1_1.method5496(0.0F);
						this.aClass5_Sub36_Sub1_1.method5496(local165 + local63 * (float) local182);
						this.aClass5_Sub36_Sub1_1.method5496((float) local182 * local68 + local171);
						this.aClass5_Sub36_Sub1_1.method5496(local177 + (float) local182 * local72);
						this.aClass5_Sub36_Sub1_1.method7324(local146);
						this.aClass5_Sub36_Sub1_1.method7324(local151);
						this.aClass5_Sub36_Sub1_1.method7324(local154);
						this.aClass5_Sub36_Sub1_1.method7324(local159);
						this.aClass5_Sub36_Sub1_1.method5496(1.0F);
						this.aClass5_Sub36_Sub1_1.method5496(1.0F);
						this.aClass5_Sub36_Sub1_1.method5496(local165 + local51 * (float) local182);
						this.aClass5_Sub36_Sub1_1.method5496(local171 + (float) local182 * local55);
						this.aClass5_Sub36_Sub1_1.method5496((float) local182 * local59 + local177);
						this.aClass5_Sub36_Sub1_1.method7324(local146);
						this.aClass5_Sub36_Sub1_1.method7324(local151);
						this.aClass5_Sub36_Sub1_1.method7324(local154);
						this.aClass5_Sub36_Sub1_1.method7324(local159);
						this.aClass5_Sub36_Sub1_1.method5496(0.0F);
						this.aClass5_Sub36_Sub1_1.method5496(1.0F);
						this.aClass5_Sub36_Sub1_1.method5496(local165 + local77 * (float) local182);
						this.aClass5_Sub36_Sub1_1.method5496(local171 + (float) local182 * local82);
						this.aClass5_Sub36_Sub1_1.method5496(local177 + (float) local182 * local87);
						this.aClass5_Sub36_Sub1_1.method7324(local146);
						this.aClass5_Sub36_Sub1_1.method7324(local151);
						this.aClass5_Sub36_Sub1_1.method7324(local154);
						this.aClass5_Sub36_Sub1_1.method7324(local159);
					}
					if (this.anIntArray185[local98] > 64) {
						local449 = this.anIntArray185[local98] - 65;
						for (local141 = this.anIntArray187[local449] - 1; local141 >= 0; local141--) {
							local465 = this.aClass4_Sub4_Sub1ArrayArray4[local449][local141];
							local468 = local465.anInt7731;
							local154 = (byte) (local468 >> 16);
							local159 = (byte) (local468 >> 8);
							local481 = (byte) local468;
							local486 = (byte) (local468 >>> 24);
							local177 = (float) (local465.anInt7730 >> 12);
							local498 = (float) (local465.anInt7738 >> 12);
							local504 = (float) (local465.anInt7735 >> 12);
							local509 = local465.anInt7734 >> 12;
							this.aClass5_Sub36_Sub1_1.method5496(0.0F);
							this.aClass5_Sub36_Sub1_1.method5496(0.0F);
							this.aClass5_Sub36_Sub1_1.method5496(local177 + (float) -local509 * local51);
							this.aClass5_Sub36_Sub1_1.method5496((float) -local509 * local55 + local498);
							this.aClass5_Sub36_Sub1_1.method5496(local59 * (float) -local509 + local504);
							this.aClass5_Sub36_Sub1_1.method7324(local154);
							this.aClass5_Sub36_Sub1_1.method7324(local159);
							this.aClass5_Sub36_Sub1_1.method7324(local481);
							this.aClass5_Sub36_Sub1_1.method7324(local486);
							this.aClass5_Sub36_Sub1_1.method5496(1.0F);
							this.aClass5_Sub36_Sub1_1.method5496(0.0F);
							this.aClass5_Sub36_Sub1_1.method5496(local177 + local63 * (float) local509);
							this.aClass5_Sub36_Sub1_1.method5496(local498 + (float) local509 * local68);
							this.aClass5_Sub36_Sub1_1.method5496((float) local509 * local72 + local504);
							this.aClass5_Sub36_Sub1_1.method7324(local154);
							this.aClass5_Sub36_Sub1_1.method7324(local159);
							this.aClass5_Sub36_Sub1_1.method7324(local481);
							this.aClass5_Sub36_Sub1_1.method7324(local486);
							this.aClass5_Sub36_Sub1_1.method5496(1.0F);
							this.aClass5_Sub36_Sub1_1.method5496(1.0F);
							this.aClass5_Sub36_Sub1_1.method5496(local177 + (float) local509 * local51);
							this.aClass5_Sub36_Sub1_1.method5496((float) local509 * local55 + local498);
							this.aClass5_Sub36_Sub1_1.method5496(local504 + local59 * (float) local509);
							this.aClass5_Sub36_Sub1_1.method7324(local154);
							this.aClass5_Sub36_Sub1_1.method7324(local159);
							this.aClass5_Sub36_Sub1_1.method7324(local481);
							this.aClass5_Sub36_Sub1_1.method7324(local486);
							this.aClass5_Sub36_Sub1_1.method5496(0.0F);
							this.aClass5_Sub36_Sub1_1.method5496(1.0F);
							this.aClass5_Sub36_Sub1_1.method5496(local177 + local77 * (float) local509);
							this.aClass5_Sub36_Sub1_1.method5496((float) local509 * local82 + local498);
							this.aClass5_Sub36_Sub1_1.method5496(local504 + local87 * (float) local509);
							this.aClass5_Sub36_Sub1_1.method7324(local154);
							this.aClass5_Sub36_Sub1_1.method7324(local159);
							this.aClass5_Sub36_Sub1_1.method7324(local481);
							this.aClass5_Sub36_Sub1_1.method7324(local486);
						}
					}
				}
			}
		}
		if (this.aClass5_Sub36_Sub1_1.anInt8456 != 0) {
			this.anInterface17_3.method8313(this.aClass5_Sub36_Sub1_1.anInt8456, this.aClass5_Sub36_Sub1_1.aByteArray89, 24);
			arg0.method8727(this.aClass207_12, this.aClass207_10, this.aClass207_11, (Class207) null);
			arg0.method8696(this.aClass5_Sub36_Sub1_1.anInt8456 / 24);
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(Lclient!vf;I)V")
	public void method3416(@OriginalArg(0) Class100_Sub3 arg0) {
		this.anInterface17_3 = arg0.method8734(196584, (byte[]) null, 24, true);
		this.aClass207_10 = new Class207(this.anInterface17_3, 5126, 2, 0);
		this.aClass207_11 = new Class207(this.anInterface17_3, 5126, 3, 8);
		this.aClass207_12 = new Class207(this.anInterface17_3, 5121, 4, 20);
	}
}
