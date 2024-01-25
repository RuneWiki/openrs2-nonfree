import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class25 {

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "Lclient!er;")
	private Class71 aClass71_1;

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "Lclient!gg;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "Lclient!er;")
	private Class71 aClass71_2;

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "Lclient!er;")
	private Class71 aClass71_3;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "[F")
	private final float[] aFloatArray3 = new float[16];

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "Lclient!cb;")
	private final Class10_Sub8_Sub1 aClass10_Sub8_Sub1_1 = new Class10_Sub8_Sub1(786336);

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
	private final int anInt519 = Static365.method2559(1600);

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "[I")
	private final int[] anIntArray48 = new int[1600];

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "[I")
	private final int[] anIntArray47 = new int[64];

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
	private int anInt520 = 0;

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "[[Lclient!il;")
	private final Class40_Sub2_Sub1[][] aClass40_Sub2_Sub1ArrayArray1 = new Class40_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "[[Lclient!il;")
	private final Class40_Sub2_Sub1[][] aClass40_Sub2_Sub1ArrayArray2 = new Class40_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "[I")
	private final int[] anIntArray49 = new int[8191];

	static {
		new Class182("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!ip;Lclient!da;Z)V")
	public void method431(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class50_Sub1 arg1) {
		if (arg1.aClass34_Sub1_4 == null) {
			return;
		}
		this.method437(arg1);
		@Pc(17) float local17 = arg1.aClass34_Sub1_4.aFloat84;
		@Pc(21) float local21 = arg1.aClass34_Sub1_4.aFloat79;
		@Pc(25) float local25 = arg1.aClass34_Sub1_4.aFloat85;
		@Pc(29) float local29 = arg1.aClass34_Sub1_4.aFloat83;
		try {
			@Pc(39) int local39;
			@Pc(56) int local56;
			@Pc(74) Class40_Sub2 local74;
			@Pc(87) int local87;
			@Pc(181) int local181;
			if (arg0.aBoolean237) {
				local39 = arg0.anInt3667 - arg0.anInt3668;
				if (local39 + 2 > 1600) {
					local56 = Static365.method2559(local39) + 1 - this.anInt519;
					local39 = (local39 >> local56) + 2;
				} else {
					local56 = 0;
					local39 += 2;
				}
				@Pc(71) Class40_Sub2 local71 = arg0.aClass197_1.aClass40_Sub2_9;
				local74 = local71.aClass40_Sub2_7;
				@Pc(76) int local76 = -2;
				@Pc(78) boolean local78 = true;
				@Pc(80) boolean local80 = true;
				while (local74 != local71) {
					this.anInt520 = 0;
					for (local87 = 0; local87 < local39; local87++) {
						this.anIntArray48[local87] = 0;
					}
					for (@Pc(100) int local100 = 0; local100 < 64; local100++) {
						this.anIntArray47[local100] = 0;
					}
					while (local71 != local74) {
						@Pc(118) Class40_Sub2_Sub1 local118 = (Class40_Sub2_Sub1) local74;
						if (local80) {
							local80 = false;
							local76 = local118.anInt1783;
							local78 = local118.aBoolean117;
						} else if (local76 != local118.anInt1783 || local78 != local118.aBoolean117) {
							local80 = true;
							break;
						}
						local181 = (int) (local29 + local25 * (float) (local118.anInt1778 >> 12) + local17 * (float) (local118.anInt1779 >> 12) + (float) (local118.anInt1780 >> 12) * local21) - arg0.anInt3668 >> local56;
						if (local181 < 1600) {
							if (this.anIntArray48[local181] < 64) {
								this.aClass40_Sub2_Sub1ArrayArray1[local181][this.anIntArray48[local181]++] = local118;
							} else {
								label192: {
									if (this.anIntArray48[local181] == 64) {
										if (this.anInt520 == 64) {
											break label192;
										}
										this.anIntArray48[local181] += this.anInt520++ + 1;
									}
									this.aClass40_Sub2_Sub1ArrayArray2[this.anIntArray48[local181] - 1 - 64][this.anIntArray47[this.anIntArray48[local181] - 64 - 1]++] = local118;
								}
							}
						}
						local74 = local74.aClass40_Sub2_7;
					}
					if (local76 >= 0) {
						arg1.method1295(arg1.aClass200_1.method4456(local76));
						arg1.method1256(arg1.anInterface7_8.method4447(local76).anInt7252);
					} else {
						arg1.method1295(null);
					}
					if (local78 && arg1.aFloat34 != Static271.aFloat74) {
						arg1.JA(Static271.aFloat74);
					} else if (arg1.aFloat34 != 1.0F) {
						arg1.JA(1.0F);
					}
					this.method436(local39, arg1);
				}
			} else {
				local39 = 0;
				local56 = Integer.MAX_VALUE;
				@Pc(340) int local340 = 0;
				local74 = arg0.aClass197_1.aClass40_Sub2_9;
				@Pc(347) Class40_Sub2 local347;
				@Pc(379) int local379;
				for (local347 = local74.aClass40_Sub2_7; local347 != local74; local347 = local347.aClass40_Sub2_7) {
					@Pc(352) Class40_Sub2_Sub1 local352 = (Class40_Sub2_Sub1) local347;
					local379 = (int) (local29 + (float) (local352.anInt1778 >> 12) * local25 + (float) (local352.anInt1780 >> 12) * local21 + local17 * (float) (local352.anInt1779 >> 12));
					this.anIntArray49[local39++] = local379;
					if (local379 > local340) {
						local340 = local379;
					}
					if (local56 > local379) {
						local56 = local379;
					}
				}
				@Pc(409) int local409 = local340 - local56;
				if (local409 + 2 > 1600) {
					local379 = Static365.method2559(local409) + 1 - this.anInt519;
					local409 = (local409 >> local379) + 2;
				} else {
					local379 = 0;
					local409 += 2;
				}
				local39 = 0;
				local347 = local74.aClass40_Sub2_7;
				local87 = -2;
				@Pc(443) boolean local443 = true;
				@Pc(445) boolean local445 = true;
				while (local74 != local347) {
					this.anInt520 = 0;
					for (local181 = 0; local181 < local409; local181++) {
						this.anIntArray48[local181] = 0;
					}
					for (@Pc(469) int local469 = 0; local469 < 64; local469++) {
						this.anIntArray47[local469] = 0;
					}
					while (local74 != local347) {
						@Pc(485) Class40_Sub2_Sub1 local485 = (Class40_Sub2_Sub1) local347;
						if (local445) {
							local443 = local485.aBoolean117;
							local87 = local485.anInt1783;
							local445 = false;
						}
						if (local39 > 0 && (local87 != local485.anInt1783 || local443 != local485.aBoolean117)) {
							local445 = true;
							break;
						}
						@Pc(524) int local524 = this.anIntArray49[local39++] - local56 >> local379;
						if (local524 < 1600) {
							if (this.anIntArray48[local524] < 64) {
								this.aClass40_Sub2_Sub1ArrayArray1[local524][this.anIntArray48[local524]++] = local485;
							} else {
								label142: {
									if (this.anIntArray48[local524] == 64) {
										if (this.anInt520 == 64) {
											break label142;
										}
										this.anIntArray48[local524] += this.anInt520++ + 1;
									}
									this.aClass40_Sub2_Sub1ArrayArray2[this.anIntArray48[local524] - 1 - 64][this.anIntArray47[this.anIntArray48[local524] - 64 - 1]++] = local485;
								}
							}
						}
						local347 = local347.aClass40_Sub2_7;
					}
					if (local87 >= 0) {
						arg1.method1295(arg1.aClass200_1.method4456(local87));
						arg1.method1256(arg1.anInterface7_8.method4447(local87).anInt7252);
					} else {
						arg1.method1295(null);
					}
					if (local443 && arg1.aFloat34 != Static271.aFloat74) {
						arg1.JA(Static271.aFloat74);
					} else if (arg1.aFloat34 != 1.0F) {
						arg1.JA(1.0F);
					}
					this.method436(local409, arg1);
				}
			}
		} catch (@Pc(680) Exception local680) {
		}
		this.method438(arg1);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!da;I)V")
	public void method432(@OriginalArg(0) Class50_Sub1 arg0) {
		this.anInterface4_1 = arg0.method1253(196584, 24, null, true);
		this.aClass71_3 = new Class71(this.anInterface4_1, 5126, 2, 0);
		this.aClass71_2 = new Class71(this.anInterface4_1, 5126, 3, 8);
		this.aClass71_1 = new Class71(this.anInterface4_1, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!da;I)V")
	private void method436(@OriginalArg(0) int arg0, @OriginalArg(1) Class50_Sub1 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray3, 0);
		@Pc(15) float local15 = this.aFloatArray3[0];
		@Pc(20) float local20 = this.aFloatArray3[4];
		@Pc(25) float local25 = this.aFloatArray3[8];
		@Pc(30) float local30 = this.aFloatArray3[1];
		@Pc(35) float local35 = this.aFloatArray3[5];
		@Pc(40) float local40 = this.aFloatArray3[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local20 + local35;
		@Pc(52) float local52 = local40 + local25;
		@Pc(57) float local57 = local15 - local30;
		@Pc(61) float local61 = local20 - local35;
		@Pc(66) float local66 = local25 - local40;
		@Pc(71) float local71 = local30 - local15;
		@Pc(75) float local75 = local35 - local20;
		@Pc(79) float local79 = local40 - local25;
		this.aClass10_Sub8_Sub1_1.anInt2989 = 0;
		@Pc(98) int local98;
		@Pc(115) int local115;
		@Pc(124) int local124;
		@Pc(133) Class40_Sub2_Sub1 local133;
		@Pc(136) int local136;
		@Pc(141) byte local141;
		@Pc(146) byte local146;
		@Pc(149) byte local149;
		@Pc(154) byte local154;
		@Pc(160) float local160;
		@Pc(166) float local166;
		@Pc(172) float local172;
		@Pc(177) int local177;
		@Pc(495) float local495;
		@Pc(500) int local500;
		@Pc(440) int local440;
		@Pc(456) Class40_Sub2_Sub1 local456;
		@Pc(459) int local459;
		@Pc(472) byte local472;
		@Pc(477) byte local477;
		@Pc(489) float local489;
		if (arg1.aBoolean99) {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local115 = this.anIntArray48[local98] <= 64 ? this.anIntArray48[local98] : 64;
				if (local115 > 0) {
					for (local124 = local115 - 1; local124 >= 0; local124--) {
						local133 = this.aClass40_Sub2_Sub1ArrayArray1[local98][local124];
						local136 = local133.anInt1781;
						local141 = (byte) (local136 >> 16);
						local146 = (byte) (local136 >> 8);
						local149 = (byte) local136;
						local154 = (byte) (local136 >>> 24);
						local160 = local133.anInt1779 >> 12;
						local166 = local133.anInt1780 >> 12;
						local172 = local133.anInt1778 >> 12;
						local177 = local133.anInt1782 >> 12;
						this.aClass10_Sub8_Sub1_1.method835(0.0F);
						this.aClass10_Sub8_Sub1_1.method835(0.0F);
						this.aClass10_Sub8_Sub1_1.method835(local160 + local44 * (float) -local177);
						this.aClass10_Sub8_Sub1_1.method835(local48 * (float) -local177 + local166);
						this.aClass10_Sub8_Sub1_1.method835(local52 * (float) -local177 + local172);
						this.aClass10_Sub8_Sub1_1.method2458(local141);
						this.aClass10_Sub8_Sub1_1.method2458(local146);
						this.aClass10_Sub8_Sub1_1.method2458(local149);
						this.aClass10_Sub8_Sub1_1.method2458(local154);
						this.aClass10_Sub8_Sub1_1.method835(1.0F);
						this.aClass10_Sub8_Sub1_1.method835(0.0F);
						this.aClass10_Sub8_Sub1_1.method835(local160 + local57 * (float) local177);
						this.aClass10_Sub8_Sub1_1.method835(local166 + local61 * (float) local177);
						this.aClass10_Sub8_Sub1_1.method835(local172 + local66 * (float) local177);
						this.aClass10_Sub8_Sub1_1.method2458(local141);
						this.aClass10_Sub8_Sub1_1.method2458(local146);
						this.aClass10_Sub8_Sub1_1.method2458(local149);
						this.aClass10_Sub8_Sub1_1.method2458(local154);
						this.aClass10_Sub8_Sub1_1.method835(1.0F);
						this.aClass10_Sub8_Sub1_1.method835(1.0F);
						this.aClass10_Sub8_Sub1_1.method835(local160 + local44 * (float) local177);
						this.aClass10_Sub8_Sub1_1.method835((float) local177 * local48 + local166);
						this.aClass10_Sub8_Sub1_1.method835(local172 + local52 * (float) local177);
						this.aClass10_Sub8_Sub1_1.method2458(local141);
						this.aClass10_Sub8_Sub1_1.method2458(local146);
						this.aClass10_Sub8_Sub1_1.method2458(local149);
						this.aClass10_Sub8_Sub1_1.method2458(local154);
						this.aClass10_Sub8_Sub1_1.method835(0.0F);
						this.aClass10_Sub8_Sub1_1.method835(1.0F);
						this.aClass10_Sub8_Sub1_1.method835(local71 * (float) local177 + local160);
						this.aClass10_Sub8_Sub1_1.method835((float) local177 * local75 + local166);
						this.aClass10_Sub8_Sub1_1.method835(local172 + local79 * (float) local177);
						this.aClass10_Sub8_Sub1_1.method2458(local141);
						this.aClass10_Sub8_Sub1_1.method2458(local146);
						this.aClass10_Sub8_Sub1_1.method2458(local149);
						this.aClass10_Sub8_Sub1_1.method2458(local154);
					}
					if (this.anIntArray48[local98] > 64) {
						local440 = this.anIntArray48[local98] - 64 - 1;
						for (local136 = this.anIntArray47[local440] - 1; local136 >= 0; local136--) {
							local456 = this.aClass40_Sub2_Sub1ArrayArray2[local440][local136];
							local459 = local456.anInt1781;
							local149 = (byte) (local459 >> 16);
							local154 = (byte) (local459 >> 8);
							local472 = (byte) local459;
							local477 = (byte) (local459 >>> 24);
							local172 = local456.anInt1779 >> 12;
							local489 = local456.anInt1780 >> 12;
							local495 = local456.anInt1778 >> 12;
							local500 = local456.anInt1782 >> 12;
							this.aClass10_Sub8_Sub1_1.method835(0.0F);
							this.aClass10_Sub8_Sub1_1.method835(0.0F);
							this.aClass10_Sub8_Sub1_1.method835(local172 + local44 * (float) -local500);
							this.aClass10_Sub8_Sub1_1.method835((float) -local500 * local48 + local489);
							this.aClass10_Sub8_Sub1_1.method835((float) -local500 * local52 + local495);
							this.aClass10_Sub8_Sub1_1.method2458(local149);
							this.aClass10_Sub8_Sub1_1.method2458(local154);
							this.aClass10_Sub8_Sub1_1.method2458(local472);
							this.aClass10_Sub8_Sub1_1.method2458(local477);
							this.aClass10_Sub8_Sub1_1.method835(1.0F);
							this.aClass10_Sub8_Sub1_1.method835(0.0F);
							this.aClass10_Sub8_Sub1_1.method835((float) local500 * local57 + local172);
							this.aClass10_Sub8_Sub1_1.method835(local489 + (float) local500 * local61);
							this.aClass10_Sub8_Sub1_1.method835(local495 + (float) local500 * local66);
							this.aClass10_Sub8_Sub1_1.method2458(local149);
							this.aClass10_Sub8_Sub1_1.method2458(local154);
							this.aClass10_Sub8_Sub1_1.method2458(local472);
							this.aClass10_Sub8_Sub1_1.method2458(local477);
							this.aClass10_Sub8_Sub1_1.method835(1.0F);
							this.aClass10_Sub8_Sub1_1.method835(1.0F);
							this.aClass10_Sub8_Sub1_1.method835(local172 + local44 * (float) local500);
							this.aClass10_Sub8_Sub1_1.method835((float) local500 * local48 + local489);
							this.aClass10_Sub8_Sub1_1.method835(local495 + local52 * (float) local500);
							this.aClass10_Sub8_Sub1_1.method2458(local149);
							this.aClass10_Sub8_Sub1_1.method2458(local154);
							this.aClass10_Sub8_Sub1_1.method2458(local472);
							this.aClass10_Sub8_Sub1_1.method2458(local477);
							this.aClass10_Sub8_Sub1_1.method835(0.0F);
							this.aClass10_Sub8_Sub1_1.method835(1.0F);
							this.aClass10_Sub8_Sub1_1.method835(local172 + local71 * (float) local500);
							this.aClass10_Sub8_Sub1_1.method835(local75 * (float) local500 + local489);
							this.aClass10_Sub8_Sub1_1.method835(local495 + (float) local500 * local79);
							this.aClass10_Sub8_Sub1_1.method2458(local149);
							this.aClass10_Sub8_Sub1_1.method2458(local154);
							this.aClass10_Sub8_Sub1_1.method2458(local472);
							this.aClass10_Sub8_Sub1_1.method2458(local477);
						}
					}
				}
			}
		} else {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local115 = this.anIntArray48[local98] > 64 ? 64 : this.anIntArray48[local98];
				if (local115 > 0) {
					for (local124 = local115 - 1; local124 >= 0; local124--) {
						local133 = this.aClass40_Sub2_Sub1ArrayArray1[local98][local124];
						local136 = local133.anInt1781;
						local141 = (byte) (local136 >> 16);
						local146 = (byte) (local136 >> 8);
						local149 = (byte) local136;
						local154 = (byte) (local136 >>> 24);
						local160 = local133.anInt1779 >> 12;
						local166 = local133.anInt1780 >> 12;
						local172 = local133.anInt1778 >> 12;
						local177 = local133.anInt1782 >> 12;
						this.aClass10_Sub8_Sub1_1.method833(0.0F);
						this.aClass10_Sub8_Sub1_1.method833(0.0F);
						this.aClass10_Sub8_Sub1_1.method833(local44 * (float) -local177 + local160);
						this.aClass10_Sub8_Sub1_1.method833((float) -local177 * local48 + local166);
						this.aClass10_Sub8_Sub1_1.method833((float) -local177 * local52 + local172);
						this.aClass10_Sub8_Sub1_1.method2458(local141);
						this.aClass10_Sub8_Sub1_1.method2458(local146);
						this.aClass10_Sub8_Sub1_1.method2458(local149);
						this.aClass10_Sub8_Sub1_1.method2458(local154);
						this.aClass10_Sub8_Sub1_1.method833(1.0F);
						this.aClass10_Sub8_Sub1_1.method833(0.0F);
						this.aClass10_Sub8_Sub1_1.method833(local57 * (float) local177 + local160);
						this.aClass10_Sub8_Sub1_1.method833(local61 * (float) local177 + local166);
						this.aClass10_Sub8_Sub1_1.method833(local172 + local66 * (float) local177);
						this.aClass10_Sub8_Sub1_1.method2458(local141);
						this.aClass10_Sub8_Sub1_1.method2458(local146);
						this.aClass10_Sub8_Sub1_1.method2458(local149);
						this.aClass10_Sub8_Sub1_1.method2458(local154);
						this.aClass10_Sub8_Sub1_1.method833(1.0F);
						this.aClass10_Sub8_Sub1_1.method833(1.0F);
						this.aClass10_Sub8_Sub1_1.method833(local160 + local44 * (float) local177);
						this.aClass10_Sub8_Sub1_1.method833(local48 * (float) local177 + local166);
						this.aClass10_Sub8_Sub1_1.method833(local52 * (float) local177 + local172);
						this.aClass10_Sub8_Sub1_1.method2458(local141);
						this.aClass10_Sub8_Sub1_1.method2458(local146);
						this.aClass10_Sub8_Sub1_1.method2458(local149);
						this.aClass10_Sub8_Sub1_1.method2458(local154);
						this.aClass10_Sub8_Sub1_1.method833(0.0F);
						this.aClass10_Sub8_Sub1_1.method833(1.0F);
						this.aClass10_Sub8_Sub1_1.method833((float) local177 * local71 + local160);
						this.aClass10_Sub8_Sub1_1.method833(local166 + (float) local177 * local75);
						this.aClass10_Sub8_Sub1_1.method833(local172 + local79 * (float) local177);
						this.aClass10_Sub8_Sub1_1.method2458(local141);
						this.aClass10_Sub8_Sub1_1.method2458(local146);
						this.aClass10_Sub8_Sub1_1.method2458(local149);
						this.aClass10_Sub8_Sub1_1.method2458(local154);
					}
					if (this.anIntArray48[local98] > 64) {
						local440 = this.anIntArray48[local98] - 64 - 1;
						for (local136 = this.anIntArray47[local440] - 1; local136 >= 0; local136--) {
							local456 = this.aClass40_Sub2_Sub1ArrayArray2[local440][local136];
							local459 = local456.anInt1781;
							local149 = (byte) (local459 >> 16);
							local154 = (byte) (local459 >> 8);
							local472 = (byte) local459;
							local477 = (byte) (local459 >>> 24);
							local172 = local456.anInt1779 >> 12;
							local489 = local456.anInt1780 >> 12;
							local495 = local456.anInt1778 >> 12;
							local500 = local456.anInt1782 >> 12;
							this.aClass10_Sub8_Sub1_1.method833(0.0F);
							this.aClass10_Sub8_Sub1_1.method833(0.0F);
							this.aClass10_Sub8_Sub1_1.method833(local172 + local44 * (float) -local500);
							this.aClass10_Sub8_Sub1_1.method833(local489 + (float) -local500 * local48);
							this.aClass10_Sub8_Sub1_1.method833((float) -local500 * local52 + local495);
							this.aClass10_Sub8_Sub1_1.method2458(local149);
							this.aClass10_Sub8_Sub1_1.method2458(local154);
							this.aClass10_Sub8_Sub1_1.method2458(local472);
							this.aClass10_Sub8_Sub1_1.method2458(local477);
							this.aClass10_Sub8_Sub1_1.method833(1.0F);
							this.aClass10_Sub8_Sub1_1.method833(0.0F);
							this.aClass10_Sub8_Sub1_1.method833(local57 * (float) local500 + local172);
							this.aClass10_Sub8_Sub1_1.method833(local61 * (float) local500 + local489);
							this.aClass10_Sub8_Sub1_1.method833(local66 * (float) local500 + local495);
							this.aClass10_Sub8_Sub1_1.method2458(local149);
							this.aClass10_Sub8_Sub1_1.method2458(local154);
							this.aClass10_Sub8_Sub1_1.method2458(local472);
							this.aClass10_Sub8_Sub1_1.method2458(local477);
							this.aClass10_Sub8_Sub1_1.method833(1.0F);
							this.aClass10_Sub8_Sub1_1.method833(1.0F);
							this.aClass10_Sub8_Sub1_1.method833(local44 * (float) local500 + local172);
							this.aClass10_Sub8_Sub1_1.method833(local489 + local48 * (float) local500);
							this.aClass10_Sub8_Sub1_1.method833(local495 + local52 * (float) local500);
							this.aClass10_Sub8_Sub1_1.method2458(local149);
							this.aClass10_Sub8_Sub1_1.method2458(local154);
							this.aClass10_Sub8_Sub1_1.method2458(local472);
							this.aClass10_Sub8_Sub1_1.method2458(local477);
							this.aClass10_Sub8_Sub1_1.method833(0.0F);
							this.aClass10_Sub8_Sub1_1.method833(1.0F);
							this.aClass10_Sub8_Sub1_1.method833(local172 + local71 * (float) local500);
							this.aClass10_Sub8_Sub1_1.method833(local489 + local75 * (float) local500);
							this.aClass10_Sub8_Sub1_1.method833(local495 + local79 * (float) local500);
							this.aClass10_Sub8_Sub1_1.method2458(local149);
							this.aClass10_Sub8_Sub1_1.method2458(local154);
							this.aClass10_Sub8_Sub1_1.method2458(local472);
							this.aClass10_Sub8_Sub1_1.method2458(local477);
						}
					}
				}
			}
		}
		if (this.aClass10_Sub8_Sub1_1.anInt2989 != 0) {
			this.anInterface4_1.method5476(this.aClass10_Sub8_Sub1_1.aByteArray44, this.aClass10_Sub8_Sub1_1.anInt2989, 24);
			arg1.method1283(this.aClass71_2, this.aClass71_3, null, this.aClass71_1);
			arg1.method1269(this.aClass10_Sub8_Sub1_1.anInt2989 / 24);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!da;)V")
	private void method437(@OriginalArg(1) Class50_Sub1 arg0) {
		Static271.aFloat74 = arg0.aFloat34;
		arg0.method1265();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method1331(false);
		arg0.method1318(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Lclient!da;I)V")
	private void method438(@OriginalArg(0) Class50_Sub1 arg0) {
		arg0.method1331(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat34 != Static271.aFloat74) {
			arg0.JA(Static271.aFloat74);
		}
	}
}
