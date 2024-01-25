import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
	public static int anInt7873;

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "Lclient!hs;")
	public static final Class138 aClass138_4 = new Class138();

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "([III[ILclient!kea;I)Lclient!td;")
	public static Class86_Sub2 method6448(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class14_Sub2 arg3, @OriginalArg(5) int arg4) {
		@Pc(24) int local24;
		@Pc(35) int local35;
		@Pc(37) int local37;
		if (!arg3.method6924(Static239.aClass161_12, Static145.aClass219_10)) {
			@Pc(22) int[] local22 = new int[arg1 * arg4];
			for (local24 = 0; local24 < arg4; local24++) {
				local35 = local24 * arg1 + arg0[local24];
				for (local37 = 0; local37 < arg2[local24]; local37++) {
					local22[local35++] = -16777216;
				}
			}
			return new Class86_Sub2(arg3, arg1, arg4, local22);
		}
		@Pc(71) byte[] local71 = new byte[arg4 * arg1];
		for (local24 = 0; local24 < arg4; local24++) {
			local35 = arg0[local24] + local24 * arg1;
			for (local37 = 0; local37 < arg2[local24]; local37++) {
				local71[local35++] = -1;
			}
		}
		return new Class86_Sub2(arg3, arg1, arg4, local71);
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(Z)Z")
	public static boolean method6449() {
		@Pc(20) Hashtable local20 = new Hashtable();
		@Pc(23) Enumeration local23 = Static489.aHashtable5.keys();
		while (local23.hasMoreElements()) {
			@Pc(28) Object local28 = local23.nextElement();
			local20.put(local28, Static489.aHashtable5.get(local28));
		}
		try {
			@Pc(41) Class local41 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(44) Class local44 = Class.forName("java.lang.ClassLoader");
			@Pc(48) Field local48 = local44.getDeclaredField("nativeLibraries");
			@Pc(58) Method local58 = local41.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local58.invoke(local48, Boolean.TRUE);
			try {
				local23 = Static489.aHashtable5.keys();
				while (local23.hasMoreElements()) {
					@Pc(77) String local77 = (String) local23.nextElement();
					try {
						@Pc(82) File local82 = (File) Static399.aHashtable4.get(local77);
						@Pc(87) Class local87 = (Class) Static489.aHashtable5.get(local77);
						@Pc(93) Vector local93 = (Vector) local48.get(local87.getClassLoader());
						for (@Pc(95) int local95 = 0; local95 < local93.size(); local95++) {
							try {
								@Pc(101) Object local101 = local93.elementAt(local95);
								@Pc(106) Field local106 = local101.getClass().getDeclaredField("name");
								local58.invoke(local106, Boolean.TRUE);
								try {
									@Pc(121) String local121 = (String) local106.get(local101);
									if (local121 != null && local121.equalsIgnoreCase(local82.getCanonicalPath())) {
										@Pc(133) Field local133 = local101.getClass().getDeclaredField("handle");
										@Pc(140) Method local140 = local101.getClass().getDeclaredMethod("finalize");
										local58.invoke(local133, Boolean.TRUE);
										local58.invoke(local140, Boolean.TRUE);
										try {
											local140.invoke(local101);
											local133.set(local101, Integer.valueOf(0));
											local20.remove(local77);
										} catch (@Pc(179) Throwable local179) {
										}
										local58.invoke(local140, Boolean.FALSE);
										local58.invoke(local133, Boolean.FALSE);
									}
								} catch (@Pc(201) Throwable local201) {
								}
								local58.invoke(local106, Boolean.FALSE);
							} catch (@Pc(213) Throwable local213) {
							}
						}
					} catch (@Pc(221) Throwable local221) {
					}
				}
			} catch (@Pc(227) Throwable local227) {
			}
			local58.invoke(local48, Boolean.FALSE);
		} catch (@Pc(239) Throwable local239) {
		}
		Static489.aHashtable5 = local20;
		return Static489.aHashtable5.isEmpty();
	}
}
