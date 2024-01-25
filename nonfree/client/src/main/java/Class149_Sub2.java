import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class149_Sub2 extends Class149 {

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
	private int anInt6742;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	private int anInt6744;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "[[Lclient!lg;")
	private Class138[][] aClass138ArrayArray1;

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
	private int anInt6745;

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
	private int anInt6746;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
	private int anInt6747;

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "[[Lclient!kj;")
	private Class127[][] aClass127ArrayArray1;

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
	private int anInt6748;

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "[[Lclient!ip;")
	private Class109[][] aClass109ArrayArray1;

	@OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
	private int anInt6751;

	@OriginalMember(owner = "client!vh", name = "w", descriptor = "[[Lclient!mh;")
	private Class148[][] aClass148ArrayArray1;

	@OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
	private int anInt6752;

	@OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
	private int anInt6753;

	@OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
	private int anInt6754;

	@OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
	private int anInt6755;

	@OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
	private int anInt6756;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "Lclient!d;")
	private final Class48_Sub1 aClass48_Sub1_10;

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
	private final int anInt6750;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "[[I")
	public final int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
	private final int anInt6743;

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
	private int anInt6749;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "[[B")
	private byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!vh", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!d;IIII[[I[[II)V")
	public Class149_Sub2(@OriginalArg(0) Class48_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass48_Sub1_10 = arg0;
		this.anInt6750 = arg2;
		this.anIntArrayArray62 = arg5;
		this.anInt6743 = arg7;
		this.anInt6749 = 0;
		while (arg7 > 1) {
			this.anInt6749++;
			arg7 >>= 0x1;
		}
		this.aByteArrayArray21 = new byte[arg3 + 1][arg4 + 1];
		@Pc(47) int local47 = this.aClass48_Sub1_10.anInt1323 >> 9;
		for (@Pc(49) int local49 = 1; local49 < arg4; local49++) {
			for (@Pc(52) int local52 = 1; local52 < arg3; local52++) {
				@Pc(71) int local71 = arg6[local52 + 1][local49] - arg6[local52 - 1][local49];
				@Pc(87) int local87 = arg6[local52][local49 + 1] - arg6[local52][local49 - 1];
				@Pc(100) int local100 = (int) Math.sqrt((double) (local71 * local71 + local87 * local87 + 65536));
				@Pc(106) int local106 = (local71 << 8) / local100;
				@Pc(110) int local110 = -65536 / local100;
				@Pc(116) int local116 = (local87 << 8) / local100;
				@Pc(138) int local138 = local47 + (this.aClass48_Sub1_10.anInt1333 * local106 + this.aClass48_Sub1_10.anInt1325 * local110 + this.aClass48_Sub1_10.anInt1339 * local116 >> 17);
				local138 >>= 0x1;
				if (local138 < 2) {
					local138 = 2;
				} else if (local138 > 126) {
					local138 = 126;
				}
				this.aByteArrayArray21[local52][local49] = (byte) local138;
			}
		}
		this.aByteArrayArray22 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!hq;[I)V")
	@Override
	public void method5830(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(Lclient!ph;IIIIZ)Z")
	@Override
	public boolean method5841(@OriginalArg(0) Class2_Sub7_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "()V")
	@Override
	public void method5836() {
		this.aByteArrayArray21 = null;
		this.aByteArrayArray22 = null;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIZLclient!it;[I[I[I)V")
	private void method5846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class111 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class138 local6 = this.aClass138ArrayArray1[arg0][arg1];
		@Pc(29) int local29;
		@Pc(255) int local255;
		@Pc(311) int local311;
		@Pc(367) int local367;
		@Pc(423) int local423;
		@Pc(283) int local283;
		@Pc(339) int local339;
		@Pc(395) int local395;
		@Pc(451) int local451;
		@Pc(244) int local244;
		@Pc(300) int local300;
		@Pc(356) int local356;
		@Pc(412) int local412;
		@Pc(272) int local272;
		@Pc(328) int local328;
		@Pc(384) int local384;
		@Pc(440) int local440;
		@Pc(78) int local78;
		@Pc(101) int local101;
		@Pc(124) int local124;
		@Pc(147) int local147;
		@Pc(36) int local36;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(42) int local42;
		@Pc(163) int local163;
		@Pc(56) int local56;
		@Pc(61) int local61;
		@Pc(222) int local222;
		@Pc(227) int local227;
		@Pc(616) int local616;
		if (local6 == null) {
			@Pc(1426) Class148 local1426 = this.aClass148ArrayArray1[arg0][arg1];
			if (local1426 != null) {
				for (local423 = 0; local423 < local1426.aShort53; local423++) {
					@Pc(1436) short local1436 = local1426.aShortArray60[local423];
					local29 = local1426.aShortArray56[local423];
					@Pc(1446) short local1446 = local1426.aShortArray55[local423];
					local367 = this.anInt6748 + (this.anInt6753 * local1436 + this.anInt6747 * local29 + this.anInt6746 * local1446 >> 15);
					if (local367 <= this.aClass48_Sub1_10.anInt1337) {
						return;
					}
					arg6[local423] = 0;
					if (arg2) {
						local283 = local367 - this.aClass48_Sub1_10.anInt1331;
						if (local283 > 255) {
							local283 = 255;
						}
						if (local283 > 0) {
							arg6[local423] = local283;
							local339 = local1426.aShortArray58[local423] * local283 / 255;
							if (local339 > 0) {
								local29 -= local339;
							}
						}
					} else if (this.aClass48_Sub1_10.aBoolean108) {
						local283 = local367 - this.aClass48_Sub1_10.anInt1331;
						if (local283 > 0) {
							arg6[local423] = local283;
							if (arg6[local423] > 255) {
								arg6[local423] = 255;
							}
						}
					}
					local255 = this.anInt6754 + (this.anInt6756 * local1436 + this.anInt6752 * local29 + this.anInt6742 * local1446 >> 15);
					local311 = this.anInt6755 + (this.anInt6751 * local1436 + this.anInt6745 * local29 + this.anInt6744 * local1446 >> 15);
					arg4[local423] = arg3.anInt3228 + local255 * this.aClass48_Sub1_10.anInt1317 / local367;
					arg5[local423] = arg3.anInt3225 + local311 * this.aClass48_Sub1_10.anInt1338 / local367;
				}
				if (local1426.aShortArray57 != null) {
					local283 = this.anIntArrayArray62[arg0][arg1];
					local339 = this.anIntArrayArray62[arg0 + 1][arg1];
					local395 = this.anIntArrayArray62[arg0][arg1 + 1];
					local451 = arg0 * this.anInt6743;
					local244 = local451 + this.anInt6743;
					local300 = arg1 * this.anInt6743;
					local356 = local300 + this.anInt6743;
					local412 = this.anInt6754 + (this.anInt6756 * local451 + this.anInt6752 * local283 + this.anInt6742 * local300 >> 15);
					local272 = this.anInt6755 + (this.anInt6751 * local451 + this.anInt6745 * local283 + this.anInt6744 * local300 >> 15);
					local328 = this.anInt6748 + (this.anInt6753 * local451 + this.anInt6747 * local283 + this.anInt6746 * local300 >> 15);
					local384 = this.anInt6754 + (this.anInt6756 * local244 + this.anInt6752 * local339 + this.anInt6742 * local300 >> 15);
					local440 = this.anInt6755 + (this.anInt6751 * local244 + this.anInt6745 * local339 + this.anInt6744 * local300 >> 15);
					local78 = this.anInt6748 + (this.anInt6753 * local244 + this.anInt6747 * local339 + this.anInt6746 * local300 >> 15);
					local101 = this.anInt6754 + (this.anInt6756 * local451 + this.anInt6752 * local395 + this.anInt6742 * local356 >> 15);
					local124 = this.anInt6755 + (this.anInt6751 * local451 + this.anInt6745 * local395 + this.anInt6744 * local356 >> 15);
					local147 = this.anInt6748 + (this.anInt6753 * local451 + this.anInt6747 * local395 + this.anInt6746 * local356 >> 15);
					for (local36 = 0; local36 < local1426.aShort52; local36++) {
						local38 = local36 * 3;
						local40 = local38 + 1;
						local42 = local40 + 1;
						local163 = arg4[local38];
						local56 = arg4[local40];
						local61 = arg4[local42];
						local222 = arg5[local38];
						local227 = arg5[local40];
						local616 = arg5[local42];
						@Pc(1886) int local1886 = arg6[local38] + arg6[local40] + arg6[local42];
						if ((local163 - local56) * (local616 - local227) - (local222 - local227) * (local61 - local56) > 0) {
							arg3.aBoolean246 = local163 < 0 || local56 < 0 || local61 < 0 || local163 > arg3.anInt3227 || local56 > arg3.anInt3227 || local61 > arg3.anInt3227;
							@Pc(1930) short local1930 = local1426.aShortArray57[local36];
							if (local1886 < 765) {
								if (local1930 != -1 && this.method5850(this.aClass48_Sub1_10.anInterface3_4.method1278(local1930).aByte37)) {
									arg3.anInt3223 = 100;
								}
								if (local1886 > 0) {
									if (local1930 != -1) {
										arg3.method2748(local222, local227, local616, local163, local56, local61, this.aClass48_Sub1_10.anInt1332, arg6[local38], arg6[local40], arg6[local42], local1426.anIntArray310[local38], local1426.anIntArray310[local40], local1426.anIntArray310[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1930);
									} else if ((local1426.anIntArray310[local38] & 0xFFFFFF) != 0) {
										arg3.method2761(local222, local227, local616, local163, local56, local61, Static110.method2007(local1426.anIntArray310[local38], arg6[local38] << 24 | this.aClass48_Sub1_10.anInt1332), Static110.method2007(local1426.anIntArray310[local40], arg6[local40] << 24 | this.aClass48_Sub1_10.anInt1332), Static110.method2007(local1426.anIntArray310[local42], arg6[local42] << 24 | this.aClass48_Sub1_10.anInt1332));
									}
								} else if (local1930 != -1) {
									arg3.method2747(local222, local227, local616, local163, local56, local61, local1426.anIntArray310[local38], local1426.anIntArray310[local40], local1426.anIntArray310[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1930);
								} else if ((local1426.anIntArray310[local38] & 0xFFFFFF) != 0) {
									arg3.method2761(local222, local227, local616, local163, local56, local61, local1426.anIntArray310[local38], local1426.anIntArray310[local40], local1426.anIntArray310[local42]);
								}
								arg3.anInt3223 = 0;
							} else {
								arg3.method2749(local222, local227, local616, local163, local56, local61, this.aClass48_Sub1_10.anInt1332);
							}
						}
					}
					return;
				}
				for (local283 = 0; local283 < local1426.aShort52; local283++) {
					local339 = local283 * 3;
					local395 = local339 + 1;
					local451 = local395 + 1;
					local244 = arg4[local339];
					local300 = arg4[local395];
					local356 = arg4[local451];
					local412 = arg5[local339];
					local272 = arg5[local395];
					local328 = arg5[local451];
					local384 = arg6[local339] + arg6[local395] + arg6[local451];
					if ((local244 - local300) * (local328 - local272) - (local412 - local272) * (local356 - local300) > 0) {
						arg3.aBoolean246 = local244 < 0 || local300 < 0 || local356 < 0 || local244 > arg3.anInt3227 || local300 > arg3.anInt3227 || local356 > arg3.anInt3227;
						if (local384 >= 765) {
							arg3.method2749(local412, local272, local328, local244, local300, local356, this.aClass48_Sub1_10.anInt1332);
						} else if (local384 > 0) {
							if ((local1426.anIntArray310[local339] & 0xFFFFFF) != 0) {
								arg3.method2761(local412, local272, local328, local244, local300, local356, Static75.method1313(local1426.anIntArray310[local339], arg6[local339], this.aClass48_Sub1_10.anInt1332), Static75.method1313(local1426.anIntArray310[local395], arg6[local395], this.aClass48_Sub1_10.anInt1332), Static75.method1313(local1426.anIntArray310[local451], arg6[local451], this.aClass48_Sub1_10.anInt1332));
							}
						} else if ((local1426.anIntArray310[local339] & 0xFFFFFF) != 0) {
							arg3.method2761(local412, local272, local328, local244, local300, local356, local1426.anIntArray310[local339], local1426.anIntArray310[local395], local1426.anIntArray310[local451]);
						}
					}
				}
			}
		} else if ((local6.aByte32 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt6743;
			@Pc(24) int local24 = local19 + this.anInt6743;
			local29 = arg1 * this.anInt6743;
			@Pc(34) int local34 = local29 + this.anInt6743;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte32 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray62[arg0][arg1];
				local61 = this.anIntArrayArray62[arg0 + 1][arg1];
				local222 = this.anIntArrayArray62[arg0 + 1][arg1 + 1];
				local227 = this.anIntArrayArray62[arg0][arg1 + 1];
				local78 = this.anInt6748 + (this.anInt6753 * local19 + this.anInt6747 * local56 + this.anInt6746 * local29 >> 15);
				if (local78 <= this.aClass48_Sub1_10.anInt1337) {
					return;
				}
				local101 = this.anInt6748 + (this.anInt6753 * local24 + this.anInt6747 * local61 + this.anInt6746 * local29 >> 15);
				if (local101 <= this.aClass48_Sub1_10.anInt1337) {
					return;
				}
				local124 = this.anInt6748 + (this.anInt6753 * local24 + this.anInt6747 * local222 + this.anInt6746 * local34 >> 15);
				if (local124 <= this.aClass48_Sub1_10.anInt1337) {
					return;
				}
				local147 = this.anInt6748 + (this.anInt6753 * local19 + this.anInt6747 * local227 + this.anInt6746 * local34 >> 15);
				if (local147 <= this.aClass48_Sub1_10.anInt1337) {
					return;
				}
				if (arg2) {
					local163 = local78 - this.aClass48_Sub1_10.anInt1331;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local36 = local163;
						local616 = local6.aShort49 * local163 / 255;
						if (local616 > 0) {
							local56 -= local616;
						}
					}
					local163 = local101 - this.aClass48_Sub1_10.anInt1331;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local38 = local163;
						local616 = local6.aShort48 * local163 / 255;
						if (local616 > 0) {
							local61 -= local616;
						}
					}
					local163 = local124 - this.aClass48_Sub1_10.anInt1331;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local40 = local163;
						local616 = local6.aShort50 * local163 / 255;
						if (local616 > 0) {
							local222 -= local616;
						}
					}
					local163 = local147 - this.aClass48_Sub1_10.anInt1331;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local42 = local163;
						local616 = local6.aShort47 * local163 / 255;
						if (local616 > 0) {
							local227 -= local616;
						}
					}
				} else if (this.aClass48_Sub1_10.aBoolean108) {
					local163 = local78 - this.aClass48_Sub1_10.anInt1331;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass48_Sub1_10.anInt1331;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass48_Sub1_10.anInt1331;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass48_Sub1_10.anInt1331;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local244 = this.anInt6754 + (this.anInt6756 * local19 + this.anInt6752 * local56 + this.anInt6742 * local29 >> 15);
				local255 = arg3.anInt3228 + local244 * this.aClass48_Sub1_10.anInt1317 / local78;
				local272 = this.anInt6755 + (this.anInt6751 * local19 + this.anInt6745 * local56 + this.anInt6744 * local29 >> 15);
				local283 = arg3.anInt3225 + local272 * this.aClass48_Sub1_10.anInt1338 / local78;
				local300 = this.anInt6754 + (this.anInt6756 * local24 + this.anInt6752 * local61 + this.anInt6742 * local29 >> 15);
				local311 = arg3.anInt3228 + local300 * this.aClass48_Sub1_10.anInt1317 / local101;
				local328 = this.anInt6755 + (this.anInt6751 * local24 + this.anInt6745 * local61 + this.anInt6744 * local29 >> 15);
				local339 = arg3.anInt3225 + local328 * this.aClass48_Sub1_10.anInt1338 / local101;
				local356 = this.anInt6754 + (this.anInt6756 * local24 + this.anInt6752 * local222 + this.anInt6742 * local34 >> 15);
				local367 = arg3.anInt3228 + local356 * this.aClass48_Sub1_10.anInt1317 / local124;
				local384 = this.anInt6755 + (this.anInt6751 * local24 + this.anInt6745 * local222 + this.anInt6744 * local34 >> 15);
				local395 = arg3.anInt3225 + local384 * this.aClass48_Sub1_10.anInt1338 / local124;
				local412 = this.anInt6754 + (this.anInt6756 * local19 + this.anInt6752 * local227 + this.anInt6742 * local34 >> 15);
				local423 = arg3.anInt3228 + local412 * this.aClass48_Sub1_10.anInt1317 / local147;
				local440 = this.anInt6755 + (this.anInt6751 * local19 + this.anInt6745 * local227 + this.anInt6744 * local34 >> 15);
				local451 = arg3.anInt3225 + local440 * this.aClass48_Sub1_10.anInt1338 / local147;
			} else {
				local56 = this.anIntArrayArray62[arg0][arg1];
				local61 = this.anInt6747 * local56;
				local78 = this.anInt6748 + (this.anInt6753 * local19 + local61 + this.anInt6746 * local29 >> 15);
				if (local78 <= this.aClass48_Sub1_10.anInt1337) {
					return;
				}
				local101 = this.anInt6748 + (this.anInt6753 * local24 + local61 + this.anInt6746 * local29 >> 15);
				if (local101 <= this.aClass48_Sub1_10.anInt1337) {
					return;
				}
				local124 = this.anInt6748 + (this.anInt6753 * local24 + local61 + this.anInt6746 * local34 >> 15);
				if (local124 <= this.aClass48_Sub1_10.anInt1337) {
					return;
				}
				local147 = this.anInt6748 + (this.anInt6753 * local19 + local61 + this.anInt6746 * local34 >> 15);
				if (local147 <= this.aClass48_Sub1_10.anInt1337) {
					return;
				}
				if (this.aClass48_Sub1_10.aBoolean108) {
					local163 = local78 - this.aClass48_Sub1_10.anInt1331;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass48_Sub1_10.anInt1331;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass48_Sub1_10.anInt1331;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass48_Sub1_10.anInt1331;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local222 = this.anInt6752 * local56;
				local227 = this.anInt6745 * local56;
				local244 = this.anInt6754 + (this.anInt6756 * local19 + local222 + this.anInt6742 * local29 >> 15);
				local255 = arg3.anInt3228 + local244 * this.aClass48_Sub1_10.anInt1317 / local78;
				local272 = this.anInt6755 + (this.anInt6751 * local19 + local227 + this.anInt6744 * local29 >> 15);
				local283 = arg3.anInt3225 + local272 * this.aClass48_Sub1_10.anInt1338 / local78;
				local300 = this.anInt6754 + (this.anInt6756 * local24 + local222 + this.anInt6742 * local29 >> 15);
				local311 = arg3.anInt3228 + local300 * this.aClass48_Sub1_10.anInt1317 / local101;
				local328 = this.anInt6755 + (this.anInt6751 * local24 + local227 + this.anInt6744 * local29 >> 15);
				local339 = arg3.anInt3225 + local328 * this.aClass48_Sub1_10.anInt1338 / local101;
				local356 = this.anInt6754 + (this.anInt6756 * local24 + local222 + this.anInt6742 * local34 >> 15);
				local367 = arg3.anInt3228 + local356 * this.aClass48_Sub1_10.anInt1317 / local124;
				local384 = this.anInt6755 + (this.anInt6751 * local24 + local227 + this.anInt6744 * local34 >> 15);
				local395 = arg3.anInt3225 + local384 * this.aClass48_Sub1_10.anInt1338 / local124;
				local412 = this.anInt6754 + (this.anInt6756 * local19 + local222 + this.anInt6742 * local34 >> 15);
				local423 = arg3.anInt3228 + local412 * this.aClass48_Sub1_10.anInt1317 / local147;
				local440 = this.anInt6755 + (this.anInt6751 * local19 + local227 + this.anInt6744 * local34 >> 15);
				local451 = arg3.anInt3225 + local440 * this.aClass48_Sub1_10.anInt1338 / local147;
			}
			@Pc(1038) boolean local1038 = local6.aShort51 != -1 && this.method5850(this.aClass48_Sub1_10.anInterface3_4.method1278(local6.aShort51).aByte37);
			local61 = local38 + local40 + local42;
			if ((local367 - local423) * (local339 - local451) - (local395 - local451) * (local311 - local423) > 0) {
				arg3.aBoolean246 = local367 < 0 || local423 < 0 || local311 < 0 || local367 > arg3.anInt3227 || local423 > arg3.anInt3227 || local311 > arg3.anInt3227;
				if (local61 < 765) {
					if (local1038) {
						arg3.anInt3223 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort51 >= 0) {
							arg3.method2748(local395, local451, local339, local367, local423, local311, this.aClass48_Sub1_10.anInt1332, local40, local42, local38, local6.anInt4068, local6.anInt4066, local6.anInt4064, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort51);
						} else {
							arg3.method2761(local395, local451, local339, local367, local423, local311, Static110.method2007(local6.anInt4068, local40 << 24 | this.aClass48_Sub1_10.anInt1332), Static110.method2007(local6.anInt4066, local42 << 24 | this.aClass48_Sub1_10.anInt1332), Static110.method2007(local6.anInt4064, local38 << 24 | this.aClass48_Sub1_10.anInt1332));
						}
					} else if (local6.aShort51 >= 0) {
						arg3.method2747(local395, local451, local339, local367, local423, local311, local6.anInt4068, local6.anInt4066, local6.anInt4064, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort51);
					} else {
						arg3.method2761(local395, local451, local339, local367, local423, local311, local6.anInt4068, local6.anInt4066, local6.anInt4064);
					}
					arg3.anInt3223 = 0;
				} else {
					arg3.method2749(local395, local451, local339, local367, local423, local311, this.aClass48_Sub1_10.anInt1332);
				}
			}
			local61 = local36 + local38 + local42;
			if ((local255 - local311) * (local451 - local339) - (local283 - local339) * (local423 - local311) > 0) {
				arg3.aBoolean246 = local255 < 0 || local311 < 0 || local423 < 0 || local255 > arg3.anInt3227 || local311 > arg3.anInt3227 || local423 > arg3.anInt3227;
				if (local61 < 765) {
					if (local1038) {
						arg3.anInt3223 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort51 >= 0) {
							arg3.method2748(local283, local339, local451, local255, local311, local423, this.aClass48_Sub1_10.anInt1332, local36, local38, local42, local6.anInt4067, local6.anInt4064, local6.anInt4066, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort51);
						} else {
							arg3.method2761(local283, local339, local451, local255, local311, local423, Static110.method2007(local6.anInt4067, local36 << 24 | this.aClass48_Sub1_10.anInt1332), Static110.method2007(local6.anInt4064, local38 << 24 | this.aClass48_Sub1_10.anInt1332), Static110.method2007(local6.anInt4066, local42 << 24 | this.aClass48_Sub1_10.anInt1332));
						}
					} else if (local6.aShort51 >= 0) {
						arg3.method2747(local283, local339, local451, local255, local311, local423, local6.anInt4067, local6.anInt4064, local6.anInt4066, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort51);
					} else {
						arg3.method2761(local283, local339, local451, local255, local311, local423, local6.anInt4067, local6.anInt4064, local6.anInt4066);
					}
					arg3.anInt3223 = 0;
					return;
				}
				arg3.method2749(local283, local339, local451, local255, local311, local423, this.aClass48_Sub1_10.anInt1332);
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILclient!ph;)Lclient!ph;")
	@Override
	public Class2_Sub7_Sub11 method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub7_Sub11 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ph;IIIIZ)V")
	@Override
	public void method5832(@OriginalArg(0) Class2_Sub7_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5831(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class185 local4 = this.aClass48_Sub1_10.method1114(Thread.currentThread());
		@Pc(7) Class111 local7 = local4.aClass111_2;
		local7.anInt3223 = 0;
		local7.aBoolean246 = false;
		if (this.aClass138ArrayArray1 != null) {
			this.method5848(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray415, local4.anIntArray418);
		} else if (this.aClass109ArrayArray1 != null) {
			this.method5847(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray415, local4.anIntArray418);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)I")
	@Override
	public int method5837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray62[arg0][arg1];
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)I")
	@Override
	public int method5839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt6749;
		@Pc(9) int local9 = arg1 >> this.anInt6749;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt6741 - 1 || local9 > super.anInt6740 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt6743 - 1;
		@Pc(41) int local41 = arg1 & this.anInt6743 - 1;
		@Pc(67) int local67 = this.anIntArrayArray62[local4][local9] * (this.anInt6743 - local34) + this.anIntArrayArray62[local4 + 1][local9] * local34 >> this.anInt6749;
		@Pc(97) int local97 = this.anIntArrayArray62[local4][local9 + 1] * (this.anInt6743 - local34) + this.anIntArrayArray62[local4 + 1][local9 + 1] * local34 >> this.anInt6749;
		return local67 * (this.anInt6743 - local41) + local97 * local41 >> this.anInt6749;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII[[ZLclient!it;[I[I)V")
	private void method5847(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class111 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean248 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass109ArrayArray1[local22][local25] != null) {
						@Pc(50) Class109 local50 = this.aClass109ArrayArray1[local22][local25];
						if (local50.aShort35 != -1 && (local50.aByte25 & 0x2) == 0 && local50.anInt3176 == -1) {
							local69 = this.aClass48_Sub1_10.method1115(local50.aShort35);
							arg5.method2759(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static222.method3903(local50.aShort36 & 0xFFFF, local69), Static222.method3903(local50.aShort37 & 0xFFFF, local69), Static222.method3903(local50.aShort39 & 0xFFFF, local69));
							arg5.method2759(local20, local20, local20 - 4, local16, local16 + 4, local16, Static222.method3903(local50.aShort38 & 0xFFFF, local69), Static222.method3903(local50.aShort39 & 0xFFFF, local69), Static222.method3903(local50.aShort37 & 0xFFFF, local69));
						} else if (local50.anInt3176 == -1) {
							arg5.method2759(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort36 & 0xFFFF, local50.aShort37 & 0xFFFF, local50.aShort39 & 0xFFFF);
							arg5.method2759(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort38 & 0xFFFF, local50.aShort39 & 0xFFFF, local50.aShort37 & 0xFFFF);
						} else {
							local69 = local50.anInt3176;
							arg5.method2759(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method2759(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass127ArrayArray1[local22][local25] != null) {
						@Pc(249) Class127 local249 = this.aClass127ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort46; local69++) {
							arg6[local69] = local16 + (local249.anIntArray282[local69] - local22 * this.anInt6743) * 4 / this.anInt6743;
							arg7[local69] = local20 - (local249.anIntArray283[local69] - local25 * this.anInt6743) * 4 / this.anInt6743;
						}
						for (@Pc(297) int local297 = 0; local297 < local249.aShort45; local297++) {
							@Pc(303) short local303 = local249.aShortArray37[local297];
							@Pc(308) short local308 = local249.aShortArray36[local297];
							@Pc(313) short local313 = local249.aShortArray39[local297];
							@Pc(317) int local317 = arg6[local303];
							@Pc(321) int local321 = arg6[local308];
							@Pc(325) int local325 = arg6[local313];
							@Pc(329) int local329 = arg7[local303];
							@Pc(333) int local333 = arg7[local308];
							@Pc(337) int local337 = arg7[local313];
							@Pc(351) int local351;
							if (local249.anIntArray284 != null && local249.anIntArray284[local297] != -1) {
								local351 = local249.anIntArray284[local297];
								arg5.method2759(local329, local333, local337, local317, local321, local325, Static222.method3903(local249.aShortArray35[local303], local351), Static222.method3903(local249.aShortArray35[local308], local351), Static222.method3903(local249.aShortArray35[local313], local351));
							} else if (local249.aShortArray38 == null || local249.aShortArray38[local297] == -1) {
								local351 = local249.anIntArray281[local297];
								arg5.method2759(local329, local333, local337, local317, local321, local325, Static222.method3903(local249.aShortArray35[local303], local351), Static222.method3903(local249.aShortArray35[local308], local351), Static222.method3903(local249.aShortArray35[local313], local351));
							} else {
								local351 = this.aClass48_Sub1_10.method1115(local249.aShortArray38[local297]);
								arg5.method2759(local329, local333, local337, local317, local321, local325, Static222.method3903(local249.aShortArray35[local303], local351), Static222.method3903(local249.aShortArray35[local308], local351), Static222.method3903(local249.aShortArray35[local313], local351));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean248 = true;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(IIIIIII[[ZLclient!it;[I[I)V")
	private void method5848(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class111 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean248 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass138ArrayArray1[local22][local25] != null) {
						@Pc(50) Class138 local50 = this.aClass138ArrayArray1[local22][local25];
						if (local50.aShort51 != -1 && (local50.aByte32 & 0x2) == 0 && local50.anInt4065 == 0) {
							local68 = this.aClass48_Sub1_10.method1115(local50.aShort51);
							arg5.method2759(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static222.method3903(local50.anInt4068, local68), Static222.method3903(local50.anInt4066, local68), Static222.method3903(local50.anInt4064, local68));
							arg5.method2759(local20, local20, local20 - 4, local16, local16 + 4, local16, Static222.method3903(local50.anInt4067, local68), Static222.method3903(local50.anInt4064, local68), Static222.method3903(local50.anInt4066, local68));
						} else if (local50.anInt4065 == 0) {
							arg5.method2761(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt4068, local50.anInt4066, local50.anInt4064);
							arg5.method2761(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt4067, local50.anInt4064, local50.anInt4066);
						} else {
							local68 = local50.anInt4065;
							arg5.method2761(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static110.method2007(local68, local50.anInt4068 & 0xFF000000), Static110.method2007(local68, local50.anInt4066 & 0xFF000000), Static110.method2007(local68, local50.anInt4064 & 0xFF000000));
							arg5.method2761(local20, local20, local20 - 4, local16, local16 + 4, local16, Static110.method2007(local68, local50.anInt4067 & 0xFF000000), Static110.method2007(local68, local50.anInt4064 & 0xFF000000), Static110.method2007(local68, local50.anInt4066 & 0xFF000000));
						}
					} else if (this.aClass148ArrayArray1[local22][local25] != null) {
						@Pc(259) Class148 local259 = this.aClass148ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort53; local68++) {
							arg6[local68] = local16 + (local259.aShortArray60[local68] - local22 * this.anInt6743) * 4 / this.anInt6743;
							arg7[local68] = local20 - (local259.aShortArray55[local68] - local25 * this.anInt6743) * 4 / this.anInt6743;
						}
						for (@Pc(307) int local307 = 0; local307 < local259.aShort52; local307++) {
							@Pc(312) int local312 = local307 * 3;
							@Pc(316) int local316 = local312 + 1;
							@Pc(320) int local320 = local316 + 1;
							@Pc(324) int local324 = arg6[local312];
							@Pc(328) int local328 = arg6[local316];
							@Pc(332) int local332 = arg6[local320];
							@Pc(336) int local336 = arg7[local312];
							@Pc(340) int local340 = arg7[local316];
							@Pc(344) int local344 = arg7[local320];
							@Pc(369) int local369;
							if (local259.anIntArray309 != null && local259.anIntArray309[local307] != 0 && (local259.aShortArray57 == null || local259.aShortArray57 != null && local259.aShortArray57[local307] == -1)) {
								local369 = local259.anIntArray309[local307];
								arg5.method2761(local336, local340, local344, local324, local328, local332, Static110.method2007(local369, -(local259.anIntArray310[local312] & -16777216) - 16777216), Static110.method2007(local369, -(local259.anIntArray310[local316] & -16777216) - 16777216), Static110.method2007(local369, -(local259.anIntArray310[local320] & -16777216) - 16777216));
							} else if (local259.aShortArray57 == null || local259.aShortArray57[local307] == -1) {
								arg5.method2761(local336, local340, local344, local324, local328, local332, local259.anIntArray310[local312], local259.anIntArray310[local316], local259.anIntArray310[local320]);
							} else {
								local369 = this.aClass48_Sub1_10.method1115(local259.aShortArray57[local307]);
								arg5.method2759(local336, local340, local344, local324, local328, local332, local369, local369, local369);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean248 = true;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class21_Sub2 local3 = this.aClass48_Sub1_10.aClass21_Sub2_1;
		this.anInt6756 = local3.anInt4163;
		this.anInt6752 = local3.anInt4166;
		this.anInt6742 = local3.anInt4168;
		this.anInt6754 = local3.anInt4159;
		this.anInt6751 = local3.anInt4169;
		this.anInt6745 = local3.anInt4164;
		this.anInt6744 = local3.anInt4162;
		this.anInt6755 = local3.anInt4160;
		this.anInt6753 = local3.anInt4165;
		this.anInt6747 = local3.anInt4170;
		this.anInt6746 = local3.anInt4167;
		this.anInt6748 = local3.anInt4161;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass138ArrayArray1 == null) {
			this.aClass138ArrayArray1 = new Class138[super.anInt6741][super.anInt6740];
			this.aClass148ArrayArray1 = new Class148[super.anInt6741][super.anInt6740];
		} else if (this.aClass109ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static65.anIntArray109[Static17.method379(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static65.anIntArray109[Static17.method379(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(102) boolean local102 = true;
		@Pc(104) int local104 = -1;
		@Pc(106) int local106 = -1;
		@Pc(108) int local108 = -1;
		@Pc(110) int local110 = -1;
		@Pc(244) int local244;
		if (arg2.length == 6) {
			for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
				if (arg2[local116] == 0 && arg4[local116] == 0) {
					if (local104 != -1 && arg6[local104] != arg6[local116]) {
						local102 = false;
						break;
					}
					local104 = local116;
				} else if (arg2[local116] == this.anInt6743 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == this.anInt6743 && arg4[local116] == this.anInt6743) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == this.anInt6743) {
					if (local110 != -1 && arg6[local110] != arg6[local116]) {
						local102 = false;
						break;
					}
					local110 = local116;
				}
			}
			if (local104 == -1 || local106 == -1 || local108 == -1 || local110 == -1) {
				local102 = false;
			}
			if (local102) {
				if (arg3 != null) {
					for (local244 = 0; local244 < 4; local244++) {
						if (arg3[local244] != 0) {
							local102 = false;
							break;
						}
					}
				}
				if (local102) {
					for (local244 = 1; local244 < 4; local244++) {
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + this.anInt6743 && arg2[local244] != arg2[0] - this.anInt6743) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + this.anInt6743 && arg4[local244] != arg4[0] - this.anInt6743) {
							local102 = false;
							break;
						}
					}
				}
			}
		} else {
			local102 = false;
		}
		@Pc(342) int local342;
		@Pc(527) int local527;
		if (local102) {
			@Pc(334) Class138 local334 = new Class138();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt4065 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte32 = (byte) (local334.aByte32 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray62[arg0][arg1] == this.anIntArrayArray62[arg0 + 1][arg1] && this.anIntArrayArray62[arg0][arg1] == this.anIntArrayArray62[arg0 + 1][arg1 + 1] && this.anIntArrayArray62[arg0][arg1] == this.anIntArrayArray62[arg0][arg1 + 1]) {
				local334.aByte32 = (byte) (local334.aByte32 | 0x1);
			}
			if (local342 == -1 || (local334.aByte32 & 0x2) != 0 || this.aClass48_Sub1_10.anInterface3_4.method1278(local342).aBoolean339) {
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local104] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt4067 = Static75.method1313(Static405.method5849(arg6[local104] >> 8, this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray22[arg0][arg1]), local527, arg10);
				if (local334.anInt4065 != 0) {
					local334.anInt4067 |= this.aByteArrayArray22[arg0][arg1] + 255 - this.aByteArrayArray21[arg0][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local106] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt4064 = Static75.method1313(Static405.method5849(arg6[local106] >> 8, this.aByteArrayArray21[arg0 + 1][arg1] - this.aByteArrayArray22[arg0 + 1][arg1]), local527, arg10);
				if (local334.anInt4065 != 0) {
					local334.anInt4064 |= this.aByteArrayArray22[arg0 + 1][arg1] + 255 - this.aByteArrayArray21[arg0 + 1][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local108] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt4068 = Static75.method1313(Static405.method5849(arg6[local108] >> 8, this.aByteArrayArray21[arg0 + 1][arg1 + 1] - this.aByteArrayArray22[arg0 + 1][arg1 + 1]), local527, arg10);
				if (local334.anInt4065 != 0) {
					local334.anInt4068 |= this.aByteArrayArray22[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray21[arg0 + 1][arg1 + 1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local110] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt4066 = Static75.method1313(Static405.method5849(arg6[local110] >> 8, this.aByteArrayArray21[arg0][arg1 + 1] - this.aByteArrayArray22[arg0][arg1 + 1]), local527, arg10);
				if (local334.anInt4065 != 0) {
					local334.anInt4066 |= this.aByteArrayArray22[arg0][arg1 + 1] + 255 - this.aByteArrayArray21[arg0][arg1 + 1] << 25;
				}
				local334.aShort51 = -1;
			} else {
				local334.anInt4067 = this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray22[arg0][arg1];
				local334.anInt4064 = this.aByteArrayArray21[arg0 + 1][arg1] - this.aByteArrayArray22[arg0 + 1][arg1];
				local334.anInt4068 = this.aByteArrayArray21[arg0 + 1][arg1 + 1] - this.aByteArrayArray22[arg0 + 1][arg1 + 1];
				local334.anInt4066 = this.aByteArrayArray21[arg0][arg1 + 1] - this.aByteArrayArray22[arg0][arg1 + 1];
				local334.aShort51 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort50 = (short) arg5[local108];
				local334.aShort47 = (short) arg5[local110];
				local334.aShort48 = (short) arg5[local106];
				local334.aShort49 = (short) arg5[local104];
			}
			this.aClass138ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class148 local888 = new Class148();
		local888.aShort53 = (short) arg2.length;
		local888.aShort52 = (short) (arg2.length / 3);
		local888.aShortArray60 = new short[local888.aShort53];
		local888.aShortArray56 = new short[local888.aShort53];
		local888.aShortArray55 = new short[local888.aShort53];
		local888.anIntArray310 = new int[local888.aShort53];
		if (arg5 != null) {
			local888.aShortArray58 = new short[local888.aShort53];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort53; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray22[arg0][arg1];
			} else if (local342 == 0 && local527 == this.anInt6743) {
				local958 = this.aByteArrayArray21[arg0][arg1 + 1] - this.aByteArrayArray22[arg0][arg1 + 1];
			} else if (local342 == this.anInt6743 && local527 == this.anInt6743) {
				local958 = this.aByteArrayArray21[arg0 + 1][arg1 + 1] - this.aByteArrayArray22[arg0 + 1][arg1 + 1];
			} else if (local342 == this.anInt6743 && local527 == 0) {
				local958 = this.aByteArrayArray21[arg0 + 1][arg1] - this.aByteArrayArray22[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray22[arg0][arg1]) * (this.anInt6743 - local342) + (this.aByteArrayArray21[arg0 + 1][arg1] - this.aByteArrayArray22[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray21[arg0][arg1 + 1] - this.aByteArrayArray22[arg0][arg1 + 1]) * (this.anInt6743 - local342) + (this.aByteArrayArray21[arg0 + 1][arg1 + 1] - this.aByteArrayArray22[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (this.anInt6743 - local527) + local1126 * local527 >> this.anInt6749 * 2;
			}
			@Pc(1150) short local1150 = (short) ((arg0 << this.anInt6749) + local342);
			@Pc(1158) short local1158 = (short) ((arg1 << this.anInt6749) + local527);
			local888.aShortArray60[local244] = local1150;
			local888.aShortArray55[local244] = local1158;
			local888.aShortArray56[local244] = (short) (this.method5839(local1150, local1158) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass48_Sub1_10.anInterface3_4.method1278(arg8[local244]).aBoolean339) {
				local888.anIntArray310[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray58[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray310[local244] = Static75.method1313(Static405.method5849(arg6[local244] >> 8, local958), local1226, arg10);
				if (arg7 != null) {
					local888.anIntArray310[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray310[local244] = 0;
			} else {
				local888.anIntArray310[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort52; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass48_Sub1_10.anInterface3_4.method1278(arg8[local527 * 3]).aBoolean339) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray309 = new int[local888.aShort52];
		}
		if (local1296) {
			local888.aShortArray57 = new short[local888.aShort52];
			local888.aShortArray59 = new short[local888.aShort52];
		}
		for (local958 = 0; local958 < local888.aShort52; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray309[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass48_Sub1_10.anInterface3_4.method1278(local1384).aBoolean339) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass48_Sub1_10.anInterface3_4.method1278(local1384).aBoolean339) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass48_Sub1_10.anInterface3_4.method1278(local1384).aBoolean339) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray57[local958] = (short) local1384;
					local888.aShortArray59[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass48_Sub1_10.anInterface3_4.method1278(local1384).aBoolean339) {
							local888.anIntArray310[local1079] = Static65.anIntArray109[Static17.method379(this.aClass48_Sub1_10.anInterface3_4.method1278(local1384).aShort62 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass48_Sub1_10.anInterface3_4.method1278(local1384).aBoolean339) {
							local888.anIntArray310[local1126] = Static65.anIntArray109[Static17.method379(this.aClass48_Sub1_10.anInterface3_4.method1278(local1384).aShort62 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass48_Sub1_10.anInterface3_4.method1278(local1384).aBoolean339) {
							local888.anIntArray310[local1226] = Static65.anIntArray109[Static17.method379(this.aClass48_Sub1_10.anInterface3_4.method1278(local1384).aShort62 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray57[local958] = -1;
				}
			}
		}
		this.aClass148ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)V")
	@Override
	public void method5844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class185 local4 = this.aClass48_Sub1_10.method1114(Thread.currentThread());
		local4.aClass111_2.anInt3223 = 0;
		if (this.aClass138ArrayArray1 != null) {
			this.method5846(arg0, arg1, this.aClass48_Sub1_10.aBoolean110, local4.aClass111_2, local4.anIntArray415, local4.anIntArray418, local4.anIntArray435);
		} else if (this.aClass109ArrayArray1 != null) {
			this.method5851(arg0, arg1, local4.aClass111_2, local4.anIntArray415, local4.anIntArray418, local4.anIntArray435);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
	@Override
	public void method5838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray22[arg0][arg1] < arg2) {
			this.aByteArrayArray22[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass109ArrayArray1 == null) {
			this.aClass109ArrayArray1 = new Class109[super.anInt6741][super.anInt6740];
			this.aClass127ArrayArray1 = new Class127[super.anInt6741][super.anInt6740];
		} else if (this.aClass138ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(26) boolean local26 = false;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local26 = true;
			for (@Pc(57) int local57 = 1; local57 < 2; local57++) {
				local64 = arg2[arg6[local57]];
				local70 = arg4[arg6[local57]];
				if (local64 != 0 && local64 != this.anInt6743 || local70 != 0 && local70 != this.anInt6743) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class127 local95 = new Class127();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort46 = local99;
			local95.aShortArray35 = new short[local99];
			local95.anIntArray282 = new int[local99];
			local95.anIntArray285 = new int[local99];
			local95.anIntArray283 = new int[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray35[local124] = (short) (this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray22[arg0][arg1]);
				} else if (local129 == 0 && local133 == this.anInt6743) {
					local95.aShortArray35[local124] = (short) (this.aByteArrayArray21[arg0][arg1 + 1] - this.aByteArrayArray22[arg0][arg1 + 1]);
				} else if (local129 == this.anInt6743 && local133 == this.anInt6743) {
					local95.aShortArray35[local124] = (short) (this.aByteArrayArray21[arg0 + 1][arg1 + 1] - this.aByteArrayArray22[arg0 + 1][arg1 + 1]);
				} else if (local129 == this.anInt6743 && local133 == 0) {
					local95.aShortArray35[local124] = (short) (this.aByteArrayArray21[arg0 + 1][arg1] - this.aByteArrayArray22[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray22[arg0][arg1]) * (this.anInt6743 - local129) + (this.aByteArrayArray21[arg0 + 1][arg1] - this.aByteArrayArray22[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray21[arg0][arg1 + 1] - this.aByteArrayArray22[arg0][arg1 + 1]) * (this.anInt6743 - local129) + (this.aByteArrayArray21[arg0 + 1][arg1 + 1] - this.aByteArrayArray22[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray35[local124] = (short) (local288 * (this.anInt6743 - local133) + local335 * local133 >> this.anInt6749 * 2);
				}
				local288 = (arg0 << this.anInt6749) + local129;
				local335 = (arg1 << this.anInt6749) + local133;
				local95.anIntArray282[local124] = local288;
				local95.anIntArray283[local124] = local335;
				local95.anIntArray285[local124] = this.method5839(local288, local335) + (arg3 == null ? 0 : arg3[local124]);
				if (local95.aShortArray35[local124] < 2) {
					local95.aShortArray35[local124] = 2;
				}
			}
			@Pc(412) boolean local412 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass48_Sub1_10.anInterface3_4.method1278(arg11[local288]).aBoolean339) {
					local412 = true;
				}
			}
			local95.anIntArray281 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray284 = new int[local133];
			}
			local95.aShortArray37 = new short[local133];
			local95.aShortArray36 = new short[local133];
			local95.aShortArray39 = new short[local133];
			if (local412) {
				local95.aShortArray38 = new short[local133];
				local95.aShortArray34 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray281[local95.aShort45] = Static17.method379(arg9[local335]);
					} else {
						local95.anIntArray281[local95.aShort45] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray284[local95.aShort45] = -1;
						} else {
							local95.anIntArray284[local95.aShort45] = Static17.method379(arg10[local335]);
						}
					}
					local95.aShortArray37[local95.aShort45] = (short) arg6[local335];
					local95.aShortArray36[local95.aShort45] = (short) arg7[local335];
					local95.aShortArray39[local95.aShort45] = (short) arg8[local335];
					if (local412) {
						if (arg11[local335] == -1 || this.aClass48_Sub1_10.anInterface3_4.method1278(arg11[local335]).aBoolean339) {
							local95.aShortArray38[local95.aShort45] = -1;
						} else {
							local95.aShortArray38[local95.aShort45] = (short) arg11[local335];
							local95.aShortArray34[local95.aShort45] = (short) arg12[local335];
						}
					}
					local95.aShort45++;
				}
			}
			this.aClass127ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(641) Class109 local641 = new Class109();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local641.anInt3176 = Static222.method3903(this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray22[arg0][arg1], Static17.method379(arg10[0]));
				if (local64 == -1) {
					local641.aByte25 = (byte) (local641.aByte25 | 0x2);
				}
			}
			if (this.anIntArrayArray62[arg0][arg1] == this.anIntArrayArray62[arg0 + 1][arg1] && this.anIntArrayArray62[arg0][arg1] == this.anIntArrayArray62[arg0 + 1][arg1 + 1] && this.anIntArrayArray62[arg0][arg1] == this.anIntArrayArray62[arg0][arg1 + 1]) {
				local641.aByte25 = (byte) (local641.aByte25 | 0x1);
			}
			if (local70 == -1 || (local641.aByte25 & 0x2) != 0 || this.aClass48_Sub1_10.anInterface3_4.method1278(local70).aBoolean339) {
				@Pc(842) short local842 = Static17.method379(local64);
				local641.aShort38 = (short) Static222.method3903(this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray22[arg0][arg1], local842);
				local641.aShort39 = (short) Static222.method3903(this.aByteArrayArray21[arg0 + 1][arg1] - this.aByteArrayArray22[arg0 + 1][arg1], local842);
				local641.aShort36 = (short) Static222.method3903(this.aByteArrayArray21[arg0 + 1][arg1 + 1] - this.aByteArrayArray22[arg0 + 1][arg1 + 1], local842);
				local641.aShort37 = (short) Static222.method3903(this.aByteArrayArray21[arg0][arg1 + 1] - this.aByteArrayArray22[arg0][arg1 + 1], local842);
				local641.aShort35 = -1;
			} else {
				local641.aShort38 = (short) (this.aByteArrayArray21[arg0][arg1] - this.aByteArrayArray22[arg0][arg1]);
				local641.aShort39 = (short) (this.aByteArrayArray21[arg0 + 1][arg1] - this.aByteArrayArray22[arg0 + 1][arg1]);
				local641.aShort36 = (short) (this.aByteArrayArray21[arg0 + 1][arg1 + 1] - this.aByteArrayArray22[arg0 + 1][arg1 + 1]);
				local641.aShort37 = (short) (this.aByteArrayArray21[arg0][arg1 + 1] - this.aByteArrayArray22[arg0][arg1 + 1]);
				local641.aShort35 = (short) local70;
			}
			this.aClass109ArrayArray1[arg0][arg1] = local641;
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)Z")
	private boolean method5850(@OriginalArg(0) int arg0) {
		if ((this.anInt6750 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lclient!ph;IIIIZ)V")
	@Override
	public void method5840(@OriginalArg(0) Class2_Sub7_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILclient!it;[I[I[I)V")
	private void method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class109 local6 = this.aClass109ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(181) int local181;
		@Pc(237) int local237;
		@Pc(293) int local293;
		@Pc(349) int local349;
		@Pc(209) int local209;
		@Pc(170) int local170;
		@Pc(226) int local226;
		@Pc(282) int local282;
		@Pc(338) int local338;
		@Pc(198) int local198;
		@Pc(254) int local254;
		@Pc(310) int local310;
		@Pc(366) int local366;
		@Pc(68) int local68;
		@Pc(91) int local91;
		@Pc(114) int local114;
		@Pc(137) int local137;
		@Pc(46) int local46;
		@Pc(265) int local265;
		@Pc(321) int local321;
		@Pc(377) int local377;
		if (local6 == null) {
			@Pc(996) Class127 local996 = this.aClass127ArrayArray1[arg0][arg1];
			if (local996 != null) {
				for (local349 = 0; local349 < local996.aShort46; local349++) {
					local24 = local996.anIntArray282[local349];
					local29 = local996.anIntArray285[local349];
					local34 = local996.anIntArray283[local349];
					local293 = this.anInt6748 + (this.anInt6753 * local24 + this.anInt6747 * local29 + this.anInt6746 * local34 >> 15);
					if (local293 <= this.aClass48_Sub1_10.anInt1337) {
						return;
					}
					local181 = this.anInt6754 + (this.anInt6756 * local24 + this.anInt6752 * local29 + this.anInt6742 * local34 >> 15);
					local237 = this.anInt6755 + (this.anInt6751 * local24 + this.anInt6745 * local29 + this.anInt6744 * local34 >> 15);
					arg3[local349] = arg2.anInt3228 + local181 * this.aClass48_Sub1_10.anInt1317 / local293;
					arg4[local349] = arg2.anInt3225 + local237 * this.aClass48_Sub1_10.anInt1338 / local293;
				}
				if (local996.aShortArray38 != null) {
					local209 = this.anIntArrayArray62[arg0][arg1];
					local265 = this.anIntArrayArray62[arg0 + 1][arg1];
					local321 = this.anIntArrayArray62[arg0][arg1 + 1];
					local377 = arg0 * this.anInt6743;
					local170 = local377 + this.anInt6743;
					local226 = arg1 * this.anInt6743;
					local282 = local226 + this.anInt6743;
					local338 = this.anInt6754 + (this.anInt6756 * local377 + this.anInt6752 * local209 + this.anInt6742 * local226 >> 15);
					local198 = this.anInt6755 + (this.anInt6751 * local377 + this.anInt6745 * local209 + this.anInt6744 * local226 >> 15);
					local254 = this.anInt6748 + (this.anInt6753 * local377 + this.anInt6747 * local209 + this.anInt6746 * local226 >> 15);
					local310 = this.anInt6754 + (this.anInt6756 * local170 + this.anInt6752 * local265 + this.anInt6742 * local226 >> 15);
					local366 = this.anInt6755 + (this.anInt6751 * local170 + this.anInt6745 * local265 + this.anInt6744 * local226 >> 15);
					local68 = this.anInt6748 + (this.anInt6753 * local170 + this.anInt6747 * local265 + this.anInt6746 * local226 >> 15);
					local91 = this.anInt6754 + (this.anInt6756 * local377 + this.anInt6752 * local321 + this.anInt6742 * local282 >> 15);
					local114 = this.anInt6755 + (this.anInt6751 * local377 + this.anInt6745 * local321 + this.anInt6744 * local282 >> 15);
					local137 = this.anInt6748 + (this.anInt6753 * local377 + this.anInt6747 * local321 + this.anInt6746 * local282 >> 15);
					for (local46 = 0; local46 < local996.aShort45; local46++) {
						@Pc(1349) short local1349 = local996.aShortArray37[local46];
						@Pc(1354) short local1354 = local996.aShortArray36[local46];
						@Pc(1359) short local1359 = local996.aShortArray39[local46];
						@Pc(1363) int local1363 = arg3[local1349];
						@Pc(1367) int local1367 = arg3[local1354];
						@Pc(1371) int local1371 = arg3[local1359];
						@Pc(1375) int local1375 = arg4[local1349];
						@Pc(1379) int local1379 = arg4[local1354];
						@Pc(1383) int local1383 = arg4[local1359];
						if ((local1363 - local1367) * (local1383 - local1379) - (local1375 - local1379) * (local1371 - local1367) > 0) {
							arg2.aBoolean246 = local1363 < 0 || local1367 < 0 || local1371 < 0 || local1363 > arg2.anInt3227 || local1367 > arg2.anInt3227 || local1371 > arg2.anInt3227;
							@Pc(1427) short local1427 = local996.aShortArray38[local46];
							if (local1427 == -1) {
								@Pc(1482) int local1482 = local996.anIntArray281[local46];
								if (local1482 != -1) {
									arg2.method2759(local1375, local1379, local1383, local1363, local1367, local1371, Static222.method3903(local996.aShortArray35[local1349], local1482), Static222.method3903(local996.aShortArray35[local1354], local1482), Static222.method3903(local996.aShortArray35[local1359], local1482));
								}
							} else {
								if (this.method5850(this.aClass48_Sub1_10.anInterface3_4.method1278(local1427).aByte37)) {
									arg2.anInt3223 = 100;
								}
								arg2.method2747(local1375, local1379, local1383, local1363, local1367, local1371, local996.aShortArray35[local1349], local996.aShortArray35[local1354], local996.aShortArray35[local1359], local338, local310, local91, local198, local366, local114, local254, local68, local137, local1427);
								arg2.anInt3223 = 0;
							}
						}
					}
					return;
				}
				for (local209 = 0; local209 < local996.aShort45; local209++) {
					@Pc(1528) short local1528 = local996.aShortArray37[local209];
					@Pc(1533) short local1533 = local996.aShortArray36[local209];
					@Pc(1538) short local1538 = local996.aShortArray39[local209];
					local170 = arg3[local1528];
					local226 = arg3[local1533];
					local282 = arg3[local1538];
					local338 = arg4[local1528];
					local198 = arg4[local1533];
					local254 = arg4[local1538];
					if ((local170 - local226) * (local254 - local198) - (local338 - local198) * (local282 - local226) > 0) {
						local310 = local996.anIntArray281[local209];
						if (local310 != -1) {
							arg2.aBoolean246 = local170 < 0 || local226 < 0 || local282 < 0 || local170 > arg2.anInt3227 || local226 > arg2.anInt3227 || local282 > arg2.anInt3227;
							arg2.method2759(local338, local198, local254, local170, local226, local282, Static222.method3903(local996.aShortArray35[local1528], local310), Static222.method3903(local996.aShortArray35[local1533], local310), Static222.method3903(local996.aShortArray35[local1538], local310));
						}
					}
				}
			}
		} else if ((local6.aByte25 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt6743;
			local24 = local19 + this.anInt6743;
			local29 = arg1 * this.anInt6743;
			local34 = local29 + this.anInt6743;
			@Pc(51) int local51;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if ((local6.aByte25 & 0x1) == 0) {
				local46 = this.anIntArrayArray62[arg0][arg1];
				local51 = this.anIntArrayArray62[arg0 + 1][arg1];
				local148 = this.anIntArrayArray62[arg0 + 1][arg1 + 1];
				local153 = this.anIntArrayArray62[arg0][arg1 + 1];
				local68 = this.anInt6748 + (this.anInt6753 * local19 + this.anInt6747 * local46 + this.anInt6746 * local29 >> 15);
				if (local68 <= this.aClass48_Sub1_10.anInt1337) {
					return;
				}
				local91 = this.anInt6748 + (this.anInt6753 * local24 + this.anInt6747 * local51 + this.anInt6746 * local29 >> 15);
				if (local91 <= this.aClass48_Sub1_10.anInt1337) {
					return;
				}
				local114 = this.anInt6748 + (this.anInt6753 * local24 + this.anInt6747 * local148 + this.anInt6746 * local34 >> 15);
				if (local114 <= this.aClass48_Sub1_10.anInt1337) {
					return;
				}
				local137 = this.anInt6748 + (this.anInt6753 * local19 + this.anInt6747 * local153 + this.anInt6746 * local34 >> 15);
				if (local137 <= this.aClass48_Sub1_10.anInt1337) {
					return;
				}
				local170 = this.anInt6754 + (this.anInt6756 * local19 + this.anInt6752 * local46 + this.anInt6742 * local29 >> 15);
				local181 = arg2.anInt3228 + local170 * this.aClass48_Sub1_10.anInt1317 / local68;
				local198 = this.anInt6755 + (this.anInt6751 * local19 + this.anInt6745 * local46 + this.anInt6744 * local29 >> 15);
				local209 = arg2.anInt3225 + local198 * this.aClass48_Sub1_10.anInt1338 / local68;
				local226 = this.anInt6754 + (this.anInt6756 * local24 + this.anInt6752 * local51 + this.anInt6742 * local29 >> 15);
				local237 = arg2.anInt3228 + local226 * this.aClass48_Sub1_10.anInt1317 / local91;
				local254 = this.anInt6755 + (this.anInt6751 * local24 + this.anInt6745 * local51 + this.anInt6744 * local29 >> 15);
				local265 = arg2.anInt3225 + local254 * this.aClass48_Sub1_10.anInt1338 / local91;
				local282 = this.anInt6754 + (this.anInt6756 * local24 + this.anInt6752 * local148 + this.anInt6742 * local34 >> 15);
				local293 = arg2.anInt3228 + local282 * this.aClass48_Sub1_10.anInt1317 / local114;
				local310 = this.anInt6755 + (this.anInt6751 * local24 + this.anInt6745 * local148 + this.anInt6744 * local34 >> 15);
				local321 = arg2.anInt3225 + local310 * this.aClass48_Sub1_10.anInt1338 / local114;
				local338 = this.anInt6754 + (this.anInt6756 * local19 + this.anInt6752 * local153 + this.anInt6742 * local34 >> 15);
				local349 = arg2.anInt3228 + local338 * this.aClass48_Sub1_10.anInt1317 / local137;
				local366 = this.anInt6755 + (this.anInt6751 * local19 + this.anInt6745 * local153 + this.anInt6744 * local34 >> 15);
				local377 = arg2.anInt3225 + local366 * this.aClass48_Sub1_10.anInt1338 / local137;
			} else {
				local46 = this.anIntArrayArray62[arg0][arg1];
				local51 = this.anInt6747 * local46;
				local68 = this.anInt6748 + (this.anInt6753 * local19 + local51 + this.anInt6746 * local29 >> 15);
				if (local68 <= this.aClass48_Sub1_10.anInt1337) {
					return;
				}
				local91 = this.anInt6748 + (this.anInt6753 * local24 + local51 + this.anInt6746 * local29 >> 15);
				if (local91 <= this.aClass48_Sub1_10.anInt1337) {
					return;
				}
				local114 = this.anInt6748 + (this.anInt6753 * local24 + local51 + this.anInt6746 * local34 >> 15);
				if (local114 <= this.aClass48_Sub1_10.anInt1337) {
					return;
				}
				local137 = this.anInt6748 + (this.anInt6753 * local19 + local51 + this.anInt6746 * local34 >> 15);
				if (local137 <= this.aClass48_Sub1_10.anInt1337) {
					return;
				}
				local148 = this.anInt6752 * local46;
				local153 = this.anInt6745 * local46;
				local170 = this.anInt6754 + (this.anInt6756 * local19 + local148 + this.anInt6742 * local29 >> 15);
				local181 = arg2.anInt3228 + local170 * this.aClass48_Sub1_10.anInt1317 / local68;
				local198 = this.anInt6755 + (this.anInt6751 * local19 + local153 + this.anInt6744 * local29 >> 15);
				local209 = arg2.anInt3225 + local198 * this.aClass48_Sub1_10.anInt1338 / local68;
				local226 = this.anInt6754 + (this.anInt6756 * local24 + local148 + this.anInt6742 * local29 >> 15);
				local237 = arg2.anInt3228 + local226 * this.aClass48_Sub1_10.anInt1317 / local91;
				local254 = this.anInt6755 + (this.anInt6751 * local24 + local153 + this.anInt6744 * local29 >> 15);
				local265 = arg2.anInt3225 + local254 * this.aClass48_Sub1_10.anInt1338 / local91;
				local282 = this.anInt6754 + (this.anInt6756 * local24 + local148 + this.anInt6742 * local34 >> 15);
				local293 = arg2.anInt3228 + local282 * this.aClass48_Sub1_10.anInt1317 / local114;
				local310 = this.anInt6755 + (this.anInt6751 * local24 + local153 + this.anInt6744 * local34 >> 15);
				local321 = arg2.anInt3225 + local310 * this.aClass48_Sub1_10.anInt1338 / local114;
				local338 = this.anInt6754 + (this.anInt6756 * local19 + local148 + this.anInt6742 * local34 >> 15);
				local349 = arg2.anInt3228 + local338 * this.aClass48_Sub1_10.anInt1317 / local137;
				local366 = this.anInt6755 + (this.anInt6751 * local19 + local153 + this.anInt6744 * local34 >> 15);
				local377 = arg2.anInt3225 + local366 * this.aClass48_Sub1_10.anInt1338 / local137;
			}
			if ((local293 - local349) * (local265 - local377) - (local321 - local377) * (local237 - local349) > 0) {
				arg2.aBoolean246 = local293 < 0 || local349 < 0 || local237 < 0 || local293 > arg2.anInt3227 || local349 > arg2.anInt3227 || local237 > arg2.anInt3227;
				if (local6.aShort35 >= 0) {
					if (this.method5850(this.aClass48_Sub1_10.anInterface3_4.method1278(local6.aShort35).aByte37)) {
						arg2.anInt3223 = 100;
					}
					arg2.method2747(local321, local377, local265, local293, local349, local237, local6.aShort36 & 0xFFFF, local6.aShort37 & 0xFFFF, local6.aShort39 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort35);
					arg2.anInt3223 = 0;
				} else {
					arg2.method2759(local321, local377, local265, local293, local349, local237, local6.aShort36 & 0xFFFF, local6.aShort37 & 0xFFFF, local6.aShort39 & 0xFFFF);
				}
			}
			if ((local181 - local237) * (local377 - local265) - (local209 - local265) * (local349 - local237) > 0) {
				arg2.aBoolean246 = local181 < 0 || local237 < 0 || local349 < 0 || local181 > arg2.anInt3227 || local237 > arg2.anInt3227 || local349 > arg2.anInt3227;
				if (local6.aShort35 >= 0) {
					if (this.method5850(this.aClass48_Sub1_10.anInterface3_4.method1278(local6.aShort35).aByte37)) {
						arg2.anInt3223 = 100;
					}
					arg2.method2747(local209, local265, local377, local181, local237, local349, local6.aShort38 & 0xFFFF, local6.aShort39 & 0xFFFF, local6.aShort37 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort35);
					arg2.anInt3223 = 0;
					return;
				}
				arg2.method2759(local209, local265, local377, local181, local237, local349, local6.aShort38 & 0xFFFF, local6.aShort39 & 0xFFFF, local6.aShort37 & 0xFFFF);
			}
		}
	}
}
