import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
	public static int anInt4135;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_56 = new Class160(83, 1);

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
	public static int anInt4138 = 13156520;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	public static void method3567() {
		Static246.aClass121_7.X(Static1.anInt35, Static480.aClass6_Sub37_Sub1_1.aBoolean406 ? Static435.anInt7600 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;IC)I")
	public static int method3568(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0.charAt(local12) == arg1) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(III)Z")
	public static boolean method3570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static101.method1651(arg1, arg0)) {
			return Static177.method2709(arg1, arg0) | (arg1 & 0xB000) != 0 | Static378.method5524(arg0, arg1) ? true : (arg0 & 0x37) == 0 & (Static550.method7576(arg0, arg1) | Static151.method2221(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
	public static void method3571() {
		Static400.aClass191Array2 = null;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
	public static void method3572(@OriginalArg(0) int arg0) {
		@Pc(16) Class6_Sub1_Sub5 local16 = Static77.method1176(arg0, 5);
		local16.method770();
	}
}
