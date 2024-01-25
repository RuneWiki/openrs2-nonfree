import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class97 {

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "Lclient!wt;")
	private Class267 aClass267_1;

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "Lclient!wt;")
	private Class267 aClass267_2;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "Lclient!wt;")
	private Class267 aClass267_3;

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "Lclient!uv;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "[F")
	private final float[] aFloatArray3 = new float[16];

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "Lclient!el;")
	private final Class1_Sub14_Sub1 aClass1_Sub14_Sub1_1 = new Class1_Sub14_Sub1(786336);

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
	private final int anInt2341 = Static113.method1791(1600);

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
	private int anInt2343 = 0;

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "[I")
	private final int[] anIntArray165 = new int[64];

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "[I")
	private final int[] anIntArray167 = new int[8191];

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "[[Lclient!ke;")
	private final Class36_Sub3_Sub1[][] aClass36_Sub3_Sub1ArrayArray2 = new Class36_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "[I")
	private final int[] anIntArray166 = new int[1600];

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "[[Lclient!ke;")
	private final Class36_Sub3_Sub1[][] aClass36_Sub3_Sub1ArrayArray1 = new Class36_Sub3_Sub1[64][768];

	static {
		new Class96("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLclient!gn;Lclient!qg;)V")
	public void method1936(@OriginalArg(1) Class101 arg0, @OriginalArg(2) Class121_Sub2 arg1) {
		if (arg1.aClass43_Sub2_4 == null) {
			return;
		}
		this.method1941(arg1);
		@Pc(17) float local17 = arg1.aClass43_Sub2_4.aFloat49;
		@Pc(21) float local21 = arg1.aClass43_Sub2_4.aFloat42;
		@Pc(25) float local25 = arg1.aClass43_Sub2_4.aFloat47;
		@Pc(35) float local35 = arg1.aClass43_Sub2_4.aFloat45;
		try {
			@Pc(44) int local44;
			@Pc(54) int local54;
			@Pc(78) Class36_Sub3 local78;
			@Pc(91) int local91;
			@Pc(181) int local181;
			if (arg0.aBoolean192) {
				local44 = arg0.anInt2414 - arg0.anInt2413;
				if (local44 + 2 <= 1600) {
					local44 += 2;
					local54 = 0;
				} else {
					local54 = Static113.method1791(local44) + 1 - this.anInt2341;
					local44 = (local44 >> local54) + 2;
				}
				@Pc(75) Class36_Sub3 local75 = arg0.aClass95_1.aClass36_Sub3_7;
				local78 = local75.aClass36_Sub3_6;
				@Pc(80) int local80 = -2;
				@Pc(82) boolean local82 = true;
				@Pc(84) boolean local84 = true;
				while (local75 != local78) {
					this.anInt2343 = 0;
					for (local91 = 0; local91 < local44; local91++) {
						this.anIntArray166[local91] = 0;
					}
					for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
						this.anIntArray165[local104] = 0;
					}
					while (local75 != local78) {
						@Pc(120) Class36_Sub3_Sub1 local120 = (Class36_Sub3_Sub1) local78;
						if (local84) {
							local82 = local120.aBoolean163;
							local80 = local120.anInt2036;
							local84 = false;
						} else if (local80 != local120.anInt2036 || local120.aBoolean163 != local82) {
							local84 = true;
							break;
						}
						local181 = (int) (local35 + local17 * (float) (local120.anInt2038 >> Static415.anInt7293) + local21 * (float) (local120.anInt2031 >> Static415.anInt7293) + local25 * (float) (local120.anInt2028 >> Static415.anInt7293)) - arg0.anInt2413 >> local54;
						if (local181 < 1600) {
							if (this.anIntArray166[local181] >= 64) {
								label193: {
									if (this.anIntArray166[local181] == 64) {
										if (this.anInt2343 == 64) {
											break label193;
										}
										this.anIntArray166[local181] += this.anInt2343++ + 1;
									}
									@Pc(234) Class36_Sub3_Sub1[] local234 = this.aClass36_Sub3_Sub1ArrayArray1[this.anIntArray166[local181] - 64 - 1];
									@Pc(242) int local242 = this.anIntArray166[local181] - 65;
									@Pc(244) int local244 = this.anIntArray165[this.anIntArray166[local181] - 65];
									this.anIntArray165[local242] = this.anIntArray165[this.anIntArray166[local181] - 65] + 1;
									local234[local244] = local120;
								}
							} else {
								this.aClass36_Sub3_Sub1ArrayArray2[local181][this.anIntArray166[local181]++] = local120;
							}
						}
						local78 = local78.aClass36_Sub3_6;
					}
					if (local80 >= 0) {
						arg1.method4681(arg1.aClass156_1.method3495(local80));
						arg1.method4707(arg1.anInterface5_16.method3920(local80).anInt3547);
					} else {
						arg1.method4681(null);
					}
					if (local82 && arg1.aFloat95 != Static280.aFloat78) {
						arg1.ua(Static280.aFloat78);
					} else if (arg1.aFloat95 != 1.0F) {
						arg1.ua(1.0F);
					}
					this.method1940(local44, arg1);
				}
			} else {
				local44 = 0;
				local54 = Integer.MAX_VALUE;
				@Pc(334) int local334 = 0;
				local78 = arg0.aClass95_1.aClass36_Sub3_7;
				@Pc(341) Class36_Sub3 local341;
				@Pc(373) int local373;
				for (local341 = local78.aClass36_Sub3_6; local341 != local78; local341 = local341.aClass36_Sub3_6) {
					@Pc(346) Class36_Sub3_Sub1 local346 = (Class36_Sub3_Sub1) local341;
					local373 = (int) (local35 + (float) (local346.anInt2038 >> Static415.anInt7293) * local17 + local21 * (float) (local346.anInt2031 >> Static415.anInt7293) + (float) (local346.anInt2028 >> Static415.anInt7293) * local25);
					if (local54 > local373) {
						local54 = local373;
					}
					this.anIntArray167[local44++] = local373;
					if (local373 > local334) {
						local334 = local373;
					}
				}
				@Pc(404) int local404 = local334 - local54;
				if (local404 + 2 > 1600) {
					local373 = Static113.method1791(local404) + 1 - this.anInt2341;
					local404 = (local404 >> local373) + 2;
				} else {
					local404 += 2;
					local373 = 0;
				}
				local44 = 0;
				local341 = local78.aClass36_Sub3_6;
				local91 = -2;
				@Pc(440) boolean local440 = true;
				@Pc(442) boolean local442 = true;
				while (local341 != local78) {
					this.anInt2343 = 0;
					for (local181 = 0; local181 < local404; local181++) {
						this.anIntArray166[local181] = 0;
					}
					for (@Pc(462) int local462 = 0; local462 < 64; local462++) {
						this.anIntArray165[local462] = 0;
					}
					while (local78 != local341) {
						@Pc(478) Class36_Sub3_Sub1 local478 = (Class36_Sub3_Sub1) local341;
						if (local442) {
							local91 = local478.anInt2036;
							local440 = local478.aBoolean163;
							local442 = false;
						}
						if (local44 > 0 && (local478.anInt2036 != local91 || local440 != local478.aBoolean163)) {
							local442 = true;
							break;
						}
						@Pc(519) int local519 = this.anIntArray167[local44++] - local54 >> local373;
						if (local519 < 1600) {
							if (this.anIntArray166[local519] >= 64) {
								label143: {
									if (this.anIntArray166[local519] == 64) {
										if (this.anInt2343 == 64) {
											break label143;
										}
										this.anIntArray166[local519] += this.anInt2343++ + 1;
									}
									this.aClass36_Sub3_Sub1ArrayArray1[this.anIntArray166[local519] - 64 - 1][this.anIntArray165[this.anIntArray166[local519] - 64 - 1]++] = local478;
								}
							} else {
								this.aClass36_Sub3_Sub1ArrayArray2[local519][this.anIntArray166[local519]++] = local478;
							}
						}
						local341 = local341.aClass36_Sub3_6;
					}
					if (local91 < 0) {
						arg1.method4681(null);
					} else {
						arg1.method4681(arg1.aClass156_1.method3495(local91));
						arg1.method4707(arg1.anInterface5_16.method3920(local91).anInt3547);
					}
					if (local440 && Static280.aFloat78 != arg1.aFloat95) {
						arg1.ua(Static280.aFloat78);
					} else if (arg1.aFloat95 != 1.0F) {
						arg1.ua(1.0F);
					}
					this.method1940(local404, arg1);
				}
			}
		} catch (@Pc(666) Exception local666) {
		}
		this.method1939(arg1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLclient!qg;)V")
	public void method1937(@OriginalArg(1) Class121_Sub2 arg0) {
		this.anInterface12_1 = arg0.method4652(null, true, 24, 196584);
		this.aClass267_1 = new Class267(this.anInterface12_1, 5126, 2, 0);
		this.aClass267_2 = new Class267(this.anInterface12_1, 5126, 3, 8);
		this.aClass267_3 = new Class267(this.anInterface12_1, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!qg;I)V")
	private void method1939(@OriginalArg(0) Class121_Sub2 arg0) {
		arg0.method4691(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat95 != Static280.aFloat78) {
			arg0.ua(Static280.aFloat78);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBLclient!qg;)V")
	private void method1940(@OriginalArg(0) int arg0, @OriginalArg(2) Class121_Sub2 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray3, 0);
		@Pc(15) float local15 = this.aFloatArray3[0];
		@Pc(20) float local20 = this.aFloatArray3[4];
		@Pc(25) float local25 = this.aFloatArray3[8];
		@Pc(30) float local30 = this.aFloatArray3[1];
		@Pc(35) float local35 = this.aFloatArray3[5];
		@Pc(40) float local40 = this.aFloatArray3[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local20 + local35;
		@Pc(60) float local60 = local25 + local40;
		@Pc(65) float local65 = local15 - local30;
		@Pc(69) float local69 = local20 - local35;
		@Pc(73) float local73 = local25 - local40;
		@Pc(78) float local78 = local30 - local15;
		@Pc(83) float local83 = local35 - local20;
		this.aClass1_Sub14_Sub1_1.anInt5695 = 0;
		@Pc(92) float local92 = local40 - local25;
		@Pc(99) int local99;
		@Pc(114) int local114;
		@Pc(120) int local120;
		@Pc(129) Class36_Sub3_Sub1 local129;
		@Pc(132) int local132;
		@Pc(137) byte local137;
		@Pc(142) byte local142;
		@Pc(145) byte local145;
		@Pc(150) byte local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(168) float local168;
		@Pc(173) int local173;
		@Pc(491) float local491;
		@Pc(496) int local496;
		@Pc(436) int local436;
		@Pc(452) Class36_Sub3_Sub1 local452;
		@Pc(455) int local455;
		@Pc(468) byte local468;
		@Pc(473) byte local473;
		@Pc(485) float local485;
		if (arg1.aBoolean471) {
			for (local99 = arg0 - 1; local99 >= 0; local99--) {
				local114 = this.anIntArray166[local99] <= 64 ? this.anIntArray166[local99] : 64;
				if (local114 > 0) {
					for (local120 = local114 - 1; local120 >= 0; local120--) {
						local129 = this.aClass36_Sub3_Sub1ArrayArray2[local99][local120];
						local132 = local129.anInt2029;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = local129.anInt2038 >> Static415.anInt7293;
						local162 = local129.anInt2031 >> Static415.anInt7293;
						local168 = local129.anInt2028 >> Static415.anInt7293;
						local173 = local129.anInt2034 >> Static415.anInt7293;
						this.aClass1_Sub14_Sub1_1.method1407(0.0F);
						this.aClass1_Sub14_Sub1_1.method1407(0.0F);
						this.aClass1_Sub14_Sub1_1.method1407(local156 + local44 * (float) -local173);
						this.aClass1_Sub14_Sub1_1.method1407((float) -local173 * local48 + local162);
						this.aClass1_Sub14_Sub1_1.method1407((float) -local173 * local60 + local168);
						this.aClass1_Sub14_Sub1_1.method4553(local137);
						this.aClass1_Sub14_Sub1_1.method4553(local142);
						this.aClass1_Sub14_Sub1_1.method4553(local145);
						this.aClass1_Sub14_Sub1_1.method4553(local150);
						this.aClass1_Sub14_Sub1_1.method1407(1.0F);
						this.aClass1_Sub14_Sub1_1.method1407(0.0F);
						this.aClass1_Sub14_Sub1_1.method1407(local65 * (float) local173 + local156);
						this.aClass1_Sub14_Sub1_1.method1407(local162 + (float) local173 * local69);
						this.aClass1_Sub14_Sub1_1.method1407(local168 + (float) local173 * local73);
						this.aClass1_Sub14_Sub1_1.method4553(local137);
						this.aClass1_Sub14_Sub1_1.method4553(local142);
						this.aClass1_Sub14_Sub1_1.method4553(local145);
						this.aClass1_Sub14_Sub1_1.method4553(local150);
						this.aClass1_Sub14_Sub1_1.method1407(1.0F);
						this.aClass1_Sub14_Sub1_1.method1407(1.0F);
						this.aClass1_Sub14_Sub1_1.method1407((float) local173 * local44 + local156);
						this.aClass1_Sub14_Sub1_1.method1407((float) local173 * local48 + local162);
						this.aClass1_Sub14_Sub1_1.method1407(local60 * (float) local173 + local168);
						this.aClass1_Sub14_Sub1_1.method4553(local137);
						this.aClass1_Sub14_Sub1_1.method4553(local142);
						this.aClass1_Sub14_Sub1_1.method4553(local145);
						this.aClass1_Sub14_Sub1_1.method4553(local150);
						this.aClass1_Sub14_Sub1_1.method1407(0.0F);
						this.aClass1_Sub14_Sub1_1.method1407(1.0F);
						this.aClass1_Sub14_Sub1_1.method1407((float) local173 * local78 + local156);
						this.aClass1_Sub14_Sub1_1.method1407((float) local173 * local83 + local162);
						this.aClass1_Sub14_Sub1_1.method1407((float) local173 * local92 + local168);
						this.aClass1_Sub14_Sub1_1.method4553(local137);
						this.aClass1_Sub14_Sub1_1.method4553(local142);
						this.aClass1_Sub14_Sub1_1.method4553(local145);
						this.aClass1_Sub14_Sub1_1.method4553(local150);
					}
					if (this.anIntArray166[local99] > 64) {
						local436 = this.anIntArray166[local99] - 64 - 1;
						for (local132 = this.anIntArray165[local436] - 1; local132 >= 0; local132--) {
							local452 = this.aClass36_Sub3_Sub1ArrayArray1[local436][local132];
							local455 = local452.anInt2029;
							local145 = (byte) (local455 >> 16);
							local150 = (byte) (local455 >> 8);
							local468 = (byte) local455;
							local473 = (byte) (local455 >>> 24);
							local168 = local452.anInt2038 >> Static415.anInt7293;
							local485 = local452.anInt2031 >> Static415.anInt7293;
							local491 = local452.anInt2028 >> Static415.anInt7293;
							local496 = local452.anInt2034 >> Static415.anInt7293;
							this.aClass1_Sub14_Sub1_1.method1407(0.0F);
							this.aClass1_Sub14_Sub1_1.method1407(0.0F);
							this.aClass1_Sub14_Sub1_1.method1407(local44 * (float) -local496 + local168);
							this.aClass1_Sub14_Sub1_1.method1407((float) -local496 * local48 + local485);
							this.aClass1_Sub14_Sub1_1.method1407((float) -local496 * local60 + local491);
							this.aClass1_Sub14_Sub1_1.method4553(local145);
							this.aClass1_Sub14_Sub1_1.method4553(local150);
							this.aClass1_Sub14_Sub1_1.method4553(local468);
							this.aClass1_Sub14_Sub1_1.method4553(local473);
							this.aClass1_Sub14_Sub1_1.method1407(1.0F);
							this.aClass1_Sub14_Sub1_1.method1407(0.0F);
							this.aClass1_Sub14_Sub1_1.method1407((float) local496 * local65 + local168);
							this.aClass1_Sub14_Sub1_1.method1407(local485 + (float) local496 * local69);
							this.aClass1_Sub14_Sub1_1.method1407(local73 * (float) local496 + local491);
							this.aClass1_Sub14_Sub1_1.method4553(local145);
							this.aClass1_Sub14_Sub1_1.method4553(local150);
							this.aClass1_Sub14_Sub1_1.method4553(local468);
							this.aClass1_Sub14_Sub1_1.method4553(local473);
							this.aClass1_Sub14_Sub1_1.method1407(1.0F);
							this.aClass1_Sub14_Sub1_1.method1407(1.0F);
							this.aClass1_Sub14_Sub1_1.method1407((float) local496 * local44 + local168);
							this.aClass1_Sub14_Sub1_1.method1407((float) local496 * local48 + local485);
							this.aClass1_Sub14_Sub1_1.method1407(local491 + local60 * (float) local496);
							this.aClass1_Sub14_Sub1_1.method4553(local145);
							this.aClass1_Sub14_Sub1_1.method4553(local150);
							this.aClass1_Sub14_Sub1_1.method4553(local468);
							this.aClass1_Sub14_Sub1_1.method4553(local473);
							this.aClass1_Sub14_Sub1_1.method1407(0.0F);
							this.aClass1_Sub14_Sub1_1.method1407(1.0F);
							this.aClass1_Sub14_Sub1_1.method1407(local168 + local78 * (float) local496);
							this.aClass1_Sub14_Sub1_1.method1407((float) local496 * local83 + local485);
							this.aClass1_Sub14_Sub1_1.method1407((float) local496 * local92 + local491);
							this.aClass1_Sub14_Sub1_1.method4553(local145);
							this.aClass1_Sub14_Sub1_1.method4553(local150);
							this.aClass1_Sub14_Sub1_1.method4553(local468);
							this.aClass1_Sub14_Sub1_1.method4553(local473);
						}
					}
				}
			}
		} else {
			for (local99 = arg0 - 1; local99 >= 0; local99--) {
				local114 = this.anIntArray166[local99] > 64 ? 64 : this.anIntArray166[local99];
				if (local114 > 0) {
					for (local120 = local114 - 1; local120 >= 0; local120--) {
						local129 = this.aClass36_Sub3_Sub1ArrayArray2[local99][local120];
						local132 = local129.anInt2029;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = local129.anInt2038 >> Static415.anInt7293;
						local162 = local129.anInt2031 >> Static415.anInt7293;
						local168 = local129.anInt2028 >> Static415.anInt7293;
						local173 = local129.anInt2034 >> Static415.anInt7293;
						this.aClass1_Sub14_Sub1_1.method1406(0.0F);
						this.aClass1_Sub14_Sub1_1.method1406(0.0F);
						this.aClass1_Sub14_Sub1_1.method1406(local156 + local44 * (float) -local173);
						this.aClass1_Sub14_Sub1_1.method1406(local162 + (float) -local173 * local48);
						this.aClass1_Sub14_Sub1_1.method1406(local168 + (float) -local173 * local60);
						this.aClass1_Sub14_Sub1_1.method4553(local137);
						this.aClass1_Sub14_Sub1_1.method4553(local142);
						this.aClass1_Sub14_Sub1_1.method4553(local145);
						this.aClass1_Sub14_Sub1_1.method4553(local150);
						this.aClass1_Sub14_Sub1_1.method1406(1.0F);
						this.aClass1_Sub14_Sub1_1.method1406(0.0F);
						this.aClass1_Sub14_Sub1_1.method1406((float) local173 * local65 + local156);
						this.aClass1_Sub14_Sub1_1.method1406(local162 + local69 * (float) local173);
						this.aClass1_Sub14_Sub1_1.method1406(local168 + local73 * (float) local173);
						this.aClass1_Sub14_Sub1_1.method4553(local137);
						this.aClass1_Sub14_Sub1_1.method4553(local142);
						this.aClass1_Sub14_Sub1_1.method4553(local145);
						this.aClass1_Sub14_Sub1_1.method4553(local150);
						this.aClass1_Sub14_Sub1_1.method1406(1.0F);
						this.aClass1_Sub14_Sub1_1.method1406(1.0F);
						this.aClass1_Sub14_Sub1_1.method1406(local156 + local44 * (float) local173);
						this.aClass1_Sub14_Sub1_1.method1406(local162 + (float) local173 * local48);
						this.aClass1_Sub14_Sub1_1.method1406((float) local173 * local60 + local168);
						this.aClass1_Sub14_Sub1_1.method4553(local137);
						this.aClass1_Sub14_Sub1_1.method4553(local142);
						this.aClass1_Sub14_Sub1_1.method4553(local145);
						this.aClass1_Sub14_Sub1_1.method4553(local150);
						this.aClass1_Sub14_Sub1_1.method1406(0.0F);
						this.aClass1_Sub14_Sub1_1.method1406(1.0F);
						this.aClass1_Sub14_Sub1_1.method1406((float) local173 * local78 + local156);
						this.aClass1_Sub14_Sub1_1.method1406(local162 + local83 * (float) local173);
						this.aClass1_Sub14_Sub1_1.method1406((float) local173 * local92 + local168);
						this.aClass1_Sub14_Sub1_1.method4553(local137);
						this.aClass1_Sub14_Sub1_1.method4553(local142);
						this.aClass1_Sub14_Sub1_1.method4553(local145);
						this.aClass1_Sub14_Sub1_1.method4553(local150);
					}
					if (this.anIntArray166[local99] > 64) {
						local436 = this.anIntArray166[local99] - 65;
						for (local132 = this.anIntArray165[local436] - 1; local132 >= 0; local132--) {
							local452 = this.aClass36_Sub3_Sub1ArrayArray1[local436][local132];
							local455 = local452.anInt2029;
							local145 = (byte) (local455 >> 16);
							local150 = (byte) (local455 >> 8);
							local468 = (byte) local455;
							local473 = (byte) (local455 >>> 24);
							local168 = local452.anInt2038 >> Static415.anInt7293;
							local485 = local452.anInt2031 >> Static415.anInt7293;
							local491 = local452.anInt2028 >> Static415.anInt7293;
							local496 = local452.anInt2034 >> Static415.anInt7293;
							this.aClass1_Sub14_Sub1_1.method1406(0.0F);
							this.aClass1_Sub14_Sub1_1.method1406(0.0F);
							this.aClass1_Sub14_Sub1_1.method1406(local168 + local44 * (float) -local496);
							this.aClass1_Sub14_Sub1_1.method1406(local485 + local48 * (float) -local496);
							this.aClass1_Sub14_Sub1_1.method1406(local491 + (float) -local496 * local60);
							this.aClass1_Sub14_Sub1_1.method4553(local145);
							this.aClass1_Sub14_Sub1_1.method4553(local150);
							this.aClass1_Sub14_Sub1_1.method4553(local468);
							this.aClass1_Sub14_Sub1_1.method4553(local473);
							this.aClass1_Sub14_Sub1_1.method1406(1.0F);
							this.aClass1_Sub14_Sub1_1.method1406(0.0F);
							this.aClass1_Sub14_Sub1_1.method1406(local65 * (float) local496 + local168);
							this.aClass1_Sub14_Sub1_1.method1406(local485 + (float) local496 * local69);
							this.aClass1_Sub14_Sub1_1.method1406(local491 + local73 * (float) local496);
							this.aClass1_Sub14_Sub1_1.method4553(local145);
							this.aClass1_Sub14_Sub1_1.method4553(local150);
							this.aClass1_Sub14_Sub1_1.method4553(local468);
							this.aClass1_Sub14_Sub1_1.method4553(local473);
							this.aClass1_Sub14_Sub1_1.method1406(1.0F);
							this.aClass1_Sub14_Sub1_1.method1406(1.0F);
							this.aClass1_Sub14_Sub1_1.method1406(local168 + local44 * (float) local496);
							this.aClass1_Sub14_Sub1_1.method1406(local485 + (float) local496 * local48);
							this.aClass1_Sub14_Sub1_1.method1406(local60 * (float) local496 + local491);
							this.aClass1_Sub14_Sub1_1.method4553(local145);
							this.aClass1_Sub14_Sub1_1.method4553(local150);
							this.aClass1_Sub14_Sub1_1.method4553(local468);
							this.aClass1_Sub14_Sub1_1.method4553(local473);
							this.aClass1_Sub14_Sub1_1.method1406(0.0F);
							this.aClass1_Sub14_Sub1_1.method1406(1.0F);
							this.aClass1_Sub14_Sub1_1.method1406(local78 * (float) local496 + local168);
							this.aClass1_Sub14_Sub1_1.method1406((float) local496 * local83 + local485);
							this.aClass1_Sub14_Sub1_1.method1406((float) local496 * local92 + local491);
							this.aClass1_Sub14_Sub1_1.method4553(local145);
							this.aClass1_Sub14_Sub1_1.method4553(local150);
							this.aClass1_Sub14_Sub1_1.method4553(local468);
							this.aClass1_Sub14_Sub1_1.method4553(local473);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub14_Sub1_1.anInt5695 != 0) {
			this.anInterface12_1.method5235(this.aClass1_Sub14_Sub1_1.aByteArray65, this.aClass1_Sub14_Sub1_1.anInt5695, 24);
			arg1.method4724(this.aClass267_2, null, this.aClass267_1, this.aClass267_3);
			arg1.method4687(this.aClass1_Sub14_Sub1_1.anInt5695 / 24);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!qg;Z)V")
	private void method1941(@OriginalArg(0) Class121_Sub2 arg0) {
		Static280.aFloat78 = arg0.aFloat95;
		arg0.method4666();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4691(false);
		arg0.method4647(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
