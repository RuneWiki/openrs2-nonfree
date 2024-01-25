import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	public static int anInt6491;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Lclient!vi;")
	public static final Class332 aClass332_157 = new Class332(8);

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_154 = new Class40(26, 7);

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "[I")
	public static final int[] anIntArray549 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
	public static int anInt6494 = -50;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)I")
	public static int method5518(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Z")
	public static boolean method5519(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)V")
	public static void method5520(@OriginalArg(1) int arg0) {
		Static230.anInt3922 = -1;
		if (arg0 == 37) {
			Static349.aFloat169 = 3.0F;
		} else if (arg0 == 50) {
			Static349.aFloat169 = 4.0F;
		} else if (arg0 == 75) {
			Static349.aFloat169 = 6.0F;
		} else if (arg0 == 100) {
			Static349.aFloat169 = 8.0F;
		} else if (arg0 == 200) {
			Static349.aFloat169 = 16.0F;
		}
		Static230.anInt3922 = -1;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)Z")
	public static boolean method5521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static199.method2983(arg0, arg1) | (arg0 & 0x70000) != 0 || Static123.method1856(arg0, arg1);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method5522(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(20) int local20 = local6 + 3 & 0xFFFFFFFC;
		@Pc(26) int local26 = local20 / 4 * 3;
		if (local20 - 2 >= local6 || Static247.method3537(arg0.charAt(local20 - 2)) == -1) {
			local26 -= 2;
		} else if (local20 - 1 >= local6 || Static247.method3537(arg0.charAt(local20 - 1)) == -1) {
			local26--;
		}
		@Pc(71) byte[] local71 = new byte[local26];
		Static506.method6958(local71, 0, arg0);
		return local71;
	}
}
