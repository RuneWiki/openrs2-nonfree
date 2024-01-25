import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class3_Sub4_Sub17 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ju", name = "bb", descriptor = "I")
	private int anInt4084;

	@OriginalMember(owner = "client!ju", name = "P", descriptor = "I")
	private int anInt4076 = 819;

	@OriginalMember(owner = "client!ju", name = "Y", descriptor = "I")
	private int anInt4082 = 2048;

	@OriginalMember(owner = "client!ju", name = "R", descriptor = "I")
	private int anInt4077 = 1024;

	@OriginalMember(owner = "client!ju", name = "M", descriptor = "I")
	private int anInt4073 = 0;

	@OriginalMember(owner = "client!ju", name = "W", descriptor = "I")
	private int anInt4080 = 1024;

	@OriginalMember(owner = "client!ju", name = "cb", descriptor = "I")
	private int anInt4085 = 409;

	@OriginalMember(owner = "client!ju", name = "Z", descriptor = "I")
	private int anInt4083 = 1024;

	@OriginalMember(owner = "client!ju", name = "db", descriptor = "I")
	private int anInt4086 = 0;

	@OriginalMember(owner = "client!ju", name = "eb", descriptor = "I")
	private int anInt4087 = 1024;

	static {
		new Class175(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIILjava/util/Random;I[[II)V")
	private void method3333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt4087 > 0 ? 4096 - Static36.method851(arg2, this.anInt4087) : 4096;
		@Pc(27) int local27 = this.anInt4084 * this.anInt4077 >> 12;
		@Pc(48) int local48 = this.anInt4084 - (local27 > 0 ? Static36.method851(arg2, local27) : 0);
		if (arg1 >= Static106.anInt2356) {
			arg1 -= Static106.anInt2356;
		}
		@Pc(78) int local78;
		@Pc(80) int local80;
		if (local48 <= 0) {
			if (Static106.anInt2356 < arg0 + arg1) {
				local78 = Static106.anInt2356 - arg1;
				for (local80 = 0; local80 < arg3; local80++) {
					@Pc(89) int[] local89 = arg4[arg5 + local80];
					Static464.method5795(local89, arg1, local78, local19);
					Static464.method5795(local89, 0, arg0 - local78, local19);
				}
			} else {
				for (local78 = 0; local78 < arg3; local78++) {
					Static464.method5795(arg4[arg5 + local78], arg1, arg0, local19);
				}
			}
		} else if (arg3 > 0 && arg0 > 0) {
			local78 = arg0 / 2;
			local80 = arg3 / 2;
			@Pc(152) int local152 = local48 <= local78 ? local48 : local78;
			@Pc(163) int local163 = local80 >= local48 ? local48 : local80;
			@Pc(167) int local167 = local152 + arg1;
			@Pc(174) int local174 = arg0 - local152 * 2;
			for (@Pc(176) int local176 = 0; local176 < arg3; local176++) {
				@Pc(185) int[] local185 = arg4[local176 + arg5];
				@Pc(198) int local198;
				@Pc(206) int local206;
				@Pc(214) int local214;
				if (local176 < local163) {
					local198 = local19 * local176 / local163;
					if (this.anInt4073 == 0) {
						for (local206 = 0; local206 < local152; local206++) {
							local214 = local19 * local206 / local152;
							local185[local206 + arg1 & Static396.anInt6840] = local185[Static396.anInt6840 & arg1 + arg0 - local206 - 1] = local198 * local214 >> 12;
						}
					} else {
						for (local206 = 0; local206 < local152; local206++) {
							local214 = local206 * local19 / local152;
							local185[local206 + arg1 & Static396.anInt6840] = local185[Static396.anInt6840 & arg0 + arg1 - local206 - 1] = local214 < local198 ? local214 : local198;
						}
					}
					if (Static106.anInt2356 < local167 + local174) {
						local206 = Static106.anInt2356 - local167;
						Static464.method5795(local185, local167, local206, local198);
						Static464.method5795(local185, 0, local174 - local206, local198);
					} else {
						Static464.method5795(local185, local167, local174, local198);
					}
				} else {
					local198 = arg3 - local176 - 1;
					if (local198 < local163) {
						local206 = local19 * local198 / local163;
						@Pc(351) int local351;
						if (this.anInt4073 == 0) {
							for (local214 = 0; local214 < local152; local214++) {
								local351 = local214 * local19 / local152;
								local185[Static396.anInt6840 & local214 + arg1] = local185[Static396.anInt6840 & arg1 + arg0 - local214 - 1] = local351 * local206 >> 12;
							}
						} else {
							for (local214 = 0; local214 < local152; local214++) {
								local351 = local214 * local19 / local152;
								local185[local214 + arg1 & Static396.anInt6840] = local185[arg1 + arg0 - local214 - 1 & Static396.anInt6840] = local351 < local206 ? local351 : local206;
							}
						}
						if (local174 + local167 <= Static106.anInt2356) {
							Static464.method5795(local185, local167, local174, local206);
						} else {
							local214 = Static106.anInt2356 - local167;
							Static464.method5795(local185, local167, local214, local206);
							Static464.method5795(local185, 0, local174 - local214, local206);
						}
					} else {
						for (local206 = 0; local206 < local152; local206++) {
							local185[local206 + arg1 & Static396.anInt6840] = local185[arg0 + arg1 - local206 - 1 & Static396.anInt6840] = local206 * local19 / local152;
						}
						if (local174 + local167 > Static106.anInt2356) {
							local214 = Static106.anInt2356 - local167;
							Static464.method5795(local185, local167, local214, local19);
							Static464.method5795(local185, 0, local174 - local214, local19);
						} else {
							Static464.method5795(local185, local167, local174, local19);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "(I)V")
	@Override
	public void method5963() {
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt4086 = arg1.method6053();
		} else if (arg0 == 1) {
			this.anInt4083 = arg1.method6004();
		} else if (arg0 == 2) {
			this.anInt4082 = arg1.method6004();
		} else if (arg0 == 3) {
			this.anInt4085 = arg1.method6004();
		} else if (arg0 == 4) {
			this.anInt4076 = arg1.method6004();
		} else if (arg0 == 5) {
			this.anInt4080 = arg1.method6004();
		} else if (arg0 == 6) {
			this.anInt4073 = arg1.method6053();
		} else if (arg0 == 7) {
			this.anInt4077 = arg1.method6004();
		} else if (arg0 == 8) {
			this.anInt4087 = arg1.method6004();
		}
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass146_41.method3700(arg0);
		if (!super.aClass146_41.aBoolean342) {
			return local11;
		}
		@Pc(25) int[][] local25 = super.aClass146_41.method3701();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = Static106.anInt2356 * this.anInt4083 >> 12;
		@Pc(57) int local57 = Static106.anInt2356 * this.anInt4082 >> 12;
		@Pc(64) int local64 = Static340.anInt6286 * this.anInt4085 >> 12;
		@Pc(71) int local71 = this.anInt4076 * Static340.anInt6286 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt4084 = this.anInt4080 * (Static106.anInt2356 / 8) >> 12;
		@Pc(96) int local96 = Static106.anInt2356 / local50 + 1;
		@Pc(100) int[][] local100 = new int[local96][3];
		@Pc(104) int[][] local104 = new int[local96][3];
		@Pc(111) Random local111 = new Random((long) this.anInt4086);
		while (true) {
			while (true) {
				@Pc(121) int local121 = Static36.method851(local111, local57 - local50) + local50;
				@Pc(133) int local133 = local64 + Static36.method851(local111, local71 - local64);
				@Pc(137) int local137 = local121 + local33;
				if (local137 > Static106.anInt2356) {
					local137 = Static106.anInt2356;
					local121 = Static106.anInt2356 - local33;
				}
				@Pc(210) int local210;
				@Pc(185) int local185;
				@Pc(161) int local161;
				if (local39) {
					local185 = 0;
				} else {
					@Pc(155) int local155 = local35;
					@Pc(159) int[] local159 = local104[local35];
					local161 = 0;
					@Pc(165) int local165 = local27 + local137;
					if (local165 < 0) {
						local165 += Static106.anInt2356;
					}
					if (Static106.anInt2356 < local165) {
						local165 -= Static106.anInt2356;
					}
					local185 = local159[2];
					while (true) {
						@Pc(189) int[] local189 = local104[local155];
						if (local189[0] <= local165 && local165 <= local189[1]) {
							if (local35 != local155) {
								@Pc(227) int local227 = local33 + local27;
								if (local227 < 0) {
									local227 += Static106.anInt2356;
								}
								if (Static106.anInt2356 < local227) {
									local227 -= Static106.anInt2356;
								}
								for (@Pc(245) int local245 = 1; local245 <= local161; local245++) {
									@Pc(255) int[] local255 = local104[(local245 + local35) % local41];
									local185 = Math.max(local185, local255[2]);
								}
								for (@Pc(267) int local267 = 0; local267 <= local161; local267++) {
									@Pc(277) int[] local277 = local104[(local267 + local35) % local41];
									@Pc(281) int local281 = local277[2];
									if (local185 != local281) {
										@Pc(292) int local292 = local277[0];
										@Pc(296) int local296 = local277[1];
										@Pc(305) int local305;
										@Pc(307) int local307;
										if (local227 < local165) {
											local305 = Math.max(local227, local292);
											local307 = Math.min(local165, local296);
										} else if (local292 == 0) {
											local307 = Math.min(local165, local296);
											local305 = 0;
										} else {
											local305 = Math.max(local227, local292);
											local307 = Static106.anInt2356;
										}
										this.method3333(local307 - local305, local31 + local305, local111, local185 - local281, local25, local281);
									}
								}
							}
							local35 = local155;
							break;
						}
						local210 = ~local41;
						local155++;
						if (local210 >= ~local155) {
							local155 = 0;
						}
						local161++;
					}
				}
				if (Static340.anInt6286 >= local133 + local185) {
					local37 = false;
				} else {
					local133 = Static340.anInt6286 - local185;
				}
				@Pc(374) int[] local374;
				if (Static106.anInt2356 == local137) {
					this.method3333(local121, local33 + local29, local111, local133, local25, local185);
					if (local37) {
						return local11;
					}
					local37 = true;
					local374 = local100[local43++];
					local374[1] = local137;
					local374[2] = local185 + local133;
					local374[0] = local33;
					@Pc(441) int[][] local441 = local104;
					local104 = local100;
					local100 = local441;
					local41 = local43;
					local31 = local29;
					local43 = 0;
					local29 = Static36.method851(local111, Static106.anInt2356);
					local33 = 0;
					local27 = local29 - local31;
					local161 = local27;
					if (local27 < 0) {
						local161 = local27 + Static106.anInt2356;
					}
					if (Static106.anInt2356 < local161) {
						local161 -= Static106.anInt2356;
					}
					local35 = 0;
					while (true) {
						@Pc(488) int[] local488 = local104[local35];
						if (local161 >= local488[0] && local161 <= local488[1]) {
							local39 = false;
							break;
						}
						local210 = ~local41;
						local35++;
						if (local210 >= ~local35) {
							local35 = 0;
						}
					}
				} else {
					local374 = local100[local43++];
					local374[2] = local185 + local133;
					local374[0] = local33;
					local374[1] = local137;
					this.method3333(local121, local33 + local29, local111, local133, local25, local185);
					local33 = local137;
				}
			}
		}
	}
}
