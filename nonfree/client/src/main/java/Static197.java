import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
	public static int anInt2872;

	@OriginalMember(owner = "client!hf", name = "D", descriptor = "[I")
	public static final int[] anIntArray242 = new int[8];

	@OriginalMember(owner = "client!hf", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[200];

	@OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
	public static int anInt2876 = -1;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
	public static void method2477() {
		Static227.aClass259_1 = new Class259(8);
		Static359.anInt3109 = 0;
		for (@Pc(17) Class12_Sub4 local17 = (Class12_Sub4) Static56.aClass220_1.method4661(); local17 != null; local17 = (Class12_Sub4) Static56.aClass220_1.method4660()) {
			local17.method4129();
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)V")
	public static void method2478(@OriginalArg(0) int arg0) {
		Static150.anInt2432 = 3;
		Static82.anInt1424 = 100;
		Static63.anInt1135 = arg0;
		Static340.anInt5890 = -1;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Z")
	public static boolean method2479(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class local8 = (Class) Static527.aHashtable6.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(21) File local21 = null;
		if (local21 == null) {
			local21 = (File) Static208.aHashtable1.get(arg1);
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
				Static527.aHashtable6.put(arg1, arg0);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local21.getPath());
				Static527.aHashtable6.put(arg1, fs.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V")
	public static void method2481() {
		if (Static73.anIntArray126 != null) {
			return;
		}
		Static73.anIntArray126 = new int[65536];
		@Pc(27) double local27 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < 512; local31++) {
			@Pc(44) float local44 = ((float) (local31 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(53) float local53 = (float) (local31 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(55) int local55 = 0; local55 < 128; local55++) {
				@Pc(62) float local62 = (float) local55 / 128.0F;
				@Pc(64) float local64 = 0.0F;
				@Pc(66) float local66 = 0.0F;
				@Pc(68) float local68 = 0.0F;
				@Pc(72) float local72 = local44 / 60.0F;
				@Pc(75) int local75 = (int) local72;
				@Pc(79) int local79 = local75 % 6;
				@Pc(85) float local85 = (float) -local75 + local72;
				@Pc(91) float local91 = local62 * (1.0F - local53);
				@Pc(100) float local100 = local62 * (1.0F - local53 * local85);
				@Pc(111) float local111 = (1.0F - (1.0F - local85) * local53) * local62;
				if (local79 == 0) {
					local66 = local111;
					local68 = local91;
					local64 = local62;
				} else if (local79 == 1) {
					local66 = local62;
					local64 = local100;
					local68 = local91;
				} else if (local79 == 2) {
					local64 = local91;
					local66 = local62;
					local68 = local111;
				} else if (local79 == 3) {
					local66 = local100;
					local68 = local62;
					local64 = local91;
				} else if (local79 == 4) {
					local66 = local91;
					local64 = local111;
					local68 = local62;
				} else if (local79 == 5) {
					local66 = local91;
					local64 = local62;
					local68 = local100;
				}
				local64 = (float) Math.pow((double) local64, local27);
				local66 = (float) Math.pow((double) local66, local27);
				local68 = (float) Math.pow((double) local68, local27);
				@Pc(203) int local203 = (int) (local64 * 256.0F);
				@Pc(208) int local208 = (int) (local66 * 256.0F);
				@Pc(213) int local213 = (int) (local68 * 256.0F);
				@Pc(225) int local225 = local213 + (local208 << 8) + (local203 << 16) - 16777216;
				Static73.anIntArray126[local29++] = local225;
			}
		}
	}
}
