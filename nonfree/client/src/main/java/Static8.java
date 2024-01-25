import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Z")
	public static boolean method119(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(16) Class local16 = (Class) Static549.aHashtable7.get(arg1);
		if (local16 != null) {
			return local16.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(29) File local29 = null;
		if (local29 == null) {
			local29 = (File) Static207.aHashtable5.get(arg1);
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
				Static549.aHashtable7.put(arg1, arg0);
				return true;
			} catch (@Pc(119) NoSuchMethodException local119) {
				System.load(local29.getPath());
				Static549.aHashtable7.put(arg1, he.class);
				return true;
			} catch (@Pc(137) Throwable local137) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!uaa;I)V")
	public static void method120(@OriginalArg(0) Class345 arg0) {
		if (Static677.anInt10863 != arg0.anInt9644) {
			return;
		}
		if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aString45 == null) {
			arg0.anInt9602 = 0;
			arg0.anInt9624 = 0;
			return;
		}
		arg0.anInt9662 = 150;
		arg0.anInt9623 = (int) (Math.sin((double) Static26.anInt350 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt9656 = 5;
		arg0.anInt9624 = Static216.anInt4046;
		arg0.anInt9602 = Static300.method8586(Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aString45);
		arg0.anInt9601 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5479;
		arg0.anInt9604 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5477;
		arg0.anInt9658 = 0;
		arg0.anInt9646 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5499;
		@Pc(76) Class175 local76 = arg0.anInt9601 == -1 ? null : Static591.aClass66_2.method1768(arg0.anInt9601);
		if (local76 != null) {
			Static530.method7444(arg0.anInt9646, local76);
		}
	}
}
