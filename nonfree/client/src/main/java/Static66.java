import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
	public static int anInt1793 = 0;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "J")
	public static long aLong46 = -1L;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
	public static int anInt1794 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Z")
	public static boolean method1525(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class local8 = (Class) Static420.aHashtable6.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(26) File local26 = null;
		if (local26 == null) {
			local26 = (File) Static155.aHashtable2.get(arg1);
		}
		if (local26 != null) {
			try {
				local26 = new File(local26.getCanonicalPath());
				@Pc(44) Class local44 = Class.forName("java.lang.Runtime");
				@Pc(47) Class local47 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(57) Method local57 = local47.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(73) Method local73 = local44.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local57.invoke(local73, Boolean.TRUE);
				local73.invoke(Runtime.getRuntime(), arg0, local26.getPath());
				local57.invoke(local73, Boolean.FALSE);
				Static420.aHashtable6.put(arg1, arg0);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local26.getPath());
				Static420.aHashtable6.put(arg1, kda.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(Z)V")
	public static void method1526() {
		if (Static483.aClass288_2 != null) {
			Static483.aClass288_2.method6799();
		}
		if (Static172.aClass288_1 != null) {
			Static172.aClass288_1.method6799();
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(FFIIIFII)[F")
	public static float[] method1527(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
		local6[3] = 0.0F;
		local6[1] = 0.0F;
		local6[0] = local17;
		local6[2] = local25;
		local6[6] = -local25;
		local6[8] = local17;
		local6[7] = 0.0F;
		local6[4] = 1.0F;
		local6[5] = 0.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(73) float local73 = 0.0F;
		@Pc(78) float local78 = (float) arg6 / 32767.0F;
		@Pc(89) float local89 = -((float) Math.sqrt((double) (1.0F - local78 * local78)));
		@Pc(94) float local94 = 1.0F - local78;
		@Pc(106) float local106 = (float) Math.sqrt((double) (arg3 * arg3 + arg2 * arg2));
		if (local106 == 0.0F && local78 == 0.0F) {
			local9 = local6;
		} else {
			if (local106 != 0.0F) {
				local73 = (float) arg3 / local106;
				local71 = (float) -arg2 / local106;
			}
			local69[4] = local78;
			local69[7] = -local71 * local89;
			local69[5] = local71 * local89;
			local69[1] = local73 * local89;
			local69[3] = local89 * -local73;
			local69[8] = local94 * local73 * local73 + local78;
			local69[0] = local94 * local71 * local71 + local78;
			local69[6] = local73 * local71 * local94;
			local69[2] = local94 * local71 * local73;
			local9[0] = local69[6] * local6[2] + local69[3] * local6[1] + local6[0] * local69[0];
			local9[1] = local69[7] * local6[2] + local6[0] * local69[1] + local6[1] * local69[4];
			local9[2] = local69[8] * local6[2] + local6[0] * local69[2] + local6[1] * local69[5];
			local9[3] = local6[4] * local69[3] + local69[0] * local6[3] + local6[5] * local69[6];
			local9[4] = local69[7] * local6[5] + local6[4] * local69[4] + local6[3] * local69[1];
			local9[5] = local6[5] * local69[8] + local69[2] * local6[3] + local6[4] * local69[5];
			local9[6] = local6[8] * local69[6] + local6[6] * local69[0] + local6[7] * local69[3];
			local9[7] = local69[7] * local6[8] + local6[7] * local69[4] + local6[6] * local69[1];
			local9[8] = local6[6] * local69[2] + local69[5] * local6[7] + local69[8] * local6[8];
		}
		local9[3] *= arg0;
		local9[2] *= arg1;
		local9[5] *= arg0;
		local9[7] *= arg5;
		local9[8] *= arg5;
		local9[0] *= arg1;
		local9[6] *= arg5;
		local9[4] *= arg0;
		local9[1] *= arg1;
		return local9;
	}
}
