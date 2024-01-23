import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
	public static int anInt3940;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Lclient!ph;")
	public static Class138 aClass138_51;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public static void method3151() {
		Static104.aClass1_Sub1_Sub3_2 = null;
		Static136.anInt2697 = -1;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!nf;Ljava/awt/Frame;I)V")
	public static void method3152(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(11) Class10 local11 = arg0.method2998(arg1);
			while (local11.anInt151 == 0) {
				Static202.method3246(10L);
			}
			if (local11.anInt151 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static202.method3246(100L);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)Lclient!gm;")
	public static Class66 method3155(@OriginalArg(1) int arg0) {
		@Pc(10) Class66 local10 = (Class66) Static168.aClass169_164.method4017((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static230.aClass138_59.method3346(3, arg0);
		local10 = new Class66();
		if (local25 != null) {
			local10.method1373(new Class1_Sub14(local25));
		}
		Static168.aClass169_164.method4016(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!gj;)V")
	public static void method3156(@OriginalArg(1) Class22_Sub3 arg0) {
		arg0.aBoolean332 = false;
		@Pc(14) Class167 local14;
		if (arg0.anInt4566 != -1) {
			local14 = Static313.method4648(arg0.anInt4566);
			if (local14 == null || local14.anIntArray461 == null) {
				arg0.anInt4566 = -1;
			} else {
				arg0.anInt4576++;
				if (local14.anIntArray461.length > arg0.anInt4635 && local14.anIntArray463[arg0.anInt4635] < arg0.anInt4576) {
					arg0.anInt4612++;
					arg0.anInt4576 = 1;
					arg0.anInt4635++;
					Static212.method3338(arg0.anInt4601, arg0 == Static229.aClass22_Sub3_Sub2_2, arg0.anInt4635, local14, arg0.anInt4623);
				}
				if (local14.anIntArray461.length <= arg0.anInt4635) {
					arg0.anInt4576 = 0;
					arg0.anInt4635 = 0;
					Static212.method3338(arg0.anInt4601, arg0 == Static229.aClass22_Sub3_Sub2_2, arg0.anInt4635, local14, arg0.anInt4623);
				}
				arg0.anInt4612 = arg0.anInt4635 + 1;
				if (arg0.anInt4612 >= local14.anIntArray461.length) {
					arg0.anInt4612 = 0;
				}
			}
		}
		@Pc(148) int local148;
		if (arg0.anInt4562 != -1 && arg0.anInt4575 <= Static37.anInt757) {
			@Pc(145) Class97 local145 = Static239.method3759(arg0.anInt4562);
			local148 = local145.anInt2712;
			if (local148 == -1) {
				arg0.anInt4562 = -1;
			} else {
				label307: {
					@Pc(155) Class167 local155 = Static313.method4648(local148);
					if (local145.aBoolean196) {
						if (local155.anInt5121 == 3) {
							if (arg0.anInt4589 > 0 && arg0.anInt4600 <= Static37.anInt757 && arg0.anInt4586 < Static37.anInt757) {
								arg0.anInt4562 = -1;
								break label307;
							}
						} else if (local155.anInt5121 == 1 && arg0.anInt4589 > 0 && arg0.anInt4600 <= Static37.anInt757 && arg0.anInt4586 < Static37.anInt757) {
							arg0.anInt4575 = Static37.anInt757 + 1;
							break label307;
						}
					}
					if (local155 == null || local155.anIntArray461 == null) {
						arg0.anInt4562 = -1;
					} else {
						if (arg0.anInt4619 < 0) {
							arg0.anInt4619 = 0;
							Static212.method3338(arg0.anInt4601, Static229.aClass22_Sub3_Sub2_2 == arg0, 0, local155, arg0.anInt4623);
						}
						arg0.anInt4596++;
						if (local155.anIntArray461.length > arg0.anInt4619 && local155.anIntArray463[arg0.anInt4619] < arg0.anInt4596) {
							arg0.anInt4619++;
							arg0.anInt4596 = 1;
							Static212.method3338(arg0.anInt4601, arg0 == Static229.aClass22_Sub3_Sub2_2, arg0.anInt4619, local155, arg0.anInt4623);
						}
						if (arg0.anInt4619 >= local155.anIntArray461.length) {
							if (local145.aBoolean196) {
								arg0.anInt4619 -= local155.anInt5122;
								arg0.anInt4606++;
								if (arg0.anInt4606 >= local155.anInt5124) {
									arg0.anInt4562 = -1;
								} else if (arg0.anInt4619 >= 0 && local155.anIntArray461.length > arg0.anInt4619) {
									Static212.method3338(arg0.anInt4601, Static229.aClass22_Sub3_Sub2_2 == arg0, arg0.anInt4619, local155, arg0.anInt4623);
								} else {
									arg0.anInt4562 = -1;
								}
							} else {
								arg0.anInt4562 = -1;
							}
						}
						arg0.anInt4607 = arg0.anInt4619 + 1;
						if (arg0.anInt4607 >= local155.anIntArray461.length) {
							if (local145.aBoolean196) {
								arg0.anInt4607 -= local155.anInt5122;
								if (arg0.anInt4606 + 1 >= local155.anInt5124) {
									arg0.anInt4607 = -1;
								} else if (arg0.anInt4607 < 0 || local155.anIntArray461.length <= arg0.anInt4607) {
									arg0.anInt4607 = -1;
								}
							} else {
								arg0.anInt4607 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4642 != -1 && arg0.anInt4632 <= 1) {
			local14 = Static313.method4648(arg0.anInt4642);
			if (local14.anInt5121 == 3) {
				if (arg0.anInt4589 > 0 && arg0.anInt4600 <= Static37.anInt757 && arg0.anInt4586 < Static37.anInt757) {
					arg0.anInt4642 = -1;
				}
			} else if (local14.anInt5121 == 1 && arg0.anInt4589 > 0 && arg0.anInt4600 <= Static37.anInt757 && arg0.anInt4586 < Static37.anInt757) {
				arg0.anInt4632 = 2;
			}
		}
		if (arg0.anInt4642 != -1 && arg0.anInt4632 == 0) {
			@Pc(510) Class167 local510 = Static313.method4648(arg0.anInt4642);
			if (local510 == null || local510.anIntArray461 == null) {
				arg0.anInt4642 = -1;
			} else {
				arg0.anInt4645++;
				if (local510.anIntArray461.length > arg0.anInt4597 && arg0.anInt4645 > local510.anIntArray463[arg0.anInt4597]) {
					arg0.anInt4597++;
					arg0.anInt4645 = 1;
					Static212.method3338(arg0.anInt4601, arg0 == Static229.aClass22_Sub3_Sub2_2, arg0.anInt4597, local510, arg0.anInt4623);
				}
				if (local510.anIntArray461.length <= arg0.anInt4597) {
					arg0.anInt4597 -= local510.anInt5122;
					arg0.anInt4567++;
					if (local510.anInt5124 <= arg0.anInt4567) {
						arg0.anInt4642 = -1;
					} else if (arg0.anInt4597 >= 0 && local510.anIntArray461.length > arg0.anInt4597) {
						Static212.method3338(arg0.anInt4601, Static229.aClass22_Sub3_Sub2_2 == arg0, arg0.anInt4597, local510, arg0.anInt4623);
					} else {
						arg0.anInt4642 = -1;
					}
				}
				arg0.anInt4609 = arg0.anInt4597 + 1;
				if (arg0.anInt4609 >= local510.anIntArray461.length) {
					arg0.anInt4609 -= local510.anInt5122;
					if (local510.anInt5124 <= arg0.anInt4567 + 1) {
						arg0.anInt4609 = -1;
					} else if (arg0.anInt4609 < 0 || local510.anIntArray461.length <= arg0.anInt4609) {
						arg0.anInt4609 = -1;
					}
				}
				arg0.aBoolean332 = local510.aBoolean365;
			}
		}
		if (arg0.anInt4632 > 0) {
			arg0.anInt4632--;
		}
		for (local148 = 0; local148 < arg0.aClass53Array3.length; local148++) {
			@Pc(723) Class53 local723 = arg0.aClass53Array3[local148];
			if (local723 != null) {
				if (local723.anInt1425 > 0) {
					local723.anInt1425--;
				} else {
					@Pc(744) Class167 local744 = Static313.method4648(local723.anInt1420);
					if (local744 == null || local744.anIntArray461 == null) {
						arg0.aClass53Array3[local148] = null;
					} else {
						local723.anInt1424++;
						if (local744.anIntArray461.length > local723.anInt1422 && local744.anIntArray463[local723.anInt1422] < local723.anInt1424) {
							local723.anInt1422++;
							local723.anInt1424 = 1;
							Static212.method3338(arg0.anInt4601, Static229.aClass22_Sub3_Sub2_2 == arg0, local723.anInt1422, local744, arg0.anInt4623);
						}
						if (local744.anIntArray461.length <= local723.anInt1422) {
							local723.anInt1422 -= local744.anInt5122;
							local723.anInt1423++;
							if (local744.anInt5124 <= local723.anInt1423) {
								arg0.aClass53Array3[local148] = null;
							} else if (local723.anInt1422 >= 0 && local744.anIntArray461.length > local723.anInt1422) {
								Static212.method3338(arg0.anInt4601, arg0 == Static229.aClass22_Sub3_Sub2_2, local723.anInt1422, local744, arg0.anInt4623);
							} else {
								arg0.aClass53Array3[local148] = null;
							}
						}
						local723.anInt1421 = local723.anInt1422 + 1;
						if (local723.anInt1421 >= local744.anIntArray461.length) {
							local723.anInt1421 -= local744.anInt5122;
							if (local744.anInt5124 <= local723.anInt1423 + 1) {
								local723.anInt1421 = -1;
							} else if (local723.anInt1421 < 0 || local744.anIntArray461.length <= local723.anInt1421) {
								local723.anInt1421 = -1;
							}
						}
					}
				}
			}
		}
	}
}
