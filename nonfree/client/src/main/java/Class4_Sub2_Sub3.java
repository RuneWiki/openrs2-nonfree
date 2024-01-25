import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class4_Sub2_Sub3 extends Class4_Sub2 {

	@OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
	private int anInt1272 = 6;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub3() {
		super(2, false);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(30) int[][] local30 = this.method8202(arg0, 0);
			@Pc(36) int[][] local36 = this.method8202(arg0, 1);
			@Pc(40) int[] local40 = local20[0];
			@Pc(44) int[] local44 = local20[1];
			@Pc(48) int[] local48 = local20[2];
			@Pc(52) int[] local52 = local30[0];
			@Pc(56) int[] local56 = local30[1];
			@Pc(60) int[] local60 = local30[2];
			@Pc(64) int[] local64 = local36[0];
			@Pc(68) int[] local68 = local36[1];
			@Pc(72) int[] local72 = local36[2];
			@Pc(75) int local75 = this.anInt1272;
			if (local75 == 1) {
				for (local75 = 0; local75 < Static417.anInt5248; local75++) {
					local40[local75] = local52[local75] + local64[local75];
					local44[local75] = local56[local75] + local68[local75];
					local48[local75] = local60[local75] + local72[local75];
				}
			} else if (local75 == 2) {
				for (local75 = 0; local75 < Static417.anInt5248; local75++) {
					local40[local75] = local52[local75] - local64[local75];
					local44[local75] = local56[local75] - local68[local75];
					local48[local75] = local60[local75] - local72[local75];
				}
			} else if (local75 == 3) {
				for (local75 = 0; local75 < Static417.anInt5248; local75++) {
					local40[local75] = local64[local75] * local52[local75] >> 12;
					local44[local75] = local56[local75] * local68[local75] >> 12;
					local48[local75] = local72[local75] * local60[local75] >> 12;
				}
			} else {
				@Pc(266) int local266;
				@Pc(270) int local270;
				@Pc(262) int local262;
				if (local75 == 4) {
					for (local75 = 0; local75 < Static417.anInt5248; local75++) {
						local262 = local72[local75];
						local266 = local64[local75];
						local270 = local68[local75];
						local40[local75] = local266 == 0 ? 4096 : (local52[local75] << 12) / local266;
						local44[local75] = local270 == 0 ? 4096 : (local56[local75] << 12) / local270;
						local48[local75] = local262 == 0 ? 4096 : (local60[local75] << 12) / local262;
					}
				} else if (local75 == 5) {
					for (local75 = 0; local75 < Static417.anInt5248; local75++) {
						local40[local75] = 4096 - ((4096 - local52[local75]) * (4096 - local64[local75]) >> 12);
						local44[local75] = 4096 - ((4096 - local68[local75]) * (-local56[local75] + 4096) >> 12);
						local48[local75] = 4096 - ((4096 - local72[local75]) * (-local60[local75] + 4096) >> 12);
					}
				} else if (local75 == 6) {
					for (local75 = 0; local75 < Static417.anInt5248; local75++) {
						local262 = local72[local75];
						local270 = local68[local75];
						local266 = local64[local75];
						local40[local75] = local266 < 2048 ? local266 * local52[local75] >> 11 : 4096 - ((4096 - local266) * (-local52[local75] + 4096) >> 11);
						local44[local75] = local270 < 2048 ? local270 * local56[local75] >> 11 : 4096 - ((4096 - local56[local75]) * (-local270 + 4096) >> 11);
						local48[local75] = local262 >= 2048 ? 4096 - ((4096 - local60[local75]) * (-local262 + 4096) >> 11) : local60[local75] * local262 >> 11;
					}
				} else {
					@Pc(521) int local521;
					@Pc(529) int local529;
					@Pc(525) int local525;
					if (local75 == 7) {
						for (local75 = 0; local75 < Static417.anInt5248; local75++) {
							local521 = local52[local75];
							local525 = local60[local75];
							local529 = local56[local75];
							local40[local75] = local521 == 4096 ? 4096 : (local64[local75] << 12) / (4096 - local521);
							local44[local75] = local529 == 4096 ? 4096 : (local68[local75] << 12) / (4096 - local529);
							local48[local75] = local525 == 4096 ? 4096 : (local72[local75] << 12) / (4096 - local525);
						}
					} else if (local75 == 8) {
						for (local75 = 0; local75 < Static417.anInt5248; local75++) {
							local525 = local60[local75];
							local521 = local52[local75];
							local529 = local56[local75];
							local40[local75] = local521 == 0 ? 0 : 4096 - (4096 - local64[local75] << 12) / local521;
							local44[local75] = local529 == 0 ? 0 : 4096 - (4096 - local68[local75] << 12) / local529;
							local48[local75] = local525 == 0 ? 0 : 4096 - (4096 - local72[local75] << 12) / local525;
						}
					} else if (local75 == 9) {
						for (local75 = 0; local75 < Static417.anInt5248; local75++) {
							local266 = local64[local75];
							local529 = local56[local75];
							local525 = local60[local75];
							local270 = local68[local75];
							local262 = local72[local75];
							local521 = local52[local75];
							local40[local75] = local266 > local521 ? local521 : local266;
							local44[local75] = local529 >= local270 ? local270 : local529;
							local48[local75] = local525 >= local262 ? local262 : local525;
						}
					} else if (local75 == 10) {
						for (local75 = 0; local75 < Static417.anInt5248; local75++) {
							local262 = local72[local75];
							local529 = local56[local75];
							local266 = local64[local75];
							local525 = local60[local75];
							local270 = local68[local75];
							local521 = local52[local75];
							local40[local75] = local521 <= local266 ? local266 : local521;
							local44[local75] = local529 > local270 ? local529 : local270;
							local48[local75] = local262 < local525 ? local525 : local262;
						}
					} else if (local75 == 11) {
						for (local75 = 0; local75 < Static417.anInt5248; local75++) {
							local529 = local56[local75];
							local521 = local52[local75];
							local270 = local68[local75];
							local262 = local72[local75];
							local525 = local60[local75];
							local266 = local64[local75];
							local40[local75] = local266 >= local521 ? local266 - local521 : local521 + -local266;
							local44[local75] = local529 > local270 ? local529 - local270 : local270 - local529;
							local48[local75] = local262 >= local525 ? local262 - local525 : -local262 + local525;
						}
					} else if (local75 == 12) {
						for (local75 = 0; local75 < Static417.anInt5248; local75++) {
							local521 = local52[local75];
							local266 = local64[local75];
							local529 = local56[local75];
							local525 = local60[local75];
							local262 = local72[local75];
							local270 = local68[local75];
							local40[local75] = local521 + local266 - (local266 * local521 >> 11);
							local44[local75] = local270 + local529 - (local270 * local529 >> 11);
							local48[local75] = local525 + local262 - (local525 * local262 >> 11);
						}
					}
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1272 = arg0.method7004();
		} else if (arg1 == 1) {
			super.aBoolean713 = arg0.method7004() == 1;
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(20) int[] local20 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(30) int[] local30 = this.method8208(0, arg0);
			@Pc(36) int[] local36 = this.method8208(1, arg0);
			@Pc(39) int local39 = this.anInt1272;
			if (local39 == 1) {
				for (local39 = 0; local39 < Static417.anInt5248; local39++) {
					local20[local39] = local36[local39] + local30[local39];
				}
			} else if (local39 == 2) {
				for (local39 = 0; local39 < Static417.anInt5248; local39++) {
					local20[local39] = local30[local39] - local36[local39];
				}
			} else if (local39 == 3) {
				for (local39 = 0; local39 < Static417.anInt5248; local39++) {
					local20[local39] = local30[local39] * local36[local39] >> 12;
				}
			} else {
				@Pc(168) int local168;
				if (local39 == 4) {
					for (local39 = 0; local39 < Static417.anInt5248; local39++) {
						local168 = local36[local39];
						local20[local39] = local168 == 0 ? 4096 : (local30[local39] << 12) / local168;
					}
				} else if (local39 == 5) {
					for (local39 = 0; local39 < Static417.anInt5248; local39++) {
						local20[local39] = 4096 - ((4096 - local36[local39]) * (-local30[local39] + 4096) >> 12);
					}
				} else if (local39 == 6) {
					for (local39 = 0; local39 < Static417.anInt5248; local39++) {
						local168 = local36[local39];
						local20[local39] = local168 >= 2048 ? 4096 - ((4096 - local30[local39]) * (4096 - local168) >> 11) : local30[local39] * local168 >> 11;
					}
				} else {
					@Pc(276) int local276;
					if (local39 == 7) {
						for (local39 = 0; local39 < Static417.anInt5248; local39++) {
							local276 = local30[local39];
							local20[local39] = local276 == 4096 ? 4096 : (local36[local39] << 12) / (4096 - local276);
						}
					} else if (local39 == 8) {
						for (local39 = 0; local39 < Static417.anInt5248; local39++) {
							local276 = local30[local39];
							local20[local39] = local276 == 0 ? 0 : 4096 - (4096 - local36[local39] << 12) / local276;
						}
					} else if (local39 == 9) {
						for (local39 = 0; local39 < Static417.anInt5248; local39++) {
							local168 = local36[local39];
							local276 = local30[local39];
							local20[local39] = local276 >= local168 ? local168 : local276;
						}
					} else if (local39 == 10) {
						for (local39 = 0; local39 < Static417.anInt5248; local39++) {
							local276 = local30[local39];
							local168 = local36[local39];
							local20[local39] = local276 <= local168 ? local168 : local276;
						}
					} else if (local39 == 11) {
						for (local39 = 0; local39 < Static417.anInt5248; local39++) {
							local168 = local36[local39];
							local276 = local30[local39];
							local20[local39] = local276 > local168 ? local276 - local168 : -local276 + local168;
						}
					} else if (local39 == 12) {
						for (local39 = 0; local39 < Static417.anInt5248; local39++) {
							local168 = local36[local39];
							local276 = local30[local39];
							local20[local39] = local276 + local168 - (local168 * local276 >> 11);
						}
					}
				}
			}
		}
		return local20;
	}
}
