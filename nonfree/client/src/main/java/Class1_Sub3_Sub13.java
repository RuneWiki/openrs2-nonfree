import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class1_Sub3_Sub13 extends Class1_Sub3 {

	@OriginalMember(owner = "client!en", name = "C", descriptor = "I")
	private int anInt2631;

	@OriginalMember(owner = "client!en", name = "J", descriptor = "I")
	private int anInt2637 = 0;

	@OriginalMember(owner = "client!en", name = "F", descriptor = "I")
	private int anInt2634 = 819;

	@OriginalMember(owner = "client!en", name = "R", descriptor = "I")
	private int anInt2643 = 2048;

	@OriginalMember(owner = "client!en", name = "D", descriptor = "I")
	private int anInt2632 = 1024;

	@OriginalMember(owner = "client!en", name = "O", descriptor = "I")
	private int anInt2640 = 1024;

	@OriginalMember(owner = "client!en", name = "P", descriptor = "I")
	private int anInt2641 = 0;

	@OriginalMember(owner = "client!en", name = "G", descriptor = "I")
	private int anInt2635 = 1024;

	@OriginalMember(owner = "client!en", name = "K", descriptor = "I")
	private int anInt2638 = 1024;

	@OriginalMember(owner = "client!en", name = "V", descriptor = "I")
	private int anInt2647 = 409;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2637 = arg0.method3043();
		} else if (arg1 == 1) {
			this.anInt2632 = arg0.method3056();
		} else if (arg1 == 2) {
			this.anInt2643 = arg0.method3056();
		} else if (arg1 == 3) {
			this.anInt2647 = arg0.method3056();
		} else if (arg1 == 4) {
			this.anInt2634 = arg0.method3056();
		} else if (arg1 == 5) {
			this.anInt2635 = arg0.method3056();
		} else if (arg1 == 6) {
			this.anInt2641 = arg0.method3043();
		} else if (arg1 == 7) {
			this.anInt2638 = arg0.method3056();
		} else if (arg1 == 8) {
			this.anInt2640 = arg0.method3056();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IILjava/util/Random;I[[III)V")
	private void method2461(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(24) int local24 = this.anInt2640 > 0 ? 4096 - Static499.method7152(this.anInt2640, arg1) : 4096;
		@Pc(32) int local32 = this.anInt2631 * this.anInt2638 >> 12;
		@Pc(47) int local47 = this.anInt2631 - (local32 <= 0 ? 0 : Static499.method7152(local32, arg1));
		if (Static236.anInt4609 <= arg2) {
			arg2 -= Static236.anInt4609;
		}
		@Pc(65) int local65;
		@Pc(69) int local69;
		if (local47 > 0) {
			if (arg4 > 0 && arg0 > 0) {
				local65 = arg0 / 2;
				local69 = arg4 / 2;
				@Pc(80) int local80 = local65 < local47 ? local65 : local47;
				@Pc(87) int local87 = local47 > local69 ? local69 : local47;
				@Pc(91) int local91 = local80 + arg2;
				@Pc(97) int local97 = arg0 - local80 * 2;
				for (@Pc(99) int local99 = 0; local99 < arg4; local99++) {
					@Pc(108) int[] local108 = arg3[local99 + arg5];
					@Pc(117) int local117;
					@Pc(125) int local125;
					@Pc(133) int local133;
					if (local87 > local99) {
						local117 = local24 * local99 / local87;
						if (this.anInt2641 == 0) {
							for (local125 = 0; local125 < local80; local125++) {
								local133 = local24 * local125 / local80;
								local108[arg2 + local125 & Static36.anInt1319] = local108[Static36.anInt1319 & arg0 + arg2 - local125 - 1] = local117 * local133 >> 12;
							}
						} else {
							for (local125 = 0; local125 < local80; local125++) {
								local133 = local125 * local24 / local80;
								local108[local125 + arg2 & Static36.anInt1319] = local108[arg2 + arg0 - local125 - 1 & Static36.anInt1319] = local117 <= local133 ? local117 : local133;
							}
						}
						if (Static236.anInt4609 >= local97 + local91) {
							Static555.method5097(local108, local91, local97, local117);
						} else {
							local125 = Static236.anInt4609 - local91;
							Static555.method5097(local108, local91, local125, local117);
							Static555.method5097(local108, 0, local97 - local125, local117);
						}
					} else {
						local117 = arg4 - local99 - 1;
						if (local87 > local117) {
							local125 = local24 * local117 / local87;
							@Pc(278) int local278;
							if (this.anInt2641 == 0) {
								for (local133 = 0; local133 < local80; local133++) {
									local278 = local24 * local133 / local80;
									local108[Static36.anInt1319 & local133 + arg2] = local108[arg2 + arg0 - local133 - 1 & Static36.anInt1319] = local125 * local278 >> 12;
								}
							} else {
								for (local133 = 0; local133 < local80; local133++) {
									local278 = local133 * local24 / local80;
									local108[arg2 + local133 & Static36.anInt1319] = local108[Static36.anInt1319 & arg0 + arg2 - local133 - 1] = local125 > local278 ? local278 : local125;
								}
							}
							if (Static236.anInt4609 >= local97 + local91) {
								Static555.method5097(local108, local91, local97, local125);
							} else {
								local133 = Static236.anInt4609 - local91;
								Static555.method5097(local108, local91, local133, local125);
								Static555.method5097(local108, 0, local97 - local133, local125);
							}
						} else {
							for (local125 = 0; local125 < local80; local125++) {
								local108[Static36.anInt1319 & local125 + arg2] = local108[arg2 + arg0 - local125 - 1 & Static36.anInt1319] = local24 * local125 / local80;
							}
							if (local91 + local97 <= Static236.anInt4609) {
								Static555.method5097(local108, local91, local97, local24);
							} else {
								local133 = Static236.anInt4609 - local91;
								Static555.method5097(local108, local91, local133, local24);
								Static555.method5097(local108, 0, local97 - local133, local24);
							}
						}
					}
				}
			}
		} else if (Static236.anInt4609 < arg0 + arg2) {
			local65 = Static236.anInt4609 - arg2;
			for (local69 = 0; local69 < arg4; local69++) {
				@Pc(489) int[] local489 = arg3[arg5 + local69];
				Static555.method5097(local489, arg2, local65, local24);
				Static555.method5097(local489, 0, arg0 - local65, local24);
			}
		} else {
			for (local65 = 0; local65 < arg4; local65++) {
				Static555.method5097(arg3[arg5 + local65], arg2, arg0, local24);
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V")
	@Override
	public void method7912() {
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass227_41.method5672(arg0);
		if (!super.aClass227_41.aBoolean433) {
			return local11;
		}
		@Pc(25) int[][] local25 = super.aClass227_41.method5675();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = this.anInt2632 * Static236.anInt4609 >> 12;
		@Pc(57) int local57 = this.anInt2643 * Static236.anInt4609 >> 12;
		@Pc(64) int local64 = this.anInt2647 * Static95.anInt2365 >> 12;
		@Pc(71) int local71 = Static95.anInt2365 * this.anInt2634 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt2631 = this.anInt2635 * (Static236.anInt4609 / 8) >> 12;
		@Pc(94) int local94 = Static236.anInt4609 / local50 + 1;
		@Pc(98) int[][] local98 = new int[local94][3];
		@Pc(102) int[][] local102 = new int[local94][3];
		@Pc(109) Random local109 = new Random((long) this.anInt2637);
		while (true) {
			while (true) {
				@Pc(120) int local120 = local50 + Static499.method7152(local57 - local50, local109);
				@Pc(129) int local129 = Static499.method7152(local71 - local64, local109) + local64;
				@Pc(133) int local133 = local33 + local120;
				if (Static236.anInt4609 < local133) {
					local133 = Static236.anInt4609;
					local120 = Static236.anInt4609 - local33;
				}
				@Pc(178) int local178;
				@Pc(157) int local157;
				if (local39) {
					local178 = 0;
				} else {
					@Pc(151) int local151 = local35;
					@Pc(155) int[] local155 = local102[local35];
					local157 = 0;
					@Pc(161) int local161 = local133 + local27;
					if (local161 < 0) {
						local161 += Static236.anInt4609;
					}
					if (local161 > Static236.anInt4609) {
						local161 -= Static236.anInt4609;
					}
					local178 = local155[2];
					while (true) {
						@Pc(182) int[] local182 = local102[local151];
						if (local182[0] <= local161 && local182[1] >= local161) {
							if (local35 != local151) {
								@Pc(220) int local220 = local27 + local33;
								if (local220 < 0) {
									local220 += Static236.anInt4609;
								}
								if (Static236.anInt4609 < local220) {
									local220 -= Static236.anInt4609;
								}
								for (@Pc(242) int local242 = 1; local242 <= local157; local242++) {
									@Pc(252) int[] local252 = local102[(local242 + local35) % local41];
									local178 = Math.max(local178, local252[2]);
								}
								for (@Pc(264) int local264 = 0; local264 <= local157; local264++) {
									@Pc(274) int[] local274 = local102[(local35 + local264) % local41];
									@Pc(278) int local278 = local274[2];
									if (local178 != local278) {
										@Pc(289) int local289 = local274[0];
										@Pc(293) int local293 = local274[1];
										@Pc(307) int local307;
										@Pc(305) int local305;
										if (local220 < local161) {
											local307 = Math.max(local220, local289);
											local305 = Math.min(local161, local293);
										} else if (local289 == 0) {
											local305 = Math.min(local161, local293);
											local307 = 0;
										} else {
											local307 = Math.max(local220, local289);
											local305 = Static236.anInt4609;
										}
										this.method2461(local305 - local307, local109, local31 + local307, local25, local178 - local278, local278);
									}
								}
							}
							local35 = local151;
							break;
						}
						local151++;
						if (local151 >= local41) {
							local151 = 0;
						}
						local157++;
					}
				}
				if (Static95.anInt2365 < local178 + local129) {
					local129 = Static95.anInt2365 - local178;
				} else {
					local37 = false;
				}
				@Pc(378) int[] local378;
				if (Static236.anInt4609 == local133) {
					this.method2461(local120, local109, local33 + local29, local25, local129, local178);
					if (local37) {
						return local11;
					}
					local37 = true;
					local378 = local98[local43++];
					local378[2] = local178 + local129;
					local378[0] = local33;
					local378[1] = local133;
					@Pc(445) int[][] local445 = local102;
					local102 = local98;
					local41 = local43;
					local98 = local445;
					local31 = local29;
					local43 = 0;
					local29 = Static499.method7152(Static236.anInt4609, local109);
					local33 = 0;
					local27 = local29 - local31;
					local157 = local27;
					if (local27 < 0) {
						local157 = local27 + Static236.anInt4609;
					}
					if (Static236.anInt4609 < local157) {
						local157 -= Static236.anInt4609;
					}
					local35 = 0;
					while (true) {
						@Pc(495) int[] local495 = local102[local35];
						if (local157 >= local495[0] && local157 <= local495[1]) {
							local39 = false;
							break;
						}
						@Pc(512) int local512 = ~local41;
						local35++;
						if (local512 >= ~local35) {
							local35 = 0;
						}
					}
				} else {
					local378 = local98[local43++];
					local378[2] = local129 + local178;
					local378[1] = local133;
					local378[0] = local33;
					this.method2461(local120, local109, local33 + local29, local25, local129, local178);
					local33 = local133;
				}
			}
		}
	}
}
