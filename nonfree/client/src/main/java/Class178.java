import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class178 {

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "Lclient!jl;")
	private Class166 aClass166_3;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "Lclient!rl;")
	private Interface18 anInterface18_4;

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "Lclient!jl;")
	private Class166 aClass166_4;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "Lclient!jl;")
	private Class166 aClass166_5;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "[F")
	private final float[] aFloatArray35 = new float[16];

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "Lclient!jh;")
	private final Class6_Sub26_Sub1 aClass6_Sub26_Sub1_2 = new Class6_Sub26_Sub1(786336);

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
	private final int anInt5290 = Static330.method5267(1600);

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "[I")
	private final int[] anIntArray338 = new int[8191];

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "[I")
	private final int[] anIntArray339 = new int[1600];

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "[[Lclient!aca;")
	private final Class5_Sub1_Sub1[][] aClass5_Sub1_Sub1ArrayArray1 = new Class5_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
	private int anInt5291 = 0;

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "[[Lclient!aca;")
	private final Class5_Sub1_Sub1[][] aClass5_Sub1_Sub1ArrayArray2 = new Class5_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "[I")
	private final int[] anIntArray340 = new int[64];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!ap;I)V")
	private void method4537(@OriginalArg(1) Class9_Sub2 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray35, 0);
		@Pc(15) float local15 = this.aFloatArray35[0];
		@Pc(20) float local20 = this.aFloatArray35[4];
		@Pc(25) float local25 = this.aFloatArray35[8];
		@Pc(30) float local30 = this.aFloatArray35[1];
		@Pc(35) float local35 = this.aFloatArray35[5];
		@Pc(45) float local45 = this.aFloatArray35[9];
		@Pc(49) float local49 = local15 + local30;
		@Pc(53) float local53 = local20 + local35;
		@Pc(57) float local57 = local45 + local25;
		@Pc(61) float local61 = local15 - local30;
		@Pc(66) float local66 = local20 - local35;
		@Pc(70) float local70 = local25 - local45;
		@Pc(74) float local74 = local30 - local15;
		@Pc(78) float local78 = local35 - local20;
		this.aClass6_Sub26_Sub1_2.anInt5769 = 0;
		@Pc(86) float local86 = local45 - local25;
		@Pc(93) int local93;
		@Pc(110) int local110;
		@Pc(116) int local116;
		@Pc(125) Class5_Sub1_Sub1 local125;
		@Pc(128) int local128;
		@Pc(133) byte local133;
		@Pc(138) byte local138;
		@Pc(141) byte local141;
		@Pc(146) byte local146;
		@Pc(152) float local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(169) int local169;
		@Pc(497) float local497;
		@Pc(502) int local502;
		@Pc(442) int local442;
		@Pc(458) Class5_Sub1_Sub1 local458;
		@Pc(461) int local461;
		@Pc(474) byte local474;
		@Pc(479) byte local479;
		@Pc(491) float local491;
		if (arg0.aBoolean65) {
			for (local93 = arg1 - 1; local93 >= 0; local93--) {
				local110 = this.anIntArray339[local93] > 64 ? 64 : this.anIntArray339[local93];
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass5_Sub1_Sub1ArrayArray1[local93][local116];
						local128 = local125.anInt6015;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt6014 >> 12;
						local158 = local125.anInt6009 >> 12;
						local164 = local125.anInt6011 >> 12;
						local169 = local125.anInt6007 >> 12;
						this.aClass6_Sub26_Sub1_2.method4361(0.0F);
						this.aClass6_Sub26_Sub1_2.method4361(0.0F);
						this.aClass6_Sub26_Sub1_2.method4361(local152 + (float) -local169 * local49);
						this.aClass6_Sub26_Sub1_2.method4361(local158 + (float) -local169 * local53);
						this.aClass6_Sub26_Sub1_2.method4361(local164 + (float) -local169 * local57);
						this.aClass6_Sub26_Sub1_2.method4950(local133, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local138, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local141, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local146, -81849);
						this.aClass6_Sub26_Sub1_2.method4361(1.0F);
						this.aClass6_Sub26_Sub1_2.method4361(0.0F);
						this.aClass6_Sub26_Sub1_2.method4361((float) local169 * local61 + local152);
						this.aClass6_Sub26_Sub1_2.method4361((float) local169 * local66 + local158);
						this.aClass6_Sub26_Sub1_2.method4361(local164 + (float) local169 * local70);
						this.aClass6_Sub26_Sub1_2.method4950(local133, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local138, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local141, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local146, -81849);
						this.aClass6_Sub26_Sub1_2.method4361(1.0F);
						this.aClass6_Sub26_Sub1_2.method4361(1.0F);
						this.aClass6_Sub26_Sub1_2.method4361(local152 + local49 * (float) local169);
						this.aClass6_Sub26_Sub1_2.method4361(local53 * (float) local169 + local158);
						this.aClass6_Sub26_Sub1_2.method4361(local164 + local57 * (float) local169);
						this.aClass6_Sub26_Sub1_2.method4950(local133, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local138, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local141, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local146, -81849);
						this.aClass6_Sub26_Sub1_2.method4361(0.0F);
						this.aClass6_Sub26_Sub1_2.method4361(1.0F);
						this.aClass6_Sub26_Sub1_2.method4361(local74 * (float) local169 + local152);
						this.aClass6_Sub26_Sub1_2.method4361(local158 + local78 * (float) local169);
						this.aClass6_Sub26_Sub1_2.method4361(local86 * (float) local169 + local164);
						this.aClass6_Sub26_Sub1_2.method4950(local133, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local138, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local141, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local146, -81849);
					}
					if (this.anIntArray339[local93] > 64) {
						local442 = this.anIntArray339[local93] - 1 - 64;
						for (local128 = this.anIntArray340[local442] - 1; local128 >= 0; local128--) {
							local458 = this.aClass5_Sub1_Sub1ArrayArray2[local442][local128];
							local461 = local458.anInt6015;
							local141 = (byte) (local461 >> 16);
							local146 = (byte) (local461 >> 8);
							local474 = (byte) local461;
							local479 = (byte) (local461 >>> 24);
							local164 = local458.anInt6014 >> 12;
							local491 = local458.anInt6009 >> 12;
							local497 = local458.anInt6011 >> 12;
							local502 = local458.anInt6007 >> 12;
							this.aClass6_Sub26_Sub1_2.method4361(0.0F);
							this.aClass6_Sub26_Sub1_2.method4361(0.0F);
							this.aClass6_Sub26_Sub1_2.method4361((float) -local502 * local49 + local164);
							this.aClass6_Sub26_Sub1_2.method4361((float) -local502 * local53 + local491);
							this.aClass6_Sub26_Sub1_2.method4361((float) -local502 * local57 + local497);
							this.aClass6_Sub26_Sub1_2.method4950(local141, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local146, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local474, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local479, -81849);
							this.aClass6_Sub26_Sub1_2.method4361(1.0F);
							this.aClass6_Sub26_Sub1_2.method4361(0.0F);
							this.aClass6_Sub26_Sub1_2.method4361(local164 + (float) local502 * local61);
							this.aClass6_Sub26_Sub1_2.method4361(local66 * (float) local502 + local491);
							this.aClass6_Sub26_Sub1_2.method4361(local497 + local70 * (float) local502);
							this.aClass6_Sub26_Sub1_2.method4950(local141, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local146, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local474, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local479, -81849);
							this.aClass6_Sub26_Sub1_2.method4361(1.0F);
							this.aClass6_Sub26_Sub1_2.method4361(1.0F);
							this.aClass6_Sub26_Sub1_2.method4361(local164 + local49 * (float) local502);
							this.aClass6_Sub26_Sub1_2.method4361(local53 * (float) local502 + local491);
							this.aClass6_Sub26_Sub1_2.method4361(local57 * (float) local502 + local497);
							this.aClass6_Sub26_Sub1_2.method4950(local141, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local146, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local474, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local479, -81849);
							this.aClass6_Sub26_Sub1_2.method4361(0.0F);
							this.aClass6_Sub26_Sub1_2.method4361(1.0F);
							this.aClass6_Sub26_Sub1_2.method4361((float) local502 * local74 + local164);
							this.aClass6_Sub26_Sub1_2.method4361(local491 + (float) local502 * local78);
							this.aClass6_Sub26_Sub1_2.method4361(local497 + (float) local502 * local86);
							this.aClass6_Sub26_Sub1_2.method4950(local141, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local146, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local474, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local479, -81849);
						}
					}
				}
			}
		} else {
			for (local93 = arg1 - 1; local93 >= 0; local93--) {
				local110 = this.anIntArray339[local93] > 64 ? 64 : this.anIntArray339[local93];
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass5_Sub1_Sub1ArrayArray1[local93][local116];
						local128 = local125.anInt6015;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt6014 >> 12;
						local158 = local125.anInt6009 >> 12;
						local164 = local125.anInt6011 >> 12;
						local169 = local125.anInt6007 >> 12;
						this.aClass6_Sub26_Sub1_2.method4360(0.0F);
						this.aClass6_Sub26_Sub1_2.method4360(0.0F);
						this.aClass6_Sub26_Sub1_2.method4360(local49 * (float) -local169 + local152);
						this.aClass6_Sub26_Sub1_2.method4360(local158 + local53 * (float) -local169);
						this.aClass6_Sub26_Sub1_2.method4360(local164 + local57 * (float) -local169);
						this.aClass6_Sub26_Sub1_2.method4950(local133, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local138, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local141, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local146, -81849);
						this.aClass6_Sub26_Sub1_2.method4360(1.0F);
						this.aClass6_Sub26_Sub1_2.method4360(0.0F);
						this.aClass6_Sub26_Sub1_2.method4360(local152 + local61 * (float) local169);
						this.aClass6_Sub26_Sub1_2.method4360(local158 + local66 * (float) local169);
						this.aClass6_Sub26_Sub1_2.method4360((float) local169 * local70 + local164);
						this.aClass6_Sub26_Sub1_2.method4950(local133, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local138, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local141, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local146, -81849);
						this.aClass6_Sub26_Sub1_2.method4360(1.0F);
						this.aClass6_Sub26_Sub1_2.method4360(1.0F);
						this.aClass6_Sub26_Sub1_2.method4360(local152 + (float) local169 * local49);
						this.aClass6_Sub26_Sub1_2.method4360(local158 + (float) local169 * local53);
						this.aClass6_Sub26_Sub1_2.method4360((float) local169 * local57 + local164);
						this.aClass6_Sub26_Sub1_2.method4950(local133, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local138, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local141, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local146, -81849);
						this.aClass6_Sub26_Sub1_2.method4360(0.0F);
						this.aClass6_Sub26_Sub1_2.method4360(1.0F);
						this.aClass6_Sub26_Sub1_2.method4360(local152 + local74 * (float) local169);
						this.aClass6_Sub26_Sub1_2.method4360((float) local169 * local78 + local158);
						this.aClass6_Sub26_Sub1_2.method4360(local164 + (float) local169 * local86);
						this.aClass6_Sub26_Sub1_2.method4950(local133, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local138, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local141, -81849);
						this.aClass6_Sub26_Sub1_2.method4950(local146, -81849);
					}
					if (this.anIntArray339[local93] > 64) {
						local442 = this.anIntArray339[local93] - 64 - 1;
						for (local128 = this.anIntArray340[local442] - 1; local128 >= 0; local128--) {
							local458 = this.aClass5_Sub1_Sub1ArrayArray2[local442][local128];
							local461 = local458.anInt6015;
							local141 = (byte) (local461 >> 16);
							local146 = (byte) (local461 >> 8);
							local474 = (byte) local461;
							local479 = (byte) (local461 >>> 24);
							local164 = local458.anInt6014 >> 12;
							local491 = local458.anInt6009 >> 12;
							local497 = local458.anInt6011 >> 12;
							local502 = local458.anInt6007 >> 12;
							this.aClass6_Sub26_Sub1_2.method4360(0.0F);
							this.aClass6_Sub26_Sub1_2.method4360(0.0F);
							this.aClass6_Sub26_Sub1_2.method4360(local49 * (float) -local502 + local164);
							this.aClass6_Sub26_Sub1_2.method4360(local491 + local53 * (float) -local502);
							this.aClass6_Sub26_Sub1_2.method4360(local497 + (float) -local502 * local57);
							this.aClass6_Sub26_Sub1_2.method4950(local141, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local146, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local474, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local479, -81849);
							this.aClass6_Sub26_Sub1_2.method4360(1.0F);
							this.aClass6_Sub26_Sub1_2.method4360(0.0F);
							this.aClass6_Sub26_Sub1_2.method4360((float) local502 * local61 + local164);
							this.aClass6_Sub26_Sub1_2.method4360(local491 + (float) local502 * local66);
							this.aClass6_Sub26_Sub1_2.method4360((float) local502 * local70 + local497);
							this.aClass6_Sub26_Sub1_2.method4950(local141, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local146, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local474, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local479, -81849);
							this.aClass6_Sub26_Sub1_2.method4360(1.0F);
							this.aClass6_Sub26_Sub1_2.method4360(1.0F);
							this.aClass6_Sub26_Sub1_2.method4360(local164 + local49 * (float) local502);
							this.aClass6_Sub26_Sub1_2.method4360(local53 * (float) local502 + local491);
							this.aClass6_Sub26_Sub1_2.method4360(local497 + (float) local502 * local57);
							this.aClass6_Sub26_Sub1_2.method4950(local141, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local146, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local474, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local479, -81849);
							this.aClass6_Sub26_Sub1_2.method4360(0.0F);
							this.aClass6_Sub26_Sub1_2.method4360(1.0F);
							this.aClass6_Sub26_Sub1_2.method4360(local164 + local74 * (float) local502);
							this.aClass6_Sub26_Sub1_2.method4360((float) local502 * local78 + local491);
							this.aClass6_Sub26_Sub1_2.method4360(local497 + (float) local502 * local86);
							this.aClass6_Sub26_Sub1_2.method4950(local141, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local146, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local474, -81849);
							this.aClass6_Sub26_Sub1_2.method4950(local479, -81849);
						}
					}
				}
			}
		}
		if (this.aClass6_Sub26_Sub1_2.anInt5769 != 0) {
			this.anInterface18_4.method3933(this.aClass6_Sub26_Sub1_2.anInt5769, this.aClass6_Sub26_Sub1_2.aByteArray65, 24);
			arg0.method805(this.aClass166_5, this.aClass166_3, this.aClass166_4, null);
			arg0.method784(this.aClass6_Sub26_Sub1_2.anInt5769 / 24);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLclient!ap;Lclient!tg;)V")
	public void method4539(@OriginalArg(1) Class9_Sub2 arg0, @OriginalArg(2) Class299 arg1) {
		if (arg0.aClass8_Sub2_3 == null) {
			return;
		}
		this.method4544(arg0);
		@Pc(25) float local25 = arg0.aClass8_Sub2_3.aFloat161;
		@Pc(29) float local29 = arg0.aClass8_Sub2_3.aFloat168;
		@Pc(33) float local33 = arg0.aClass8_Sub2_3.aFloat169;
		@Pc(37) float local37 = arg0.aClass8_Sub2_3.aFloat160;
		try {
			@Pc(42) int local42;
			@Pc(44) int local44;
			@Pc(50) Class5_Sub1 local50;
			@Pc(147) int local147;
			@Pc(158) int local158;
			if (arg1.aBoolean663) {
				local42 = arg1.anInt8805 - arg1.anInt8806;
				if (local42 + 2 > 1600) {
					local44 = Static330.method5267(local42) + 1 - this.anInt5290;
					local42 = (local42 >> local44) + 2;
				} else {
					local44 = 0;
					local42 += 2;
				}
				@Pc(403) Class5_Sub1 local403 = arg1.aClass272_1.aClass5_Sub1_9;
				local50 = local403.aClass5_Sub1_8;
				@Pc(408) int local408 = -2;
				@Pc(410) boolean local410 = true;
				@Pc(412) boolean local412 = true;
				while (local50 != local403) {
					this.anInt5291 = 0;
					for (local147 = 0; local147 < local42; local147++) {
						this.anIntArray339[local147] = 0;
					}
					for (@Pc(436) int local436 = 0; local436 < 64; local436++) {
						this.anIntArray340[local436] = 0;
					}
					while (local50 != local403) {
						@Pc(452) Class5_Sub1_Sub1 local452 = (Class5_Sub1_Sub1) local50;
						if (local412) {
							local410 = local452.aBoolean448;
							local408 = local452.anInt6013;
							local412 = false;
						} else if (local452.anInt6013 != local408 || local452.aBoolean448 != local410) {
							local412 = true;
							break;
						}
						local158 = (int) (local37 + (float) (local452.anInt6009 >> 12) * local29 + (float) (local452.anInt6014 >> 12) * local25 + local33 * (float) (local452.anInt6011 >> 12)) - arg1.anInt8806 >> local44;
						if (local158 < 1600) {
							if (this.anIntArray339[local158] < 64) {
								this.aClass5_Sub1_Sub1ArrayArray1[local158][this.anIntArray339[local158]++] = local452;
							} else {
								label140: {
									if (this.anIntArray339[local158] == 64) {
										if (this.anInt5291 == 64) {
											break label140;
										}
										this.anIntArray339[local158] += this.anInt5291++ + 1;
									}
									this.aClass5_Sub1_Sub1ArrayArray2[this.anIntArray339[local158] - 64 - 1][this.anIntArray340[this.anIntArray339[local158] - 64 - 1]++] = local452;
								}
							}
						}
						local50 = local50.aClass5_Sub1_8;
					}
					if (local408 < 0) {
						arg0.method747(-1);
					} else {
						arg0.method747(local408);
					}
					if (local410 && Static54.aFloat41 != arg0.aFloat33) {
						arg0.ha(Static54.aFloat41);
					} else if (arg0.aFloat33 != 1.0F) {
						arg0.ha(1.0F);
					}
					this.method4537(arg0, local42);
				}
			} else {
				local42 = 0;
				local44 = Integer.MAX_VALUE;
				@Pc(46) int local46 = 0;
				local50 = arg1.aClass272_1.aClass5_Sub1_9;
				@Pc(53) Class5_Sub1 local53;
				@Pc(85) int local85;
				for (local53 = local50.aClass5_Sub1_8; local53 != local50; local53 = local53.aClass5_Sub1_8) {
					@Pc(58) Class5_Sub1_Sub1 local58 = (Class5_Sub1_Sub1) local53;
					local85 = (int) ((float) (local58.anInt6011 >> 12) * local33 + local25 * (float) (local58.anInt6014 >> 12) + local29 * (float) (local58.anInt6009 >> 12) + local37);
					if (local46 < local85) {
						local46 = local85;
					}
					this.anIntArray338[local42++] = local85;
					if (local44 > local85) {
						local44 = local85;
					}
				}
				@Pc(112) int local112 = local46 - local44;
				if (local112 + 2 > 1600) {
					local85 = Static330.method5267(local112) + 1 - this.anInt5290;
					local112 = (local112 >> local85) + 2;
				} else {
					local112 += 2;
					local85 = 0;
				}
				local42 = 0;
				local53 = local50.aClass5_Sub1_8;
				local147 = -2;
				@Pc(149) boolean local149 = true;
				@Pc(151) boolean local151 = true;
				while (local50 != local53) {
					this.anInt5291 = 0;
					for (local158 = 0; local158 < local112; local158++) {
						this.anIntArray339[local158] = 0;
					}
					for (@Pc(171) int local171 = 0; local171 < 64; local171++) {
						this.anIntArray340[local171] = 0;
					}
					while (local50 != local53) {
						@Pc(187) Class5_Sub1_Sub1 local187 = (Class5_Sub1_Sub1) local53;
						if (local151) {
							local151 = false;
							local149 = local187.aBoolean448;
							local147 = local187.anInt6013;
						}
						if (local42 > 0 && (local187.anInt6013 != local147 || local187.aBoolean448 != local149)) {
							local151 = true;
							break;
						}
						@Pc(225) int local225 = this.anIntArray338[local42++] - local44 >> local85;
						if (local225 < 1600) {
							if (this.anIntArray339[local225] < 64) {
								this.aClass5_Sub1_Sub1ArrayArray1[local225][this.anIntArray339[local225]++] = local187;
							} else {
								label185: {
									if (this.anIntArray339[local225] == 64) {
										if (this.anInt5291 == 64) {
											break label185;
										}
										this.anIntArray339[local225] += this.anInt5291++ + 1;
									}
									@Pc(295) Class5_Sub1_Sub1[] local295 = this.aClass5_Sub1_Sub1ArrayArray2[this.anIntArray339[local225] - 65];
									@Pc(305) int local305 = this.anIntArray339[local225] - 64 - 1;
									@Pc(307) int local307 = this.anIntArray340[this.anIntArray339[local225] - 64 - 1];
									this.anIntArray340[local305] = this.anIntArray340[this.anIntArray339[local225] - 64 - 1] + 1;
									local295[local307] = local187;
								}
							}
						}
						local53 = local53.aClass5_Sub1_8;
					}
					if (local147 < 0) {
						arg0.method747(-1);
					} else {
						arg0.method747(local147);
					}
					if (local149 && Static54.aFloat41 != arg0.aFloat33) {
						arg0.ha(Static54.aFloat41);
					} else if (arg0.aFloat33 != 1.0F) {
						arg0.ha(1.0F);
					}
					this.method4537(arg0, local112);
				}
			}
		} catch (@Pc(648) Exception local648) {
		}
		this.method4541(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ap;I)V")
	private void method4541(@OriginalArg(0) Class9_Sub2 arg0) {
		arg0.method808(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static54.aFloat41 != arg0.aFloat33) {
			arg0.ha(Static54.aFloat41);
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lclient!ap;I)V")
	private void method4544(@OriginalArg(0) Class9_Sub2 arg0) {
		Static54.aFloat41 = arg0.aFloat33;
		arg0.method791();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method808(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLclient!ap;)V")
	public void method4545(@OriginalArg(1) Class9_Sub2 arg0) {
		this.anInterface18_4 = arg0.method823(null, true, 24, 196584);
		this.aClass166_3 = new Class166(this.anInterface18_4, 5126, 2, 0);
		this.aClass166_5 = new Class166(this.anInterface18_4, 5126, 3, 8);
		this.aClass166_4 = new Class166(this.anInterface18_4, 5121, 4, 20);
	}
}
