import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
	public static int anInt9796;

	@OriginalMember(owner = "client!vk", name = "y", descriptor = "[[B")
	public static byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
	public static int anInt9791 = 0;

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "Lclient!mga;")
	public static final Class220 aClass220_15 = new Class220("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIII)V")
	public static void method8325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class291 local17 = Static133.aClass291ArrayArray30[arg0][arg1];
		Static535.method7742(local17 == null ? Static304.aClass291_5 : local17, arg2);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BLclient!ni;)V")
	public static void method8326(@OriginalArg(1) Class9_Sub2_Sub1_Sub2 arg0) {
		if (arg0.anInt10211 != -1) {
			@Pc(15) Class267 local15 = Static474.aClass264_2.method6574(arg0.anInt10211);
			if (local15 == null || local15.anIntArray458 == null) {
				arg0.anInt10211 = -1;
				arg0.aBoolean773 = false;
			} else {
				label277: {
					arg0.anInt10175++;
					if (local15.anIntArray458.length > arg0.anInt10195 && local15.anIntArray456[arg0.anInt10195] < arg0.anInt10175) {
						arg0.anInt10195++;
						arg0.anInt10224++;
						arg0.anInt10175 = 1;
						if (!arg0.aBoolean772) {
							Static522.method7586(arg0.anInt10195, arg0, local15);
						}
					}
					if (local15.anIntArray458.length <= arg0.anInt10195) {
						arg0.anInt10175 = 0;
						arg0.anInt10195 = 0;
						if (arg0.aBoolean773) {
							arg0.anInt10211 = arg0.method8633().method4481();
							if (arg0.anInt10211 == -1) {
								arg0.aBoolean773 = false;
								break label277;
							}
							local15 = Static474.aClass264_2.method6574(arg0.anInt10211);
						}
						if (!arg0.aBoolean772) {
							Static522.method7586(arg0.anInt10195, arg0, local15);
						}
					}
					arg0.anInt10224 = arg0.anInt10195 + 1;
					if (local15.anIntArray458 == null) {
						arg0.aBoolean773 = false;
						arg0.anInt10211 = -1;
					} else if (local15.anIntArray458.length <= arg0.anInt10224) {
						arg0.anInt10224 = 0;
					}
				}
			}
		}
		@Pc(199) Class267 local199;
		for (@Pc(154) int local154 = 0; local154 < arg0.aClass380Array3.length; local154++) {
			if (arg0.aClass380Array3[local154].anInt10136 != -1 && Static304.anInt8391 >= arg0.aClass380Array3[local154].anInt10146) {
				@Pc(179) Class207 local179 = Static266.aClass135_1.method3108(arg0.aClass380Array3[local154].anInt10136);
				@Pc(182) int local182 = local179.anInt6225;
				if (local182 == -1) {
					arg0.aClass380Array3[local154].anInt10136 = -1;
				} else {
					local199 = Static474.aClass264_2.method6574(local182);
					if (local179.aBoolean457) {
						if (local199.anInt7573 == 3) {
							if (arg0.anInt10234 > 0 && arg0.anInt10171 <= Static304.anInt8391 && arg0.anInt10221 < Static304.anInt8391) {
								arg0.aClass380Array3[local154].anInt10136 = -1;
								continue;
							}
						} else if (local199.anInt7573 == 1 && arg0.anInt10234 > 0 && Static304.anInt8391 >= arg0.anInt10171 && Static304.anInt8391 > arg0.anInt10221) {
							arg0.aClass380Array3[local154].anInt10146 = Static304.anInt8391 + 1;
							continue;
						}
					}
					if (local199 == null || local199.anIntArray458 == null) {
						arg0.aClass380Array3[local154].anInt10136 = -1;
					} else {
						if (arg0.aClass380Array3[local154].anInt10139 < 0) {
							arg0.aClass380Array3[local154].anInt10139 = 0;
							if (!arg0.aBoolean772) {
								Static522.method7586(0, arg0, local199);
							}
						}
						arg0.aClass380Array3[local154].anInt10145++;
						if (arg0.aClass380Array3[local154].anInt10139 < local199.anIntArray458.length && local199.anIntArray456[arg0.aClass380Array3[local154].anInt10139] < arg0.aClass380Array3[local154].anInt10145) {
							arg0.aClass380Array3[local154].anInt10145 = 1;
							arg0.aClass380Array3[local154].anInt10139++;
							if (!arg0.aBoolean772) {
								Static522.method7586(arg0.aClass380Array3[local154].anInt10139, arg0, local199);
							}
						}
						if (local199.anIntArray458.length <= arg0.aClass380Array3[local154].anInt10139) {
							if (local179.aBoolean457) {
								arg0.aClass380Array3[local154].anInt10139 -= local199.anInt7575;
								arg0.aClass380Array3[local154].anInt10135++;
								if (local199.anInt7577 <= arg0.aClass380Array3[local154].anInt10135) {
									arg0.aClass380Array3[local154].anInt10136 = -1;
								} else if (arg0.aClass380Array3[local154].anInt10139 < 0 || local199.anIntArray458.length <= arg0.aClass380Array3[local154].anInt10139) {
									arg0.aClass380Array3[local154].anInt10136 = -1;
								} else if (!arg0.aBoolean772) {
									Static522.method7586(arg0.aClass380Array3[local154].anInt10139, arg0, local199);
								}
							} else {
								arg0.aClass380Array3[local154].anInt10136 = -1;
							}
						}
						arg0.aClass380Array3[local154].anInt10144 = arg0.aClass380Array3[local154].anInt10139 + 1;
						if (local199.anIntArray458.length <= arg0.aClass380Array3[local154].anInt10144) {
							if (local179.aBoolean457) {
								arg0.aClass380Array3[local154].anInt10144 -= local199.anInt7575;
								if (arg0.aClass380Array3[local154].anInt10135 + 1 >= local199.anInt7577) {
									arg0.aClass380Array3[local154].anInt10144 = -1;
								} else if (arg0.aClass380Array3[local154].anInt10144 < 0 || arg0.aClass380Array3[local154].anInt10144 >= local199.anIntArray458.length) {
									arg0.aClass380Array3[local154].anInt10144 = -1;
								}
							} else {
								arg0.aClass380Array3[local154].anInt10144 = -1;
							}
						}
					}
				}
			}
		}
		@Pc(569) Class267 local569;
		if (arg0.anInt10193 != -1 && arg0.anInt10219 <= 1) {
			local569 = Static474.aClass264_2.method6574(arg0.anInt10193);
			if (local569.anInt7573 == 3) {
				if (arg0.anInt10234 > 0 && arg0.anInt10171 <= Static304.anInt8391 && Static304.anInt8391 > arg0.anInt10221) {
					arg0.anIntArray666 = null;
					arg0.anInt10193 = -1;
				}
			} else if (local569.anInt7573 == 1 && arg0.anInt10234 > 0 && Static304.anInt8391 >= arg0.anInt10171 && Static304.anInt8391 > arg0.anInt10221) {
				arg0.anInt10219 = 2;
			}
		}
		if (arg0.anInt10193 != -1 && arg0.anInt10219 == 0) {
			local569 = Static474.aClass264_2.method6574(arg0.anInt10193);
			if (local569 == null || local569.anIntArray458 == null) {
				arg0.anIntArray666 = null;
				arg0.anInt10193 = -1;
			} else {
				arg0.anInt10192++;
				if (local569.anIntArray458.length > arg0.anInt10189 && arg0.anInt10192 > local569.anIntArray456[arg0.anInt10189]) {
					arg0.anInt10189++;
					arg0.anInt10192 = 1;
					if (!arg0.aBoolean772) {
						Static522.method7586(arg0.anInt10189, arg0, local569);
					}
				}
				if (local569.anIntArray458.length <= arg0.anInt10189) {
					arg0.anInt10189 -= local569.anInt7575;
					arg0.anInt10186++;
					if (arg0.anInt10186 >= local569.anInt7577) {
						arg0.anIntArray666 = null;
						arg0.anInt10193 = -1;
					} else if (arg0.anInt10189 < 0 || local569.anIntArray458.length <= arg0.anInt10189) {
						arg0.anInt10193 = -1;
						arg0.anIntArray666 = null;
					} else if (!arg0.aBoolean772) {
						Static522.method7586(arg0.anInt10189, arg0, local569);
					}
				}
				arg0.anInt10214 = arg0.anInt10189 + 1;
				if (arg0.anInt10214 >= local569.anIntArray458.length) {
					arg0.anInt10214 -= local569.anInt7575;
					if (arg0.anInt10186 + 1 >= local569.anInt7577) {
						arg0.anInt10214 = -1;
					} else if (arg0.anInt10214 < 0 || local569.anIntArray458.length <= arg0.anInt10214) {
						arg0.anInt10214 = -1;
					}
				}
			}
		}
		if (arg0.anInt10219 > 0) {
			arg0.anInt10219--;
		}
		for (@Pc(804) int local804 = 0; local804 < arg0.aClass140Array3.length; local804++) {
			@Pc(811) Class140 local811 = arg0.aClass140Array3[local804];
			if (local811 != null) {
				if (local811.anInt3759 > 0) {
					local811.anInt3759--;
				} else {
					local199 = Static474.aClass264_2.method6574(local811.anInt3758);
					if (local199 == null || local199.anIntArray458 == null) {
						arg0.aClass140Array3[local804] = null;
					} else {
						local811.anInt3755++;
						if (local811.anInt3756 < local199.anIntArray458.length && local199.anIntArray456[local811.anInt3756] < local811.anInt3755) {
							local811.anInt3755 = 1;
							local811.anInt3756++;
							if (!arg0.aBoolean772) {
								Static522.method7586(local811.anInt3756, arg0, local199);
							}
						}
						if (local811.anInt3756 >= local199.anIntArray458.length) {
							local811.anInt3753++;
							local811.anInt3756 -= local199.anInt7575;
							if (local199.anInt7577 <= local811.anInt3753) {
								arg0.aClass140Array3[local804] = null;
							} else if (local811.anInt3756 < 0 || local199.anIntArray458.length <= local811.anInt3756) {
								arg0.aClass140Array3[local804] = null;
							} else if (!arg0.aBoolean772) {
								Static522.method7586(local811.anInt3756, arg0, local199);
							}
						}
						local811.anInt3754 = local811.anInt3756 + 1;
						if (local811.anInt3754 >= local199.anIntArray458.length) {
							local811.anInt3754 -= local199.anInt7575;
							if (local199.anInt7577 <= local811.anInt3753 + 1) {
								local811.anInt3754 = -1;
							} else if (local811.anInt3754 < 0 || local811.anInt3754 >= local199.anIntArray458.length) {
								local811.anInt3754 = -1;
							}
						}
					}
				}
			}
		}
	}
}
