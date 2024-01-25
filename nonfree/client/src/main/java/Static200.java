import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!na", name = "B", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!na", name = "F", descriptor = "[I")
	public static final int[] anIntArray382 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public static void method3812() {
		Static144.anInt3144 = 0;
		Static99.anInt2377 = -1;
		Static266.anInt5402 = -1;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3815(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
	public static void method3817(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub4_Sub9 local16 = Static139.method4227(arg0, 16);
		local16.method1868();
	}
}
