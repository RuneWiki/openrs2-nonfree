import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cp", name = "y", descriptor = "[I")
	public static int[] anIntArray200;

	@OriginalMember(owner = "client!cp", name = "z", descriptor = "Lclient!fl;")
	public static Class2_Sub10_Sub8 aClass2_Sub10_Sub8_1;

	@OriginalMember(owner = "client!cp", name = "D", descriptor = "Lclient!fg;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!cp", name = "E", descriptor = "[Lclient!ml;")
	public static Class138_Sub1[] aClass138_Sub1Array1;

	@OriginalMember(owner = "client!cp", name = "m", descriptor = "Lclient!mo;")
	public static final Class160 aClass160_8 = new Class160(64);

	@OriginalMember(owner = "client!cp", name = "p", descriptor = "[I")
	public static final int[] anIntArray196 = new int[50];

	@OriginalMember(owner = "client!cp", name = "A", descriptor = "I")
	public static int anInt968 = 0;

	@OriginalMember(owner = "client!cp", name = "B", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_17 = new Class11(26, -1);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V")
	public static void method807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class251 local7 = Static64.aClass251ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class251 local28 = Static64.aClass251ArrayArrayArray1[local9][arg0][arg1] = Static64.aClass251ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte74--;
				for (@Pc(40) Class46 local40 = local28.aClass46_3; local40 != null; local40 = local40.aClass46_1) {
					@Pc(44) Class1_Sub5 local44 = local40.aClass1_Sub5_1;
					if (local44.aShort96 == arg0 && local44.aShort97 == arg1) {
						local44.aByte69--;
					}
				}
			}
		}
		if (Static64.aClass251ArrayArrayArray1[0][arg0][arg1] == null) {
			Static64.aClass251ArrayArrayArray1[0][arg0][arg1] = new Class251(0, arg0, arg1);
			Static64.aClass251ArrayArrayArray1[0][arg0][arg1].aByte71 = 1;
		}
		Static64.aClass251ArrayArrayArray1[0][arg0][arg1].aClass251_1 = local7;
		Static64.aClass251ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BZ)V")
	public static void method809(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static234.anInt4158 != -1) {
				Static96.method1918(Static234.anInt4158);
			}
			for (@Pc(19) Class2_Sub38 local19 = (Class2_Sub38) Static12.aClass246_2.method5606(); local19 != null; local19 = (Class2_Sub38) Static12.aClass246_2.method5614()) {
				if (!local19.method5618()) {
					local19 = (Class2_Sub38) Static12.aClass246_2.method5606();
					if (local19 == null) {
						break;
					}
				}
				Static293.method5577(local19, false, true);
			}
			Static234.anInt4158 = -1;
			Static12.aClass246_2 = new Class246(8);
			Static148.method2760();
			Static234.anInt4158 = Static305.anInt5143;
			Static242.method4238(false);
			Static240.method3873();
			Static256.method3998(Static234.anInt4158);
		}
		Static281.method4294();
		Static62.anInt1263 = -1;
		Static68.method1081(Static143.anInt2866);
		Static206.aClass1_Sub5_Sub1_Sub1_1 = new Class1_Sub5_Sub1_Sub1();
		Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 = 6656;
		Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 = 6656;
		Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1324[0] = 52;
		Static51.anInt1057 = 0;
		Static224.anInt4006 = 0;
		Static206.aClass1_Sub5_Sub1_Sub1_1.anIntArray1323[0] = 52;
		if (Static79.anInt4624 == 2) {
			Static51.anInt1057 = Static235.anInt4192 << 7;
			Static224.anInt4006 = Static217.anInt3930 << 7;
		} else {
			Static176.method3102();
		}
		Static181.method5324();
		if (Static224.anInt4006 == 0 || Static51.anInt1057 == 0) {
			Static104.method2180(10);
		} else {
			Static250.method3960();
			Static104.method2180(28);
		}
	}
}
