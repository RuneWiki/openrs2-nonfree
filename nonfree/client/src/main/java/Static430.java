import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "D")
	public static double aDouble13;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "[I")
	public static final int[] anIntArray477 = new int[1000];

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	public static int anInt7816 = 0;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!bh;")
	public static final Class35 aClass35_4 = new Class35("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "[I")
	public static final int[] anIntArray478 = new int[4096];

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
	public static final int[] anIntArray479 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method6726() {
		@Pc(7) int local7 = Static530.anInt8592;
		@Pc(9) int[] local9 = Static551.anIntArray576;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class20_Sub2_Sub2_Sub1_Sub1 local24 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local9[local16]];
			if (local24 != null && local24.anInt5552 > 0) {
				local24.anInt5552--;
				if (local24.anInt5552 == 0) {
					local24.aString61 = null;
				}
			}
		}
		for (@Pc(51) int local51 = 0; local51 < Static252.anInt5066; local51++) {
			@Pc(58) long local58 = (long) Static483.anIntArray525[local51];
			@Pc(64) Class6_Sub46 local64 = (Class6_Sub46) Static347.aClass128_23.method3560(local58);
			if (local64 != null) {
				@Pc(69) Class20_Sub2_Sub2_Sub1_Sub2 local69 = local64.aClass20_Sub2_Sub2_Sub1_Sub2_1;
				if (local69.anInt5552 > 0) {
					local69.anInt5552--;
					if (local69.anInt5552 == 0) {
						local69.aString61 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!k;)I")
	public static int method6727(@OriginalArg(1) Class6_Sub2_Sub12 arg0) {
		@Pc(12) String local12 = Static368.method5828(arg0);
		return Static31.aClass133_3.method3645(local12, Static428.aClass32Array16);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V")
	public static void method6728(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub2_Sub9 local8 = Static144.method2332(10, arg0);
		local8.method3723();
		local8.anInt4294 = arg1;
		local8.anInt4293 = arg3;
		local8.anInt4291 = arg2;
	}
}
