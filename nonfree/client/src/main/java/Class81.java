import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class81 {

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "Lclient!gv;")
	private Class133 aClass133_1;

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "Lclient!gv;")
	private Class133 aClass133_2;

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "Lclient!gv;")
	private Class133 aClass133_3;

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "Lclient!fba;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!dt", name = "i", descriptor = "[F")
	private final float[] aFloatArray6 = new float[16];

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "Lclient!bca;")
	private final Class2_Sub7_Sub1 aClass2_Sub7_Sub1_1 = new Class2_Sub7_Sub1(786336);

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
	private final int anInt1820 = Static234.method3333(1600);

	@OriginalMember(owner = "client!dt", name = "q", descriptor = "[I")
	private final int[] anIntArray158 = new int[64];

	@OriginalMember(owner = "client!dt", name = "t", descriptor = "[I")
	private final int[] anIntArray160 = new int[8191];

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "[I")
	private final int[] anIntArray159 = new int[1600];

	@OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
	private int anInt1821 = 0;

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "[[Lclient!an;")
	private final Class12_Sub1_Sub1[][] aClass12_Sub1_Sub1ArrayArray1 = new Class12_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "[[Lclient!an;")
	private final Class12_Sub1_Sub1[][] aClass12_Sub1_Sub1ArrayArray2 = new Class12_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLclient!uca;)V")
	private void method1531(@OriginalArg(1) Class162_Sub3 arg0) {
		Static71.aFloat155 = arg0.aFloat225;
		arg0.method6932();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method6896(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!uo;ILclient!uca;)V")
	public void method1533(@OriginalArg(0) int arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(3) Class162_Sub3 arg2) {
		if (arg2.aClass25_Sub1_3 == null) {
			return;
		}
		if (arg0 >= 0) {
			this.method1537(arg0, arg2);
		} else {
			this.method1531(arg2);
		}
		@Pc(29) float local29 = arg2.aClass25_Sub1_3.aFloat13;
		@Pc(33) float local33 = arg2.aClass25_Sub1_3.aFloat18;
		@Pc(37) float local37 = arg2.aClass25_Sub1_3.aFloat19;
		@Pc(41) float local41 = arg2.aClass25_Sub1_3.aFloat22;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class12_Sub1 local51 = arg1.aClass77_1.aClass12_Sub1_5;
			@Pc(54) Class12_Sub1 local54;
			@Pc(86) int local86;
			for (local54 = local51.aClass12_Sub1_9; local54 != local51; local54 = local54.aClass12_Sub1_9) {
				@Pc(59) Class12_Sub1_Sub1 local59 = (Class12_Sub1_Sub1) local54;
				local86 = (int) ((float) (local59.anInt4848 >> 12) * local37 + local29 * (float) (local59.anInt4849 >> 12) + (float) (local59.anInt4843 >> 12) * local33 + local41);
				if (local47 < local86) {
					local47 = local86;
				}
				if (local86 < local45) {
					local45 = local86;
				}
				this.anIntArray160[local43++] = local86;
			}
			@Pc(117) int local117 = local47 - local45;
			if (local117 + 2 <= 1600) {
				local117 += 2;
				local86 = 0;
			} else {
				local86 = Static234.method3333(local117) + 1 - this.anInt1820;
				local117 = (local117 >> local86) + 2;
			}
			local54 = local51.aClass12_Sub1_9;
			local43 = 0;
			@Pc(153) int local153 = -2;
			@Pc(155) boolean local155 = true;
			@Pc(157) boolean local157 = true;
			while (local54 != local51) {
				this.anInt1821 = 0;
				for (@Pc(164) int local164 = 0; local164 < local117; local164++) {
					this.anIntArray159[local164] = 0;
				}
				for (@Pc(177) int local177 = 0; local177 < 64; local177++) {
					this.anIntArray158[local177] = 0;
				}
				while (local54 != local51) {
					@Pc(193) Class12_Sub1_Sub1 local193 = (Class12_Sub1_Sub1) local54;
					if (local157) {
						local157 = false;
						local155 = local193.aBoolean370;
						local153 = local193.anInt4847;
					}
					if (local43 > 0 && (local193.anInt4847 != local153 || local193.aBoolean370 != local155)) {
						local157 = true;
						break;
					}
					@Pc(232) int local232 = this.anIntArray160[local43++] - local45 >> local86;
					if (local232 < 1600) {
						if (this.anIntArray159[local232] < 64) {
							this.aClass12_Sub1_Sub1ArrayArray1[local232][this.anIntArray159[local232]++] = local193;
						} else {
							label102: {
								if (this.anIntArray159[local232] == 64) {
									if (this.anInt1821 == 64) {
										break label102;
									}
									this.anIntArray159[local232] += this.anInt1821++ + 1;
								}
								@Pc(301) Class12_Sub1_Sub1[] local301 = this.aClass12_Sub1_Sub1ArrayArray2[this.anIntArray159[local232] - 64 - 1];
								@Pc(311) int local311 = this.anIntArray159[local232] - 1 - 64;
								@Pc(313) int local313 = this.anIntArray158[this.anIntArray159[local232] - 1 - 64];
								this.anIntArray158[local311] = this.anIntArray158[this.anIntArray159[local232] - 1 - 64] + 1;
								local301[local313] = local193;
							}
						}
					}
					local54 = local54.aClass12_Sub1_9;
				}
				if (local153 < 0) {
					arg2.method6963(-1);
				} else {
					arg2.method6963(local153);
				}
				if (local155 && arg2.aFloat225 != Static71.aFloat155) {
					arg2.ra(Static71.aFloat155);
				} else if (arg2.aFloat225 != 1.0F) {
					arg2.ra(1.0F);
				}
				this.method1536(arg2, local117);
			}
		} catch (@Pc(372) Exception local372) {
		}
		this.method1535(arg2);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!uca;)V")
	private void method1535(@OriginalArg(1) Class162_Sub3 arg0) {
		arg0.method6896(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat225 != Static71.aFloat155) {
			arg0.ra(Static71.aFloat155);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!uca;II)V")
	private void method1536(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray6, 0);
		@Pc(15) float local15 = this.aFloatArray6[0];
		@Pc(20) float local20 = this.aFloatArray6[4];
		@Pc(25) float local25 = this.aFloatArray6[8];
		@Pc(30) float local30 = this.aFloatArray6[1];
		@Pc(35) float local35 = this.aFloatArray6[5];
		@Pc(40) float local40 = this.aFloatArray6[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local35 + local20;
		@Pc(52) float local52 = local25 + local40;
		@Pc(56) float local56 = local15 - local30;
		@Pc(61) float local61 = local20 - local35;
		@Pc(71) float local71 = local25 - local40;
		@Pc(75) float local75 = local30 - local15;
		@Pc(79) float local79 = local35 - local20;
		this.aClass2_Sub7_Sub1_1.anInt5186 = 0;
		@Pc(87) float local87 = local40 - local25;
		@Pc(94) int local94;
		@Pc(111) int local111;
		@Pc(117) int local117;
		@Pc(126) Class12_Sub1_Sub1 local126;
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
		@Pc(452) Class12_Sub1_Sub1 local452;
		@Pc(455) int local455;
		@Pc(468) byte local468;
		@Pc(473) byte local473;
		@Pc(485) float local485;
		if (arg0.aBoolean720) {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local111 = this.anIntArray159[local94] > 64 ? 64 : this.anIntArray159[local94];
				if (local111 > 0) {
					for (local117 = local111 - 1; local117 >= 0; local117--) {
						local126 = this.aClass12_Sub1_Sub1ArrayArray1[local94][local117];
						local129 = local126.anInt4841;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = local126.anInt4849 >> 12;
						local159 = local126.anInt4843 >> 12;
						local165 = local126.anInt4848 >> 12;
						local170 = local126.anInt4846 >> 12;
						this.aClass2_Sub7_Sub1_1.method546(0.0F);
						this.aClass2_Sub7_Sub1_1.method546(0.0F);
						this.aClass2_Sub7_Sub1_1.method546((float) -local170 * local44 + local153);
						this.aClass2_Sub7_Sub1_1.method546(local159 + (float) -local170 * local48);
						this.aClass2_Sub7_Sub1_1.method546(local165 + (float) -local170 * local52);
						this.aClass2_Sub7_Sub1_1.method4459(local134);
						this.aClass2_Sub7_Sub1_1.method4459(local139);
						this.aClass2_Sub7_Sub1_1.method4459(local142);
						this.aClass2_Sub7_Sub1_1.method4459(local147);
						this.aClass2_Sub7_Sub1_1.method546(1.0F);
						this.aClass2_Sub7_Sub1_1.method546(0.0F);
						this.aClass2_Sub7_Sub1_1.method546(local153 + local56 * (float) local170);
						this.aClass2_Sub7_Sub1_1.method546(local159 + (float) local170 * local61);
						this.aClass2_Sub7_Sub1_1.method546(local71 * (float) local170 + local165);
						this.aClass2_Sub7_Sub1_1.method4459(local134);
						this.aClass2_Sub7_Sub1_1.method4459(local139);
						this.aClass2_Sub7_Sub1_1.method4459(local142);
						this.aClass2_Sub7_Sub1_1.method4459(local147);
						this.aClass2_Sub7_Sub1_1.method546(1.0F);
						this.aClass2_Sub7_Sub1_1.method546(1.0F);
						this.aClass2_Sub7_Sub1_1.method546(local153 + (float) local170 * local44);
						this.aClass2_Sub7_Sub1_1.method546((float) local170 * local48 + local159);
						this.aClass2_Sub7_Sub1_1.method546(local52 * (float) local170 + local165);
						this.aClass2_Sub7_Sub1_1.method4459(local134);
						this.aClass2_Sub7_Sub1_1.method4459(local139);
						this.aClass2_Sub7_Sub1_1.method4459(local142);
						this.aClass2_Sub7_Sub1_1.method4459(local147);
						this.aClass2_Sub7_Sub1_1.method546(0.0F);
						this.aClass2_Sub7_Sub1_1.method546(1.0F);
						this.aClass2_Sub7_Sub1_1.method546(local153 + (float) local170 * local75);
						this.aClass2_Sub7_Sub1_1.method546(local79 * (float) local170 + local159);
						this.aClass2_Sub7_Sub1_1.method546(local165 + (float) local170 * local87);
						this.aClass2_Sub7_Sub1_1.method4459(local134);
						this.aClass2_Sub7_Sub1_1.method4459(local139);
						this.aClass2_Sub7_Sub1_1.method4459(local142);
						this.aClass2_Sub7_Sub1_1.method4459(local147);
					}
					if (this.anIntArray159[local94] > 64) {
						local436 = this.anIntArray159[local94] - 64 - 1;
						for (local129 = this.anIntArray158[local436] - 1; local129 >= 0; local129--) {
							local452 = this.aClass12_Sub1_Sub1ArrayArray2[local436][local129];
							local455 = local452.anInt4841;
							local142 = (byte) (local455 >> 16);
							local147 = (byte) (local455 >> 8);
							local468 = (byte) local455;
							local473 = (byte) (local455 >>> 24);
							local165 = local452.anInt4849 >> 12;
							local485 = local452.anInt4843 >> 12;
							local491 = local452.anInt4848 >> 12;
							local496 = local452.anInt4846 >> 12;
							this.aClass2_Sub7_Sub1_1.method546(0.0F);
							this.aClass2_Sub7_Sub1_1.method546(0.0F);
							this.aClass2_Sub7_Sub1_1.method546(local165 + local44 * (float) -local496);
							this.aClass2_Sub7_Sub1_1.method546(local48 * (float) -local496 + local485);
							this.aClass2_Sub7_Sub1_1.method546(local491 + local52 * (float) -local496);
							this.aClass2_Sub7_Sub1_1.method4459(local142);
							this.aClass2_Sub7_Sub1_1.method4459(local147);
							this.aClass2_Sub7_Sub1_1.method4459(local468);
							this.aClass2_Sub7_Sub1_1.method4459(local473);
							this.aClass2_Sub7_Sub1_1.method546(1.0F);
							this.aClass2_Sub7_Sub1_1.method546(0.0F);
							this.aClass2_Sub7_Sub1_1.method546(local56 * (float) local496 + local165);
							this.aClass2_Sub7_Sub1_1.method546(local485 + (float) local496 * local61);
							this.aClass2_Sub7_Sub1_1.method546((float) local496 * local71 + local491);
							this.aClass2_Sub7_Sub1_1.method4459(local142);
							this.aClass2_Sub7_Sub1_1.method4459(local147);
							this.aClass2_Sub7_Sub1_1.method4459(local468);
							this.aClass2_Sub7_Sub1_1.method4459(local473);
							this.aClass2_Sub7_Sub1_1.method546(1.0F);
							this.aClass2_Sub7_Sub1_1.method546(1.0F);
							this.aClass2_Sub7_Sub1_1.method546(local44 * (float) local496 + local165);
							this.aClass2_Sub7_Sub1_1.method546(local485 + (float) local496 * local48);
							this.aClass2_Sub7_Sub1_1.method546(local491 + (float) local496 * local52);
							this.aClass2_Sub7_Sub1_1.method4459(local142);
							this.aClass2_Sub7_Sub1_1.method4459(local147);
							this.aClass2_Sub7_Sub1_1.method4459(local468);
							this.aClass2_Sub7_Sub1_1.method4459(local473);
							this.aClass2_Sub7_Sub1_1.method546(0.0F);
							this.aClass2_Sub7_Sub1_1.method546(1.0F);
							this.aClass2_Sub7_Sub1_1.method546(local165 + (float) local496 * local75);
							this.aClass2_Sub7_Sub1_1.method546((float) local496 * local79 + local485);
							this.aClass2_Sub7_Sub1_1.method546(local491 + (float) local496 * local87);
							this.aClass2_Sub7_Sub1_1.method4459(local142);
							this.aClass2_Sub7_Sub1_1.method4459(local147);
							this.aClass2_Sub7_Sub1_1.method4459(local468);
							this.aClass2_Sub7_Sub1_1.method4459(local473);
						}
					}
				}
			}
		} else {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local111 = this.anIntArray159[local94] <= 64 ? this.anIntArray159[local94] : 64;
				if (local111 > 0) {
					for (local117 = local111 - 1; local117 >= 0; local117--) {
						local126 = this.aClass12_Sub1_Sub1ArrayArray1[local94][local117];
						local129 = local126.anInt4841;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = local126.anInt4849 >> 12;
						local159 = local126.anInt4843 >> 12;
						local165 = local126.anInt4848 >> 12;
						local170 = local126.anInt4846 >> 12;
						this.aClass2_Sub7_Sub1_1.method545(0.0F);
						this.aClass2_Sub7_Sub1_1.method545(0.0F);
						this.aClass2_Sub7_Sub1_1.method545((float) -local170 * local44 + local153);
						this.aClass2_Sub7_Sub1_1.method545(local48 * (float) -local170 + local159);
						this.aClass2_Sub7_Sub1_1.method545((float) -local170 * local52 + local165);
						this.aClass2_Sub7_Sub1_1.method4459(local134);
						this.aClass2_Sub7_Sub1_1.method4459(local139);
						this.aClass2_Sub7_Sub1_1.method4459(local142);
						this.aClass2_Sub7_Sub1_1.method4459(local147);
						this.aClass2_Sub7_Sub1_1.method545(1.0F);
						this.aClass2_Sub7_Sub1_1.method545(0.0F);
						this.aClass2_Sub7_Sub1_1.method545(local153 + (float) local170 * local56);
						this.aClass2_Sub7_Sub1_1.method545(local61 * (float) local170 + local159);
						this.aClass2_Sub7_Sub1_1.method545((float) local170 * local71 + local165);
						this.aClass2_Sub7_Sub1_1.method4459(local134);
						this.aClass2_Sub7_Sub1_1.method4459(local139);
						this.aClass2_Sub7_Sub1_1.method4459(local142);
						this.aClass2_Sub7_Sub1_1.method4459(local147);
						this.aClass2_Sub7_Sub1_1.method545(1.0F);
						this.aClass2_Sub7_Sub1_1.method545(1.0F);
						this.aClass2_Sub7_Sub1_1.method545(local153 + local44 * (float) local170);
						this.aClass2_Sub7_Sub1_1.method545(local159 + local48 * (float) local170);
						this.aClass2_Sub7_Sub1_1.method545(local165 + local52 * (float) local170);
						this.aClass2_Sub7_Sub1_1.method4459(local134);
						this.aClass2_Sub7_Sub1_1.method4459(local139);
						this.aClass2_Sub7_Sub1_1.method4459(local142);
						this.aClass2_Sub7_Sub1_1.method4459(local147);
						this.aClass2_Sub7_Sub1_1.method545(0.0F);
						this.aClass2_Sub7_Sub1_1.method545(1.0F);
						this.aClass2_Sub7_Sub1_1.method545((float) local170 * local75 + local153);
						this.aClass2_Sub7_Sub1_1.method545(local159 + local79 * (float) local170);
						this.aClass2_Sub7_Sub1_1.method545(local87 * (float) local170 + local165);
						this.aClass2_Sub7_Sub1_1.method4459(local134);
						this.aClass2_Sub7_Sub1_1.method4459(local139);
						this.aClass2_Sub7_Sub1_1.method4459(local142);
						this.aClass2_Sub7_Sub1_1.method4459(local147);
					}
					if (this.anIntArray159[local94] > 64) {
						local436 = this.anIntArray159[local94] - 64 - 1;
						for (local129 = this.anIntArray158[local436] - 1; local129 >= 0; local129--) {
							local452 = this.aClass12_Sub1_Sub1ArrayArray2[local436][local129];
							local455 = local452.anInt4841;
							local142 = (byte) (local455 >> 16);
							local147 = (byte) (local455 >> 8);
							local468 = (byte) local455;
							local473 = (byte) (local455 >>> 24);
							local165 = local452.anInt4849 >> 12;
							local485 = local452.anInt4843 >> 12;
							local491 = local452.anInt4848 >> 12;
							local496 = local452.anInt4846 >> 12;
							this.aClass2_Sub7_Sub1_1.method545(0.0F);
							this.aClass2_Sub7_Sub1_1.method545(0.0F);
							this.aClass2_Sub7_Sub1_1.method545(local165 + (float) -local496 * local44);
							this.aClass2_Sub7_Sub1_1.method545(local485 + local48 * (float) -local496);
							this.aClass2_Sub7_Sub1_1.method545(local491 + local52 * (float) -local496);
							this.aClass2_Sub7_Sub1_1.method4459(local142);
							this.aClass2_Sub7_Sub1_1.method4459(local147);
							this.aClass2_Sub7_Sub1_1.method4459(local468);
							this.aClass2_Sub7_Sub1_1.method4459(local473);
							this.aClass2_Sub7_Sub1_1.method545(1.0F);
							this.aClass2_Sub7_Sub1_1.method545(0.0F);
							this.aClass2_Sub7_Sub1_1.method545(local165 + (float) local496 * local56);
							this.aClass2_Sub7_Sub1_1.method545(local61 * (float) local496 + local485);
							this.aClass2_Sub7_Sub1_1.method545(local491 + local71 * (float) local496);
							this.aClass2_Sub7_Sub1_1.method4459(local142);
							this.aClass2_Sub7_Sub1_1.method4459(local147);
							this.aClass2_Sub7_Sub1_1.method4459(local468);
							this.aClass2_Sub7_Sub1_1.method4459(local473);
							this.aClass2_Sub7_Sub1_1.method545(1.0F);
							this.aClass2_Sub7_Sub1_1.method545(1.0F);
							this.aClass2_Sub7_Sub1_1.method545(local165 + local44 * (float) local496);
							this.aClass2_Sub7_Sub1_1.method545((float) local496 * local48 + local485);
							this.aClass2_Sub7_Sub1_1.method545(local52 * (float) local496 + local491);
							this.aClass2_Sub7_Sub1_1.method4459(local142);
							this.aClass2_Sub7_Sub1_1.method4459(local147);
							this.aClass2_Sub7_Sub1_1.method4459(local468);
							this.aClass2_Sub7_Sub1_1.method4459(local473);
							this.aClass2_Sub7_Sub1_1.method545(0.0F);
							this.aClass2_Sub7_Sub1_1.method545(1.0F);
							this.aClass2_Sub7_Sub1_1.method545(local165 + (float) local496 * local75);
							this.aClass2_Sub7_Sub1_1.method545((float) local496 * local79 + local485);
							this.aClass2_Sub7_Sub1_1.method545(local491 + (float) local496 * local87);
							this.aClass2_Sub7_Sub1_1.method4459(local142);
							this.aClass2_Sub7_Sub1_1.method4459(local147);
							this.aClass2_Sub7_Sub1_1.method4459(local468);
							this.aClass2_Sub7_Sub1_1.method4459(local473);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub7_Sub1_1.anInt5186 != 0) {
			this.anInterface10_1.method2292(24, this.aClass2_Sub7_Sub1_1.aByteArray52, this.aClass2_Sub7_Sub1_1.anInt5186);
			arg0.method6916(this.aClass133_3, null, this.aClass133_1, this.aClass133_2);
			arg0.method6956(this.aClass2_Sub7_Sub1_1.anInt5186 / 24);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!uca;I)V")
	private void method1537(@OriginalArg(0) int arg0, @OriginalArg(1) Class162_Sub3 arg1) {
		Static71.aFloat155 = arg1.aFloat225;
		arg1.method6893((float) arg0);
		arg1.method6914();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method6896(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZLclient!uca;)V")
	public void method1538(@OriginalArg(1) Class162_Sub3 arg0) {
		this.anInterface10_1 = arg0.method6955(24, null, 196584, true);
		this.aClass133_3 = new Class133(this.anInterface10_1, 5126, 2, 0);
		this.aClass133_2 = new Class133(this.anInterface10_1, 5126, 3, 8);
		this.aClass133_1 = new Class133(this.anInterface10_1, 5121, 4, 20);
	}
}
