import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class4_Sub2_Sub21 extends Class4_Sub2 {

	@OriginalMember(owner = "client!pca", name = "N", descriptor = "I")
	private int anInt7699;

	@OriginalMember(owner = "client!pca", name = "K", descriptor = "I")
	private int anInt7696 = 1024;

	@OriginalMember(owner = "client!pca", name = "O", descriptor = "I")
	private int anInt7700 = 0;

	@OriginalMember(owner = "client!pca", name = "P", descriptor = "I")
	private int anInt7701 = 819;

	@OriginalMember(owner = "client!pca", name = "T", descriptor = "I")
	private int anInt7704 = 0;

	@OriginalMember(owner = "client!pca", name = "Q", descriptor = "I")
	private int anInt7702 = 2048;

	@OriginalMember(owner = "client!pca", name = "U", descriptor = "I")
	private int anInt7705 = 1024;

	@OriginalMember(owner = "client!pca", name = "V", descriptor = "I")
	private int anInt7706 = 409;

	@OriginalMember(owner = "client!pca", name = "Y", descriptor = "I")
	private int anInt7709 = 1024;

	@OriginalMember(owner = "client!pca", name = "X", descriptor = "I")
	private int anInt7708 = 1024;

	static {
		new Class162("", 73);
	}

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3011(arg0);
		if (!super.aClass135_41.aBoolean278) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass135_41.method3010();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt7705 * Static417.anInt5248 >> 12;
		@Pc(52) int local52 = this.anInt7702 * Static417.anInt5248 >> 12;
		@Pc(59) int local59 = Static38.anInt1239 * this.anInt7706 >> 12;
		@Pc(66) int local66 = this.anInt7701 * Static38.anInt1239 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt7699 = Static417.anInt5248 / 8 * this.anInt7708 >> 12;
		@Pc(90) int local90 = Static417.anInt5248 / local45 + 1;
		@Pc(94) int[][] local94 = new int[local90][3];
		@Pc(98) int[][] local98 = new int[local90][3];
		@Pc(105) Random local105 = new Random((long) this.anInt7700);
		while (true) {
			while (true) {
				@Pc(114) int local114 = local45 + Static319.method4997(local105, local52 - local45);
				@Pc(123) int local123 = Static319.method4997(local105, local66 - local59) + local59;
				@Pc(128) int local128 = local28 + local114;
				if (local128 > Static417.anInt5248) {
					local128 = Static417.anInt5248;
					local114 = Static417.anInt5248 - local28;
				}
				@Pc(142) int local142;
				@Pc(152) int local152;
				if (local34) {
					local142 = 0;
				} else {
					@Pc(146) int local146 = local30;
					@Pc(150) int[] local150 = local98[local30];
					local152 = 0;
					@Pc(157) int local157 = local128 + local22;
					if (local157 < 0) {
						local157 += Static417.anInt5248;
					}
					if (Static417.anInt5248 < local157) {
						local157 -= Static417.anInt5248;
					}
					local142 = local150[2];
					while (true) {
						@Pc(178) int[] local178 = local98[local146];
						if (local157 >= local178[0] && local178[1] >= local157) {
							if (local30 != local146) {
								@Pc(208) int local208 = local22 + local28;
								if (local208 < 0) {
									local208 += Static417.anInt5248;
								}
								if (local208 > Static417.anInt5248) {
									local208 -= Static417.anInt5248;
								}
								for (@Pc(230) int local230 = 1; local230 <= local152; local230++) {
									@Pc(240) int[] local240 = local98[(local230 + local30) % local36];
									local142 = Math.max(local142, local240[2]);
								}
								for (@Pc(252) int local252 = 0; local252 <= local152; local252++) {
									@Pc(263) int[] local263 = local98[(local30 + local252) % local36];
									@Pc(267) int local267 = local263[2];
									if (local142 != local267) {
										@Pc(278) int local278 = local263[0];
										@Pc(282) int local282 = local263[1];
										@Pc(292) int local292;
										@Pc(296) int local296;
										if (local157 > local208) {
											local292 = Math.max(local208, local278);
											local296 = Math.min(local157, local282);
										} else if (local278 == 0) {
											local292 = 0;
											local296 = Math.min(local157, local282);
										} else {
											local292 = Math.max(local208, local278);
											local296 = Static417.anInt5248;
										}
										this.method6039(local105, local296 - local292, local20, local26 + local292, local142 - local267, local267);
									}
								}
							}
							local30 = local146;
							break;
						}
						local152++;
						@Pc(192) int local192 = ~local36;
						local146++;
						if (local192 >= ~local146) {
							local146 = 0;
						}
					}
				}
				if (local123 + local142 > Static38.anInt1239) {
					local123 = Static38.anInt1239 - local142;
				} else {
					local32 = false;
				}
				@Pc(373) int[] local373;
				if (Static417.anInt5248 == local128) {
					this.method6039(local105, local114, local20, local24 + local28, local123, local142);
					if (local32) {
						return local11;
					}
					local32 = true;
					local373 = local94[local38++];
					local373[0] = local28;
					local373[2] = local123 + local142;
					local373[1] = local128;
					@Pc(389) int[][] local389 = local98;
					local98 = local94;
					local94 = local389;
					local36 = local38;
					local26 = local24;
					local38 = 0;
					local24 = Static319.method4997(local105, Static417.anInt5248);
					local28 = 0;
					local22 = local24 - local26;
					local152 = local22;
					if (local22 < 0) {
						local152 = local22 + Static417.anInt5248;
					}
					local30 = 0;
					if (Static417.anInt5248 < local152) {
						local152 -= Static417.anInt5248;
					}
					local34 = false;
					while (true) {
						@Pc(434) int[] local434 = local98[local30];
						if (local434[0] <= local152 && local152 <= local434[1]) {
							break;
						}
						local30++;
						if (local36 <= local30) {
							local30 = 0;
						}
					}
				} else {
					local373 = local94[local38++];
					local373[1] = local128;
					local373[2] = local123 + local142;
					local373[0] = local28;
					this.method6039(local105, local114, local20, local24 + local28, local123, local142);
					local28 = local128;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BLjava/util/Random;I[[IIII)V")
	private void method6039(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(26) int local26 = this.anInt7709 > 0 ? 4096 - Static319.method4997(arg0, this.anInt7709) : 4096;
		@Pc(34) int local34 = this.anInt7696 * this.anInt7699 >> 12;
		@Pc(49) int local49 = this.anInt7699 - (local34 <= 0 ? 0 : Static319.method4997(arg0, local34));
		if (arg3 >= Static417.anInt5248) {
			arg3 -= Static417.anInt5248;
		}
		@Pc(70) int local70;
		@Pc(74) int local74;
		if (local49 > 0) {
			if (arg4 > 0 && arg1 > 0) {
				local70 = arg1 / 2;
				local74 = arg4 / 2;
				@Pc(81) int local81 = local70 >= local49 ? local49 : local70;
				@Pc(88) int local88 = local49 > local74 ? local74 : local49;
				@Pc(92) int local92 = local81 + arg3;
				@Pc(99) int local99 = arg1 - local81 * 2;
				for (@Pc(101) int local101 = 0; local101 < arg4; local101++) {
					@Pc(109) int[] local109 = arg2[arg5 + local101];
					@Pc(118) int local118;
					@Pc(126) int local126;
					@Pc(134) int local134;
					if (local101 < local88) {
						local118 = local101 * local26 / local88;
						if (this.anInt7704 == 0) {
							for (local126 = 0; local126 < local81; local126++) {
								local134 = local126 * local26 / local81;
								local109[Static359.anInt6929 & local126 + arg3] = local109[arg3 + arg1 - local126 - 1 & Static359.anInt6929] = local118 * local134 >> 12;
							}
						} else {
							for (local126 = 0; local126 < local81; local126++) {
								local134 = local126 * local26 / local81;
								local109[Static359.anInt6929 & local126 + arg3] = local109[Static359.anInt6929 & arg3 + arg1 - local126 - 1] = local118 <= local134 ? local118 : local134;
							}
						}
						if (local99 + local92 > Static417.anInt5248) {
							local126 = Static417.anInt5248 - local92;
							Static599.method3056(local109, local92, local126, local118);
							Static599.method3056(local109, 0, local99 - local126, local118);
						} else {
							Static599.method3056(local109, local92, local99, local118);
						}
					} else {
						local118 = arg4 - local101 - 1;
						if (local118 < local88) {
							local126 = local26 * local118 / local88;
							@Pc(275) int local275;
							if (this.anInt7704 == 0) {
								for (local134 = 0; local134 < local81; local134++) {
									local275 = local26 * local134 / local81;
									local109[arg3 + local134 & Static359.anInt6929] = local109[Static359.anInt6929 & arg1 + arg3 - local134 - 1] = local126 * local275 >> 12;
								}
							} else {
								for (local134 = 0; local134 < local81; local134++) {
									local275 = local26 * local134 / local81;
									local109[arg3 + local134 & Static359.anInt6929] = local109[Static359.anInt6929 & arg3 + arg1 - local134 - 1] = local275 < local126 ? local275 : local126;
								}
							}
							if (Static417.anInt5248 < local99 + local92) {
								local134 = Static417.anInt5248 - local92;
								Static599.method3056(local109, local92, local134, local126);
								Static599.method3056(local109, 0, local99 - local134, local126);
							} else {
								Static599.method3056(local109, local92, local99, local126);
							}
						} else {
							for (local126 = 0; local126 < local81; local126++) {
								local109[arg3 + local126 & Static359.anInt6929] = local109[Static359.anInt6929 & arg1 + arg3 - local126 - 1] = local26 * local126 / local81;
							}
							if (local92 + local99 <= Static417.anInt5248) {
								Static599.method3056(local109, local92, local99, local26);
							} else {
								local134 = Static417.anInt5248 - local92;
								Static599.method3056(local109, local92, local134, local26);
								Static599.method3056(local109, 0, local99 - local134, local26);
							}
						}
					}
				}
			}
		} else if (arg3 + arg1 <= Static417.anInt5248) {
			for (local70 = 0; local70 < arg4; local70++) {
				Static599.method3056(arg2[local70 + arg5], arg3, arg1, local26);
			}
		} else {
			local70 = Static417.anInt5248 - arg3;
			for (local74 = 0; local74 < arg4; local74++) {
				@Pc(507) int[] local507 = arg2[arg5 + local74];
				Static599.method3056(local507, arg3, local70, local26);
				Static599.method3056(local507, 0, arg1 - local70, local26);
			}
		}
	}

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)V")
	@Override
	public void method8210() {
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7700 = arg0.method7004();
		} else if (arg1 == 1) {
			this.anInt7705 = arg0.method7054();
		} else if (arg1 == 2) {
			this.anInt7702 = arg0.method7054();
		} else if (arg1 == 3) {
			this.anInt7706 = arg0.method7054();
		} else if (arg1 == 4) {
			this.anInt7701 = arg0.method7054();
		} else if (arg1 == 5) {
			this.anInt7708 = arg0.method7054();
		} else if (arg1 == 6) {
			this.anInt7704 = arg0.method7004();
		} else if (arg1 == 7) {
			this.anInt7696 = arg0.method7054();
		} else if (arg1 == 8) {
			this.anInt7709 = arg0.method7054();
		}
	}
}
