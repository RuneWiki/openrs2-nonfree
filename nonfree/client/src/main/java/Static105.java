import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!li", name = "g", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_894 = Static120.method1824("Error connecting to server)3");

	@OriginalMember(owner = "client!li", name = "a", descriptor = "Lclient!rd;")
	public static Class80 aClass80_892 = aClass80_894;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_893 = Static120.method1824("M");

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I[Lclient!rd;)[Lclient!rd;")
	public static Class80[] method1564(@OriginalArg(1) Class80[] arg0) {
		@Pc(4) Class80[] local4 = new Class80[5];
		for (@Pc(6) int local6 = 0; local6 < 5; local6++) {
			local4[local6] = Static154.method2467(new Class80[] { Static83.method1219(local6), Static39.aClass80_321 });
			if (arg0 != null && arg0[local6] != null) {
				local4[local6] = Static154.method2467(new Class80[] { local4[local6], arg0[local6] });
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)V")
	public static void method1565(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			for (local14 = 0; local14 < 8; local14++) {
				Static42.anIntArrayArrayArray1[arg0][local10 + arg2][arg1 + local14] = 0;
			}
		}
		if (arg2 > 0) {
			for (local14 = 1; local14 < 8; local14++) {
				Static42.anIntArrayArrayArray1[arg0][arg2][local14 + arg1] = Static42.anIntArrayArrayArray1[arg0][arg2 - 1][local14 + arg1];
			}
		}
		if (arg1 > 0) {
			for (local14 = 1; local14 < 8; local14++) {
				Static42.anIntArrayArrayArray1[arg0][local14 + arg2][arg1] = Static42.anIntArrayArrayArray1[arg0][local14 + arg2][arg1 - 1];
			}
		}
		if (arg2 > 0 && Static42.anIntArrayArrayArray1[arg0][arg2 - 1][arg1] != 0) {
			Static42.anIntArrayArrayArray1[arg0][arg2][arg1] = Static42.anIntArrayArrayArray1[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && Static42.anIntArrayArrayArray1[arg0][arg2][arg1 - 1] != 0) {
			Static42.anIntArrayArrayArray1[arg0][arg2][arg1] = Static42.anIntArrayArrayArray1[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && Static42.anIntArrayArrayArray1[arg0][arg2 - 1][arg1 - 1] != 0) {
			Static42.anIntArrayArrayArray1[arg0][arg2][arg1] = Static42.anIntArrayArrayArray1[arg0][arg2 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZLclient!mb;)Lclient!rd;")
	public static Class80 method1566(@OriginalArg(2) Class3_Sub17 arg0) {
		try {
			@Pc(7) Class80 local7 = new Class80();
			local7.anInt3421 = arg0.method2090();
			if (local7.anInt3421 > 32767) {
				local7.anInt3421 = 32767;
			}
			local7.aByteArray43 = new byte[local7.anInt3421];
			arg0.anInt2923 += Static22.aClass19_1.method520(local7.anInt3421, 0, arg0.anInt2923, arg0.aByteArray40, local7.aByteArray43);
			return local7;
		} catch (@Pc(53) Exception local53) {
			return Static113.aClass80_1001;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method1567(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static83.anInt1744 > 0) {
			local18 = Static7.aByteArrayArray1[--Static83.anInt1744];
			Static7.aByteArrayArray1[Static83.anInt1744] = null;
			return local18;
		} else if (arg0 == 5000 && Static129.anInt2787 > 0) {
			local18 = Static23.aByteArrayArray3[--Static129.anInt2787];
			Static23.aByteArrayArray3[Static129.anInt2787] = null;
			return local18;
		} else if (arg0 == 30000 && Static147.anInt3303 > 0) {
			local18 = Static20.aByteArrayArray2[--Static147.anInt3303];
			Static20.aByteArrayArray2[Static147.anInt3303] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}
}
