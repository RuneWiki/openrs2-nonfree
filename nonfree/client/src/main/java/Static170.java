import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
	public static int anInt8905;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!cl;")
	public static Class58 aClass58_6;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Lclient!hga;")
	public static Class123 aClass123_284 = null;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!pba;ZI)V")
	public static void method6963(@OriginalArg(0) int arg0, @OriginalArg(1) Class25_Sub2_Sub2_Sub5_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int[] local14 = new int[4];
		Static604.method6221(local14, 0, local14.length, arg2);
		Static496.method6696(local14, arg0, arg1);
	}
}
