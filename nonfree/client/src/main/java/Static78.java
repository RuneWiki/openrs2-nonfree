import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
	public static int anInt1560;

	@OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
	public static int anInt1558 = 0;

	@OriginalMember(owner = "client!eh", name = "U", descriptor = "[Lclient!ul;")
	public static final Class3_Sub7_Sub21[] aClass3_Sub7_Sub21Array2 = new Class3_Sub7_Sub21[14];

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V")
	public static void method1187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg1, 8);
		local8.method2509();
		local8.anInt3053 = arg3;
		local8.anInt3057 = arg0;
		local8.anInt3054 = arg2;
	}
}
