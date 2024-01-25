import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class2_Sub45 extends Class2 {

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
	private int anInt10002;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "Lclient!ij;")
	private final Class13_Sub3 aClass13_Sub3_22;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "Lclient!laa;")
	private final Class2_Sub12 aClass2_Sub12_3;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "Lclient!lp;")
	private final Class91_Sub2 aClass91_Sub2_3;

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
	private final int anInt9996;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
	private final int anInt9992;

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
	private final int anInt10000;

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
	private final int anInt9999;

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
	private int anInt10001;

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "Lclient!iaa;")
	private final Interface11 anInterface11_8;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "Lclient!ia;")
	private final Interface10 anInterface10_18;

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Lclient!tba;")
	private Class323 aClass323_41;

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!ij;Lclient!lp;Lclient!laa;[I)V")
	public Class2_Sub45(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) Class91_Sub2 arg1, @OriginalArg(2) Class2_Sub12 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass13_Sub3_22 = arg0;
		this.aClass2_Sub12_3 = arg2;
		this.aClass91_Sub2_3 = arg1;
		@Pc(23) int local23 = this.aClass2_Sub12_3.method7418() - (arg1.anInt8647 >> 1);
		this.anInt9996 = this.aClass2_Sub12_3.method7415() - local23 >> arg1.anInt8641;
		this.anInt9992 = local23 + this.aClass2_Sub12_3.method7415() >> arg1.anInt8641;
		this.anInt10000 = this.aClass2_Sub12_3.method7421() - local23 >> arg1.anInt8641;
		this.anInt9999 = this.aClass2_Sub12_3.method7421() + local23 >> arg1.anInt8641;
		@Pc(77) int local77 = this.anInt9992 + 1 - this.anInt9996;
		@Pc(86) int local86 = this.anInt9999 + 1 - this.anInt10000;
		this.aFloatArrayArray15 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray16 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray14 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(140) int local140;
		@Pc(147) int local147;
		@Pc(176) int local176;
		@Pc(193) int local193;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = local115 + this.anInt10000;
			if (local122 > 0 && this.aClass91_Sub2_3.anInt8645 - 1 > local122) {
				for (local140 = 0; local140 <= local77; local140++) {
					local147 = this.anInt9996 + local140;
					if (local147 > 0 && this.aClass91_Sub2_3.anInt8650 - 1 > local147) {
						local176 = arg1.method7447(local122, local147 + 1) - arg1.method7447(local122, local147 - 1);
						local193 = arg1.method7447(local122 + 1, local147) - arg1.method7447(local122 - 1, local147);
						@Pc(208) float local208 = (float) (1.0D / Math.sqrt((double) (local176 * local176 + local193 * local193 + 65536)));
						this.aFloatArrayArray16[local140][local115] = local208 * (float) local176;
						this.aFloatArrayArray15[local140][local115] = -256.0F * local208;
						this.aFloatArrayArray14[local140][local115] = (float) local193 * local208;
					}
				}
			}
		}
		local122 = 0;
		@Pc(324) int local324;
		for (local140 = this.anInt10000; local140 <= this.anInt9999; local140++) {
			if (local140 >= 0 && local140 < arg1.anInt8645) {
				for (local147 = this.anInt9996; local147 <= this.anInt9992; local147++) {
					if (local147 >= 0 && arg1.anInt8650 > local147) {
						local176 = arg3[local122];
						@Pc(302) int[] local302 = arg1.anIntArrayArrayArray12[local147][local140];
						if (local302 != null && local176 != 0) {
							if (local176 == 1) {
								local324 = 0;
								while (local324 < local302.length) {
									if (local302[local324++] != -1 && local302[local324++] != -1 && local302[local324++] != -1) {
										this.anInt10001 += 3;
									}
								}
							} else {
								this.anInt10001 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt9992 - this.anInt9996;
			}
		}
		if (this.anInt10001 <= 0) {
			this.anInterface11_8 = null;
			this.anInterface10_18 = null;
		} else {
			this.aClass323_41 = new Class323(Static613.method8565(this.anInt10001));
			this.anInterface11_8 = this.aClass13_Sub3_22.method8288(false);
			this.anInterface11_8.method7407(this.anInt10001);
			@Pc(421) NativeHeapBuffer local421 = this.aClass13_Sub3_22.method8175(this.anInt10001 * 16, false);
			this.aStream6 = new Stream(local421);
			while (true) {
				@Pc(433) Buffer local433;
				do {
					local433 = this.anInterface11_8.method7405();
				} while (local433 == null);
				this.aStream7 = new Stream(local433);
				local122 = 0;
				local193 = 0;
				for (local324 = this.anInt10000; local324 <= this.anInt9999; local324++) {
					if (local324 >= 0 && local324 < arg1.anInt8645) {
						@Pc(473) int local473 = 0;
						for (@Pc(476) int local476 = this.anInt9996; local476 <= this.anInt9992; local476++) {
							if (local476 >= 0 && arg1.anInt8650 > local476) {
								@Pc(492) int local492 = arg3[local122];
								@Pc(499) int[] local499 = arg1.anIntArrayArrayArray12[local476][local324];
								if (local499 != null && local492 != 0) {
									if (local492 == 1) {
										@Pc(516) int[] local516 = arg1.anIntArrayArrayArray15[local476][local324];
										@Pc(523) int[] local523 = arg1.anIntArrayArrayArray11[local476][local324];
										@Pc(525) int local525 = 0;
										label118: while (true) {
											while (true) {
												if (local499.length <= local525) {
													break label118;
												}
												if (local499[local525] == -1 || local499[local525 + 1] == -1 || local499[local525 + 2] == -1) {
													local525 += 3;
												} else {
													this.method8497(local516[local525], local473, local193, local476, local324, local523[local525]);
													local525++;
													this.method8497(local516[local525], local473, local193, local476, local324, local523[local525]);
													local525++;
													this.method8497(local516[local525], local473, local193, local476, local324, local523[local525]);
													local525++;
												}
											}
										}
									} else if (local492 == 3) {
										this.method8497(0, local473, local193, local476, local324, 0);
										this.method8497(arg1.anInt8647, local473, local193, local476, local324, 0);
										this.method8497(0, local473, local193, local476, local324, arg1.anInt8647);
									} else if (local492 == 2) {
										this.method8497(arg1.anInt8647, local473, local193, local476, local324, 0);
										this.method8497(arg1.anInt8647, local473, local193, local476, local324, arg1.anInt8647);
										this.method8497(0, local473, local193, local476, local324, 0);
									} else if (local492 == 5) {
										this.method8497(arg1.anInt8647, local473, local193, local476, local324, arg1.anInt8647);
										this.method8497(0, local473, local193, local476, local324, arg1.anInt8647);
										this.method8497(arg1.anInt8647, local473, local193, local476, local324, 0);
									} else if (local492 == 4) {
										this.method8497(0, local473, local193, local476, local324, arg1.anInt8647);
										this.method8497(0, local473, local193, local476, local324, 0);
										this.method8497(arg1.anInt8647, local473, local193, local476, local324, arg1.anInt8647);
									}
								}
							}
							local473++;
							local122++;
						}
					} else {
						local122 += this.anInt9992 - this.anInt9996;
					}
					local193++;
				}
				this.aStream7.b();
				if (this.anInterface11_8.method7409()) {
					this.aStream6.b();
					this.anInterface10_18 = this.aClass13_Sub3_22.method8200(false);
					this.anInterface10_18.method8447(16, this.anInt10002 * 16, local421);
					break;
				}
				this.aStream6.f(0);
				this.aClass323_41.method7485();
			}
		}
		this.aClass323_41 = null;
		this.aStream6 = null;
		this.aFloatArrayArray16 = this.aFloatArrayArray15 = this.aFloatArrayArray14 = null;
		this.aStream7 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IS)V")
	private void method8492(@OriginalArg(1) short arg0) {
		if (Stream.c()) {
			this.aStream7.b(arg0);
		} else {
			this.aStream7.e(arg0);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII[[Z)V")
	public void method8496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface11_8 == null || (arg2 + arg0 < this.anInt9996 || (this.anInt9992 < arg0 - arg2 || (arg2 + arg1 < this.anInt10000 || this.anInt9999 < arg1 - arg2)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt10000; local54 <= this.anInt9999; local54++) {
			for (@Pc(59) int local59 = this.anInt9996; local59 <= this.anInt9992; local59++) {
				@Pc(66) int local66 = local59 - arg0;
				@Pc(71) int local71 = local54 - arg1;
				if (-arg2 < local66 && local66 < arg2 && -arg2 < local71 && local71 < arg2 && arg3[local66 + arg2][local71 + arg2]) {
					this.aClass13_Sub3_22.method8269((byte) (int) (this.aClass2_Sub12_3.method7422() * 255.0F));
					this.aClass13_Sub3_22.method8192(0, this.anInterface10_18);
					this.aClass13_Sub3_22.method8243(this.aClass13_Sub3_22.aClass258_23);
					this.aClass13_Sub3_22.method8188(0, this.anInt10002, Static339.aClass191_4, this.anInterface11_8, this.anInt10001 / 3, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIBIII)V")
	private void method8497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg3 << this.aClass91_Sub2_3.anInt8641) + arg0;
		@Pc(24) int local24 = arg5 + (arg4 << this.aClass91_Sub2_3.anInt8641);
		@Pc(31) int local31 = this.aClass91_Sub2_3.method7446(local15, local24);
		if ((arg0 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = (long) local24 << 16 & 0xFFFFL << 16 | (long) local15 & 0xFFFFL;
			@Pc(62) Class2 local62 = this.aClass323_41.method7484(local7);
			if (local62 != null) {
				this.method8492(((Class2_Sub22) local62).aShort63);
				return;
			}
		}
		@Pc(80) short local80 = (short) this.anInt10002++;
		if (local7 != -1L) {
			this.aClass323_41.method7477(new Class2_Sub22(local80), local7);
		}
		@Pc(137) float local137;
		@Pc(119) float local119;
		@Pc(128) float local128;
		@Pc(171) float local171;
		@Pc(179) float local179;
		@Pc(186) float local186;
		@Pc(193) float local193;
		@Pc(200) float local200;
		@Pc(209) float local209;
		@Pc(218) float local218;
		@Pc(245) float local245;
		if (arg0 == 0 && arg5 == 0) {
			local119 = this.aFloatArrayArray15[arg1][arg2];
			local137 = this.aFloatArrayArray16[arg1][arg2];
			local128 = this.aFloatArrayArray14[arg1][arg2];
		} else if (this.aClass91_Sub2_3.anInt8647 == arg0 && arg5 == 0) {
			local119 = this.aFloatArrayArray15[arg1 + 1][arg2];
			local128 = this.aFloatArrayArray14[arg1 + 1][arg2];
			local137 = this.aFloatArrayArray16[arg1 + 1][arg2];
		} else if (arg0 == this.aClass91_Sub2_3.anInt8647 && this.aClass91_Sub2_3.anInt8647 == arg5) {
			local137 = this.aFloatArrayArray16[arg1 + 1][arg2 + 1];
			local119 = this.aFloatArrayArray15[arg1 + 1][arg2 + 1];
			local128 = this.aFloatArrayArray14[arg1 + 1][arg2 + 1];
		} else if (arg0 == 0 && arg5 == this.aClass91_Sub2_3.anInt8647) {
			local137 = this.aFloatArrayArray16[arg1][arg2 + 1];
			local119 = this.aFloatArrayArray15[arg1][arg2 + 1];
			local128 = this.aFloatArrayArray14[arg1][arg2 + 1];
		} else {
			local171 = (float) arg0 / (float) this.aClass91_Sub2_3.anInt8647;
			local179 = (float) arg5 / (float) this.aClass91_Sub2_3.anInt8647;
			local186 = this.aFloatArrayArray16[arg1][arg2];
			local193 = this.aFloatArrayArray15[arg1][arg2];
			local200 = this.aFloatArrayArray14[arg1][arg2];
			local209 = this.aFloatArrayArray16[arg1 + 1][arg2];
			local218 = this.aFloatArrayArray15[arg1 + 1][arg2];
			@Pc(236) float local236 = local209 + (this.aFloatArrayArray16[arg1 + 1][arg2 + 1] - local209) * local171;
			local245 = this.aFloatArrayArray14[arg1 + 1][arg2];
			@Pc(260) float local260 = local186 + local171 * (this.aFloatArrayArray16[arg1][arg2 + 1] - local186);
			@Pc(276) float local276 = local193 + (this.aFloatArrayArray15[arg1][arg2 + 1] - local193) * local171;
			@Pc(292) float local292 = local200 + (this.aFloatArrayArray14[arg1][arg2 + 1] - local200) * local171;
			@Pc(310) float local310 = local218 + local171 * (this.aFloatArrayArray15[arg1 + 1][arg2 + 1] - local218);
			@Pc(327) float local327 = local245 + (this.aFloatArrayArray14[arg1 + 1][arg2 + 1] - local245) * local171;
			local119 = (local310 - local276) * local179 + local276;
			local137 = (local236 - local260) * local179 + local260;
			local128 = local292 + (local327 - local292) * local179;
		}
		local171 = (float) (this.aClass2_Sub12_3.method7415() - local15);
		local179 = (float) (this.aClass2_Sub12_3.method7420() - local31);
		local186 = (float) (this.aClass2_Sub12_3.method7421() - local24);
		local193 = (float) Math.sqrt((double) (local179 * local179 + local171 * local171 + local186 * local186));
		local200 = 1.0F / local193;
		local186 *= local200;
		local179 *= local200;
		local171 *= local200;
		local209 = local193 / (float) this.aClass2_Sub12_3.method7418();
		local218 = 1.0F - local209 * local209;
		if (local218 < 0.0F) {
			local218 = 0.0F;
		}
		local245 = local186 * local128 + local137 * local171 + local179 * local119;
		if (local245 < 0.0F) {
			local245 = 0.0F;
		}
		@Pc(547) float local547 = local245 * local218 * 2.0F;
		if (local547 > 1.0F) {
			local547 = 1.0F;
		}
		@Pc(558) int local558 = this.aClass2_Sub12_3.method7417();
		@Pc(568) int local568 = (int) ((float) (local558 >> 16 & 0xFF) * local547);
		if (local568 > 255) {
			local568 = 255;
		}
		@Pc(583) int local583 = (int) (local547 * (float) (local558 >> 8 & 0xFF));
		if (local583 > 255) {
			local583 = 255;
		}
		@Pc(598) int local598 = (int) ((float) (local558 & 0xFF) * local547);
		if (Stream.c()) {
			this.aStream6.b((float) local15);
			this.aStream6.b((float) local31);
			this.aStream6.b((float) local24);
		} else {
			this.aStream6.a((float) local15);
			this.aStream6.a((float) local31);
			this.aStream6.a((float) local24);
		}
		if (local598 > 255) {
			local598 = 255;
		}
		if (this.aClass13_Sub3_22.anInt9759 == 0) {
			this.aStream6.d(local598);
			this.aStream6.d(local583);
			this.aStream6.d(local568);
		} else {
			this.aStream6.d(local568);
			this.aStream6.d(local583);
			this.aStream6.d(local598);
		}
		this.aStream6.d(255);
		this.method8492(local80);
	}
}
