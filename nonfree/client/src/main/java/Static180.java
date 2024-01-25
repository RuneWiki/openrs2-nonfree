import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "Lclient!g;")
	public static Class83 aClass83_69;

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "Lclient!cr;")
	public static Class44 aClass44_4;

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
	public static int anInt3783;

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "Lclient!al;")
	public static Class12 aClass12_1 = new Class12(8);

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
	public static int anInt3782 = 0;

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
	public static int anInt3784 = -1;

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "Z")
	public static boolean aBoolean272 = false;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	public static void method3302() {
		@Pc(13) Class2_Sub7_Sub2 local13 = Static328.method5290(15, 0);
		local13.method1197();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!g;I)Lclient!sr;")
	public static Class2_Sub36 method3304(@OriginalArg(0) int arg0, @OriginalArg(1) Class83 arg1) {
		@Pc(8) byte[] local8 = arg1.method1979(arg0);
		return local8 == null ? null : new Class2_Sub36(local8);
	}
}
