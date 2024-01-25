import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bba", name = "Lb", descriptor = "[Lclient!lda;")
	public static Class98_Sub1[] aClass98_Sub1Array4;

	@OriginalMember(owner = "client!bba", name = "Y", descriptor = "I")
	public static int anInt10742 = 765;

	@OriginalMember(owner = "client!bba", name = "kb", descriptor = "Lclient!dha;")
	public static final Class74 aClass74_15 = new Class74();

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZLclient!bba;Z)V")
	public static void method9312(@OriginalArg(1) Class28_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class359 local9 = arg0.method9315();
		if (arg0.anInt10812 == 0) {
			Static88.anInt1724 = -1;
			Static69.anInt1321 = 0;
			arg0.anInt10811 = 0;
			return;
		}
		if (arg0.anInt10773 != -1 && arg0.anInt10775 == 0) {
			@Pc(33) Class372 local33 = Static243.aClass343_3.method8356(arg0.anInt10773);
			if (arg0.anInt10814 > 0 && local33.anInt10244 == 0) {
				arg0.anInt10811++;
				Static69.anInt1321 = 0;
				Static88.anInt1724 = -1;
				return;
			}
			if (arg0.anInt10814 <= 0 && local33.anInt10260 == 0) {
				arg0.anInt10811++;
				Static88.anInt1724 = -1;
				Static69.anInt1321 = 0;
				return;
			}
		}
		for (@Pc(75) int local75 = 0; local75 < arg0.aClass280Array3.length; local75++) {
			if (arg0.aClass280Array3[local75].anInt7952 != -1 && arg0.aClass280Array3[local75].anInt7957 <= Static588.anInt9467) {
				@Pc(101) Class144 local101 = Static354.aClass236_2.method5615(arg0.aClass280Array3[local75].anInt7952);
				if (local101.aBoolean324 && local101.anInt4332 != -1) {
					@Pc(114) Class372 local114 = Static243.aClass343_3.method8356(local101.anInt4332);
					if (arg0.anInt10814 > 0 && local114.anInt10244 == 0) {
						Static69.anInt1321 = 0;
						arg0.anInt10811++;
						Static88.anInt1724 = -1;
						return;
					}
					if (arg0.anInt10814 <= 0 && local114.anInt10260 == 0) {
						Static69.anInt1321 = 0;
						arg0.anInt10811++;
						Static88.anInt1724 = -1;
						return;
					}
				}
			}
		}
		@Pc(167) int local167 = arg0.anInt10729;
		@Pc(170) int local170 = arg0.anInt10731;
		@Pc(186) int local186 = arg0.anIntArray956[arg0.anInt10812 - 1] * 512 + arg0.method9314() * 256;
		@Pc(203) int local203 = arg0.anIntArray955[arg0.anInt10812 - 1] * 512 + arg0.method9314() * 256;
		if (local167 >= local186) {
			if (local186 >= local167) {
				if (local203 > local170) {
					arg0.method9308(8192);
				} else if (local170 > local203) {
					arg0.method9308(0);
				}
			} else if (local203 > local170) {
				arg0.method9308(6144);
			} else if (local203 >= local170) {
				arg0.method9308(4096);
			} else {
				arg0.method9308(2048);
			}
		} else if (local203 > local170) {
			arg0.method9308(10240);
		} else if (local170 > local203) {
			arg0.method9308(14336);
		} else {
			arg0.method9308(12288);
		}
		@Pc(305) byte local305 = arg0.aByteArray111[arg0.anInt10812 - 1];
		if (!arg1 && (local186 - local167 > 1024 || local186 - local167 < -1024 || local203 - local170 > 1024 || local203 - local170 < -1024)) {
			arg0.anInt10731 = local203;
			arg0.anInt10729 = local186;
			arg0.method9324(false, arg0.anInt10798);
			if (arg0.anInt10814 > 0) {
				arg0.anInt10814--;
			}
			Static69.anInt1321 = 0;
			Static88.anInt1724 = -1;
			arg0.anInt10812--;
			return;
		}
		@Pc(366) int local366 = 16;
		@Pc(368) boolean local368 = true;
		if (arg0 instanceof Class28_Sub1_Sub1_Sub1_Sub2) {
			local368 = ((Class28_Sub1_Sub1_Sub1_Sub2) arg0).aClass300_1.aBoolean635;
		}
		@Pc(404) int local404;
		if (local368) {
			local404 = arg0.anInt10798 - arg0.aClass282_7.anInt8022;
			if (local404 != 0 && arg0.anInt10743 == -1 && arg0.anInt10745 != 0) {
				local366 = 8;
			}
			if (!arg1 && arg0.anInt10812 > 2) {
				local366 = 24;
			}
			if (!arg1 && arg0.anInt10812 > 3) {
				local366 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt10812 > 1) {
				local366 = 24;
			}
			if (!arg1 && arg0.anInt10812 > 2) {
				local366 = 32;
			}
		}
		if (arg0.anInt10811 > 0 && arg0.anInt10812 > 1) {
			local366 = 32;
			arg0.anInt10811--;
		}
		if (local305 == 2) {
			local366 <<= 0x1;
		} else if (local305 == 0) {
			local366 >>= 0x1;
		}
		if (local9.anInt10007 != -1) {
			local366 <<= 0x9;
			if (arg0.anInt10812 == 1) {
				local404 = arg0.anInt10813 * arg0.anInt10813;
				@Pc(508) int local508 = (arg0.anInt10729 > local186 ? arg0.anInt10729 - local186 : -arg0.anInt10729 + local186) << 9;
				@Pc(528) int local528 = (arg0.anInt10731 > local203 ? arg0.anInt10731 - local203 : local203 - arg0.anInt10731) << 9;
				@Pc(539) int local539 = local508 <= local528 ? local528 : local508;
				@Pc(546) int local546 = local9.anInt10007 * 2 * local539;
				if (local404 > local546) {
					arg0.anInt10813 /= 2;
				} else if (local539 < local404 / 2) {
					arg0.anInt10813 -= local9.anInt10007;
					if (arg0.anInt10813 < 0) {
						arg0.anInt10813 = 0;
					}
				} else if (local366 > arg0.anInt10813) {
					arg0.anInt10813 += local9.anInt10007;
					if (local366 < arg0.anInt10813) {
						arg0.anInt10813 = local366;
					}
				}
			} else if (local366 > arg0.anInt10813) {
				arg0.anInt10813 += local9.anInt10007;
				if (arg0.anInt10813 > local366) {
					arg0.anInt10813 = local366;
				}
			} else if (arg0.anInt10813 > 0) {
				arg0.anInt10813 -= local9.anInt10007;
				if (arg0.anInt10813 < 0) {
					arg0.anInt10813 = 0;
				}
			}
			local366 = arg0.anInt10813 >> 9;
			if (local366 < 1) {
				local366 = 1;
			}
		}
		Static69.anInt1321 = 0;
		if (local186 == local167 && local170 == local203) {
			Static88.anInt1724 = -1;
		} else {
			if (local186 > local167) {
				arg0.anInt10729 += local366;
				Static69.anInt1321 |= 0x4;
				if (arg0.anInt10729 > local186) {
					arg0.anInt10729 = local186;
				}
			} else if (local167 > local186) {
				arg0.anInt10729 -= local366;
				Static69.anInt1321 |= 0x8;
				if (local186 > arg0.anInt10729) {
					arg0.anInt10729 = local186;
				}
			}
			if (local203 > local170) {
				arg0.anInt10731 += local366;
				Static69.anInt1321 |= 0x1;
				if (local203 < arg0.anInt10731) {
					arg0.anInt10731 = local203;
				}
			} else if (local170 > local203) {
				arg0.anInt10731 -= local366;
				Static69.anInt1321 |= 0x2;
				if (local203 > arg0.anInt10731) {
					arg0.anInt10731 = local203;
				}
			}
			if (local366 < 32) {
				Static88.anInt1724 = local305;
			} else {
				Static88.anInt1724 = 2;
			}
		}
		if (arg0.anInt10729 == local186 && arg0.anInt10731 == local203) {
			if (arg0.anInt10814 > 0) {
				arg0.anInt10814--;
			}
			arg0.anInt10812--;
		}
	}
}
