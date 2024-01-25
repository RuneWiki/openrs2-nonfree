import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class3_Sub50 extends Class3 {

	@OriginalMember(owner = "client!vq", name = "P", descriptor = "I")
	private int anInt9833;

	@OriginalMember(owner = "client!vq", name = "y", descriptor = "Lclient!cp;")
	private final Class3_Sub9 aClass3_Sub9_3;

	@OriginalMember(owner = "client!vq", name = "J", descriptor = "Lclient!tv;")
	private final Class127_Sub2 aClass127_Sub2_3;

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_42;

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
	private final int anInt9827;

	@OriginalMember(owner = "client!vq", name = "F", descriptor = "I")
	private final int anInt9831;

	@OriginalMember(owner = "client!vq", name = "L", descriptor = "I")
	private final int anInt9832;

	@OriginalMember(owner = "client!vq", name = "A", descriptor = "I")
	private final int anInt9829;

	@OriginalMember(owner = "client!vq", name = "v", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!vq", name = "H", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!vq", name = "M", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
	private int anInt9825;

	@OriginalMember(owner = "client!vq", name = "I", descriptor = "Lclient!ie;")
	private Class3_Sub26 aClass3_Sub26_7;

	@OriginalMember(owner = "client!vq", name = "O", descriptor = "Lclient!tba;")
	private Class3_Sub26_Sub2 aClass3_Sub26_Sub2_3;

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "Lclient!sba;")
	private Class297 aClass297_37;

	@OriginalMember(owner = "client!vq", name = "G", descriptor = "Lclient!lga;")
	private final Interface11 anInterface11_5;

	@OriginalMember(owner = "client!vq", name = "C", descriptor = "Lclient!vd;")
	private final Interface22 anInterface22_7;

	@OriginalMember(owner = "client!vq", name = "K", descriptor = "Lclient!mk;")
	private final Class208 aClass208_16;

	@OriginalMember(owner = "client!vq", name = "B", descriptor = "Lclient!mk;")
	private final Class208 aClass208_15;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!er;Lclient!tv;Lclient!cp;[I)V")
	public Class3_Sub50(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) Class127_Sub2 arg1, @OriginalArg(2) Class3_Sub9 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass3_Sub9_3 = arg2;
		this.aClass127_Sub2_3 = arg1;
		this.aClass31_Sub2_42 = arg0;
		@Pc(23) int local23 = this.aClass3_Sub9_3.method6000() - (arg1.anInt10009 >> 1);
		this.anInt9827 = this.aClass3_Sub9_3.method5997() - local23 >> arg1.anInt10008;
		this.anInt9831 = local23 + this.aClass3_Sub9_3.method5997() >> arg1.anInt10008;
		this.anInt9832 = this.aClass3_Sub9_3.method5999() - local23 >> arg1.anInt10008;
		this.anInt9829 = local23 + this.aClass3_Sub9_3.method5999() >> arg1.anInt10008;
		@Pc(77) int local77 = this.anInt9831 + 1 - this.anInt9827;
		@Pc(85) int local85 = this.anInt9829 + 1 - this.anInt9832;
		this.aFloatArrayArray13 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray14 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray15 = new float[local77 + 1][local85 + 1];
		@Pc(122) int local122;
		@Pc(140) int local140;
		@Pc(148) int local148;
		@Pc(178) int local178;
		@Pc(195) int local195;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local122 = local114 + this.anInt9832;
			if (local122 > 0 && local122 < this.aClass127_Sub2_3.anInt10007 - 1) {
				for (local140 = 0; local140 <= local77; local140++) {
					local148 = local140 + this.anInt9827;
					if (local148 > 0 && this.aClass127_Sub2_3.anInt10004 - 1 > local148) {
						local178 = arg1.method7862(local122, local148 + 1) - arg1.method7862(local122, local148 - 1);
						local195 = arg1.method7862(local122 + 1, local148) - arg1.method7862(local122 - 1, local148);
						@Pc(210) float local210 = (float) (1.0D / Math.sqrt((double) (local195 * local195 + local178 * local178 + 65536)));
						this.aFloatArrayArray15[local140][local114] = (float) local178 * local210;
						this.aFloatArrayArray13[local140][local114] = local210 * -256.0F;
						this.aFloatArrayArray14[local140][local114] = (float) local195 * local210;
					}
				}
			}
		}
		local122 = 0;
		@Pc(317) int local317;
		for (local140 = this.anInt9832; local140 <= this.anInt9829; local140++) {
			if (local140 >= 0 && local140 < arg1.anInt10007) {
				for (local148 = this.anInt9827; local148 <= this.anInt9831; local148++) {
					if (local148 >= 0 && local148 < arg1.anInt10004) {
						local178 = arg3[local122];
						@Pc(303) int[] local303 = arg1.anIntArrayArrayArray16[local148][local140];
						if (local303 != null && local178 != 0) {
							if (local178 == 1) {
								local317 = 0;
								while (local317 < local303.length) {
									if (local303[local317++] != -1 && local303[local317++] != -1 && local303[local317++] != -1) {
										this.anInt9825 += 3;
									}
								}
							} else {
								this.anInt9825 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt9831 - this.anInt9827;
			}
		}
		if (this.anInt9825 > 0) {
			this.aClass3_Sub26_7 = new Class3_Sub26(this.anInt9825 * 2);
			this.aClass3_Sub26_Sub2_3 = new Class3_Sub26_Sub2(this.anInt9825 * 16);
			this.aClass297_37 = new Class297(Static538.method7366(this.anInt9825));
			local148 = 0;
			local122 = 0;
			for (local178 = this.anInt9832; local178 <= this.anInt9829; local178++) {
				if (local178 >= 0 && arg1.anInt10007 > local178) {
					local195 = 0;
					for (local317 = this.anInt9827; local317 <= this.anInt9831; local317++) {
						if (local317 >= 0 && arg1.anInt10004 > local317) {
							@Pc(457) int local457 = arg3[local122];
							@Pc(464) int[] local464 = arg1.anIntArrayArrayArray16[local317][local178];
							if (local464 != null && local457 != 0) {
								if (local457 == 1) {
									@Pc(480) int[] local480 = arg1.anIntArrayArrayArray19[local317][local178];
									@Pc(487) int[] local487 = arg1.anIntArrayArrayArray18[local317][local178];
									@Pc(489) int local489 = 0;
									label106: while (true) {
										while (true) {
											if (local489 >= local464.length) {
												break label106;
											}
											if (local464[local489] == -1 || local464[local489 + 1] == -1 || local464[local489 + 2] == -1) {
												local489 += 3;
											} else {
												this.method7725(local317, local178, local487[local489], local195, local148, local480[local489]);
												local489++;
												this.method7725(local317, local178, local487[local489], local195, local148, local480[local489]);
												local489++;
												this.method7725(local317, local178, local487[local489], local195, local148, local480[local489]);
												local489++;
											}
										}
									}
								} else if (local457 == 3) {
									this.method7725(local317, local178, 0, local195, local148, 0);
									this.method7725(local317, local178, 0, local195, local148, arg1.anInt10009);
									this.method7725(local317, local178, arg1.anInt10009, local195, local148, 0);
								} else if (local457 == 2) {
									this.method7725(local317, local178, 0, local195, local148, arg1.anInt10009);
									this.method7725(local317, local178, arg1.anInt10009, local195, local148, arg1.anInt10009);
									this.method7725(local317, local178, 0, local195, local148, 0);
								} else if (local457 == 5) {
									this.method7725(local317, local178, arg1.anInt10009, local195, local148, arg1.anInt10009);
									this.method7725(local317, local178, arg1.anInt10009, local195, local148, 0);
									this.method7725(local317, local178, 0, local195, local148, arg1.anInt10009);
								} else if (local457 == 4) {
									this.method7725(local317, local178, arg1.anInt10009, local195, local148, 0);
									this.method7725(local317, local178, 0, local195, local148, 0);
									this.method7725(local317, local178, arg1.anInt10009, local195, local148, arg1.anInt10009);
								}
							}
						}
						local122++;
						local195++;
					}
				} else {
					local122 += this.anInt9831 - this.anInt9827;
				}
				local148++;
			}
			this.anInterface11_5 = this.aClass31_Sub2_42.method2571(this.aClass3_Sub26_7.anInt8703, false, this.aClass3_Sub26_7.aByteArray213);
			this.anInterface22_7 = this.aClass31_Sub2_42.method2577(16, false, this.aClass3_Sub26_Sub2_3.anInt8703, this.aClass3_Sub26_Sub2_3.aByteArray213);
			this.aClass208_16 = new Class208(this.anInterface22_7, 5126, 3, 0);
			this.aClass208_15 = new Class208(this.anInterface22_7, 5121, 4, 12);
		} else {
			this.anInterface22_7 = null;
			this.aClass208_16 = null;
			this.aClass208_15 = null;
			this.anInterface11_5 = null;
		}
		this.aClass3_Sub26_7 = null;
		this.aFloatArrayArray15 = this.aFloatArrayArray13 = this.aFloatArrayArray14 = null;
		this.aClass297_37 = null;
		this.aClass3_Sub26_Sub2_3 = null;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIII)V")
	private void method7725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg0 << this.aClass127_Sub2_3.anInt10008) + arg5;
		@Pc(23) int local23 = (arg1 << this.aClass127_Sub2_3.anInt10008) + arg2;
		@Pc(32) int local32 = this.aClass127_Sub2_3.method7860(local23, local15);
		if ((arg5 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local23 & 0xFFFFL) << 16;
			@Pc(61) Class3 local61 = this.aClass297_37.method6531(local7);
			if (local61 != null) {
				this.method7728(((Class3_Sub38) local61).aShort82);
				return;
			}
		}
		@Pc(79) short local79 = (short) this.anInt9833++;
		if (local7 != -1L) {
			this.aClass297_37.method6537(local7, new Class3_Sub38(local79));
		}
		@Pc(117) float local117;
		@Pc(126) float local126;
		@Pc(135) float local135;
		@Pc(208) float local208;
		@Pc(216) float local216;
		@Pc(223) float local223;
		@Pc(230) float local230;
		@Pc(237) float local237;
		@Pc(246) float local246;
		@Pc(255) float local255;
		@Pc(264) float local264;
		if (arg5 == 0 && arg2 == 0) {
			local117 = this.aFloatArrayArray15[arg3][arg4];
			local135 = this.aFloatArrayArray14[arg3][arg4];
			local126 = this.aFloatArrayArray13[arg3][arg4];
		} else if (arg5 == this.aClass127_Sub2_3.anInt10009 && arg2 == 0) {
			local117 = this.aFloatArrayArray15[arg3 + 1][arg4];
			local126 = this.aFloatArrayArray13[arg3 + 1][arg4];
			local135 = this.aFloatArrayArray14[arg3 + 1][arg4];
		} else if (this.aClass127_Sub2_3.anInt10009 == arg5 && arg2 == this.aClass127_Sub2_3.anInt10009) {
			local117 = this.aFloatArrayArray15[arg3 + 1][arg4 + 1];
			local126 = this.aFloatArrayArray13[arg3 + 1][arg4 + 1];
			local135 = this.aFloatArrayArray14[arg3 + 1][arg4 + 1];
		} else if (arg5 == 0 && this.aClass127_Sub2_3.anInt10009 == arg2) {
			local117 = this.aFloatArrayArray15[arg3][arg4 + 1];
			local135 = this.aFloatArrayArray14[arg3][arg4 + 1];
			local126 = this.aFloatArrayArray13[arg3][arg4 + 1];
		} else {
			local208 = (float) arg5 / (float) this.aClass127_Sub2_3.anInt10009;
			local216 = (float) arg2 / (float) this.aClass127_Sub2_3.anInt10009;
			local223 = this.aFloatArrayArray15[arg3][arg4];
			local230 = this.aFloatArrayArray13[arg3][arg4];
			local237 = this.aFloatArrayArray14[arg3][arg4];
			local246 = this.aFloatArrayArray15[arg3 + 1][arg4];
			local255 = this.aFloatArrayArray13[arg3 + 1][arg4];
			local264 = this.aFloatArrayArray14[arg3 + 1][arg4];
			@Pc(279) float local279 = local230 + (this.aFloatArrayArray13[arg3][arg4 + 1] - local230) * local208;
			@Pc(296) float local296 = local246 + local208 * (this.aFloatArrayArray15[arg3 + 1][arg4 + 1] - local246);
			@Pc(312) float local312 = local223 + local208 * (this.aFloatArrayArray15[arg3][arg4 + 1] - local223);
			@Pc(328) float local328 = local237 + (this.aFloatArrayArray14[arg3][arg4 + 1] - local237) * local208;
			@Pc(346) float local346 = local255 + (this.aFloatArrayArray13[arg3 + 1][arg4 + 1] - local255) * local208;
			local117 = (local296 - local312) * local216 + local312;
			local126 = local279 + local216 * (local346 - local279);
			@Pc(380) float local380 = local264 + local208 * (this.aFloatArrayArray14[arg3 + 1][arg4 + 1] - local264);
			local135 = local328 + local216 * (local380 - local328);
		}
		local208 = this.aClass3_Sub9_3.method5997() - local15;
		local216 = this.aClass3_Sub9_3.method5990() - local32;
		local223 = this.aClass3_Sub9_3.method5999() - local23;
		local230 = (float) Math.sqrt((double) (local223 * local223 + local216 * local216 + local208 * local208));
		local237 = 1.0F / local230;
		local216 *= local237;
		local208 *= local237;
		local223 *= local237;
		local246 = local230 / (float) this.aClass3_Sub9_3.method6000();
		local255 = (float) 1 - local246 * local246;
		if (local255 < 0.0F) {
			local255 = 0.0F;
		}
		local264 = local117 * local208 + local216 * local126 + local223 * local135;
		if (local264 < 0.0F) {
			local264 = 0.0F;
		}
		@Pc(542) float local542 = local255 * 2.0F * local264;
		if (local542 > 1.0F) {
			local542 = 1.0F;
		}
		@Pc(553) int local553 = this.aClass3_Sub9_3.method5994();
		@Pc(563) int local563 = (int) ((float) (local553 >> 16 & 0xFF) * local542);
		if (local563 > 255) {
			local563 = 255;
		}
		@Pc(578) int local578 = (int) (local542 * (float) (local553 >> 8 & 0xFF));
		if (local578 > 255) {
			local578 = 255;
		}
		@Pc(591) int local591 = (int) (local542 * (float) (local553 & 0xFF));
		if (local591 > 255) {
			local591 = 255;
		}
		if (this.aClass31_Sub2_42.aBoolean216) {
			this.aClass3_Sub26_Sub2_3.method6837((float) local15);
			this.aClass3_Sub26_Sub2_3.method6837((float) local32);
			this.aClass3_Sub26_Sub2_3.method6837((float) local23);
		} else {
			this.aClass3_Sub26_Sub2_3.method6839((float) local15);
			this.aClass3_Sub26_Sub2_3.method6839((float) local32);
			this.aClass3_Sub26_Sub2_3.method6839((float) local23);
		}
		this.aClass3_Sub26_Sub2_3.method6809(local563);
		this.aClass3_Sub26_Sub2_3.method6809(local578);
		this.aClass3_Sub26_Sub2_3.method6809(local591);
		this.aClass3_Sub26_Sub2_3.method6809(255);
		this.method7728(local79);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IS)V")
	private void method7728(@OriginalArg(1) short arg0) {
		if (this.aClass31_Sub2_42.aBoolean216) {
			this.aClass3_Sub26_7.method6769(arg0);
		} else {
			this.aClass3_Sub26_7.method6793(arg0);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[[ZIII)V")
	public void method7729(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface11_5 == null || (arg2 + arg0 < this.anInt9827 || (arg2 - arg0 > this.anInt9831 || (this.anInt9832 > arg3 + arg0 || arg3 - arg0 > this.anInt9829)))) {
			return;
		}
		for (@Pc(62) int local62 = this.anInt9832; local62 <= this.anInt9829; local62++) {
			for (@Pc(67) int local67 = this.anInt9827; local67 <= this.anInt9831; local67++) {
				@Pc(74) int local74 = local67 - arg2;
				@Pc(79) int local79 = local62 - arg3;
				if (-arg0 < local74 && local74 < arg0 && -arg0 < local79 && local79 < arg0 && arg1[arg0 + local74][local79 + arg0]) {
					this.aClass31_Sub2_42.method2572((int) (this.aClass3_Sub9_3.method5996() * 255.0F) << 24);
					this.aClass31_Sub2_42.method2537(null, this.aClass208_15, this.aClass208_16, null);
					this.aClass31_Sub2_42.method2498(this.anInt9825, 0, this.anInterface11_5);
					return;
				}
			}
		}
	}
}
