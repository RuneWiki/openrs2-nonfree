import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "[I")
	public static int[] anIntArray535;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1264 = Static146.method2172("T");

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
	public static int anInt3613 = 0;

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
	public static int anInt3617 = -1;

	@OriginalMember(owner = "client!sg", name = "G", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1265 = Static146.method2172("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
	public static void method2501() {
		for (@Pc(10) Class2_Sub16 local10 = (Class2_Sub16) Static51.aClass10_37.method444(); local10 != null; local10 = (Class2_Sub16) Static51.aClass10_37.method451()) {
			if (local10.anInt2381 == -1) {
				local10.anInt2384 = 0;
				Static19.method440(local10);
			} else {
				local10.method3004();
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "(B)V")
	public static void method2518() {
		aClass77_1265 = null;
		aClass77_1264 = null;
		anIntArray535 = null;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(III)I")
	public static int method2524(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg0 + (arg1 << 16));
		return Static160.aClass2_Sub2_Sub4_103 != null && Static160.aClass2_Sub2_Sub4_103.aLong134 == local10 ? Static166.aClass2_Sub18_101.anInt3423 * 99 / (Static166.aClass2_Sub18_101.aByteArray39.length - Static160.aClass2_Sub2_Sub4_103.aByte1) + 1 : 0;
	}
}
