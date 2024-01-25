import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "[Lclient!fm;")
	public static Class81[] aClass81Array2;

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "Lclient!wt;")
	public static Class271 aClass271_1;

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean114 = true;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B[[[Lclient!ak;)V")
	public static void method1545(@OriginalArg(1) Class11[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class11[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class11 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass24_Sub4_1 instanceof Interface10) {
							((Interface10) local23.aClass24_Sub4_1).method5700();
						}
						if (local23.aClass24_Sub1_2 instanceof Interface10) {
							((Interface10) local23.aClass24_Sub1_2).method5700();
						}
						if (local23.aClass24_Sub1_1 instanceof Interface10) {
							((Interface10) local23.aClass24_Sub1_1).method5700();
						}
						if (local23.aClass24_Sub5_1 instanceof Interface10) {
							((Interface10) local23.aClass24_Sub5_1).method5700();
						}
						if (local23.aClass24_Sub5_2 instanceof Interface10) {
							((Interface10) local23.aClass24_Sub5_2).method5700();
						}
						for (@Pc(73) Class1 local73 = local23.aClass1_3; local73 != null; local73 = local73.aClass1_1) {
							@Pc(78) Class24_Sub3 local78 = local73.aClass24_Sub3_1;
							if (local78 instanceof Interface10) {
								((Interface10) local78).method5700();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)I")
	public static int method1546(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (local19 * arg0 >> 12) + 40960;
		return local35 * local13 >> 12;
	}
}
