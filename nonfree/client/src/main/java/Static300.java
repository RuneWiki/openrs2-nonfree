import java.io.File;
import java.lang.reflect.Method;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "Lclient!tm;")
	public static Class321 aClass321_3;

	@OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
	public static int anInt9562;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger9 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
	public static int anInt9559 = 0;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIILclient!da;I)Lclient!cr;")
	public static Class48 method7775(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class52 arg2, @OriginalArg(4) int arg3) {
		return arg2 == null ? null : new Class48(arg0, arg1, arg3, arg2.K(), arg2.KA(), arg2.l(), arg2.J(), arg2.H(), arg2.OA(), arg2.za());
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Z")
	public static boolean method7776(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		@Pc(8) Class local8 = (Class) Static156.aHashtable4.get(arg0);
		if (local8 != null) {
			return local8.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(21) File local21 = null;
		if (local21 == null) {
			local21 = (File) Static122.aHashtable3.get(arg0);
		}
		if (local21 != null) {
			try {
				local21 = new File(local21.getCanonicalPath());
				@Pc(44) Class local44 = Class.forName("java.lang.Runtime");
				@Pc(47) Class local47 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(57) Method local57 = local47.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(73) Method local73 = local44.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local57.invoke(local73, Boolean.TRUE);
				local73.invoke(Runtime.getRuntime(), arg1, local21.getPath());
				local57.invoke(local73, Boolean.FALSE);
				Static156.aHashtable4.put(arg0, arg1);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local21.getPath());
				Static156.aHashtable4.put(arg0, fw.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}
}
