import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!ug", name = "F", descriptor = "Lclient!th;")
	public static Class168 aClass168_97;

	@OriginalMember(owner = "client!ug", name = "Jb", descriptor = "Lclient!th;")
	public static Class168 aClass168_98;

	@OriginalMember(owner = "client!ug", name = "kc", descriptor = "I")
	public static int anInt2853;

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
	public static int anInt2781 = -1;

	@OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
	public static int anInt2783 = 0;

	@OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
	public static int anInt2795 = 0;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(III)Lclient!aj;")
	public static Class7 method2096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub2 local7 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt45; local13++) {
			@Pc(22) Class7 local22 = local7.aClass7Array1[local13];
			if ((local22.aLong7 >> 29 & 0x3L) == 2L && local22.anInt214 == arg1 && local22.anInt220 == arg2) {
				Static172.method2803(local22);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ug;Z)V")
	public static void method2097(@OriginalArg(0) Class2_Sub4 arg0) {
		if (arg0.anInt2797 == 0) {
			return;
		}
		@Pc(15) Class91 local15 = arg0.method2095();
		@Pc(39) int local39;
		@Pc(45) int local45;
		if (arg0.anInt2838 != -1 && arg0.anInt2838 < 32768) {
			@Pc(30) Class2_Sub4_Sub1 local30 = Static105.aClass2_Sub4_Sub1Array1[arg0.anInt2838];
			if (local30 != null) {
				local39 = arg0.anInt2846 - local30.anInt2846;
				local45 = arg0.anInt2794 - local30.anInt2794;
				if (local39 != 0 || local45 != 0) {
					arg0.anInt2823 = (int) (Math.atan2((double) local39, (double) local45) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(105) int local105;
		@Pc(74) int local74;
		if (arg0.anInt2838 >= 32768) {
			local74 = arg0.anInt2838 - 32768;
			if (Static62.anInt1348 == local74) {
				local74 = 2047;
			}
			@Pc(88) Class2_Sub4_Sub2 local88 = Static155.aClass2_Sub4_Sub2Array1[local74];
			if (local88 != null) {
				local45 = arg0.anInt2846 - local88.anInt2846;
				local105 = arg0.anInt2794 - local88.anInt2794;
				if (local45 != 0 || local105 != 0) {
					arg0.anInt2823 = (int) (Math.atan2((double) local45, (double) local105) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2775 != 0 || arg0.anInt2821 != 0) && (arg0.anInt2787 == 0 || arg0.anInt2842 > 0)) {
			local74 = arg0.anInt2846 - (arg0.anInt2775 - Static159.anInt3527 - Static159.anInt3527) * 64;
			local39 = arg0.anInt2794 - (arg0.anInt2821 - Static217.anInt4673 - Static217.anInt4673) * 64;
			if (local74 != 0 || local39 != 0) {
				arg0.anInt2823 = (int) (Math.atan2((double) local74, (double) local39) * 325.949D) & 0x7FF;
			}
			arg0.anInt2821 = 0;
			arg0.anInt2775 = 0;
		}
		local74 = arg0.anInt2823 - arg0.anInt2766 & 0x7FF;
		if (local74 == 0) {
			arg0.anInt2847 = 0;
			arg0.anInt2828 = 0;
		} else if (local15.anInt3146 == 0) {
			arg0.anInt2828++;
			@Pc(888) boolean local888;
			if (local74 <= 1024) {
				arg0.anInt2766 += arg0.anInt2797;
				local888 = true;
				if (arg0.anInt2797 > local74 || local74 > 2048 - arg0.anInt2797) {
					arg0.anInt2766 = arg0.anInt2823;
					local888 = false;
				}
				if (arg0.anInt2828 > 25 || local888) {
					arg0.anInt2820 = local15.anInt3128;
					if (arg0.anInt2787 <= 0) {
						if (local15.anInt3153 != -1) {
							arg0.anInt2820 = local15.anInt3153;
						}
					} else if (arg0.aByteArray53[arg0.anInt2787 - 1] == 2) {
						if (local15.anInt3144 != -1) {
							arg0.anInt2820 = local15.anInt3144;
						} else if (local15.anInt3125 != -1) {
							arg0.anInt2820 = local15.anInt3125;
						}
					} else if (arg0.aByteArray53[arg0.anInt2787 - 1] == 0) {
						if (local15.anInt3126 != -1) {
							arg0.anInt2820 = local15.anInt3126;
						} else if (local15.anInt3134 != -1) {
							arg0.anInt2820 = local15.anInt3134;
						}
					} else if (local15.anInt3137 != -1) {
						arg0.anInt2820 = local15.anInt3137;
					}
				}
			} else {
				arg0.anInt2766 -= arg0.anInt2797;
				local888 = true;
				if (arg0.anInt2797 > local74 || 2048 - arg0.anInt2797 < local74) {
					arg0.anInt2766 = arg0.anInt2823;
					local888 = false;
				}
				if (arg0.anInt2828 > 25 || local888) {
					arg0.anInt2820 = local15.anInt3128;
					if (arg0.anInt2787 <= 0) {
						if (local15.anInt3151 != -1) {
							arg0.anInt2820 = local15.anInt3151;
						}
					} else if (arg0.aByteArray53[arg0.anInt2787 - 1] == 2) {
						if (local15.anInt3142 != -1) {
							arg0.anInt2820 = local15.anInt3142;
						} else if (local15.anInt3125 != -1) {
							arg0.anInt2820 = local15.anInt3125;
						}
					} else if (arg0.aByteArray53[arg0.anInt2787 - 1] == 0) {
						if (local15.anInt3143 != -1) {
							arg0.anInt2820 = local15.anInt3143;
						} else if (local15.anInt3134 != -1) {
							arg0.anInt2820 = local15.anInt3134;
						}
					} else if (local15.anInt3154 != -1) {
						arg0.anInt2820 = local15.anInt3154;
					}
				}
			}
			arg0.anInt2766 &= 0x7FF;
		} else {
			local39 = arg0.anInt2823 << 5;
			if (local39 != arg0.anInt2850) {
				arg0.anInt2855 = 0;
				local45 = local39 - arg0.anInt2768 & 0xFFFF;
				local105 = arg0.anInt2847 * arg0.anInt2847 / (local15.anInt3146 * 2);
				arg0.anInt2850 = local39;
				@Pc(303) int local303;
				if (arg0.anInt2847 > 0 && local45 >= local105 && local45 - local105 < 32768) {
					local303 = local15.anInt3124 * local15.anInt3124 / (local15.anInt3146 * 2);
					arg0.aBoolean177 = true;
					if (local303 > 32767) {
						local303 = 32767;
					}
					arg0.anInt2841 = local45 / 2;
					if (local303 < arg0.anInt2841) {
						arg0.anInt2841 = local45 - local303;
					}
				} else if (arg0.anInt2847 < 0 && local105 <= 65536 - local45 && 65536 - local105 - local45 < 32768) {
					arg0.aBoolean177 = true;
					arg0.anInt2841 = (65536 - local45) / 2;
					local303 = local15.anInt3124 * local15.anInt3124 / (local15.anInt3146 * 2);
					if (local303 > 32767) {
						local303 = 32767;
					}
					if (local303 < arg0.anInt2841) {
						arg0.anInt2841 = 65536 - local45 - local303;
					}
				} else {
					arg0.aBoolean177 = false;
				}
			}
			if (arg0.anInt2847 == 0) {
				local45 = arg0.anInt2850 - arg0.anInt2768 & 0xFFFF;
				if (local15.anInt3146 <= local45) {
					arg0.anInt2855 = 0;
					arg0.aBoolean177 = true;
					local105 = local15.anInt3124 * local15.anInt3124 / (local15.anInt3146 * 2);
					if (local105 > 32767) {
						local105 = 32767;
					}
					if (local45 < 32768) {
						arg0.anInt2841 = local45 / 2;
						arg0.anInt2847 = local15.anInt3146;
						if (arg0.anInt2841 > local105) {
							arg0.anInt2841 = local45 - local105;
						}
					} else {
						arg0.anInt2847 = -local15.anInt3146;
						arg0.anInt2841 = (65536 - local45) / 2;
						if (local105 < arg0.anInt2841) {
							arg0.anInt2841 = 65536 - local45 - local105;
						}
					}
				} else {
					arg0.anInt2768 = arg0.anInt2850;
				}
			} else if (arg0.anInt2847 > 0) {
				if (arg0.anInt2855 >= arg0.anInt2841) {
					arg0.aBoolean177 = false;
				}
				if (!arg0.aBoolean177) {
					arg0.anInt2847 -= local15.anInt3146;
					if (arg0.anInt2847 < 0) {
						arg0.anInt2847 = 0;
					}
				} else if (arg0.anInt2847 < local15.anInt3124) {
					arg0.anInt2847 += local15.anInt3146;
				}
			} else {
				if (arg0.anInt2855 >= arg0.anInt2841) {
					arg0.aBoolean177 = false;
				}
				if (!arg0.aBoolean177) {
					arg0.anInt2847 += local15.anInt3146;
					if (arg0.anInt2847 > 0) {
						arg0.anInt2847 = 0;
					}
				} else if (-local15.anInt3124 < arg0.anInt2847) {
					arg0.anInt2847 -= local15.anInt3146;
				}
			}
			if (arg0.anInt2847 <= 0) {
				arg0.anInt2855 -= arg0.anInt2847;
			} else {
				arg0.anInt2855 += arg0.anInt2847;
			}
			arg0.anInt2820 = -1;
			arg0.anInt2768 += arg0.anInt2847;
			arg0.anInt2768 &= 0xFFFF;
			arg0.anInt2766 = arg0.anInt2768 >> 5;
			if (arg0.anInt2847 >= 0) {
				if (arg0.anInt2787 > 0) {
					if (arg0.aByteArray53[arg0.anInt2787 - 1] == 2) {
						if (local15.anInt3144 != -1) {
							arg0.anInt2820 = local15.anInt3144;
						} else if (local15.anInt3125 != -1) {
							arg0.anInt2820 = local15.anInt3125;
						}
					} else if (arg0.aByteArray53[arg0.anInt2787 - 1] == 0) {
						if (local15.anInt3126 != -1) {
							arg0.anInt2820 = local15.anInt3126;
						} else if (local15.anInt3134 != -1) {
							arg0.anInt2820 = local15.anInt3134;
						}
					}
				}
				if (arg0.anInt2820 == -1) {
					if (local15.anInt3137 != -1) {
						arg0.anInt2820 = local15.anInt3137;
					} else if (local15.anInt3153 != -1) {
						arg0.anInt2820 = local15.anInt3153;
					}
				}
			} else {
				if (arg0.anInt2787 > 0) {
					if (arg0.aByteArray53[arg0.anInt2787 - 1] == 2) {
						if (local15.anInt3142 != -1) {
							arg0.anInt2820 = local15.anInt3142;
						} else if (local15.anInt3125 != -1) {
							arg0.anInt2820 = local15.anInt3125;
						}
					} else if (arg0.aByteArray53[arg0.anInt2787 - 1] == 0) {
						if (local15.anInt3143 != -1) {
							arg0.anInt2820 = local15.anInt3143;
						} else if (local15.anInt3134 != -1) {
							arg0.anInt2820 = local15.anInt3134;
						}
					}
				}
				if (arg0.anInt2820 == -1) {
					if (local15.anInt3154 != -1) {
						arg0.anInt2820 = local15.anInt3154;
					} else if (local15.anInt3151 != -1) {
						arg0.anInt2820 = local15.anInt3151;
					}
				}
			}
			if (arg0.anInt2820 == -1) {
				arg0.anInt2820 = local15.anInt3128;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)V")
	public static void method2101(@OriginalArg(1) int arg0) {
		if (!Static210.aBoolean284) {
			arg0 = -1;
		}
		if (Static195.anInt4268 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(28) Class78 local28 = Static34.method692(arg0);
			@Pc(32) Class1_Sub3_Sub13_Sub2 local32 = local28.method1843();
			if (local32 == null) {
				arg0 = -1;
			} else {
				Static142.aClass112_2.method2880(local32.anInt5575, Static108.aCanvas1, new Point(local28.anInt2469, local28.anInt2468), local32.anInt5572, local32.method4225());
				Static195.anInt4268 = arg0;
			}
		}
		if (arg0 == -1 && Static195.anInt4268 != -1) {
			Static142.aClass112_2.method2880(-1, Static108.aCanvas1, new Point(), -1, null);
			Static195.anInt4268 = -1;
		}
	}
}
