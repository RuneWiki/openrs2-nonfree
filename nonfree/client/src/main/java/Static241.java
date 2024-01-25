import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_42 = new Class87(8);

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "J")
	public static long aLong147 = 0L;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
	public static int anInt4974 = 0;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	public static void method4371() {
		if (Static28.anInt1015 < 102) {
			Static28.anInt1015 += 6;
		}
		if (Static195.anInt4169 != 0) {
			Static234.anInt4773 -= Static195.anInt4169 * 5;
			if (Static234.anInt4773 >= Static178.anInt3855) {
				Static234.anInt4773 = Static178.anInt3855 - 1;
			}
			Static195.anInt4169 = 0;
			if (Static234.anInt4773 < 0) {
				Static234.anInt4773 = 0;
			}
		}
		@Pc(51) int local51;
		for (@Pc(41) int local41 = 0; local41 < Static111.anInt2598; local41++) {
			local51 = Static256.aClass85Array1[local41].method2448();
			@Pc(57) char local57 = Static256.aClass85Array1[local41].method2443();
			if (local51 == 84) {
				Static114.method3919();
			} else if (Static57.aClass171_1.method4638(82) && local51 == 66) {
				if (Static154.aClipboard1 != null) {
					@Pc(74) String local74 = "";
					for (@Pc(79) int local79 = Static263.aStringArray56.length - 1; local79 >= 0; local79--) {
						if (Static263.aStringArray56[local79] != null && Static263.aStringArray56[local79].length() > 0) {
							local74 = local74 + Static263.aStringArray56[local79] + '\n';
						}
					}
					Static154.aClipboard1.setContents(new StringSelection(local74), null);
				}
			} else if (Static57.aClass171_1.method4638(82) && local51 == 67) {
				if (Static154.aClipboard1 != null) {
					@Pc(335) Transferable local335 = Static154.aClipboard1.getContents(null);
					if (local335 != null) {
						try {
							@Pc(342) String local342 = (String) local335.getTransferData(DataFlavor.stringFlavor);
							if (local342 != null) {
								@Pc(349) String[] local349 = Static309.method5164('\n', local342);
								if (local349.length > 1) {
									for (@Pc(357) int local357 = 0; local357 < local349.length; local357++) {
										Static243.aString52 = local349[local357];
										Static114.method3919();
									}
								} else {
									Static243.aString52 = Static243.aString52 + local342;
								}
							}
						} catch (@Pc(387) Exception local387) {
						}
					}
				}
			} else if (local51 == 85 && Static300.anInt5954 > 0) {
				Static243.aString52 = Static243.aString52.substring(0, Static300.anInt5954 - 1) + Static243.aString52.substring(Static300.anInt5954);
				Static300.anInt5954--;
			} else if (local51 == 101 && Static300.anInt5954 < Static243.aString52.length()) {
				Static243.aString52 = Static243.aString52.substring(0, Static300.anInt5954) + Static243.aString52.substring(Static300.anInt5954 + 1);
			} else if (local51 == 96 && Static300.anInt5954 > 0) {
				Static300.anInt5954--;
			} else if (local51 == 97 && Static300.anInt5954 < Static243.aString52.length()) {
				Static300.anInt5954++;
			} else if (local51 == 102) {
				Static300.anInt5954 = 0;
			} else if (local51 == 103) {
				Static300.anInt5954 = Static243.aString52.length();
			} else if (local51 == 104 && Static276.anInt5645 < Static263.aStringArray56.length) {
				Static276.anInt5645++;
				Static106.method2326();
				Static300.anInt5954 = Static243.aString52.length();
			} else if (local51 == 105 && Static276.anInt5645 > 0) {
				Static276.anInt5645--;
				Static106.method2326();
				Static300.anInt5954 = Static243.aString52.length();
			} else if (Static107.method2332(local57) || local57 == ':' || local57 == ',' || local57 == ' ' || local57 == '_' || local57 == '-' || local57 == '+') {
				Static243.aString52 = Static243.aString52.substring(0, Static300.anInt5954) + Static256.aClass85Array1[local41].method2443() + Static243.aString52.substring(Static300.anInt5954);
				Static300.anInt5954++;
			}
		}
		Static111.anInt2598 = 0;
		for (local51 = 0; local51 < 100; local51++) {
			@Pc(409) int local409;
			if (Static18.aBooleanArray2[local51]) {
				local409 = Static31.anIntArray95[local51]++;
				if (Static31.anIntArray95[local51] > 102) {
					Static18.aBooleanArray2[local51] = false;
				}
			} else {
				local409 = Static31.anIntArray95[local51]--;
				if (Static31.anIntArray95[local51] < 0) {
					Static344.anIntArray525[local51] = (int) (Math.random() * (double) Static194.anInt4145);
					Static158.anIntArray314[local51] = (int) (Math.random() * 350.0D);
					Static31.anIntArray95[local51] = 0;
					Static18.aBooleanArray2[local51] = true;
				}
			}
		}
		Static45.method1050();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZLclient!kj;)V")
	public static void method4374(@OriginalArg(1) Class8_Sub5 arg0) {
		arg0.aClass17_1 = null;
		@Pc(17) int local17 = arg0.aClass8_Sub3Array1.length;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			arg0.aClass8_Sub3Array1[local19].aBoolean196 = false;
		}
		@Pc(37) Class217[] local37 = Class45.aClass217Array1;
		synchronized (Class45.aClass217Array1) {
			if (Class45.aClass217Array1.length > local17 && Static122.anIntArray251[local17] < 200) {
				Class45.aClass217Array1[local17].method5678(arg0);
				@Pc(58) int local58 = Static122.anIntArray251[local17]++;
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
	public static void method4376() {
		@Pc(14) int local14 = Static311.aClass1_Sub8_Sub1_8.method3238(8);
		@Pc(19) int local19;
		if (Static357.anInt4331 > local14) {
			for (local19 = local14; local19 < Static357.anInt4331; local19++) {
				Static87.anIntArray210[Static113.anInt2650++] = Static298.anIntArray492[local19];
			}
		}
		if (Static357.anInt4331 < local14) {
			throw new RuntimeException("gppov1");
		}
		Static357.anInt4331 = 0;
		for (local19 = 0; local19 < local14; local19++) {
			@Pc(53) int local53 = Static298.anIntArray492[local19];
			@Pc(57) Class17_Sub1_Sub1_Sub1 local57 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local53];
			@Pc(62) int local62 = Static311.aClass1_Sub8_Sub1_8.method3238(1);
			if (local62 == 0) {
				Static298.anIntArray492[Static357.anInt4331++] = local53;
				local57.anInt4852 = Static5.anInt208;
			} else {
				@Pc(82) int local82 = Static311.aClass1_Sub8_Sub1_8.method3238(2);
				if (local82 == 0) {
					Static298.anIntArray492[Static357.anInt4331++] = local53;
					local57.anInt4852 = Static5.anInt208;
					Static191.anIntArray373[Static125.anInt2818++] = local53;
				} else {
					@Pc(129) int local129;
					@Pc(139) int local139;
					if (local82 == 1) {
						Static298.anIntArray492[Static357.anInt4331++] = local53;
						local57.anInt4852 = Static5.anInt208;
						local129 = Static311.aClass1_Sub8_Sub1_8.method3238(3);
						local57.method559(local129, 1);
						local139 = Static311.aClass1_Sub8_Sub1_8.method3238(1);
						if (local139 == 1) {
							Static191.anIntArray373[Static125.anInt2818++] = local53;
						}
					} else if (local82 == 2) {
						Static298.anIntArray492[Static357.anInt4331++] = local53;
						local57.anInt4852 = Static5.anInt208;
						if (Static311.aClass1_Sub8_Sub1_8.method3238(1) == 1) {
							local129 = Static311.aClass1_Sub8_Sub1_8.method3238(3);
							local57.method559(local129, 2);
							local139 = Static311.aClass1_Sub8_Sub1_8.method3238(3);
							local57.method559(local139, 2);
						} else {
							local129 = Static311.aClass1_Sub8_Sub1_8.method3238(3);
							local57.method559(local129, 0);
						}
						local129 = Static311.aClass1_Sub8_Sub1_8.method3238(1);
						if (local129 == 1) {
							Static191.anIntArray373[Static125.anInt2818++] = local53;
						}
					} else if (local82 == 3) {
						Static87.anIntArray210[Static113.anInt2650++] = local53;
					}
				}
			}
		}
	}
}
