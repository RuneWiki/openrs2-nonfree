import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ej", name = "E", descriptor = "Lclient!rc;")
	public static Class42 aClass42_4;

	@OriginalMember(owner = "client!ej", name = "H", descriptor = "Lclient!r;")
	public static Class197 aClass197_19;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "()V", line = 36)
	public static void method1871() {
		Class2_Sub3_Sub9.anInt1620 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static245.anInt4891; local3++) {
			@Pc(8) Class58 local8 = Static227.aClass58Array3[local3];
			@Pc(12) int local12;
			if (Static170.anIntArray205 != null) {
				for (local12 = 0; local12 < Static170.anIntArray205.length; local12++) {
					if (Static170.anIntArray205[local12] != -1000000 && (local8.anInt1695 <= Static170.anIntArray205[local12] || local8.anInt1701 <= Static170.anIntArray205[local12]) && (local8.anInt1697 <= Static350.anIntArray483[local12] || local8.anInt1693 <= Static350.anIntArray483[local12]) && (local8.anInt1697 >= Static150.anIntArray185[local12] || local8.anInt1693 >= Static150.anIntArray185[local12]) && (local8.anInt1684 <= Static89.anIntArray126[local12] || local8.anInt1690 <= Static89.anIntArray126[local12]) && (local8.anInt1684 >= Static331.anIntArray462[local12] || local8.anInt1690 >= Static331.anIntArray462[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt1687 == 1) {
				local12 = local8.anInt1694 + Static198.anInt3784 - Static229.anInt4641;
				if (local12 >= 0 && local12 <= Static198.anInt3784 + Static198.anInt3784) {
					local110 = local8.anInt1686 + Static198.anInt3784 - Static197.anInt3776;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt1689 + Static198.anInt3784 - Static197.anInt3776;
					if (local121 > Static198.anInt3784 + Static198.anInt3784) {
						local121 = Static198.anInt3784 + Static198.anInt3784;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static6.aBooleanArrayArray1[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static328.anInt6520 - local8.anInt1697;
						if (local153 > Class11_Sub5_Sub3.anInt4734) {
							local8.anInt1688 = 1;
						} else {
							if (local153 >= -Class11_Sub5_Sub3.anInt4734) {
								continue;
							}
							local8.anInt1688 = 2;
							local153 = -local153;
						}
						local8.anInt1699 = (local8.anInt1684 - Static334.anInt6684 << 8) / local153;
						local8.anInt1683 = (local8.anInt1690 - Static334.anInt6684 << 8) / local153;
						local8.anInt1696 = (local8.anInt1695 - Static110.anInt2372 << 8) / local153;
						local8.anInt1700 = (local8.anInt1701 - Static110.anInt2372 << 8) / local153;
						Static171.aClass58Array2[Class2_Sub3_Sub9.anInt1620++] = local8;
					}
				}
			} else if (local8.anInt1687 == 2) {
				local12 = local8.anInt1686 + Static198.anInt3784 - Static197.anInt3776;
				if (local12 >= 0 && local12 <= Static198.anInt3784 + Static198.anInt3784) {
					local110 = local8.anInt1694 + Static198.anInt3784 - Static229.anInt4641;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt1685 + Static198.anInt3784 - Static229.anInt4641;
					if (local121 > Static198.anInt3784 + Static198.anInt3784) {
						local121 = Static198.anInt3784 + Static198.anInt3784;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static6.aBooleanArrayArray1[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static334.anInt6684 - local8.anInt1684;
						if (local153 > Class11_Sub5_Sub3.anInt4734) {
							local8.anInt1688 = 3;
						} else {
							if (local153 >= -Class11_Sub5_Sub3.anInt4734) {
								continue;
							}
							local8.anInt1688 = 4;
							local153 = -local153;
						}
						local8.anInt1691 = (local8.anInt1697 - Static328.anInt6520 << 8) / local153;
						local8.anInt1702 = (local8.anInt1693 - Static328.anInt6520 << 8) / local153;
						local8.anInt1696 = (local8.anInt1695 - Static110.anInt2372 << 8) / local153;
						local8.anInt1700 = (local8.anInt1701 - Static110.anInt2372 << 8) / local153;
						Static171.aClass58Array2[Class2_Sub3_Sub9.anInt1620++] = local8;
					}
				}
			} else if (local8.anInt1687 == 4) {
				local12 = local8.anInt1695 - Static110.anInt2372;
				if (local12 > Class11_Sub5_Sub3.anInt4711) {
					local110 = local8.anInt1686 + Static198.anInt3784 - Static197.anInt3776;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt1689 + Static198.anInt3784 - Static197.anInt3776;
					if (local121 > Static198.anInt3784 + Static198.anInt3784) {
						local121 = Static198.anInt3784 + Static198.anInt3784;
					}
					if (local110 <= local121) {
						@Pc(405) int local405 = local8.anInt1694 + Static198.anInt3784 - Static229.anInt4641;
						if (local405 < 0) {
							local405 = 0;
						}
						local153 = local8.anInt1685 + Static198.anInt3784 - Static229.anInt4641;
						if (local153 > Static198.anInt3784 + Static198.anInt3784) {
							local153 = Static198.anInt3784 + Static198.anInt3784;
						}
						@Pc(427) boolean local427 = false;
						label159: for (@Pc(429) int local429 = local405; local429 <= local153; local429++) {
							for (@Pc(432) int local432 = local110; local432 <= local121; local432++) {
								if (Static6.aBooleanArrayArray1[local429][local432]) {
									local427 = true;
									break label159;
								}
							}
						}
						if (local427) {
							local8.anInt1688 = 5;
							local8.anInt1691 = (local8.anInt1697 - Static328.anInt6520 << 8) / local12;
							local8.anInt1702 = (local8.anInt1693 - Static328.anInt6520 << 8) / local12;
							local8.anInt1699 = (local8.anInt1684 - Static334.anInt6684 << 8) / local12;
							local8.anInt1683 = (local8.anInt1690 - Static334.anInt6684 << 8) / local12;
							Static171.aClass58Array2[Class2_Sub3_Sub9.anInt1620++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)Z", line = 262)
	public static boolean method1872() {
		if (Class185.aBoolean375) {
			try {
				Static391.method4629(Static305.aClass152_5.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIBIII)V", line = 286)
	public static void method1873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < 1 || arg7 < 1 || Class241.anInt7020 - 2 < arg1 || OutputStream_Sub1.anInt4442 - 2 < arg7) {
			return;
		}
		@Pc(30) int local30 = arg0;
		if (arg0 < 3 && Static302.method5546(arg7, arg1)) {
			local30 = arg0 + 1;
		}
		if (!Static203.aClass177_Sub1_2.method4496(Class2_Sub10.anInt1760) && !Static133.method2663(arg7, Class2_Sub6.anInt1114, local30, arg1)) {
			return;
		}
		if (Static307.aClass67ArrayArrayArray3 == null) {
			return;
		}
		Static177.aClass29_Sub1_63.method1108(arg0, arg1, Class2_Sub3_Sub18.aClass46Array1[arg0], arg4, arg7, Static177.aClass19_8);
		if (arg2 < 0) {
			return;
		}
		@Pc(76) boolean local76 = Static203.aClass177_Sub1_2.aBoolean359;
		Static203.aClass177_Sub1_2.aBoolean359 = true;
		Static177.aClass29_Sub1_63.method1105(arg3, arg1, arg7, arg2, local30, arg0, Static177.aClass19_8, Class2_Sub3_Sub18.aClass46Array1[arg0], arg6, arg5);
		Static203.aClass177_Sub1_2.aBoolean359 = local76;
		return;
	}
}
