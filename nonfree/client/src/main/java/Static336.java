import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "Lclient!pg;")
	public static Class51 aClass51_6;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "Lclient!bd;")
	public static final Class18 aClass18_46 = new Class18();

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
	public static int anInt6486 = 0;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)I")
	public static int method5778(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIII)V")
	public static void method5780(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class14_Sub2_Sub13 local8 = Static1.method5711(4, arg2);
		local8.method3540();
		local8.anInt3805 = arg0;
		local8.anInt3808 = arg1;
		local8.anInt3802 = arg3;
	}
}
