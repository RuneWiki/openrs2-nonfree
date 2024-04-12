import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ne", name = "Rb", descriptor = "I")
	public static int anInt1746;

	@OriginalMember(owner = "client!ne", name = "ec", descriptor = "I")
	public static int anInt1749;

	@OriginalMember(owner = "client!ne", name = "tc", descriptor = "I")
	public static int anInt1751;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)I", line = 676)
	public static int method1139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return Class2_Sub2_Sub12_Sub4.anIntArray405[arg1];
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "()V", line = 1056)
	public static void method1150() {
		Class2_Sub2_Sub12_Sub4.aClass2_Sub2_Sub12_Sub4_2 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray384 = null;
		Class2_Sub2_Sub12_Sub4.aClass2_Sub2_Sub12_Sub4_3 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray399 = null;
		Class2_Sub2_Sub12_Sub4.aBooleanArray26 = null;
		Class2_Sub2_Sub12_Sub4.aBooleanArray25 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray389 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray388 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray401 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray396 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray397 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray390 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray391 = null;
		Class2_Sub2_Sub12_Sub4.anIntArrayArray19 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray385 = null;
		Class2_Sub2_Sub12_Sub4.anIntArrayArray18 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray394 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray403 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray398 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray393 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray400 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray404 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray387 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray386 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray402 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray392 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray395 = null;
		Class2_Sub2_Sub12_Sub4.anIntArray405 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ud;II)Lclient!ne;", line = 1995)
	public static Class2_Sub2_Sub12_Sub4 method1163(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method68(0, arg1);
		return local5 == null ? null : new Class2_Sub2_Sub12_Sub4(local5);
	}
}
