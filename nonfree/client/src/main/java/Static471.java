import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_187 = new Class186(10, -2);

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "Z")
	public static boolean aBoolean766 = false;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "[I")
	public static final int[] anIntArray597 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BZI)V")
	public static void method8862(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub51 local10 = Static321.method5223(arg0, arg1);
		if (local10 != null) {
			for (@Pc(16) int local16 = 0; local16 < local10.anIntArray577.length; local16++) {
				local10.anIntArray577[local16] = -1;
				local10.anIntArray576[local16] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(III)Z")
	public static boolean method8864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static475.method6988(arg1, arg0) & (Static71.method909(arg0, arg1) | (arg0 & 0x2000) != 0 | Static672.method8910(arg1, arg0));
	}
}
