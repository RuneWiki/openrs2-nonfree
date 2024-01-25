import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static441 {

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_136 = new Class186(83, -2);

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZILjava/lang/String;ZLjava/lang/String;)V")
	public static void method6405(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		Static321.aString95 = arg1;
		Static392.aBoolean553 = arg2;
		Static275.aBoolean434 = arg0;
		Static715.aString107 = arg3;
		if (!arg0) {
			Static478.anInt8342 = -1;
		}
		if (!Static275.aBoolean434 && (Static715.aString107.equals("") || Static321.aString95.equals(""))) {
			Static422.method6222(3);
			return;
		}
		Static167.aClass400_1.aBoolean795 = false;
		if (Static293.anInt5245 != 1) {
			Static456.anInt8042 = 0;
			Static628.anInt10152 = -1;
			Static486.anInt8432 = -1;
		}
		Static422.method6222(-3);
		Static356.anInt6026 = 0;
		Static319.anInt10907 = 1;
		Static291.anInt5230 = 0;
	}
}
