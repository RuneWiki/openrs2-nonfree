import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "Lclient!o;")
	public static Class6 aClass6_39;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "Lclient!sd;")
	public static final Class220 aClass220_26 = new Class220(15, 0, 1, 0);

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_119 = new Class12(73, -1);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public static void method3498() {
		Static190.aClass102_23.method2271();
		Static370.aClass102_46.method2271();
		Static17.aClass102_3.method2271();
		Static36.aClass102_52.method2271();
		Static238.aClass102_28.method2271();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
	public static void method3502(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub5_Sub11 local12 = Static188.method2688(arg0, 5);
		local12.method2661();
		local12.anInt3213 = arg1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIII)V")
	public static void method3504(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(10) Class4_Sub5 local10 = (Class4_Sub5) Static172.aClass262_5.method5819(); local10 != null; local10 = (Class4_Sub5) Static172.aClass262_5.method5813()) {
			if (local10.anInt5970 <= Static236.anInt4213) {
				local10.method5572();
			} else {
				Static116.method1850((local10.anInt5961 << 7) + 64, arg1 >> 1, (local10.anInt5960 << 7) + 64, local10.anInt5967 * 2, arg0 >> 1, local10.anInt5966);
				Static121.aClass76_2.method4594(0, local10.anInt5963 | 0xFF000000, Static224.anIntArray240[0] + arg3, local10.aString68, arg2 + Static224.anIntArray240[1]);
			}
		}
	}
}
