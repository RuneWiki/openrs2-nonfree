import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!pn", name = "F", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_112 = new Class47(26, 0);

	@OriginalMember(owner = "client!pn", name = "I", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_130 = new Class73(32, 19);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)Lclient!ls;")
	public static Class199 method5868(@OriginalArg(0) int arg0) {
		@Pc(8) Class199[] local8 = Static260.method4378();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class199 local21 = local8[local15];
			if (local21.anInt5522 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
	public static void method5870() {
		Static25.aClass14_1.method6831(Static326.aFloat139, Static99.aFloat23, Static89.aFloat22);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Z")
	public static boolean method5872(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class local12 = (Class) Static489.aHashtable5.get(arg1);
		if (local12 != null) {
			return local12.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(30) File local30 = (File) Static399.aHashtable4.get(arg1);
		if (local30 != null) {
			try {
				local30 = new File(local30.getCanonicalPath());
				@Pc(41) Class local41 = Class.forName("java.lang.Runtime");
				@Pc(44) Class local44 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(54) Method local54 = local44.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(70) Method local70 = local41.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local54.invoke(local70, Boolean.TRUE);
				local70.invoke(Runtime.getRuntime(), arg0, local30.getPath());
				local54.invoke(local70, Boolean.FALSE);
				Static489.aHashtable5.put(arg1, arg0);
				return true;
			} catch (@Pc(113) NoSuchMethodException local113) {
				System.load(local30.getPath());
				Static489.aHashtable5.put(arg1, qn.class);
				return true;
			} catch (@Pc(131) Throwable local131) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZ)S")
	public static short method5873(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(44) int local44 = local24 <= 64 ? local20 * local24 >> 7 : (127 - local24) * local20 >> 7;
		@Pc(48) int local48 = local44 + local24;
		@Pc(57) int local57;
		if (local48 == 0) {
			local57 = local44 << 1;
		} else {
			local57 = (local44 << 8) / local48;
		}
		return (short) (local48 | local14 << 10 | local57 >> 4 << 7);
	}
}
