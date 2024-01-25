import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "[[[Lclient!ve;")
	public static Class351[][][] aClass351ArrayArrayArray1;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
	public static int anInt2688;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_81 = new Class194(32, -1);

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
	public static int anInt2687 = 100;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_18 = new Class136(8);

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method2240(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub7_Sub5 local15 = Static138.method2377(2, arg1);
		local15.method1474();
		local15.aString9 = arg0;
	}
}
