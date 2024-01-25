import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Lclient!ha;")
	public static Class35 aClass35_24;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!dda;")
	public static Class53 aClass53_85;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public static int anInt5469 = 0;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
	public static void method4700(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg0, 12);
		local8.method6974();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBI)Z")
	public static boolean method4701(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static251.method3972(arg0, arg1) | (arg1 & 0x800) != 0 || Static154.method2641(arg1, arg0);
	}
}
