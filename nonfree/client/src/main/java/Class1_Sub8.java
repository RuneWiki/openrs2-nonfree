import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!br", name = "w", descriptor = "I")
	private int anInt695;

	@OriginalMember(owner = "client!br", name = "F", descriptor = "I")
	private int anInt700;

	@OriginalMember(owner = "client!br", name = "r", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_5;

	@OriginalMember(owner = "client!br", name = "E", descriptor = "Lclient!bn;")
	private final Class1_Sub7 aClass1_Sub7_1;

	@OriginalMember(owner = "client!br", name = "L", descriptor = "Lclient!sp;")
	private final Class157_Sub2 aClass157_Sub2_1;

	@OriginalMember(owner = "client!br", name = "q", descriptor = "I")
	private final int anInt694;

	@OriginalMember(owner = "client!br", name = "m", descriptor = "I")
	private final int anInt691;

	@OriginalMember(owner = "client!br", name = "y", descriptor = "I")
	private final int anInt696;

	@OriginalMember(owner = "client!br", name = "K", descriptor = "I")
	private final int anInt702;

	@OriginalMember(owner = "client!br", name = "B", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!br", name = "l", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!br", name = "v", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!br", name = "u", descriptor = "Lclient!fe;")
	private final Interface2 anInterface2_1;

	@OriginalMember(owner = "client!br", name = "H", descriptor = "Lclient!tp;")
	private final Class238 aClass238_2;

	@OriginalMember(owner = "client!br", name = "D", descriptor = "Lclient!tp;")
	private final Class238 aClass238_1;

	@OriginalMember(owner = "client!br", name = "t", descriptor = "Lclient!se;")
	private final Interface10 anInterface10_1;

	@OriginalMember(owner = "client!br", name = "J", descriptor = "Lclient!ug;")
	private Class1_Sub28 aClass1_Sub28_2;

	@OriginalMember(owner = "client!br", name = "p", descriptor = "Lclient!uo;")
	private Class1_Sub28_Sub2 aClass1_Sub28_Sub2_1;

	@OriginalMember(owner = "client!br", name = "x", descriptor = "Lclient!qh;")
	private Class199 aClass199_27;

	static {
		new Class119(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!ur;Lclient!sp;Lclient!bn;[I)V")
	public Class1_Sub8(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) Class157_Sub2 arg1, @OriginalArg(2) Class1_Sub7 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass34_Sub2_5 = arg0;
		this.aClass1_Sub7_1 = arg2;
		this.aClass157_Sub2_1 = arg1;
		@Pc(23) int local23 = this.aClass1_Sub7_1.method5120() - (arg1.anInt6284 >> 1);
		this.anInt694 = this.aClass1_Sub7_1.method5113() - local23 >> arg1.anInt6279;
		this.anInt691 = this.aClass1_Sub7_1.method5113() + local23 >> arg1.anInt6279;
		this.anInt696 = this.aClass1_Sub7_1.method5117() - local23 >> arg1.anInt6279;
		this.anInt702 = local23 + this.aClass1_Sub7_1.method5117() >> arg1.anInt6279;
		@Pc(78) int local78 = this.anInt691 + 1 - this.anInt694;
		@Pc(86) int local86 = this.anInt702 + 1 - this.anInt696;
		this.aFloatArrayArray4 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray2 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray3 = new float[local78 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(137) int local137;
		@Pc(144) int local144;
		@Pc(170) int local170;
		@Pc(184) int local184;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt696 + local115;
			if (local122 > 0 && local122 < this.aClass157_Sub2_1.anInt6286 - 1) {
				for (local137 = 0; local137 <= local78; local137++) {
					local144 = this.anInt694 + local137;
					if (local144 > 0 && this.aClass157_Sub2_1.anInt6283 - 1 > local144) {
						local170 = arg1.ua(local144 + 1, local122) - arg1.ua(local144 - 1, local122);
						local184 = arg1.ua(local144, local122 + 1) - arg1.ua(local144, local122 - 1);
						@Pc(199) float local199 = (float) (1.0D / Math.sqrt((double) (local184 * local184 + local170 * local170 + 65536)));
						this.aFloatArrayArray4[local137][local115] = (float) local170 * local199;
						this.aFloatArrayArray3[local137][local115] = local199 * -256.0F;
						this.aFloatArrayArray2[local137][local115] = local199 * (float) local184;
					}
				}
			}
		}
		local122 = 0;
		local137 = 0;
		for (local144 = this.anInt696; local144 <= this.anInt702; local144++) {
			if (local144 >= 0 && arg1.anInt6286 > local144) {
				for (local170 = this.anInt694; local170 <= this.anInt691; local170++) {
					if (local170 >= 0 && local170 < arg1.anInt6283) {
						local184 = arg3[local137];
						@Pc(298) int[] local298 = arg1.anIntArrayArrayArray7[local170][local144];
						if (local298 != null && local184 != 0) {
							if (local184 == 1) {
								local122 += local298.length;
							} else {
								local122 += 3;
							}
						}
					}
					local137++;
				}
			} else {
				local137 += this.anInt691 - this.anInt694;
			}
		}
		if (local122 <= 0) {
			this.anInterface2_1 = null;
			this.aClass238_2 = null;
			this.aClass238_1 = null;
			this.anInterface10_1 = null;
		} else {
			this.aClass1_Sub28_2 = new Class1_Sub28(local122 * 2);
			this.aClass1_Sub28_Sub2_1 = new Class1_Sub28_Sub2(local122 * 16);
			this.aClass199_27 = new Class199(Static191.method2740(local122));
			local170 = 0;
			local137 = 0;
			for (local184 = this.anInt696; local184 <= this.anInt702; local184++) {
				if (local184 >= 0 && local184 < arg1.anInt6286) {
					@Pc(401) int local401 = 0;
					for (@Pc(404) int local404 = this.anInt694; local404 <= this.anInt691; local404++) {
						if (local404 >= 0 && arg1.anInt6283 > local404) {
							@Pc(416) int local416 = arg3[local137];
							@Pc(423) int[] local423 = arg1.anIntArrayArrayArray7[local404][local184];
							@Pc(430) int[] local430 = arg1.anIntArrayArrayArray10[local404][local184];
							if (local423 != null && local416 != 0) {
								if (local416 == 1) {
									for (@Pc(587) int local587 = 0; local587 < local423.length; local587++) {
										this.method584(local184, local430[local587], local404, local401, local423[local587], local170);
									}
								} else if (local416 == 3) {
									this.method584(local184, 0, local404, local401, 0, local170);
									this.method584(local184, 0, local404, local401, arg1.anInt6284, local170);
									this.method584(local184, arg1.anInt6284, local404, local401, 0, local170);
								} else if (local416 == 2) {
									this.method584(local184, 0, local404, local401, arg1.anInt6284, local170);
									this.method584(local184, arg1.anInt6284, local404, local401, arg1.anInt6284, local170);
									this.method584(local184, 0, local404, local401, 0, local170);
								} else if (local416 == 5) {
									this.method584(local184, arg1.anInt6284, local404, local401, arg1.anInt6284, local170);
									this.method584(local184, arg1.anInt6284, local404, local401, 0, local170);
									this.method584(local184, 0, local404, local401, arg1.anInt6284, local170);
								} else if (local416 == 4) {
									this.method584(local184, arg1.anInt6284, local404, local401, 0, local170);
									this.method584(local184, 0, local404, local401, 0, local170);
									this.method584(local184, arg1.anInt6284, local404, local401, arg1.anInt6284, local170);
								}
							}
						}
						local401++;
						local137++;
					}
				} else {
					local137 += this.anInt691 - this.anInt694;
				}
				local170++;
			}
			this.anInterface2_1 = this.aClass34_Sub2_5.method5565(false, this.aClass1_Sub28_2.anInt6812, this.aClass1_Sub28_2.aByteArray86);
			this.anInterface10_1 = this.aClass34_Sub2_5.method5564(this.aClass1_Sub28_Sub2_1.aByteArray86, this.aClass1_Sub28_Sub2_1.anInt6812, false, 16);
			this.aClass238_1 = new Class238(this.anInterface10_1, 5126, 3, 0);
			this.aClass238_2 = new Class238(this.anInterface10_1, 5121, 4, 12);
		}
		this.aClass199_27 = null;
		this.aClass1_Sub28_2 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray3 = this.aFloatArrayArray2 = null;
		this.aClass1_Sub28_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III[[ZB)V")
	public void method581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface2_1 == null || (arg0 + arg2 < this.anInt694 || (this.anInt691 < arg2 - arg0 || (this.anInt696 > arg1 + arg0 || arg1 - arg0 > this.anInt702)))) {
			return;
		}
		for (@Pc(57) int local57 = this.anInt696; local57 <= this.anInt702; local57++) {
			for (@Pc(62) int local62 = this.anInt694; local62 <= this.anInt691; local62++) {
				@Pc(69) int local69 = local62 - arg2;
				@Pc(74) int local74 = local57 - arg1;
				if (-arg0 < local69 && local69 < arg0 && local74 > -arg0 && arg0 > local74 && arg3[arg0 + local69][arg0 + local74]) {
					this.aClass34_Sub2_5.method5533((int) (this.aClass1_Sub7_1.method5124() * 255.0F) << 24);
					this.aClass34_Sub2_5.method5550(this.aClass238_1, null, this.aClass238_2, null);
					this.aClass34_Sub2_5.method5504(this.anInt700, 0, this.anInterface2_1);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(SI)V")
	private void method583(@OriginalArg(0) short arg0) {
		if (this.aClass34_Sub2_5.aBoolean751) {
			this.aClass1_Sub28_2.method5393(arg0);
		} else {
			this.aClass1_Sub28_2.method5383(arg0);
		}
		this.anInt700++;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIIII)V")
	private void method584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) long local15 = -1L;
		@Pc(23) int local23 = (arg2 << this.aClass157_Sub2_1.anInt6279) + arg4;
		@Pc(31) int local31 = arg1 + (arg0 << this.aClass157_Sub2_1.anInt6279);
		@Pc(37) int local37 = this.aClass157_Sub2_1.ca(local23, local31);
		if ((arg4 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local15 = (long) local23 & 0xFFFFL | ((long) local31 & 0xFFFFL) << 16;
			@Pc(63) Class1 local63 = this.aClass199_27.method4387(local15);
			if (local63 != null) {
				this.method583(((Class1_Sub39) local63).aShort106);
				return;
			}
		}
		@Pc(81) short local81 = (short) this.anInt695++;
		if (local15 != -1L) {
			this.aClass199_27.method4383(local15, new Class1_Sub39(local81));
		}
		@Pc(108) float local108;
		@Pc(115) float local115;
		@Pc(122) float local122;
		@Pc(209) float local209;
		@Pc(217) float local217;
		@Pc(224) float local224;
		@Pc(231) float local231;
		@Pc(238) float local238;
		@Pc(247) float local247;
		@Pc(256) float local256;
		@Pc(346) float local346;
		if (arg4 == 0 && arg1 == 0) {
			local108 = this.aFloatArrayArray4[arg3][arg5];
			local115 = this.aFloatArrayArray3[arg3][arg5];
			local122 = this.aFloatArrayArray2[arg3][arg5];
		} else if (this.aClass157_Sub2_1.anInt6284 == arg4 && arg1 == 0) {
			local122 = this.aFloatArrayArray2[arg3 + 1][arg5];
			local115 = this.aFloatArrayArray3[arg3 + 1][arg5];
			local108 = this.aFloatArrayArray4[arg3 + 1][arg5];
		} else if (this.aClass157_Sub2_1.anInt6284 == arg4 && this.aClass157_Sub2_1.anInt6284 == arg1) {
			local122 = this.aFloatArrayArray2[arg3 + 1][arg5 + 1];
			local115 = this.aFloatArrayArray3[arg3 + 1][arg5 + 1];
			local108 = this.aFloatArrayArray4[arg3 + 1][arg5 + 1];
		} else if (arg4 == 0 && this.aClass157_Sub2_1.anInt6284 == arg1) {
			local122 = this.aFloatArrayArray2[arg3][arg5 + 1];
			local108 = this.aFloatArrayArray4[arg3][arg5 + 1];
			local115 = this.aFloatArrayArray3[arg3][arg5 + 1];
		} else {
			local209 = (float) arg4 / (float) this.aClass157_Sub2_1.anInt6284;
			local217 = (float) arg1 / (float) this.aClass157_Sub2_1.anInt6284;
			local224 = this.aFloatArrayArray4[arg3][arg5];
			local231 = this.aFloatArrayArray3[arg3][arg5];
			local238 = this.aFloatArrayArray2[arg3][arg5];
			local247 = this.aFloatArrayArray4[arg3 + 1][arg5];
			local256 = this.aFloatArrayArray3[arg3 + 1][arg5];
			@Pc(274) float local274 = local247 + local209 * (this.aFloatArrayArray4[arg3 + 1][arg5 + 1] - local247);
			@Pc(289) float local289 = local224 + (this.aFloatArrayArray4[arg3][arg5 + 1] - local224) * local209;
			@Pc(307) float local307 = local256 + (this.aFloatArrayArray3[arg3 + 1][arg5 + 1] - local256) * local209;
			@Pc(322) float local322 = local231 + local209 * (this.aFloatArrayArray3[arg3][arg5 + 1] - local231);
			@Pc(337) float local337 = local238 + (this.aFloatArrayArray2[arg3][arg5 + 1] - local238) * local209;
			local346 = this.aFloatArrayArray2[arg3 + 1][arg5];
			local108 = local289 + (local274 - local289) * local217;
			local115 = (local307 - local322) * local217 + local322;
			@Pc(382) float local382 = local346 + (this.aFloatArrayArray2[arg3 + 1][arg5 + 1] - local346) * local209;
			local122 = (local382 - local337) * local217 + local337;
		}
		local209 = this.aClass1_Sub7_1.method5113() - local23;
		local217 = this.aClass1_Sub7_1.method5114() - local37;
		local224 = this.aClass1_Sub7_1.method5117() - local31;
		local231 = (float) Math.sqrt((double) (local217 * local217 + local209 * local209 + local224 * local224));
		local238 = 1.0F / local231;
		local209 *= local238;
		local217 *= local238;
		local224 *= local238;
		local247 = local231 / (float) this.aClass1_Sub7_1.method5120();
		local256 = 1.0F - local247 * local247;
		if (local256 < 0.0F) {
			local256 = 0.0F;
		}
		local346 = local115 * local217 + local108 * local209 + local122 * local224;
		if (local346 < 0.0F) {
			local346 = 0.0F;
		}
		@Pc(551) float local551 = local346 * local256 * 2.0F;
		if (local551 > 1.0F) {
			local551 = 1.0F;
		}
		@Pc(562) int local562 = this.aClass1_Sub7_1.method5122();
		@Pc(572) int local572 = (int) ((float) (local562 >> 16 & 0xFF) * local551);
		if (local572 > 255) {
			local572 = 255;
		}
		@Pc(589) int local589 = (int) ((float) (local562 >> 8 & 0xFF) * local551);
		if (local589 > 255) {
			local589 = 255;
		}
		@Pc(602) int local602 = (int) ((float) (local562 & 0xFF) * local551);
		if (local602 > 255) {
			local602 = 255;
		}
		if (this.aClass34_Sub2_5.aBoolean751) {
			this.aClass1_Sub28_Sub2_1.method5401((float) local23);
			this.aClass1_Sub28_Sub2_1.method5401((float) local37);
			this.aClass1_Sub28_Sub2_1.method5401((float) local31);
		} else {
			this.aClass1_Sub28_Sub2_1.method5400((float) local23);
			this.aClass1_Sub28_Sub2_1.method5400((float) local37);
			this.aClass1_Sub28_Sub2_1.method5400((float) local31);
		}
		this.aClass1_Sub28_Sub2_1.method5398(local572);
		this.aClass1_Sub28_Sub2_1.method5398(local589);
		this.aClass1_Sub28_Sub2_1.method5398(local602);
		this.aClass1_Sub28_Sub2_1.method5398(255);
		this.method583(local81);
	}
}
