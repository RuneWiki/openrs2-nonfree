import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!va", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!va", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString375 = "purple:";

	@OriginalMember(owner = "client!va", name = "g", descriptor = "I")
	public static int anInt5242 = -2;

	@OriginalMember(owner = "client!va", name = "o", descriptor = "I")
	public static int anInt5249 = 1;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "I")
	public static int anInt5251 = -1;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V")
	public static void method3989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub2_Sub18 local4 = Static13.method232(arg0, 6);
		local4.method3810();
		local4.anInt5009 = arg1;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
	public static void method3990() {
		Static242.aClass79_36.method2479(5);
	}
}
