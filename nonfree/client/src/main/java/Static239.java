import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!iia", name = "O", descriptor = "I")
	public static int anInt4434;

	@OriginalMember(owner = "client!iia", name = "J", descriptor = "Lclient!pw;")
	public static final Class280 aClass280_3 = new Class280(64);

	@OriginalMember(owner = "client!iia", name = "R", descriptor = "Lclient!hm;")
	public static final Class151 aClass151_5 = new Class151(2, 2);

	@OriginalMember(owner = "client!iia", name = "T", descriptor = "[I")
	public static final int[] anIntArray287 = new int[14];

	@OriginalMember(owner = "client!iia", name = "d", descriptor = "(B)V")
	public static void method3869() {
		for (@Pc(3) int local3 = 0; local3 < Static570.anInt9337; local3++) {
			@Pc(11) int local11 = Static170.anIntArray226[local3];
			@Pc(19) Class16_Sub1_Sub1_Sub3_Sub1 local19 = ((Class2_Sub32) Static514.aClass323_32.method7484((long) local11)).aClass16_Sub1_Sub1_Sub3_Sub1_2;
			@Pc(23) int local23 = Static327.aClass2_Sub17_Sub1_1.method2859();
			if ((local23 & 0x2) != 0) {
				local23 += Static327.aClass2_Sub17_Sub1_1.method2859() << 8;
			}
			if ((local23 & 0x800) != 0) {
				local23 += Static327.aClass2_Sub17_Sub1_1.method2859() << 16;
			}
			@Pc(61) int local61;
			@Pc(64) int[] local64;
			@Pc(67) int[] local67;
			@Pc(72) int local72;
			@Pc(78) int local78;
			if ((local23 & 0x1000) != 0) {
				local61 = Static327.aClass2_Sub17_Sub1_1.method2865();
				local64 = new int[local61];
				local67 = new int[local61];
				@Pc(70) int[] local70 = new int[local61];
				for (local72 = 0; local72 < local61; local72++) {
					local78 = Static327.aClass2_Sub17_Sub1_1.method2854();
					if (local78 == 65535) {
						local78 = -1;
					}
					local64[local72] = local78;
					local67[local72] = Static327.aClass2_Sub17_Sub1_1.method2865();
					local70[local72] = Static327.aClass2_Sub17_Sub1_1.method2863();
				}
				Static342.method5182(local19, local67, local64, local70);
			}
			if ((local23 & 0x80) != 0) {
				local19.aString81 = Static327.aClass2_Sub17_Sub1_1.method2833();
				local19.anInt8125 = 100;
			}
			@Pc(213) int local213;
			@Pc(244) int local244;
			@Pc(137) int local137;
			@Pc(148) int local148;
			@Pc(161) int local161;
			@Pc(175) int[] local175;
			@Pc(201) short[] local201;
			@Pc(232) short[] local232;
			@Pc(271) long local271;
			if ((local23 & 0x4000) != 0) {
				local61 = local19.aClass113_1.anIntArray214.length;
				local137 = 0;
				if (local19.aClass113_1.aShortArray50 != null) {
					local137 = local19.aClass113_1.aShortArray50.length;
				}
				local148 = 0;
				if (local19.aClass113_1.aShortArray49 != null) {
					local148 = local19.aClass113_1.aShortArray49.length;
				}
				local161 = Static327.aClass2_Sub17_Sub1_1.method2859();
				if ((local161 & 0x1) == 1) {
					local19.aClass207_1 = null;
				} else {
					local175 = null;
					if ((local161 & 0x2) == 2) {
						local175 = new int[local61];
						for (local78 = 0; local78 < local61; local78++) {
							local175[local78] = Static327.aClass2_Sub17_Sub1_1.method2854();
						}
					}
					local201 = null;
					if ((local161 & 0x4) == 4) {
						local201 = new short[local137];
						for (local213 = 0; local213 < local137; local213++) {
							local201[local213] = (short) Static327.aClass2_Sub17_Sub1_1.method2825();
						}
					}
					local232 = null;
					if ((local161 & 0x8) == 8) {
						local232 = new short[local148];
						for (local244 = 0; local244 < local148; local244++) {
							local232[local244] = (short) Static327.aClass2_Sub17_Sub1_1.method2854();
						}
					}
					local271 = (long) local19.anInt1679++ << 32 | (long) local11;
					local19.aClass207_1 = new Class207(local271, local175, local201, local232);
				}
			}
			if ((local23 & 0x20) != 0) {
				if (local19.aClass113_1.method2743()) {
					Static409.method6031(local19);
				}
				local19.method1409(Static137.aClass366_1.method8551(Static327.aClass2_Sub17_Sub1_1.method2825()));
				local19.method7005(local19.aClass113_1.anInt3238);
				local19.anInt8130 = local19.aClass113_1.anInt3233 << 3;
				if (local19.aClass113_1.method2743()) {
					Static264.method4366((Class16_Sub1_Sub1_Sub3_Sub2) null, (Class5) null, local19, 0, local19.aByte109, local19.anIntArray594[0], local19.anIntArray595[0]);
				}
			}
			if ((local23 & 0x20000) != 0) {
				local19.anInt1684 = Static327.aClass2_Sub17_Sub1_1.method2854();
				if (local19.anInt1684 == 65535) {
					local19.anInt1684 = local19.aClass113_1.anInt3227;
				}
			}
			if ((local23 & 0x10000) != 0) {
				local19.aString15 = Static327.aClass2_Sub17_Sub1_1.method2833();
				if ("".equals(local19.aString15) || local19.aString15.equals(local19.aClass113_1.aString31)) {
					local19.aString15 = local19.aClass113_1.aString31;
				}
			}
			if ((local23 & 0x8000) != 0) {
				local61 = Static327.aClass2_Sub17_Sub1_1.method2842();
				local64 = new int[local61];
				local67 = new int[local61];
				for (local161 = 0; local161 < local61; local161++) {
					local72 = Static327.aClass2_Sub17_Sub1_1.method2876();
					if ((local72 & 0xC000) == 49152) {
						local78 = Static327.aClass2_Sub17_Sub1_1.method2825();
						local64[local161] = local72 << 16 | local78;
					} else {
						local64[local161] = local72;
					}
					local67[local161] = Static327.aClass2_Sub17_Sub1_1.method2876();
				}
				local19.method7010(local64, local67);
			}
			if ((local23 & 0x10) != 0) {
				local61 = Static327.aClass2_Sub17_Sub1_1.method2842();
				if (local61 > 0) {
					for (local137 = 0; local137 < local61; local137++) {
						local161 = -1;
						local72 = -1;
						local78 = -1;
						local148 = Static327.aClass2_Sub17_Sub1_1.method2853();
						if (local148 == 32767) {
							local148 = Static327.aClass2_Sub17_Sub1_1.method2853();
							local72 = Static327.aClass2_Sub17_Sub1_1.method2853();
							local161 = Static327.aClass2_Sub17_Sub1_1.method2853();
							local78 = Static327.aClass2_Sub17_Sub1_1.method2853();
						} else if (local148 == 32766) {
							local148 = -1;
						} else {
							local72 = Static327.aClass2_Sub17_Sub1_1.method2853();
						}
						local213 = Static327.aClass2_Sub17_Sub1_1.method2853();
						local244 = Static327.aClass2_Sub17_Sub1_1.method2888();
						local19.method7008(local161, local244, local72, Static389.anInt6694, local213, local148, local78);
					}
				}
			}
			if ((local23 & 0x100) != 0) {
				local19.anInt8071 = Static327.aClass2_Sub17_Sub1_1.method2838();
				local19.anInt8050 = Static327.aClass2_Sub17_Sub1_1.method2838();
				local19.anInt8054 = Static327.aClass2_Sub17_Sub1_1.method2860();
				local19.anInt8118 = Static327.aClass2_Sub17_Sub1_1.method2838();
				local19.anInt8117 = Static327.aClass2_Sub17_Sub1_1.method2863() + Static389.anInt6694;
				local19.anInt8064 = Static327.aClass2_Sub17_Sub1_1.method2854() + Static389.anInt6694;
				local19.anInt8056 = Static327.aClass2_Sub17_Sub1_1.method2859();
				local19.anInt8054 += local19.anIntArray595[0];
				local19.anInt8135 = 0;
				local19.anInt8071 += local19.anIntArray595[0];
				local19.anInt8050 += local19.anIntArray594[0];
				local19.anInt8133 = 1;
				local19.anInt8118 += local19.anIntArray594[0];
			}
			if ((local23 & 0x400) != 0) {
				local19.aByte112 = Static327.aClass2_Sub17_Sub1_1.method2852();
				local19.aByte114 = Static327.aClass2_Sub17_Sub1_1.method2860();
				local19.aByte111 = Static327.aClass2_Sub17_Sub1_1.method2852();
				local19.aByte115 = (byte) Static327.aClass2_Sub17_Sub1_1.method2888();
				local19.anInt8097 = Static389.anInt6694 + Static327.aClass2_Sub17_Sub1_1.method2863();
				local19.anInt8101 = Static389.anInt6694 + Static327.aClass2_Sub17_Sub1_1.method2863();
			}
			if ((local23 & 0x8) != 0) {
				local61 = Static327.aClass2_Sub17_Sub1_1.method2863();
				local137 = Static327.aClass2_Sub17_Sub1_1.method2830();
				if (local61 == 65535) {
					local61 = -1;
				}
				local148 = Static327.aClass2_Sub17_Sub1_1.method2859();
				local161 = local148 & 0x7;
				local72 = local148 >> 3 & 0xF;
				if (local72 == 15) {
					local72 = -1;
				}
				local19.method7012(local61, local72, local137, local161, false);
			}
			if ((local23 & 0x200) != 0) {
				local61 = Static327.aClass2_Sub17_Sub1_1.method2854();
				local19.anInt8069 = Static327.aClass2_Sub17_Sub1_1.method2842();
				local19.anInt8103 = Static327.aClass2_Sub17_Sub1_1.method2888();
				local19.aBoolean586 = (local61 & 0x8000) != 0;
				local19.anInt8076 = local61 & 0x7FFF;
				local19.anInt8082 = local19.anInt8076 + Static389.anInt6694 + local19.anInt8069;
			}
			if ((local23 & 0x40) != 0) {
				local19.anInt1683 = Static327.aClass2_Sub17_Sub1_1.method2876();
				local19.anInt1673 = Static327.aClass2_Sub17_Sub1_1.method2854();
			}
			if ((local23 & 0x40000) != 0) {
				local61 = local19.aClass113_1.anIntArray212.length;
				local137 = 0;
				if (local19.aClass113_1.aShortArray50 != null) {
					local137 = local19.aClass113_1.aShortArray50.length;
				}
				if (local19.aClass113_1.aShortArray49 != null) {
					local137 = local19.aClass113_1.aShortArray49.length;
				}
				local161 = Static327.aClass2_Sub17_Sub1_1.method2842();
				if ((local161 & 0x1) != 1) {
					local175 = null;
					if ((local161 & 0x2) == 2) {
						local175 = new int[local61];
						for (local78 = 0; local78 < local61; local78++) {
							local175[local78] = Static327.aClass2_Sub17_Sub1_1.method2854();
						}
					}
					local201 = null;
					if ((local161 & 0x4) == 4) {
						local201 = new short[local137];
						for (local213 = 0; local213 < local137; local213++) {
							local201[local213] = (short) Static327.aClass2_Sub17_Sub1_1.method2863();
						}
					}
					local232 = null;
					if ((local161 & 0x8) == 8) {
						local232 = new short[0];
						for (local244 = 0; local244 < 0; local244++) {
							local232[local244] = (short) Static327.aClass2_Sub17_Sub1_1.method2854();
						}
					}
					local271 = (long) local19.anInt1681++ << 32 | (long) local11;
					new Class207(local271, local175, local201, local232);
				}
			}
			if ((local23 & 0x1) != 0) {
				local19.anInt8100 = Static327.aClass2_Sub17_Sub1_1.method2825();
				if (local19.anInt8100 == 65535) {
					local19.anInt8100 = -1;
				}
			}
			if ((local23 & 0x4) != 0) {
				@Pc(961) int[] local961 = new int[4];
				for (local137 = 0; local137 < 4; local137++) {
					local961[local137] = Static327.aClass2_Sub17_Sub1_1.method2825();
					if (local961[local137] == 65535) {
						local961[local137] = -1;
					}
				}
				local148 = Static327.aClass2_Sub17_Sub1_1.method2842();
				Static18.method520(local19, local148, local961);
			}
			if ((local23 & 0x2000) != 0) {
				local61 = Static327.aClass2_Sub17_Sub1_1.method2854();
				if (local61 == 65535) {
					local61 = -1;
				}
				local137 = Static327.aClass2_Sub17_Sub1_1.method2887();
				local148 = Static327.aClass2_Sub17_Sub1_1.method2888();
				local161 = local148 & 0x7;
				local72 = local148 >> 3 & 0xF;
				if (local72 == 15) {
					local72 = -1;
				}
				local19.method7012(local61, local72, local137, local161, true);
			}
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3871(@OriginalArg(0) String arg0) {
		if (Static58.aClass75Array1 != null) {
			@Pc(15) Class2_Sub31 local15 = Static275.method4480(Static640.aClass314_2, Static245.aClass145_73);
			local15.aClass2_Sub17_Sub1_2.method2837(Static443.method6359(arg0));
			local15.aClass2_Sub17_Sub1_2.method2856(arg0);
			Static526.method7309(local15);
		}
	}
}
