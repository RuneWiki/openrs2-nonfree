import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!th", name = "u", descriptor = "I")
	public static int anInt5026 = 0;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray23 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!th", name = "z", descriptor = "[I")
	public static int[] anIntArray391 = new int[2];

	@OriginalMember(owner = "client!th", name = "A", descriptor = "[I")
	public static int[] anIntArray392 = new int[2500];

	@OriginalMember(owner = "client!th", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString175 = "Loading config - ";

	@OriginalMember(owner = "client!th", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString176 = "Use";

	@OriginalMember(owner = "client!th", name = "F", descriptor = "[I")
	public static int[] anIntArray393 = new int[5];

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(Z)I")
	public static int method3818() {
		if ((double) Static138.aFloat29 == 3.0D) {
			return 37;
		} else if ((double) Static138.aFloat29 == 4.0D) {
			return 50;
		} else if ((double) Static138.aFloat29 == 6.0D) {
			return 75;
		} else if ((double) Static138.aFloat29 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZBI)V")
	public static void method3819(@OriginalArg(1) boolean arg0) {
		Static75.anInt1613 = 2;
		Static81.aBoolean130 = arg0;
		Static264.anInt5577 = 22050;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!pk;Lclient!pk;I)V")
	public static void method3820(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class132 arg1) {
		Static133.aClass132_46 = arg1;
		@Pc(12) int local12 = (int) (Math.random() * 21.0D) - 10;
		Static265.aClass132_89 = arg0;
		@Pc(21) int local21 = (int) (Math.random() * 21.0D) - 10;
		Static133.aClass132_46.method3189(34);
		@Pc(33) int local33 = (int) (Math.random() * 21.0D) - 10;
		@Pc(40) int local40 = (int) (Math.random() * 41.0D) - 20;
		Static192.anInt3879 = local33 + local40;
		Static127.anInt2560 = local21 + local40;
		Static15.anInt424 = local40 + local12;
	}
}
