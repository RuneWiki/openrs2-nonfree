import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "Z")
	public static boolean aBoolean536 = false;

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_160 = new Class156(6, 10);

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "Z")
	public static boolean aBoolean537 = false;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!ip;II)V")
	public static void method6894(@OriginalArg(1) Class4_Sub1_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static693.method8318(local6, 0, local6.length, arg1);
		Static370.method5511(local6, arg0, (byte) 17, arg2);
	}
}
