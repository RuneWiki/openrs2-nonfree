import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!uf", name = "F", descriptor = "Lclient!p;")
	public static Class175 aClass175_3;

	@OriginalMember(owner = "client!uf", name = "D", descriptor = "Lclient!sm;")
	public static final Class210 aClass210_15 = new Class210();

	@OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
	public static final int anInt1771 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLclient!es;)V")
	public static void method1595(@OriginalArg(1) Class12_Sub1_Sub2 arg0) {
		arg0.aBoolean419 = false;
		if (arg0.anInt5339 != -1) {
			@Pc(18) Class189 local18 = aClass175_3.method4107(arg0.anInt5339);
			if (local18 == null || local18.anIntArray639 == null) {
				arg0.anInt5339 = -1;
				arg0.aBoolean422 = false;
			} else {
				label297: {
					arg0.anInt5331++;
					if (local18.anIntArray639.length > arg0.anInt5316 && arg0.anInt5331 > local18.anIntArray640[arg0.anInt5316]) {
						arg0.anInt5331 = 1;
						arg0.anInt5338++;
						arg0.anInt5316++;
						Static369.method5563(arg0.aByte74, local18, Static267.aClass12_Sub1_Sub2_Sub2_1 == arg0, arg0.anInt6328, arg0.anInt6317, arg0.anInt5316);
					}
					if (arg0.anInt5316 >= local18.anIntArray639.length) {
						arg0.anInt5316 = 0;
						arg0.anInt5331 = 0;
						if (arg0.aBoolean422) {
							arg0.anInt5339 = arg0.method4711().method4009();
							if (arg0.anInt5339 == -1) {
								arg0.aBoolean422 = false;
								break label297;
							}
							local18 = aClass175_3.method4107(arg0.anInt5339);
						}
						Static369.method5563(arg0.aByte74, local18, arg0 == Static267.aClass12_Sub1_Sub2_Sub2_1, arg0.anInt6328, arg0.anInt6317, arg0.anInt5316);
					}
					arg0.anInt5338 = arg0.anInt5316 + 1;
					if (arg0.anInt5338 >= local18.anIntArray639.length) {
						arg0.anInt5338 = 0;
					}
				}
			}
		}
		@Pc(181) int local181;
		if (arg0.anInt5330 != -1 && Static295.anInt5281 >= arg0.anInt5367) {
			@Pc(178) Class220 local178 = Static168.aClass74_1.method1772(arg0.anInt5330);
			local181 = local178.anInt6020;
			if (local181 == -1) {
				arg0.anInt5330 = -1;
			} else {
				label299: {
					@Pc(195) Class189 local195 = aClass175_3.method4107(local181);
					if (local178.aBoolean455) {
						if (local195.anInt5156 == 3) {
							if (arg0.anInt5378 > 0 && Static295.anInt5281 >= arg0.anInt5372 && arg0.anInt5374 < Static295.anInt5281) {
								arg0.anInt5330 = -1;
								break label299;
							}
						} else if (local195.anInt5156 == 1 && arg0.anInt5378 > 0 && Static295.anInt5281 >= arg0.anInt5372 && Static295.anInt5281 > arg0.anInt5374) {
							arg0.anInt5367 = Static295.anInt5281 + 1;
							break label299;
						}
					}
					if (local195 == null || local195.anIntArray639 == null) {
						arg0.anInt5330 = -1;
					} else {
						if (arg0.anInt5341 < 0) {
							arg0.anInt5341 = 0;
							Static369.method5563(arg0.aByte74, local195, Static267.aClass12_Sub1_Sub2_Sub2_1 == arg0, arg0.anInt6328, arg0.anInt6317, 0);
						}
						arg0.anInt5369++;
						if (local195.anIntArray639.length > arg0.anInt5341 && arg0.anInt5369 > local195.anIntArray640[arg0.anInt5341]) {
							arg0.anInt5341++;
							arg0.anInt5369 = 1;
							Static369.method5563(arg0.aByte74, local195, arg0 == Static267.aClass12_Sub1_Sub2_Sub2_1, arg0.anInt6328, arg0.anInt6317, arg0.anInt5341);
						}
						if (local195.anIntArray639.length <= arg0.anInt5341) {
							if (local178.aBoolean455) {
								arg0.anInt5358++;
								arg0.anInt5341 -= local195.anInt5151;
								if (arg0.anInt5358 >= local195.anInt5163) {
									arg0.anInt5330 = -1;
								} else if (arg0.anInt5341 >= 0 && local195.anIntArray639.length > arg0.anInt5341) {
									Static369.method5563(arg0.aByte74, local195, Static267.aClass12_Sub1_Sub2_Sub2_1 == arg0, arg0.anInt6328, arg0.anInt6317, arg0.anInt5341);
								} else {
									arg0.anInt5330 = -1;
								}
							} else {
								arg0.anInt5330 = -1;
							}
						}
						arg0.anInt5327 = arg0.anInt5341 + 1;
						if (local195.anIntArray639.length <= arg0.anInt5327) {
							if (local178.aBoolean455) {
								arg0.anInt5327 -= local195.anInt5151;
								if (local195.anInt5163 <= arg0.anInt5358 + 1) {
									arg0.anInt5327 = -1;
								} else if (arg0.anInt5327 < 0 || local195.anIntArray639.length <= arg0.anInt5327) {
									arg0.anInt5327 = -1;
								}
							} else {
								arg0.anInt5327 = -1;
							}
						}
					}
				}
			}
		}
		@Pc(503) Class189 local503;
		if (arg0.anInt5371 != -1 && arg0.anInt5357 <= 1) {
			local503 = aClass175_3.method4107(arg0.anInt5371);
			if (local503.anInt5156 == 3) {
				if (arg0.anInt5378 > 0 && Static295.anInt5281 >= arg0.anInt5372 && arg0.anInt5374 < Static295.anInt5281) {
					arg0.anInt5371 = -1;
				}
			} else if (local503.anInt5156 == 1 && arg0.anInt5378 > 0 && Static295.anInt5281 >= arg0.anInt5372 && arg0.anInt5374 < Static295.anInt5281) {
				arg0.anInt5357 = 2;
			}
		}
		if (arg0.anInt5371 != -1 && arg0.anInt5357 == 0) {
			local503 = aClass175_3.method4107(arg0.anInt5371);
			if (local503 == null || local503.anIntArray639 == null) {
				arg0.anInt5371 = -1;
			} else {
				arg0.anInt5370++;
				if (local503.anIntArray639.length > arg0.anInt5318 && arg0.anInt5370 > local503.anIntArray640[arg0.anInt5318]) {
					arg0.anInt5370 = 1;
					arg0.anInt5318++;
					Static369.method5563(arg0.aByte74, local503, arg0 == Static267.aClass12_Sub1_Sub2_Sub2_1, arg0.anInt6328, arg0.anInt6317, arg0.anInt5318);
				}
				if (arg0.anInt5318 >= local503.anIntArray639.length) {
					arg0.anInt5324++;
					arg0.anInt5318 -= local503.anInt5151;
					if (arg0.anInt5324 >= local503.anInt5163) {
						arg0.anInt5371 = -1;
					} else if (arg0.anInt5318 >= 0 && local503.anIntArray639.length > arg0.anInt5318) {
						Static369.method5563(arg0.aByte74, local503, arg0 == Static267.aClass12_Sub1_Sub2_Sub2_1, arg0.anInt6328, arg0.anInt6317, arg0.anInt5318);
					} else {
						arg0.anInt5371 = -1;
					}
				}
				arg0.anInt5368 = arg0.anInt5318 + 1;
				if (local503.anIntArray639.length <= arg0.anInt5368) {
					arg0.anInt5368 -= local503.anInt5151;
					if (local503.anInt5163 <= arg0.anInt5324 + 1) {
						arg0.anInt5368 = -1;
					} else if (arg0.anInt5368 < 0 || local503.anIntArray639.length <= arg0.anInt5368) {
						arg0.anInt5368 = -1;
					}
				}
				arg0.aBoolean419 = local503.aBoolean386;
			}
		}
		if (arg0.anInt5357 > 0) {
			arg0.anInt5357--;
		}
		for (local181 = 0; local181 < arg0.aClass95Array3.length; local181++) {
			@Pc(783) Class95 local783 = arg0.aClass95Array3[local181];
			if (local783 != null) {
				if (local783.anInt2392 > 0) {
					local783.anInt2392--;
				} else {
					@Pc(805) Class189 local805 = aClass175_3.method4107(local783.anInt2400);
					if (local805 == null || local805.anIntArray639 == null) {
						arg0.aClass95Array3[local181] = null;
					} else {
						local783.anInt2399++;
						if (local783.anInt2397 < local805.anIntArray639.length && local783.anInt2399 > local805.anIntArray640[local783.anInt2397]) {
							local783.anInt2397++;
							local783.anInt2399 = 1;
							Static369.method5563(arg0.aByte74, local805, Static267.aClass12_Sub1_Sub2_Sub2_1 == arg0, arg0.anInt6328, arg0.anInt6317, local783.anInt2397);
						}
						if (local783.anInt2397 >= local805.anIntArray639.length) {
							local783.anInt2394++;
							local783.anInt2397 -= local805.anInt5151;
							if (local783.anInt2394 >= local805.anInt5163) {
								arg0.aClass95Array3[local181] = null;
							} else if (local783.anInt2397 >= 0 && local783.anInt2397 < local805.anIntArray639.length) {
								Static369.method5563(arg0.aByte74, local805, arg0 == Static267.aClass12_Sub1_Sub2_Sub2_1, arg0.anInt6328, arg0.anInt6317, local783.anInt2397);
							} else {
								arg0.aClass95Array3[local181] = null;
							}
						}
						local783.anInt2398 = local783.anInt2397 + 1;
						if (local805.anIntArray639.length <= local783.anInt2398) {
							local783.anInt2398 -= local805.anInt5151;
							if (local783.anInt2394 + 1 >= local805.anInt5163) {
								local783.anInt2398 = -1;
							} else if (local783.anInt2398 < 0 || local805.anIntArray639.length <= local783.anInt2398) {
								local783.anInt2398 = -1;
							}
						}
					}
				}
			}
		}
	}
}
