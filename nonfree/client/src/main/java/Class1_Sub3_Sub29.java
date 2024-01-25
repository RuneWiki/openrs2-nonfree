import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class1_Sub3_Sub29 extends Class1_Sub3 {

	@OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
	private int anInt7308;

	@OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
	private int anInt7299 = 2048;

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
	private int anInt7300 = 1024;

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
	private int anInt7298 = 0;

	@OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
	private int anInt7309 = 819;

	@OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
	private int anInt7307 = 1024;

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
	private int anInt7302 = 1024;

	@OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
	private int anInt7304 = 1024;

	@OriginalMember(owner = "client!rd", name = "fb", descriptor = "I")
	private int anInt7313 = 409;

	@OriginalMember(owner = "client!rd", name = "db", descriptor = "I")
	private int anInt7312 = 0;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt7312 = arg1.method4487();
		} else if (arg0 == 1) {
			this.anInt7300 = arg1.method4494();
		} else if (arg0 == 2) {
			this.anInt7299 = arg1.method4494();
		} else if (arg0 == 3) {
			this.anInt7313 = arg1.method4494();
		} else if (arg0 == 4) {
			this.anInt7309 = arg1.method4494();
		} else if (arg0 == 5) {
			this.anInt7302 = arg1.method4494();
		} else if (arg0 == 6) {
			this.anInt7298 = arg1.method4487();
		} else if (arg0 == 7) {
			this.anInt7304 = arg1.method4494();
		} else if (arg0 == 8) {
			this.anInt7307 = arg1.method4494();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/util/Random;[[IIIII)V")
	private void method6566(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = this.anInt7307 <= 0 ? 4096 : 4096 - Static438.method6797(this.anInt7307, arg1);
		@Pc(30) int local30 = this.anInt7304 * this.anInt7308 >> 12;
		@Pc(43) int local43 = this.anInt7308 - (local30 <= 0 ? 0 : Static438.method6797(local30, arg1));
		if (arg4 >= Static254.anInt4973) {
			arg4 -= Static254.anInt4973;
		}
		@Pc(67) int local67;
		@Pc(93) int local93;
		if (local43 <= 0) {
			if (arg4 + arg5 <= Static254.anInt4973) {
				for (local67 = 0; local67 < arg0; local67++) {
					Static556.method7040(arg2[arg3 + local67], arg4, arg5, local22);
				}
			} else {
				local67 = Static254.anInt4973 - arg4;
				for (local93 = 0; local93 < arg0; local93++) {
					@Pc(101) int[] local101 = arg2[local93 + arg3];
					Static556.method7040(local101, arg4, local67, local22);
					Static556.method7040(local101, 0, arg5 - local67, local22);
				}
			}
		} else if (arg0 > 0 && arg5 > 0) {
			local67 = arg5 / 2;
			local93 = arg0 / 2;
			@Pc(145) int local145 = local67 >= local43 ? local43 : local67;
			@Pc(156) int local156 = local93 < local43 ? local93 : local43;
			@Pc(160) int local160 = local145 + arg4;
			@Pc(167) int local167 = arg5 - local145 * 2;
			for (@Pc(169) int local169 = 0; local169 < arg0; local169++) {
				@Pc(178) int[] local178 = arg2[local169 + arg3];
				@Pc(187) int local187;
				@Pc(195) int local195;
				@Pc(203) int local203;
				if (local169 < local156) {
					local187 = local22 * local169 / local156;
					if (this.anInt7298 == 0) {
						for (local195 = 0; local195 < local145; local195++) {
							local203 = local195 * local22 / local145;
							local178[arg4 + local195 & Static184.anInt3830] = local178[arg5 + arg4 - local195 - 1 & Static184.anInt3830] = local203 * local187 >> 12;
						}
					} else {
						for (local195 = 0; local195 < local145; local195++) {
							local203 = local22 * local195 / local145;
							local178[Static184.anInt3830 & arg4 + local195] = local178[Static184.anInt3830 & arg4 + arg5 - local195 - 1] = local187 > local203 ? local203 : local187;
						}
					}
					if (local167 + local160 > Static254.anInt4973) {
						local195 = Static254.anInt4973 - local160;
						Static556.method7040(local178, local160, local195, local187);
						Static556.method7040(local178, 0, local167 - local195, local187);
					} else {
						Static556.method7040(local178, local160, local167, local187);
					}
				} else {
					local187 = arg0 - local169 - 1;
					if (local156 > local187) {
						local195 = local22 * local187 / local156;
						@Pc(345) int local345;
						if (this.anInt7298 == 0) {
							for (local203 = 0; local203 < local145; local203++) {
								local345 = local22 * local203 / local145;
								local178[Static184.anInt3830 & arg4 + local203] = local178[arg5 + arg4 - local203 - 1 & Static184.anInt3830] = local345 * local195 >> 12;
							}
						} else {
							for (local203 = 0; local203 < local145; local203++) {
								local345 = local203 * local22 / local145;
								local178[local203 + arg4 & Static184.anInt3830] = local178[arg4 + arg5 - local203 - 1 & Static184.anInt3830] = local195 > local345 ? local345 : local195;
							}
						}
						if (local160 + local167 <= Static254.anInt4973) {
							Static556.method7040(local178, local160, local167, local195);
						} else {
							local203 = Static254.anInt4973 - local160;
							Static556.method7040(local178, local160, local203, local195);
							Static556.method7040(local178, 0, local167 - local203, local195);
						}
					} else {
						for (local195 = 0; local195 < local145; local195++) {
							local178[local195 + arg4 & Static184.anInt3830] = local178[arg4 + arg5 - local195 - 1 & Static184.anInt3830] = local22 * local195 / local145;
						}
						if (Static254.anInt4973 < local160 + local167) {
							local203 = Static254.anInt4973 - local160;
							Static556.method7040(local178, local160, local203, local22);
							Static556.method7040(local178, 0, local167 - local203, local22);
						} else {
							Static556.method7040(local178, local160, local167, local22);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	@Override
	public void method8197() {
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass222_41.method5913(arg0);
		if (!super.aClass222_41.aBoolean485) {
			return local16;
		}
		@Pc(25) int[][] local25 = super.aClass222_41.method5915();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = Static254.anInt4973 * this.anInt7300 >> 12;
		@Pc(57) int local57 = Static254.anInt4973 * this.anInt7299 >> 12;
		@Pc(64) int local64 = Static426.anInt7423 * this.anInt7313 >> 12;
		@Pc(71) int local71 = this.anInt7309 * Static426.anInt7423 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt7308 = Static254.anInt4973 / 8 * this.anInt7302 >> 12;
		@Pc(96) int local96 = Static254.anInt4973 / local50 + 1;
		@Pc(100) int[][] local100 = new int[local96][3];
		@Pc(104) int[][] local104 = new int[local96][3];
		@Pc(111) Random local111 = new Random((long) this.anInt7312);
		while (true) {
			while (true) {
				@Pc(121) int local121 = Static438.method6797(local57 - local50, local111) + local50;
				@Pc(131) int local131 = Static438.method6797(local71 - local64, local111) + local64;
				@Pc(135) int local135 = local121 + local33;
				if (Static254.anInt4973 < local135) {
					local121 = Static254.anInt4973 - local33;
					local135 = Static254.anInt4973;
				}
				@Pc(153) int local153;
				@Pc(163) int local163;
				if (local39) {
					local153 = 0;
				} else {
					@Pc(157) int local157 = local35;
					@Pc(161) int[] local161 = local104[local35];
					local163 = 0;
					@Pc(167) int local167 = local135 + local27;
					if (local167 < 0) {
						local167 += Static254.anInt4973;
					}
					if (Static254.anInt4973 < local167) {
						local167 -= Static254.anInt4973;
					}
					local153 = local161[2];
					while (true) {
						@Pc(191) int[] local191 = local104[local157];
						if (local191[0] <= local167 && local167 <= local191[1]) {
							if (local35 != local157) {
								@Pc(218) int local218 = local33 + local27;
								if (local218 < 0) {
									local218 += Static254.anInt4973;
								}
								if (Static254.anInt4973 < local218) {
									local218 -= Static254.anInt4973;
								}
								for (@Pc(237) int local237 = 1; local237 <= local163; local237++) {
									@Pc(247) int[] local247 = local104[(local35 + local237) % local41];
									local153 = Math.max(local153, local247[2]);
								}
								for (@Pc(263) int local263 = 0; local263 <= local163; local263++) {
									@Pc(273) int[] local273 = local104[(local35 + local263) % local41];
									@Pc(277) int local277 = local273[2];
									if (local277 != local153) {
										@Pc(284) int local284 = local273[0];
										@Pc(288) int local288 = local273[1];
										@Pc(299) int local299;
										@Pc(303) int local303;
										if (local167 > local218) {
											local299 = Math.max(local218, local284);
											local303 = Math.min(local167, local288);
										} else if (local284 == 0) {
											local299 = 0;
											local303 = Math.min(local167, local288);
										} else {
											local299 = Math.max(local218, local284);
											local303 = Static254.anInt4973;
										}
										this.method6566(local153 - local277, local111, local25, local277, local299 + local31, -local299 + local303);
									}
								}
							}
							local35 = local157;
							break;
						}
						local157++;
						if (local41 <= local157) {
							local157 = 0;
						}
						local163++;
					}
				}
				if (Static426.anInt7423 < local131 + local153) {
					local131 = Static426.anInt7423 - local153;
				} else {
					local37 = false;
				}
				@Pc(386) int[] local386;
				if (local135 == Static254.anInt4973) {
					this.method6566(local131, local111, local25, local153, local29 + local33, local121);
					if (local37) {
						return local16;
					}
					local37 = true;
					local386 = local100[local43++];
					local386[0] = local33;
					local386[1] = local135;
					local386[2] = local153 + local131;
					@Pc(402) int[][] local402 = local104;
					local104 = local100;
					local100 = local402;
					local41 = local43;
					local43 = 0;
					local31 = local29;
					local29 = Static438.method6797(Static254.anInt4973, local111);
					local27 = local29 - local31;
					local33 = 0;
					local163 = local27;
					if (local27 < 0) {
						local163 = local27 + Static254.anInt4973;
					}
					if (Static254.anInt4973 < local163) {
						local163 -= Static254.anInt4973;
					}
					local35 = 0;
					while (true) {
						@Pc(449) int[] local449 = local104[local35];
						if (local163 >= local449[0] && local449[1] >= local163) {
							local39 = false;
							break;
						}
						local35++;
						if (local35 >= local41) {
							local35 = 0;
						}
					}
				} else {
					local386 = local100[local43++];
					local386[2] = local153 + local131;
					local386[0] = local33;
					local386[1] = local135;
					this.method6566(local131, local111, local25, local153, local33 + local29, local121);
					local33 = local135;
				}
			}
		}
	}
}
