import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!sh", name = "J", descriptor = "Lclient!ed;")
	public static final Class93 aClass93_22 = new Class93(14, 0, 4, 1);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BZ[B)V")
	public static void method7075(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static450.aClass3_Sub4_4 == null) {
			Static450.aClass3_Sub4_4 = new Class3_Sub4(20000);
		}
		Static450.aClass3_Sub4_4.method7939(arg1, arg1.length, 0);
		if (!arg0) {
			return;
		}
		Static388.method5438(Static450.aClass3_Sub4_4.aByteArray90);
		Static588.aClass236_Sub1Array2 = new Class236_Sub1[Static569.anInt9180];
		@Pc(39) int local39 = 0;
		for (@Pc(41) int local41 = Static77.anInt1372; local41 <= Static195.anInt3524; local41++) {
			@Pc(47) Class236_Sub1 local47 = Static429.method5921(local41);
			if (local47 != null) {
				Static588.aClass236_Sub1Array2[local39++] = local47;
			}
		}
		Static238.aBoolean398 = false;
		Static607.aLong277 = Static15.method380();
		Static450.aClass3_Sub4_4 = null;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZZIII)V")
	public static void method7076(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static587.method7789();
		Static451.aLong200 = 0L;
		@Pc(19) int local19 = Static241.method3664();
		if (arg1 == 3 || local19 == 3) {
			arg0 = true;
		}
		if (!Static119.aClass95_4.method8016()) {
			arg0 = true;
		}
		Static346.method5028(arg1, arg2, local19, arg0, arg3);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Z")
	public static boolean method7077(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		@Pc(13) Class local13 = (Class) Static217.aHashtable12.get(arg0);
		if (local13 != null) {
			return local13.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(26) File local26 = null;
		if (local26 == null) {
			local26 = (File) Static128.aHashtable4.get(arg0);
		}
		if (local26 != null) {
			try {
				local26 = new File(local26.getCanonicalPath());
				@Pc(44) Class local44 = Class.forName("java.lang.Runtime");
				@Pc(47) Class local47 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(57) Method local57 = local47.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(73) Method local73 = local44.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local57.invoke(local73, Boolean.TRUE);
				local73.invoke(Runtime.getRuntime(), arg1, local26.getPath());
				local57.invoke(local73, Boolean.FALSE);
				Static217.aHashtable12.put(arg0, arg1);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local26.getPath());
				Static217.aHashtable12.put(arg0, caa.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}
}
