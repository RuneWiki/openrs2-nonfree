import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
	public static int anInt1523;

	@OriginalMember(owner = "client!ja", name = "M", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!ja", name = "Z", descriptor = "Lclient!oc;")
	public static Class34 aClass34_40;

	@OriginalMember(owner = "client!ja", name = "kb", descriptor = "[Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3[] aClass1_Sub1_Sub6_Sub3Array5;

	@OriginalMember(owner = "client!ja", name = "fb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_819 = Static15.method178("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "Lclient!gd;")
	public static Class23 aClass23_813 = aClass23_819;

	@OriginalMember(owner = "client!ja", name = "E", descriptor = "Lclient!gd;")
	private static Class23 aClass23_814 = Static15.method178("glow3:");

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!ja", name = "G", descriptor = "Lclient!gd;")
	private static Class23 aClass23_815 = Static15.method178("Connecting to friendserver");

	@OriginalMember(owner = "client!ja", name = "I", descriptor = "J")
	public static long aLong39 = 0L;

	@OriginalMember(owner = "client!ja", name = "J", descriptor = "Lclient!gd;")
	public static Class23 aClass23_816 = Static15.method178("headicons_prayer");

	@OriginalMember(owner = "client!ja", name = "L", descriptor = "Lclient!gd;")
	public static Class23 aClass23_817 = aClass23_815;

	@OriginalMember(owner = "client!ja", name = "cb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_818 = aClass23_814;

	@OriginalMember(owner = "client!ja", name = "ib", descriptor = "[Lclient!q;")
	public static Class50[] aClass50Array1 = new Class50[4];

	@OriginalMember(owner = "client!ja", name = "nb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_820 = Static15.method178("headicons_pk");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V")
	public static void method952(@OriginalArg(1) int arg0) {
		@Pc(4) int[] local4 = Static31.aClass1_Sub1_Sub6_Sub1_2.anIntArray155;
		@Pc(12) int local12 = local4.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			local4[local14] = 0;
		}
		@Pc(39) int local39;
		@Pc(41) int local41;
		for (@Pc(26) int local26 = 1; local26 < 103; local26++) {
			local39 = (52736 - local26 * 512) * 4 + 24628;
			for (local41 = 1; local41 < 103; local41++) {
				if ((Static95.aByteArrayArrayArray5[arg0][local41][local26] & 0x18) == 0) {
					Static19.aClass65_1.method1749(local4, local39, arg0, local41, local26);
				}
				if (arg0 < 3 && (Static95.aByteArrayArrayArray5[arg0 + 1][local41][local26] & 0x8) != 0) {
					Static19.aClass65_1.method1749(local4, local39, arg0 + 1, local41, local26);
				}
				local39 += 4;
			}
		}
		local39 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
		Static31.aClass1_Sub1_Sub6_Sub1_2.method786();
		local41 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(150) int local150;
		for (@Pc(146) int local146 = 1; local146 < 103; local146++) {
			for (local150 = 1; local150 < 103; local150++) {
				if ((Static95.aByteArrayArrayArray5[arg0][local150][local146] & 0x18) == 0) {
					Static43.method911(local39, local146, local150, arg0, local41);
				}
				if (arg0 < 3 && (Static95.aByteArrayArrayArray5[arg0 + 1][local150][local146] & 0x8) != 0) {
					Static43.method911(local39, local146, local150, arg0 + 1, local41);
				}
			}
		}
		Static111.anInt2903 = 0;
		for (local150 = 0; local150 < 104; local150++) {
			for (@Pc(215) int local215 = 0; local215 < 104; local215++) {
				@Pc(223) int local223 = Static19.aClass65_1.method1762(Static79.anInt2137, local150, local215);
				if (local223 != 0) {
					local223 = local223 >> 14 & 0x7FFF;
					@Pc(239) int local239 = Static97.method1645(local223).anInt328;
					if (local239 >= 0) {
						@Pc(246) int local246 = local150;
						@Pc(248) int local248 = local215;
						if (local239 != 22 && local239 != 29 && local239 != 34 && local239 != 36 && local239 != 46 && local239 != 47 && local239 != 48) {
							@Pc(284) int[][] local284 = aClass50Array1[Static79.anInt2137].anIntArrayArray44;
							for (@Pc(286) int local286 = 0; local286 < 10; local286++) {
								@Pc(293) int local293 = (int) (Math.random() * 4.0D);
								if (local293 == 0 && local246 > 0 && local246 > local150 - 3 && (local284[local246 - 1][local248] & 0x1280108) == 0) {
									local246--;
								}
								if (local293 == 1 && local246 < 103 && local150 + 3 > local246 && (local284[local246 + 1][local248] & 0x1280180) == 0) {
									local246++;
								}
								if (local293 == 2 && local248 > 0 && local215 - 3 < local248 && (local284[local246][local248 - 1] & 0x1280102) == 0) {
									local248--;
								}
								if (local293 == 3 && local248 < 103 && local248 < local215 + 3 && (local284[local246][local248 + 1] & 0x1280120) == 0) {
									local248++;
								}
							}
						}
						Static77.aClass1_Sub1_Sub6_Sub1Array7[Static111.anInt2903] = Static67.aClass1_Sub1_Sub6_Sub1Array4[local239];
						Static9.anIntArray38[Static111.anInt2903] = local246;
						Static1.anIntArray10[Static111.anInt2903] = local248;
						Static111.anInt2903++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
	public static Class method953(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
	public static void method954() {
		anIntArrayArrayArray4 = null;
		aClass23_814 = null;
		aClass1_Sub1_Sub6_Sub3Array5 = null;
		aClass50Array1 = null;
		aClass34_40 = null;
		aClass23_815 = null;
		aClass23_818 = null;
		aClass23_820 = null;
		aClass23_817 = null;
		aClass23_819 = null;
		aClass23_813 = null;
		aClass23_816 = null;
	}
}
