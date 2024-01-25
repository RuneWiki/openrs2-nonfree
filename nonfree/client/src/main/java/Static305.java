import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
	public static int anInt5581;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	public static int anInt5572 = 2;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)Z")
	public static boolean method4504(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static192.method3183(arg0, arg1) | (arg0 & 0x60000) != 0 || Static64.method1273(arg1, arg0) || Static384.method5257(arg1, arg0);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/lang/String;Lclient!bt;)I")
	public static int method4505(@OriginalArg(1) String arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		@Pc(6) int local6 = arg1.anInt7620;
		@Pc(10) byte[] local10 = Static119.method2156(arg0);
		arg1.method6016(local10.length);
		arg1.anInt7620 += Static9.aClass253_1.method5699(arg1.aByteArray95, local10.length, 0, local10, arg1.anInt7620);
		return arg1.anInt7620 - local6;
	}
}
