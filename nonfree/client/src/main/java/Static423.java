import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "Lclient!qi;")
	public static final Class275 aClass275_5 = new Class275(3, 2);

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "I")
	public static int anInt7824 = -1;

	@OriginalMember(owner = "client!pca", name = "h", descriptor = "S")
	public static short aShort101 = 32767;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIILclient!td;I)Z")
	public static boolean method6553(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub3_Sub2 arg2, @OriginalArg(4) int arg3) {
		if (!Static20.aBoolean21 || !Static110.aBoolean234) {
			return false;
		} else if (Static314.anInt6404 < 100) {
			return false;
		} else if (Static562.method7912(arg0, arg1, arg3)) {
			@Pc(28) int local28 = arg1 << Static276.anInt5846;
			@Pc(32) int local32 = arg3 << Static276.anInt5846;
			@Pc(42) int local42 = Static500.aClass274Array2[arg0].method8041(arg1, arg3) - 1;
			@Pc(48) int local48 = arg2.method8574() + local42;
			if (arg2.aShort90 == 1) {
				if (!Static531.method7550(local48, local28, local28, local42, local32, local28, local32, local48, Static325.anInt6512 + local32)) {
					return false;
				} else if (Static531.method7550(local42, local28, local28, local42, local32, local28, Static325.anInt6512 + local32, local48, Static325.anInt6512 + local32)) {
					Static323.anInt6498++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort90 == 2) {
				if (!Static531.method7550(local48, local28, Static325.anInt6512 + local28, local42, Static325.anInt6512 + local32, local28, Static325.anInt6512 + local32, local48, local32 + Static325.anInt6512)) {
					return false;
				} else if (Static531.method7550(local48, local28 + Static325.anInt6512, local28 + Static325.anInt6512, local42, local32 + Static325.anInt6512, local28, local32 + Static325.anInt6512, local42, local32 + Static325.anInt6512)) {
					Static323.anInt6498++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort90 == 4) {
				if (!Static531.method7550(local48, Static325.anInt6512 + local28, local28 + Static325.anInt6512, local42, local32, Static325.anInt6512 + local28, local32, local48, Static325.anInt6512 + local32)) {
					return false;
				} else if (Static531.method7550(local42, local28 + Static325.anInt6512, Static325.anInt6512 + local28, local42, local32, Static325.anInt6512 + local28, local32 - -Static325.anInt6512, local48, Static325.anInt6512 + local32)) {
					Static323.anInt6498++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort90 == 8) {
				if (!Static531.method7550(local48, local28, Static325.anInt6512 + local28, local42, local32, local28, local32, local48, local32)) {
					return false;
				} else if (Static531.method7550(local48, Static325.anInt6512 + local28, local28 - -Static325.anInt6512, local42, local32, local28, local32, local42, local32)) {
					Static323.anInt6498++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort90 == 16) {
				if (Static142.method3163(Static510.anInt8986, local48, Static510.anInt8986, local42, local32 + Static510.anInt8986, local28)) {
					Static323.anInt6498++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort90 == 32) {
				if (Static142.method3163(Static510.anInt8986, local48, Static510.anInt8986, local42, Static510.anInt8986 + local32, Static510.anInt8986 + local28)) {
					Static323.anInt6498++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort90 == 64) {
				if (Static142.method3163(Static510.anInt8986, local48, Static510.anInt8986, local42, local32, local28 + Static510.anInt8986)) {
					Static323.anInt6498++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort90 != 128) {
				return true;
			} else if (Static142.method3163(Static510.anInt8986, local48, Static510.anInt8986, local42, local32, local28)) {
				Static323.anInt6498++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
