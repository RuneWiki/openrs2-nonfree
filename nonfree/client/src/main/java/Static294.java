import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Z")
	public static boolean aBoolean109 = true;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Z")
	public static boolean aBoolean110 = false;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method943(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < Static144.anInt2798; local12++) {
			if (arg0.equalsIgnoreCase(Static19.aStringArray4[local12])) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Static138.aClass11_Sub4_Sub1_3.aString99)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V")
	public static void method944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static146.anInt3024 = arg3;
		Static99.anInt2122 = arg4;
		Static29.anInt555 = arg0;
		Static246.anInt4521 = arg1;
		Static148.anInt3027 = arg2;
		if (Static29.anInt555 >= 100) {
			@Pc(32) int local32 = Static99.anInt2122 * 128 + 64;
			@Pc(38) int local38 = Static148.anInt3027 * 128 + 64;
			@Pc(46) int local46 = Static42.method768(local32, Static132.anInt2608, local38) - Static246.anInt4521;
			@Pc(51) int local51 = local32 - Static273.anInt5035;
			@Pc(55) int local55 = local46 - Static283.anInt5144;
			@Pc(60) int local60 = local38 - Static87.anInt1875;
			@Pc(71) int local71 = (int) Math.sqrt((double) (local60 * local60 + local51 * local51));
			Static53.anInt1161 = (int) (Math.atan2((double) local55, (double) local71) * 325.949D) & 0x7FF;
			Static305.anInt5484 = (int) (-325.949D * Math.atan2((double) local51, (double) local60)) & 0x7FF;
			if (Static53.anInt1161 < 128) {
				Static53.anInt1161 = 128;
			}
			if (Static53.anInt1161 > 383) {
				Static53.anInt1161 = 383;
			}
		}
		Static228.anInt4270 = 2;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!od;I)I")
	public static int method945(@OriginalArg(0) Class11_Sub4_Sub2 arg0) {
		@Pc(8) Class183 local8 = arg0.aClass183_1;
		if (local8.anIntArray596 != null) {
			local8 = local8.method4526();
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(25) int local25 = local8.anInt5439;
		@Pc(29) Class28 local29 = arg0.method3348();
		if (arg0.anInt3828 == local29.anInt869) {
			local25 = local8.anInt5437;
		} else if (arg0.anInt3828 == local29.anInt868 || arg0.anInt3828 == local29.anInt879 || arg0.anInt3828 == local29.anInt847 || arg0.anInt3828 == local29.anInt849) {
			local25 = local8.anInt5438;
		} else if (arg0.anInt3828 == local29.anInt871 || arg0.anInt3828 == local29.anInt881 || local29.anInt858 == arg0.anInt3828 || arg0.anInt3828 == local29.anInt882) {
			local25 = local8.anInt5459;
		}
		return local25;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!re;I)V")
	public static void method947(@OriginalArg(0) Class11_Sub4 arg0) {
		if (arg0.anInt3813 == 0) {
			return;
		}
		@Pc(13) Class28 local13 = arg0.method3348();
		@Pc(39) int local39;
		@Pc(45) int local45;
		if (arg0.anInt3784 != -1 && arg0.anInt3784 < 32768) {
			@Pc(29) Class11_Sub4_Sub2 local29 = Static138.aClass11_Sub4_Sub2Array2[arg0.anInt3784];
			if (local29 != null) {
				local39 = arg0.anInt3865 - local29.anInt3865;
				local45 = arg0.anInt3856 - local29.anInt3856;
				if (local39 != 0 || local45 != 0) {
					arg0.anInt3853 = (int) (Math.atan2((double) local39, (double) local45) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(102) int local102;
		@Pc(76) int local76;
		if (arg0.anInt3784 >= 32768) {
			local76 = arg0.anInt3784 - 32768;
			if (local76 == Static68.anInt1471) {
				local76 = 2047;
			}
			@Pc(86) Class11_Sub4_Sub1 local86 = Static14.aClass11_Sub4_Sub1Array1[local76];
			if (local86 != null) {
				local45 = arg0.anInt3865 - local86.anInt3865;
				local102 = arg0.anInt3856 - local86.anInt3856;
				if (local45 != 0 || local102 != 0) {
					arg0.anInt3853 = (int) (Math.atan2((double) local45, (double) local102) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3816 != 0 || arg0.anInt3790 != 0) && (arg0.anInt3863 == 0 || arg0.anInt3806 > 0)) {
			local76 = arg0.anInt3865 - (arg0.anInt3816 - Static38.anInt714 - Static38.anInt714) * 64;
			local39 = arg0.anInt3856 - (arg0.anInt3790 - Static135.anInt2659 - Static135.anInt2659) * 64;
			if (local76 != 0 || local39 != 0) {
				arg0.anInt3853 = (int) (Math.atan2((double) local76, (double) local39) * 325.949D) & 0x7FF;
			}
			arg0.anInt3790 = 0;
			arg0.anInt3816 = 0;
		}
		local76 = arg0.anInt3853 - arg0.anInt3852 & 0x7FF;
		if (local76 == 0) {
			arg0.anInt3848 = 0;
			arg0.anInt3821 = 0;
		} else if (local13.anInt856 == 0) {
			arg0.anInt3848++;
			@Pc(239) boolean local239;
			if (local76 <= 1024) {
				local239 = true;
				arg0.anInt3852 += arg0.anInt3813;
				if (local76 < arg0.anInt3813 || local76 > 2048 - arg0.anInt3813) {
					arg0.anInt3852 = arg0.anInt3853;
					local239 = false;
				}
				if (arg0.anInt3848 > 25 || local239) {
					arg0.anInt3828 = local13.anInt872;
					if (arg0.anInt3863 <= 0) {
						if (local13.anInt867 != -1) {
							arg0.anInt3828 = local13.anInt867;
						}
					} else if (arg0.aByteArray127[arg0.anInt3863 - 1] == 2) {
						if (local13.anInt863 != -1) {
							arg0.anInt3828 = local13.anInt863;
						} else if (local13.anInt868 != -1) {
							arg0.anInt3828 = local13.anInt868;
						}
					} else if (arg0.aByteArray127[arg0.anInt3863 - 1] == 0) {
						if (local13.anInt864 != -1) {
							arg0.anInt3828 = local13.anInt864;
						} else if (local13.anInt871 != -1) {
							arg0.anInt3828 = local13.anInt871;
						}
					} else if (local13.anInt862 != -1) {
						arg0.anInt3828 = local13.anInt862;
					}
				}
			} else {
				local239 = true;
				arg0.anInt3852 -= arg0.anInt3813;
				if (local76 < arg0.anInt3813 || 2048 - arg0.anInt3813 < local76) {
					arg0.anInt3852 = arg0.anInt3853;
					local239 = false;
				}
				if (arg0.anInt3848 > 25 || local239) {
					arg0.anInt3828 = local13.anInt872;
					if (arg0.anInt3863 <= 0) {
						if (local13.anInt880 != -1) {
							arg0.anInt3828 = local13.anInt880;
						}
					} else if (arg0.aByteArray127[arg0.anInt3863 - 1] == 2) {
						if (local13.anInt860 != -1) {
							arg0.anInt3828 = local13.anInt860;
						} else if (local13.anInt868 != -1) {
							arg0.anInt3828 = local13.anInt868;
						}
					} else if (arg0.aByteArray127[arg0.anInt3863 - 1] == 0) {
						if (local13.anInt859 != -1) {
							arg0.anInt3828 = local13.anInt859;
						} else if (local13.anInt871 != -1) {
							arg0.anInt3828 = local13.anInt871;
						}
					} else if (local13.anInt855 != -1) {
						arg0.anInt3828 = local13.anInt855;
					}
				}
			}
			arg0.anInt3852 &= 0x7FF;
		} else {
			arg0.anInt3828 = -1;
			local39 = arg0.anInt3853 << 5;
			if (local39 != arg0.anInt3846) {
				arg0.anInt3846 = local39;
				arg0.anInt3837 = 0;
				local102 = arg0.anInt3821 * arg0.anInt3821 / (local13.anInt856 * 2);
				local45 = local39 - arg0.anInt3825 & 0xFFFF;
				@Pc(601) int local601;
				if (arg0.anInt3821 > 0 && local45 >= local102 && local45 - local102 < 32768) {
					arg0.anInt3814 = local45 / 2;
					arg0.aBoolean337 = true;
					local601 = local13.anInt874 * local13.anInt874 / (local13.anInt856 * 2);
					if (local601 > 32767) {
						local601 = 32767;
					}
					if (local601 < arg0.anInt3814) {
						arg0.anInt3814 = local45 - local601;
					}
				} else if (arg0.anInt3821 < 0 && local102 <= 65536 - local45 && 65536 - local102 - local45 < 32768) {
					arg0.anInt3814 = (65536 - local45) / 2;
					arg0.aBoolean337 = true;
					local601 = local13.anInt874 * local13.anInt874 / (local13.anInt856 * 2);
					if (local601 > 32767) {
						local601 = 32767;
					}
					if (arg0.anInt3814 > local601) {
						arg0.anInt3814 = 65536 - local45 - local601;
					}
				} else {
					arg0.aBoolean337 = false;
				}
			}
			if (arg0.anInt3821 == 0) {
				local45 = arg0.anInt3846 - arg0.anInt3825 & 0xFFFF;
				if (local45 >= local13.anInt856) {
					arg0.anInt3837 = 0;
					arg0.aBoolean337 = true;
					local102 = local13.anInt874 * local13.anInt874 / (local13.anInt856 * 2);
					if (local102 > 32767) {
						local102 = 32767;
					}
					if (local45 >= 32768) {
						arg0.anInt3814 = (65536 - local45) / 2;
						if (local102 < arg0.anInt3814) {
							arg0.anInt3814 = 65536 - local45 - local102;
						}
						arg0.anInt3821 = -local13.anInt856;
					} else {
						arg0.anInt3821 = local13.anInt856;
						arg0.anInt3814 = local45 / 2;
						if (local102 < arg0.anInt3814) {
							arg0.anInt3814 = local45 - local102;
						}
					}
				} else {
					arg0.anInt3825 = arg0.anInt3846;
				}
			} else if (arg0.anInt3821 <= 0) {
				if (arg0.anInt3837 >= arg0.anInt3814) {
					arg0.aBoolean337 = false;
				}
				if (!arg0.aBoolean337) {
					arg0.anInt3821 += local13.anInt856;
					if (arg0.anInt3821 > 0) {
						arg0.anInt3821 = 0;
					}
				} else if (arg0.anInt3821 > -local13.anInt874) {
					arg0.anInt3821 -= local13.anInt856;
				}
			} else {
				if (arg0.anInt3837 >= arg0.anInt3814) {
					arg0.aBoolean337 = false;
				}
				if (!arg0.aBoolean337) {
					arg0.anInt3821 -= local13.anInt856;
					if (arg0.anInt3821 < 0) {
						arg0.anInt3821 = 0;
					}
				} else if (local13.anInt874 > arg0.anInt3821) {
					arg0.anInt3821 += local13.anInt856;
				}
			}
			arg0.anInt3825 += arg0.anInt3821;
			arg0.anInt3825 &= 0xFFFF;
			if (arg0.anInt3821 > 0) {
				arg0.anInt3837 += arg0.anInt3821;
			} else {
				arg0.anInt3837 -= arg0.anInt3821;
			}
			arg0.anInt3852 = arg0.anInt3825 >> 5;
			if (arg0.anInt3821 < 0) {
				if (arg0.anInt3863 > 0) {
					if (arg0.aByteArray127[arg0.anInt3863 - 1] == 2) {
						if (local13.anInt860 != -1) {
							arg0.anInt3828 = local13.anInt860;
						} else if (local13.anInt868 != -1) {
							arg0.anInt3828 = local13.anInt868;
						}
					} else if (arg0.aByteArray127[arg0.anInt3863 - 1] == 0) {
						if (local13.anInt859 != -1) {
							arg0.anInt3828 = local13.anInt859;
						} else if (local13.anInt871 != -1) {
							arg0.anInt3828 = local13.anInt871;
						}
					}
				}
				if (arg0.anInt3828 == -1) {
					if (local13.anInt855 != -1) {
						arg0.anInt3828 = local13.anInt855;
					} else if (local13.anInt880 != -1) {
						arg0.anInt3828 = local13.anInt880;
					}
				}
			} else {
				if (arg0.anInt3863 > 0) {
					if (arg0.aByteArray127[arg0.anInt3863 - 1] == 2) {
						if (local13.anInt863 != -1) {
							arg0.anInt3828 = local13.anInt863;
						} else if (local13.anInt868 != -1) {
							arg0.anInt3828 = local13.anInt868;
						}
					} else if (arg0.aByteArray127[arg0.anInt3863 - 1] == 0) {
						if (local13.anInt864 != -1) {
							arg0.anInt3828 = local13.anInt864;
						} else if (local13.anInt871 != -1) {
							arg0.anInt3828 = local13.anInt871;
						}
					}
				}
				if (arg0.anInt3828 == -1) {
					if (local13.anInt862 != -1) {
						arg0.anInt3828 = local13.anInt862;
					} else if (local13.anInt867 != -1) {
						arg0.anInt3828 = local13.anInt867;
					}
				}
			}
			if (arg0.anInt3828 == -1) {
				arg0.anInt3828 = local13.anInt872;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBLclient!nm;)[Lclient!fo;")
	public static Class57_Sub1[] method948(@OriginalArg(0) int arg0, @OriginalArg(3) Class119 arg1) {
		return Static114.method2083(arg0, arg1, 0) ? Static89.method1732() : null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method949() {
		Static10.aClass1_Sub13_Sub1_117.method1892();
		@Pc(11) int local11 = Static10.aClass1_Sub13_Sub1_117.method1883(8);
		@Pc(21) int local21;
		if (Static1.anInt48 > local11) {
			for (local21 = local11; local21 < Static1.anInt48; local21++) {
				Static304.anIntArray601[Static128.anInt2549++] = Static288.anIntArray572[local21];
			}
		}
		if (Static1.anInt48 < local11) {
			throw new RuntimeException("gnpov1");
		}
		Static1.anInt48 = 0;
		for (local21 = 0; local21 < local11; local21++) {
			@Pc(65) int local65 = Static288.anIntArray572[local21];
			@Pc(69) Class11_Sub4_Sub2 local69 = Static138.aClass11_Sub4_Sub2Array2[local65];
			@Pc(74) int local74 = Static10.aClass1_Sub13_Sub1_117.method1883(1);
			if (local74 == 0) {
				Static288.anIntArray572[Static1.anInt48++] = local65;
				local69.anInt3822 = Static167.anInt637;
			} else {
				@Pc(98) int local98 = Static10.aClass1_Sub13_Sub1_117.method1883(2);
				if (local98 == 0) {
					Static288.anIntArray572[Static1.anInt48++] = local65;
					local69.anInt3822 = Static167.anInt637;
					Static18.anIntArray36[Static125.anInt2513++] = local65;
				} else {
					@Pc(147) int local147;
					@Pc(157) int local157;
					if (local98 == 1) {
						Static288.anIntArray572[Static1.anInt48++] = local65;
						local69.anInt3822 = Static167.anInt637;
						local147 = Static10.aClass1_Sub13_Sub1_117.method1883(3);
						local69.method3361(1, local147);
						local157 = Static10.aClass1_Sub13_Sub1_117.method1883(1);
						if (local157 == 1) {
							Static18.anIntArray36[Static125.anInt2513++] = local65;
						}
					} else if (local98 == 2) {
						Static288.anIntArray572[Static1.anInt48++] = local65;
						local69.anInt3822 = Static167.anInt637;
						if (Static10.aClass1_Sub13_Sub1_117.method1883(1) == 1) {
							local147 = Static10.aClass1_Sub13_Sub1_117.method1883(3);
							local69.method3361(2, local147);
							local157 = Static10.aClass1_Sub13_Sub1_117.method1883(3);
							local69.method3361(2, local157);
						} else {
							local147 = Static10.aClass1_Sub13_Sub1_117.method1883(3);
							local69.method3361(0, local147);
						}
						local147 = Static10.aClass1_Sub13_Sub1_117.method1883(1);
						if (local147 == 1) {
							Static18.anIntArray36[Static125.anInt2513++] = local65;
						}
					} else if (local98 == 3) {
						Static304.anIntArray601[Static128.anInt2549++] = local65;
					}
				}
			}
		}
	}
}
