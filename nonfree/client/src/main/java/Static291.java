import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "J")
	public static long aLong146 = -1L;

	@OriginalMember(owner = "client!kha", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[6][];

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method4299(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = arg3 - 334;
		if (local12 < 0) {
			local12 = 0;
		} else if (local12 > 100) {
			local12 = 100;
		}
		@Pc(39) int local39 = local12 * (Static88.aShort20 - Static503.aShort55) / 100 + Static503.aShort55;
		@Pc(45) int local45 = local39 * arg4 >> 8;
		Static461.anInt7840 = Static461.anInt7805 * local39 >> 8;
		@Pc(58) int local58 = 16384 - arg1 & 0x3FFF;
		@Pc(65) int local65 = 16384 - arg6 & 0x3FFF;
		@Pc(67) int local67 = 0;
		@Pc(69) int local69 = 0;
		@Pc(71) int local71 = local45;
		if (local58 != 0) {
			local69 = Class5_Sub12_Sub1.anIntArray748[local58] * -local45 >> 14;
			local71 = Class5_Sub12_Sub1.anIntArray749[local58] * local45 >> 14;
		}
		if (local65 != 0) {
			local67 = local71 * Class5_Sub12_Sub1.anIntArray748[local65] >> 14;
			local71 = local71 * Class5_Sub12_Sub1.anIntArray749[local65] >> 14;
		}
		Static218.anInt3744 = arg1;
		Static70.anInt9231 = arg2 - local67;
		Static646.anInt10445 = arg0 - local71;
		Static21.anInt457 = 0;
		Static216.anInt3726 = arg5 - local69;
		Static608.anInt9971 = arg6;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)Z")
	public static boolean method4300() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static54.aHashtable2.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static54.aHashtable2.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(33) Class local33 = Class.forName("java.lang.ClassLoader");
			@Pc(37) Field local37 = local33.getDeclaredField("nativeLibraries");
			@Pc(47) Method local47 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local47.invoke(local37, Boolean.TRUE);
			try {
				local12 = Static54.aHashtable2.keys();
				while (local12.hasMoreElements()) {
					@Pc(74) String local74 = (String) local12.nextElement();
					try {
						@Pc(79) File local79 = (File) Static498.aHashtable7.get(local74);
						@Pc(84) Class local84 = (Class) Static54.aHashtable2.get(local74);
						@Pc(90) Vector local90 = (Vector) local37.get(local84.getClassLoader());
						for (@Pc(92) int local92 = 0; local90.size() > local92; local92++) {
							try {
								@Pc(98) Object local98 = local90.elementAt(local92);
								@Pc(103) Field local103 = local98.getClass().getDeclaredField("name");
								local47.invoke(local103, Boolean.TRUE);
								try {
									@Pc(118) String local118 = (String) local103.get(local98);
									if (local118 != null && local118.equalsIgnoreCase(local79.getCanonicalPath())) {
										@Pc(130) Field local130 = local98.getClass().getDeclaredField("handle");
										@Pc(137) Method local137 = local98.getClass().getDeclaredMethod("finalize");
										local47.invoke(local130, Boolean.TRUE);
										local47.invoke(local137, Boolean.TRUE);
										try {
											local137.invoke(local98);
											local130.set(local98, Integer.valueOf(0));
											local9.remove(local74);
										} catch (@Pc(176) Throwable local176) {
										}
										local47.invoke(local137, Boolean.FALSE);
										local47.invoke(local130, Boolean.FALSE);
									}
								} catch (@Pc(198) Throwable local198) {
								}
								local47.invoke(local103, Boolean.FALSE);
							} catch (@Pc(210) Throwable local210) {
							}
						}
					} catch (@Pc(218) Throwable local218) {
					}
				}
			} catch (@Pc(224) Throwable local224) {
			}
			local47.invoke(local37, Boolean.FALSE);
		} catch (@Pc(236) Throwable local236) {
		}
		Static54.aHashtable2 = local9;
		return Static54.aHashtable2.isEmpty();
	}
}
