import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "Z")
	public static boolean aBoolean48;

	@OriginalMember(owner = "client!baa", name = "i", descriptor = "[I")
	public static int[] anIntArray40;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!wv;I)V")
	public static void method853(@OriginalArg(0) Class4_Sub1_Sub1 arg0) {
		arg0.anInt7074 = 0;
		@Pc(19) Class57 local19;
		if (arg0.anInt7100 != -1) {
			local19 = Static78.aClass298_2.method6521(arg0.anInt7100);
			if (local19 == null || local19.anIntArray132 == null) {
				arg0.anInt7100 = -1;
				arg0.aBoolean495 = false;
			} else {
				label394: {
					arg0.anInt7083++;
					if (local19.anIntArray132.length > arg0.anInt7120 && arg0.anInt7083 > local19.anIntArray130[arg0.anInt7120]) {
						arg0.anInt7120++;
						arg0.anInt7083 = 1;
						arg0.anInt7081++;
						Static520.method6532(arg0.aByte108, local19, Static328.aClass4_Sub1_Sub1_Sub2_2 == arg0, arg0.anInt9542, arg0.anInt7120, arg0.anInt9540);
					}
					if (local19.anIntArray132.length <= arg0.anInt7120) {
						arg0.anInt7120 = 0;
						arg0.anInt7083 = 0;
						if (arg0.aBoolean495) {
							arg0.anInt7100 = arg0.method5891().method3168();
							if (arg0.anInt7100 == -1) {
								arg0.aBoolean495 = false;
								break label394;
							}
							local19 = Static78.aClass298_2.method6521(arg0.anInt7100);
						}
						Static520.method6532(arg0.aByte108, local19, arg0 == Static328.aClass4_Sub1_Sub1_Sub2_2, arg0.anInt9542, arg0.anInt7120, arg0.anInt9540);
					}
					arg0.anInt7081 = arg0.anInt7120 + 1;
					if (local19.anIntArray132.length <= arg0.anInt7081) {
						arg0.anInt7081 = 0;
					}
				}
			}
		}
		@Pc(184) int local184;
		@Pc(198) Class57 local198;
		@Pc(181) Class10 local181;
		if (arg0.anInt7069 != -1 && Static312.anInt5688 >= arg0.anInt7095) {
			local181 = Static289.aClass66_7.method1652(arg0.anInt7069);
			local184 = local181.anInt334;
			if (local184 == -1) {
				arg0.anInt7069 = -1;
			} else {
				label396: {
					local198 = Static78.aClass298_2.method6521(local184);
					if (local181.aBoolean21) {
						if (local198.anInt1531 == 3) {
							if (arg0.anInt7133 > 0 && arg0.anInt7105 <= Static312.anInt5688 && arg0.anInt7084 < Static312.anInt5688) {
								arg0.anInt7069 = -1;
								break label396;
							}
						} else if (local198.anInt1531 == 1 && arg0.anInt7133 > 0 && Static312.anInt5688 >= arg0.anInt7105 && arg0.anInt7084 < Static312.anInt5688) {
							arg0.anInt7095 = Static312.anInt5688 + 1;
							break label396;
						}
					}
					if (local198 == null || local198.anIntArray132 == null) {
						arg0.anInt7069 = -1;
					} else {
						if (arg0.anInt7087 < 0) {
							arg0.anInt7087 = 0;
							Static520.method6532(arg0.aByte108, local198, arg0 == Static328.aClass4_Sub1_Sub1_Sub2_2, arg0.anInt9542, 0, arg0.anInt9540);
						}
						arg0.anInt7092++;
						if (arg0.anInt7087 < local198.anIntArray132.length && local198.anIntArray130[arg0.anInt7087] < arg0.anInt7092) {
							arg0.anInt7087++;
							arg0.anInt7092 = 1;
							Static520.method6532(arg0.aByte108, local198, arg0 == Static328.aClass4_Sub1_Sub1_Sub2_2, arg0.anInt9542, arg0.anInt7087, arg0.anInt9540);
						}
						if (local198.anIntArray132.length <= arg0.anInt7087) {
							if (local181.aBoolean21) {
								arg0.anInt7061++;
								arg0.anInt7087 -= local198.anInt1549;
								if (arg0.anInt7061 >= local198.anInt1537) {
									arg0.anInt7069 = -1;
								} else if (arg0.anInt7087 >= 0 && arg0.anInt7087 < local198.anIntArray132.length) {
									Static520.method6532(arg0.aByte108, local198, Static328.aClass4_Sub1_Sub1_Sub2_2 == arg0, arg0.anInt9542, arg0.anInt7087, arg0.anInt9540);
								} else {
									arg0.anInt7069 = -1;
								}
							} else {
								arg0.anInt7069 = -1;
							}
						}
						arg0.anInt7109 = arg0.anInt7087 + 1;
						if (arg0.anInt7109 >= local198.anIntArray132.length) {
							if (local181.aBoolean21) {
								arg0.anInt7109 -= local198.anInt1549;
								if (arg0.anInt7061 + 1 >= local198.anInt1537) {
									arg0.anInt7109 = -1;
								} else if (arg0.anInt7109 < 0 || local198.anIntArray132.length <= arg0.anInt7109) {
									arg0.anInt7109 = -1;
								}
							} else {
								arg0.anInt7109 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7124 != -1 && arg0.anInt7117 <= Static312.anInt5688) {
			local181 = Static289.aClass66_7.method1652(arg0.anInt7124);
			local184 = local181.anInt334;
			if (local184 == -1) {
				arg0.anInt7124 = -1;
			} else {
				label400: {
					local198 = Static78.aClass298_2.method6521(local184);
					if (local181.aBoolean21) {
						if (local198.anInt1531 == 3) {
							if (arg0.anInt7133 > 0 && arg0.anInt7105 <= Static312.anInt5688 && Static312.anInt5688 > arg0.anInt7084) {
								arg0.anInt7124 = -1;
								break label400;
							}
						} else if (local198.anInt1531 == 1 && arg0.anInt7133 > 0 && Static312.anInt5688 >= arg0.anInt7105 && arg0.anInt7084 < Static312.anInt5688) {
							arg0.anInt7117 = Static312.anInt5688 + 1;
							break label400;
						}
					}
					if (local198 == null || local198.anIntArray132 == null) {
						arg0.anInt7124 = -1;
					} else {
						if (arg0.anInt7077 < 0) {
							arg0.anInt7077 = 0;
							Static520.method6532(arg0.aByte108, local198, Static328.aClass4_Sub1_Sub1_Sub2_2 == arg0, arg0.anInt9542, 0, arg0.anInt9540);
						}
						arg0.anInt7088++;
						if (local198.anIntArray132.length > arg0.anInt7077 && arg0.anInt7088 > local198.anIntArray130[arg0.anInt7077]) {
							arg0.anInt7077++;
							arg0.anInt7088 = 1;
							Static520.method6532(arg0.aByte108, local198, Static328.aClass4_Sub1_Sub1_Sub2_2 == arg0, arg0.anInt9542, arg0.anInt7077, arg0.anInt9540);
						}
						if (local198.anIntArray132.length <= arg0.anInt7077) {
							if (local181.aBoolean21) {
								arg0.anInt7059++;
								arg0.anInt7077 -= local198.anInt1549;
								if (arg0.anInt7059 >= local198.anInt1537) {
									arg0.anInt7124 = -1;
								} else if (arg0.anInt7077 >= 0 && local198.anIntArray132.length > arg0.anInt7077) {
									Static520.method6532(arg0.aByte108, local198, Static328.aClass4_Sub1_Sub1_Sub2_2 == arg0, arg0.anInt9542, arg0.anInt7077, arg0.anInt9540);
								} else {
									arg0.anInt7124 = -1;
								}
							} else {
								arg0.anInt7124 = -1;
							}
						}
						arg0.anInt7090 = arg0.anInt7077 + 1;
						if (local198.anIntArray132.length <= arg0.anInt7090) {
							if (local181.aBoolean21) {
								arg0.anInt7090 -= local198.anInt1549;
								if (local198.anInt1537 <= arg0.anInt7059 + 1) {
									arg0.anInt7090 = -1;
								} else if (arg0.anInt7090 < 0 || arg0.anInt7090 >= local198.anIntArray132.length) {
									arg0.anInt7090 = -1;
								}
							} else {
								arg0.anInt7090 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7085 != -1 && arg0.anInt7107 <= 1) {
			local19 = Static78.aClass298_2.method6521(arg0.anInt7085);
			if (local19.anInt1531 == 3) {
				if (arg0.anInt7133 > 0 && arg0.anInt7105 <= Static312.anInt5688 && arg0.anInt7084 < Static312.anInt5688) {
					arg0.anInt7085 = -1;
					arg0.anIntArray519 = null;
				}
			} else if (local19.anInt1531 == 1 && arg0.anInt7133 > 0 && Static312.anInt5688 >= arg0.anInt7105 && Static312.anInt5688 > arg0.anInt7084) {
				arg0.anInt7107 = 2;
			}
		}
		if (arg0.anInt7085 != -1 && arg0.anInt7107 == 0) {
			local19 = Static78.aClass298_2.method6521(arg0.anInt7085);
			if (local19 == null || local19.anIntArray132 == null) {
				arg0.anIntArray519 = null;
				arg0.anInt7085 = -1;
			} else {
				arg0.anInt7054++;
				if (local19.anIntArray132.length > arg0.anInt7112 && arg0.anInt7054 > local19.anIntArray130[arg0.anInt7112]) {
					arg0.anInt7054 = 1;
					arg0.anInt7112++;
					Static520.method6532(arg0.aByte108, local19, arg0 == Static328.aClass4_Sub1_Sub1_Sub2_2, arg0.anInt9542, arg0.anInt7112, arg0.anInt9540);
				}
				if (local19.anIntArray132.length <= arg0.anInt7112) {
					arg0.anInt7121++;
					arg0.anInt7112 -= local19.anInt1549;
					if (local19.anInt1537 <= arg0.anInt7121) {
						arg0.anInt7085 = -1;
						arg0.anIntArray519 = null;
					} else if (arg0.anInt7112 >= 0 && arg0.anInt7112 < local19.anIntArray132.length) {
						Static520.method6532(arg0.aByte108, local19, Static328.aClass4_Sub1_Sub1_Sub2_2 == arg0, arg0.anInt9542, arg0.anInt7112, arg0.anInt9540);
					} else {
						arg0.anInt7085 = -1;
						arg0.anIntArray519 = null;
					}
				}
				arg0.anInt7101 = arg0.anInt7112 + 1;
				if (local19.anIntArray132.length <= arg0.anInt7101) {
					arg0.anInt7101 -= local19.anInt1549;
					if (arg0.anInt7121 + 1 >= local19.anInt1537) {
						arg0.anInt7101 = -1;
					} else if (arg0.anInt7101 < 0 || local19.anIntArray132.length <= arg0.anInt7101) {
						arg0.anInt7101 = -1;
					}
				}
				arg0.anInt7074 = local19.anInt1535;
			}
		}
		if (arg0.anInt7107 > 0) {
			arg0.anInt7107--;
		}
		for (@Pc(1076) int local1076 = 0; local1076 < arg0.aClass286Array3.length; local1076++) {
			@Pc(1083) Class286 local1083 = arg0.aClass286Array3[local1076];
			if (local1083 != null) {
				if (local1083.anInt7757 > 0) {
					local1083.anInt7757--;
				} else {
					local198 = Static78.aClass298_2.method6521(local1083.anInt7760);
					if (local198 == null || local198.anIntArray132 == null) {
						arg0.aClass286Array3[local1076] = null;
					} else {
						local1083.anInt7761++;
						if (local198.anIntArray132.length > local1083.anInt7756 && local198.anIntArray130[local1083.anInt7756] < local1083.anInt7761) {
							local1083.anInt7761 = 1;
							local1083.anInt7756++;
							Static520.method6532(arg0.aByte108, local198, arg0 == Static328.aClass4_Sub1_Sub1_Sub2_2, arg0.anInt9542, local1083.anInt7756, arg0.anInt9540);
						}
						if (local1083.anInt7756 >= local198.anIntArray132.length) {
							local1083.anInt7759++;
							local1083.anInt7756 -= local198.anInt1549;
							if (local198.anInt1537 <= local1083.anInt7759) {
								arg0.aClass286Array3[local1076] = null;
							} else if (local1083.anInt7756 >= 0 && local198.anIntArray132.length > local1083.anInt7756) {
								Static520.method6532(arg0.aByte108, local198, Static328.aClass4_Sub1_Sub1_Sub2_2 == arg0, arg0.anInt9542, local1083.anInt7756, arg0.anInt9540);
							} else {
								arg0.aClass286Array3[local1076] = null;
							}
						}
						local1083.anInt7762 = local1083.anInt7756 + 1;
						if (local1083.anInt7762 >= local198.anIntArray132.length) {
							local1083.anInt7762 -= local198.anInt1549;
							if (local1083.anInt7759 + 1 >= local198.anInt1537) {
								local1083.anInt7762 = -1;
							} else if (local1083.anInt7762 < 0 || local198.anIntArray132.length <= local1083.anInt7762) {
								local1083.anInt7762 = -1;
							}
						}
					}
				}
			}
		}
	}
}
