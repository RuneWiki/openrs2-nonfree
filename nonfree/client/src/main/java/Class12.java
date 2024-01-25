import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class12 {

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "Lclient!mk;")
	private Class208 aClass208_1;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "Lclient!vd;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "Lclient!mk;")
	private Class208 aClass208_2;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "Lclient!mk;")
	private Class208 aClass208_3;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "[F")
	private final float[] aFloatArray4 = new float[16];

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Lclient!tba;")
	private final Class3_Sub26_Sub2 aClass3_Sub26_Sub2_1 = new Class3_Sub26_Sub2(786336);

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
	private final int anInt118 = Static402.method5690(1600);

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "[[Lclient!gk;")
	private final Class25_Sub5_Sub1[][] aClass25_Sub5_Sub1ArrayArray1 = new Class25_Sub5_Sub1[1600][64];

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "[I")
	private final int[] anIntArray8 = new int[8191];

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
	private int anInt119 = 0;

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "[I")
	private final int[] anIntArray10 = new int[64];

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "[[Lclient!gk;")
	private final Class25_Sub5_Sub1[][] aClass25_Sub5_Sub1ArrayArray2 = new Class25_Sub5_Sub1[64][768];

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "[I")
	private final int[] anIntArray9 = new int[1600];

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!er;)V")
	public void method110(@OriginalArg(1) Class31_Sub2 arg0) {
		this.anInterface22_1 = arg0.method2577(24, true, 196584, null);
		this.aClass208_2 = new Class208(this.anInterface22_1, 5126, 2, 0);
		this.aClass208_3 = new Class208(this.anInterface22_1, 5126, 3, 8);
		this.aClass208_1 = new Class208(this.anInterface22_1, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(ILclient!er;)V")
	private void method112(@OriginalArg(1) Class31_Sub2 arg0) {
		Static115.aFloat73 = arg0.aFloat92;
		arg0.method2522();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method2556(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZILclient!er;)V")
	private void method114(@OriginalArg(1) int arg0, @OriginalArg(2) Class31_Sub2 arg1) {
		Static115.aFloat73 = arg1.aFloat92;
		arg1.method2500((float) arg0);
		arg1.method2534();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method2556(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!er;)V")
	private void method115(@OriginalArg(1) int arg0, @OriginalArg(2) Class31_Sub2 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray4, 0);
		@Pc(15) float local15 = this.aFloatArray4[0];
		@Pc(20) float local20 = this.aFloatArray4[4];
		@Pc(25) float local25 = this.aFloatArray4[8];
		@Pc(34) float local34 = this.aFloatArray4[1];
		@Pc(39) float local39 = this.aFloatArray4[5];
		@Pc(44) float local44 = this.aFloatArray4[9];
		@Pc(48) float local48 = local15 + local34;
		@Pc(52) float local52 = local39 + local20;
		@Pc(56) float local56 = local44 + local25;
		@Pc(61) float local61 = local15 - local34;
		@Pc(65) float local65 = local20 - local39;
		@Pc(69) float local69 = local25 - local44;
		@Pc(73) float local73 = local34 - local15;
		@Pc(78) float local78 = local39 - local20;
		this.aClass3_Sub26_Sub2_1.anInt8703 = 0;
		@Pc(86) float local86 = local44 - local25;
		@Pc(93) int local93;
		@Pc(110) int local110;
		@Pc(116) int local116;
		@Pc(125) Class25_Sub5_Sub1 local125;
		@Pc(128) int local128;
		@Pc(133) byte local133;
		@Pc(138) byte local138;
		@Pc(141) byte local141;
		@Pc(146) byte local146;
		@Pc(152) float local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(169) int local169;
		@Pc(506) float local506;
		@Pc(511) int local511;
		@Pc(451) int local451;
		@Pc(467) Class25_Sub5_Sub1 local467;
		@Pc(470) int local470;
		@Pc(483) byte local483;
		@Pc(488) byte local488;
		@Pc(500) float local500;
		if (arg1.aBoolean216) {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local110 = this.anIntArray9[local93] <= 64 ? this.anIntArray9[local93] : 64;
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass25_Sub5_Sub1ArrayArray1[local93][local116];
						local128 = local125.anInt8912;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt8915 >> 12;
						local158 = local125.anInt8911 >> 12;
						local164 = local125.anInt8914 >> 12;
						local169 = local125.anInt8913 >> 12;
						this.aClass3_Sub26_Sub2_1.method6837(0.0F);
						this.aClass3_Sub26_Sub2_1.method6837(0.0F);
						this.aClass3_Sub26_Sub2_1.method6837(local152 + local48 * (float) -local169);
						this.aClass3_Sub26_Sub2_1.method6837(local158 + (float) -local169 * local52);
						this.aClass3_Sub26_Sub2_1.method6837(local164 + (float) -local169 * local56);
						this.aClass3_Sub26_Sub2_1.method6809(local133);
						this.aClass3_Sub26_Sub2_1.method6809(local138);
						this.aClass3_Sub26_Sub2_1.method6809(local141);
						this.aClass3_Sub26_Sub2_1.method6809(local146);
						this.aClass3_Sub26_Sub2_1.method6837(1.0F);
						this.aClass3_Sub26_Sub2_1.method6837(0.0F);
						this.aClass3_Sub26_Sub2_1.method6837((float) local169 * local61 + local152);
						this.aClass3_Sub26_Sub2_1.method6837(local158 + (float) local169 * local65);
						this.aClass3_Sub26_Sub2_1.method6837(local164 + (float) local169 * local69);
						this.aClass3_Sub26_Sub2_1.method6809(local133);
						this.aClass3_Sub26_Sub2_1.method6809(local138);
						this.aClass3_Sub26_Sub2_1.method6809(local141);
						this.aClass3_Sub26_Sub2_1.method6809(local146);
						this.aClass3_Sub26_Sub2_1.method6837(1.0F);
						this.aClass3_Sub26_Sub2_1.method6837(1.0F);
						this.aClass3_Sub26_Sub2_1.method6837((float) local169 * local48 + local152);
						this.aClass3_Sub26_Sub2_1.method6837((float) local169 * local52 + local158);
						this.aClass3_Sub26_Sub2_1.method6837((float) local169 * local56 + local164);
						this.aClass3_Sub26_Sub2_1.method6809(local133);
						this.aClass3_Sub26_Sub2_1.method6809(local138);
						this.aClass3_Sub26_Sub2_1.method6809(local141);
						this.aClass3_Sub26_Sub2_1.method6809(local146);
						this.aClass3_Sub26_Sub2_1.method6837(0.0F);
						this.aClass3_Sub26_Sub2_1.method6837(1.0F);
						this.aClass3_Sub26_Sub2_1.method6837((float) local169 * local73 + local152);
						this.aClass3_Sub26_Sub2_1.method6837((float) local169 * local78 + local158);
						this.aClass3_Sub26_Sub2_1.method6837(local86 * (float) local169 + local164);
						this.aClass3_Sub26_Sub2_1.method6809(local133);
						this.aClass3_Sub26_Sub2_1.method6809(local138);
						this.aClass3_Sub26_Sub2_1.method6809(local141);
						this.aClass3_Sub26_Sub2_1.method6809(local146);
					}
					if (this.anIntArray9[local93] > 64) {
						local451 = this.anIntArray9[local93] - 65;
						for (local128 = this.anIntArray10[local451] - 1; local128 >= 0; local128--) {
							local467 = this.aClass25_Sub5_Sub1ArrayArray2[local451][local128];
							local470 = local467.anInt8912;
							local141 = (byte) (local470 >> 16);
							local146 = (byte) (local470 >> 8);
							local483 = (byte) local470;
							local488 = (byte) (local470 >>> 24);
							local164 = local467.anInt8915 >> 12;
							local500 = local467.anInt8911 >> 12;
							local506 = local467.anInt8914 >> 12;
							local511 = local467.anInt8913 >> 12;
							this.aClass3_Sub26_Sub2_1.method6837(0.0F);
							this.aClass3_Sub26_Sub2_1.method6837(0.0F);
							this.aClass3_Sub26_Sub2_1.method6837((float) -local511 * local48 + local164);
							this.aClass3_Sub26_Sub2_1.method6837(local500 + (float) -local511 * local52);
							this.aClass3_Sub26_Sub2_1.method6837(local506 + (float) -local511 * local56);
							this.aClass3_Sub26_Sub2_1.method6809(local141);
							this.aClass3_Sub26_Sub2_1.method6809(local146);
							this.aClass3_Sub26_Sub2_1.method6809(local483);
							this.aClass3_Sub26_Sub2_1.method6809(local488);
							this.aClass3_Sub26_Sub2_1.method6837(1.0F);
							this.aClass3_Sub26_Sub2_1.method6837(0.0F);
							this.aClass3_Sub26_Sub2_1.method6837(local61 * (float) local511 + local164);
							this.aClass3_Sub26_Sub2_1.method6837(local65 * (float) local511 + local500);
							this.aClass3_Sub26_Sub2_1.method6837(local506 + local69 * (float) local511);
							this.aClass3_Sub26_Sub2_1.method6809(local141);
							this.aClass3_Sub26_Sub2_1.method6809(local146);
							this.aClass3_Sub26_Sub2_1.method6809(local483);
							this.aClass3_Sub26_Sub2_1.method6809(local488);
							this.aClass3_Sub26_Sub2_1.method6837(1.0F);
							this.aClass3_Sub26_Sub2_1.method6837(1.0F);
							this.aClass3_Sub26_Sub2_1.method6837(local164 + local48 * (float) local511);
							this.aClass3_Sub26_Sub2_1.method6837((float) local511 * local52 + local500);
							this.aClass3_Sub26_Sub2_1.method6837(local506 + (float) local511 * local56);
							this.aClass3_Sub26_Sub2_1.method6809(local141);
							this.aClass3_Sub26_Sub2_1.method6809(local146);
							this.aClass3_Sub26_Sub2_1.method6809(local483);
							this.aClass3_Sub26_Sub2_1.method6809(local488);
							this.aClass3_Sub26_Sub2_1.method6837(0.0F);
							this.aClass3_Sub26_Sub2_1.method6837(1.0F);
							this.aClass3_Sub26_Sub2_1.method6837(local164 + local73 * (float) local511);
							this.aClass3_Sub26_Sub2_1.method6837(local500 + (float) local511 * local78);
							this.aClass3_Sub26_Sub2_1.method6837(local86 * (float) local511 + local506);
							this.aClass3_Sub26_Sub2_1.method6809(local141);
							this.aClass3_Sub26_Sub2_1.method6809(local146);
							this.aClass3_Sub26_Sub2_1.method6809(local483);
							this.aClass3_Sub26_Sub2_1.method6809(local488);
						}
					}
				}
			}
		} else {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local110 = this.anIntArray9[local93] > 64 ? 64 : this.anIntArray9[local93];
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass25_Sub5_Sub1ArrayArray1[local93][local116];
						local128 = local125.anInt8912;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt8915 >> 12;
						local158 = local125.anInt8911 >> 12;
						local164 = local125.anInt8914 >> 12;
						local169 = local125.anInt8913 >> 12;
						this.aClass3_Sub26_Sub2_1.method6839(0.0F);
						this.aClass3_Sub26_Sub2_1.method6839(0.0F);
						this.aClass3_Sub26_Sub2_1.method6839(local48 * (float) -local169 + local152);
						this.aClass3_Sub26_Sub2_1.method6839(local158 + local52 * (float) -local169);
						this.aClass3_Sub26_Sub2_1.method6839(local164 + local56 * (float) -local169);
						this.aClass3_Sub26_Sub2_1.method6809(local133);
						this.aClass3_Sub26_Sub2_1.method6809(local138);
						this.aClass3_Sub26_Sub2_1.method6809(local141);
						this.aClass3_Sub26_Sub2_1.method6809(local146);
						this.aClass3_Sub26_Sub2_1.method6839(1.0F);
						this.aClass3_Sub26_Sub2_1.method6839(0.0F);
						this.aClass3_Sub26_Sub2_1.method6839(local152 + local61 * (float) local169);
						this.aClass3_Sub26_Sub2_1.method6839(local65 * (float) local169 + local158);
						this.aClass3_Sub26_Sub2_1.method6839((float) local169 * local69 + local164);
						this.aClass3_Sub26_Sub2_1.method6809(local133);
						this.aClass3_Sub26_Sub2_1.method6809(local138);
						this.aClass3_Sub26_Sub2_1.method6809(local141);
						this.aClass3_Sub26_Sub2_1.method6809(local146);
						this.aClass3_Sub26_Sub2_1.method6839(1.0F);
						this.aClass3_Sub26_Sub2_1.method6839(1.0F);
						this.aClass3_Sub26_Sub2_1.method6839(local152 + local48 * (float) local169);
						this.aClass3_Sub26_Sub2_1.method6839(local52 * (float) local169 + local158);
						this.aClass3_Sub26_Sub2_1.method6839((float) local169 * local56 + local164);
						this.aClass3_Sub26_Sub2_1.method6809(local133);
						this.aClass3_Sub26_Sub2_1.method6809(local138);
						this.aClass3_Sub26_Sub2_1.method6809(local141);
						this.aClass3_Sub26_Sub2_1.method6809(local146);
						this.aClass3_Sub26_Sub2_1.method6839(0.0F);
						this.aClass3_Sub26_Sub2_1.method6839(1.0F);
						this.aClass3_Sub26_Sub2_1.method6839((float) local169 * local73 + local152);
						this.aClass3_Sub26_Sub2_1.method6839(local158 + (float) local169 * local78);
						this.aClass3_Sub26_Sub2_1.method6839(local86 * (float) local169 + local164);
						this.aClass3_Sub26_Sub2_1.method6809(local133);
						this.aClass3_Sub26_Sub2_1.method6809(local138);
						this.aClass3_Sub26_Sub2_1.method6809(local141);
						this.aClass3_Sub26_Sub2_1.method6809(local146);
					}
					if (this.anIntArray9[local93] > 64) {
						local451 = this.anIntArray9[local93] - 64 - 1;
						for (local128 = this.anIntArray10[local451] - 1; local128 >= 0; local128--) {
							local467 = this.aClass25_Sub5_Sub1ArrayArray2[local451][local128];
							local470 = local467.anInt8912;
							local141 = (byte) (local470 >> 16);
							local146 = (byte) (local470 >> 8);
							local483 = (byte) local470;
							local488 = (byte) (local470 >>> 24);
							local164 = local467.anInt8915 >> 12;
							local500 = local467.anInt8911 >> 12;
							local506 = local467.anInt8914 >> 12;
							local511 = local467.anInt8913 >> 12;
							this.aClass3_Sub26_Sub2_1.method6839(0.0F);
							this.aClass3_Sub26_Sub2_1.method6839(0.0F);
							this.aClass3_Sub26_Sub2_1.method6839(local48 * (float) -local511 + local164);
							this.aClass3_Sub26_Sub2_1.method6839((float) -local511 * local52 + local500);
							this.aClass3_Sub26_Sub2_1.method6839(local56 * (float) -local511 + local506);
							this.aClass3_Sub26_Sub2_1.method6809(local141);
							this.aClass3_Sub26_Sub2_1.method6809(local146);
							this.aClass3_Sub26_Sub2_1.method6809(local483);
							this.aClass3_Sub26_Sub2_1.method6809(local488);
							this.aClass3_Sub26_Sub2_1.method6839(1.0F);
							this.aClass3_Sub26_Sub2_1.method6839(0.0F);
							this.aClass3_Sub26_Sub2_1.method6839(local164 + (float) local511 * local61);
							this.aClass3_Sub26_Sub2_1.method6839(local500 + (float) local511 * local65);
							this.aClass3_Sub26_Sub2_1.method6839(local506 + (float) local511 * local69);
							this.aClass3_Sub26_Sub2_1.method6809(local141);
							this.aClass3_Sub26_Sub2_1.method6809(local146);
							this.aClass3_Sub26_Sub2_1.method6809(local483);
							this.aClass3_Sub26_Sub2_1.method6809(local488);
							this.aClass3_Sub26_Sub2_1.method6839(1.0F);
							this.aClass3_Sub26_Sub2_1.method6839(1.0F);
							this.aClass3_Sub26_Sub2_1.method6839((float) local511 * local48 + local164);
							this.aClass3_Sub26_Sub2_1.method6839((float) local511 * local52 + local500);
							this.aClass3_Sub26_Sub2_1.method6839((float) local511 * local56 + local506);
							this.aClass3_Sub26_Sub2_1.method6809(local141);
							this.aClass3_Sub26_Sub2_1.method6809(local146);
							this.aClass3_Sub26_Sub2_1.method6809(local483);
							this.aClass3_Sub26_Sub2_1.method6809(local488);
							this.aClass3_Sub26_Sub2_1.method6839(0.0F);
							this.aClass3_Sub26_Sub2_1.method6839(1.0F);
							this.aClass3_Sub26_Sub2_1.method6839((float) local511 * local73 + local164);
							this.aClass3_Sub26_Sub2_1.method6839(local500 + local78 * (float) local511);
							this.aClass3_Sub26_Sub2_1.method6839(local506 + local86 * (float) local511);
							this.aClass3_Sub26_Sub2_1.method6809(local141);
							this.aClass3_Sub26_Sub2_1.method6809(local146);
							this.aClass3_Sub26_Sub2_1.method6809(local483);
							this.aClass3_Sub26_Sub2_1.method6809(local488);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub26_Sub2_1.anInt8703 != 0) {
			this.anInterface22_1.method4050(this.aClass3_Sub26_Sub2_1.aByteArray213, 24, this.aClass3_Sub26_Sub2_1.anInt8703);
			arg1.method2537(this.aClass208_2, this.aClass208_1, this.aClass208_3, null);
			arg1.method2529(this.aClass3_Sub26_Sub2_1.anInt8703 / 24);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!tt;Lclient!er;BI)V")
	public void method117(@OriginalArg(0) Class323 arg0, @OriginalArg(1) Class31_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aClass42_Sub1_3 == null) {
			return;
		}
		if (arg2 >= 0) {
			this.method114(arg2, arg1);
		} else {
			this.method112(arg1);
		}
		@Pc(37) float local37 = arg1.aClass42_Sub1_3.aFloat45;
		@Pc(41) float local41 = arg1.aClass42_Sub1_3.aFloat44;
		@Pc(45) float local45 = arg1.aClass42_Sub1_3.aFloat51;
		@Pc(49) float local49 = arg1.aClass42_Sub1_3.aFloat46;
		try {
			@Pc(51) int local51 = 0;
			@Pc(53) int local53 = Integer.MAX_VALUE;
			@Pc(55) int local55 = 0;
			@Pc(59) Class25_Sub5 local59 = arg0.aClass114_1.aClass25_Sub5_3;
			@Pc(62) Class25_Sub5 local62;
			@Pc(94) int local94;
			for (local62 = local59.aClass25_Sub5_10; local62 != local59; local62 = local62.aClass25_Sub5_10) {
				@Pc(67) Class25_Sub5_Sub1 local67 = (Class25_Sub5_Sub1) local62;
				local94 = (int) (local49 + local45 * (float) (local67.anInt8914 >> 12) + local41 * (float) (local67.anInt8911 >> 12) + (float) (local67.anInt8915 >> 12) * local37);
				this.anIntArray8[local51++] = local94;
				if (local53 > local94) {
					local53 = local94;
				}
				if (local55 < local94) {
					local55 = local94;
				}
			}
			@Pc(125) int local125 = local55 - local53;
			if (local125 + 2 > 1600) {
				local94 = Static402.method5690(local125) + 1 - this.anInt118;
				local125 = (local125 >> local94) + 2;
			} else {
				local94 = 0;
				local125 += 2;
			}
			local62 = local59.aClass25_Sub5_10;
			local51 = 0;
			@Pc(160) int local160 = -2;
			@Pc(162) boolean local162 = true;
			@Pc(164) boolean local164 = true;
			while (local62 != local59) {
				this.anInt119 = 0;
				for (@Pc(171) int local171 = 0; local171 < local125; local171++) {
					this.anIntArray9[local171] = 0;
				}
				for (@Pc(184) int local184 = 0; local184 < 64; local184++) {
					this.anIntArray10[local184] = 0;
				}
				while (local59 != local62) {
					@Pc(200) Class25_Sub5_Sub1 local200 = (Class25_Sub5_Sub1) local62;
					if (local164) {
						local164 = false;
						local160 = local200.anInt8908;
						local162 = local200.aBoolean593;
					}
					if (local51 > 0 && (local160 != local200.anInt8908 || local200.aBoolean593 != local162)) {
						local164 = true;
						break;
					}
					@Pc(243) int local243 = this.anIntArray8[local51++] - local53 >> local94;
					if (local243 < 1600) {
						if (this.anIntArray9[local243] >= 64) {
							label107: {
								if (this.anIntArray9[local243] == 64) {
									if (this.anInt119 == 64) {
										break label107;
									}
									this.anIntArray9[local243] += this.anInt119++ + 1;
								}
								this.aClass25_Sub5_Sub1ArrayArray2[this.anIntArray9[local243] - 65][this.anIntArray10[this.anIntArray9[local243] - 64 - 1]++] = local200;
							}
						} else {
							this.aClass25_Sub5_Sub1ArrayArray1[local243][this.anIntArray9[local243]++] = local200;
						}
					}
					local62 = local62.aClass25_Sub5_10;
				}
				if (local160 >= 0) {
					arg1.method2566(local160);
				} else {
					arg1.method2566(-1);
				}
				if (local162 && arg1.aFloat92 != Static115.aFloat73) {
					arg1.ra(Static115.aFloat73);
				} else if (arg1.aFloat92 != 1.0F) {
					arg1.ra(1.0F);
				}
				this.method115(local125, arg1);
			}
		} catch (@Pc(376) Exception local376) {
		}
		this.method118(arg1);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!er;B)V")
	private void method118(@OriginalArg(0) Class31_Sub2 arg0) {
		arg0.method2556(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static115.aFloat73 != arg0.aFloat92) {
			arg0.ra(Static115.aFloat73);
		}
	}
}
