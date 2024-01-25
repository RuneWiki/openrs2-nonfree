import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!jm", name = "r", descriptor = "B")
	public static byte aByte71;

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_56 = new Class307(4);

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)V")
	public static void method4643() {
		if (Static238.aClass331Array1 == null) {
			Static238.aClass331Array1 = Static572.method7411();
			Static351.aClass331_1 = Static238.aClass331Array1[0];
			Static535.aLong327 = Static517.method6965();
		}
		if (Static397.aClass325_1 == null) {
			Static645.method8481();
		}
		@Pc(34) Class331 local34 = Static351.aClass331_1;
		@Pc(39) int local39 = Static392.method5316();
		if (local34 == Static351.aClass331_1) {
			Static427.aString48 = Static351.aClass331_1.aClass257_63.method5699(Static456.anInt7118);
			if (Static351.aClass331_1.aBoolean584) {
				Static284.anInt4355 = (Static351.aClass331_1.anInt8681 - Static351.aClass331_1.anInt8680) * local39 / 100 + Static351.aClass331_1.anInt8680;
			}
			if (Static351.aClass331_1.aBoolean585) {
				Static427.aString48 = Static427.aString48 + Static284.anInt4355 + "%";
			}
		} else if (Static351.aClass331_1 == Static572.aClass331_23) {
			Static397.aClass325_1 = null;
			Static336.method4832(3);
		} else {
			Static427.aString48 = local34.aClass257_64.method5699(Static456.anInt7118);
			Static284.anInt4355 = local34.anInt8681;
			if (Static351.aClass331_1.aBoolean585) {
				Static427.aString48 = Static427.aString48 + local34.anInt8681 + "%";
			}
			if (Static351.aClass331_1.aBoolean584 || local34.aBoolean584) {
				Static535.aLong327 = Static517.method6965();
			}
		}
		if (Static397.aClass325_1 == null) {
			return;
		}
		Static397.aClass325_1.method7281(Static284.anInt4355, Static535.aLong327, Static351.aClass331_1, Static427.aString48);
		if (Static653.anInterface24Array1 == null) {
			return;
		}
		for (@Pc(159) int local159 = Static385.anInt5975 + 1; local159 < Static653.anInterface24Array1.length; local159++) {
			if (Static653.anInterface24Array1[local159].method7124() >= 100 && Static385.anInt5975 == local159 - 1 && Static98.anInt2140 >= 1 && Static397.aClass325_1.method7273()) {
				try {
					Static653.anInterface24Array1[local159].method7123();
				} catch (@Pc(201) Exception local201) {
					Static653.anInterface24Array1 = null;
					return;
				}
				Static397.aClass325_1.method7272(Static653.anInterface24Array1[local159]);
				Static385.anInt5975++;
				if (Static653.anInterface24Array1.length - 1 <= Static385.anInt5975 && Static653.anInterface24Array1.length > 1) {
					Static385.anInt5975 = Static173.aClass366_2.method8417() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(BII)Z")
	public static boolean method4644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!jo;B)Z")
	public static boolean method4645(@OriginalArg(0) Class198 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean339) {
			return false;
		} else if (!arg0.method4667(Static327.anInterface12_2)) {
			return false;
		} else if (Static147.aClass313_13.method7104((long) arg0.anInt5151) == null) {
			return Static356.aClass313_26.method7104((long) arg0.anInt5135) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(B)V")
	public static void method4648() {
		if (Static153.aClass22_4.method9406()) {
			Static153.aClass22_4.method9395(Static508.aCanvas8);
			Static37.method1129();
			if (Static347.aBoolean360) {
				Static143.method2428(Static508.aCanvas8);
			} else {
				@Pc(16) Dimension local16 = Static508.aCanvas8.getSize();
				Static153.aClass22_4.method9370(Static508.aCanvas8, local16.width, local16.height);
			}
			Static153.aClass22_4.method9347(Static508.aCanvas8);
		} else {
			Static36.method1127(false, Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620());
		}
		Static402.method5423();
		Static632.aBoolean653 = true;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!fca;ILclient!ha;)V")
	public static void method4649(@OriginalArg(1) Class108 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class22 arg2) {
		@Pc(15) int local15;
		if (Static682.anIntArray765 != null && arg1 <= arg0.aByte56) {
			for (local15 = 0; local15 < Static682.anIntArray765.length; local15++) {
				if (Static682.anIntArray765[local15] != -1000000 && (arg0.anIntArray196[0] <= Static682.anIntArray765[local15] || Static682.anIntArray765[local15] >= arg0.anIntArray196[1] || Static682.anIntArray765[local15] >= arg0.anIntArray196[2] || Static682.anIntArray765[local15] >= arg0.anIntArray196[3]) && (arg0.anIntArray194[0] <= Static400.anIntArray474[local15] || arg0.anIntArray194[1] <= Static400.anIntArray474[local15] || arg0.anIntArray194[2] <= Static400.anIntArray474[local15] || arg0.anIntArray194[3] <= Static400.anIntArray474[local15]) && (Static174.anIntArray205[local15] <= arg0.anIntArray194[0] || Static174.anIntArray205[local15] <= arg0.anIntArray194[1] || Static174.anIntArray205[local15] <= arg0.anIntArray194[2] || arg0.anIntArray194[3] >= Static174.anIntArray205[local15]) && (arg0.anIntArray195[0] <= Static597.anIntArray659[local15] || arg0.anIntArray195[1] <= Static597.anIntArray659[local15] || arg0.anIntArray195[2] <= Static597.anIntArray659[local15] || arg0.anIntArray195[3] <= Static597.anIntArray659[local15]) && (Static79.anIntArray103[local15] <= arg0.anIntArray195[0] || arg0.anIntArray195[1] >= Static79.anIntArray103[local15] || Static79.anIntArray103[local15] <= arg0.anIntArray195[2] || Static79.anIntArray103[local15] <= arg0.anIntArray195[3])) {
					return;
				}
			}
		}
		@Pc(310) int local310;
		@Pc(333) int local333;
		@Pc(359) boolean local359;
		@Pc(398) float local398;
		if (arg0.aByte57 == 1) {
			local15 = arg0.aShort45 + Static720.anInt11190 - Static507.anInt8070;
			if (local15 >= 0 && local15 <= Static720.anInt11190 + Static720.anInt11190) {
				local310 = Static720.anInt11190 + arg0.aShort46 - Static527.anInt8230;
				if (local310 < 0) {
					local310 = 0;
				} else if (local310 > Static720.anInt11190 + Static720.anInt11190) {
					return;
				}
				local333 = Static720.anInt11190 + arg0.aShort47 - Static527.anInt8230;
				if (Static720.anInt11190 + Static720.anInt11190 < local333) {
					local333 = Static720.anInt11190 + Static720.anInt11190;
				} else if (local333 < 0) {
					return;
				}
				local359 = false;
				while (local333 >= local310) {
					if (Static181.aBooleanArrayArray2[local15][local310++]) {
						local359 = true;
						break;
					}
				}
				if (local359) {
					local398 = (float) (Static142.anInt2646 - arg0.anIntArray194[0]);
					if (local398 < 0.0F) {
						local398 *= -1.0F;
					}
					if (!local398 < (float) Static106.anInt2280 && (Static360.method7136(arg0, 0) && (Static360.method7136(arg0, 1) && (Static360.method7136(arg0, 2) && Static360.method7136(arg0, 3))))) {
						Static79.aClass108Array3[Static525.anInt8215++] = arg0;
					}
				}
			}
		} else if (arg0.aByte57 == 2) {
			local15 = Static720.anInt11190 + arg0.aShort46 - Static527.anInt8230;
			if (local15 >= 0 && Static720.anInt11190 + Static720.anInt11190 >= local15) {
				local310 = Static720.anInt11190 + arg0.aShort45 - Static507.anInt8070;
				if (local310 < 0) {
					local310 = 0;
				} else if (Static720.anInt11190 + Static720.anInt11190 < local310) {
					return;
				}
				local333 = arg0.aShort48 + Static720.anInt11190 - Static507.anInt8070;
				if (local333 > Static720.anInt11190 + Static720.anInt11190) {
					local333 = Static720.anInt11190 + Static720.anInt11190;
				} else if (local333 < 0) {
					return;
				}
				local359 = false;
				while (local333 >= local310) {
					if (Static181.aBooleanArrayArray2[local310++][local15]) {
						local359 = true;
						break;
					}
				}
				if (local359) {
					local398 = (float) (Static664.anInt10179 - arg0.anIntArray195[0]);
					if (local398 < 0.0F) {
						local398 *= -1.0F;
					}
					if (!((float) Static106.anInt2280 > local398) && (Static360.method7136(arg0, 0) && (Static360.method7136(arg0, 1) && (Static360.method7136(arg0, 2) && Static360.method7136(arg0, 3))))) {
						Static79.aClass108Array3[Static525.anInt8215++] = arg0;
					}
				}
			}
		} else if (arg0.aByte57 == 16 || arg0.aByte57 == 8) {
			local15 = arg0.aShort45 + Static720.anInt11190 - Static507.anInt8070;
			if (local15 >= 0 && local15 <= Static720.anInt11190 + Static720.anInt11190) {
				local310 = Static720.anInt11190 + arg0.aShort46 - Static527.anInt8230;
				if (local310 >= 0 && local310 <= Static720.anInt11190 + Static720.anInt11190 && Static181.aBooleanArrayArray2[local15][local310]) {
					@Pc(698) float local698 = (float) (Static142.anInt2646 - arg0.anIntArray194[0]);
					if (local698 < 0.0F) {
						local698 *= -1.0F;
					}
					@Pc(715) float local715 = (float) (Static664.anInt10179 - arg0.anIntArray195[0]);
					if (local715 < 0.0F) {
						local715 *= -1.0F;
					}
					if ((!((float) Static106.anInt2280 > local698) || !((float) Static106.anInt2280 > local715)) && (Static360.method7136(arg0, 0) && (Static360.method7136(arg0, 1) && (Static360.method7136(arg0, 2) && Static360.method7136(arg0, 3))))) {
						Static79.aClass108Array3[Static525.anInt8215++] = arg0;
					}
				}
			}
		} else if (arg0.aByte57 == 4) {
			@Pc(795) float local795 = (float) (arg0.anIntArray196[0] - Static374.anInt5843);
			if (!(local795 <= (float) Static233.anInt3758)) {
				local333 = arg0.aShort46 + Static720.anInt11190 - Static527.anInt8230;
				if (local333 < 0) {
					local333 = 0;
				} else if (Static720.anInt11190 + Static720.anInt11190 < local333) {
					return;
				}
				@Pc(836) int local836 = arg0.aShort47 + Static720.anInt11190 - Static527.anInt8230;
				if (local836 > Static720.anInt11190 + Static720.anInt11190) {
					local836 = Static720.anInt11190 + Static720.anInt11190;
				} else if (local836 < 0) {
					return;
				}
				@Pc(861) int local861 = Static720.anInt11190 + arg0.aShort45 - Static507.anInt8070;
				if (local861 < 0) {
					local861 = 0;
				} else if (Static720.anInt11190 + Static720.anInt11190 < local861) {
					return;
				}
				@Pc(886) int local886 = arg0.aShort48 + Static720.anInt11190 - Static507.anInt8070;
				if (Static720.anInt11190 + Static720.anInt11190 < local886) {
					local886 = Static720.anInt11190 + Static720.anInt11190;
				} else if (local886 < 0) {
					return;
				}
				@Pc(905) boolean local905 = false;
				label283: for (@Pc(907) int local907 = local861; local907 <= local886; local907++) {
					for (@Pc(913) int local913 = local333; local913 <= local836; local913++) {
						if (Static181.aBooleanArrayArray2[local907][local913]) {
							local905 = true;
							break label283;
						}
					}
				}
				if (local905 && (Static360.method7136(arg0, 0) && (Static360.method7136(arg0, 1) && (Static360.method7136(arg0, 2) && Static360.method7136(arg0, 3))))) {
					Static79.aClass108Array3[Static525.anInt8215++] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!ha;II)V")
	public static void method4651(@OriginalArg(1) Class22 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static147.anInt2695 == 0 || Static488.anInt7677 == 0) {
			return;
		}
		@Pc(57) Class58 local57;
		@Pc(46) int local46;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(42) int local42;
		@Pc(69) int local69;
		@Pc(67) int local67;
		if (Static347.aBoolean360) {
			Static304.method4501(false);
			local57 = arg0.method9369();
			@Pc(83) int[] local83 = arg0.Y();
			local44 = local83[1];
			local42 = local83[3];
			local46 = local83[0];
			local48 = local83[2];
			local69 = arg1 + Static671.method8996(false);
			local67 = arg2 + Static541.method7181(false);
		} else {
			arg0.DA(Static568.anInt8628, Static293.anInt4473, Static147.anInt2695, Static488.anInt7677);
			local42 = Static488.anInt7677;
			local44 = Static293.anInt4473;
			local46 = Static568.anInt8628;
			local48 = Static147.anInt2695;
			arg0.KA(Static477.anInt7514, Static655.anInt10078, Static147.anInt2695, Static488.anInt7677);
			local57 = arg0.method9376();
			local57.method9514(Static233.anInt3760, Static360.anInt8364, Static63.anInt1565, Static166.anInt2948, Static184.anInt3195, Static596.anInt9067);
			local67 = arg2;
			local69 = arg1;
			arg0.method9405(local57);
		}
		Static278.method3937(true);
		if (local42 == 0) {
			local42 = 1;
		}
		if (local48 == 0) {
			local48 = 1;
		}
		@Pc(154) int local154;
		@Pc(166) int local166;
		@Pc(176) int local176;
		@Pc(291) int local291;
		@Pc(300) int local300;
		@Pc(311) int local311;
		@Pc(322) int local322;
		@Pc(146) int local146;
		@Pc(374) int local374;
		if (Static43.aClass259Array1 != null && (!Static474.aBoolean505 || (Static723.anInt11214 & 0x40) != 0)) {
			local146 = -1;
			@Pc(148) int local148 = -1;
			@Pc(151) int local151 = arg0.i();
			local154 = arg0.XA();
			@Pc(177) int local177;
			@Pc(165) int local165;
			if (Static444.aBoolean451) {
				local166 = local165 = (local69 - local46) * Static668.anInt10260 / local48;
				local177 = local176 = Static668.anInt10260 * (local67 - local44) / local42;
			} else {
				local177 = (local67 - local44) * local151 / local42;
				local166 = (local69 - local46) * local151 / local48;
				local176 = (local67 - local44) * local154 / local42;
				local165 = local154 * (local69 - local46) / local48;
			}
			@Pc(229) int[] local229 = new int[] { local166, local177, local151 };
			local57.method9507(local229);
			@Pc(247) int[] local247 = new int[] { local165, local176, local154 };
			local57.method9507(local247);
			@Pc(278) float local278 = Static641.method8441((float) local229[2], (float) local247[2], (float) local247[1], (float) local229[1], (float) local247[0], (float) local229[0], 4);
			if (local278 > 0.0F) {
				local291 = local247[0] - local229[0];
				local300 = local247[2] - local229[2];
				local311 = (int) ((float) local229[0] + local278 * (float) local291);
				local322 = (int) (local278 * (float) local300 + (float) local229[2]);
				local146 = (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.method7485() - 1 << 8) + local311 >> 9;
				local148 = local322 + (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.method7485() - 1 << 8) >> 9;
				@Pc(349) byte local349 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139;
				if (local349 < 3 && (Static510.aByteArrayArrayArray11[1][local311 >> 9][local322 >> 9] & 0x2) != 0) {
					local374 = local349 + 1;
				}
			}
			if (local146 != -1 && local148 != -1) {
				if (Static474.aBoolean505 && (Static723.anInt11214 & 0x40) != 0) {
					@Pc(457) Class270 local457 = Static1.method9504(Static418.anInt6410, Static216.anInt3565);
					if (local457 == null) {
						Static443.method5872();
					} else {
						Static283.method4000(local148, Static261.aString59, true, (long) (local146 << 0 | local148), -1, Static302.anInt4875, true, local146, " ->", 19, 0L, false);
					}
				} else {
					if (Static662.aBoolean679) {
						Static283.method4000(local148, Static430.aClass257_26.method5699(Static456.anInt7118), true, (long) (local148 | local146 << 0), -1, -1, true, local146, "", 9, 0L, false);
					}
					Static283.method4000(local148, Static99.aString39, true, (long) (local148 | local146 << 0), -1, Static229.anInt3718, true, local146, "", 17, 0L, false);
				}
			}
		}
		if (Static347.aBoolean360) {
			Static440.method5852();
		}
		for (local146 = 0; local146 < (Static347.aBoolean360 ? 2 : 1); local146++) {
			@Pc(512) boolean local512 = local146 == 0;
			@Pc(519) Class386 local519 = local512 ? Static673.aClass386_67 : Static248.aClass386_27;
			local154 = arg1;
			local166 = arg2;
			if (Static347.aBoolean360) {
				Static304.method4501(local512);
				local154 = arg1 + Static671.method8996(local512);
				local166 = arg2 + Static541.method7181(local512);
			}
			@Pc(543) Class319 local543 = local519.aClass319_13;
			for (@Pc(548) Class9_Sub6 local548 = (Class9_Sub6) local543.method7195(); local548 != null; local548 = (Class9_Sub6) local543.method7188()) {
				if ((Static705.aBoolean743 || Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 == local548.aClass9_Sub1_18.aByte139) && local548.method5893(arg0, local166, local154)) {
					@Pc(593) int local593;
					if (local548.aClass9_Sub1_18 instanceof Class9_Sub1_Sub1) {
						local176 = ((Class9_Sub1_Sub1) local548.aClass9_Sub1_18).aShort123;
						local593 = ((Class9_Sub1_Sub1) local548.aClass9_Sub1_18).aShort120;
					} else {
						local176 = local548.aClass9_Sub1_18.anInt10694 >> 9;
						local593 = local548.aClass9_Sub1_18.anInt10695 >> 9;
					}
					@Pc(734) int local734;
					@Pc(746) int local746;
					@Pc(870) int local870;
					@Pc(619) int local619;
					if (local548.aClass9_Sub1_18 instanceof Class9_Sub1_Sub1_Sub2_Sub1) {
						@Pc(615) Class9_Sub1_Sub1_Sub2_Sub1 local615 = (Class9_Sub1_Sub1_Sub2_Sub1) local548.aClass9_Sub1_18;
						local619 = local615.method7485();
						if ((local619 & 0x1) == 0 && (local615.anInt10694 & 0x1FF) == 0 && (local615.anInt10695 & 0x1FF) == 0 || (local619 & 0x1) == 1 && (local615.anInt10694 & 0x1FF) == 256 && (local615.anInt10695 & 0x1FF) == 256) {
							local291 = local615.anInt10694 - (local615.method7485() - 1 << 8);
							local300 = local615.anInt10695 - (local615.method7485() - 1 << 8);
							for (local311 = 0; local311 < Static28.anInt1087; local311++) {
								@Pc(704) Class3_Sub52 local704 = (Class3_Sub52) Static94.aClass313_8.method7104((long) Static633.anIntArray705[local311]);
								if (local704 != null) {
									@Pc(709) Class9_Sub1_Sub1_Sub2_Sub2 local709 = local704.aClass9_Sub1_Sub1_Sub2_Sub2_2;
									if (Static716.anInt11157 != local709.anInt8798 && local709.aBoolean591) {
										local734 = local709.anInt10694 - (local709.aClass219_1.anInt5693 - 1 << 8);
										local746 = local709.anInt10695 - (local709.aClass219_1.anInt5693 - 1 << 8);
										if (local734 >= local291 && local709.aClass219_1.anInt5693 <= local615.method7485() - (local734 - local291 >> 9) && local746 >= local300 && local709.aClass219_1.anInt5693 <= local615.method7485() - (local746 - local300 >> 9)) {
											Static694.method9183(local548.aClass9_Sub1_18.aByte139 != Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139, local709);
											local709.anInt8798 = Static716.anInt11157;
										}
									}
								}
							}
							local322 = Static607.anInt9201;
							@Pc(826) int[] local826 = Static384.anIntArray436;
							for (local734 = 0; local734 < local322; local734++) {
								@Pc(836) Class9_Sub1_Sub1_Sub2_Sub1 local836 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local826[local734]];
								if (local836 != null && local836.anInt8798 != Static716.anInt11157 && local615 != local836 && local836.aBoolean591) {
									local870 = local836.anInt10694 - (local836.method7485() - 1 << 8);
									@Pc(882) int local882 = local836.anInt10695 - (local836.method7485() - 1 << 8);
									if (local291 <= local870 && local836.method7485() <= local615.method7485() - (local870 - local291 >> 9) && local300 <= local882 && local836.method7485() <= local615.method7485() - (local882 - local300 >> 9)) {
										Static208.method3142(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 != local548.aClass9_Sub1_18.aByte139, local836);
										local836.anInt8798 = Static716.anInt11157;
									}
								}
							}
						}
						if (Static716.anInt11157 == local615.anInt8798) {
							continue;
						}
						Static208.method3142(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 != local548.aClass9_Sub1_18.aByte139, local615);
						local615.anInt8798 = Static716.anInt11157;
					}
					if (local548.aClass9_Sub1_18 instanceof Class9_Sub1_Sub1_Sub2_Sub2) {
						@Pc(995) Class9_Sub1_Sub1_Sub2_Sub2 local995 = (Class9_Sub1_Sub1_Sub2_Sub2) local548.aClass9_Sub1_18;
						if (local995.aClass219_1 != null) {
							if ((local995.aClass219_1.anInt5693 & 0x1) == 0 && (local995.anInt10694 & 0x1FF) == 0 && (local995.anInt10695 & 0x1FF) == 0 || (local995.aClass219_1.anInt5693 & 0x1) == 1 && (local995.anInt10694 & 0x1FF) == 256 && (local995.anInt10695 & 0x1FF) == 256) {
								local619 = local995.anInt10694 - (local995.aClass219_1.anInt5693 - 1 << 8);
								local291 = local995.anInt10695 - (local995.aClass219_1.anInt5693 - 1 << 8);
								for (local300 = 0; local300 < Static28.anInt1087; local300++) {
									@Pc(1085) Class3_Sub52 local1085 = (Class3_Sub52) Static94.aClass313_8.method7104((long) Static633.anIntArray705[local300]);
									if (local1085 != null) {
										@Pc(1090) Class9_Sub1_Sub1_Sub2_Sub2 local1090 = local1085.aClass9_Sub1_Sub1_Sub2_Sub2_2;
										if (local1090.anInt8798 != Static716.anInt11157 && local995 != local1090 && local1090.aBoolean591) {
											local374 = local1090.anInt10694 - (local1090.aClass219_1.anInt5693 - 1 << 8);
											local734 = local1090.anInt10695 - (local1090.aClass219_1.anInt5693 - 1 << 8);
											if (local619 <= local374 && local1090.aClass219_1.anInt5693 <= local995.aClass219_1.anInt5693 - (local374 - local619 >> 9) && local734 >= local291 && local995.aClass219_1.anInt5693 - (local734 - local291 >> 9) >= local1090.aClass219_1.anInt5693) {
												Static694.method9183(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 != local548.aClass9_Sub1_18.aByte139, local1090);
												local1090.anInt8798 = Static716.anInt11157;
											}
										}
									}
								}
								local311 = Static607.anInt9201;
								@Pc(1216) int[] local1216 = Static384.anIntArray436;
								for (local374 = 0; local374 < local311; local374++) {
									@Pc(1226) Class9_Sub1_Sub1_Sub2_Sub1 local1226 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local1216[local374]];
									if (local1226 != null && local1226.anInt8798 != Static716.anInt11157 && local1226.aBoolean591) {
										local746 = local1226.anInt10694 - (local1226.method7485() - 1 << 8);
										local870 = local1226.anInt10695 - (local1226.method7485() - 1 << 8);
										if (local619 <= local746 && local1226.method7485() <= local995.aClass219_1.anInt5693 - (local746 - local619 >> 9) && local870 >= local291 && local1226.method7485() <= local995.aClass219_1.anInt5693 - (local870 - local291 >> 9)) {
											Static208.method3142(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 != local548.aClass9_Sub1_18.aByte139, local1226);
											local1226.anInt8798 = Static716.anInt11157;
										}
									}
								}
							}
							if (local995.anInt8798 == Static716.anInt11157) {
								continue;
							}
							Static694.method9183(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 != local548.aClass9_Sub1_18.aByte139, local995);
							local995.anInt8798 = Static716.anInt11157;
						}
					}
					if (local548.aClass9_Sub1_18 instanceof Class9_Sub1_Sub5_Sub1) {
						@Pc(1384) int local1384 = Static291.anInt4448 + local176;
						local619 = local593 + Static189.anInt3243;
						@Pc(1406) Class3_Sub28 local1406 = (Class3_Sub28) Static113.aClass313_9.method7104((long) (local548.aClass9_Sub1_18.aByte139 << 28 | local619 << 14 | local1384));
						if (local1406 != null) {
							local300 = 0;
							@Pc(1416) Class3_Sub30 local1416 = (Class3_Sub30) local1406.aClass342_37.method7656();
							while (local1416 != null) {
								@Pc(1424) Class275 local1424 = Static606.aClass62_2.method1887(local1416.anInt4371);
								if (Static474.aBoolean505 && local548.aClass9_Sub1_18.aByte139 == Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139) {
									@Pc(1448) Class303 local1448 = Static496.anInt7898 == -1 ? null : Static583.aClass150_2.method3385(Static496.anInt7898);
									if ((Static723.anInt11214 & 0x1) != 0 && (local1448 == null || local1424.method6283(local1448.anInt8150, Static496.anInt7898) != local1448.anInt8150)) {
										Static283.method4000(local593, Static261.aString59, true, (long) local300, -1, Static302.anInt4875, false, local176, Static96.aString130 + " -> <col=ff9040>" + local1424.aString94, 30, (long) local1416.anInt4371, false);
									}
								}
								if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 == local548.aClass9_Sub1_18.aByte139) {
									@Pc(1518) String[] local1518 = local1424.aStringArray29;
									for (local734 = local1518.length - 1; local734 >= 0; local734--) {
										if (local1518[local734] != null) {
											@Pc(1533) short local1533 = 0;
											if (local734 == 0) {
												local1533 = 22;
											}
											local870 = Static337.anInt5410;
											if (local734 == 1) {
												local1533 = 16;
											}
											if (local734 == 2) {
												local1533 = 8;
											}
											if (local734 == 3) {
												local1533 = 58;
											}
											if (local734 == 4) {
												local1533 = 47;
											}
											if (local1424.anInt7281 == local734) {
												local870 = local1424.anInt7258;
											}
											if (local734 == 5) {
												local1533 = 1011;
											}
											if (local1424.anInt7251 == local734) {
												local870 = local1424.anInt7233;
											}
											Static283.method4000(local593, local1518[local734], true, (long) local300, -1, local870, false, local176, "<col=ff9040>" + local1424.aString94, local1533, (long) local1416.anInt4371, false);
										}
									}
								}
								local1416 = (Class3_Sub30) local1406.aClass342_37.method7649();
								local300++;
							}
						}
					}
					if (local548.aClass9_Sub1_18 instanceof Interface9) {
						@Pc(1648) Interface9 local1648 = (Interface9) local548.aClass9_Sub1_18;
						@Pc(1657) Class247 local1657 = Static216.aClass53_3.method1523(local1648.method9107());
						if (local1657.anIntArray477 != null) {
							local1657 = local1657.method5442(Static380.aClass127_1);
						}
						if (local1657 != null) {
							if (Static474.aBoolean505 && local548.aClass9_Sub1_18.aByte139 == Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139) {
								@Pc(1693) Class303 local1693 = Static496.anInt7898 == -1 ? null : Static583.aClass150_2.method3385(Static496.anInt7898);
								if ((Static723.anInt11214 & 0x4) != 0 && (local1693 == null || local1657.method5432(local1693.anInt8150, Static496.anInt7898) != local1693.anInt8150)) {
									Static283.method4000(local593, Static261.aString59, true, (long) local1648.hashCode(), -1, Static302.anInt4875, false, local176, Static96.aString130 + " -> <col=00ffff>" + local1657.aString83, 44, Static21.method642(local176, local593, local1648), false);
								}
							}
							if (local548.aClass9_Sub1_18.aByte139 == Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139) {
								@Pc(1763) String[] local1763 = local1657.aStringArray25;
								if (local1763 != null) {
									for (local300 = local1763.length - 1; local300 >= 0; local300--) {
										if (local1763[local300] != null) {
											@Pc(1780) short local1780 = 0;
											local322 = Static337.anInt5410;
											if (local300 == 0) {
												local1780 = 11;
											}
											if (local300 == 1) {
												local1780 = 52;
											}
											if (local300 == 2) {
												local1780 = 3;
											}
											if (local300 == 3) {
												local1780 = 60;
											}
											if (local300 == 4) {
												local1780 = 1010;
											}
											if (local300 == local1657.anInt6243) {
												local322 = local1657.anInt6260;
											}
											if (local300 == 5) {
												local1780 = 1007;
											}
											if (local300 == local1657.anInt6253) {
												local322 = local1657.anInt6265;
											}
											Static283.method4000(local593, local1763[local300], true, (long) local1648.hashCode(), -1, local322, false, local176, "<col=00ffff>" + local1657.aString83, local1780, Static21.method642(local176, local593, local1648), false);
										}
									}
								}
							}
						}
					}
				}
			}
			if (Static347.aBoolean360) {
				Static440.method5852();
			}
		}
		Static278.method3937(false);
	}
}
