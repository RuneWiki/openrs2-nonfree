import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!go", name = "b", descriptor = "Lclient!l;")
	public static Interface7 anInterface7_2;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "[I")
	public static final int[] anIntArray283 = new int[8];

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)Lclient!mo;")
	public static Class1_Sub28 method1912() {
		if (Static377.aClass203_40 == null || Static231.aClass78_1 == null) {
			return null;
		}
		for (@Pc(21) Class1_Sub28 local21 = (Class1_Sub28) Static231.aClass78_1.method1751(); local21 != null; local21 = (Class1_Sub28) Static231.aClass78_1.method1751()) {
			@Pc(28) Class47 local28 = Static377.aClass170_4.method3739(local21.anInt4940);
			if (local28 != null && local28.aBoolean99 && local28.method1081(Static377.anInterface4_2)) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!cd;")
	public static Class1_Sub9 method1915(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class1_Sub9_Sub1");
			@Pc(15) Class1_Sub9 local15 = (Class1_Sub9) local11.getDeclaredConstructor().newInstance();
			local15.method5363(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class1_Sub9_Sub2 local26 = new Class1_Sub9_Sub2();
			local26.method5363(arg0);
			return local26;
		}
	}
}
