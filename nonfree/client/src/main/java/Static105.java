import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "[I")
	public static final int[] anIntArray182 = new int[32];

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZIILjava/lang/String;)I")
	public static int method2177(@OriginalArg(2) int arg0, @OriginalArg(3) String arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg1.length();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(43) char local43 = arg1.charAt(local37);
			if (local37 == 0) {
				if (local43 == '-') {
					local28 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(85) int local85;
			if (local43 >= '0' && local43 <= '9') {
				local85 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local85 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local85 = local43 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local85 >= arg0) {
				throw new NumberFormatException();
			}
			if (local28) {
				local85 = -local85;
			}
			@Pc(124) int local124 = arg0 * local32 + local85;
			if (local32 != local124 / arg0) {
				throw new NumberFormatException();
			}
			local30 = true;
			local32 = local124;
		}
		if (!local30) {
			throw new NumberFormatException();
		}
		return local32;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V")
	public static void method2178() {
		Static298.method4854(Static543.aClass181_112);
		Static547.aClass6_Sub26_Sub2_2.method4962(Static444.anInt8179);
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)Z")
	public static boolean method2179() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static325.aHashtable5.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static325.aHashtable5.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(33) Class local33 = Class.forName("java.lang.ClassLoader");
			@Pc(37) Field local37 = local33.getDeclaredField("nativeLibraries");
			@Pc(47) Method local47 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local47.invoke(local37, Boolean.TRUE);
			try {
				local12 = Static325.aHashtable5.keys();
				while (local12.hasMoreElements()) {
					@Pc(66) String local66 = (String) local12.nextElement();
					try {
						@Pc(71) File local71 = (File) Static116.aHashtable2.get(local66);
						@Pc(76) Class local76 = (Class) Static325.aHashtable5.get(local66);
						@Pc(82) Vector local82 = (Vector) local37.get(local76.getClassLoader());
						for (@Pc(84) int local84 = 0; local82.size() > local84; local84++) {
							try {
								@Pc(90) Object local90 = local82.elementAt(local84);
								@Pc(95) Field local95 = local90.getClass().getDeclaredField("name");
								local47.invoke(local95, Boolean.TRUE);
								try {
									@Pc(110) String local110 = (String) local95.get(local90);
									if (local110 != null && local110.equalsIgnoreCase(local71.getCanonicalPath())) {
										@Pc(122) Field local122 = local90.getClass().getDeclaredField("handle");
										@Pc(129) Method local129 = local90.getClass().getDeclaredMethod("finalize");
										local47.invoke(local122, Boolean.TRUE);
										local47.invoke(local129, Boolean.TRUE);
										try {
											local129.invoke(local90);
											local122.set(local90, Integer.valueOf(0));
											local9.remove(local66);
										} catch (@Pc(168) Throwable local168) {
										}
										local47.invoke(local129, Boolean.FALSE);
										local47.invoke(local122, Boolean.FALSE);
									}
								} catch (@Pc(190) Throwable local190) {
								}
								local47.invoke(local95, Boolean.FALSE);
							} catch (@Pc(202) Throwable local202) {
							}
						}
					} catch (@Pc(214) Throwable local214) {
					}
				}
			} catch (@Pc(220) Throwable local220) {
			}
			local47.invoke(local37, Boolean.FALSE);
		} catch (@Pc(238) Throwable local238) {
		}
		Static325.aHashtable5 = local9;
		return Static325.aHashtable5.isEmpty();
	}
}
