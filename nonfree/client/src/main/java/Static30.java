import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "Lclient!am;")
	public static Class11 aClass11_11;

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "F")
	public static float aFloat16;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString18 = "Allocated memory";

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "[Lclient!om;")
	public static final Class4_Sub1_Sub16[] aClass4_Sub1_Sub16Array1 = new Class4_Sub1_Sub16[14];

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II[I)[I")
	public static int[] method501(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int[] local8 = new int[1152];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			for (@Pc(16) int local16 = 0; local16 < 36; local16++) {
				@Pc(22) int local22 = arg1[local10];
				if (local22 == 0) {
					if (local16 > 0 && arg1[local10 - 1] != 0) {
						local22 = arg0;
					} else if (local12 > 0 && arg1[local10 - 36] != 0) {
						local22 = arg0;
					} else if (local16 < 35 && arg1[local10 + 1] != 0) {
						local22 = arg0;
					} else if (local12 < 31 && arg1[local10 + 36] != 0) {
						local22 = arg0;
					}
				}
				local8[local10++] = local22;
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!am;B)V")
	public static void method502(@OriginalArg(0) Class11 arg0) {
		Static51.aClass11_18 = arg0;
	}
}
