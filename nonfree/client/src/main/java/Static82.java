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

public final class Static82 {

	@OriginalMember(owner = "client!ob", name = "fb", descriptor = "Z")
	public static boolean aBoolean101;

	@OriginalMember(owner = "client!ob", name = "Z", descriptor = "Lclient!ja;")
	public static Class37 aClass37_10 = new Class37();

	@OriginalMember(owner = "client!ob", name = "db", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1190 = Static33.method650("Name eingeben:");

	@OriginalMember(owner = "client!ob", name = "eb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1191 = Static33.method650("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!ob", name = "gb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1192 = Static33.method650("Abbrechen");

	@OriginalMember(owner = "client!ob", name = "hb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1193 = Static33.method650("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
	public static void method1467() {
		aClass56_1191 = null;
		aClass37_10 = null;
		aClass56_1192 = null;
		aClass56_1190 = null;
		aClass56_1193 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method1468(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!cc;I)V")
	public static void method1471(@OriginalArg(1) Class3_Sub2_Sub1 arg0) {
		while (true) {
			@Pc(18) Class3_Sub7 local18 = (Class3_Sub7) Static70.aClass37_9.method989();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt1022; local25++) {
				if (local18.aClass54Array2[local25] != null) {
					if (local18.aClass54Array2[local25].anInt2077 == 2) {
						local18.anIntArray60[local25] = -5;
					}
					if (local18.aClass54Array2[local25].anInt2077 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass54Array1[local25] != null) {
					if (local18.aClass54Array1[local25].anInt2077 == 2) {
						local18.anIntArray60[local25] = -6;
					}
					if (local18.aClass54Array1[local25].anInt2077 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg0.method325(73);
			arg0.method303(0);
			@Pc(107) int local107 = arg0.anInt413;
			arg0.method280(local18.anInt1013);
			for (@Pc(114) int local114 = 0; local114 < local18.anInt1022; local114++) {
				if (local18.anIntArray60[local114] == 0) {
					try {
						@Pc(138) int local138 = local18.anIntArray62[local114];
						@Pc(150) Field local150;
						@Pc(154) int local154;
						if (local138 == 0) {
							local150 = (Field) local18.aClass54Array2[local114].anObject2;
							local154 = local150.getInt(null);
							arg0.method303(0);
							arg0.method280(local154);
						} else if (local138 == 1) {
							local150 = (Field) local18.aClass54Array2[local114].anObject2;
							local150.setInt(null, local18.anIntArray61[local114]);
							arg0.method303(0);
						} else if (local138 == 2) {
							local150 = (Field) local18.aClass54Array2[local114].anObject2;
							local154 = local150.getModifiers();
							arg0.method303(0);
							arg0.method280(local154);
						}
						@Pc(218) Method local218;
						if (local138 == 3) {
							local218 = (Method) local18.aClass54Array1[local114].anObject2;
							@Pc(223) byte[][] local223 = local18.aByteArrayArrayArray4[local114];
							@Pc(227) Object[] local227 = new Object[local223.length];
							for (@Pc(229) int local229 = 0; local229 < local223.length; local229++) {
								@Pc(241) ObjectInputStream local241 = new ObjectInputStream(new ByteArrayInputStream(local223[local229]));
								local227[local229] = local241.readObject();
							}
							@Pc(260) Object local260 = local218.invoke(null, local227);
							if (local260 == null) {
								arg0.method303(0);
							} else if (local260 instanceof Number) {
								arg0.method303(1);
								arg0.method300(((Number) local260).longValue());
							} else if (local260 instanceof Class56) {
								arg0.method303(2);
								arg0.method293((Class56) local260);
							} else {
								arg0.method303(4);
							}
						} else if (local138 == 4) {
							local218 = (Method) local18.aClass54Array1[local114].anObject2;
							local154 = local218.getModifiers();
							arg0.method303(0);
							arg0.method280(local154);
						}
					} catch (@Pc(328) ClassNotFoundException local328) {
						arg0.method303(-10);
					} catch (@Pc(334) InvalidClassException local334) {
						arg0.method303(-11);
					} catch (@Pc(340) StreamCorruptedException local340) {
						arg0.method303(-12);
					} catch (@Pc(346) OptionalDataException local346) {
						arg0.method303(-13);
					} catch (@Pc(352) IllegalAccessException local352) {
						arg0.method303(-14);
					} catch (@Pc(358) IllegalArgumentException local358) {
						arg0.method303(-15);
					} catch (@Pc(364) InvocationTargetException local364) {
						arg0.method303(-16);
					} catch (@Pc(370) SecurityException local370) {
						arg0.method303(-17);
					} catch (@Pc(376) IOException local376) {
						arg0.method303(-18);
					} catch (@Pc(382) NullPointerException local382) {
						arg0.method303(-19);
					} catch (@Pc(388) Exception local388) {
						arg0.method303(-20);
					} catch (@Pc(394) Throwable local394) {
						arg0.method303(-21);
					}
				} else {
					arg0.method303(local18.anIntArray60[local114]);
				}
			}
			arg0.method273(local107);
			arg0.method275(arg0.anInt413 - local107);
			local18.method2055();
		}
	}
}
