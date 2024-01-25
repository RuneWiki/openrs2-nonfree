import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "Lclient!ph;")
	public static final Class260 aClass260_10 = new Class260(6, 1);

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "Z")
	public static final boolean aBoolean589 = true;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!og;IZ)V")
	public static void method6354(@OriginalArg(0) int arg0, @OriginalArg(1) Class9_Sub1_Sub1_Sub2_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int[] local10 = new int[4];
		Static604.method5915(local10, 0, local10.length, arg0);
		Static155.method2826(arg1, local10, arg2);
	}
}
