import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!mo;")
	public static Class143 aClass143_40;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
	public static int anInt1627;

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "Lclient!gl;")
	public static Class2 aClass2_3;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "[Lclient!gn;")
	public static final Class79[] aClass79Array2 = new Class79[14];

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
	public static int anInt1635 = 0;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
	public static int anInt1636 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Z")
	public static boolean method1674() {
		return Static106.anInt2365 == 0 ? Static143.aClass14_Sub19_Sub4_2.method5540() : true;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIII)I")
	public static int method1676(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
	public static void method1677() {
		@Pc(5) Class11 local5 = Static277.aClass11_121;
		synchronized (Static277.aClass11_121) {
			Static277.aClass11_121.method215(5);
		}
		local5 = Static191.aClass11_86;
		synchronized (Static191.aClass11_86) {
			Static191.aClass11_86.method215(5);
		}
	}
}
