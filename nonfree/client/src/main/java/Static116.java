import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!du", name = "a", descriptor = "J")
	public static volatile long aLong72 = 0L;

	@OriginalMember(owner = "client!du", name = "c", descriptor = "Z")
	public static final boolean aBoolean144 = false;

	@OriginalMember(owner = "client!du", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString18 = null;

	@OriginalMember(owner = "client!du", name = "r", descriptor = "I")
	public static int anInt2040 = -1;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(III)V")
	public static void method1852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static129.aClass313ArrayArrayArray7[0][arg1][arg2] != null && Static129.aClass313ArrayArrayArray7[0][arg1][arg2].aClass313_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static129.aClass313ArrayArrayArray7[local22][arg1][arg2] == null) {
				@Pc(44) Class313 local44 = Static129.aClass313ArrayArrayArray7[local22][arg1][arg2] = new Class313(local22);
				if (local20) {
					local44.aByte112++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(II)V")
	public static void method1853(@OriginalArg(1) int arg0) {
		Static158.anInt2662 = -1;
		if (arg0 == 37) {
			Static407.aFloat126 = 3.0F;
		} else if (arg0 == 50) {
			Static407.aFloat126 = 4.0F;
		} else if (arg0 == 75) {
			Static407.aFloat126 = 6.0F;
		} else if (arg0 == 100) {
			Static407.aFloat126 = 8.0F;
		} else if (arg0 == 200) {
			Static407.aFloat126 = 16.0F;
		}
		Static158.anInt2662 = -1;
	}
}
