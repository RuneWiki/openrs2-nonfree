import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "Lclient!fp;")
	public static Class77 aClass77_6;

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "[B")
	public static byte[] aByteArray32;

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "Lclient!np;")
	public static Class7_Sub8_Sub3 aClass7_Sub8_Sub3_2;

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
	public static int anInt2896;

	@OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
	public static int anInt2898;

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "Z")
	public static boolean aBoolean225 = false;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLclient!sb;)V")
	public static void method2675(@OriginalArg(1) Class22_Sub2_Sub1 arg0) {
		arg0.aBoolean376 = false;
		@Pc(18) Class170 local18;
		if (arg0.anInt5100 != -1) {
			local18 = Static261.method4379(arg0.anInt5100);
			if (local18 == null || local18.anIntArray652 == null) {
				arg0.anInt5100 = -1;
				arg0.aBoolean378 = false;
			} else {
				label297: {
					arg0.anInt5085++;
					if (arg0.anInt5081 < local18.anIntArray652.length && local18.anIntArray650[arg0.anInt5081] < arg0.anInt5085) {
						arg0.anInt5085 = 1;
						arg0.anInt5081++;
						arg0.anInt5132++;
						Static219.method3870(local18, arg0.anInt5967, arg0 == Static252.aClass22_Sub2_Sub1_Sub1_4, arg0.anInt5081, arg0.anInt5973);
					}
					if (arg0.anInt5081 >= local18.anIntArray652.length) {
						arg0.anInt5085 = 0;
						arg0.anInt5081 = 0;
						if (arg0.aBoolean378) {
							arg0.anInt5100 = arg0.method4417().method1986();
							if (arg0.anInt5100 == -1) {
								arg0.aBoolean378 = false;
								break label297;
							}
							local18 = Static261.method4379(arg0.anInt5100);
						}
						Static219.method3870(local18, arg0.anInt5967, Static252.aClass22_Sub2_Sub1_Sub1_4 == arg0, arg0.anInt5081, arg0.anInt5973);
					}
					arg0.anInt5132 = arg0.anInt5081 + 1;
					if (arg0.anInt5132 >= local18.anIntArray652.length) {
						arg0.anInt5132 = 0;
					}
				}
			}
		}
		@Pc(175) int local175;
		if (arg0.anInt5129 != -1 && Static212.anInt4234 >= arg0.anInt5092) {
			@Pc(172) Class197 local172 = Static10.method162(arg0.anInt5129);
			local175 = local172.anInt6076;
			if (local175 == -1) {
				arg0.anInt5129 = -1;
			} else {
				label299: {
					@Pc(183) Class170 local183 = Static261.method4379(local175);
					if (local172.aBoolean442) {
						if (local183.anInt4965 == 3) {
							if (arg0.anInt5144 > 0 && Static212.anInt4234 >= arg0.anInt5099 && arg0.anInt5138 < Static212.anInt4234) {
								arg0.anInt5129 = -1;
								break label299;
							}
						} else if (local183.anInt4965 == 1 && arg0.anInt5144 > 0 && Static212.anInt4234 >= arg0.anInt5099 && arg0.anInt5138 < Static212.anInt4234) {
							arg0.anInt5092 = Static212.anInt4234 + 1;
							break label299;
						}
					}
					if (local183 == null || local183.anIntArray652 == null) {
						arg0.anInt5129 = -1;
					} else {
						if (arg0.anInt5123 < 0) {
							arg0.anInt5123 = 0;
							Static219.method3870(local183, arg0.anInt5967, Static252.aClass22_Sub2_Sub1_Sub1_4 == arg0, 0, arg0.anInt5973);
						}
						arg0.anInt5127++;
						if (local183.anIntArray652.length > arg0.anInt5123 && arg0.anInt5127 > local183.anIntArray650[arg0.anInt5123]) {
							arg0.anInt5123++;
							arg0.anInt5127 = 1;
							Static219.method3870(local183, arg0.anInt5967, arg0 == Static252.aClass22_Sub2_Sub1_Sub1_4, arg0.anInt5123, arg0.anInt5973);
						}
						if (local183.anIntArray652.length <= arg0.anInt5123) {
							if (local172.aBoolean442) {
								arg0.anInt5123 -= local183.anInt4956;
								arg0.anInt5104++;
								if (arg0.anInt5104 >= local183.anInt4964) {
									arg0.anInt5129 = -1;
								} else if (arg0.anInt5123 >= 0 && arg0.anInt5123 < local183.anIntArray652.length) {
									Static219.method3870(local183, arg0.anInt5967, arg0 == Static252.aClass22_Sub2_Sub1_Sub1_4, arg0.anInt5123, arg0.anInt5973);
								} else {
									arg0.anInt5129 = -1;
								}
							} else {
								arg0.anInt5129 = -1;
							}
						}
						arg0.anInt5131 = arg0.anInt5123 + 1;
						if (local183.anIntArray652.length <= arg0.anInt5131) {
							if (local172.aBoolean442) {
								arg0.anInt5131 -= local183.anInt4956;
								if (arg0.anInt5104 + 1 >= local183.anInt4964) {
									arg0.anInt5131 = -1;
								} else if (arg0.anInt5131 < 0 || arg0.anInt5131 >= local183.anIntArray652.length) {
									arg0.anInt5131 = -1;
								}
							} else {
								arg0.anInt5131 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5133 != -1 && arg0.anInt5093 <= 1) {
			local18 = Static261.method4379(arg0.anInt5133);
			if (local18.anInt4965 == 3) {
				if (arg0.anInt5144 > 0 && arg0.anInt5099 <= Static212.anInt4234 && Static212.anInt4234 > arg0.anInt5138) {
					arg0.anInt5133 = -1;
				}
			} else if (local18.anInt4965 == 1 && arg0.anInt5144 > 0 && Static212.anInt4234 >= arg0.anInt5099 && arg0.anInt5138 < Static212.anInt4234) {
				arg0.anInt5093 = 2;
			}
		}
		if (arg0.anInt5133 != -1 && arg0.anInt5093 == 0) {
			@Pc(547) Class170 local547 = Static261.method4379(arg0.anInt5133);
			if (local547 == null || local547.anIntArray652 == null) {
				arg0.anInt5133 = -1;
			} else {
				arg0.anInt5137++;
				if (arg0.anInt5117 < local547.anIntArray652.length && arg0.anInt5137 > local547.anIntArray650[arg0.anInt5117]) {
					arg0.anInt5137 = 1;
					arg0.anInt5117++;
					Static219.method3870(local547, arg0.anInt5967, arg0 == Static252.aClass22_Sub2_Sub1_Sub1_4, arg0.anInt5117, arg0.anInt5973);
				}
				if (arg0.anInt5117 >= local547.anIntArray652.length) {
					arg0.anInt5120++;
					arg0.anInt5117 -= local547.anInt4956;
					if (local547.anInt4964 <= arg0.anInt5120) {
						arg0.anInt5133 = -1;
					} else if (arg0.anInt5117 >= 0 && local547.anIntArray652.length > arg0.anInt5117) {
						Static219.method3870(local547, arg0.anInt5967, Static252.aClass22_Sub2_Sub1_Sub1_4 == arg0, arg0.anInt5117, arg0.anInt5973);
					} else {
						arg0.anInt5133 = -1;
					}
				}
				arg0.anInt5143 = arg0.anInt5117 + 1;
				if (local547.anIntArray652.length <= arg0.anInt5143) {
					arg0.anInt5143 -= local547.anInt4956;
					if (local547.anInt4964 <= arg0.anInt5120 + 1) {
						arg0.anInt5143 = -1;
					} else if (arg0.anInt5143 < 0 || local547.anIntArray652.length <= arg0.anInt5143) {
						arg0.anInt5143 = -1;
					}
				}
				arg0.aBoolean376 = local547.aBoolean366;
			}
		}
		if (arg0.anInt5093 > 0) {
			arg0.anInt5093--;
		}
		for (local175 = 0; local175 < arg0.aClass190Array3.length; local175++) {
			@Pc(744) Class190 local744 = arg0.aClass190Array3[local175];
			if (local744 != null) {
				if (local744.anInt5764 > 0) {
					local744.anInt5764--;
				} else {
					@Pc(765) Class170 local765 = Static261.method4379(local744.anInt5765);
					if (local765 == null || local765.anIntArray652 == null) {
						arg0.aClass190Array3[local175] = null;
					} else {
						local744.anInt5760++;
						if (local744.anInt5759 < local765.anIntArray652.length && local744.anInt5760 > local765.anIntArray650[local744.anInt5759]) {
							local744.anInt5759++;
							local744.anInt5760 = 1;
							Static219.method3870(local765, arg0.anInt5967, arg0 == Static252.aClass22_Sub2_Sub1_Sub1_4, local744.anInt5759, arg0.anInt5973);
						}
						if (local765.anIntArray652.length <= local744.anInt5759) {
							local744.anInt5759 -= local765.anInt4956;
							local744.anInt5763++;
							if (local744.anInt5763 >= local765.anInt4964) {
								arg0.aClass190Array3[local175] = null;
							} else if (local744.anInt5759 >= 0 && local744.anInt5759 < local765.anIntArray652.length) {
								Static219.method3870(local765, arg0.anInt5967, Static252.aClass22_Sub2_Sub1_Sub1_4 == arg0, local744.anInt5759, arg0.anInt5973);
							} else {
								arg0.aClass190Array3[local175] = null;
							}
						}
						local744.anInt5761 = local744.anInt5759 + 1;
						if (local744.anInt5761 >= local765.anIntArray652.length) {
							local744.anInt5761 -= local765.anInt4956;
							if (local744.anInt5763 + 1 >= local765.anInt4964) {
								local744.anInt5761 = -1;
							} else if (local744.anInt5761 < 0 || local765.anIntArray652.length <= local744.anInt5761) {
								local744.anInt5761 = -1;
							}
						}
					}
				}
			}
		}
	}
}
