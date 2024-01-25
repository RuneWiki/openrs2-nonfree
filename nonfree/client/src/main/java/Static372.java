import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!t", name = "k", descriptor = "[I")
	public static int[] anIntArray460;

	@OriginalMember(owner = "client!t", name = "u", descriptor = "I")
	public static int anInt6696;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_89 = new Class267("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!t", name = "n", descriptor = "[I")
	public static final int[] anIntArray461 = new int[1000];

	@OriginalMember(owner = "client!t", name = "t", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_342 = new Class123(7, 2);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZILclient!bn;)V")
	public static void method5571(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub2_Sub1 arg1) {
		@Pc(9) Class246 local9 = arg1.method5513();
		if (arg1.anInt6613 == 0) {
			arg1.anInt6612 = 0;
			Static329.anInt5689 = -1;
			Static245.anInt4506 = 0;
			return;
		}
		if (arg1.lb != -1 && arg1.anInt6557 == 0) {
			@Pc(36) Class131 local36 = Static5.aClass217_1.method5234(arg1.lb);
			if (arg1.anInt6611 > 0 && local36.anInt3708 == 0) {
				arg1.anInt6612++;
				Static329.anInt5689 = -1;
				Static245.anInt4506 = 0;
				return;
			}
			if (arg1.anInt6611 <= 0 && local36.anInt3706 == 0) {
				arg1.anInt6612++;
				Static245.anInt4506 = 0;
				Static329.anInt5689 = -1;
				return;
			}
		}
		@Pc(109) Class131 local109;
		@Pc(96) Class58 local96;
		if (arg1.anInt6609 != -1 && Static66.anInt1741 >= arg1.anInt6545) {
			local96 = Static141.aClass141_2.method3177(arg1.anInt6609);
			if (local96.aBoolean141 && local96.anInt2019 != -1) {
				local109 = Static5.aClass217_1.method5234(local96.anInt2019);
				if (arg1.anInt6611 > 0 && local109.anInt3708 == 0) {
					arg1.anInt6612++;
					Static329.anInt5689 = -1;
					Static245.anInt4506 = 0;
					return;
				}
				if (arg1.anInt6611 <= 0 && local109.anInt3706 == 0) {
					arg1.anInt6612++;
					Static329.anInt5689 = -1;
					Static245.anInt4506 = 0;
					return;
				}
			}
		}
		if (arg1.anInt6609 != -1 && arg1.anInt6545 <= Static66.anInt1741) {
			local96 = Static141.aClass141_2.method3177(arg1.anInt6609);
			if (local96.aBoolean141 && local96.anInt2019 != -1) {
				local109 = Static5.aClass217_1.method5234(local96.anInt2019);
				if (arg1.anInt6611 > 0 && local109.anInt3708 == 0) {
					Static329.anInt5689 = -1;
					Static245.anInt4506 = 0;
					arg1.anInt6612++;
					return;
				}
				if (arg1.anInt6611 <= 0 && local109.anInt3706 == 0) {
					arg1.anInt6612++;
					Static245.anInt4506 = 0;
					Static329.anInt5689 = -1;
					return;
				}
			}
		}
		@Pc(224) int local224 = arg1.anInt7202;
		@Pc(227) int local227 = arg1.anInt7207;
		@Pc(244) int local244 = arg1.anIntArray458[arg1.anInt6613 - 1] * 128 + arg1.method5521() * 64;
		@Pc(261) int local261 = arg1.anIntArray459[arg1.anInt6613 - 1] * 128 + arg1.method5521() * 64;
		if (local224 >= local244) {
			if (local244 < local224) {
				if (local227 < local261) {
					arg1.method5523(6144);
				} else if (local261 < local227) {
					arg1.method5523(2048);
				} else {
					arg1.method5523(4096);
				}
			} else if (local227 < local261) {
				arg1.method5523(8192);
			} else if (local261 < local227) {
				arg1.method5523(0);
			}
		} else if (local227 < local261) {
			arg1.method5523(10240);
		} else if (local261 < local227) {
			arg1.method5523(14336);
		} else {
			arg1.method5523(12288);
		}
		@Pc(355) byte local355 = arg1.aByteArray85[arg1.anInt6613 - 1];
		if (!arg0 && (local244 - local224 > 256 || local244 - local224 < -256 || local261 - local227 > 256 || local261 - local227 < -256)) {
			arg1.anInt7202 = local244;
			arg1.anInt7207 = local261;
			arg1.method5517(arg1.anInt6583);
			arg1.anInt6613--;
			Static245.anInt4506 = 0;
			Static329.anInt5689 = -1;
			if (arg1.anInt6611 > 0) {
				arg1.anInt6611--;
			}
			return;
		}
		@Pc(422) int local422 = 4;
		@Pc(424) boolean local424 = true;
		if (arg1 instanceof Class3_Sub2_Sub1_Sub1) {
			local424 = ((Class3_Sub2_Sub1_Sub1) arg1).aClass48_1.aBoolean134;
		}
		@Pc(464) int local464;
		if (local424) {
			local464 = arg1.anInt6583 - arg1.aClass214_7.anInt5929;
			if (local464 != 0 && arg1.anInt6569 == -1 && arg1.anInt6571 != 0) {
				local422 = 2;
			}
			if (!arg0 && arg1.anInt6613 > 2) {
				local422 = 6;
			}
			if (!arg0 && arg1.anInt6613 > 3) {
				local422 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt6613 > 1) {
				local422 = 6;
			}
			if (!arg0 && arg1.anInt6613 > 2) {
				local422 = 8;
			}
		}
		if (arg1.anInt6612 > 0 && arg1.anInt6613 > 1) {
			arg1.anInt6612--;
			local422 = 8;
		}
		if (local355 == 2) {
			local422 <<= 0x1;
		} else if (local355 == 0) {
			local422 >>= 0x1;
		}
		if (local9.anInt7295 != -1) {
			local422 <<= 0x7;
			if (arg1.anInt6613 == 1) {
				local464 = arg1.anInt6610 * arg1.anInt6610;
				@Pc(564) int local564 = (arg1.anInt7202 <= local244 ? local244 - arg1.anInt7202 : arg1.anInt7202 - local244) << 7;
				@Pc(582) int local582 = (local261 >= arg1.anInt7207 ? local261 - arg1.anInt7207 : -local261 + arg1.anInt7207) << 7;
				@Pc(589) int local589 = local582 >= local564 ? local582 : local564;
				@Pc(596) int local596 = local589 * local9.anInt7295 * 2;
				if (local596 < local464) {
					arg1.anInt6610 /= 2;
				} else if (local589 < local464 / 2) {
					arg1.anInt6610 -= local9.anInt7295;
					if (arg1.anInt6610 < 0) {
						arg1.anInt6610 = 0;
					}
				} else if (arg1.anInt6610 < local422) {
					arg1.anInt6610 += local9.anInt7295;
					if (arg1.anInt6610 > local422) {
						arg1.anInt6610 = local422;
					}
				}
			} else if (arg1.anInt6610 < local422) {
				arg1.anInt6610 += local9.anInt7295;
				if (arg1.anInt6610 > local422) {
					arg1.anInt6610 = local422;
				}
			} else if (arg1.anInt6610 > 0) {
				arg1.anInt6610 -= local9.anInt7295;
				if (arg1.anInt6610 < 0) {
					arg1.anInt6610 = 0;
				}
			}
			local422 = arg1.anInt6610 >> 7;
			if (local422 < 1) {
				local422 = 1;
			}
		}
		Static245.anInt4506 = 0;
		if (local244 > local224) {
			Static245.anInt4506 |= 0x4;
			arg1.anInt7202 += local422;
			if (local244 < arg1.anInt7202) {
				arg1.anInt7202 = local244;
			}
		} else if (local224 > local244) {
			Static245.anInt4506 |= 0x8;
			arg1.anInt7202 -= local422;
			if (arg1.anInt7202 < local244) {
				arg1.anInt7202 = local244;
			}
		}
		if (local261 > local227) {
			arg1.anInt7207 += local422;
			Static245.anInt4506 |= 0x1;
			if (local261 < arg1.anInt7207) {
				arg1.anInt7207 = local261;
			}
		} else if (local227 > local261) {
			arg1.anInt7207 -= local422;
			Static245.anInt4506 |= 0x2;
			if (local261 > arg1.anInt7207) {
				arg1.anInt7207 = local261;
			}
		}
		if (local422 >= 8) {
			Static329.anInt5689 = 2;
		} else {
			Static329.anInt5689 = local355;
		}
		if (local244 != arg1.anInt7202 || arg1.anInt7207 != local261) {
			return;
		}
		arg1.anInt6613--;
		if (arg1.anInt6611 > 0) {
			arg1.anInt6611--;
			return;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method5581(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static62.anInt1705 = 7;
		Static168.anInt3377 = 0x1 << Static62.anInt1705;
		Static437.anInt7761 = Static168.anInt3377 >> 1;
		Static70.anInt1833 = (int) Math.sqrt((double) (Static437.anInt7761 * Static437.anInt7761 + Static437.anInt7761 * Static437.anInt7761));
		Static4.anInt7919 = Static168.anInt3377 >> 2;
		Static8.anInt325 = Static168.anInt3377;
		Static229.anInt4189 = arg0;
		Static61.anInt1698 = arg1;
		Static195.anInt7212 = arg2;
		Static223.aClass101ArrayArrayArray2 = new Class101[4][Static229.anInt4189][Static61.anInt1698];
		Static87.aClass86Array2 = new Class86[4];
		if (arg3) {
			Static137.anIntArrayArray15 = new int[Static229.anInt4189][Static61.anInt1698];
			Static316.aByteArrayArray22 = new byte[Static229.anInt4189][Static61.anInt1698];
			Static310.aByteArrayArray21 = new byte[Static229.anInt4189][Static61.anInt1698];
			Static147.aClass101ArrayArrayArray1 = new Class101[1][Static229.anInt4189][Static61.anInt1698];
			Static288.aClass86Array3 = new Class86[1];
		} else {
			Static137.anIntArrayArray15 = null;
			Static316.aByteArrayArray22 = null;
			Static310.aByteArrayArray21 = null;
			Static147.aClass101ArrayArrayArray1 = null;
			Static288.aClass86Array3 = null;
		}
		if (arg4) {
			Static441.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static411.aClass76Array1 = new Class76[65535];
			Static302.aBooleanArray20 = new boolean[65535];
			Static56.anInt1522 = 0;
		} else {
			Static441.aLongArrayArrayArray1 = null;
			Static411.aClass76Array1 = null;
			Static302.aBooleanArray20 = null;
			Static56.anInt1522 = 0;
		}
		Static35.method860(false);
		Static300.aClass16Array4 = new Class16[1000];
		Static386.anInt6859 = 0;
		Static183.aClass16Array3 = new Class16[1000];
		Static127.anInt2702 = 0;
		Static175.anIntArrayArrayArray8 = new int[4][Static229.anInt4189 + 1][Static61.anInt1698 + 1];
		Static81.aClass3_Sub2Array1 = new Class3_Sub2[5000];
		Static96.anInt5952 = 0;
		Static202.aBooleanArrayArray7 = new boolean[Static195.anInt7212 + Static195.anInt7212 + 1][Static195.anInt7212 + Static195.anInt7212 + 1];
		Static59.aBooleanArrayArray4 = new boolean[Static195.anInt7212 + Static195.anInt7212 + 2][Static195.anInt7212 + Static195.anInt7212 + 2];
		Static401.aClass120_1 = null;
	}
}
