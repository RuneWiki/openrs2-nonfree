import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!vj", name = "hb", descriptor = "[I")
	public static int[] anIntArray360;

	@OriginalMember(owner = "client!vj", name = "jb", descriptor = "I")
	public static int anInt4645;

	@OriginalMember(owner = "client!vj", name = "kb", descriptor = "[I")
	public static int[] anIntArray361;

	@OriginalMember(owner = "client!vj", name = "lb", descriptor = "I")
	public static int anInt4646;

	@OriginalMember(owner = "client!vj", name = "Z", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1581 = Static64.method1101("Ok");

	@OriginalMember(owner = "client!vj", name = "ab", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1582 = aClass51_1581;

	@OriginalMember(owner = "client!vj", name = "bb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1583 = Static64.method1101("Speicher wird zugewiesen)3");

	@OriginalMember(owner = "client!vj", name = "eb", descriptor = "I")
	public static volatile int anInt4642 = 0;

	@OriginalMember(owner = "client!vj", name = "fb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1584 = Static64.method1101("Fallen lassen");

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V")
	public static void method3635() {
		@Pc(12) int local12 = (int) ((double) Static218.aClass71_21.anInt2802 / Static10.aDouble1) + Static87.anInt2015;
		@Pc(21) int local21 = Static150.anInt3286 + (int) ((double) Static218.aClass71_21.anInt2835 / Static10.aDouble1);
		@Pc(31) int local31 = Static87.anInt2015 - (int) ((double) Static218.aClass71_21.anInt2802 / Static10.aDouble1);
		if (local31 < 0) {
			Static87.anInt2015 = (int) ((double) Static218.aClass71_21.anInt2802 / Static10.aDouble1);
			Static155.anInt3422 = -1;
			Static41.anInt977 = -1;
		}
		@Pc(61) int local61 = Static150.anInt3286 - (int) ((double) Static218.aClass71_21.anInt2835 / Static10.aDouble1);
		if (local12 > Static3.anInt75) {
			Static87.anInt2015 = Static3.anInt75 - (int) ((double) Static218.aClass71_21.anInt2802 / Static10.aDouble1);
			Static41.anInt977 = -1;
			Static155.anInt3422 = -1;
		}
		if (local61 < 0) {
			Static155.anInt3422 = -1;
			Static150.anInt3286 = (int) ((double) Static218.aClass71_21.anInt2835 / Static10.aDouble1);
			Static41.anInt977 = -1;
		}
		if (local21 > Static87.anInt2017) {
			Static155.anInt3422 = -1;
			Static41.anInt977 = -1;
			Static150.anInt3286 = Static87.anInt2017 - (int) ((double) Static218.aClass71_21.anInt2835 / Static10.aDouble1);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!k;Z)Lclient!hd;")
	public static Class15_Sub3 method3636(@OriginalArg(0) Class1_Sub16 arg0) {
		return new Class15_Sub3(arg0.method3817(), arg0.method3817(), arg0.method3817(), arg0.method3817(), arg0.method3806(), arg0.method3806(), arg0.method3793());
	}
}
