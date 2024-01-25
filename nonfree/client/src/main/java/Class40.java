import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class40 {

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "Lclient!pc;")
	private Class177 aClass177_1;

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "Lclient!pc;")
	private Class177 aClass177_2;

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "Lclient!pc;")
	private Class177 aClass177_3;

	@OriginalMember(owner = "client!cm", name = "q", descriptor = "Lclient!vd;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "[F")
	private final float[] aFloatArray4 = new float[16];

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "Lclient!hk;")
	private final Class4_Sub12_Sub2 aClass4_Sub12_Sub2_1 = new Class4_Sub12_Sub2(786336);

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
	private final int anInt997 = Static329.method4426(1600);

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "[I")
	private final int[] anIntArray57 = new int[64];

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "[[Lclient!wv;")
	private final Class3_Sub1_Sub1[][] aClass3_Sub1_Sub1ArrayArray1 = new Class3_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!cm", name = "v", descriptor = "[[Lclient!wv;")
	private final Class3_Sub1_Sub1[][] aClass3_Sub1_Sub1ArrayArray2 = new Class3_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!cm", name = "w", descriptor = "[I")
	private final int[] anIntArray59 = new int[8191];

	@OriginalMember(owner = "client!cm", name = "t", descriptor = "[I")
	private final int[] anIntArray58 = new int[1600];

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
	private int anInt998 = 0;

	static {
		new Class83("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!fd;II)V")
	private void method915(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray4, 0);
		@Pc(15) float local15 = this.aFloatArray4[0];
		@Pc(20) float local20 = this.aFloatArray4[4];
		@Pc(25) float local25 = this.aFloatArray4[8];
		@Pc(30) float local30 = this.aFloatArray4[1];
		@Pc(35) float local35 = this.aFloatArray4[5];
		@Pc(40) float local40 = this.aFloatArray4[9];
		@Pc(44) float local44 = local30 + local15;
		@Pc(48) float local48 = local20 + local35;
		@Pc(52) float local52 = local40 + local25;
		@Pc(57) float local57 = local15 - local30;
		@Pc(70) float local70 = local20 - local35;
		@Pc(75) float local75 = local25 - local40;
		@Pc(80) float local80 = local30 - local15;
		@Pc(85) float local85 = local35 - local20;
		this.aClass4_Sub12_Sub2_1.anInt2997 = 0;
		@Pc(94) float local94 = local40 - local25;
		@Pc(101) int local101;
		@Pc(116) int local116;
		@Pc(125) int local125;
		@Pc(134) Class3_Sub1_Sub1 local134;
		@Pc(137) int local137;
		@Pc(142) byte local142;
		@Pc(147) byte local147;
		@Pc(150) byte local150;
		@Pc(155) byte local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(173) float local173;
		@Pc(178) int local178;
		@Pc(497) float local497;
		@Pc(502) int local502;
		@Pc(442) int local442;
		@Pc(458) Class3_Sub1_Sub1 local458;
		@Pc(461) int local461;
		@Pc(474) byte local474;
		@Pc(479) byte local479;
		@Pc(491) float local491;
		if (arg0.aBoolean215) {
			for (local101 = arg1 - 1; local101 >= 0; local101--) {
				local116 = this.anIntArray58[local101] <= 64 ? this.anIntArray58[local101] : 64;
				if (local116 > 0) {
					for (local125 = local116 - 1; local125 >= 0; local125--) {
						local134 = this.aClass3_Sub1_Sub1ArrayArray1[local101][local125];
						local137 = local134.anInt4072;
						local142 = (byte) (local137 >> 16);
						local147 = (byte) (local137 >> 8);
						local150 = (byte) local137;
						local155 = (byte) (local137 >>> 24);
						local161 = local134.anInt4068 >> Static172.anInt3366;
						local167 = local134.anInt4076 >> Static172.anInt3366;
						local173 = local134.anInt4073 >> Static172.anInt3366;
						local178 = local134.anInt4069 >> Static172.anInt3366;
						this.aClass4_Sub12_Sub2_1.method2556(0.0F);
						this.aClass4_Sub12_Sub2_1.method2556(0.0F);
						this.aClass4_Sub12_Sub2_1.method2556(local161 + (float) -local178 * local44);
						this.aClass4_Sub12_Sub2_1.method2556((float) -local178 * local48 + local167);
						this.aClass4_Sub12_Sub2_1.method2556(local173 + local52 * (float) -local178);
						this.aClass4_Sub12_Sub2_1.method2551(local142);
						this.aClass4_Sub12_Sub2_1.method2551(local147);
						this.aClass4_Sub12_Sub2_1.method2551(local150);
						this.aClass4_Sub12_Sub2_1.method2551(local155);
						this.aClass4_Sub12_Sub2_1.method2556(1.0F);
						this.aClass4_Sub12_Sub2_1.method2556(0.0F);
						this.aClass4_Sub12_Sub2_1.method2556(local161 + local57 * (float) local178);
						this.aClass4_Sub12_Sub2_1.method2556(local167 + (float) local178 * local70);
						this.aClass4_Sub12_Sub2_1.method2556((float) local178 * local75 + local173);
						this.aClass4_Sub12_Sub2_1.method2551(local142);
						this.aClass4_Sub12_Sub2_1.method2551(local147);
						this.aClass4_Sub12_Sub2_1.method2551(local150);
						this.aClass4_Sub12_Sub2_1.method2551(local155);
						this.aClass4_Sub12_Sub2_1.method2556(1.0F);
						this.aClass4_Sub12_Sub2_1.method2556(1.0F);
						this.aClass4_Sub12_Sub2_1.method2556((float) local178 * local44 + local161);
						this.aClass4_Sub12_Sub2_1.method2556(local167 + (float) local178 * local48);
						this.aClass4_Sub12_Sub2_1.method2556((float) local178 * local52 + local173);
						this.aClass4_Sub12_Sub2_1.method2551(local142);
						this.aClass4_Sub12_Sub2_1.method2551(local147);
						this.aClass4_Sub12_Sub2_1.method2551(local150);
						this.aClass4_Sub12_Sub2_1.method2551(local155);
						this.aClass4_Sub12_Sub2_1.method2556(0.0F);
						this.aClass4_Sub12_Sub2_1.method2556(1.0F);
						this.aClass4_Sub12_Sub2_1.method2556(local161 + (float) local178 * local80);
						this.aClass4_Sub12_Sub2_1.method2556(local167 + (float) local178 * local85);
						this.aClass4_Sub12_Sub2_1.method2556(local173 + (float) local178 * local94);
						this.aClass4_Sub12_Sub2_1.method2551(local142);
						this.aClass4_Sub12_Sub2_1.method2551(local147);
						this.aClass4_Sub12_Sub2_1.method2551(local150);
						this.aClass4_Sub12_Sub2_1.method2551(local155);
					}
					if (this.anIntArray58[local101] > 64) {
						local442 = this.anIntArray58[local101] - 64 - 1;
						for (local137 = this.anIntArray57[local442] - 1; local137 >= 0; local137--) {
							local458 = this.aClass3_Sub1_Sub1ArrayArray2[local442][local137];
							local461 = local458.anInt4072;
							local150 = (byte) (local461 >> 16);
							local155 = (byte) (local461 >> 8);
							local474 = (byte) local461;
							local479 = (byte) (local461 >>> 24);
							local173 = local458.anInt4068 >> Static172.anInt3366;
							local491 = local458.anInt4076 >> Static172.anInt3366;
							local497 = local458.anInt4073 >> Static172.anInt3366;
							local502 = local458.anInt4069 >> Static172.anInt3366;
							this.aClass4_Sub12_Sub2_1.method2556(0.0F);
							this.aClass4_Sub12_Sub2_1.method2556(0.0F);
							this.aClass4_Sub12_Sub2_1.method2556(local44 * (float) -local502 + local173);
							this.aClass4_Sub12_Sub2_1.method2556(local491 + local48 * (float) -local502);
							this.aClass4_Sub12_Sub2_1.method2556((float) -local502 * local52 + local497);
							this.aClass4_Sub12_Sub2_1.method2551(local150);
							this.aClass4_Sub12_Sub2_1.method2551(local155);
							this.aClass4_Sub12_Sub2_1.method2551(local474);
							this.aClass4_Sub12_Sub2_1.method2551(local479);
							this.aClass4_Sub12_Sub2_1.method2556(1.0F);
							this.aClass4_Sub12_Sub2_1.method2556(0.0F);
							this.aClass4_Sub12_Sub2_1.method2556((float) local502 * local57 + local173);
							this.aClass4_Sub12_Sub2_1.method2556((float) local502 * local70 + local491);
							this.aClass4_Sub12_Sub2_1.method2556(local497 + (float) local502 * local75);
							this.aClass4_Sub12_Sub2_1.method2551(local150);
							this.aClass4_Sub12_Sub2_1.method2551(local155);
							this.aClass4_Sub12_Sub2_1.method2551(local474);
							this.aClass4_Sub12_Sub2_1.method2551(local479);
							this.aClass4_Sub12_Sub2_1.method2556(1.0F);
							this.aClass4_Sub12_Sub2_1.method2556(1.0F);
							this.aClass4_Sub12_Sub2_1.method2556(local44 * (float) local502 + local173);
							this.aClass4_Sub12_Sub2_1.method2556((float) local502 * local48 + local491);
							this.aClass4_Sub12_Sub2_1.method2556(local52 * (float) local502 + local497);
							this.aClass4_Sub12_Sub2_1.method2551(local150);
							this.aClass4_Sub12_Sub2_1.method2551(local155);
							this.aClass4_Sub12_Sub2_1.method2551(local474);
							this.aClass4_Sub12_Sub2_1.method2551(local479);
							this.aClass4_Sub12_Sub2_1.method2556(0.0F);
							this.aClass4_Sub12_Sub2_1.method2556(1.0F);
							this.aClass4_Sub12_Sub2_1.method2556(local173 + (float) local502 * local80);
							this.aClass4_Sub12_Sub2_1.method2556(local491 + (float) local502 * local85);
							this.aClass4_Sub12_Sub2_1.method2556(local497 + (float) local502 * local94);
							this.aClass4_Sub12_Sub2_1.method2551(local150);
							this.aClass4_Sub12_Sub2_1.method2551(local155);
							this.aClass4_Sub12_Sub2_1.method2551(local474);
							this.aClass4_Sub12_Sub2_1.method2551(local479);
						}
					}
				}
			}
		} else {
			for (local101 = arg1 - 1; local101 >= 0; local101--) {
				local116 = this.anIntArray58[local101] > 64 ? 64 : this.anIntArray58[local101];
				if (local116 > 0) {
					for (local125 = local116 - 1; local125 >= 0; local125--) {
						local134 = this.aClass3_Sub1_Sub1ArrayArray1[local101][local125];
						local137 = local134.anInt4072;
						local142 = (byte) (local137 >> 16);
						local147 = (byte) (local137 >> 8);
						local150 = (byte) local137;
						local155 = (byte) (local137 >>> 24);
						local161 = local134.anInt4068 >> Static172.anInt3366;
						local167 = local134.anInt4076 >> Static172.anInt3366;
						local173 = local134.anInt4073 >> Static172.anInt3366;
						local178 = local134.anInt4069 >> Static172.anInt3366;
						this.aClass4_Sub12_Sub2_1.method2552(0.0F);
						this.aClass4_Sub12_Sub2_1.method2552(0.0F);
						this.aClass4_Sub12_Sub2_1.method2552(local161 + (float) -local178 * local44);
						this.aClass4_Sub12_Sub2_1.method2552(local48 * (float) -local178 + local167);
						this.aClass4_Sub12_Sub2_1.method2552(local173 + local52 * (float) -local178);
						this.aClass4_Sub12_Sub2_1.method2551(local142);
						this.aClass4_Sub12_Sub2_1.method2551(local147);
						this.aClass4_Sub12_Sub2_1.method2551(local150);
						this.aClass4_Sub12_Sub2_1.method2551(local155);
						this.aClass4_Sub12_Sub2_1.method2552(1.0F);
						this.aClass4_Sub12_Sub2_1.method2552(0.0F);
						this.aClass4_Sub12_Sub2_1.method2552(local161 + (float) local178 * local57);
						this.aClass4_Sub12_Sub2_1.method2552(local70 * (float) local178 + local167);
						this.aClass4_Sub12_Sub2_1.method2552((float) local178 * local75 + local173);
						this.aClass4_Sub12_Sub2_1.method2551(local142);
						this.aClass4_Sub12_Sub2_1.method2551(local147);
						this.aClass4_Sub12_Sub2_1.method2551(local150);
						this.aClass4_Sub12_Sub2_1.method2551(local155);
						this.aClass4_Sub12_Sub2_1.method2552(1.0F);
						this.aClass4_Sub12_Sub2_1.method2552(1.0F);
						this.aClass4_Sub12_Sub2_1.method2552(local161 + (float) local178 * local44);
						this.aClass4_Sub12_Sub2_1.method2552((float) local178 * local48 + local167);
						this.aClass4_Sub12_Sub2_1.method2552(local173 + (float) local178 * local52);
						this.aClass4_Sub12_Sub2_1.method2551(local142);
						this.aClass4_Sub12_Sub2_1.method2551(local147);
						this.aClass4_Sub12_Sub2_1.method2551(local150);
						this.aClass4_Sub12_Sub2_1.method2551(local155);
						this.aClass4_Sub12_Sub2_1.method2552(0.0F);
						this.aClass4_Sub12_Sub2_1.method2552(1.0F);
						this.aClass4_Sub12_Sub2_1.method2552(local161 + (float) local178 * local80);
						this.aClass4_Sub12_Sub2_1.method2552(local85 * (float) local178 + local167);
						this.aClass4_Sub12_Sub2_1.method2552((float) local178 * local94 + local173);
						this.aClass4_Sub12_Sub2_1.method2551(local142);
						this.aClass4_Sub12_Sub2_1.method2551(local147);
						this.aClass4_Sub12_Sub2_1.method2551(local150);
						this.aClass4_Sub12_Sub2_1.method2551(local155);
					}
					if (this.anIntArray58[local101] > 64) {
						local442 = this.anIntArray58[local101] - 65;
						for (local137 = this.anIntArray57[local442] - 1; local137 >= 0; local137--) {
							local458 = this.aClass3_Sub1_Sub1ArrayArray2[local442][local137];
							local461 = local458.anInt4072;
							local150 = (byte) (local461 >> 16);
							local155 = (byte) (local461 >> 8);
							local474 = (byte) local461;
							local479 = (byte) (local461 >>> 24);
							local173 = local458.anInt4068 >> Static172.anInt3366;
							local491 = local458.anInt4076 >> Static172.anInt3366;
							local497 = local458.anInt4073 >> Static172.anInt3366;
							local502 = local458.anInt4069 >> Static172.anInt3366;
							this.aClass4_Sub12_Sub2_1.method2552(0.0F);
							this.aClass4_Sub12_Sub2_1.method2552(0.0F);
							this.aClass4_Sub12_Sub2_1.method2552(local173 + (float) -local502 * local44);
							this.aClass4_Sub12_Sub2_1.method2552(local491 + local48 * (float) -local502);
							this.aClass4_Sub12_Sub2_1.method2552((float) -local502 * local52 + local497);
							this.aClass4_Sub12_Sub2_1.method2551(local150);
							this.aClass4_Sub12_Sub2_1.method2551(local155);
							this.aClass4_Sub12_Sub2_1.method2551(local474);
							this.aClass4_Sub12_Sub2_1.method2551(local479);
							this.aClass4_Sub12_Sub2_1.method2552(1.0F);
							this.aClass4_Sub12_Sub2_1.method2552(0.0F);
							this.aClass4_Sub12_Sub2_1.method2552(local173 + local57 * (float) local502);
							this.aClass4_Sub12_Sub2_1.method2552(local491 + local70 * (float) local502);
							this.aClass4_Sub12_Sub2_1.method2552((float) local502 * local75 + local497);
							this.aClass4_Sub12_Sub2_1.method2551(local150);
							this.aClass4_Sub12_Sub2_1.method2551(local155);
							this.aClass4_Sub12_Sub2_1.method2551(local474);
							this.aClass4_Sub12_Sub2_1.method2551(local479);
							this.aClass4_Sub12_Sub2_1.method2552(1.0F);
							this.aClass4_Sub12_Sub2_1.method2552(1.0F);
							this.aClass4_Sub12_Sub2_1.method2552(local44 * (float) local502 + local173);
							this.aClass4_Sub12_Sub2_1.method2552(local491 + local48 * (float) local502);
							this.aClass4_Sub12_Sub2_1.method2552(local497 + local52 * (float) local502);
							this.aClass4_Sub12_Sub2_1.method2551(local150);
							this.aClass4_Sub12_Sub2_1.method2551(local155);
							this.aClass4_Sub12_Sub2_1.method2551(local474);
							this.aClass4_Sub12_Sub2_1.method2551(local479);
							this.aClass4_Sub12_Sub2_1.method2552(0.0F);
							this.aClass4_Sub12_Sub2_1.method2552(1.0F);
							this.aClass4_Sub12_Sub2_1.method2552((float) local502 * local80 + local173);
							this.aClass4_Sub12_Sub2_1.method2552((float) local502 * local85 + local491);
							this.aClass4_Sub12_Sub2_1.method2552(local497 + local94 * (float) local502);
							this.aClass4_Sub12_Sub2_1.method2551(local150);
							this.aClass4_Sub12_Sub2_1.method2551(local155);
							this.aClass4_Sub12_Sub2_1.method2551(local474);
							this.aClass4_Sub12_Sub2_1.method2551(local479);
						}
					}
				}
			}
		}
		if (this.aClass4_Sub12_Sub2_1.anInt2997 != 0) {
			this.anInterface11_1.method5184(this.aClass4_Sub12_Sub2_1.anInt2997, 24, this.aClass4_Sub12_Sub2_1.aByteArray36);
			arg0.method1934(this.aClass177_1, null, this.aClass177_3, this.aClass177_2);
			arg0.method1925(this.aClass4_Sub12_Sub2_1.anInt2997 / 24);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLclient!mc;Lclient!fd;)V")
	public void method916(@OriginalArg(1) Class146 arg0, @OriginalArg(2) Class19_Sub2 arg1) {
		if (arg1.aClass31_Sub1_4 == null) {
			return;
		}
		this.method920(arg1);
		@Pc(17) float local17 = arg1.aClass31_Sub1_4.aFloat206;
		@Pc(21) float local21 = arg1.aClass31_Sub1_4.aFloat203;
		@Pc(25) float local25 = arg1.aClass31_Sub1_4.aFloat199;
		@Pc(37) float local37 = arg1.aClass31_Sub1_4.aFloat198;
		try {
			@Pc(47) int local47;
			@Pc(57) int local57;
			@Pc(82) Class3_Sub1 local82;
			@Pc(95) int local95;
			@Pc(245) Class3_Sub1_Sub1[] local245;
			@Pc(188) int local188;
			@Pc(255) int local255;
			@Pc(257) int local257;
			if (arg0.aBoolean417) {
				local47 = arg0.anInt4515 - arg0.anInt4520;
				if (local47 + 2 <= 1600) {
					local47 += 2;
					local57 = 0;
				} else {
					local57 = Static329.method4426(local47) + 1 - this.anInt997;
					local47 = (local47 >> local57) + 2;
				}
				@Pc(79) Class3_Sub1 local79 = arg0.aClass232_1.aClass3_Sub1_7;
				local82 = local79.aClass3_Sub1_6;
				@Pc(84) int local84 = -2;
				@Pc(86) boolean local86 = true;
				@Pc(88) boolean local88 = true;
				while (local79 != local82) {
					this.anInt998 = 0;
					for (local95 = 0; local95 < local47; local95++) {
						this.anIntArray58[local95] = 0;
					}
					for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
						this.anIntArray57[local108] = 0;
					}
					while (local79 != local82) {
						@Pc(124) Class3_Sub1_Sub1 local124 = (Class3_Sub1_Sub1) local82;
						if (local88) {
							local84 = local124.anInt4077;
							local86 = local124.aBoolean375;
							local88 = false;
						} else if (local124.anInt4077 != local84 || local86 != local124.aBoolean375) {
							local88 = true;
							break;
						}
						local188 = (int) ((float) (local124.anInt4068 >> Static172.anInt3366) * local17 + (float) (local124.anInt4076 >> Static172.anInt3366) * local21 + (float) (local124.anInt4073 >> Static172.anInt3366) * local25 + local37) - arg0.anInt4520 >> local57;
						if (local188 < 1600) {
							if (this.anIntArray58[local188] >= 64) {
								label198: {
									if (this.anIntArray58[local188] == 64) {
										if (this.anInt998 == 64) {
											break label198;
										}
										this.anIntArray58[local188] += this.anInt998++ + 1;
									}
									local245 = this.aClass3_Sub1_Sub1ArrayArray2[this.anIntArray58[local188] - 64 - 1];
									local255 = this.anIntArray58[local188] - 1 - 64;
									local257 = this.anIntArray57[this.anIntArray58[local188] - 1 - 64];
									this.anIntArray57[local255] = this.anIntArray57[this.anIntArray58[local188] - 1 - 64] + 1;
									local245[local257] = local124;
								}
							} else {
								this.aClass3_Sub1_Sub1ArrayArray1[local188][this.anIntArray58[local188]++] = local124;
							}
						}
						local82 = local82.aClass3_Sub1_6;
					}
					if (local84 >= 0) {
						arg1.method1905(arg1.aClass59_1.method1549(local84));
						arg1.method1900(arg1.anInterface7_6.method2396(local84).anInt6934);
					} else {
						arg1.method1905(null);
					}
					if (local86 && arg1.aFloat70 != Static448.aFloat224) {
						arg1.B(Static448.aFloat224);
					} else if (arg1.aFloat70 != 1.0F) {
						arg1.B(1.0F);
					}
					this.method915(arg1, local47);
				}
			} else {
				local47 = 0;
				local57 = Integer.MAX_VALUE;
				@Pc(350) int local350 = 0;
				local82 = arg0.aClass232_1.aClass3_Sub1_7;
				@Pc(357) Class3_Sub1 local357;
				@Pc(389) int local389;
				for (local357 = local82.aClass3_Sub1_6; local357 != local82; local357 = local357.aClass3_Sub1_6) {
					@Pc(362) Class3_Sub1_Sub1 local362 = (Class3_Sub1_Sub1) local357;
					local389 = (int) (local37 + (float) (local362.anInt4068 >> Static172.anInt3366) * local17 + local21 * (float) (local362.anInt4076 >> Static172.anInt3366) + (float) (local362.anInt4073 >> Static172.anInt3366) * local25);
					this.anIntArray59[local47++] = local389;
					if (local57 > local389) {
						local57 = local389;
					}
					if (local350 < local389) {
						local350 = local389;
					}
				}
				@Pc(415) int local415 = local350 - local57;
				if (local415 + 2 <= 1600) {
					local415 += 2;
					local389 = 0;
				} else {
					local389 = Static329.method4426(local415) + 1 - this.anInt997;
					local415 = (local415 >> local389) + 2;
				}
				local47 = 0;
				local357 = local82.aClass3_Sub1_6;
				local95 = -2;
				@Pc(451) boolean local451 = true;
				@Pc(453) boolean local453 = true;
				while (local357 != local82) {
					this.anInt998 = 0;
					for (local188 = 0; local188 < local415; local188++) {
						this.anIntArray58[local188] = 0;
					}
					for (@Pc(473) int local473 = 0; local473 < 64; local473++) {
						this.anIntArray57[local473] = 0;
					}
					while (local357 != local82) {
						@Pc(489) Class3_Sub1_Sub1 local489 = (Class3_Sub1_Sub1) local357;
						if (local453) {
							local451 = local489.aBoolean375;
							local453 = false;
							local95 = local489.anInt4077;
						}
						if (local47 > 0 && (local95 != local489.anInt4077 || local451 != local489.aBoolean375)) {
							local453 = true;
							break;
						}
						@Pc(532) int local532 = this.anIntArray59[local47++] - local57 >> local389;
						if (local532 < 1600) {
							if (this.anIntArray58[local532] < 64) {
								this.aClass3_Sub1_Sub1ArrayArray1[local532][this.anIntArray58[local532]++] = local489;
							} else {
								label148: {
									if (this.anIntArray58[local532] == 64) {
										if (this.anInt998 == 64) {
											break label148;
										}
										this.anIntArray58[local532] += this.anInt998++ + 1;
									}
									local245 = this.aClass3_Sub1_Sub1ArrayArray2[this.anIntArray58[local532] - 65];
									local255 = this.anIntArray58[local532] - 64 - 1;
									local257 = this.anIntArray57[this.anIntArray58[local532] - 64 - 1];
									this.anIntArray57[local255] = this.anIntArray57[this.anIntArray58[local532] - 64 - 1] + 1;
									local245[local257] = local489;
								}
							}
						}
						local357 = local357.aClass3_Sub1_6;
					}
					if (local95 < 0) {
						arg1.method1905(null);
					} else {
						arg1.method1905(arg1.aClass59_1.method1549(local95));
						arg1.method1900(arg1.anInterface7_6.method2396(local95).anInt6934);
					}
					if (local451 && Static448.aFloat224 != arg1.aFloat70) {
						arg1.B(Static448.aFloat224);
					} else if (arg1.aFloat70 != 1.0F) {
						arg1.B(1.0F);
					}
					this.method915(arg1, local415);
				}
			}
		} catch (@Pc(681) Exception local681) {
		}
		this.method919(arg1);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLclient!fd;)V")
	public void method917(@OriginalArg(1) Class19_Sub2 arg0) {
		this.anInterface11_1 = arg0.method1960(196584, null, true, 24);
		this.aClass177_3 = new Class177(this.anInterface11_1, 5126, 2, 0);
		this.aClass177_2 = new Class177(this.anInterface11_1, 5126, 3, 8);
		this.aClass177_1 = new Class177(this.anInterface11_1, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!fd;)V")
	private void method919(@OriginalArg(1) Class19_Sub2 arg0) {
		arg0.method1911(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat70 != Static448.aFloat224) {
			arg0.B(Static448.aFloat224);
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(ILclient!fd;)V")
	private void method920(@OriginalArg(1) Class19_Sub2 arg0) {
		Static448.aFloat224 = arg0.aFloat70;
		arg0.method1904();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method1911(false);
		arg0.method1957(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
