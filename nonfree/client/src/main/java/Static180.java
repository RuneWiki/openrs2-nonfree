import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "Z")
	public static boolean aBoolean168;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray10 = new byte[1000][];

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
	public static int anInt3818 = 127;

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!dh;")
	public static Class18 aClass18_14 = new Class18(512);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)V")
	public static void method2711(@OriginalArg(1) int arg0) {
		@Pc(18) Class2_Sub24 local18 = (Class2_Sub24) Static179.aClass18_13.method683((long) arg0);
		if (local18 != null) {
			local18.method2705();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!kh;Lclient!kh;I)I")
	public static int method2712(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class29 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method1036(Static95.aClass10_949, Static58.aClass10_641)) {
			local5++;
		}
		if (arg0.method1036(Static95.aClass10_949, Static107.aClass10_1069)) {
			local5++;
		}
		if (arg0.method1036(Static95.aClass10_949, Static2.aClass10_29)) {
			local5++;
		}
		if (arg0.method1036(Static95.aClass10_949, Static96.aClass10_1584)) {
			local5++;
		}
		if (arg0.method1036(Static95.aClass10_949, Static139.aClass10_1346)) {
			local5++;
		}
		if (arg0.method1036(Static95.aClass10_949, Static88.aClass10_608)) {
			local5++;
		}
		arg0.method1036(Static95.aClass10_949, Static11.aClass10_1516);
		arg0.method1036(Static95.aClass10_949, Static119.aClass10_1165);
		arg0.method1036(Static95.aClass10_949, Static164.aClass10_1530);
		arg0.method1036(Static95.aClass10_949, Static52.aClass10_567);
		arg0.method1036(Static95.aClass10_949, Static28.aClass10_363);
		return local5;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	public static void method2713() {
		aByteArrayArray10 = null;
		aClass60_1 = null;
		aClass18_14 = null;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(JI)V")
	public static void method2715(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static76.anInt1789; local14++) {
			if (Static16.aLongArray2[local14] == arg0) {
				Static76.anInt1789--;
				for (@Pc(32) int local32 = local14; local32 < Static76.anInt1789; local32++) {
					Static5.aClass10Array2[local32] = Static5.aClass10Array2[local32 + 1];
					Static70.anIntArray181[local32] = Static70.anIntArray181[local32 + 1];
					Static16.aLongArray2[local32] = Static16.aLongArray2[local32 + 1];
					Static62.anIntArray174[local32] = Static62.anIntArray174[local32 + 1];
				}
				Static1.anInt5 = Static12.anInt364;
				Static141.aClass2_Sub11_Sub1_3.method1495(32);
				Static141.aClass2_Sub11_Sub1_3.method1458(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	public static void method2716() {
		Static75.aClass72_16.method2261();
		Static18.aClass72_2.method2261();
	}
}
