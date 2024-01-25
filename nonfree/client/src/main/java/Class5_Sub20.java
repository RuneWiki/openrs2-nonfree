import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class5_Sub20 extends Class5 {

	@OriginalMember(owner = "client!iha", name = "w", descriptor = "I")
	private int anInt3993;

	@OriginalMember(owner = "client!iha", name = "F", descriptor = "Lclient!tn;")
	private final Class5_Sub27 aClass5_Sub27_1;

	@OriginalMember(owner = "client!iha", name = "m", descriptor = "Lclient!rv;")
	private final Class126_Sub2 aClass126_Sub2_5;

	@OriginalMember(owner = "client!iha", name = "v", descriptor = "Lclient!via;")
	private final Class40_Sub3 aClass40_Sub3_1;

	@OriginalMember(owner = "client!iha", name = "j", descriptor = "I")
	private final int anInt3985;

	@OriginalMember(owner = "client!iha", name = "t", descriptor = "I")
	private final int anInt3991;

	@OriginalMember(owner = "client!iha", name = "l", descriptor = "I")
	private final int anInt3986;

	@OriginalMember(owner = "client!iha", name = "C", descriptor = "I")
	private final int anInt3995;

	@OriginalMember(owner = "client!iha", name = "G", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!iha", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!iha", name = "I", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!iha", name = "r", descriptor = "I")
	private int anInt3990;

	@OriginalMember(owner = "client!iha", name = "o", descriptor = "Lclient!du;")
	private Class81 aClass81_36;

	@OriginalMember(owner = "client!iha", name = "i", descriptor = "Lclient!rh;")
	private final Interface21 anInterface21_4;

	@OriginalMember(owner = "client!iha", name = "H", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!iha", name = "s", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!iha", name = "z", descriptor = "Lclient!am;")
	private final Interface1 anInterface1_4;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lclient!rv;Lclient!via;Lclient!tn;[I)V")
	public Class5_Sub20(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(1) Class40_Sub3 arg1, @OriginalArg(2) Class5_Sub27 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass5_Sub27_1 = arg2;
		this.aClass126_Sub2_5 = arg0;
		this.aClass40_Sub3_1 = arg1;
		@Pc(23) int local23 = this.aClass5_Sub27_1.method6338() - (arg1.anInt9918 >> 1);
		this.anInt3985 = this.aClass5_Sub27_1.method6330() - local23 >> arg1.anInt9919;
		this.anInt3991 = local23 + this.aClass5_Sub27_1.method6330() >> arg1.anInt9919;
		this.anInt3986 = this.aClass5_Sub27_1.method6335() - local23 >> arg1.anInt9919;
		this.anInt3995 = local23 + this.aClass5_Sub27_1.method6335() >> arg1.anInt9919;
		@Pc(77) int local77 = this.anInt3991 + 1 - this.anInt3985;
		@Pc(86) int local86 = this.anInt3995 + 1 - this.anInt3986;
		this.aFloatArrayArray3 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray2 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray4 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(133) int local133;
		@Pc(140) int local140;
		@Pc(172) int local172;
		@Pc(189) int local189;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = local115 + this.anInt3986;
			if (local122 > 0 && local122 < this.aClass40_Sub3_1.anInt9923 - 1) {
				for (local133 = 0; local133 <= local77; local133++) {
					local140 = this.anInt3985 + local133;
					if (local140 > 0 && this.aClass40_Sub3_1.anInt9920 - 1 > local140) {
						local172 = arg1.method8442(local140 + 1, local122) - arg1.method8442(local140 - 1, local122);
						local189 = arg1.method8442(local140, local122 + 1) - arg1.method8442(local140, local122 - 1);
						@Pc(204) float local204 = (float) (1.0D / Math.sqrt((double) (local189 * local189 + local172 * local172 + 65536)));
						this.aFloatArrayArray4[local133][local115] = (float) local172 * local204;
						this.aFloatArrayArray3[local133][local115] = -256.0F * local204;
						this.aFloatArrayArray2[local133][local115] = (float) local189 * local204;
					}
				}
			}
		}
		local122 = 0;
		@Pc(299) int local299;
		for (local133 = this.anInt3986; local133 <= this.anInt3995; local133++) {
			if (local133 >= 0 && arg1.anInt9923 > local133) {
				for (local140 = this.anInt3985; local140 <= this.anInt3991; local140++) {
					if (local140 >= 0 && arg1.anInt9920 > local140) {
						local172 = arg3[local122];
						@Pc(280) int[] local280 = arg1.anIntArrayArrayArray17[local140][local133];
						if (local280 != null && local172 != 0) {
							if (local172 == 1) {
								local299 = 0;
								while (local280.length > local299) {
									if (local280[local299++] != -1 && local280[local299++] != -1 && local280[local299++] != -1) {
										this.anInt3990 += 3;
									}
								}
							} else {
								this.anInt3990 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt3991 - this.anInt3985;
			}
		}
		if (this.anInt3990 > 0) {
			this.aClass81_36 = new Class81(Static522.method6795(this.anInt3990));
			this.anInterface21_4 = this.aClass126_Sub2_5.method5444(false);
			this.anInterface21_4.method5732(this.anInt3990);
			@Pc(400) NativeHeapBuffer local400 = this.aClass126_Sub2_5.method5455(this.anInt3990 * 16, false);
			this.aStream3 = new Stream(local400);
			while (true) {
				@Pc(412) Buffer local412;
				do {
					local412 = this.anInterface21_4.method5730();
				} while (local412 == null);
				this.aStream2 = new Stream(local412);
				local189 = 0;
				local122 = 0;
				for (local299 = this.anInt3986; local299 <= this.anInt3995; local299++) {
					if (local299 >= 0 && local299 < arg1.anInt9923) {
						@Pc(451) int local451 = 0;
						for (@Pc(454) int local454 = this.anInt3985; local454 <= this.anInt3991; local454++) {
							if (local454 >= 0 && local454 < arg1.anInt9920) {
								@Pc(469) int local469 = arg3[local122];
								@Pc(476) int[] local476 = arg1.anIntArrayArrayArray17[local454][local299];
								if (local476 != null && local469 != 0) {
									if (local469 == 1) {
										@Pc(493) int[] local493 = arg1.anIntArrayArrayArray14[local454][local299];
										@Pc(500) int[] local500 = arg1.anIntArrayArrayArray16[local454][local299];
										@Pc(502) int local502 = 0;
										label118: while (true) {
											while (true) {
												if (local476.length <= local502) {
													break label118;
												}
												if (local476[local502] == -1 || local476[local502 + 1] == -1 || local476[local502 + 2] == -1) {
													local502 += 3;
												} else {
													this.method3625(local189, local451, local500[local502], local493[local502], local454, local299);
													local502++;
													this.method3625(local189, local451, local500[local502], local493[local502], local454, local299);
													local502++;
													this.method3625(local189, local451, local500[local502], local493[local502], local454, local299);
													local502++;
												}
											}
										}
									} else if (local469 == 3) {
										this.method3625(local189, local451, 0, 0, local454, local299);
										this.method3625(local189, local451, 0, arg1.anInt9918, local454, local299);
										this.method3625(local189, local451, arg1.anInt9918, 0, local454, local299);
									} else if (local469 == 2) {
										this.method3625(local189, local451, 0, arg1.anInt9918, local454, local299);
										this.method3625(local189, local451, arg1.anInt9918, arg1.anInt9918, local454, local299);
										this.method3625(local189, local451, 0, 0, local454, local299);
									} else if (local469 == 5) {
										this.method3625(local189, local451, arg1.anInt9918, arg1.anInt9918, local454, local299);
										this.method3625(local189, local451, arg1.anInt9918, 0, local454, local299);
										this.method3625(local189, local451, 0, arg1.anInt9918, local454, local299);
									} else if (local469 == 4) {
										this.method3625(local189, local451, arg1.anInt9918, 0, local454, local299);
										this.method3625(local189, local451, 0, 0, local454, local299);
										this.method3625(local189, local451, arg1.anInt9918, arg1.anInt9918, local454, local299);
									}
								}
							}
							local451++;
							local122++;
						}
					} else {
						local122 += this.anInt3991 - this.anInt3985;
					}
					local189++;
				}
				this.aStream2.a();
				if (this.anInterface21_4.method5734()) {
					this.aStream3.a();
					this.anInterface1_4 = this.aClass126_Sub2_5.method5530(false);
					this.anInterface1_4.method7718(this.anInt3993 * 16, local400, 16);
					break;
				}
				this.aStream3.e(0);
				this.aClass81_36.method1602();
			}
		} else {
			this.anInterface21_4 = null;
			this.anInterface1_4 = null;
		}
		this.aFloatArrayArray4 = this.aFloatArrayArray3 = this.aFloatArrayArray2 = null;
		this.aStream2 = null;
		this.aStream3 = null;
		this.aClass81_36 = null;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZS)V")
	private void method3624(@OriginalArg(1) short arg0) {
		if (Stream.b()) {
			this.aStream2.b(arg0);
		} else {
			this.aStream2.d(arg0);
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIIIIII)V")
	private void method3625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg3 + (arg4 << this.aClass40_Sub3_1.anInt9919);
		@Pc(24) int local24 = arg2 + (arg5 << this.aClass40_Sub3_1.anInt9919);
		@Pc(31) int local31 = this.aClass40_Sub3_1.method8447(local16, local24);
		if ((arg3 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = (long) local16 & 0xFFFFL | 0xFFFFL << 16 & (long) local24 << 16;
			@Pc(62) Class5 local62 = this.aClass81_36.method1599(local7);
			if (local62 != null) {
				this.method3624(((Class5_Sub6) local62).aShort17);
				return;
			}
		}
		@Pc(80) short local80 = (short) this.anInt3993++;
		if (local7 != (long) -1) {
			this.aClass81_36.method1607(new Class5_Sub6(local80), local7);
		}
		@Pc(122) float local122;
		@Pc(108) float local108;
		@Pc(115) float local115;
		@Pc(202) float local202;
		@Pc(210) float local210;
		@Pc(217) float local217;
		@Pc(224) float local224;
		@Pc(231) float local231;
		@Pc(240) float local240;
		@Pc(249) float local249;
		@Pc(338) float local338;
		if (arg3 == 0 && arg2 == 0) {
			local108 = this.aFloatArrayArray3[arg1][arg0];
			local115 = this.aFloatArrayArray2[arg1][arg0];
			local122 = this.aFloatArrayArray4[arg1][arg0];
		} else if (arg3 == this.aClass40_Sub3_1.anInt9918 && arg2 == 0) {
			local122 = this.aFloatArrayArray4[arg1 + 1][arg0];
			local108 = this.aFloatArrayArray3[arg1 + 1][arg0];
			local115 = this.aFloatArrayArray2[arg1 + 1][arg0];
		} else if (arg3 == this.aClass40_Sub3_1.anInt9918 && arg2 == this.aClass40_Sub3_1.anInt9918) {
			local122 = this.aFloatArrayArray4[arg1 + 1][arg0 + 1];
			local115 = this.aFloatArrayArray2[arg1 + 1][arg0 + 1];
			local108 = this.aFloatArrayArray3[arg1 + 1][arg0 + 1];
		} else if (arg3 == 0 && arg2 == this.aClass40_Sub3_1.anInt9918) {
			local108 = this.aFloatArrayArray3[arg1][arg0 + 1];
			local115 = this.aFloatArrayArray2[arg1][arg0 + 1];
			local122 = this.aFloatArrayArray4[arg1][arg0 + 1];
		} else {
			local202 = (float) arg3 / (float) this.aClass40_Sub3_1.anInt9918;
			local210 = (float) arg2 / (float) this.aClass40_Sub3_1.anInt9918;
			local217 = this.aFloatArrayArray4[arg1][arg0];
			local224 = this.aFloatArrayArray3[arg1][arg0];
			local231 = this.aFloatArrayArray2[arg1][arg0];
			local240 = this.aFloatArrayArray4[arg1 + 1][arg0];
			local249 = this.aFloatArrayArray3[arg1 + 1][arg0];
			@Pc(264) float local264 = local231 + local202 * (this.aFloatArrayArray2[arg1][arg0 + 1] - local231);
			@Pc(279) float local279 = local217 + local202 * (this.aFloatArrayArray4[arg1][arg0 + 1] - local217);
			@Pc(296) float local296 = local240 + local202 * (this.aFloatArrayArray4[arg1 + 1][arg0 + 1] - local240);
			@Pc(313) float local313 = local249 + local202 * (this.aFloatArrayArray3[arg1 + 1][arg0 + 1] - local249);
			@Pc(329) float local329 = local224 + local202 * (this.aFloatArrayArray3[arg1][arg0 + 1] - local224);
			local338 = this.aFloatArrayArray2[arg1 + 1][arg0];
			local108 = local210 * (local313 - local329) + local329;
			@Pc(364) float local364 = local338 + (this.aFloatArrayArray2[arg1 + 1][arg0 + 1] - local338) * local202;
			local122 = local210 * (local296 - local279) + local279;
			local115 = (local364 - local264) * local210 + local264;
		}
		local202 = (float) (this.aClass5_Sub27_1.method6330() - local16);
		local210 = (float) (this.aClass5_Sub27_1.method6334() - local31);
		local217 = (float) (this.aClass5_Sub27_1.method6335() - local24);
		local224 = (float) Math.sqrt((double) (local210 * local210 + local202 * local202 + local217 * local217));
		local231 = 1.0F / local224;
		local210 *= local231;
		local217 *= local231;
		local202 *= local231;
		local240 = local224 / (float) this.aClass5_Sub27_1.method6338();
		local249 = 1.0F - local240 * local240;
		if (local249 < 0.0F) {
			local249 = 0.0F;
		}
		local338 = local115 * local217 + local122 * local202 + local210 * local108;
		if (local338 < 0.0F) {
			local338 = 0.0F;
		}
		@Pc(539) float local539 = local338 * local249 * 2.0F;
		if (local539 > 1.0F) {
			local539 = 1.0F;
		}
		@Pc(550) int local550 = this.aClass5_Sub27_1.method6336();
		@Pc(560) int local560 = (int) ((float) (local550 >> 16 & 0xFF) * local539);
		if (local560 > 255) {
			local560 = 255;
		}
		@Pc(575) int local575 = (int) (local539 * (float) (local550 >> 8 & 0xFF));
		if (local575 > 255) {
			local575 = 255;
		}
		@Pc(588) int local588 = (int) (local539 * (float) (local550 & 0xFF));
		if (Stream.b()) {
			this.aStream3.a((float) local16);
			this.aStream3.a((float) local31);
			this.aStream3.a((float) local24);
		} else {
			this.aStream3.b((float) local16);
			this.aStream3.b((float) local31);
			this.aStream3.b((float) local24);
		}
		if (local588 > 255) {
			local588 = 255;
		}
		if (this.aClass126_Sub2_5.anInt6290 == 0) {
			this.aStream3.f(local588);
			this.aStream3.f(local575);
			this.aStream3.f(local560);
		} else {
			this.aStream3.f(local560);
			this.aStream3.f(local575);
			this.aStream3.f(local588);
		}
		this.aStream3.f(255);
		this.method3624(local80);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(I[[ZIII)V")
	public void method3629(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface21_4 == null || (arg0 + arg3 < this.anInt3985 || (this.anInt3991 < arg0 - arg3 || (arg3 + arg2 < this.anInt3986 || arg2 - arg3 > this.anInt3995)))) {
			return;
		}
		for (@Pc(62) int local62 = this.anInt3986; local62 <= this.anInt3995; local62++) {
			for (@Pc(67) int local67 = this.anInt3985; local67 <= this.anInt3991; local67++) {
				@Pc(73) int local73 = local67 - arg0;
				@Pc(78) int local78 = local62 - arg2;
				if (local73 > -arg3 && arg3 > local73 && local78 > -arg3 && local78 < arg3 && arg1[local73 + arg3][arg3 + local78]) {
					this.aClass126_Sub2_5.method5515((byte) (int) (this.aClass5_Sub27_1.method6331() * 255.0F));
					this.aClass126_Sub2_5.method5451(0, this.anInterface1_4);
					this.aClass126_Sub2_5.method5524(this.aClass126_Sub2_5.aClass203_17);
					this.aClass126_Sub2_5.method5526(this.anInterface21_4, Static370.aClass23_7, this.anInt3990 / 3, 0, this.anInt3993, 0);
					return;
				}
			}
		}
	}
}
