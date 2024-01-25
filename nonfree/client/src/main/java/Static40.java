import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bga", name = "w", descriptor = "I")
	public static int anInt841;

	@OriginalMember(owner = "client!bga", name = "x", descriptor = "Z")
	public static boolean aBoolean75;

	@OriginalMember(owner = "client!bga", name = "r", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_14 = new Class145(43, 7);

	@OriginalMember(owner = "client!bga", name = "s", descriptor = "I")
	public static final int anInt838 = 1337;

	@OriginalMember(owner = "client!bga", name = "y", descriptor = "[[B")
	public static final byte[][] aByteArrayArray1 = new byte[1000][];

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IB)I")
	public static int method911(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IIIIIII)V")
	public static void method912(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(12) Class16_Sub8 local12 = (Class16_Sub8) Static187.aClass19_5.method562(); local12 != null; local12 = (Class16_Sub8) Static187.aClass19_5.method558()) {
			if (local12.anInt7234 <= Static389.anInt6694) {
				local12.method8874();
			} else {
				Static565.method7890((local12.anInt7233 << 9) + 256, (local12.anInt7236 << 9) + 256, arg3 >> 1, local12.anInt7229, arg1 >> 1, local12.anInt7232 * 2);
				Static544.aClass37_8.method6075(arg0 + Static197.anIntArray250[0], 0, local12.anInt7235 | 0xFF000000, arg2 + Static197.anIntArray250[1], local12.aString61);
			}
		}
	}
}
