import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
	public static int anInt4165;

	@OriginalMember(owner = "client!gba", name = "p", descriptor = "[I")
	public static final int[] anIntArray213 = new int[13];

	@OriginalMember(owner = "client!gba", name = "r", descriptor = "I")
	public static int anInt4166 = 0;

	@OriginalMember(owner = "client!gba", name = "s", descriptor = "I")
	public static int anInt4167 = -2;

	@OriginalMember(owner = "client!gba", name = "t", descriptor = "[I")
	public static final int[] anIntArray214 = new int[4];

	@OriginalMember(owner = "client!gba", name = "v", descriptor = "I")
	public static int anInt4169 = 2;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Z")
	public static boolean method3639(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class local8 = (Class) Static287.aHashtable5.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(21) File local21 = null;
		if (local21 == null) {
			local21 = (File) Static590.aHashtable7.get(arg1);
		}
		if (local21 != null) {
			try {
				local21 = new File(local21.getCanonicalPath());
				@Pc(44) Class local44 = Class.forName("java.lang.Runtime");
				@Pc(47) Class local47 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(57) Method local57 = local47.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(73) Method local73 = local44.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local57.invoke(local73, Boolean.TRUE);
				local73.invoke(Runtime.getRuntime(), arg0, local21.getPath());
				local57.invoke(local73, Boolean.FALSE);
				Static287.aHashtable5.put(arg1, arg0);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local21.getPath());
				Static287.aHashtable5.put(arg1, bc.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
	public static void method3640() {
		if (Static195.anIntArray226 != null) {
			return;
		}
		Static195.anIntArray226 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(22) int local22 = 0; local22 < 65536; local22++) {
			@Pc(36) double local36 = (double) (local22 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(47) double local47 = (double) (local22 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(54) double local54 = (double) (local22 & 0x7F) / 128.0D;
			@Pc(56) double local56 = local54;
			@Pc(58) double local58 = local54;
			@Pc(60) double local60 = local54;
			if (local47 != 0.0D) {
				@Pc(74) double local74;
				if (local54 < 0.5D) {
					local74 = local54 * (local47 + 1.0D);
				} else {
					local74 = local54 + local47 - local54 * local47;
				}
				@Pc(91) double local91 = local54 * 2.0D - local74;
				@Pc(95) double local95 = local36 + 0.3333333333333333D;
				if (local95 > 1.0D) {
					local95--;
				}
				@Pc(109) double local109 = local36 - 0.3333333333333333D;
				if (local109 < 0.0D) {
					local109++;
				}
				if (local95 * 6.0D < 1.0D) {
					local56 = local91 + (local74 - local91) * 6.0D * local95;
				} else if (local95 * 2.0D < 1.0D) {
					local56 = local74;
				} else if (local95 * 3.0D < 2.0D) {
					local56 = (local74 - local91) * 6.0D * (0.6666666666666666D - local95) + local91;
				} else {
					local56 = local91;
				}
				if (local36 * 6.0D < 1.0D) {
					local58 = local91 + local36 * 6.0D * (local74 - local91);
				} else if (local36 * 2.0D < 1.0D) {
					local58 = local74;
				} else if (local36 * 3.0D < 2.0D) {
					local58 = (0.6666666666666666D - local36) * (local74 - local91) * 6.0D + local91;
				} else {
					local58 = local91;
				}
				if (local109 * 6.0D < 1.0D) {
					local60 = local91 + (local74 - local91) * 6.0D * local109;
				} else if (local109 * 2.0D < 1.0D) {
					local60 = local74;
				} else if (local109 * 3.0D < 2.0D) {
					local60 = local91 + (local74 - local91) * (0.6666666666666666D - local109) * 6.0D;
				} else {
					local60 = local91;
				}
			}
			local56 = Math.pow(local56, local20);
			local58 = Math.pow(local58, local20);
			local60 = Math.pow(local60, local20);
			@Pc(288) int local288 = (int) (local56 * 256.0D);
			@Pc(293) int local293 = (int) (local58 * 256.0D);
			@Pc(298) int local298 = (int) (local60 * 256.0D);
			@Pc(309) int local309 = (local293 << 8) + (local288 << 16) + local298;
			Static195.anIntArray226[local22] = local309;
		}
	}
}
