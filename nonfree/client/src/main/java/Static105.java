import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!n;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!ke;")
	public static Class43 aClass43_7;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "Lclient!ve;")
	public static Class81 aClass81_4;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "Lclient!c;")
	public static Class10 aClass10_27;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[100];

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
	public static int anInt2480 = 0;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "Lclient!od;")
	private static Class60 aClass60_974 = Static41.method597("M");

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Lclient!od;")
	public static Class60 aClass60_971 = aClass60_974;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "Lclient!od;")
	public static Class60 aClass60_972 = aClass60_974;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "Lclient!ed;")
	public static Class21 aClass21_1 = new Class21();

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "Lclient!od;")
	public static Class60 aClass60_973 = Static41.method597("null");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method1730() {
		if (Static126.aString5.toLowerCase().indexOf("microsoft") != -1) {
			Static130.anIntArray345[223] = 28;
			Static130.anIntArray345[220] = 74;
			Static130.anIntArray345[187] = 27;
			Static130.anIntArray345[191] = 73;
			Static130.anIntArray345[221] = 43;
			Static130.anIntArray345[186] = 57;
			Static130.anIntArray345[222] = 59;
			Static130.anIntArray345[190] = 72;
			Static130.anIntArray345[188] = 71;
			Static130.anIntArray345[189] = 26;
			Static130.anIntArray345[219] = 42;
			Static130.anIntArray345[192] = 58;
			return;
		}
		Static130.anIntArray345[92] = 74;
		Static130.anIntArray345[91] = 42;
		Static130.anIntArray345[59] = 57;
		Static130.anIntArray345[45] = 26;
		Static130.anIntArray345[61] = 27;
		Static130.anIntArray345[46] = 72;
		Static130.anIntArray345[44] = 71;
		Static130.anIntArray345[93] = 43;
		Static130.anIntArray345[47] = 73;
		if (Static126.aMethod1 == null) {
			Static130.anIntArray345[192] = 58;
			Static130.anIntArray345[222] = 59;
		} else {
			Static130.anIntArray345[222] = 58;
			Static130.anIntArray345[192] = 28;
			Static130.anIntArray345[520] = 59;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ie;IB)V")
	public static void method1731(@OriginalArg(0) Class4_Sub9_Sub1 arg0) {
		while (true) {
			@Pc(14) Class4_Sub5 local14 = (Class4_Sub5) Static32.aClass45_6.method982();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt864; local21++) {
				if (local14.aClass43Array2[local21] != null) {
					if (local14.aClass43Array2[local21].anInt1565 == 2) {
						local14.anIntArray90[local21] = -5;
					}
					if (local14.aClass43Array2[local21].anInt1565 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass43Array1[local21] != null) {
					if (local14.aClass43Array1[local21].anInt1565 == 2) {
						local14.anIntArray90[local21] = -6;
					}
					if (local14.aClass43Array1[local21].anInt1565 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method826(208);
			arg0.method819(0);
			@Pc(100) int local100 = arg0.anInt1312;
			arg0.method808(local14.anInt863);
			for (@Pc(107) int local107 = 0; local107 < local14.anInt864; local107++) {
				if (local14.anIntArray90[local107] == 0) {
					try {
						@Pc(128) int local128 = local14.anIntArray89[local107];
						@Pc(137) Field local137;
						@Pc(141) int local141;
						if (local128 == 0) {
							local137 = (Field) local14.aClass43Array2[local107].anObject2;
							local141 = local137.getInt(null);
							arg0.method819(0);
							arg0.method808(local141);
						} else if (local128 == 1) {
							local137 = (Field) local14.aClass43Array2[local107].anObject2;
							local137.setInt(null, local14.anIntArray88[local107]);
							arg0.method819(0);
						} else if (local128 == 2) {
							local137 = (Field) local14.aClass43Array2[local107].anObject2;
							local141 = local137.getModifiers();
							arg0.method819(0);
							arg0.method808(local141);
						}
						@Pc(205) Method local205;
						if (local128 == 3) {
							local205 = (Method) local14.aClass43Array1[local107].anObject2;
							@Pc(210) byte[][] local210 = local14.aByteArrayArrayArray2[local107];
							@Pc(214) Object[] local214 = new Object[local210.length];
							for (@Pc(216) int local216 = 0; local216 < local210.length; local216++) {
								@Pc(228) ObjectInputStream local228 = new ObjectInputStream(new ByteArrayInputStream(local210[local216]));
								local214[local216] = local228.readObject();
							}
							@Pc(247) Object local247 = local205.invoke(null, local214);
							if (local247 == null) {
								arg0.method819(0);
							} else if (local247 instanceof Number) {
								arg0.method819(1);
								arg0.method805(((Number) local247).longValue());
							} else if (local247 instanceof Class60) {
								arg0.method819(2);
								arg0.method788((Class60) local247);
							} else {
								arg0.method819(4);
							}
						} else if (local128 == 4) {
							local205 = (Method) local14.aClass43Array1[local107].anObject2;
							local141 = local205.getModifiers();
							arg0.method819(0);
							arg0.method808(local141);
						}
					} catch (@Pc(315) ClassNotFoundException local315) {
						arg0.method819(-10);
					} catch (@Pc(321) InvalidClassException local321) {
						arg0.method819(-11);
					} catch (@Pc(327) StreamCorruptedException local327) {
						arg0.method819(-12);
					} catch (@Pc(333) OptionalDataException local333) {
						arg0.method819(-13);
					} catch (@Pc(339) IllegalAccessException local339) {
						arg0.method819(-14);
					} catch (@Pc(345) IllegalArgumentException local345) {
						arg0.method819(-15);
					} catch (@Pc(351) InvocationTargetException local351) {
						arg0.method819(-16);
					} catch (@Pc(357) SecurityException local357) {
						arg0.method819(-17);
					} catch (@Pc(363) IOException local363) {
						arg0.method819(-18);
					} catch (@Pc(369) NullPointerException local369) {
						arg0.method819(-19);
					} catch (@Pc(375) Exception local375) {
						arg0.method819(-20);
					} catch (@Pc(381) Throwable local381) {
						arg0.method819(-21);
					}
				} else {
					arg0.method819(local14.anIntArray90[local107]);
				}
			}
			arg0.method807(local100);
			arg0.method817(arg0.anInt1312 - local100);
			local14.method1989();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
	public static void method1732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class4_Sub3_Sub17 local7 = Static12.method1771(arg0);
		@Pc(10) int local10 = local7.anInt2973;
		@Pc(18) int local18 = local7.anInt2970;
		@Pc(21) int local21 = local7.anInt2974;
		@Pc(27) int local27 = Class49.anIntArray190[local21 - local18];
		if (arg1 < 0 || local27 < arg1) {
			arg1 = 0;
		}
		local27 <<= local18;
		Static53.anIntArray141[local10] = arg1 << local18 & local27 | Static53.anIntArray141[local10] & ~local27;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Lclient!ef;")
	public static Class4_Sub3_Sub5 method1733(@OriginalArg(1) int arg0) {
		@Pc(18) Class4_Sub3_Sub5 local18 = (Class4_Sub3_Sub5) Static50.aClass12_11.method289((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static55.aClass10_17.method1774(16, arg0);
		local18 = new Class4_Sub3_Sub5();
		if (local28 != null) {
			local18.method494(new Class4_Sub9(local28));
		}
		Static50.aClass12_11.method290(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
	public static void method1734() {
		aClass60_974 = null;
		aBooleanArray15 = null;
		aClass81_4 = null;
		aClass60_971 = null;
		aClass52_1 = null;
		aClass60_973 = null;
		aClass21_1 = null;
		aClass60_972 = null;
		aClass43_7 = null;
		aClass10_27 = null;
	}
}
