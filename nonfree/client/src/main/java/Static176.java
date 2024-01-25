import java.io.File;
import java.lang.reflect.Method;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
	public static int anInt3514;

	@OriginalMember(owner = "client!hf", name = "P", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("cbaeec6ab1feb2b2a48da69ff3fbab8f8fee1376ad75cf2b19df40a196dec70675c0546173268f8b29b61142defd86a8863efb12cc60d72438f944402acd30d7", 16);

	@OriginalMember(owner = "client!hf", name = "R", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_157 = new Class305(107, -2);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Z")
	public static boolean method3268(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class local13 = (Class) Static530.aHashtable7.get(arg1);
		if (local13 == null) {
			@Pc(33) File local33 = (File) Static311.aHashtable4.get(arg1);
			if (local33 != null) {
				try {
					local33 = new File(local33.getCanonicalPath());
					@Pc(44) Class local44 = Class.forName("java.lang.Runtime");
					@Pc(47) Class local47 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(57) Method local57 = local47.getDeclaredMethod("setAccessible", Boolean.TYPE);
					@Pc(73) Method local73 = local44.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
					local57.invoke(local73, Boolean.TRUE);
					local73.invoke(Runtime.getRuntime(), arg0, local33.getPath());
					local57.invoke(local73, Boolean.FALSE);
					Static530.aHashtable7.put(arg1, arg0);
					return true;
				} catch (@Pc(116) NoSuchMethodException local116) {
					System.load(local33.getPath());
					Static530.aHashtable7.put(arg1, cv.class);
					return true;
				} catch (@Pc(134) Throwable local134) {
				}
			}
			return false;
		} else if (local13.getClassLoader() == arg0.getClassLoader()) {
			return true;
		} else {
			throw new RuntimeException();
		}
	}
}
