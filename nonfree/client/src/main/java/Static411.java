import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
	public static int anInt7045;

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
	public static int anInt7046;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!li;B)V")
	public static void method6069(@OriginalArg(0) Class41_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt9484 != -1) {
			@Pc(9) Class65 local9 = Static459.aClass128_2.method2686(arg0.anInt9484);
			if (local9 == null || local9.anIntArray75 == null) {
				arg0.anInt9484 = -1;
				arg0.aBoolean690 = false;
			} else {
				label277: {
					arg0.anInt9512++;
					if (local9.anIntArray75.length > arg0.anInt9513 && local9.anIntArray71[arg0.anInt9513] < arg0.anInt9512) {
						arg0.anInt9513++;
						arg0.anInt9480++;
						arg0.anInt9512 = 1;
						if (!arg0.aBoolean692) {
							Static119.method1899(arg0.anInt9513, arg0, local9);
						}
					}
					if (arg0.anInt9513 >= local9.anIntArray75.length) {
						arg0.anInt9513 = 0;
						arg0.anInt9512 = 0;
						if (arg0.aBoolean690) {
							arg0.anInt9484 = arg0.method7933().method4159();
							if (arg0.anInt9484 == -1) {
								arg0.aBoolean690 = false;
								break label277;
							}
							local9 = Static459.aClass128_2.method2686(arg0.anInt9484);
						}
						if (!arg0.aBoolean692) {
							Static119.method1899(arg0.anInt9513, arg0, local9);
						}
					}
					arg0.anInt9480 = arg0.anInt9513 + 1;
					if (local9.anIntArray75 == null) {
						arg0.aBoolean690 = false;
						arg0.anInt9484 = -1;
					} else if (arg0.anInt9480 >= local9.anIntArray75.length) {
						arg0.anInt9480 = 0;
					}
				}
			}
		}
		@Pc(194) Class65 local194;
		for (@Pc(151) int local151 = 0; local151 < arg0.aClass329Array3.length; local151++) {
			if (arg0.aClass329Array3[local151].anInt9066 != -1 && arg0.aClass329Array3[local151].anInt9070 <= Static421.anInt7434) {
				@Pc(176) Class385 local176 = Static312.aClass179_1.method3798(arg0.aClass329Array3[local151].anInt9066);
				@Pc(179) int local179 = local176.anInt10218;
				if (local179 == -1) {
					arg0.aClass329Array3[local151].anInt9066 = -1;
				} else {
					local194 = Static459.aClass128_2.method2686(local179);
					if (local176.aBoolean742) {
						if (local194.anInt1428 == 3) {
							if (arg0.anInt9525 > 0 && Static421.anInt7434 >= arg0.anInt9491 && arg0.anInt9455 < Static421.anInt7434) {
								arg0.aClass329Array3[local151].anInt9066 = -1;
								continue;
							}
						} else if (local194.anInt1428 == 1 && arg0.anInt9525 > 0 && Static421.anInt7434 >= arg0.anInt9491 && arg0.anInt9455 < Static421.anInt7434) {
							arg0.aClass329Array3[local151].anInt9070 = Static421.anInt7434 + 1;
							continue;
						}
					}
					if (local194 == null || local194.anIntArray75 == null) {
						arg0.aClass329Array3[local151].anInt9066 = -1;
					} else {
						if (arg0.aClass329Array3[local151].anInt9076 < 0) {
							arg0.aClass329Array3[local151].anInt9076 = 0;
							if (!arg0.aBoolean692) {
								Static119.method1899(0, arg0, local194);
							}
						}
						arg0.aClass329Array3[local151].anInt9071++;
						if (local194.anIntArray75.length > arg0.aClass329Array3[local151].anInt9076 && arg0.aClass329Array3[local151].anInt9071 > local194.anIntArray71[arg0.aClass329Array3[local151].anInt9076]) {
							arg0.aClass329Array3[local151].anInt9071 = 1;
							arg0.aClass329Array3[local151].anInt9076++;
							if (!arg0.aBoolean692) {
								Static119.method1899(arg0.aClass329Array3[local151].anInt9076, arg0, local194);
							}
						}
						if (local194.anIntArray75.length <= arg0.aClass329Array3[local151].anInt9076) {
							if (local176.aBoolean742) {
								arg0.aClass329Array3[local151].anInt9076 -= local194.anInt1432;
								arg0.aClass329Array3[local151].anInt9072++;
								if (arg0.aClass329Array3[local151].anInt9072 >= local194.anInt1429) {
									arg0.aClass329Array3[local151].anInt9066 = -1;
								} else if (arg0.aClass329Array3[local151].anInt9076 < 0 || arg0.aClass329Array3[local151].anInt9076 >= local194.anIntArray75.length) {
									arg0.aClass329Array3[local151].anInt9066 = -1;
								} else if (!arg0.aBoolean692) {
									Static119.method1899(arg0.aClass329Array3[local151].anInt9076, arg0, local194);
								}
							} else {
								arg0.aClass329Array3[local151].anInt9066 = -1;
							}
						}
						arg0.aClass329Array3[local151].anInt9073 = arg0.aClass329Array3[local151].anInt9076 + 1;
						if (arg0.aClass329Array3[local151].anInt9073 >= local194.anIntArray75.length) {
							if (local176.aBoolean742) {
								arg0.aClass329Array3[local151].anInt9073 -= local194.anInt1432;
								if (local194.anInt1429 <= arg0.aClass329Array3[local151].anInt9072 + 1) {
									arg0.aClass329Array3[local151].anInt9073 = -1;
								} else if (arg0.aClass329Array3[local151].anInt9073 < 0 || local194.anIntArray75.length <= arg0.aClass329Array3[local151].anInt9073) {
									arg0.aClass329Array3[local151].anInt9073 = -1;
								}
							} else {
								arg0.aClass329Array3[local151].anInt9073 = -1;
							}
						}
					}
				}
			}
		}
		@Pc(569) Class65 local569;
		if (arg0.anInt9503 != -1 && arg0.anInt9463 <= 1) {
			local569 = Static459.aClass128_2.method2686(arg0.anInt9503);
			if (local569.anInt1428 == 3) {
				if (arg0.anInt9525 > 0 && Static421.anInt7434 >= arg0.anInt9491 && arg0.anInt9455 < Static421.anInt7434) {
					arg0.anInt9503 = -1;
					arg0.anIntArray521 = null;
				}
			} else if (local569.anInt1428 == 1 && arg0.anInt9525 > 0 && arg0.anInt9491 <= Static421.anInt7434 && Static421.anInt7434 > arg0.anInt9455) {
				arg0.anInt9463 = 2;
			}
		}
		if (arg0.anInt9503 != -1 && arg0.anInt9463 == 0) {
			local569 = Static459.aClass128_2.method2686(arg0.anInt9503);
			if (local569 == null || local569.anIntArray75 == null) {
				arg0.anIntArray521 = null;
				arg0.anInt9503 = -1;
			} else {
				arg0.anInt9459++;
				if (local569.anIntArray75.length > arg0.anInt9507 && arg0.anInt9459 > local569.anIntArray71[arg0.anInt9507]) {
					arg0.anInt9459 = 1;
					arg0.anInt9507++;
					if (!arg0.aBoolean692) {
						Static119.method1899(arg0.anInt9507, arg0, local569);
					}
				}
				if (arg0.anInt9507 >= local569.anIntArray75.length) {
					arg0.anInt9507 -= local569.anInt1432;
					arg0.anInt9475++;
					if (arg0.anInt9475 >= local569.anInt1429) {
						arg0.anIntArray521 = null;
						arg0.anInt9503 = -1;
					} else if (arg0.anInt9507 < 0 || local569.anIntArray75.length <= arg0.anInt9507) {
						arg0.anIntArray521 = null;
						arg0.anInt9503 = -1;
					} else if (!arg0.aBoolean692) {
						Static119.method1899(arg0.anInt9507, arg0, local569);
					}
				}
				arg0.anInt9461 = arg0.anInt9507 + 1;
				if (local569.anIntArray75.length <= arg0.anInt9461) {
					arg0.anInt9461 -= local569.anInt1432;
					if (local569.anInt1429 <= arg0.anInt9475 + 1) {
						arg0.anInt9461 = -1;
					} else if (arg0.anInt9461 < 0 || arg0.anInt9461 >= local569.anIntArray75.length) {
						arg0.anInt9461 = -1;
					}
				}
			}
		}
		if (arg0.anInt9463 > 0) {
			arg0.anInt9463--;
		}
		for (@Pc(809) int local809 = 0; local809 < arg0.aClass127Array3.length; local809++) {
			@Pc(815) Class127 local815 = arg0.aClass127Array3[local809];
			if (local815 != null) {
				if (local815.anInt2992 > 0) {
					local815.anInt2992--;
				} else {
					local194 = Static459.aClass128_2.method2686(local815.anInt2995);
					if (local194 == null || local194.anIntArray75 == null) {
						arg0.aClass127Array3[local809] = null;
					} else {
						local815.anInt2991++;
						if (local194.anIntArray75.length > local815.anInt2993 && local815.anInt2991 > local194.anIntArray71[local815.anInt2993]) {
							local815.anInt2991 = 1;
							local815.anInt2993++;
							if (!arg0.aBoolean692) {
								Static119.method1899(local815.anInt2993, arg0, local194);
							}
						}
						if (local815.anInt2993 >= local194.anIntArray75.length) {
							local815.anInt2990++;
							local815.anInt2993 -= local194.anInt1432;
							if (local194.anInt1429 <= local815.anInt2990) {
								arg0.aClass127Array3[local809] = null;
							} else if (local815.anInt2993 < 0 || local815.anInt2993 >= local194.anIntArray75.length) {
								arg0.aClass127Array3[local809] = null;
							} else if (!arg0.aBoolean692) {
								Static119.method1899(local815.anInt2993, arg0, local194);
							}
						}
						local815.anInt2994 = local815.anInt2993 + 1;
						if (local815.anInt2994 >= local194.anIntArray75.length) {
							local815.anInt2994 -= local194.anInt1432;
							if (local194.anInt1429 <= local815.anInt2990 + 1) {
								local815.anInt2994 = -1;
							} else if (local815.anInt2994 < 0 || local815.anInt2994 >= local194.anIntArray75.length) {
								local815.anInt2994 = -1;
							}
						}
					}
				}
			}
		}
	}
}
