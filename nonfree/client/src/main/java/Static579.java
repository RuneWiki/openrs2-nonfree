import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "Lclient!ni;")
	public static Class223 aClass223_135;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "[Lclient!ufa;")
	public static Class4[] aClass4Array17;

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
	public static int anInt9861 = 0;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!oi;I)V")
	public static void method8039(@OriginalArg(0) Class9_Sub4_Sub2_Sub1 arg0) {
		@Pc(20) Class113 local20;
		if (arg0.anInt4312 != -1) {
			local20 = Static528.aClass198_2.method5706(arg0.anInt4312);
			if (local20 == null || local20.anIntArray178 == null) {
				arg0.aBoolean349 = false;
				arg0.anInt4312 = -1;
			} else {
				label357: {
					arg0.anInt4336++;
					if (arg0.anInt4276 < local20.anIntArray178.length && arg0.anInt4336 > local20.anIntArray176[arg0.anInt4276]) {
						arg0.anInt4336 = 1;
						arg0.anInt4276++;
						arg0.anInt4348++;
						if (!arg0.aBoolean350) {
							Static598.method8288(arg0, arg0.anInt4276, local20);
						}
					}
					if (local20.anIntArray178.length <= arg0.anInt4276) {
						arg0.anInt4276 = 0;
						arg0.anInt4336 = 0;
						if (arg0.aBoolean349) {
							arg0.anInt4312 = arg0.method3625().method7365();
							if (arg0.anInt4312 == -1) {
								arg0.aBoolean349 = false;
								break label357;
							}
							local20 = Static528.aClass198_2.method5706(arg0.anInt4312);
						}
						if (!arg0.aBoolean350) {
							Static598.method8288(arg0, arg0.anInt4276, local20);
						}
					}
					arg0.anInt4348 = arg0.anInt4276 + 1;
					if (local20.anIntArray178 == null) {
						arg0.aBoolean349 = false;
						arg0.anInt4312 = -1;
					} else if (arg0.anInt4348 >= local20.anIntArray178.length) {
						arg0.anInt4348 = 0;
					}
				}
			}
		}
		@Pc(179) int local179;
		@Pc(188) Class113 local188;
		@Pc(176) Class124 local176;
		if (arg0.anInt4306 != -1 && arg0.anInt4317 <= Static384.anInt7234) {
			local176 = Static360.aClass312_2.method7492(arg0.anInt4306);
			local179 = local176.anInt4155;
			if (local179 == -1) {
				arg0.anInt4306 = -1;
			} else {
				label358: {
					local188 = Static528.aClass198_2.method5706(local179);
					if (local176.aBoolean336) {
						if (local188.anInt3851 == 3) {
							if (arg0.anInt4361 > 0 && arg0.anInt4316 <= Static384.anInt7234 && Static384.anInt7234 > arg0.anInt4351) {
								arg0.anInt4306 = -1;
								break label358;
							}
						} else if (local188.anInt3851 == 1 && arg0.anInt4361 > 0 && arg0.anInt4316 <= Static384.anInt7234 && Static384.anInt7234 > arg0.anInt4351) {
							arg0.anInt4317 = Static384.anInt7234 + 1;
							break label358;
						}
					}
					if (local188 == null || local188.anIntArray178 == null) {
						arg0.anInt4306 = -1;
					} else {
						if (arg0.anInt4301 < 0) {
							arg0.anInt4301 = 0;
							if (!arg0.aBoolean350) {
								Static598.method8288(arg0, 0, local188);
							}
						}
						arg0.anInt4323++;
						if (local188.anIntArray178.length > arg0.anInt4301 && arg0.anInt4323 > local188.anIntArray176[arg0.anInt4301]) {
							arg0.anInt4301++;
							arg0.anInt4323 = 1;
							if (!arg0.aBoolean350) {
								Static598.method8288(arg0, arg0.anInt4301, local188);
							}
						}
						if (local188.anIntArray178.length <= arg0.anInt4301) {
							if (local176.aBoolean336) {
								arg0.anInt4285++;
								arg0.anInt4301 -= local188.anInt3856;
								if (local188.anInt3841 <= arg0.anInt4285) {
									arg0.anInt4306 = -1;
								} else if (arg0.anInt4301 < 0 || local188.anIntArray178.length <= arg0.anInt4301) {
									arg0.anInt4306 = -1;
								} else if (!arg0.aBoolean350) {
									Static598.method8288(arg0, arg0.anInt4301, local188);
								}
							} else {
								arg0.anInt4306 = -1;
							}
						}
						arg0.anInt4296 = arg0.anInt4301 + 1;
						if (arg0.anInt4296 >= local188.anIntArray178.length) {
							if (local176.aBoolean336) {
								arg0.anInt4296 -= local188.anInt3856;
								if (local188.anInt3841 <= arg0.anInt4285 + 1) {
									arg0.anInt4296 = -1;
								} else if (arg0.anInt4296 < 0 || local188.anIntArray178.length <= arg0.anInt4296) {
									arg0.anInt4296 = -1;
								}
							} else {
								arg0.anInt4296 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4294 != -1 && Static384.anInt7234 >= arg0.anInt4352) {
			local176 = Static360.aClass312_2.method7492(arg0.anInt4294);
			local179 = local176.anInt4155;
			if (local179 == -1) {
				arg0.anInt4294 = -1;
			} else {
				label361: {
					local188 = Static528.aClass198_2.method5706(local179);
					if (local176.aBoolean336) {
						if (local188.anInt3851 == 3) {
							if (arg0.anInt4361 > 0 && Static384.anInt7234 >= arg0.anInt4316 && Static384.anInt7234 > arg0.anInt4351) {
								arg0.anInt4294 = -1;
								break label361;
							}
						} else if (local188.anInt3851 == 1 && arg0.anInt4361 > 0 && Static384.anInt7234 >= arg0.anInt4316 && Static384.anInt7234 > arg0.anInt4351) {
							arg0.anInt4352 = Static384.anInt7234 + 1;
							break label361;
						}
					}
					if (local188 == null || local188.anIntArray178 == null) {
						arg0.anInt4294 = -1;
					} else {
						if (arg0.anInt4356 < 0) {
							arg0.anInt4356 = 0;
							if (!arg0.aBoolean350) {
								Static598.method8288(arg0, 0, local188);
							}
						}
						arg0.anInt4353++;
						if (local188.anIntArray178.length > arg0.anInt4356 && local188.anIntArray176[arg0.anInt4356] < arg0.anInt4353) {
							arg0.anInt4356++;
							arg0.anInt4353 = 1;
							if (!arg0.aBoolean350) {
								Static598.method8288(arg0, arg0.anInt4356, local188);
							}
						}
						if (arg0.anInt4356 >= local188.anIntArray178.length) {
							if (local176.aBoolean336) {
								arg0.anInt4308++;
								arg0.anInt4356 -= local188.anInt3856;
								if (local188.anInt3841 <= arg0.anInt4308) {
									arg0.anInt4294 = -1;
								} else if (arg0.anInt4356 < 0 || local188.anIntArray178.length <= arg0.anInt4356) {
									arg0.anInt4294 = -1;
								} else if (!arg0.aBoolean350) {
									Static598.method8288(arg0, arg0.anInt4356, local188);
								}
							} else {
								arg0.anInt4294 = -1;
							}
						}
						arg0.anInt4350 = arg0.anInt4356 + 1;
						if (arg0.anInt4350 >= local188.anIntArray178.length) {
							if (local176.aBoolean336) {
								arg0.anInt4350 -= local188.anInt3856;
								if (local188.anInt3841 <= arg0.anInt4308 + 1) {
									arg0.anInt4350 = -1;
								} else if (arg0.anInt4350 < 0 || local188.anIntArray178.length <= arg0.anInt4350) {
									arg0.anInt4350 = -1;
								}
							} else {
								arg0.anInt4350 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4341 != -1 && arg0.anInt4326 <= 1) {
			local20 = Static528.aClass198_2.method5706(arg0.anInt4341);
			if (local20.anInt3851 == 3) {
				if (arg0.anInt4361 > 0 && Static384.anInt7234 >= arg0.anInt4316 && arg0.anInt4351 < Static384.anInt7234) {
					arg0.anIntArray189 = null;
					arg0.anInt4341 = -1;
				}
			} else if (local20.anInt3851 == 1 && arg0.anInt4361 > 0 && arg0.anInt4316 <= Static384.anInt7234 && arg0.anInt4351 < Static384.anInt7234) {
				arg0.anInt4326 = 2;
			}
		}
		if (arg0.anInt4341 != -1 && arg0.anInt4326 == 0) {
			local20 = Static528.aClass198_2.method5706(arg0.anInt4341);
			if (local20 == null || local20.anIntArray178 == null) {
				arg0.anIntArray189 = null;
				arg0.anInt4341 = -1;
			} else {
				arg0.lb++;
				if (local20.anIntArray178.length > arg0.anInt4319 && local20.anIntArray176[arg0.anInt4319] < arg0.lb) {
					arg0.lb = 1;
					arg0.anInt4319++;
					if (!arg0.aBoolean350) {
						Static598.method8288(arg0, arg0.anInt4319, local20);
					}
				}
				if (arg0.anInt4319 >= local20.anIntArray178.length) {
					arg0.anInt4332++;
					arg0.anInt4319 -= local20.anInt3856;
					if (local20.anInt3841 <= arg0.anInt4332) {
						arg0.anIntArray189 = null;
						arg0.anInt4341 = -1;
					} else if (arg0.anInt4319 < 0 || local20.anIntArray178.length <= arg0.anInt4319) {
						arg0.anInt4341 = -1;
						arg0.anIntArray189 = null;
					} else if (!arg0.aBoolean350) {
						Static598.method8288(arg0, arg0.anInt4319, local20);
					}
				}
				arg0.anInt4290 = arg0.anInt4319 + 1;
				if (arg0.anInt4290 >= local20.anIntArray178.length) {
					arg0.anInt4290 -= local20.anInt3856;
					if (local20.anInt3841 <= arg0.anInt4332 + 1) {
						arg0.anInt4290 = -1;
					} else if (arg0.anInt4290 < 0 || arg0.anInt4290 >= local20.anIntArray178.length) {
						arg0.anInt4290 = -1;
					}
				}
			}
		}
		if (arg0.anInt4326 > 0) {
			arg0.anInt4326--;
		}
		for (@Pc(999) int local999 = 0; local999 < arg0.aClass241Array3.length; local999++) {
			@Pc(1006) Class241 local1006 = arg0.aClass241Array3[local999];
			if (local1006 != null) {
				if (local1006.anInt7478 > 0) {
					local1006.anInt7478--;
				} else {
					local188 = Static528.aClass198_2.method5706(local1006.anInt7475);
					if (local188 == null || local188.anIntArray178 == null) {
						arg0.aClass241Array3[local999] = null;
					} else {
						local1006.anInt7482++;
						if (local1006.anInt7477 < local188.anIntArray178.length && local188.anIntArray176[local1006.anInt7477] < local1006.anInt7482) {
							local1006.anInt7482 = 1;
							local1006.anInt7477++;
							if (!arg0.aBoolean350) {
								Static598.method8288(arg0, local1006.anInt7477, local188);
							}
						}
						if (local188.anIntArray178.length <= local1006.anInt7477) {
							local1006.anInt7479++;
							local1006.anInt7477 -= local188.anInt3856;
							if (local188.anInt3841 <= local1006.anInt7479) {
								arg0.aClass241Array3[local999] = null;
							} else if (local1006.anInt7477 < 0 || local188.anIntArray178.length <= local1006.anInt7477) {
								arg0.aClass241Array3[local999] = null;
							} else if (!arg0.aBoolean350) {
								Static598.method8288(arg0, local1006.anInt7477, local188);
							}
						}
						local1006.anInt7476 = local1006.anInt7477 + 1;
						if (local188.anIntArray178.length <= local1006.anInt7476) {
							local1006.anInt7476 -= local188.anInt3856;
							if (local1006.anInt7479 + 1 >= local188.anInt3841) {
								local1006.anInt7476 = -1;
							} else if (local1006.anInt7476 < 0 || local188.anIntArray178.length <= local1006.anInt7476) {
								local1006.anInt7476 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ha;IB)V")
	public static void method8040(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		if (!Static211.aBoolean331 || !Static260.aBoolean441) {
			Static116.anInt2989 = 0;
			return;
		}
		if (Static243.aBoolean371) {
			Static462.aLong226 = Static641.aClass42_1.method8006();
		}
		Static528.anInt9204 = 0;
		Static525.anInt9175 = 0;
		Static210.anInt4555 = 0;
		@Pc(32) int[] local32 = arg0.Y();
		Static76.anInt2537 = (int) ((float) local32[2] / 3.0F);
		Static569.anInt9768 = (int) ((float) local32[3] / 3.0F);
		arg0.method6164(Static70.anIntArray77);
		if (Static35.anInt884 != (int) ((float) Static70.anIntArray77[0] / 3.0F) || Static115.anInt2983 != (int) ((float) Static70.anIntArray77[1] / 3.0F)) {
			Static115.anInt2983 = (int) ((float) Static70.anIntArray77[1] / 3.0F);
			Static35.anInt884 = (int) ((float) Static70.anIntArray77[0] / 3.0F);
			Static401.anIntArray371 = new int[Static115.anInt2983 * Static35.anInt884];
			Static6.anInt461 = Static35.anInt884 >> 1;
			Static386.anInt7276 = Static115.anInt2983 >> 1;
		}
		Static506.aClass115_9 = arg0.method6115();
		Static116.anInt2989 = 0;
		for (@Pc(109) int local109 = 0; local109 < Static593.anInt10029; local109++) {
			Static476.method7044(arg1, arg0, Static455.aClass169Array4[local109]);
		}
		for (@Pc(124) int local124 = 0; local124 < Static574.anInt9809; local124++) {
			Static476.method7044(arg1, arg0, Static321.aClass169Array2[local124]);
		}
		for (@Pc(139) int local139 = 0; local139 < Static201.anInt7302; local139++) {
			Static476.method7044(arg1, arg0, Static170.aClass169Array1[local139]);
		}
		Static8.anInt519 = 0;
		if (Static116.anInt2989 > 0) {
			@Pc(163) int local163 = Static401.anIntArray371.length;
			@Pc(170) int local170 = local163 - local163 & 0x7;
			@Pc(172) int local172 = 0;
			while (local172 < local170) {
				Static401.anIntArray371[local172++] = Integer.MAX_VALUE;
				Static401.anIntArray371[local172++] = Integer.MAX_VALUE;
				Static401.anIntArray371[local172++] = Integer.MAX_VALUE;
				Static401.anIntArray371[local172++] = Integer.MAX_VALUE;
				Static401.anIntArray371[local172++] = Integer.MAX_VALUE;
				Static401.anIntArray371[local172++] = Integer.MAX_VALUE;
				Static401.anIntArray371[local172++] = Integer.MAX_VALUE;
				Static401.anIntArray371[local172++] = Integer.MAX_VALUE;
			}
			while (local163 > local172) {
				Static401.anIntArray371[local172++] = Integer.MAX_VALUE;
			}
			Static502.anInt7204 = 1;
			for (@Pc(235) int local235 = 0; local235 < Static116.anInt2989; local235++) {
				@Pc(241) Class169 local241 = Static383.aClass169Array3[local235];
				Static470.method7000(local241.aShortArray83[1], local241.aShortArray83[0], local241.aShortArray81[1], local241.aShortArray82[3], local241.aShortArray82[0], local241.aShortArray83[3], local241.aShortArray82[1], local241.aShortArray81[0], local241.aShortArray81[3]);
				Static470.method7000(local241.aShortArray83[2], local241.aShortArray83[1], local241.aShortArray81[2], local241.aShortArray82[3], local241.aShortArray82[1], local241.aShortArray83[3], local241.aShortArray82[2], local241.aShortArray81[1], local241.aShortArray81[3]);
			}
			Static502.anInt7204 = 2;
		}
		if (Static243.aBoolean371) {
			Static438.aLong212 = Static641.aClass42_1.method8006() - Static462.aLong226;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)V")
	public static synchronized void method8041() {
		if (Static380.anObject15 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(18) Method local18 = local13.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(23) Object local23 = local18.invoke((Object) null, (Object[]) null);
			@Pc(56) Method local56 = local13.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static380.anObject15 = local56.invoke((Object) null, local23, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(77) Exception local77) {
			System.out.println("HeapDump setup error:");
			local77.printStackTrace();
		}
	}
}
