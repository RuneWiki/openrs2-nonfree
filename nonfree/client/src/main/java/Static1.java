import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "E", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!a", name = "N", descriptor = "I")
	public static int anInt41;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "[Lclient!ul;")
	public static final Class1_Sub1_Sub16[] aClass1_Sub1_Sub16Array1 = new Class1_Sub1_Sub16[14];

	@OriginalMember(owner = "client!a", name = "L", descriptor = "F")
	public static float aFloat2 = 0.0F;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!j;III[Z)Z")
	public static boolean method23(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static256.aClass70Array2 != Static315.aClass70Array3) {
			@Pc(11) int local11 = Static60.aClass70Array1[arg1].va(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class70 local18 = Static60.aClass70Array1[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.va(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method4262(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.SA(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(B)V")
	public static void method26() {
		Static425.method5722(Static327.aClass230_Sub1_1.aBoolean607);
		Static153.aClass1_Sub5_Sub4_3 = new Class1_Sub5_Sub4();
		Static153.aClass1_Sub5_Sub4_3.method4475();
		Static145.aClass118_4 = Static262.method3695(22050, Static403.aClass42_6, 0, Static159.aCanvas3);
		Static145.aClass118_4.method3928(Static153.aClass1_Sub5_Sub4_3);
		Static150.method2409(Static360.aClass109_80, Static263.aClass109_61, Static153.aClass1_Sub5_Sub4_3, Static453.aClass109_44);
		Static10.aClass118_7 = Static262.method3695(2048, Static403.aClass42_6, 1, Static159.aCanvas3);
		Static292.aClass1_Sub5_Sub1_2 = new Class1_Sub5_Sub1();
		Static10.aClass118_7.method3928(Static292.aClass1_Sub5_Sub1_2);
		Static139.aClass57_1 = new Class57(22050, Static3.anInt61);
		Static87.anInt5504 = Static297.aClass109_69.method2343("scape main");
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(B)V")
	public static void method27() {
		for (@Pc(3) int local3 = 0; local3 < Static228.aByteArrayArrayArray8.length; local3++) {
			for (@Pc(9) int local9 = 0; local9 < Static228.aByteArrayArrayArray8[0].length; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static228.aByteArrayArrayArray8[0][0].length; local13++) {
					Static228.aByteArrayArrayArray8[local3][local9][local13] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V")
	public static void method29(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1012) {
			Static354.method5067(Static347.aClass179_7, arg0, arg1);
		} else if (arg2 == 1003) {
			Static354.method5067(Static188.aClass179_5, arg0, arg1);
		} else if (arg2 == 1009) {
			Static354.method5067(Static394.aClass179_9, arg0, arg1);
		} else if (arg2 == 1007) {
			Static354.method5067(Static186.aClass179_4, arg0, arg1);
		} else if (arg2 == 1011) {
			Static354.method5067(Static325.aClass179_6, arg0, arg1);
		}
	}
}
