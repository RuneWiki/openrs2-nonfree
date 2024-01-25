import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static293 {

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
	public static int anInt5388;

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "Z")
	public static boolean aBoolean421;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
	public static int anInt5387 = 0;

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "Z")
	public static boolean aBoolean420 = false;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILclient!kka;I)V")
	public static void method4565(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub17_Sub2 arg1) {
		Static674.aBoolean762 = false;
		Static519.anInt8681 = 0;
		Static645.method8450(arg1);
		Static244.method3915(arg1);
		if (Static674.aBoolean762) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.lb) {
			throw new RuntimeException("gpi1 pos:" + arg1.lb + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(III)Z")
	public static boolean method4566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static561.method7661(arg0, arg1) | (arg0 & 0x2000) != 0 | Static231.method3708(arg1, arg0)) & Static81.method1704(arg0, arg1);
	}
}
