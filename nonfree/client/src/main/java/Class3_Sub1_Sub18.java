import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class3_Sub1_Sub18 extends Class3_Sub1 {

	@OriginalMember(owner = "client!nr", name = "z", descriptor = "I")
	private int anInt6926;

	@OriginalMember(owner = "client!nr", name = "H", descriptor = "I")
	private int anInt6922 = 1024;

	@OriginalMember(owner = "client!nr", name = "B", descriptor = "I")
	private int anInt6925 = 0;

	@OriginalMember(owner = "client!nr", name = "A", descriptor = "I")
	private int anInt6921 = 819;

	@OriginalMember(owner = "client!nr", name = "P", descriptor = "I")
	private int anInt6923 = 1024;

	@OriginalMember(owner = "client!nr", name = "G", descriptor = "I")
	private int anInt6920 = 1024;

	@OriginalMember(owner = "client!nr", name = "N", descriptor = "I")
	private int anInt6917 = 409;

	@OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
	private int anInt6927 = 0;

	@OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
	private int anInt6929 = 2048;

	@OriginalMember(owner = "client!nr", name = "O", descriptor = "I")
	private int anInt6930 = 1024;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
	@Override
	public void method9578() {
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt6925 = arg1.method2048(255);
		} else if (arg0 == 1) {
			this.anInt6923 = arg1.method2028(-14795);
		} else if (arg0 == 2) {
			this.anInt6929 = arg1.method2028(-14795);
		} else if (arg0 == 3) {
			this.anInt6917 = arg1.method2028(-14795);
		} else if (arg0 == 4) {
			this.anInt6921 = arg1.method2028(-14795);
		} else if (arg0 == 5) {
			this.anInt6930 = arg1.method2028(-14795);
		} else if (arg0 == 6) {
			this.anInt6927 = arg1.method2048(255);
		} else if (arg0 == 7) {
			this.anInt6922 = arg1.method2028(-14795);
		} else if (arg0 == 8) {
			this.anInt6920 = arg1.method2028(-14795);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILjava/util/Random;IB[[III)V")
	private void method5984(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) int local20 = this.anInt6920 > 0 ? 4096 - Static19.method614(arg1, this.anInt6920) : 4096;
		@Pc(42) int local42 = this.anInt6922 * this.anInt6926 >> 12;
		@Pc(55) int local55 = this.anInt6926 - (local42 > 0 ? Static19.method614(arg1, local42) : 0);
		if (arg4 >= Static379.anInt5859) {
			arg4 -= Static379.anInt5859;
		}
		@Pc(81) int local81;
		@Pc(114) int local114;
		if (local55 <= 0) {
			if (Static379.anInt5859 >= arg4 + arg2) {
				for (local81 = 0; local81 < arg5; local81++) {
					Static732.method6314(arg3[local81 + arg0], arg4, arg2, local20);
				}
			} else {
				local81 = Static379.anInt5859 - arg4;
				for (local114 = 0; local114 < arg5; local114++) {
					@Pc(122) int[] local122 = arg3[local114 + arg0];
					Static732.method6314(local122, arg4, local81, local20);
					Static732.method6314(local122, 0, arg2 - local81, local20);
				}
			}
		} else if (arg5 > 0 && arg2 > 0) {
			local81 = arg2 / 2;
			local114 = arg5 / 2;
			@Pc(168) int local168 = local81 >= local55 ? local55 : local81;
			@Pc(180) int local180 = local55 > local114 ? local114 : local55;
			@Pc(184) int local184 = arg4 + local168;
			@Pc(191) int local191 = arg2 - local168 * 2;
			for (@Pc(193) int local193 = 0; local193 < arg5; local193++) {
				@Pc(201) int[] local201 = arg3[local193 + arg0];
				@Pc(214) int local214;
				@Pc(219) int local219;
				@Pc(227) int local227;
				if (local180 > local193) {
					local214 = local193 * local20 / local180;
					if (this.anInt6927 == 0) {
						for (local219 = 0; local219 < local168; local219++) {
							local227 = local20 * local219 / local168;
							local201[Static711.anInt10997 & local219 + arg4] = local201[arg4 + arg2 - local219 - 1 & Static711.anInt10997] = local227 * local214 >> 12;
						}
					} else {
						for (local219 = 0; local219 < local168; local219++) {
							local227 = local20 * local219 / local168;
							local201[local219 + arg4 & Static711.anInt10997] = local201[Static711.anInt10997 & arg4 + arg2 - local219 - 1] = local227 < local214 ? local227 : local214;
						}
					}
					if (Static379.anInt5859 >= local184 + local191) {
						Static732.method6314(local201, local184, local191, local214);
					} else {
						local219 = Static379.anInt5859 - local184;
						Static732.method6314(local201, local184, local219, local214);
						Static732.method6314(local201, 0, local191 - local219, local214);
					}
				} else {
					local214 = arg5 - local193 - 1;
					if (local214 < local180) {
						local219 = local20 * local214 / local180;
						@Pc(376) int local376;
						if (this.anInt6927 == 0) {
							for (local227 = 0; local227 < local168; local227++) {
								local376 = local20 * local227 / local168;
								local201[Static711.anInt10997 & local227 + arg4] = local201[Static711.anInt10997 & arg4 + arg2 - local227 - 1] = local376 * local219 >> 12;
							}
						} else {
							for (local227 = 0; local227 < local168; local227++) {
								local376 = local227 * local20 / local168;
								local201[local227 + arg4 & Static711.anInt10997] = local201[arg2 + arg4 - local227 - 1 & Static711.anInt10997] = local219 <= local376 ? local219 : local376;
							}
						}
						if (Static379.anInt5859 < local191 + local184) {
							local227 = Static379.anInt5859 - local184;
							Static732.method6314(local201, local184, local227, local219);
							Static732.method6314(local201, 0, local191 - local227, local219);
						} else {
							Static732.method6314(local201, local184, local191, local219);
						}
					} else {
						for (local219 = 0; local219 < local168; local219++) {
							local201[Static711.anInt10997 & arg4 + local219] = local201[Static711.anInt10997 & arg2 + arg4 - local219 - 1] = local20 * local219 / local168;
						}
						if (Static379.anInt5859 >= local191 + local184) {
							Static732.method6314(local201, local184, local191, local20);
						} else {
							local227 = Static379.anInt5859 - local184;
							Static732.method6314(local201, local184, local227, local20);
							Static732.method6314(local201, 0, local191 - local227, local20);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass305_41.method6989(arg0);
		if (!super.aClass305_41.aBoolean550) {
			return local17;
		}
		@Pc(26) int[][] local26 = super.aClass305_41.method6986();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt6923 * Static379.anInt5859 >> 12;
		@Pc(58) int local58 = this.anInt6929 * Static379.anInt5859 >> 12;
		@Pc(65) int local65 = Static24.anInt740 * this.anInt6917 >> 12;
		@Pc(72) int local72 = this.anInt6921 * Static24.anInt740 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt6926 = this.anInt6930 * (Static379.anInt5859 / 8) >> 12;
		@Pc(96) int local96 = Static379.anInt5859 / local51 + 1;
		@Pc(100) int[][] local100 = new int[local96][3];
		@Pc(104) int[][] local104 = new int[local96][3];
		@Pc(111) Random local111 = new Random((long) this.anInt6925);
		while (true) {
			while (true) {
				@Pc(121) int local121 = local51 + Static19.method614(local111, local58 - local51);
				@Pc(133) int local133 = local65 + Static19.method614(local111, local72 - local65);
				@Pc(138) int local138 = local34 + local121;
				if (local138 > Static379.anInt5859) {
					local138 = Static379.anInt5859;
					local121 = Static379.anInt5859 - local34;
				}
				@Pc(158) int local158;
				@Pc(168) int local168;
				if (local40) {
					local158 = 0;
				} else {
					@Pc(162) int local162 = local36;
					@Pc(166) int[] local166 = local104[local36];
					local168 = 0;
					@Pc(172) int local172 = local28 + local138;
					if (local172 < 0) {
						local172 += Static379.anInt5859;
					}
					if (Static379.anInt5859 < local172) {
						local172 -= Static379.anInt5859;
					}
					while (true) {
						@Pc(192) int[] local192 = local104[local162];
						if (local172 >= local192[0] && local172 <= local192[1]) {
							local158 = local166[2];
							if (local162 != local36) {
								@Pc(236) int local236 = local28 + local34;
								if (local236 < 0) {
									local236 += Static379.anInt5859;
								}
								if (Static379.anInt5859 < local236) {
									local236 -= Static379.anInt5859;
								}
								for (@Pc(255) int local255 = 1; local255 <= local168; local255++) {
									@Pc(265) int[] local265 = local104[(local255 + local36) % local42];
									local158 = Math.max(local158, local265[2]);
								}
								for (@Pc(281) int local281 = 0; local281 <= local168; local281++) {
									@Pc(291) int[] local291 = local104[(local281 + local36) % local42];
									@Pc(295) int local295 = local291[2];
									if (local158 != local295) {
										@Pc(302) int local302 = local291[0];
										@Pc(306) int local306 = local291[1];
										@Pc(322) int local322;
										@Pc(320) int local320;
										if (local236 < local172) {
											local322 = Math.max(local236, local302);
											local320 = Math.min(local172, local306);
										} else if (local302 == 0) {
											local320 = Math.min(local172, local306);
											local322 = 0;
										} else {
											local322 = Math.max(local236, local302);
											local320 = Static379.anInt5859;
										}
										this.method5984(local295, local111, local320 - local322, local26, local322 + local32, -local295 + local158);
									}
								}
							}
							local36 = local162;
							break;
						}
						local162++;
						if (local42 <= local162) {
							local162 = 0;
						}
						local168++;
					}
				}
				if (local133 + local158 > Static24.anInt740) {
					local133 = Static24.anInt740 - local158;
				} else {
					local38 = false;
				}
				@Pc(397) int[] local397;
				if (Static379.anInt5859 == local138) {
					this.method5984(local158, local111, local121, local26, local34 + local30, local133);
					if (local38) {
						return local17;
					}
					local38 = true;
					local397 = local100[local44++];
					local397[2] = local158 + local133;
					local397[1] = local138;
					local397[0] = local34;
					@Pc(462) int[][] local462 = local104;
					local104 = local100;
					local100 = local462;
					local42 = local44;
					local44 = 0;
					local32 = local30;
					local30 = Static19.method614(local111, Static379.anInt5859);
					local34 = 0;
					local28 = local30 - local32;
					local168 = local28;
					if (local28 < 0) {
						local168 = local28 + Static379.anInt5859;
					}
					if (local168 > Static379.anInt5859) {
						local168 -= Static379.anInt5859;
					}
					local36 = 0;
					local40 = false;
					while (true) {
						@Pc(511) int[] local511 = local104[local36];
						if (local511[0] <= local168 && local168 <= local511[1]) {
							break;
						}
						local36++;
						if (local36 >= local42) {
							local36 = 0;
						}
					}
				} else {
					local397 = local100[local44++];
					local397[1] = local138;
					local397[0] = local34;
					local397[2] = local133 + local158;
					this.method5984(local158, local111, local121, local26, local30 + local34, local133);
					local34 = local138;
				}
			}
		}
	}
}
