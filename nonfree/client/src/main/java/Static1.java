import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "B", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_1 = new Class184(61, -2);

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
	public static int anInt48 = 0;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[[[Lclient!tg;)V")
	public static void method57(@OriginalArg(1) Class217[][][] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class217[][] local6 = arg0[local1];
			for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
				for (@Pc(11) int local11 = 0; local11 < local6[local8].length; local11++) {
					@Pc(18) Class217 local18 = local6[local8][local11];
					if (local18 != null) {
						if (local18.aClass1_Sub2_1 instanceof Interface12) {
							((Interface12) local18.aClass1_Sub2_1).method5849();
						}
						if (local18.aClass1_Sub1_2 instanceof Interface12) {
							((Interface12) local18.aClass1_Sub1_2).method5849();
						}
						if (local18.aClass1_Sub1_3 instanceof Interface12) {
							((Interface12) local18.aClass1_Sub1_3).method5849();
						}
						if (local18.aClass1_Sub5_2 instanceof Interface12) {
							((Interface12) local18.aClass1_Sub5_2).method5849();
						}
						if (local18.aClass1_Sub5_3 instanceof Interface12) {
							((Interface12) local18.aClass1_Sub5_3).method5849();
						}
						for (@Pc(70) Class182 local70 = local18.aClass182_3; local70 != null; local70 = local70.aClass182_2) {
							@Pc(74) Class1_Sub3 local74 = local70.aClass1_Sub3_2;
							if (local74 instanceof Interface12) {
								((Interface12) local74).method5849();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!mv;ZI)V")
	public static void method59(@OriginalArg(0) Class1_Sub3_Sub3_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		if (Static169.anInt3551 >= 400) {
			return;
		}
		if (Static113.aClass1_Sub3_Sub3_Sub1_4 != arg0) {
			@Pc(70) String local70;
			@Pc(115) int local115;
			if (arg0.anInt4880 == 0) {
				@Pc(73) boolean local73 = true;
				if (Static113.aClass1_Sub3_Sub3_Sub1_4.anInt4893 != -1 && arg0.anInt4893 != -1) {
					@Pc(93) int local93 = Static113.aClass1_Sub3_Sub3_Sub1_4.anInt4882 > arg0.anInt4882 ? Static113.aClass1_Sub3_Sub3_Sub1_4.anInt4882 : arg0.anInt4882;
					@Pc(104) int local104 = Static113.aClass1_Sub3_Sub3_Sub1_4.anInt4893 >= arg0.anInt4893 ? arg0.anInt4893 : Static113.aClass1_Sub3_Sub3_Sub1_4.anInt4893;
					local115 = local93 * 10 / 100 + local104 + 5;
					@Pc(122) int local122 = Static113.aClass1_Sub3_Sub3_Sub1_4.anInt4882 - arg0.anInt4882;
					if (local122 < 0) {
						local122 = -local122;
					}
					if (local122 > local115) {
						local73 = false;
					}
				}
				@Pc(152) String local152 = Static69.aClass89_1 == Static114.aClass89_2 ? Static240.aClass175_155.method4201(Static216.anInt4257) : Static86.aClass175_61.method4201(Static216.anInt4257);
				if (arg0.anInt4882 < arg0.anInt4905) {
					local70 = arg0.method3930() + (local73 ? Static336.method4876(arg0.anInt4882, Static113.aClass1_Sub3_Sub3_Sub1_4.anInt4882) : "<col=ffffff>") + " (" + local152 + arg0.anInt4882 + "+" + (arg0.anInt4905 - arg0.anInt4882) + ")";
				} else {
					local70 = arg0.method3930() + (local73 ? Static336.method4876(arg0.anInt4882, Static113.aClass1_Sub3_Sub3_Sub1_4.anInt4882) : "<col=ffffff>") + " (" + local152 + arg0.anInt4882 + ")";
				}
			} else {
				local70 = arg0.method3930() + " (" + Static225.aClass175_143.method4201(Static216.anInt4257) + arg0.anInt4880 + ")";
			}
			if (Static59.aBoolean111) {
				if (!arg1 && (Static421.anInt4507 & 0x8) != 0) {
					Static112.method4934(0, 11, (long) arg0.anInt6066, -1, 0, false, Static128.aString25 + " -> <col=ffffff>" + local70, true, Static276.aString52, Static108.anInt3456);
				}
			} else if (arg1) {
				Static112.method4934(0, -1, 0L, 0, 0, true, "", false, "<col=cccccc>" + local70, -1);
			} else {
				for (@Pc(256) int local256 = 7; local256 >= 0; local256--) {
					if (Static88.aStringArray42[local256] != null) {
						@Pc(263) short local263 = 0;
						if (Static436.aClass89_3 == Static114.aClass89_2 && Static88.aStringArray42[local256].equalsIgnoreCase(Static148.aClass175_100.method4201(Static216.anInt4257))) {
							if (Static113.aClass1_Sub3_Sub3_Sub1_4.anInt4882 < arg0.anInt4882) {
								local263 = 2000;
							}
							if (Static113.aClass1_Sub3_Sub3_Sub1_4.anInt4876 != 0 && arg0.anInt4876 != 0) {
								if (Static113.aClass1_Sub3_Sub3_Sub1_4.anInt4876 == arg0.anInt4876) {
									local263 = 2000;
								} else {
									local263 = 0;
								}
							}
						} else if (Static324.aBooleanArray2[local256]) {
							local263 = 2000;
						}
						@Pc(320) short local320 = (short) (Static448.aShortArray117[local256] + local263);
						local115 = Static192.anIntArray295[local256] == -1 ? Static130.anInt6132 : Static192.anIntArray295[local256];
						Static112.method4934(0, local320, (long) arg0.anInt6066, -1, 0, false, "<col=ffffff>" + local70, true, Static88.aStringArray42[local256], local115);
					}
				}
			}
			if (!arg1) {
				for (@Pc(404) Class3_Sub38 local404 = (Class3_Sub38) Static374.aClass229_41.method5328(); local404 != null; local404 = (Class3_Sub38) Static374.aClass229_41.method5325()) {
					if (local404.anInt6532 == 21) {
						local404.aString59 = "<col=ffffff>" + local70;
						break;
					}
				}
			}
		} else if (Static59.aBoolean111 && (Static421.anInt4507 & 0x10) != 0) {
			Static112.method4934(0, 13, 0L, -1, 0, false, Static128.aString25 + " -> <col=ffffff>" + Static431.aClass175_239.method4201(Static216.anInt4257), true, Static276.aString52, Static108.anInt3456);
		}
	}
}
