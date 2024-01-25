import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!le", name = "t", descriptor = "I")
	public static int anInt7618;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIB)Z")
	public static boolean method5947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZZ)Z")
	public static boolean method5948(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method5950(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub4_Sub12 local10 = Static393.method5080(arg1, 2);
		local10.method3248();
		local10.aString24 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5951(@OriginalArg(1) String arg0) {
		if (Static92.aClass173Array1 != null) {
			Static30.method641(Static205.aClass217_66);
			Static302.aClass3_Sub7_Sub1_2.method2628(Static24.method582(arg0));
			Static302.aClass3_Sub7_Sub1_2.method2608(arg0);
		}
	}
}
