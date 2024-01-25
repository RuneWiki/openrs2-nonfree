import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!je", name = "D", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!je", name = "H", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!je", name = "K", descriptor = "Lclient!g;")
	public static Class83 aClass83_65;

	@OriginalMember(owner = "client!je", name = "y", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_97 = new Class208(94, 15);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lclient!dl;")
	public static Class55 method2828(@OriginalArg(1) int arg0) {
		@Pc(10) Class55 local10 = (Class55) Static56.aClass41_60.method823((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static346.aClass83_121.method1968(arg0, 0);
		local10 = new Class55();
		if (local20 != null) {
			local10.method1269(new Class2_Sub24(local20));
		}
		local10.method1267();
		Static56.aClass41_60.method832((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) Class2_Sub15 local7 = null;
		for (@Pc(12) Class2_Sub15 local12 = (Class2_Sub15) Static35.aClass238_3.method5795(); local12 != null; local12 = (Class2_Sub15) Static35.aClass238_3.method5799()) {
			if (arg3 == local12.anInt2543 && arg5 == local12.anInt2548 && local12.anInt2545 == arg0 && arg2 == local12.anInt2544) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub15();
			local7.anInt2548 = arg5;
			local7.anInt2544 = arg2;
			local7.anInt2543 = arg3;
			local7.anInt2545 = arg0;
			Static243.method4285(local7);
			Static35.aClass238_3.method5796(local7);
		}
		local7.anInt2542 = arg4;
		local7.anInt2549 = -1;
		local7.anInt2536 = arg6;
		local7.anInt2541 = 0;
		local7.anInt2538 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(BII)V")
	public static void method2835(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class243 local10 = new Class243(16);
		for (@Pc(15) Class2_Sub30 local15 = (Class2_Sub30) Static301.aClass243_24.method5975(); local15 != null; local15 = (Class2_Sub30) Static301.aClass243_24.method5973()) {
			local15.method6130();
			@Pc(26) int local26 = (int) (local15.aLong213 >> 28);
			@Pc(36) int local36 = (int) (local15.aLong213 >> 14 & 0x3FFFL) - arg1;
			@Pc(45) int local45 = (int) (local15.aLong213 & 0x3FFFL) - arg0;
			if (local45 >= 0 && local36 >= 0 && local45 < Static89.anInt1891 && local36 < Static85.anInt1839) {
				local10.method5968((long) (local26 << 28 | local36 << 14 | local45), local15);
			}
		}
		Static301.aClass243_24 = local10;
	}
}
