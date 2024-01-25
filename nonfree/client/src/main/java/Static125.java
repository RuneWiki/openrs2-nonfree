import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!eu", name = "D", descriptor = "Z")
	public static boolean aBoolean171 = false;

	@OriginalMember(owner = "client!eu", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString32 = "";

	@OriginalMember(owner = "client!eu", name = "F", descriptor = "[I")
	public static final int[] anIntArray225 = new int[6];

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "(III)V")
	public static void method2376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static152.aClass37ArrayArrayArray1[0][arg1][arg2] != null && Static152.aClass37ArrayArrayArray1[0][arg1][arg2].aClass37_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static152.aClass37ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(46) Class37 local46 = Static152.aClass37ArrayArrayArray1[local22][arg1][arg2] = new Class37(local22, arg1, arg2);
				if (local20) {
					local46.aByte26++;
				}
			}
		}
	}
}
