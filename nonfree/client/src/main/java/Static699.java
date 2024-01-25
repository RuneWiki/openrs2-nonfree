import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static699 {

	@OriginalMember(owner = "client!w", name = "C", descriptor = "[[B")
	public static byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "Lclient!ik;")
	public static Class182 aClass182_127;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BLclient!nt;)Ljava/lang/String;")
	public static String method9255(@OriginalArg(1) Class270 arg0) {
		if (Static85.method1871(arg0).method6627() == 0) {
			return null;
		} else if (arg0.aString92 == null || arg0.aString92.trim().length() == 0) {
			return Static571.aBoolean583 ? "Hidden-use" : null;
		} else {
			return arg0.aString92;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
	public static void method9257(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub7_Sub21 local9 = Static136.method2378((long) arg0, 1);
		local9.method9256();
		local9.anInt10899 = arg1;
	}
}
