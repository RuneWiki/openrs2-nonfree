import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bg", name = "H", descriptor = "[Lclient!s;")
	public static Class65[] aClass65Array2;

	@OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
	public static int anInt1336;

	@OriginalMember(owner = "client!bg", name = "L", descriptor = "Z")
	public static boolean aBoolean112 = false;

	@OriginalMember(owner = "client!bg", name = "N", descriptor = "Lclient!jr;")
	public static final Class169 aClass169_7 = new Class169(8);

	@OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
	public static int anInt1337 = 0;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(III)I")
	public static int method1355(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10;
		if (arg0 < arg1) {
			local10 = arg0;
			arg0 = arg1;
			arg1 = local10;
		}
		while (arg1 != 0) {
			local10 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local10;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLclient!vaa;[[B)V")
	public static void method1356(@OriginalArg(1) Class322_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(23) int local23 = arg1.length;
		@Pc(44) int local44;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) byte[] local31 = arg1[local25];
			if (local31 != null) {
				@Pc(38) Class2_Sub11 local38 = new Class2_Sub11(local31);
				local44 = Static431.anIntArray533[local25] >> 8;
				@Pc(50) int local50 = Static431.anIntArray533[local25] & 0xFF;
				@Pc(57) int local57 = local44 * 64 - Static84.anInt2565;
				@Pc(64) int local64 = local50 * 64 - Static32.anInt723;
				Static293.method5263();
				arg0.method8698(local38, local57, Static55.aClass104Array3, Static32.anInt723, Static84.anInt2565, local64);
				arg0.method8708(local64, Static186.aClass20_4, local38, local12, local57);
				if (!arg0.aBoolean715 && local44 == Static199.anInt8568 / 8 && Static93.anInt2688 / 8 == local50 && local12[0] != -1) {
					Static566.aClass376_1 = Static227.aClass190_1.method5492(local12[2], local12[3], local12[1], Static371.aClass137_1, local12[0]);
					Static454.anInt8397 = local12[4];
				}
			}
		}
		for (@Pc(133) int local133 = 0; local133 < local23; local133++) {
			@Pc(145) int local145 = (Static431.anIntArray533[local133] >> 8) * 64 - Static84.anInt2565;
			local44 = (Static431.anIntArray533[local133] & 0xFF) * 64 - Static32.anInt723;
			@Pc(160) byte[] local160 = arg1[local133];
			if (local160 == null && Static93.anInt2688 < 800) {
				Static293.method5263();
				arg0.method8705(local44, local145);
			}
		}
	}
}
