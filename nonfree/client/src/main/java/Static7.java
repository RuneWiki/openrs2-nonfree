import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "[I")
	public static int[] anIntArray14 = new int[50];

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "Lclient!i;")
	private static Class41 aClass41_62 = Static184.method2923("Your account has been disabled)3");

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!i;")
	public static Class41 aClass41_60 = aClass41_62;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
	public static int anInt319 = -1;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!i;")
	public static Class41 aClass41_61 = Static184.method2923("<col=ffff00>");

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
	public static int anInt320 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z")
	public static boolean method244(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) Class2_Sub2_Sub14 local5 = Static168.method2705(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local5.method2113(arg0);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public static void method245() {
		for (@Pc(10) Class2_Sub16 local10 = (Class2_Sub16) Static59.aClass108_5.method3322(); local10 != null; local10 = (Class2_Sub16) Static59.aClass108_5.method3331()) {
			if (local10.aClass2_Sub2_Sub14_1 != null) {
				local10.method2083();
			}
		}
	}
}
