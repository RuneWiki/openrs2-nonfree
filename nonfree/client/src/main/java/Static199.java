import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "[I")
	public static int[] anIntArray438;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!ek;")
	public static Class42 aClass42_64;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	public static int anInt4353 = 0;

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Z")
	public static boolean aBoolean295 = false;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "Lclient!g;")
	public static Class56 aClass56_19 = null;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "[C")
	public static char[] aCharArray7 = new char[128];

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "[I")
	public static int[] anIntArray439 = new int[100];

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!mh;I)V")
	public static void method3560(@OriginalArg(0) Class2_Sub3 arg0) {
		if (arg0.aClass2_Sub19_5 != null) {
			arg0.aClass2_Sub19_5.anInt3517 = 0;
		}
		arg0.aBoolean395 = false;
		for (@Pc(16) Class2_Sub3 local16 = arg0.method4649(); local16 != null; local16 = arg0.method4654()) {
			method3560(local16);
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
	public static void method3564() {
		Static19.aBoolean29 = false;
		Static287.anInt5652 = -1;
		Static225.anInt5298 = 1;
		Static279.anInt5494 = 0;
		Static93.anInt2262 = -3;
		Static44.anInt1141 = 0;
		Static241.anInt4807 = 0;
	}
}
