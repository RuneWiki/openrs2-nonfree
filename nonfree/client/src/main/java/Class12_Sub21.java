import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class12_Sub21 extends Class12 {

	@OriginalMember(owner = "client!hw", name = "o", descriptor = "I")
	private int anInt4339;

	@OriginalMember(owner = "client!hw", name = "I", descriptor = "Lclient!rh;")
	private final Class12_Sub7 aClass12_Sub7_2;

	@OriginalMember(owner = "client!hw", name = "m", descriptor = "Lclient!uw;")
	private final Class215_Sub3 aClass215_Sub3_1;

	@OriginalMember(owner = "client!hw", name = "G", descriptor = "Lclient!wr;")
	private final Class42_Sub1 aClass42_Sub1_8;

	@OriginalMember(owner = "client!hw", name = "q", descriptor = "I")
	private final int anInt4341;

	@OriginalMember(owner = "client!hw", name = "t", descriptor = "I")
	private final int anInt4342;

	@OriginalMember(owner = "client!hw", name = "p", descriptor = "I")
	private final int anInt4340;

	@OriginalMember(owner = "client!hw", name = "J", descriptor = "I")
	private final int anInt4348;

	@OriginalMember(owner = "client!hw", name = "E", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!hw", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!hw", name = "v", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!hw", name = "F", descriptor = "I")
	private int anInt4347;

	@OriginalMember(owner = "client!hw", name = "s", descriptor = "Lclient!lu;")
	private final Interface10 anInterface10_6;

	@OriginalMember(owner = "client!hw", name = "C", descriptor = "Lclient!uj;")
	private final Interface18 anInterface18_6;

	@OriginalMember(owner = "client!hw", name = "y", descriptor = "Lclient!dea;")
	private Class68 aClass68_33;

	@OriginalMember(owner = "client!hw", name = "K", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!hw", name = "L", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!wr;Lclient!uw;Lclient!rh;[I)V")
	public Class12_Sub21(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) Class215_Sub3 arg1, @OriginalArg(2) Class12_Sub7 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass12_Sub7_2 = arg2;
		this.aClass215_Sub3_1 = arg1;
		this.aClass42_Sub1_8 = arg0;
		@Pc(23) int local23 = this.aClass12_Sub7_2.method5123() - (arg1.anInt9451 >> 1);
		this.anInt4341 = this.aClass12_Sub7_2.method5124() - local23 >> arg1.anInt9453;
		this.anInt4342 = local23 + this.aClass12_Sub7_2.method5124() >> arg1.anInt9453;
		this.anInt4340 = this.aClass12_Sub7_2.method5117() - local23 >> arg1.anInt9453;
		this.anInt4348 = local23 + this.aClass12_Sub7_2.method5117() >> arg1.anInt9453;
		@Pc(77) int local77 = this.anInt4342 + 1 - this.anInt4341;
		@Pc(86) int local86 = this.anInt4348 + 1 - this.anInt4340;
		this.aFloatArrayArray4 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray2 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray3 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(170) int local170;
		@Pc(185) int local185;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt4340 + local115;
			if (local122 > 0 && this.aClass215_Sub3_1.anInt9450 - 1 > local122) {
				for (local136 = 0; local136 <= local77; local136++) {
					local143 = local136 + this.anInt4341;
					if (local143 > 0 && this.aClass215_Sub3_1.anInt9452 - 1 > local143) {
						local170 = arg1.ba(local143 + 1, local122) - arg1.ba(local143 - 1, local122);
						local185 = arg1.ba(local143, local122 + 1) - arg1.ba(local143, local122 - 1);
						@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local185 * local185 + local170 * local170 + 65536)));
						this.aFloatArrayArray3[local136][local115] = local200 * (float) local170;
						this.aFloatArrayArray2[local136][local115] = local200 * -256.0F;
						this.aFloatArrayArray4[local136][local115] = (float) local185 * local200;
					}
				}
			}
		}
		local122 = 0;
		for (local136 = this.anInt4340; local136 <= this.anInt4348; local136++) {
			if (local136 >= 0 && local136 < arg1.anInt9450) {
				for (local143 = this.anInt4341; local143 <= this.anInt4342; local143++) {
					if (local143 >= 0 && arg1.anInt9452 > local143) {
						local170 = arg3[local122];
						@Pc(295) int[] local295 = arg1.anIntArrayArrayArray17[local143][local136];
						if (local295 != null && local170 != 0) {
							this.anInt4347 += local170 == 1 ? local295.length : 3;
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt4342 - this.anInt4341;
			}
		}
		if (this.anInt4347 <= 0) {
			this.anInterface10_6 = null;
			this.anInterface18_6 = null;
		} else {
			this.aClass68_33 = new Class68(Static37.method6277(this.anInt4347));
			this.anInterface18_6 = this.aClass42_Sub1_8.method5906(false);
			this.anInterface18_6.method7529(this.anInt4347);
			@Pc(372) NativeHeapBuffer local372 = this.aClass42_Sub1_8.method5908(this.anInt4347 * 16, false);
			this.aStream3 = new Stream(local372);
			while (true) {
				@Pc(384) Buffer local384;
				do {
					local384 = this.anInterface18_6.method7895();
				} while (local384 == null);
				this.aStream4 = new Stream(local384);
				local185 = 0;
				local122 = 0;
				for (@Pc(399) int local399 = this.anInt4340; local399 <= this.anInt4348; local399++) {
					if (local399 >= 0 && local399 < arg1.anInt9450) {
						@Pc(424) int local424 = 0;
						for (@Pc(427) int local427 = this.anInt4341; local427 <= this.anInt4342; local427++) {
							if (local427 >= 0 && local427 < arg1.anInt9452) {
								@Pc(439) int local439 = arg3[local122];
								@Pc(446) int[] local446 = arg1.anIntArrayArrayArray17[local427][local399];
								@Pc(453) int[] local453 = arg1.anIntArrayArrayArray18[local427][local399];
								if (local446 != null && local439 != 0) {
									if (local439 == 1) {
										for (@Pc(602) int local602 = 0; local602 < local446.length; local602++) {
											this.method3708(local453[local602], local446[local602], local399, local427, local185, local424);
										}
									} else if (local439 == 3) {
										this.method3708(0, 0, local399, local427, local185, local424);
										this.method3708(0, arg1.anInt9451, local399, local427, local185, local424);
										this.method3708(arg1.anInt9451, 0, local399, local427, local185, local424);
									} else if (local439 == 2) {
										this.method3708(0, arg1.anInt9451, local399, local427, local185, local424);
										this.method3708(arg1.anInt9451, arg1.anInt9451, local399, local427, local185, local424);
										this.method3708(0, 0, local399, local427, local185, local424);
									} else if (local439 == 5) {
										this.method3708(arg1.anInt9451, arg1.anInt9451, local399, local427, local185, local424);
										this.method3708(arg1.anInt9451, 0, local399, local427, local185, local424);
										this.method3708(0, arg1.anInt9451, local399, local427, local185, local424);
									} else if (local439 == 4) {
										this.method3708(arg1.anInt9451, 0, local399, local427, local185, local424);
										this.method3708(0, 0, local399, local427, local185, local424);
										this.method3708(arg1.anInt9451, arg1.anInt9451, local399, local427, local185, local424);
									}
								}
							}
							local122++;
							local424++;
						}
					} else {
						local122 += this.anInt4342 - this.anInt4341;
					}
					local185++;
				}
				this.aStream4.a();
				if (this.anInterface18_6.method7899()) {
					this.aStream3.a();
					this.anInterface10_6 = this.aClass42_Sub1_8.method5930(false);
					this.anInterface10_6.method7896(16, this.anInt4339 * 16, local372);
					break;
				}
				this.aStream3.e(0);
				this.aClass68_33.method1922();
			}
		}
		this.aFloatArrayArray3 = this.aFloatArrayArray2 = this.aFloatArrayArray4 = null;
		this.aStream3 = null;
		this.aStream4 = null;
		this.aClass68_33 = null;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I[[ZBII)V")
	public void method3702(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface18_6 == null || (this.anInt4341 > arg3 + arg2 || (arg2 - arg3 > this.anInt4342 || (this.anInt4340 > arg3 + arg0 || this.anInt4348 < arg0 - arg3)))) {
			return;
		}
		for (@Pc(49) int local49 = this.anInt4340; local49 <= this.anInt4348; local49++) {
			for (@Pc(54) int local54 = this.anInt4341; local54 <= this.anInt4342; local54++) {
				@Pc(61) int local61 = local54 - arg2;
				@Pc(66) int local66 = local49 - arg0;
				if (local61 > -arg3 && arg3 > local61 && local66 > -arg3 && local66 < arg3 && arg1[local61 + arg3][arg3 + local66]) {
					this.aClass42_Sub1_8.method5958((byte) (this.aClass12_Sub7_2.method5125() * 255.0F));
					this.aClass42_Sub1_8.method5999(this.aClass42_Sub1_8.aClass287_13);
					this.aClass42_Sub1_8.method5877(this.anInterface10_6, 0);
					this.aClass42_Sub1_8.method5986(this.anInt4339, this.anInterface18_6, 0, this.anInt4347 / 3, 0, Static480.aClass147_8);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(SZ)V")
	private void method3707(@OriginalArg(0) short arg0) {
		if (Stream.c()) {
			this.aStream4.a(arg0);
		} else {
			this.aStream4.d(arg0);
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIZIIII)V")
	private void method3708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg3 << this.aClass215_Sub3_1.anInt9453) + arg1;
		@Pc(24) int local24 = arg0 + (arg2 << this.aClass215_Sub3_1.anInt9453);
		@Pc(30) int local30 = this.aClass215_Sub3_1.aa(local15, local24);
		if ((arg1 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = 0xFFFFL << 16 & (long) local24 << 16 | (long) local15 & 0xFFFFL;
			@Pc(58) Class12 local58 = this.aClass68_33.method1917(local7);
			if (local58 != null) {
				this.method3707(((Class12_Sub31) local58).aShort68);
				return;
			}
		}
		@Pc(76) short local76 = (short) this.anInt4339++;
		if (local7 != -1L) {
			this.aClass68_33.method1916(new Class12_Sub31(local76), local7);
		}
		@Pc(119) float local119;
		@Pc(105) float local105;
		@Pc(112) float local112;
		@Pc(193) float local193;
		@Pc(201) float local201;
		@Pc(208) float local208;
		@Pc(215) float local215;
		@Pc(222) float local222;
		@Pc(231) float local231;
		@Pc(240) float local240;
		@Pc(313) float local313;
		if (arg1 == 0 && arg0 == 0) {
			local105 = this.aFloatArrayArray2[arg5][arg4];
			local112 = this.aFloatArrayArray4[arg5][arg4];
			local119 = this.aFloatArrayArray3[arg5][arg4];
		} else if (this.aClass215_Sub3_1.anInt9451 == arg1 && arg0 == 0) {
			local105 = this.aFloatArrayArray2[arg5 + 1][arg4];
			local112 = this.aFloatArrayArray4[arg5 + 1][arg4];
			local119 = this.aFloatArrayArray3[arg5 + 1][arg4];
		} else if (arg1 == this.aClass215_Sub3_1.anInt9451 && this.aClass215_Sub3_1.anInt9451 == arg0) {
			local105 = this.aFloatArrayArray2[arg5 + 1][arg4 + 1];
			local112 = this.aFloatArrayArray4[arg5 + 1][arg4 + 1];
			local119 = this.aFloatArrayArray3[arg5 + 1][arg4 + 1];
		} else if (arg1 == 0 && this.aClass215_Sub3_1.anInt9451 == arg0) {
			local105 = this.aFloatArrayArray2[arg5][arg4 + 1];
			local119 = this.aFloatArrayArray3[arg5][arg4 + 1];
			local112 = this.aFloatArrayArray4[arg5][arg4 + 1];
		} else {
			local193 = (float) arg1 / (float) this.aClass215_Sub3_1.anInt9451;
			local201 = (float) arg0 / (float) this.aClass215_Sub3_1.anInt9451;
			local208 = this.aFloatArrayArray3[arg5][arg4];
			local215 = this.aFloatArrayArray2[arg5][arg4];
			local222 = this.aFloatArrayArray4[arg5][arg4];
			local231 = this.aFloatArrayArray3[arg5 + 1][arg4];
			local240 = this.aFloatArrayArray2[arg5 + 1][arg4];
			@Pc(255) float local255 = local208 + (this.aFloatArrayArray3[arg5][arg4 + 1] - local208) * local193;
			@Pc(271) float local271 = local215 + (this.aFloatArrayArray2[arg5][arg4 + 1] - local215) * local193;
			@Pc(287) float local287 = local222 + local193 * (this.aFloatArrayArray4[arg5][arg4 + 1] - local222);
			@Pc(304) float local304 = local231 + (this.aFloatArrayArray3[arg5 + 1][arg4 + 1] - local231) * local193;
			local313 = this.aFloatArrayArray4[arg5 + 1][arg4];
			@Pc(331) float local331 = local240 + local193 * (this.aFloatArrayArray2[arg5 + 1][arg4 + 1] - local240);
			local105 = local271 + (local331 - local271) * local201;
			@Pc(357) float local357 = local313 + local193 * (this.aFloatArrayArray4[arg5 + 1][arg4 + 1] - local313);
			local119 = local255 + local201 * (local304 - local255);
			local112 = (local357 - local287) * local201 + local287;
		}
		local193 = this.aClass12_Sub7_2.method5124() - local15;
		local201 = this.aClass12_Sub7_2.method5120() - local30;
		local208 = this.aClass12_Sub7_2.method5117() - local24;
		local215 = (float) Math.sqrt((double) (local208 * local208 + local201 * local201 + local193 * local193));
		local222 = 1.0F / local215;
		local201 *= local222;
		local208 *= local222;
		local193 *= local222;
		local231 = local215 / (float) this.aClass12_Sub7_2.method5123();
		local240 = 1.0F - local231 * local231;
		if (local240 < 0.0F) {
			local240 = 0.0F;
		}
		local313 = local201 * local105 + local193 * local119 + local112 * local208;
		if (local313 < 0.0F) {
			local313 = 0.0F;
		}
		@Pc(538) float local538 = local240 * 2.0F * local313;
		if (local538 > 1.0F) {
			local538 = 1.0F;
		}
		@Pc(553) int local553 = this.aClass12_Sub7_2.method5118();
		@Pc(563) int local563 = (int) (local538 * (float) (local553 >> 16 & 0xFF));
		if (local563 > 255) {
			local563 = 255;
		}
		@Pc(587) int local587 = (int) ((float) (local553 >> 8 & 0xFF) * local538);
		if (local587 > 255) {
			local587 = 255;
		}
		@Pc(602) int local602 = (int) ((float) (local553 & 0xFF) * local538);
		if (local602 > 255) {
			local602 = 255;
		}
		if (Stream.c()) {
			this.aStream3.a((float) local15);
			this.aStream3.a((float) local30);
			this.aStream3.a((float) local24);
		} else {
			this.aStream3.b((float) local15);
			this.aStream3.b((float) local30);
			this.aStream3.b((float) local24);
		}
		if (this.aClass42_Sub1_8.anInt7114 == 0) {
			this.aStream3.c(local602);
			this.aStream3.c(local587);
			this.aStream3.c(local563);
		} else {
			this.aStream3.c(local563);
			this.aStream3.c(local587);
			this.aStream3.c(local602);
		}
		this.aStream3.c(255);
		this.method3707(local76);
	}
}
