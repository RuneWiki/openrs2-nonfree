import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static305 {

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	public static int anInt5269;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
	public static int anInt5270;

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "Lclient!gd;")
	public static Class84 aClass84_2;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "Z")
	public static boolean aBoolean379 = false;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!ah;Z)V")
	public static void method4362(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5_Sub1 arg1) {
		Static368.aBoolean423 = false;
		Static194.anInt3474 = 0;
		Static27.method577(arg1);
		Static225.method3453(arg1);
		if (Static368.aBoolean423) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt6475) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt6475 + " psize:" + arg0);
		}
	}
}
