import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public static int anInt3489;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!fha;")
	public static final Class101 aClass101_9 = new Class101(8, 4);

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Z")
	public static boolean aBoolean276 = false;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "[I")
	public static final int[] anIntArray156 = new int[1000];

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "[I")
	public static final int[] anIntArray157 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Z")
	public static boolean method2953(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(16) Class local16 = (Class) Static21.aHashtable2.get(arg1);
		if (local16 != null) {
			return local16.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(29) File local29 = null;
		if (local29 == null) {
			local29 = (File) Static236.aHashtable6.get(arg1);
		}
		if (local29 != null) {
			try {
				local29 = new File(local29.getCanonicalPath());
				@Pc(47) Class local47 = Class.forName("java.lang.Runtime");
				@Pc(50) Class local50 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(60) Method local60 = local50.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(76) Method local76 = local47.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local60.invoke(local76, Boolean.TRUE);
				local76.invoke(Runtime.getRuntime(), arg0, local29.getPath());
				local60.invoke(local76, Boolean.FALSE);
				Static21.aHashtable2.put(arg1, arg0);
				return true;
			} catch (@Pc(119) NoSuchMethodException local119) {
				System.load(local29.getPath());
				Static21.aHashtable2.put(arg1, l.class);
				return true;
			} catch (@Pc(137) Throwable local137) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BIII)I")
	public static int method2959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg2 >> 1) + (arg0 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10);
	}
}
