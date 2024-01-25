import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static264 {

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "Z")
	public static boolean aBoolean277 = true;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "Lclient!kr;")
	public static final Class142 aClass142_1 = new Class142();

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "Z")
	public static boolean aBoolean278 = false;

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "[I")
	public static int[] anIntArray332 = new int[2];

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIILclient!fi;)V")
	public static void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class76 arg2) {
		if (Static387.aClass76_14 != null || Static272.aBoolean283 || (arg2 == null || Static112.method1553(arg2) == null)) {
			return;
		}
		Static387.aClass76_14 = arg2;
		Static359.aClass76_13 = Static112.method1553(arg2);
		Static464.anInt7343 = arg0;
		Static287.anInt4467 = 0;
		Static372.anInt6084 = arg1;
		Static243.aBoolean252 = false;
	}
}
