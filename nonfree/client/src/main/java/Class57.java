import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class57 {

	@OriginalMember(owner = "client!dp", name = "k", descriptor = "Lclient!ap;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!dp", name = "l", descriptor = "Lclient!wc;")
	private Class260 aClass260_1;

	@OriginalMember(owner = "client!dp", name = "m", descriptor = "Lclient!wc;")
	private Class260 aClass260_2;

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "Lclient!wc;")
	private Class260 aClass260_3;

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "[F")
	private final float[] aFloatArray11 = new float[16];

	@OriginalMember(owner = "client!dp", name = "i", descriptor = "Lclient!ki;")
	private final Class2_Sub23_Sub1 aClass2_Sub23_Sub1_1 = new Class2_Sub23_Sub1(786336);

	@OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
	private final int anInt1578 = Static220.method3458(1600);

	@OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
	private int anInt1579 = 0;

	@OriginalMember(owner = "client!dp", name = "s", descriptor = "[I")
	private final int[] anIntArray138 = new int[8191];

	@OriginalMember(owner = "client!dp", name = "t", descriptor = "[[Lclient!b;")
	private final Class8_Sub2_Sub1[][] aClass8_Sub2_Sub1ArrayArray1 = new Class8_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!dp", name = "r", descriptor = "[I")
	private final int[] anIntArray137 = new int[64];

	@OriginalMember(owner = "client!dp", name = "u", descriptor = "[[Lclient!b;")
	private final Class8_Sub2_Sub1[][] aClass8_Sub2_Sub1ArrayArray2 = new Class8_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!dp", name = "p", descriptor = "[I")
	private final int[] anIntArray136 = new int[1600];

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!ef;B)V")
	public void method1331(@OriginalArg(0) Class49_Sub2 arg0) {
		this.anInterface1_1 = arg0.method1593(196584, 24, null, true);
		this.aClass260_2 = new Class260(this.anInterface1_1, 5126, 2, 0);
		this.aClass260_3 = new Class260(this.anInterface1_1, 5126, 3, 8);
		this.aClass260_1 = new Class260(this.anInterface1_1, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IILclient!ef;)V")
	private void method1333(@OriginalArg(1) int arg0, @OriginalArg(2) Class49_Sub2 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray11, 0);
		@Pc(15) float local15 = this.aFloatArray11[0];
		@Pc(20) float local20 = this.aFloatArray11[4];
		@Pc(25) float local25 = this.aFloatArray11[8];
		@Pc(30) float local30 = this.aFloatArray11[1];
		@Pc(35) float local35 = this.aFloatArray11[5];
		@Pc(40) float local40 = this.aFloatArray11[9];
		@Pc(44) float local44 = local30 + local15;
		@Pc(48) float local48 = local20 + local35;
		@Pc(52) float local52 = local40 + local25;
		@Pc(56) float local56 = local15 - local30;
		@Pc(66) float local66 = local20 - local35;
		@Pc(70) float local70 = local25 - local40;
		@Pc(74) float local74 = local30 - local15;
		@Pc(79) float local79 = local35 - local20;
		this.aClass2_Sub23_Sub1_1.anInt6952 = 0;
		@Pc(88) float local88 = local40 - local25;
		@Pc(95) int local95;
		@Pc(110) int local110;
		@Pc(116) int local116;
		@Pc(125) Class8_Sub2_Sub1 local125;
		@Pc(128) int local128;
		@Pc(133) byte local133;
		@Pc(138) byte local138;
		@Pc(141) byte local141;
		@Pc(146) byte local146;
		@Pc(152) float local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(169) int local169;
		@Pc(485) float local485;
		@Pc(490) int local490;
		@Pc(430) int local430;
		@Pc(446) Class8_Sub2_Sub1 local446;
		@Pc(449) int local449;
		@Pc(462) byte local462;
		@Pc(467) byte local467;
		@Pc(479) float local479;
		if (arg1.aBoolean111) {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray136[local95] <= 64 ? this.anIntArray136[local95] : 64;
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass8_Sub2_Sub1ArrayArray1[local95][local116];
						local128 = local125.anInt7358;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt7352 >> Static214.anInt4151;
						local158 = local125.anInt7354 >> Static214.anInt4151;
						local164 = local125.anInt7356 >> Static214.anInt4151;
						local169 = local125.anInt7351 >> Static214.anInt4151;
						this.aClass2_Sub23_Sub1_1.method3246(0.0F);
						this.aClass2_Sub23_Sub1_1.method3246(0.0F);
						this.aClass2_Sub23_Sub1_1.method3246((float) -local169 * local44 + local152);
						this.aClass2_Sub23_Sub1_1.method3246(local158 + (float) -local169 * local48);
						this.aClass2_Sub23_Sub1_1.method3246(local164 + (float) -local169 * local52);
						this.aClass2_Sub23_Sub1_1.method5449(local133);
						this.aClass2_Sub23_Sub1_1.method5449(local138);
						this.aClass2_Sub23_Sub1_1.method5449(local141);
						this.aClass2_Sub23_Sub1_1.method5449(local146);
						this.aClass2_Sub23_Sub1_1.method3246(1.0F);
						this.aClass2_Sub23_Sub1_1.method3246(0.0F);
						this.aClass2_Sub23_Sub1_1.method3246(local152 + local56 * (float) local169);
						this.aClass2_Sub23_Sub1_1.method3246(local66 * (float) local169 + local158);
						this.aClass2_Sub23_Sub1_1.method3246(local164 + local70 * (float) local169);
						this.aClass2_Sub23_Sub1_1.method5449(local133);
						this.aClass2_Sub23_Sub1_1.method5449(local138);
						this.aClass2_Sub23_Sub1_1.method5449(local141);
						this.aClass2_Sub23_Sub1_1.method5449(local146);
						this.aClass2_Sub23_Sub1_1.method3246(1.0F);
						this.aClass2_Sub23_Sub1_1.method3246(1.0F);
						this.aClass2_Sub23_Sub1_1.method3246(local44 * (float) local169 + local152);
						this.aClass2_Sub23_Sub1_1.method3246(local158 + local48 * (float) local169);
						this.aClass2_Sub23_Sub1_1.method3246(local52 * (float) local169 + local164);
						this.aClass2_Sub23_Sub1_1.method5449(local133);
						this.aClass2_Sub23_Sub1_1.method5449(local138);
						this.aClass2_Sub23_Sub1_1.method5449(local141);
						this.aClass2_Sub23_Sub1_1.method5449(local146);
						this.aClass2_Sub23_Sub1_1.method3246(0.0F);
						this.aClass2_Sub23_Sub1_1.method3246(1.0F);
						this.aClass2_Sub23_Sub1_1.method3246(local152 + (float) local169 * local74);
						this.aClass2_Sub23_Sub1_1.method3246(local158 + local79 * (float) local169);
						this.aClass2_Sub23_Sub1_1.method3246((float) local169 * local88 + local164);
						this.aClass2_Sub23_Sub1_1.method5449(local133);
						this.aClass2_Sub23_Sub1_1.method5449(local138);
						this.aClass2_Sub23_Sub1_1.method5449(local141);
						this.aClass2_Sub23_Sub1_1.method5449(local146);
					}
					if (this.anIntArray136[local95] > 64) {
						local430 = this.anIntArray136[local95] - 65;
						for (local128 = this.anIntArray137[local430] - 1; local128 >= 0; local128--) {
							local446 = this.aClass8_Sub2_Sub1ArrayArray2[local430][local128];
							local449 = local446.anInt7358;
							local141 = (byte) (local449 >> 16);
							local146 = (byte) (local449 >> 8);
							local462 = (byte) local449;
							local467 = (byte) (local449 >>> 24);
							local164 = local446.anInt7352 >> Static214.anInt4151;
							local479 = local446.anInt7354 >> Static214.anInt4151;
							local485 = local446.anInt7356 >> Static214.anInt4151;
							local490 = local446.anInt7351 >> Static214.anInt4151;
							this.aClass2_Sub23_Sub1_1.method3246(0.0F);
							this.aClass2_Sub23_Sub1_1.method3246(0.0F);
							this.aClass2_Sub23_Sub1_1.method3246(local164 + local44 * (float) -local490);
							this.aClass2_Sub23_Sub1_1.method3246(local479 + local48 * (float) -local490);
							this.aClass2_Sub23_Sub1_1.method3246(local52 * (float) -local490 + local485);
							this.aClass2_Sub23_Sub1_1.method5449(local141);
							this.aClass2_Sub23_Sub1_1.method5449(local146);
							this.aClass2_Sub23_Sub1_1.method5449(local462);
							this.aClass2_Sub23_Sub1_1.method5449(local467);
							this.aClass2_Sub23_Sub1_1.method3246(1.0F);
							this.aClass2_Sub23_Sub1_1.method3246(0.0F);
							this.aClass2_Sub23_Sub1_1.method3246(local56 * (float) local490 + local164);
							this.aClass2_Sub23_Sub1_1.method3246((float) local490 * local66 + local479);
							this.aClass2_Sub23_Sub1_1.method3246(local70 * (float) local490 + local485);
							this.aClass2_Sub23_Sub1_1.method5449(local141);
							this.aClass2_Sub23_Sub1_1.method5449(local146);
							this.aClass2_Sub23_Sub1_1.method5449(local462);
							this.aClass2_Sub23_Sub1_1.method5449(local467);
							this.aClass2_Sub23_Sub1_1.method3246(1.0F);
							this.aClass2_Sub23_Sub1_1.method3246(1.0F);
							this.aClass2_Sub23_Sub1_1.method3246(local44 * (float) local490 + local164);
							this.aClass2_Sub23_Sub1_1.method3246((float) local490 * local48 + local479);
							this.aClass2_Sub23_Sub1_1.method3246(local485 + local52 * (float) local490);
							this.aClass2_Sub23_Sub1_1.method5449(local141);
							this.aClass2_Sub23_Sub1_1.method5449(local146);
							this.aClass2_Sub23_Sub1_1.method5449(local462);
							this.aClass2_Sub23_Sub1_1.method5449(local467);
							this.aClass2_Sub23_Sub1_1.method3246(0.0F);
							this.aClass2_Sub23_Sub1_1.method3246(1.0F);
							this.aClass2_Sub23_Sub1_1.method3246(local164 + (float) local490 * local74);
							this.aClass2_Sub23_Sub1_1.method3246((float) local490 * local79 + local479);
							this.aClass2_Sub23_Sub1_1.method3246((float) local490 * local88 + local485);
							this.aClass2_Sub23_Sub1_1.method5449(local141);
							this.aClass2_Sub23_Sub1_1.method5449(local146);
							this.aClass2_Sub23_Sub1_1.method5449(local462);
							this.aClass2_Sub23_Sub1_1.method5449(local467);
						}
					}
				}
			}
		} else {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray136[local95] > 64 ? 64 : this.anIntArray136[local95];
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass8_Sub2_Sub1ArrayArray1[local95][local116];
						local128 = local125.anInt7358;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt7352 >> Static214.anInt4151;
						local158 = local125.anInt7354 >> Static214.anInt4151;
						local164 = local125.anInt7356 >> Static214.anInt4151;
						local169 = local125.anInt7351 >> Static214.anInt4151;
						this.aClass2_Sub23_Sub1_1.method3249(0.0F);
						this.aClass2_Sub23_Sub1_1.method3249(0.0F);
						this.aClass2_Sub23_Sub1_1.method3249(local152 + local44 * (float) -local169);
						this.aClass2_Sub23_Sub1_1.method3249((float) -local169 * local48 + local158);
						this.aClass2_Sub23_Sub1_1.method3249(local164 + local52 * (float) -local169);
						this.aClass2_Sub23_Sub1_1.method5449(local133);
						this.aClass2_Sub23_Sub1_1.method5449(local138);
						this.aClass2_Sub23_Sub1_1.method5449(local141);
						this.aClass2_Sub23_Sub1_1.method5449(local146);
						this.aClass2_Sub23_Sub1_1.method3249(1.0F);
						this.aClass2_Sub23_Sub1_1.method3249(0.0F);
						this.aClass2_Sub23_Sub1_1.method3249(local56 * (float) local169 + local152);
						this.aClass2_Sub23_Sub1_1.method3249(local66 * (float) local169 + local158);
						this.aClass2_Sub23_Sub1_1.method3249(local70 * (float) local169 + local164);
						this.aClass2_Sub23_Sub1_1.method5449(local133);
						this.aClass2_Sub23_Sub1_1.method5449(local138);
						this.aClass2_Sub23_Sub1_1.method5449(local141);
						this.aClass2_Sub23_Sub1_1.method5449(local146);
						this.aClass2_Sub23_Sub1_1.method3249(1.0F);
						this.aClass2_Sub23_Sub1_1.method3249(1.0F);
						this.aClass2_Sub23_Sub1_1.method3249(local152 + local44 * (float) local169);
						this.aClass2_Sub23_Sub1_1.method3249(local48 * (float) local169 + local158);
						this.aClass2_Sub23_Sub1_1.method3249((float) local169 * local52 + local164);
						this.aClass2_Sub23_Sub1_1.method5449(local133);
						this.aClass2_Sub23_Sub1_1.method5449(local138);
						this.aClass2_Sub23_Sub1_1.method5449(local141);
						this.aClass2_Sub23_Sub1_1.method5449(local146);
						this.aClass2_Sub23_Sub1_1.method3249(0.0F);
						this.aClass2_Sub23_Sub1_1.method3249(1.0F);
						this.aClass2_Sub23_Sub1_1.method3249(local152 + local74 * (float) local169);
						this.aClass2_Sub23_Sub1_1.method3249(local158 + local79 * (float) local169);
						this.aClass2_Sub23_Sub1_1.method3249(local164 + (float) local169 * local88);
						this.aClass2_Sub23_Sub1_1.method5449(local133);
						this.aClass2_Sub23_Sub1_1.method5449(local138);
						this.aClass2_Sub23_Sub1_1.method5449(local141);
						this.aClass2_Sub23_Sub1_1.method5449(local146);
					}
					if (this.anIntArray136[local95] > 64) {
						local430 = this.anIntArray136[local95] - 1 - 64;
						for (local128 = this.anIntArray137[local430] - 1; local128 >= 0; local128--) {
							local446 = this.aClass8_Sub2_Sub1ArrayArray2[local430][local128];
							local449 = local446.anInt7358;
							local141 = (byte) (local449 >> 16);
							local146 = (byte) (local449 >> 8);
							local462 = (byte) local449;
							local467 = (byte) (local449 >>> 24);
							local164 = local446.anInt7352 >> Static214.anInt4151;
							local479 = local446.anInt7354 >> Static214.anInt4151;
							local485 = local446.anInt7356 >> Static214.anInt4151;
							local490 = local446.anInt7351 >> Static214.anInt4151;
							this.aClass2_Sub23_Sub1_1.method3249(0.0F);
							this.aClass2_Sub23_Sub1_1.method3249(0.0F);
							this.aClass2_Sub23_Sub1_1.method3249(local44 * (float) -local490 + local164);
							this.aClass2_Sub23_Sub1_1.method3249(local479 + (float) -local490 * local48);
							this.aClass2_Sub23_Sub1_1.method3249(local52 * (float) -local490 + local485);
							this.aClass2_Sub23_Sub1_1.method5449(local141);
							this.aClass2_Sub23_Sub1_1.method5449(local146);
							this.aClass2_Sub23_Sub1_1.method5449(local462);
							this.aClass2_Sub23_Sub1_1.method5449(local467);
							this.aClass2_Sub23_Sub1_1.method3249(1.0F);
							this.aClass2_Sub23_Sub1_1.method3249(0.0F);
							this.aClass2_Sub23_Sub1_1.method3249(local56 * (float) local490 + local164);
							this.aClass2_Sub23_Sub1_1.method3249(local479 + (float) local490 * local66);
							this.aClass2_Sub23_Sub1_1.method3249(local485 + (float) local490 * local70);
							this.aClass2_Sub23_Sub1_1.method5449(local141);
							this.aClass2_Sub23_Sub1_1.method5449(local146);
							this.aClass2_Sub23_Sub1_1.method5449(local462);
							this.aClass2_Sub23_Sub1_1.method5449(local467);
							this.aClass2_Sub23_Sub1_1.method3249(1.0F);
							this.aClass2_Sub23_Sub1_1.method3249(1.0F);
							this.aClass2_Sub23_Sub1_1.method3249(local164 + (float) local490 * local44);
							this.aClass2_Sub23_Sub1_1.method3249(local479 + local48 * (float) local490);
							this.aClass2_Sub23_Sub1_1.method3249(local52 * (float) local490 + local485);
							this.aClass2_Sub23_Sub1_1.method5449(local141);
							this.aClass2_Sub23_Sub1_1.method5449(local146);
							this.aClass2_Sub23_Sub1_1.method5449(local462);
							this.aClass2_Sub23_Sub1_1.method5449(local467);
							this.aClass2_Sub23_Sub1_1.method3249(0.0F);
							this.aClass2_Sub23_Sub1_1.method3249(1.0F);
							this.aClass2_Sub23_Sub1_1.method3249(local164 + local74 * (float) local490);
							this.aClass2_Sub23_Sub1_1.method3249((float) local490 * local79 + local479);
							this.aClass2_Sub23_Sub1_1.method3249(local485 + local88 * (float) local490);
							this.aClass2_Sub23_Sub1_1.method5449(local141);
							this.aClass2_Sub23_Sub1_1.method5449(local146);
							this.aClass2_Sub23_Sub1_1.method5449(local462);
							this.aClass2_Sub23_Sub1_1.method5449(local467);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub23_Sub1_1.anInt6952 != 0) {
			this.anInterface1_1.method691(this.aClass2_Sub23_Sub1_1.aByteArray130, 24, this.aClass2_Sub23_Sub1_1.anInt6952);
			arg1.method1618(this.aClass260_3, this.aClass260_1, null, this.aClass260_2);
			arg1.method1610(this.aClass2_Sub23_Sub1_1.anInt6952 / 24);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLclient!ef;)V")
	private void method1334(@OriginalArg(1) Class49_Sub2 arg0) {
		Static235.aFloat86 = arg0.aFloat34;
		arg0.method1638();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method1635(false);
		arg0.method1594(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!ef;)V")
	private void method1335(@OriginalArg(1) Class49_Sub2 arg0) {
		arg0.method1635(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat34 != Static235.aFloat86) {
			arg0.B(Static235.aFloat86);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!ef;ILclient!pn;)V")
	public void method1336(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(2) Class194 arg1) {
		if (arg0.aClass35_Sub2_3 == null) {
			return;
		}
		this.method1334(arg0);
		@Pc(17) float local17 = arg0.aClass35_Sub2_3.aFloat93;
		@Pc(21) float local21 = arg0.aClass35_Sub2_3.aFloat99;
		@Pc(32) float local32 = arg0.aClass35_Sub2_3.aFloat94;
		@Pc(36) float local36 = arg0.aClass35_Sub2_3.aFloat91;
		try {
			@Pc(41) int local41;
			@Pc(43) int local43;
			@Pc(49) Class8_Sub2 local49;
			@Pc(151) int local151;
			@Pc(294) Class8_Sub2_Sub1[] local294;
			@Pc(162) int local162;
			@Pc(304) int local304;
			@Pc(306) int local306;
			if (arg1.aBoolean391) {
				local41 = arg1.anInt5428 - arg1.anInt5429;
				if (local41 + 2 > 1600) {
					local43 = Static220.method3458(local41) + 1 - this.anInt1578;
					local41 = (local41 >> local43) + 2;
				} else {
					local43 = 0;
					local41 += 2;
				}
				@Pc(434) Class8_Sub2 local434 = arg1.aClass191_1.aClass8_Sub2_5;
				local49 = local434.aClass8_Sub2_8;
				@Pc(439) int local439 = -2;
				@Pc(441) boolean local441 = true;
				@Pc(443) boolean local443 = true;
				while (local434 != local49) {
					this.anInt1579 = 0;
					for (local151 = 0; local151 < local41; local151++) {
						this.anIntArray136[local151] = 0;
					}
					for (@Pc(467) int local467 = 0; local467 < 64; local467++) {
						this.anIntArray137[local467] = 0;
					}
					while (local49 != local434) {
						@Pc(485) Class8_Sub2_Sub1 local485 = (Class8_Sub2_Sub1) local49;
						if (local443) {
							local443 = false;
							local439 = local485.anInt7357;
							local441 = local485.aBoolean482;
						} else if (local439 != local485.anInt7357 || local441 != local485.aBoolean482) {
							local443 = true;
							break;
						}
						local162 = (int) ((float) (local485.anInt7352 >> Static214.anInt4151) * local17 + local21 * (float) (local485.anInt7354 >> Static214.anInt4151) + (float) (local485.anInt7356 >> Static214.anInt4151) * local32 + local36) - arg1.anInt5429 >> local43;
						if (local162 < 1600) {
							if (this.anIntArray136[local162] >= 64) {
								label136: {
									if (this.anIntArray136[local162] == 64) {
										if (this.anInt1579 == 64) {
											break label136;
										}
										this.anIntArray136[local162] += this.anInt1579++ + 1;
									}
									local294 = this.aClass8_Sub2_Sub1ArrayArray2[this.anIntArray136[local162] - 64 - 1];
									local304 = this.anIntArray136[local162] - 65;
									local306 = this.anIntArray137[this.anIntArray136[local162] - 65];
									this.anIntArray137[local304] = this.anIntArray137[this.anIntArray136[local162] - 65] + 1;
									local294[local306] = local485;
								}
							} else {
								this.aClass8_Sub2_Sub1ArrayArray1[local162][this.anIntArray136[local162]++] = local485;
							}
						}
						local49 = local49.aClass8_Sub2_8;
					}
					if (local439 < 0) {
						arg0.method1646(null);
					} else {
						arg0.method1646(arg0.aClass204_1.method4531(local439));
						arg0.method1624(arg0.anInterface4_6.method3794(local439).anInt3820);
					}
					if (local441 && arg0.aFloat34 != Static235.aFloat86) {
						arg0.B(Static235.aFloat86);
					} else if (arg0.aFloat34 != 1.0F) {
						arg0.B(1.0F);
					}
					this.method1333(local41, arg0);
				}
			} else {
				local41 = 0;
				local43 = Integer.MAX_VALUE;
				@Pc(45) int local45 = 0;
				local49 = arg1.aClass191_1.aClass8_Sub2_5;
				@Pc(52) Class8_Sub2 local52;
				@Pc(84) int local84;
				for (local52 = local49.aClass8_Sub2_8; local52 != local49; local52 = local52.aClass8_Sub2_8) {
					@Pc(57) Class8_Sub2_Sub1 local57 = (Class8_Sub2_Sub1) local52;
					local84 = (int) (local36 + local17 * (float) (local57.anInt7352 >> Static214.anInt4151) + local21 * (float) (local57.anInt7354 >> Static214.anInt4151) + local32 * (float) (local57.anInt7356 >> Static214.anInt4151));
					if (local45 < local84) {
						local45 = local84;
					}
					this.anIntArray138[local41++] = local84;
					if (local84 < local43) {
						local43 = local84;
					}
				}
				@Pc(115) int local115 = local45 - local43;
				if (local115 + 2 <= 1600) {
					local115 += 2;
					local84 = 0;
				} else {
					local84 = Static220.method3458(local115) + 1 - this.anInt1578;
					local115 = (local115 >> local84) + 2;
				}
				local41 = 0;
				local52 = local49.aClass8_Sub2_8;
				local151 = -2;
				@Pc(153) boolean local153 = true;
				@Pc(155) boolean local155 = true;
				while (local52 != local49) {
					this.anInt1579 = 0;
					for (local162 = 0; local162 < local115; local162++) {
						this.anIntArray136[local162] = 0;
					}
					for (@Pc(179) int local179 = 0; local179 < 64; local179++) {
						this.anIntArray137[local179] = 0;
					}
					while (local52 != local49) {
						@Pc(195) Class8_Sub2_Sub1 local195 = (Class8_Sub2_Sub1) local52;
						if (local155) {
							local151 = local195.anInt7357;
							local155 = false;
							local153 = local195.aBoolean482;
						}
						if (local41 > 0 && (local151 != local195.anInt7357 || local195.aBoolean482 != local153)) {
							local155 = true;
							break;
						}
						@Pc(237) int local237 = this.anIntArray138[local41++] - local43 >> local84;
						if (local237 < 1600) {
							if (this.anIntArray136[local237] >= 64) {
								label181: {
									if (this.anIntArray136[local237] == 64) {
										if (this.anInt1579 == 64) {
											break label181;
										}
										this.anIntArray136[local237] += this.anInt1579++ + 1;
									}
									local294 = this.aClass8_Sub2_Sub1ArrayArray2[this.anIntArray136[local237] - 64 - 1];
									local304 = this.anIntArray136[local237] - 64 - 1;
									local306 = this.anIntArray137[this.anIntArray136[local237] - 64 - 1];
									this.anIntArray137[local304] = this.anIntArray137[this.anIntArray136[local237] - 64 - 1] + 1;
									local294[local306] = local195;
								}
							} else {
								this.aClass8_Sub2_Sub1ArrayArray1[local237][this.anIntArray136[local237]++] = local195;
							}
						}
						local52 = local52.aClass8_Sub2_8;
					}
					if (local151 < 0) {
						arg0.method1646(null);
					} else {
						arg0.method1646(arg0.aClass204_1.method4531(local151));
						arg0.method1624(arg0.anInterface4_6.method3794(local151).anInt3820);
					}
					if (local153 && Static235.aFloat86 != arg0.aFloat34) {
						arg0.B(Static235.aFloat86);
					} else if (arg0.aFloat34 != 1.0F) {
						arg0.B(1.0F);
					}
					this.method1333(local115, arg0);
				}
			}
		} catch (@Pc(698) Exception local698) {
		}
		this.method1335(arg0);
	}
}
