import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_125 = new Class216(3, 8);

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_166 = new Class151(39, 3);

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "[Lclient!kw;")
	public static final Class203[] aClass203Array1 = new Class203[6];

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIILclient!iaa;)V")
	public static void method6696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub2_Sub2_Sub1 arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static685.method6467(local6, 0, local6.length, arg1);
		Static209.method3124(arg0, local6, arg2);
	}
}
