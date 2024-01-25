import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class154 {

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "Lclient!ot;")
	private Class195 aClass195_5;

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "Lclient!ot;")
	private Class195 aClass195_6;

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "Lclient!ot;")
	private Class195 aClass195_7;

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "Lclient!eo;")
	private Interface5 anInterface5_4;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "[F")
	private final float[] aFloatArray20 = new float[16];

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "Lclient!ka;")
	private final Class6_Sub15_Sub2 aClass6_Sub15_Sub2_3 = new Class6_Sub15_Sub2(786336);

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
	private final int anInt3889 = Static278.method4208(1600);

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "[I")
	private final int[] anIntArray333 = new int[64];

	@OriginalMember(owner = "client!ln", name = "t", descriptor = "[I")
	private final int[] anIntArray334 = new int[8191];

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "I")
	private int anInt3890 = 0;

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "[I")
	private final int[] anIntArray335 = new int[1600];

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "[[Lclient!pa;")
	private final Class48_Sub2_Sub1[][] aClass48_Sub2_Sub1ArrayArray1 = new Class48_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "[[Lclient!pa;")
	private final Class48_Sub2_Sub1[][] aClass48_Sub2_Sub1ArrayArray2 = new Class48_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!bl;II)V")
	private void method3467(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray20, 0);
		@Pc(15) float local15 = this.aFloatArray20[0];
		@Pc(20) float local20 = this.aFloatArray20[4];
		@Pc(25) float local25 = this.aFloatArray20[8];
		@Pc(30) float local30 = this.aFloatArray20[1];
		@Pc(35) float local35 = this.aFloatArray20[5];
		@Pc(40) float local40 = this.aFloatArray20[9];
		@Pc(44) float local44 = local30 + local15;
		@Pc(48) float local48 = local35 + local20;
		@Pc(52) float local52 = local40 + local25;
		@Pc(57) float local57 = local15 - local30;
		@Pc(61) float local61 = local20 - local35;
		@Pc(66) float local66 = local25 - local40;
		@Pc(70) float local70 = local30 - local15;
		@Pc(75) float local75 = local35 - local20;
		this.aClass6_Sub15_Sub2_3.anInt3487 = 0;
		@Pc(84) float local84 = local40 - local25;
		@Pc(91) int local91;
		@Pc(108) int local108;
		@Pc(117) int local117;
		@Pc(126) Class48_Sub2_Sub1 local126;
		@Pc(129) int local129;
		@Pc(134) byte local134;
		@Pc(139) byte local139;
		@Pc(142) byte local142;
		@Pc(147) byte local147;
		@Pc(153) float local153;
		@Pc(159) float local159;
		@Pc(165) float local165;
		@Pc(170) int local170;
		@Pc(491) float local491;
		@Pc(496) int local496;
		@Pc(436) int local436;
		@Pc(452) Class48_Sub2_Sub1 local452;
		@Pc(455) int local455;
		@Pc(468) byte local468;
		@Pc(473) byte local473;
		@Pc(485) float local485;
		if (arg0.aBoolean52) {
			for (local91 = arg1 - 1; local91 >= 0; local91--) {
				local108 = this.anIntArray335[local91] <= 64 ? this.anIntArray335[local91] : 64;
				if (local108 > 0) {
					for (local117 = local108 - 1; local117 >= 0; local117--) {
						local126 = this.aClass48_Sub2_Sub1ArrayArray2[local91][local117];
						local129 = local126.anInt2756;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = local126.anInt2754 >> Static368.anInt6141;
						local159 = local126.anInt2764 >> Static368.anInt6141;
						local165 = local126.anInt2758 >> Static368.anInt6141;
						local170 = local126.anInt2762 >> Static368.anInt6141;
						this.aClass6_Sub15_Sub2_3.method3139(0.0F);
						this.aClass6_Sub15_Sub2_3.method3139(0.0F);
						this.aClass6_Sub15_Sub2_3.method3139((float) -local170 * local44 + local153);
						this.aClass6_Sub15_Sub2_3.method3139((float) -local170 * local48 + local159);
						this.aClass6_Sub15_Sub2_3.method3139(local165 + local52 * (float) -local170);
						this.aClass6_Sub15_Sub2_3.method3075(local134);
						this.aClass6_Sub15_Sub2_3.method3075(local139);
						this.aClass6_Sub15_Sub2_3.method3075(local142);
						this.aClass6_Sub15_Sub2_3.method3075(local147);
						this.aClass6_Sub15_Sub2_3.method3139(1.0F);
						this.aClass6_Sub15_Sub2_3.method3139(0.0F);
						this.aClass6_Sub15_Sub2_3.method3139((float) local170 * local57 + local153);
						this.aClass6_Sub15_Sub2_3.method3139((float) local170 * local61 + local159);
						this.aClass6_Sub15_Sub2_3.method3139((float) local170 * local66 + local165);
						this.aClass6_Sub15_Sub2_3.method3075(local134);
						this.aClass6_Sub15_Sub2_3.method3075(local139);
						this.aClass6_Sub15_Sub2_3.method3075(local142);
						this.aClass6_Sub15_Sub2_3.method3075(local147);
						this.aClass6_Sub15_Sub2_3.method3139(1.0F);
						this.aClass6_Sub15_Sub2_3.method3139(1.0F);
						this.aClass6_Sub15_Sub2_3.method3139(local153 + local44 * (float) local170);
						this.aClass6_Sub15_Sub2_3.method3139(local159 + (float) local170 * local48);
						this.aClass6_Sub15_Sub2_3.method3139(local52 * (float) local170 + local165);
						this.aClass6_Sub15_Sub2_3.method3075(local134);
						this.aClass6_Sub15_Sub2_3.method3075(local139);
						this.aClass6_Sub15_Sub2_3.method3075(local142);
						this.aClass6_Sub15_Sub2_3.method3075(local147);
						this.aClass6_Sub15_Sub2_3.method3139(0.0F);
						this.aClass6_Sub15_Sub2_3.method3139(1.0F);
						this.aClass6_Sub15_Sub2_3.method3139((float) local170 * local70 + local153);
						this.aClass6_Sub15_Sub2_3.method3139((float) local170 * local75 + local159);
						this.aClass6_Sub15_Sub2_3.method3139(local165 + (float) local170 * local84);
						this.aClass6_Sub15_Sub2_3.method3075(local134);
						this.aClass6_Sub15_Sub2_3.method3075(local139);
						this.aClass6_Sub15_Sub2_3.method3075(local142);
						this.aClass6_Sub15_Sub2_3.method3075(local147);
					}
					if (this.anIntArray335[local91] > 64) {
						local436 = this.anIntArray335[local91] - 64 - 1;
						for (local129 = this.anIntArray333[local436] - 1; local129 >= 0; local129--) {
							local452 = this.aClass48_Sub2_Sub1ArrayArray1[local436][local129];
							local455 = local452.anInt2756;
							local142 = (byte) (local455 >> 16);
							local147 = (byte) (local455 >> 8);
							local468 = (byte) local455;
							local473 = (byte) (local455 >>> 24);
							local165 = local452.anInt2754 >> Static368.anInt6141;
							local485 = local452.anInt2764 >> Static368.anInt6141;
							local491 = local452.anInt2758 >> Static368.anInt6141;
							local496 = local452.anInt2762 >> Static368.anInt6141;
							this.aClass6_Sub15_Sub2_3.method3139(0.0F);
							this.aClass6_Sub15_Sub2_3.method3139(0.0F);
							this.aClass6_Sub15_Sub2_3.method3139(local165 + (float) -local496 * local44);
							this.aClass6_Sub15_Sub2_3.method3139(local485 + local48 * (float) -local496);
							this.aClass6_Sub15_Sub2_3.method3139(local491 + (float) -local496 * local52);
							this.aClass6_Sub15_Sub2_3.method3075(local142);
							this.aClass6_Sub15_Sub2_3.method3075(local147);
							this.aClass6_Sub15_Sub2_3.method3075(local468);
							this.aClass6_Sub15_Sub2_3.method3075(local473);
							this.aClass6_Sub15_Sub2_3.method3139(1.0F);
							this.aClass6_Sub15_Sub2_3.method3139(0.0F);
							this.aClass6_Sub15_Sub2_3.method3139(local165 + local57 * (float) local496);
							this.aClass6_Sub15_Sub2_3.method3139(local485 + local61 * (float) local496);
							this.aClass6_Sub15_Sub2_3.method3139(local491 + (float) local496 * local66);
							this.aClass6_Sub15_Sub2_3.method3075(local142);
							this.aClass6_Sub15_Sub2_3.method3075(local147);
							this.aClass6_Sub15_Sub2_3.method3075(local468);
							this.aClass6_Sub15_Sub2_3.method3075(local473);
							this.aClass6_Sub15_Sub2_3.method3139(1.0F);
							this.aClass6_Sub15_Sub2_3.method3139(1.0F);
							this.aClass6_Sub15_Sub2_3.method3139(local44 * (float) local496 + local165);
							this.aClass6_Sub15_Sub2_3.method3139((float) local496 * local48 + local485);
							this.aClass6_Sub15_Sub2_3.method3139(local491 + (float) local496 * local52);
							this.aClass6_Sub15_Sub2_3.method3075(local142);
							this.aClass6_Sub15_Sub2_3.method3075(local147);
							this.aClass6_Sub15_Sub2_3.method3075(local468);
							this.aClass6_Sub15_Sub2_3.method3075(local473);
							this.aClass6_Sub15_Sub2_3.method3139(0.0F);
							this.aClass6_Sub15_Sub2_3.method3139(1.0F);
							this.aClass6_Sub15_Sub2_3.method3139((float) local496 * local70 + local165);
							this.aClass6_Sub15_Sub2_3.method3139(local485 + local75 * (float) local496);
							this.aClass6_Sub15_Sub2_3.method3139((float) local496 * local84 + local491);
							this.aClass6_Sub15_Sub2_3.method3075(local142);
							this.aClass6_Sub15_Sub2_3.method3075(local147);
							this.aClass6_Sub15_Sub2_3.method3075(local468);
							this.aClass6_Sub15_Sub2_3.method3075(local473);
						}
					}
				}
			}
		} else {
			for (local91 = arg1 - 1; local91 >= 0; local91--) {
				local108 = this.anIntArray335[local91] <= 64 ? this.anIntArray335[local91] : 64;
				if (local108 > 0) {
					for (local117 = local108 - 1; local117 >= 0; local117--) {
						local126 = this.aClass48_Sub2_Sub1ArrayArray2[local91][local117];
						local129 = local126.anInt2756;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = local126.anInt2754 >> Static368.anInt6141;
						local159 = local126.anInt2764 >> Static368.anInt6141;
						local165 = local126.anInt2758 >> Static368.anInt6141;
						local170 = local126.anInt2762 >> Static368.anInt6141;
						this.aClass6_Sub15_Sub2_3.method3142(0.0F);
						this.aClass6_Sub15_Sub2_3.method3142(0.0F);
						this.aClass6_Sub15_Sub2_3.method3142(local44 * (float) -local170 + local153);
						this.aClass6_Sub15_Sub2_3.method3142((float) -local170 * local48 + local159);
						this.aClass6_Sub15_Sub2_3.method3142(local165 + (float) -local170 * local52);
						this.aClass6_Sub15_Sub2_3.method3075(local134);
						this.aClass6_Sub15_Sub2_3.method3075(local139);
						this.aClass6_Sub15_Sub2_3.method3075(local142);
						this.aClass6_Sub15_Sub2_3.method3075(local147);
						this.aClass6_Sub15_Sub2_3.method3142(1.0F);
						this.aClass6_Sub15_Sub2_3.method3142(0.0F);
						this.aClass6_Sub15_Sub2_3.method3142(local153 + local57 * (float) local170);
						this.aClass6_Sub15_Sub2_3.method3142(local61 * (float) local170 + local159);
						this.aClass6_Sub15_Sub2_3.method3142(local165 + local66 * (float) local170);
						this.aClass6_Sub15_Sub2_3.method3075(local134);
						this.aClass6_Sub15_Sub2_3.method3075(local139);
						this.aClass6_Sub15_Sub2_3.method3075(local142);
						this.aClass6_Sub15_Sub2_3.method3075(local147);
						this.aClass6_Sub15_Sub2_3.method3142(1.0F);
						this.aClass6_Sub15_Sub2_3.method3142(1.0F);
						this.aClass6_Sub15_Sub2_3.method3142(local153 + (float) local170 * local44);
						this.aClass6_Sub15_Sub2_3.method3142(local48 * (float) local170 + local159);
						this.aClass6_Sub15_Sub2_3.method3142(local165 + (float) local170 * local52);
						this.aClass6_Sub15_Sub2_3.method3075(local134);
						this.aClass6_Sub15_Sub2_3.method3075(local139);
						this.aClass6_Sub15_Sub2_3.method3075(local142);
						this.aClass6_Sub15_Sub2_3.method3075(local147);
						this.aClass6_Sub15_Sub2_3.method3142(0.0F);
						this.aClass6_Sub15_Sub2_3.method3142(1.0F);
						this.aClass6_Sub15_Sub2_3.method3142(local153 + (float) local170 * local70);
						this.aClass6_Sub15_Sub2_3.method3142(local75 * (float) local170 + local159);
						this.aClass6_Sub15_Sub2_3.method3142(local165 + (float) local170 * local84);
						this.aClass6_Sub15_Sub2_3.method3075(local134);
						this.aClass6_Sub15_Sub2_3.method3075(local139);
						this.aClass6_Sub15_Sub2_3.method3075(local142);
						this.aClass6_Sub15_Sub2_3.method3075(local147);
					}
					if (this.anIntArray335[local91] > 64) {
						local436 = this.anIntArray335[local91] - 64 - 1;
						for (local129 = this.anIntArray333[local436] - 1; local129 >= 0; local129--) {
							local452 = this.aClass48_Sub2_Sub1ArrayArray1[local436][local129];
							local455 = local452.anInt2756;
							local142 = (byte) (local455 >> 16);
							local147 = (byte) (local455 >> 8);
							local468 = (byte) local455;
							local473 = (byte) (local455 >>> 24);
							local165 = local452.anInt2754 >> Static368.anInt6141;
							local485 = local452.anInt2764 >> Static368.anInt6141;
							local491 = local452.anInt2758 >> Static368.anInt6141;
							local496 = local452.anInt2762 >> Static368.anInt6141;
							this.aClass6_Sub15_Sub2_3.method3142(0.0F);
							this.aClass6_Sub15_Sub2_3.method3142(0.0F);
							this.aClass6_Sub15_Sub2_3.method3142(local165 + local44 * (float) -local496);
							this.aClass6_Sub15_Sub2_3.method3142((float) -local496 * local48 + local485);
							this.aClass6_Sub15_Sub2_3.method3142(local491 + (float) -local496 * local52);
							this.aClass6_Sub15_Sub2_3.method3075(local142);
							this.aClass6_Sub15_Sub2_3.method3075(local147);
							this.aClass6_Sub15_Sub2_3.method3075(local468);
							this.aClass6_Sub15_Sub2_3.method3075(local473);
							this.aClass6_Sub15_Sub2_3.method3142(1.0F);
							this.aClass6_Sub15_Sub2_3.method3142(0.0F);
							this.aClass6_Sub15_Sub2_3.method3142((float) local496 * local57 + local165);
							this.aClass6_Sub15_Sub2_3.method3142(local485 + (float) local496 * local61);
							this.aClass6_Sub15_Sub2_3.method3142((float) local496 * local66 + local491);
							this.aClass6_Sub15_Sub2_3.method3075(local142);
							this.aClass6_Sub15_Sub2_3.method3075(local147);
							this.aClass6_Sub15_Sub2_3.method3075(local468);
							this.aClass6_Sub15_Sub2_3.method3075(local473);
							this.aClass6_Sub15_Sub2_3.method3142(1.0F);
							this.aClass6_Sub15_Sub2_3.method3142(1.0F);
							this.aClass6_Sub15_Sub2_3.method3142(local165 + (float) local496 * local44);
							this.aClass6_Sub15_Sub2_3.method3142(local485 + (float) local496 * local48);
							this.aClass6_Sub15_Sub2_3.method3142(local52 * (float) local496 + local491);
							this.aClass6_Sub15_Sub2_3.method3075(local142);
							this.aClass6_Sub15_Sub2_3.method3075(local147);
							this.aClass6_Sub15_Sub2_3.method3075(local468);
							this.aClass6_Sub15_Sub2_3.method3075(local473);
							this.aClass6_Sub15_Sub2_3.method3142(0.0F);
							this.aClass6_Sub15_Sub2_3.method3142(1.0F);
							this.aClass6_Sub15_Sub2_3.method3142(local165 + local70 * (float) local496);
							this.aClass6_Sub15_Sub2_3.method3142(local485 + (float) local496 * local75);
							this.aClass6_Sub15_Sub2_3.method3142(local491 + local84 * (float) local496);
							this.aClass6_Sub15_Sub2_3.method3075(local142);
							this.aClass6_Sub15_Sub2_3.method3075(local147);
							this.aClass6_Sub15_Sub2_3.method3075(local468);
							this.aClass6_Sub15_Sub2_3.method3075(local473);
						}
					}
				}
			}
		}
		if (this.aClass6_Sub15_Sub2_3.anInt3487 != 0) {
			this.anInterface5_4.method4746(this.aClass6_Sub15_Sub2_3.aByteArray51, this.aClass6_Sub15_Sub2_3.anInt3487, 24);
			arg0.method714(null, this.aClass195_7, this.aClass195_5, this.aClass195_6);
			arg0.method720(this.aClass6_Sub15_Sub2_3.anInt3487 / 24);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!bl;)V")
	private void method3468(@OriginalArg(1) Class28_Sub1 arg0) {
		Static92.aFloat41 = arg0.aFloat13;
		arg0.method644();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method666(false);
		arg0.method718(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!bl;B)V")
	private void method3469(@OriginalArg(0) Class28_Sub1 arg0) {
		arg0.method666(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static92.aFloat41 != arg0.aFloat13) {
			arg0.method3583(Static92.aFloat41);
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(Lclient!bl;B)V")
	public void method3470(@OriginalArg(0) Class28_Sub1 arg0) {
		this.anInterface5_4 = arg0.method682(null, 196584, 24, true);
		this.aClass195_7 = new Class195(arg0, this.anInterface5_4, 5126, 2, 0);
		this.aClass195_6 = new Class195(arg0, this.anInterface5_4, 5126, 3, 8);
		this.aClass195_5 = new Class195(arg0, this.anInterface5_4, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLclient!ii;Lclient!bl;)V")
	public void method3473(@OriginalArg(1) Class115 arg0, @OriginalArg(2) Class28_Sub1 arg1) {
		if (arg1.aClass132_Sub2_3 == null) {
			return;
		}
		this.method3468(arg1);
		@Pc(19) float local19 = arg1.aClass132_Sub2_3.aFloat79;
		@Pc(23) float local23 = arg1.aClass132_Sub2_3.aFloat75;
		@Pc(27) float local27 = arg1.aClass132_Sub2_3.aFloat73;
		@Pc(31) float local31 = arg1.aClass132_Sub2_3.aFloat71;
		try {
			@Pc(36) int local36;
			@Pc(38) int local38;
			@Pc(44) Class48_Sub2 local44;
			@Pc(149) int local149;
			@Pc(160) int local160;
			if (arg0.aBoolean202) {
				local36 = arg0.anInt2908 - arg0.anInt2907;
				if (local36 + 2 > 1600) {
					local38 = Static278.method4208(local36) + 1 - this.anInt3889;
					local36 = (local36 >> local38) + 2;
				} else {
					local38 = 0;
					local36 += 2;
				}
				@Pc(422) Class48_Sub2 local422 = arg0.aClass246_1.aClass48_Sub2_7;
				local44 = local422.aClass48_Sub2_6;
				@Pc(427) int local427 = -2;
				@Pc(429) boolean local429 = true;
				@Pc(431) boolean local431 = true;
				while (local44 != local422) {
					this.anInt3890 = 0;
					for (local149 = 0; local149 < local36; local149++) {
						this.anIntArray335[local149] = 0;
					}
					for (@Pc(455) int local455 = 0; local455 < 64; local455++) {
						this.anIntArray333[local455] = 0;
					}
					while (local44 != local422) {
						@Pc(473) Class48_Sub2_Sub1 local473 = (Class48_Sub2_Sub1) local44;
						if (local431) {
							local427 = local473.anInt2761;
							local429 = local473.aBoolean199;
							local431 = false;
						} else if (local427 != local473.anInt2761 || local473.aBoolean199 != local429) {
							local431 = true;
							break;
						}
						local160 = (int) ((float) (local473.anInt2754 >> Static368.anInt6141) * local19 + local23 * (float) (local473.anInt2764 >> Static368.anInt6141) + (float) (local473.anInt2758 >> Static368.anInt6141) * local27 + local31) - arg0.anInt2907 >> local38;
						if (local160 < 1600) {
							if (this.anIntArray335[local160] >= 64) {
								label136: {
									if (this.anIntArray335[local160] == 64) {
										if (this.anInt3890 == 64) {
											break label136;
										}
										this.anIntArray335[local160] += this.anInt3890++ + 1;
									}
									this.aClass48_Sub2_Sub1ArrayArray1[this.anIntArray335[local160] - 65][this.anIntArray333[this.anIntArray335[local160] - 64 - 1]++] = local473;
								}
							} else {
								this.aClass48_Sub2_Sub1ArrayArray2[local160][this.anIntArray335[local160]++] = local473;
							}
						}
						local44 = local44.aClass48_Sub2_6;
					}
					if (local427 >= 0) {
						arg1.method654(arg1.aClass29_1.method728(local427));
						arg1.method678(arg1.anInterface11_6.method2466(local427).anInt6136);
					} else {
						arg1.method654(null);
					}
					if (local429 && Static92.aFloat41 != arg1.aFloat13) {
						arg1.method3583(Static92.aFloat41);
					} else if (arg1.aFloat13 != 1.0F) {
						arg1.method3583(1.0F);
					}
					this.method3467(arg1, local36);
				}
			} else {
				local36 = 0;
				local38 = Integer.MAX_VALUE;
				@Pc(40) int local40 = 0;
				local44 = arg0.aClass246_1.aClass48_Sub2_7;
				@Pc(47) Class48_Sub2 local47;
				@Pc(79) int local79;
				for (local47 = local44.aClass48_Sub2_6; local47 != local44; local47 = local47.aClass48_Sub2_6) {
					@Pc(52) Class48_Sub2_Sub1 local52 = (Class48_Sub2_Sub1) local47;
					local79 = (int) (local19 * (float) (local52.anInt2754 >> Static368.anInt6141) + (float) (local52.anInt2764 >> Static368.anInt6141) * local23 + (float) (local52.anInt2758 >> Static368.anInt6141) * local27 + local31);
					if (local79 > local40) {
						local40 = local79;
					}
					if (local79 < local38) {
						local38 = local79;
					}
					this.anIntArray334[local36++] = local79;
				}
				@Pc(114) int local114 = local40 - local38;
				if (local114 + 2 > 1600) {
					local79 = Static278.method4208(local114) + 1 - this.anInt3889;
					local114 = (local114 >> local79) + 2;
				} else {
					local79 = 0;
					local114 += 2;
				}
				local47 = local44.aClass48_Sub2_6;
				local36 = 0;
				local149 = -2;
				@Pc(151) boolean local151 = true;
				@Pc(153) boolean local153 = true;
				while (local44 != local47) {
					this.anInt3890 = 0;
					for (local160 = 0; local160 < local114; local160++) {
						this.anIntArray335[local160] = 0;
					}
					for (@Pc(173) int local173 = 0; local173 < 64; local173++) {
						this.anIntArray333[local173] = 0;
					}
					while (local44 != local47) {
						@Pc(189) Class48_Sub2_Sub1 local189 = (Class48_Sub2_Sub1) local47;
						if (local153) {
							local153 = false;
							local151 = local189.aBoolean199;
							local149 = local189.anInt2761;
						}
						if (local36 > 0 && (local149 != local189.anInt2761 || local189.aBoolean199 != local151)) {
							local153 = true;
							break;
						}
						@Pc(231) int local231 = this.anIntArray334[local36++] - local38 >> local79;
						if (local231 < 1600) {
							if (this.anIntArray335[local231] < 64) {
								this.aClass48_Sub2_Sub1ArrayArray2[local231][this.anIntArray335[local231]++] = local189;
							} else {
								label181: {
									if (this.anIntArray335[local231] == 64) {
										if (this.anInt3890 == 64) {
											break label181;
										}
										this.anIntArray335[local231] += this.anInt3890++ + 1;
									}
									this.aClass48_Sub2_Sub1ArrayArray1[this.anIntArray335[local231] - 64 - 1][this.anIntArray333[this.anIntArray335[local231] - 64 - 1]++] = local189;
								}
							}
						}
						local47 = local47.aClass48_Sub2_6;
					}
					if (local149 < 0) {
						arg1.method654(null);
					} else {
						arg1.method654(arg1.aClass29_1.method728(local149));
						arg1.method678(arg1.anInterface11_6.method2466(local149).anInt6136);
					}
					if (local151 && Static92.aFloat41 != arg1.aFloat13) {
						arg1.method3583(Static92.aFloat41);
					} else if (arg1.aFloat13 != 1.0F) {
						arg1.method3583(1.0F);
					}
					this.method3467(arg1, local114);
				}
			}
		} catch (@Pc(678) Exception local678) {
		}
		this.method3469(arg1);
	}
}
