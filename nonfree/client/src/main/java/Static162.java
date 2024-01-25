import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
	public static int anInt3191;

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable3 = new Hashtable();

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!bba;I)V")
	public static void method2937(@OriginalArg(0) Class28_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt10749 != -1) {
			@Pc(12) Class372 local12 = Static243.aClass343_3.method8356(arg0.anInt10749);
			if (local12 == null || local12.anIntArray901 == null) {
				arg0.aBoolean820 = false;
				arg0.anInt10749 = -1;
			} else {
				label277: {
					arg0.anInt10779++;
					if (local12.anIntArray901.length > arg0.anInt10760 && local12.anIntArray900[arg0.anInt10760] < arg0.anInt10779) {
						arg0.anInt10783++;
						arg0.anInt10760++;
						arg0.anInt10779 = 1;
						if (!arg0.aBoolean819) {
							Static548.method7844(arg0, local12, arg0.anInt10760);
						}
					}
					if (arg0.anInt10760 >= local12.anIntArray901.length) {
						arg0.anInt10760 = 0;
						arg0.anInt10779 = 0;
						if (arg0.aBoolean820) {
							arg0.anInt10749 = arg0.method9315().method8767();
							if (arg0.anInt10749 == -1) {
								arg0.aBoolean820 = false;
								break label277;
							}
							local12 = Static243.aClass343_3.method8356(arg0.anInt10749);
						}
						if (!arg0.aBoolean819) {
							Static548.method7844(arg0, local12, arg0.anInt10760);
						}
					}
					arg0.anInt10783 = arg0.anInt10760 + 1;
					if (local12.anIntArray901 == null) {
						arg0.anInt10749 = -1;
						arg0.aBoolean820 = false;
					} else if (local12.anIntArray901.length <= arg0.anInt10783) {
						arg0.anInt10783 = 0;
					}
				}
			}
		}
		@Pc(203) Class372 local203;
		for (@Pc(154) int local154 = 0; local154 < arg0.aClass280Array3.length; local154++) {
			if (arg0.aClass280Array3[local154].anInt7952 != -1 && arg0.aClass280Array3[local154].anInt7957 <= Static588.anInt9467) {
				@Pc(184) Class144 local184 = Static354.aClass236_2.method5615(arg0.aClass280Array3[local154].anInt7952);
				@Pc(187) int local187 = local184.anInt4332;
				if (local187 == -1) {
					arg0.aClass280Array3[local154].anInt7952 = -1;
				} else {
					local203 = Static243.aClass343_3.method8356(local187);
					if (local184.aBoolean324) {
						if (local203.anInt10244 == 3) {
							if (arg0.anInt10814 > 0 && arg0.anInt10780 <= Static588.anInt9467 && Static588.anInt9467 > arg0.anInt10755) {
								arg0.aClass280Array3[local154].anInt7952 = -1;
								continue;
							}
						} else if (local203.anInt10244 == 1 && arg0.anInt10814 > 0 && arg0.anInt10780 <= Static588.anInt9467 && arg0.anInt10755 < Static588.anInt9467) {
							arg0.aClass280Array3[local154].anInt7957 = Static588.anInt9467 + 1;
							continue;
						}
					}
					if (local203 == null || local203.anIntArray901 == null) {
						arg0.aClass280Array3[local154].anInt7952 = -1;
					} else {
						if (arg0.aClass280Array3[local154].anInt7959 < 0) {
							arg0.aClass280Array3[local154].anInt7959 = 0;
							if (!arg0.aBoolean819) {
								Static548.method7844(arg0, local203, 0);
							}
						}
						arg0.aClass280Array3[local154].anInt7956++;
						if (arg0.aClass280Array3[local154].anInt7959 < local203.anIntArray901.length && arg0.aClass280Array3[local154].anInt7956 > local203.anIntArray900[arg0.aClass280Array3[local154].anInt7959]) {
							arg0.aClass280Array3[local154].anInt7956 = 1;
							arg0.aClass280Array3[local154].anInt7959++;
							if (!arg0.aBoolean819) {
								Static548.method7844(arg0, local203, arg0.aClass280Array3[local154].anInt7959);
							}
						}
						if (local203.anIntArray901.length <= arg0.aClass280Array3[local154].anInt7959) {
							if (local184.aBoolean324) {
								arg0.aClass280Array3[local154].anInt7959 -= local203.anInt10256;
								arg0.aClass280Array3[local154].anInt7954++;
								if (local203.anInt10253 <= arg0.aClass280Array3[local154].anInt7954) {
									arg0.aClass280Array3[local154].anInt7952 = -1;
								} else if (arg0.aClass280Array3[local154].anInt7959 < 0 || local203.anIntArray901.length <= arg0.aClass280Array3[local154].anInt7959) {
									arg0.aClass280Array3[local154].anInt7952 = -1;
								} else if (!arg0.aBoolean819) {
									Static548.method7844(arg0, local203, arg0.aClass280Array3[local154].anInt7959);
								}
							} else {
								arg0.aClass280Array3[local154].anInt7952 = -1;
							}
						}
						arg0.aClass280Array3[local154].anInt7951 = arg0.aClass280Array3[local154].anInt7959 + 1;
						if (local203.anIntArray901.length <= arg0.aClass280Array3[local154].anInt7951) {
							if (local184.aBoolean324) {
								arg0.aClass280Array3[local154].anInt7951 -= local203.anInt10256;
								if (arg0.aClass280Array3[local154].anInt7954 + 1 >= local203.anInt10253) {
									arg0.aClass280Array3[local154].anInt7951 = -1;
								} else if (arg0.aClass280Array3[local154].anInt7951 < 0 || arg0.aClass280Array3[local154].anInt7951 >= local203.anIntArray901.length) {
									arg0.aClass280Array3[local154].anInt7951 = -1;
								}
							} else {
								arg0.aClass280Array3[local154].anInt7951 = -1;
							}
						}
					}
				}
			}
		}
		@Pc(559) Class372 local559;
		if (arg0.anInt10773 != -1 && arg0.anInt10775 <= 1) {
			local559 = Static243.aClass343_3.method8356(arg0.anInt10773);
			if (local559.anInt10244 == 3) {
				if (arg0.anInt10814 > 0 && Static588.anInt9467 >= arg0.anInt10780 && arg0.anInt10755 < Static588.anInt9467) {
					arg0.lb = null;
					arg0.anInt10773 = -1;
				}
			} else if (local559.anInt10244 == 1 && arg0.anInt10814 > 0 && arg0.anInt10780 <= Static588.anInt9467 && Static588.anInt9467 > arg0.anInt10755) {
				arg0.anInt10775 = 2;
			}
		}
		if (arg0.anInt10773 != -1 && arg0.anInt10775 == 0) {
			local559 = Static243.aClass343_3.method8356(arg0.anInt10773);
			if (local559 == null || local559.anIntArray901 == null) {
				arg0.lb = null;
				arg0.anInt10773 = -1;
			} else {
				arg0.anInt10758++;
				if (arg0.anInt10750 < local559.anIntArray901.length && arg0.anInt10758 > local559.anIntArray900[arg0.anInt10750]) {
					arg0.anInt10750++;
					arg0.anInt10758 = 1;
					if (!arg0.aBoolean819) {
						Static548.method7844(arg0, local559, arg0.anInt10750);
					}
				}
				if (arg0.anInt10750 >= local559.anIntArray901.length) {
					arg0.anInt10767++;
					arg0.anInt10750 -= local559.anInt10256;
					if (arg0.anInt10767 >= local559.anInt10253) {
						arg0.lb = null;
						arg0.anInt10773 = -1;
					} else if (arg0.anInt10750 < 0 || arg0.anInt10750 >= local559.anIntArray901.length) {
						arg0.anInt10773 = -1;
						arg0.lb = null;
					} else if (!arg0.aBoolean819) {
						Static548.method7844(arg0, local559, arg0.anInt10750);
					}
				}
				arg0.anInt10804 = arg0.anInt10750 + 1;
				if (arg0.anInt10804 >= local559.anIntArray901.length) {
					arg0.anInt10804 -= local559.anInt10256;
					if (local559.anInt10253 <= arg0.anInt10767 + 1) {
						arg0.anInt10804 = -1;
					} else if (arg0.anInt10804 < 0 || arg0.anInt10804 >= local559.anIntArray901.length) {
						arg0.anInt10804 = -1;
					}
				}
			}
		}
		if (arg0.anInt10775 > 0) {
			arg0.anInt10775--;
		}
		for (@Pc(834) int local834 = 0; local834 < arg0.aClass107Array3.length; local834++) {
			@Pc(841) Class107 local841 = arg0.aClass107Array3[local834];
			if (local841 != null) {
				if (local841.anInt3423 > 0) {
					local841.anInt3423--;
				} else {
					local203 = Static243.aClass343_3.method8356(local841.anInt3426);
					if (local203 == null || local203.anIntArray901 == null) {
						arg0.aClass107Array3[local834] = null;
					} else {
						local841.anInt3424++;
						if (local841.anInt3418 < local203.anIntArray901.length && local841.anInt3424 > local203.anIntArray900[local841.anInt3418]) {
							local841.anInt3418++;
							local841.anInt3424 = 1;
							if (!arg0.aBoolean819) {
								Static548.method7844(arg0, local203, local841.anInt3418);
							}
						}
						if (local203.anIntArray901.length <= local841.anInt3418) {
							local841.anInt3418 -= local203.anInt10256;
							local841.anInt3419++;
							if (local203.anInt10253 <= local841.anInt3419) {
								arg0.aClass107Array3[local834] = null;
							} else if (local841.anInt3418 < 0 || local841.anInt3418 >= local203.anIntArray901.length) {
								arg0.aClass107Array3[local834] = null;
							} else if (!arg0.aBoolean819) {
								Static548.method7844(arg0, local203, local841.anInt3418);
							}
						}
						local841.anInt3421 = local841.anInt3418 + 1;
						if (local841.anInt3421 >= local203.anIntArray901.length) {
							local841.anInt3421 -= local203.anInt10256;
							if (local203.anInt10253 <= local841.anInt3419 + 1) {
								local841.anInt3421 = -1;
							} else if (local841.anInt3421 < 0 || local203.anIntArray901.length <= local841.anInt3421) {
								local841.anInt3421 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	public static void method2938() {
		if (Static110.anInt2265 == -1) {
			return;
		}
		@Pc(12) int local12 = Static22.aClass16_2.method5885();
		@Pc(16) int local16 = Static22.aClass16_2.method5887();
		@Pc(21) Class3_Sub43 local21 = (Class3_Sub43) Static655.aClass338_233.method8177();
		if (local21 != null) {
			local12 = local21.method7774();
			local16 = local21.method7777();
		}
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (Static82.aBoolean134) {
			local33 = Static31.method748();
			local35 = Static147.method2738();
		}
		Static568.method8031(local33, local16, local35, local33 + Static312.anInt5191, local12, local33, local12 + local33, Static110.anInt2265, Static222.anInt4196 + local35, local35, local16 + local35);
		if (Static601.aClass260_20 != null) {
			Static557.method7931(local12 + local33, local35 + local16);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)J")
	public static long method2939(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}
}
