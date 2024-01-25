import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class262 {

	@OriginalMember(owner = "client!ot", name = "q", descriptor = "Lclient!ls;")
	private Class214 aClass214_6;

	@OriginalMember(owner = "client!ot", name = "r", descriptor = "Lclient!ls;")
	private Class214 aClass214_7;

	@OriginalMember(owner = "client!ot", name = "s", descriptor = "Lclient!vn;")
	private Interface26 anInterface26_3;

	@OriginalMember(owner = "client!ot", name = "t", descriptor = "Lclient!ls;")
	private Class214 aClass214_8;

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "[F")
	private final float[] aFloatArray39 = new float[16];

	@OriginalMember(owner = "client!ot", name = "o", descriptor = "Lclient!un;")
	private final Class6_Sub23_Sub2 aClass6_Sub23_Sub2_1 = new Class6_Sub23_Sub2(786336);

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
	private final int anInt7414 = Static503.method6621(1600);

	@OriginalMember(owner = "client!ot", name = "v", descriptor = "[I")
	private final int[] anIntArray490 = new int[8191];

	@OriginalMember(owner = "client!ot", name = "u", descriptor = "[[Lclient!lg;")
	private final Class2_Sub6_Sub1[][] aClass2_Sub6_Sub1ArrayArray1 = new Class2_Sub6_Sub1[1600][64];

	@OriginalMember(owner = "client!ot", name = "y", descriptor = "[I")
	private final int[] anIntArray492 = new int[1600];

	@OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
	private int anInt7415 = 0;

	@OriginalMember(owner = "client!ot", name = "x", descriptor = "[I")
	private final int[] anIntArray491 = new int[64];

	@OriginalMember(owner = "client!ot", name = "z", descriptor = "[[Lclient!lg;")
	private final Class2_Sub6_Sub1[][] aClass2_Sub6_Sub1ArrayArray2 = new Class2_Sub6_Sub1[64][768];

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!pq;B)V")
	private void method6404(@OriginalArg(0) Class132_Sub3 arg0) {
		arg0.method6787(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static464.aFloat152 != arg0.aFloat143) {
			arg0.xa(Static464.aFloat152);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BILclient!pq;)V")
	private void method6406(@OriginalArg(1) int arg0, @OriginalArg(2) Class132_Sub3 arg1) {
		Static464.aFloat152 = arg1.aFloat143;
		arg1.method6736((float) arg0);
		arg1.method6749();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method6787(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!pq;ILclient!hda;I)V")
	public void method6409(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(2) Class137 arg1, @OriginalArg(3) int arg2) {
		if (arg0.aClass207_Sub1_3 == null) {
			return;
		}
		if (arg2 < 0) {
			this.method6411(arg0);
		} else {
			this.method6406(arg2, arg0);
		}
		@Pc(29) float local29 = arg0.aClass207_Sub1_3.aFloat58;
		@Pc(33) float local33 = arg0.aClass207_Sub1_3.aFloat65;
		@Pc(37) float local37 = arg0.aClass207_Sub1_3.aFloat62;
		@Pc(41) float local41 = arg0.aClass207_Sub1_3.aFloat66;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class2_Sub6 local51 = arg1.aClass333_1.aClass2_Sub6_9;
			@Pc(54) Class2_Sub6 local54;
			@Pc(86) int local86;
			for (local54 = local51.aClass2_Sub6_8; local54 != local51; local54 = local54.aClass2_Sub6_8) {
				@Pc(59) Class2_Sub6_Sub1 local59 = (Class2_Sub6_Sub1) local54;
				local86 = (int) ((float) (local59.anInt2694 >> 12) * local37 + local29 * (float) (local59.anInt2695 >> 12) + local33 * (float) (local59.anInt2698 >> 12) + local41);
				if (local86 > local47) {
					local47 = local86;
				}
				if (local45 > local86) {
					local45 = local86;
				}
				this.anIntArray490[local43++] = local86;
			}
			@Pc(116) int local116 = local47 - local45;
			if (local116 + 2 > 1600) {
				local86 = Static503.method6621(local116) + 1 - this.anInt7414;
				local116 = (local116 >> local86) + 2;
			} else {
				local116 += 2;
				local86 = 0;
			}
			local43 = 0;
			local54 = local51.aClass2_Sub6_8;
			@Pc(149) int local149 = -2;
			@Pc(151) boolean local151 = true;
			@Pc(153) boolean local153 = true;
			while (local54 != local51) {
				this.anInt7415 = 0;
				for (@Pc(160) int local160 = 0; local160 < local116; local160++) {
					this.anIntArray492[local160] = 0;
				}
				for (@Pc(173) int local173 = 0; local173 < 64; local173++) {
					this.anIntArray491[local173] = 0;
				}
				while (local51 != local54) {
					@Pc(191) Class2_Sub6_Sub1 local191 = (Class2_Sub6_Sub1) local54;
					if (local153) {
						local149 = local191.anInt2693;
						local153 = false;
						local151 = local191.aBoolean168;
					}
					if (local43 > 0 && (local191.anInt2693 != local149 || local151 != local191.aBoolean168)) {
						local153 = true;
						break;
					}
					@Pc(236) int local236 = this.anIntArray490[local43++] - local45 >> local86;
					if (local236 < 1600) {
						if (this.anIntArray492[local236] >= 64) {
							label106: {
								if (this.anIntArray492[local236] == 64) {
									if (this.anInt7415 == 64) {
										break label106;
									}
									this.anIntArray492[local236] += this.anInt7415++ + 1;
								}
								@Pc(289) Class2_Sub6_Sub1[] local289 = this.aClass2_Sub6_Sub1ArrayArray2[this.anIntArray492[local236] - 64 - 1];
								@Pc(299) int local299 = this.anIntArray492[local236] - 64 - 1;
								@Pc(301) int local301 = this.anIntArray491[this.anIntArray492[local236] - 64 - 1];
								this.anIntArray491[local299] = this.anIntArray491[this.anIntArray492[local236] - 64 - 1] + 1;
								local289[local301] = local191;
							}
						} else {
							this.aClass2_Sub6_Sub1ArrayArray1[local236][this.anIntArray492[local236]++] = local191;
						}
					}
					local54 = local54.aClass2_Sub6_8;
				}
				if (local149 < 0) {
					arg0.method6772(-1);
				} else {
					arg0.method6772(local149);
				}
				if (local151 && arg0.aFloat143 != Static464.aFloat152) {
					arg0.xa(Static464.aFloat152);
				} else if (arg0.aFloat143 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method6410(arg0, local116);
			}
		} catch (@Pc(377) Exception local377) {
		}
		this.method6404(arg0);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!pq;IB)V")
	private void method6410(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray39, 0);
		@Pc(15) float local15 = this.aFloatArray39[0];
		@Pc(20) float local20 = this.aFloatArray39[4];
		@Pc(25) float local25 = this.aFloatArray39[8];
		@Pc(30) float local30 = this.aFloatArray39[1];
		@Pc(35) float local35 = this.aFloatArray39[5];
		@Pc(40) float local40 = this.aFloatArray39[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local35 + local20;
		@Pc(52) float local52 = local25 + local40;
		@Pc(56) float local56 = local15 - local30;
		@Pc(61) float local61 = local20 - local35;
		@Pc(65) float local65 = local25 - local40;
		@Pc(70) float local70 = local30 - local15;
		@Pc(74) float local74 = local35 - local20;
		this.aClass6_Sub23_Sub2_1.anInt9901 = 0;
		@Pc(82) float local82 = local40 - local25;
		@Pc(89) int local89;
		@Pc(106) int local106;
		@Pc(115) int local115;
		@Pc(124) Class2_Sub6_Sub1 local124;
		@Pc(127) int local127;
		@Pc(132) byte local132;
		@Pc(137) byte local137;
		@Pc(140) byte local140;
		@Pc(145) byte local145;
		@Pc(151) float local151;
		@Pc(157) float local157;
		@Pc(163) float local163;
		@Pc(168) int local168;
		@Pc(498) float local498;
		@Pc(503) int local503;
		@Pc(443) int local443;
		@Pc(459) Class2_Sub6_Sub1 local459;
		@Pc(462) int local462;
		@Pc(475) byte local475;
		@Pc(480) byte local480;
		@Pc(492) float local492;
		if (arg0.aBoolean544) {
			for (local89 = arg1 - 1; local89 >= 0; local89--) {
				local106 = this.anIntArray492[local89] <= 64 ? this.anIntArray492[local89] : 64;
				if (local106 > 0) {
					for (local115 = local106 - 1; local115 >= 0; local115--) {
						local124 = this.aClass2_Sub6_Sub1ArrayArray1[local89][local115];
						local127 = local124.anInt2699;
						local132 = (byte) (local127 >> 16);
						local137 = (byte) (local127 >> 8);
						local140 = (byte) local127;
						local145 = (byte) (local127 >>> 24);
						local151 = (float) (local124.anInt2695 >> 12);
						local157 = (float) (local124.anInt2698 >> 12);
						local163 = (float) (local124.anInt2694 >> 12);
						local168 = local124.anInt2692 >> 12;
						this.aClass6_Sub23_Sub2_1.method8407(0.0F);
						this.aClass6_Sub23_Sub2_1.method8407(0.0F);
						this.aClass6_Sub23_Sub2_1.method8407(local151 + local44 * (float) -local168);
						this.aClass6_Sub23_Sub2_1.method8407(local157 + (float) -local168 * local48);
						this.aClass6_Sub23_Sub2_1.method8407(local163 + local52 * (float) -local168);
						this.aClass6_Sub23_Sub2_1.method8366(local132);
						this.aClass6_Sub23_Sub2_1.method8366(local137);
						this.aClass6_Sub23_Sub2_1.method8366(local140);
						this.aClass6_Sub23_Sub2_1.method8366(local145);
						this.aClass6_Sub23_Sub2_1.method8407(1.0F);
						this.aClass6_Sub23_Sub2_1.method8407(0.0F);
						this.aClass6_Sub23_Sub2_1.method8407(local151 + (float) local168 * local56);
						this.aClass6_Sub23_Sub2_1.method8407((float) local168 * local61 + local157);
						this.aClass6_Sub23_Sub2_1.method8407((float) local168 * local65 + local163);
						this.aClass6_Sub23_Sub2_1.method8366(local132);
						this.aClass6_Sub23_Sub2_1.method8366(local137);
						this.aClass6_Sub23_Sub2_1.method8366(local140);
						this.aClass6_Sub23_Sub2_1.method8366(local145);
						this.aClass6_Sub23_Sub2_1.method8407(1.0F);
						this.aClass6_Sub23_Sub2_1.method8407(1.0F);
						this.aClass6_Sub23_Sub2_1.method8407(local151 + local44 * (float) local168);
						this.aClass6_Sub23_Sub2_1.method8407(local48 * (float) local168 + local157);
						this.aClass6_Sub23_Sub2_1.method8407(local163 + local52 * (float) local168);
						this.aClass6_Sub23_Sub2_1.method8366(local132);
						this.aClass6_Sub23_Sub2_1.method8366(local137);
						this.aClass6_Sub23_Sub2_1.method8366(local140);
						this.aClass6_Sub23_Sub2_1.method8366(local145);
						this.aClass6_Sub23_Sub2_1.method8407(0.0F);
						this.aClass6_Sub23_Sub2_1.method8407(1.0F);
						this.aClass6_Sub23_Sub2_1.method8407(local151 + local70 * (float) local168);
						this.aClass6_Sub23_Sub2_1.method8407(local157 + (float) local168 * local74);
						this.aClass6_Sub23_Sub2_1.method8407(local82 * (float) local168 + local163);
						this.aClass6_Sub23_Sub2_1.method8366(local132);
						this.aClass6_Sub23_Sub2_1.method8366(local137);
						this.aClass6_Sub23_Sub2_1.method8366(local140);
						this.aClass6_Sub23_Sub2_1.method8366(local145);
					}
					if (this.anIntArray492[local89] > 64) {
						local443 = this.anIntArray492[local89] - 64 - 1;
						for (local127 = this.anIntArray491[local443] - 1; local127 >= 0; local127--) {
							local459 = this.aClass2_Sub6_Sub1ArrayArray2[local443][local127];
							local462 = local459.anInt2699;
							local140 = (byte) (local462 >> 16);
							local145 = (byte) (local462 >> 8);
							local475 = (byte) local462;
							local480 = (byte) (local462 >>> 24);
							local163 = (float) (local459.anInt2695 >> 12);
							local492 = (float) (local459.anInt2698 >> 12);
							local498 = (float) (local459.anInt2694 >> 12);
							local503 = local459.anInt2692 >> 12;
							this.aClass6_Sub23_Sub2_1.method8407(0.0F);
							this.aClass6_Sub23_Sub2_1.method8407(0.0F);
							this.aClass6_Sub23_Sub2_1.method8407(local163 + (float) -local503 * local44);
							this.aClass6_Sub23_Sub2_1.method8407((float) -local503 * local48 + local492);
							this.aClass6_Sub23_Sub2_1.method8407(local498 + (float) -local503 * local52);
							this.aClass6_Sub23_Sub2_1.method8366(local140);
							this.aClass6_Sub23_Sub2_1.method8366(local145);
							this.aClass6_Sub23_Sub2_1.method8366(local475);
							this.aClass6_Sub23_Sub2_1.method8366(local480);
							this.aClass6_Sub23_Sub2_1.method8407(1.0F);
							this.aClass6_Sub23_Sub2_1.method8407(0.0F);
							this.aClass6_Sub23_Sub2_1.method8407(local163 + local56 * (float) local503);
							this.aClass6_Sub23_Sub2_1.method8407((float) local503 * local61 + local492);
							this.aClass6_Sub23_Sub2_1.method8407(local498 + local65 * (float) local503);
							this.aClass6_Sub23_Sub2_1.method8366(local140);
							this.aClass6_Sub23_Sub2_1.method8366(local145);
							this.aClass6_Sub23_Sub2_1.method8366(local475);
							this.aClass6_Sub23_Sub2_1.method8366(local480);
							this.aClass6_Sub23_Sub2_1.method8407(1.0F);
							this.aClass6_Sub23_Sub2_1.method8407(1.0F);
							this.aClass6_Sub23_Sub2_1.method8407(local44 * (float) local503 + local163);
							this.aClass6_Sub23_Sub2_1.method8407((float) local503 * local48 + local492);
							this.aClass6_Sub23_Sub2_1.method8407(local498 + local52 * (float) local503);
							this.aClass6_Sub23_Sub2_1.method8366(local140);
							this.aClass6_Sub23_Sub2_1.method8366(local145);
							this.aClass6_Sub23_Sub2_1.method8366(local475);
							this.aClass6_Sub23_Sub2_1.method8366(local480);
							this.aClass6_Sub23_Sub2_1.method8407(0.0F);
							this.aClass6_Sub23_Sub2_1.method8407(1.0F);
							this.aClass6_Sub23_Sub2_1.method8407(local163 + (float) local503 * local70);
							this.aClass6_Sub23_Sub2_1.method8407(local74 * (float) local503 + local492);
							this.aClass6_Sub23_Sub2_1.method8407(local498 + local82 * (float) local503);
							this.aClass6_Sub23_Sub2_1.method8366(local140);
							this.aClass6_Sub23_Sub2_1.method8366(local145);
							this.aClass6_Sub23_Sub2_1.method8366(local475);
							this.aClass6_Sub23_Sub2_1.method8366(local480);
						}
					}
				}
			}
		} else {
			for (local89 = arg1 - 1; local89 >= 0; local89--) {
				local106 = this.anIntArray492[local89] > 64 ? 64 : this.anIntArray492[local89];
				if (local106 > 0) {
					for (local115 = local106 - 1; local115 >= 0; local115--) {
						local124 = this.aClass2_Sub6_Sub1ArrayArray1[local89][local115];
						local127 = local124.anInt2699;
						local132 = (byte) (local127 >> 16);
						local137 = (byte) (local127 >> 8);
						local140 = (byte) local127;
						local145 = (byte) (local127 >>> 24);
						local151 = (float) (local124.anInt2695 >> 12);
						local157 = (float) (local124.anInt2698 >> 12);
						local163 = (float) (local124.anInt2694 >> 12);
						local168 = local124.anInt2692 >> 12;
						this.aClass6_Sub23_Sub2_1.method8406(0.0F);
						this.aClass6_Sub23_Sub2_1.method8406(0.0F);
						this.aClass6_Sub23_Sub2_1.method8406(local44 * (float) -local168 + local151);
						this.aClass6_Sub23_Sub2_1.method8406(local157 + (float) -local168 * local48);
						this.aClass6_Sub23_Sub2_1.method8406(local163 + (float) -local168 * local52);
						this.aClass6_Sub23_Sub2_1.method8366(local132);
						this.aClass6_Sub23_Sub2_1.method8366(local137);
						this.aClass6_Sub23_Sub2_1.method8366(local140);
						this.aClass6_Sub23_Sub2_1.method8366(local145);
						this.aClass6_Sub23_Sub2_1.method8406(1.0F);
						this.aClass6_Sub23_Sub2_1.method8406(0.0F);
						this.aClass6_Sub23_Sub2_1.method8406(local151 + (float) local168 * local56);
						this.aClass6_Sub23_Sub2_1.method8406(local157 + (float) local168 * local61);
						this.aClass6_Sub23_Sub2_1.method8406((float) local168 * local65 + local163);
						this.aClass6_Sub23_Sub2_1.method8366(local132);
						this.aClass6_Sub23_Sub2_1.method8366(local137);
						this.aClass6_Sub23_Sub2_1.method8366(local140);
						this.aClass6_Sub23_Sub2_1.method8366(local145);
						this.aClass6_Sub23_Sub2_1.method8406(1.0F);
						this.aClass6_Sub23_Sub2_1.method8406(1.0F);
						this.aClass6_Sub23_Sub2_1.method8406((float) local168 * local44 + local151);
						this.aClass6_Sub23_Sub2_1.method8406(local157 + local48 * (float) local168);
						this.aClass6_Sub23_Sub2_1.method8406(local163 + local52 * (float) local168);
						this.aClass6_Sub23_Sub2_1.method8366(local132);
						this.aClass6_Sub23_Sub2_1.method8366(local137);
						this.aClass6_Sub23_Sub2_1.method8366(local140);
						this.aClass6_Sub23_Sub2_1.method8366(local145);
						this.aClass6_Sub23_Sub2_1.method8406(0.0F);
						this.aClass6_Sub23_Sub2_1.method8406(1.0F);
						this.aClass6_Sub23_Sub2_1.method8406(local70 * (float) local168 + local151);
						this.aClass6_Sub23_Sub2_1.method8406((float) local168 * local74 + local157);
						this.aClass6_Sub23_Sub2_1.method8406(local82 * (float) local168 + local163);
						this.aClass6_Sub23_Sub2_1.method8366(local132);
						this.aClass6_Sub23_Sub2_1.method8366(local137);
						this.aClass6_Sub23_Sub2_1.method8366(local140);
						this.aClass6_Sub23_Sub2_1.method8366(local145);
					}
					if (this.anIntArray492[local89] > 64) {
						local443 = this.anIntArray492[local89] - 64 - 1;
						for (local127 = this.anIntArray491[local443] - 1; local127 >= 0; local127--) {
							local459 = this.aClass2_Sub6_Sub1ArrayArray2[local443][local127];
							local462 = local459.anInt2699;
							local140 = (byte) (local462 >> 16);
							local145 = (byte) (local462 >> 8);
							local475 = (byte) local462;
							local480 = (byte) (local462 >>> 24);
							local163 = (float) (local459.anInt2695 >> 12);
							local492 = (float) (local459.anInt2698 >> 12);
							local498 = (float) (local459.anInt2694 >> 12);
							local503 = local459.anInt2692 >> 12;
							this.aClass6_Sub23_Sub2_1.method8406(0.0F);
							this.aClass6_Sub23_Sub2_1.method8406(0.0F);
							this.aClass6_Sub23_Sub2_1.method8406(local163 + (float) -local503 * local44);
							this.aClass6_Sub23_Sub2_1.method8406(local48 * (float) -local503 + local492);
							this.aClass6_Sub23_Sub2_1.method8406(local498 + local52 * (float) -local503);
							this.aClass6_Sub23_Sub2_1.method8366(local140);
							this.aClass6_Sub23_Sub2_1.method8366(local145);
							this.aClass6_Sub23_Sub2_1.method8366(local475);
							this.aClass6_Sub23_Sub2_1.method8366(local480);
							this.aClass6_Sub23_Sub2_1.method8406(1.0F);
							this.aClass6_Sub23_Sub2_1.method8406(0.0F);
							this.aClass6_Sub23_Sub2_1.method8406((float) local503 * local56 + local163);
							this.aClass6_Sub23_Sub2_1.method8406(local61 * (float) local503 + local492);
							this.aClass6_Sub23_Sub2_1.method8406(local65 * (float) local503 + local498);
							this.aClass6_Sub23_Sub2_1.method8366(local140);
							this.aClass6_Sub23_Sub2_1.method8366(local145);
							this.aClass6_Sub23_Sub2_1.method8366(local475);
							this.aClass6_Sub23_Sub2_1.method8366(local480);
							this.aClass6_Sub23_Sub2_1.method8406(1.0F);
							this.aClass6_Sub23_Sub2_1.method8406(1.0F);
							this.aClass6_Sub23_Sub2_1.method8406(local163 + (float) local503 * local44);
							this.aClass6_Sub23_Sub2_1.method8406(local48 * (float) local503 + local492);
							this.aClass6_Sub23_Sub2_1.method8406(local52 * (float) local503 + local498);
							this.aClass6_Sub23_Sub2_1.method8366(local140);
							this.aClass6_Sub23_Sub2_1.method8366(local145);
							this.aClass6_Sub23_Sub2_1.method8366(local475);
							this.aClass6_Sub23_Sub2_1.method8366(local480);
							this.aClass6_Sub23_Sub2_1.method8406(0.0F);
							this.aClass6_Sub23_Sub2_1.method8406(1.0F);
							this.aClass6_Sub23_Sub2_1.method8406((float) local503 * local70 + local163);
							this.aClass6_Sub23_Sub2_1.method8406((float) local503 * local74 + local492);
							this.aClass6_Sub23_Sub2_1.method8406(local82 * (float) local503 + local498);
							this.aClass6_Sub23_Sub2_1.method8366(local140);
							this.aClass6_Sub23_Sub2_1.method8366(local145);
							this.aClass6_Sub23_Sub2_1.method8366(local475);
							this.aClass6_Sub23_Sub2_1.method8366(local480);
						}
					}
				}
			}
		}
		if (this.aClass6_Sub23_Sub2_1.anInt9901 != 0) {
			this.anInterface26_3.method3632(this.aClass6_Sub23_Sub2_1.anInt9901, 24, this.aClass6_Sub23_Sub2_1.aByteArray101);
			arg0.method6788(this.aClass214_7, this.aClass214_8, this.aClass214_6, (Class214) null);
			arg0.method6780(this.aClass6_Sub23_Sub2_1.anInt9901 / 24);
		}
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(Lclient!pq;B)V")
	private void method6411(@OriginalArg(0) Class132_Sub3 arg0) {
		Static464.aFloat152 = arg0.aFloat143;
		arg0.method6777();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method6787(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLclient!pq;)V")
	public void method6412(@OriginalArg(1) Class132_Sub3 arg0) {
		this.anInterface26_3 = arg0.method6806(24, 196584, true, (byte[]) null);
		this.aClass214_8 = new Class214(this.anInterface26_3, 5126, 2, 0);
		this.aClass214_7 = new Class214(this.anInterface26_3, 5126, 3, 8);
		this.aClass214_6 = new Class214(this.anInterface26_3, 5121, 4, 20);
	}
}
