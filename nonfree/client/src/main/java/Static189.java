import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!hr", name = "F", descriptor = "[I")
	public static int[] anIntArray307;

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_60 = new Class6(61, 4);

	@OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
	public static int anInt4000 = 0;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
	public static void method3546() {
		@Pc(27) byte[] local27;
		if (Static377.anObject10 == null) {
			@Pc(18) Class61_Sub1_Sub2 local18 = new Class61_Sub1_Sub2();
			local27 = local18.method7350();
			Static377.anObject10 = Static155.method3121(local27);
		}
		if (Static197.anObject8 == null) {
			@Pc(38) Class61_Sub2_Sub2 local38 = new Class61_Sub2_Sub2();
			local27 = local38.method7951();
			Static197.anObject8 = Static155.method3121(local27);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIII)V")
	public static void method3549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub1_Sub13 local8 = Static476.method6225(10, arg1);
		local8.method4919();
		local8.anInt5690 = arg3;
		local8.anInt5680 = arg2;
		local8.anInt5686 = arg0;
	}
}
