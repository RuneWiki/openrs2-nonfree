import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static269 {

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "F")
	public static float aFloat121;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "Lclient!hga;")
	public static Class123 aClass123_174;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "Z")
	public static boolean aBoolean336;

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!sba;")
	public static final Class297 aClass297_22 = new Class297(32);

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "[I")
	public static final int[] anIntArray240 = new int[3];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V")
	public static void method4097(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 < arg2) {
			Static504.method6755(arg3, arg2, Static570.anIntArrayArray100[arg1], arg0);
		} else {
			Static504.method6755(arg3, arg0, Static570.anIntArrayArray100[arg1], arg2);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZII)Z")
	public static boolean method4098(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < Static428.aByteArrayArrayArray4[1].length && arg1 < Static428.aByteArrayArrayArray4[1][arg0].length) {
			return (Static428.aByteArrayArrayArray4[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
