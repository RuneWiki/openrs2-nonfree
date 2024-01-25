import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "Lclient!tca;")
	public static final Class322 aClass322_1 = new Class322();

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
	public static int anInt296 = 0;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "[B")
	public static final byte[] aByteArray5 = new byte[2048];

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V")
	public static void method219(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub18 local8 = Static508.method6607(arg0, 14);
		local8.method6229();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V")
	public static void method220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class2_Sub2_Sub18 local13 = Static508.method6607(arg2, 8);
		local13.method6227();
		local13.anInt7701 = arg3;
		local13.anInt7693 = arg1;
		local13.anInt7695 = arg0;
	}
}
