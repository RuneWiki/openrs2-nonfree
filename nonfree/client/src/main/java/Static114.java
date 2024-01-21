import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!o", name = "zb", descriptor = "I")
	public static int anInt2943;

	@OriginalMember(owner = "client!o", name = "wb", descriptor = "Lclient!td;")
	public static Class79 aClass79_17 = new Class79(5);

	@OriginalMember(owner = "client!o", name = "xb", descriptor = "[Lclient!ed;")
	public static Class23[] aClass23Array15 = new Class23[100];

	@OriginalMember(owner = "client!o", name = "Db", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1132 = Static169.method2903("blinken1:");

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
	public static void method2029() {
		aClass23Array15 = null;
		aClass23_1132 = null;
		aClass79_17 = null;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(II)Lclient!cg;")
	public static Class1_Sub1_Sub4 method2031(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub4 local10 = (Class1_Sub1_Sub4) Static27.aClass79_3.method2657((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static181.aClass30_66.method1301(3, arg0);
		local10 = new Class1_Sub1_Sub4();
		if (local28 != null) {
			local10.method415(new Class1_Sub8(local28));
		}
		Static27.aClass79_3.method2658((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(II)Lclient!we;")
	public static Class1_Sub1_Sub17 method2032(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub17 local12 = (Class1_Sub1_Sub17) Static64.aClass79_9.method2657((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static115.aClass30_Sub1_10.method1301(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class1_Sub1_Sub17();
		@Pc(35) Class1_Sub8 local35 = new Class1_Sub8(local22);
		local35.anInt1357 = local35.aByteArray12.length - 12;
		@Pc(46) int local46 = local35.method868();
		@Pc(48) int local48 = 0;
		local12.anInt4271 = local35.method878();
		local12.anInt4265 = local35.method878();
		local12.anInt4267 = local35.method878();
		local12.anInt4269 = local35.method878();
		local35.anInt1357 = 0;
		local12.aClass23_1635 = local35.method885();
		local12.anIntArray596 = new int[local46];
		local12.anIntArray595 = new int[local46];
		local12.aClass23Array24 = new Class23[local46];
		while (local35.anInt1357 < local35.aByteArray12.length - 12) {
			@Pc(94) int local94 = local35.method878();
			if (local94 == 3) {
				local12.aClass23Array24[local48] = local35.method864();
			} else if (local94 >= 100 || local94 == 21 || local94 == 38 || local94 == 39) {
				local12.anIntArray595[local48] = local35.method861();
			} else {
				local12.anIntArray595[local48] = local35.method868();
			}
			local12.anIntArray596[local48++] = local94;
		}
		Static64.aClass79_9.method2658((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IBI)I")
	public static int method2033(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class1_Sub21 local6 = (Class1_Sub21) Static82.aClass10_6.method256((long) arg1);
		if (local6 == null) {
			return 0;
		} else if (arg0 >= 0 && local6.anIntArray515.length > arg0) {
			return local6.anIntArray515[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([BI)[B")
	public static byte[] method2034(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class1_Sub8 local13 = new Class1_Sub8(arg0);
		@Pc(17) int local17 = local13.method861();
		@Pc(21) int local21 = local13.method868();
		if (local21 < 0 || Static169.anInt4118 != 0 && local21 > Static169.anInt4118) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(43) byte[] local43 = new byte[local21];
			local13.method857(local21, local43);
			return local43;
		} else {
			@Pc(55) int local55 = local13.method868();
			if (local55 < 0 || Static169.anInt4118 != 0 && local55 > Static169.anInt4118) {
				throw new RuntimeException();
			}
			@Pc(73) byte[] local73 = new byte[local55];
			if (local17 == 1) {
				Static168.method2895(local73, local55, arg0, local21);
			} else {
				Static47.aClass71_1.method2443(local13, local73);
			}
			return local73;
		}
	}
}
