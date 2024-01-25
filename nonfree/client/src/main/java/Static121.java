import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ft", name = "z", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_37 = new Class237(67, -1);

	@OriginalMember(owner = "client!ft", name = "K", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZIZI)Lclient!vh;")
	public static Class250 method1795(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) Class52 local5 = null;
		if (Static158.aClass73_3 != null) {
			local5 = new Class52(arg0, Static158.aClass73_3, Static294.aClass73Array2[arg0], 1000000);
		}
		Static324.aClass16_Sub1Array1[arg0] = Static289.aClass203_1.method4834(arg0, local5, Static62.aClass52_3);
		if (arg1) {
			Static324.aClass16_Sub1Array1[arg0].method402();
		}
		return new Class250(Static324.aClass16_Sub1Array1[arg0], arg2, 1);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZI)I")
	public static int method1797(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static51.anIntArray64[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIZ)I")
	public static int method1799(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub45 local14 = Static193.method906(false, arg0);
		if (local14 == null) {
			return Static311.aClass19_1.method471(arg0).anInt316;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray680.length; local26++) {
			if (local14.anIntArray680[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static311.aClass19_1.method471(arg0).anInt316 - local14.anIntArray680.length;
	}
}
