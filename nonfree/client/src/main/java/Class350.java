import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class350 {

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "Lclient!nk;")
	private Interface17 anInterface17_7;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Lclient!dea;")
	private Class79 aClass79_13;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "Lclient!dea;")
	private Class79 aClass79_14;

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "Lclient!dea;")
	private Class79 aClass79_15;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "[F")
	private final float[] aFloatArray92 = new float[16];

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "Lclient!qca;")
	private final Class5_Sub41_Sub1 aClass5_Sub41_Sub1_3 = new Class5_Sub41_Sub1(786336);

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
	private final int anInt9792 = Static139.method2419(1600);

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "[I")
	private final int[] anIntArray541 = new int[1600];

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "[[Lclient!ia;")
	private final Class28_Sub3_Sub1[][] aClass28_Sub3_Sub1ArrayArray3 = new Class28_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
	private int anInt9793 = 0;

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "[[Lclient!ia;")
	private final Class28_Sub3_Sub1[][] aClass28_Sub3_Sub1ArrayArray4 = new Class28_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "[I")
	private final int[] anIntArray542 = new int[64];

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "[I")
	private final int[] anIntArray543 = new int[8191];

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ck;I)V")
	private void method8163(@OriginalArg(0) Class65_Sub1 arg0) {
		Static577.aFloat193 = arg0.aFloat13;
		arg0.method1261();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method1297(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ck;Z)V")
	public void method8164(@OriginalArg(0) Class65_Sub1 arg0) {
		this.anInterface17_7 = arg0.method1223((byte[]) null, true, 196584, 24);
		this.aClass79_15 = new Class79(this.anInterface17_7, 5126, 2, 0);
		this.aClass79_13 = new Class79(this.anInterface17_7, 5126, 3, 8);
		this.aClass79_14 = new Class79(this.anInterface17_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!ck;I)V")
	private void method8165(@OriginalArg(1) Class65_Sub1 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray92, 0);
		@Pc(15) float local15 = this.aFloatArray92[0];
		@Pc(20) float local20 = this.aFloatArray92[4];
		@Pc(25) float local25 = this.aFloatArray92[8];
		@Pc(30) float local30 = this.aFloatArray92[1];
		@Pc(35) float local35 = this.aFloatArray92[5];
		@Pc(40) float local40 = this.aFloatArray92[9];
		@Pc(44) float local44 = local30 + local15;
		@Pc(48) float local48 = local35 + local20;
		@Pc(52) float local52 = local40 + local25;
		@Pc(56) float local56 = local15 - local30;
		@Pc(61) float local61 = local20 - local35;
		@Pc(65) float local65 = local25 - local40;
		@Pc(69) float local69 = local30 - local15;
		@Pc(74) float local74 = local35 - local20;
		this.aClass5_Sub41_Sub1_3.anInt9230 = 0;
		@Pc(90) float local90 = local40 - local25;
		@Pc(97) int local97;
		@Pc(114) int local114;
		@Pc(123) int local123;
		@Pc(132) Class28_Sub3_Sub1 local132;
		@Pc(135) int local135;
		@Pc(140) byte local140;
		@Pc(145) byte local145;
		@Pc(148) byte local148;
		@Pc(153) byte local153;
		@Pc(159) float local159;
		@Pc(165) float local165;
		@Pc(171) float local171;
		@Pc(176) int local176;
		@Pc(503) float local503;
		@Pc(508) int local508;
		@Pc(448) int local448;
		@Pc(464) Class28_Sub3_Sub1 local464;
		@Pc(467) int local467;
		@Pc(480) byte local480;
		@Pc(485) byte local485;
		@Pc(497) float local497;
		if (arg0.aBoolean97) {
			for (local97 = arg1 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray541[local97] > 64 ? 64 : this.anIntArray541[local97];
				if (local114 > 0) {
					for (local123 = local114 - 1; local123 >= 0; local123--) {
						local132 = this.aClass28_Sub3_Sub1ArrayArray3[local97][local123];
						local135 = local132.anInt5585;
						local140 = (byte) (local135 >> 16);
						local145 = (byte) (local135 >> 8);
						local148 = (byte) local135;
						local153 = (byte) (local135 >>> 24);
						local159 = (float) (local132.anInt5581 >> 12);
						local165 = (float) (local132.anInt5584 >> 12);
						local171 = (float) (local132.anInt5579 >> 12);
						local176 = local132.anInt5586 >> 12;
						this.aClass5_Sub41_Sub1_3.method6771(0.0F);
						this.aClass5_Sub41_Sub1_3.method6771(0.0F);
						this.aClass5_Sub41_Sub1_3.method6771(local159 + local44 * (float) -local176);
						this.aClass5_Sub41_Sub1_3.method6771(local165 + (float) -local176 * local48);
						this.aClass5_Sub41_Sub1_3.method6771((float) -local176 * local52 + local171);
						this.aClass5_Sub41_Sub1_3.method7798(local140);
						this.aClass5_Sub41_Sub1_3.method7798(local145);
						this.aClass5_Sub41_Sub1_3.method7798(local148);
						this.aClass5_Sub41_Sub1_3.method7798(local153);
						this.aClass5_Sub41_Sub1_3.method6771(1.0F);
						this.aClass5_Sub41_Sub1_3.method6771(0.0F);
						this.aClass5_Sub41_Sub1_3.method6771(local159 + local56 * (float) local176);
						this.aClass5_Sub41_Sub1_3.method6771(local165 + (float) local176 * local61);
						this.aClass5_Sub41_Sub1_3.method6771((float) local176 * local65 + local171);
						this.aClass5_Sub41_Sub1_3.method7798(local140);
						this.aClass5_Sub41_Sub1_3.method7798(local145);
						this.aClass5_Sub41_Sub1_3.method7798(local148);
						this.aClass5_Sub41_Sub1_3.method7798(local153);
						this.aClass5_Sub41_Sub1_3.method6771(1.0F);
						this.aClass5_Sub41_Sub1_3.method6771(1.0F);
						this.aClass5_Sub41_Sub1_3.method6771((float) local176 * local44 + local159);
						this.aClass5_Sub41_Sub1_3.method6771((float) local176 * local48 + local165);
						this.aClass5_Sub41_Sub1_3.method6771(local52 * (float) local176 + local171);
						this.aClass5_Sub41_Sub1_3.method7798(local140);
						this.aClass5_Sub41_Sub1_3.method7798(local145);
						this.aClass5_Sub41_Sub1_3.method7798(local148);
						this.aClass5_Sub41_Sub1_3.method7798(local153);
						this.aClass5_Sub41_Sub1_3.method6771(0.0F);
						this.aClass5_Sub41_Sub1_3.method6771(1.0F);
						this.aClass5_Sub41_Sub1_3.method6771(local159 + (float) local176 * local69);
						this.aClass5_Sub41_Sub1_3.method6771(local165 + local74 * (float) local176);
						this.aClass5_Sub41_Sub1_3.method6771(local171 + local90 * (float) local176);
						this.aClass5_Sub41_Sub1_3.method7798(local140);
						this.aClass5_Sub41_Sub1_3.method7798(local145);
						this.aClass5_Sub41_Sub1_3.method7798(local148);
						this.aClass5_Sub41_Sub1_3.method7798(local153);
					}
					if (this.anIntArray541[local97] > 64) {
						local448 = this.anIntArray541[local97] - 64 - 1;
						for (local135 = this.anIntArray542[local448] - 1; local135 >= 0; local135--) {
							local464 = this.aClass28_Sub3_Sub1ArrayArray4[local448][local135];
							local467 = local464.anInt5585;
							local148 = (byte) (local467 >> 16);
							local153 = (byte) (local467 >> 8);
							local480 = (byte) local467;
							local485 = (byte) (local467 >>> 24);
							local171 = (float) (local464.anInt5581 >> 12);
							local497 = (float) (local464.anInt5584 >> 12);
							local503 = (float) (local464.anInt5579 >> 12);
							local508 = local464.anInt5586 >> 12;
							this.aClass5_Sub41_Sub1_3.method6771(0.0F);
							this.aClass5_Sub41_Sub1_3.method6771(0.0F);
							this.aClass5_Sub41_Sub1_3.method6771(local171 + (float) -local508 * local44);
							this.aClass5_Sub41_Sub1_3.method6771(local497 + local48 * (float) -local508);
							this.aClass5_Sub41_Sub1_3.method6771((float) -local508 * local52 + local503);
							this.aClass5_Sub41_Sub1_3.method7798(local148);
							this.aClass5_Sub41_Sub1_3.method7798(local153);
							this.aClass5_Sub41_Sub1_3.method7798(local480);
							this.aClass5_Sub41_Sub1_3.method7798(local485);
							this.aClass5_Sub41_Sub1_3.method6771(1.0F);
							this.aClass5_Sub41_Sub1_3.method6771(0.0F);
							this.aClass5_Sub41_Sub1_3.method6771(local56 * (float) local508 + local171);
							this.aClass5_Sub41_Sub1_3.method6771(local61 * (float) local508 + local497);
							this.aClass5_Sub41_Sub1_3.method6771(local503 + local65 * (float) local508);
							this.aClass5_Sub41_Sub1_3.method7798(local148);
							this.aClass5_Sub41_Sub1_3.method7798(local153);
							this.aClass5_Sub41_Sub1_3.method7798(local480);
							this.aClass5_Sub41_Sub1_3.method7798(local485);
							this.aClass5_Sub41_Sub1_3.method6771(1.0F);
							this.aClass5_Sub41_Sub1_3.method6771(1.0F);
							this.aClass5_Sub41_Sub1_3.method6771(local171 + (float) local508 * local44);
							this.aClass5_Sub41_Sub1_3.method6771(local497 + local48 * (float) local508);
							this.aClass5_Sub41_Sub1_3.method6771(local503 + local52 * (float) local508);
							this.aClass5_Sub41_Sub1_3.method7798(local148);
							this.aClass5_Sub41_Sub1_3.method7798(local153);
							this.aClass5_Sub41_Sub1_3.method7798(local480);
							this.aClass5_Sub41_Sub1_3.method7798(local485);
							this.aClass5_Sub41_Sub1_3.method6771(0.0F);
							this.aClass5_Sub41_Sub1_3.method6771(1.0F);
							this.aClass5_Sub41_Sub1_3.method6771(local171 + local69 * (float) local508);
							this.aClass5_Sub41_Sub1_3.method6771(local497 + (float) local508 * local74);
							this.aClass5_Sub41_Sub1_3.method6771((float) local508 * local90 + local503);
							this.aClass5_Sub41_Sub1_3.method7798(local148);
							this.aClass5_Sub41_Sub1_3.method7798(local153);
							this.aClass5_Sub41_Sub1_3.method7798(local480);
							this.aClass5_Sub41_Sub1_3.method7798(local485);
						}
					}
				}
			}
		} else {
			for (local97 = arg1 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray541[local97] <= 64 ? this.anIntArray541[local97] : 64;
				if (local114 > 0) {
					for (local123 = local114 - 1; local123 >= 0; local123--) {
						local132 = this.aClass28_Sub3_Sub1ArrayArray3[local97][local123];
						local135 = local132.anInt5585;
						local140 = (byte) (local135 >> 16);
						local145 = (byte) (local135 >> 8);
						local148 = (byte) local135;
						local153 = (byte) (local135 >>> 24);
						local159 = (float) (local132.anInt5581 >> 12);
						local165 = (float) (local132.anInt5584 >> 12);
						local171 = (float) (local132.anInt5579 >> 12);
						local176 = local132.anInt5586 >> 12;
						this.aClass5_Sub41_Sub1_3.method6768(0.0F);
						this.aClass5_Sub41_Sub1_3.method6768(0.0F);
						this.aClass5_Sub41_Sub1_3.method6768(local44 * (float) -local176 + local159);
						this.aClass5_Sub41_Sub1_3.method6768(local48 * (float) -local176 + local165);
						this.aClass5_Sub41_Sub1_3.method6768(local171 + local52 * (float) -local176);
						this.aClass5_Sub41_Sub1_3.method7798(local140);
						this.aClass5_Sub41_Sub1_3.method7798(local145);
						this.aClass5_Sub41_Sub1_3.method7798(local148);
						this.aClass5_Sub41_Sub1_3.method7798(local153);
						this.aClass5_Sub41_Sub1_3.method6768(1.0F);
						this.aClass5_Sub41_Sub1_3.method6768(0.0F);
						this.aClass5_Sub41_Sub1_3.method6768(local159 + (float) local176 * local56);
						this.aClass5_Sub41_Sub1_3.method6768(local165 + (float) local176 * local61);
						this.aClass5_Sub41_Sub1_3.method6768(local65 * (float) local176 + local171);
						this.aClass5_Sub41_Sub1_3.method7798(local140);
						this.aClass5_Sub41_Sub1_3.method7798(local145);
						this.aClass5_Sub41_Sub1_3.method7798(local148);
						this.aClass5_Sub41_Sub1_3.method7798(local153);
						this.aClass5_Sub41_Sub1_3.method6768(1.0F);
						this.aClass5_Sub41_Sub1_3.method6768(1.0F);
						this.aClass5_Sub41_Sub1_3.method6768(local159 + (float) local176 * local44);
						this.aClass5_Sub41_Sub1_3.method6768(local48 * (float) local176 + local165);
						this.aClass5_Sub41_Sub1_3.method6768((float) local176 * local52 + local171);
						this.aClass5_Sub41_Sub1_3.method7798(local140);
						this.aClass5_Sub41_Sub1_3.method7798(local145);
						this.aClass5_Sub41_Sub1_3.method7798(local148);
						this.aClass5_Sub41_Sub1_3.method7798(local153);
						this.aClass5_Sub41_Sub1_3.method6768(0.0F);
						this.aClass5_Sub41_Sub1_3.method6768(1.0F);
						this.aClass5_Sub41_Sub1_3.method6768(local69 * (float) local176 + local159);
						this.aClass5_Sub41_Sub1_3.method6768(local74 * (float) local176 + local165);
						this.aClass5_Sub41_Sub1_3.method6768(local90 * (float) local176 + local171);
						this.aClass5_Sub41_Sub1_3.method7798(local140);
						this.aClass5_Sub41_Sub1_3.method7798(local145);
						this.aClass5_Sub41_Sub1_3.method7798(local148);
						this.aClass5_Sub41_Sub1_3.method7798(local153);
					}
					if (this.anIntArray541[local97] > 64) {
						local448 = this.anIntArray541[local97] - 1 - 64;
						for (local135 = this.anIntArray542[local448] - 1; local135 >= 0; local135--) {
							local464 = this.aClass28_Sub3_Sub1ArrayArray4[local448][local135];
							local467 = local464.anInt5585;
							local148 = (byte) (local467 >> 16);
							local153 = (byte) (local467 >> 8);
							local480 = (byte) local467;
							local485 = (byte) (local467 >>> 24);
							local171 = (float) (local464.anInt5581 >> 12);
							local497 = (float) (local464.anInt5584 >> 12);
							local503 = (float) (local464.anInt5579 >> 12);
							local508 = local464.anInt5586 >> 12;
							this.aClass5_Sub41_Sub1_3.method6768(0.0F);
							this.aClass5_Sub41_Sub1_3.method6768(0.0F);
							this.aClass5_Sub41_Sub1_3.method6768((float) -local508 * local44 + local171);
							this.aClass5_Sub41_Sub1_3.method6768(local497 + (float) -local508 * local48);
							this.aClass5_Sub41_Sub1_3.method6768((float) -local508 * local52 + local503);
							this.aClass5_Sub41_Sub1_3.method7798(local148);
							this.aClass5_Sub41_Sub1_3.method7798(local153);
							this.aClass5_Sub41_Sub1_3.method7798(local480);
							this.aClass5_Sub41_Sub1_3.method7798(local485);
							this.aClass5_Sub41_Sub1_3.method6768(1.0F);
							this.aClass5_Sub41_Sub1_3.method6768(0.0F);
							this.aClass5_Sub41_Sub1_3.method6768((float) local508 * local56 + local171);
							this.aClass5_Sub41_Sub1_3.method6768(local61 * (float) local508 + local497);
							this.aClass5_Sub41_Sub1_3.method6768(local65 * (float) local508 + local503);
							this.aClass5_Sub41_Sub1_3.method7798(local148);
							this.aClass5_Sub41_Sub1_3.method7798(local153);
							this.aClass5_Sub41_Sub1_3.method7798(local480);
							this.aClass5_Sub41_Sub1_3.method7798(local485);
							this.aClass5_Sub41_Sub1_3.method6768(1.0F);
							this.aClass5_Sub41_Sub1_3.method6768(1.0F);
							this.aClass5_Sub41_Sub1_3.method6768(local171 + (float) local508 * local44);
							this.aClass5_Sub41_Sub1_3.method6768(local497 + local48 * (float) local508);
							this.aClass5_Sub41_Sub1_3.method6768(local52 * (float) local508 + local503);
							this.aClass5_Sub41_Sub1_3.method7798(local148);
							this.aClass5_Sub41_Sub1_3.method7798(local153);
							this.aClass5_Sub41_Sub1_3.method7798(local480);
							this.aClass5_Sub41_Sub1_3.method7798(local485);
							this.aClass5_Sub41_Sub1_3.method6768(0.0F);
							this.aClass5_Sub41_Sub1_3.method6768(1.0F);
							this.aClass5_Sub41_Sub1_3.method6768((float) local508 * local69 + local171);
							this.aClass5_Sub41_Sub1_3.method6768((float) local508 * local74 + local497);
							this.aClass5_Sub41_Sub1_3.method6768(local90 * (float) local508 + local503);
							this.aClass5_Sub41_Sub1_3.method7798(local148);
							this.aClass5_Sub41_Sub1_3.method7798(local153);
							this.aClass5_Sub41_Sub1_3.method7798(local480);
							this.aClass5_Sub41_Sub1_3.method7798(local485);
						}
					}
				}
			}
		}
		if (this.aClass5_Sub41_Sub1_3.anInt9230 != 0) {
			this.anInterface17_7.method6469(this.aClass5_Sub41_Sub1_3.aByteArray93, this.aClass5_Sub41_Sub1_3.anInt9230, 24);
			arg0.method1258(this.aClass79_13, this.aClass79_15, this.aClass79_14, (Class79) null);
			arg0.method1298(this.aClass5_Sub41_Sub1_3.anInt9230 / 24);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!ck;I)V")
	private void method8167(@OriginalArg(1) Class65_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static577.aFloat193 = arg0.aFloat13;
		arg0.method1279((float) arg1);
		arg0.method1220();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method1297(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ck;IBLclient!wq;)V")
	public void method8168(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class392 arg2) {
		if (arg0.bf == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method8167(arg0, arg1);
		} else {
			this.method8163(arg0);
		}
		@Pc(29) float local29 = arg0.bf.aFloat139;
		@Pc(33) float local33 = arg0.bf.aFloat141;
		@Pc(37) float local37 = arg0.bf.aFloat130;
		@Pc(41) float local41 = arg0.bf.aFloat132;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class28_Sub3 local51 = arg2.aClass307_1.aClass28_Sub3_7;
			@Pc(54) Class28_Sub3 local54;
			@Pc(86) int local86;
			for (local54 = local51.aClass28_Sub3_9; local54 != local51; local54 = local54.aClass28_Sub3_9) {
				@Pc(59) Class28_Sub3_Sub1 local59 = (Class28_Sub3_Sub1) local54;
				local86 = (int) ((float) (local59.anInt5579 >> 12) * local37 + (float) (local59.anInt5581 >> 12) * local29 + local33 * (float) (local59.anInt5584 >> 12) + local41);
				if (local86 < local45) {
					local45 = local86;
				}
				if (local47 < local86) {
					local47 = local86;
				}
				this.anIntArray543[local43++] = local86;
			}
			@Pc(121) int local121 = local47 - local45;
			if (local121 + 2 <= 1600) {
				local86 = 0;
				local121 += 2;
			} else {
				local86 = Static139.method2419(local121) + 1 - this.anInt9792;
				local121 = (local121 >> local86) + 2;
			}
			local43 = 0;
			local54 = local51.aClass28_Sub3_9;
			@Pc(155) int local155 = -2;
			@Pc(157) boolean local157 = true;
			@Pc(159) boolean local159 = true;
			while (local51 != local54) {
				this.anInt9793 = 0;
				for (@Pc(166) int local166 = 0; local166 < local121; local166++) {
					this.anIntArray541[local166] = 0;
				}
				for (@Pc(179) int local179 = 0; local179 < 64; local179++) {
					this.anIntArray542[local179] = 0;
				}
				while (local54 != local51) {
					@Pc(197) Class28_Sub3_Sub1 local197 = (Class28_Sub3_Sub1) local54;
					if (local159) {
						local157 = local197.aBoolean481;
						local155 = local197.anInt5580;
						local159 = false;
					}
					if (local43 > 0 && (local197.anInt5580 != local155 || local157 != local197.aBoolean481)) {
						local159 = true;
						break;
					}
					@Pc(243) int local243 = this.anIntArray543[local43++] - local45 >> local86;
					if (local243 < 1600) {
						if (this.anIntArray541[local243] < 64) {
							this.aClass28_Sub3_Sub1ArrayArray3[local243][this.anIntArray541[local243]++] = local197;
						} else {
							label106: {
								if (this.anIntArray541[local243] == 64) {
									if (this.anInt9793 == 64) {
										break label106;
									}
									this.anIntArray541[local243] += this.anInt9793++ + 1;
								}
								@Pc(316) Class28_Sub3_Sub1[] local316 = this.aClass28_Sub3_Sub1ArrayArray4[this.anIntArray541[local243] - 64 - 1];
								@Pc(326) int local326 = this.anIntArray541[local243] - 1 - 64;
								@Pc(328) int local328 = this.anIntArray542[this.anIntArray541[local243] - 1 - 64];
								this.anIntArray542[local326] = this.anIntArray542[this.anIntArray541[local243] - 1 - 64] + 1;
								local316[local328] = local197;
							}
						}
					}
					local54 = local54.aClass28_Sub3_9;
				}
				if (local155 < 0) {
					arg0.method1246(-1);
				} else {
					arg0.method1246(local155);
				}
				if (local157 && Static577.aFloat193 != arg0.aFloat13) {
					arg0.xa(Static577.aFloat193);
				} else if (arg0.aFloat13 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method8165(arg0, local121);
			}
		} catch (@Pc(385) Exception local385) {
		}
		this.method8169(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!ck;)V")
	private void method8169(@OriginalArg(1) Class65_Sub1 arg0) {
		arg0.method1297(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat13 != Static577.aFloat193) {
			arg0.xa(Static577.aFloat193);
		}
	}
}
