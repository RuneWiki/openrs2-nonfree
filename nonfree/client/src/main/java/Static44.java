import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "Lclient!ir;")
	public static Class100 aClass100_17;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
	public static int anInt900 = 0;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
	public static final int anInt901 = -1;

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "[S")
	public static final short[] aShortArray27 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
	public static void method737() {
		@Pc(1) Class198 local1 = Static336.aClass198_61;
		synchronized (Static336.aClass198_61) {
			Static336.aClass198_61.method5243(5);
		}
		local1 = Static182.aClass198_31;
		synchronized (Static182.aClass198_31) {
			Static182.aClass198_31.method5243(5);
		}
	}
}
