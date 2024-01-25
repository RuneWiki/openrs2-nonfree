import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!sg", name = "F", descriptor = "[Lclient!fo;")
	public static Class84[] aClass84Array3;

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
	public static int anInt3369 = -1;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIB)V")
	public static void method3017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub1_Sub12 local8 = Static449.method5975(arg1, 16);
		local8.method3043();
		local8.anInt3397 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Z")
	public static boolean method3018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static268.anInt4599; local1++) {
			@Pc(6) Class219 local6 = Static51.aClass219Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt5942 == 1) {
				local15 = local6.anInt5943 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt5936 + (local6.anInt5927 * local15 >> 8);
					local37 = local6.anInt5931 + (local6.anInt5941 * local15 >> 8);
					local47 = local6.anInt5940 + (local6.anInt5928 * local15 >> 8);
					local57 = local6.anInt5937 + (local6.anInt5926 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5942 == 2) {
				local15 = arg0 - local6.anInt5943;
				if (local15 > 0) {
					local27 = local6.anInt5936 + (local6.anInt5927 * local15 >> 8);
					local37 = local6.anInt5931 + (local6.anInt5941 * local15 >> 8);
					local47 = local6.anInt5940 + (local6.anInt5928 * local15 >> 8);
					local57 = local6.anInt5937 + (local6.anInt5926 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5942 == 3) {
				local15 = local6.anInt5936 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt5943 + (local6.anInt5945 * local15 >> 8);
					local37 = local6.anInt5933 + (local6.anInt5930 * local15 >> 8);
					local47 = local6.anInt5940 + (local6.anInt5928 * local15 >> 8);
					local57 = local6.anInt5937 + (local6.anInt5926 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5942 == 4) {
				local15 = arg2 - local6.anInt5936;
				if (local15 > 0) {
					local27 = local6.anInt5943 + (local6.anInt5945 * local15 >> 8);
					local37 = local6.anInt5933 + (local6.anInt5930 * local15 >> 8);
					local47 = local6.anInt5940 + (local6.anInt5928 * local15 >> 8);
					local57 = local6.anInt5937 + (local6.anInt5926 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5942 == 5) {
				local15 = arg1 - local6.anInt5940;
				if (local15 > 0) {
					local27 = local6.anInt5943 + (local6.anInt5945 * local15 >> 8);
					local37 = local6.anInt5933 + (local6.anInt5930 * local15 >> 8);
					local47 = local6.anInt5936 + (local6.anInt5927 * local15 >> 8);
					local57 = local6.anInt5931 + (local6.anInt5941 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
	public static int method3022(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static298.method4374(arg0);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!ta;)V")
	public static void method3025(@OriginalArg(1) Class3_Sub3_Sub6 arg0) {
		arg0.aBoolean452 = false;
		@Pc(18) Class83 local18;
		if (arg0.anInt6735 != -1) {
			local18 = Static244.aClass174_2.method4011(arg0.anInt6735);
			if (local18 == null || local18.anIntArray211 == null) {
				arg0.anInt6735 = -1;
				arg0.aBoolean453 = false;
			} else {
				label394: {
					arg0.anInt6733++;
					if (local18.anIntArray211.length > arg0.anInt6729 && local18.anIntArray212[arg0.anInt6729] < arg0.anInt6733) {
						arg0.anInt6729++;
						arg0.anInt6733 = 1;
						arg0.anInt6738++;
						Static34.method731(local18, arg0.aByte93, arg0.anInt6729, arg0 == Static134.aClass3_Sub3_Sub6_Sub1_1, arg0.anInt6675, arg0.anInt6677);
					}
					if (local18.anIntArray211.length <= arg0.anInt6729) {
						arg0.anInt6733 = 0;
						arg0.anInt6729 = 0;
						if (arg0.aBoolean453) {
							arg0.anInt6735 = arg0.method5511().method4712();
							if (arg0.anInt6735 == -1) {
								arg0.aBoolean453 = false;
								break label394;
							}
							local18 = Static244.aClass174_2.method4011(arg0.anInt6735);
						}
						Static34.method731(local18, arg0.aByte93, arg0.anInt6729, Static134.aClass3_Sub3_Sub6_Sub1_1 == arg0, arg0.anInt6675, arg0.anInt6677);
					}
					arg0.anInt6738 = arg0.anInt6729 + 1;
					if (arg0.anInt6738 >= local18.anIntArray211.length) {
						arg0.anInt6738 = 0;
					}
				}
			}
		}
		@Pc(192) int local192;
		@Pc(206) Class83 local206;
		@Pc(189) Class250 local189;
		if (arg0.anInt6712 != -1 && Static125.anInt2225 >= arg0.anInt6747) {
			local189 = Static93.aClass70_1.method1595(arg0.anInt6712);
			local192 = local189.anInt6999;
			if (local192 == -1) {
				arg0.anInt6712 = -1;
			} else {
				label396: {
					local206 = Static244.aClass174_2.method4011(local192);
					if (local189.aBoolean474) {
						if (local206.anInt1992 == 3) {
							if (arg0.anInt6755 > 0 && Static125.anInt2225 >= arg0.anInt6686 && Static125.anInt2225 > arg0.anInt6700) {
								arg0.anInt6712 = -1;
								break label396;
							}
						} else if (local206.anInt1992 == 1 && arg0.anInt6755 > 0 && arg0.anInt6686 <= Static125.anInt2225 && Static125.anInt2225 > arg0.anInt6700) {
							arg0.anInt6747 = Static125.anInt2225 + 1;
							break label396;
						}
					}
					if (local206 == null || local206.anIntArray211 == null) {
						arg0.anInt6712 = -1;
					} else {
						if (arg0.anInt6717 < 0) {
							arg0.anInt6717 = 0;
							Static34.method731(local206, arg0.aByte93, 0, arg0 == Static134.aClass3_Sub3_Sub6_Sub1_1, arg0.anInt6675, arg0.anInt6677);
						}
						arg0.anInt6724++;
						if (local206.anIntArray211.length > arg0.anInt6717 && arg0.anInt6724 > local206.anIntArray212[arg0.anInt6717]) {
							arg0.anInt6717++;
							arg0.anInt6724 = 1;
							Static34.method731(local206, arg0.aByte93, arg0.anInt6717, Static134.aClass3_Sub3_Sub6_Sub1_1 == arg0, arg0.anInt6675, arg0.anInt6677);
						}
						if (local206.anIntArray211.length <= arg0.anInt6717) {
							if (local189.aBoolean474) {
								arg0.anInt6694++;
								arg0.anInt6717 -= local206.anInt1987;
								if (arg0.anInt6694 >= local206.anInt1985) {
									arg0.anInt6712 = -1;
								} else if (arg0.anInt6717 >= 0 && arg0.anInt6717 < local206.anIntArray211.length) {
									Static34.method731(local206, arg0.aByte93, arg0.anInt6717, Static134.aClass3_Sub3_Sub6_Sub1_1 == arg0, arg0.anInt6675, arg0.anInt6677);
								} else {
									arg0.anInt6712 = -1;
								}
							} else {
								arg0.anInt6712 = -1;
							}
						}
						arg0.anInt6739 = arg0.anInt6717 + 1;
						if (arg0.anInt6739 >= local206.anIntArray211.length) {
							if (local189.aBoolean474) {
								arg0.anInt6739 -= local206.anInt1987;
								if (local206.anInt1985 <= arg0.anInt6694 + 1) {
									arg0.anInt6739 = -1;
								} else if (arg0.anInt6739 < 0 || local206.anIntArray211.length <= arg0.anInt6739) {
									arg0.anInt6739 = -1;
								}
							} else {
								arg0.anInt6739 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6710 != -1 && Static125.anInt2225 >= arg0.anInt6708) {
			local189 = Static93.aClass70_1.method1595(arg0.anInt6710);
			local192 = local189.anInt6999;
			if (local192 == -1) {
				arg0.anInt6710 = -1;
			} else {
				label399: {
					local206 = Static244.aClass174_2.method4011(local192);
					if (local189.aBoolean474) {
						if (local206.anInt1992 == 3) {
							if (arg0.anInt6755 > 0 && Static125.anInt2225 >= arg0.anInt6686 && Static125.anInt2225 > arg0.anInt6700) {
								arg0.anInt6710 = -1;
								break label399;
							}
						} else if (local206.anInt1992 == 1 && arg0.anInt6755 > 0 && arg0.anInt6686 <= Static125.anInt2225 && arg0.anInt6700 < Static125.anInt2225) {
							arg0.anInt6708 = Static125.anInt2225 + 1;
							break label399;
						}
					}
					if (local206 == null || local206.anIntArray211 == null) {
						arg0.anInt6710 = -1;
					} else {
						if (arg0.anInt6680 < 0) {
							arg0.anInt6680 = 0;
							Static34.method731(local206, arg0.aByte93, 0, arg0 == Static134.aClass3_Sub3_Sub6_Sub1_1, arg0.anInt6675, arg0.anInt6677);
						}
						arg0.anInt6715++;
						if (arg0.anInt6680 < local206.anIntArray211.length && arg0.anInt6715 > local206.anIntArray212[arg0.anInt6680]) {
							arg0.anInt6680++;
							arg0.anInt6715 = 1;
							Static34.method731(local206, arg0.aByte93, arg0.anInt6680, arg0 == Static134.aClass3_Sub3_Sub6_Sub1_1, arg0.anInt6675, arg0.anInt6677);
						}
						if (arg0.anInt6680 >= local206.anIntArray211.length) {
							if (local189.aBoolean474) {
								arg0.anInt6680 -= local206.anInt1987;
								arg0.anInt6702++;
								if (local206.anInt1985 <= arg0.anInt6702) {
									arg0.anInt6710 = -1;
								} else if (arg0.anInt6680 >= 0 && arg0.anInt6680 < local206.anIntArray211.length) {
									Static34.method731(local206, arg0.aByte93, arg0.anInt6680, arg0 == Static134.aClass3_Sub3_Sub6_Sub1_1, arg0.anInt6675, arg0.anInt6677);
								} else {
									arg0.anInt6710 = -1;
								}
							} else {
								arg0.anInt6710 = -1;
							}
						}
						arg0.anInt6705 = arg0.anInt6680 + 1;
						if (local206.anIntArray211.length <= arg0.anInt6705) {
							if (local189.aBoolean474) {
								arg0.anInt6705 -= local206.anInt1987;
								if (local206.anInt1985 <= arg0.anInt6702 + 1) {
									arg0.anInt6705 = -1;
								} else if (arg0.anInt6705 < 0 || arg0.anInt6705 >= local206.anIntArray211.length) {
									arg0.anInt6705 = -1;
								}
							} else {
								arg0.anInt6705 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6713 != -1 && arg0.anInt6725 <= 1) {
			local18 = Static244.aClass174_2.method4011(arg0.anInt6713);
			if (local18.anInt1992 == 3) {
				if (arg0.anInt6755 > 0 && arg0.anInt6686 <= Static125.anInt2225 && arg0.anInt6700 < Static125.anInt2225) {
					arg0.anInt6713 = -1;
				}
			} else if (local18.anInt1992 == 1 && arg0.anInt6755 > 0 && arg0.anInt6686 <= Static125.anInt2225 && Static125.anInt2225 > arg0.anInt6700) {
				arg0.anInt6725 = 2;
			}
		}
		if (arg0.anInt6713 != -1 && arg0.anInt6725 == 0) {
			local18 = Static244.aClass174_2.method4011(arg0.anInt6713);
			if (local18 == null || local18.anIntArray211 == null) {
				arg0.anInt6713 = -1;
			} else {
				arg0.anInt6723++;
				if (arg0.anInt6683 < local18.anIntArray211.length && local18.anIntArray212[arg0.anInt6683] < arg0.anInt6723) {
					arg0.anInt6723 = 1;
					arg0.anInt6683++;
					Static34.method731(local18, arg0.aByte93, arg0.anInt6683, arg0 == Static134.aClass3_Sub3_Sub6_Sub1_1, arg0.anInt6675, arg0.anInt6677);
				}
				if (local18.anIntArray211.length <= arg0.anInt6683) {
					arg0.anInt6728++;
					arg0.anInt6683 -= local18.anInt1987;
					if (arg0.anInt6728 >= local18.anInt1985) {
						arg0.anInt6713 = -1;
					} else if (arg0.anInt6683 >= 0 && arg0.anInt6683 < local18.anIntArray211.length) {
						Static34.method731(local18, arg0.aByte93, arg0.anInt6683, Static134.aClass3_Sub3_Sub6_Sub1_1 == arg0, arg0.anInt6675, arg0.anInt6677);
					} else {
						arg0.anInt6713 = -1;
					}
				}
				arg0.anInt6692 = arg0.anInt6683 + 1;
				if (local18.anIntArray211.length <= arg0.anInt6692) {
					arg0.anInt6692 -= local18.anInt1987;
					if (arg0.anInt6728 + 1 >= local18.anInt1985) {
						arg0.anInt6692 = -1;
					} else if (arg0.anInt6692 < 0 || local18.anIntArray211.length <= arg0.anInt6692) {
						arg0.anInt6692 = -1;
					}
				}
				arg0.aBoolean452 = local18.aBoolean154;
			}
		}
		if (arg0.anInt6725 > 0) {
			arg0.anInt6725--;
		}
		for (@Pc(1070) int local1070 = 0; local1070 < arg0.aClass38Array3.length; local1070++) {
			@Pc(1077) Class38 local1077 = arg0.aClass38Array3[local1070];
			if (local1077 != null) {
				if (local1077.anInt921 > 0) {
					local1077.anInt921--;
				} else {
					local206 = Static244.aClass174_2.method4011(local1077.anInt918);
					if (local206 == null || local206.anIntArray211 == null) {
						arg0.aClass38Array3[local1070] = null;
					} else {
						local1077.anInt920++;
						if (local206.anIntArray211.length > local1077.anInt922 && local1077.anInt920 > local206.anIntArray212[local1077.anInt922]) {
							local1077.anInt920 = 1;
							local1077.anInt922++;
							Static34.method731(local206, arg0.aByte93, local1077.anInt922, Static134.aClass3_Sub3_Sub6_Sub1_1 == arg0, arg0.anInt6675, arg0.anInt6677);
						}
						if (local206.anIntArray211.length <= local1077.anInt922) {
							local1077.anInt922 -= local206.anInt1987;
							local1077.anInt919++;
							if (local1077.anInt919 >= local206.anInt1985) {
								arg0.aClass38Array3[local1070] = null;
							} else if (local1077.anInt922 >= 0 && local1077.anInt922 < local206.anIntArray211.length) {
								Static34.method731(local206, arg0.aByte93, local1077.anInt922, Static134.aClass3_Sub3_Sub6_Sub1_1 == arg0, arg0.anInt6675, arg0.anInt6677);
							} else {
								arg0.aClass38Array3[local1070] = null;
							}
						}
						local1077.anInt916 = local1077.anInt922 + 1;
						if (local206.anIntArray211.length <= local1077.anInt916) {
							local1077.anInt916 -= local206.anInt1987;
							if (local1077.anInt919 + 1 >= local206.anInt1985) {
								local1077.anInt916 = -1;
							} else if (local1077.anInt916 < 0 || local206.anIntArray211.length <= local1077.anInt916) {
								local1077.anInt916 = -1;
							}
						}
					}
				}
			}
		}
	}
}
