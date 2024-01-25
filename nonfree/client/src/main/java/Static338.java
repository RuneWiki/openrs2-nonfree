import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!kea", name = "v", descriptor = "I")
	public static int anInt5414;

	@OriginalMember(owner = "client!kea", name = "w", descriptor = "I")
	public static int anInt5430;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(III)Z")
	public static boolean method4837(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)Z")
	public static boolean method4840() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static393.aHashtable4.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static393.aHashtable4.get(local17));
		}
		try {
			@Pc(32) Class local32 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(37) Class local37 = Class.forName("java.lang.ClassLoader");
			@Pc(43) Field local43 = local37.getDeclaredField("nativeLibraries");
			@Pc(55) Method local55 = local32.getDeclaredMethod("setAccessible", Boolean.TYPE);
			if (45 != 45) {
				method4845(-87, (Class182) null);
			}
			local55.invoke(local43, Boolean.TRUE);
			try {
				local12 = Static393.aHashtable4.keys();
				while (local12.hasMoreElements()) {
					@Pc(84) String local84 = (String) local12.nextElement();
					try {
						@Pc(89) File local89 = (File) Static687.aHashtable7.get(local84);
						@Pc(94) Class local94 = (Class) Static393.aHashtable4.get(local84);
						@Pc(100) Vector local100 = (Vector) local43.get(local94.getClassLoader());
						for (@Pc(102) int local102 = 0; local100.size() > local102; local102++) {
							try {
								@Pc(108) Object local108 = local100.elementAt(local102);
								@Pc(115) Field local115 = local108.getClass().getDeclaredField("name");
								local55.invoke(local115, Boolean.TRUE);
								try {
									@Pc(130) String local130 = (String) local115.get(local108);
									if (local130 != null && local130.equalsIgnoreCase(local89.getCanonicalPath())) {
										@Pc(146) Field local146 = local108.getClass().getDeclaredField("handle");
										@Pc(155) Method local155 = local108.getClass().getDeclaredMethod("finalize");
										local55.invoke(local146, Boolean.TRUE);
										local55.invoke(local155, Boolean.TRUE);
										try {
											local155.invoke(local108);
											local146.set(local108, Integer.valueOf(0));
											local9.remove(local84);
										} catch (@Pc(194) Throwable local194) {
										}
										local55.invoke(local155, Boolean.FALSE);
										local55.invoke(local146, Boolean.FALSE);
									}
								} catch (@Pc(216) Throwable local216) {
								}
								local55.invoke(local115, Boolean.FALSE);
							} catch (@Pc(228) Throwable local228) {
							}
						}
					} catch (@Pc(238) Throwable local238) {
					}
				}
			} catch (@Pc(244) Throwable local244) {
			}
			local55.invoke(local43, Boolean.FALSE);
		} catch (@Pc(256) Throwable local256) {
		}
		Static393.aHashtable4 = local9;
		return Static393.aHashtable4.isEmpty();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4842(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V")
	public static void method4844() {
		for (@Pc(13) Class3_Sub7_Sub5 local13 = (Class3_Sub7_Sub5) Static242.aClass147_2.method3334(); local13 != null; local13 = (Class3_Sub7_Sub5) Static242.aClass147_2.method3332()) {
			if (local13.anInt2315 > 1) {
				local13.anInt2315 = 0;
				Static365.aClass307_60.method7000(local13, ((Class3_Sub7_Sub10) local13.aClass147_1.aClass3_Sub7_28.aClass3_Sub7_67).aLong144);
				local13.aClass147_1.method3331();
			}
		}
		Static716.anInt11158 = 0;
		Static239.anInt3802 = 0;
		Static419.aClass342_81.method7655();
		Static158.aClass313_15.method7101();
		Static242.aClass147_2.method3331();
		Static530.aBoolean556 = false;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!ik;)V")
	public static void method4845(@OriginalArg(0) int arg0, @OriginalArg(1) Class182 arg1) {
		Static22.anInt715 = 0;
		Static207.anInt3411 = 0;
		if (arg0 != 32) {
			return;
		}
		Static228.aClass319_15 = new Class319();
		Static452.aClass9_Sub2_Sub1_Sub1Array2 = new Class9_Sub2_Sub1_Sub1[1024];
		Static374.aClass9_Sub5Array1 = new Class9_Sub5[Static280.anIntArray333[Static233.anInt3759] + 1];
		Static102.anInt2169 = 0;
		Static647.anInt9986 = 0;
		Static175.method2822(arg1);
		Static250.method3518(arg1);
	}
}
