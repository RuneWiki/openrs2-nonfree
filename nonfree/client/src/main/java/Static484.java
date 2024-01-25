import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
	public static int anInt9030;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "Z")
	public static boolean aBoolean752 = false;

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
	public static int anInt9032 = -1;

	@OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
	public static int anInt9039 = 0;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Z")
	public static boolean method7400(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class local8 = (Class) Static507.aHashtable6.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(36) File local36 = (File) Static598.aHashtable7.get(arg1);
		if (local36 != null) {
			try {
				local36 = new File(local36.getCanonicalPath());
				@Pc(47) Class local47 = Class.forName("java.lang.Runtime");
				@Pc(50) Class local50 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(60) Method local60 = local50.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(76) Method local76 = local47.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local60.invoke(local76, Boolean.TRUE);
				local76.invoke(Runtime.getRuntime(), arg0, local36.getPath());
				local60.invoke(local76, Boolean.FALSE);
				Static507.aHashtable6.put(arg1, arg0);
				return true;
			} catch (@Pc(119) NoSuchMethodException local119) {
				System.load(local36.getPath());
				Static507.aHashtable6.put(arg1, go.class);
				return true;
			} catch (@Pc(137) Throwable local137) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBI[BII)V")
	public static void method7401(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		arg2 += arg3;
		@Pc(29) int local29 = arg0 - arg3 >> 2;
		while (true) {
			local29--;
			if (local29 < 0) {
				local29 = arg0 - arg3 & 0x3;
				while (true) {
					local29--;
					if (local29 < 0) {
						return;
					}
					arg1[arg2++] = 1;
				}
			}
			@Pc(33) int local33 = arg2 + 1;
			arg1[arg2] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg1[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg1[local38] = 1;
			arg2 = local43 + 1;
			arg1[local43] = 1;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBI)I")
	public static int method7403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(34) int local34 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local34;
		}
		return arg0;
	}
}
