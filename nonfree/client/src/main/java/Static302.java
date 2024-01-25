import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable8 = new Hashtable();

	@OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
	public static int anInt5846 = 0;

	@OriginalMember(owner = "client!mk", name = "E", descriptor = "Z")
	public static boolean aBoolean398 = false;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
	public static void method5055() {
		for (@Pc(1) int local1 = 0; local1 < Static205.anInt4329; local1++) {
			@Pc(11) Class67 local11 = Static41.aClass67Array1[local1];
			if (local11.aByte11 == 2) {
				if (local11.aClass1_Sub12_Sub1_3 == null) {
					local11.anInt2380 = Integer.MIN_VALUE;
				} else {
					Static445.aClass1_Sub12_Sub3_2.method6363(local11.aClass1_Sub12_Sub1_3);
				}
			}
		}
	}
}
