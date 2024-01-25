import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
	public static int anInt5615;

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!lv", name = "v", descriptor = "I")
	public static int anInt5621;

	@OriginalMember(owner = "client!lv", name = "A", descriptor = "[I")
	public static int[] anIntArray427;

	@OriginalMember(owner = "client!lv", name = "h", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_114 = new Class298(7, 2);

	@OriginalMember(owner = "client!lv", name = "n", descriptor = "I")
	public static final int anInt5618 = 1401;

	@OriginalMember(owner = "client!lv", name = "u", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_115 = new Class298(48, -1);

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4857(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(22) Class3_Sub34 local22 = Static374.method5522(Static435.aClass298_148, Static220.aClass287_2);
			local22.aClass3_Sub11_Sub1_2.method3079(Static170.method2970(arg0));
			local22.aClass3_Sub11_Sub1_2.method3136(arg0);
			Static131.method2572(local22);
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILclient!ho;Lclient!ho;BZ)I")
	public static int method4860(@OriginalArg(0) int arg0, @OriginalArg(1) Class133_Sub1 arg1, @OriginalArg(2) Class133_Sub1 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg0 == 1) {
			local9 = arg1.anInt4090;
			local12 = arg2.anInt4090;
			if (!arg3) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg0 == 2) {
			return Static468.method6475(arg2.method3649().aString64, Static131.anInt2839, arg1.method3649().aString64);
		} else if (arg0 == 3) {
			if (arg1.aString49.equals("-")) {
				if (arg2.aString49.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString49.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static468.method6475(arg2.aString49, Static131.anInt2839, arg1.aString49);
			}
		} else if (arg0 == 4) {
			if (arg1.method3641()) {
				return arg2.method3641() ? 0 : 1;
			} else if (arg2.method3641()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg1.method3645()) {
				return arg2.method3645() ? 0 : 1;
			} else if (arg2.method3645()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg1.method3642()) {
				return arg2.method3642() ? 0 : 1;
			} else if (arg2.method3642()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg1.method3646()) {
				return arg2.method3646() ? 0 : 1;
			} else if (arg2.method3646()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local9 = arg1.anInt4104;
			local12 = arg2.anInt4104;
			if (arg3) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg1.anInt4101 - arg2.anInt4101;
		}
	}
}
