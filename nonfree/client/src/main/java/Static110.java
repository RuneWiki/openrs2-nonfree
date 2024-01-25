import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
	public static int anInt2623;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "F")
	public static float aFloat92;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
	public static int anInt2624;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Lclient!hf;")
	public static final Class136 aClass136_3 = new Class136();

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "[I")
	public static final int[] anIntArray120 = new int[14];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!na;B)Lclient!rfa;")
	public static Class289 method2419(@OriginalArg(0) Class1_Sub4_Sub2 arg0) {
		@Pc(12) Class289 local12;
		if (Static268.aClass289_2 == null) {
			local12 = new Class289();
		} else {
			local12 = Static268.aClass289_2;
			Static268.aClass289_2 = Static268.aClass289_2.aClass289_3;
			local12.aClass289_3 = null;
			Static343.anInt6644--;
		}
		local12.aClass1_Sub4_Sub2_1 = arg0;
		return local12;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!io;ZILclient!io;)I")
	public static int method2420(@OriginalArg(1) Class158_Sub1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class158_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg2 == 1) {
			local9 = arg3.anInt4058;
			local12 = arg0.anInt4058;
			if (!arg1) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg2 == 2) {
			return Static272.method4723(arg3.method3620().aString61, Static154.anInt3181, arg0.method3620().aString61);
		} else if (arg2 == 3) {
			if (arg3.aString44.equals("-")) {
				if (arg0.aString44.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString44.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static272.method4723(arg3.aString44, Static154.anInt3181, arg0.aString44);
			}
		} else if (arg2 == 4) {
			if (arg3.method3613()) {
				return arg0.method3613() ? 0 : 1;
			} else if (arg0.method3613()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg3.method3616()) {
				return arg0.method3616() ? 0 : 1;
			} else if (arg0.method3616()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg3.method3615()) {
				return arg0.method3615() ? 0 : 1;
			} else if (arg0.method3615()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg3.method3610()) {
				return arg0.method3610() ? 0 : 1;
			} else if (arg0.method3610()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local9 = arg3.anInt4061;
			local12 = arg0.anInt4061;
			if (arg1) {
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
			return arg3.anInt4062 - arg0.anInt4062;
		}
	}
}
