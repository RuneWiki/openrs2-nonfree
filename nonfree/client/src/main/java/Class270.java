import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class270 {

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "[C")
	private static final char[] aCharArray9 = new char[64];

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "Lclient!mq;")
	private Class226 aClass226_12;

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "Lclient!eq;")
	private Interface8 anInterface8_6;

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "Lclient!mq;")
	private Class226 aClass226_13;

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "Lclient!mq;")
	private Class226 aClass226_14;

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "[F")
	private final float[] aFloatArray63 = new float[16];

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "Lclient!wu;")
	private final Class1_Sub3_Sub2 aClass1_Sub3_Sub2_2 = new Class1_Sub3_Sub2(786336);

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
	private final int anInt7250 = Static77.method7407(1600);

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "[[Lclient!wd;")
	private final Class11_Sub5_Sub1[][] aClass11_Sub5_Sub1ArrayArray1 = new Class11_Sub5_Sub1[64][768];

	@OriginalMember(owner = "client!pm", name = "y", descriptor = "[I")
	private final int[] anIntArray431 = new int[8191];

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
	private int anInt7252 = 0;

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "[[Lclient!wd;")
	private final Class11_Sub5_Sub1[][] aClass11_Sub5_Sub1ArrayArray2 = new Class11_Sub5_Sub1[1600][64];

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "[I")
	private final int[] anIntArray432 = new int[64];

	@OriginalMember(owner = "client!pm", name = "A", descriptor = "[I")
	private final int[] anIntArray433 = new int[1600];

	static {
		for (@Pc(6) int local6 = 0; local6 < 26; local6++) {
			aCharArray9[local6] = (char) (local6 + 65);
		}
		for (@Pc(22) int local22 = 26; local22 < 52; local22++) {
			aCharArray9[local22] = (char) (local22 + 97 - 26);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray9[local38] = (char) (local38 - 4);
		}
		aCharArray9[62] = '+';
		aCharArray9[63] = '/';
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZLclient!lj;I)V")
	private void method5825(@OriginalArg(1) Class78_Sub3 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray63, 0);
		@Pc(15) float local15 = this.aFloatArray63[0];
		@Pc(20) float local20 = this.aFloatArray63[4];
		@Pc(25) float local25 = this.aFloatArray63[8];
		@Pc(30) float local30 = this.aFloatArray63[1];
		@Pc(35) float local35 = this.aFloatArray63[5];
		@Pc(40) float local40 = this.aFloatArray63[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local35 + local20;
		@Pc(52) float local52 = local40 + local25;
		@Pc(64) float local64 = local15 - local30;
		@Pc(69) float local69 = local20 - local35;
		@Pc(73) float local73 = local25 - local40;
		@Pc(77) float local77 = local30 - local15;
		@Pc(82) float local82 = local35 - local20;
		this.aClass1_Sub3_Sub2_2.anInt9802 = 0;
		@Pc(91) float local91 = local40 - local25;
		@Pc(98) int local98;
		@Pc(113) int local113;
		@Pc(122) int local122;
		@Pc(131) Class11_Sub5_Sub1 local131;
		@Pc(134) int local134;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(147) byte local147;
		@Pc(152) byte local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(170) float local170;
		@Pc(175) int local175;
		@Pc(517) float local517;
		@Pc(522) int local522;
		@Pc(462) int local462;
		@Pc(478) Class11_Sub5_Sub1 local478;
		@Pc(481) int local481;
		@Pc(494) byte local494;
		@Pc(499) byte local499;
		@Pc(511) float local511;
		if (arg0.aBoolean425) {
			for (local98 = arg1 - 1; local98 >= 0; local98--) {
				local113 = this.anIntArray433[local98] <= 64 ? this.anIntArray433[local98] : 64;
				if (local113 > 0) {
					for (local122 = local113 - 1; local122 >= 0; local122--) {
						local131 = this.aClass11_Sub5_Sub1ArrayArray2[local98][local122];
						local134 = local131.anInt4079;
						local139 = (byte) (local134 >> 16);
						local144 = (byte) (local134 >> 8);
						local147 = (byte) local134;
						local152 = (byte) (local134 >>> 24);
						local158 = local131.anInt4083 >> 12;
						local164 = local131.anInt4081 >> 12;
						local170 = local131.anInt4077 >> 12;
						local175 = local131.anInt4075 >> 12;
						this.aClass1_Sub3_Sub2_2.method7979(0.0F);
						this.aClass1_Sub3_Sub2_2.method7979(0.0F);
						this.aClass1_Sub3_Sub2_2.method7979((float) -local175 * local44 + local158);
						this.aClass1_Sub3_Sub2_2.method7979(local48 * (float) -local175 + local164);
						this.aClass1_Sub3_Sub2_2.method7979(local170 + (float) -local175 * local52);
						this.aClass1_Sub3_Sub2_2.method7917(local139);
						this.aClass1_Sub3_Sub2_2.method7917(local144);
						this.aClass1_Sub3_Sub2_2.method7917(local147);
						this.aClass1_Sub3_Sub2_2.method7917(local152);
						this.aClass1_Sub3_Sub2_2.method7979(1.0F);
						this.aClass1_Sub3_Sub2_2.method7979(0.0F);
						this.aClass1_Sub3_Sub2_2.method7979(local64 * (float) local175 + local158);
						this.aClass1_Sub3_Sub2_2.method7979(local164 + local69 * (float) local175);
						this.aClass1_Sub3_Sub2_2.method7979((float) local175 * local73 + local170);
						this.aClass1_Sub3_Sub2_2.method7917(local139);
						this.aClass1_Sub3_Sub2_2.method7917(local144);
						this.aClass1_Sub3_Sub2_2.method7917(local147);
						this.aClass1_Sub3_Sub2_2.method7917(local152);
						this.aClass1_Sub3_Sub2_2.method7979(1.0F);
						this.aClass1_Sub3_Sub2_2.method7979(1.0F);
						this.aClass1_Sub3_Sub2_2.method7979((float) local175 * local44 + local158);
						this.aClass1_Sub3_Sub2_2.method7979(local48 * (float) local175 + local164);
						this.aClass1_Sub3_Sub2_2.method7979(local170 + local52 * (float) local175);
						this.aClass1_Sub3_Sub2_2.method7917(local139);
						this.aClass1_Sub3_Sub2_2.method7917(local144);
						this.aClass1_Sub3_Sub2_2.method7917(local147);
						this.aClass1_Sub3_Sub2_2.method7917(local152);
						this.aClass1_Sub3_Sub2_2.method7979(0.0F);
						this.aClass1_Sub3_Sub2_2.method7979(1.0F);
						this.aClass1_Sub3_Sub2_2.method7979(local158 + (float) local175 * local77);
						this.aClass1_Sub3_Sub2_2.method7979(local164 + local82 * (float) local175);
						this.aClass1_Sub3_Sub2_2.method7979((float) local175 * local91 + local170);
						this.aClass1_Sub3_Sub2_2.method7917(local139);
						this.aClass1_Sub3_Sub2_2.method7917(local144);
						this.aClass1_Sub3_Sub2_2.method7917(local147);
						this.aClass1_Sub3_Sub2_2.method7917(local152);
					}
					if (this.anIntArray433[local98] > 64) {
						local462 = this.anIntArray433[local98] - 1 - 64;
						for (local134 = this.anIntArray432[local462] - 1; local134 >= 0; local134--) {
							local478 = this.aClass11_Sub5_Sub1ArrayArray1[local462][local134];
							local481 = local478.anInt4079;
							local147 = (byte) (local481 >> 16);
							local152 = (byte) (local481 >> 8);
							local494 = (byte) local481;
							local499 = (byte) (local481 >>> 24);
							local170 = local478.anInt4083 >> 12;
							local511 = local478.anInt4081 >> 12;
							local517 = local478.anInt4077 >> 12;
							local522 = local478.anInt4075 >> 12;
							this.aClass1_Sub3_Sub2_2.method7979(0.0F);
							this.aClass1_Sub3_Sub2_2.method7979(0.0F);
							this.aClass1_Sub3_Sub2_2.method7979(local170 + (float) -local522 * local44);
							this.aClass1_Sub3_Sub2_2.method7979((float) -local522 * local48 + local511);
							this.aClass1_Sub3_Sub2_2.method7979(local517 + local52 * (float) -local522);
							this.aClass1_Sub3_Sub2_2.method7917(local147);
							this.aClass1_Sub3_Sub2_2.method7917(local152);
							this.aClass1_Sub3_Sub2_2.method7917(local494);
							this.aClass1_Sub3_Sub2_2.method7917(local499);
							this.aClass1_Sub3_Sub2_2.method7979(1.0F);
							this.aClass1_Sub3_Sub2_2.method7979(0.0F);
							this.aClass1_Sub3_Sub2_2.method7979(local64 * (float) local522 + local170);
							this.aClass1_Sub3_Sub2_2.method7979((float) local522 * local69 + local511);
							this.aClass1_Sub3_Sub2_2.method7979(local517 + (float) local522 * local73);
							this.aClass1_Sub3_Sub2_2.method7917(local147);
							this.aClass1_Sub3_Sub2_2.method7917(local152);
							this.aClass1_Sub3_Sub2_2.method7917(local494);
							this.aClass1_Sub3_Sub2_2.method7917(local499);
							this.aClass1_Sub3_Sub2_2.method7979(1.0F);
							this.aClass1_Sub3_Sub2_2.method7979(1.0F);
							this.aClass1_Sub3_Sub2_2.method7979(local44 * (float) local522 + local170);
							this.aClass1_Sub3_Sub2_2.method7979(local511 + (float) local522 * local48);
							this.aClass1_Sub3_Sub2_2.method7979((float) local522 * local52 + local517);
							this.aClass1_Sub3_Sub2_2.method7917(local147);
							this.aClass1_Sub3_Sub2_2.method7917(local152);
							this.aClass1_Sub3_Sub2_2.method7917(local494);
							this.aClass1_Sub3_Sub2_2.method7917(local499);
							this.aClass1_Sub3_Sub2_2.method7979(0.0F);
							this.aClass1_Sub3_Sub2_2.method7979(1.0F);
							this.aClass1_Sub3_Sub2_2.method7979(local170 + (float) local522 * local77);
							this.aClass1_Sub3_Sub2_2.method7979(local511 + (float) local522 * local82);
							this.aClass1_Sub3_Sub2_2.method7979(local517 + (float) local522 * local91);
							this.aClass1_Sub3_Sub2_2.method7917(local147);
							this.aClass1_Sub3_Sub2_2.method7917(local152);
							this.aClass1_Sub3_Sub2_2.method7917(local494);
							this.aClass1_Sub3_Sub2_2.method7917(local499);
						}
					}
				}
			}
		} else {
			for (local98 = arg1 - 1; local98 >= 0; local98--) {
				local113 = this.anIntArray433[local98] > 64 ? 64 : this.anIntArray433[local98];
				if (local113 > 0) {
					for (local122 = local113 - 1; local122 >= 0; local122--) {
						local131 = this.aClass11_Sub5_Sub1ArrayArray2[local98][local122];
						local134 = local131.anInt4079;
						local139 = (byte) (local134 >> 16);
						local144 = (byte) (local134 >> 8);
						local147 = (byte) local134;
						local152 = (byte) (local134 >>> 24);
						local158 = local131.anInt4083 >> 12;
						local164 = local131.anInt4081 >> 12;
						local170 = local131.anInt4077 >> 12;
						local175 = local131.anInt4075 >> 12;
						this.aClass1_Sub3_Sub2_2.method7984(0.0F);
						this.aClass1_Sub3_Sub2_2.method7984(0.0F);
						this.aClass1_Sub3_Sub2_2.method7984(local44 * (float) -local175 + local158);
						this.aClass1_Sub3_Sub2_2.method7984(local164 + local48 * (float) -local175);
						this.aClass1_Sub3_Sub2_2.method7984(local170 + local52 * (float) -local175);
						this.aClass1_Sub3_Sub2_2.method7917(local139);
						this.aClass1_Sub3_Sub2_2.method7917(local144);
						this.aClass1_Sub3_Sub2_2.method7917(local147);
						this.aClass1_Sub3_Sub2_2.method7917(local152);
						this.aClass1_Sub3_Sub2_2.method7984(1.0F);
						this.aClass1_Sub3_Sub2_2.method7984(0.0F);
						this.aClass1_Sub3_Sub2_2.method7984(local158 + (float) local175 * local64);
						this.aClass1_Sub3_Sub2_2.method7984(local164 + (float) local175 * local69);
						this.aClass1_Sub3_Sub2_2.method7984((float) local175 * local73 + local170);
						this.aClass1_Sub3_Sub2_2.method7917(local139);
						this.aClass1_Sub3_Sub2_2.method7917(local144);
						this.aClass1_Sub3_Sub2_2.method7917(local147);
						this.aClass1_Sub3_Sub2_2.method7917(local152);
						this.aClass1_Sub3_Sub2_2.method7984(1.0F);
						this.aClass1_Sub3_Sub2_2.method7984(1.0F);
						this.aClass1_Sub3_Sub2_2.method7984((float) local175 * local44 + local158);
						this.aClass1_Sub3_Sub2_2.method7984(local48 * (float) local175 + local164);
						this.aClass1_Sub3_Sub2_2.method7984((float) local175 * local52 + local170);
						this.aClass1_Sub3_Sub2_2.method7917(local139);
						this.aClass1_Sub3_Sub2_2.method7917(local144);
						this.aClass1_Sub3_Sub2_2.method7917(local147);
						this.aClass1_Sub3_Sub2_2.method7917(local152);
						this.aClass1_Sub3_Sub2_2.method7984(0.0F);
						this.aClass1_Sub3_Sub2_2.method7984(1.0F);
						this.aClass1_Sub3_Sub2_2.method7984(local158 + (float) local175 * local77);
						this.aClass1_Sub3_Sub2_2.method7984(local82 * (float) local175 + local164);
						this.aClass1_Sub3_Sub2_2.method7984(local91 * (float) local175 + local170);
						this.aClass1_Sub3_Sub2_2.method7917(local139);
						this.aClass1_Sub3_Sub2_2.method7917(local144);
						this.aClass1_Sub3_Sub2_2.method7917(local147);
						this.aClass1_Sub3_Sub2_2.method7917(local152);
					}
					if (this.anIntArray433[local98] > 64) {
						local462 = this.anIntArray433[local98] - 64 - 1;
						for (local134 = this.anIntArray432[local462] - 1; local134 >= 0; local134--) {
							local478 = this.aClass11_Sub5_Sub1ArrayArray1[local462][local134];
							local481 = local478.anInt4079;
							local147 = (byte) (local481 >> 16);
							local152 = (byte) (local481 >> 8);
							local494 = (byte) local481;
							local499 = (byte) (local481 >>> 24);
							local170 = local478.anInt4083 >> 12;
							local511 = local478.anInt4081 >> 12;
							local517 = local478.anInt4077 >> 12;
							local522 = local478.anInt4075 >> 12;
							this.aClass1_Sub3_Sub2_2.method7984(0.0F);
							this.aClass1_Sub3_Sub2_2.method7984(0.0F);
							this.aClass1_Sub3_Sub2_2.method7984((float) -local522 * local44 + local170);
							this.aClass1_Sub3_Sub2_2.method7984(local511 + (float) -local522 * local48);
							this.aClass1_Sub3_Sub2_2.method7984(local517 + (float) -local522 * local52);
							this.aClass1_Sub3_Sub2_2.method7917(local147);
							this.aClass1_Sub3_Sub2_2.method7917(local152);
							this.aClass1_Sub3_Sub2_2.method7917(local494);
							this.aClass1_Sub3_Sub2_2.method7917(local499);
							this.aClass1_Sub3_Sub2_2.method7984(1.0F);
							this.aClass1_Sub3_Sub2_2.method7984(0.0F);
							this.aClass1_Sub3_Sub2_2.method7984(local64 * (float) local522 + local170);
							this.aClass1_Sub3_Sub2_2.method7984((float) local522 * local69 + local511);
							this.aClass1_Sub3_Sub2_2.method7984((float) local522 * local73 + local517);
							this.aClass1_Sub3_Sub2_2.method7917(local147);
							this.aClass1_Sub3_Sub2_2.method7917(local152);
							this.aClass1_Sub3_Sub2_2.method7917(local494);
							this.aClass1_Sub3_Sub2_2.method7917(local499);
							this.aClass1_Sub3_Sub2_2.method7984(1.0F);
							this.aClass1_Sub3_Sub2_2.method7984(1.0F);
							this.aClass1_Sub3_Sub2_2.method7984((float) local522 * local44 + local170);
							this.aClass1_Sub3_Sub2_2.method7984(local48 * (float) local522 + local511);
							this.aClass1_Sub3_Sub2_2.method7984((float) local522 * local52 + local517);
							this.aClass1_Sub3_Sub2_2.method7917(local147);
							this.aClass1_Sub3_Sub2_2.method7917(local152);
							this.aClass1_Sub3_Sub2_2.method7917(local494);
							this.aClass1_Sub3_Sub2_2.method7917(local499);
							this.aClass1_Sub3_Sub2_2.method7984(0.0F);
							this.aClass1_Sub3_Sub2_2.method7984(1.0F);
							this.aClass1_Sub3_Sub2_2.method7984((float) local522 * local77 + local170);
							this.aClass1_Sub3_Sub2_2.method7984((float) local522 * local82 + local511);
							this.aClass1_Sub3_Sub2_2.method7984(local517 + local91 * (float) local522);
							this.aClass1_Sub3_Sub2_2.method7917(local147);
							this.aClass1_Sub3_Sub2_2.method7917(local152);
							this.aClass1_Sub3_Sub2_2.method7917(local494);
							this.aClass1_Sub3_Sub2_2.method7917(local499);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub3_Sub2_2.anInt9802 != 0) {
			this.anInterface8_6.method7523(24, this.aClass1_Sub3_Sub2_2.aByteArray104, this.aClass1_Sub3_Sub2_2.anInt9802);
			arg0.method4537(this.aClass226_12, null, this.aClass226_14, this.aClass226_13);
			arg0.method4541(this.aClass1_Sub3_Sub2_2.anInt9802 / 24);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!lj;)V")
	private void method5826(@OriginalArg(1) Class78_Sub3 arg0) {
		arg0.method4542(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static1.aFloat1 != arg0.aFloat145) {
			arg0.ra(Static1.aFloat1);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLclient!dk;Lclient!lj;I)V")
	public void method5827(@OriginalArg(1) Class64 arg0, @OriginalArg(2) Class78_Sub3 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aClass34_Sub2_3 == null) {
			return;
		}
		if (arg2 < 0) {
			this.method5829(arg1);
		} else {
			this.method5832(arg1, arg2);
		}
		@Pc(26) float local26 = arg1.aClass34_Sub2_3.aFloat33;
		@Pc(30) float local30 = arg1.aClass34_Sub2_3.aFloat27;
		@Pc(34) float local34 = arg1.aClass34_Sub2_3.aFloat28;
		@Pc(38) float local38 = arg1.aClass34_Sub2_3.aFloat30;
		try {
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = Integer.MAX_VALUE;
			@Pc(52) int local52 = 0;
			@Pc(56) Class11_Sub5 local56 = arg0.aClass102_1.aClass11_Sub5_1;
			@Pc(59) Class11_Sub5 local59;
			@Pc(91) int local91;
			for (local59 = local56.aClass11_Sub5_9; local59 != local56; local59 = local59.aClass11_Sub5_9) {
				@Pc(64) Class11_Sub5_Sub1 local64 = (Class11_Sub5_Sub1) local59;
				local91 = (int) (local38 + (float) (local64.anInt4077 >> 12) * local34 + (float) (local64.anInt4081 >> 12) * local30 + (float) (local64.anInt4083 >> 12) * local26);
				if (local91 < local50) {
					local50 = local91;
				}
				this.anIntArray431[local48++] = local91;
				if (local52 < local91) {
					local52 = local91;
				}
			}
			@Pc(122) int local122 = local52 - local50;
			if (local122 + 2 > 1600) {
				local91 = Static77.method7407(local122) + 1 - this.anInt7250;
				local122 = (local122 >> local91) + 2;
			} else {
				local122 += 2;
				local91 = 0;
			}
			local59 = local56.aClass11_Sub5_9;
			local48 = 0;
			@Pc(157) int local157 = -2;
			@Pc(159) boolean local159 = true;
			@Pc(161) boolean local161 = true;
			while (local56 != local59) {
				this.anInt7252 = 0;
				for (@Pc(168) int local168 = 0; local168 < local122; local168++) {
					this.anIntArray433[local168] = 0;
				}
				for (@Pc(181) int local181 = 0; local181 < 64; local181++) {
					this.anIntArray432[local181] = 0;
				}
				while (local56 != local59) {
					@Pc(197) Class11_Sub5_Sub1 local197 = (Class11_Sub5_Sub1) local59;
					if (local161) {
						local159 = local197.aBoolean287;
						local157 = local197.anInt4078;
						local161 = false;
					}
					if (local48 > 0 && (local157 != local197.anInt4078 || local159 != local197.aBoolean287)) {
						local161 = true;
						break;
					}
					@Pc(239) int local239 = this.anIntArray431[local48++] - local50 >> local91;
					if (local239 < 1600) {
						if (this.anIntArray433[local239] < 64) {
							this.aClass11_Sub5_Sub1ArrayArray2[local239][this.anIntArray433[local239]++] = local197;
						} else {
							label102: {
								if (this.anIntArray433[local239] == 64) {
									if (this.anInt7252 == 64) {
										break label102;
									}
									this.anIntArray433[local239] += this.anInt7252++ + 1;
								}
								@Pc(307) Class11_Sub5_Sub1[] local307 = this.aClass11_Sub5_Sub1ArrayArray1[this.anIntArray433[local239] - 64 - 1];
								@Pc(317) int local317 = this.anIntArray433[local239] - 64 - 1;
								@Pc(319) int local319 = this.anIntArray432[this.anIntArray433[local239] - 64 - 1];
								this.anIntArray432[local317] = this.anIntArray432[this.anIntArray433[local239] - 64 - 1] + 1;
								local307[local319] = local197;
							}
						}
					}
					local59 = local59.aClass11_Sub5_9;
				}
				if (local157 < 0) {
					arg1.method4567(-1);
				} else {
					arg1.method4567(local157);
				}
				if (local159 && arg1.aFloat145 != Static1.aFloat1) {
					arg1.ra(Static1.aFloat1);
				} else if (arg1.aFloat145 != 1.0F) {
					arg1.ra(1.0F);
				}
				this.method5825(arg1, local122);
			}
		} catch (@Pc(376) Exception local376) {
		}
		this.method5826(arg1);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!lj;I)V")
	private void method5829(@OriginalArg(0) Class78_Sub3 arg0) {
		Static1.aFloat1 = arg0.aFloat145;
		arg0.method4538();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4542(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(Lclient!lj;I)V")
	public void method5830(@OriginalArg(0) Class78_Sub3 arg0) {
		this.anInterface8_6 = arg0.method4550(196584, true, null, 24);
		this.aClass226_12 = new Class226(this.anInterface8_6, 5126, 2, 0);
		this.aClass226_14 = new Class226(this.anInterface8_6, 5126, 3, 8);
		this.aClass226_13 = new Class226(this.anInterface8_6, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!lj;II)V")
	private void method5832(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(2) int arg1) {
		Static1.aFloat1 = arg0.aFloat145;
		arg0.method4536((float) arg1);
		arg0.method4498();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4542(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
