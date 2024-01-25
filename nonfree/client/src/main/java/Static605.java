import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!vga", name = "i", descriptor = "[[Lclient!sca;")
	public static Class302[][] aClass302ArrayArray4;

	@OriginalMember(owner = "client!vga", name = "c", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_93 = new Class208(59, 3);

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(BII)I")
	public static int method8488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6;
		if (arg0 < arg1) {
			local6 = arg0;
			arg0 = arg1;
			arg1 = local6;
		}
		while (arg1 != 0) {
			local6 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(III)Z")
	public static boolean method8489(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)Z")
	public static boolean method8490() {
		@Pc(16) Hashtable local16 = new Hashtable();
		@Pc(19) Enumeration local19 = Static419.aHashtable6.keys();
		while (local19.hasMoreElements()) {
			@Pc(24) Object local24 = local19.nextElement();
			local16.put(local24, Static419.aHashtable6.get(local24));
		}
		try {
			@Pc(37) Class local37 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(40) Class local40 = Class.forName("java.lang.ClassLoader");
			@Pc(44) Field local44 = local40.getDeclaredField("nativeLibraries");
			@Pc(54) Method local54 = local37.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local54.invoke(local44, Boolean.TRUE);
			try {
				local19 = Static419.aHashtable6.keys();
				while (local19.hasMoreElements()) {
					@Pc(73) String local73 = (String) local19.nextElement();
					try {
						@Pc(78) File local78 = (File) Static51.aHashtable1.get(local73);
						@Pc(83) Class local83 = (Class) Static419.aHashtable6.get(local73);
						@Pc(89) Vector local89 = (Vector) local44.get(local83.getClassLoader());
						for (@Pc(91) int local91 = 0; local89.size() > local91; local91++) {
							try {
								@Pc(97) Object local97 = local89.elementAt(local91);
								@Pc(102) Field local102 = local97.getClass().getDeclaredField("name");
								local54.invoke(local102, Boolean.TRUE);
								try {
									@Pc(117) String local117 = (String) local102.get(local97);
									if (local117 != null && local117.equalsIgnoreCase(local78.getCanonicalPath())) {
										@Pc(129) Field local129 = local97.getClass().getDeclaredField("handle");
										@Pc(136) Method local136 = local97.getClass().getDeclaredMethod("finalize");
										local54.invoke(local129, Boolean.TRUE);
										local54.invoke(local136, Boolean.TRUE);
										try {
											local136.invoke(local97);
											local129.set(local97, Integer.valueOf(0));
											local16.remove(local73);
										} catch (@Pc(175) Throwable local175) {
										}
										local54.invoke(local136, Boolean.FALSE);
										local54.invoke(local129, Boolean.FALSE);
									}
								} catch (@Pc(197) Throwable local197) {
								}
								local54.invoke(local102, Boolean.FALSE);
							} catch (@Pc(209) Throwable local209) {
							}
						}
					} catch (@Pc(217) Throwable local217) {
					}
				}
			} catch (@Pc(223) Throwable local223) {
			}
			local54.invoke(local44, Boolean.FALSE);
		} catch (@Pc(235) Throwable local235) {
		}
		Static419.aHashtable6 = local16;
		return Static419.aHashtable6.isEmpty();
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(FB)F")
	public static float method8491(@OriginalArg(0) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(BLclient!sca;Lclient!ha;)V")
	public static void method8492(@OriginalArg(1) Class302 arg0, @OriginalArg(2) Class100 arg1) {
		@Pc(37) boolean local37 = Static266.aClass138_1.method3736(arg1, arg0.anInt8874, arg0.anInt8877, arg0.anInt8794, arg0.anInt8844 | 0xFF000000, arg0.anInt8808, arg0.aBoolean587 ? Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1 : null) == null;
		if (local37) {
			Static463.aClass8_55.method157(new Class6_Sub19(arg0.anInt8877, arg0.anInt8808, arg0.anInt8874, arg0.anInt8844 | 0xFF000000, arg0.anInt8794, arg0.aBoolean587));
			Static603.method8464(arg0);
		}
	}
}
