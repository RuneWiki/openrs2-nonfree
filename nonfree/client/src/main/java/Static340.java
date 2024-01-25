import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "Z")
	public static boolean aBoolean439;

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "Lclient!b;")
	public static Class20 aClass20_88;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_80 = new Class244(53, 3);

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_84 = new Class57("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!tq", name = "v", descriptor = "[I")
	public static final int[] anIntArray618 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "Lclient!ea;")
	public static final Class63 aClass63_3 = new Class63("stellardawn", 1);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIII)V")
	public static void method5149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(10) Class12_Sub8 local10 = (Class12_Sub8) Static11.aClass22_8.method291(); local10 != null; local10 = (Class12_Sub8) Static11.aClass22_8.method292()) {
			if (local10.anInt5918 <= Static76.anInt1617) {
				local10.method5277();
			} else {
				Static219.method3671((local10.anInt5917 << 7) + 64, arg1 >> 1, arg3 >> 1, local10.anInt5914, (local10.anInt5911 << 7) + 64, local10.anInt5916 * 2);
				Static95.aClass150_6.method5728(local10.aString56, local10.anInt5910 | 0xFF000000, 0, arg0 + Static267.anIntArray621[1], Static267.anIntArray621[0] + arg2);
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IC)Z")
	public static boolean method5151(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
