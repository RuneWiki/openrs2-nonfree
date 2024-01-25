import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!qha", name = "fb", descriptor = "Lclient!go;")
	public static Class141 aClass141_2;

	@OriginalMember(owner = "client!qha", name = "Gb", descriptor = "[I")
	public static int[] anIntArray524;

	// $FF: synthetic field
	@OriginalMember(owner = "client!qha", name = "yb", descriptor = "Ljava/lang/Class;")
	private static Class aClass19;

	@OriginalMember(owner = "client!qha", name = "cb", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_152 = new Class322(42, 3);

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z)Z")
	public static boolean method7285(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		@Pc(8) Class local8 = (Class) Static241.aHashtable4.get(arg0);
		if (local8 != null) {
			return local8.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(30) File local30 = null;
		if (local30 == null) {
			local30 = (File) Static326.aHashtable5.get(arg0);
		}
		if (local30 != null) {
			try {
				local30 = new File(local30.getCanonicalPath());
				@Pc(50) Class local50 = Class.forName("java.lang.Runtime");
				@Pc(55) Class local55 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(67) Method local67 = local55.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(89) Method local89 = local50.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local67.invoke(local89, Boolean.TRUE);
				local89.invoke(Runtime.getRuntime(), arg1, local30.getPath());
				local67.invoke(local89, Boolean.FALSE);
				Static241.aHashtable4.put(arg0, arg1);
				return true;
			} catch (@Pc(132) NoSuchMethodException local132) {
				System.load(local30.getPath());
				Static241.aHashtable4.put(arg0, aClass19 == null ? (aClass19 = Class60_Sub1_Sub1_Sub5.a("jaa")) : aClass19);
				return true;
			} catch (@Pc(153) Throwable local153) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method7288(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(20) char local20 = arg0.charAt(local12);
			if (local20 == '<' || local20 == '>') {
				local10 += 3;
			}
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(local10 + local8);
		if (arg1 >= -20) {
			return null;
		}
		for (@Pc(58) int local58 = 0; local58 < local8; local58++) {
			@Pc(66) char local66 = arg0.charAt(local58);
			if (local66 == '<') {
				local48.append("<lt>");
			} else if (local66 == '>') {
				local48.append("<gt>");
			} else {
				local48.append(local66);
			}
		}
		return local48.toString();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIII)Lclient!qo;")
	public static Class60_Sub1_Sub1_Sub3 method7289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class243 local13 = Static334.aClass243ArrayArrayArray2[arg2][arg1][arg0];
		if (local13 == null) {
			return null;
		}
		@Pc(27) Class60_Sub1_Sub1_Sub3 local27 = null;
		@Pc(29) int local29 = -1;
		for (@Pc(32) Class123 local32 = local13.aClass123_5; local32 != null; local32 = local32.aClass123_1) {
			@Pc(36) Class60_Sub1_Sub1 local36 = local32.aClass60_Sub1_Sub1_1;
			if (local36 instanceof Class60_Sub1_Sub1_Sub3) {
				@Pc(42) Class60_Sub1_Sub1_Sub3 local42 = (Class60_Sub1_Sub1_Sub3) local36;
				@Pc(52) int local52 = (local42.method4424((byte) -28) - 1) * 256 + 252;
				@Pc(60) int local60 = local42.anInt9048 - local52 >> 9;
				@Pc(67) int local67 = local42.anInt9057 - local52 >> 9;
				@Pc(74) int local74 = local52 + local42.anInt9048 >> 9;
				@Pc(82) int local82 = local42.anInt9057 + local52 >> 9;
				if (local60 <= arg1 && local67 <= arg0 && local74 >= arg1 && arg0 <= local82) {
					@Pc(118) int local118 = (local74 + 1 - arg1) * (local82 + 1 + -arg0);
					if (local29 < local118) {
						local27 = local42;
						local29 = local118;
					}
				}
			}
		}
		return local27;
	}
}
