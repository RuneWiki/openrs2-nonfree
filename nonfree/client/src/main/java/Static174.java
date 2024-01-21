import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!dd;")
	public static Class16 aClass16_39;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!ic;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1217 = Static8.method128("m");

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "[I")
	public static int[] anIntArray426 = new int[128];

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1218 = Static8.method128("mapedge");

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	public static int anInt4685 = 1;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLclient!ea;Z)V")
	public static void method3155(@OriginalArg(1) Class18 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(5) Class18 local5 = arg0.method722();
		@Pc(17) short[] local17 = new short[16];
		@Pc(19) int local19 = 0;
		@Pc(67) int local67;
		for (@Pc(21) int local21 = 0; local21 < Static81.anInt2488; local21++) {
			@Pc(27) Class1_Sub1_Sub1 local27 = Static101.method2134(local21);
			if ((!arg1 || local27.aBoolean1) && local27.aClass18_28.method722().method731(local5) != -1) {
				if (local19 >= 100) {
					Static48.anInt1565 = -1;
					Static160.aShortArray32 = null;
					return;
				}
				if (local19 >= local17.length) {
					@Pc(65) short[] local65 = new short[local17.length * 2];
					for (local67 = 0; local67 < local19; local67++) {
						local65[local67] = local17[local67];
					}
					local17 = local65;
				}
				local17[local19++] = (short) local21;
			}
		}
		Static20.anInt569 = 0;
		Static48.anInt1565 = local19;
		@Pc(97) int local97 = local19;
		Static160.aShortArray32 = local17;
		@Pc(103) boolean local103;
		do {
			if (local97 <= 0) {
				return;
			}
			local103 = true;
			local97--;
			for (local67 = 0; local67 < local97; local67++) {
				@Pc(114) Class1_Sub1_Sub1 local114 = Static101.method2134(local17[local67]);
				@Pc(122) Class1_Sub1_Sub1 local122 = Static101.method2134(local17[local67 + 1]);
				if (local114.aClass18_28.method718(local122.aClass18_28) > 0) {
					local103 = false;
					@Pc(135) short local135 = local17[local67];
					local17[local67] = local17[local67 + 1];
					local17[local67 + 1] = local135;
				}
			}
		} while (!local103);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public static void method3156() {
		aClass32_1 = null;
		aClass18_1218 = null;
		anIntArray426 = null;
		aClass18_1217 = null;
		aClass16_39 = null;
	}
}
