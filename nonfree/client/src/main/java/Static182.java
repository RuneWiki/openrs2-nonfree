import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "Lclient!id;")
	public static Class43 aClass43_19 = new Class43(100);

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "Lclient!i;")
	public static Class41 aClass41_1107 = Static184.method2923("Mem:");

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_1108 = Static184.method2923(")3runescape)3com");

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
	public static int anInt4210 = 0;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	public static void method2901() {
		@Pc(4) int[] local4 = new int[Static178.anInt4137];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static178.anInt4137; local12++) {
			@Pc(18) Class2_Sub2_Sub15 local18 = Static63.method1158(local12);
			if (local18.anInt3135 >= 0 || local18.anInt3107 >= 0) {
				local4[local10++] = local12;
			}
		}
		Static78.anIntArray197 = new int[local10];
		for (@Pc(48) int local48 = 0; local48 < local10; local48++) {
			Static78.anIntArray197[local48] = local4[local48];
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)J")
	public static synchronized long method2903() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static141.aLong99) {
			Static49.aLong33 += Static141.aLong99 - local5;
		}
		Static141.aLong99 = local5;
		return local5 + Static49.aLong33;
	}
}
