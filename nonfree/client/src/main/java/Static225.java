import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "Lclient!jt;")
	public static final Class150 aClass150_9 = new Class150(1);

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "[I")
	public static final int[] anIntArray409 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_94 = new Class239(70, 8);

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method3542(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static161.method2734(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local19; arg1.charAt(local30) != arg0; local30++) {
			}
			local15[local17++] = arg1.substring(local19, local30);
			local19 = local30 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZBLjava/awt/Component;)Lclient!re;")
	public static Class214 method3543(@OriginalArg(2) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class214_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class214) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class214_Sub2(arg0, true);
		}
	}
}
