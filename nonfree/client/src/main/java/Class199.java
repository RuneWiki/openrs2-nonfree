import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class199 {

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "Lclient!db;")
	private Class47 aClass47_8;

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "Lclient!db;")
	private Class47 aClass47_9;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "Lclient!ui;")
	private Interface12 anInterface12_5;

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "Lclient!db;")
	private Class47 aClass47_10;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "[F")
	private final float[] aFloatArray13 = new float[16];

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "Lclient!wm;")
	private final Class2_Sub17_Sub2 aClass2_Sub17_Sub2_2 = new Class2_Sub17_Sub2(786336);

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
	private final int anInt5767 = Static109.method1799(1600);

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "[I")
	private final int[] anIntArray488 = new int[1600];

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "[[Lclient!wu;")
	private final Class28_Sub2_Sub1[][] aClass28_Sub2_Sub1ArrayArray1 = new Class28_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "[I")
	private final int[] anIntArray486 = new int[8191];

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
	private int anInt5768 = 0;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "[I")
	private final int[] anIntArray487 = new int[64];

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "[[Lclient!wu;")
	private final Class28_Sub2_Sub1[][] aClass28_Sub2_Sub1ArrayArray2 = new Class28_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!na;Z)V")
	public void method4570(@OriginalArg(0) Class75_Sub2 arg0) {
		this.anInterface12_5 = arg0.method3848(24, 196584, null, true);
		this.aClass47_9 = new Class47(this.anInterface12_5, 5126, 2, 0);
		this.aClass47_8 = new Class47(this.anInterface12_5, 5126, 3, 8);
		this.aClass47_10 = new Class47(this.anInterface12_5, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!na;)V")
	private void method4571(@OriginalArg(1) Class75_Sub2 arg0) {
		arg0.method3875(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static391.aFloat89 != arg0.aFloat57) {
			arg0.JA(Static391.aFloat89);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!na;B)V")
	private void method4572(@OriginalArg(0) Class75_Sub2 arg0) {
		Static391.aFloat89 = arg0.aFloat57;
		arg0.method3863();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method3875(false);
		arg0.method3857(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBLclient!na;)V")
	private void method4573(@OriginalArg(0) int arg0, @OriginalArg(2) Class75_Sub2 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray13, 0);
		@Pc(15) float local15 = this.aFloatArray13[0];
		@Pc(20) float local20 = this.aFloatArray13[4];
		@Pc(25) float local25 = this.aFloatArray13[8];
		@Pc(30) float local30 = this.aFloatArray13[1];
		@Pc(41) float local41 = this.aFloatArray13[5];
		@Pc(46) float local46 = this.aFloatArray13[9];
		@Pc(50) float local50 = local15 + local30;
		@Pc(54) float local54 = local41 + local20;
		@Pc(58) float local58 = local46 + local25;
		@Pc(62) float local62 = local15 - local30;
		@Pc(67) float local67 = local20 - local41;
		@Pc(72) float local72 = local25 - local46;
		@Pc(77) float local77 = local30 - local15;
		@Pc(82) float local82 = local41 - local20;
		@Pc(86) float local86 = local46 - local25;
		this.aClass2_Sub17_Sub2_2.anInt7523 = 0;
		@Pc(97) int local97;
		@Pc(114) int local114;
		@Pc(123) int local123;
		@Pc(132) Class28_Sub2_Sub1 local132;
		@Pc(135) int local135;
		@Pc(140) byte local140;
		@Pc(145) byte local145;
		@Pc(148) byte local148;
		@Pc(153) byte local153;
		@Pc(159) float local159;
		@Pc(165) float local165;
		@Pc(171) float local171;
		@Pc(176) int local176;
		@Pc(497) float local497;
		@Pc(502) int local502;
		@Pc(442) int local442;
		@Pc(458) Class28_Sub2_Sub1 local458;
		@Pc(461) int local461;
		@Pc(474) byte local474;
		@Pc(479) byte local479;
		@Pc(491) float local491;
		if (arg1.aBoolean349) {
			for (local97 = arg0 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray488[local97] <= 64 ? this.anIntArray488[local97] : 64;
				if (local114 > 0) {
					for (local123 = local114 - 1; local123 >= 0; local123--) {
						local132 = this.aClass28_Sub2_Sub1ArrayArray1[local97][local123];
						local135 = local132.anInt4532;
						local140 = (byte) (local135 >> 16);
						local145 = (byte) (local135 >> 8);
						local148 = (byte) local135;
						local153 = (byte) (local135 >>> 24);
						local159 = local132.anInt4530 >> 12;
						local165 = local132.anInt4535 >> 12;
						local171 = local132.anInt4538 >> 12;
						local176 = local132.anInt4540 >> 12;
						this.aClass2_Sub17_Sub2_2.method6175(0.0F);
						this.aClass2_Sub17_Sub2_2.method6175(0.0F);
						this.aClass2_Sub17_Sub2_2.method6175(local50 * (float) -local176 + local159);
						this.aClass2_Sub17_Sub2_2.method6175(local165 + (float) -local176 * local54);
						this.aClass2_Sub17_Sub2_2.method6175(local171 + (float) -local176 * local58);
						this.aClass2_Sub17_Sub2_2.method6172(local140);
						this.aClass2_Sub17_Sub2_2.method6172(local145);
						this.aClass2_Sub17_Sub2_2.method6172(local148);
						this.aClass2_Sub17_Sub2_2.method6172(local153);
						this.aClass2_Sub17_Sub2_2.method6175(1.0F);
						this.aClass2_Sub17_Sub2_2.method6175(0.0F);
						this.aClass2_Sub17_Sub2_2.method6175(local62 * (float) local176 + local159);
						this.aClass2_Sub17_Sub2_2.method6175((float) local176 * local67 + local165);
						this.aClass2_Sub17_Sub2_2.method6175(local171 + local72 * (float) local176);
						this.aClass2_Sub17_Sub2_2.method6172(local140);
						this.aClass2_Sub17_Sub2_2.method6172(local145);
						this.aClass2_Sub17_Sub2_2.method6172(local148);
						this.aClass2_Sub17_Sub2_2.method6172(local153);
						this.aClass2_Sub17_Sub2_2.method6175(1.0F);
						this.aClass2_Sub17_Sub2_2.method6175(1.0F);
						this.aClass2_Sub17_Sub2_2.method6175(local159 + local50 * (float) local176);
						this.aClass2_Sub17_Sub2_2.method6175(local165 + (float) local176 * local54);
						this.aClass2_Sub17_Sub2_2.method6175((float) local176 * local58 + local171);
						this.aClass2_Sub17_Sub2_2.method6172(local140);
						this.aClass2_Sub17_Sub2_2.method6172(local145);
						this.aClass2_Sub17_Sub2_2.method6172(local148);
						this.aClass2_Sub17_Sub2_2.method6172(local153);
						this.aClass2_Sub17_Sub2_2.method6175(0.0F);
						this.aClass2_Sub17_Sub2_2.method6175(1.0F);
						this.aClass2_Sub17_Sub2_2.method6175(local77 * (float) local176 + local159);
						this.aClass2_Sub17_Sub2_2.method6175(local165 + (float) local176 * local82);
						this.aClass2_Sub17_Sub2_2.method6175((float) local176 * local86 + local171);
						this.aClass2_Sub17_Sub2_2.method6172(local140);
						this.aClass2_Sub17_Sub2_2.method6172(local145);
						this.aClass2_Sub17_Sub2_2.method6172(local148);
						this.aClass2_Sub17_Sub2_2.method6172(local153);
					}
					if (this.anIntArray488[local97] > 64) {
						local442 = this.anIntArray488[local97] - 64 - 1;
						for (local135 = this.anIntArray487[local442] - 1; local135 >= 0; local135--) {
							local458 = this.aClass28_Sub2_Sub1ArrayArray2[local442][local135];
							local461 = local458.anInt4532;
							local148 = (byte) (local461 >> 16);
							local153 = (byte) (local461 >> 8);
							local474 = (byte) local461;
							local479 = (byte) (local461 >>> 24);
							local171 = local458.anInt4530 >> 12;
							local491 = local458.anInt4535 >> 12;
							local497 = local458.anInt4538 >> 12;
							local502 = local458.anInt4540 >> 12;
							this.aClass2_Sub17_Sub2_2.method6175(0.0F);
							this.aClass2_Sub17_Sub2_2.method6175(0.0F);
							this.aClass2_Sub17_Sub2_2.method6175(local171 + local50 * (float) -local502);
							this.aClass2_Sub17_Sub2_2.method6175((float) -local502 * local54 + local491);
							this.aClass2_Sub17_Sub2_2.method6175(local497 + local58 * (float) -local502);
							this.aClass2_Sub17_Sub2_2.method6172(local148);
							this.aClass2_Sub17_Sub2_2.method6172(local153);
							this.aClass2_Sub17_Sub2_2.method6172(local474);
							this.aClass2_Sub17_Sub2_2.method6172(local479);
							this.aClass2_Sub17_Sub2_2.method6175(1.0F);
							this.aClass2_Sub17_Sub2_2.method6175(0.0F);
							this.aClass2_Sub17_Sub2_2.method6175(local171 + local62 * (float) local502);
							this.aClass2_Sub17_Sub2_2.method6175((float) local502 * local67 + local491);
							this.aClass2_Sub17_Sub2_2.method6175(local72 * (float) local502 + local497);
							this.aClass2_Sub17_Sub2_2.method6172(local148);
							this.aClass2_Sub17_Sub2_2.method6172(local153);
							this.aClass2_Sub17_Sub2_2.method6172(local474);
							this.aClass2_Sub17_Sub2_2.method6172(local479);
							this.aClass2_Sub17_Sub2_2.method6175(1.0F);
							this.aClass2_Sub17_Sub2_2.method6175(1.0F);
							this.aClass2_Sub17_Sub2_2.method6175(local171 + local50 * (float) local502);
							this.aClass2_Sub17_Sub2_2.method6175(local491 + (float) local502 * local54);
							this.aClass2_Sub17_Sub2_2.method6175(local58 * (float) local502 + local497);
							this.aClass2_Sub17_Sub2_2.method6172(local148);
							this.aClass2_Sub17_Sub2_2.method6172(local153);
							this.aClass2_Sub17_Sub2_2.method6172(local474);
							this.aClass2_Sub17_Sub2_2.method6172(local479);
							this.aClass2_Sub17_Sub2_2.method6175(0.0F);
							this.aClass2_Sub17_Sub2_2.method6175(1.0F);
							this.aClass2_Sub17_Sub2_2.method6175(local77 * (float) local502 + local171);
							this.aClass2_Sub17_Sub2_2.method6175(local491 + (float) local502 * local82);
							this.aClass2_Sub17_Sub2_2.method6175(local86 * (float) local502 + local497);
							this.aClass2_Sub17_Sub2_2.method6172(local148);
							this.aClass2_Sub17_Sub2_2.method6172(local153);
							this.aClass2_Sub17_Sub2_2.method6172(local474);
							this.aClass2_Sub17_Sub2_2.method6172(local479);
						}
					}
				}
			}
		} else {
			for (local97 = arg0 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray488[local97] <= 64 ? this.anIntArray488[local97] : 64;
				if (local114 > 0) {
					for (local123 = local114 - 1; local123 >= 0; local123--) {
						local132 = this.aClass28_Sub2_Sub1ArrayArray1[local97][local123];
						local135 = local132.anInt4532;
						local140 = (byte) (local135 >> 16);
						local145 = (byte) (local135 >> 8);
						local148 = (byte) local135;
						local153 = (byte) (local135 >>> 24);
						local159 = local132.anInt4530 >> 12;
						local165 = local132.anInt4535 >> 12;
						local171 = local132.anInt4538 >> 12;
						local176 = local132.anInt4540 >> 12;
						this.aClass2_Sub17_Sub2_2.method6179(0.0F);
						this.aClass2_Sub17_Sub2_2.method6179(0.0F);
						this.aClass2_Sub17_Sub2_2.method6179(local159 + (float) -local176 * local50);
						this.aClass2_Sub17_Sub2_2.method6179(local165 + local54 * (float) -local176);
						this.aClass2_Sub17_Sub2_2.method6179(local171 + (float) -local176 * local58);
						this.aClass2_Sub17_Sub2_2.method6172(local140);
						this.aClass2_Sub17_Sub2_2.method6172(local145);
						this.aClass2_Sub17_Sub2_2.method6172(local148);
						this.aClass2_Sub17_Sub2_2.method6172(local153);
						this.aClass2_Sub17_Sub2_2.method6179(1.0F);
						this.aClass2_Sub17_Sub2_2.method6179(0.0F);
						this.aClass2_Sub17_Sub2_2.method6179(local62 * (float) local176 + local159);
						this.aClass2_Sub17_Sub2_2.method6179(local67 * (float) local176 + local165);
						this.aClass2_Sub17_Sub2_2.method6179(local72 * (float) local176 + local171);
						this.aClass2_Sub17_Sub2_2.method6172(local140);
						this.aClass2_Sub17_Sub2_2.method6172(local145);
						this.aClass2_Sub17_Sub2_2.method6172(local148);
						this.aClass2_Sub17_Sub2_2.method6172(local153);
						this.aClass2_Sub17_Sub2_2.method6179(1.0F);
						this.aClass2_Sub17_Sub2_2.method6179(1.0F);
						this.aClass2_Sub17_Sub2_2.method6179(local159 + local50 * (float) local176);
						this.aClass2_Sub17_Sub2_2.method6179(local54 * (float) local176 + local165);
						this.aClass2_Sub17_Sub2_2.method6179(local171 + local58 * (float) local176);
						this.aClass2_Sub17_Sub2_2.method6172(local140);
						this.aClass2_Sub17_Sub2_2.method6172(local145);
						this.aClass2_Sub17_Sub2_2.method6172(local148);
						this.aClass2_Sub17_Sub2_2.method6172(local153);
						this.aClass2_Sub17_Sub2_2.method6179(0.0F);
						this.aClass2_Sub17_Sub2_2.method6179(1.0F);
						this.aClass2_Sub17_Sub2_2.method6179(local77 * (float) local176 + local159);
						this.aClass2_Sub17_Sub2_2.method6179(local165 + local82 * (float) local176);
						this.aClass2_Sub17_Sub2_2.method6179((float) local176 * local86 + local171);
						this.aClass2_Sub17_Sub2_2.method6172(local140);
						this.aClass2_Sub17_Sub2_2.method6172(local145);
						this.aClass2_Sub17_Sub2_2.method6172(local148);
						this.aClass2_Sub17_Sub2_2.method6172(local153);
					}
					if (this.anIntArray488[local97] > 64) {
						local442 = this.anIntArray488[local97] - 1 - 64;
						for (local135 = this.anIntArray487[local442] - 1; local135 >= 0; local135--) {
							local458 = this.aClass28_Sub2_Sub1ArrayArray2[local442][local135];
							local461 = local458.anInt4532;
							local148 = (byte) (local461 >> 16);
							local153 = (byte) (local461 >> 8);
							local474 = (byte) local461;
							local479 = (byte) (local461 >>> 24);
							local171 = local458.anInt4530 >> 12;
							local491 = local458.anInt4535 >> 12;
							local497 = local458.anInt4538 >> 12;
							local502 = local458.anInt4540 >> 12;
							this.aClass2_Sub17_Sub2_2.method6179(0.0F);
							this.aClass2_Sub17_Sub2_2.method6179(0.0F);
							this.aClass2_Sub17_Sub2_2.method6179(local171 + (float) -local502 * local50);
							this.aClass2_Sub17_Sub2_2.method6179((float) -local502 * local54 + local491);
							this.aClass2_Sub17_Sub2_2.method6179(local497 + local58 * (float) -local502);
							this.aClass2_Sub17_Sub2_2.method6172(local148);
							this.aClass2_Sub17_Sub2_2.method6172(local153);
							this.aClass2_Sub17_Sub2_2.method6172(local474);
							this.aClass2_Sub17_Sub2_2.method6172(local479);
							this.aClass2_Sub17_Sub2_2.method6179(1.0F);
							this.aClass2_Sub17_Sub2_2.method6179(0.0F);
							this.aClass2_Sub17_Sub2_2.method6179(local62 * (float) local502 + local171);
							this.aClass2_Sub17_Sub2_2.method6179(local67 * (float) local502 + local491);
							this.aClass2_Sub17_Sub2_2.method6179((float) local502 * local72 + local497);
							this.aClass2_Sub17_Sub2_2.method6172(local148);
							this.aClass2_Sub17_Sub2_2.method6172(local153);
							this.aClass2_Sub17_Sub2_2.method6172(local474);
							this.aClass2_Sub17_Sub2_2.method6172(local479);
							this.aClass2_Sub17_Sub2_2.method6179(1.0F);
							this.aClass2_Sub17_Sub2_2.method6179(1.0F);
							this.aClass2_Sub17_Sub2_2.method6179(local50 * (float) local502 + local171);
							this.aClass2_Sub17_Sub2_2.method6179(local54 * (float) local502 + local491);
							this.aClass2_Sub17_Sub2_2.method6179(local58 * (float) local502 + local497);
							this.aClass2_Sub17_Sub2_2.method6172(local148);
							this.aClass2_Sub17_Sub2_2.method6172(local153);
							this.aClass2_Sub17_Sub2_2.method6172(local474);
							this.aClass2_Sub17_Sub2_2.method6172(local479);
							this.aClass2_Sub17_Sub2_2.method6179(0.0F);
							this.aClass2_Sub17_Sub2_2.method6179(1.0F);
							this.aClass2_Sub17_Sub2_2.method6179(local171 + (float) local502 * local77);
							this.aClass2_Sub17_Sub2_2.method6179(local491 + local82 * (float) local502);
							this.aClass2_Sub17_Sub2_2.method6179(local497 + local86 * (float) local502);
							this.aClass2_Sub17_Sub2_2.method6172(local148);
							this.aClass2_Sub17_Sub2_2.method6172(local153);
							this.aClass2_Sub17_Sub2_2.method6172(local474);
							this.aClass2_Sub17_Sub2_2.method6172(local479);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub17_Sub2_2.anInt7523 != 0) {
			this.anInterface12_5.method5416(this.aClass2_Sub17_Sub2_2.anInt7523, 24, this.aClass2_Sub17_Sub2_2.aByteArray94);
			arg1.method3852(this.aClass47_10, this.aClass47_8, this.aClass47_9, null);
			arg1.method3871(this.aClass2_Sub17_Sub2_2.anInt7523 / 24);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!na;ILclient!dm;)V")
	public void method4574(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(2) Class56 arg1) {
		if (arg0.aClass6_Sub2_4 == null) {
			return;
		}
		this.method4572(arg0);
		@Pc(17) float local17 = arg0.aClass6_Sub2_4.aFloat64;
		@Pc(21) float local21 = arg0.aClass6_Sub2_4.aFloat69;
		@Pc(32) float local32 = arg0.aClass6_Sub2_4.aFloat65;
		@Pc(36) float local36 = arg0.aClass6_Sub2_4.aFloat59;
		try {
			@Pc(41) int local41;
			@Pc(43) int local43;
			@Pc(49) Class28_Sub2 local49;
			@Pc(150) int local150;
			@Pc(161) int local161;
			@Pc(313) int local313;
			@Pc(315) int local315;
			@Pc(303) Class28_Sub2_Sub1[] local303;
			if (arg1.aBoolean67) {
				local41 = arg1.anInt1243 - arg1.anInt1244;
				if (local41 + 2 > 1600) {
					local43 = Static109.method1799(local41) + 1 - this.anInt5767;
					local41 = (local41 >> local43) + 2;
				} else {
					local41 += 2;
					local43 = 0;
				}
				@Pc(423) Class28_Sub2 local423 = arg1.aClass96_1.aClass28_Sub2_3;
				local49 = local423.aClass28_Sub2_9;
				@Pc(428) int local428 = -2;
				@Pc(430) boolean local430 = true;
				@Pc(432) boolean local432 = true;
				while (local423 != local49) {
					this.anInt5768 = 0;
					for (local150 = 0; local150 < local41; local150++) {
						this.anIntArray488[local150] = 0;
					}
					for (@Pc(452) int local452 = 0; local452 < 64; local452++) {
						this.anIntArray487[local452] = 0;
					}
					while (local423 != local49) {
						@Pc(468) Class28_Sub2_Sub1 local468 = (Class28_Sub2_Sub1) local49;
						if (local432) {
							local428 = local468.anInt4537;
							local432 = false;
							local430 = local468.aBoolean327;
						} else if (local468.anInt4537 != local428 || local468.aBoolean327 != local430) {
							local432 = true;
							break;
						}
						local161 = (int) ((float) (local468.anInt4530 >> 12) * local17 + (float) (local468.anInt4535 >> 12) * local21 + local32 * (float) (local468.anInt4538 >> 12) + local36) - arg1.anInt1244 >> local43;
						if (local161 < 1600) {
							if (this.anIntArray488[local161] < 64) {
								this.aClass28_Sub2_Sub1ArrayArray1[local161][this.anIntArray488[local161]++] = local468;
							} else {
								label141: {
									if (this.anIntArray488[local161] == 64) {
										if (this.anInt5768 == 64) {
											break label141;
										}
										this.anIntArray488[local161] += this.anInt5768++ + 1;
									}
									local303 = this.aClass28_Sub2_Sub1ArrayArray2[this.anIntArray488[local161] - 64 - 1];
									local313 = this.anIntArray488[local161] - 65;
									local315 = this.anIntArray487[this.anIntArray488[local161] - 65];
									this.anIntArray487[local313] = this.anIntArray487[this.anIntArray488[local161] - 65] + 1;
									local303[local315] = local468;
								}
							}
						}
						local49 = local49.aClass28_Sub2_9;
					}
					if (local428 >= 0) {
						arg0.method3844(arg0.aClass145_1.method3033(local428));
						arg0.method3798(arg0.anInterface7_8.method1170(local428).anInt7252);
					} else {
						arg0.method3844(null);
					}
					if (local430 && Static391.aFloat89 != arg0.aFloat57) {
						arg0.JA(Static391.aFloat89);
					} else if (arg0.aFloat57 != 1.0F) {
						arg0.JA(1.0F);
					}
					this.method4573(local41, arg0);
				}
			} else {
				local41 = 0;
				local43 = Integer.MAX_VALUE;
				@Pc(45) int local45 = 0;
				local49 = arg1.aClass96_1.aClass28_Sub2_3;
				@Pc(52) Class28_Sub2 local52;
				@Pc(84) int local84;
				for (local52 = local49.aClass28_Sub2_9; local52 != local49; local52 = local52.aClass28_Sub2_9) {
					@Pc(57) Class28_Sub2_Sub1 local57 = (Class28_Sub2_Sub1) local52;
					local84 = (int) ((float) (local57.anInt4538 >> 12) * local32 + (float) (local57.anInt4535 >> 12) * local21 + local17 * (float) (local57.anInt4530 >> 12) + local36);
					this.anIntArray486[local41++] = local84;
					if (local84 > local45) {
						local45 = local84;
					}
					if (local43 > local84) {
						local43 = local84;
					}
				}
				@Pc(115) int local115 = local45 - local43;
				if (local115 + 2 > 1600) {
					local84 = Static109.method1799(local115) + 1 - this.anInt5767;
					local115 = (local115 >> local84) + 2;
				} else {
					local84 = 0;
					local115 += 2;
				}
				local52 = local49.aClass28_Sub2_9;
				local41 = 0;
				local150 = -2;
				@Pc(152) boolean local152 = true;
				@Pc(154) boolean local154 = true;
				while (local52 != local49) {
					this.anInt5768 = 0;
					for (local161 = 0; local161 < local115; local161++) {
						this.anIntArray488[local161] = 0;
					}
					for (@Pc(178) int local178 = 0; local178 < 64; local178++) {
						this.anIntArray487[local178] = 0;
					}
					while (local49 != local52) {
						@Pc(194) Class28_Sub2_Sub1 local194 = (Class28_Sub2_Sub1) local52;
						if (local154) {
							local154 = false;
							local152 = local194.aBoolean327;
							local150 = local194.anInt4537;
						}
						if (local41 > 0 && (local194.anInt4537 != local150 || local194.aBoolean327 != local152)) {
							local154 = true;
							break;
						}
						@Pc(237) int local237 = this.anIntArray486[local41++] - local43 >> local84;
						if (local237 < 1600) {
							if (this.anIntArray488[local237] < 64) {
								this.aClass28_Sub2_Sub1ArrayArray1[local237][this.anIntArray488[local237]++] = local194;
							} else {
								label186: {
									if (this.anIntArray488[local237] == 64) {
										if (this.anInt5768 == 64) {
											break label186;
										}
										this.anIntArray488[local237] += this.anInt5768++ + 1;
									}
									local303 = this.aClass28_Sub2_Sub1ArrayArray2[this.anIntArray488[local237] - 65];
									local313 = this.anIntArray488[local237] - 64 - 1;
									local315 = this.anIntArray487[this.anIntArray488[local237] - 64 - 1];
									this.anIntArray487[local313] = this.anIntArray487[this.anIntArray488[local237] - 64 - 1] + 1;
									local303[local315] = local194;
								}
							}
						}
						local52 = local52.aClass28_Sub2_9;
					}
					if (local150 < 0) {
						arg0.method3844(null);
					} else {
						arg0.method3844(arg0.aClass145_1.method3033(local150));
						arg0.method3798(arg0.anInterface7_8.method1170(local150).anInt7252);
					}
					if (local152 && arg0.aFloat57 != Static391.aFloat89) {
						arg0.JA(Static391.aFloat89);
					} else if (arg0.aFloat57 != 1.0F) {
						arg0.JA(1.0F);
					}
					this.method4573(local115, arg0);
				}
			}
		} catch (@Pc(679) Exception local679) {
		}
		this.method4571(arg0);
	}
}
