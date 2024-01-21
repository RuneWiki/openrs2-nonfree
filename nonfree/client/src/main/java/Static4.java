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

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "wb", descriptor = "I")
	public static int anInt156;

	@OriginalMember(owner = "client!ac", name = "mb", descriptor = "Lclient!ch;")
	public static Class14 aClass14_7 = new Class14(30);

	@OriginalMember(owner = "client!ac", name = "ub", descriptor = "Lclient!gg;")
	private static Class28 aClass28_63 = Static107.method1838("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!ac", name = "sb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_62 = aClass28_63;

	@OriginalMember(owner = "client!ac", name = "vb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_64 = Static107.method1838("null");

	@OriginalMember(owner = "client!ac", name = "xb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_65 = Static107.method1838("<br>(X");

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	public static void method129() {
		aClass28_65 = null;
		aClass28_64 = null;
		aClass28_63 = null;
		aClass14_7 = null;
		aClass28_62 = null;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)I")
	public static int method130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)Z")
	public static boolean method131(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
	public static void method132() {
		Static151.aClass2_Sub2_Sub1_3.method1714();
		@Pc(11) int local11 = Static151.aClass2_Sub2_Sub1_3.method1713(1);
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static151.aClass2_Sub2_Sub1_3.method1713(2);
		if (local19 == 0) {
			Static3.anIntArray228[Static83.anInt2114++] = 2047;
			return;
		}
		@Pc(41) int local41;
		@Pc(51) int local51;
		if (local19 == 1) {
			local41 = Static151.aClass2_Sub2_Sub1_3.method1713(3);
			Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.method1094(false, local41);
			local51 = Static151.aClass2_Sub2_Sub1_3.method1713(1);
			if (local51 == 1) {
				Static3.anIntArray228[Static83.anInt2114++] = 2047;
			}
			return;
		}
		@Pc(95) int local95;
		if (local19 == 2) {
			local41 = Static151.aClass2_Sub2_Sub1_3.method1713(3);
			Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.method1094(true, local41);
			local51 = Static151.aClass2_Sub2_Sub1_3.method1713(3);
			Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.method1094(true, local51);
			local95 = Static151.aClass2_Sub2_Sub1_3.method1713(1);
			if (local95 == 1) {
				Static3.anIntArray228[Static83.anInt2114++] = 2047;
			}
		} else if (local19 == 3) {
			local41 = Static151.aClass2_Sub2_Sub1_3.method1713(1);
			local51 = Static151.aClass2_Sub2_Sub1_3.method1713(7);
			local95 = Static151.aClass2_Sub2_Sub1_3.method1713(7);
			Static103.anInt2568 = Static151.aClass2_Sub2_Sub1_3.method1713(2);
			@Pc(137) int local137 = Static151.aClass2_Sub2_Sub1_3.method1713(1);
			if (local137 == 1) {
				Static3.anIntArray228[Static83.anInt2114++] = 2047;
			}
			Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.method1101(local95, local41 == 1, local51);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!le;IB)V")
	public static void method133(@OriginalArg(0) Class2_Sub2_Sub1 arg0) {
		while (true) {
			@Pc(15) Class2_Sub15 local15 = (Class2_Sub15) Static122.aClass65_11.method2115();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt2349; local22++) {
				if (local15.aClass41Array2[local22] != null) {
					if (local15.aClass41Array2[local22].anInt2096 == 2) {
						local15.anIntArray225[local22] = -5;
					}
					if (local15.aClass41Array2[local22].anInt2096 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass41Array1[local22] != null) {
					if (local15.aClass41Array1[local22].anInt2096 == 2) {
						local15.anIntArray225[local22] = -6;
					}
					if (local15.aClass41Array1[local22].anInt2096 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1711(219);
			arg0.method1700(0);
			@Pc(109) int local109 = arg0.anInt2385;
			arg0.method1710(local15.anInt2346);
			for (@Pc(116) int local116 = 0; local116 < local15.anInt2349; local116++) {
				if (local15.anIntArray225[local116] == 0) {
					try {
						@Pc(140) int local140 = local15.anIntArray224[local116];
						@Pc(149) Field local149;
						@Pc(153) int local153;
						if (local140 == 0) {
							local149 = (Field) local15.aClass41Array2[local116].anObject2;
							local153 = local149.getInt(null);
							arg0.method1700(0);
							arg0.method1710(local153);
						} else if (local140 == 1) {
							local149 = (Field) local15.aClass41Array2[local116].anObject2;
							local149.setInt(null, local15.anIntArray226[local116]);
							arg0.method1700(0);
						} else if (local140 == 2) {
							local149 = (Field) local15.aClass41Array2[local116].anObject2;
							local153 = local149.getModifiers();
							arg0.method1700(0);
							arg0.method1710(local153);
						}
						@Pc(219) Method local219;
						if (local140 == 3) {
							local219 = (Method) local15.aClass41Array1[local116].anObject2;
							@Pc(224) byte[][] local224 = local15.aByteArrayArrayArray6[local116];
							@Pc(228) Object[] local228 = new Object[local224.length];
							for (@Pc(230) int local230 = 0; local230 < local224.length; local230++) {
								@Pc(242) ObjectInputStream local242 = new ObjectInputStream(new ByteArrayInputStream(local224[local230]));
								local228[local230] = local242.readObject();
							}
							@Pc(261) Object local261 = local219.invoke(null, local228);
							if (local261 == null) {
								arg0.method1700(0);
							} else if (local261 instanceof Number) {
								arg0.method1700(1);
								arg0.method1666(((Number) local261).longValue());
							} else if (local261 instanceof Class28) {
								arg0.method1700(2);
								arg0.method1699((Class28) local261);
							} else {
								arg0.method1700(4);
							}
						} else if (local140 == 4) {
							local219 = (Method) local15.aClass41Array1[local116].anObject2;
							local153 = local219.getModifiers();
							arg0.method1700(0);
							arg0.method1710(local153);
						}
					} catch (@Pc(331) ClassNotFoundException local331) {
						arg0.method1700(-10);
					} catch (@Pc(337) InvalidClassException local337) {
						arg0.method1700(-11);
					} catch (@Pc(343) StreamCorruptedException local343) {
						arg0.method1700(-12);
					} catch (@Pc(349) OptionalDataException local349) {
						arg0.method1700(-13);
					} catch (@Pc(357) IllegalAccessException local357) {
						arg0.method1700(-14);
					} catch (@Pc(365) IllegalArgumentException local365) {
						arg0.method1700(-15);
					} catch (@Pc(371) InvocationTargetException local371) {
						arg0.method1700(-16);
					} catch (@Pc(377) SecurityException local377) {
						arg0.method1700(-17);
					} catch (@Pc(383) IOException local383) {
						arg0.method1700(-18);
					} catch (@Pc(389) NullPointerException local389) {
						arg0.method1700(-19);
					} catch (@Pc(395) Exception local395) {
						arg0.method1700(-20);
					} catch (@Pc(401) Throwable local401) {
						arg0.method1700(-21);
					}
				} else {
					arg0.method1700(local15.anIntArray225[local116]);
				}
			}
			arg0.method1708(local109);
			arg0.method1682(arg0.anInt2385 - local109);
			local15.method2888();
		}
	}
}
