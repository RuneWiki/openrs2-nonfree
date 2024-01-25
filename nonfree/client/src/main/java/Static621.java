import java.awt.Component;
import java.lang.reflect.Constructor;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!vba", name = "B", descriptor = "[Lclient!dba;")
	public static final Class67[] aClass67Array1 = new Class67[4];

	@OriginalMember(owner = "client!vba", name = "K", descriptor = "I")
	public static int anInt10451 = 0;

	@OriginalMember(owner = "client!vba", name = "R", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable8 = new Hashtable();

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IZLjava/awt/Component;)Lclient!ul;")
	public static Class79 method8713(@OriginalArg(2) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class79_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class79) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class79_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!vba", name = "e", descriptor = "(B)Lclient!eo;")
	public static Class14_Sub19 method8714() {
		@Pc(11) Class14_Sub19 local11 = Static664.method9230();
		local11.aClass100_41 = null;
		local11.anInt2683 = 0;
		local11.aClass14_Sub29_Sub1_1 = new Class14_Sub29_Sub1(5000);
		return local11;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
	public static void method8720() {
		Static629.aClass264_62.method6360();
	}
}
