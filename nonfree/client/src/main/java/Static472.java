import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "Lclient!ae;")
	public static final Class8 aClass8_55 = new Class8();

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
	public static int anInt8066 = 0;

	@OriginalMember(owner = "client!rv", name = "A", descriptor = "I")
	public static int anInt8075 = 0;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZ)V")
	public static void method6646(@OriginalArg(1) boolean arg0) {
		Static352.method5248();
		if (!Static28.method5282(Static201.anInt3963)) {
			return;
		}
		Static354.anInt4541++;
		if (Static354.anInt4541 < 50 && !arg0) {
			return;
		}
		Static354.anInt4541 = 0;
		if (!Static68.aBoolean123 && Static57.aClass116_1 != null) {
			@Pc(37) Class2_Sub42 local37 = Static249.method3910(Static320.aClass286_104, Static400.aClass145_2);
			Static531.method7296(local37);
			try {
				Static550.method7463();
			} catch (@Pc(44) IOException local44) {
				Static68.aBoolean123 = true;
			}
		}
		Static352.method5248();
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Z)V")
	public static void method6648() {
		if (Static407.aClass347_3 == null) {
			return;
		}
		if (Static407.aClass347_3.anInt9172 == 1) {
			Static407.aClass347_3 = null;
			return;
		}
		if (Static407.aClass347_3.anInt9172 == 2) {
			Static585.method7928(Static114.aString19, Static140.aClass287_4, 2);
			Static407.aClass347_3 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method6649(@OriginalArg(1) String arg0) {
		if (!Class6_Sub1_Sub5_Sub2.lb.aBoolean630) {
			return -1;
		} else if (Static9.aHashtable1.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(25) String local25 = Static484.method6805(arg0);
			if (local25 == null) {
				return -1;
			}
			@Pc(38) String local38 = Static421.aString73 + local25;
			if (!Static75.aClass259_34.method5959(local38, "")) {
				return -1;
			} else if (Static75.aClass259_34.method5982(local38)) {
				@Pc(64) byte[] local64 = Static75.aClass259_34.method5965(local38, "");
				@Pc(70) File local70;
				try {
					local70 = Static303.method4552(local25);
				} catch (@Pc(72) RuntimeException local72) {
					return -1;
				}
				if (local64 == null || local70 == null) {
					return -1;
				}
				@Pc(80) boolean local80 = true;
				@Pc(84) byte[] local84 = Static382.method5651(local70);
				if (local84 != null && local84.length == local64.length) {
					for (@Pc(101) int local101 = 0; local101 < local84.length; local101++) {
						if (local84[local101] != local64[local101]) {
							local80 = false;
							break;
						}
					}
				} else {
					local80 = false;
				}
				try {
					if (!local80) {
						Class6_Sub1_Sub5_Sub2.lb.method6532(local70, local64);
					}
				} catch (@Pc(137) Throwable local137) {
					return -1;
				}
				Static222.method3493(arg0, local70);
				return 100;
			} else {
				return Static75.aClass259_34.method5972(local38);
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)Z")
	public static boolean method6650() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static405.aHashtable6.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static405.aHashtable6.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(41) Class local41 = Class.forName("java.lang.ClassLoader");
			@Pc(45) Field local45 = local41.getDeclaredField("nativeLibraries");
			@Pc(55) Method local55 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local55.invoke(local45, Boolean.TRUE);
			try {
				local12 = Static405.aHashtable6.keys();
				while (local12.hasMoreElements()) {
					@Pc(74) String local74 = (String) local12.nextElement();
					try {
						@Pc(79) File local79 = (File) Static9.aHashtable1.get(local74);
						@Pc(84) Class local84 = (Class) Static405.aHashtable6.get(local74);
						@Pc(90) Vector local90 = (Vector) local45.get(local84.getClassLoader());
						for (@Pc(92) int local92 = 0; local90.size() > local92; local92++) {
							try {
								@Pc(98) Object local98 = local90.elementAt(local92);
								@Pc(103) Field local103 = local98.getClass().getDeclaredField("name");
								local55.invoke(local103, Boolean.TRUE);
								try {
									@Pc(118) String local118 = (String) local103.get(local98);
									if (local118 != null && local118.equalsIgnoreCase(local79.getCanonicalPath())) {
										@Pc(130) Field local130 = local98.getClass().getDeclaredField("handle");
										@Pc(137) Method local137 = local98.getClass().getDeclaredMethod("finalize");
										local55.invoke(local130, Boolean.TRUE);
										local55.invoke(local137, Boolean.TRUE);
										try {
											local137.invoke(local98);
											local130.set(local98, Integer.valueOf(0));
											local9.remove(local74);
										} catch (@Pc(176) Throwable local176) {
										}
										local55.invoke(local137, Boolean.FALSE);
										local55.invoke(local130, Boolean.FALSE);
									}
								} catch (@Pc(198) Throwable local198) {
								}
								local55.invoke(local103, Boolean.FALSE);
							} catch (@Pc(210) Throwable local210) {
							}
						}
					} catch (@Pc(218) Throwable local218) {
					}
				}
			} catch (@Pc(224) Throwable local224) {
			}
			local55.invoke(local45, Boolean.FALSE);
		} catch (@Pc(236) Throwable local236) {
		}
		Static405.aHashtable6 = local9;
		return Static405.aHashtable6.isEmpty();
	}
}
