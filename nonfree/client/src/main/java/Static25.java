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

public final class Static25 {

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "[I")
	public static int[] anIntArray516;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
	public static int anInt6259;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "[I")
	public static int[] anIntArray517;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "Lclient!ec;")
	public static final Class58 aClass58_38 = new Class58(512);

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
	public static int anInt6264 = 0;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
	public static void method5359() {
		Static216.aClass26_52.method329(5);
		Static310.aClass26_55.method329(5);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)V")
	public static void method5362(@OriginalArg(0) int arg0) {
		Static292.anInt5791 = 100;
		Static124.anInt2296 = arg0;
		Static31.anInt550 = -1;
		Static247.anInt4961 = 3;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBLclient!js;)V")
	public static void method5364(@OriginalArg(2) Class11_Sub25_Sub1 arg0) {
		while (true) {
			@Pc(17) Class11_Sub35 local17 = (Class11_Sub35) Static45.aClass16_10.method193();
			if (local17 == null) {
				return;
			}
			@Pc(22) boolean local22 = false;
			for (@Pc(24) int local24 = 0; local24 < local17.anInt5518; local24++) {
				if (local17.aClass2Array1[local24] != null) {
					if (local17.aClass2Array1[local24].anInt6 == 2) {
						local17.anIntArray423[local24] = -5;
					}
					if (local17.aClass2Array1[local24].anInt6 == 0) {
						local22 = true;
					}
				}
				if (local17.aClass2Array2[local24] != null) {
					if (local17.aClass2Array2[local24].anInt6 == 2) {
						local17.anIntArray423[local24] = -6;
					}
					if (local17.aClass2Array2[local24].anInt6 == 0) {
						local22 = true;
					}
				}
			}
			if (local22) {
				return;
			}
			arg0.method2454(3);
			arg0.method5186(0);
			@Pc(107) int local107 = arg0.anInt6076;
			arg0.method5168(local17.anInt5517);
			for (@Pc(114) int local114 = 0; local114 < local17.anInt5518; local114++) {
				if (local17.anIntArray423[local114] == 0) {
					try {
						@Pc(135) int local135 = local17.anIntArray420[local114];
						@Pc(147) Field local147;
						@Pc(175) int local175;
						if (local135 == 0) {
							local147 = (Field) local17.aClass2Array1[local114].anObject1;
							local175 = local147.getInt(null);
							arg0.method5186(0);
							arg0.method5168(local175);
						} else if (local135 == 1) {
							local147 = (Field) local17.aClass2Array1[local114].anObject1;
							local147.setInt(null, local17.anIntArray421[local114]);
							arg0.method5186(0);
						} else if (local135 == 2) {
							local147 = (Field) local17.aClass2Array1[local114].anObject1;
							local175 = local147.getModifiers();
							arg0.method5186(0);
							arg0.method5168(local175);
						}
						@Pc(218) Method local218;
						if (local135 == 3) {
							local218 = (Method) local17.aClass2Array2[local114].anObject1;
							@Pc(223) byte[][] local223 = local17.aByteArrayArrayArray10[local114];
							@Pc(227) Object[] local227 = new Object[local223.length];
							for (@Pc(229) int local229 = 0; local229 < local223.length; local229++) {
								@Pc(241) ObjectInputStream local241 = new ObjectInputStream(new ByteArrayInputStream(local223[local229]));
								local227[local229] = local241.readObject();
							}
							@Pc(260) Object local260 = local218.invoke(null, local227);
							if (local260 == null) {
								arg0.method5186(0);
							} else if (local260 instanceof Number) {
								arg0.method5186(1);
								arg0.method5178(((Number) local260).longValue());
							} else if (local260 instanceof String) {
								arg0.method5186(2);
								arg0.method5173((String) local260);
							} else {
								arg0.method5186(4);
							}
						} else if (local135 == 4) {
							local218 = (Method) local17.aClass2Array2[local114].anObject1;
							local175 = local218.getModifiers();
							arg0.method5186(0);
							arg0.method5168(local175);
						}
					} catch (@Pc(326) ClassNotFoundException local326) {
						arg0.method5186(-10);
					} catch (@Pc(332) InvalidClassException local332) {
						arg0.method5186(-11);
					} catch (@Pc(338) StreamCorruptedException local338) {
						arg0.method5186(-12);
					} catch (@Pc(344) OptionalDataException local344) {
						arg0.method5186(-13);
					} catch (@Pc(350) IllegalAccessException local350) {
						arg0.method5186(-14);
					} catch (@Pc(356) IllegalArgumentException local356) {
						arg0.method5186(-15);
					} catch (@Pc(362) InvocationTargetException local362) {
						arg0.method5186(-16);
					} catch (@Pc(368) SecurityException local368) {
						arg0.method5186(-17);
					} catch (@Pc(376) IOException local376) {
						arg0.method5186(-18);
					} catch (@Pc(382) NullPointerException local382) {
						arg0.method5186(-19);
					} catch (@Pc(390) Exception local390) {
						arg0.method5186(-20);
					} catch (@Pc(396) Throwable local396) {
						arg0.method5186(-21);
					}
				} else {
					arg0.method5186(local17.anIntArray423[local114]);
				}
			}
			arg0.method5176(local107);
			arg0.method5183(arg0.anInt6076 - local107);
			local17.method5701();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method5365(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + (((long) arg0.charAt(local12)) - local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
	public static void method5367() {
		if (Static291.aClass156_103 != null) {
			Static291.aClass156_103.method4190();
			Static291.aClass156_103 = null;
		}
		Static42.method638();
		Static181.method3072();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static211.aClass92Array1[local17].method1770();
		}
		Static204.method3650(false);
		System.gc();
		Static144.method2185();
		Static43.anInt850 = -1;
		Static120.aBoolean103 = false;
		Static352.method5666(true);
		Static19.anInt1986 = 0;
		Static325.aBoolean81 = false;
		Static182.anInt3662 = 0;
		Static16.anInt277 = 0;
		Static169.anInt6312 = 0;
		for (@Pc(56) int local56 = 0; local56 < Static23.aClass119Array1.length; local56++) {
			Static23.aClass119Array1[local56] = null;
		}
		Static141.anInt2601 = 0;
		Static331.anInt6366 = 0;
		for (@Pc(77) int local77 = 0; local77 < 2048; local77++) {
			Static105.aClass67_Sub3_Sub3_Sub2Array1[local77] = null;
			Static39.aClass11_Sub25Array1[local77] = null;
		}
		for (@Pc(99) int local99 = 0; local99 < 32768; local99++) {
			Static356.aClass67_Sub3_Sub3_Sub1Array1[local99] = null;
		}
		Static301.aClass58_35.method1011();
		Static49.method712();
		Static140.anInt2585 = 0;
		Static171.method2790();
		Static254.method4446();
		Static326.method4985();
		Static136.method5520(true);
		try {
			Static360.method555("loggedout", Static77.aClass118_7.anApplet1);
		} catch (@Pc(137) Throwable local137) {
		}
	}
}
