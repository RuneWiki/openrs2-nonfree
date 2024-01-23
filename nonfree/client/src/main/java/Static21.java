import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "Lclient!hc;")
	public static Class51 aClass51_9;

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
	public static int anInt739;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
	public static int anInt732 = 0;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!mi;)V")
	public static void method404(@OriginalArg(1) Class9_Sub1 arg0) {
		arg0.aBoolean23 = false;
		@Pc(17) Class49 local17;
		if (arg0.anInt451 != -1) {
			local17 = Static131.method697(arg0.anInt451);
			if (local17 == null || local17.anIntArray168 == null) {
				arg0.anInt451 = -1;
			} else {
				arg0.anInt422++;
				if (arg0.anInt464 < local17.anIntArray168.length && local17.anIntArray170[arg0.anInt464] < arg0.anInt422) {
					arg0.anInt450++;
					arg0.anInt464++;
					arg0.anInt422 = 1;
					Static232.method3865(arg0.anInt479, arg0.anInt427, arg0 == Static83.aClass9_Sub1_Sub1_1, arg0.anInt464, local17);
				}
				if (arg0.anInt464 >= local17.anIntArray168.length) {
					arg0.anInt422 = 0;
					arg0.anInt464 = 0;
					Static232.method3865(arg0.anInt479, arg0.anInt427, Static83.aClass9_Sub1_Sub1_1 == arg0, arg0.anInt464, local17);
				}
				arg0.anInt450 = arg0.anInt464 + 1;
				if (local17.anIntArray168.length <= arg0.anInt450) {
					arg0.anInt450 = 0;
				}
			}
		}
		@Pc(143) int local143;
		if (arg0.anInt448 != -1 && arg0.anInt444 <= Static156.anInt3722) {
			@Pc(140) Class14 local140 = Static172.method2975(arg0.anInt448);
			local143 = local140.anInt634;
			if (local143 == -1) {
				arg0.anInt448 = -1;
			} else {
				label289: {
					@Pc(150) Class49 local150 = Static131.method697(local143);
					if (local140.aBoolean33) {
						if (local150.anInt2183 == 3) {
							if (arg0.anInt434 > 0 && Static156.anInt3722 >= arg0.anInt421 && arg0.anInt409 < Static156.anInt3722) {
								arg0.anInt448 = -1;
								break label289;
							}
						} else if (local150.anInt2183 == 1 && arg0.anInt434 > 0 && arg0.anInt421 <= Static156.anInt3722 && Static156.anInt3722 > arg0.anInt409) {
							arg0.anInt444 = Static156.anInt3722 + 1;
							break label289;
						}
					}
					if (local150 == null || local150.anIntArray168 == null) {
						arg0.anInt448 = -1;
					} else {
						if (arg0.anInt472 < 0) {
							arg0.anInt472 = 0;
							Static232.method3865(arg0.anInt479, arg0.anInt427, arg0 == Static83.aClass9_Sub1_Sub1_1, 0, local150);
						}
						arg0.anInt460++;
						if (local150.anIntArray168.length > arg0.anInt472 && arg0.anInt460 > local150.anIntArray170[arg0.anInt472]) {
							arg0.anInt472++;
							arg0.anInt460 = 1;
							Static232.method3865(arg0.anInt479, arg0.anInt427, Static83.aClass9_Sub1_Sub1_1 == arg0, arg0.anInt472, local150);
						}
						if (arg0.anInt472 >= local150.anIntArray168.length) {
							if (local140.aBoolean33) {
								arg0.anInt472 -= local150.anInt2195;
								arg0.anInt412++;
								if (local150.anInt2187 <= arg0.anInt412) {
									arg0.anInt448 = -1;
								} else if (arg0.anInt472 >= 0 && arg0.anInt472 < local150.anIntArray168.length) {
									Static232.method3865(arg0.anInt479, arg0.anInt427, arg0 == Static83.aClass9_Sub1_Sub1_1, arg0.anInt472, local150);
								} else {
									arg0.anInt448 = -1;
								}
							} else {
								arg0.anInt448 = -1;
							}
						}
						arg0.anInt461 = arg0.anInt472 + 1;
						if (arg0.anInt461 >= local150.anIntArray168.length) {
							if (local140.aBoolean33) {
								arg0.anInt461 -= local150.anInt2195;
								if (local150.anInt2187 <= arg0.anInt412 + 1) {
									arg0.anInt461 = -1;
								} else if (arg0.anInt461 < 0 || arg0.anInt461 >= local150.anIntArray168.length) {
									arg0.anInt461 = -1;
								}
							} else {
								arg0.anInt461 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt443 != -1 && arg0.anInt399 <= 1) {
			local17 = Static131.method697(arg0.anInt443);
			if (local17.anInt2183 == 3) {
				if (arg0.anInt434 > 0 && Static156.anInt3722 >= arg0.anInt421 && Static156.anInt3722 > arg0.anInt409) {
					arg0.anInt443 = -1;
				}
			} else if (local17.anInt2183 == 1 && arg0.anInt434 > 0 && arg0.anInt421 <= Static156.anInt3722 && arg0.anInt409 < Static156.anInt3722) {
				arg0.anInt399 = 1;
			}
		}
		if (arg0.anInt443 != -1 && arg0.anInt399 == 0) {
			local17 = Static131.method697(arg0.anInt443);
			if (local17 == null || local17.anIntArray168 == null) {
				arg0.anInt443 = -1;
			} else {
				arg0.anInt474++;
				if (local17.anIntArray168.length > arg0.anInt431 && local17.anIntArray170[arg0.anInt431] < arg0.anInt474) {
					arg0.anInt431++;
					arg0.anInt474 = 1;
					Static232.method3865(arg0.anInt479, arg0.anInt427, arg0 == Static83.aClass9_Sub1_Sub1_1, arg0.anInt431, local17);
				}
				if (arg0.anInt431 >= local17.anIntArray168.length) {
					arg0.anInt431 -= local17.anInt2195;
					arg0.anInt415++;
					if (local17.anInt2187 <= arg0.anInt415) {
						arg0.anInt443 = -1;
					} else if (arg0.anInt431 >= 0 && arg0.anInt431 < local17.anIntArray168.length) {
						Static232.method3865(arg0.anInt479, arg0.anInt427, arg0 == Static83.aClass9_Sub1_Sub1_1, arg0.anInt431, local17);
					} else {
						arg0.anInt443 = -1;
					}
				}
				arg0.anInt407 = arg0.anInt431 + 1;
				if (arg0.anInt407 >= local17.anIntArray168.length) {
					arg0.anInt407 -= local17.anInt2195;
					if (local17.anInt2187 <= arg0.anInt415 + 1) {
						arg0.anInt407 = -1;
					} else if (arg0.anInt407 < 0 || local17.anIntArray168.length <= arg0.anInt407) {
						arg0.anInt407 = -1;
					}
				}
				arg0.aBoolean23 = local17.aBoolean128;
			}
		}
		if (arg0.anInt399 > 0) {
			arg0.anInt399--;
		}
		for (local143 = 0; local143 < arg0.aClass83Array3.length; local143++) {
			@Pc(714) Class83 local714 = arg0.aClass83Array3[local143];
			if (local714 != null) {
				if (local714.anInt3392 > 0) {
					local714.anInt3392--;
				} else {
					@Pc(735) Class49 local735 = Static131.method697(local714.anInt3390);
					if (local735 == null || local735.anIntArray168 == null) {
						arg0.aClass83Array3[local143] = null;
					} else {
						local714.anInt3384++;
						if (local735.anIntArray168.length > local714.anInt3385 && local714.anInt3384 > local735.anIntArray170[local714.anInt3385]) {
							local714.anInt3385++;
							local714.anInt3384 = 1;
							Static232.method3865(arg0.anInt479, arg0.anInt427, arg0 == Static83.aClass9_Sub1_Sub1_1, local714.anInt3385, local735);
						}
						if (local735.anIntArray168.length <= local714.anInt3385) {
							local714.anInt3385 -= local735.anInt2195;
							local714.anInt3386++;
							if (local735.anInt2187 <= local714.anInt3386) {
								arg0.aClass83Array3[local143] = null;
							} else if (local714.anInt3385 >= 0 && local714.anInt3385 < local735.anIntArray168.length) {
								Static232.method3865(arg0.anInt479, arg0.anInt427, Static83.aClass9_Sub1_Sub1_1 == arg0, local714.anInt3385, local735);
							} else {
								arg0.aClass83Array3[local143] = null;
							}
						}
						local714.anInt3391 = local714.anInt3385 + 1;
						if (local714.anInt3391 >= local735.anIntArray168.length) {
							local714.anInt3391 -= local735.anInt2195;
							if (local714.anInt3386 + 1 >= local735.anInt2187) {
								local714.anInt3391 = -1;
							} else if (local714.anInt3391 < 0 || local714.anInt3391 >= local735.anIntArray168.length) {
								local714.anInt3391 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	public static void method405() {
		Static80.aClass122ArrayArray1 = new Class122[Static57.aClass51_21.method1859()][];
		Static18.aBooleanArray1 = new boolean[Static57.aClass51_21.method1859()];
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method406(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(28) String local28;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local28 = local15.aString176 + " | ";
		} else {
			local28 = "";
		}
		@Pc(36) StringWriter local36 = new StringWriter();
		@Pc(41) PrintWriter local41 = new PrintWriter(local36);
		arg0.printStackTrace(local41);
		local41.close();
		@Pc(49) String local49 = local36.toString();
		@Pc(57) BufferedReader local57 = new BufferedReader(new StringReader(local49));
		@Pc(60) String local60 = local57.readLine();
		while (true) {
			@Pc(63) String local63 = local57.readLine();
			if (local63 == null) {
				return local28 + "| " + local60;
			}
			@Pc(69) int local69 = local63.indexOf(40);
			@Pc(76) int local76 = local63.indexOf(41, local69 + 1);
			@Pc(82) String local82;
			if (local69 == -1) {
				local82 = local63;
			} else {
				local82 = local63.substring(0, local69);
			}
			local82 = local82.trim();
			local82 = local82.substring(local82.lastIndexOf(32) + 1);
			local82 = local82.substring(local82.lastIndexOf(9) + 1);
			local28 = local28 + local82;
			if (local69 != -1 && local76 != -1) {
				@Pc(129) int local129 = local63.indexOf(".java:", local69);
				if (local129 >= 0) {
					local28 = local28 + local63.substring(local129 + 5, local76);
				}
			}
			local28 = local28 + ' ';
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
	public static void method407() {
		Static266.aClass79_41.method2479(5);
		Static222.aClass79_34.method2479(5);
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
	public static void method408() {
		Static264.aClass79_39.method2487();
		Static257.aClass79_38.method2487();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)I")
	public static int method409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(39) int local39 = Static202.method3371(arg0 - 1, arg1 + -1) + Static202.method3371(arg0 - 1, arg1 + 1) + Static202.method3371(arg0 + 1, arg1 + -1) + Static202.method3371(arg0 + 1, arg1 + 1);
		@Pc(73) int local73 = Static202.method3371(arg0, arg1 - 1) + Static202.method3371(arg0, arg1 + 1) + Static202.method3371(arg0 - 1, arg1) + Static202.method3371(arg0 + 1, arg1);
		@Pc(78) int local78 = Static202.method3371(arg0, arg1);
		return local39 / 16 + local73 / 8 + local78 / 4;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(III)V")
	public static void method412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1 * Static106.anInt2847 >> 8;
		if (arg0 == -1 && !Static1.aBoolean1) {
			Static82.method1658();
		} else if (arg0 != -1 && (arg0 != Static30.anInt925 || !Static23.method428()) && local5 != 0 && !Static1.aBoolean1) {
			Static140.method2549(Static258.aClass51_83, arg0, local5);
		}
		Static30.anInt925 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Lclient!o;")
	public static Class1_Sub2_Sub11 method414() {
		return Static122.aClass1_Sub2_Sub11_2;
	}
}
