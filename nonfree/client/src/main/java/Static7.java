import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
	public static int anInt115;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString5 = "glow1:";

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	public static int anInt116 = -1;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)Lclient!vg;")
	public static Class2_Sub8_Sub22 method118(@OriginalArg(0) int arg0) {
		@Pc(6) Class2_Sub8_Sub22 local6 = (Class2_Sub8_Sub22) Static104.aClass106_2.method2986((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static209.aClass42_63.method1256(5, arg0);
		local6 = new Class2_Sub8_Sub22();
		if (local21 != null) {
			local6.method4547(new Class2_Sub16(local21));
		}
		Static104.aClass106_2.method2990((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
	public static void method119() {
		Static141.aClass157_25.method4027();
		Static6.aClass157_4.method4027();
		Static93.aClass157_22.method4027();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!ek;Z)[Lclient!ka;")
	public static Class93_Sub1[] method120(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1) {
		return Static47.method882(arg1, arg0) ? Static110.method1872() : null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Lclient!oi;")
	public static Class127 method121(@OriginalArg(0) int arg0) {
		@Pc(18) Class127 local18 = (Class127) Static291.aClass157_43.method4031((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(30) byte[] local30 = Static105.aClass42_15.method1256(4, arg0);
		local18 = new Class127();
		if (local30 != null) {
			local18.method3470(arg0, new Class2_Sub16(local30));
		}
		Static291.aClass157_43.method4026((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
	public static void method122() {
		Static236.anInt4758 = 0;
		label194: for (@Pc(3) int local3 = 0; local3 < Static166.anInt3672; local3++) {
			@Pc(10) Class150 local10 = Static254.aClass150Array2[local3];
			@Pc(14) int local14;
			if (Static2.anIntArray11 != null) {
				for (local14 = 0; local14 < Static2.anIntArray11.length; local14++) {
					if (Static2.anIntArray11[local14] != -1000000 && (local10.anInt4811 <= Static2.anIntArray11[local14] || local10.anInt4819 <= Static2.anIntArray11[local14]) && (local10.anInt4814 <= Static282.anIntArray530[local14] || local10.anInt4806 <= Static282.anIntArray530[local14]) && (local10.anInt4814 >= Static315.anIntArray604[local14] || local10.anInt4806 >= Static315.anIntArray604[local14]) && (local10.anInt4810 <= Static149.anIntArray329[local14] || local10.anInt4817 <= Static149.anIntArray329[local14]) && (local10.anInt4810 >= Static36.anIntArray82[local14] || local10.anInt4817 >= Static36.anIntArray82[local14])) {
						continue label194;
					}
				}
			}
			@Pc(115) int local115;
			@Pc(126) int local126;
			@Pc(158) int local158;
			@Pc(137) boolean local137;
			if (local10.anInt4802 == 1) {
				local14 = local10.anInt4799 + Static243.anInt4841 - Static290.anInt5686;
				if (local14 >= 0 && local14 <= Static243.anInt4841 + Static243.anInt4841) {
					local115 = local10.anInt4805 + Static243.anInt4841 - Static72.anInt1815;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4821 + Static243.anInt4841 - Static72.anInt1815;
					if (local126 > Static243.anInt4841 + Static243.anInt4841) {
						local126 = Static243.anInt4841 + Static243.anInt4841;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static6.aBooleanArrayArray1[local14][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static10.anInt148 - local10.anInt4814;
						if (local158 > 32) {
							local10.anInt4812 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt4812 = 2;
							local158 = -local158;
						}
						local10.anInt4820 = (local10.anInt4810 - Static18.anInt389 << 8) / local158;
						local10.anInt4816 = (local10.anInt4817 - Static18.anInt389 << 8) / local158;
						local10.anInt4803 = (local10.anInt4811 - Static268.anInt5235 << 8) / local158;
						local10.anInt4818 = (local10.anInt4819 - Static268.anInt5235 << 8) / local158;
						Static71.aClass150Array1[Static236.anInt4758++] = local10;
					}
				}
			} else if (local10.anInt4802 == 2) {
				local14 = local10.anInt4805 + Static243.anInt4841 - Static72.anInt1815;
				if (local14 >= 0 && local14 <= Static243.anInt4841 + Static243.anInt4841) {
					local115 = local10.anInt4799 + Static243.anInt4841 - Static290.anInt5686;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4813 + Static243.anInt4841 - Static290.anInt5686;
					if (local126 > Static243.anInt4841 + Static243.anInt4841) {
						local126 = Static243.anInt4841 + Static243.anInt4841;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static6.aBooleanArrayArray1[local115++][local14]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static18.anInt389 - local10.anInt4810;
						if (local158 > 32) {
							local10.anInt4812 = 3;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt4812 = 4;
							local158 = -local158;
						}
						local10.anInt4809 = (local10.anInt4814 - Static10.anInt148 << 8) / local158;
						local10.anInt4800 = (local10.anInt4806 - Static10.anInt148 << 8) / local158;
						local10.anInt4803 = (local10.anInt4811 - Static268.anInt5235 << 8) / local158;
						local10.anInt4818 = (local10.anInt4819 - Static268.anInt5235 << 8) / local158;
						Static71.aClass150Array1[Static236.anInt4758++] = local10;
					}
				}
			} else if (local10.anInt4802 == 4) {
				local14 = local10.anInt4811 - Static268.anInt5235;
				if (local14 > 128) {
					local115 = local10.anInt4805 + Static243.anInt4841 - Static72.anInt1815;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4821 + Static243.anInt4841 - Static72.anInt1815;
					if (local126 > Static243.anInt4841 + Static243.anInt4841) {
						local126 = Static243.anInt4841 + Static243.anInt4841;
					}
					if (local115 <= local126) {
						@Pc(408) int local408 = local10.anInt4799 + Static243.anInt4841 - Static290.anInt5686;
						if (local408 < 0) {
							local408 = 0;
						}
						local158 = local10.anInt4813 + Static243.anInt4841 - Static290.anInt5686;
						if (local158 > Static243.anInt4841 + Static243.anInt4841) {
							local158 = Static243.anInt4841 + Static243.anInt4841;
						}
						@Pc(430) boolean local430 = false;
						label166: for (@Pc(432) int local432 = local408; local432 <= local158; local432++) {
							for (@Pc(437) int local437 = local115; local437 <= local126; local437++) {
								if (Static6.aBooleanArrayArray1[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt4812 = 5;
							local10.anInt4809 = (local10.anInt4814 - Static10.anInt148 << 8) / local14;
							local10.anInt4800 = (local10.anInt4806 - Static10.anInt148 << 8) / local14;
							local10.anInt4820 = (local10.anInt4810 - Static18.anInt389 << 8) / local14;
							local10.anInt4816 = (local10.anInt4817 - Static18.anInt389 << 8) / local14;
							Static71.aClass150Array1[Static236.anInt4758++] = local10;
						}
					}
				}
			}
		}
	}
}
