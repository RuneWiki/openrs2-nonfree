import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "Lclient!wia;")
	public static Class386 aClass386_85;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "[I")
	public static final int[] anIntArray490 = new int[3];

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "[I")
	public static final int[] anIntArray491 = new int[2];

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
	public static void method5520() {
		Static374.anInt6857 = 0;
		Static537.anInt9245 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static174.anInt10833; local11++) {
			@Pc(17) int local17 = Static347.anInt6424 * local11;
			for (@Pc(19) int local19 = 0; local19 < Static347.anInt6424; local19++) {
				@Pc(25) int local25 = local17 + local19;
				Static595.anInterface23Array1[local25].method9043(local19 * Static465.anInt8179, Static309.anInt1943 * local11, Static465.anInt8179, Static309.anInt1943, true);
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Z")
	public static boolean method5521(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
