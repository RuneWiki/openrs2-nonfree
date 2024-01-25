import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
	public static int anInt8774;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_109 = new Class173(23, 8);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB[B)I")
	public static int method7163(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static325.method8273(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public static void method7164() {
		@Pc(21) byte[] local21;
		if (Static17.anObject2 == null) {
			@Pc(14) Class30_Sub1_Sub2 local14 = new Class30_Sub1_Sub2();
			local21 = local14.method5141();
			Static17.anObject2 = Static305.method5221(local21);
		}
		if (Static193.anObject12 == null) {
			@Pc(32) Class30_Sub2_Sub1 local32 = new Class30_Sub2_Sub1();
			local21 = local32.method6251();
			Static193.anObject12 = Static305.method5221(local21);
		}
	}
}
