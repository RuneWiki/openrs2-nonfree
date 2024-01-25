import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Lclient!or;")
	public static Class259 aClass259_3;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!lo;")
	public static Class211 aClass211_1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
	public static boolean aBoolean121 = true;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lclient!ll;")
	public static Class1_Sub11 method1515(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class1_Sub11_Sub1");
			@Pc(15) Class1_Sub11 local15 = (Class1_Sub11) local11.getDeclaredConstructor().newInstance();
			local15.method7777(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class1_Sub11_Sub2 local26 = new Class1_Sub11_Sub2();
			local26.method7777(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
