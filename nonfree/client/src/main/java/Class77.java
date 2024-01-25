import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class77 {

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "Lclient!nn;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "client!fj", name = "o", descriptor = "Lclient!hf;")
	private Class100 aClass100_1;

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "Lclient!hf;")
	private Class100 aClass100_2;

	@OriginalMember(owner = "client!fj", name = "q", descriptor = "Lclient!hf;")
	private Class100 aClass100_3;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "[F")
	private final float[] aFloatArray6 = new float[16];

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "Lclient!dv;")
	private final Class2_Sub13_Sub1 aClass2_Sub13_Sub1_1 = new Class2_Sub13_Sub1(786336);

	@OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
	private final int anInt2130 = Static43.method647(1600);

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "[I")
	private final int[] anIntArray159 = new int[64];

	@OriginalMember(owner = "client!fj", name = "t", descriptor = "[I")
	private final int[] anIntArray158 = new int[1600];

	@OriginalMember(owner = "client!fj", name = "x", descriptor = "[I")
	private final int[] anIntArray160 = new int[8191];

	@OriginalMember(owner = "client!fj", name = "v", descriptor = "[[Lclient!fv;")
	private final Class21_Sub1_Sub1[][] aClass21_Sub1_Sub1ArrayArray1 = new Class21_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
	private int anInt2131 = 0;

	@OriginalMember(owner = "client!fj", name = "y", descriptor = "[[Lclient!fv;")
	private final Class21_Sub1_Sub1[][] aClass21_Sub1_Sub1ArrayArray2 = new Class21_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLclient!pg;I)V")
	private void method1740(@OriginalArg(1) Class163_Sub2 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray6, 0);
		@Pc(15) float local15 = this.aFloatArray6[0];
		@Pc(20) float local20 = this.aFloatArray6[4];
		@Pc(25) float local25 = this.aFloatArray6[8];
		@Pc(30) float local30 = this.aFloatArray6[1];
		@Pc(35) float local35 = this.aFloatArray6[5];
		@Pc(40) float local40 = this.aFloatArray6[9];
		@Pc(49) float local49 = local30 + local15;
		@Pc(53) float local53 = local20 + local35;
		@Pc(57) float local57 = local40 + local25;
		@Pc(61) float local61 = local15 - local30;
		@Pc(65) float local65 = local20 - local35;
		@Pc(69) float local69 = local25 - local40;
		@Pc(74) float local74 = local30 - local15;
		@Pc(79) float local79 = local35 - local20;
		this.aClass2_Sub13_Sub1_1.anInt4347 = 0;
		@Pc(88) float local88 = local40 - local25;
		@Pc(95) int local95;
		@Pc(112) int local112;
		@Pc(121) int local121;
		@Pc(130) Class21_Sub1_Sub1 local130;
		@Pc(133) int local133;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(146) byte local146;
		@Pc(151) byte local151;
		@Pc(157) float local157;
		@Pc(163) float local163;
		@Pc(169) float local169;
		@Pc(174) int local174;
		@Pc(505) float local505;
		@Pc(510) int local510;
		@Pc(450) int local450;
		@Pc(466) Class21_Sub1_Sub1 local466;
		@Pc(469) int local469;
		@Pc(482) byte local482;
		@Pc(487) byte local487;
		@Pc(499) float local499;
		if (arg0.aBoolean374) {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local112 = this.anIntArray158[local95] > 64 ? 64 : this.anIntArray158[local95];
				if (local112 > 0) {
					for (local121 = local112 - 1; local121 >= 0; local121--) {
						local130 = this.aClass21_Sub1_Sub1ArrayArray1[local95][local121];
						local133 = local130.anInt545;
						local138 = (byte) (local133 >> 16);
						local143 = (byte) (local133 >> 8);
						local146 = (byte) local133;
						local151 = (byte) (local133 >>> 24);
						local157 = local130.anInt543 >> 12;
						local163 = local130.anInt544 >> 12;
						local169 = local130.anInt547 >> 12;
						local174 = local130.anInt542 >> 12;
						this.aClass2_Sub13_Sub1_1.method1353(0.0F);
						this.aClass2_Sub13_Sub1_1.method1353(0.0F);
						this.aClass2_Sub13_Sub1_1.method1353(local157 + local49 * (float) -local174);
						this.aClass2_Sub13_Sub1_1.method1353((float) -local174 * local53 + local163);
						this.aClass2_Sub13_Sub1_1.method1353(local169 + local57 * (float) -local174);
						this.aClass2_Sub13_Sub1_1.method3602(local138);
						this.aClass2_Sub13_Sub1_1.method3602(local143);
						this.aClass2_Sub13_Sub1_1.method3602(local146);
						this.aClass2_Sub13_Sub1_1.method3602(local151);
						this.aClass2_Sub13_Sub1_1.method1353(1.0F);
						this.aClass2_Sub13_Sub1_1.method1353(0.0F);
						this.aClass2_Sub13_Sub1_1.method1353((float) local174 * local61 + local157);
						this.aClass2_Sub13_Sub1_1.method1353(local163 + (float) local174 * local65);
						this.aClass2_Sub13_Sub1_1.method1353(local169 + (float) local174 * local69);
						this.aClass2_Sub13_Sub1_1.method3602(local138);
						this.aClass2_Sub13_Sub1_1.method3602(local143);
						this.aClass2_Sub13_Sub1_1.method3602(local146);
						this.aClass2_Sub13_Sub1_1.method3602(local151);
						this.aClass2_Sub13_Sub1_1.method1353(1.0F);
						this.aClass2_Sub13_Sub1_1.method1353(1.0F);
						this.aClass2_Sub13_Sub1_1.method1353(local49 * (float) local174 + local157);
						this.aClass2_Sub13_Sub1_1.method1353(local163 + local53 * (float) local174);
						this.aClass2_Sub13_Sub1_1.method1353(local57 * (float) local174 + local169);
						this.aClass2_Sub13_Sub1_1.method3602(local138);
						this.aClass2_Sub13_Sub1_1.method3602(local143);
						this.aClass2_Sub13_Sub1_1.method3602(local146);
						this.aClass2_Sub13_Sub1_1.method3602(local151);
						this.aClass2_Sub13_Sub1_1.method1353(0.0F);
						this.aClass2_Sub13_Sub1_1.method1353(1.0F);
						this.aClass2_Sub13_Sub1_1.method1353(local74 * (float) local174 + local157);
						this.aClass2_Sub13_Sub1_1.method1353((float) local174 * local79 + local163);
						this.aClass2_Sub13_Sub1_1.method1353(local88 * (float) local174 + local169);
						this.aClass2_Sub13_Sub1_1.method3602(local138);
						this.aClass2_Sub13_Sub1_1.method3602(local143);
						this.aClass2_Sub13_Sub1_1.method3602(local146);
						this.aClass2_Sub13_Sub1_1.method3602(local151);
					}
					if (this.anIntArray158[local95] > 64) {
						local450 = this.anIntArray158[local95] - 64 - 1;
						for (local133 = this.anIntArray159[local450] - 1; local133 >= 0; local133--) {
							local466 = this.aClass21_Sub1_Sub1ArrayArray2[local450][local133];
							local469 = local466.anInt545;
							local146 = (byte) (local469 >> 16);
							local151 = (byte) (local469 >> 8);
							local482 = (byte) local469;
							local487 = (byte) (local469 >>> 24);
							local169 = local466.anInt543 >> 12;
							local499 = local466.anInt544 >> 12;
							local505 = local466.anInt547 >> 12;
							local510 = local466.anInt542 >> 12;
							this.aClass2_Sub13_Sub1_1.method1353(0.0F);
							this.aClass2_Sub13_Sub1_1.method1353(0.0F);
							this.aClass2_Sub13_Sub1_1.method1353(local169 + (float) -local510 * local49);
							this.aClass2_Sub13_Sub1_1.method1353(local53 * (float) -local510 + local499);
							this.aClass2_Sub13_Sub1_1.method1353(local505 + local57 * (float) -local510);
							this.aClass2_Sub13_Sub1_1.method3602(local146);
							this.aClass2_Sub13_Sub1_1.method3602(local151);
							this.aClass2_Sub13_Sub1_1.method3602(local482);
							this.aClass2_Sub13_Sub1_1.method3602(local487);
							this.aClass2_Sub13_Sub1_1.method1353(1.0F);
							this.aClass2_Sub13_Sub1_1.method1353(0.0F);
							this.aClass2_Sub13_Sub1_1.method1353((float) local510 * local61 + local169);
							this.aClass2_Sub13_Sub1_1.method1353(local499 + (float) local510 * local65);
							this.aClass2_Sub13_Sub1_1.method1353((float) local510 * local69 + local505);
							this.aClass2_Sub13_Sub1_1.method3602(local146);
							this.aClass2_Sub13_Sub1_1.method3602(local151);
							this.aClass2_Sub13_Sub1_1.method3602(local482);
							this.aClass2_Sub13_Sub1_1.method3602(local487);
							this.aClass2_Sub13_Sub1_1.method1353(1.0F);
							this.aClass2_Sub13_Sub1_1.method1353(1.0F);
							this.aClass2_Sub13_Sub1_1.method1353((float) local510 * local49 + local169);
							this.aClass2_Sub13_Sub1_1.method1353((float) local510 * local53 + local499);
							this.aClass2_Sub13_Sub1_1.method1353((float) local510 * local57 + local505);
							this.aClass2_Sub13_Sub1_1.method3602(local146);
							this.aClass2_Sub13_Sub1_1.method3602(local151);
							this.aClass2_Sub13_Sub1_1.method3602(local482);
							this.aClass2_Sub13_Sub1_1.method3602(local487);
							this.aClass2_Sub13_Sub1_1.method1353(0.0F);
							this.aClass2_Sub13_Sub1_1.method1353(1.0F);
							this.aClass2_Sub13_Sub1_1.method1353(local169 + (float) local510 * local74);
							this.aClass2_Sub13_Sub1_1.method1353(local499 + (float) local510 * local79);
							this.aClass2_Sub13_Sub1_1.method1353((float) local510 * local88 + local505);
							this.aClass2_Sub13_Sub1_1.method3602(local146);
							this.aClass2_Sub13_Sub1_1.method3602(local151);
							this.aClass2_Sub13_Sub1_1.method3602(local482);
							this.aClass2_Sub13_Sub1_1.method3602(local487);
						}
					}
				}
			}
		} else {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local112 = this.anIntArray158[local95] > 64 ? 64 : this.anIntArray158[local95];
				if (local112 > 0) {
					for (local121 = local112 - 1; local121 >= 0; local121--) {
						local130 = this.aClass21_Sub1_Sub1ArrayArray1[local95][local121];
						local133 = local130.anInt545;
						local138 = (byte) (local133 >> 16);
						local143 = (byte) (local133 >> 8);
						local146 = (byte) local133;
						local151 = (byte) (local133 >>> 24);
						local157 = local130.anInt543 >> 12;
						local163 = local130.anInt544 >> 12;
						local169 = local130.anInt547 >> 12;
						local174 = local130.anInt542 >> 12;
						this.aClass2_Sub13_Sub1_1.method1354(0.0F);
						this.aClass2_Sub13_Sub1_1.method1354(0.0F);
						this.aClass2_Sub13_Sub1_1.method1354(local157 + (float) -local174 * local49);
						this.aClass2_Sub13_Sub1_1.method1354(local53 * (float) -local174 + local163);
						this.aClass2_Sub13_Sub1_1.method1354((float) -local174 * local57 + local169);
						this.aClass2_Sub13_Sub1_1.method3602(local138);
						this.aClass2_Sub13_Sub1_1.method3602(local143);
						this.aClass2_Sub13_Sub1_1.method3602(local146);
						this.aClass2_Sub13_Sub1_1.method3602(local151);
						this.aClass2_Sub13_Sub1_1.method1354(1.0F);
						this.aClass2_Sub13_Sub1_1.method1354(0.0F);
						this.aClass2_Sub13_Sub1_1.method1354(local61 * (float) local174 + local157);
						this.aClass2_Sub13_Sub1_1.method1354(local163 + (float) local174 * local65);
						this.aClass2_Sub13_Sub1_1.method1354(local69 * (float) local174 + local169);
						this.aClass2_Sub13_Sub1_1.method3602(local138);
						this.aClass2_Sub13_Sub1_1.method3602(local143);
						this.aClass2_Sub13_Sub1_1.method3602(local146);
						this.aClass2_Sub13_Sub1_1.method3602(local151);
						this.aClass2_Sub13_Sub1_1.method1354(1.0F);
						this.aClass2_Sub13_Sub1_1.method1354(1.0F);
						this.aClass2_Sub13_Sub1_1.method1354((float) local174 * local49 + local157);
						this.aClass2_Sub13_Sub1_1.method1354((float) local174 * local53 + local163);
						this.aClass2_Sub13_Sub1_1.method1354(local169 + local57 * (float) local174);
						this.aClass2_Sub13_Sub1_1.method3602(local138);
						this.aClass2_Sub13_Sub1_1.method3602(local143);
						this.aClass2_Sub13_Sub1_1.method3602(local146);
						this.aClass2_Sub13_Sub1_1.method3602(local151);
						this.aClass2_Sub13_Sub1_1.method1354(0.0F);
						this.aClass2_Sub13_Sub1_1.method1354(1.0F);
						this.aClass2_Sub13_Sub1_1.method1354(local157 + local74 * (float) local174);
						this.aClass2_Sub13_Sub1_1.method1354(local79 * (float) local174 + local163);
						this.aClass2_Sub13_Sub1_1.method1354((float) local174 * local88 + local169);
						this.aClass2_Sub13_Sub1_1.method3602(local138);
						this.aClass2_Sub13_Sub1_1.method3602(local143);
						this.aClass2_Sub13_Sub1_1.method3602(local146);
						this.aClass2_Sub13_Sub1_1.method3602(local151);
					}
					if (this.anIntArray158[local95] > 64) {
						local450 = this.anIntArray158[local95] - 1 - 64;
						for (local133 = this.anIntArray159[local450] - 1; local133 >= 0; local133--) {
							local466 = this.aClass21_Sub1_Sub1ArrayArray2[local450][local133];
							local469 = local466.anInt545;
							local146 = (byte) (local469 >> 16);
							local151 = (byte) (local469 >> 8);
							local482 = (byte) local469;
							local487 = (byte) (local469 >>> 24);
							local169 = local466.anInt543 >> 12;
							local499 = local466.anInt544 >> 12;
							local505 = local466.anInt547 >> 12;
							local510 = local466.anInt542 >> 12;
							this.aClass2_Sub13_Sub1_1.method1354(0.0F);
							this.aClass2_Sub13_Sub1_1.method1354(0.0F);
							this.aClass2_Sub13_Sub1_1.method1354(local169 + local49 * (float) -local510);
							this.aClass2_Sub13_Sub1_1.method1354((float) -local510 * local53 + local499);
							this.aClass2_Sub13_Sub1_1.method1354(local57 * (float) -local510 + local505);
							this.aClass2_Sub13_Sub1_1.method3602(local146);
							this.aClass2_Sub13_Sub1_1.method3602(local151);
							this.aClass2_Sub13_Sub1_1.method3602(local482);
							this.aClass2_Sub13_Sub1_1.method3602(local487);
							this.aClass2_Sub13_Sub1_1.method1354(1.0F);
							this.aClass2_Sub13_Sub1_1.method1354(0.0F);
							this.aClass2_Sub13_Sub1_1.method1354(local169 + (float) local510 * local61);
							this.aClass2_Sub13_Sub1_1.method1354(local65 * (float) local510 + local499);
							this.aClass2_Sub13_Sub1_1.method1354(local69 * (float) local510 + local505);
							this.aClass2_Sub13_Sub1_1.method3602(local146);
							this.aClass2_Sub13_Sub1_1.method3602(local151);
							this.aClass2_Sub13_Sub1_1.method3602(local482);
							this.aClass2_Sub13_Sub1_1.method3602(local487);
							this.aClass2_Sub13_Sub1_1.method1354(1.0F);
							this.aClass2_Sub13_Sub1_1.method1354(1.0F);
							this.aClass2_Sub13_Sub1_1.method1354((float) local510 * local49 + local169);
							this.aClass2_Sub13_Sub1_1.method1354((float) local510 * local53 + local499);
							this.aClass2_Sub13_Sub1_1.method1354(local57 * (float) local510 + local505);
							this.aClass2_Sub13_Sub1_1.method3602(local146);
							this.aClass2_Sub13_Sub1_1.method3602(local151);
							this.aClass2_Sub13_Sub1_1.method3602(local482);
							this.aClass2_Sub13_Sub1_1.method3602(local487);
							this.aClass2_Sub13_Sub1_1.method1354(0.0F);
							this.aClass2_Sub13_Sub1_1.method1354(1.0F);
							this.aClass2_Sub13_Sub1_1.method1354((float) local510 * local74 + local169);
							this.aClass2_Sub13_Sub1_1.method1354(local499 + local79 * (float) local510);
							this.aClass2_Sub13_Sub1_1.method1354(local505 + local88 * (float) local510);
							this.aClass2_Sub13_Sub1_1.method3602(local146);
							this.aClass2_Sub13_Sub1_1.method3602(local151);
							this.aClass2_Sub13_Sub1_1.method3602(local482);
							this.aClass2_Sub13_Sub1_1.method3602(local487);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub13_Sub1_1.anInt4347 != 0) {
			this.anInterface11_1.method1891(this.aClass2_Sub13_Sub1_1.anInt4347, 24, this.aClass2_Sub13_Sub1_1.aByteArray52);
			arg0.method4114(this.aClass100_2, null, this.aClass100_3, this.aClass100_1);
			arg0.method4103(this.aClass2_Sub13_Sub1_1.anInt4347 / 24);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLclient!vk;Lclient!pg;)V")
	public void method1741(@OriginalArg(1) Class256 arg0, @OriginalArg(2) Class163_Sub2 arg1) {
		if (arg1.aClass31_Sub2_4 == null) {
			return;
		}
		this.method1746(arg1);
		@Pc(22) float local22 = arg1.aClass31_Sub2_4.aFloat86;
		@Pc(26) float local26 = arg1.aClass31_Sub2_4.aFloat95;
		@Pc(30) float local30 = arg1.aClass31_Sub2_4.aFloat88;
		@Pc(34) float local34 = arg1.aClass31_Sub2_4.aFloat92;
		try {
			@Pc(44) int local44;
			@Pc(51) int local51;
			@Pc(77) Class21_Sub1 local77;
			@Pc(90) int local90;
			@Pc(178) int local178;
			if (arg0.aBoolean502) {
				local44 = arg0.anInt6936 - arg0.anInt6933;
				if (local44 + 2 <= 1600) {
					local51 = 0;
					local44 += 2;
				} else {
					local51 = Static43.method647(local44) + 1 - this.anInt2130;
					local44 = (local44 >> local51) + 2;
				}
				@Pc(74) Class21_Sub1 local74 = arg0.aClass187_1.aClass21_Sub1_9;
				local77 = local74.aClass21_Sub1_7;
				@Pc(79) int local79 = -2;
				@Pc(81) boolean local81 = true;
				@Pc(83) boolean local83 = true;
				while (local74 != local77) {
					this.anInt2131 = 0;
					for (local90 = 0; local90 < local44; local90++) {
						this.anIntArray158[local90] = 0;
					}
					for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
						this.anIntArray159[local103] = 0;
					}
					while (local77 != local74) {
						@Pc(119) Class21_Sub1_Sub1 local119 = (Class21_Sub1_Sub1) local77;
						if (local83) {
							local81 = local119.aBoolean53;
							local79 = local119.anInt548;
							local83 = false;
						} else if (local119.anInt548 != local79 || local81 != local119.aBoolean53) {
							local83 = true;
							break;
						}
						local178 = (int) (local34 + local30 * (float) (local119.anInt547 >> 12) + (float) (local119.anInt544 >> 12) * local26 + local22 * (float) (local119.anInt543 >> 12)) - arg0.anInt6933 >> local51;
						if (local178 < 1600) {
							if (this.anIntArray158[local178] >= 64) {
								label186: {
									if (this.anIntArray158[local178] == 64) {
										if (this.anInt2131 == 64) {
											break label186;
										}
										this.anIntArray158[local178] += this.anInt2131++ + 1;
									}
									@Pc(229) Class21_Sub1_Sub1[] local229 = this.aClass21_Sub1_Sub1ArrayArray2[this.anIntArray158[local178] - 64 - 1];
									@Pc(239) int local239 = this.anIntArray158[local178] - 64 - 1;
									@Pc(241) int local241 = this.anIntArray159[this.anIntArray158[local178] - 64 - 1];
									this.anIntArray159[local239] = this.anIntArray159[this.anIntArray158[local178] - 64 - 1] + 1;
									local229[local241] = local119;
								}
							} else {
								this.aClass21_Sub1_Sub1ArrayArray1[local178][this.anIntArray158[local178]++] = local119;
							}
						}
						local77 = local77.aClass21_Sub1_7;
					}
					if (local79 >= 0) {
						arg1.method4118(arg1.aClass105_1.method2196(local79));
						arg1.method4107(arg1.anInterface9_12.method1769(local79).anInt4043);
					} else {
						arg1.method4118(null);
					}
					if (local81 && arg1.aFloat60 != Static234.aFloat39) {
						arg1.JA(Static234.aFloat39);
					} else if (arg1.aFloat60 != 1.0F) {
						arg1.JA(1.0F);
					}
					this.method1740(arg1, local44);
				}
			} else {
				local44 = 0;
				local51 = Integer.MAX_VALUE;
				@Pc(331) int local331 = 0;
				local77 = arg0.aClass187_1.aClass21_Sub1_9;
				@Pc(338) Class21_Sub1 local338;
				@Pc(370) int local370;
				for (local338 = local77.aClass21_Sub1_7; local338 != local77; local338 = local338.aClass21_Sub1_7) {
					@Pc(343) Class21_Sub1_Sub1 local343 = (Class21_Sub1_Sub1) local338;
					local370 = (int) (local30 * (float) (local343.anInt547 >> 12) + local22 * (float) (local343.anInt543 >> 12) + (float) (local343.anInt544 >> 12) * local26 + local34);
					this.anIntArray160[local44++] = local370;
					if (local331 < local370) {
						local331 = local370;
					}
					if (local370 < local51) {
						local51 = local370;
					}
				}
				@Pc(400) int local400 = local331 - local51;
				if (local400 + 2 > 1600) {
					local370 = Static43.method647(local400) + 1 - this.anInt2130;
					local400 = (local400 >> local370) + 2;
				} else {
					local400 += 2;
					local370 = 0;
				}
				local338 = local77.aClass21_Sub1_7;
				local44 = 0;
				local90 = -2;
				@Pc(435) boolean local435 = true;
				@Pc(437) boolean local437 = true;
				while (local338 != local77) {
					this.anInt2131 = 0;
					for (local178 = 0; local178 < local400; local178++) {
						this.anIntArray158[local178] = 0;
					}
					for (@Pc(461) int local461 = 0; local461 < 64; local461++) {
						this.anIntArray159[local461] = 0;
					}
					while (local77 != local338) {
						@Pc(477) Class21_Sub1_Sub1 local477 = (Class21_Sub1_Sub1) local338;
						if (local437) {
							local435 = local477.aBoolean53;
							local90 = local477.anInt548;
							local437 = false;
						}
						if (local44 > 0 && (local477.anInt548 != local90 || local435 != local477.aBoolean53)) {
							local437 = true;
							break;
						}
						@Pc(518) int local518 = this.anIntArray160[local44++] - local51 >> local370;
						if (local518 < 1600) {
							if (this.anIntArray158[local518] >= 64) {
								label137: {
									if (this.anIntArray158[local518] == 64) {
										if (this.anInt2131 == 64) {
											break label137;
										}
										this.anIntArray158[local518] += this.anInt2131++ + 1;
									}
									this.aClass21_Sub1_Sub1ArrayArray2[this.anIntArray158[local518] - 1 - 64][this.anIntArray159[this.anIntArray158[local518] - 64 - 1]++] = local477;
								}
							} else {
								this.aClass21_Sub1_Sub1ArrayArray1[local518][this.anIntArray158[local518]++] = local477;
							}
						}
						local338 = local338.aClass21_Sub1_7;
					}
					if (local90 < 0) {
						arg1.method4118(null);
					} else {
						arg1.method4118(arg1.aClass105_1.method2196(local90));
						arg1.method4107(arg1.anInterface9_12.method1769(local90).anInt4043);
					}
					if (local435 && Static234.aFloat39 != arg1.aFloat60) {
						arg1.JA(Static234.aFloat39);
					} else if (arg1.aFloat60 != 1.0F) {
						arg1.JA(1.0F);
					}
					this.method1740(arg1, local400);
				}
			}
		} catch (@Pc(666) Exception local666) {
		}
		this.method1742(arg1);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!pg;)V")
	private void method1742(@OriginalArg(1) Class163_Sub2 arg0) {
		arg0.method4166(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static234.aFloat39 != arg0.aFloat60) {
			arg0.JA(Static234.aFloat39);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLclient!pg;)V")
	public void method1743(@OriginalArg(1) Class163_Sub2 arg0) {
		this.anInterface11_1 = arg0.method4124(196584, true, 24, null);
		this.aClass100_2 = new Class100(this.anInterface11_1, 5126, 2, 0);
		this.aClass100_1 = new Class100(this.anInterface11_1, 5126, 3, 8);
		this.aClass100_3 = new Class100(this.anInterface11_1, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!pg;B)V")
	private void method1746(@OriginalArg(0) Class163_Sub2 arg0) {
		Static234.aFloat39 = arg0.aFloat60;
		arg0.method4171();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4166(false);
		arg0.method4139(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
