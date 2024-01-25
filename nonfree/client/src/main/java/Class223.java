import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class223 {

	@OriginalMember(owner = "client!or", name = "i", descriptor = "Lclient!maa;")
	private Class188 aClass188_2;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "Lclient!maa;")
	private Class188 aClass188_3;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "Lclient!maa;")
	private Class188 aClass188_4;

	@OriginalMember(owner = "client!or", name = "n", descriptor = "Lclient!sp;")
	private Interface16 anInterface16_2;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "[F")
	private final float[] aFloatArray54 = new float[16];

	@OriginalMember(owner = "client!or", name = "d", descriptor = "Lclient!eo;")
	private final Class1_Sub13_Sub1 aClass1_Sub13_Sub1_1 = new Class1_Sub13_Sub1(786336);

	@OriginalMember(owner = "client!or", name = "l", descriptor = "I")
	private final int anInt6442 = Static124.method4359(1600);

	@OriginalMember(owner = "client!or", name = "r", descriptor = "[I")
	private final int[] anIntArray483 = new int[1600];

	@OriginalMember(owner = "client!or", name = "p", descriptor = "[[Lclient!si;")
	private final Class2_Sub4_Sub1[][] aClass2_Sub4_Sub1ArrayArray1 = new Class2_Sub4_Sub1[64][768];

	@OriginalMember(owner = "client!or", name = "o", descriptor = "I")
	private int anInt6443 = 0;

	@OriginalMember(owner = "client!or", name = "s", descriptor = "[[Lclient!si;")
	private final Class2_Sub4_Sub1[][] aClass2_Sub4_Sub1ArrayArray2 = new Class2_Sub4_Sub1[1600][64];

	@OriginalMember(owner = "client!or", name = "u", descriptor = "[I")
	private final int[] anIntArray485 = new int[8191];

	@OriginalMember(owner = "client!or", name = "t", descriptor = "[I")
	private final int[] anIntArray484 = new int[64];

	static {
		new Class114(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!te;B)V")
	public void method5595(@OriginalArg(0) Class9_Sub3 arg0) {
		this.anInterface16_2 = arg0.method6729(null, true, 196584, 24);
		this.aClass188_4 = new Class188(this.anInterface16_2, 5126, 2, 0);
		this.aClass188_3 = new Class188(this.anInterface16_2, 5126, 3, 8);
		this.aClass188_2 = new Class188(this.anInterface16_2, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!rd;ILclient!te;)V")
	public void method5596(@OriginalArg(0) Class249 arg0, @OriginalArg(2) Class9_Sub3 arg1) {
		if (arg1.aClass22_Sub2_4 == null) {
			return;
		}
		this.method5598(arg1);
		@Pc(23) float local23 = arg1.aClass22_Sub2_4.aFloat62;
		@Pc(27) float local27 = arg1.aClass22_Sub2_4.aFloat70;
		@Pc(31) float local31 = arg1.aClass22_Sub2_4.aFloat69;
		@Pc(35) float local35 = arg1.aClass22_Sub2_4.aFloat61;
		try {
			@Pc(45) int local45;
			@Pc(54) int local54;
			@Pc(79) Class2_Sub4 local79;
			@Pc(92) int local92;
			@Pc(241) Class2_Sub4_Sub1[] local241;
			@Pc(191) int local191;
			@Pc(251) int local251;
			@Pc(253) int local253;
			if (arg0.aBoolean474) {
				local45 = arg0.anInt7170 - arg0.anInt7171;
				if (local45 + 2 <= 1600) {
					local54 = 0;
					local45 += 2;
				} else {
					local54 = Static124.method4359(local45) + 1 - this.anInt6442;
					local45 = (local45 >> local54) + 2;
				}
				@Pc(76) Class2_Sub4 local76 = arg0.aClass120_1.aClass2_Sub4_7;
				local79 = local76.aClass2_Sub4_9;
				@Pc(81) int local81 = -2;
				@Pc(83) boolean local83 = true;
				@Pc(85) boolean local85 = true;
				while (local79 != local76) {
					this.anInt6443 = 0;
					for (local92 = 0; local92 < local45; local92++) {
						this.anIntArray483[local92] = 0;
					}
					for (@Pc(105) int local105 = 0; local105 < 64; local105++) {
						this.anIntArray484[local105] = 0;
					}
					while (local79 != local76) {
						@Pc(123) Class2_Sub4_Sub1 local123 = (Class2_Sub4_Sub1) local79;
						if (local85) {
							local83 = local123.aBoolean179;
							local85 = false;
							local81 = local123.anInt2552;
						} else if (local81 != local123.anInt2552 || local123.aBoolean179 != local83) {
							local85 = true;
							break;
						}
						local191 = (int) ((float) (local123.anInt2551 >> 12) * local23 + (float) (local123.anInt2549 >> 12) * local27 + local31 * (float) (local123.anInt2546 >> 12) + local35) - arg0.anInt7171 >> local54;
						if (local191 < 1600) {
							if (this.anIntArray483[local191] >= 64) {
								label197: {
									if (this.anIntArray483[local191] == 64) {
										if (this.anInt6443 == 64) {
											break label197;
										}
										this.anIntArray483[local191] += this.anInt6443++ + 1;
									}
									local241 = this.aClass2_Sub4_Sub1ArrayArray1[this.anIntArray483[local191] - 1 - 64];
									local251 = this.anIntArray483[local191] - 64 - 1;
									local253 = this.anIntArray484[this.anIntArray483[local191] - 64 - 1];
									this.anIntArray484[local251] = this.anIntArray484[this.anIntArray483[local191] - 64 - 1] + 1;
									local241[local253] = local123;
								}
							} else {
								this.aClass2_Sub4_Sub1ArrayArray2[local191][this.anIntArray483[local191]++] = local123;
							}
						}
						local79 = local79.aClass2_Sub4_9;
					}
					if (local81 < 0) {
						arg1.method6672(-1);
					} else {
						arg1.method6672(local81);
					}
					if (local83 && arg1.aFloat157 != Static547.aFloat206) {
						arg1.M(Static547.aFloat206);
					} else if (arg1.aFloat157 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method5599(arg1, local45);
				}
			} else {
				local45 = 0;
				local54 = Integer.MAX_VALUE;
				@Pc(330) int local330 = 0;
				local79 = arg0.aClass120_1.aClass2_Sub4_7;
				@Pc(337) Class2_Sub4 local337;
				@Pc(369) int local369;
				for (local337 = local79.aClass2_Sub4_9; local337 != local79; local337 = local337.aClass2_Sub4_9) {
					@Pc(342) Class2_Sub4_Sub1 local342 = (Class2_Sub4_Sub1) local337;
					local369 = (int) (local27 * (float) (local342.anInt2549 >> 12) + local23 * (float) (local342.anInt2551 >> 12) + (float) (local342.anInt2546 >> 12) * local31 + local35);
					if (local369 < local54) {
						local54 = local369;
					}
					this.anIntArray485[local45++] = local369;
					if (local330 < local369) {
						local330 = local369;
					}
				}
				@Pc(404) int local404 = local330 - local54;
				if (local404 + 2 > 1600) {
					local369 = Static124.method4359(local404) + 1 - this.anInt6442;
					local404 = (local404 >> local369) + 2;
				} else {
					local404 += 2;
					local369 = 0;
				}
				local337 = local79.aClass2_Sub4_9;
				local45 = 0;
				local92 = -2;
				@Pc(441) boolean local441 = true;
				@Pc(443) boolean local443 = true;
				while (local337 != local79) {
					this.anInt6443 = 0;
					for (local191 = 0; local191 < local404; local191++) {
						this.anIntArray483[local191] = 0;
					}
					for (@Pc(467) int local467 = 0; local467 < 64; local467++) {
						this.anIntArray484[local467] = 0;
					}
					while (local337 != local79) {
						@Pc(483) Class2_Sub4_Sub1 local483 = (Class2_Sub4_Sub1) local337;
						if (local443) {
							local443 = false;
							local92 = local483.anInt2552;
							local441 = local483.aBoolean179;
						}
						if (local45 > 0 && (local483.anInt2552 != local92 || local483.aBoolean179 != local441)) {
							local443 = true;
							break;
						}
						@Pc(529) int local529 = this.anIntArray485[local45++] - local54 >> local369;
						if (local529 < 1600) {
							if (this.anIntArray483[local529] < 64) {
								this.aClass2_Sub4_Sub1ArrayArray2[local529][this.anIntArray483[local529]++] = local483;
							} else {
								label147: {
									if (this.anIntArray483[local529] == 64) {
										if (this.anInt6443 == 64) {
											break label147;
										}
										this.anIntArray483[local529] += this.anInt6443++ + 1;
									}
									local241 = this.aClass2_Sub4_Sub1ArrayArray1[this.anIntArray483[local529] - 64 - 1];
									local251 = this.anIntArray483[local529] - 64 - 1;
									local253 = this.anIntArray484[this.anIntArray483[local529] - 64 - 1];
									this.anIntArray484[local251] = this.anIntArray484[this.anIntArray483[local529] - 64 - 1] + 1;
									local241[local253] = local483;
								}
							}
						}
						local337 = local337.aClass2_Sub4_9;
					}
					if (local92 < 0) {
						arg1.method6672(-1);
					} else {
						arg1.method6672(local92);
					}
					if (local441 && arg1.aFloat157 != Static547.aFloat206) {
						arg1.M(Static547.aFloat206);
					} else if (arg1.aFloat157 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method5599(arg1, local404);
				}
			}
		} catch (@Pc(667) Exception local667) {
		}
		this.method5597(arg1);
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(Lclient!te;B)V")
	private void method5597(@OriginalArg(0) Class9_Sub3 arg0) {
		arg0.method6691(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static547.aFloat206 != arg0.aFloat157) {
			arg0.M(Static547.aFloat206);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BLclient!te;)V")
	private void method5598(@OriginalArg(1) Class9_Sub3 arg0) {
		Static547.aFloat206 = arg0.aFloat157;
		arg0.method6679();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method6691(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!te;I)V")
	private void method5599(@OriginalArg(1) Class9_Sub3 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray54, 0);
		@Pc(15) float local15 = this.aFloatArray54[0];
		@Pc(20) float local20 = this.aFloatArray54[4];
		@Pc(25) float local25 = this.aFloatArray54[8];
		@Pc(30) float local30 = this.aFloatArray54[1];
		@Pc(35) float local35 = this.aFloatArray54[5];
		@Pc(40) float local40 = this.aFloatArray54[9];
		@Pc(44) float local44 = local30 + local15;
		@Pc(48) float local48 = local20 + local35;
		@Pc(52) float local52 = local40 + local25;
		@Pc(57) float local57 = local15 - local30;
		@Pc(62) float local62 = local20 - local35;
		@Pc(66) float local66 = local25 - local40;
		@Pc(71) float local71 = local30 - local15;
		@Pc(76) float local76 = local35 - local20;
		this.aClass1_Sub13_Sub1_1.anInt3400 = 0;
		@Pc(84) float local84 = local40 - local25;
		@Pc(91) int local91;
		@Pc(106) int local106;
		@Pc(115) int local115;
		@Pc(124) Class2_Sub4_Sub1 local124;
		@Pc(127) int local127;
		@Pc(132) byte local132;
		@Pc(137) byte local137;
		@Pc(140) byte local140;
		@Pc(145) byte local145;
		@Pc(151) float local151;
		@Pc(157) float local157;
		@Pc(163) float local163;
		@Pc(168) int local168;
		@Pc(492) float local492;
		@Pc(497) int local497;
		@Pc(437) int local437;
		@Pc(453) Class2_Sub4_Sub1 local453;
		@Pc(456) int local456;
		@Pc(469) byte local469;
		@Pc(474) byte local474;
		@Pc(486) float local486;
		if (arg0.aBoolean523) {
			for (local91 = arg1 - 1; local91 >= 0; local91--) {
				local106 = this.anIntArray483[local91] > 64 ? 64 : this.anIntArray483[local91];
				if (local106 > 0) {
					for (local115 = local106 - 1; local115 >= 0; local115--) {
						local124 = this.aClass2_Sub4_Sub1ArrayArray2[local91][local115];
						local127 = local124.anInt2550;
						local132 = (byte) (local127 >> 16);
						local137 = (byte) (local127 >> 8);
						local140 = (byte) local127;
						local145 = (byte) (local127 >>> 24);
						local151 = local124.anInt2551 >> 12;
						local157 = local124.anInt2549 >> 12;
						local163 = local124.anInt2546 >> 12;
						local168 = local124.anInt2553 >> 12;
						this.aClass1_Sub13_Sub1_1.method2612(0.0F);
						this.aClass1_Sub13_Sub1_1.method2612(0.0F);
						this.aClass1_Sub13_Sub1_1.method2612(local151 + local44 * (float) -local168);
						this.aClass1_Sub13_Sub1_1.method2612(local157 + local48 * (float) -local168);
						this.aClass1_Sub13_Sub1_1.method2612((float) -local168 * local52 + local163);
						this.aClass1_Sub13_Sub1_1.method3060(local132);
						this.aClass1_Sub13_Sub1_1.method3060(local137);
						this.aClass1_Sub13_Sub1_1.method3060(local140);
						this.aClass1_Sub13_Sub1_1.method3060(local145);
						this.aClass1_Sub13_Sub1_1.method2612(1.0F);
						this.aClass1_Sub13_Sub1_1.method2612(0.0F);
						this.aClass1_Sub13_Sub1_1.method2612((float) local168 * local57 + local151);
						this.aClass1_Sub13_Sub1_1.method2612(local62 * (float) local168 + local157);
						this.aClass1_Sub13_Sub1_1.method2612((float) local168 * local66 + local163);
						this.aClass1_Sub13_Sub1_1.method3060(local132);
						this.aClass1_Sub13_Sub1_1.method3060(local137);
						this.aClass1_Sub13_Sub1_1.method3060(local140);
						this.aClass1_Sub13_Sub1_1.method3060(local145);
						this.aClass1_Sub13_Sub1_1.method2612(1.0F);
						this.aClass1_Sub13_Sub1_1.method2612(1.0F);
						this.aClass1_Sub13_Sub1_1.method2612(local151 + (float) local168 * local44);
						this.aClass1_Sub13_Sub1_1.method2612((float) local168 * local48 + local157);
						this.aClass1_Sub13_Sub1_1.method2612((float) local168 * local52 + local163);
						this.aClass1_Sub13_Sub1_1.method3060(local132);
						this.aClass1_Sub13_Sub1_1.method3060(local137);
						this.aClass1_Sub13_Sub1_1.method3060(local140);
						this.aClass1_Sub13_Sub1_1.method3060(local145);
						this.aClass1_Sub13_Sub1_1.method2612(0.0F);
						this.aClass1_Sub13_Sub1_1.method2612(1.0F);
						this.aClass1_Sub13_Sub1_1.method2612((float) local168 * local71 + local151);
						this.aClass1_Sub13_Sub1_1.method2612(local76 * (float) local168 + local157);
						this.aClass1_Sub13_Sub1_1.method2612(local84 * (float) local168 + local163);
						this.aClass1_Sub13_Sub1_1.method3060(local132);
						this.aClass1_Sub13_Sub1_1.method3060(local137);
						this.aClass1_Sub13_Sub1_1.method3060(local140);
						this.aClass1_Sub13_Sub1_1.method3060(local145);
					}
					if (this.anIntArray483[local91] > 64) {
						local437 = this.anIntArray483[local91] - 64 - 1;
						for (local127 = this.anIntArray484[local437] - 1; local127 >= 0; local127--) {
							local453 = this.aClass2_Sub4_Sub1ArrayArray1[local437][local127];
							local456 = local453.anInt2550;
							local140 = (byte) (local456 >> 16);
							local145 = (byte) (local456 >> 8);
							local469 = (byte) local456;
							local474 = (byte) (local456 >>> 24);
							local163 = local453.anInt2551 >> 12;
							local486 = local453.anInt2549 >> 12;
							local492 = local453.anInt2546 >> 12;
							local497 = local453.anInt2553 >> 12;
							this.aClass1_Sub13_Sub1_1.method2612(0.0F);
							this.aClass1_Sub13_Sub1_1.method2612(0.0F);
							this.aClass1_Sub13_Sub1_1.method2612((float) -local497 * local44 + local163);
							this.aClass1_Sub13_Sub1_1.method2612(local48 * (float) -local497 + local486);
							this.aClass1_Sub13_Sub1_1.method2612(local492 + (float) -local497 * local52);
							this.aClass1_Sub13_Sub1_1.method3060(local140);
							this.aClass1_Sub13_Sub1_1.method3060(local145);
							this.aClass1_Sub13_Sub1_1.method3060(local469);
							this.aClass1_Sub13_Sub1_1.method3060(local474);
							this.aClass1_Sub13_Sub1_1.method2612(1.0F);
							this.aClass1_Sub13_Sub1_1.method2612(0.0F);
							this.aClass1_Sub13_Sub1_1.method2612(local163 + local57 * (float) local497);
							this.aClass1_Sub13_Sub1_1.method2612((float) local497 * local62 + local486);
							this.aClass1_Sub13_Sub1_1.method2612(local66 * (float) local497 + local492);
							this.aClass1_Sub13_Sub1_1.method3060(local140);
							this.aClass1_Sub13_Sub1_1.method3060(local145);
							this.aClass1_Sub13_Sub1_1.method3060(local469);
							this.aClass1_Sub13_Sub1_1.method3060(local474);
							this.aClass1_Sub13_Sub1_1.method2612(1.0F);
							this.aClass1_Sub13_Sub1_1.method2612(1.0F);
							this.aClass1_Sub13_Sub1_1.method2612(local44 * (float) local497 + local163);
							this.aClass1_Sub13_Sub1_1.method2612(local48 * (float) local497 + local486);
							this.aClass1_Sub13_Sub1_1.method2612(local52 * (float) local497 + local492);
							this.aClass1_Sub13_Sub1_1.method3060(local140);
							this.aClass1_Sub13_Sub1_1.method3060(local145);
							this.aClass1_Sub13_Sub1_1.method3060(local469);
							this.aClass1_Sub13_Sub1_1.method3060(local474);
							this.aClass1_Sub13_Sub1_1.method2612(0.0F);
							this.aClass1_Sub13_Sub1_1.method2612(1.0F);
							this.aClass1_Sub13_Sub1_1.method2612(local71 * (float) local497 + local163);
							this.aClass1_Sub13_Sub1_1.method2612(local486 + (float) local497 * local76);
							this.aClass1_Sub13_Sub1_1.method2612(local492 + local84 * (float) local497);
							this.aClass1_Sub13_Sub1_1.method3060(local140);
							this.aClass1_Sub13_Sub1_1.method3060(local145);
							this.aClass1_Sub13_Sub1_1.method3060(local469);
							this.aClass1_Sub13_Sub1_1.method3060(local474);
						}
					}
				}
			}
		} else {
			for (local91 = arg1 - 1; local91 >= 0; local91--) {
				local106 = this.anIntArray483[local91] <= 64 ? this.anIntArray483[local91] : 64;
				if (local106 > 0) {
					for (local115 = local106 - 1; local115 >= 0; local115--) {
						local124 = this.aClass2_Sub4_Sub1ArrayArray2[local91][local115];
						local127 = local124.anInt2550;
						local132 = (byte) (local127 >> 16);
						local137 = (byte) (local127 >> 8);
						local140 = (byte) local127;
						local145 = (byte) (local127 >>> 24);
						local151 = local124.anInt2551 >> 12;
						local157 = local124.anInt2549 >> 12;
						local163 = local124.anInt2546 >> 12;
						local168 = local124.anInt2553 >> 12;
						this.aClass1_Sub13_Sub1_1.method2611(0.0F);
						this.aClass1_Sub13_Sub1_1.method2611(0.0F);
						this.aClass1_Sub13_Sub1_1.method2611(local44 * (float) -local168 + local151);
						this.aClass1_Sub13_Sub1_1.method2611(local157 + (float) -local168 * local48);
						this.aClass1_Sub13_Sub1_1.method2611(local163 + (float) -local168 * local52);
						this.aClass1_Sub13_Sub1_1.method3060(local132);
						this.aClass1_Sub13_Sub1_1.method3060(local137);
						this.aClass1_Sub13_Sub1_1.method3060(local140);
						this.aClass1_Sub13_Sub1_1.method3060(local145);
						this.aClass1_Sub13_Sub1_1.method2611(1.0F);
						this.aClass1_Sub13_Sub1_1.method2611(0.0F);
						this.aClass1_Sub13_Sub1_1.method2611((float) local168 * local57 + local151);
						this.aClass1_Sub13_Sub1_1.method2611(local62 * (float) local168 + local157);
						this.aClass1_Sub13_Sub1_1.method2611(local66 * (float) local168 + local163);
						this.aClass1_Sub13_Sub1_1.method3060(local132);
						this.aClass1_Sub13_Sub1_1.method3060(local137);
						this.aClass1_Sub13_Sub1_1.method3060(local140);
						this.aClass1_Sub13_Sub1_1.method3060(local145);
						this.aClass1_Sub13_Sub1_1.method2611(1.0F);
						this.aClass1_Sub13_Sub1_1.method2611(1.0F);
						this.aClass1_Sub13_Sub1_1.method2611((float) local168 * local44 + local151);
						this.aClass1_Sub13_Sub1_1.method2611((float) local168 * local48 + local157);
						this.aClass1_Sub13_Sub1_1.method2611(local163 + (float) local168 * local52);
						this.aClass1_Sub13_Sub1_1.method3060(local132);
						this.aClass1_Sub13_Sub1_1.method3060(local137);
						this.aClass1_Sub13_Sub1_1.method3060(local140);
						this.aClass1_Sub13_Sub1_1.method3060(local145);
						this.aClass1_Sub13_Sub1_1.method2611(0.0F);
						this.aClass1_Sub13_Sub1_1.method2611(1.0F);
						this.aClass1_Sub13_Sub1_1.method2611((float) local168 * local71 + local151);
						this.aClass1_Sub13_Sub1_1.method2611(local76 * (float) local168 + local157);
						this.aClass1_Sub13_Sub1_1.method2611((float) local168 * local84 + local163);
						this.aClass1_Sub13_Sub1_1.method3060(local132);
						this.aClass1_Sub13_Sub1_1.method3060(local137);
						this.aClass1_Sub13_Sub1_1.method3060(local140);
						this.aClass1_Sub13_Sub1_1.method3060(local145);
					}
					if (this.anIntArray483[local91] > 64) {
						local437 = this.anIntArray483[local91] - 64 - 1;
						for (local127 = this.anIntArray484[local437] - 1; local127 >= 0; local127--) {
							local453 = this.aClass2_Sub4_Sub1ArrayArray1[local437][local127];
							local456 = local453.anInt2550;
							local140 = (byte) (local456 >> 16);
							local145 = (byte) (local456 >> 8);
							local469 = (byte) local456;
							local474 = (byte) (local456 >>> 24);
							local163 = local453.anInt2551 >> 12;
							local486 = local453.anInt2549 >> 12;
							local492 = local453.anInt2546 >> 12;
							local497 = local453.anInt2553 >> 12;
							this.aClass1_Sub13_Sub1_1.method2611(0.0F);
							this.aClass1_Sub13_Sub1_1.method2611(0.0F);
							this.aClass1_Sub13_Sub1_1.method2611(local163 + local44 * (float) -local497);
							this.aClass1_Sub13_Sub1_1.method2611((float) -local497 * local48 + local486);
							this.aClass1_Sub13_Sub1_1.method2611(local492 + local52 * (float) -local497);
							this.aClass1_Sub13_Sub1_1.method3060(local140);
							this.aClass1_Sub13_Sub1_1.method3060(local145);
							this.aClass1_Sub13_Sub1_1.method3060(local469);
							this.aClass1_Sub13_Sub1_1.method3060(local474);
							this.aClass1_Sub13_Sub1_1.method2611(1.0F);
							this.aClass1_Sub13_Sub1_1.method2611(0.0F);
							this.aClass1_Sub13_Sub1_1.method2611(local163 + (float) local497 * local57);
							this.aClass1_Sub13_Sub1_1.method2611(local486 + local62 * (float) local497);
							this.aClass1_Sub13_Sub1_1.method2611(local492 + local66 * (float) local497);
							this.aClass1_Sub13_Sub1_1.method3060(local140);
							this.aClass1_Sub13_Sub1_1.method3060(local145);
							this.aClass1_Sub13_Sub1_1.method3060(local469);
							this.aClass1_Sub13_Sub1_1.method3060(local474);
							this.aClass1_Sub13_Sub1_1.method2611(1.0F);
							this.aClass1_Sub13_Sub1_1.method2611(1.0F);
							this.aClass1_Sub13_Sub1_1.method2611(local163 + (float) local497 * local44);
							this.aClass1_Sub13_Sub1_1.method2611(local48 * (float) local497 + local486);
							this.aClass1_Sub13_Sub1_1.method2611(local492 + (float) local497 * local52);
							this.aClass1_Sub13_Sub1_1.method3060(local140);
							this.aClass1_Sub13_Sub1_1.method3060(local145);
							this.aClass1_Sub13_Sub1_1.method3060(local469);
							this.aClass1_Sub13_Sub1_1.method3060(local474);
							this.aClass1_Sub13_Sub1_1.method2611(0.0F);
							this.aClass1_Sub13_Sub1_1.method2611(1.0F);
							this.aClass1_Sub13_Sub1_1.method2611(local163 + (float) local497 * local71);
							this.aClass1_Sub13_Sub1_1.method2611((float) local497 * local76 + local486);
							this.aClass1_Sub13_Sub1_1.method2611(local84 * (float) local497 + local492);
							this.aClass1_Sub13_Sub1_1.method3060(local140);
							this.aClass1_Sub13_Sub1_1.method3060(local145);
							this.aClass1_Sub13_Sub1_1.method3060(local469);
							this.aClass1_Sub13_Sub1_1.method3060(local474);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub13_Sub1_1.anInt3400 != 0) {
			this.anInterface16_2.method6005(this.aClass1_Sub13_Sub1_1.aByteArray45, 24, this.aClass1_Sub13_Sub1_1.anInt3400);
			arg0.method6713(this.aClass188_4, this.aClass188_3, null, this.aClass188_2);
			arg0.method6700(this.aClass1_Sub13_Sub1_1.anInt3400 / 24);
		}
	}
}
