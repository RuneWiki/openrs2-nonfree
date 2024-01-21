import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_421 = Static120.method1824("Select");

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!rd;")
	public static Class80 aClass80_422 = aClass80_421;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
	public static int anInt1092 = 0;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
	public static int anInt1095 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([[IZ)V")
	public static void method740(@OriginalArg(0) int[][] arg0) {
		Static96.anIntArrayArray27 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBLclient!bc;)Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4 method741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1 arg2) {
		return Static15.method244(arg1, arg0, arg2) ? Static138.method2143() : null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBI)I")
	public static int method742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 >> 7;
		@Pc(19) int local19 = arg1 >> 7;
		if (local15 < 0 || local19 < 0 || local15 > 103 || local19 > 103) {
			return 0;
		}
		@Pc(41) int local41 = arg0;
		if (arg0 < 3 && (Static18.aByteArrayArrayArray1[1][local15][local19] & 0x2) == 2) {
			local41 = arg0 + 1;
		}
		@Pc(62) int local62 = arg2 & 0x7F;
		@Pc(66) int local66 = arg1 & 0x7F;
		@Pc(93) int local93 = Static42.anIntArrayArrayArray1[local41][local15 + 1][local19] * local62 + Static42.anIntArrayArrayArray1[local41][local15][local19] * (128 - local62) >> 7;
		@Pc(125) int local125 = Static42.anIntArrayArrayArray1[local41][local15][local19 + 1] * (128 - local62) + Static42.anIntArrayArrayArray1[local41][local15 + 1][local19 + 1] * local62 >> 7;
		return local66 * local125 + (128 - local66) * local93 >> 7;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!bc;ZLclient!bc;)V")
	public static void method744(@OriginalArg(1) Class1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class1 arg2) {
		Static22.aBoolean30 = arg1;
		Static18.aClass1_2 = arg0;
		Static104.aClass1_16 = arg2;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjava/lang/String;)Lclient!rd;")
	public static Class80 method745(@OriginalArg(1) String arg0) {
		@Pc(9) byte[] local9;
		try {
			local9 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = arg0.getBytes();
		}
		@Pc(18) Class80 local18 = new Class80();
		local18.anInt3421 = 0;
		local18.aByteArray43 = local9;
		for (@Pc(26) int local26 = 0; local26 < local9.length; local26++) {
			if (local9[local26] != 0) {
				local9[local18.anInt3421++] = local9[local26];
			}
		}
		return local18;
	}
}
