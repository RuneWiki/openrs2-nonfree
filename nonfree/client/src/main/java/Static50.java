import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bka", name = "i", descriptor = "I")
	public static int anInt1040 = 500;

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IILclient!nd;ZLclient!nd;)I")
	public static int method975(@OriginalArg(0) int arg0, @OriginalArg(2) Class235_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class235_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg0 == 1) {
			local9 = arg1.anInt6473;
			local12 = arg3.anInt6473;
			if (!arg2) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg0 == 2) {
			return Static613.method8478(Static616.anInt10077, arg3.method5489().aString119, arg1.method5489().aString119);
		} else if (arg0 == 3) {
			if (arg1.aString89.equals("-")) {
				if (arg3.aString89.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString89.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static613.method8478(Static616.anInt10077, arg3.aString89, arg1.aString89);
			}
		} else if (arg0 == 4) {
			if (arg1.method5480()) {
				return arg3.method5480() ? 0 : 1;
			} else if (arg3.method5480()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg1.method5484()) {
				return arg3.method5484() ? 0 : 1;
			} else if (arg3.method5484()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg1.method5479()) {
				return arg3.method5479() ? 0 : 1;
			} else if (arg3.method5479()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg1.method5482()) {
				return arg3.method5482() ? 0 : 1;
			} else if (arg3.method5482()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local9 = arg1.anInt6481;
			local12 = arg3.anInt6481;
			if (arg2) {
				if (local9 == 1000) {
					local9 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local12 == -1) {
					local12 = 1000;
				}
				if (local9 == -1) {
					local9 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg1.anInt6483 - arg3.anInt6483;
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(B[Ljava/awt/Rectangle;I)V")
	public static void method979(@OriginalArg(1) Rectangle[] arg0, @OriginalArg(2) int arg1) throws Exception_Sub1 {
		if (Static353.anInt6019 == 1) {
			Static367.aClass132_7.method7446(arg0, arg1, Static596.anInt9747, Static475.anInt8169);
		} else {
			Static367.aClass132_7.method7446(arg0, arg1, 0, 0);
		}
	}
}
