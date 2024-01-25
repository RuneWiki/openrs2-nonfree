import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public final class Class225 {

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "Lclient!pe;")
	private Class287 aClass287_5;

	@OriginalMember(owner = "client!lfa", name = "t", descriptor = "Lclient!pe;")
	private Class287 aClass287_6;

	@OriginalMember(owner = "client!lfa", name = "j", descriptor = "Lclient!lm;")
	private Interface13 anInterface13_4;

	@OriginalMember(owner = "client!lfa", name = "p", descriptor = "Lclient!pe;")
	private Class287 aClass287_7;

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "[F")
	private final float[] aFloatArray42 = new float[16];

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "Lclient!dda;")
	private final Class3_Sub2_Sub2 aClass3_Sub2_Sub2_3 = new Class3_Sub2_Sub2(786336);

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "I")
	private final int anInt5773 = Static462.method6277(1600);

	@OriginalMember(owner = "client!lfa", name = "u", descriptor = "[I")
	private final int[] anIntArray417 = new int[1600];

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "[[Lclient!jma;")
	private final Class9_Sub2_Sub1[][] aClass9_Sub2_Sub1ArrayArray1 = new Class9_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!lfa", name = "o", descriptor = "[[Lclient!jma;")
	private final Class9_Sub2_Sub1[][] aClass9_Sub2_Sub1ArrayArray2 = new Class9_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!lfa", name = "k", descriptor = "[I")
	private final int[] anIntArray416 = new int[64];

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
	private int anInt5774 = 0;

	@OriginalMember(owner = "client!lfa", name = "n", descriptor = "[I")
	private final int[] anIntArray418 = new int[8191];

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILclient!aq;)V")
	private void method5079(@OriginalArg(1) Class22_Sub1 arg0) {
		arg0.method902(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static675.aFloat194 != arg0.aFloat21) {
			arg0.xa(Static675.aFloat194);
		}
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(IILclient!aq;)V")
	private void method5080(@OriginalArg(1) int arg0, @OriginalArg(2) Class22_Sub1 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray42, 0);
		@Pc(15) float local15 = this.aFloatArray42[0];
		@Pc(20) float local20 = this.aFloatArray42[4];
		@Pc(25) float local25 = this.aFloatArray42[8];
		@Pc(30) float local30 = this.aFloatArray42[1];
		@Pc(35) float local35 = this.aFloatArray42[5];
		@Pc(40) float local40 = this.aFloatArray42[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local20 + local35;
		@Pc(52) float local52 = local40 + local25;
		@Pc(57) float local57 = local15 - local30;
		@Pc(62) float local62 = local20 - local35;
		@Pc(74) float local74 = local25 - local40;
		@Pc(78) float local78 = local30 - local15;
		@Pc(82) float local82 = local35 - local20;
		this.aClass3_Sub2_Sub2_3.anInt2178 = 0;
		@Pc(91) float local91 = local40 - local25;
		@Pc(98) int local98;
		@Pc(116) int local116;
		@Pc(122) int local122;
		@Pc(133) Class9_Sub2_Sub1 local133;
		@Pc(136) int local136;
		@Pc(141) byte local141;
		@Pc(146) byte local146;
		@Pc(149) byte local149;
		@Pc(154) byte local154;
		@Pc(160) float local160;
		@Pc(166) float local166;
		@Pc(172) float local172;
		@Pc(177) int local177;
		@Pc(504) float local504;
		@Pc(509) int local509;
		@Pc(449) int local449;
		@Pc(465) Class9_Sub2_Sub1 local465;
		@Pc(468) int local468;
		@Pc(481) byte local481;
		@Pc(486) byte local486;
		@Pc(498) float local498;
		if (arg1.aBoolean60) {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local116 = this.anIntArray417[local98] <= 64 ? this.anIntArray417[local98] : 64;
				if (local116 > 0) {
					for (local122 = local116 - 1; local122 >= 0; local122--) {
						local133 = this.aClass9_Sub2_Sub1ArrayArray2[local98][local122];
						local136 = local133.anInt1780;
						local141 = (byte) (local136 >> 16);
						local146 = (byte) (local136 >> 8);
						local149 = (byte) local136;
						local154 = (byte) (local136 >>> 24);
						local160 = (float) (local133.anInt1777 >> 12);
						local166 = (float) (local133.anInt1772 >> 12);
						local172 = (float) (local133.anInt1776 >> 12);
						local177 = local133.anInt1775 >> 12;
						this.aClass3_Sub2_Sub2_3.method2080(0.0F);
						this.aClass3_Sub2_Sub2_3.method2080(0.0F);
						this.aClass3_Sub2_Sub2_3.method2080(local160 + (float) -local177 * local44);
						this.aClass3_Sub2_Sub2_3.method2080(local166 + local48 * (float) -local177);
						this.aClass3_Sub2_Sub2_3.method2080(local172 + local52 * (float) -local177);
						this.aClass3_Sub2_Sub2_3.method2065(local141);
						this.aClass3_Sub2_Sub2_3.method2065(local146);
						this.aClass3_Sub2_Sub2_3.method2065(local149);
						this.aClass3_Sub2_Sub2_3.method2065(local154);
						this.aClass3_Sub2_Sub2_3.method2080(1.0F);
						this.aClass3_Sub2_Sub2_3.method2080(0.0F);
						this.aClass3_Sub2_Sub2_3.method2080(local57 * (float) local177 + local160);
						this.aClass3_Sub2_Sub2_3.method2080((float) local177 * local62 + local166);
						this.aClass3_Sub2_Sub2_3.method2080(local172 + local74 * (float) local177);
						this.aClass3_Sub2_Sub2_3.method2065(local141);
						this.aClass3_Sub2_Sub2_3.method2065(local146);
						this.aClass3_Sub2_Sub2_3.method2065(local149);
						this.aClass3_Sub2_Sub2_3.method2065(local154);
						this.aClass3_Sub2_Sub2_3.method2080(1.0F);
						this.aClass3_Sub2_Sub2_3.method2080(1.0F);
						this.aClass3_Sub2_Sub2_3.method2080((float) local177 * local44 + local160);
						this.aClass3_Sub2_Sub2_3.method2080((float) local177 * local48 + local166);
						this.aClass3_Sub2_Sub2_3.method2080(local52 * (float) local177 + local172);
						this.aClass3_Sub2_Sub2_3.method2065(local141);
						this.aClass3_Sub2_Sub2_3.method2065(local146);
						this.aClass3_Sub2_Sub2_3.method2065(local149);
						this.aClass3_Sub2_Sub2_3.method2065(local154);
						this.aClass3_Sub2_Sub2_3.method2080(0.0F);
						this.aClass3_Sub2_Sub2_3.method2080(1.0F);
						this.aClass3_Sub2_Sub2_3.method2080(local78 * (float) local177 + local160);
						this.aClass3_Sub2_Sub2_3.method2080(local82 * (float) local177 + local166);
						this.aClass3_Sub2_Sub2_3.method2080(local172 + (float) local177 * local91);
						this.aClass3_Sub2_Sub2_3.method2065(local141);
						this.aClass3_Sub2_Sub2_3.method2065(local146);
						this.aClass3_Sub2_Sub2_3.method2065(local149);
						this.aClass3_Sub2_Sub2_3.method2065(local154);
					}
					if (this.anIntArray417[local98] > 64) {
						local449 = this.anIntArray417[local98] - 1 - 64;
						for (local136 = this.anIntArray416[local449] - 1; local136 >= 0; local136--) {
							local465 = this.aClass9_Sub2_Sub1ArrayArray1[local449][local136];
							local468 = local465.anInt1780;
							local149 = (byte) (local468 >> 16);
							local154 = (byte) (local468 >> 8);
							local481 = (byte) local468;
							local486 = (byte) (local468 >>> 24);
							local172 = (float) (local465.anInt1777 >> 12);
							local498 = (float) (local465.anInt1772 >> 12);
							local504 = (float) (local465.anInt1776 >> 12);
							local509 = local465.anInt1775 >> 12;
							this.aClass3_Sub2_Sub2_3.method2080(0.0F);
							this.aClass3_Sub2_Sub2_3.method2080(0.0F);
							this.aClass3_Sub2_Sub2_3.method2080(local172 + local44 * (float) -local509);
							this.aClass3_Sub2_Sub2_3.method2080(local48 * (float) -local509 + local498);
							this.aClass3_Sub2_Sub2_3.method2080(local504 + local52 * (float) -local509);
							this.aClass3_Sub2_Sub2_3.method2065(local149);
							this.aClass3_Sub2_Sub2_3.method2065(local154);
							this.aClass3_Sub2_Sub2_3.method2065(local481);
							this.aClass3_Sub2_Sub2_3.method2065(local486);
							this.aClass3_Sub2_Sub2_3.method2080(1.0F);
							this.aClass3_Sub2_Sub2_3.method2080(0.0F);
							this.aClass3_Sub2_Sub2_3.method2080(local172 + (float) local509 * local57);
							this.aClass3_Sub2_Sub2_3.method2080((float) local509 * local62 + local498);
							this.aClass3_Sub2_Sub2_3.method2080((float) local509 * local74 + local504);
							this.aClass3_Sub2_Sub2_3.method2065(local149);
							this.aClass3_Sub2_Sub2_3.method2065(local154);
							this.aClass3_Sub2_Sub2_3.method2065(local481);
							this.aClass3_Sub2_Sub2_3.method2065(local486);
							this.aClass3_Sub2_Sub2_3.method2080(1.0F);
							this.aClass3_Sub2_Sub2_3.method2080(1.0F);
							this.aClass3_Sub2_Sub2_3.method2080(local172 + local44 * (float) local509);
							this.aClass3_Sub2_Sub2_3.method2080((float) local509 * local48 + local498);
							this.aClass3_Sub2_Sub2_3.method2080(local504 + (float) local509 * local52);
							this.aClass3_Sub2_Sub2_3.method2065(local149);
							this.aClass3_Sub2_Sub2_3.method2065(local154);
							this.aClass3_Sub2_Sub2_3.method2065(local481);
							this.aClass3_Sub2_Sub2_3.method2065(local486);
							this.aClass3_Sub2_Sub2_3.method2080(0.0F);
							this.aClass3_Sub2_Sub2_3.method2080(1.0F);
							this.aClass3_Sub2_Sub2_3.method2080(local172 + local78 * (float) local509);
							this.aClass3_Sub2_Sub2_3.method2080((float) local509 * local82 + local498);
							this.aClass3_Sub2_Sub2_3.method2080(local504 + (float) local509 * local91);
							this.aClass3_Sub2_Sub2_3.method2065(local149);
							this.aClass3_Sub2_Sub2_3.method2065(local154);
							this.aClass3_Sub2_Sub2_3.method2065(local481);
							this.aClass3_Sub2_Sub2_3.method2065(local486);
						}
					}
				}
			}
		} else {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local116 = this.anIntArray417[local98] > 64 ? 64 : this.anIntArray417[local98];
				if (local116 > 0) {
					for (local122 = local116 - 1; local122 >= 0; local122--) {
						local133 = this.aClass9_Sub2_Sub1ArrayArray2[local98][local122];
						local136 = local133.anInt1780;
						local141 = (byte) (local136 >> 16);
						local146 = (byte) (local136 >> 8);
						local149 = (byte) local136;
						local154 = (byte) (local136 >>> 24);
						local160 = (float) (local133.anInt1777 >> 12);
						local166 = (float) (local133.anInt1772 >> 12);
						local172 = (float) (local133.anInt1776 >> 12);
						local177 = local133.anInt1775 >> 12;
						this.aClass3_Sub2_Sub2_3.method2079(0.0F);
						this.aClass3_Sub2_Sub2_3.method2079(0.0F);
						this.aClass3_Sub2_Sub2_3.method2079((float) -local177 * local44 + local160);
						this.aClass3_Sub2_Sub2_3.method2079(local166 + (float) -local177 * local48);
						this.aClass3_Sub2_Sub2_3.method2079(local172 + (float) -local177 * local52);
						this.aClass3_Sub2_Sub2_3.method2065(local141);
						this.aClass3_Sub2_Sub2_3.method2065(local146);
						this.aClass3_Sub2_Sub2_3.method2065(local149);
						this.aClass3_Sub2_Sub2_3.method2065(local154);
						this.aClass3_Sub2_Sub2_3.method2079(1.0F);
						this.aClass3_Sub2_Sub2_3.method2079(0.0F);
						this.aClass3_Sub2_Sub2_3.method2079((float) local177 * local57 + local160);
						this.aClass3_Sub2_Sub2_3.method2079((float) local177 * local62 + local166);
						this.aClass3_Sub2_Sub2_3.method2079(local172 + local74 * (float) local177);
						this.aClass3_Sub2_Sub2_3.method2065(local141);
						this.aClass3_Sub2_Sub2_3.method2065(local146);
						this.aClass3_Sub2_Sub2_3.method2065(local149);
						this.aClass3_Sub2_Sub2_3.method2065(local154);
						this.aClass3_Sub2_Sub2_3.method2079(1.0F);
						this.aClass3_Sub2_Sub2_3.method2079(1.0F);
						this.aClass3_Sub2_Sub2_3.method2079(local160 + local44 * (float) local177);
						this.aClass3_Sub2_Sub2_3.method2079(local48 * (float) local177 + local166);
						this.aClass3_Sub2_Sub2_3.method2079((float) local177 * local52 + local172);
						this.aClass3_Sub2_Sub2_3.method2065(local141);
						this.aClass3_Sub2_Sub2_3.method2065(local146);
						this.aClass3_Sub2_Sub2_3.method2065(local149);
						this.aClass3_Sub2_Sub2_3.method2065(local154);
						this.aClass3_Sub2_Sub2_3.method2079(0.0F);
						this.aClass3_Sub2_Sub2_3.method2079(1.0F);
						this.aClass3_Sub2_Sub2_3.method2079(local78 * (float) local177 + local160);
						this.aClass3_Sub2_Sub2_3.method2079((float) local177 * local82 + local166);
						this.aClass3_Sub2_Sub2_3.method2079(local172 + (float) local177 * local91);
						this.aClass3_Sub2_Sub2_3.method2065(local141);
						this.aClass3_Sub2_Sub2_3.method2065(local146);
						this.aClass3_Sub2_Sub2_3.method2065(local149);
						this.aClass3_Sub2_Sub2_3.method2065(local154);
					}
					if (this.anIntArray417[local98] > 64) {
						local449 = this.anIntArray417[local98] - 1 - 64;
						for (local136 = this.anIntArray416[local449] - 1; local136 >= 0; local136--) {
							local465 = this.aClass9_Sub2_Sub1ArrayArray1[local449][local136];
							local468 = local465.anInt1780;
							local149 = (byte) (local468 >> 16);
							local154 = (byte) (local468 >> 8);
							local481 = (byte) local468;
							local486 = (byte) (local468 >>> 24);
							local172 = (float) (local465.anInt1777 >> 12);
							local498 = (float) (local465.anInt1772 >> 12);
							local504 = (float) (local465.anInt1776 >> 12);
							local509 = local465.anInt1775 >> 12;
							this.aClass3_Sub2_Sub2_3.method2079(0.0F);
							this.aClass3_Sub2_Sub2_3.method2079(0.0F);
							this.aClass3_Sub2_Sub2_3.method2079(local172 + local44 * (float) -local509);
							this.aClass3_Sub2_Sub2_3.method2079((float) -local509 * local48 + local498);
							this.aClass3_Sub2_Sub2_3.method2079(local504 + (float) -local509 * local52);
							this.aClass3_Sub2_Sub2_3.method2065(local149);
							this.aClass3_Sub2_Sub2_3.method2065(local154);
							this.aClass3_Sub2_Sub2_3.method2065(local481);
							this.aClass3_Sub2_Sub2_3.method2065(local486);
							this.aClass3_Sub2_Sub2_3.method2079(1.0F);
							this.aClass3_Sub2_Sub2_3.method2079(0.0F);
							this.aClass3_Sub2_Sub2_3.method2079(local172 + local57 * (float) local509);
							this.aClass3_Sub2_Sub2_3.method2079(local498 + (float) local509 * local62);
							this.aClass3_Sub2_Sub2_3.method2079(local74 * (float) local509 + local504);
							this.aClass3_Sub2_Sub2_3.method2065(local149);
							this.aClass3_Sub2_Sub2_3.method2065(local154);
							this.aClass3_Sub2_Sub2_3.method2065(local481);
							this.aClass3_Sub2_Sub2_3.method2065(local486);
							this.aClass3_Sub2_Sub2_3.method2079(1.0F);
							this.aClass3_Sub2_Sub2_3.method2079(1.0F);
							this.aClass3_Sub2_Sub2_3.method2079(local44 * (float) local509 + local172);
							this.aClass3_Sub2_Sub2_3.method2079(local498 + local48 * (float) local509);
							this.aClass3_Sub2_Sub2_3.method2079(local504 + (float) local509 * local52);
							this.aClass3_Sub2_Sub2_3.method2065(local149);
							this.aClass3_Sub2_Sub2_3.method2065(local154);
							this.aClass3_Sub2_Sub2_3.method2065(local481);
							this.aClass3_Sub2_Sub2_3.method2065(local486);
							this.aClass3_Sub2_Sub2_3.method2079(0.0F);
							this.aClass3_Sub2_Sub2_3.method2079(1.0F);
							this.aClass3_Sub2_Sub2_3.method2079(local172 + local78 * (float) local509);
							this.aClass3_Sub2_Sub2_3.method2079(local82 * (float) local509 + local498);
							this.aClass3_Sub2_Sub2_3.method2079(local504 + local91 * (float) local509);
							this.aClass3_Sub2_Sub2_3.method2065(local149);
							this.aClass3_Sub2_Sub2_3.method2065(local154);
							this.aClass3_Sub2_Sub2_3.method2065(local481);
							this.aClass3_Sub2_Sub2_3.method2065(local486);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub2_Sub2_3.anInt2178 != 0) {
			this.anInterface13_4.method4053(this.aClass3_Sub2_Sub2_3.aByteArray20, 24, this.aClass3_Sub2_Sub2_3.anInt2178);
			arg1.method919(this.aClass287_7, (Class287) null, this.aClass287_5, this.aClass287_6);
			arg1.method927(this.aClass3_Sub2_Sub2_3.anInt2178 / 24);
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILclient!so;Lclient!aq;I)V")
	public void method5081(@OriginalArg(0) int arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) Class22_Sub1 arg2) {
		if (arg2.aClass58_Sub3_3 == null) {
			return;
		}
		if (arg0 < 0) {
			this.method5083(arg2);
		} else {
			this.method5085(arg0, arg2);
		}
		@Pc(31) float local31 = arg2.aClass58_Sub3_3.aFloat204;
		@Pc(35) float local35 = arg2.aClass58_Sub3_3.aFloat207;
		@Pc(39) float local39 = arg2.aClass58_Sub3_3.aFloat200;
		@Pc(43) float local43 = arg2.aClass58_Sub3_3.aFloat205;
		try {
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = Integer.MAX_VALUE;
			@Pc(49) int local49 = 0;
			@Pc(61) Class9_Sub2 local61 = arg1.aClass357_1.aClass9_Sub2_9;
			@Pc(64) Class9_Sub2 local64;
			@Pc(96) int local96;
			for (local64 = local61.aClass9_Sub2_8; local64 != local61; local64 = local64.aClass9_Sub2_8) {
				@Pc(69) Class9_Sub2_Sub1 local69 = (Class9_Sub2_Sub1) local64;
				local96 = (int) ((float) (local69.anInt1777 >> 12) * local31 + (float) (local69.anInt1772 >> 12) * local35 + local39 * (float) (local69.anInt1776 >> 12) + local43);
				if (local96 < local47) {
					local47 = local96;
				}
				if (local96 > local49) {
					local49 = local96;
				}
				this.anIntArray418[local45++] = local96;
			}
			@Pc(127) int local127 = local49 - local47;
			if (local127 + 2 <= 1600) {
				local96 = 0;
				local127 += 2;
			} else {
				local96 = Static462.method6277(local127) + 1 - this.anInt5773;
				local127 = (local127 >> local96) + 2;
			}
			local45 = 0;
			local64 = local61.aClass9_Sub2_8;
			@Pc(162) int local162 = -2;
			@Pc(164) boolean local164 = true;
			@Pc(166) boolean local166 = true;
			while (local61 != local64) {
				this.anInt5774 = 0;
				for (@Pc(175) int local175 = 0; local175 < local127; local175++) {
					this.anIntArray417[local175] = 0;
				}
				for (@Pc(190) int local190 = 0; local190 < 64; local190++) {
					this.anIntArray416[local190] = 0;
				}
				while (local64 != local61) {
					@Pc(216) Class9_Sub2_Sub1 local216 = (Class9_Sub2_Sub1) local64;
					if (local166) {
						local162 = local216.anInt1774;
						local164 = local216.aBoolean129;
						local166 = false;
					}
					if (local45 > 0 && (local162 != local216.anInt1774 || local216.aBoolean129 != local164)) {
						local166 = true;
						break;
					}
					@Pc(260) int local260 = this.anIntArray418[local45++] - local47 >> local96;
					if (local260 < 1600) {
						if (this.anIntArray417[local260] < 64) {
							this.aClass9_Sub2_Sub1ArrayArray2[local260][this.anIntArray417[local260]++] = local216;
						} else {
							label102: {
								if (this.anIntArray417[local260] == 64) {
									if (this.anInt5774 == 64) {
										break label102;
									}
									this.anIntArray417[local260] += this.anInt5774++ + 1;
								}
								this.aClass9_Sub2_Sub1ArrayArray1[this.anIntArray417[local260] - 64 - 1][this.anIntArray416[this.anIntArray417[local260] - 64 - 1]++] = local216;
							}
						}
					}
					local64 = local64.aClass9_Sub2_8;
				}
				if (local162 < 0) {
					arg2.method939(-1);
				} else {
					arg2.method939(local162);
				}
				if (local164 && Static675.aFloat194 != arg2.aFloat21) {
					arg2.xa(Static675.aFloat194);
				} else if (arg2.aFloat21 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method5080(local127, arg2);
			}
		} catch (@Pc(421) Exception local421) {
		}
		this.method5079(arg2);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lclient!aq;Z)V")
	public void method5082(@OriginalArg(0) Class22_Sub1 arg0) {
		this.anInterface13_4 = arg0.method901((byte[]) null, 196584, true, 24);
		this.aClass287_5 = new Class287(this.anInterface13_4, 5126, 2, 0);
		this.aClass287_7 = new Class287(this.anInterface13_4, 5126, 3, 8);
		this.aClass287_6 = new Class287(this.anInterface13_4, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lclient!aq;I)V")
	private void method5083(@OriginalArg(0) Class22_Sub1 arg0) {
		Static675.aFloat194 = arg0.aFloat21;
		arg0.method956();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method902(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IILclient!aq;)V")
	private void method5085(@OriginalArg(1) int arg0, @OriginalArg(2) Class22_Sub1 arg1) {
		Static675.aFloat194 = arg1.aFloat21;
		arg1.method950((float) arg0);
		arg1.method941();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method902(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
