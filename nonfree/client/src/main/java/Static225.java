import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
	public static int anInt4617;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_60 = new Class274(47, -1);

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[6][];

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
	public static int anInt4615 = 0;

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
	public static int anInt4616 = 0;

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
	public static int anInt4618 = 0;

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "Z")
	public static boolean aBoolean388 = false;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
	public static void method3813() {
		@Pc(5) int local5 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static3.anInt46; local11++) {
			for (@Pc(14) int local14 = 0; local14 < Static270.anInt5194; local14++) {
				if (Static185.method3330(true, Static440.aClass217ArrayArrayArray3, local14, local11, local5)) {
					local5++;
				}
				if (local5 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)Lclient!cu;")
	public static Class61 method3814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static440.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass61_2;
	}
}
