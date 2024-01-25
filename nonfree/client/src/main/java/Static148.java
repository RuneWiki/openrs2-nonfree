import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "[I")
	public static int[] anIntArray147;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "[[F")
	public static final float[][] aFloatArrayArray8 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	public static void method2139() {
		@Pc(15) Class6_Sub45 local15;
		for (local15 = (Class6_Sub45) Static464.aClass362_52.method8538(); local15 != null; local15 = (Class6_Sub45) Static464.aClass362_52.method8530()) {
			if (local15.aBoolean558) {
				local15.method9174();
			} else {
				local15.aBoolean559 = true;
				if (local15.anInt8112 >= 0 && local15.anInt8113 >= 0 && Static491.anInt9856 > local15.anInt8112 && local15.anInt8113 < Static393.anInt6574) {
					Static418.method6241(local15);
				}
			}
		}
		for (local15 = (Class6_Sub45) Static467.aClass362_53.method8538(); local15 != null; local15 = (Class6_Sub45) Static467.aClass362_53.method8530()) {
			if (local15.aBoolean558) {
				local15.method9174();
			} else {
				local15.aBoolean559 = true;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method2140(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!ns;)V")
	public static void method2141(@OriginalArg(1) Class2_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt5112 != -1) {
			@Pc(15) Class119 local15 = Static334.aClass268_2.method6469(arg0.anInt5112);
			if (local15 == null || local15.anIntArray167 == null) {
				arg0.aBoolean331 = false;
				arg0.anInt5112 = -1;
			} else {
				label277: {
					arg0.anInt5071++;
					if (arg0.anInt5067 < local15.anIntArray167.length && local15.anIntArray168[arg0.anInt5067] < arg0.anInt5071) {
						arg0.anInt5071 = 1;
						arg0.anInt5075++;
						arg0.anInt5067++;
						if (!arg0.aBoolean329) {
							Static658.method8966(arg0, arg0.anInt5067, local15);
						}
					}
					if (arg0.anInt5067 >= local15.anIntArray167.length) {
						arg0.anInt5067 = 0;
						arg0.anInt5071 = 0;
						if (arg0.aBoolean331) {
							arg0.anInt5112 = arg0.method4317().method9070();
							if (arg0.anInt5112 == -1) {
								arg0.aBoolean331 = false;
								break label277;
							}
							local15 = Static334.aClass268_2.method6469(arg0.anInt5112);
						}
						if (!arg0.aBoolean329) {
							Static658.method8966(arg0, arg0.anInt5067, local15);
						}
					}
					arg0.anInt5075 = arg0.anInt5067 + 1;
					if (local15.anIntArray167 == null) {
						arg0.aBoolean331 = false;
						arg0.anInt5112 = -1;
					} else if (local15.anIntArray167.length <= arg0.anInt5075) {
						arg0.anInt5075 = 0;
					}
				}
			}
		}
		@Pc(205) Class119 local205;
		for (@Pc(156) int local156 = 0; local156 < arg0.aClass118Array3.length; local156++) {
			if (arg0.aClass118Array3[local156].anInt2965 != -1 && Static90.anInt1698 >= arg0.aClass118Array3[local156].anInt2967) {
				@Pc(186) Class213 local186 = Static111.aClass279_4.method6905(arg0.aClass118Array3[local156].anInt2965);
				@Pc(189) int local189 = local186.anInt6006;
				if (local189 == -1) {
					arg0.aClass118Array3[local156].anInt2965 = -1;
				} else {
					local205 = Static334.aClass268_2.method6469(local189);
					if (local186.aBoolean398) {
						if (local205.anInt3007 == 3) {
							if (arg0.anInt5120 > 0 && Static90.anInt1698 >= arg0.anInt5100 && arg0.anInt5117 < Static90.anInt1698) {
								arg0.aClass118Array3[local156].anInt2965 = -1;
								continue;
							}
						} else if (local205.anInt3007 == 1 && arg0.anInt5120 > 0 && arg0.anInt5100 <= Static90.anInt1698 && Static90.anInt1698 > arg0.anInt5117) {
							arg0.aClass118Array3[local156].anInt2967 = Static90.anInt1698 + 1;
							continue;
						}
					}
					if (local205 == null || local205.anIntArray167 == null) {
						arg0.aClass118Array3[local156].anInt2965 = -1;
					} else {
						if (arg0.aClass118Array3[local156].anInt2973 < 0) {
							arg0.aClass118Array3[local156].anInt2973 = 0;
							if (!arg0.aBoolean329) {
								Static658.method8966(arg0, 0, local205);
							}
						}
						arg0.aClass118Array3[local156].anInt2966++;
						if (arg0.aClass118Array3[local156].anInt2973 < local205.anIntArray167.length && local205.anIntArray168[arg0.aClass118Array3[local156].anInt2973] < arg0.aClass118Array3[local156].anInt2966) {
							arg0.aClass118Array3[local156].anInt2966 = 1;
							arg0.aClass118Array3[local156].anInt2973++;
							if (!arg0.aBoolean329) {
								Static658.method8966(arg0, arg0.aClass118Array3[local156].anInt2973, local205);
							}
						}
						if (local205.anIntArray167.length <= arg0.aClass118Array3[local156].anInt2973) {
							if (local186.aBoolean398) {
								arg0.aClass118Array3[local156].anInt2973 -= local205.anInt3005;
								arg0.aClass118Array3[local156].anInt2970++;
								if (arg0.aClass118Array3[local156].anInt2970 >= local205.anInt3014) {
									arg0.aClass118Array3[local156].anInt2965 = -1;
								} else if (arg0.aClass118Array3[local156].anInt2973 < 0 || local205.anIntArray167.length <= arg0.aClass118Array3[local156].anInt2973) {
									arg0.aClass118Array3[local156].anInt2965 = -1;
								} else if (!arg0.aBoolean329) {
									Static658.method8966(arg0, arg0.aClass118Array3[local156].anInt2973, local205);
								}
							} else {
								arg0.aClass118Array3[local156].anInt2965 = -1;
							}
						}
						arg0.aClass118Array3[local156].anInt2969 = arg0.aClass118Array3[local156].anInt2973 + 1;
						if (local205.anIntArray167.length <= arg0.aClass118Array3[local156].anInt2969) {
							if (local186.aBoolean398) {
								arg0.aClass118Array3[local156].anInt2969 -= local205.anInt3005;
								if (arg0.aClass118Array3[local156].anInt2970 + 1 >= local205.anInt3014) {
									arg0.aClass118Array3[local156].anInt2969 = -1;
								} else if (arg0.aClass118Array3[local156].anInt2969 < 0 || local205.anIntArray167.length <= arg0.aClass118Array3[local156].anInt2969) {
									arg0.aClass118Array3[local156].anInt2969 = -1;
								}
							} else {
								arg0.aClass118Array3[local156].anInt2969 = -1;
							}
						}
					}
				}
			}
		}
		@Pc(584) Class119 local584;
		if (arg0.anInt5077 != -1 && arg0.anInt5065 <= 1) {
			local584 = Static334.aClass268_2.method6469(arg0.anInt5077);
			if (local584.anInt3007 == 3) {
				if (arg0.anInt5120 > 0 && arg0.anInt5100 <= Static90.anInt1698 && Static90.anInt1698 > arg0.anInt5117) {
					arg0.anInt5077 = -1;
					arg0.anIntArray296 = null;
				}
			} else if (local584.anInt3007 == 1 && arg0.anInt5120 > 0 && arg0.anInt5100 <= Static90.anInt1698 && arg0.anInt5117 < Static90.anInt1698) {
				arg0.anInt5065 = 2;
			}
		}
		if (arg0.anInt5077 != -1 && arg0.anInt5065 == 0) {
			local584 = Static334.aClass268_2.method6469(arg0.anInt5077);
			if (local584 == null || local584.anIntArray167 == null) {
				arg0.anIntArray296 = null;
				arg0.anInt5077 = -1;
			} else {
				arg0.anInt5054++;
				if (arg0.anInt5115 < local584.anIntArray167.length && local584.anIntArray168[arg0.anInt5115] < arg0.anInt5054) {
					arg0.anInt5115++;
					arg0.anInt5054 = 1;
					if (!arg0.aBoolean329) {
						Static658.method8966(arg0, arg0.anInt5115, local584);
					}
				}
				if (local584.anIntArray167.length <= arg0.anInt5115) {
					arg0.anInt5090++;
					arg0.anInt5115 -= local584.anInt3005;
					if (local584.anInt3014 <= arg0.anInt5090) {
						arg0.anInt5077 = -1;
						arg0.anIntArray296 = null;
					} else if (arg0.anInt5115 < 0 || arg0.anInt5115 >= local584.anIntArray167.length) {
						arg0.anInt5077 = -1;
						arg0.anIntArray296 = null;
					} else if (!arg0.aBoolean329) {
						Static658.method8966(arg0, arg0.anInt5115, local584);
					}
				}
				arg0.anInt5049 = arg0.anInt5115 + 1;
				if (arg0.anInt5049 >= local584.anIntArray167.length) {
					arg0.anInt5049 -= local584.anInt3005;
					if (local584.anInt3014 <= arg0.anInt5090 + 1) {
						arg0.anInt5049 = -1;
					} else if (arg0.anInt5049 < 0 || local584.anIntArray167.length <= arg0.anInt5049) {
						arg0.anInt5049 = -1;
					}
				}
			}
		}
		if (arg0.anInt5065 > 0) {
			arg0.anInt5065--;
		}
		for (@Pc(841) int local841 = 0; local841 < arg0.aClass245Array3.length; local841++) {
			@Pc(848) Class245 local848 = arg0.aClass245Array3[local841];
			if (local848 != null) {
				if (local848.anInt6823 > 0) {
					local848.anInt6823--;
				} else {
					local205 = Static334.aClass268_2.method6469(local848.anInt6821);
					if (local205 == null || local205.anIntArray167 == null) {
						arg0.aClass245Array3[local841] = null;
					} else {
						local848.anInt6819++;
						if (local848.anInt6818 < local205.anIntArray167.length && local848.anInt6819 > local205.anIntArray168[local848.anInt6818]) {
							local848.anInt6818++;
							local848.anInt6819 = 1;
							if (!arg0.aBoolean329) {
								Static658.method8966(arg0, local848.anInt6818, local205);
							}
						}
						if (local848.anInt6818 >= local205.anIntArray167.length) {
							local848.anInt6818 -= local205.anInt3005;
							local848.anInt6825++;
							if (local205.anInt3014 <= local848.anInt6825) {
								arg0.aClass245Array3[local841] = null;
							} else if (local848.anInt6818 < 0 || local848.anInt6818 >= local205.anIntArray167.length) {
								arg0.aClass245Array3[local841] = null;
							} else if (!arg0.aBoolean329) {
								Static658.method8966(arg0, local848.anInt6818, local205);
							}
						}
						local848.anInt6824 = local848.anInt6818 + 1;
						if (local205.anIntArray167.length <= local848.anInt6824) {
							local848.anInt6824 -= local205.anInt3005;
							if (local848.anInt6825 + 1 >= local205.anInt3014) {
								local848.anInt6824 = -1;
							} else if (local848.anInt6824 < 0 || local205.anIntArray167.length <= local848.anInt6824) {
								local848.anInt6824 = -1;
							}
						}
					}
				}
			}
		}
	}
}
