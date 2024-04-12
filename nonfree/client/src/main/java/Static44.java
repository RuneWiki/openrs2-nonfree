import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
	public static int anInt1110;

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
	public static int anInt1114;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(JB)Lclient!o;", line = 17)
	public static Class40 method819(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(37) int local37 = 0;
			@Pc(39) long local39 = arg0;
			while (local39 != 0L) {
				local39 /= 37L;
				local37++;
			}
			@Pc(53) byte[] local53 = new byte[local37];
			while (arg0 != 0L) {
				@Pc(57) long local57 = arg0;
				arg0 /= 37L;
				local37--;
				local53[local37] = Class6.aByteArray1[(int) (local57 - arg0 * 37L)];
			}
			@Pc(82) Class40 local82 = new Class40();
			local82.aByteArray14 = local53;
			local82.anInt1783 = local53.length;
			return local82;
		}
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V", line = 97)
	public static void method820() {
		Static77.method1364();
		Static79.method1402();
		Static54.method996();
		Static74.method1344();
		Static68.method1210();
		Static29.method1675();
		Static75.method1357();
		Static13.method262();
		Static70.method1478();
		Static40.method1242();
		Static47.method850();
		Static27.method582();
		((Class19) Static6.anInterface4_1).method401();
		Static40.aClass5_Sub1_14.method57();
		Static79.aClass5_Sub1_18.method57();
		Static26.aClass5_Sub1_5.method57();
		Static33.aClass5_Sub1_7.method57();
		Static34.aClass5_Sub1_8.method57();
		Static77.aClass5_Sub1_17.method57();
		Static24.aClass5_Sub1_4.method57();
		Static74.aClass5_Sub1_16.method57();
		Static33.aClass5_Sub1_6.method57();
		Static73.aClass5_Sub1_15.method57();
		Static68.aClass5_Sub1_13.method57();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIB)I", line = 193)
	public static int method821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Class34.aByteArrayArrayArray7[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Class34.aByteArrayArrayArray7[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!gb;II)V", line = 265)
	public static void method822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub7 arg2, @OriginalArg(4) int arg3) {
		if (Class2_Sub6.anInt797 >= 400) {
			return;
		}
		if (arg2.anIntArray154 != null) {
			arg2 = arg2.method611();
		}
		if (arg2 == null || !arg2.aBoolean58) {
			return;
		}
		@Pc(30) Class40 local30 = arg2.aClass40_238;
		if (arg2.anInt766 != 0) {
			local30 = Static72.method1334(new Class40[] { local30, Static14.method1260(Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1378, arg2.anInt766), Class2.aClass40_731, Static48.method859(arg2.anInt766), Class56.aClass40_609 });
		}
		if (Class18.anInt1874 == 1) {
			Static20.method402(Static72.method1334(new Class40[] { Class20.aClass40_193, Class2_Sub2_Sub14.aClass40_601, Class45.aClass40_613, local30 }), 7, arg3, arg1, arg0);
		} else if (Class2_Sub2_Sub5.anInt641 != 1) {
			@Pc(80) Class40[] local80 = arg2.aClass40Array14;
			if (Class23.aBoolean60) {
				local80 = Static79.method1404(local80);
			}
			@Pc(94) int local94;
			if (local80 != null) {
				for (local94 = 4; local94 >= 0; local94--) {
					if (local80[local94] != null && !local80[local94].method1199(Class64.aClass40_729)) {
						@Pc(109) byte local109 = 0;
						if (local94 == 0) {
							local109 = 56;
						}
						if (local94 == 1) {
							local109 = 17;
						}
						if (local94 == 2) {
							local109 = 8;
						}
						if (local94 == 3) {
							local109 = 22;
						}
						if (local94 == 4) {
							local109 = 31;
						}
						Static20.method402(Static72.method1334(new Class40[] { local80[local94], Class11.aClass40_83, local30 }), local109, arg3, arg1, arg0);
					}
				}
			}
			if (local80 != null) {
				for (local94 = 4; local94 >= 0; local94--) {
					if (local80[local94] != null && local80[local94].method1199(Class64.aClass40_729)) {
						@Pc(192) short local192 = 0;
						if (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1378 < arg2.anInt766) {
							local192 = 2000;
						}
						@Pc(201) int local201 = 0;
						if (local94 == 0) {
							local201 = local192 + 56;
						}
						if (local94 == 1) {
							local201 = local192 + 17;
						}
						if (local94 == 2) {
							local201 = local192 + 8;
						}
						if (local94 == 3) {
							local201 = local192 + 22;
						}
						if (local94 == 4) {
							local201 = local192 + 31;
						}
						Static20.method402(Static72.method1334(new Class40[] { local80[local94], Class11.aClass40_83, local30 }), local201, arg3, arg1, arg0);
					}
				}
			}
			Static20.method402(Static72.method1334(new Class40[] { Class2_Sub2_Sub10.aClass40_322, local30 }), 1006, arg3, arg1, arg0);
			return;
		} else if ((Static78.anInt2027 & 0x2) == 2) {
			Static20.method402(Static72.method1334(new Class40[] { Class51.aClass40_567, Class11.aClass40_83, local30 }), 44, arg3, arg1, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V", line = 416)
	public static void method823() {
		Class12_Sub2.aClass40_343 = null;
		Class12_Sub2.aClass40_346 = null;
		Class12_Sub2.aClass40_345 = null;
		Class12_Sub2.aClass40_344 = null;
		Class12_Sub2.anIntArray234 = null;
		Class12_Sub2.anIntArray235 = null;
	}
}
