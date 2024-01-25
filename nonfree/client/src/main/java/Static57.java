import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString110 = " more options";

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
	public static int anInt1470 = 0;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "[I")
	public static final int[] anIntArray219 = new int[13];

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)V")
	public static void method1169(@OriginalArg(0) int arg0) {
		@Pc(12) Class7_Sub1_Sub15 local12 = Static315.method5104(9, arg0);
		local12.method4788();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public static void method1170() {
		Static81.aClass34_1.method5280();
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			Static93.aLongArray4[local8] = 0L;
		}
		for (@Pc(21) int local21 = 0; local21 < 32; local21++) {
			Static253.aLongArray7[local21] = 0L;
		}
		Static310.anInt5908 = 0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	public static void method1171() {
		Static210.aClass103_40.method2684();
	}
}
