import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray83;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!kb;")
	public static Class83 aClass83_111;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!tl;")
	public static Class155 aClass155_32 = new Class155(30);

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString104 = "Loading sprites - ";

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BIII)V")
	public static void method2870(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(42) String local42 = "::tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local42);
		Static229.method4012(local42);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(FZIIIIBI)[I")
	public static int[] method2871(@OriginalArg(0) float arg0) {
		@Pc(2) int[] local2 = new int[2048];
		@Pc(6) Class1_Sub1_Sub36 local6 = new Class1_Sub1_Sub36();
		local6.anInt5636 = 35;
		local6.anInt5632 = 8;
		local6.anInt5634 = (int) (arg0 * 4096.0F);
		local6.aBoolean298 = true;
		local6.anInt5633 = 8;
		local6.anInt5643 = 4;
		local6.method4756();
		Static254.method4235(1, 2048);
		local6.method4392(local2, 0);
		return local2;
	}
}
