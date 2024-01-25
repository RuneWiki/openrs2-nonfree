import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!ri", name = "M", descriptor = "[Lclient!qg;")
	public static Class87[] aClass87Array16;

	@OriginalMember(owner = "client!ri", name = "O", descriptor = "Lclient!he;")
	public static Class100 aClass100_68;

	@OriginalMember(owner = "client!ri", name = "N", descriptor = "[B")
	public static final byte[] aByteArray74 = new byte[2048];

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "([Ljava/lang/String;[SB)V")
	public static void method4952(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Static54.method1222(0, arg1, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLclient!bn;)V")
	public static void method4954(@OriginalArg(1) Class3_Sub2_Sub1 arg0) {
		arg0.aBoolean420 = false;
		@Pc(23) Class131 local23;
		if (arg0.anInt6597 != -1) {
			local23 = Static5.aClass217_1.method5234(arg0.anInt6597);
			if (local23 == null || local23.anIntArray235 == null) {
				arg0.aBoolean418 = false;
				arg0.anInt6597 = -1;
			} else {
				label394: {
					arg0.anInt6581++;
					if (arg0.anInt6594 < local23.anIntArray235.length && arg0.anInt6581 > local23.anIntArray233[arg0.anInt6594]) {
						arg0.anInt6576++;
						arg0.anInt6581 = 1;
						arg0.anInt6594++;
						Static160.method2664(arg0.anInt6594, arg0.anInt7202, Static302.aClass3_Sub2_Sub1_Sub2_2 == arg0, local23, arg0.anInt7207, arg0.aByte103);
					}
					if (local23.anIntArray235.length <= arg0.anInt6594) {
						arg0.anInt6594 = 0;
						arg0.anInt6581 = 0;
						if (arg0.aBoolean418) {
							arg0.anInt6597 = arg0.method5513().method6015();
							if (arg0.anInt6597 == -1) {
								arg0.aBoolean418 = false;
								break label394;
							}
							local23 = Static5.aClass217_1.method5234(arg0.anInt6597);
						}
						Static160.method2664(arg0.anInt6594, arg0.anInt7202, arg0 == Static302.aClass3_Sub2_Sub1_Sub2_2, local23, arg0.anInt7207, arg0.aByte103);
					}
					arg0.anInt6576 = arg0.anInt6594 + 1;
					if (arg0.anInt6576 >= local23.anIntArray235.length) {
						arg0.anInt6576 = 0;
					}
				}
			}
		}
		@Pc(182) int local182;
		@Pc(196) Class131 local196;
		@Pc(179) Class58 local179;
		if (arg0.anInt6609 != -1 && arg0.anInt6545 <= Static66.anInt1741) {
			local179 = Static141.aClass141_2.method3177(arg0.anInt6609);
			local182 = local179.anInt2019;
			if (local182 == -1) {
				arg0.anInt6609 = -1;
			} else {
				label396: {
					local196 = Static5.aClass217_1.method5234(local182);
					if (local179.aBoolean141) {
						if (local196.anInt3708 == 3) {
							if (arg0.anInt6611 > 0 && Static66.anInt1741 >= arg0.anInt6570 && arg0.anInt6595 < Static66.anInt1741) {
								arg0.anInt6609 = -1;
								break label396;
							}
						} else if (local196.anInt3708 == 1 && arg0.anInt6611 > 0 && arg0.anInt6570 <= Static66.anInt1741 && arg0.anInt6595 < Static66.anInt1741) {
							arg0.anInt6545 = Static66.anInt1741 + 1;
							break label396;
						}
					}
					if (local196 == null || local196.anIntArray235 == null) {
						arg0.anInt6609 = -1;
					} else {
						if (arg0.anInt6538 < 0) {
							arg0.anInt6538 = 0;
							Static160.method2664(0, arg0.anInt7202, Static302.aClass3_Sub2_Sub1_Sub2_2 == arg0, local196, arg0.anInt7207, arg0.aByte103);
						}
						arg0.anInt6541++;
						if (arg0.anInt6538 < local196.anIntArray235.length && local196.anIntArray233[arg0.anInt6538] < arg0.anInt6541) {
							arg0.anInt6538++;
							arg0.anInt6541 = 1;
							Static160.method2664(arg0.anInt6538, arg0.anInt7202, Static302.aClass3_Sub2_Sub1_Sub2_2 == arg0, local196, arg0.anInt7207, arg0.aByte103);
						}
						if (arg0.anInt6538 >= local196.anIntArray235.length) {
							if (local179.aBoolean141) {
								arg0.anInt6608++;
								arg0.anInt6538 -= local196.anInt3698;
								if (local196.anInt3699 <= arg0.anInt6608) {
									arg0.anInt6609 = -1;
								} else if (arg0.anInt6538 >= 0 && arg0.anInt6538 < local196.anIntArray235.length) {
									Static160.method2664(arg0.anInt6538, arg0.anInt7202, arg0 == Static302.aClass3_Sub2_Sub1_Sub2_2, local196, arg0.anInt7207, arg0.aByte103);
								} else {
									arg0.anInt6609 = -1;
								}
							} else {
								arg0.anInt6609 = -1;
							}
						}
						arg0.anInt6599 = arg0.anInt6538 + 1;
						if (local196.anIntArray235.length <= arg0.anInt6599) {
							if (local179.aBoolean141) {
								arg0.anInt6599 -= local196.anInt3698;
								if (local196.anInt3699 <= arg0.anInt6608 + 1) {
									arg0.anInt6599 = -1;
								} else if (arg0.anInt6599 < 0 || local196.anIntArray235.length <= arg0.anInt6599) {
									arg0.anInt6599 = -1;
								}
							} else {
								arg0.anInt6599 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6603 != -1 && Static66.anInt1741 >= arg0.anInt6579) {
			local179 = Static141.aClass141_2.method3177(arg0.anInt6603);
			local182 = local179.anInt2019;
			if (local182 == -1) {
				arg0.anInt6603 = -1;
			} else {
				label399: {
					local196 = Static5.aClass217_1.method5234(local182);
					if (local179.aBoolean141) {
						if (local196.anInt3708 == 3) {
							if (arg0.anInt6611 > 0 && Static66.anInt1741 >= arg0.anInt6570 && Static66.anInt1741 > arg0.anInt6595) {
								arg0.anInt6603 = -1;
								break label399;
							}
						} else if (local196.anInt3708 == 1 && arg0.anInt6611 > 0 && arg0.anInt6570 <= Static66.anInt1741 && Static66.anInt1741 > arg0.anInt6595) {
							arg0.anInt6579 = Static66.anInt1741 + 1;
							break label399;
						}
					}
					if (local196 == null || local196.anIntArray235 == null) {
						arg0.anInt6603 = -1;
					} else {
						if (arg0.anInt6550 < 0) {
							arg0.anInt6550 = 0;
							Static160.method2664(0, arg0.anInt7202, arg0 == Static302.aClass3_Sub2_Sub1_Sub2_2, local196, arg0.anInt7207, arg0.aByte103);
						}
						arg0.anInt6565++;
						if (arg0.anInt6550 < local196.anIntArray235.length && local196.anIntArray233[arg0.anInt6550] < arg0.anInt6565) {
							arg0.anInt6550++;
							arg0.anInt6565 = 1;
							Static160.method2664(arg0.anInt6550, arg0.anInt7202, Static302.aClass3_Sub2_Sub1_Sub2_2 == arg0, local196, arg0.anInt7207, arg0.aByte103);
						}
						if (local196.anIntArray235.length <= arg0.anInt6550) {
							if (local179.aBoolean141) {
								arg0.anInt6550 -= local196.anInt3698;
								arg0.anInt6574++;
								if (local196.anInt3699 <= arg0.anInt6574) {
									arg0.anInt6603 = -1;
								} else if (arg0.anInt6550 >= 0 && local196.anIntArray235.length > arg0.anInt6550) {
									Static160.method2664(arg0.anInt6550, arg0.anInt7202, Static302.aClass3_Sub2_Sub1_Sub2_2 == arg0, local196, arg0.anInt7207, arg0.aByte103);
								} else {
									arg0.anInt6603 = -1;
								}
							} else {
								arg0.anInt6603 = -1;
							}
						}
						arg0.anInt6567 = arg0.anInt6550 + 1;
						if (local196.anIntArray235.length <= arg0.anInt6567) {
							if (local179.aBoolean141) {
								arg0.anInt6567 -= local196.anInt3698;
								if (arg0.anInt6574 + 1 >= local196.anInt3699) {
									arg0.anInt6567 = -1;
								} else if (arg0.anInt6567 < 0 || arg0.anInt6567 >= local196.anIntArray235.length) {
									arg0.anInt6567 = -1;
								}
							} else {
								arg0.anInt6567 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.lb != -1 && arg0.anInt6557 <= 1) {
			local23 = Static5.aClass217_1.method5234(arg0.lb);
			if (local23.anInt3708 == 3) {
				if (arg0.anInt6611 > 0 && Static66.anInt1741 >= arg0.anInt6570 && Static66.anInt1741 > arg0.anInt6595) {
					arg0.lb = -1;
				}
			} else if (local23.anInt3708 == 1 && arg0.anInt6611 > 0 && arg0.anInt6570 <= Static66.anInt1741 && arg0.anInt6595 < Static66.anInt1741) {
				arg0.anInt6557 = 2;
			}
		}
		if (arg0.lb != -1 && arg0.anInt6557 == 0) {
			local23 = Static5.aClass217_1.method5234(arg0.lb);
			if (local23 == null || local23.anIntArray235 == null) {
				arg0.lb = -1;
			} else {
				arg0.anInt6601++;
				if (local23.anIntArray235.length > arg0.anInt6563 && local23.anIntArray233[arg0.anInt6563] < arg0.anInt6601) {
					arg0.anInt6601 = 1;
					arg0.anInt6563++;
					Static160.method2664(arg0.anInt6563, arg0.anInt7202, arg0 == Static302.aClass3_Sub2_Sub1_Sub2_2, local23, arg0.anInt7207, arg0.aByte103);
				}
				if (local23.anIntArray235.length <= arg0.anInt6563) {
					arg0.anInt6563 -= local23.anInt3698;
					arg0.anInt6551++;
					if (arg0.anInt6551 >= local23.anInt3699) {
						arg0.lb = -1;
					} else if (arg0.anInt6563 >= 0 && local23.anIntArray235.length > arg0.anInt6563) {
						Static160.method2664(arg0.anInt6563, arg0.anInt7202, Static302.aClass3_Sub2_Sub1_Sub2_2 == arg0, local23, arg0.anInt7207, arg0.aByte103);
					} else {
						arg0.lb = -1;
					}
				}
				arg0.anInt6568 = arg0.anInt6563 + 1;
				if (arg0.anInt6568 >= local23.anIntArray235.length) {
					arg0.anInt6568 -= local23.anInt3698;
					if (local23.anInt3699 <= arg0.anInt6551 + 1) {
						arg0.anInt6568 = -1;
					} else if (arg0.anInt6568 < 0 || local23.anIntArray235.length <= arg0.anInt6568) {
						arg0.anInt6568 = -1;
					}
				}
				arg0.aBoolean420 = local23.aBoolean245;
			}
		}
		if (arg0.anInt6557 > 0) {
			arg0.anInt6557--;
		}
		for (@Pc(1040) int local1040 = 0; local1040 < arg0.aClass235Array3.length; local1040++) {
			@Pc(1047) Class235 local1047 = arg0.aClass235Array3[local1040];
			if (local1047 != null) {
				if (local1047.anInt6862 > 0) {
					local1047.anInt6862--;
				} else {
					local196 = Static5.aClass217_1.method5234(local1047.anInt6860);
					if (local196 == null || local196.anIntArray235 == null) {
						arg0.aClass235Array3[local1040] = null;
					} else {
						local1047.anInt6864++;
						if (local196.anIntArray235.length > local1047.anInt6861 && local196.anIntArray233[local1047.anInt6861] < local1047.anInt6864) {
							local1047.anInt6864 = 1;
							local1047.anInt6861++;
							Static160.method2664(local1047.anInt6861, arg0.anInt7202, arg0 == Static302.aClass3_Sub2_Sub1_Sub2_2, local196, arg0.anInt7207, arg0.aByte103);
						}
						if (local196.anIntArray235.length <= local1047.anInt6861) {
							local1047.anInt6861 -= local196.anInt3698;
							local1047.anInt6863++;
							if (local1047.anInt6863 >= local196.anInt3699) {
								arg0.aClass235Array3[local1040] = null;
							} else if (local1047.anInt6861 >= 0 && local196.anIntArray235.length > local1047.anInt6861) {
								Static160.method2664(local1047.anInt6861, arg0.anInt7202, arg0 == Static302.aClass3_Sub2_Sub1_Sub2_2, local196, arg0.anInt7207, arg0.aByte103);
							} else {
								arg0.aClass235Array3[local1040] = null;
							}
						}
						local1047.anInt6858 = local1047.anInt6861 + 1;
						if (local196.anIntArray235.length <= local1047.anInt6858) {
							local1047.anInt6858 -= local196.anInt3698;
							if (local1047.anInt6863 + 1 >= local196.anInt3699) {
								local1047.anInt6858 = -1;
							} else if (local1047.anInt6858 < 0 || local1047.anInt6858 >= local196.anIntArray235.length) {
								local1047.anInt6858 = -1;
							}
						}
					}
				}
			}
		}
	}
}
