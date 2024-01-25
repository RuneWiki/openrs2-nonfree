import java.awt.Component;
import java.lang.reflect.Constructor;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
	public static int anInt10310;

	@OriginalMember(owner = "client!hba", name = "q", descriptor = "[I")
	public static int[] anIntArray548;

	@OriginalMember(owner = "client!hba", name = "e", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable12 = new Hashtable();

	@OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
	public static int anInt10315 = 0;

	@OriginalMember(owner = "client!hba", name = "o", descriptor = "[I")
	public static final int[] anIntArray547 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BLjava/awt/Component;Z)Lclient!mo;")
	public static Class48 method8414(@OriginalArg(1) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class48_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class48) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class48_Sub2(arg0, true);
		}
	}
}
