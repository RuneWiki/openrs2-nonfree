import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Lclient!np;")
	public static Class155 aClass155_6;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "Lclient!b;")
	public static Class20 aClass20_63;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "[I")
	public static final int[] anIntArray536 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "[Lclient!ok;")
	public static final Class177[] aClass177Array2 = new Class177[14];

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_67 = new Class244(20, -1);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!qc;III)V")
	public static void method4351(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static201.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt5884 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass3_Sub12_Sub1Array3[arg0.anInt5884++] = Static19.aClass3_Sub12_Sub1Array1[local21 - 1];
			local9 += 16L;
		}
		for (local21 = arg0.anInt5884; local21 < 4; local21++) {
			arg0.aClass3_Sub12_Sub1Array3[local21] = null;
		}
	}
}
