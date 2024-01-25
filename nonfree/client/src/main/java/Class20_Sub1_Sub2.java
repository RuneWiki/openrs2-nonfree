import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class20_Sub1_Sub2 extends Class20_Sub1 {

	@OriginalMember(owner = "client!kaa", name = "E", descriptor = "[I")
	public final int[] anIntArray407;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lclient!pm;[III)V")
	public Class20_Sub1_Sub2(@OriginalArg(0) Class137_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anIntArray407 = arg1;
	}

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lclient!pm;II)V")
	public Class20_Sub1_Sub2(@OriginalArg(0) Class137_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg1, arg2);
		this.anIntArray407 = new int[arg1 * arg2];
	}

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lclient!pm;[IIIIIZ)V")
	public Class20_Sub1_Sub2(@OriginalArg(0) Class137_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg4, arg5);
		if (arg6) {
			this.anIntArray407 = new int[arg4 * arg5];
		} else {
			this.anIntArray407 = arg1;
		}
		@Pc(21) int local21 = arg3 - super.anInt7883;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg5; local25++) {
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(34) int local34 = arg1[arg2++];
				if (local34 >>> 24 == 255) {
					this.anIntArray407[local23++] = (local34 & 0xFFFFFF) == 0 ? -16777215 : local34;
				} else {
					this.anIntArray407[local23++] = 0;
				}
			}
			arg2 += local21;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(II)V")
	@Override
	protected void method6541(@OriginalArg(0) int arg0) {
		@Pc(3) int[] local3 = super.aClass137_Sub2_10.anIntArray612;
		@Pc(852) int local852;
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(18) int local18;
		@Pc(48) int local48;
		@Pc(51) int local51;
		@Pc(209) int local209;
		@Pc(234) int local234;
		@Pc(238) int local238;
		@Pc(242) int local242;
		@Pc(314) int local314;
		if (Static463.anInt7896 == 0) {
			if (Static463.anInt7893 == 0) {
				local9 = Static463.anInt7892;
				while (local9 < 0) {
					local12 = Static463.anInt7894;
					local14 = Static463.anInt7898;
					local16 = Static463.anInt7888;
					local18 = Static463.anInt7909;
					if (local14 >= 0 && local16 >= 0 && local14 - (super.anInt7883 << 12) < 0 && local16 - (super.anInt7886 << 12) < 0) {
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt7883 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray407[local48];
								if (local209 != 0) {
									local3[local51] = local209;
								}
							} else if (arg0 == 0) {
								local209 = this.anIntArray407[local48];
								if (local209 != 0) {
									if ((Static463.anInt7882 & 0xFFFFFF) == 16777215) {
										local234 = Static463.anInt7882 >>> 24;
										local238 = 256 - local234;
										local242 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
									} else if (Static463.anInt7907 == 255) {
										local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
										local3[local51] = (local234 | local238 | local242) >>> 8;
									} else {
										local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
										local209 = (local234 | local238 | local242) >>> 8;
										local314 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray407[local48];
								local234 = Static463.anInt7882;
								local238 = local209 + local234;
								local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
								local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
								local314 = local238 - local314 | local314 - (local314 >>> 8);
								if (local209 == 0 && Static463.anInt7907 != 255) {
									local209 = local314;
									local314 = local3[local51];
									local314 = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
								}
								local3[local51] = local314;
							} else if (arg0 == 2) {
								local209 = this.anIntArray407[local48];
								if (local209 != 0) {
									local234 = (local209 & 0xFF00FF) * Static463.anInt7907 & 0xFF00FF00;
									local238 = (local209 & 0xFF00) * Static463.anInt7907 & 0xFF0000;
									local3[local51++] = ((local234 | local238) >>> 8) + Static463.anInt7902;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local18++;
						}
					}
					local9++;
					Static463.anInt7894 += Static463.anInt7889;
				}
			} else if (Static463.anInt7893 < 0) {
				local9 = Static463.anInt7892;
				while (local9 < 0) {
					local12 = Static463.anInt7894;
					local14 = Static463.anInt7898;
					local16 = Static463.anInt7888 + Static463.anInt7905;
					local18 = Static463.anInt7909;
					if (local14 >= 0 && local14 - (super.anInt7883 << 12) < 0) {
						@Pc(845) int local845;
						if ((local845 = local16 - (super.anInt7886 << 12)) >= 0) {
							local852 = (Static463.anInt7893 - local845) / Static463.anInt7893;
							local18 += local852;
							local16 += Static463.anInt7893 * local852;
							local12 += local852;
						}
						@Pc(873) int local873;
						if ((local873 = (local16 - Static463.anInt7893) / Static463.anInt7893) > local18) {
							local18 = local873;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt7883 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray407[local48];
								if (local209 != 0) {
									local3[local51] = local209;
								}
							} else if (arg0 == 0) {
								local209 = this.anIntArray407[local48];
								if (local209 != 0) {
									if ((Static463.anInt7882 & 0xFFFFFF) == 16777215) {
										local234 = Static463.anInt7882 >>> 24;
										local238 = 256 - local234;
										local242 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
									} else if (Static463.anInt7907 == 255) {
										local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
										local3[local51] = (local234 | local238 | local242) >>> 8;
									} else {
										local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
										local209 = (local234 | local238 | local242) >>> 8;
										local314 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray407[local48];
								local234 = Static463.anInt7882;
								local238 = local209 + local234;
								local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
								local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
								local314 = local238 - local314 | local314 - (local314 >>> 8);
								if (local209 == 0 && Static463.anInt7907 != 255) {
									local209 = local314;
									local314 = local3[local51];
									local314 = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
								}
								local3[local51] = local314;
							} else if (arg0 == 2) {
								local209 = this.anIntArray407[local48];
								if (local209 != 0) {
									local234 = (local209 & 0xFF00FF) * Static463.anInt7907 & 0xFF00FF00;
									local238 = (local209 & 0xFF00) * Static463.anInt7907 & 0xFF0000;
									local3[local51++] = ((local234 | local238) >>> 8) + Static463.anInt7902;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static463.anInt7893;
							local18++;
						}
					}
					local9++;
					Static463.anInt7898 += Static463.anInt7884;
					Static463.anInt7894 += Static463.anInt7889;
				}
			} else {
				local9 = Static463.anInt7892;
				while (local9 < 0) {
					local12 = Static463.anInt7894;
					local14 = Static463.anInt7898;
					local16 = Static463.anInt7888 + Static463.anInt7905;
					local18 = Static463.anInt7909;
					if (local14 >= 0 && local14 - (super.anInt7883 << 12) < 0) {
						if (local16 < 0) {
							local852 = (Static463.anInt7893 - local16 - 1) / Static463.anInt7893;
							local18 += local852;
							local16 += Static463.anInt7893 * local852;
							local12 += local852;
						}
						@Pc(1722) int local1722;
						if ((local1722 = (local16 + 1 - (super.anInt7886 << 12) - Static463.anInt7893) / Static463.anInt7893) > local18) {
							local18 = local1722;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt7883 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray407[local48];
								if (local209 != 0) {
									local3[local51] = local209;
								}
							} else if (arg0 == 0) {
								local209 = this.anIntArray407[local48];
								if (local209 != 0) {
									if ((Static463.anInt7882 & 0xFFFFFF) == 16777215) {
										local234 = Static463.anInt7882 >>> 24;
										local238 = 256 - local234;
										local242 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
									} else if (Static463.anInt7907 == 255) {
										local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
										local3[local51] = (local234 | local238 | local242) >>> 8;
									} else {
										local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
										local209 = (local234 | local238 | local242) >>> 8;
										local314 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray407[local48];
								local234 = Static463.anInt7882;
								local238 = local209 + local234;
								local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
								local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
								local314 = local238 - local314 | local314 - (local314 >>> 8);
								if (local209 == 0 && Static463.anInt7907 != 255) {
									local209 = local314;
									local314 = local3[local51];
									local314 = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
								}
								local3[local51] = local314;
							} else if (arg0 == 2) {
								local209 = this.anIntArray407[local48];
								if (local209 != 0) {
									local234 = (local209 & 0xFF00FF) * Static463.anInt7907 & 0xFF00FF00;
									local238 = (local209 & 0xFF00) * Static463.anInt7907 & 0xFF0000;
									local3[local51++] = ((local234 | local238) >>> 8) + Static463.anInt7902;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static463.anInt7893;
							local18++;
						}
					}
					local9++;
					Static463.anInt7898 += Static463.anInt7884;
					Static463.anInt7894 += Static463.anInt7889;
				}
			}
		} else if (Static463.anInt7896 < 0) {
			if (Static463.anInt7893 == 0) {
				local9 = Static463.anInt7892;
				while (local9 < 0) {
					local12 = Static463.anInt7894;
					local14 = Static463.anInt7898 + Static463.anInt7897;
					local16 = Static463.anInt7888;
					local18 = Static463.anInt7909;
					if (local16 >= 0 && local16 - (super.anInt7886 << 12) < 0) {
						@Pc(2545) int local2545;
						if ((local2545 = local14 - (super.anInt7883 << 12)) >= 0) {
							local852 = (Static463.anInt7896 - local2545) / Static463.anInt7896;
							local18 += local852;
							local14 += Static463.anInt7896 * local852;
							local12 += local852;
						}
						@Pc(2573) int local2573;
						if ((local2573 = (local14 - Static463.anInt7896) / Static463.anInt7896) > local18) {
							local18 = local2573;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt7883 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 1) {
								local209 = this.anIntArray407[local48];
								if (local209 != 0) {
									local3[local51] = local209;
								}
							} else if (arg0 == 0) {
								local209 = this.anIntArray407[local48];
								if (local209 != 0) {
									if ((Static463.anInt7882 & 0xFFFFFF) == 16777215) {
										local234 = Static463.anInt7882 >>> 24;
										local238 = 256 - local234;
										local242 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
									} else if (Static463.anInt7907 == 255) {
										local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
										local3[local51] = (local234 | local238 | local242) >>> 8;
									} else {
										local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
										local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
										local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
										local209 = (local234 | local238 | local242) >>> 8;
										local314 = local3[local51];
										local3[local51] = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 3) {
								local209 = this.anIntArray407[local48];
								local234 = Static463.anInt7882;
								local238 = local209 + local234;
								local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
								local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
								local314 = local238 - local314 | local314 - (local314 >>> 8);
								if (local209 == 0 && Static463.anInt7907 != 255) {
									local209 = local314;
									local314 = local3[local51];
									local314 = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
								}
								local3[local51] = local314;
							} else if (arg0 == 2) {
								local209 = this.anIntArray407[local48];
								if (local209 != 0) {
									local234 = (local209 & 0xFF00FF) * Static463.anInt7907 & 0xFF00FF00;
									local238 = (local209 & 0xFF00) * Static463.anInt7907 & 0xFF0000;
									local3[local51++] = ((local234 | local238) >>> 8) + Static463.anInt7902;
								}
							} else {
								throw new IllegalArgumentException();
							}
							local14 += Static463.anInt7896;
							local18++;
						}
					}
					local9++;
					Static463.anInt7888 += Static463.anInt7881;
					Static463.anInt7894 += Static463.anInt7889;
				}
			} else if (Static463.anInt7893 < 0) {
				local9 = Static463.anInt7892;
				while (local9 < 0) {
					local12 = Static463.anInt7894;
					local14 = Static463.anInt7898 + Static463.anInt7897;
					local16 = Static463.anInt7888 + Static463.anInt7905;
					local18 = Static463.anInt7909;
					@Pc(3387) int local3387;
					if ((local3387 = local14 - (super.anInt7883 << 12)) >= 0) {
						local852 = (Static463.anInt7896 - local3387) / Static463.anInt7896;
						local18 += local852;
						local14 += Static463.anInt7896 * local852;
						local16 += Static463.anInt7893 * local852;
						local12 += local852;
					}
					@Pc(3421) int local3421;
					if ((local3421 = (local14 - Static463.anInt7896) / Static463.anInt7896) > local18) {
						local18 = local3421;
					}
					@Pc(3433) int local3433;
					if ((local3433 = local16 - (super.anInt7886 << 12)) >= 0) {
						local852 = (Static463.anInt7893 - local3433) / Static463.anInt7893;
						local18 += local852;
						local14 += Static463.anInt7896 * local852;
						local16 += Static463.anInt7893 * local852;
						local12 += local852;
					}
					@Pc(3467) int local3467;
					if ((local3467 = (local16 - Static463.anInt7893) / Static463.anInt7893) > local18) {
						local18 = local3467;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt7883 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local209 = this.anIntArray407[local48];
							if (local209 != 0) {
								local3[local51] = local209;
							}
						} else if (arg0 == 0) {
							local209 = this.anIntArray407[local48];
							if (local209 != 0) {
								if ((Static463.anInt7882 & 0xFFFFFF) == 16777215) {
									local234 = Static463.anInt7882 >>> 24;
									local238 = 256 - local234;
									local242 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
								} else if (Static463.anInt7907 == 255) {
									local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
									local3[local51] = (local234 | local238 | local242) >>> 8;
								} else {
									local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
									local209 = (local234 | local238 | local242) >>> 8;
									local314 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local209 = this.anIntArray407[local48];
							local234 = Static463.anInt7882;
							local238 = local209 + local234;
							local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
							local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
							local314 = local238 - local314 | local314 - (local314 >>> 8);
							if (local209 == 0 && Static463.anInt7907 != 255) {
								local209 = local314;
								local314 = local3[local51];
								local314 = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
							}
							local3[local51] = local314;
						} else if (arg0 == 2) {
							local209 = this.anIntArray407[local48];
							if (local209 != 0) {
								local234 = (local209 & 0xFF00FF) * Static463.anInt7907 & 0xFF00FF00;
								local238 = (local209 & 0xFF00) * Static463.anInt7907 & 0xFF0000;
								local3[local51++] = ((local234 | local238) >>> 8) + Static463.anInt7902;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static463.anInt7896;
						local16 += Static463.anInt7893;
						local18++;
					}
					local9++;
					Static463.anInt7898 += Static463.anInt7884;
					Static463.anInt7888 += Static463.anInt7881;
					Static463.anInt7894 += Static463.anInt7889;
				}
			} else {
				local9 = Static463.anInt7892;
				while (local9 < 0) {
					local12 = Static463.anInt7894;
					local14 = Static463.anInt7898 + Static463.anInt7897;
					local16 = Static463.anInt7888 + Static463.anInt7905;
					local18 = Static463.anInt7909;
					@Pc(4287) int local4287;
					if ((local4287 = local14 - (super.anInt7883 << 12)) >= 0) {
						local852 = (Static463.anInt7896 - local4287) / Static463.anInt7896;
						local18 += local852;
						local14 += Static463.anInt7896 * local852;
						local16 += Static463.anInt7893 * local852;
						local12 += local852;
					}
					@Pc(4321) int local4321;
					if ((local4321 = (local14 - Static463.anInt7896) / Static463.anInt7896) > local18) {
						local18 = local4321;
					}
					if (local16 < 0) {
						local852 = (Static463.anInt7893 - local16 - 1) / Static463.anInt7893;
						local18 += local852;
						local14 += Static463.anInt7896 * local852;
						local16 += Static463.anInt7893 * local852;
						local12 += local852;
					}
					@Pc(4369) int local4369;
					if ((local4369 = (local16 + 1 - (super.anInt7886 << 12) - Static463.anInt7893) / Static463.anInt7893) > local18) {
						local18 = local4369;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt7883 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local209 = this.anIntArray407[local48];
							if (local209 != 0) {
								local3[local51] = local209;
							}
						} else if (arg0 == 0) {
							local209 = this.anIntArray407[local48];
							if (local209 != 0) {
								if ((Static463.anInt7882 & 0xFFFFFF) == 16777215) {
									local234 = Static463.anInt7882 >>> 24;
									local238 = 256 - local234;
									local242 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
								} else if (Static463.anInt7907 == 255) {
									local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
									local3[local51] = (local234 | local238 | local242) >>> 8;
								} else {
									local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
									local209 = (local234 | local238 | local242) >>> 8;
									local314 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local209 = this.anIntArray407[local48];
							local234 = Static463.anInt7882;
							local238 = local209 + local234;
							local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
							local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
							local314 = local238 - local314 | local314 - (local314 >>> 8);
							if (local209 == 0 && Static463.anInt7907 != 255) {
								local209 = local314;
								local314 = local3[local51];
								local314 = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
							}
							local3[local51] = local314;
						} else if (arg0 == 2) {
							local209 = this.anIntArray407[local48];
							if (local209 != 0) {
								local234 = (local209 & 0xFF00FF) * Static463.anInt7907 & 0xFF00FF00;
								local238 = (local209 & 0xFF00) * Static463.anInt7907 & 0xFF0000;
								local3[local51++] = ((local234 | local238) >>> 8) + Static463.anInt7902;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static463.anInt7896;
						local16 += Static463.anInt7893;
						local18++;
					}
					local9++;
					Static463.anInt7898 += Static463.anInt7884;
					Static463.anInt7888 += Static463.anInt7881;
					Static463.anInt7894 += Static463.anInt7889;
				}
			}
		} else if (Static463.anInt7893 == 0) {
			local9 = Static463.anInt7892;
			while (local9 < 0) {
				local12 = Static463.anInt7894;
				local14 = Static463.anInt7898 + Static463.anInt7897;
				local16 = Static463.anInt7888;
				local18 = Static463.anInt7909;
				if (local16 >= 0 && local16 - (super.anInt7886 << 12) < 0) {
					if (local14 < 0) {
						local852 = (Static463.anInt7896 - local14 - 1) / Static463.anInt7896;
						local18 += local852;
						local14 += Static463.anInt7896 * local852;
						local12 += local852;
					}
					@Pc(5228) int local5228;
					if ((local5228 = (local14 + 1 - (super.anInt7883 << 12) - Static463.anInt7896) / Static463.anInt7896) > local18) {
						local18 = local5228;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt7883 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 1) {
							local209 = this.anIntArray407[local48];
							if (local209 != 0) {
								local3[local51] = local209;
							}
						} else if (arg0 == 0) {
							local209 = this.anIntArray407[local48];
							if (local209 != 0) {
								if ((Static463.anInt7882 & 0xFFFFFF) == 16777215) {
									local234 = Static463.anInt7882 >>> 24;
									local238 = 256 - local234;
									local242 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
								} else if (Static463.anInt7907 == 255) {
									local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
									local3[local51] = (local234 | local238 | local242) >>> 8;
								} else {
									local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
									local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
									local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
									local209 = (local234 | local238 | local242) >>> 8;
									local314 = local3[local51];
									local3[local51] = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 3) {
							local209 = this.anIntArray407[local48];
							local234 = Static463.anInt7882;
							local238 = local209 + local234;
							local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
							local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
							local314 = local238 - local314 | local314 - (local314 >>> 8);
							if (local209 == 0 && Static463.anInt7907 != 255) {
								local209 = local314;
								local314 = local3[local51];
								local314 = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
							}
							local3[local51] = local314;
						} else if (arg0 == 2) {
							local209 = this.anIntArray407[local48];
							if (local209 != 0) {
								local234 = (local209 & 0xFF00FF) * Static463.anInt7907 & 0xFF00FF00;
								local238 = (local209 & 0xFF00) * Static463.anInt7907 & 0xFF0000;
								local3[local51++] = ((local234 | local238) >>> 8) + Static463.anInt7902;
							}
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static463.anInt7896;
						local18++;
					}
				}
				local9++;
				Static463.anInt7898 += Static463.anInt7884;
				Static463.anInt7888 += Static463.anInt7881;
				Static463.anInt7894 += Static463.anInt7889;
			}
		} else if (Static463.anInt7893 < 0) {
			for (local9 = Static463.anInt7892; local9 < 0; local9++) {
				local12 = Static463.anInt7894;
				local14 = Static463.anInt7898 + Static463.anInt7897;
				local16 = Static463.anInt7888 + Static463.anInt7905;
				local18 = Static463.anInt7909;
				if (local14 < 0) {
					local852 = (Static463.anInt7896 - local14 - 1) / Static463.anInt7896;
					local18 += local852;
					local14 += Static463.anInt7896 * local852;
					local16 += Static463.anInt7893 * local852;
					local12 += local852;
				}
				@Pc(6082) int local6082;
				if ((local6082 = (local14 + 1 - (super.anInt7883 << 12) - Static463.anInt7896) / Static463.anInt7896) > local18) {
					local18 = local6082;
				}
				@Pc(6094) int local6094;
				if ((local6094 = local16 - (super.anInt7886 << 12)) >= 0) {
					local852 = (Static463.anInt7893 - local6094) / Static463.anInt7893;
					local18 += local852;
					local14 += Static463.anInt7896 * local852;
					local16 += Static463.anInt7893 * local852;
					local12 += local852;
				}
				@Pc(6128) int local6128;
				if ((local6128 = (local16 - Static463.anInt7893) / Static463.anInt7893) > local18) {
					local18 = local6128;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt7883 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 1) {
						local209 = this.anIntArray407[local48];
						if (local209 != 0) {
							local3[local51] = local209;
						}
					} else if (arg0 == 0) {
						local209 = this.anIntArray407[local48];
						if (local209 != 0) {
							if ((Static463.anInt7882 & 0xFFFFFF) == 16777215) {
								local234 = Static463.anInt7882 >>> 24;
								local238 = 256 - local234;
								local242 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
							} else if (Static463.anInt7907 == 255) {
								local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
								local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
								local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
								local3[local51] = (local234 | local238 | local242) >>> 8;
							} else {
								local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
								local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
								local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
								local209 = (local234 | local238 | local242) >>> 8;
								local314 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local209 = this.anIntArray407[local48];
						local234 = Static463.anInt7882;
						local238 = local209 + local234;
						local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
						local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
						local314 = local238 - local314 | local314 - (local314 >>> 8);
						if (local209 == 0 && Static463.anInt7907 != 255) {
							local209 = local314;
							local314 = local3[local51];
							local314 = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
						}
						local3[local51] = local314;
					} else if (arg0 == 2) {
						local209 = this.anIntArray407[local48];
						if (local209 != 0) {
							local234 = (local209 & 0xFF00FF) * Static463.anInt7907 & 0xFF00FF00;
							local238 = (local209 & 0xFF00) * Static463.anInt7907 & 0xFF0000;
							local3[local51++] = ((local234 | local238) >>> 8) + Static463.anInt7902;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static463.anInt7896;
					local16 += Static463.anInt7893;
					local18++;
				}
				Static463.anInt7898 += Static463.anInt7884;
				Static463.anInt7888 += Static463.anInt7881;
				Static463.anInt7894 += Static463.anInt7889;
			}
		} else {
			for (local9 = Static463.anInt7892; local9 < 0; local9++) {
				local12 = Static463.anInt7894;
				local14 = Static463.anInt7898 + Static463.anInt7897;
				local16 = Static463.anInt7888 + Static463.anInt7905;
				local18 = Static463.anInt7909;
				if (local14 < 0) {
					local852 = (Static463.anInt7896 - local14 - 1) / Static463.anInt7896;
					local18 += local852;
					local14 += Static463.anInt7896 * local852;
					local16 += Static463.anInt7893 * local852;
					local12 += local852;
				}
				@Pc(6984) int local6984;
				if ((local6984 = (local14 + 1 - (super.anInt7883 << 12) - Static463.anInt7896) / Static463.anInt7896) > local18) {
					local18 = local6984;
				}
				if (local16 < 0) {
					local852 = (Static463.anInt7893 - local16 - 1) / Static463.anInt7893;
					local18 += local852;
					local14 += Static463.anInt7896 * local852;
					local16 += Static463.anInt7893 * local852;
					local12 += local852;
				}
				@Pc(7032) int local7032;
				if ((local7032 = (local16 + 1 - (super.anInt7886 << 12) - Static463.anInt7893) / Static463.anInt7893) > local18) {
					local18 = local7032;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt7883 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 1) {
						local209 = this.anIntArray407[local48];
						if (local209 != 0) {
							local3[local51] = local209;
						}
					} else if (arg0 == 0) {
						local209 = this.anIntArray407[local48];
						if (local209 != 0) {
							if ((Static463.anInt7882 & 0xFFFFFF) == 16777215) {
								local234 = Static463.anInt7882 >>> 24;
								local238 = 256 - local234;
								local242 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * local234 + (local242 & 0xFF00FF) * local238 & 0xFF00FF00) + ((local209 & 0xFF00) * local234 + (local242 & 0xFF00) * local238 & 0xFF0000) >> 8;
							} else if (Static463.anInt7907 == 255) {
								local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
								local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
								local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
								local3[local51] = (local234 | local238 | local242) >>> 8;
							} else {
								local234 = (local209 & 0xFF0000) * Static463.anInt7910 & 0xFF000000;
								local238 = (local209 & 0xFF00) * Static463.anInt7904 & 0xFF0000;
								local242 = (local209 & 0xFF) * Static463.anInt7906 & 0xFF00;
								local209 = (local234 | local238 | local242) >>> 8;
								local314 = local3[local51];
								local3[local51] = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 3) {
						local209 = this.anIntArray407[local48];
						local234 = Static463.anInt7882;
						local238 = local209 + local234;
						local242 = (local209 & 0xFF00FF) + (local234 & 0xFF00FF);
						local314 = (local242 & 0x1000100) + (local238 - local242 & 0x10000);
						local314 = local238 - local314 | local314 - (local314 >>> 8);
						if (local209 == 0 && Static463.anInt7907 != 255) {
							local209 = local314;
							local314 = local3[local51];
							local314 = ((local209 & 0xFF00FF) * Static463.anInt7907 + (local314 & 0xFF00FF) * Static463.anInt7891 & 0xFF00FF00) + ((local209 & 0xFF00) * Static463.anInt7907 + (local314 & 0xFF00) * Static463.anInt7891 & 0xFF0000) >> 8;
						}
						local3[local51] = local314;
					} else if (arg0 == 2) {
						local209 = this.anIntArray407[local48];
						if (local209 != 0) {
							local234 = (local209 & 0xFF00FF) * Static463.anInt7907 & 0xFF00FF00;
							local238 = (local209 & 0xFF00) * Static463.anInt7907 & 0xFF0000;
							local3[local51++] = ((local234 | local238) >>> 8) + Static463.anInt7902;
						}
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static463.anInt7896;
					local16 += Static463.anInt7893;
					local18++;
				}
				Static463.anInt7898 += Static463.anInt7884;
				Static463.anInt7888 += Static463.anInt7881;
				Static463.anInt7894 += Static463.anInt7889;
			}
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass137_Sub2_10.method6715()) {
			throw new IllegalStateException();
		}
		arg0 += super.anInt7887;
		arg1 += super.anInt7903;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = super.aClass137_Sub2_10.anInt8058;
		@Pc(26) int local26 = super.anInt7883;
		@Pc(29) int local29 = super.anInt7886;
		@Pc(33) int local33 = local23 - local26;
		@Pc(35) int local35 = 0;
		@Pc(41) int local41 = arg0 + arg1 * local23;
		@Pc(52) int local52;
		if (arg1 < super.aClass137_Sub2_10.anInt8047) {
			local52 = super.aClass137_Sub2_10.anInt8047 - arg1;
			local29 -= local52;
			arg1 = super.aClass137_Sub2_10.anInt8047;
			local19 = local52 * local26;
			local41 += local52 * local23;
		}
		if (arg1 + local29 > super.aClass137_Sub2_10.anInt8044) {
			local29 -= arg1 + local29 - super.aClass137_Sub2_10.anInt8044;
		}
		if (arg0 < super.aClass137_Sub2_10.anInt8067) {
			local52 = super.aClass137_Sub2_10.anInt8067 - arg0;
			local26 -= local52;
			arg0 = super.aClass137_Sub2_10.anInt8067;
			local19 += local52;
			local41 += local52;
			local35 = local52;
			local33 += local52;
		}
		if (arg0 + local26 > super.aClass137_Sub2_10.anInt8066) {
			local52 = arg0 + local26 - super.aClass137_Sub2_10.anInt8066;
			local26 -= local52;
			local35 += local52;
			local33 += local52;
		}
		if (local26 <= 0 || local29 <= 0) {
			return;
		}
		@Pc(159) Class1_Sub2 local159 = (Class1_Sub2) arg2;
		@Pc(162) int[] local162 = local159.anIntArray500;
		@Pc(165) int[] local165 = local159.anIntArray499;
		@Pc(169) int[] local169 = super.aClass137_Sub2_10.anIntArray612;
		@Pc(171) int local171 = arg1;
		if (arg4 > arg1) {
			local171 = arg4;
			local41 += (arg4 - arg1) * local23;
			local19 += (arg4 - arg1) * super.anInt7883;
		}
		@Pc(210) int local210 = arg4 + local162.length < arg1 + local29 ? arg4 + local162.length : arg1 + local29;
		for (@Pc(212) int local212 = local171; local212 < local210; local212++) {
			@Pc(221) int local221 = local162[local212 - arg4] + arg3;
			@Pc(227) int local227 = local165[local212 - arg4];
			@Pc(229) int local229 = local26;
			@Pc(236) int local236;
			if (arg0 > local221) {
				local236 = arg0 - local221;
				if (local236 >= local227) {
					local19 += local26 + local35;
					local41 += local26 + local33;
					continue;
				}
				local227 -= local236;
			} else {
				local236 = local221 - arg0;
				if (local236 >= local26) {
					local19 += local26 + local35;
					local41 += local26 + local33;
					continue;
				}
				local19 += local236;
				local229 = local26 - local236;
				local41 += local236;
			}
			local236 = 0;
			if (local229 < local227) {
				local227 = local229;
			} else {
				local236 = local229 - local227;
			}
			for (@Pc(304) int local304 = -local227; local304 < 0; local304++) {
				@Pc(311) int local311 = this.anIntArray407[local19++];
				if (local311 == 0) {
					local41++;
				} else {
					local169[local41++] = local311;
				}
			}
			local19 += local236 + local35;
			local41 += local236 + local33;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int[] local3 = super.aClass137_Sub2_10.anIntArray612;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(15) int local15 = (arg1 + local5) * super.anInt7883 + arg0;
			@Pc(25) int local25 = (arg5 + local5) * super.aClass137_Sub2_10.anInt8058 + arg4;
			for (@Pc(27) int local27 = 0; local27 < arg2; local27++) {
				this.anIntArray407[local15 + local27] = local3[local25 + local27];
			}
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (super.aClass137_Sub2_10.method6715()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(20) int local20 = super.aClass137_Sub2_10.anInt8058;
			@Pc(29) int local29 = super.anInt7887 + super.anInt7883 + super.anInt7900;
			@Pc(38) int local38 = super.anInt7903 + super.anInt7886 + super.anInt7890;
			@Pc(44) int local44 = (local29 << 16) / arg2;
			@Pc(50) int local50 = (local38 << 16) / arg3;
			@Pc(64) int local64;
			if (super.anInt7887 > 0) {
				local64 = ((super.anInt7887 << 16) + local44 - 1) / local44;
				arg0 += local64;
				local14 = local64 * local44 - (super.anInt7887 << 16);
			}
			if (super.anInt7903 > 0) {
				local64 = ((super.anInt7903 << 16) + local50 - 1) / local50;
				arg1 += local64;
				local16 = local64 * local50 - (super.anInt7903 << 16);
			}
			if (super.anInt7883 < local29) {
				arg2 = ((super.anInt7883 << 16) + local44 - local14 - 1) / local44;
			}
			if (super.anInt7886 < local38) {
				arg3 = ((super.anInt7886 << 16) + local50 - local16 - 1) / local50;
			}
			local64 = arg0 + arg1 * local20;
			@Pc(152) int local152 = local20 - arg2;
			if (arg1 + arg3 > super.aClass137_Sub2_10.anInt8044) {
				arg3 -= arg1 + arg3 - super.aClass137_Sub2_10.anInt8044;
			}
			@Pc(180) int local180;
			if (arg1 < super.aClass137_Sub2_10.anInt8047) {
				local180 = super.aClass137_Sub2_10.anInt8047 - arg1;
				arg3 -= local180;
				local64 += local180 * local20;
				local16 += local50 * local180;
			}
			if (arg0 + arg2 > super.aClass137_Sub2_10.anInt8066) {
				local180 = arg0 + arg2 - super.aClass137_Sub2_10.anInt8066;
				arg2 -= local180;
				local152 += local180;
			}
			if (arg0 < super.aClass137_Sub2_10.anInt8067) {
				local180 = super.aClass137_Sub2_10.anInt8067 - arg0;
				arg2 -= local180;
				local64 += local180;
				local14 += local44 * local180;
				local152 += local180;
			}
			@Pc(252) int[] local252 = super.aClass137_Sub2_10.anIntArray612;
			@Pc(259) int local259;
			@Pc(262) int local262;
			@Pc(270) int local270;
			@Pc(273) int local273;
			@Pc(330) int local330;
			@Pc(338) int local338;
			@Pc(341) int local341;
			@Pc(351) int local351;
			@Pc(359) int local359;
			@Pc(367) int local367;
			@Pc(375) int local375;
			@Pc(525) int local525;
			if (arg6 != 0) {
				@Pc(837) int local837;
				@Pc(845) int local845;
				@Pc(857) int local857;
				if (arg6 == 1) {
					if (arg4 == 1) {
						local259 = local14;
						for (local262 = -arg3; local262 < 0; local262++) {
							local270 = (local16 >> 16) * super.anInt7883;
							for (local273 = -arg2; local273 < 0; local273++) {
								local330 = this.anIntArray407[(local14 >> 16) + local270];
								if (local330 == 0) {
									local64++;
								} else {
									local252[local64++] = local330;
								}
								local14 += local44;
							}
							local16 += local50;
							local14 = local259;
							local64 += local152;
						}
					} else if (arg4 == 0) {
						local259 = local14;
						if ((arg5 & 0xFFFFFF) == 16777215) {
							local262 = arg5 >>> 24;
							local270 = 256 - local262;
							for (local273 = -arg3; local273 < 0; local273++) {
								local330 = (local16 >> 16) * super.anInt7883;
								for (local338 = -arg2; local338 < 0; local338++) {
									local341 = this.anIntArray407[(local14 >> 16) + local330];
									if (local341 == 0) {
										local64++;
									} else {
										local351 = local252[local64];
										local252[local64++] = ((local341 & 0xFF00FF) * local262 + (local351 & 0xFF00FF) * local270 & 0xFF00FF00) + ((local341 & 0xFF00) * local262 + (local351 & 0xFF00) * local270 & 0xFF0000) >> 8;
									}
									local14 += local44;
								}
								local16 += local50;
								local14 = local259;
								local64 += local152;
							}
						} else {
							local262 = arg5 >> 16 & 0xFF;
							local270 = arg5 >> 8 & 0xFF;
							local273 = arg5 & 0xFF;
							local330 = arg5 >>> 24;
							local338 = 256 - local330;
							for (local341 = -arg3; local341 < 0; local341++) {
								local351 = (local16 >> 16) * super.anInt7883;
								for (local359 = -arg2; local359 < 0; local359++) {
									local367 = this.anIntArray407[(local14 >> 16) + local351];
									if (local367 == 0) {
										local64++;
									} else if (local330 == 255) {
										local375 = (local367 & 0xFF0000) * local262 & 0xFF000000;
										local837 = (local367 & 0xFF00) * local270 & 0xFF0000;
										local845 = (local367 & 0xFF) * local273 & 0xFF00;
										local252[local64++] = (local375 | local837 | local845) >>> 8;
									} else {
										local375 = (local367 & 0xFF0000) * local262 & 0xFF000000;
										local837 = (local367 & 0xFF00) * local270 & 0xFF0000;
										local845 = (local367 & 0xFF) * local273 & 0xFF00;
										local367 = (local375 | local837 | local845) >>> 8;
										local857 = local252[local64];
										local252[local64++] = ((local367 & 0xFF00FF) * local330 + (local857 & 0xFF00FF) * local338 & 0xFF00FF00) + ((local367 & 0xFF00) * local330 + (local857 & 0xFF00) * local338 & 0xFF0000) >> 8;
									}
									local14 += local44;
								}
								local16 += local50;
								local14 = local259;
								local64 += local152;
							}
						}
					} else if (arg4 == 3) {
						local259 = local14;
						local262 = arg5 >>> 24;
						local270 = 256 - local262;
						for (local273 = -arg3; local273 < 0; local273++) {
							local330 = (local16 >> 16) * super.anInt7883;
							for (local338 = -arg2; local338 < 0; local338++) {
								local341 = this.anIntArray407[(local14 >> 16) + local330];
								local351 = local341 + arg5;
								local359 = (local341 & 0xFF00FF) + (arg5 & 0xFF00FF);
								local367 = (local359 & 0x1000100) + (local351 - local359 & 0x10000);
								local367 = local351 - local367 | local367 - (local367 >>> 8);
								if (local341 == 0 && local262 != 255) {
									local341 = local367;
									local367 = local252[local64];
									local367 = ((local341 & 0xFF00FF) * local262 + (local367 & 0xFF00FF) * local270 & 0xFF00FF00) + ((local341 & 0xFF00) * local262 + (local367 & 0xFF00) * local270 & 0xFF0000) >> 8;
								}
								local252[local64++] = local367;
								local14 += local44;
							}
							local16 += local50;
							local14 = local259;
							local64 += local152;
						}
					} else if (arg4 == 2) {
						local259 = arg5 >>> 24;
						local262 = 256 - local259;
						local270 = (arg5 & 0xFF00FF) * local262 & 0xFF00FF00;
						local273 = (arg5 & 0xFF00) * local262 & 0xFF0000;
						local525 = (local270 | local273) >>> 8;
						local330 = local14;
						for (local338 = -arg3; local338 < 0; local338++) {
							local341 = (local16 >> 16) * super.anInt7883;
							for (local351 = -arg2; local351 < 0; local351++) {
								local359 = this.anIntArray407[(local14 >> 16) + local341];
								if (local359 == 0) {
									local64++;
								} else {
									local270 = (local359 & 0xFF00FF) * local259 & 0xFF00FF00;
									local273 = (local359 & 0xFF00) * local259 & 0xFF0000;
									local252[local64++] = ((local270 | local273) >>> 8) + local525;
								}
								local14 += local44;
							}
							local16 += local50;
							local14 = local330;
							local64 += local152;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (arg6 != 2) {
					throw new IllegalArgumentException();
				} else if (arg4 == 1) {
					local259 = local14;
					for (local262 = -arg3; local262 < 0; local262++) {
						local270 = (local16 >> 16) * super.anInt7883;
						for (local273 = -arg2; local273 < 0; local273++) {
							local330 = this.anIntArray407[(local14 >> 16) + local270];
							if (local330 == 0) {
								local64++;
							} else {
								local338 = local252[local64];
								local341 = local330 + local338;
								local351 = (local330 & 0xFF00FF) + (local338 & 0xFF00FF);
								local338 = (local351 & 0x1000100) + (local341 - local351 & 0x10000);
								local252[local64++] = local341 - local338 | local338 - (local338 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local259;
						local64 += local152;
					}
				} else if (arg4 == 0) {
					local259 = local14;
					local262 = arg5 >> 16 & 0xFF;
					local270 = arg5 >> 8 & 0xFF;
					local273 = arg5 & 0xFF;
					for (local330 = -arg3; local330 < 0; local330++) {
						local338 = (local16 >> 16) * super.anInt7883;
						for (local341 = -arg2; local341 < 0; local341++) {
							local351 = this.anIntArray407[(local14 >> 16) + local338];
							if (local351 == 0) {
								local64++;
							} else {
								local359 = (local351 & 0xFF0000) * local262 & 0xFF000000;
								local367 = (local351 & 0xFF00) * local270 & 0xFF0000;
								local375 = (local351 & 0xFF) * local273 & 0xFF00;
								local351 = (local359 | local367 | local375) >>> 8;
								local837 = local252[local64];
								local845 = local351 + local837;
								local857 = (local351 & 0xFF00FF) + (local837 & 0xFF00FF);
								local837 = (local857 & 0x1000100) + (local845 - local857 & 0x10000);
								local252[local64++] = local845 - local837 | local837 - (local837 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local259;
						local64 += local152;
					}
				} else if (arg4 == 3) {
					local259 = local14;
					for (local262 = -arg3; local262 < 0; local262++) {
						local270 = (local16 >> 16) * super.anInt7883;
						for (local273 = -arg2; local273 < 0; local273++) {
							local330 = this.anIntArray407[(local14 >> 16) + local270];
							local338 = local330 + arg5;
							local341 = (local330 & 0xFF00FF) + (arg5 & 0xFF00FF);
							local351 = (local341 & 0x1000100) + (local338 - local341 & 0x10000);
							local330 = local338 - local351 | local351 - (local351 >>> 8);
							local351 = local252[local64];
							local338 = local330 + local351;
							local341 = (local330 & 0xFF00FF) + (local351 & 0xFF00FF);
							local351 = (local341 & 0x1000100) + (local338 - local341 & 0x10000);
							local252[local64++] = local338 - local351 | local351 - (local351 >>> 8);
							local14 += local44;
						}
						local16 += local50;
						local14 = local259;
						local64 += local152;
					}
				} else if (arg4 == 2) {
					local259 = arg5 >>> 24;
					local262 = 256 - local259;
					local270 = (arg5 & 0xFF00FF) * local262 & 0xFF00FF00;
					local273 = (arg5 & 0xFF00) * local262 & 0xFF0000;
					local525 = (local270 | local273) >>> 8;
					local330 = local14;
					for (local338 = -arg3; local338 < 0; local338++) {
						local341 = (local16 >> 16) * super.anInt7883;
						for (local351 = -arg2; local351 < 0; local351++) {
							local359 = this.anIntArray407[(local14 >> 16) + local341];
							if (local359 == 0) {
								local64++;
							} else {
								local270 = (local359 & 0xFF00FF) * local259 & 0xFF00FF00;
								local273 = (local359 & 0xFF00) * local259 & 0xFF0000;
								local359 = ((local270 | local273) >>> 8) + local525;
								local367 = local252[local64];
								local375 = local359 + local367;
								local837 = (local359 & 0xFF00FF) + (local367 & 0xFF00FF);
								@Pc(1668) int local1668 = (local837 & 0x1000100) + (local375 - local837 & 0x10000);
								local252[local64++] = local375 - local1668 | local1668 - (local1668 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local330;
						local64 += local152;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg4 == 1) {
				local259 = local14;
				for (local262 = -arg3; local262 < 0; local262++) {
					local270 = (local16 >> 16) * super.anInt7883;
					for (local273 = -arg2; local273 < 0; local273++) {
						local252[local64++] = this.anIntArray407[(local14 >> 16) + local270];
						local14 += local44;
					}
					local16 += local50;
					local14 = local259;
					local64 += local152;
				}
			} else if (arg4 == 0) {
				local259 = arg5 >> 16 & 0xFF;
				local262 = arg5 >> 8 & 0xFF;
				local270 = arg5 & 0xFF;
				local273 = local14;
				for (local330 = -arg3; local330 < 0; local330++) {
					local338 = (local16 >> 16) * super.anInt7883;
					for (local341 = -arg2; local341 < 0; local341++) {
						local351 = this.anIntArray407[(local14 >> 16) + local338];
						local359 = (local351 & 0xFF0000) * local259 & 0xFF000000;
						local367 = (local351 & 0xFF00) * local262 & 0xFF0000;
						local375 = (local351 & 0xFF) * local270 & 0xFF00;
						local252[local64++] = (local359 | local367 | local375) >>> 8;
						local14 += local44;
					}
					local16 += local50;
					local14 = local273;
					local64 += local152;
				}
			} else if (arg4 == 3) {
				local259 = local14;
				for (local262 = -arg3; local262 < 0; local262++) {
					local270 = (local16 >> 16) * super.anInt7883;
					for (local273 = -arg2; local273 < 0; local273++) {
						local330 = this.anIntArray407[(local14 >> 16) + local270];
						local338 = local330 + arg5;
						local341 = (local330 & 0xFF00FF) + (arg5 & 0xFF00FF);
						local351 = (local341 & 0x1000100) + (local338 - local341 & 0x10000);
						local252[local64++] = local338 - local351 | local351 - (local351 >>> 8);
						local14 += local44;
					}
					local16 += local50;
					local14 = local259;
					local64 += local152;
				}
			} else if (arg4 == 2) {
				local259 = arg5 >>> 24;
				local262 = 256 - local259;
				local270 = (arg5 & 0xFF00FF) * local262 & 0xFF00FF00;
				local273 = (arg5 & 0xFF00) * local262 & 0xFF0000;
				local525 = (local270 | local273) >>> 8;
				local330 = local14;
				for (local338 = -arg3; local338 < 0; local338++) {
					local341 = (local16 >> 16) * super.anInt7883;
					for (local351 = -arg2; local351 < 0; local351++) {
						local359 = this.anIntArray407[(local14 >> 16) + local341];
						local270 = (local359 & 0xFF00FF) * local259 & 0xFF00FF00;
						local273 = (local359 & 0xFF00) * local259 & 0xFF0000;
						local252[local64++] = ((local270 | local273) >>> 8) + local525;
						local14 += local44;
					}
					local16 += local50;
					local14 = local330;
					local64 += local152;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "([I[III)V")
	@Override
	protected void method6540(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = super.aClass137_Sub2_10.anIntArray612;
		@Pc(181) int local181;
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		@Pc(29) int local29;
		@Pc(53) int local53;
		@Pc(58) int local58;
		@Pc(64) int local64;
		@Pc(111) int local111;
		if (Static463.anInt7896 == 0) {
			if (Static463.anInt7893 == 0) {
				local9 = Static463.anInt7892;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static463.anInt7894;
						local25 = Static463.anInt7898;
						local27 = Static463.anInt7888;
						local29 = Static463.anInt7909;
						if (local25 >= 0 && local27 >= 0 && local25 - (super.anInt7883 << 12) < 0 && local27 - (super.anInt7886 << 12) < 0) {
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static463.anInt7894 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static463.anInt7896 * local64;
								local27 += Static463.anInt7893 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray407[(local27 >> 12) * super.anInt7883 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = local111;
								}
								local29++;
							}
						}
					}
					local9++;
					Static463.anInt7894 += Static463.anInt7889;
				}
			} else if (Static463.anInt7893 < 0) {
				local9 = Static463.anInt7892;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static463.anInt7894;
						local25 = Static463.anInt7898;
						local27 = Static463.anInt7888 + Static463.anInt7905;
						local29 = Static463.anInt7909;
						if (local25 >= 0 && local25 - (super.anInt7883 << 12) < 0) {
							@Pc(174) int local174;
							if ((local174 = local27 - (super.anInt7886 << 12)) >= 0) {
								local181 = (Static463.anInt7893 - local174) / Static463.anInt7893;
								local29 += local181;
								local27 += Static463.anInt7893 * local181;
								local23 += local181;
							}
							@Pc(202) int local202;
							if ((local202 = (local27 - Static463.anInt7893) / Static463.anInt7893) > local29) {
								local29 = local202;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static463.anInt7894 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static463.anInt7896 * local64;
								local27 += Static463.anInt7893 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray407[(local27 >> 12) * super.anInt7883 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = local111;
								}
								local27 += Static463.anInt7893;
								local29++;
							}
						}
					}
					local9++;
					Static463.anInt7898 += Static463.anInt7884;
					Static463.anInt7894 += Static463.anInt7889;
				}
			} else {
				local9 = Static463.anInt7892;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static463.anInt7894;
						local25 = Static463.anInt7898;
						local27 = Static463.anInt7888 + Static463.anInt7905;
						local29 = Static463.anInt7909;
						if (local25 >= 0 && local25 - (super.anInt7883 << 12) < 0) {
							if (local27 < 0) {
								local181 = (Static463.anInt7893 - local27 - 1) / Static463.anInt7893;
								local29 += local181;
								local27 += Static463.anInt7893 * local181;
								local23 += local181;
							}
							@Pc(369) int local369;
							if ((local369 = (local27 + 1 - (super.anInt7886 << 12) - Static463.anInt7893) / Static463.anInt7893) > local29) {
								local29 = local369;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static463.anInt7894 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static463.anInt7896 * local64;
								local27 += Static463.anInt7893 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray407[(local27 >> 12) * super.anInt7883 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = local111;
								}
								local27 += Static463.anInt7893;
								local29++;
							}
						}
					}
					local9++;
					Static463.anInt7898 += Static463.anInt7884;
					Static463.anInt7894 += Static463.anInt7889;
				}
			}
		} else if (Static463.anInt7896 < 0) {
			if (Static463.anInt7893 == 0) {
				local9 = Static463.anInt7892;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static463.anInt7894;
						local25 = Static463.anInt7898 + Static463.anInt7897;
						local27 = Static463.anInt7888;
						local29 = Static463.anInt7909;
						if (local27 >= 0 && local27 - (super.anInt7886 << 12) < 0) {
							@Pc(510) int local510;
							if ((local510 = local25 - (super.anInt7883 << 12)) >= 0) {
								local181 = (Static463.anInt7896 - local510) / Static463.anInt7896;
								local29 += local181;
								local25 += Static463.anInt7896 * local181;
								local23 += local181;
							}
							@Pc(538) int local538;
							if ((local538 = (local25 - Static463.anInt7896) / Static463.anInt7896) > local29) {
								local29 = local538;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static463.anInt7894 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static463.anInt7896 * local64;
								local27 += Static463.anInt7893 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray407[(local27 >> 12) * super.anInt7883 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = local111;
								}
								local25 += Static463.anInt7896;
								local29++;
							}
						}
					}
					local9++;
					Static463.anInt7888 += Static463.anInt7881;
					Static463.anInt7894 += Static463.anInt7889;
				}
			} else if (Static463.anInt7893 < 0) {
				local9 = Static463.anInt7892;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static463.anInt7894;
						local25 = Static463.anInt7898 + Static463.anInt7897;
						local27 = Static463.anInt7888 + Static463.anInt7905;
						local29 = Static463.anInt7909;
						@Pc(670) int local670;
						if ((local670 = local25 - (super.anInt7883 << 12)) >= 0) {
							local181 = (Static463.anInt7896 - local670) / Static463.anInt7896;
							local29 += local181;
							local25 += Static463.anInt7896 * local181;
							local27 += Static463.anInt7893 * local181;
							local23 += local181;
						}
						@Pc(704) int local704;
						if ((local704 = (local25 - Static463.anInt7896) / Static463.anInt7896) > local29) {
							local29 = local704;
						}
						@Pc(716) int local716;
						if ((local716 = local27 - (super.anInt7886 << 12)) >= 0) {
							local181 = (Static463.anInt7893 - local716) / Static463.anInt7893;
							local29 += local181;
							local25 += Static463.anInt7896 * local181;
							local27 += Static463.anInt7893 * local181;
							local23 += local181;
						}
						@Pc(750) int local750;
						if ((local750 = (local27 - Static463.anInt7893) / Static463.anInt7893) > local29) {
							local29 = local750;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static463.anInt7894 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static463.anInt7896 * local64;
							local27 += Static463.anInt7893 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray407[(local27 >> 12) * super.anInt7883 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = local111;
							}
							local25 += Static463.anInt7896;
							local27 += Static463.anInt7893;
							local29++;
						}
					}
					local9++;
					Static463.anInt7898 += Static463.anInt7884;
					Static463.anInt7888 += Static463.anInt7881;
					Static463.anInt7894 += Static463.anInt7889;
				}
			} else {
				local9 = Static463.anInt7892;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static463.anInt7894;
						local25 = Static463.anInt7898 + Static463.anInt7897;
						local27 = Static463.anInt7888 + Static463.anInt7905;
						local29 = Static463.anInt7909;
						@Pc(888) int local888;
						if ((local888 = local25 - (super.anInt7883 << 12)) >= 0) {
							local181 = (Static463.anInt7896 - local888) / Static463.anInt7896;
							local29 += local181;
							local25 += Static463.anInt7896 * local181;
							local27 += Static463.anInt7893 * local181;
							local23 += local181;
						}
						@Pc(922) int local922;
						if ((local922 = (local25 - Static463.anInt7896) / Static463.anInt7896) > local29) {
							local29 = local922;
						}
						if (local27 < 0) {
							local181 = (Static463.anInt7893 - local27 - 1) / Static463.anInt7893;
							local29 += local181;
							local25 += Static463.anInt7896 * local181;
							local27 += Static463.anInt7893 * local181;
							local23 += local181;
						}
						@Pc(970) int local970;
						if ((local970 = (local27 + 1 - (super.anInt7886 << 12) - Static463.anInt7893) / Static463.anInt7893) > local29) {
							local29 = local970;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static463.anInt7894 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static463.anInt7896 * local64;
							local27 += Static463.anInt7893 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray407[(local27 >> 12) * super.anInt7883 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = local111;
							}
							local25 += Static463.anInt7896;
							local27 += Static463.anInt7893;
							local29++;
						}
					}
					local9++;
					Static463.anInt7898 += Static463.anInt7884;
					Static463.anInt7888 += Static463.anInt7881;
					Static463.anInt7894 += Static463.anInt7889;
				}
			}
		} else if (Static463.anInt7893 == 0) {
			local9 = Static463.anInt7892;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static463.anInt7894;
					local25 = Static463.anInt7898 + Static463.anInt7897;
					local27 = Static463.anInt7888;
					local29 = Static463.anInt7909;
					if (local27 >= 0 && local27 - (super.anInt7886 << 12) < 0) {
						if (local25 < 0) {
							local181 = (Static463.anInt7896 - local25 - 1) / Static463.anInt7896;
							local29 += local181;
							local25 += Static463.anInt7896 * local181;
							local23 += local181;
						}
						@Pc(1147) int local1147;
						if ((local1147 = (local25 + 1 - (super.anInt7883 << 12) - Static463.anInt7896) / Static463.anInt7896) > local29) {
							local29 = local1147;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static463.anInt7894 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static463.anInt7896 * local64;
							local27 += Static463.anInt7893 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray407[(local27 >> 12) * super.anInt7883 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = local111;
							}
							local25 += Static463.anInt7896;
							local29++;
						}
					}
				}
				local9++;
				Static463.anInt7898 += Static463.anInt7884;
				Static463.anInt7888 += Static463.anInt7881;
				Static463.anInt7894 += Static463.anInt7889;
			}
		} else if (Static463.anInt7893 < 0) {
			local9 = Static463.anInt7892;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static463.anInt7894;
					local25 = Static463.anInt7898 + Static463.anInt7897;
					local27 = Static463.anInt7888 + Static463.anInt7905;
					local29 = Static463.anInt7909;
					if (local25 < 0) {
						local181 = (Static463.anInt7896 - local25 - 1) / Static463.anInt7896;
						local29 += local181;
						local25 += Static463.anInt7896 * local181;
						local27 += Static463.anInt7893 * local181;
						local23 += local181;
					}
					@Pc(1319) int local1319;
					if ((local1319 = (local25 + 1 - (super.anInt7883 << 12) - Static463.anInt7896) / Static463.anInt7896) > local29) {
						local29 = local1319;
					}
					@Pc(1331) int local1331;
					if ((local1331 = local27 - (super.anInt7886 << 12)) >= 0) {
						local181 = (Static463.anInt7893 - local1331) / Static463.anInt7893;
						local29 += local181;
						local25 += Static463.anInt7896 * local181;
						local27 += Static463.anInt7893 * local181;
						local23 += local181;
					}
					@Pc(1365) int local1365;
					if ((local1365 = (local27 - Static463.anInt7893) / Static463.anInt7893) > local29) {
						local29 = local1365;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static463.anInt7894 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static463.anInt7896 * local64;
						local27 += Static463.anInt7893 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.anIntArray407[(local27 >> 12) * super.anInt7883 + (local25 >> 12)];
						if (local111 == 0) {
							local23++;
						} else {
							local3[local23++] = local111;
						}
						local25 += Static463.anInt7896;
						local27 += Static463.anInt7893;
						local29++;
					}
				}
				local9++;
				Static463.anInt7898 += Static463.anInt7884;
				Static463.anInt7888 += Static463.anInt7881;
				Static463.anInt7894 += Static463.anInt7889;
			}
		} else {
			local9 = Static463.anInt7892;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static463.anInt7894;
					local25 = Static463.anInt7898 + Static463.anInt7897;
					local27 = Static463.anInt7888 + Static463.anInt7905;
					local29 = Static463.anInt7909;
					if (local25 < 0) {
						local181 = (Static463.anInt7896 - local25 - 1) / Static463.anInt7896;
						local29 += local181;
						local25 += Static463.anInt7896 * local181;
						local27 += Static463.anInt7893 * local181;
						local23 += local181;
					}
					@Pc(1539) int local1539;
					if ((local1539 = (local25 + 1 - (super.anInt7883 << 12) - Static463.anInt7896) / Static463.anInt7896) > local29) {
						local29 = local1539;
					}
					if (local27 < 0) {
						local181 = (Static463.anInt7893 - local27 - 1) / Static463.anInt7893;
						local29 += local181;
						local25 += Static463.anInt7896 * local181;
						local27 += Static463.anInt7893 * local181;
						local23 += local181;
					}
					@Pc(1587) int local1587;
					if ((local1587 = (local27 + 1 - (super.anInt7886 << 12) - Static463.anInt7893) / Static463.anInt7893) > local29) {
						local29 = local1587;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static463.anInt7894 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static463.anInt7896 * local64;
						local27 += Static463.anInt7893 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.anIntArray407[(local27 >> 12) * super.anInt7883 + (local25 >> 12)];
						if (local111 == 0) {
							local23++;
						} else {
							local3[local23++] = local111;
						}
						local25 += Static463.anInt7896;
						local27 += Static463.anInt7893;
						local29++;
					}
				}
				local9++;
				Static463.anInt7898 += Static463.anInt7884;
				Static463.anInt7888 += Static463.anInt7881;
				Static463.anInt7894 += Static463.anInt7889;
			}
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17 = super.anInt7887 + super.anInt7883 + super.anInt7900;
		@Pc(26) int local26 = super.anInt7903 + super.anInt7886 + super.anInt7890;
		@Pc(32) int local32 = (local17 << 16) / arg3;
		@Pc(38) int local38 = (local26 << 16) / arg4;
		@Pc(52) int local52;
		if (super.anInt7887 > 0) {
			local52 = ((super.anInt7887 << 16) + local32 - 1) / local32;
			arg0 += local52;
			local6 = local52 * local32 - (super.anInt7887 << 16);
		}
		if (super.anInt7903 > 0) {
			local52 = ((super.anInt7903 << 16) + local38 - 1) / local38;
			arg1 += local52;
			local8 = local52 * local38 - (super.anInt7903 << 16);
		}
		if (super.anInt7883 < local17) {
			arg3 = ((super.anInt7883 << 16) + local32 - local6 - 1) / local32;
		}
		if (super.anInt7886 < local26) {
			arg4 = ((super.anInt7886 << 16) + local38 - local8 - 1) / local38;
		}
		local52 = arg0 + arg1 * super.aClass137_Sub2_10.anInt8058;
		@Pc(144) int local144 = super.aClass137_Sub2_10.anInt8058 - arg3;
		if (arg1 + arg4 > super.aClass137_Sub2_10.anInt8044) {
			arg4 -= arg1 + arg4 - super.aClass137_Sub2_10.anInt8044;
		}
		@Pc(172) int local172;
		if (arg1 < super.aClass137_Sub2_10.anInt8047) {
			local172 = super.aClass137_Sub2_10.anInt8047 - arg1;
			arg4 -= local172;
			local52 += local172 * super.aClass137_Sub2_10.anInt8058;
			local8 += local38 * local172;
		}
		if (arg0 + arg3 > super.aClass137_Sub2_10.anInt8066) {
			local172 = arg0 + arg3 - super.aClass137_Sub2_10.anInt8066;
			arg3 -= local172;
			local144 += local172;
		}
		if (arg0 < super.aClass137_Sub2_10.anInt8067) {
			local172 = super.aClass137_Sub2_10.anInt8067 - arg0;
			arg3 -= local172;
			local52 += local172;
			local6 += local32 * local172;
			local144 += local172;
		}
		@Pc(246) float[] local246 = super.aClass137_Sub2_10.aFloatArray62;
		@Pc(250) int[] local250 = super.aClass137_Sub2_10.anIntArray612;
		@Pc(257) int local257;
		@Pc(260) int local260;
		@Pc(268) int local268;
		@Pc(271) int local271;
		@Pc(340) int local340;
		@Pc(348) int local348;
		@Pc(351) int local351;
		@Pc(368) int local368;
		@Pc(376) int local376;
		@Pc(384) int local384;
		@Pc(392) int local392;
		@Pc(559) int local559;
		if (arg7 != 0) {
			@Pc(910) int local910;
			@Pc(918) int local918;
			@Pc(930) int local930;
			if (arg7 == 1) {
				if (arg5 == 1) {
					local257 = local6;
					for (local260 = -arg4; local260 < 0; local260++) {
						local268 = (local8 >> 16) * super.anInt7883;
						for (local271 = -arg3; local271 < 0; local271++) {
							if ((float) arg2 < local246[local52]) {
								local340 = this.anIntArray407[(local6 >> 16) + local268];
								if (local340 != 0) {
									local250[local52] = local340;
									local246[local52] = (float) arg2;
								}
							}
							local6 += local32;
							local52++;
						}
						local8 += local38;
						local6 = local257;
						local52 += local144;
					}
				} else if (arg5 == 0) {
					local257 = local6;
					if ((arg6 & 0xFFFFFF) == 16777215) {
						local260 = arg6 >>> 24;
						local268 = 256 - local260;
						for (local271 = -arg4; local271 < 0; local271++) {
							local340 = (local8 >> 16) * super.anInt7883;
							for (local348 = -arg3; local348 < 0; local348++) {
								if ((float) arg2 < local246[local52]) {
									local351 = this.anIntArray407[(local6 >> 16) + local340];
									if (local351 != 0) {
										local368 = local250[local52];
										local250[local52] = ((local351 & 0xFF00FF) * local260 + (local368 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local351 & 0xFF00) * local260 + (local368 & 0xFF00) * local268 & 0xFF0000) >> 8;
										local246[local52] = (float) arg2;
									}
								}
								local6 += local32;
								local52++;
							}
							local8 += local38;
							local6 = local257;
							local52 += local144;
						}
					} else {
						local260 = arg6 >> 16 & 0xFF;
						local268 = arg6 >> 8 & 0xFF;
						local271 = arg6 & 0xFF;
						local340 = arg6 >>> 24;
						local348 = 256 - local340;
						for (local351 = -arg4; local351 < 0; local351++) {
							local368 = (local8 >> 16) * super.anInt7883;
							for (local376 = -arg3; local376 < 0; local376++) {
								if ((float) arg2 < local246[local52]) {
									local384 = this.anIntArray407[(local6 >> 16) + local368];
									if (local384 != 0) {
										if (local340 == 255) {
											local392 = (local384 & 0xFF0000) * local260 & 0xFF000000;
											local910 = (local384 & 0xFF00) * local268 & 0xFF0000;
											local918 = (local384 & 0xFF) * local271 & 0xFF00;
											local250[local52] = (local392 | local910 | local918) >>> 8;
											local246[local52] = (float) arg2;
										} else {
											local392 = (local384 & 0xFF0000) * local260 & 0xFF000000;
											local910 = (local384 & 0xFF00) * local268 & 0xFF0000;
											local918 = (local384 & 0xFF) * local271 & 0xFF00;
											local384 = (local392 | local910 | local918) >>> 8;
											local930 = local250[local52];
											local250[local52] = ((local384 & 0xFF00FF) * local340 + (local930 & 0xFF00FF) * local348 & 0xFF00FF00) + ((local384 & 0xFF00) * local340 + (local930 & 0xFF00) * local348 & 0xFF0000) >> 8;
											local246[local52] = (float) arg2;
										}
									}
								}
								local6 += local32;
								local52++;
							}
							local8 += local38;
							local6 = local257;
							local52 += local144;
						}
					}
				} else if (arg5 == 3) {
					local257 = local6;
					local260 = arg6 >>> 24;
					local268 = 256 - local260;
					for (local271 = -arg4; local271 < 0; local271++) {
						local340 = (local8 >> 16) * super.anInt7883;
						for (local348 = -arg3; local348 < 0; local348++) {
							if ((float) arg2 < local246[local52]) {
								local351 = this.anIntArray407[(local6 >> 16) + local340];
								local368 = local351 + arg6;
								local376 = (local351 & 0xFF00FF) + (arg6 & 0xFF00FF);
								local384 = (local376 & 0x1000100) + (local368 - local376 & 0x10000);
								local384 = local368 - local384 | local384 - (local384 >>> 8);
								if (local351 == 0 && local260 != 255) {
									local351 = local384;
									local384 = local250[local52];
									local384 = ((local351 & 0xFF00FF) * local260 + (local384 & 0xFF00FF) * local268 & 0xFF00FF00) + ((local351 & 0xFF00) * local260 + (local384 & 0xFF00) * local268 & 0xFF0000) >> 8;
								}
								local250[local52] = local384;
								local246[local52] = (float) arg2;
							}
							local6 += local32;
							local52++;
						}
						local8 += local38;
						local6 = local257;
						local52 += local144;
					}
				} else if (arg5 == 2) {
					local257 = arg6 >>> 24;
					local260 = 256 - local257;
					local268 = (arg6 & 0xFF00FF) * local260 & 0xFF00FF00;
					local271 = (arg6 & 0xFF00) * local260 & 0xFF0000;
					local559 = (local268 | local271) >>> 8;
					local340 = local6;
					for (local348 = -arg4; local348 < 0; local348++) {
						local351 = (local8 >> 16) * super.anInt7883;
						for (local368 = -arg3; local368 < 0; local368++) {
							if ((float) arg2 < local246[local52]) {
								local376 = this.anIntArray407[(local6 >> 16) + local351];
								if (local376 != 0) {
									local268 = (local376 & 0xFF00FF) * local257 & 0xFF00FF00;
									local271 = (local376 & 0xFF00) * local257 & 0xFF0000;
									local250[local52] = ((local268 | local271) >>> 8) + local559;
									local246[local52] = (float) arg2;
								}
							}
							local6 += local32;
							local52++;
						}
						local8 += local38;
						local6 = local340;
						local52 += local144;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg7 != 2) {
				throw new IllegalArgumentException();
			} else if (arg5 == 1) {
				local257 = local6;
				for (local260 = -arg4; local260 < 0; local260++) {
					local268 = (local8 >> 16) * super.anInt7883;
					for (local271 = -arg3; local271 < 0; local271++) {
						if ((float) arg2 < local246[local52]) {
							local340 = this.anIntArray407[(local6 >> 16) + local268];
							if (local340 != 0) {
								local348 = local250[local52];
								local351 = local340 + local348;
								local368 = (local340 & 0xFF00FF) + (local348 & 0xFF00FF);
								local348 = (local368 & 0x1000100) + (local351 - local368 & 0x10000);
								local250[local52] = local351 - local348 | local348 - (local348 >>> 8);
								local246[local52] = (float) arg2;
							}
						}
						local6 += local32;
						local52++;
					}
					local8 += local38;
					local6 = local257;
					local52 += local144;
				}
			} else if (arg5 == 0) {
				local257 = local6;
				local260 = arg6 >> 16 & 0xFF;
				local268 = arg6 >> 8 & 0xFF;
				local271 = arg6 & 0xFF;
				for (local340 = -arg4; local340 < 0; local340++) {
					local348 = (local8 >> 16) * super.anInt7883;
					for (local351 = -arg3; local351 < 0; local351++) {
						if ((float) arg2 < local246[local52]) {
							local368 = this.anIntArray407[(local6 >> 16) + local348];
							if (local368 != 0) {
								local376 = (local368 & 0xFF0000) * local260 & 0xFF000000;
								local384 = (local368 & 0xFF00) * local268 & 0xFF0000;
								local392 = (local368 & 0xFF) * local271 & 0xFF00;
								local368 = (local376 | local384 | local392) >>> 8;
								local910 = local250[local52];
								local918 = local368 + local910;
								local930 = (local368 & 0xFF00FF) + (local910 & 0xFF00FF);
								local910 = (local930 & 0x1000100) + (local918 - local930 & 0x10000);
								local250[local52] = local918 - local910 | local910 - (local910 >>> 8);
								local246[local52] = (float) arg2;
							}
						}
						local6 += local32;
						local52++;
					}
					local8 += local38;
					local6 = local257;
					local52 += local144;
				}
			} else if (arg5 == 3) {
				local257 = local6;
				for (local260 = -arg4; local260 < 0; local260++) {
					local268 = (local8 >> 16) * super.anInt7883;
					for (local271 = -arg3; local271 < 0; local271++) {
						if ((float) arg2 < local246[local52]) {
							local340 = this.anIntArray407[(local6 >> 16) + local268];
							local348 = local340 + arg6;
							local351 = (local340 & 0xFF00FF) + (arg6 & 0xFF00FF);
							local368 = (local351 & 0x1000100) + (local348 - local351 & 0x10000);
							local340 = local348 - local368 | local368 - (local368 >>> 8);
							local368 = local250[local52];
							local348 = local340 + local368;
							local351 = (local340 & 0xFF00FF) + (local368 & 0xFF00FF);
							local368 = (local351 & 0x1000100) + (local348 - local351 & 0x10000);
							local250[local52] = local348 - local368 | local368 - (local368 >>> 8);
							local246[local52] = (float) arg2;
						}
						local6 += local32;
						local52++;
					}
					local8 += local38;
					local6 = local257;
					local52 += local144;
				}
			} else if (arg5 == 2) {
				local257 = arg6 >>> 24;
				local260 = 256 - local257;
				local268 = (arg6 & 0xFF00FF) * local260 & 0xFF00FF00;
				local271 = (arg6 & 0xFF00) * local260 & 0xFF0000;
				local559 = (local268 | local271) >>> 8;
				local340 = local6;
				for (local348 = -arg4; local348 < 0; local348++) {
					local351 = (local8 >> 16) * super.anInt7883;
					for (local368 = -arg3; local368 < 0; local368++) {
						if ((float) arg2 < local246[local52]) {
							local376 = this.anIntArray407[(local6 >> 16) + local351];
							if (local376 != 0) {
								local268 = (local376 & 0xFF00FF) * local257 & 0xFF00FF00;
								local271 = (local376 & 0xFF00) * local257 & 0xFF0000;
								local376 = ((local268 | local271) >>> 8) + local559;
								local384 = local250[local52];
								local392 = local376 + local384;
								local910 = (local376 & 0xFF00FF) + (local384 & 0xFF00FF);
								@Pc(1809) int local1809 = (local910 & 0x1000100) + (local392 - local910 & 0x10000);
								local250[local52] = local392 - local1809 | local1809 - (local1809 >>> 8);
								local246[local52] = (float) arg2;
							}
						}
						local6 += local32;
						local52++;
					}
					local8 += local38;
					local6 = local340;
					local52 += local144;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg5 == 1) {
			local257 = local6;
			for (local260 = -arg4; local260 < 0; local260++) {
				local268 = (local8 >> 16) * super.anInt7883;
				for (local271 = -arg3; local271 < 0; local271++) {
					if ((float) arg2 < local246[local52]) {
						local250[local52] = this.anIntArray407[(local6 >> 16) + local268];
						local246[local52] = (float) arg2;
					}
					local6 += local32;
					local52++;
				}
				local8 += local38;
				local6 = local257;
				local52 += local144;
			}
		} else if (arg5 == 0) {
			local257 = arg6 >> 16 & 0xFF;
			local260 = arg6 >> 8 & 0xFF;
			local268 = arg6 & 0xFF;
			local271 = local6;
			for (local340 = -arg4; local340 < 0; local340++) {
				local348 = (local8 >> 16) * super.anInt7883;
				for (local351 = -arg3; local351 < 0; local351++) {
					if ((float) arg2 < local246[local52]) {
						local368 = this.anIntArray407[(local6 >> 16) + local348];
						local376 = (local368 & 0xFF0000) * local257 & 0xFF000000;
						local384 = (local368 & 0xFF00) * local260 & 0xFF0000;
						local392 = (local368 & 0xFF) * local268 & 0xFF00;
						local250[local52] = (local376 | local384 | local392) >>> 8;
						local246[local52] = (float) arg2;
					}
					local6 += local32;
					local52++;
				}
				local8 += local38;
				local6 = local271;
				local52 += local144;
			}
		} else if (arg5 == 3) {
			local257 = local6;
			for (local260 = -arg4; local260 < 0; local260++) {
				local268 = (local8 >> 16) * super.anInt7883;
				for (local271 = -arg3; local271 < 0; local271++) {
					if ((float) arg2 < local246[local52]) {
						local340 = this.anIntArray407[(local6 >> 16) + local268];
						local348 = local340 + arg6;
						local351 = (local340 & 0xFF00FF) + (arg6 & 0xFF00FF);
						local368 = (local351 & 0x1000100) + (local348 - local351 & 0x10000);
						local250[local52] = local348 - local368 | local368 - (local368 >>> 8);
						local246[local52] = (float) arg2;
					}
					local6 += local32;
					local52++;
				}
				local8 += local38;
				local6 = local257;
				local52 += local144;
			}
		} else if (arg5 == 2) {
			local257 = arg6 >>> 24;
			local260 = 256 - local257;
			local268 = (arg6 & 0xFF00FF) * local260 & 0xFF00FF00;
			local271 = (arg6 & 0xFF00) * local260 & 0xFF0000;
			local559 = (local268 | local271) >>> 8;
			local340 = local6;
			for (local348 = -arg4; local348 < 0; local348++) {
				local351 = (local8 >> 16) * super.anInt7883;
				for (local368 = -arg3; local368 < 0; local368++) {
					if ((float) arg2 < local246[local52]) {
						local376 = this.anIntArray407[(local6 >> 16) + local351];
						local268 = (local376 & 0xFF00FF) * local257 & 0xFF00FF00;
						local271 = (local376 & 0xFF00) * local257 & 0xFF0000;
						local250[local52] = ((local268 | local271) >>> 8) + local559;
						local246[local52] = (float) arg2;
					}
					local6 += local32;
					local52++;
				}
				local8 += local38;
				local6 = local340;
				local52 += local144;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass137_Sub2_10.method6715()) {
			throw new IllegalStateException();
		}
		@Pc(11) int local11 = super.aClass137_Sub2_10.anInt8058;
		arg0 += super.anInt7887;
		arg1 += super.anInt7903;
		@Pc(27) int local27 = arg1 * local11 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = super.anInt7886;
		@Pc(35) int local35 = super.anInt7883;
		@Pc(39) int local39 = local11 - local35;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52;
		if (arg1 < super.aClass137_Sub2_10.anInt8047) {
			local52 = super.aClass137_Sub2_10.anInt8047 - arg1;
			local32 -= local52;
			arg1 = super.aClass137_Sub2_10.anInt8047;
			local29 = local52 * local35;
			local27 += local52 * local11;
		}
		if (arg1 + local32 > super.aClass137_Sub2_10.anInt8044) {
			local32 -= arg1 + local32 - super.aClass137_Sub2_10.anInt8044;
		}
		if (arg0 < super.aClass137_Sub2_10.anInt8067) {
			local52 = super.aClass137_Sub2_10.anInt8067 - arg0;
			local35 -= local52;
			arg0 = super.aClass137_Sub2_10.anInt8067;
			local29 += local52;
			local27 += local52;
			local41 = local52;
			local39 += local52;
		}
		if (arg0 + local35 > super.aClass137_Sub2_10.anInt8066) {
			local52 = arg0 + local35 - super.aClass137_Sub2_10.anInt8066;
			local35 -= local52;
			local41 += local52;
			local39 += local52;
		}
		if (local35 <= 0 || local32 <= 0) {
			return;
		}
		@Pc(160) int[] local160 = super.aClass137_Sub2_10.anIntArray612;
		@Pc(168) int local168;
		@Pc(175) int local175;
		@Pc(259) int local259;
		@Pc(262) int local262;
		@Pc(266) int local266;
		@Pc(273) int local273;
		@Pc(281) int local281;
		@Pc(289) int local289;
		@Pc(297) int local297;
		@Pc(423) int local423;
		if (arg4 != 0) {
			@Pc(739) int local739;
			@Pc(747) int local747;
			@Pc(759) int local759;
			if (arg4 == 1) {
				if (arg2 == 1) {
					for (local168 = -local32; local168 < 0; local168++) {
						local175 = local27 + local35 - 3;
						while (local27 < local175) {
							local259 = this.anIntArray407[local29++];
							if (local259 == 0) {
								local27++;
							} else {
								local160[local27++] = local259;
							}
							local259 = this.anIntArray407[local29++];
							if (local259 == 0) {
								local27++;
							} else {
								local160[local27++] = local259;
							}
							local259 = this.anIntArray407[local29++];
							if (local259 == 0) {
								local27++;
							} else {
								local160[local27++] = local259;
							}
							local259 = this.anIntArray407[local29++];
							if (local259 == 0) {
								local27++;
							} else {
								local160[local27++] = local259;
							}
						}
						local175 += 3;
						while (local27 < local175) {
							local259 = this.anIntArray407[local29++];
							if (local259 == 0) {
								local27++;
							} else {
								local160[local27++] = local259;
							}
						}
						local27 += local39;
						local29 += local41;
					}
				} else if (arg2 == 0) {
					if ((arg3 & 0xFFFFFF) == 16777215) {
						local168 = arg3 >>> 24;
						local175 = 256 - local168;
						for (local259 = -local32; local259 < 0; local259++) {
							for (local262 = -local35; local262 < 0; local262++) {
								local266 = this.anIntArray407[local29++];
								if (local266 == 0) {
									local27++;
								} else {
									local273 = local160[local27];
									local160[local27++] = ((local266 & 0xFF00FF) * local168 + (local273 & 0xFF00FF) * local175 & 0xFF00FF00) + ((local266 & 0xFF00) * local168 + (local273 & 0xFF00) * local175 & 0xFF0000) >> 8;
								}
							}
							local27 += local39;
							local29 += local41;
						}
					} else {
						local168 = arg3 >> 16 & 0xFF;
						local175 = arg3 >> 8 & 0xFF;
						local259 = arg3 & 0xFF;
						local262 = arg3 >>> 24;
						local266 = 256 - local262;
						for (local273 = -local32; local273 < 0; local273++) {
							for (local281 = -local35; local281 < 0; local281++) {
								local289 = this.anIntArray407[local29++];
								if (local289 == 0) {
									local27++;
								} else if (local262 == 255) {
									local297 = (local289 & 0xFF0000) * local168 & 0xFF000000;
									local739 = (local289 & 0xFF00) * local175 & 0xFF0000;
									local747 = (local289 & 0xFF) * local259 & 0xFF00;
									local160[local27++] = (local297 | local739 | local747) >>> 8;
								} else {
									local297 = (local289 & 0xFF0000) * local168 & 0xFF000000;
									local739 = (local289 & 0xFF00) * local175 & 0xFF0000;
									local747 = (local289 & 0xFF) * local259 & 0xFF00;
									local289 = (local297 | local739 | local747) >>> 8;
									local759 = local160[local27];
									local160[local27++] = ((local289 & 0xFF00FF) * local262 + (local759 & 0xFF00FF) * local266 & 0xFF00FF00) + ((local289 & 0xFF00) * local262 + (local759 & 0xFF00) * local266 & 0xFF0000) >> 8;
								}
							}
							local27 += local39;
							local29 += local41;
						}
					}
				} else if (arg2 == 3) {
					local168 = arg3 >>> 24;
					local175 = 256 - local168;
					for (local259 = -local32; local259 < 0; local259++) {
						for (local262 = -local35; local262 < 0; local262++) {
							local266 = this.anIntArray407[local29++];
							local273 = local266 + arg3;
							local281 = (local266 & 0xFF00FF) + (arg3 & 0xFF00FF);
							local289 = (local281 & 0x1000100) + (local273 - local281 & 0x10000);
							local289 = local273 - local289 | local289 - (local289 >>> 8);
							if (local266 == 0 && local168 != 255) {
								local266 = local289;
								local289 = local160[local27];
								local289 = ((local266 & 0xFF00FF) * local168 + (local289 & 0xFF00FF) * local175 & 0xFF00FF00) + ((local266 & 0xFF00) * local168 + (local289 & 0xFF00) * local175 & 0xFF0000) >> 8;
							}
							local160[local27++] = local289;
						}
						local27 += local39;
						local29 += local41;
					}
				} else if (arg2 == 2) {
					local168 = arg3 >>> 24;
					local175 = 256 - local168;
					local259 = (arg3 & 0xFF00FF) * local175 & 0xFF00FF00;
					local262 = (arg3 & 0xFF00) * local175 & 0xFF0000;
					local423 = (local259 | local262) >>> 8;
					for (local266 = -local32; local266 < 0; local266++) {
						for (local273 = -local35; local273 < 0; local273++) {
							local281 = this.anIntArray407[local29++];
							if (local281 == 0) {
								local27++;
							} else {
								local259 = (local281 & 0xFF00FF) * local168 & 0xFF00FF00;
								local262 = (local281 & 0xFF00) * local168 & 0xFF0000;
								local160[local27++] = ((local259 | local262) >>> 8) + local423;
							}
						}
						local27 += local39;
						local29 += local41;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg4 != 2) {
				throw new IllegalArgumentException();
			} else if (arg2 == 1) {
				for (local168 = -local32; local168 < 0; local168++) {
					for (local175 = -local35; local175 < 0; local175++) {
						local259 = this.anIntArray407[local29++];
						if (local259 == 0) {
							local27++;
						} else {
							local262 = local160[local27];
							local266 = local259 + local262;
							local273 = (local259 & 0xFF00FF) + (local262 & 0xFF00FF);
							local262 = (local273 & 0x1000100) + (local266 - local273 & 0x10000);
							local160[local27++] = local266 - local262 | local262 - (local262 >>> 8);
						}
					}
					local27 += local39;
					local29 += local41;
				}
			} else if (arg2 == 0) {
				local168 = arg3 >> 16 & 0xFF;
				local175 = arg3 >> 8 & 0xFF;
				local259 = arg3 & 0xFF;
				for (local262 = -local32; local262 < 0; local262++) {
					for (local266 = -local35; local266 < 0; local266++) {
						local273 = this.anIntArray407[local29++];
						if (local273 == 0) {
							local27++;
						} else {
							local281 = (local273 & 0xFF0000) * local168 & 0xFF000000;
							local289 = (local273 & 0xFF00) * local175 & 0xFF0000;
							local297 = (local273 & 0xFF) * local259 & 0xFF00;
							local273 = (local281 | local289 | local297) >>> 8;
							local739 = local160[local27];
							local747 = local273 + local739;
							local759 = (local273 & 0xFF00FF) + (local739 & 0xFF00FF);
							local739 = (local759 & 0x1000100) + (local747 - local759 & 0x10000);
							local160[local27++] = local747 - local739 | local739 - (local739 >>> 8);
						}
					}
					local27 += local39;
					local29 += local41;
				}
			} else if (arg2 == 3) {
				for (local168 = -local32; local168 < 0; local168++) {
					for (local175 = -local35; local175 < 0; local175++) {
						local259 = this.anIntArray407[local29++];
						local262 = local259 + arg3;
						local266 = (local259 & 0xFF00FF) + (arg3 & 0xFF00FF);
						local273 = (local266 & 0x1000100) + (local262 - local266 & 0x10000);
						local259 = local262 - local273 | local273 - (local273 >>> 8);
						local273 = local160[local27];
						local262 = local259 + local273;
						local266 = (local259 & 0xFF00FF) + (local273 & 0xFF00FF);
						local273 = (local266 & 0x1000100) + (local262 - local266 & 0x10000);
						local160[local27++] = local262 - local273 | local273 - (local273 >>> 8);
					}
					local27 += local39;
					local29 += local41;
				}
			} else if (arg2 == 2) {
				local168 = arg3 >>> 24;
				local175 = 256 - local168;
				local259 = (arg3 & 0xFF00FF) * local175 & 0xFF00FF00;
				local262 = (arg3 & 0xFF00) * local175 & 0xFF0000;
				local423 = (local259 | local262) >>> 8;
				for (local266 = -local32; local266 < 0; local266++) {
					for (local273 = -local35; local273 < 0; local273++) {
						local281 = this.anIntArray407[local29++];
						if (local281 == 0) {
							local27++;
						} else {
							local259 = (local281 & 0xFF00FF) * local168 & 0xFF00FF00;
							local262 = (local281 & 0xFF00) * local168 & 0xFF0000;
							local281 = ((local259 | local262) >>> 8) + local423;
							local289 = local160[local27];
							local297 = local281 + local289;
							local739 = (local281 & 0xFF00FF) + (local289 & 0xFF00FF);
							@Pc(1462) int local1462 = (local739 & 0x1000100) + (local297 - local739 & 0x10000);
							local160[local27++] = local297 - local1462 | local1462 - (local1462 >>> 8);
						}
					}
					local27 += local39;
					local29 += local41;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg2 == 1) {
			for (local168 = -local32; local168 < 0; local168++) {
				local175 = local27 + local35 - 3;
				while (local27 < local175) {
					local160[local27++] = this.anIntArray407[local29++];
					local160[local27++] = this.anIntArray407[local29++];
					local160[local27++] = this.anIntArray407[local29++];
					local160[local27++] = this.anIntArray407[local29++];
				}
				local175 += 3;
				while (local27 < local175) {
					local160[local27++] = this.anIntArray407[local29++];
				}
				local27 += local39;
				local29 += local41;
			}
		} else if (arg2 == 0) {
			local168 = arg3 >> 16 & 0xFF;
			local175 = arg3 >> 8 & 0xFF;
			local259 = arg3 & 0xFF;
			for (local262 = -local32; local262 < 0; local262++) {
				for (local266 = -local35; local266 < 0; local266++) {
					local273 = this.anIntArray407[local29++];
					local281 = (local273 & 0xFF0000) * local168 & 0xFF000000;
					local289 = (local273 & 0xFF00) * local175 & 0xFF0000;
					local297 = (local273 & 0xFF) * local259 & 0xFF00;
					local160[local27++] = (local281 | local289 | local297) >>> 8;
				}
				local27 += local39;
				local29 += local41;
			}
		} else if (arg2 == 3) {
			for (local168 = -local32; local168 < 0; local168++) {
				for (local175 = -local35; local175 < 0; local175++) {
					local259 = this.anIntArray407[local29++];
					local262 = local259 + arg3;
					local266 = (local259 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local273 = (local266 & 0x1000100) + (local262 - local266 & 0x10000);
					local160[local27++] = local262 - local273 | local273 - (local273 >>> 8);
				}
				local27 += local39;
				local29 += local41;
			}
		} else if (arg2 == 2) {
			local168 = arg3 >>> 24;
			local175 = 256 - local168;
			local259 = (arg3 & 0xFF00FF) * local175 & 0xFF00FF00;
			local262 = (arg3 & 0xFF00) * local175 & 0xFF0000;
			local423 = (local259 | local262) >>> 8;
			for (local266 = -local32; local266 < 0; local266++) {
				for (local273 = -local35; local273 < 0; local273++) {
					local281 = this.anIntArray407[local29++];
					local259 = (local281 & 0xFF00FF) * local168 & 0xFF00FF00;
					local262 = (local281 & 0xFF00) * local168 & 0xFF0000;
					local160[local27++] = ((local259 | local262) >>> 8) + local423;
				}
				local27 += local39;
				local29 += local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)V")
	@Override
	public void method7410(@OriginalArg(2) int arg0) {
		throw new IllegalStateException("Can't capture alpha into a java_sprite_24");
	}
}
