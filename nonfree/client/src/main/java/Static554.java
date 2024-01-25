import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
	public static int anInt9828;

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "[I")
	public static final int[] anIntArray526 = new int[14];

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "[Lclient!bca;")
	public static final Class4_Sub5_Sub2[] aClass4_Sub5_Sub2Array4 = new Class4_Sub5_Sub2[14];

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "[F")
	public static final float[] aFloatArray69 = new float[16];

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
	public static void method8016() {
		Static589.aClass151_1.method6452();
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			Static92.aLongArray1[local18] = 0L;
		}
		for (@Pc(30) int local30 = 0; local30 < 32; local30++) {
			Static587.aLongArray18[local30] = 0L;
		}
		Static367.anInt7145 = 0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Z")
	public static boolean method8017(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class local8 = (Class) Static398.aHashtable7.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(29) File local29 = null;
		if (local29 == null) {
			local29 = (File) Static210.aHashtable4.get(arg1);
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
				Static398.aHashtable7.put(arg1, arg0);
				return true;
			} catch (@Pc(119) NoSuchMethodException local119) {
				System.load(local29.getPath());
				Static398.aHashtable7.put(arg1, gl.class);
				return true;
			} catch (@Pc(137) Throwable local137) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)I")
	public static int method8019(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)[Lclient!pc;")
	public static Class257[] method8022() {
		if (Static122.aClass257Array1 == null) {
			@Pc(16) Class257[] local16 = Static175.method3183(Static406.aClass354_5);
			@Pc(20) Class257[] local20 = new Class257[local16.length];
			@Pc(22) int local22 = 0;
			@Pc(27) int local27 = Static214.aClass4_Sub19_Sub1_1.method2796(Static495.anInt9000);
			@Pc(93) int local93;
			@Pc(99) Class257 local99;
			label69: for (@Pc(29) int local29 = 0; local29 < local16.length; local29++) {
				@Pc(35) Class257 local35 = local16[local29];
				if ((local35.anInt7528 <= 0 || local35.anInt7528 >= 24) && local35.anInt7525 >= 800 && local35.anInt7527 >= 600 && (local27 != 2 || local35.anInt7525 <= 800 && local35.anInt7527 <= 600) && (local27 != 1 || local35.anInt7525 <= 1024 && local35.anInt7527 <= 768)) {
					for (local93 = 0; local93 < local22; local93++) {
						local99 = local20[local93];
						if (local35.anInt7525 == local99.anInt7525 && local99.anInt7527 == local35.anInt7527) {
							if (local99.anInt7528 < local35.anInt7528) {
								local20[local93] = local35;
							}
							continue label69;
						}
					}
					local20[local22] = local35;
					local22++;
				}
			}
			Static122.aClass257Array1 = new Class257[local22];
			Static597.method3725(local20, 0, Static122.aClass257Array1, 0, local22);
			@Pc(159) int[] local159 = new int[Static122.aClass257Array1.length];
			for (local93 = 0; local93 < Static122.aClass257Array1.length; local93++) {
				local99 = Static122.aClass257Array1[local93];
				local159[local93] = local99.anInt7525 * local99.anInt7527;
			}
			Static487.method7236(local159, Static122.aClass257Array1);
		}
		return Static122.aClass257Array1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)Z")
	public static boolean method8025(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
