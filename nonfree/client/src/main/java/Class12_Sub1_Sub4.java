import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class12_Sub1_Sub4 extends Class12_Sub1 {

	@OriginalMember(owner = "client!cr", name = "J", descriptor = "I")
	private int anInt1775;

	@OriginalMember(owner = "client!cr", name = "H", descriptor = "I")
	private int anInt1773 = 2048;

	@OriginalMember(owner = "client!cr", name = "F", descriptor = "I")
	private int anInt1771 = 1024;

	@OriginalMember(owner = "client!cr", name = "G", descriptor = "I")
	private int anInt1772 = 409;

	@OriginalMember(owner = "client!cr", name = "I", descriptor = "I")
	private int anInt1774 = 0;

	@OriginalMember(owner = "client!cr", name = "O", descriptor = "I")
	private int anInt1779 = 819;

	@OriginalMember(owner = "client!cr", name = "E", descriptor = "I")
	private int anInt1770 = 0;

	@OriginalMember(owner = "client!cr", name = "S", descriptor = "I")
	private int anInt1781 = 1024;

	@OriginalMember(owner = "client!cr", name = "U", descriptor = "I")
	private int anInt1783 = 1024;

	@OriginalMember(owner = "client!cr", name = "V", descriptor = "I")
	private int anInt1784 = 1024;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1774 = arg0.method5216();
		} else if (arg1 == 1) {
			this.anInt1783 = arg0.method5199();
		} else if (arg1 == 2) {
			this.anInt1773 = arg0.method5199();
		} else if (arg1 == 3) {
			this.anInt1772 = arg0.method5199();
		} else if (arg1 == 4) {
			this.anInt1779 = arg0.method5199();
		} else if (arg1 == 5) {
			this.anInt1771 = arg0.method5199();
		} else if (arg1 == 6) {
			this.anInt1770 = arg0.method5216();
		} else if (arg1 == 7) {
			this.anInt1781 = arg0.method5199();
		} else if (arg1 == 8) {
			this.anInt1784 = arg0.method5199();
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass174_41.method4392(arg0);
		if (!super.aClass174_41.aBoolean403) {
			return local16;
		}
		@Pc(25) int[][] local25 = super.aClass174_41.method4394();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = Static357.anInt6670 * this.anInt1783 >> 12;
		@Pc(57) int local57 = this.anInt1773 * Static357.anInt6670 >> 12;
		@Pc(64) int local64 = Static138.anInt3102 * this.anInt1772 >> 12;
		@Pc(71) int local71 = Static138.anInt3102 * this.anInt1779 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt1775 = this.anInt1771 * (Static357.anInt6670 / 8) >> 12;
		@Pc(96) int local96 = Static357.anInt6670 / local50 + 1;
		@Pc(100) int[][] local100 = new int[local96][3];
		@Pc(104) int[][] local104 = new int[local96][3];
		@Pc(111) Random local111 = new Random((long) this.anInt1774);
		while (true) {
			while (true) {
				@Pc(120) int local120 = Static114.method2345(local111, local57 - local50) + local50;
				@Pc(130) int local130 = local64 + Static114.method2345(local111, local71 - local64);
				@Pc(135) int local135 = local33 + local120;
				if (Static357.anInt6670 < local135) {
					local120 = Static357.anInt6670 - local33;
					local135 = Static357.anInt6670;
				}
				@Pc(206) int local206;
				@Pc(155) int local155;
				if (local39) {
					local206 = 0;
				} else {
					@Pc(149) int local149 = local35;
					@Pc(153) int[] local153 = local104[local35];
					local155 = 0;
					@Pc(159) int local159 = local27 + local135;
					if (local159 < 0) {
						local159 += Static357.anInt6670;
					}
					if (local159 > Static357.anInt6670) {
						local159 -= Static357.anInt6670;
					}
					while (true) {
						@Pc(183) int[] local183 = local104[local149];
						if (local183[0] <= local159 && local159 <= local183[1]) {
							local206 = local153[2];
							if (local149 != local35) {
								@Pc(214) int local214 = local33 + local27;
								if (local214 < 0) {
									local214 += Static357.anInt6670;
								}
								if (Static357.anInt6670 < local214) {
									local214 -= Static357.anInt6670;
								}
								for (@Pc(233) int local233 = 1; local233 <= local155; local233++) {
									@Pc(243) int[] local243 = local104[(local35 + local233) % local41];
									local206 = Math.max(local206, local243[2]);
								}
								for (@Pc(259) int local259 = 0; local259 <= local155; local259++) {
									@Pc(269) int[] local269 = local104[(local35 + local259) % local41];
									@Pc(273) int local273 = local269[2];
									if (local206 != local273) {
										@Pc(280) int local280 = local269[0];
										@Pc(284) int local284 = local269[1];
										@Pc(295) int local295;
										@Pc(293) int local293;
										if (local159 > local214) {
											local295 = Math.max(local214, local280);
											local293 = Math.min(local159, local284);
										} else if (local280 == 0) {
											local293 = Math.min(local159, local284);
											local295 = 0;
										} else {
											local295 = Math.max(local214, local280);
											local293 = Static357.anInt6670;
										}
										this.method1670(local293 - local295, local111, local25, local273, local31 + local295, local206 + -local273);
									}
								}
							}
							local35 = local149;
							break;
						}
						local149++;
						if (local41 <= local149) {
							local149 = 0;
						}
						local155++;
					}
				}
				if (local206 + local130 > Static138.anInt3102) {
					local130 = Static138.anInt3102 - local206;
				} else {
					local37 = false;
				}
				@Pc(371) int[] local371;
				if (local135 == Static357.anInt6670) {
					this.method1670(local120, local111, local25, local206, local33 + local29, local130);
					if (local37) {
						return local16;
					}
					local37 = true;
					local371 = local100[local43++];
					local371[2] = local130 + local206;
					local371[1] = local135;
					local371[0] = local33;
					@Pc(437) int[][] local437 = local104;
					local104 = local100;
					local100 = local437;
					local41 = local43;
					local43 = 0;
					local31 = local29;
					local29 = Static114.method2345(local111, Static357.anInt6670);
					local33 = 0;
					local27 = local29 - local31;
					local155 = local27;
					if (local27 < 0) {
						local155 = local27 + Static357.anInt6670;
					}
					local35 = 0;
					if (local155 > Static357.anInt6670) {
						local155 -= Static357.anInt6670;
					}
					local39 = false;
					while (true) {
						@Pc(482) int[] local482 = local104[local35];
						if (local482[0] <= local155 && local155 <= local482[1]) {
							break;
						}
						local35++;
						if (local35 >= local41) {
							local35 = 0;
						}
					}
				} else {
					local371 = local100[local43++];
					local371[1] = local135;
					local371[0] = local33;
					local371[2] = local206 + local130;
					this.method1670(local120, local111, local25, local206, local33 + local29, local130);
					local33 = local135;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V")
	@Override
	public void method7797() {
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILjava/util/Random;I[[IIII)V")
	private void method1670(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(24) int local24 = this.anInt1784 > 0 ? 4096 - Static114.method2345(arg1, this.anInt1784) : 4096;
		@Pc(32) int local32 = this.anInt1775 * this.anInt1781 >> 12;
		@Pc(44) int local44 = this.anInt1775 - (local32 > 0 ? Static114.method2345(arg1, local32) : 0);
		if (arg4 >= Static357.anInt6670) {
			arg4 -= Static357.anInt6670;
		}
		@Pc(72) int local72;
		@Pc(76) int local76;
		if (local44 > 0) {
			if (arg5 > 0 && arg0 > 0) {
				local72 = arg0 / 2;
				local76 = arg5 / 2;
				@Pc(87) int local87 = local72 >= local44 ? local44 : local72;
				@Pc(98) int local98 = local76 < local44 ? local76 : local44;
				@Pc(102) int local102 = local87 + arg4;
				@Pc(109) int local109 = arg0 - local87 * 2;
				for (@Pc(111) int local111 = 0; local111 < arg5; local111++) {
					@Pc(120) int[] local120 = arg2[local111 + arg3];
					@Pc(129) int local129;
					@Pc(137) int local137;
					@Pc(145) int local145;
					if (local111 < local98) {
						local129 = local111 * local24 / local98;
						if (this.anInt1770 == 0) {
							for (local137 = 0; local137 < local87; local137++) {
								local145 = local137 * local24 / local87;
								local120[Static149.anInt3278 & arg4 + local137] = local120[Static149.anInt3278 & arg4 + arg0 - local137 - 1] = local145 * local129 >> 12;
							}
						} else {
							for (local137 = 0; local137 < local87; local137++) {
								local145 = local24 * local137 / local87;
								local120[arg4 + local137 & Static149.anInt3278] = local120[arg0 + arg4 - local137 - 1 & Static149.anInt3278] = local145 >= local129 ? local129 : local145;
							}
						}
						if (Static357.anInt6670 < local102 + local109) {
							local137 = Static357.anInt6670 - local102;
							Static554.method3495(local120, local102, local137, local129);
							Static554.method3495(local120, 0, local109 - local137, local129);
						} else {
							Static554.method3495(local120, local102, local109, local129);
						}
					} else {
						local129 = arg5 - local111 - 1;
						if (local98 > local129) {
							local137 = local24 * local129 / local98;
							@Pc(295) int local295;
							if (this.anInt1770 == 0) {
								for (local145 = 0; local145 < local87; local145++) {
									local295 = local145 * local24 / local87;
									local120[local145 + arg4 & Static149.anInt3278] = local120[arg0 + arg4 - local145 - 1 & Static149.anInt3278] = local137 * local295 >> 12;
								}
							} else {
								for (local145 = 0; local145 < local87; local145++) {
									local295 = local145 * local24 / local87;
									local120[arg4 + local145 & Static149.anInt3278] = local120[arg4 + arg0 - local145 - 1 & Static149.anInt3278] = local295 < local137 ? local295 : local137;
								}
							}
							if (local102 + local109 > Static357.anInt6670) {
								local145 = Static357.anInt6670 - local102;
								Static554.method3495(local120, local102, local145, local137);
								Static554.method3495(local120, 0, local109 - local145, local137);
							} else {
								Static554.method3495(local120, local102, local109, local137);
							}
						} else {
							for (local137 = 0; local137 < local87; local137++) {
								local120[Static149.anInt3278 & local137 + arg4] = local120[arg0 + arg4 - local137 - 1 & Static149.anInt3278] = local24 * local137 / local87;
							}
							if (Static357.anInt6670 < local109 + local102) {
								local145 = Static357.anInt6670 - local102;
								Static554.method3495(local120, local102, local145, local24);
								Static554.method3495(local120, 0, local109 - local145, local24);
							} else {
								Static554.method3495(local120, local102, local109, local24);
							}
						}
					}
				}
			}
		} else if (arg0 + arg4 > Static357.anInt6670) {
			local72 = Static357.anInt6670 - arg4;
			for (local76 = 0; local76 < arg5; local76++) {
				@Pc(496) int[] local496 = arg2[arg3 + local76];
				Static554.method3495(local496, arg4, local72, local24);
				Static554.method3495(local496, 0, arg0 - local72, local24);
			}
		} else {
			for (local72 = 0; local72 < arg5; local72++) {
				Static554.method3495(arg2[local72 + arg3], arg4, arg0, local24);
			}
		}
	}
}
