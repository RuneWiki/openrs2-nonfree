import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gq", name = "t", descriptor = "Lclient!hw;")
	public static Class134 aClass134_2;

	@OriginalMember(owner = "client!gq", name = "x", descriptor = "[I")
	public static int[] anIntArray159;

	@OriginalMember(owner = "client!gq", name = "y", descriptor = "Lclient!dd;")
	public static Class47 aClass47_2;

	@OriginalMember(owner = "client!gq", name = "A", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_132 = new Class123(103, 7);

	@OriginalMember(owner = "client!gq", name = "s", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[100];

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
	public static int anInt3914 = 0;

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "Z")
	public static boolean aBoolean271 = false;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!ol;B)V")
	public static void method3177(@OriginalArg(0) Class25_Sub2_Sub2_Sub5 arg0) {
		@Pc(15) Class270 local15;
		if (arg0.anInt8516 != -1) {
			local15 = Static245.aClass155_1.method3820(arg0.anInt8516);
			if (local15 == null || local15.anIntArray443 == null) {
				arg0.anInt8516 = -1;
				arg0.aBoolean579 = false;
			} else {
				label357: {
					arg0.anInt8522++;
					if (arg0.anInt8517 < local15.anIntArray443.length && local15.anIntArray445[arg0.anInt8517] < arg0.anInt8522) {
						arg0.anInt8517++;
						arg0.lb++;
						arg0.anInt8522 = 1;
						if (!arg0.aBoolean578) {
							Static217.method3600(arg0.anInt8517, arg0, local15);
						}
					}
					if (local15.anIntArray443.length <= arg0.anInt8517) {
						arg0.anInt8517 = 0;
						arg0.anInt8522 = 0;
						if (arg0.aBoolean579) {
							arg0.anInt8516 = arg0.method6683().method3399();
							if (arg0.anInt8516 == -1) {
								arg0.aBoolean579 = false;
								break label357;
							}
							local15 = Static245.aClass155_1.method3820(arg0.anInt8516);
						}
						if (!arg0.aBoolean578) {
							Static217.method3600(arg0.anInt8517, arg0, local15);
						}
					}
					arg0.lb = arg0.anInt8517 + 1;
					if (local15.anIntArray443 == null) {
						arg0.anInt8516 = -1;
						arg0.aBoolean579 = false;
					} else if (arg0.lb >= local15.anIntArray443.length) {
						arg0.lb = 0;
					}
				}
			}
		}
		@Pc(175) int local175;
		@Pc(188) Class270 local188;
		@Pc(172) Class250 local172;
		if (arg0.anInt8548 != -1 && Static397.anInt6998 >= arg0.anInt8525) {
			local172 = Static386.aClass23_1.method228(arg0.anInt8548);
			local175 = local172.anInt7025;
			if (local175 == -1) {
				arg0.anInt8548 = -1;
			} else {
				label358: {
					local188 = Static245.aClass155_1.method3820(local175);
					if (local172.aBoolean484) {
						if (local188.anInt7684 == 3) {
							if (arg0.anInt8578 > 0 && Static397.anInt6998 >= arg0.anInt8533 && Static397.anInt6998 > arg0.anInt8493) {
								arg0.anInt8548 = -1;
								break label358;
							}
						} else if (local188.anInt7684 == 1 && arg0.anInt8578 > 0 && Static397.anInt6998 >= arg0.anInt8533 && Static397.anInt6998 > arg0.anInt8493) {
							arg0.anInt8525 = Static397.anInt6998 + 1;
							break label358;
						}
					}
					if (local188 == null || local188.anIntArray443 == null) {
						arg0.anInt8548 = -1;
					} else {
						if (arg0.anInt8567 < 0) {
							arg0.anInt8567 = 0;
							if (!arg0.aBoolean578) {
								Static217.method3600(0, arg0, local188);
							}
						}
						arg0.anInt8540++;
						if (local188.anIntArray443.length > arg0.anInt8567 && local188.anIntArray445[arg0.anInt8567] < arg0.anInt8540) {
							arg0.anInt8567++;
							arg0.anInt8540 = 1;
							if (!arg0.aBoolean578) {
								Static217.method3600(arg0.anInt8567, arg0, local188);
							}
						}
						if (local188.anIntArray443.length <= arg0.anInt8567) {
							if (local172.aBoolean484) {
								arg0.anInt8567 -= local188.anInt7683;
								arg0.anInt8551++;
								if (local188.anInt7682 <= arg0.anInt8551) {
									arg0.anInt8548 = -1;
								} else if (arg0.anInt8567 < 0 || arg0.anInt8567 >= local188.anIntArray443.length) {
									arg0.anInt8548 = -1;
								} else if (!arg0.aBoolean578) {
									Static217.method3600(arg0.anInt8567, arg0, local188);
								}
							} else {
								arg0.anInt8548 = -1;
							}
						}
						arg0.anInt8561 = arg0.anInt8567 + 1;
						if (local188.anIntArray443.length <= arg0.anInt8561) {
							if (local172.aBoolean484) {
								arg0.anInt8561 -= local188.anInt7683;
								if (arg0.anInt8551 + 1 >= local188.anInt7682) {
									arg0.anInt8561 = -1;
								} else if (arg0.anInt8561 < 0 || arg0.anInt8561 >= local188.anIntArray443.length) {
									arg0.anInt8561 = -1;
								}
							} else {
								arg0.anInt8561 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8508 != -1 && arg0.anInt8576 <= Static397.anInt6998) {
			local172 = Static386.aClass23_1.method228(arg0.anInt8508);
			local175 = local172.anInt7025;
			if (local175 == -1) {
				arg0.anInt8508 = -1;
			} else {
				label362: {
					local188 = Static245.aClass155_1.method3820(local175);
					if (local172.aBoolean484) {
						if (local188.anInt7684 == 3) {
							if (arg0.anInt8578 > 0 && arg0.anInt8533 <= Static397.anInt6998 && Static397.anInt6998 > arg0.anInt8493) {
								arg0.anInt8508 = -1;
								break label362;
							}
						} else if (local188.anInt7684 == 1 && arg0.anInt8578 > 0 && Static397.anInt6998 >= arg0.anInt8533 && Static397.anInt6998 > arg0.anInt8493) {
							arg0.anInt8576 = Static397.anInt6998 + 1;
							break label362;
						}
					}
					if (local188 == null || local188.anIntArray443 == null) {
						arg0.anInt8508 = -1;
					} else {
						if (arg0.anInt8495 < 0) {
							arg0.anInt8495 = 0;
							if (!arg0.aBoolean578) {
								Static217.method3600(0, arg0, local188);
							}
						}
						arg0.anInt8504++;
						if (arg0.anInt8495 < local188.anIntArray443.length && arg0.anInt8504 > local188.anIntArray445[arg0.anInt8495]) {
							arg0.anInt8504 = 1;
							arg0.anInt8495++;
							if (!arg0.aBoolean578) {
								Static217.method3600(arg0.anInt8495, arg0, local188);
							}
						}
						if (local188.anIntArray443.length <= arg0.anInt8495) {
							if (local172.aBoolean484) {
								arg0.anInt8495 -= local188.anInt7683;
								arg0.anInt8572++;
								if (local188.anInt7682 <= arg0.anInt8572) {
									arg0.anInt8508 = -1;
								} else if (arg0.anInt8495 < 0 || arg0.anInt8495 >= local188.anIntArray443.length) {
									arg0.anInt8508 = -1;
								} else if (!arg0.aBoolean578) {
									Static217.method3600(arg0.anInt8495, arg0, local188);
								}
							} else {
								arg0.anInt8508 = -1;
							}
						}
						arg0.anInt8499 = arg0.anInt8495 + 1;
						if (arg0.anInt8499 >= local188.anIntArray443.length) {
							if (local172.aBoolean484) {
								arg0.anInt8499 -= local188.anInt7683;
								if (local188.anInt7682 <= arg0.anInt8572 + 1) {
									arg0.anInt8499 = -1;
								} else if (arg0.anInt8499 < 0 || arg0.anInt8499 >= local188.anIntArray443.length) {
									arg0.anInt8499 = -1;
								}
							} else {
								arg0.anInt8499 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8545 != -1 && arg0.anInt8492 <= 1) {
			local15 = Static245.aClass155_1.method3820(arg0.anInt8545);
			if (local15.anInt7684 == 3) {
				if (arg0.anInt8578 > 0 && arg0.anInt8533 <= Static397.anInt6998 && Static397.anInt6998 > arg0.anInt8493) {
					arg0.anIntArray508 = null;
					arg0.anInt8545 = -1;
				}
			} else if (local15.anInt7684 == 1 && arg0.anInt8578 > 0 && arg0.anInt8533 <= Static397.anInt6998 && Static397.anInt6998 > arg0.anInt8493) {
				arg0.anInt8492 = 2;
			}
		}
		if (arg0.anInt8545 != -1 && arg0.anInt8492 == 0) {
			local15 = Static245.aClass155_1.method3820(arg0.anInt8545);
			if (local15 == null || local15.anIntArray443 == null) {
				arg0.anInt8545 = -1;
				arg0.anIntArray508 = null;
			} else {
				arg0.anInt8521++;
				if (arg0.anInt8539 < local15.anIntArray443.length && arg0.anInt8521 > local15.anIntArray445[arg0.anInt8539]) {
					arg0.anInt8521 = 1;
					arg0.anInt8539++;
					if (!arg0.aBoolean578) {
						Static217.method3600(arg0.anInt8539, arg0, local15);
					}
				}
				if (local15.anIntArray443.length <= arg0.anInt8539) {
					arg0.anInt8543++;
					arg0.anInt8539 -= local15.anInt7683;
					if (local15.anInt7682 <= arg0.anInt8543) {
						arg0.anIntArray508 = null;
						arg0.anInt8545 = -1;
					} else if (arg0.anInt8539 < 0 || arg0.anInt8539 >= local15.anIntArray443.length) {
						arg0.anInt8545 = -1;
						arg0.anIntArray508 = null;
					} else if (!arg0.aBoolean578) {
						Static217.method3600(arg0.anInt8539, arg0, local15);
					}
				}
				arg0.anInt8526 = arg0.anInt8539 + 1;
				if (arg0.anInt8526 >= local15.anIntArray443.length) {
					arg0.anInt8526 -= local15.anInt7683;
					if (local15.anInt7682 <= arg0.anInt8543 + 1) {
						arg0.anInt8526 = -1;
					} else if (arg0.anInt8526 < 0 || arg0.anInt8526 >= local15.anIntArray443.length) {
						arg0.anInt8526 = -1;
					}
				}
			}
		}
		if (arg0.anInt8492 > 0) {
			arg0.anInt8492--;
		}
		for (@Pc(999) int local999 = 0; local999 < arg0.aClass271Array3.length; local999++) {
			@Pc(1006) Class271 local1006 = arg0.aClass271Array3[local999];
			if (local1006 != null) {
				if (local1006.anInt7813 > 0) {
					local1006.anInt7813--;
				} else {
					local188 = Static245.aClass155_1.method3820(local1006.anInt7811);
					if (local188 == null || local188.anIntArray443 == null) {
						arg0.aClass271Array3[local999] = null;
					} else {
						local1006.anInt7816++;
						if (local1006.anInt7809 < local188.anIntArray443.length && local188.anIntArray445[local1006.anInt7809] < local1006.anInt7816) {
							local1006.anInt7809++;
							local1006.anInt7816 = 1;
							if (!arg0.aBoolean578) {
								Static217.method3600(local1006.anInt7809, arg0, local188);
							}
						}
						if (local1006.anInt7809 >= local188.anIntArray443.length) {
							local1006.anInt7812++;
							local1006.anInt7809 -= local188.anInt7683;
							if (local1006.anInt7812 >= local188.anInt7682) {
								arg0.aClass271Array3[local999] = null;
							} else if (local1006.anInt7809 < 0 || local1006.anInt7809 >= local188.anIntArray443.length) {
								arg0.aClass271Array3[local999] = null;
							} else if (!arg0.aBoolean578) {
								Static217.method3600(local1006.anInt7809, arg0, local188);
							}
						}
						local1006.anInt7815 = local1006.anInt7809 + 1;
						if (local1006.anInt7815 >= local188.anIntArray443.length) {
							local1006.anInt7815 -= local188.anInt7683;
							if (local188.anInt7682 <= local1006.anInt7812 + 1) {
								local1006.anInt7815 = -1;
							} else if (local1006.anInt7815 < 0 || local1006.anInt7815 >= local188.anIntArray443.length) {
								local1006.anInt7815 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6) {
		Static559.aClass236Array6[Static259.anInt1154++] = new Class236(4, arg3, arg1, arg6, arg6, arg1, arg4, arg0, arg0, arg4, arg2, arg2, arg5, arg5);
	}
}
