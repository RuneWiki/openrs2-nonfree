import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class2_Sub11_Sub12 extends Class2_Sub11 {

	@OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
	private int anInt5134;

	@OriginalMember(owner = "client!kk", name = "U", descriptor = "I")
	private int anInt5127 = 1024;

	@OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
	private int anInt5128 = 819;

	@OriginalMember(owner = "client!kk", name = "X", descriptor = "I")
	private int anInt5138 = 409;

	@OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
	private int anInt5139 = 0;

	@OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
	private int anInt5135 = 1024;

	@OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
	private int anInt5133 = 1024;

	@OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
	private int anInt5140 = 0;

	@OriginalMember(owner = "client!kk", name = "P", descriptor = "I")
	private int anInt5141 = 1024;

	@OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
	private int anInt5137 = 2048;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B[[IILjava/util/Random;III)V")
	private void method4657(@OriginalArg(1) int[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt5135 <= 0 ? 4096 : 4096 - Static289.method4068(this.anInt5135, arg2);
		@Pc(27) int local27 = this.anInt5133 * this.anInt5134 >> 12;
		@Pc(40) int local40 = this.anInt5134 - (local27 > 0 ? Static289.method4068(local27, arg2) : 0);
		if (Static301.anInt10214 <= arg1) {
			arg1 -= Static301.anInt10214;
		}
		@Pc(70) int local70;
		@Pc(74) int local74;
		if (local40 > 0) {
			if (arg4 <= 0 || arg5 <= 0) {
				return;
			}
			local70 = arg5 / 2;
			local74 = arg4 / 2;
			@Pc(86) int local86 = local70 < local40 ? local70 : local40;
			@Pc(94) int local94 = local74 >= local40 ? local40 : local74;
			@Pc(98) int local98 = local86 + arg1;
			@Pc(105) int local105 = arg5 - local86 * 2;
			for (@Pc(107) int local107 = 0; local107 < arg4; local107++) {
				@Pc(115) int[] local115 = arg0[arg3 + local107];
				@Pc(124) int local124;
				@Pc(132) int local132;
				@Pc(140) int local140;
				if (local94 > local107) {
					local124 = local107 * local19 / local94;
					if (this.anInt5139 == 0) {
						for (local132 = 0; local132 < local86; local132++) {
							local140 = local19 * local132 / local86;
							local115[arg1 + local132 & Static78.anInt1356] = local115[arg5 + arg1 - local132 - 1 & Static78.anInt1356] = local124 * local140 >> 12;
						}
					} else {
						for (local132 = 0; local132 < local86; local132++) {
							local140 = local19 * local132 / local86;
							local115[Static78.anInt1356 & arg1 + local132] = local115[arg5 + arg1 - local132 - 1 & Static78.anInt1356] = local140 < local124 ? local140 : local124;
						}
					}
					if (local105 + local98 <= Static301.anInt10214) {
						Static728.method275(local115, local98, local105, local124);
					} else {
						local132 = Static301.anInt10214 - local98;
						Static728.method275(local115, local98, local132, local124);
						Static728.method275(local115, 0, local105 - local132, local124);
					}
				} else {
					local124 = arg4 - local107 - 1;
					if (local94 > local124) {
						local132 = local19 * local124 / local94;
						@Pc(303) int local303;
						if (this.anInt5139 == 0) {
							for (local140 = 0; local140 < local86; local140++) {
								local303 = local140 * local19 / local86;
								local115[Static78.anInt1356 & arg1 + local140] = local115[Static78.anInt1356 & arg1 + arg5 - local140 - 1] = local132 * local303 >> 12;
							}
						} else {
							for (local140 = 0; local140 < local86; local140++) {
								local303 = local19 * local140 / local86;
								local115[Static78.anInt1356 & local140 + arg1] = local115[arg1 + arg5 - local140 - 1 & Static78.anInt1356] = local132 <= local303 ? local132 : local303;
							}
						}
						if (Static301.anInt10214 < local105 + local98) {
							local140 = Static301.anInt10214 - local98;
							Static728.method275(local115, local98, local140, local132);
							Static728.method275(local115, 0, local105 - local140, local132);
						} else {
							Static728.method275(local115, local98, local105, local132);
						}
					} else {
						for (local132 = 0; local132 < local86; local132++) {
							local115[arg1 + local132 & Static78.anInt1356] = local115[arg1 + arg5 - local132 - 1 & Static78.anInt1356] = local132 * local19 / local86;
						}
						if (local98 + local105 > Static301.anInt10214) {
							local140 = Static301.anInt10214 - local98;
							Static728.method275(local115, local98, local140, local19);
							Static728.method275(local115, 0, local105 - local140, local19);
						} else {
							Static728.method275(local115, local98, local105, local19);
						}
					}
				}
			}
		} else if (Static301.anInt10214 < arg5 + arg1) {
			local70 = Static301.anInt10214 - arg1;
			for (local74 = 0; local74 < arg4; local74++) {
				@Pc(541) int[] local541 = arg0[local74 + arg3];
				Static728.method275(local541, arg1, local70, local19);
				Static728.method275(local541, 0, arg5 - local70, local19);
			}
		} else {
			for (local70 = 0; local70 < arg4; local70++) {
				Static728.method275(arg0[local70 + arg3], arg1, arg5, local19);
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass174_41.method3748(arg0, 1);
		if (!super.aClass174_41.aBoolean369) {
			return local18;
		}
		@Pc(27) int[][] local27 = super.aClass174_41.method3749();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) boolean local39 = true;
		@Pc(41) boolean local41 = true;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(52) int local52 = this.anInt5141 * Static301.anInt10214 >> 12;
		@Pc(59) int local59 = this.anInt5137 * Static301.anInt10214 >> 12;
		@Pc(66) int local66 = Static609.anInt9448 * this.anInt5138 >> 12;
		@Pc(73) int local73 = this.anInt5128 * Static609.anInt9448 >> 12;
		if (local73 <= 1) {
			return local27[arg0];
		}
		this.anInt5134 = Static301.anInt10214 / 8 * this.anInt5127 >> 12;
		@Pc(99) int local99 = Static301.anInt10214 / local52 + 1;
		@Pc(103) int[][] local103 = new int[local99][3];
		@Pc(107) int[][] local107 = new int[local99][3];
		@Pc(114) Random local114 = new Random((long) this.anInt5140);
		while (true) {
			while (true) {
				@Pc(123) int local123 = Static289.method4068(local59 - local52, local114) + local52;
				@Pc(133) int local133 = Static289.method4068(local73 - local66, local114) + local66;
				@Pc(137) int local137 = local123 + local35;
				if (local137 > Static301.anInt10214) {
					local137 = Static301.anInt10214;
					local123 = Static301.anInt10214 - local35;
				}
				@Pc(229) int local229;
				@Pc(163) int local163;
				if (local41) {
					local229 = 0;
				} else {
					@Pc(157) int local157 = local37;
					@Pc(161) int[] local161 = local107[local37];
					local163 = 0;
					@Pc(168) int local168 = local137 + local29;
					if (local168 < 0) {
						local168 += Static301.anInt10214;
					}
					if (local168 > Static301.anInt10214) {
						local168 -= Static301.anInt10214;
					}
					while (true) {
						@Pc(192) int[] local192 = local107[local157];
						if (local192[0] <= local168 && local168 <= local192[1]) {
							local229 = local161[2];
							if (local157 != local37) {
								@Pc(236) int local236 = local29 + local35;
								if (local236 < 0) {
									local236 += Static301.anInt10214;
								}
								if (local236 > Static301.anInt10214) {
									local236 -= Static301.anInt10214;
								}
								for (@Pc(255) int local255 = 1; local255 <= local163; local255++) {
									@Pc(265) int[] local265 = local107[(local255 + local37) % local43];
									local229 = Math.max(local229, local265[2]);
								}
								for (@Pc(281) int local281 = 0; local281 <= local163; local281++) {
									@Pc(292) int[] local292 = local107[(local37 + local281) % local43];
									@Pc(296) int local296 = local292[2];
									if (local229 != local296) {
										@Pc(307) int local307 = local292[0];
										@Pc(311) int local311 = local292[1];
										@Pc(325) int local325;
										@Pc(327) int local327;
										if (local168 > local236) {
											local325 = Math.max(local236, local307);
											local327 = Math.min(local168, local311);
										} else if (local307 == 0) {
											local325 = 0;
											local327 = Math.min(local168, local311);
										} else {
											local325 = Math.max(local236, local307);
											local327 = Static301.anInt10214;
										}
										this.method4657(local27, local325 + local33, local114, local296, local229 - local296, local327 + -local325);
									}
								}
							}
							local37 = local157;
							break;
						}
						local157++;
						if (local157 >= local43) {
							local157 = 0;
						}
						local163++;
					}
				}
				if (local133 + local229 <= Static609.anInt9448) {
					local39 = false;
				} else {
					local133 = Static609.anInt9448 - local229;
				}
				@Pc(397) int[] local397;
				if (local137 == Static301.anInt10214) {
					this.method4657(local27, local31 + local35, local114, local229, local133, local123);
					if (local39) {
						return local18;
					}
					local39 = true;
					local397 = local103[local45++];
					local397[0] = local35;
					local397[2] = local229 + local133;
					local397[1] = local137;
					@Pc(464) int[][] local464 = local107;
					local107 = local103;
					local103 = local464;
					local43 = local45;
					local45 = 0;
					local33 = local31;
					local31 = Static289.method4068(Static301.anInt10214, local114);
					local29 = local31 - local33;
					local35 = 0;
					local163 = local29;
					if (local29 < 0) {
						local163 = local29 + Static301.anInt10214;
					}
					local37 = 0;
					if (Static301.anInt10214 < local163) {
						local163 -= Static301.anInt10214;
					}
					while (true) {
						@Pc(507) int[] local507 = local107[local37];
						if (local507[0] <= local163 && local163 <= local507[1]) {
							local41 = false;
							break;
						}
						local37++;
						if (local37 >= local43) {
							local37 = 0;
						}
					}
				} else {
					local397 = local103[local45++];
					local397[0] = local35;
					local397[2] = local133 + local229;
					local397[1] = local137;
					this.method4657(local27, local35 + local31, local114, local229, local133, local123);
					local35 = local137;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V")
	@Override
	public void method9530() {
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt5140 = arg1.method8581(-17416);
		} else if (arg0 == 1) {
			this.anInt5141 = arg1.method8575();
		} else if (arg0 == 2) {
			this.anInt5137 = arg1.method8575();
		} else if (arg0 == 3) {
			this.anInt5138 = arg1.method8575();
		} else if (arg0 == 4) {
			this.anInt5128 = arg1.method8575();
		} else if (arg0 == 5) {
			this.anInt5127 = arg1.method8575();
		} else if (arg0 == 6) {
			this.anInt5139 = arg1.method8581(-17416);
		} else if (arg0 == 7) {
			this.anInt5133 = arg1.method8575();
		} else if (arg0 == 8) {
			this.anInt5135 = arg1.method8575();
		}
	}
}
