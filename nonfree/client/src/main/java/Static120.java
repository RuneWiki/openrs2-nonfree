import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!en", name = "g", descriptor = "I")
	public static int anInt2747;

	@OriginalMember(owner = "client!en", name = "j", descriptor = "I")
	public static int anInt2749;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "Lclient!pw;")
	public static final Class261 aClass261_9 = new Class261(1);

	@OriginalMember(owner = "client!en", name = "i", descriptor = "Lclient!en;")
	public static final Class87 aClass87_4 = new Class87(2);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III)V")
	public static void method2387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub4_Sub6 local8 = Static367.method6025(12, arg0);
		local8.method1898();
		local8.anInt1945 = arg1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	public static void method2388() {
		Static212.aClass193_1.method6325();
		Static258.aClass116_1.method8253();
		Static173.aClient1.method1679();
		Static545.aCanvas14.setBackground(Color.black);
		Static467.anInt8731 = -1;
		Static212.aClass193_1 = Static514.method7667(Static545.aCanvas14);
		Static258.aClass116_1 = Static242.method4281(Static545.aCanvas14);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)V")
	public static void method2389(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub4_Sub6 local8 = Static367.method6025(12, arg0);
		local8.method1896();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)Lclient!jba;")
	public static Class69_Sub1 method2390() {
		return Static228.aClass69_Sub1Array1.length > Static92.anInt2288 ? Static228.aClass69_Sub1Array1[Static92.anInt2288++] : null;
	}
}
