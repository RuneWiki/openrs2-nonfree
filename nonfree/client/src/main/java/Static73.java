import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
	public static int anInt1385;

	@OriginalMember(owner = "client!ci", name = "H", descriptor = "Lclient!dr;")
	public static Class3_Sub1_Sub3 aClass3_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ci", name = "I", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
	public static int anInt1386 = 0;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(III)V")
	public static void method1415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub11_Sub4 local8 = Static583.method8201(15, 0L);
		local8.method2195();
		local8.anInt2400 = arg0;
		local8.anInt2394 = arg1;
	}
}
