import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "Lclient!pga;")
	public static Class260 aClass260_4;

	@OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
	public static int anInt2566;

	@OriginalMember(owner = "client!fd", name = "H", descriptor = "Lclient!so;")
	public static final Class309 aClass309_3 = new Class309();

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_23 = new Class70(29, 6);

	@OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
	public static int anInt2565 = -1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)Z")
	public static boolean method2035(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!sf;")
	public static Class1_Sub26 method2036(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class1_Sub26_Sub1");
			@Pc(15) Class1_Sub26 local15 = (Class1_Sub26) local11.getDeclaredConstructor().newInstance();
			local15.method7342(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class1_Sub26_Sub2 local26 = new Class1_Sub26_Sub2();
			local26.method7342(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)[Lclient!ff;")
	public static Class101[] method2037() {
		return new Class101[] { Static458.aClass101_13, Static401.aClass101_11, Static571.aClass101_18, Static464.aClass101_14, Static401.aClass101_10, Static336.aClass101_9, Static75.aClass101_16, Static245.aClass101_8, Static150.aClass101_4, Static188.aClass101_6, Static554.aClass101_17, Static527.aClass101_15, Static218.aClass101_7, Static37.aClass101_1 };
	}
}
