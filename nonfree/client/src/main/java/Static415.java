import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
	public static int anInt1625;

	@OriginalMember(owner = "client!pk", name = "t", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)Z")
	public static boolean method1369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static582.method7551(arg1, arg0) || Static243.method3465(arg1, arg0);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!gk;)Lclient!pv;")
	public static Class153 method1370(@OriginalArg(1) Class2_Sub7 arg0) {
		@Pc(10) Class322 local10 = Static30.method394()[arg0.method4464()];
		@Pc(19) Class347 local19 = Static226.method2754()[arg0.method4464()];
		@Pc(23) int local23 = arg0.method4478();
		@Pc(32) int local32 = arg0.method4478();
		@Pc(36) int local36 = arg0.method4518();
		@Pc(40) int local40 = arg0.method4518();
		@Pc(44) int local44 = arg0.method4478();
		@Pc(48) int local48 = arg0.method4509();
		@Pc(52) int local52 = arg0.method4509();
		return new Class153(local10, local19, local23, local32, local36, local40, local44, local48, local52);
	}
}
